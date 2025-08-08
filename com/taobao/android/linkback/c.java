package com.taobao.android.linkback;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.taobao.windvane.extra.performance2.WVPageTracker;
import mtopsdk.common.util.StringUtils;
import android.webkit.URLUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.android.nav.Nav;
import com.taobao.application.common.a;
import com.taobao.flowcustoms.afc.utils.b;
import com.taobao.message.uikit.util.ActivityJumpUtil;
import com.taobao.tao.log.TLog;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes5.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Uri f13297a;
    private final Context b;
    private final g c;
    private final AtomicBoolean d;
    private a.InterfaceC0630a e;
    private WVPageTracker.PageStatusCallback f;

    public static /* synthetic */ void a(c cVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af28f65b", new Object[]{cVar, str});
        } else {
            cVar.a(str);
        }
    }

    public c(Uri uri, Context context) {
        this(uri, context, new h());
    }

    public c(Uri uri, Context context, g gVar) {
        this.d = new AtomicBoolean(false);
        this.e = new a.InterfaceC0630a() { // from class: com.taobao.android.linkback.c.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(Activity activity, Bundle bundle) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(Activity activity) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(Activity activity) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStarted(Activity activity) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(Activity activity) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityResumed(Activity activity) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
                } else {
                    c.a(c.this, activity.getIntent().getDataString());
                }
            }
        };
        this.f = new WVPageTracker.PageStatusCallback() { // from class: com.taobao.android.linkback.c.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.taobao.windvane.extra.performance2.WVPageTracker.PageStatusCallback
            public void onRedirect(String str, String str2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("b5c125f6", new Object[]{this, str, str2});
                }
            }

            @Override // android.taobao.windvane.extra.performance2.WVPageTracker.PageStatusCallback
            public void onPageFinish(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("2f0cb712", new Object[]{this, str});
                } else {
                    c.a(c.this, str);
                }
            }
        };
        this.f13297a = uri;
        this.b = context;
        this.c = gVar;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        if (!d()) {
            if (!this.f13297a.isHierarchical() || !URLUtil.isValidUrl(this.f13297a.toString())) {
                TLog.loge("LinkBack", (String) null, "mUrl is not hierarchical or not valid url: " + this.f13297a.toString());
                b.a(1013, "afc_original_url_exception", this.f13297a.toString(), null, null);
                return false;
            }
        } else if (!this.f13297a.isHierarchical()) {
            TLog.loge("LinkBack", (String) null, "mUrl is not hierarchical: " + this.f13297a.toString());
            b.a(1013, "afc_original_url_exception", this.f13297a.toString(), null, null);
            return false;
        }
        if (!this.c.a(this.b.getClass().getName())) {
            Uri c = c();
            String queryParameter = this.f13297a.getQueryParameter("launchType");
            if (c != null) {
                if (e()) {
                    f();
                }
                boolean uri = Nav.from(this.b).toUri(c);
                HashMap hashMap = new HashMap();
                hashMap.put(com.taobao.mtop.wvplugin.a.RESULT_KEY, String.valueOf(uri));
                b.a(1013, "afc_need_home", c.toString(), queryParameter, hashMap);
                d.a().c();
                a(c.toString(), this.f13297a.toString());
                if (uri) {
                    TLog.loge("LinkBack", (String) null, "jump success to uri: " + c);
                    return true;
                }
            }
            if (b()) {
                boolean uri2 = Nav.from(this.b).toUri("http://m.taobao.com/index.htm");
                HashMap hashMap2 = new HashMap();
                hashMap2.put(com.taobao.mtop.wvplugin.a.RESULT_KEY, String.valueOf(uri2));
                b.a(1013, "afc_need_home", "http://m.taobao.com/index.htm", queryParameter, hashMap2);
                return uri2;
            }
            TLog.loge("LinkBack", (String) null, "jump failed to uri: " + c);
        }
        return false;
    }

    private void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("afcBackUrl", str);
        hashMap.put(ActivityJumpUtil.LANDING_URL, str2);
        j.a(this.b, j.REPORT_API, hashMap, new Handler(i.b.f13304a.getLooper()), 5000);
    }

    private boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        try {
            if (this.f13297a != null && "0".equals(this.f13297a.getQueryParameter("isNeedHomeNew"))) {
                if (com.taobao.application.common.c.a().a("aliveActivityCount", -1) == 1) {
                    return true;
                }
            }
        } catch (Exception e) {
            TLog.loge("LinkBack", "Back to Home failed for some reason : ", e);
        }
        return false;
    }

    private Uri c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("eb8a50a1", new Object[]{this});
        }
        if (!StringUtils.isEmpty(this.f13297a.toString()) && !this.f13297a.toString().contains("_afc_link=1")) {
            return null;
        }
        String b = d.a().b();
        if (StringUtils.isEmpty(b)) {
            return null;
        }
        Uri.Builder buildUpon = Uri.parse(b).buildUpon();
        Uri build = buildUpon != null ? buildUpon.appendQueryParameter("isNeedHomeNew", "0").build() : null;
        if (build == null || (build.isHierarchical() && URLUtil.isValidUrl(build.toString()))) {
            return build;
        }
        TLog.loge("LinkBack", (String) null, "targetUrl is not hierarchical or not valid url: " + build.toString());
        b.a(1013, "afc_back_url_exception", build.toString(), this.f13297a.toString(), null);
        return null;
    }

    private boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        try {
            boolean isFeatureOpened = ABGlobal.isFeatureOpened(this.b, "link_back_opt_off");
            StringBuilder sb = new StringBuilder();
            sb.append("isOptimizeOpened: ");
            sb.append(!isFeatureOpened);
            TLog.loge("LinkBack", (String) null, sb.toString());
            return !isFeatureOpened;
        } catch (Throwable th) {
            TLog.loge("LinkBack", (String) null, "isOptimizeOpened error: " + th.toString());
            return false;
        }
    }

    private boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        try {
            boolean isFeatureOpened = ABGlobal.isFeatureOpened(this.b, "link_back_arrive_tracker_off");
            StringBuilder sb = new StringBuilder();
            sb.append("isArriveTrackerEnable: ");
            sb.append(!isFeatureOpened);
            TLog.loge("LinkBack", (String) null, sb.toString());
            return !isFeatureOpened;
        } catch (Throwable th) {
            TLog.loge("LinkBack", (String) null, "isArriveTrackerEnable error: " + th.toString());
            return false;
        }
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (!this.d.compareAndSet(false, true)) {
        } else {
            WVPageTracker.registerH5LifeCallback(this.f);
            com.taobao.application.common.c.a(this.e, true);
        }
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        WVPageTracker.removeH5LifeCallback(this.f);
        com.taobao.application.common.c.a(this.e);
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str) || !str.contains("isNeedHomeNew") || !this.d.compareAndSet(true, false)) {
        } else {
            TLog.loge("LinkBack", (String) null, "handleBackArrive, url: " + str);
            b.a(1013, "afc_back_url_arrive", str, this.f13297a.toString(), null);
            g();
        }
    }
}
