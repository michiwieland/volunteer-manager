(function($) {
  "use strict"; // Start of use strict

 var table = $('#volunteer-table').DataTable({
 			"sAjaxSource": "/volunteers/volunteers",
 			"sAjaxDataProp": "",
 			"order": [[ 0, "asc" ]],
 			"aoColumns": [
 			     { "mData": "id"},
 		         { "mData": "firstName" },
 				 { "mData": "lastName" },
 				 { "mData": "email" },
 				 { "mData": "mobile" },
 				 { "mData": "gender" },
 				 { "mData": "birthDate" },
 				 { "mData": "tshirtSize" },
 				 { "mData": "clubMember" }
 			]
 	 });

})(jQuery); // End of use strict
