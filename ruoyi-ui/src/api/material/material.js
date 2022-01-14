import request from '@/utils/request'

// 查询基础物料列表
export function listMaterial(query) {
  return request({
    url: '/material/material/list',
    method: 'get',
    params: query
  })
}

// 查询基础物料详细
export function getMaterial(materialId) {
  return request({
    url: '/material/material/' + materialId,
    method: 'get'
  })
}

// 新增基础物料
export function addMaterial(data) {
  return request({
    url: '/material/material',
    method: 'post',
    data: data
  })
}

// 修改基础物料
export function updateMaterial(data) {
  return request({
    url: '/material/material',
    method: 'put',
    data: data
  })
}

// 删除基础物料
export function delMaterial(materialId) {
  return request({
    url: '/material/material/' + materialId,
    method: 'delete'
  })
}

// 导出基础物料
export function exportMaterial(query) {
  return request({
    url: '/material/material/export',
    method: 'get',
    params: query
  })
}