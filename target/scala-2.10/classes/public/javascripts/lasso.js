  google.load("visualization", "1", {packages:["corechart", "controls"]});
  google.setOnLoadCallback(drawChart);
  
  function drawChart() {
	var e = document.createElement('div');
	e.innerHTML = lasso;
	e = e.childNodes[0].nodeValue;
	// console.log(e);
    var data = new google.visualization.DataTable(e);
    var view = new google.visualization.DataView(data);

    var options = {
      title: 'Lasso Study',
      focusTarget: 'category',
      vAxis: {logScale: true},
      hAxis: {title: 'word'}
    };
    var chart = new google.visualization.LineChart(document.getElementById('lasso_div'));
    chart.draw(view, options);
  }