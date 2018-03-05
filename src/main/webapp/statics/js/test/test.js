$(document).ready(function () {

    var dg=$('#dg_sub');
    console.log(dg)
   dg.datagrid({
        queryParams : {},
        singleSelect: false,
        pagination: true,
        pageList: [100,150,200,250,300],
        pageSize: 100,
        url:"http://localhost:8080/test/getUser",
        frozenColumns:[[
            {field: 'id',checkbox: true, title:'',halign: 'center', width:'40' },

        ]],
        columns:[[
            {field: 'userName', title:'姓名',halign: 'center',halign: 'center', width:60 ,sortable:false},
            {field:'address',title:'地址',halign: 'center',width:100,align:'right'},
        ]],
        onLoadSuccess: function (data) {},
        onClickRow: function (rowIndex, rowData) {},
        onDblClickCell:function () {},
        onRowContextMenu: function (e, rowIndex, rowData) {}
    })
});