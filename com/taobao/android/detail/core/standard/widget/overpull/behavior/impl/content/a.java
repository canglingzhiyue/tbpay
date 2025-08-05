package com.taobao.android.detail.core.standard.widget.overpull.behavior.impl.content;

import android.support.design.widget.CoordinatorLayout;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class a extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Integer b = null;

    static {
        kge.a(986714921);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public a() {
        emu.a("com.taobao.android.detail.core.standard.widget.overpull.behavior.impl.content.AURAOverPullContentHorizontalHandler");
    }

    @Override // com.taobao.android.detail.core.standard.widget.overpull.behavior.impl.content.c
    public void a(CoordinatorLayout coordinatorLayout, RecyclerView recyclerView, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afd31b8b", new Object[]{this, coordinatorLayout, recyclerView, view});
        } else {
            this.b = Integer.valueOf(view.getLeft());
        }
    }

    @Override // com.taobao.android.detail.core.standard.widget.overpull.behavior.impl.content.c
    public void a(CoordinatorLayout coordinatorLayout, RecyclerView recyclerView, View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a9108a9", new Object[]{this, coordinatorLayout, recyclerView, view, new Boolean(z)});
            return;
        }
        if (!z) {
            a(recyclerView, view);
        }
        this.b = Integer.valueOf(view.getLeft());
    }

    private void a(RecyclerView recyclerView, View view) {
        int intValue;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c5cf7c", new Object[]{this, recyclerView, view});
            return;
        }
        int left = view.getLeft();
        Integer num = this.b;
        if (num == null || (intValue = num.intValue() - left) == 0) {
            return;
        }
        recyclerView.scrollBy(intValue, 0);
    }
}
