package com.taobao.android.searchbaseframe.xsl.refact;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.xsl.page.uikit.XslPageLayout;
import kotlin.TypeCastException;
import tb.htd;
import tb.hte;
import tb.inx;
import tb.irq;
import tb.iru;
import tb.ise;
import tb.ium;
import tb.kge;

/* loaded from: classes6.dex */
public class h extends hte {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final com.taobao.android.meta.data.d<Boolean> d = new com.taobao.android.meta.data.d<>(true, false);
    private final com.taobao.android.meta.data.d<d> e = new com.taobao.android.meta.data.d<>(null);
    private final com.taobao.android.meta.data.d<Integer> f = new com.taobao.android.meta.data.d<>(0, false);
    private final com.taobao.android.meta.data.d<Integer> g = new com.taobao.android.meta.data.d<>(0, false);
    private final com.taobao.android.meta.data.d<Boolean> p = new com.taobao.android.meta.data.d<>(true, false);
    private final com.taobao.android.meta.data.d<Integer> h = new com.taobao.android.meta.data.d<>(0, false);
    private final com.taobao.android.meta.data.d<Integer> i = new com.taobao.android.meta.data.d<>(0, false);
    private final com.taobao.android.meta.data.d<Integer> j = new com.taobao.android.meta.data.d<>(0, false);
    private final com.taobao.android.meta.data.d<Integer> k = new com.taobao.android.meta.data.d<>(0, false);
    private final com.taobao.android.meta.data.d<Integer> l = new com.taobao.android.meta.data.d<>(0, false);
    private final com.taobao.android.meta.data.d<XslPageLayout.a> m = new com.taobao.android.meta.data.d<>(null);
    private com.taobao.android.meta.data.d<Boolean> o = new com.taobao.android.meta.data.d<>(false, false);

    static {
        kge.a(-1735252529);
    }

    public h() {
        e(true);
        c(true);
        k(AnonymousClass1.INSTANCE);
        i(new ise<irq, com.taobao.android.meta.structure.childpage.g>() { // from class: com.taobao.android.searchbaseframe.xsl.refact.h.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ise
            public final e a(irq it) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (e) ipChange.ipc$dispatch("593ab2e0", new Object[]{this, it});
                }
                Activity activity = it.c;
                kotlin.jvm.internal.q.a((Object) activity, "it.activity");
                ium iumVar = it.d;
                kotlin.jvm.internal.q.a((Object) iumVar, "it.parent");
                h hVar = h.this;
                kotlin.jvm.internal.q.a((Object) it, "it");
                iru a2 = h.a(hVar, it);
                if (a2 != null) {
                    return new e(activity, iumVar, a2, it.f, it.g);
                }
                throw new TypeCastException("null cannot be cast to non-null type com.taobao.android.searchbaseframe.business.srp.widget.WidgetModelAdapter<com.taobao.android.searchbaseframe.xsl.refact.XslDataSource>");
            }
        });
        i(false);
        g(AnonymousClass3.INSTANCE);
        a(new htd() { // from class: com.taobao.android.searchbaseframe.xsl.refact.h.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.htd
            public boolean a(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
                }
                return true;
            }
        });
        b(true);
    }

    public static final /* synthetic */ iru a(h hVar, irq irqVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (iru) ipChange.ipc$dispatch("9852d7fd", new Object[]{hVar, irqVar}) : hVar.a(irqVar);
    }

    public final com.taobao.android.meta.data.d<Boolean> ad() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.meta.data.d) ipChange.ipc$dispatch("b05c6a05", new Object[]{this}) : this.d;
    }

    public final com.taobao.android.meta.data.d<d> ae() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.meta.data.d) ipChange.ipc$dispatch("249ba264", new Object[]{this}) : this.e;
    }

    public final com.taobao.android.meta.data.d<Integer> af() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.meta.data.d) ipChange.ipc$dispatch("98dadac3", new Object[]{this}) : this.f;
    }

    public final com.taobao.android.meta.data.d<Integer> ag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.meta.data.d) ipChange.ipc$dispatch("d1a1322", new Object[]{this}) : this.g;
    }

    public final com.taobao.android.meta.data.d<Boolean> ap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.meta.data.d) ipChange.ipc$dispatch("23530e79", new Object[]{this}) : this.p;
    }

    public final com.taobao.android.meta.data.d<Integer> ah() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.meta.data.d) ipChange.ipc$dispatch("81594b81", new Object[]{this}) : this.h;
    }

    public final com.taobao.android.meta.data.d<Integer> ai() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.meta.data.d) ipChange.ipc$dispatch("f59883e0", new Object[]{this}) : this.i;
    }

    public final com.taobao.android.meta.data.d<Integer> aj() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.meta.data.d) ipChange.ipc$dispatch("69d7bc3f", new Object[]{this}) : this.j;
    }

    public final com.taobao.android.meta.data.d<Integer> ak() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.meta.data.d) ipChange.ipc$dispatch("de16f49e", new Object[]{this}) : this.k;
    }

    public final com.taobao.android.meta.data.d<Integer> al() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.meta.data.d) ipChange.ipc$dispatch("52562cfd", new Object[]{this}) : this.l;
    }

    public final com.taobao.android.meta.data.d<XslPageLayout.a> am() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.meta.data.d) ipChange.ipc$dispatch("c695655c", new Object[]{this}) : this.m;
    }

    public final com.taobao.android.meta.data.d<Boolean> ao() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.meta.data.d) ipChange.ipc$dispatch("af13d61a", new Object[]{this}) : this.o;
    }

    /* renamed from: com.taobao.android.searchbaseframe.xsl.refact.h$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1<PARAMS, RESULT> implements ise<Void, inx.b> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        @Override // tb.ise
        public final com.taobao.android.searchbaseframe.xsl.module.e a(Void r4) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (com.taobao.android.searchbaseframe.xsl.module.e) ipChange.ipc$dispatch("18591b92", new Object[]{this, r4}) : new com.taobao.android.searchbaseframe.xsl.module.e();
        }
    }

    /* renamed from: com.taobao.android.searchbaseframe.xsl.refact.h$3  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass3<PARAMS, RESULT> implements ise<com.taobao.android.meta.structure.list.h, com.taobao.android.meta.structure.list.e> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        @Override // tb.ise
        public final m a(com.taobao.android.meta.structure.list.h it) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (m) ipChange.ipc$dispatch("a3149b55", new Object[]{this, it});
            }
            kotlin.jvm.internal.q.a((Object) it, "it");
            return new m(it);
        }
    }
}
