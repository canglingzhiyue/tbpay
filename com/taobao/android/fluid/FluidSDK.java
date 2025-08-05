package com.taobao.android.fluid;

import android.content.Context;
import android.net.Uri;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidInstance;
import com.taobao.android.fluid.core.FluidInstanceConfig;
import com.taobao.android.fluid.core.b;
import com.taobao.android.fluid.core.i;
import com.taobao.android.fluid.framework.DefaultFluidInitialize;
import com.taobao.android.fluid.framework.DefaultFluidInstance;
import com.taobao.android.fluid.framework.adapter.IAdapter;
import com.taobao.android.fluid.framework.adapter.IAppMonitorAdapter;
import com.taobao.android.fluid.framework.adapter.IEnvAdapter;
import com.taobao.android.fluid.framework.adapter.IHttpNetAdapter;
import com.taobao.android.fluid.framework.adapter.IImageAdapter;
import com.taobao.android.fluid.framework.adapter.ILocationAdapter;
import com.taobao.android.fluid.framework.adapter.ILoginAdapter;
import com.taobao.android.fluid.framework.adapter.IMTopAdapter;
import com.taobao.android.fluid.framework.adapter.INavAdapter;
import com.taobao.android.fluid.framework.adapter.IRemoteConfigAdapter;
import com.taobao.android.fluid.framework.adapter.IShareAdapter;
import com.taobao.android.fluid.framework.adapter.IUTAdapter;
import com.taobao.android.fluid.framework.deprecated.message.IMessageService;
import com.taobao.android.fluid.framework.preload.IPreloadService;
import com.taobao.tao.flexbox.layoutmanager.core.TNodeView;
import java.util.Map;
import tb.kge;
import tb.sot;
import tb.spx;
import tb.spy;
import tb.spz;
import tb.sqc;

/* loaded from: classes5.dex */
public final class FluidSDK {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FLUID_SDK_FLAG = "isFluidSDK";
    public static final String FLUID_SDK_FLAG_VALUE = "1";
    public static final b SDK_INIT_ERROR;
    public static final b SDK_NOT_INIT;
    private static final String TAG = "FluidSDK";
    public static final int TBVS_VERSION = 31;
    public static final int TYPE_HUITUI = 10;
    private static Map<String, IAdapter> sAdapterMap;
    private static String sAppName;
    private static String sAppVersion;
    private static Context sContext;
    private static final com.taobao.android.fluid.core.c sInstanceManager;
    private static boolean sIsBetaAppPackage;
    private static boolean sIsDebug;
    private static boolean sIsInitialized;
    private static final i sPreloadInstanceManager;

    public static double getFluidRemoteVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3df6773", new Object[0])).doubleValue();
        }
        return 8.0d;
    }

    static {
        kge.a(-18890136);
        SDK_NOT_INIT = new b("SDK-1", "SDK 未初始化");
        SDK_INIT_ERROR = new b("SDK-2", "SDK 初始化失败");
        sPreloadInstanceManager = new i();
        sInstanceManager = new com.taobao.android.fluid.core.c();
        sIsInitialized = false;
        ensureFluidSDKInit();
    }

    private FluidSDK() {
    }

    public static void init(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29cf349a", new Object[]{dVar});
        } else if (sIsInitialized) {
            spz.c("FluidSDK", "Fluid SDK 初始化完成");
        } else {
            if (dVar.c() != null) {
                sContext = dVar.c().getApplicationContext();
            }
            sAppName = dVar.e();
            sAppVersion = dVar.f();
            sIsBetaAppPackage = sqc.d();
            sIsDebug = dVar.d();
            sAdapterMap = dVar.b();
            sIsInitialized = true;
        }
    }

    public static FluidInstance createFluidInstance(FluidInstanceConfig fluidInstanceConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FluidInstance) ipChange.ipc$dispatch("80550358", new Object[]{fluidInstanceConfig});
        }
        String bizName = fluidInstanceConfig.getBizName();
        String preloadBizName = FluidInstanceConfig.getPreloadBizName(bizName);
        boolean isPreloadInstance = fluidInstanceConfig.isPreloadInstance();
        boolean isTabInstance = fluidInstanceConfig.isTabInstance();
        spz.c(i.TAG, "创建视频流实例，业务名称：" + bizName + "，预加载业务名称：" + preloadBizName + "，是否 TAB 实例：" + isTabInstance + "，是否预创建实例：" + isPreloadInstance);
        FluidInstance a2 = sPreloadInstanceManager.a(preloadBizName);
        if (a2 != null && isTabInstance && !a2.getInstanceConfig().isTabInstance()) {
            sPreloadInstanceManager.b(preloadBizName);
            a2.updateInstanceConfig(fluidInstanceConfig);
            sInstanceManager.a(bizName, a2);
            spz.c(i.TAG, a2 + " 复用预加载实例已找到，更新实例配置");
            return a2;
        }
        DefaultFluidInstance defaultFluidInstance = new DefaultFluidInstance(fluidInstanceConfig);
        spz.c(i.TAG, defaultFluidInstance + " 新的视频流实例已创建");
        if (isPreloadInstance) {
            sPreloadInstanceManager.a(preloadBizName, defaultFluidInstance);
        }
        if (isTabInstance) {
            sInstanceManager.a(bizName, defaultFluidInstance);
        }
        return defaultFluidInstance;
    }

    public static FluidInstance getFluidInstance(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FluidInstance) ipChange.ipc$dispatch("de98d784", new Object[]{str}) : sInstanceManager.a(str);
    }

    public static void removeFluidInstance(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4efb2aac", new Object[]{str});
        } else {
            sInstanceManager.b(str);
        }
    }

    public static void clearFluidInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25c942b9", new Object[0]);
        } else {
            sInstanceManager.a();
        }
    }

    public static FluidInstance getPreloadRecommendTabInstance(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FluidInstance) ipChange.ipc$dispatch("ee99654a", new Object[]{context});
        }
        FluidInstance a2 = sPreloadInstanceManager.a(i.BIZ_NAME_RECOMMEND_TAB);
        if (a2 != null) {
            return a2;
        }
        spz.c(i.TAG, "没有预加载实例，创建新的预加载推荐TAB视频流实例");
        return createFluidInstance(sot.INSTANCE.a(context));
    }

    public static void clearPreloadFluidInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9aa7dea", new Object[0]);
        } else {
            sPreloadInstanceManager.a();
        }
    }

    public static Context getContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("e1727078", new Object[0]) : sContext;
    }

    public static String getAppName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("92150ca3", new Object[0]) : sAppName;
    }

    public static String getAppVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("65f009ac", new Object[0]) : sAppVersion;
    }

    public static boolean isDebug() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3a59fb54", new Object[0])).booleanValue() : sIsDebug;
    }

    public static boolean isRelease() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b899ed88", new Object[0])).booleanValue() : !isDebug() && !sqc.g();
    }

    public static boolean isAppStorePackage() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cac50e7", new Object[0])).booleanValue() : !isBetaAppPackage();
    }

    public static boolean isBetaAppPackage() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d1a7b5ca", new Object[0])).booleanValue() : sIsBetaAppPackage;
    }

    public static IEnvAdapter getEnvAdapter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IEnvAdapter) ipChange.ipc$dispatch("d6d6a184", new Object[0]) : (IEnvAdapter) getAdapter(IEnvAdapter.class);
    }

    public static IShareAdapter getShareAdapter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IShareAdapter) ipChange.ipc$dispatch("cfd3fb28", new Object[0]) : (IShareAdapter) getAdapter(IShareAdapter.class);
    }

    public static IImageAdapter getImageAdapter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IImageAdapter) ipChange.ipc$dispatch("79607420", new Object[0]) : (IImageAdapter) getAdapter(IImageAdapter.class);
    }

    public static ILocationAdapter getLocationAdapter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ILocationAdapter) ipChange.ipc$dispatch("edbeffe2", new Object[0]) : (ILocationAdapter) getAdapter(ILocationAdapter.class);
    }

    public static ILoginAdapter getLoginAdapter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ILoginAdapter) ipChange.ipc$dispatch("8b01eb3c", new Object[0]) : (ILoginAdapter) getAdapter(ILoginAdapter.class);
    }

    public static IMTopAdapter getMTopAdapter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IMTopAdapter) ipChange.ipc$dispatch("b5f60982", new Object[0]) : (IMTopAdapter) getAdapter(IMTopAdapter.class);
    }

    public static IAppMonitorAdapter getAppMonitorAdapter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IAppMonitorAdapter) ipChange.ipc$dispatch("9dd0f1a2", new Object[0]) : (IAppMonitorAdapter) getAdapter(IAppMonitorAdapter.class);
    }

    public static IHttpNetAdapter getHttpNetAdapter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IHttpNetAdapter) ipChange.ipc$dispatch("e6f85714", new Object[0]) : (IHttpNetAdapter) getAdapter(IHttpNetAdapter.class);
    }

    public static IRemoteConfigAdapter getRemoteConfigAdapter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IRemoteConfigAdapter) ipChange.ipc$dispatch("6eb7e182", new Object[0]) : (IRemoteConfigAdapter) getAdapter(IRemoteConfigAdapter.class);
    }

    public static INavAdapter getNavAdapter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (INavAdapter) ipChange.ipc$dispatch("356e6670", new Object[0]) : (INavAdapter) getAdapter(INavAdapter.class);
    }

    public static IUTAdapter getUTAdapter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IUTAdapter) ipChange.ipc$dispatch("b7320362", new Object[0]) : (IUTAdapter) getAdapter(IUTAdapter.class);
    }

    public static void registerMessageHandler(String str, spx spxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("472854ac", new Object[]{str, spxVar});
            return;
        }
        FluidInstance fluidInstance = getFluidInstance(str);
        if (fluidInstance == null) {
            spz.c("FluidSDK", "注册 MessageHandler 失败，没有 bizName: " + str + " 对应的 FluidInstance");
            return;
        }
        IMessageService iMessageService = (IMessageService) fluidInstance.getService(IMessageService.class);
        if (iMessageService == null) {
            spz.c("FluidSDK", "注册 MessageHandler 失败，消息服务 IMessageService 未注册");
            return;
        }
        iMessageService.registerMessageHandler(spxVar);
        spz.c("FluidSDK", fluidInstance + " 注册 MessageHandler 成功, messageHandler: " + spxVar);
    }

    public static void unRegisterMessageHandler(String str, spx spxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29de2ce5", new Object[]{str, spxVar});
            return;
        }
        FluidInstance fluidInstance = getFluidInstance(str);
        if (fluidInstance == null) {
            spz.c("FluidSDK", "注销 MessageHandler 失败，没有 bizName: " + str + " 对应的 FluidInstance");
            return;
        }
        IMessageService iMessageService = (IMessageService) fluidInstance.getService(IMessageService.class);
        if (iMessageService == null) {
            spz.c("FluidSDK", "注销 MessageHandler 失败，消息服务 IMessageService 未注册");
            return;
        }
        iMessageService.unRegisterMessageHandler(spxVar);
        spz.c("FluidSDK", fluidInstance + " 注销 MessageHandler 成功, messageHandler: " + spxVar);
    }

    public static void sendMessage(String str, spy spyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("696bebe4", new Object[]{str, spyVar});
            return;
        }
        FluidInstance fluidInstance = getFluidInstance(str);
        if (fluidInstance == null) {
            spz.c("FluidSDK", "发送消息失败，没有 bizName: " + str + " 对应的 FluidInstance， 消息：" + spyVar);
            return;
        }
        IMessageService iMessageService = (IMessageService) fluidInstance.getService(IMessageService.class);
        if (iMessageService == null) {
            spz.c("FluidSDK", "发送消息失败，消息服务 IMessageService 未注册，消息：" + spyVar);
            return;
        }
        iMessageService.sendMessage(spyVar);
        spz.c("FluidSDK", fluidInstance + " 发送消息成功，消息：" + spyVar);
    }

    public static void doPreload(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8863546d", new Object[]{context, jSONObject});
            return;
        }
        FluidInstance preloadRecommendTabInstance = getPreloadRecommendTabInstance(context);
        if (preloadRecommendTabInstance == null) {
            return;
        }
        spz.c("FluidSDK", preloadRecommendTabInstance + " 执行 doPreload 成功");
        ((IPreloadService) preloadRecommendTabInstance.getService(IPreloadService.class)).doPreload(preloadRecommendTabInstance, context, jSONObject);
    }

    public static void startWarmUp(Context context, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d3f79c8", new Object[]{context, uri});
            return;
        }
        FluidInstance preloadRecommendTabInstance = getPreloadRecommendTabInstance(context);
        ((IPreloadService) preloadRecommendTabInstance.getService(IPreloadService.class)).startWarmUp(preloadRecommendTabInstance, context, uri);
        spz.c("FluidSDK", preloadRecommendTabInstance + " 执行 startWarmUp 成功");
    }

    public static JSONObject startRender(Context context, TNodeView tNodeView, Uri uri, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("36d23847", new Object[]{context, tNodeView, uri, str, new Boolean(z)});
        }
        FluidInstance preloadRecommendTabInstance = getPreloadRecommendTabInstance(context);
        if (preloadRecommendTabInstance == null) {
            return null;
        }
        spz.c("FluidSDK", preloadRecommendTabInstance + " 执行 startRender 成功");
        return ((IPreloadService) preloadRecommendTabInstance.getService(IPreloadService.class)).startRender(preloadRecommendTabInstance, context, tNodeView, uri, str, z);
    }

    public static void clearPreloadTaskForContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45fa45a", new Object[]{context});
            return;
        }
        FluidInstance preloadRecommendTabInstance = getPreloadRecommendTabInstance(context);
        if (preloadRecommendTabInstance != null) {
            spz.c("FluidSDK", preloadRecommendTabInstance + " 执行 clearPreloadTaskForContext 成功");
            ((IPreloadService) preloadRecommendTabInstance.getService(IPreloadService.class)).clearPreloadTaskForContext(preloadRecommendTabInstance, context);
        }
        clearFluidInstance();
        clearPreloadFluidInstance();
    }

    private static <T extends IAdapter> T getAdapter(Class<? extends IAdapter> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("587a8eff", new Object[]{cls});
        }
        String name = cls.getName();
        Map<String, IAdapter> map = sAdapterMap;
        if (map == null) {
            spz.c("FluidSDK", "查找 Adapter: " + cls.getName() + ", Fluid SDK 没有初始化");
            return null;
        }
        return (T) map.get(name);
    }

    private static void ensureFluidSDKInit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38791425", new Object[0]);
        } else if (sIsInitialized) {
            spz.c("FluidSDK", "FluidSDK 已经初始化，无需调用初始化方法");
        } else {
            spz.c("FluidSDK", "FluidSDK 未初始化，补充初始化 SDK");
            DefaultFluidInitialize.init(null);
        }
    }
}
