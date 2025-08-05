package com.meizu.cloud.pushsdk.d;

import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.util.Log;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class b implements f {
    private String g;
    private ThreadPoolExecutor j;
    private long d = 60;
    private int e = 10;
    private boolean i = false;

    /* renamed from: a  reason: collision with root package name */
    private final SimpleDateFormat f7871a = new SimpleDateFormat("MM-dd HH:mm:ss");
    private final List<c> b = Collections.synchronizedList(new ArrayList());
    private final Handler c = new Handler(Looper.getMainLooper());
    private final e f = new e();
    private final String h = String.valueOf(Process.myPid());

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.b(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.meizu.cloud.pushsdk.d.b$b  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public class RunnableC0274b implements Runnable {
        RunnableC0274b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayList<c> arrayList;
            synchronized (b.this.b) {
                b.this.c.removeCallbacksAndMessages(null);
                arrayList = new ArrayList(b.this.b);
                b.this.b.clear();
            }
            try {
                if (b.this.g != null) {
                    b.this.f.a(b.this.g);
                    for (c cVar : arrayList) {
                        b.this.f.a(cVar.f7874a, cVar.b, cVar.c);
                    }
                }
            } catch (Exception unused) {
            } catch (Throwable th) {
                try {
                    b.this.f.a();
                } catch (Exception unused2) {
                }
                throw th;
            }
            try {
                b.this.f.a();
            } catch (Exception unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c {

        /* renamed from: a  reason: collision with root package name */
        final String f7874a;
        final String b;
        final String c;

        public c(String str, String str2, String str3) {
            this.f7874a = b.this.f7871a.format(new Date()) + " " + b.this.h + "-" + Thread.currentThread().getId() + " " + str + "/";
            this.b = str2;
            this.c = str3;
        }
    }

    public b() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new j().a("log-pool-%d").a());
        this.j = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    private void a(c cVar) {
        try {
            this.b.add(cVar);
        } catch (Exception e) {
            Log.e("Logger", "add logInfo error " + e.getMessage());
        }
    }

    private void b() {
        if (this.b.size() == this.e) {
            b(true);
        }
    }

    private void c() {
        if (this.b.size() == 0) {
            this.c.postDelayed(new a(), this.d * 1000);
        }
    }

    @Override // com.meizu.cloud.pushsdk.d.f
    public void a(String str) {
        this.g = str;
    }

    @Override // com.meizu.cloud.pushsdk.d.f
    public void a(String str, String str2) {
        if (this.i) {
            Log.e(str, str2);
        }
        synchronized (this.b) {
            c();
            a(new c("E", str, str2));
            b();
        }
    }

    @Override // com.meizu.cloud.pushsdk.d.f
    public void a(String str, String str2, Throwable th) {
        if (this.i) {
            Log.e(str, str2, th);
        }
        synchronized (this.b) {
            c();
            a(new c("E", str, str2 + "\n" + Log.getStackTraceString(th)));
            b();
        }
    }

    @Override // com.meizu.cloud.pushsdk.d.f
    public void a(boolean z) {
        this.i = z;
    }

    @Override // com.meizu.cloud.pushsdk.d.f
    public boolean a() {
        return this.i;
    }

    @Override // com.meizu.cloud.pushsdk.d.f
    public void b(String str, String str2) {
        synchronized (this.b) {
            c();
            a(new c(TLogTracker.LEVEL_DEBUG, str, str2));
            b();
        }
    }

    @Override // com.meizu.cloud.pushsdk.d.f
    public void b(boolean z) {
        ThreadPoolExecutor threadPoolExecutor;
        RunnableC0274b runnableC0274b = new RunnableC0274b();
        if (!z || (threadPoolExecutor = this.j) == null) {
            runnableC0274b.run();
        } else {
            threadPoolExecutor.execute(runnableC0274b);
        }
    }

    @Override // com.meizu.cloud.pushsdk.d.f
    public void c(String str, String str2) {
        synchronized (this.b) {
            c();
            a(new c(TLogTracker.LEVEL_INFO, str, str2));
            b();
        }
    }

    @Override // com.meizu.cloud.pushsdk.d.f
    public void d(String str, String str2) {
        synchronized (this.b) {
            c();
            a(new c("W", str, str2));
            b();
        }
    }
}
