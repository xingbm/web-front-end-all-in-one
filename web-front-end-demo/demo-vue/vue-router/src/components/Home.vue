<template>
    <div class="hello">
        <h1>{{ msg }}</h1>
        <!-- 添加子路由导航 -->
        <p>导航 ：
            <router-link to="/home">首页</router-link> |
            <router-link to="/home/one">-子页面1</router-link> |
            <router-link to="/home/two">-子页面2</router-link>
        </p>
        <!-- 子页面展示部分 -->
        <router-view/>
    </div>
</template>

<script>
export default {
    name: 'Home',
    data () {
        return {
            msg: 'Home Page!'
        }
    }
}
</script>

<style scoped>
</style>
