package com.taobao.tao.messagekit.core.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.concurrent.TimeUnit;
import tao.reactivex.e;
import tb.jdz;
import tb.jew;
import tb.jrg;
import tb.kge;

/* loaded from: classes8.dex */
public class c<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private jdz f20781a = null;
    private tao.reactivex.h.a<T> b = tao.reactivex.h.a.c();
    private e<T> c;
    private long d;

    static {
        kge.a(1022814431);
    }

    public static /* synthetic */ jdz a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jdz) ipChange.ipc$dispatch("222b4b7c", new Object[]{cVar}) : cVar.f20781a;
    }

    public static /* synthetic */ jdz a(c cVar, jdz jdzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jdz) ipChange.ipc$dispatch("1e39e78c", new Object[]{cVar, jdzVar});
        }
        cVar.f20781a = jdzVar;
        return jdzVar;
    }

    public static /* synthetic */ long b(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("75085bbf", new Object[]{cVar})).longValue() : cVar.d;
    }

    public static /* synthetic */ tao.reactivex.h.a c(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (tao.reactivex.h.a) ipChange.ipc$dispatch("384f640", new Object[]{cVar}) : cVar.b;
    }

    public c<T> a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("3fcb629c", new Object[]{this, new Long(j)});
        }
        this.d = j;
        return this;
    }

    public c<T> a(e<T> eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("51fc9b07", new Object[]{this, eVar});
        }
        this.c = eVar;
        return this;
    }

    public void a(final jew<List<T>> jewVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef3cfebc", new Object[]{this, jewVar});
            return;
        }
        e<T> eVar = this.c;
        if (eVar == null) {
            return;
        }
        eVar.c(new jew<T>() { // from class: com.taobao.tao.messagekit.core.model.c.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.jew
            public void accept(T t) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b028bfab", new Object[]{this, t});
                    return;
                }
                if (c.a(c.this) == null) {
                    c cVar = c.this;
                    c.a(cVar, c.c(cVar).b(c.b(c.this), TimeUnit.MILLISECONDS).a(new jrg<List<T>>() { // from class: com.taobao.tao.messagekit.core.model.c.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        public boolean a(List<T> list) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                return ((Boolean) ipChange3.ipc$dispatch("c705295d", new Object[]{this, list})).booleanValue();
                            }
                            if (list.size() > 0 || c.a(c.this) == null) {
                                return true;
                            }
                            c.a(c.this).b_();
                            c.a(c.this, null);
                            return false;
                        }

                        @Override // tb.jrg
                        public /* synthetic */ boolean test(Object obj) {
                            IpChange ipChange3 = $ipChange;
                            return ipChange3 instanceof IpChange ? ((Boolean) ipChange3.ipc$dispatch("5a0eabb9", new Object[]{this, obj})).booleanValue() : a((List) obj);
                        }
                    }).c(jewVar));
                }
                c.c(c.this).onNext(t);
            }
        });
    }
}
