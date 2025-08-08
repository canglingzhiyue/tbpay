package com.huawei.hms.framework.network.grs.g;

import android.content.Context;
import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import anet.channel.Constants;
import com.alipay.mobile.common.transport.utils.HeaderConstant;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.h.d;
import com.taobao.search.common.util.k;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;

/* loaded from: classes4.dex */
public class c {
    private static final String n = "c";

    /* renamed from: a  reason: collision with root package name */
    private final GrsBaseInfo f7426a;
    private final Context b;
    private final com.huawei.hms.framework.network.grs.e.a c;
    private d d;
    private final com.huawei.hms.framework.network.grs.g.k.c j;
    private com.huawei.hms.framework.network.grs.g.k.d k;
    private final Map<String, Future<d>> e = new ConcurrentHashMap(16);
    private final List<d> f = new CopyOnWriteArrayList();
    private final JSONArray g = new JSONArray();
    private final List<String> h = new CopyOnWriteArrayList();
    private final List<String> i = new CopyOnWriteArrayList();
    private String l = "";
    private long m = 1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements Callable<d> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ExecutorService f7427a;
        final /* synthetic */ String b;
        final /* synthetic */ com.huawei.hms.framework.network.grs.e.c c;

        a(ExecutorService executorService, String str, com.huawei.hms.framework.network.grs.e.c cVar) {
            this.f7427a = executorService;
            this.b = str;
            this.c = cVar;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        /* renamed from: call */
        public d mo780call() {
            return c.this.b(this.f7427a, this.b, this.c);
        }
    }

    public c(com.huawei.hms.framework.network.grs.g.k.c cVar, com.huawei.hms.framework.network.grs.e.a aVar) {
        this.j = cVar;
        this.f7426a = cVar.b();
        this.b = cVar.a();
        this.c = aVar;
        c();
        d();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x009c A[LOOP:0: B:3:0x0006->B:36:0x009c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0094 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.huawei.hms.framework.network.grs.g.d a(java.util.concurrent.ExecutorService r17, java.util.List<java.lang.String> r18, java.lang.String r19, com.huawei.hms.framework.network.grs.e.c r20) {
        /*
            r16 = this;
            r9 = r16
            r10 = 0
            r0 = 0
            r12 = r0
            r11 = 0
        L6:
            int r0 = r18.size()
            if (r11 >= r0) goto La0
            r13 = r18
            java.lang.Object r0 = r13.get(r11)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = android.text.StringUtils.isEmpty(r0)
            r14 = 1
            if (r1 != 0) goto L8f
            com.huawei.hms.framework.network.grs.g.a r15 = new com.huawei.hms.framework.network.grs.g.a
            android.content.Context r5 = r9.b
            com.huawei.hms.framework.network.grs.GrsBaseInfo r7 = r9.f7426a
            r1 = r15
            r2 = r0
            r3 = r11
            r4 = r16
            r6 = r19
            r8 = r20
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            java.util.concurrent.Callable r1 = r15.g()
            r2 = r17
            java.util.concurrent.Future r1 = r2.submit(r1)
            java.util.Map<java.lang.String, java.util.concurrent.Future<com.huawei.hms.framework.network.grs.g.d>> r3 = r9.e
            r3.put(r0, r1)
            long r3 = r9.m     // Catch: java.util.concurrent.TimeoutException -> L65 java.lang.InterruptedException -> L6e java.util.concurrent.ExecutionException -> L7a java.util.concurrent.CancellationException -> L86
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.util.concurrent.TimeoutException -> L65 java.lang.InterruptedException -> L6e java.util.concurrent.ExecutionException -> L7a java.util.concurrent.CancellationException -> L86
            java.lang.Object r0 = r1.get(r3, r0)     // Catch: java.util.concurrent.TimeoutException -> L65 java.lang.InterruptedException -> L6e java.util.concurrent.ExecutionException -> L7a java.util.concurrent.CancellationException -> L86
            r1 = r0
            com.huawei.hms.framework.network.grs.g.d r1 = (com.huawei.hms.framework.network.grs.g.d) r1     // Catch: java.util.concurrent.TimeoutException -> L65 java.lang.InterruptedException -> L6e java.util.concurrent.ExecutionException -> L7a java.util.concurrent.CancellationException -> L86
            if (r1 == 0) goto L84
            boolean r0 = r1.o()     // Catch: java.util.concurrent.TimeoutException -> L5d java.lang.InterruptedException -> L5f java.util.concurrent.ExecutionException -> L61 java.util.concurrent.CancellationException -> L63
            if (r0 != 0) goto L55
            boolean r0 = r1.m()     // Catch: java.util.concurrent.TimeoutException -> L5d java.lang.InterruptedException -> L5f java.util.concurrent.ExecutionException -> L61 java.util.concurrent.CancellationException -> L63
            if (r0 == 0) goto L84
        L55:
            java.lang.String r0 = com.huawei.hms.framework.network.grs.g.c.n     // Catch: java.util.concurrent.TimeoutException -> L5d java.lang.InterruptedException -> L5f java.util.concurrent.ExecutionException -> L61 java.util.concurrent.CancellationException -> L63
            java.lang.String r3 = "grs request return body is not null and is OK."
            com.huawei.hms.framework.common.Logger.i(r0, r3)     // Catch: java.util.concurrent.TimeoutException -> L5d java.lang.InterruptedException -> L5f java.util.concurrent.ExecutionException -> L61 java.util.concurrent.CancellationException -> L63
            goto L78
        L5d:
            r12 = r1
            goto L65
        L5f:
            r0 = move-exception
            goto L70
        L61:
            r0 = move-exception
            goto L7c
        L63:
            r12 = r1
            goto L86
        L65:
            java.lang.String r0 = com.huawei.hms.framework.network.grs.g.c.n
            java.lang.String r1 = "the wait timed out"
            com.huawei.hms.framework.common.Logger.w(r0, r1)
            goto L91
        L6e:
            r0 = move-exception
            r1 = r12
        L70:
            java.lang.String r3 = com.huawei.hms.framework.network.grs.g.c.n
            java.lang.String r4 = "the current thread was interrupted while waiting"
            com.huawei.hms.framework.common.Logger.w(r3, r4, r0)
        L78:
            r12 = r1
            goto L92
        L7a:
            r0 = move-exception
            r1 = r12
        L7c:
            java.lang.String r3 = com.huawei.hms.framework.network.grs.g.c.n
            java.lang.String r4 = "the computation threw an ExecutionException"
            com.huawei.hms.framework.common.Logger.w(r3, r4, r0)
        L84:
            r12 = r1
            goto L91
        L86:
            java.lang.String r0 = com.huawei.hms.framework.network.grs.g.c.n
            java.lang.String r1 = "{requestServer} the computation was cancelled"
            com.huawei.hms.framework.common.Logger.i(r0, r1)
            goto L92
        L8f:
            r2 = r17
        L91:
            r14 = 0
        L92:
            if (r14 == 0) goto L9c
            java.lang.String r0 = com.huawei.hms.framework.network.grs.g.c.n
            java.lang.String r1 = "needBreak is true so need break current circulation"
            com.huawei.hms.framework.common.Logger.v(r0, r1)
            goto La0
        L9c:
            int r11 = r11 + 1
            goto L6
        La0:
            com.huawei.hms.framework.network.grs.g.d r0 = r9.b(r12)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.framework.network.grs.g.c.a(java.util.concurrent.ExecutorService, java.util.List, java.lang.String, com.huawei.hms.framework.network.grs.e.c):com.huawei.hms.framework.network.grs.g.d");
    }

    private void a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(str);
        String grsReqParamJoint = this.f7426a.getGrsReqParamJoint(false, false, e(), this.b);
        if (!StringUtils.isEmpty(grsReqParamJoint)) {
            sb.append("?");
            sb.append(grsReqParamJoint);
        }
        this.i.add(sb.toString());
    }

    private d b(d dVar) {
        String str;
        String str2;
        for (Map.Entry<String, Future<d>> entry : this.e.entrySet()) {
            if (dVar != null && (dVar.o() || dVar.m())) {
                break;
            }
            try {
                dVar = entry.getValue().get(Constants.RECV_TIMEOUT, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                e = e;
                str = n;
                str2 = "{checkResponse} when check result, find InterruptedException, check others";
                Logger.w(str, str2, e);
            } catch (CancellationException unused) {
                Logger.i(n, "{checkResponse} when check result, find CancellationException, check others");
            } catch (ExecutionException e2) {
                e = e2;
                str = n;
                str2 = "{checkResponse} when check result, find ExecutionException, check others";
                Logger.w(str, str2, e);
            } catch (TimeoutException unused2) {
                Logger.w(n, "{checkResponse} when check result, find TimeoutException, cancel current request task");
                if (!entry.getValue().isCancelled()) {
                    entry.getValue().cancel(true);
                }
            }
        }
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public d b(ExecutorService executorService, String str, com.huawei.hms.framework.network.grs.e.c cVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        d a2 = a(executorService, this.i, str, cVar);
        int b = a2 == null ? 0 : a2.b();
        Logger.v(n, "use 2.0 interface return http's code is：{%s}", Integer.valueOf(b));
        if (b == 404 || b == 401) {
            if (StringUtils.isEmpty(e()) && StringUtils.isEmpty(this.f7426a.getAppName())) {
                Logger.i(n, "request grs server use 1.0 API must set appName,please check.");
                return null;
            }
            this.e.clear();
            Logger.i(n, "this env has not deploy new interface,so use old interface.");
            a2 = a(executorService, this.h, str, cVar);
        }
        e.a(new ArrayList(this.f), SystemClock.elapsedRealtime() - elapsedRealtime, this.g, this.b);
        this.f.clear();
        return a2;
    }

    private void b(String str, String str2) {
        if (!StringUtils.isEmpty(this.f7426a.getAppName()) || !StringUtils.isEmpty(e())) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            Locale locale = Locale.ROOT;
            Object[] objArr = new Object[1];
            objArr[0] = StringUtils.isEmpty(e()) ? this.f7426a.getAppName() : e();
            sb.append(String.format(locale, str, objArr));
            String grsReqParamJoint = this.f7426a.getGrsReqParamJoint(false, false, "1.0", this.b);
            if (!StringUtils.isEmpty(grsReqParamJoint)) {
                sb.append("?");
                sb.append(grsReqParamJoint);
            }
            this.h.add(sb.toString());
        }
    }

    private void c() {
        com.huawei.hms.framework.network.grs.g.k.d a2 = com.huawei.hms.framework.network.grs.g.j.a.a(this.b);
        if (a2 == null) {
            Logger.w(n, "g*s***_se****er_conf*** maybe has a big error");
            return;
        }
        a(a2);
        List<String> a3 = a2.a();
        if (a3 == null || a3.size() <= 0) {
            Logger.v(n, "maybe grs_base_url config with [],please check.");
        } else if (a3.size() > 10) {
            throw new IllegalArgumentException("grs_base_url's count is larger than MAX value 10");
        } else {
            String c = a2.c();
            String b = a2.b();
            if (a3.size() > 0) {
                for (String str : a3) {
                    if (!str.startsWith(k.HTTPS_PREFIX)) {
                        Logger.w(n, "grs server just support https scheme url,please check.");
                    } else {
                        b(c, str);
                        a(b, str);
                    }
                }
            }
            Logger.v(n, "request to GRS server url is{%s} and {%s}", this.h, this.i);
        }
    }

    private void d() {
        String grsParasKey = this.f7426a.getGrsParasKey(true, true, this.b);
        com.huawei.hms.framework.network.grs.e.c a2 = this.c.a();
        this.l = a2.a(grsParasKey + HeaderConstant.HEADER_KEY_ETAG, "");
    }

    private String e() {
        com.huawei.hms.framework.network.grs.f.b a2 = com.huawei.hms.framework.network.grs.f.b.a(this.b.getPackageName(), this.f7426a);
        com.huawei.hms.framework.network.grs.local.model.a a3 = a2 != null ? a2.a() : null;
        if (a3 != null) {
            String b = a3.b();
            Logger.v(n, "get appName from local assets is{%s}", b);
            return b;
        }
        return "";
    }

    public d a(ExecutorService executorService, String str, com.huawei.hms.framework.network.grs.e.c cVar) {
        String str2;
        String str3;
        if (!this.h.isEmpty() || !this.i.isEmpty()) {
            try {
                com.huawei.hms.framework.network.grs.g.k.d b = b();
                return (d) executorService.submit(new a(executorService, str, cVar)).get(b != null ? b.d() : 10, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                e = e;
                str2 = n;
                str3 = "{submitExcutorTaskWithTimeout} the current thread was interrupted while waiting";
                Logger.w(str2, str3, e);
                return null;
            } catch (CancellationException unused) {
                Logger.i(n, "{submitExcutorTaskWithTimeout} the computation was cancelled");
                return null;
            } catch (ExecutionException e2) {
                e = e2;
                str2 = n;
                str3 = "{submitExcutorTaskWithTimeout} the computation threw an ExecutionException";
                Logger.w(str2, str3, e);
                return null;
            } catch (TimeoutException unused2) {
                Logger.w(n, "{submitExcutorTaskWithTimeout} the wait timed out");
                return null;
            } catch (Exception e3) {
                e = e3;
                str2 = n;
                str3 = "{submitExcutorTaskWithTimeout} catch Exception";
                Logger.w(str2, str3, e);
                return null;
            }
        }
        return null;
    }

    public String a() {
        return this.l;
    }

    public synchronized void a(d dVar) {
        this.f.add(dVar);
        d dVar2 = this.d;
        if (dVar2 != null && (dVar2.o() || this.d.m())) {
            Logger.v(n, "grsResponseResult is ok");
        } else if (dVar.n()) {
            Logger.i(n, "GRS server open 503 limiting strategy.");
            com.huawei.hms.framework.network.grs.h.d.a(this.f7426a.getGrsParasKey(true, true, this.b), new d.a(dVar.k(), SystemClock.elapsedRealtime()));
        } else {
            if (dVar.m()) {
                Logger.i(n, "GRS server open 304 Not Modified.");
            }
            if (!dVar.o() && !dVar.m()) {
                Logger.v(n, "grsResponseResult has exception so need return");
                return;
            }
            this.d = dVar;
            this.c.a(this.f7426a, this.d, this.b, this.j);
            com.huawei.hms.framework.network.grs.f.b.a(this.b, this.f7426a);
            for (Map.Entry<String, Future<d>> entry : this.e.entrySet()) {
                if (!entry.getKey().equals(dVar.l()) && !entry.getValue().isCancelled()) {
                    Logger.i(n, "future cancel");
                    entry.getValue().cancel(true);
                }
            }
        }
    }

    public void a(com.huawei.hms.framework.network.grs.g.k.d dVar) {
        this.k = dVar;
    }

    public com.huawei.hms.framework.network.grs.g.k.d b() {
        return this.k;
    }
}
