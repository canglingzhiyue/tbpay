package com.taobao.mytaobao.basement.monitor;

import android.os.Bundle;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.tao.MytaobaoApplication;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.mtx;
import tb.qpl;

/* loaded from: classes7.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MEASURE_LOAD_WEB = "loadPathMonitor";
    public static final String MODULE_NAME = "Page_Basement";
    public static final String POINT_LOAD_WEB = "TaoFriendPageLoadWebTime";

    /* renamed from: a  reason: collision with root package name */
    private Map<String, Boolean> f18337a;
    private long b;
    private long c;

    /* loaded from: classes7.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static b f18339a;

        static {
            kge.a(-155778293);
            f18339a = new b();
        }

        public static /* synthetic */ b a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("3add612e", new Object[0]) : f18339a;
        }
    }

    static {
        kge.a(1640679992);
    }

    public static b a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("3add612e", new Object[0]) : a.a();
    }

    private b() {
        this.f18337a = new HashMap();
        if (com.taobao.mytaobao.base.c.i()) {
            return;
        }
        AppMonitor.register(MODULE_NAME, "TaoFriendPageLoadTime", MeasureSet.create(new String[]{"fullPathMonitor"}));
        AppMonitor.register(MODULE_NAME, POINT_LOAD_WEB, MeasureSet.create(new String[]{MEASURE_LOAD_WEB}));
    }

    public void a(Bundle bundle) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b668f6c", new Object[]{this, bundle});
        } else if (com.taobao.mytaobao.base.c.i()) {
        } else {
            this.b = (System.currentTimeMillis() - com.taobao.application.common.c.a().a("startProcessSystemTime", MytaobaoApplication.onCreateTimeMillis)) / 1000;
            this.c = System.currentTimeMillis();
            a("TaoFriendPageLoadTime", "fullPathMonitor");
            a("enterMyTaobao", (JSONObject) null, 1.0d, true);
            StringBuilder sb = new StringBuilder();
            sb.append("我淘页面创建, 死亡恢复:");
            if (bundle == null) {
                z = false;
            }
            sb.append(z);
            mtx.b(sb.toString());
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (com.taobao.mytaobao.base.c.i()) {
        } else {
            a("renderSuccess", (JSONObject) null, 1.0d, true);
            a("TaoFriendPageLoadTime", "fullPathMonitor", true);
            a(POINT_LOAD_WEB, MEASURE_LOAD_WEB, true);
            a("coldLaunchTime", "app_mtb_TimeSeconds=" + this.b, System.currentTimeMillis() - this.c, true);
        }
    }

    @Deprecated
    public synchronized void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else if (com.taobao.mytaobao.base.c.i()) {
        } else {
            String str3 = str + str2;
            if (this.f18337a.containsKey(str3)) {
                return;
            }
            this.f18337a.put(str3, Boolean.TRUE);
            qpl.a(MODULE_NAME, str, str2);
        }
    }

    @Deprecated
    public synchronized void a(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dbad4d8", new Object[]{this, str, str2, new Boolean(z)});
        } else if (com.taobao.mytaobao.base.c.i()) {
        } else {
            String str3 = str + str2;
            if (Boolean.TRUE != this.f18337a.get(str3)) {
                return;
            }
            if (z) {
                this.f18337a.put(str3, Boolean.FALSE);
                qpl.b(MODULE_NAME, str, str2);
                return;
            }
            this.f18337a.remove(str3);
            qpl.b(MODULE_NAME, str, str2);
        }
    }

    public void a(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (com.taobao.mytaobao.base.c.i()) {
        } else {
            Coordinator.execute(new Runnable() { // from class: com.taobao.mytaobao.basement.monitor.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("method", (Object) str);
                    b.this.a("deprecatedCode", jSONObject, 1.0d, false);
                }
            });
        }
    }

    public void a(String str, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81239a4c", new Object[]{this, str, new Double(d)});
        } else if (com.taobao.mytaobao.base.c.i()) {
        } else {
            a(str, (JSONObject) null, d, false);
        }
    }

    public void a(String str, JSONObject jSONObject, double d, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afc6cfd4", new Object[]{this, str, jSONObject, new Double(d), new Boolean(z)});
        } else if (com.taobao.mytaobao.base.c.i()) {
        } else {
            a(str, (jSONObject == null || jSONObject.isEmpty()) ? null : jSONObject.toJSONString(), d, z);
        }
    }

    @Deprecated
    public void a(String str, String str2, double d, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("699678d2", new Object[]{this, str, str2, new Double(d), new Boolean(z)});
        } else if (com.taobao.mytaobao.base.c.i()) {
        } else {
            if (!z) {
                qpl.a(MODULE_NAME, str, str2, d);
                return;
            }
            synchronized (this) {
                if (this.f18337a.containsKey(str)) {
                    return;
                }
                this.f18337a.put(str, true);
                qpl.a(MODULE_NAME, str, str2, d);
            }
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (com.taobao.mytaobao.base.c.i()) {
        } else {
            qpl.c(MODULE_NAME, str, null);
        }
    }

    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
        } else if (com.taobao.mytaobao.base.c.i()) {
        } else {
            qpl.a(MODULE_NAME, str, null, str2, str3);
        }
    }
}
