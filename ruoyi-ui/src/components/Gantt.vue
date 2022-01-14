<template>
  <div ref="gantt"></div>
</template>
 
<script>
import { gantt } from 'dhtmlx-gantt'
export default {
  name: 'gantt',
  props: {
    tasks: {
      type: Object,
      default() {
        return { data: [], links: [] }
      }
    }
  },

  mounted: function() {
    const that = this
    gantt.config.xml_date = '%Y-%m-%d'

    gantt.init(this.$refs.gantt)
    gantt.parse(this.$props.tasks)
    gantt.i18n.setLocale('cn')
    gantt.attachEvent('onTaskDrag', function(id, mode, task, original) {
      that.$emit('onTaskDrag',{id:id,mode:mode,task:task,original:original})
      // any custom logic here
    })
  }
}
</script>
 
<style>
@import "~dhtmlx-gantt/codebase/dhtmlxgantt.css";
</style>