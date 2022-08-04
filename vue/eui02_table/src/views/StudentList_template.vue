<template>
    <div>
        <!-- 自定义模板 -->
        <el-table 
            :data="studentList"
            stripe
            border
            @selection-change="handleSelectionChange">
            <el-table-column type="selection" width="55"></el-table-column>
            <el-table-column prop="sid" label="编号" width="150"></el-table-column>
            <el-table-column prop="sname" label="姓名" width="150"></el-table-column>
            <el-table-column prop="gender" label="性别" width="150"></el-table-column>
            <el-table-column prop="age" label="年龄" width="150"></el-table-column>
            <el-table-column label="爱好" >
                <template slot-scope="scope">
                <el-tag type="warning" v-for="(hobby,index) in scope.row.hobbies" :key="index">{{hobby}}</el-tag>
                </template>
            </el-table-column>
            <el-table-column label="操作">
                <template slot-scope="scope">
                <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">编辑</el-button>
                <el-button size="mini" type="danger" @click="handleDelete(scope.$index, scope.row)">删除</el-button>
                </template>
            </el-table-column>
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
                        age:18,
                        hobbies: ['抽烟','喝酒','烫头']
                    },{
                        sid:'s002',
                        sname:'李四',
                        gender:'女',
                        age:22,
                        hobbies: ['抽烟','烫头']
                    }
                ]
            }
        },
        methods: {
            handleSelectionChange(val) {
            this.multipleSelection = val;  //保存选中的数据
            },
            handleEdit(index, row) {
                console.log(index, row);
            },
            handleDelete(index, row) {
                console.log(index, row);
            }
        }
    }
</script>

<style>
    .el-tag + .el-tag {
        margin-left: 10px;
    }
</style>
