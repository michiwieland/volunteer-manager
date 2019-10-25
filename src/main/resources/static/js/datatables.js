(function($) {
  "use strict"; // Start of use strict

 var table = $('#volunteer-table').DataTable({
              "ajax": "/volunteers/volunteers",
              "serverSide": true,
              rowId: "id",
              columns : [
                 { data: "firstName" },
                 { data: "lastName" },
                 { data: "email" },
                 { data: "mobile" },
                 { data: "gender" },
                 { data: "birthDate" },
                 { data: "tshirtSize" },
                 { data: "clubMember" }
              ]
 	 });
})(jQuery);


