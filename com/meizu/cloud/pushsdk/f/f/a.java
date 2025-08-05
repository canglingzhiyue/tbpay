package com.meizu.cloud.pushsdk.f.f;

import android.content.Context;
import com.meizu.cloud.pushsdk.PushManager;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f7967a = "a";
    protected com.meizu.cloud.pushsdk.f.c.a c;
    protected c d;
    protected b e;
    protected final String f;
    protected final String g;
    protected final boolean h;
    protected final com.meizu.cloud.pushsdk.f.g.b i;
    protected final boolean j;
    protected final long k;
    protected final int l;
    protected final TimeUnit m;
    protected final String b = PushManager.TAG;
    protected final AtomicBoolean n = new AtomicBoolean(true);

    /* renamed from: com.meizu.cloud.pushsdk.f.f.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0285a {

        /* renamed from: a  reason: collision with root package name */
        protected final com.meizu.cloud.pushsdk.f.c.a f7968a;
        protected final String b;
        protected final String c;
        protected final Context d;
        protected c e = null;
        protected boolean f = false;
        protected com.meizu.cloud.pushsdk.f.g.b g = com.meizu.cloud.pushsdk.f.g.b.OFF;
        protected boolean h = false;
        protected long i = 600;
        protected long j = 300;
        protected long k = 15;
        protected int l = 10;
        protected TimeUnit m = TimeUnit.SECONDS;

        public C0285a(com.meizu.cloud.pushsdk.f.c.a aVar, String str, String str2, Context context, Class<? extends a> cls) {
            this.f7968a = aVar;
            this.b = str;
            this.c = str2;
            this.d = context;
        }

        public C0285a a(int i) {
            this.l = i;
            return this;
        }

        public C0285a a(c cVar) {
            this.e = cVar;
            return this;
        }

        public C0285a a(com.meizu.cloud.pushsdk.f.g.b bVar) {
            this.g = bVar;
            return this;
        }

        public C0285a a(Boolean bool) {
            this.f = bool.booleanValue();
            return this;
        }
    }

    public a(C0285a c0285a) {
        this.c = c0285a.f7968a;
        this.g = c0285a.c;
        this.h = c0285a.f;
        this.f = c0285a.b;
        this.d = c0285a.e;
        this.i = c0285a.g;
        boolean z = c0285a.h;
        this.j = z;
        this.k = c0285a.k;
        int i = c0285a.l;
        this.l = i < 2 ? 2 : i;
        this.m = c0285a.m;
        if (z) {
            this.e = new b(c0285a.i, c0285a.j, c0285a.m, c0285a.d);
        }
        com.meizu.cloud.pushsdk.f.g.c.a(c0285a.g);
        com.meizu.cloud.pushsdk.f.g.c.c(f7967a, "Tracker created successfully.", new Object[0]);
    }

    private com.meizu.cloud.pushsdk.f.b.b a(List<com.meizu.cloud.pushsdk.f.b.b> list) {
        if (this.j) {
            list.add(this.e.b());
        }
        c cVar = this.d;
        if (cVar != null) {
            if (!cVar.b().isEmpty()) {
                list.add(new com.meizu.cloud.pushsdk.f.b.b("geolocation", this.d.b()));
            }
            if (!this.d.c().isEmpty()) {
                list.add(new com.meizu.cloud.pushsdk.f.b.b("mobileinfo", this.d.c()));
            }
        }
        LinkedList linkedList = new LinkedList();
        for (com.meizu.cloud.pushsdk.f.b.b bVar : list) {
            linkedList.add(bVar.a());
        }
        return new com.meizu.cloud.pushsdk.f.b.b("push_extra_info", linkedList);
    }

    private void a(com.meizu.cloud.pushsdk.f.b.c cVar, List<com.meizu.cloud.pushsdk.f.b.b> list, boolean z) {
        c cVar2 = this.d;
        if (cVar2 != null) {
            cVar.a(new HashMap(cVar2.a()));
            cVar.a("et", a(list).a());
        }
        com.meizu.cloud.pushsdk.f.g.c.c(f7967a, "Adding new payload to event storage: %s", cVar);
        this.c.a(cVar, z);
    }

    public com.meizu.cloud.pushsdk.f.c.a a() {
        return this.c;
    }

    public void a(com.meizu.cloud.pushsdk.f.d.b bVar, boolean z) {
        if (!this.n.get()) {
            return;
        }
        a(bVar.e(), bVar.b(), z);
    }

    public void a(c cVar) {
        this.d = cVar;
    }

    public void b() {
        if (!this.n.get()) {
            return;
        }
        a().b();
    }
}
