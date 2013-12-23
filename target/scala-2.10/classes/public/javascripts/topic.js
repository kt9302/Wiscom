google.load("visualization", "1", {packages:["corechart", "controls", "table"]});
google.setOnLoadCallback(drawChart);

function drawChart() {
	var data = new google.visualization.DataTable(topic[0]);
	var view = new google.visualization.DataView(data);

	var chartOptions = {
			sliceVisibilityThreshold: 1/3600,
			chartArea: {height:"90%"},
			height: 600,
	};
	var chart = new google.visualization.PieChart(document.getElementById('pie_div'));
	chart.draw(view, chartOptions);

	var tableOptions = {
			chartArea: {width: "80%", height:"100%"},
			showRowNumber: true,
	};
	var table = new google.visualization.Table(document.getElementById('table_div'));
	table.draw(view, tableOptions);
}

function test(buttonId) {
	$("div div a").removeClass("btn-default").addClass("btn-primary");
	var data = new google.visualization.DataTable(topic[buttonId]);
	var view = new google.visualization.DataView(data);

	var chartOptions = {
			sliceVisibilityThreshold: 1/3600,
			chartArea: {height:"90%"},
			height: 600,
	};
	var chart = new google.visualization.PieChart(document.getElementById('pie_div'));
	chart.draw(view, chartOptions);

	var tableOptions = {
			chartArea: {width: "80%", height:"100%"},
			showRowNumber: true,
	};
	var table = new google.visualization.Table(document.getElementById('table_div'));
	table.draw(view, tableOptions);
}

$(document).ready(function() {
	$("a.change").click(function(){
		$(".change").removeClass("btn-primary").addClass("btn-default");
		$("#"+this.id).addClass("btn-primary");
		var buttonId = parseInt(this.id.split("-")[1]); 
		var data = new google.visualization.DataTable(topic[buttonId]);
		var view = new google.visualization.DataView(data);

		var chartOptions = {
				sliceVisibilityThreshold: 1/3600,
				chartArea: {height:"90%"},
				height: 600,
		};
		var chart = new google.visualization.PieChart(document.getElementById('pie_div'));
		chart.draw(view, chartOptions);

		var tableOptions = {
				chartArea: {width: "80%", height:"100%"},
				showRowNumber: true,
		};
		var table = new google.visualization.Table(document.getElementById('table_div'));
		table.draw(view, tableOptions);
	});
});