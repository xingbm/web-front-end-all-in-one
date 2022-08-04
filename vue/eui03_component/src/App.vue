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
                        <template slot="title">常用组件</template>
                        <el-menu-item index="/component_button">按钮</el-menu-item>
                        <el-menu-item index="/component_message">消息提示Message</el-menu-item>
                        <el-menu-item index="/component_messagebox">消息提示MessageBox</el-menu-item>
                        <el-menu-item index="/component_dialog">Dialog对话框</el-menu-item>
                        <el-menu-item index="/component_drawer">Drawer 抽屉</el-menu-item>
                        <el-menu-item index="/component_tabs">Tabs 标签页</el-menu-item>
                        <el-menu-item index="/component_carousel">轮播图</el-menu-item>
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

export default {

}
</script>

<style>

</style>
