package com.alipay.mobile.monitor.track.spm;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import com.alipay.android.phone.wallet.spmtracker.Constant;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.draft.DraftMediaHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@MpaasClassInfo(BundleName = "android-phone-wallet-spmtracker", ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-spmtracker")
/* loaded from: classes3.dex */
public enum TrackerHelper {
    instance;
    

    /* renamed from: a  reason: collision with root package name */
    private final String f5764a = TrackerHelper.class.getSimpleName();
    private final String b = "?";
    private final String c = "=";
    private final String d = "&";
    private Map<String, TrackerParams> e = new ConcurrentHashMap();
    private List<String> f = new ArrayList<String>() { // from class: com.alipay.mobile.monitor.track.spm.TrackerHelper.1
        {
            add("a14.b62");
            add("a13.b42");
            add("a18.b64");
            add("a108.b553");
            add("a315.b3675");
            add("a21.b375");
        }
    };

    @MpaasClassInfo(BundleName = "android-phone-wallet-spmtracker", ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-spmtracker")
    /* loaded from: classes3.dex */
    public static class TrackerParams {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String chInfo;
        public String lanInfo;
        public String pageBack = "0";
        public String srcSem;

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "chInfo:" + this.chInfo + ";srcSem:" + this.srcSem + ";lanInfo:" + this.lanInfo + ";";
        }
    }

    TrackerHelper(String str) {
    }

    private static String a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str3) || TextUtils.isEmpty(str2)) {
            return str;
        }
        if (!str.contains("?")) {
            return str + "?" + str2 + "=" + str3;
        }
        if (str.contains("&" + str2 + "=")) {
            return str;
        }
        return str + "&" + str2 + "=" + str3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000e, code lost:
        if (r1 != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 0
            boolean r1 = r5 instanceof android.app.Activity     // Catch: java.lang.Exception -> L70
            java.lang.String r2 = "chInfo"
            if (r1 == 0) goto L15
            r1 = r5
            android.app.Activity r1 = (android.app.Activity) r1     // Catch: java.lang.Exception -> L70
            android.content.Intent r1 = r1.getIntent()     // Catch: java.lang.Exception -> L70
            if (r1 == 0) goto L3c
        L10:
            android.os.Bundle r0 = r1.getExtras()     // Catch: java.lang.Exception -> L70
            goto L3c
        L15:
            boolean r1 = r5 instanceof android.support.v4.app.Fragment     // Catch: java.lang.Exception -> L70
            if (r1 == 0) goto L3c
            r0 = r5
            android.support.v4.app.Fragment r0 = (android.support.v4.app.Fragment) r0     // Catch: java.lang.Exception -> L70
            android.os.Bundle r0 = r0.getArguments()     // Catch: java.lang.Exception -> L70
            if (r0 == 0) goto L2c
            java.lang.String r1 = r0.getString(r2)     // Catch: java.lang.Exception -> L70
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L70
            if (r1 == 0) goto L3c
        L2c:
            r1 = r5
            android.support.v4.app.Fragment r1 = (android.support.v4.app.Fragment) r1     // Catch: java.lang.Exception -> L70
            android.support.v4.app.FragmentActivity r1 = r1.getActivity()     // Catch: java.lang.Exception -> L70
            if (r1 == 0) goto L3c
            android.content.Intent r1 = r1.getIntent()     // Catch: java.lang.Exception -> L70
            if (r1 == 0) goto L3c
            goto L10
        L3c:
            if (r0 == 0) goto L6f
            java.lang.Class r1 = r5.getClass()     // Catch: java.lang.Exception -> L70
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch: java.lang.Exception -> L70
            r0.setClassLoader(r1)     // Catch: java.lang.Exception -> L70
            java.lang.String r1 = r0.getString(r2)     // Catch: java.lang.Exception -> L70
            java.lang.String r2 = "srcSem"
            java.lang.String r2 = r0.getString(r2)     // Catch: java.lang.Exception -> L70
            java.lang.String r3 = "laninfo"
            java.lang.String r0 = r0.getString(r3)     // Catch: java.lang.Exception -> L70
            com.alipay.mobile.monitor.track.spm.TrackerHelper$TrackerParams r3 = new com.alipay.mobile.monitor.track.spm.TrackerHelper$TrackerParams     // Catch: java.lang.Exception -> L70
            r3.<init>()     // Catch: java.lang.Exception -> L70
            r3.chInfo = r1     // Catch: java.lang.Exception -> L70
            r3.srcSem = r2     // Catch: java.lang.Exception -> L70
            r3.lanInfo = r0     // Catch: java.lang.Exception -> L70
            java.util.Map<java.lang.String, com.alipay.mobile.monitor.track.spm.TrackerHelper$TrackerParams> r0 = r4.e     // Catch: java.lang.Exception -> L70
            java.lang.String r5 = com.alipay.mobile.monitor.track.spm.SpmUtils.objectToString(r5)     // Catch: java.lang.Exception -> L70
            r0.put(r5, r3)     // Catch: java.lang.Exception -> L70
        L6f:
            return
        L70:
            r5 = move-exception
            java.lang.String r0 = r4.f5764a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "parseTrackerParam exception:"
            r1.<init>(r2)
            java.lang.String r5 = r5.toString()
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            com.alipay.mobile.monitor.track.spm.SpmLogCator.warn(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.monitor.track.spm.TrackerHelper.a(java.lang.Object):void");
    }

    private void b(Object obj) {
        Bundle bundle = null;
        if (obj instanceof Activity) {
            Intent intent = ((Activity) obj).getIntent();
            if (intent != null) {
                bundle = intent.getExtras();
            }
        } else if (obj instanceof Fragment) {
            bundle = ((Fragment) obj).getArguments();
        }
        String str = "";
        if (bundle != null) {
            try {
                bundle.setClassLoader(obj.getClass().getClassLoader());
                str = bundle.getString("srcSpm");
            } catch (Exception e) {
                String str2 = this.f5764a;
                SpmLogCator.warn(str2, "checkSrcSpm exception:" + e.toString());
            }
        }
        if (TextUtils.isEmpty(str)) {
            PageInfo c = c(obj);
            if (c == null) {
                return;
            }
            str = TextUtils.isEmpty(c.lastClickSpm) ? c.spm : c.lastClickSpm;
        }
        updateSrcSpm(obj, str);
    }

    private static PageInfo c(Object obj) {
        PageInfo g2 = g(obj);
        if (g2 != null) {
            return g2.referPageInfo;
        }
        return null;
    }

    private void d(Object obj) {
        TrackerParams trackerParams = this.e.get(SpmUtils.objectToString(obj));
        if (trackerParams != null) {
            trackerParams.chInfo = null;
        }
    }

    private void e(Object obj) {
        String objectToString = SpmUtils.objectToString(obj);
        if (this.e.containsKey(objectToString)) {
            this.e.remove(objectToString);
        }
    }

    private boolean f(Object obj) {
        if (obj != null && SpmMonitor.INTANCE.getTopPage() != null) {
            if ("com.alipay.android.launcher.core.IBaseWidgetGroup".equals(obj.getClass().getSuperclass().getName()) && "com.alipay.android.launcher.core.IBaseWidgetGroup".equals(SpmMonitor.INTANCE.getTopPage().getClass().getSuperclass().getName())) {
                return true;
            }
            PageInfo pageInfoByView = SpmTrackIntegrator.getInstance().getPageInfoByView(obj);
            PageInfo pageMonitorCurrentPageInfo = SpmTrackIntegrator.getInstance().getPageMonitorCurrentPageInfo();
            if (pageMonitorCurrentPageInfo != null && pageInfoByView != null && this.f.contains(pageInfoByView.spm) && this.f.contains(pageMonitorCurrentPageInfo.spm)) {
                return true;
            }
        }
        return false;
    }

    private static PageInfo g(Object obj) {
        return SpmTrackIntegrator.getInstance().getPageInfoByView(h(obj));
    }

    private static Object h(Object obj) {
        return ((obj instanceof Activity) || !(obj instanceof ContextThemeWrapper) || SpmTrackIntegrator.getInstance().getPageInfoByView(obj) != null) ? obj : ((ContextThemeWrapper) obj).getBaseContext();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void checkIsPageBack(Object obj) {
        PageInfo pageInfoByView = SpmTrackIntegrator.getInstance().getPageInfoByView(obj);
        PageInfo pageMonitorCurrentPageInfo = SpmTrackIntegrator.getInstance().getPageMonitorCurrentPageInfo();
        TrackerParams trackerParams = getTrackerParams(obj);
        if (trackerParams == null) {
            trackerParams = new TrackerParams();
            this.e.put(SpmUtils.objectToString(obj), trackerParams);
        }
        trackerParams.pageBack = (pageMonitorCurrentPageInfo == null || pageInfoByView == null || pageMonitorCurrentPageInfo.referPageInfo == null || !pageMonitorCurrentPageInfo.referPageInfo.pageId.equals(pageInfoByView.pageId) || f(obj)) ? "0" : "1";
    }

    public final String getLastClickSem(Object obj) {
        SpmLogCator.debug(this.f5764a, "getLastClickSemInfo page:".concat(String.valueOf(obj)));
        PageInfo g2 = g(obj);
        if (g2 != null) {
            String str = this.f5764a;
            SpmLogCator.debug(str, "getLastClickSemInfo pageInfo.lastClickSem:" + g2.lastClickSem);
            return g2.lastClickSem == null ? "" : g2.lastClickSem;
        }
        return "";
    }

    public final String getLastClickSpmId() {
        String lastClickViewSpm = SpmTrackIntegrator.getInstance().getLastClickViewSpm();
        return TextUtils.isEmpty(lastClickViewSpm) ? "" : lastClickViewSpm;
    }

    public final String getLastClickSpmIdByPage(Object obj) {
        PageInfo g2 = g(obj);
        return g2 != null ? g2.lastClickSpm : "";
    }

    public final String getLastSpmIdOfTopPage() {
        return getLastClickSpmIdByPage(SpmMonitor.INTANCE.getTopPage());
    }

    @Deprecated
    public final String getMiniPageId(Object obj) {
        PageInfo g2 = g(obj);
        return (g2 == null || g2.miniPageId == null) ? "C_NULL" : g2.miniPageId;
    }

    public final String getPageChInfo(Object obj) {
        TrackerParams trackerParams = this.e.get(SpmUtils.objectToString(obj));
        if (trackerParams == null) {
            return null;
        }
        return trackerParams.chInfo;
    }

    public final String getPageId(Object obj) {
        PageInfo g2 = g(obj);
        if (g2 != null) {
            String str = this.f5764a;
            SpmLogCator.debug(str, "getPageId pageId:" + g2.pageId);
            return g2.pageId == null ? "C_NULL" : g2.pageId;
        }
        return "C_NULL";
    }

    public final String getPageSpm(Object obj) {
        PageInfo g2 = g(obj);
        return g2 != null ? g2.spm : "";
    }

    public final String getReferSpm(Object obj) {
        PageInfo g2 = g(obj);
        return (g2 == null || g2.referClickSpm == null) ? "" : g2.referClickSpm;
    }

    public final String getSrcSem(Object obj) {
        if (obj == null) {
            return "";
        }
        String lastClickSem = getLastClickSem(obj);
        if (!TextUtils.isEmpty(lastClickSem)) {
            return lastClickSem;
        }
        String str = this.f5764a;
        SpmLogCator.debug(str, "getSrcSem page:" + SpmUtils.objectToString(obj));
        TrackerParams trackerParams = this.e.get(SpmUtils.objectToString(obj));
        return (trackerParams == null || trackerParams.srcSem == null) ? "" : trackerParams.srcSem;
    }

    public final String getSrcSpm(Object obj) {
        PageInfo g2 = g(obj);
        return (g2 == null || g2.srcSpm == null) ? "" : g2.srcSpm;
    }

    public final Map<String, String> getTracerInfo(Object obj) {
        HashMap hashMap = new HashMap();
        PageInfo g2 = g(obj);
        if (g2 != null) {
            hashMap.put(Constant.HEADER_PAGETS, getMiniPageId(obj));
            hashMap.put("srcSpm", g2.srcSpm == null ? "" : g2.srcSpm);
        }
        hashMap.put("lastClickSpm", getLastClickSpmId());
        return hashMap;
    }

    public final TrackerParams getTrackerParams(Object obj) {
        return this.e.get(SpmUtils.objectToString(obj));
    }

    public final boolean isPageStarted(Object obj) {
        PageInfo g2 = g(obj);
        return g2 != null && !g2.isEnd;
    }

    public final String mergeTrackerParamToUrl(String str) {
        String lastSpmIdOfTopPage = getLastSpmIdOfTopPage();
        if (!TextUtils.isEmpty(lastSpmIdOfTopPage)) {
            str = a(str, "srcSpm", lastSpmIdOfTopPage);
        }
        String srcSem = getSrcSem(SpmMonitor.INTANCE.getTopPage());
        return !TextUtils.isEmpty(srcSem) ? a(str, Constant.KEY_SRC_SEM, srcSem) : str;
    }

    public final void onPageCreate(Object obj) {
        a(obj);
        b(obj);
    }

    public final void onPageDestroy(Object obj) {
        e(obj);
    }

    public final void onPagePause(Object obj) {
        d(obj);
    }

    public final void onPageResume(Object obj) {
        PageInfo g2 = g(obj);
        if (g2 == null || !TextUtils.isEmpty(g2.srcSpm)) {
            return;
        }
        b(obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setHomePageTabSpms(List<String> list) {
        if (list != null) {
            this.f = list;
        }
    }

    @Deprecated
    public final void upateSrcSpm(Object obj, String str) {
        updateSrcSpm(obj, str);
    }

    public final void updateSrcSpm(Object obj, String str) {
        PageInfo g2 = g(obj);
        if (g2 != null) {
            g2.srcSpm = str;
        }
    }
}
