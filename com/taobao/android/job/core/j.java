package com.taobao.android.job.core;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class j<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final com.taobao.android.job.core.graph.c<T> f12993a;

    /* loaded from: classes.dex */
    public static class c<T> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final com.taobao.android.job.core.graph.c<T> f12996a;

        public c(com.taobao.android.job.core.graph.c<T> cVar, T t) {
            cVar.addAsDependentOnAllLeafNodes(t);
            this.f12996a = cVar;
        }

        public static <T> c<T> a(com.taobao.android.job.core.graph.c<T> cVar, T t) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("26ea43d1", new Object[]{cVar, t}) : new c<>(cVar, t);
        }
    }

    /* loaded from: classes.dex */
    public static class d<T> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final com.taobao.android.job.core.graph.c<T> f12997a;

        public d(com.taobao.android.job.core.graph.c<T> cVar, T t) {
            this.f12997a = cVar;
            cVar.addAsDependencyToAllInitialNodes(t);
        }

        public static <T> d<T> a(com.taobao.android.job.core.graph.c<T> cVar, T t) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("26ea43f0", new Object[]{cVar, t}) : new d<>(cVar, t);
        }
    }

    private j(com.taobao.android.job.core.graph.c<T> cVar) {
        this.f12993a = cVar;
    }

    public static <T, R> j<T> a(com.taobao.android.job.core.e<T, R> eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (j) ipChange.ipc$dispatch("b4877c71", new Object[]{eVar}) : new j<>(eVar.b());
    }

    public d<T> a(T t) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("80cef9b6", new Object[]{this, t}) : d.a(this.f12993a, t);
    }

    public c<T> b(T t) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("aa234ed8", new Object[]{this, t}) : c.a(this.f12993a, t);
    }

    public void a(T t, T t2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("184a7920", new Object[]{this, t, t2});
        } else {
            this.f12993a.addDependency(t, t2);
        }
    }

    public e<T> c(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("d377a457", new Object[]{this, t});
        }
        this.f12993a.addIndependent(t);
        return new e<>(this.f12993a, t);
    }

    public a<T> d(T t) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("fccbf91c", new Object[]{this, t}) : a.a(this.f12993a, t);
    }

    @SafeVarargs
    public final b<T> a(T... tArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("40a3c8fd", new Object[]{this, tArr}) : b.a(this.f12993a, tArr);
    }

    /* loaded from: classes5.dex */
    public static class b<T> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final com.taobao.android.job.core.graph.c<T> f12995a;
        private final T[] b;

        public b(com.taobao.android.job.core.graph.c<T> cVar, T[] tArr) {
            this.f12995a = cVar;
            this.b = tArr;
        }

        public static <T> b<T> a(com.taobao.android.job.core.graph.c<T> cVar, T[] tArr) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("5df1c603", new Object[]{cVar, tArr}) : new b<>(cVar, tArr);
        }

        public final void a(T t) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6251244", new Object[]{this, t});
            } else {
                f.a(this.f12995a, this.b).a(t);
            }
        }
    }

    /* loaded from: classes5.dex */
    public static class f<T> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final com.taobao.android.job.core.graph.c<T> f12999a;
        private final T[] b;

        public f(com.taobao.android.job.core.graph.c<T> cVar, T[] tArr) {
            this.f12999a = cVar;
            this.b = tArr;
        }

        public static <T> f<T> a(com.taobao.android.job.core.graph.c<T> cVar, T[] tArr) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("5df1c67f", new Object[]{cVar, tArr}) : new f<>(cVar, tArr);
        }

        public final void a(T t) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6251244", new Object[]{this, t});
                return;
            }
            for (T t2 : this.b) {
                this.f12999a.addDependency(t2, t);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class a<T> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final com.taobao.android.job.core.graph.c<T> f12994a;
        private final T b;

        public a(com.taobao.android.job.core.graph.c<T> cVar, T t) {
            this.f12994a = cVar;
            this.b = t;
        }

        public static <T> a<T> a(com.taobao.android.job.core.graph.c<T> cVar, T t) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("26ea4393", new Object[]{cVar, t}) : new a<>(cVar, t);
        }

        @SafeVarargs
        public final void a(T t, T... tArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("88b8aa6d", new Object[]{this, t, tArr});
            } else {
                e.a(this.f12994a, this.b).a((e) t, (e[]) tArr);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class e<T> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final com.taobao.android.job.core.graph.c<T> f12998a;
        private final T b;

        public e(com.taobao.android.job.core.graph.c<T> cVar, T t) {
            this.f12998a = cVar;
            this.b = t;
        }

        public static <T> e<T> a(com.taobao.android.job.core.graph.c<T> cVar, T t) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("26ea440f", new Object[]{cVar, t}) : new e<>(cVar, t);
        }

        @SafeVarargs
        public final void a(T t, T... tArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("88b8aa6d", new Object[]{this, t, tArr});
                return;
            }
            this.f12998a.addDependency(this.b, t);
            for (T t2 : tArr) {
                this.f12998a.addDependency(this.b, t2);
            }
        }
    }
}
