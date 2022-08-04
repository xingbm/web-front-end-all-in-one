<template>
    <div>
        <el-button type="info" @click="open1">信息</el-button>
        <el-button type="success" @click="open2">成功</el-button>
        <el-button type="warning" @click="open3">警告</el-button>
    </div>
</template>

<script>
    export default {
        methods:{
            open1() {
                this.$message.info('这是一条提示信息');
            },
            open2() {
                this.$message.success('这是一条成功信息');
            },
            open3() {
                this.$message.warning('这是一条警告信息');
            }
        }
    } 
</script>