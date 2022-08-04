<template>
    <div>
        <!-- 多选 -->
        <el-table 
            :data="studentList" 
            @selection-change="handleSelectionChange">
            <el-table-column type="selection" width="55"></el-table-column>
            <el-table-column prop="sid" label="编号" width="150"></el-table-column>
            <el-table-column prop="sname" label="姓名" width="150"></el-table-column>
            <el-table-column prop="gender" label="性别" width="150"></el-table-column>
            <el-table-column prop="age" label="年龄" width="150"></el-table-column>
        </el-table>
    </div>
</template>

<script>
    export default {
        data() {
            return {
                multipleSelection: [],  //多选，选中的数据
                studentList:[
                    {
                        sid:'s001',
                        sname:'张三',
                        gender:'男',
                        age:18
                    },{
                        sid:'s002',
                        sname:'李四',
                        gender:'女',
                        age:22
                    }
                ]
            }
        },
        methods: {
            handleSelectionChange(val) {
            this.multipleSelection = val;  //保存选中的数据
    }
    }
    }
</script>

<style>
    
</style>
