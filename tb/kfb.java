package tb;

import android.taobao.windvane.thread.d;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.log.TLog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class kfb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile kfb f30020a;
    private volatile boolean b = false;
    private final AtomicBoolean c = new AtomicBoolean(false);
    private final List<kfa> e = Collections.synchronizedList(new ArrayList());
    private final ThreadPoolExecutor d = new ThreadPoolExecutor(1, 1, 30, TimeUnit.SECONDS, new LinkedBlockingDeque(), new d("PageTouchManager"));

    public static /* synthetic */ List a(kfb kfbVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("e84ccb16", new Object[]{kfbVar}) : kfbVar.e;
    }

    static {
        kge.a(1455258574);
        f30020a = null;
    }

    private kfb() {
        this.d.allowCoreThreadTimeOut(true);
    }

    public static kfb a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kfb) ipChange.ipc$dispatch("f06d397", new Object[0]);
        }
        if (f30020a == null) {
            synchronized (kfb.class) {
                if (f30020a == null) {
                    kfb kfbVar = new kfb();
                    f30020a = kfbVar;
                    return kfbVar;
                }
            }
        }
        return f30020a;
    }

    public void a(kfa kfaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0f5eeb2", new Object[]{this, kfaVar});
        } else if (kfaVar == null) {
        } else {
            this.e.add(kfaVar);
        }
    }

    public synchronized void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        if (this.c.compareAndSet(false, true)) {
            this.b = StringUtils.equals("true", OrangeConfig.getInstance().getConfig("group_common_browser", "useTouchMonitor", "false"));
        }
    }

    public void a(final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else if (!this.b) {
            TLog.logd("BrowserPageTouchManager", "useTouchMonitor is false");
        } else {
            this.d.execute(new Runnable() { // from class: tb.kfb.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (kfb.a(kfb.this) != null && !kfb.a(kfb.this).isEmpty()) {
                        for (kfa kfaVar : kfb.a(kfb.this)) {
                            if (kfaVar != null) {
                                try {
                                    kfaVar.a(str, str2);
                                } catch (Throwable unused) {
                                    kfc.b("PageTouchManager", "notifyOnOpenUrl.error.url=" + str2);
                                }
                            }
                        }
                    }
                }
            });
        }
    }

    public void b(final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
        } else if (!this.b) {
            TLog.logd("BrowserPageTouchManager", "useTouchMonitor is false");
        } else {
            this.d.execute(new Runnable() { // from class: tb.kfb.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (kfb.a(kfb.this) != null && !kfb.a(kfb.this).isEmpty()) {
                        for (kfa kfaVar : kfb.a(kfb.this)) {
                            if (kfaVar != null) {
                                try {
                                    kfaVar.b(str, str2);
                                } catch (Throwable unused) {
                                    kfc.b("PageTouchManager", "notifyOnResumeUrl.error.url=" + str2);
                                }
                            }
                        }
                    }
                }
            });
        }
    }

    public void c(final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f277e37e", new Object[]{this, str, str2});
        } else if (!this.b) {
            TLog.logd("BrowserPageTouchManager", "useTouchMonitor is false");
        } else {
            this.d.execute(new Runnable() { // from class: tb.kfb.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (kfb.a(kfb.this) != null && !kfb.a(kfb.this).isEmpty()) {
                        for (kfa kfaVar : kfb.a(kfb.this)) {
                            if (kfaVar != null) {
                                try {
                                    kfaVar.c(str, str2);
                                } catch (Throwable unused) {
                                    kfc.b("PageTouchManager", "notifyOnTouch.error.url=" + str2);
                                }
                            }
                        }
                    }
                }
            });
        }
    }

    public void a(final String str, final String str2, final String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
        } else if (!this.b) {
            TLog.logd("BrowserPageTouchManager", "useTouchMonitor is false");
        } else {
            this.d.execute(new Runnable() { // from class: tb.kfb.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (kfb.a(kfb.this) != null && !kfb.a(kfb.this).isEmpty()) {
                        for (kfa kfaVar : kfb.a(kfb.this)) {
                            if (kfaVar != null) {
                                try {
                                    kfaVar.a(str, str2, str3);
                                } catch (Throwable unused) {
                                    kfc.b("PageTouchManager", String.format("notifyOnRedirectUrl.error.originUrl=%s.url=%s", str2, str3));
                                }
                            }
                        }
                    }
                }
            });
        }
    }

    public void a(final String str, final String str2, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dbad4d8", new Object[]{this, str, str2, new Boolean(z)});
        } else if (!this.b) {
            TLog.logd("BrowserPageTouchManager", "useTouchMonitor is false");
        } else {
            this.d.execute(new Runnable() { // from class: tb.kfb.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (kfb.a(kfb.this) != null && !kfb.a(kfb.this).isEmpty()) {
                        for (kfa kfaVar : kfb.a(kfb.this)) {
                            if (kfaVar != null) {
                                try {
                                    kfaVar.a(str, str2, z);
                                } catch (Throwable unused) {
                                    kfc.b("PageTouchManager", "notifyOnPause.error.url=" + str2);
                                }
                            }
                        }
                    }
                }
            });
        }
    }
}
