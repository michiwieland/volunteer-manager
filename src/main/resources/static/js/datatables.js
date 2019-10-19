(function($) {
  "use strict"; // Start of use strict

 var table = $('#volunteer-table').DataTable({
 			"sAjaxSource": "/volunteers",
 			"sAjaxDataProp": "",
 			"order": [[ 0, "asc" ]],
 			"aoColumns": [
 			    { "mData": "id"},
 		      { "mData": "name" },
 				  { "mData": "lastName" },
 				  { "mData": "email" },
 				  { "mData": "phone" },
 				  { "mData": "active" }
 			]
 	 });

})(jQuery); // End of use strict
