<template>
  <div class="container">
    <gantt class="left-container" @onTaskDrag="drag" :scales="scales" :i18n="'cn'" :columns="columns" :tasks="tasks" style="width:100%;height:calc(100vh - 84px)"></gantt>
  </div>
</template>
 
<script>
import gantt from '@/components/Gantt.vue'
console.log(gantt)
export default {
  name: 'app',
  components: { gantt },
  data() {
    return {
      scales: [
        { unit: 'month', step: 1, format: 'MMMM yyy' },
        { unit: 'day', step: 1, format: 'd' }
      ],
      columns: [
        { name: 'text', label: '任务名称1', width: '100%' },
        { name: 'start', label: '开始时间', align: 'center' },
        { name: 'duration', label: '持续时间', width: '70px', align: 'center' },
        { name: 'add-task', label: '', width: '50px', align: 'center' }
      ],
      tasks: {
        data: [
          {
            id: 1,
            text: 'Task #1',
            start_date: '2020-01-17',
            duration: 3,
            progress: 0.6
          },
          {
            id: 2,
            text: 'Task #2',
            start_date: '2020-01-20',
            duration: 3,
            progress: 0.4
          }
        ],
        links: [{ id: 1, source: 1, target: 2, type: '0' }]
      }
    }
  },
  methods:{
    drag(obj){
      console.log(obj)
    }
  }
}
</script>

<style>
html,
body {
  height: 100%;
  margin: 0;
  padding: 0;
}
.container {
  height: 100%;
  width: 100%;
}
.left-container {
  overflow: hidden;
  position: relative;
  height: 100%;
}
</style>