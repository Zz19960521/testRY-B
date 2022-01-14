import request from '@/utils/request'

// 查询出入库管理列表
export function listVoucher(query) {
  return request({
    url: '/inventory/voucher/list',
    method: 'get',
    params: query
  })
}

// 查询出入库管理详细
export function getVoucher(voucherId) {
  return request({
    url: '/inventory/voucher/' + voucherId,
    method: 'get'
  })
}

// 新增出入库管理
export function addVoucher(data) {
  return request({
    url: '/inventory/voucher',
    method: 'post',
    data: data
  })
}

// 修改出入库管理
export function updateVoucher(data) {
  return request({
    url: '/inventory/voucher',
    method: 'put',
    data: data
  })
}

// 删除出入库管理
export function delVoucher(voucherId) {
  return request({
    url: '/inventory/voucher/' + voucherId,
    method: 'delete'
  })
}

// 导出出入库管理
export function exportVoucher(query) {
  return request({
    url: '/inventory/voucher/export',
    method: 'get',
    params: query
  })
}