package android.taobao.windvane.ha;

import android.os.Handler;
import android.os.HandlerThread;
import android.support.v4.util.LruCache;
import android.taobao.windvane.c;
import android.taobao.windvane.config.j;
import android.taobao.windvane.extra.WVPerformanceListenerManager;
import android.taobao.windvane.extra.uc.preRender.BasePreInitManager;
import android.taobao.windvane.monitor.o;
import android.taobao.windvane.util.m;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import com.taobao.android.riverlogger.e;
import com.uc.webview.export.WebView;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import tb.adk;
import tb.adl;
import tb.jbg;
import tb.kge;

/* loaded from: classes2.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String TAG;

    /* renamed from: a  reason: collision with root package name */
    private static a f1614a;
    private static long h;
    private static Runnable l;
    private Handler b;
    private WeakReference<WebView> c;
    private StringBuffer d = new StringBuffer();
    private LruCache<String, String> e = new LruCache<>(10);
    private String f = "";
    private String g = "";
    private String i = "";
    private int j = -1;
    private int k = 1000;

    public static /* synthetic */ void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6af381e8", new Object[]{aVar});
        } else {
            aVar.c();
        }
    }

    static {
        kge.a(981603098);
        TAG = a.class.getSimpleName();
        h = 0L;
        l = new Runnable() { // from class: android.taobao.windvane.ha.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    a.a(a.a());
                }
            }
        };
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("fa260bee", new Object[0]);
        }
        if (f1614a == null) {
            synchronized (a.class) {
                if (f1614a == null) {
                    f1614a = new a();
                }
            }
        }
        return f1614a;
    }

    private a() {
        this.b = null;
        HandlerThread a2 = jbg.a("UC_HA");
        a2.start();
        this.b = new Handler(a2.getLooper());
    }

    public void a(String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed88149b", new Object[]{this, str, new Integer(i), str2});
        } else if (a(i, str2)) {
        } else {
            this.b.removeCallbacks(l);
            if (!TextUtils.equals(this.f, str2)) {
                if (!TextUtils.isEmpty(this.f)) {
                    c();
                }
                this.f = str2;
            }
            this.j = i;
            this.b.postDelayed(l, this.k);
            StringBuffer stringBuffer = this.d;
            stringBuffer.append(str);
            stringBuffer.append("\n");
        }
    }

    private boolean a(int i, String str) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("20f12ca9", new Object[]{this, new Integer(i), str})).booleanValue();
        }
        if (i == 0) {
            try {
                if (j.commonConfig.aq) {
                    String str2 = str != null ? this.e.get(str) : this.g;
                    if (!TextUtils.isEmpty(str2) && str2.contains(BasePreInitManager.PRE_RENDER_URL_ADDITION_JUDGE)) {
                        try {
                            m.e(TAG, "IPreRenderWebView skip upload white page");
                            return true;
                        } catch (Throwable th) {
                            th = th;
                            th.printStackTrace();
                            return z;
                        }
                    }
                    String str3 = TAG;
                    m.e(str3, "upload white page :" + str2);
                }
            } catch (Throwable th2) {
                th = th2;
                z = false;
            }
        }
        return false;
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        c();
        this.g = str;
        h = System.currentTimeMillis();
        this.i = str2;
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.b.removeCallbacks(l);
        }
    }

    public void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
        } else {
            this.e.put(str, str2);
        }
    }

    private void c() {
        String str;
        adk b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (TextUtils.isEmpty(this.d) || c.a().b().g()) {
        } else {
            HashMap hashMap = new HashMap();
            String str2 = this.f;
            String remove = str2 != null ? this.e.remove(str2) : this.g;
            hashMap.put("url", remove);
            hashMap.put("error", this.d.toString());
            if (this.j == 0 && !TextUtils.isEmpty(remove) && (b = adl.a().b(remove)) != null) {
                String str3 = TAG;
                m.a(str3, "found grey page: " + remove);
                hashMap.put(adk.KEY_AIR_TAG, b.b());
            }
            if (this.j == 0) {
                j.a();
                if (j.commonConfig.bk) {
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("url", remove);
                    hashMap2.put("time", String.valueOf(System.currentTimeMillis()));
                    WVPerformanceListenerManager.getInstance().onWhitePageOccur(hashMap2);
                    if (j.commonConfig.bL) {
                        e.a(RVLLevel.Warn, "WindVane/Page").a("pageEmpty").a("url", (Object) remove).a();
                    }
                }
            }
            int i = this.j;
            if (i != 0) {
                str = i != 1 ? i != 2 ? i != 3 ? "" : "WindVane.Memory" : "WindVane.BlackScreen" : "WindVane.UCHAR";
            } else {
                if (o.getWVWhitePageMonitorInterface() != null) {
                    o.getWVWhitePageMonitorInterface().onOccurWhitePage(remove, null);
                }
                str = "TEMP_H5_ERROR_EVENT";
            }
            if (!TextUtils.isEmpty(str)) {
                b.a(str, remove, String.valueOf(h), this.i, hashMap);
            }
            StringBuffer stringBuffer = this.d;
            stringBuffer.delete(0, stringBuffer.length());
            b();
        }
    }

    public void a(WebView webView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf929432", new Object[]{this, webView});
        } else {
            this.c = new WeakReference<>(webView);
        }
    }
}
