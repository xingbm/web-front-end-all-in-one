<template>
    <div id="app">
        <el-container>
            <el-header>
                <el-menu 
                    class="el-menu-demo"
                    mode="horizontal" 
                    background-color="#545c64" 
                    text-color="#fff"
                    active-text-color="#ffd04b"
                    :router="true"
                    :default-active="$route.path">
                    <el-menu-item index="/">首页</el-menu-item>
                    <el-submenu index="2">
                        <template slot="title">学生管理</template>
                        <el-menu-item index="/studentList_base">学生列表-基本表格</el-menu-item>
                        <el-menu-item index="/studentList_decorate">学生列表-表格修饰</el-menu-item>
                        <el-menu-item index="/studentList_singleSelection">学生列表-单选</el-menu-item>
                        <el-menu-item index="/studentList_multipleSelection">学生列表-多选</el-menu-item>
                        <el-menu-item index="/studentList_template">学生列表-自定义模板</el-menu-item>
                        <el-menu-item index="/studentList_Query_Conditions">学生列表-条件查询</el-menu-item>
                        <el-menu-item index="/studentList_Pagination">学生列表-分页</el-menu-item>
                    </el-submenu>
                </el-menu>
            </el-header>
            <el-main>
                <router-view></router-view>
            </el-main>
        </el-container>
    </div>
</template>

<script>

</script>

<style>

</style>
