package com.taobao.mytaobao.base;

import android.taobao.mulitenv.EnvironmentSwitcher;
import com.alibaba.ability.impl.performance.PerformanceAbility;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.util.SharedPreferencesUtil;
import com.taobao.mytaobao.basement.BasementConstants;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.t;
import kotlin.reflect.k;
import tb.gbg;
import tb.kge;
import tb.mtp;
import tb.mxz;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u0007\n\u0002\b\u001d\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\\\u001a\u00020]H\u0002J\b\u0010^\u001a\u00020\u0004H\u0007J\b\u0010_\u001a\u00020\u0004H\u0007J\b\u0010`\u001a\u00020\u0004H\u0007J\b\u0010a\u001a\u00020\u0004H\u0007J\b\u0010b\u001a\u00020\u0004H\u0007J\u0012\u0010c\u001a\u00020]2\b\u0010d\u001a\u0004\u0018\u00010eH\u0007R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0007R\u0012\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R&\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u000f\u0010\u0002\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R&\u0010\u0014\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0015\u0010\u0002\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R&\u0010\u0018\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0019\u0010\u0002\u001a\u0004\b\u001a\u0010\u0011\"\u0004\b\u001b\u0010\u0013R&\u0010\u001c\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001d\u0010\u0002\u001a\u0004\b\u001e\u0010\u0011\"\u0004\b\u001f\u0010\u0013R!\u0010 \u001a\u00020\u00048FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b#\u0010$\u0012\u0004\b!\u0010\u0002\u001a\u0004\b\"\u0010\u0007R&\u0010'\u001a\u00020&2\u0006\u0010%\u001a\u00020&8\u0006@BX\u0087\u000e¢\u0006\u000e\n\u0000\u0012\u0004\b(\u0010\u0002\u001a\u0004\b)\u0010*R!\u0010+\u001a\u00020\u00048FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b.\u0010$\u0012\u0004\b,\u0010\u0002\u001a\u0004\b-\u0010\u0007R\u001b\u0010/\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010$\u001a\u0004\b0\u0010\u0007R!\u00102\u001a\u00020\u00048FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b5\u0010$\u0012\u0004\b3\u0010\u0002\u001a\u0004\b4\u0010\u0007R!\u00106\u001a\u00020\u00048FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b9\u0010$\u0012\u0004\b7\u0010\u0002\u001a\u0004\b8\u0010\u0007R!\u0010:\u001a\u00020\u00048FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b=\u0010$\u0012\u0004\b;\u0010\u0002\u001a\u0004\b<\u0010\u0007R#\u0010>\u001a\u0004\u0018\u00010?8FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\bC\u0010$\u0012\u0004\b@\u0010\u0002\u001a\u0004\bA\u0010BR\u0012\u0010D\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010E\u001a\u00020&8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R!\u0010F\u001a\u00020\u00048FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\bH\u0010$\u0012\u0004\bG\u0010\u0002\u001a\u0004\bF\u0010\u0007R!\u0010I\u001a\u00020\u00048FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\bK\u0010$\u0012\u0004\bJ\u0010\u0002\u001a\u0004\bI\u0010\u0007R!\u0010L\u001a\u00020\u00048FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\bN\u0010$\u0012\u0004\bM\u0010\u0002\u001a\u0004\bL\u0010\u0007R!\u0010O\u001a\u00020\u00048FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\bQ\u0010$\u0012\u0004\bP\u0010\u0002\u001a\u0004\bO\u0010\u0007R\u0014\u0010R\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R&\u0010S\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bT\u0010\u0002\u001a\u0004\bU\u0010\u0011\"\u0004\bV\u0010\u0013R!\u0010W\u001a\u00020\u00048FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\bZ\u0010$\u0012\u0004\bX\u0010\u0002\u001a\u0004\bY\u0010\u0007R\u0012\u0010[\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006f"}, d2 = {"Lcom/taobao/mytaobao/base/MtbGlobalEnv;", "", "()V", "apmBasement", "", "apmBasement$annotations", "getApmBasement", "()Z", "apmValidTest", "apmValidTest$annotations", "getApmValidTest", "basementApmStartTime", "", "basementBizType", "", "basementBizType$annotations", "getBasementBizType", "()Ljava/lang/String;", "setBasementBizType", "(Ljava/lang/String;)V", "basementPageType", "basementPageType$annotations", "getBasementPageType", "setBasementPageType", "basementPlaceHolderType", "basementPlaceHolderType$annotations", "getBasementPlaceHolderType", "setBasementPlaceHolderType", "basementVersion", "basementVersion$annotations", "getBasementVersion", "setBasementVersion", "defaultV24", "defaultV24$annotations", "getDefaultV24", "defaultV24$delegate", "Lkotlin/Lazy;", "<set-?>", "", "deviceLevel", "deviceLevel$annotations", PerformanceAbility.API_GET_DEVICE_LEVEL, "()I", "disableDxPreRenderV2", "disableDxPreRenderV2$annotations", "getDisableDxPreRenderV2", "disableDxPreRenderV2$delegate", "disablePermEvo", "getDisablePermEvo", "disablePermEvo$delegate", "disableUIRefreshOnPagePause", "disableUIRefreshOnPagePause$annotations", "getDisableUIRefreshOnPagePause", "disableUIRefreshOnPagePause$delegate", "enableBasementRefreshTwice", "enableBasementRefreshTwice$annotations", "getEnableBasementRefreshTwice", "enableBasementRefreshTwice$delegate", "fixRvLayoutCrash", "fixRvLayoutCrash$annotations", "getFixRvLayoutCrash", "fixRvLayoutCrash$delegate", "foldAspectRatio", "", "foldAspectRatio$annotations", "getFoldAspectRatio", "()Ljava/lang/Float;", "foldAspectRatio$delegate", "hasDeliverList", "hitDefaultV24Type", "isFoldDevice", "isFoldDevice$annotations", "isFoldDevice$delegate", "isGpPkg", "isGpPkg$annotations", "isGpPkg$delegate", "isPageV2", "isPageV2$annotations", "isPageV2$delegate", "isTablet", "isTablet$annotations", "isTablet$delegate", "lastNavUrl", "mtbVersion", "mtbVersion$annotations", "getMtbVersion", "setMtbVersion", "noTraceLog", "noTraceLog$annotations", "getNoTraceLog", "noTraceLog$delegate", "refreshBasement", "initDeviceInfo", "", "isFirstInstall", "isLandscape", "isLowDevice", "isOnlineEnv", "isOverSeaMode", "parseMTBVersion", "data", "Lcom/alibaba/fastjson/JSONObject;", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final c INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ k[] f18300a;
    private static final kotlin.d b;
    private static int c = 0;
    private static String d = null;
    public static boolean e = false;
    private static final kotlin.d f;
    private static final kotlin.d g;
    private static final boolean h;
    private static final kotlin.d i;
    private static final boolean j = false;
    public static int k;
    private static final kotlin.d l;
    public static boolean m;
    private static String n;
    private static String o;
    private static String p;
    private static String q;
    private static final kotlin.d r;
    private static final kotlin.d s;
    private static final kotlin.d t;
    private static final kotlin.d u;
    private static final kotlin.d v;
    public static long w;
    public static String x;
    private static final kotlin.d y;
    private static final kotlin.d z;

    public static final boolean c() {
        IpChange ipChange = $ipChange;
        return ((Boolean) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("5889b6e", new Object[0]) : f.getValue())).booleanValue();
    }

    public static final boolean f() {
        IpChange ipChange = $ipChange;
        return ((Boolean) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("5b2e1f1", new Object[0]) : i.getValue())).booleanValue();
    }

    public static final boolean i() {
        IpChange ipChange = $ipChange;
        return ((Boolean) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("5dd2874", new Object[0]) : g.getValue())).booleanValue();
    }

    public static final boolean p() {
        IpChange ipChange = $ipChange;
        return ((Boolean) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("63fccfb", new Object[0]) : l.getValue())).booleanValue();
    }

    public static final boolean q() {
        IpChange ipChange = $ipChange;
        return ((Boolean) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("64de47c", new Object[0]) : r.getValue())).booleanValue();
    }

    private final boolean s() {
        IpChange ipChange = $ipChange;
        return ((Boolean) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("66a137e", new Object[]{this}) : b.getValue())).booleanValue();
    }

    public static final boolean t() {
        IpChange ipChange = $ipChange;
        return ((Boolean) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("6782aff", new Object[0]) : t.getValue())).booleanValue();
    }

    public static final boolean u() {
        IpChange ipChange = $ipChange;
        return ((Boolean) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("6864280", new Object[0]) : s.getValue())).booleanValue();
    }

    public static final boolean v() {
        IpChange ipChange = $ipChange;
        return ((Boolean) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("6945a01", new Object[0]) : u.getValue())).booleanValue();
    }

    public static final Float w() {
        IpChange ipChange = $ipChange;
        return (Float) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("77cde9c7", new Object[0]) : v.getValue());
    }

    public static final boolean x() {
        IpChange ipChange = $ipChange;
        return ((Boolean) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("6b08903", new Object[0]) : y.getValue())).booleanValue();
    }

    public static final boolean y() {
        IpChange ipChange = $ipChange;
        return ((Boolean) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("6bea084", new Object[0]) : z.getValue())).booleanValue();
    }

    static {
        kge.a(-942260469);
        f18300a = new k[]{t.a(new PropertyReference1Impl(t.b(c.class), "disablePermEvo", "getDisablePermEvo()Z")), t.a(new PropertyReference1Impl(t.b(c.class), "noTraceLog", "getNoTraceLog()Z")), t.a(new PropertyReference1Impl(t.b(c.class), "fixRvLayoutCrash", "getFixRvLayoutCrash()Z")), t.a(new PropertyReference1Impl(t.b(c.class), "isTablet", "isTablet()Z")), t.a(new PropertyReference1Impl(t.b(c.class), "isFoldDevice", "isFoldDevice()Z")), t.a(new PropertyReference1Impl(t.b(c.class), "enableBasementRefreshTwice", "getEnableBasementRefreshTwice()Z")), t.a(new PropertyReference1Impl(t.b(c.class), "defaultV24", "getDefaultV24()Z")), t.a(new PropertyReference1Impl(t.b(c.class), "disableUIRefreshOnPagePause", "getDisableUIRefreshOnPagePause()Z")), t.a(new PropertyReference1Impl(t.b(c.class), "isPageV2", "isPageV2()Z")), t.a(new PropertyReference1Impl(t.b(c.class), "disableDxPreRenderV2", "getDisableDxPreRenderV2()Z")), t.a(new PropertyReference1Impl(t.b(c.class), "isGpPkg", "isGpPkg()Z")), t.a(new PropertyReference1Impl(t.b(c.class), "foldAspectRatio", "getFoldAspectRatio()Ljava/lang/Float;"))};
        c cVar = new c();
        INSTANCE = cVar;
        c = -1;
        b = kotlin.e.a(MtbGlobalEnv$disablePermEvo$2.INSTANCE);
        g = kotlin.e.a(MtbGlobalEnv$noTraceLog$2.INSTANCE);
        s = kotlin.e.a(MtbGlobalEnv$fixRvLayoutCrash$2.INSTANCE);
        f = kotlin.e.a(MtbGlobalEnv$isTablet$2.INSTANCE);
        r = kotlin.e.a(MtbGlobalEnv$isFoldDevice$2.INSTANCE);
        h = true;
        k = -1;
        i = kotlin.e.a(MtbGlobalEnv$enableBasementRefreshTwice$2.INSTANCE);
        l = kotlin.e.a(MtbGlobalEnv$defaultV24$2.INSTANCE);
        t = kotlin.e.a(MtbGlobalEnv$disableUIRefreshOnPagePause$2.INSTANCE);
        y = kotlin.e.a(MtbGlobalEnv$isPageV2$2.INSTANCE);
        z = kotlin.e.a(MtbGlobalEnv$disableDxPreRenderV2$2.INSTANCE);
        u = kotlin.e.a(MtbGlobalEnv$isGpPkg$2.INSTANCE);
        v = kotlin.e.a(MtbGlobalEnv$foldAspectRatio$2.INSTANCE);
        cVar.h();
    }

    private c() {
    }

    public static final int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[0])).intValue() : c;
    }

    public static final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else {
            d = str;
        }
    }

    public static final String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]) : d;
    }

    public static final String m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fe3ba4ac", new Object[0]) : n;
    }

    public static final String n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("84c15f4b", new Object[0]) : o;
    }

    public static final String l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("77b5ea0d", new Object[0]) : p;
    }

    public static final String o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b4719ea", new Object[0]) : q;
    }

    public static final boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue() : h;
    }

    public static final boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[0])).booleanValue() : j;
    }

    @JvmStatic
    public static final boolean j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[0])).booleanValue() : SharedPreferencesUtil.getIntSharedPreference("envType", SharedPreferencesUtil.getIntSharedPreference(EnvironmentSwitcher.SPKEY_ENV, 0)) == 0;
    }

    @JvmStatic
    public static final boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[0])).booleanValue();
        }
        int i2 = c;
        return (i2 == 0 || i2 == 1) ? false : true;
    }

    @JvmStatic
    public static final void a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        Long l2;
        Boolean bool;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{jSONObject});
            return;
        }
        String str = null;
        if (jSONObject != null) {
            try {
                jSONObject2 = jSONObject.getJSONObject(mtp.b.b);
            } catch (Throwable th) {
                TLog.loge("mtbMainLink", "parseMTBVersion error:" + th);
                return;
            }
        } else {
            jSONObject2 = null;
        }
        JSONObject jSONObject4 = jSONObject2 != null ? jSONObject2.getJSONObject("secScreenFragment") : null;
        d = jSONObject2 != null ? jSONObject2.getString("mytaobaoVersion") : null;
        n = jSONObject4 != null ? jSONObject4.getString("bizType") : null;
        o = jSONObject4 != null ? jSONObject4.getString("pageType") : null;
        p = (jSONObject4 == null || (jSONObject3 = jSONObject4.getJSONObject("bizParams")) == null) ? null : jSONObject3.getString("version");
        if (jSONObject4 != null) {
            str = jSONObject4.getString("placeHolderType");
        }
        q = str;
        if (jSONObject2 != null && (bool = jSONObject2.getBoolean("refreshBasement")) != null) {
            z2 = bool.booleanValue();
        }
        e = z2;
        long longValue = (jSONObject2 == null || (l2 = jSONObject2.getLong("mainInterfaceExpireTime")) == null) ? 0L : l2.longValue();
        if (longValue <= 0) {
            return;
        }
        mxz.f = longValue;
    }

    private final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        try {
            c = com.taobao.application.common.c.a().a("deviceLevel", -1);
            TLog.loge(BasementConstants.TAG, "initDeviceInfo, deviceLevel=" + c);
        } catch (Exception e2) {
            TLog.loge(BasementConstants.TAG, "initDeviceInfo, onException" + e2);
        }
    }

    @JvmStatic
    public static final boolean r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("65bfbfd", new Object[0])).booleanValue() : com.taobao.android.editionswitcher.b.d(Globals.getApplication());
    }

    @JvmStatic
    public static final boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue() : gbg.c(Globals.getApplication()) < gbg.b(Globals.getApplication());
    }
}
