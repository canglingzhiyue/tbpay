package com.taobao.android.litecreator.sdk.editor;

import com.android.alibaba.ip.runtime.IpChange;
import tb.hen;
import tb.kge;

/* loaded from: classes5.dex */
public final class d implements e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final g f13429a;
    private javax.inject.a<aa> b;
    private javax.inject.a<ah> c;
    private javax.inject.a<hen> d;

    static {
        kge.a(-1125107171);
        kge.a(-291605433);
    }

    private d(g gVar) {
        this.f13429a = gVar;
        a(gVar);
    }

    public static e a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("55650c1d", new Object[0]) : new a().a();
    }

    private void a(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0d8331b", new Object[]{this, gVar});
            return;
        }
        this.b = dagger.internal.a.a(m.a(gVar));
        this.c = dagger.internal.a.a(q.a(gVar));
        this.d = dagger.internal.a.a(n.a(gVar));
    }

    @Override // com.taobao.android.litecreator.sdk.editor.e
    public void a(com.taobao.android.litecreator.sdk.editor.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0d578e1", new Object[]{this, aVar});
        } else {
            b(aVar);
        }
    }

    @Override // com.taobao.android.litecreator.sdk.editor.e
    public void a(ai aiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39eecac6", new Object[]{this, aiVar});
        } else {
            b(aiVar);
        }
    }

    private com.taobao.android.litecreator.sdk.editor.a b(com.taobao.android.litecreator.sdk.editor.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.litecreator.sdk.editor.a) ipChange.ipc$dispatch("e6283a39", new Object[]{this, aVar});
        }
        b.a(aVar, l.a(this.f13429a));
        b.a(aVar, j.a(this.f13429a));
        b.a(aVar, o.a(this.f13429a));
        b.a(aVar, k.a(this.f13429a));
        b.a(aVar, h.a(this.f13429a));
        b.a(aVar, this.b.get());
        b.a(aVar, this.c.get());
        b.a(aVar, this.d.get());
        b.a(aVar, i.a(this.f13429a));
        b.a(aVar, aq.a(this.f13429a));
        b.a(aVar, p.a(this.f13429a));
        return aVar;
    }

    private ai b(ai aiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ai) ipChange.ipc$dispatch("6e62988d", new Object[]{this, aiVar});
        }
        aj.a(aiVar, this.d.get());
        return aiVar;
    }

    /* loaded from: classes5.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private g f13430a;

        static {
            kge.a(645768180);
        }

        private a() {
        }

        public e a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("55650c1d", new Object[]{this});
            }
            if (this.f13430a == null) {
                this.f13430a = new g();
            }
            return new d(this.f13430a);
        }
    }
}
