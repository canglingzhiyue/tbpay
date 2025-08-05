package com.taobao.android.detail2.core.framework.view.feeds;

import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.view.feeds.DetailVerticalRecyclerView;
import tb.kge;

/* loaded from: classes5.dex */
public class b implements DetailVerticalRecyclerView.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(658936206);
        kge.a(-1451785787);
    }

    @Override // com.taobao.android.detail2.core.framework.view.feeds.DetailVerticalRecyclerView.a
    public void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
        }
    }

    @Override // com.taobao.android.detail2.core.framework.view.feeds.DetailVerticalRecyclerView.a
    public void a(RecyclerView recyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85acc02d", new Object[]{this, recyclerView, new Integer(i)});
        }
    }

    @Override // com.taobao.android.detail2.core.framework.view.feeds.DetailVerticalRecyclerView.a
    public void a(RecyclerView recyclerView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2febb876", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
        }
    }

    @Override // com.taobao.android.detail2.core.framework.view.feeds.DetailVerticalRecyclerView.a
    public void a(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f37b47d", new Object[]{this, motionEvent});
        }
    }

    @Override // com.taobao.android.detail2.core.framework.view.feeds.DetailVerticalRecyclerView.a
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        }
    }

    @Override // com.taobao.android.detail2.core.framework.view.feeds.DetailVerticalRecyclerView.a
    public void b(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74207cbe", new Object[]{this, motionEvent});
        }
    }
}
