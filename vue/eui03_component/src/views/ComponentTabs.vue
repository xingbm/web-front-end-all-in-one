<template>
    <div>
        <el-tabs v-model="activeName">
            <el-tab-pane label="用户管理" name="first">
                用户管理
                <el-button type="primary" @click="activeName='second'">下一步</el-button>
            </el-tab-pane>
            <el-tab-pane label="配置管理" name="second">
                配置管理
                <el-button type="primary" @click="activeName='third'">下一步</el-button>
            </el-tab-pane>
            <el-tab-pane label="角色管理" name="third">
                角色管理 
                <el-button type="primary" label="角色管理" @click="activeName='fourth'">下一步</el-button>
            </el-tab-pane>
            <el-tab-pane label="补偿定时任务" name="fourth">
                补偿定时任务
                <el-button type="primary" label="补偿定时任务" @click="$message.success('成功了')">完成</el-button>
            </el-tab-pane>
        </el-tabs>
    </div>
</template>

<script>
    export default {
        data() {
            return {
                activeName: 'first'
            }
        }
    }
</script>
