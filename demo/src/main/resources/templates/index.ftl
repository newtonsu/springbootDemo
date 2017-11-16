<!DOCTYPE HTML>  
<HTML>  
<body>  
    <table border="1px solid #8968CD" style="border-collapse: collapse;">
    <tr>
    <th>姓名</th>
     <th>身份证</th> 
     <th>电话</th> 
     <th>生日</th>
       </tr>  
    <#list userList as user>  
        <tr>  
            <td>${user.name}</td>  
            <td>${user.id!}</td>  
            <td>${user.mobile!}</td>  
            <td>${user.birthday?date!}</td>  
        </tr>  
    </#list>  
    </table>  
</body>  
</HTML>  