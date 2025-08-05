package com.taobao.android.detail.core.performance;

import android.app.Activity;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.emu;
import tb.hyq;
import tb.iyx;
import tb.jqm;
import tb.kge;

/* loaded from: classes4.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static String f9785a;
    private static final Map<Integer, h> b;
    private static final com.taobao.android.detail.core.performance.preload.d i;
    private Activity e;
    private long h;
    private final int c = 0;
    private boolean d = false;
    private Map<String, Long> g = new HashMap();

    static {
        kge.a(-1179920093);
        f9785a = "DetailVideoPreload";
        b = new HashMap();
        i = new com.taobao.android.detail.core.performance.preload.d();
    }

    public h(Activity activity) {
        this.e = activity;
        emu.a("com.taobao.android.detail.core.performance.DetailVideoPreload");
    }

    public static synchronized h a(Activity activity) {
        synchronized (h.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (h) ipChange.ipc$dispatch("9a8c8e27", new Object[]{activity});
            }
            h hVar = b.get(Integer.valueOf(activity.hashCode()));
            if (hVar == null) {
                hVar = new h(activity);
                b.put(Integer.valueOf(activity.hashCode()), hVar);
            }
            return hVar;
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.g.get(hyq.UMB_FEATURE_REQUEST_SUCCESS) == null || this.g == null) {
        } else {
            long uptimeMillis = SystemClock.uptimeMillis();
            this.g.put(iyx.PARAM_VIDEO_AUTO_PLAY, Long.valueOf(uptimeMillis));
            String str = f9785a;
            com.taobao.android.detail.core.utils.i.d(str, "videoAutoPlay：" + uptimeMillis + ", spent:" + (uptimeMillis - this.h));
            this.h = uptimeMillis;
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        try {
            if (this.g.get(hyq.UMB_FEATURE_REQUEST_SUCCESS) != null && this.g.get(iyx.PARAM_VIDEO_AUTO_PLAY) != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                this.g.put("videoOnPlay", Long.valueOf(uptimeMillis));
                String str = f9785a;
                com.taobao.android.detail.core.utils.i.d(str, "videoOnPlay：" + uptimeMillis + ", spent:" + (uptimeMillis - this.h));
                this.h = uptimeMillis;
                com.taobao.android.detail.core.utils.h.a(this.e, uptimeMillis - this.g.get(iyx.PARAM_VIDEO_AUTO_PLAY).longValue(), this.d);
                if (jqm.a()) {
                    String str2 = f9785a;
                    com.taobao.android.detail.core.utils.i.d(str2, "videoAutoPlay->videoOnPlay spent:" + (uptimeMillis - this.g.get(iyx.PARAM_VIDEO_AUTO_PLAY).longValue()));
                    String str3 = f9785a;
                    com.taobao.android.detail.core.utils.i.d(str3, "requestSuccess->videoOnPlay spent:" + (uptimeMillis - this.g.get(hyq.UMB_FEATURE_REQUEST_SUCCESS).longValue()));
                }
                this.g.clear();
            }
        } catch (Exception e) {
            String str4 = f9785a;
            com.taobao.android.detail.core.utils.i.a(str4, "videoOnPlay exception:" + e.getMessage());
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        b.remove(Integer.valueOf(this.e.hashCode()));
        this.e = null;
    }
}
