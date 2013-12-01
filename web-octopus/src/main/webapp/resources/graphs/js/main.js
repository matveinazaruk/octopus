$(document).ready(function () {
  $.getJSON( "data/social", function(socialData) {

    var line = new Object();
    line.name = socialData.name;
    line.data = new Array();
     
    for (var i = 0; i < socialData.data.length; i++) {
      var obj = new Array();
      obj[0] = new Date(socialData.data[i].date);
      console.log("i = " + i + ", date = " + obj[0]);
      obj[1] = socialData.data[i].value;
      line.data[i] = obj; 
    }
  
    $('#container').highcharts({
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
      series: [line]
    });
  });
});
