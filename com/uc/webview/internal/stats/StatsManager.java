package com.uc.webview.internal.stats;

import android.os.Handler;
import android.os.Message;
import com.uc.webview.base.task.b;
import com.uc.webview.internal.stats.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes9.dex */
public class StatsManager {

    /* renamed from: a  reason: collision with root package name */
    private static volatile boolean f23987a = false;
    private static volatile boolean b = false;
    private static long c = System.currentTimeMillis();
    private static final ArrayList<h> d = new ArrayList<>();
    private static final ArrayList<a> e = new ArrayList<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes9.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f23988a;
        public final Map<String, String> b = new HashMap();

        a(String str, Map<String, String> map) {
            this.f23988a = str;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                Map<String, String> map2 = this.b;
                if (!key.startsWith("_")) {
                    key = "_".concat(String.valueOf(key));
                }
                map2.put(key, value);
            }
        }

        final void a() {
            e.a(true, false, this.f23988a, this.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes9.dex */
    public static class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private Message f23989a;

        public b(Message message) {
            this.f23989a = message;
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0038, code lost:
            if (com.uc.webview.internal.stats.StatsManager.e() != false) goto L20;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void run() {
            /*
                r4 = this;
                android.os.Message r0 = r4.f23989a
                int r1 = r0.what
                r2 = 1
                if (r1 == r2) goto L42
                r2 = 2
                if (r1 == r2) goto L3b
                r2 = 3
                if (r1 == r2) goto L31
                r2 = 4
                if (r1 == r2) goto L11
                goto L67
            L11:
                java.lang.Object r1 = r0.obj
                boolean r1 = r1 instanceof com.uc.webview.internal.stats.StatsManager.a
                if (r1 == 0) goto L67
                java.lang.Object r1 = r0.obj
                com.uc.webview.internal.stats.StatsManager$a r1 = (com.uc.webview.internal.stats.StatsManager.a) r1
                java.util.HashSet<java.lang.String> r2 = com.uc.webview.internal.stats.f.d
                java.lang.String r3 = r1.f23988a
                boolean r2 = r2.contains(r3)
                if (r2 == 0) goto L29
                r1.a()
                goto L67
            L29:
                java.util.ArrayList r2 = com.uc.webview.internal.stats.StatsManager.a()
                r2.add(r1)
                goto L67
            L31:
                com.uc.webview.internal.stats.StatsManager.d()
                boolean r1 = com.uc.webview.internal.stats.StatsManager.e()
                if (r1 == 0) goto L67
                goto L3e
            L3b:
                com.uc.webview.internal.stats.StatsManager.b()
            L3e:
                com.uc.webview.internal.stats.StatsManager.c()
                goto L67
            L42:
                java.lang.Object r1 = r0.obj
                boolean r1 = r1 instanceof com.uc.webview.internal.stats.c
                if (r1 == 0) goto L67
                java.lang.Object r1 = r0.obj
                com.uc.webview.internal.stats.c r1 = (com.uc.webview.internal.stats.c) r1
                java.lang.String r2 = r1.g()
                java.util.HashSet<java.lang.String> r3 = com.uc.webview.internal.stats.f.d
                boolean r2 = r3.contains(r2)
                if (r2 == 0) goto L64
                java.lang.String r2 = r1.g()
                java.util.Map r1 = r1.e()
                com.uc.webview.internal.stats.e.a(r2, r1)
                goto L67
            L64:
                r1.i()
            L67:
                r0.recycle()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.uc.webview.internal.stats.StatsManager.b.run():void");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(c cVar) {
        b.a.f23797a.a(new b(Message.obtain(null, 1, cVar)));
    }

    public static void a(h hVar) {
        synchronized (StatsManager.class) {
            d.add(hVar);
        }
    }

    static /* synthetic */ void c() {
        c = System.currentTimeMillis();
        synchronized (StatsManager.class) {
            if (d.isEmpty()) {
                return;
            }
            Iterator it = ((ArrayList) d.clone()).iterator();
            while (it.hasNext()) {
                ((h) it.next()).a();
            }
            if (e.isEmpty()) {
                return;
            }
            Iterator<a> it2 = e.iterator();
            while (it2.hasNext()) {
                it2.next().a();
            }
            e.clear();
        }
    }

    public static void commit(String str, Map<String, String> map) {
        c.a b2 = com.uc.webview.stat.a.b(str);
        if (b2 != null) {
            a(b2.a(map));
            return;
        }
        b.a.f23797a.a(new b(Message.obtain(null, 4, new a(str, map))));
    }

    public static void commitOnAppropriateTime() {
        if (!b) {
            b.a.f23797a.a(new b(Message.obtain((Handler) null, 3)));
            b = true;
        }
    }

    static /* synthetic */ boolean e() {
        return System.currentTimeMillis() - c > 300000;
    }

    public static void timeToCommit() {
        if (!f23987a) {
            b.a.f23797a.a(new b(Message.obtain((Handler) null, 2)));
            f23987a = true;
        }
    }
}
