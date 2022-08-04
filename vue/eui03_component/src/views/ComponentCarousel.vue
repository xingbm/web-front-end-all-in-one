<template>
    <div>
        <el-carousel :interval="4000" type="card" height="300px">
            <el-carousel-item v-for="item in 6" :key="item">
                <img :src="require(`@/assets/img/${item}.png`)" alt="我是提示信息">
            </el-carousel-item>
        </el-carousel>
    </div>
</template>

<script>
    export default {

    }
</script>

<style>
    .el-carousel__item img {
        width:100%;
        height:100%
    }
    /* 偶数的背景颜色 */
    .el-carousel__item:nth-child(2n) {
        background-color: #99a9bf;
    }
    /* 奇数的背景颜色 */
    .el-carousel__item:nth-child(2n+1) {
        background-color: #d3dce6;
    }
</style>