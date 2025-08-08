package tb;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.Window;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pha.core.controller.AppController;
import com.taobao.pha.core.controller.DowngradeType;
import com.taobao.pha.core.controller.FeatureStatistics;
import com.taobao.pha.core.e;
import com.taobao.pha.core.error.PHAErrorType;
import com.taobao.pha.core.jsbridge.a;
import com.taobao.pha.core.jsbridge.c;
import com.taobao.pha.core.model.ManifestModel;
import com.taobao.pha.core.model.PageModel;
import com.taobao.pha.core.phacontainer.ViewPagerFragment;
import com.taobao.pha.core.tabcontainer.TabBar;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public class nfb implements com.taobao.pha.core.jsbridge.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f31413a;
    private static final Set<String> b;

    /* loaded from: classes7.dex */
    public static class e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1534002124);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x005d, code lost:
            if (r10.equals("showMenu") != false) goto L15;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static void a(com.taobao.pha.core.controller.AppController r9, java.lang.String r10, com.alibaba.fastjson.JSONObject r11, com.taobao.pha.core.jsbridge.a.InterfaceC0751a r12) {
            /*
                Method dump skipped, instructions count: 250
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.nfb.e.a(com.taobao.pha.core.controller.AppController, java.lang.String, com.alibaba.fastjson.JSONObject, com.taobao.pha.core.jsbridge.a$a):void");
        }
    }

    @Override // com.taobao.pha.core.jsbridge.a
    public void a(AppController appController, c.a aVar, String str, String str2, JSONArray jSONArray, a.InterfaceC0751a interfaceC0751a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45db4d5e", new Object[]{this, appController, aVar, str, str2, jSONArray, interfaceC0751a});
        }
    }

    public static /* synthetic */ String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : f31413a;
    }

    public static /* synthetic */ String a(JSONObject jSONObject, c.a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("660b31e3", new Object[]{jSONObject, aVar}) : b(jSONObject, aVar);
    }

    public static /* synthetic */ void a(nfb nfbVar, AppController appController, c.a aVar, String str, String str2, JSONObject jSONObject, a.InterfaceC0751a interfaceC0751a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b695082", new Object[]{nfbVar, appController, aVar, str, str2, jSONObject, interfaceC0751a});
        } else {
            nfbVar.b(appController, aVar, str, str2, jSONObject, interfaceC0751a);
        }
    }

    static {
        kge.a(-226598415);
        kge.a(1288324252);
        f31413a = nfb.class.getSimpleName();
        HashSet hashSet = new HashSet();
        b = hashSet;
        hashSet.addAll(Arrays.asList("message.post", "manifest.get", "manifest.clearCache", "performance.report", "dataPrefetch.getData", "share.setShareAppMessage", "userTrack.click", "userTrack.pageEnter", "userTrack.expose", "userTrack.updateNextProp", "userTrack.updatePageUtParam", "userTrack.updatePageUtparam", "userTrack.other", "userTrack.custom", "userTrack.pageAppear", "userTrack.pageDisappear", "userTrack.skipPage", "userTrack.updateNextPageUtParam", "userTrack.updateNextPageUtparam", "storage.setItem", "storage.getItem", "storage.removeItem", "storage.clear", "popup.open", "popup.close"));
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue() : !b.contains(str);
    }

    private static void a(AppController appController, JSONObject jSONObject, c.a aVar, a.InterfaceC0751a interfaceC0751a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3c3a466", new Object[]{appController, jSONObject, aVar, interfaceC0751a});
        } else if (appController.P().b()) {
            interfaceC0751a.a(PHAErrorType.CLIENT_ERROR, "Report performance duplicated");
        } else {
            try {
                if (aVar instanceof nfz) {
                    if (!"main".equals(((nfz) aVar).f())) {
                        return;
                    }
                    long longValue = jSONObject.getLongValue("navigationStartTimestamp");
                    long longValue2 = jSONObject.getLongValue("fspTimestamp");
                    long a2 = appController.P().a(longValue, longValue2);
                    appController.a(new e.a(nfc.PHA_MONITOR_MEASURE_FSP, longValue2));
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("startTimestamp", (Object) Long.valueOf(a2));
                    jSONObject2.putAll(appController.P().c());
                    jSONObject2.put("currentClockDelta", (Object) Long.valueOf(System.currentTimeMillis() - SystemClock.uptimeMillis()));
                    interfaceC0751a.a(jSONObject2);
                    return;
                }
                interfaceC0751a.a(PHAErrorType.TYPE_ERROR, "WebView error!");
            } catch (JSONException e2) {
                PHAErrorType pHAErrorType = PHAErrorType.TYPE_ERROR;
                interfaceC0751a.a(pHAErrorType, "JSON parse error. " + e2.toString());
            }
        }
    }

    private static String b(JSONObject jSONObject, c.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4f12f6e4", new Object[]{jSONObject, aVar});
        }
        String string = jSONObject.getString("page_key");
        if (!StringUtils.isEmpty(string)) {
            return string;
        }
        if (aVar instanceof nfz) {
            return ((nfz) aVar).d();
        }
        return aVar instanceof neh ? "AppWorker" : string;
    }

    @Override // com.taobao.pha.core.jsbridge.a
    public void a(final AppController appController, final c.a aVar, final String str, final String str2, final JSONObject jSONObject, final a.InterfaceC0751a interfaceC0751a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2780fc8", new Object[]{this, appController, aVar, str, str2, jSONObject, interfaceC0751a});
            return;
        }
        if (a(str + "." + str2) && Looper.getMainLooper() != Looper.myLooper()) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: tb.nfb.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        nfb.a(nfb.this, appController, aVar, str, str2, jSONObject, interfaceC0751a);
                    }
                }
            });
        } else {
            b(appController, aVar, str, str2, jSONObject, interfaceC0751a);
        }
    }

    private static boolean a(AppController appController, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d0fc4a22", new Object[]{appController, new Boolean(z)})).booleanValue();
        }
        nfr d2 = appController.d();
        if (d2 == null && (appController.C() instanceof Activity)) {
            d2 = new nfr((Activity) appController.C());
            appController.a(d2);
        }
        if (d2 != null) {
            return d2.a(z);
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0095, code lost:
        if (r6.equals("swiper.addItems") != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void b(com.taobao.pha.core.controller.AppController r19, com.taobao.pha.core.jsbridge.c.a r20, java.lang.String r21, java.lang.String r22, com.alibaba.fastjson.JSONObject r23, com.taobao.pha.core.jsbridge.a.InterfaceC0751a r24) {
        /*
            Method dump skipped, instructions count: 1502
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.nfb.b(com.taobao.pha.core.controller.AppController, com.taobao.pha.core.jsbridge.c$a, java.lang.String, java.lang.String, com.alibaba.fastjson.JSONObject, com.taobao.pha.core.jsbridge.a$a):void");
    }

    /* loaded from: classes7.dex */
    public static class h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-415670247);
        }

        /* JADX WARN: Removed duplicated region for block: B:39:0x009f  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00b2  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00b8  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static void a(com.taobao.pha.core.controller.AppController r13, com.alibaba.fastjson.JSONObject r14, com.taobao.pha.core.jsbridge.a.InterfaceC0751a r15) {
            /*
                Method dump skipped, instructions count: 301
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.nfb.h.a(com.taobao.pha.core.controller.AppController, com.alibaba.fastjson.JSONObject, com.taobao.pha.core.jsbridge.a$a):void");
        }

        public static void b(AppController appController, JSONObject jSONObject, a.InterfaceC0751a interfaceC0751a) {
            Window window;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cbf53ff0", new Object[]{appController, jSONObject, interfaceC0751a});
                return;
            }
            ngl l = appController.l();
            if (l == null || !l.isShowing()) {
                interfaceC0751a.a(PHAErrorType.UI_ERROR, "Popup doesn't show");
                return;
            }
            if ("none".equals(jSONObject.getString("animation")) && (window = l.getWindow()) != null) {
                window.setWindowAnimations(-1);
            }
            l.dismiss();
            interfaceC0751a.a(null);
        }
    }

    /* loaded from: classes7.dex */
    public static class j {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-413122740);
        }

        public static /* synthetic */ void a(AppController appController, JSONObject jSONObject, a.InterfaceC0751a interfaceC0751a) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("82de3951", new Object[]{appController, jSONObject, interfaceC0751a});
            } else {
                b(appController, jSONObject, interfaceC0751a);
            }
        }

        private static void b(AppController appController, JSONObject jSONObject, a.InterfaceC0751a interfaceC0751a) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cbf53ff0", new Object[]{appController, jSONObject, interfaceC0751a});
                return;
            }
            appController.a(jSONObject);
            interfaceC0751a.a(null);
        }
    }

    /* loaded from: classes7.dex */
    public static class l {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1771681874);
        }

        public static /* synthetic */ void a(AppController appController, JSONObject jSONObject, a.InterfaceC0751a interfaceC0751a) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("82de3951", new Object[]{appController, jSONObject, interfaceC0751a});
            } else {
                b(appController, jSONObject, interfaceC0751a);
            }
        }

        private static void b(AppController appController, JSONObject jSONObject, a.InterfaceC0751a interfaceC0751a) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cbf53ff0", new Object[]{appController, jSONObject, interfaceC0751a});
                return;
            }
            String string = jSONObject.getString("scheme");
            if (appController.D().isFragment()) {
                return;
            }
            String a2 = a(appController.C(), string);
            if (a2 == null) {
                interfaceC0751a.a(null);
                return;
            }
            PHAErrorType pHAErrorType = PHAErrorType.CLIENT_ERROR;
            interfaceC0751a.a(pHAErrorType, "SetStyle failed, reason: " + a2);
        }

        private static String a(Context context, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("cfe597b6", new Object[]{context, str});
            }
            if (Build.VERSION.SDK_INT < 23) {
                return "<= Android 6.0 not supported";
            }
            if (!(context instanceof Activity)) {
                return "can not get activity";
            }
            Window window = ((Activity) context).getWindow();
            if (window == null) {
                return "cannot get window";
            }
            View decorView = window.getDecorView();
            if (decorView == null) {
                return "can not get decroView";
            }
            if (StringUtils.equals("dark", str)) {
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
                return null;
            } else if (!StringUtils.equals("light", str)) {
                return "scheme invalid";
            } else {
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-8193));
                return null;
            }
        }
    }

    /* loaded from: classes7.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1383765086);
        }

        public static /* synthetic */ void a(AppController appController, JSONObject jSONObject, a.InterfaceC0751a interfaceC0751a) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("82de3951", new Object[]{appController, jSONObject, interfaceC0751a});
            } else {
                e(appController, jSONObject, interfaceC0751a);
            }
        }

        public static /* synthetic */ void b(AppController appController, JSONObject jSONObject, a.InterfaceC0751a interfaceC0751a) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cbf53ff0", new Object[]{appController, jSONObject, interfaceC0751a});
            } else {
                f(appController, jSONObject, interfaceC0751a);
            }
        }

        public static /* synthetic */ void c(AppController appController, JSONObject jSONObject, a.InterfaceC0751a interfaceC0751a) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("150c468f", new Object[]{appController, jSONObject, interfaceC0751a});
            } else {
                d(appController, jSONObject, interfaceC0751a);
            }
        }

        private static void d(AppController appController, JSONObject jSONObject, a.InterfaceC0751a interfaceC0751a) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e234d2e", new Object[]{appController, jSONObject, interfaceC0751a});
            } else if (appController.u() == null) {
                interfaceC0751a.a(PHAErrorType.REFERENCE_ERROR, "Manifest is null");
            } else {
                JSONObject jSONObject2 = new JSONObject();
                if (jSONObject != null) {
                    for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                        if (entry != null && (entry.getValue() instanceof String)) {
                            jSONObject2.put(entry.getKey(), entry.getValue());
                        }
                    }
                }
                if (com.taobao.pha.core.manifest.d.a(appController.t().toString(), jSONObject2.toJSONString(), appController.u().cacheQueryParams)) {
                    interfaceC0751a.a(null);
                } else {
                    interfaceC0751a.a(PHAErrorType.CLIENT_ERROR, "Failed to put headers");
                }
            }
        }

        private static void e(AppController appController, JSONObject jSONObject, a.InterfaceC0751a interfaceC0751a) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a73a53cd", new Object[]{appController, jSONObject, interfaceC0751a});
                return;
            }
            ManifestModel u = appController.u();
            if (u != null) {
                try {
                    interfaceC0751a.a(JSONObject.parseObject(JSON.toJSONString(u)));
                    return;
                } catch (Exception e) {
                    e.printStackTrace();
                    interfaceC0751a.a(PHAErrorType.TYPE_ERROR, "Parsing JSON object failed.");
                    return;
                }
            }
            interfaceC0751a.a(PHAErrorType.REFERENCE_ERROR, "Container model is null.");
        }

        private static void f(AppController appController, JSONObject jSONObject, a.InterfaceC0751a interfaceC0751a) {
            Uri parse;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f0515a6c", new Object[]{appController, jSONObject, interfaceC0751a});
                return;
            }
            String string = jSONObject.getString("url");
            if (StringUtils.isEmpty(string)) {
                parse = Uri.parse(appController.t().toString());
                String a2 = nfb.a();
                ngr.d(a2, "clearCache with default manifestUrl: " + parse.toString());
            } else {
                parse = Uri.parse(string);
            }
            if (parse == null) {
                interfaceC0751a.a(PHAErrorType.URI_ERROR, "Manifest url is null.");
                return;
            }
            com.taobao.pha.core.manifest.c a3 = com.taobao.pha.core.manifest.c.a();
            if (a3 != null) {
                a3.f(parse);
                interfaceC0751a.a(null);
                return;
            }
            interfaceC0751a.a(PHAErrorType.REFERENCE_ERROR, "Manifest manager is null.");
        }
    }

    /* loaded from: classes7.dex */
    public static class i {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1709523325);
        }

        public static /* synthetic */ void a(AppController appController, String str, JSONObject jSONObject, a.InterfaceC0751a interfaceC0751a) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("26fb4c7", new Object[]{appController, str, jSONObject, interfaceC0751a});
            } else {
                b(appController, str, jSONObject, interfaceC0751a);
            }
        }

        private static void b(AppController appController, String str, JSONObject jSONObject, a.InterfaceC0751a interfaceC0751a) {
            Integer num;
            IpChange ipChange = $ipChange;
            boolean z = false;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ee3f1a6", new Object[]{appController, str, jSONObject, interfaceC0751a});
                return;
            }
            com.taobao.pha.core.controller.k w = appController.w();
            if (w == null) {
                interfaceC0751a.a(PHAErrorType.REFERENCE_ERROR, "PageViewController is null.");
                return;
            }
            char c = 65535;
            switch (str.hashCode()) {
                case -1445808858:
                    if (str.equals("setColorScheme")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1298848381:
                    if (str.equals("enable")) {
                        c = 4;
                        break;
                    }
                    break;
                case 3540994:
                    if (str.equals("stop")) {
                        c = 1;
                        break;
                    }
                    break;
                case 109757538:
                    if (str.equals("start")) {
                        c = 0;
                        break;
                    }
                    break;
                case 1671308008:
                    if (str.equals("disable")) {
                        c = 5;
                        break;
                    }
                    break;
                case 1743806995:
                    if (str.equals("setBackgroundColor")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                if (w.g()) {
                    interfaceC0751a.a(null);
                } else {
                    interfaceC0751a.a(PHAErrorType.CLIENT_ERROR, "PullRefresh start failed.");
                }
            } else if (c == 1) {
                if (w.h()) {
                    interfaceC0751a.a(null);
                } else {
                    interfaceC0751a.a(PHAErrorType.CLIENT_ERROR, "PullRefresh stop failed.");
                }
            } else if (c == 2) {
                try {
                    num = ngn.g(jSONObject.getString("background_color"));
                } catch (Exception e) {
                    e.printStackTrace();
                    num = null;
                }
                if (num == null) {
                    interfaceC0751a.a(PHAErrorType.TYPE_ERROR, "Params background_color invalid.");
                } else if (w.a(num)) {
                    interfaceC0751a.a(null);
                } else {
                    interfaceC0751a.a(PHAErrorType.CLIENT_ERROR, "Set color failed.");
                }
            } else if (c == 3) {
                if (w.a(jSONObject.getString("color_scheme"))) {
                    interfaceC0751a.a(null);
                } else {
                    interfaceC0751a.a(PHAErrorType.CLIENT_ERROR, "Set color scheme failed.");
                }
            } else if (c == 4) {
                try {
                    z = jSONObject.getBoolean("reload").booleanValue();
                } catch (Exception unused) {
                }
                if (w.a(z)) {
                    interfaceC0751a.a(null);
                } else {
                    interfaceC0751a.a(PHAErrorType.CLIENT_ERROR, "Cannot enablePullRefresh");
                }
            } else if (c == 5) {
                if (w.i()) {
                    interfaceC0751a.a(null);
                } else {
                    interfaceC0751a.a(PHAErrorType.CLIENT_ERROR, "Cannot disablePullRefresh");
                }
            } else {
                interfaceC0751a.a(PHAErrorType.TYPE_ERROR, "Unknown method: " + str);
            }
        }
    }

    /* loaded from: classes7.dex */
    public static class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1321715764);
        }

        public static /* synthetic */ void a(AppController appController, JSONObject jSONObject, c.a aVar, a.InterfaceC0751a interfaceC0751a) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b3c3a466", new Object[]{appController, jSONObject, aVar, interfaceC0751a});
            } else {
                b(appController, jSONObject, aVar, interfaceC0751a);
            }
        }

        private static void b(AppController appController, JSONObject jSONObject, c.a aVar, a.InterfaceC0751a interfaceC0751a) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ec384345", new Object[]{appController, jSONObject, aVar, interfaceC0751a});
                return;
            }
            String a2 = nfb.a(jSONObject, aVar);
            if (StringUtils.isEmpty(a2)) {
                interfaceC0751a.a(PHAErrorType.REFERENCE_ERROR, "Param page_key shouldn't be empty.");
                return;
            }
            String string = jSONObject.getString("targetOrigin");
            if (StringUtils.isEmpty(string)) {
                interfaceC0751a.a(PHAErrorType.REFERENCE_ERROR, "Param targetOrigin shouldn't be empty.");
                return;
            }
            Object obj = jSONObject.get("message");
            if (obj == null) {
                interfaceC0751a.a(PHAErrorType.REFERENCE_ERROR, "Param message is null.");
                return;
            }
            if (appController.E() != null) {
                appController.E().a("message", obj, a2, string);
            }
            interfaceC0751a.a(null);
        }
    }

    /* loaded from: classes7.dex */
    public static class f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1051368260);
        }

        public static /* synthetic */ void a(AppController appController, JSONObject jSONObject, a.InterfaceC0751a interfaceC0751a) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("82de3951", new Object[]{appController, jSONObject, interfaceC0751a});
            } else {
                c(appController, jSONObject, interfaceC0751a);
            }
        }

        public static /* synthetic */ void a(AppController appController, String str, JSONObject jSONObject, c.a aVar, a.InterfaceC0751a interfaceC0751a) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9b1ec25c", new Object[]{appController, str, jSONObject, aVar, interfaceC0751a});
            } else {
                b(appController, str, jSONObject, aVar, interfaceC0751a);
            }
        }

        public static /* synthetic */ void b(AppController appController, JSONObject jSONObject, a.InterfaceC0751a interfaceC0751a) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cbf53ff0", new Object[]{appController, jSONObject, interfaceC0751a});
            } else {
                d(appController, jSONObject, interfaceC0751a);
            }
        }

        private static void c(AppController appController, JSONObject jSONObject, a.InterfaceC0751a interfaceC0751a) {
            IpChange ipChange = $ipChange;
            boolean z = false;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("150c468f", new Object[]{appController, jSONObject, interfaceC0751a});
                return;
            }
            String string = jSONObject.getString("url");
            if (StringUtils.isEmpty(string)) {
                interfaceC0751a.a(PHAErrorType.REFERENCE_ERROR, "Param url is null.");
                return;
            }
            try {
                z = jSONObject.getBooleanValue("pop");
            } catch (Exception unused) {
            }
            if (appController.a(Uri.parse(string), DowngradeType.USER, Boolean.valueOf(z))) {
                interfaceC0751a.a(null);
            } else {
                interfaceC0751a.a(PHAErrorType.CLIENT_ERROR, "Downgrade failed.");
            }
        }

        private static void d(AppController appController, JSONObject jSONObject, a.InterfaceC0751a interfaceC0751a) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e234d2e", new Object[]{appController, jSONObject, interfaceC0751a});
            } else if (!appController.Q().d()) {
                interfaceC0751a.a(PHAErrorType.CONFIG_ERROR, "Navigator disabled by outer.");
            } else if (appController.Q().f()) {
                interfaceC0751a.a(null);
            } else {
                interfaceC0751a.a(PHAErrorType.CLIENT_ERROR, "Navigator back failed.");
            }
        }

        private static void b(AppController appController, String str, JSONObject jSONObject, c.a aVar, a.InterfaceC0751a interfaceC0751a) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6e53077b", new Object[]{appController, str, jSONObject, aVar, interfaceC0751a});
            } else if (!com.taobao.pha.core.p.c().y()) {
                interfaceC0751a.a(PHAErrorType.CONFIG_ERROR, "Navigator subpage disabled");
            } else if (!appController.Q().d()) {
                interfaceC0751a.a(PHAErrorType.CONFIG_ERROR, "Navigator disabled by outer.");
            } else {
                nfz B = appController.B();
                if ((B instanceof nfz) && (aVar instanceof nfz) && B != ((nfz) aVar)) {
                    interfaceC0751a.a(PHAErrorType.REFERENCE_ERROR, "Navigator current page view invalid");
                    return;
                }
                char c = 65535;
                switch (str.hashCode()) {
                    case -1213966271:
                        if (str.equals("getCurrentPages")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 111185:
                        if (str.equals("pop")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 3452698:
                        if (str.equals("push")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 1449032567:
                        if (str.equals("redirectTo")) {
                            c = 2;
                            break;
                        }
                        break;
                }
                if (c == 0) {
                    e(appController, jSONObject, interfaceC0751a);
                } else if (c == 1) {
                    f(appController, jSONObject, interfaceC0751a);
                } else if (c == 2) {
                    g(appController, jSONObject, interfaceC0751a);
                } else if (c == 3) {
                    h(appController, jSONObject, interfaceC0751a);
                } else {
                    interfaceC0751a.a(PHAErrorType.TYPE_ERROR, "Navigator unknown method.");
                }
            }
        }

        private static void e(AppController appController, JSONObject jSONObject, a.InterfaceC0751a interfaceC0751a) {
            PageModel pageModel;
            IpChange ipChange = $ipChange;
            int i = 1;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a73a53cd", new Object[]{appController, jSONObject, interfaceC0751a});
            } else if (StringUtils.isEmpty(jSONObject.getString("url"))) {
                interfaceC0751a.a(PHAErrorType.REFERENCE_ERROR, "Param url is null.");
            } else {
                try {
                    if (jSONObject.containsKey("animation")) {
                        i = ngn.d(jSONObject.getString("animation"));
                    }
                    pageModel = (PageModel) JSONObject.toJavaObject(jSONObject, PageModel.class);
                } catch (Throwable th) {
                    ngr.b(nfb.a(), ngn.a(th));
                    pageModel = null;
                }
                if (pageModel != null && appController.Q().a(pageModel, i)) {
                    interfaceC0751a.a(null);
                } else {
                    interfaceC0751a.a(PHAErrorType.CLIENT_ERROR, "Navigator push failed.");
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0056  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void f(com.taobao.pha.core.controller.AppController r5, com.alibaba.fastjson.JSONObject r6, com.taobao.pha.core.jsbridge.a.InterfaceC0751a r7) {
            /*
                java.lang.String r0 = "delta"
                java.lang.String r1 = "animation"
                com.android.alibaba.ip.runtime.IpChange r2 = tb.nfb.f.$ipChange
                boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
                r4 = 1
                if (r3 == 0) goto L1c
                r0 = 3
                java.lang.Object[] r0 = new java.lang.Object[r0]
                r1 = 0
                r0[r1] = r5
                r0[r4] = r6
                r5 = 2
                r0[r5] = r7
                java.lang.String r5 = "f0515a6c"
                r2.ipc$dispatch(r5, r0)
                return
            L1c:
                boolean r2 = r6.containsKey(r1)     // Catch: java.lang.Throwable -> L3a
                if (r2 == 0) goto L2b
                java.lang.String r1 = r6.getString(r1)     // Catch: java.lang.Throwable -> L3a
                int r1 = tb.ngn.d(r1)     // Catch: java.lang.Throwable -> L3a
                goto L2c
            L2b:
                r1 = 1
            L2c:
                boolean r2 = r6.containsKey(r0)     // Catch: java.lang.Throwable -> L38
                if (r2 == 0) goto L47
                int r6 = r6.getIntValue(r0)     // Catch: java.lang.Throwable -> L38
                r4 = r6
                goto L47
            L38:
                r6 = move-exception
                goto L3c
            L3a:
                r6 = move-exception
                r1 = 1
            L3c:
                java.lang.String r0 = tb.nfb.a()
                java.lang.String r6 = tb.ngn.a(r6)
                tb.ngr.b(r0, r6)
            L47:
                com.taobao.pha.core.controller.j r5 = r5.Q()
                boolean r5 = r5.a(r4, r1)
                if (r5 == 0) goto L56
                r5 = 0
                r7.a(r5)
                return
            L56:
                com.taobao.pha.core.error.PHAErrorType r5 = com.taobao.pha.core.error.PHAErrorType.CLIENT_ERROR
                java.lang.String r6 = "Navigator pop failed."
                r7.a(r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.nfb.f.f(com.taobao.pha.core.controller.AppController, com.alibaba.fastjson.JSONObject, com.taobao.pha.core.jsbridge.a$a):void");
        }

        private static void g(AppController appController, JSONObject jSONObject, a.InterfaceC0751a interfaceC0751a) {
            PageModel pageModel;
            IpChange ipChange = $ipChange;
            int i = 1;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3968610b", new Object[]{appController, jSONObject, interfaceC0751a});
            } else if (StringUtils.isEmpty(jSONObject.getString("url"))) {
                interfaceC0751a.a(PHAErrorType.REFERENCE_ERROR, "Param url is null.");
            } else {
                try {
                    if (jSONObject.containsKey("animation")) {
                        i = ngn.d(jSONObject.getString("animation"));
                    }
                    pageModel = (PageModel) JSONObject.toJavaObject(jSONObject, PageModel.class);
                } catch (Throwable th) {
                    ngr.b(nfb.a(), ngn.a(th));
                    pageModel = null;
                }
                if (pageModel != null && appController.Q().b(pageModel, i)) {
                    interfaceC0751a.a(null);
                } else {
                    interfaceC0751a.a(PHAErrorType.CLIENT_ERROR, "Navigator redirectTo failed.");
                }
            }
        }

        private static void h(AppController appController, JSONObject jSONObject, a.InterfaceC0751a interfaceC0751a) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("827f67aa", new Object[]{appController, jSONObject, interfaceC0751a});
                return;
            }
            JSONObject g = appController.Q().g();
            if (g != null) {
                interfaceC0751a.a(g);
            } else {
                interfaceC0751a.a(PHAErrorType.REFERENCE_ERROR, "Navigator getCurrentPages failed.");
            }
        }
    }

    /* loaded from: classes7.dex */
    public static class m {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1517483352);
        }

        public static /* synthetic */ void a(AppController appController, String str, JSONObject jSONObject, a.InterfaceC0751a interfaceC0751a) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("26fb4c7", new Object[]{appController, str, jSONObject, interfaceC0751a});
            } else {
                b(appController, str, jSONObject, interfaceC0751a);
            }
        }

        private static void b(AppController appController, String str, JSONObject jSONObject, a.InterfaceC0751a interfaceC0751a) {
            String a2;
            IpChange ipChange = $ipChange;
            boolean z = false;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ee3f1a6", new Object[]{appController, str, jSONObject, interfaceC0751a});
                return;
            }
            nfu h = com.taobao.pha.core.p.b().h();
            nft a3 = h != null ? h.a(appController.t().toString()) : null;
            if (a3 == null) {
                ngr.b(nfb.a(), "Storage instance is null");
                interfaceC0751a.a(PHAErrorType.REFERENCE_ERROR, "Storage instance is null");
                return;
            }
            String string = jSONObject.getString("key");
            String string2 = jSONObject.getString("value");
            char c = 65535;
            switch (str.hashCode()) {
                case -75439223:
                    if (str.equals("getItem")) {
                        c = 1;
                        break;
                    }
                    break;
                case 94746189:
                    if (str.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_clear)) {
                        c = 3;
                        break;
                    }
                    break;
                case 1098253751:
                    if (str.equals("removeItem")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1984670357:
                    if (str.equals("setItem")) {
                        c = 0;
                        break;
                    }
                    break;
            }
            if (c != 0) {
                if (c == 1) {
                    JSONObject jSONObject2 = new JSONObject();
                    if (string == null || (a2 = a3.a(string)) == null) {
                        jSONObject2.put("value", (Object) null);
                    } else {
                        jSONObject2.put("value", (Object) a2);
                    }
                    interfaceC0751a.a(jSONObject2);
                    return;
                } else if (c == 2) {
                    z = a3.b(string);
                } else if (c == 3) {
                    z = a3.a();
                }
            } else if (string != null && string2 != null) {
                z = a3.a(string, string2);
            }
            if (z) {
                interfaceC0751a.a(null);
                return;
            }
            PHAErrorType pHAErrorType = PHAErrorType.THIRD_PARTY_ERROR;
            interfaceC0751a.a(pHAErrorType, "call Storage." + str + " failed.");
        }
    }

    /* loaded from: classes7.dex */
    public static class p {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(627846445);
        }

        public static void a(AppController appController, String str, JSONObject jSONObject, a.InterfaceC0751a interfaceC0751a) {
            String str2;
            IpChange ipChange = $ipChange;
            char c = 3;
            boolean z = false;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("26fb4c7", new Object[]{appController, str, jSONObject, interfaceC0751a});
            } else if (com.taobao.pha.core.p.b().i() == null) {
                interfaceC0751a.a(PHAErrorType.REFERENCE_ERROR, "userTracker is null");
            } else {
                Context C = appController.C();
                try {
                    switch (str.hashCode()) {
                        case -2000505633:
                            if (str.equals("updateNextProp")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1349088399:
                            if (str.equals("custom")) {
                                c = '\f';
                                break;
                            }
                            c = 65535;
                            break;
                        case -1289153596:
                            if (str.equals("expose")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case -109421100:
                            if (str.equals(com.alibaba.triver.triver_shop.newShop.ext.m.PAGE_DISAPPEAR)) {
                                c = '\b';
                                break;
                            }
                            c = 65535;
                            break;
                        case 94750088:
                            if (str.equals("click")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case 106069776:
                            if (str.equals("other")) {
                                break;
                            }
                            c = 65535;
                            break;
                        case 768062724:
                            if (str.equals(com.alibaba.triver.triver_shop.newShop.ext.m.PAGE_APPEAR)) {
                                c = 7;
                                break;
                            }
                            c = 65535;
                            break;
                        case 859698569:
                            if (str.equals("pageEnter")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1392047779:
                            if (str.equals("updateNextPageUtParam")) {
                                c = 11;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1421600451:
                            if (str.equals("updateNextPageUtparam")) {
                                c = '\n';
                                break;
                            }
                            c = 65535;
                            break;
                        case 1850454806:
                            if (str.equals("updatePageUtParam")) {
                                c = 6;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1880007478:
                            if (str.equals(com.alibaba.triver.triver_shop.newShop.ext.m.UPDATE_PAGE_UTPARAM)) {
                                c = 5;
                                break;
                            }
                            c = 65535;
                            break;
                        case 2145313966:
                            if (str.equals(com.alibaba.triver.triver_shop.newShop.ext.m.SKIP_PAGE)) {
                                c = '\t';
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    switch (c) {
                        case 0:
                            z = b(jSONObject);
                            str2 = null;
                            break;
                        case 1:
                            z = c(jSONObject);
                            str2 = null;
                            break;
                        case 2:
                            z = a(C, jSONObject);
                            str2 = null;
                            break;
                        case 3:
                            z = d(jSONObject);
                            str2 = null;
                            break;
                        case 4:
                            z = e(jSONObject);
                            str2 = null;
                            break;
                        case 5:
                        case 6:
                            z = a(C, jSONObject.toJSONString());
                            str2 = null;
                            break;
                        case 7:
                            z = a(C);
                            str2 = null;
                            break;
                        case '\b':
                            z = b(C);
                            str2 = null;
                            break;
                        case '\t':
                            z = c(C);
                            str2 = null;
                            break;
                        case '\n':
                        case 11:
                            z = a(jSONObject.toJSONString());
                            str2 = null;
                            break;
                        case '\f':
                            z = a(jSONObject);
                            str2 = null;
                            break;
                        default:
                            str2 = "Unknown method: " + str;
                            break;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    str2 = "Failed to call.";
                }
                if (z) {
                    interfaceC0751a.a(null);
                } else {
                    interfaceC0751a.a(PHAErrorType.THIRD_PARTY_ERROR, str2);
                }
            }
        }

        private static boolean a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("266fb8c", new Object[]{jSONObject})).booleanValue();
            }
            if (jSONObject != null) {
                String string = jSONObject.getString("pageName");
                int intValue = jSONObject.getIntValue("eventId");
                String string2 = jSONObject.getString("arg1");
                String string3 = jSONObject.getString("arg2");
                String string4 = jSONObject.getString("arg3");
                JSONObject jSONObject2 = jSONObject.getJSONObject("params");
                com.taobao.pha.core.l i = com.taobao.pha.core.p.b().i();
                if (intValue > 0 && i != null) {
                    i.a(string, intValue, string2, string3, string4, jSONObject2);
                    return true;
                }
            }
            return false;
        }

        private static boolean b(JSONObject jSONObject) {
            String str;
            JSONObject jSONObject2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("63b9982b", new Object[]{jSONObject})).booleanValue();
            }
            String str2 = null;
            if (jSONObject != null) {
                String string = jSONObject.getString("pageName");
                String string2 = jSONObject.getString("comName");
                jSONObject2 = jSONObject.getJSONObject("params");
                str = string;
                str2 = string2;
            } else {
                str = null;
                jSONObject2 = null;
            }
            if (StringUtils.isEmpty(str2)) {
                return false;
            }
            com.taobao.pha.core.p.b().i().a(str, str2, jSONObject2);
            return true;
        }

        private static boolean a(Context context, JSONObject jSONObject) {
            JSONObject jSONObject2;
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("1cb6e294", new Object[]{context, jSONObject})).booleanValue();
            }
            String str2 = null;
            if (jSONObject != null) {
                str2 = jSONObject.getString("pageName");
                str = jSONObject.getString("spmUrl");
                jSONObject2 = jSONObject.getJSONObject("params");
            } else {
                jSONObject2 = null;
                str = null;
            }
            com.taobao.pha.core.l i = com.taobao.pha.core.p.b().i();
            i.b(context, str2);
            i.a(context, jSONObject2);
            if (!StringUtils.isEmpty(str)) {
                i.b(context, Uri.parse(str));
            }
            return true;
        }

        private static boolean c(JSONObject jSONObject) {
            String str;
            String str2;
            String str3;
            String str4;
            JSONObject jSONObject2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c50c34ca", new Object[]{jSONObject})).booleanValue();
            }
            int i = -1;
            if (jSONObject != null) {
                String string = jSONObject.getString("pageName");
                i = jSONObject.getIntValue("eventId");
                String string2 = jSONObject.getString("arg1");
                String string3 = jSONObject.getString("arg2");
                String string4 = jSONObject.getString("arg3");
                jSONObject2 = jSONObject.getJSONObject("params");
                str2 = string2;
                str3 = string3;
                str4 = string4;
                str = string;
            } else {
                str = null;
                str2 = null;
                str3 = null;
                str4 = null;
                jSONObject2 = null;
            }
            int i2 = i <= 0 ? 2201 : i;
            com.taobao.pha.core.p.b().i();
            com.taobao.pha.core.p.b().i().a(str, i2, str2, str3, str4, jSONObject2);
            return true;
        }

        private static boolean d(JSONObject jSONObject) {
            JSONObject jSONObject2;
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("265ed169", new Object[]{jSONObject})).booleanValue();
            }
            String str2 = null;
            if (jSONObject != null) {
                str2 = jSONObject.getString("pageName");
                str = jSONObject.getString("arg1");
                jSONObject2 = jSONObject.getJSONObject("params");
            } else {
                jSONObject2 = null;
                str = null;
            }
            com.taobao.pha.core.p.b().i().b(str2, str, jSONObject2);
            return true;
        }

        private static boolean e(JSONObject jSONObject) {
            JSONObject jSONObject2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("87b16e08", new Object[]{jSONObject})).booleanValue();
            }
            if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("params")) == null) {
                return false;
            }
            com.taobao.pha.core.p.b().i().a(jSONObject2);
            return true;
        }

        private static boolean a(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
            }
            com.taobao.pha.core.p.b().i().a(context, true);
            return true;
        }

        private static boolean b(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{context})).booleanValue();
            }
            com.taobao.pha.core.p.b().i().b(context);
            return true;
        }

        private static boolean a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
            }
            com.taobao.pha.core.p.b().i().a(str);
            return true;
        }

        private static boolean a(Context context, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("61b6362e", new Object[]{context, str})).booleanValue();
            }
            com.taobao.pha.core.p.b().i().a(context, str);
            return true;
        }

        private static boolean c(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9f76bba2", new Object[]{context})).booleanValue();
            }
            com.taobao.pha.core.p.b().i().a(context);
            return true;
        }
    }

    /* loaded from: classes7.dex */
    public static class n {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(92186283);
        }

        public static /* synthetic */ void a(AppController appController, JSONObject jSONObject, a.InterfaceC0751a interfaceC0751a) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("82de3951", new Object[]{appController, jSONObject, interfaceC0751a});
            } else {
                e(appController, jSONObject, interfaceC0751a);
            }
        }

        public static /* synthetic */ void a(AppController appController, boolean z, JSONObject jSONObject, a.InterfaceC0751a interfaceC0751a) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7411a5a9", new Object[]{appController, new Boolean(z), jSONObject, interfaceC0751a});
            } else {
                b(appController, z, jSONObject, interfaceC0751a);
            }
        }

        public static /* synthetic */ void b(AppController appController, JSONObject jSONObject, a.InterfaceC0751a interfaceC0751a) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cbf53ff0", new Object[]{appController, jSONObject, interfaceC0751a});
            } else {
                f(appController, jSONObject, interfaceC0751a);
            }
        }

        public static /* synthetic */ void c(AppController appController, JSONObject jSONObject, a.InterfaceC0751a interfaceC0751a) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("150c468f", new Object[]{appController, jSONObject, interfaceC0751a});
            } else {
                g(appController, jSONObject, interfaceC0751a);
            }
        }

        public static /* synthetic */ void d(AppController appController, JSONObject jSONObject, a.InterfaceC0751a interfaceC0751a) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e234d2e", new Object[]{appController, jSONObject, interfaceC0751a});
            } else {
                h(appController, jSONObject, interfaceC0751a);
            }
        }

        private static void e(AppController appController, JSONObject jSONObject, a.InterfaceC0751a interfaceC0751a) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a73a53cd", new Object[]{appController, jSONObject, interfaceC0751a});
                return;
            }
            ViewPagerFragment a2 = a(appController);
            if (a2 != null) {
                try {
                    a2.setCurrentViewPagerItem(jSONObject.getInteger("index").intValue(), jSONObject.getString("animation"));
                    interfaceC0751a.a(null);
                    return;
                } catch (Exception unused) {
                    interfaceC0751a.a(PHAErrorType.TYPE_ERROR, "Parsing JSON error.");
                    return;
                }
            }
            interfaceC0751a.a(PHAErrorType.REFERENCE_ERROR, "Can't find viewpager.");
        }

        private static void f(AppController appController, JSONObject jSONObject, a.InterfaceC0751a interfaceC0751a) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f0515a6c", new Object[]{appController, jSONObject, interfaceC0751a});
                return;
            }
            ViewPagerFragment a2 = a(appController);
            if (a2 != null) {
                try {
                    a2.addFrame(jSONObject.getInteger("index").intValue(), (PageModel) JSONObject.toJavaObject(jSONObject, PageModel.class), interfaceC0751a);
                    return;
                } catch (Exception unused) {
                    interfaceC0751a.a(PHAErrorType.TYPE_ERROR, "Parsing JSON error.");
                    return;
                }
            }
            interfaceC0751a.a(PHAErrorType.REFERENCE_ERROR, "Can't find viewpager.");
        }

        private static void g(AppController appController, JSONObject jSONObject, a.InterfaceC0751a interfaceC0751a) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3968610b", new Object[]{appController, jSONObject, interfaceC0751a});
                return;
            }
            ViewPagerFragment a2 = a(appController);
            if (a2 != null) {
                try {
                    a2.addFrames((PageModel) jSONObject.toJavaObject(PageModel.class), interfaceC0751a);
                    return;
                } catch (Exception unused) {
                    interfaceC0751a.a(PHAErrorType.TYPE_ERROR, "Parsing JSON error.");
                    return;
                }
            }
            interfaceC0751a.a(PHAErrorType.REFERENCE_ERROR, "Can't find viewpager.");
        }

        private static void h(AppController appController, JSONObject jSONObject, a.InterfaceC0751a interfaceC0751a) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("827f67aa", new Object[]{appController, jSONObject, interfaceC0751a});
                return;
            }
            ViewPagerFragment a2 = a(appController);
            if (a2 != null) {
                try {
                    a2.removeFrame(jSONObject.getInteger("index").intValue(), interfaceC0751a);
                    return;
                } catch (Exception unused) {
                    interfaceC0751a.a(PHAErrorType.TYPE_ERROR, "Parsing JSON error.");
                    return;
                }
            }
            interfaceC0751a.a(PHAErrorType.REFERENCE_ERROR, "Can't find viewpager.");
        }

        private static void b(AppController appController, boolean z, JSONObject jSONObject, a.InterfaceC0751a interfaceC0751a) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4ddb72ea", new Object[]{appController, new Boolean(z), jSONObject, interfaceC0751a});
                return;
            }
            ViewPagerFragment a2 = a(appController);
            if (a2 != null) {
                a2.setViewPagerEnabled(z);
                interfaceC0751a.a(null);
                return;
            }
            interfaceC0751a.a(PHAErrorType.REFERENCE_ERROR, "Can't find viewpager.");
        }

        private static ViewPagerFragment a(AppController appController) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ViewPagerFragment) ipChange.ipc$dispatch("32217281", new Object[]{appController});
            }
            if (ngu.k()) {
                return appController.x();
            }
            com.taobao.pha.core.controller.k w = appController.w();
            if (w == null || w.c() == null) {
                return null;
            }
            com.taobao.pha.core.phacontainer.c c = w.c();
            if (!(c instanceof ViewPagerFragment)) {
                return null;
            }
            return (ViewPagerFragment) c;
        }
    }

    /* loaded from: classes7.dex */
    public static class o {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(100245105);
        }

        public static /* synthetic */ void a(AppController appController, JSONObject jSONObject, a.InterfaceC0751a interfaceC0751a) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("82de3951", new Object[]{appController, jSONObject, interfaceC0751a});
            } else {
                c(appController, jSONObject, interfaceC0751a);
            }
        }

        public static /* synthetic */ void a(AppController appController, boolean z, JSONObject jSONObject, a.InterfaceC0751a interfaceC0751a) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7411a5a9", new Object[]{appController, new Boolean(z), jSONObject, interfaceC0751a});
            } else {
                b(appController, z, jSONObject, interfaceC0751a);
            }
        }

        public static /* synthetic */ void b(AppController appController, JSONObject jSONObject, a.InterfaceC0751a interfaceC0751a) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cbf53ff0", new Object[]{appController, jSONObject, interfaceC0751a});
            } else {
                d(appController, jSONObject, interfaceC0751a);
            }
        }

        private static void b(AppController appController, boolean z, JSONObject jSONObject, a.InterfaceC0751a interfaceC0751a) {
            Integer num;
            boolean b;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4ddb72ea", new Object[]{appController, new Boolean(z), jSONObject, interfaceC0751a});
                return;
            }
            try {
                num = jSONObject.getInteger("duration");
            } catch (Exception unused) {
                num = null;
            }
            if (num == null) {
                num = 500;
            }
            com.taobao.pha.core.controller.o v = appController.v();
            if (v != null) {
                int c = ngn.c(jSONObject.getString("animation"));
                if (z) {
                    b = v.a(c, num.intValue());
                } else {
                    b = v.b(c, num.intValue());
                }
                if (b) {
                    interfaceC0751a.a(null);
                    return;
                } else {
                    interfaceC0751a.a(PHAErrorType.UI_ERROR, "Animation failed.");
                    return;
                }
            }
            interfaceC0751a.a(PHAErrorType.REFERENCE_ERROR, "Can't find tab container.");
        }

        private static void c(AppController appController, JSONObject jSONObject, a.InterfaceC0751a interfaceC0751a) {
            Integer num;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("150c468f", new Object[]{appController, jSONObject, interfaceC0751a});
                return;
            }
            try {
                num = jSONObject.getInteger("index");
            } catch (Exception unused) {
                num = null;
            }
            if (num == null) {
                interfaceC0751a.a(PHAErrorType.TYPE_ERROR, "Index invalid.");
                return;
            }
            com.taobao.pha.core.controller.o v = appController.v();
            if (v != null) {
                v.a(num.intValue());
                interfaceC0751a.a(null);
                return;
            }
            interfaceC0751a.a(PHAErrorType.REFERENCE_ERROR, "Can't find tab container.");
        }

        private static void d(AppController appController, JSONObject jSONObject, final a.InterfaceC0751a interfaceC0751a) {
            TabBar c;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e234d2e", new Object[]{appController, jSONObject, interfaceC0751a});
            } else if (!ngu.i()) {
                interfaceC0751a.a(PHAErrorType.CONFIG_ERROR, "deferring tabBar loading is disabled by rule.");
            } else {
                try {
                    c = appController.v().c();
                } catch (Exception unused) {
                }
                if (c == null) {
                    interfaceC0751a.a(PHAErrorType.CLIENT_ERROR, "no tabBar to load.");
                    return;
                }
                final nfz tabPageView = c.getTabPageView();
                if (tabPageView == null) {
                    interfaceC0751a.a(PHAErrorType.CLIENT_ERROR, "pageView is null.");
                    return;
                }
                if (tabPageView instanceof nfv) {
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: tb.nfb.o.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            ((nfv) nfz.this).s();
                            interfaceC0751a.a(null);
                        }
                    });
                    return;
                }
                interfaceC0751a.a(PHAErrorType.CLIENT_ERROR, "unexpected error.");
            }
        }
    }

    /* loaded from: classes7.dex */
    public static class k {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1793849951);
        }

        public static /* synthetic */ void a(AppController appController, JSONObject jSONObject, a.InterfaceC0751a interfaceC0751a) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("82de3951", new Object[]{appController, jSONObject, interfaceC0751a});
            } else {
                b(appController, jSONObject, interfaceC0751a);
            }
        }

        private static void b(AppController appController, JSONObject jSONObject, a.InterfaceC0751a interfaceC0751a) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cbf53ff0", new Object[]{appController, jSONObject, interfaceC0751a});
                return;
            }
            com.taobao.pha.core.controller.n O = appController.O();
            if (O != null) {
                O.b();
                interfaceC0751a.a(null);
                return;
            }
            interfaceC0751a.a(PHAErrorType.REFERENCE_ERROR, "Splash close failed");
        }
    }

    /* loaded from: classes7.dex */
    public static class g {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1622832815);
        }

        public static /* synthetic */ void a(AppController appController, JSONObject jSONObject, a.InterfaceC0751a interfaceC0751a) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("82de3951", new Object[]{appController, jSONObject, interfaceC0751a});
            } else {
                d(appController, jSONObject, interfaceC0751a);
            }
        }

        public static /* synthetic */ void b(AppController appController, JSONObject jSONObject, a.InterfaceC0751a interfaceC0751a) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cbf53ff0", new Object[]{appController, jSONObject, interfaceC0751a});
            } else {
                e(appController, jSONObject, interfaceC0751a);
            }
        }

        public static /* synthetic */ void c(AppController appController, JSONObject jSONObject, a.InterfaceC0751a interfaceC0751a) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("150c468f", new Object[]{appController, jSONObject, interfaceC0751a});
            } else {
                f(appController, jSONObject, interfaceC0751a);
            }
        }

        private static int a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("266fb7b", new Object[]{jSONObject})).intValue();
            }
            Integer num = null;
            try {
                num = jSONObject.getInteger("duration");
            } catch (Exception unused) {
                ngr.b(nfb.a(), "Parsing duration failed.");
            }
            if (num != null) {
                return num.intValue();
            }
            return 500;
        }

        private static String b(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3f1ccf59", new Object[]{jSONObject}) : jSONObject.getString("animation");
        }

        private static void d(AppController appController, JSONObject jSONObject, a.InterfaceC0751a interfaceC0751a) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e234d2e", new Object[]{appController, jSONObject, interfaceC0751a});
                return;
            }
            com.taobao.pha.core.controller.k w = appController.w();
            if (w != null) {
                if (w.a(ngn.c(b(jSONObject)), a(jSONObject))) {
                    interfaceC0751a.a(null);
                    return;
                } else {
                    interfaceC0751a.a(PHAErrorType.UI_ERROR, "Show header animation failed.");
                    return;
                }
            }
            interfaceC0751a.a(PHAErrorType.REFERENCE_ERROR, "PageViewController is null.");
        }

        private static void e(AppController appController, JSONObject jSONObject, a.InterfaceC0751a interfaceC0751a) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a73a53cd", new Object[]{appController, jSONObject, interfaceC0751a});
                return;
            }
            com.taobao.pha.core.controller.k w = appController.w();
            if (w != null) {
                if (w.b(ngn.c(b(jSONObject)), a(jSONObject))) {
                    interfaceC0751a.a(null);
                    return;
                } else {
                    interfaceC0751a.a(PHAErrorType.UI_ERROR, "Hide header animation failed.");
                    return;
                }
            }
            interfaceC0751a.a(PHAErrorType.REFERENCE_ERROR, "PageViewController is null.");
        }

        private static void f(AppController appController, JSONObject jSONObject, a.InterfaceC0751a interfaceC0751a) {
            Integer num;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f0515a6c", new Object[]{appController, jSONObject, interfaceC0751a});
                return;
            }
            try {
                num = jSONObject.getInteger("height");
            } catch (Throwable unused) {
                num = null;
            }
            int intValue = num == null ? 0 : num.intValue();
            String string = jSONObject.getString("height_unit");
            Boolean bool = jSONObject.getBoolean("included_safe_area");
            boolean booleanValue = bool != null ? bool.booleanValue() : true;
            com.taobao.pha.core.controller.k w = appController.w();
            if (w != null) {
                if (w.a(ngn.c(b(jSONObject)), intValue, string, booleanValue, a(jSONObject))) {
                    interfaceC0751a.a(null);
                    return;
                } else {
                    interfaceC0751a.a(PHAErrorType.UI_ERROR, "Set height animation failed.");
                    return;
                }
            }
            interfaceC0751a.a(PHAErrorType.REFERENCE_ERROR, "PageViewController is null.");
        }
    }

    /* loaded from: classes7.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1973904954);
        }

        public static /* synthetic */ void b(AppController appController, JSONObject jSONObject, a.InterfaceC0751a interfaceC0751a) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cbf53ff0", new Object[]{appController, jSONObject, interfaceC0751a});
            } else {
                c(appController, jSONObject, interfaceC0751a);
            }
        }

        private static void c(AppController appController, JSONObject jSONObject, a.InterfaceC0751a interfaceC0751a) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("150c468f", new Object[]{appController, jSONObject, interfaceC0751a});
            } else if (!com.taobao.pha.core.p.c().j()) {
                interfaceC0751a.a(PHAErrorType.CONFIG_ERROR, "Data prefetch disabled by rule.");
            } else if (!jSONObject.containsKey("key")) {
                interfaceC0751a.a(PHAErrorType.REFERENCE_ERROR, "Parameter \"key\" does not exist.");
            } else {
                JSONObject jSONObject2 = new JSONObject();
                String string = jSONObject.getString("key");
                if (StringUtils.isEmpty(string)) {
                    interfaceC0751a.a(PHAErrorType.REFERENCE_ERROR, "Parameter \"key\" shouldn't be empty.");
                    return;
                }
                jSONObject2.put("key", (Object) string);
                if (appController.o()) {
                    interfaceC0751a.a(PHAErrorType.CLIENT_ERROR, "appController is disposed");
                    return;
                }
                com.taobao.pha.core.phacontainer.a q = appController.q();
                if (q == null) {
                    interfaceC0751a.a(PHAErrorType.REFERENCE_ERROR, "dataPrefetch Object in appController is not created!");
                } else if (q.c(string)) {
                    q.a(string, interfaceC0751a);
                    String a2 = nfb.a();
                    ngr.b(a2, "data for key" + string + "is still in prefetching");
                } else if (!q.a(string)) {
                    interfaceC0751a.a(PHAErrorType.REFERENCE_ERROR, "The key( " + string + " ) has no prefetched data.");
                } else {
                    JSONObject b = q.b(string);
                    appController.h().b(FeatureStatistics.FeatureNames.DATA_PREFETCH);
                    interfaceC0751a.a(b);
                }
            }
        }

        public static void a(AppController appController, JSONObject jSONObject, a.InterfaceC0751a interfaceC0751a) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("82de3951", new Object[]{appController, jSONObject, interfaceC0751a});
                return;
            }
            com.taobao.pha.core.phacontainer.a q = appController.q();
            if (q == null) {
                interfaceC0751a.a(PHAErrorType.REFERENCE_ERROR, "data prefetch is null");
                return;
            }
            try {
                q.a(jSONObject.getJSONArray("data_prefetch"));
                interfaceC0751a.a(null);
            } catch (Exception e) {
                PHAErrorType pHAErrorType = PHAErrorType.CLIENT_ERROR;
                interfaceC0751a.a(pHAErrorType, "caught an exception: " + e.toString());
            }
        }
    }

    /* loaded from: classes7.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-424224711);
        }

        public static /* synthetic */ void a(AppController appController, JSONObject jSONObject, a.InterfaceC0751a interfaceC0751a) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("82de3951", new Object[]{appController, jSONObject, interfaceC0751a});
            } else {
                e(appController, jSONObject, interfaceC0751a);
            }
        }

        public static /* synthetic */ void b(AppController appController, JSONObject jSONObject, a.InterfaceC0751a interfaceC0751a) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cbf53ff0", new Object[]{appController, jSONObject, interfaceC0751a});
            } else {
                f(appController, jSONObject, interfaceC0751a);
            }
        }

        public static /* synthetic */ void c(AppController appController, JSONObject jSONObject, a.InterfaceC0751a interfaceC0751a) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("150c468f", new Object[]{appController, jSONObject, interfaceC0751a});
            } else {
                g(appController, jSONObject, interfaceC0751a);
            }
        }

        public static /* synthetic */ void d(AppController appController, JSONObject jSONObject, a.InterfaceC0751a interfaceC0751a) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e234d2e", new Object[]{appController, jSONObject, interfaceC0751a});
            } else {
                h(appController, jSONObject, interfaceC0751a);
            }
        }

        private static void e(AppController appController, JSONObject jSONObject, a.InterfaceC0751a interfaceC0751a) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a73a53cd", new Object[]{appController, jSONObject, interfaceC0751a});
            } else if (com.taobao.pha.core.p.c().h()) {
                nex x = com.taobao.pha.core.p.b().x();
                x.a(jSONObject);
                if (x.c() != null) {
                    interfaceC0751a.a(null);
                } else {
                    interfaceC0751a.a(PHAErrorType.REFERENCE_ERROR, "Unable to get backend.js.");
                }
            } else {
                interfaceC0751a.a(PHAErrorType.CONFIG_ERROR, "Configure is not enabled.");
            }
        }

        private static void f(AppController appController, JSONObject jSONObject, a.InterfaceC0751a interfaceC0751a) {
            IpChange ipChange = $ipChange;
            boolean z = false;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f0515a6c", new Object[]{appController, jSONObject, interfaceC0751a});
            } else if (com.taobao.pha.core.p.c().h()) {
                Future<Boolean> a2 = com.taobao.pha.core.p.b().x().a();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    z = a2.get().booleanValue();
                } catch (Exception e) {
                    PHAErrorType pHAErrorType = PHAErrorType.CLIENT_ERROR;
                    interfaceC0751a.a(pHAErrorType, "Close Failed due to Exception " + e.getMessage());
                }
                if (z) {
                    jSONObject2.put("message", "close success");
                    interfaceC0751a.a(jSONObject2);
                    return;
                }
                interfaceC0751a.a(PHAErrorType.FILE_ERROR, "Fail to close due to unexpected file operation.");
            } else {
                interfaceC0751a.a(PHAErrorType.CONFIG_ERROR, "Configure is not enabled.");
            }
        }

        private static void g(AppController appController, JSONObject jSONObject, a.InterfaceC0751a interfaceC0751a) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3968610b", new Object[]{appController, jSONObject, interfaceC0751a});
            } else if (com.taobao.pha.core.p.c().h()) {
                interfaceC0751a.a(com.taobao.pha.core.p.b().x().b());
            } else {
                interfaceC0751a.a(PHAErrorType.CONFIG_ERROR, "Configure is not enabled.");
            }
        }

        private static void h(AppController appController, JSONObject jSONObject, a.InterfaceC0751a interfaceC0751a) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("827f67aa", new Object[]{appController, jSONObject, interfaceC0751a});
                return;
            }
            boolean h = com.taobao.pha.core.p.c().h();
            nex x = com.taobao.pha.core.p.b().x();
            if (h) {
                if (x.b(jSONObject)) {
                    interfaceC0751a.a(null);
                    return;
                } else {
                    interfaceC0751a.a(PHAErrorType.CLIENT_ERROR, "Failed because of empty params or invalid request url");
                    return;
                }
            }
            interfaceC0751a.a(PHAErrorType.CONFIG_ERROR, "Configure is not enabled.");
        }
    }
}
