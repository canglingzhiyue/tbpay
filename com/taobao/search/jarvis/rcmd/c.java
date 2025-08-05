package com.taobao.search.jarvis.rcmd;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.xsl.refact.h;
import com.taobao.search.common.util.r;
import com.taobao.search.musie.o;
import com.taobao.search.musie.p;
import kotlin.jvm.internal.q;
import tb.hte;
import tb.htp;
import tb.imn;
import tb.ipq;
import tb.irp;
import tb.iru;
import tb.ise;
import tb.itd;
import tb.itn;
import tb.ito;
import tb.jzc;
import tb.jzf;
import tb.kge;

/* loaded from: classes7.dex */
public final class c extends h {
    static {
        kge.a(-1480130758);
    }

    public c(imn core) {
        q.c(core, "core");
        a(AnonymousClass1.INSTANCE);
        b(AnonymousClass2.INSTANCE);
        c(AnonymousClass3.INSTANCE);
        d(AnonymousClass4.INSTANCE);
        f(AnonymousClass5.INSTANCE);
        e(AnonymousClass6.INSTANCE);
        k(r.cb());
    }

    /* renamed from: com.taobao.search.jarvis.rcmd.c$1  reason: invalid class name */
    /* loaded from: classes7.dex */
    public static final class AnonymousClass1<PARAMS, RESULT> implements ise<ipq, itd<?, ?>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        @Override // tb.ise
        public final p a(ipq ipqVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (p) ipChange.ipc$dispatch("fa5e3e0b", new Object[]{this, ipqVar}) : new p(ipqVar.c, ipqVar.e, ipqVar.d, ipqVar.b, ipqVar.f, ipqVar.f29218a);
        }
    }

    /* renamed from: com.taobao.search.jarvis.rcmd.c$2  reason: invalid class name */
    /* loaded from: classes7.dex */
    public static final class AnonymousClass2<PARAMS, RESULT> implements ise<ipq, itd<?, ?>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        @Override // tb.ise
        public final jzc<iru<? extends com.taobao.android.searchbaseframe.datasource.impl.a<? extends BaseSearchResult, ?>>> a(ipq ipqVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (jzc) ipChange.ipc$dispatch("e57375a5", new Object[]{this, ipqVar}) : new jzc<>(ipqVar.c, ipqVar.e, ipqVar.d, ipqVar.b, ipqVar.f, ipqVar.f29218a);
        }
    }

    /* renamed from: com.taobao.search.jarvis.rcmd.c$3  reason: invalid class name */
    /* loaded from: classes7.dex */
    public static final class AnonymousClass3<PARAMS, RESULT> implements ise<irp, itn> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        @Override // tb.ise
        public final o a(irp irpVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (o) ipChange.ipc$dispatch("238322cf", new Object[]{this, irpVar}) : new o(irpVar.c, irpVar.d, irpVar.e, irpVar.f29258a, irpVar.f, irpVar.g);
        }
    }

    /* renamed from: com.taobao.search.jarvis.rcmd.c$4  reason: invalid class name */
    /* loaded from: classes7.dex */
    public static final class AnonymousClass4<PARAMS, RESULT> implements ise<irp, ito> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

        @Override // tb.ise
        public final jzf a(irp irpVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (jzf) ipChange.ipc$dispatch("5ff20dff", new Object[]{this, irpVar}) : new jzf(irpVar.c, irpVar.d, irpVar.e, irpVar.f29258a, irpVar.f, irpVar.g);
        }
    }

    /* renamed from: com.taobao.search.jarvis.rcmd.c$5  reason: invalid class name */
    /* loaded from: classes7.dex */
    public static final class AnonymousClass5<PARAMS, RESULT> implements ise<hte, htp> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final AnonymousClass5 INSTANCE = new AnonymousClass5();

        @Override // tb.ise
        public final f a(hte hteVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("de4376db", new Object[]{this, hteVar}) : new f();
        }
    }

    /* renamed from: com.taobao.search.jarvis.rcmd.c$6  reason: invalid class name */
    /* loaded from: classes7.dex */
    public static final class AnonymousClass6<PARAMS, RESULT> implements ise<hte, com.taobao.android.meta.structure.state.c> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final AnonymousClass6 INSTANCE = new AnonymousClass6();

        @Override // tb.ise
        public final g a(hte hteVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("de4376fa", new Object[]{this, hteVar}) : new g();
        }
    }
}
