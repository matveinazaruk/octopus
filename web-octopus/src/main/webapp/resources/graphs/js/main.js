$(document).ready(function () {
  $.getJSON("data/", function(data) {

    var socialChart = new Object();
    socialChart.name = data.socialName;
    socialChart.data = new Array();
     
    for (var i = 0; i < data.socialData.length; i++) {
      var obj = new Array();
      obj[0] = data.socialData[i].date;
      obj[1] = data.socialData[i].value;
      socialChart.data[i] = obj; 
    }

    var stockChart = new Object();
    stockChart.name = data.stockName;
    stockChart.data = new Array();
     
    for (var i = 0; i < data.stockData.length; i++) {
      var obj = new Array();
      obj[0] = data.stockData[i].date;
      obj[1] = data.stockData[i].value;
      stockChart.data[i] = obj; 
    }

    $('#container').highcharts({
      chart: {
          type: 'spline'
      },
      title: {
          text: 'Dependency chart',
          x: -20 //center
      },
      xAxis: {
          type: 'datetime',
          dateTimeLabelFormats: { // don't display the dummy year
              month: '%e. %b',
              year: '%b'
          }
      },
      yAxis: {
          title: {
              text: 'value'
          },
          plotLines: [{
              value: 0,
              width: 1,
              color: '#808080'
          }]
      },
      legend: {
          layout: 'vertical',
          align: 'right',
          verticalAlign: 'middle',
          borderWidth: 0
      },
      series: [socialChart, stockChart]
    });
  });
});
