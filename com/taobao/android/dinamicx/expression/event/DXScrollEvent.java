package com.taobao.android.dinamicx.expression.event;

import android.support.v7.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.bq;
import tb.kge;

/* loaded from: classes.dex */
public class DXScrollEvent extends DXEvent {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private bq containerSize;
    private bq contentSize;
    private int offsetX;
    private int offsetY;
    private RecyclerView recyclerView;

    static {
        kge.a(-320507264);
    }

    public DXScrollEvent(long j) {
        super(j);
    }

    public RecyclerView getRecyclerView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView) ipChange.ipc$dispatch("c7371823", new Object[]{this}) : this.recyclerView;
    }

    public void setRecyclerView(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f86a6bb", new Object[]{this, recyclerView});
        } else {
            this.recyclerView = recyclerView;
        }
    }

    public int getOffsetX() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("25635ee9", new Object[]{this})).intValue() : this.offsetX;
    }

    public void setOffsetX(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd51edd9", new Object[]{this, new Integer(i)});
        } else {
            this.offsetX = i;
        }
    }

    public int getOffsetY() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2571766a", new Object[]{this})).intValue() : this.offsetY;
    }

    public void setOffsetY(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf06c678", new Object[]{this, new Integer(i)});
        } else {
            this.offsetY = i;
        }
    }

    public bq getContentSize() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bq) ipChange.ipc$dispatch("9294bb98", new Object[]{this}) : this.contentSize;
    }

    public void setContentSize(bq bqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cb80aec", new Object[]{this, bqVar});
        } else {
            this.contentSize = bqVar;
        }
    }

    public bq getScrollerSize() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bq) ipChange.ipc$dispatch("387fe98b", new Object[]{this}) : this.containerSize;
    }

    public void setScrollerSize(bq bqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ac436f1", new Object[]{this, bqVar});
        } else {
            this.containerSize = bqVar;
        }
    }
}
