<template>
    <!-- 布局容器-->
    <!-- <div id="app">
        <el-container>
            <el-header>Header</el-header>
            <el-main>Main</el-main>
            <el-footer>Footer</el-footer>
        </el-container>
    </div> -->
    <!-- 导航条 -->
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
                        <template slot="title">产品与解决方案</template>
                        <el-menu-item index="/开源">开源</el-menu-item>
                        <el-menu-item index="/晞扬商城">晞扬商城</el-menu-item>
                    </el-submenu>
                    <el-submenu index="3">
                        <template slot="title">客户服务</template>
                        <el-menu-item index="/合作客户">合作客户</el-menu-item>
                        <el-menu-item index="/商务合作">商务合作</el-menu-item>
                    </el-submenu>
                    <el-submenu index="4">
                        <template slot="title">关于晞扬</template>
                        <el-menu-item index="/公司简介">公司简介</el-menu-item>
                        <el-menu-item index="/发展历程">发展历程</el-menu-item>
                        <el-menu-item index="/企业文化">企业文化</el-menu-item>
                        <el-menu-item index="/荣誉资质">荣誉资质</el-menu-item>
                        <el-menu-item index="/联系我们">联系我们</el-menu-item>
                    </el-submenu>
                    <el-menu-item index="5">新闻动态</el-menu-item>
                    <el-submenu index="6">
                        <template slot="title">个人中心</template>
                        <el-menu-item index="/login">登录</el-menu-item>
                        <el-menu-item index="/register">注册</el-menu-item>
                    </el-submenu>
                </el-menu>
            </el-header>
            <el-main>
                <router-view></router-view>
            </el-main>
            <el-footer>
                &copy;版权所有&nbsp;&nbsp;2022&nbsp;-&nbsp;&nbsp;&nbsp; 济南晞扬科技有限公司
            </el-footer>
        </el-container>
    </div>

</template>

<script>
    export default {
    
    }
</script>

<style>
    html,body,.el-container {
        height: 100%;
    }
    .el-footer {
        background-color:antiquewhite;
    }
</style>
