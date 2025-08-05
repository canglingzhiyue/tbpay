package com.taobao.bootimage.interact.pop;

import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.linked.LinkedSplashData;
import com.taobao.utils.Global;
import tb.kej;
import tb.kel;
import tb.kge;
import tb.qnq;

/* loaded from: classes6.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CATEGORY_CONFIG_CHECK = "configCheck";
    public static final String CATEGORY_CONFIG_UPDATE = "configUpdate";
    public static final String CATEGORY_CONTAINER_LIFE_CYCLE = "containerLifeCycle";
    public static final String CATEGORY_LIFE_CYCLE = "sdkLifeCycle";
    public static final String CATEGORY_PAGE_LIFE_CYCLE = "pageLifeCycle";
    public static final String CATEGORY_TRIGGER_EVENT = "triggerEvent";
    public static final int TYPE_INTERACT_FAILED = 2;
    public static final int TYPE_INTERACT_SUCCESS = 1;
    public static final int TYPE_NOT_INTERACT = 0;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f16702a;

    static {
        kge.a(-1351957945);
        f16702a = false;
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        try {
            if (!kel.m) {
                return "ORANGE_CLOSE";
            }
            if (TextUtils.isEmpty(str)) {
                return "PARAM_INVALID";
            }
            qnq.a a2 = new qnq().a(str);
            if (a2 != null) {
                if (!BootImagePopMamaCommercialView.VIEW_TYPE.equals(a2.f32964a)) {
                    return "NOT_SUPPORT_VIEW_TYPE";
                }
                View view = a2.f;
                return (view != null || "true".equals(Boolean.valueOf(a2.d))) ? view instanceof BootImagePopMamaCommercialView ? ((BootImagePopMamaCommercialView) view).changeImg() ? "" : "EXPOSE_NOT_READY" : "LAYER_TYPE_ERROR" : "VIEW_NOT_CREATED";
            }
            kej.a("PopLayer.BootImagePopNaitveApi", "BootImagePopNaitveApi.notifyPopToChangeImg.popInfo= null");
            return "NO_REQUESTING_POP";
        } catch (Throwable th) {
            th.printStackTrace();
            return com.taobao.desktop.channel.calendar.a.CALENDAR_ERROR_CATCH;
        }
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        try {
            String c = c();
            kej.a("PopLayer.BootImagePopNaitveApi", "BootImagePopMamaCommercialView.checkMamaCommercialSplashCanStart.result= " + c);
            return c;
        } catch (Throwable th) {
            th.printStackTrace();
            return com.taobao.desktop.channel.calendar.a.CALENDAR_ERROR_CATCH;
        }
    }

    public static String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[0]);
        }
        String e = e();
        kej.a("PopLayer.BootImagePopNaitveApi", "BootImagePopMamaCommercialView.isMamaCommercialSplashHasRequestingPop.result= " + e);
        return e;
    }

    private static String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[0]);
        }
        try {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                return "NOT_MAIN_THREAD";
            }
            qnq qnqVar = new qnq();
            return !qnqVar.a() ? "SDK_NOT_READY" : !kel.p ? "ORANGE_DOWNGRADE" : qnqVar.b() ? "" : "NO_REQUESTING_POP";
        } catch (Throwable th) {
            th.printStackTrace();
            return com.taobao.desktop.channel.calendar.a.CALENDAR_ERROR_CATCH;
        }
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
        }
        try {
            if (!kel.m) {
                return "ORANGE_CLOSE";
            }
            String e = e(str);
            kej.a("PopLayer.BootImagePopNaitveApi", "BootImagePopMamaCommercialView.isMamaCommercialHasOtherLevelRequestingPop.result= " + e);
            return e;
        } catch (Throwable th) {
            th.printStackTrace();
            return com.taobao.desktop.channel.calendar.a.CALENDAR_ERROR_CATCH;
        }
    }

    public static String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82f346c", new Object[]{str});
        }
        try {
            if (!kel.m) {
                return "ORANGE_CLOSE";
            }
            String f = f(str);
            kej.a("PopLayer.BootImagePopNaitveApi", "BootImagePopMamaCommercialView.notifyPopToDisplay.indexId= " + str + ".result= " + f);
            return f;
        } catch (Throwable th) {
            kej.a("PopLayer.BootImagePopNaitveApi", "BootImagePopMamaCommercialView.notifyPopToDisplay.error= " + th.getMessage());
            th.printStackTrace();
            return com.taobao.desktop.channel.calendar.a.CALENDAR_ERROR_CATCH;
        }
    }

    public static String d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4d254b", new Object[]{str});
        }
        try {
            if (!kel.m) {
                return "ORANGE_CLOSE";
            }
            String g = g(str);
            kej.a("PopLayer.BootImagePopNaitveApi", "BootImagePopMamaCommercialView.isPopReadyToDisplay.indexId= " + str + ".result= " + g);
            return g;
        } catch (Throwable th) {
            th.printStackTrace();
            return com.taobao.desktop.channel.calendar.a.CALENDAR_ERROR_CATCH;
        }
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : f16702a;
    }

    private static String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[0]);
        }
        try {
            f16702a = false;
            if (Looper.myLooper() != Looper.getMainLooper()) {
                return "NOT_MAIN_THREAD";
            }
            qnq qnqVar = new qnq();
            return !qnqVar.a() ? "SDK_NOT_READY" : !kel.p ? "ORANGE_DOWNGRADE" : qnqVar.b() ? "HAS_REQUESTING_POP" : "";
        } catch (Throwable th) {
            th.printStackTrace();
            return com.taobao.desktop.channel.calendar.a.CALENDAR_ERROR_CATCH;
        }
    }

    private static String e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("666b162a", new Object[]{str});
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return "PARAM_INVALID";
            }
            if (Looper.myLooper() != Looper.getMainLooper()) {
                return "NOT_MAIN_THREAD";
            }
            qnq qnqVar = new qnq();
            if (!qnqVar.a()) {
                return "SDK_NOT_READY";
            }
            if (!kel.p) {
                return "ORANGE_DOWNGRADE";
            }
            qnq.a a2 = qnqVar.a(str);
            kej.a("PopLayer.BootImagePopNaitveApi", "BootImagePopMamaCommercialView.doIsMamaCommercialHasOtherLevelRequestingPop.popInfo= " + a2);
            if (a2 != null && !TextUtils.isEmpty(a2.c) && !TextUtils.isEmpty(a2.b)) {
                return qnqVar.b(a2.b) ? "" : "NO_OTHER_LAYER_POP";
            }
            return "NO_REQUESTING_POP";
        } catch (Throwable th) {
            th.printStackTrace();
            return com.taobao.desktop.channel.calendar.a.CALENDAR_ERROR_CATCH;
        }
    }

    private static String f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd890709", new Object[]{str});
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return "PARAM_INVALID";
            }
            f16702a = true;
            qnq.a a2 = new qnq().a(str);
            if (a2 == null) {
                return "NO_REQUESTING_POP";
            }
            if (!BootImagePopMamaCommercialView.VIEW_TYPE.equals(a2.f32964a)) {
                return "NOT_SUPPORT_VIEW_TYPE";
            }
            View view = a2.f;
            if (view == null && !"true".equals(Boolean.valueOf(a2.d))) {
                return "VIEW_NOT_CREATED";
            }
            if (!(view instanceof BootImagePopMamaCommercialView)) {
                return "LAYER_TYPE_ERROR";
            }
            kej.a("PopLayer.BootImagePopNaitveApi", "BootImagePopMamaCommercialView.doNotifyPopToDisplay. view = BootImagePopMamaCommercialView");
            return ((BootImagePopMamaCommercialView) view).notifyDisplay() ? "" : "EXPOSE_NOT_READY";
        } catch (Throwable th) {
            th.printStackTrace();
            return com.taobao.desktop.channel.calendar.a.CALENDAR_ERROR_CATCH;
        }
    }

    private static String g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("14a6f7e8", new Object[]{str});
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return "PARAM_INVALID";
            }
            qnq.a a2 = new qnq().a(str);
            if (a2 == null) {
                return "NO_REQUESTING_POP";
            }
            if (!BootImagePopMamaCommercialView.VIEW_TYPE.equals(a2.f32964a)) {
                return "NOT_SUPPORT_VIEW_TYPE";
            }
            View view = a2.f;
            if (view == null && !"true".equals(Boolean.valueOf(a2.d))) {
                return "VIEW_NOT_CREATED";
            }
            if (!(view instanceof BootImagePopMamaCommercialView)) {
                return "LAYER_TYPE_ERROR";
            }
            kej.a("PopLayer.BootImagePopNaitveApi", "BootImagePopMamaCommercialView.doIsPopReadyToDisplay. view = BootImagePopMamaCommercialView");
            return ((BootImagePopMamaCommercialView) view).isPopReadyToDisplay() ? "" : "EXPOSE_NOT_READY";
        } catch (Throwable th) {
            th.printStackTrace();
            return com.taobao.desktop.channel.calendar.a.CALENDAR_ERROR_CATCH;
        }
    }

    public static void a(String str, LinkedSplashData linkedSplashData) {
        qnq.a a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b1030fa", new Object[]{str, linkedSplashData});
        } else if (TextUtils.isEmpty(str) || (a2 = new qnq().a(str)) == null || !BootImagePopMamaCommercialView.VIEW_TYPE.equals(a2.f32964a)) {
        } else {
            View view = a2.f;
            if ((view == null && !"true".equals(Boolean.valueOf(a2.d))) || !(view instanceof BootImagePopMamaCommercialView)) {
                return;
            }
            kej.a("PopLayer.BootImagePopNaitveApi", "BootImagePopMamaCommercialView.loadAndRenderPop.");
            ((BootImagePopMamaCommercialView) view).init(Global.getApplication(), linkedSplashData);
        }
    }
}
