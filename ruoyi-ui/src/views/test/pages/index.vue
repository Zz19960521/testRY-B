<template>
  <div>
    <el-form>
      <el-form-item label="名称">
        <el-input v-model="name"></el-input>
      </el-form-item>
    </el-form>

    <my-table ref="tab" :data="tableData" @ceshi="goTest"></my-table>
    <el-button @click="clickOne">点击</el-button>
  </div>
</template>

<script>
import MyTable from '@/components/MyTable.vue'
export default {
  name: 'page',
  components: {
    MyTable
  },
  data() {
    return {
      name: '',
      tableData: [
        {
          date: '2016-05-02',
          name: '王小虎',
          address: '上海市普陀区金沙江路 1518 弄'
        },
        {
          date: '2016-05-04',
          name: '王小虎',
          address: '上海市普陀区金沙江路 1517 弄'
        },
        {
          date: '2016-05-01',
          name: '王小虎',
          address: '上海市普陀区金沙江路 1519 弄'
        },
        {
          date: '2016-05-03',
          name: '王小虎',
          address: '上海市普陀区金沙江路 1516 弄'
        }
      ]
    }
  },
  created() {},
  mounted() {},
  methods: {
    goTest(obj) {
      console.log('test')
      console.log(obj)
    },
    clickOne(){
        this.$refs.tab.doClick()
    }
  }
}
</script>

<style>
</style>