package com.alibaba.triver.triver_shop;

import android.os.Build;
import android.os.Looper;
import android.os.MessageQueue;
import android.taobao.windvane.extra.core.WVCore;
import android.taobao.windvane.jsbridge.q;
import android.util.Log;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.point.app.AppDestroyPoint;
import com.alibaba.ariver.app.api.point.app.AppResumePoint;
import com.alibaba.ariver.app.api.point.app.AppStartPoint;
import com.alibaba.ariver.integration.RVManifest;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.ariver.kernel.api.extension.ExtensionManager;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeDSL;
import com.alibaba.ariver.kernel.api.extension.registry.EmbedViewMetaInfo;
import com.alibaba.ariver.kernel.api.extension.registry.ExtensionMetaInfo;
import com.alibaba.ariver.kernel.api.remote.RemoteController;
import com.alibaba.ariver.kernel.api.security.AccessController;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.resource.api.appinfo.AppUpdaterFactory;
import com.alibaba.triver.basic.proxy.ILogNetworkPoint;
import com.alibaba.triver.cannal_engine.scene.TRWidgetMiniAppEmbedView;
import com.alibaba.triver.kernel.TriverEmbedViewProvider;
import com.alibaba.triver.point.InterceptShowErrorPoint;
import com.alibaba.triver.point.TriverOpenModeProxy;
import com.alibaba.triver.triver_shop.container.shopLoft.a;
import com.alibaba.triver.triver_shop.extension.ShopInterceptErrorExtension;
import com.alibaba.triver.triver_shop.extension.ShopLifecycleExtension;
import com.alibaba.triver.triver_shop.extension.ShopOpenModeExtension;
import com.alibaba.triver.triver_shop.extension.ShopPointExtension;
import com.alibaba.triver.triver_shop.jsapi.WVShopApiBridge;
import com.alibaba.triver.triver_shop.newShop.view.ShopView;
import com.alibaba.triver.triver_shop.preload.b;
import com.alibaba.triver.triver_shop.preload.g;
import com.alibaba.triver.triver_shop.tbsubscribe.EmbedSubscribeView;
import com.alibaba.triver.triver_shop.weexview.EmbedWeexView;
import com.alibaba.triver.triver_shop.wvjsbridge.WVAriverShopBridge;
import com.alibaba.triver.triver_shop.wxmodule.WXAriverShopModule;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import com.taobao.taolive.room.TBShopLiveEmbedView;
import com.taobao.themis.kernel.TMSTBOpenStart;
import com.taobao.weex.WXSDKEngine;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import tb.ceg;
import tb.cen;
import tb.kge;

/* loaded from: classes3.dex */
public class TBShopManifest implements RVManifest, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2123010629);
        kge.a(2046577265);
        kge.a(1028243835);
    }

    public AccessController getAccessController() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AccessController) ipChange.ipc$dispatch("6611d303", new Object[]{this});
        }
        return null;
    }

    public List<AppUpdaterFactory.Rule> getAppUpdaterRules() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("be3d0607", new Object[]{this});
        }
        return null;
    }

    public List<BridgeDSL> getBridgeDSLs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d0258f4b", new Object[]{this});
        }
        return null;
    }

    public Map<String, EmbedViewMetaInfo> getEmbedViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d6d904c7", new Object[]{this});
        }
        return null;
    }

    public RemoteController getRemoteController() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RemoteController) ipChange.ipc$dispatch("1aaae609", new Object[]{this});
        }
        return null;
    }

    public List<RVManifest.IProxyManifest> getProxies() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("e8baffca", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        try {
            WXSDKEngine.registerModule("ariver", WXAriverShopModule.class);
            q.a(RVConstants.TAG, (Class<? extends android.taobao.windvane.jsbridge.e>) WVAriverShopBridge.class);
            q.a("NShop", (Class<? extends android.taobao.windvane.jsbridge.e>) WVShopApiBridge.class);
            arrayList.add(new RVManifest.LazyProxyManifest(ILogNetworkPoint.class, new RVProxy.LazyGetter<ILogNetworkPoint>() { // from class: com.alibaba.triver.triver_shop.TBShopManifest.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r0v2, types: [com.alibaba.triver.basic.proxy.ILogNetworkPoint, java.lang.Object] */
                @Override // com.alibaba.ariver.kernel.common.RVProxy.LazyGetter
                public /* synthetic */ ILogNetworkPoint get() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("6352d3f5", new Object[]{this}) : a();
                }

                public ILogNetworkPoint a() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (ILogNetworkPoint) ipChange2.ipc$dispatch("84781d04", new Object[]{this}) : new ShopPointExtension();
                }
            }));
            TriverEmbedViewProvider.registerEmebedView(EmbedSubscribeView.TYPE, EmbedSubscribeView.class.getCanonicalName());
            TriverEmbedViewProvider.registerEmebedView("widget", TRWidgetMiniAppEmbedView.class.getCanonicalName());
            TriverEmbedViewProvider.registerEmebedView(EmbedWeexView.TYPE, EmbedWeexView.class.getCanonicalName());
            TriverEmbedViewProvider.registerEmebedView("shop-loft", a.class.getCanonicalName());
            Class<?> cls = Class.forName("com.taobao.taolive.room.TBShopLiveEmbedView");
            if (cls != null) {
                TriverEmbedViewProvider.registerEmebedView(TBShopLiveEmbedView.TYPE, cls.getCanonicalName());
            }
            arrayList.add(new RVManifest.LazyProxyManifest(TriverOpenModeProxy.class, new RVProxy.LazyGetter<TriverOpenModeProxy>() { // from class: com.alibaba.triver.triver_shop.TBShopManifest.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.alibaba.triver.point.TriverOpenModeProxy] */
                @Override // com.alibaba.ariver.kernel.common.RVProxy.LazyGetter
                public /* synthetic */ TriverOpenModeProxy get() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("6352d3f5", new Object[]{this}) : a();
                }

                public TriverOpenModeProxy a() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (TriverOpenModeProxy) ipChange2.ipc$dispatch("a6a3229", new Object[]{this}) : new ShopOpenModeExtension();
                }
            }));
            boolean a2 = TMSTBOpenStart.a();
            ceg.a("tms fast open : " + a2);
            Log.e(ShopView.SP_NAMESPACE, "tms fast open : " + a2);
            if (!a2 && cen.Companion.i() && Build.VERSION.SDK_INT >= 23) {
                Looper.getMainLooper().getQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: com.alibaba.triver.triver_shop.TBShopManifest.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.os.MessageQueue.IdleHandler
                    public boolean queueIdle() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ((Boolean) ipChange2.ipc$dispatch("b5e69690", new Object[]{this})).booleanValue();
                        }
                        try {
                            boolean isUCSupport = WVCore.getInstance().isUCSupport();
                            ceg.a("shop catch idle time, init : " + isUCSupport);
                            if (WVCore.getInstance().isUCSupport()) {
                                b.INSTANCE.a(Globals.getApplication());
                            }
                            Looper.getMainLooper().getQueue().removeIdleHandler(this);
                        } catch (Throwable th) {
                            ceg.a("shop web preload exception : " + th.getMessage());
                        }
                        return false;
                    }
                });
            }
            com.alibaba.triver.triver_shop.preload.e.INSTANCE.a(Globals.getApplication());
            if (cen.Companion.ag()) {
                g.Companion.b();
                g.Companion.a();
            }
        } catch (Throwable th) {
            RVLogger.w(Log.getStackTraceString(th));
        }
        return arrayList;
    }

    public List<RVManifest.BridgeExtensionManifest> getBridgeExtensions() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("6193300d", new Object[]{this}) : new ArrayList();
    }

    public List<ExtensionMetaInfo> getExtensions() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ead48a96", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ExtensionMetaInfo("ariver", "com.alibaba.triver.triver_shop.tbsubscribe.EmbedSubscribeView", Arrays.asList(AppStartPoint.class.getName(), AppResumePoint.class.getName(), AppDestroyPoint.class.getName())));
        arrayList.add(new ExtensionMetaInfo("triver", ShopLifecycleExtension.class.getName(), Arrays.asList(AppStartPoint.class.getName(), AppDestroyPoint.class.getName()), App.class));
        arrayList.add(new ExtensionMetaInfo("triver", ShopInterceptErrorExtension.class.getName(), Collections.singletonList(InterceptShowErrorPoint.class.getName())));
        return arrayList;
    }

    public List<RVManifest.ServiceBeanManifest> getServiceBeans(ExtensionManager extensionManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("a311f2af", new Object[]{this, extensionManager}) : new ArrayList();
    }
}
