package com.senierr.rvadapter.listener;

import com.senierr.rvadapter.util.RVHolder;

/**
 * 列表点击回调
 *
 * @author zhouchunjie
 * @date 2017/9/25
 */

public abstract class OnItemClickListener {

    public void onClick(RVHolder viewHolder, int position) {}

    public boolean onLongClick(RVHolder viewHolder, int position) {
        return false;
    }
}