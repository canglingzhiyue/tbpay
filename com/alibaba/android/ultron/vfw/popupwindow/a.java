package com.alibaba.android.ultron.vfw.popupwindow;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class a extends LinearLayoutManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f2723a;

    static {
        kge.a(844532552);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        if (str.hashCode() == 514551467) {
            return new Boolean(super.canScrollVertically());
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public a(Context context) {
        super(context);
        this.f2723a = true;
    }

    public a(Context context, int i, boolean z) {
        super(context, i, z);
        this.f2723a = true;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.f2723a = z;
        }
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1eab6eab", new Object[]{this})).booleanValue() : this.f2723a && super.canScrollVertically();
    }
}
