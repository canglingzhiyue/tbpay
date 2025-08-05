package com.taobao.android.meta.structure.list;

import android.app.Activity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.data.MetaResult;
import com.taobao.android.searchbaseframe.util.ListStyle;
import kotlin.jvm.internal.q;
import tb.hte;
import tb.ipq;
import tb.iru;
import tb.ise;
import tb.itd;
import tb.ith;
import tb.ium;
import tb.kge;

/* loaded from: classes6.dex */
public final class d extends ith<iru<? extends com.taobao.android.meta.data.b<? extends com.taobao.android.meta.data.a, MetaResult<? extends com.taobao.android.meta.data.a>>>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean d;
    private final hte e;

    static {
        kge.a(1219013294);
    }

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        if (str.hashCode() == 431080268) {
            return new Long(super.getItemId(((Number) objArr[0]).intValue()));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ListStyle listStyle, Activity activity, ium parent, iru<? extends com.taobao.android.meta.data.b<? extends com.taobao.android.meta.data.a, MetaResult<? extends com.taobao.android.meta.data.a>>> model, int i, hte config) {
        super(listStyle, activity, parent, model, i);
        q.c(listStyle, "listStyle");
        q.c(activity, "activity");
        q.c(parent, "parent");
        q.c(model, "model");
        q.c(config, "config");
        this.e = config;
    }

    @Override // tb.ivp, tb.inv
    public itd<?, ?> a(ipq ipqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (itd) ipChange.ipc$dispatch("e572eadf", new Object[]{this, ipqVar});
        }
        ise<ipq, itd<?, ?>> b = this.e.b();
        if (b == null) {
            q.a();
        }
        itd<?, ?> a2 = b.a(ipqVar);
        q.a((Object) a2, "config.muiseCell!!.create(paramPack)");
        return a2;
    }

    @Override // tb.ivp, tb.inv
    public itd<?, ?> b(ipq ipqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (itd) ipChange.ipc$dispatch("cd14c13e", new Object[]{this, ipqVar});
        }
        ise<ipq, itd<?, ?>> c = this.e.c();
        if (c == null) {
            q.a();
        }
        itd<?, ?> a2 = c.a(ipqVar);
        q.a((Object) a2, "config.weexCell!!.create(paramPack)");
        return a2;
    }

    @Override // tb.ivp, android.support.v7.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue();
        }
        if (!this.d) {
            return super.getItemId(i);
        }
        Object a2 = a(i);
        if (a2 == null) {
            return -1L;
        }
        return a2.hashCode();
    }
}
