package com.alibaba.motu.tbrest.rest;

import android.content.Context;
import com.alibaba.motu.tbrest.rest.d;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import tb.byo;
import tb.byp;
import tb.byq;
import tb.byr;
import tb.bys;
import tb.byt;
import tb.bzg;
import tb.kge;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final Executor f3153a;
    private final byr b = byr.a();
    private final byp c = new byp();
    private final d d = new d();
    private final byq<byo> e = new byq<>(100);
    private int f = 0;
    private int g = 0;

    static {
        kge.a(1084859338);
        f3153a = Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: com.alibaba.motu.tbrest.rest.a.1
            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                return new Thread(runnable, "Rest");
            }
        });
    }

    public a() {
        if (com.alibaba.motu.tbrest.c.a()) {
            Executor executor = f3153a;
            if (!(executor instanceof ThreadPoolExecutor)) {
                return;
            }
            ((ThreadPoolExecutor) executor).setKeepAliveTime(1L, TimeUnit.SECONDS);
            ((ThreadPoolExecutor) f3153a).allowCoreThreadTimeOut(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final byo byoVar) {
        f3153a.execute(new Runnable() { // from class: com.alibaba.motu.tbrest.rest.a.4
            @Override // java.lang.Runnable
            public void run() {
                byo byoVar2 = (byo) a.this.e.a(byoVar);
                if (byoVar2 != null) {
                    int c = byoVar2.c();
                    a.this.g += c;
                    bys.a("fail", "totalCount", Integer.valueOf(a.this.g), "currentCount", Integer.valueOf(c));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(byp.a aVar, Context context) {
        byte[] a2 = a(aVar.c(), context, aVar.b());
        if (a2 != null) {
            this.d.a(new byo(aVar.c(), aVar.e(), aVar.d(), a2), new d.a() { // from class: com.alibaba.motu.tbrest.rest.a.3
                @Override // com.alibaba.motu.tbrest.rest.d.a
                public void a(byo byoVar) {
                    a.this.b(byoVar);
                }

                @Override // com.alibaba.motu.tbrest.rest.d.a
                public void b(byo byoVar) {
                    a.this.a(byoVar);
                }
            });
        }
    }

    private boolean a(int i) {
        return bzg.a() < this.b.a(String.valueOf(i));
    }

    private byte[] a(String str, Context context, Map<String, String> map) {
        try {
            return byt.a(str, context, map);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final byo byoVar) {
        f3153a.execute(new Runnable() { // from class: com.alibaba.motu.tbrest.rest.a.5
            @Override // java.lang.Runnable
            public void run() {
                int c = byoVar.c();
                a.this.f += c;
                bys.a("success", "totalCount", Integer.valueOf(a.this.f), "currentCount", Integer.valueOf(c));
                byo byoVar2 = (byo) a.this.e.a();
                if (byoVar2 != null) {
                    a.this.d.a(byoVar2, new d.a() { // from class: com.alibaba.motu.tbrest.rest.a.5.1
                        @Override // com.alibaba.motu.tbrest.rest.d.a
                        public void a(byo byoVar3) {
                            a.this.b(byoVar3);
                        }

                        @Override // com.alibaba.motu.tbrest.rest.d.a
                        public void b(byo byoVar3) {
                            a.this.a(byoVar3);
                        }
                    });
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        f3153a.execute(new Runnable() { // from class: com.alibaba.motu.tbrest.rest.a.6
            @Override // java.lang.Runnable
            public void run() {
                for (byp.a aVar : a.this.c.a().values()) {
                    a.this.a(aVar, com.alibaba.motu.tbrest.d.a().f3151a);
                }
                a.this.c.b();
            }
        });
    }

    public boolean a(final int i, final String str, final Context context, final String str2, final String str3) {
        if (a(i)) {
            f3153a.execute(new Runnable() { // from class: com.alibaba.motu.tbrest.rest.a.2
                @Override // java.lang.Runnable
                public void run() {
                    byp.a a2 = a.this.c.a(str, str2);
                    a2.a(String.valueOf(i), str3);
                    if (a2.a() >= a.this.b.b() || a2.d() >= a.this.b.d()) {
                        a.this.a(a2, context);
                        a.this.c.b(str, str2);
                    }
                }
            });
            return true;
        }
        return false;
    }
}
