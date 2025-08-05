package com.taobao.android.fluid.framework;

import android.content.Context;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.q;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.android.fluid.d;
import com.taobao.android.fluid.framework.adapter.AppMonitorAdapter;
import com.taobao.android.fluid.framework.adapter.EnvAdapter;
import com.taobao.android.fluid.framework.adapter.HttpNetAdapter;
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
import com.taobao.android.fluid.framework.adapter.LocationAdapter;
import com.taobao.android.fluid.framework.adapter.LoginAdapter;
import com.taobao.android.fluid.framework.adapter.NavAdapter;
import com.taobao.android.fluid.framework.adapter.ShareAdapter;
import com.taobao.android.fluid.framework.adapter.UTAdapter;
import com.taobao.android.fluid.framework.adapter.image.ImageAdapter;
import com.taobao.android.fluid.framework.adapter.mtop.MTopAdapter;
import com.taobao.android.fluid.framework.adapter.remoteconfig.RemoteConfigAdapter;
import com.taobao.android.fluid.framework.deprecated.message.module.ShortVideoJsBridge;
import com.taobao.android.fluid.framework.deprecated.message.module.ShortVideoTNodeModule;
import com.taobao.android.fluid.framework.deprecated.message.module.ShortVideoWeexV2Module;
import com.taobao.android.fluid.framework.hostcontainer.tnode.component.FullPageAlbumComponent;
import com.taobao.android.fluid.framework.hostcontainer.tnode.component.FullPageAlbumSliderComponent;
import com.taobao.android.weex_framework.MUSEngine;
import com.taobao.avplayer.component.weex.WXInteractiveComponent;
import com.taobao.global.setting.SettingStateWVApiPlugin;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.common.WXException;
import java.io.Serializable;
import tb.kge;
import tb.obu;
import tb.spz;
import tb.sqc;

/* loaded from: classes5.dex */
public final class DefaultFluidInitialize implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String APP_NAME = "taobao";
    private static final String TAG = "DefaultFluidInitialize";
    private static boolean sIsInitialized;

    static {
        kge.a(-1146642430);
        kge.a(1028243835);
        sIsInitialized = false;
    }

    private DefaultFluidInitialize() {
    }

    public static void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{context});
            return;
        }
        spz.c(TAG, "Fluid SDK 初始化开始");
        if (sIsInitialized) {
            spz.c(TAG, "Fluid SDK 已经初始化完成，无需调用初始化方法");
            return;
        }
        try {
            d createFluidSDKConfig = createFluidSDKConfig(context);
            registerModule(createFluidSDKConfig.c());
            FluidSDK.init(createFluidSDKConfig);
            sIsInitialized = true;
            spz.c(TAG, "Fluid SDK 初始化成功, SDK 配置：" + createFluidSDKConfig);
        } catch (Exception e) {
            FluidException.throwException((FluidContext) null, FluidSDK.SDK_INIT_ERROR, e);
        }
    }

    private static void registerModule(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8554dc92", new Object[]{context});
            return;
        }
        spz.c(TAG, "Fluid SDK 注册跨端容器 Module 开始");
        spz.c(TAG, "注册 Weex module");
        try {
            WXSDKEngine.registerComponent("videoplus", WXInteractiveComponent.class);
        } catch (WXException e) {
            spz.a(TAG, "注册 Weex Module 失败", e);
        }
        MUSEngine.registerModule("tbShortVideoModuleV2", ShortVideoWeexV2Module.class);
        spz.c(TAG, "注册 WindVane Module");
        q.a("TBMyTaobaoSettingStateWVApiPlugin", (Class<? extends e>) SettingStateWVApiPlugin.class);
        q.a("tbShortVideoModule", (Class<? extends e>) ShortVideoJsBridge.class);
        spz.c(TAG, "注册 TNode Module");
        ab.b("$shortvideo", ShortVideoTNodeModule.class);
        spz.c(TAG, "注册 TNode Component");
        com.taobao.tao.flexbox.layoutmanager.core.e.a("fullpagealbum", FullPageAlbumComponent.class);
        com.taobao.tao.flexbox.layoutmanager.core.e.a("fullpagealbumslider", FullPageAlbumSliderComponent.class);
        spz.c(TAG, "Fluid SDK 注册跨端容器 Module 成功");
    }

    private static d createFluidSDKConfig(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("9173c6a6", new Object[]{context});
        }
        if (context == null) {
            context = obu.e();
        }
        return d.a().a(context).a("taobao").b(sqc.e()).a(sqc.f()).a(IEnvAdapter.class, new EnvAdapter()).a(IShareAdapter.class, new ShareAdapter()).a(IImageAdapter.class, new ImageAdapter()).a(ILoginAdapter.class, new LoginAdapter()).a(IAppMonitorAdapter.class, new AppMonitorAdapter()).a(IMTopAdapter.class, new MTopAdapter(obu.e())).a(IHttpNetAdapter.class, new HttpNetAdapter()).a(IRemoteConfigAdapter.class, new RemoteConfigAdapter()).a(INavAdapter.class, new NavAdapter()).a(IUTAdapter.class, new UTAdapter()).a(ILocationAdapter.class, new LocationAdapter()).a();
    }
}
