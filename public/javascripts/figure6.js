  google.load("visualization", "1", {packages:["corechart", "controls"]});
  google.setOnLoadCallback(drawChart);

  var optionsInterval = {
	  title: 'App Reviews',
      animation: {
        duration: 1000,
        easing: 'in'
      },
      hAxis: {viewWindow: {}}
  };
  
  function drawChart() {
	var e = document.createElement('div');
	e.innerHTML = figure6;
	e = e.childNodes[0].nodeValue;
	// console.log(e);
    var data = new google.visualization.DataTable(e);
    var view = new google.visualization.DataView(data);
    view.hideColumns([3,4,5]);

    var options = {
      title: 'App Reviews',
      focusTarget: 'category'
    };
    var chart = new google.visualization.LineChart(document.getElementById('chart_div'));
    chart.draw(view, options);
    drawPieChart(1);
    
    
//    // Draw magnified window chart
//    var chartInterval = new google.visualization.LineChart(document.getElementById('chartInterval'));
//    
//    google.visualization.events.addListener(chart, 'onmouseover',
//            function(e) {
//    			if (optionsInterval.hAxis.viewWindow.min == data.getValue(e.row, 4)-1) {
//    				return;
//    			}
//		      	optionsInterval.hAxis.viewWindow.min = data.getValue(e.row, 4)-1;
//		        optionsInterval.hAxis.viewWindow.max = data.getValue(e.row, 5)-1;
//		        chartInterval.draw(view, optionsInterval);
//		        drawPieChart(data.getValue(e.row, 3));
//            });
//    
//    google.visualization.events.addListener(chart, 'onmouseout',
//            function(e) {
//		      	optionsInterval.hAxis.viewWindow.min = 0;
//		        optionsInterval.hAxis.viewWindow.max = data.getNumberOfRows();
//		        chartInterval.draw(view, optionsInterval);
//            });
//    
//    chartInterval.draw(view, optionsInterval);
    
//    // Define a category picker for the 'Metric' column.
//    var categoryPicker = new google.visualization.ControlWrapper({
//      'controlType': 'CategoryFilter',
//      'containerId': 'control',
//      'options': {
//        'filterColumnLabel': 'Interval',
//        'ui': {
//          'allowTyping': false,
//          'allowMultiple': false,
//          'selectedValuesLayout': 'belowStacked'
//        }
//      },
//      // Define an initial state, i.e. a set of metrics to be initially selected.
//      'state': {'selectedValues': [1]}
//    });
//    
//    // Define a line chart.
//    var lineChart = new google.visualization.ChartWrapper({
//      'chartType': 'LineChart',
//      'containerId': 'chartInterval',
//      'options': {
//    	  title: 'App Reviews'
//      }
//    });
//    
//    // Create the dashboard.
//    var dash_container = document.getElementById('dashboard');
//    var dashboard = new google.visualization.Dashboard(dash_container);
//    dashboard.bind(categoryPicker, lineChart);
//    dashboard.draw(data);
  }
  
  function drawPieChart(col) {
		var e = document.createElement('div');
		e.innerHTML = figure6Pie;
		e = e.childNodes[0].nodeValue;
	    var pieData = new google.visualization.DataTable(e);
	    var pieView = new google.visualization.DataView(pieData);
	    pieView.setColumns([0,col]);
	    console.log(e);
	    var pieOptions = {
	      title: 'Category Weights',
	      sliceVisibilityThreshold: 1/3600,
	    };
	    var pieChart = new google.visualization.PieChart(document.getElementById('pie_div'));
	    pieChart.draw(pieView, pieOptions);
  }