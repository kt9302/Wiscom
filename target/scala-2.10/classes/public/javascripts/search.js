  $(function() {
    $( "#appName" ).autocomplete({
      source: "/search/ajax",
      minLength: 2,
      select: function( event, ui ) {
        console.log(ui.item.label.split(":")[0]);
        $("#id").val(ui.item.label.split(":")[0]);
      }
    });
    
//    if ($("#id").val() !== "") {
//    	$('#myModal').delay(800).modal('toggle');
//    }
  });