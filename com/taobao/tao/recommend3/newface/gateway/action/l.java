package com.taobao.tao.recommend3.newface.gateway.action;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.utils.n;
import com.taobao.search.common.util.i;
import com.taobao.tao.navigation.model.NavigationTabConstraints;
import com.uc.webview.export.media.MessageID;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kge;
import tb.ljd;
import tb.onq;
import tb.oqk;

/* loaded from: classes8.dex */
public class l extends oqk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentLinkedQueue<a> f20947a = new ConcurrentLinkedQueue<>();
    private final AtomicBoolean b = new AtomicBoolean(false);

    static {
        kge.a(179335863);
    }

    public static /* synthetic */ Object ipc$super(l lVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.oqk
    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else {
            com.taobao.android.home.component.utils.e.e("NewFaceUIRefreshInterceptor", i.b.MEASURE_ONCREATE);
        }
    }

    @Override // tb.oqk
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else {
            com.taobao.android.home.component.utils.e.e("NewFaceUIRefreshInterceptor", "onStart");
        }
    }

    @Override // tb.oqk
    public void bP_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdf69df8", new Object[]{this});
            return;
        }
        com.taobao.android.home.component.utils.e.e("NewFaceUIRefreshInterceptor", "onCreateView");
        this.b.set(true);
    }

    @Override // tb.oqk
    public void dw_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a5014b3", new Object[]{this});
            return;
        }
        com.taobao.android.home.component.utils.e.e("NewFaceUIRefreshInterceptor", "onResume");
        this.b.set(true);
        f();
        onq.b(false);
    }

    @Override // tb.oqk
    public void dS_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ce19e57", new Object[]{this});
        } else {
            com.taobao.android.home.component.utils.e.e("NewFaceUIRefreshInterceptor", "onPause");
        }
    }

    @Override // tb.oqk
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else {
            com.taobao.android.home.component.utils.e.e("NewFaceUIRefreshInterceptor", MessageID.onStop);
        }
    }

    @Override // tb.oqk
    public void du_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76e66375", new Object[]{this});
        } else {
            com.taobao.android.home.component.utils.e.e("NewFaceUIRefreshInterceptor", "renderFirstFrame");
        }
    }

    @Override // tb.oqk
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            com.taobao.android.home.component.utils.e.e("NewFaceUIRefreshInterceptor", "onLoginSuccess");
        }
    }

    @Override // tb.oqk
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            com.taobao.android.home.component.utils.e.e("NewFaceUIRefreshInterceptor", "editionChanged");
        }
    }

    @Override // tb.oqk
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        com.taobao.android.home.component.utils.e.e("NewFaceUIRefreshInterceptor", "onPageSelected: " + i);
    }

    @Override // tb.oqk
    public void dO_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("360e3bdb", new Object[]{this});
            return;
        }
        com.taobao.android.home.component.utils.e.e("NewFaceUIRefreshInterceptor", MessageID.onDestroy);
        this.b.set(false);
        i();
    }

    @Override // tb.oqk
    public void k_(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3e9d0e5", new Object[]{this, str});
            return;
        }
        com.taobao.android.home.component.utils.e.e("NewFaceUIRefreshInterceptor", "onPageNav");
        this.b.set(false);
        onq.b(true);
    }

    @Override // tb.oqk
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        com.taobao.android.home.component.utils.e.e("NewFaceUIRefreshInterceptor", "onPageNavFinished success: " + z);
        this.b.set(z ^ true);
        onq.b(z);
        if (z) {
            return;
        }
        f();
    }

    @Override // tb.oqk
    public void a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str});
            return;
        }
        com.taobao.android.home.component.utils.e.e("NewFaceUIRefreshInterceptor", "onNavigationTabChanged index: " + i + " , name: " + str);
        if (TextUtils.equals(str, NavigationTabConstraints.TAB_BIZ_HOMEPAGE)) {
            return;
        }
        this.b.set(false);
        onq.b(true);
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        com.taobao.android.home.component.utils.e.e("NewFaceUIRefreshInterceptor", "runTasks, size: " + this.f20947a.size());
        while (!this.f20947a.isEmpty()) {
            a poll = this.f20947a.poll();
            if (poll != null) {
                com.taobao.android.home.component.utils.e.e("NewFaceUIRefreshInterceptor", "runTasks, task: " + a.a(poll) + " , isMainThread: " + a.b(poll));
                if (a.b(poll)) {
                    ljd.a().b(poll);
                } else {
                    ljd.a().a(poll);
                }
            }
        }
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else {
            this.f20947a.clear();
        }
    }

    public void a(Runnable runnable, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6098f30", new Object[]{this, runnable, str});
        } else if (!k()) {
            runnable.run();
        } else {
            com.taobao.android.home.component.utils.e.e("NewFaceUIRefreshInterceptor", "runOnPageVisiable: " + this.b.get() + " , tag: " + str);
            if (this.b.get()) {
                runnable.run();
            } else {
                this.f20947a.offer(new a(runnable, j(), str));
            }
        }
    }

    private boolean j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue() : Thread.currentThread() == Looper.getMainLooper().getThread();
    }

    private boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue() : n.n().d();
    }

    /* loaded from: classes8.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final Runnable f20948a;
        private final boolean b;
        private final String c;

        static {
            kge.a(-433021070);
            kge.a(-1390502639);
        }

        public static /* synthetic */ String a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b2c9be8e", new Object[]{aVar}) : aVar.c;
        }

        public static /* synthetic */ boolean b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2a8cf117", new Object[]{aVar})).booleanValue() : aVar.b;
        }

        public a(Runnable runnable, boolean z, String str) {
            this.b = z;
            this.f20948a = runnable;
            this.c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f20948a.run();
            }
        }
    }
}
