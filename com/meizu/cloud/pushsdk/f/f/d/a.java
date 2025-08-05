package com.meizu.cloud.pushsdk.f.f.d;

import com.meizu.cloud.pushsdk.f.f.a;
import com.meizu.cloud.pushsdk.f.g.c;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes4.dex */
public class a extends com.meizu.cloud.pushsdk.f.f.a {
    private static final String o = "a";
    private static ScheduledExecutorService p;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.meizu.cloud.pushsdk.f.f.d.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public class RunnableC0286a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.meizu.cloud.pushsdk.f.f.b f7972a;

        RunnableC0286a(com.meizu.cloud.pushsdk.f.f.b bVar) {
            this.f7972a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f7972a.a();
        }
    }

    /* loaded from: classes4.dex */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.meizu.cloud.pushsdk.f.d.b f7973a;
        final /* synthetic */ boolean b;

        b(com.meizu.cloud.pushsdk.f.d.b bVar, boolean z) {
            this.f7973a = bVar;
            this.b = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.super.a(this.f7973a, this.b);
        }
    }

    public a(a.C0285a c0285a) {
        super(c0285a);
        com.meizu.cloud.pushsdk.f.c.h.b.a(this.l);
        c();
    }

    @Override // com.meizu.cloud.pushsdk.f.f.a
    public void a(com.meizu.cloud.pushsdk.f.d.b bVar, boolean z) {
        com.meizu.cloud.pushsdk.f.c.h.b.a(new b(bVar, z));
    }

    public void c() {
        if (p != null || !this.j) {
            return;
        }
        c.a(o, "Session checking has been resumed.", new Object[0]);
        com.meizu.cloud.pushsdk.f.f.b bVar = this.e;
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        p = newSingleThreadScheduledExecutor;
        RunnableC0286a runnableC0286a = new RunnableC0286a(bVar);
        long j = this.k;
        newSingleThreadScheduledExecutor.scheduleAtFixedRate(runnableC0286a, j, j, this.m);
    }
}
