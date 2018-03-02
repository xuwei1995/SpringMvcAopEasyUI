<html>
<body>
<h2>Hello World!</h2>
<div id="rightContentC" class="Container-1" style="height: 100%; width: 100%">
    <div class="Content" style="width: 100%;">
        <div id="dg_sub" style="height: 719px;"></div>
        <div class="height5"></div>
    </div>
</div>
</body>
<script>
    $('#dg_sub').datagrid({
        queryParams : {},
        singleSelect: false,
        pagination: true,
        pageList: [100,150,200,250,300],
        pageSize: 100,
        url:"http://localhost:8080/test/getAllUser",
        onRowContextMenu: onRowContextMenu,
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
</script>
</html>
