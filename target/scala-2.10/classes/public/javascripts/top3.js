google.load("visualization", "1", {packages:["corechart", "controls", "table"]});
google.setOnLoadCallback(drawChart);

function drawChart() {
	var data = new google.visualization.DataTable(top3[0]);
	var view = new google.visualization.DataView(data);

	var chartOptions = {
			sliceVisibilityThreshold: 1/3600,
			chartArea: {height:"90%"},
			height: 200,
			legend: {alignment:"center"},
	};
	var chart = new google.visualization.PieChart(document.getElementById('pie_div'));
	chart.draw(view, chartOptions);
}

$(document).ready(function() {
	$("a.change").click(function(){
		$(".change").removeClass("btn-primary").addClass("btn-default");
		$("#"+this.id).addClass("btn-primary");
		var buttonId = parseInt(this.id.split("-")[1]); 
		var data = new google.visualization.DataTable(top3[buttonId]);
		var view = new google.visualization.DataView(data);

		var chartOptions = {
				sliceVisibilityThreshold: 1/3600,
				chartArea: {height:"90%"},
				height: 200,
				legend: {alignment:"center"},
		};
		var chart = new google.visualization.PieChart(document.getElementById('pie_div'));
		chart.draw(view, chartOptions);
	});
});