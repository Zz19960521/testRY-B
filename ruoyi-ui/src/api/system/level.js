import request from '@/utils/request'

// 查询职级列表
export function listLevel(query) {
  return request({
    url: '/system/level/list',
    method: 'get',
    params: query
  })
}

// 查询职级详细
export function getLevel(levelId) {
  return request({
    url: '/system/level/' + levelId,
    method: 'get'
  })
}

// 新增职级
export function addLevel(data) {
  return request({
    url: '/system/level',
    method: 'post',
    data: data
  })
}

// 修改职级
export function updateLevel(data) {
  return request({
    url: '/system/level',
    method: 'put',
    data: data
  })
}

// 删除职级
export function delLevel(levelId) {
  return request({
    url: '/system/level/' + levelId,
    method: 'delete'
  })
}

// 导出职级
export function exportLevel(query) {
  return request({
    url: '/system/level/export',
    method: 'get',
    params: query
  })
}