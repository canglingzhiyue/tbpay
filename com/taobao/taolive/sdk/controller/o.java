package com.taobao.taolive.sdk.controller;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes8.dex */
public class o extends LinearLayoutManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Object c;

    /* renamed from: a  reason: collision with root package name */
    public boolean f21822a;
    private final TaoLiveRecyclerView b;

    public static /* synthetic */ Object ipc$super(o oVar, String str, Object... objArr) {
        if (str.hashCode() == 514551467) {
            return new Boolean(super.canScrollVertically());
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        kge.a(-220794657);
        c = new Object();
    }

    public o(Context context, int i, boolean z, TaoLiveRecyclerView taoLiveRecyclerView) {
        super(context, i, z);
        this.f21822a = true;
        this.b = taoLiveRecyclerView;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.f21822a = z;
        if (!z) {
            this.b.setTag(R.id.tag_kill_up_down, c);
        } else {
            this.b.setTag(R.id.tag_kill_up_down, null);
        }
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1eab6eab", new Object[]{this})).booleanValue() : this.f21822a && super.canScrollVertically();
    }
}
