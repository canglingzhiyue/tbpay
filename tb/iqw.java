package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.f;
import com.taobao.tao.flexbox.layoutmanager.container.i;
import java.util.HashMap;

/* loaded from: classes5.dex */
public class iqw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String UT_PAGE_NAME = "Page_VideoCash";
    public static final String UT_VC_H5_LOAD_URL_SUCCEED_EVENT_NAME = "Page_VideoCash_H5LoadURLSucceed";
    public static final String UT_VC_H5_LOAD_URL_SUCCEED_EVENT_PROPERTY_COST_TIME = "costTime";
    public static final String UT_VC_H5_LOAD_URL_SUCCEED_EVENT_PROPERTY_FROM_INIT_WEB_VIEW_TIME = "fromInitWebViewTime";
    public static final String UT_VC_H5_LOAD_URL_SUCCEED_EVENT_PROPERTY_FROM_PAGE_START_TIME = "fromPageStartTime";
    public static final String UT_VC_H5_LOAD_URL_SUCCEED_EVENT_PROPERTY_URL = "url";
    private static Boolean c;

    /* renamed from: a  reason: collision with root package name */
    private boolean f29240a;
    private boolean b = true;

    static {
        kge.a(35644891);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : oeb.a("ShortVideo.enableGlobalVCH5", true);
    }

    public static boolean a(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8fc4079e", new Object[]{fluidContext})).booleanValue();
        }
        if (c(fluidContext) && a()) {
            z = true;
        }
        spz.c("InteractionServiceConfig", "isEnableGlobalVCH5 enable=" + z);
        return z;
    }

    public static boolean b(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f4da19f", new Object[]{fluidContext})).booleanValue();
        }
        if (spj.d(fluidContext) && a()) {
            z = true;
        }
        spz.c("InteractionServiceConfig", "isEnableGlobalVCH5Old enable=" + z);
        return z;
    }

    public static boolean a(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("258fda78", new Object[]{context, new Boolean(z)})).booleanValue();
        }
        String str = z ? "globalh5_mtop_prefetch_launcher" : "globalh5_mtop_prefetch";
        boolean a2 = i.a(context, str, false);
        spz.c("InteractionServiceConfig", "isEnableGlobalVCH5MtopPrefetch optKey:" + str + " enable:" + a2);
        return a2;
    }

    public static boolean c(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8ed73ba0", new Object[]{fluidContext})).booleanValue() : spj.a(fluidContext.getInstanceConfig().getTab3CardType());
    }

    public static int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5d", new Object[0])).intValue();
        }
        int orangeIntConfig = FluidSDK.getRemoteConfigAdapter().getOrangeIntConfig("globalVCH5LoadWaitingTime", 1000);
        spz.c("InteractionServiceConfig", "globalVCH5LoadWaitingTime waitingTime=" + orangeIntConfig);
        return orangeIntConfig;
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[0])).booleanValue();
        }
        boolean orangeBooleanConfig = FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("enableOpenWeexDSLV2", true);
        spz.c("InteractionServiceConfig", "isEnableWeexDSLV2 enable=" + orangeBooleanConfig);
        return orangeBooleanConfig;
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[0])).booleanValue() : oeb.a("ShortVideo.enableAutoUpScrollWeexRemoveFirstFrameRender", true);
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[0])).booleanValue() : oeb.a("ShortVideo.disableInterceptForH5", true);
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[0])).booleanValue() : oeb.a("ShortVideo.enableResetCardVideoView", true);
    }

    public static boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[0])).booleanValue() : oeb.a("ShortVideo.enableWeexNewGestureListener", true);
    }

    public static boolean r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("65bfbfd", new Object[0])).booleanValue() : oeb.a("ShortVideo.enableSetGlobalH5GoneWhenPageDisappear", true);
    }

    public static boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64de47c", new Object[0])).booleanValue();
        }
        if (c == null) {
            if (sqc.b()) {
                spz.c("InteractionServiceConfig", "是否开启Tab2全局互动，本地强制开启老版互动层");
                a(false, null, false);
                c = false;
                return false;
            }
            c = Boolean.valueOf(oeb.ah());
            Boolean bool = c;
            a(true, bool, bool);
            spz.c("InteractionServiceConfig", "是否开启Tab2全局互动，sEnableTab2GlobalInteract=" + c);
        }
        return c.booleanValue();
    }

    private static void a(Boolean bool, Boolean bool2, Boolean bool3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bce28105", new Object[]{bool, bool2, bool3});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("localEnable", String.valueOf(bool));
        hashMap.put("testEnable", String.valueOf(bool2));
        hashMap.put("result", String.valueOf(bool3));
        hashMap.put(FluidSDK.FLUID_SDK_FLAG, "1");
        hashMap.put(f.FLUID_SDK_REMOTE_VERSION, f.FLUID_SDK_REMOTE_VERSION_VALUE);
        spz.c("InteractionServiceConfig", "是否开启Tab2全局互动埋点，properties=" + hashMap);
        FluidSDK.getUTAdapter().trackCustom(UT_PAGE_NAME, "Page_VideoCash_EnableTab2GlobalInteract", hashMap);
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue() : this.b;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }

    public boolean m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6158678", new Object[]{this})).booleanValue() : this.f29240a;
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.f29240a = z;
        }
    }
}
