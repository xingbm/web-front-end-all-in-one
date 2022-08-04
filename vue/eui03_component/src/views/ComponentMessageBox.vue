<template>
    <div>
        <el-button type="text" @click="open">点击打开 Message Box</el-button>
    </div>
</template>

<script>
    export default {
        methods:{
            open() {
                this.$confirm('这是提示信息','这是标题',{confirmButtonText:'确定按钮',cancelButtonText:'取消按钮',type:'warning'})
                .then(() => {
                    //确定按钮回调
                    this.$message.success('删除了');
                })
                .catch(() => {
                    //取消按钮回调
                    this.$message.error('取消了');
                });
            }
        }
    }
</script>