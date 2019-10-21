package com.fufulong.composite_model;

/**
 * 客户端测试程序
 */
public class Client {
    public static void main(String[] args) {
        //构建层级关系
        Company root = new Company("北京总公司");
        //北京总公司下面有上海分公司,人事部,财务部
        Company shCompany = new Company("上海分公司");
        Department bjDepartment = new Department("北京总公司人事部");
        Department bjFinance = new Department("北京总公司财务部");
        //为了最后显示好看,先加部门,后加分公司
        root.addComponent(bjDepartment);
        root.addComponent(bjFinance);
        root.addComponent(shCompany);
        //上海分公司也有人事部和财务部
        shCompany.addComponent(new Department("上海分公司人事部"));
        shCompany.addComponent(new Department("上海分公司财务部"));
        //显示层级关系
        root.display();
    }
}
