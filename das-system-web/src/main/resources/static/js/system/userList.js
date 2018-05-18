layui.use('table', function(){
    var table = layui.table;
    //用户列表
    table.render({
        elem: '#userTable'
        ,height: 'full-100' //表格容器距离浏览器顶部和底部的距离“和”
        ,url: '/user/list' //数据接口
        ,page: true //开启分页
        ,cols: [[ //表头
            {field: 'id', title: 'ID', width:80, sort: true, fixed: 'left'}
            ,{field: 'userCode', title: '用户编码'}
            ,{field: 'userName', title: '用户名称'}
            ,{field: 'password', title: '用户密码'}
            ,{field: 'userAccount', title: '用户账号'}
            ,{field: 'userPhone', title: '手机号'}
            ,{field: 'status', title: '用户状态'}
        ]]
    });

});