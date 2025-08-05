package com.taobao.themis.inside;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.ability.basic.TMSClipboardBridge;
import com.taobao.themis.ability.basic.TMSDeviceBridge;
import com.taobao.themis.ability.basic.TMSDialogBridge;
import com.taobao.themis.ability.basic.TMSNavigatorBridge;
import com.taobao.themis.ability.basic.TMSSystemInfoBridge;
import com.taobao.themis.container.app.page.IContainerViewFactory;
import com.taobao.themis.container.splash.ISplashViewFactory;
import com.taobao.themis.inside.adapter.ABTestAdapter;
import com.taobao.themis.inside.adapter.DefaultApiInvokerChainFactory;
import com.taobao.themis.inside.adapter.DefaultContainerViewFactory;
import com.taobao.themis.inside.adapter.DefaultSplashViewFactory;
import com.taobao.themis.inside.adapter.DefaultWebAdapter;
import com.taobao.themis.inside.adapter.DeviceInfoAdapter;
import com.taobao.themis.inside.adapter.MtopAdapterImpl;
import com.taobao.themis.inside.adapter.TBDBProxyImpl;
import com.taobao.themis.inside.adapter.TLogAdapterImpl;
import com.taobao.themis.inside.adapter.TMSExecutorImpl;
import com.taobao.themis.inside.adapter.TMSImageImpl;
import com.taobao.themis.inside.adapter.TMSMegaAdapter;
import com.taobao.themis.inside.adapter.TMSMonitorImpl;
import com.taobao.themis.inside.adapter.TMSOrangeImpl;
import com.taobao.themis.inside.adapter.TMSRemoteLoggerImpl;
import com.taobao.themis.inside.adapter.TMSTransportAdapter;
import com.taobao.themis.inside.adapter.TMSUserTrackerImpl;
import com.taobao.themis.kernel.ability.register.AbilityType;
import com.taobao.themis.kernel.adapter.IABTestAdapter;
import com.taobao.themis.kernel.adapter.IApiInvokerChainFactory;
import com.taobao.themis.kernel.adapter.IConfigAdapter;
import com.taobao.themis.kernel.adapter.IDeviceInfoAdapter;
import com.taobao.themis.kernel.adapter.IImageAdapter;
import com.taobao.themis.kernel.adapter.IMegaAdapter;
import com.taobao.themis.kernel.adapter.IMonitorAdapter;
import com.taobao.themis.kernel.adapter.ITransportAdapter;
import com.taobao.themis.kernel.adapter.IUserTrackerAdapter;
import com.taobao.themis.kernel.db.TMSDBAdapter;
import com.taobao.themis.kernel.executor.IExecutorService;
import com.taobao.themis.kernel.logger.IRemoteLoggerAdapter;
import com.taobao.themis.kernel.metaInfo.appinfo.request.AppInfoDefaultRequestClient;
import com.taobao.themis.kernel.metaInfo.appinfo.request.IAppInfoRequestClient;
import com.taobao.themis.kernel.network.IMtopInnerAdapter;
import com.taobao.themis.web.runtime.IWebAdapter;
import java.util.ArrayList;
import java.util.List;
import tb.kge;
import tb.qpn;
import tb.qpt;

/* loaded from: classes9.dex */
public class b implements qpn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1381177676);
        kge.a(-63975639);
    }

    @Override // tb.qpn
    public List<qpn.f> getAdapters() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("475b7426", new Object[]{this});
        }
        qpt.a(new TLogAdapterImpl());
        ArrayList arrayList = new ArrayList();
        arrayList.add(new qpn.c(TMSDBAdapter.class, new com.taobao.themis.kernel.basic.b<TMSDBAdapter>() { // from class: com.taobao.themis.inside.b.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.taobao.themis.kernel.db.TMSDBAdapter] */
            @Override // com.taobao.themis.kernel.basic.b
            public /* synthetic */ TMSDBAdapter b() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("43b9c269", new Object[]{this}) : a();
            }

            public TMSDBAdapter a() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (TMSDBAdapter) ipChange2.ipc$dispatch("38053731", new Object[]{this}) : TBDBProxyImpl.getInstance();
            }
        }));
        arrayList.add(new qpn.c(IExecutorService.class, new com.taobao.themis.kernel.basic.b<IExecutorService>() { // from class: com.taobao.themis.inside.b.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r0v2, types: [com.taobao.themis.kernel.executor.IExecutorService, java.lang.Object] */
            @Override // com.taobao.themis.kernel.basic.b
            public /* synthetic */ IExecutorService b() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("43b9c269", new Object[]{this}) : a();
            }

            public IExecutorService a() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (IExecutorService) ipChange2.ipc$dispatch("90046de4", new Object[]{this}) : new TMSExecutorImpl();
            }
        }));
        arrayList.add(new qpn.c(IUserTrackerAdapter.class, new com.taobao.themis.kernel.basic.b<IUserTrackerAdapter>() { // from class: com.taobao.themis.inside.b.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r0v2, types: [com.taobao.themis.kernel.adapter.IUserTrackerAdapter, java.lang.Object] */
            @Override // com.taobao.themis.kernel.basic.b
            public /* synthetic */ IUserTrackerAdapter b() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("43b9c269", new Object[]{this}) : a();
            }

            public IUserTrackerAdapter a() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (IUserTrackerAdapter) ipChange2.ipc$dispatch("fad3eaae", new Object[]{this}) : new TMSUserTrackerImpl();
            }
        }));
        arrayList.add(new qpn.c(IMonitorAdapter.class, new com.taobao.themis.kernel.basic.b<IMonitorAdapter>() { // from class: com.taobao.themis.inside.b.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.taobao.themis.kernel.adapter.IMonitorAdapter] */
            @Override // com.taobao.themis.kernel.basic.b
            public /* synthetic */ IMonitorAdapter b() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("43b9c269", new Object[]{this}) : a();
            }

            public IMonitorAdapter a() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (IMonitorAdapter) ipChange2.ipc$dispatch("63fe649b", new Object[]{this}) : new TMSMonitorImpl();
            }
        }));
        arrayList.add(new qpn.c(IAppInfoRequestClient.class, new com.taobao.themis.kernel.basic.b<IAppInfoRequestClient>() { // from class: com.taobao.themis.inside.b.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.taobao.themis.kernel.metaInfo.appinfo.request.IAppInfoRequestClient] */
            @Override // com.taobao.themis.kernel.basic.b
            public /* synthetic */ IAppInfoRequestClient b() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("43b9c269", new Object[]{this}) : a();
            }

            public IAppInfoRequestClient a() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (IAppInfoRequestClient) ipChange2.ipc$dispatch("b7a29365", new Object[]{this}) : new AppInfoDefaultRequestClient();
            }
        }));
        arrayList.add(new qpn.c(IMtopInnerAdapter.class, new com.taobao.themis.kernel.basic.b<IMtopInnerAdapter>() { // from class: com.taobao.themis.inside.b.14
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.taobao.themis.kernel.network.IMtopInnerAdapter] */
            @Override // com.taobao.themis.kernel.basic.b
            public /* synthetic */ IMtopInnerAdapter b() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("43b9c269", new Object[]{this}) : a();
            }

            public IMtopInnerAdapter a() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (IMtopInnerAdapter) ipChange2.ipc$dispatch("c635c630", new Object[]{this}) : new MtopAdapterImpl();
            }
        }));
        arrayList.add(new qpn.c(IImageAdapter.class, new com.taobao.themis.kernel.basic.b<IImageAdapter>() { // from class: com.taobao.themis.inside.b.15
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r0v2, types: [com.taobao.themis.kernel.adapter.IImageAdapter, java.lang.Object] */
            @Override // com.taobao.themis.kernel.basic.b
            public /* synthetic */ IImageAdapter b() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("43b9c269", new Object[]{this}) : a();
            }

            public IImageAdapter a() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (IImageAdapter) ipChange2.ipc$dispatch("190450dc", new Object[]{this}) : new TMSImageImpl();
            }
        }));
        arrayList.add(new qpn.c(IConfigAdapter.class, new com.taobao.themis.kernel.basic.b<IConfigAdapter>() { // from class: com.taobao.themis.inside.b.16
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.taobao.themis.kernel.adapter.IConfigAdapter] */
            @Override // com.taobao.themis.kernel.basic.b
            public /* synthetic */ IConfigAdapter b() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("43b9c269", new Object[]{this}) : a();
            }

            public IConfigAdapter a() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (IConfigAdapter) ipChange2.ipc$dispatch("8ce73739", new Object[]{this}) : new TMSOrangeImpl();
            }
        }));
        arrayList.add(new qpn.c(IRemoteLoggerAdapter.class, new com.taobao.themis.kernel.basic.b<IRemoteLoggerAdapter>() { // from class: com.taobao.themis.inside.b.17
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r0v2, types: [com.taobao.themis.kernel.logger.IRemoteLoggerAdapter, java.lang.Object] */
            @Override // com.taobao.themis.kernel.basic.b
            public /* synthetic */ IRemoteLoggerAdapter b() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("43b9c269", new Object[]{this}) : a();
            }

            public IRemoteLoggerAdapter a() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (IRemoteLoggerAdapter) ipChange2.ipc$dispatch("d75cb92a", new Object[]{this}) : new TMSRemoteLoggerImpl();
            }
        }));
        arrayList.add(new qpn.c(ITransportAdapter.class, new com.taobao.themis.kernel.basic.b<ITransportAdapter>() { // from class: com.taobao.themis.inside.b.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.taobao.themis.kernel.adapter.ITransportAdapter] */
            @Override // com.taobao.themis.kernel.basic.b
            public /* synthetic */ ITransportAdapter b() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("43b9c269", new Object[]{this}) : a();
            }

            public ITransportAdapter a() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (ITransportAdapter) ipChange2.ipc$dispatch("da991e2a", new Object[]{this}) : new TMSTransportAdapter();
            }
        }));
        arrayList.add(new qpn.c(IApiInvokerChainFactory.class, new com.taobao.themis.kernel.basic.b<IApiInvokerChainFactory>() { // from class: com.taobao.themis.inside.b.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.taobao.themis.kernel.adapter.IApiInvokerChainFactory] */
            @Override // com.taobao.themis.kernel.basic.b
            public /* synthetic */ IApiInvokerChainFactory b() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("43b9c269", new Object[]{this}) : a();
            }

            public IApiInvokerChainFactory a() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (IApiInvokerChainFactory) ipChange2.ipc$dispatch("4fbdd407", new Object[]{this}) : new DefaultApiInvokerChainFactory();
            }
        }));
        arrayList.add(new qpn.c(IDeviceInfoAdapter.class, new com.taobao.themis.kernel.basic.b<IDeviceInfoAdapter>() { // from class: com.taobao.themis.inside.b.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.taobao.themis.kernel.adapter.IDeviceInfoAdapter] */
            @Override // com.taobao.themis.kernel.basic.b
            public /* synthetic */ IDeviceInfoAdapter b() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("43b9c269", new Object[]{this}) : a();
            }

            public IDeviceInfoAdapter a() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (IDeviceInfoAdapter) ipChange2.ipc$dispatch("9a72109b", new Object[]{this}) : new DeviceInfoAdapter();
            }
        }));
        arrayList.add(new qpn.c(ISplashViewFactory.class, new com.taobao.themis.kernel.basic.b<ISplashViewFactory>() { // from class: com.taobao.themis.inside.b.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.taobao.themis.container.splash.ISplashViewFactory] */
            @Override // com.taobao.themis.kernel.basic.b
            public /* synthetic */ ISplashViewFactory b() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("43b9c269", new Object[]{this}) : a();
            }

            public ISplashViewFactory a() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (ISplashViewFactory) ipChange2.ipc$dispatch("cb01a700", new Object[]{this}) : new DefaultSplashViewFactory();
            }
        }));
        arrayList.add(new qpn.c(IContainerViewFactory.class, new com.taobao.themis.kernel.basic.b<IContainerViewFactory>() { // from class: com.taobao.themis.inside.b.10
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.taobao.themis.container.app.page.IContainerViewFactory] */
            @Override // com.taobao.themis.kernel.basic.b
            public /* synthetic */ IContainerViewFactory b() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("43b9c269", new Object[]{this}) : a();
            }

            public IContainerViewFactory a() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (IContainerViewFactory) ipChange2.ipc$dispatch("6a68721e", new Object[]{this}) : new DefaultContainerViewFactory();
            }
        }));
        arrayList.add(new qpn.c(IMegaAdapter.class, new com.taobao.themis.kernel.basic.b<IMegaAdapter>() { // from class: com.taobao.themis.inside.b.11
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r0v2, types: [com.taobao.themis.kernel.adapter.IMegaAdapter, java.lang.Object] */
            @Override // com.taobao.themis.kernel.basic.b
            public /* synthetic */ IMegaAdapter b() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("43b9c269", new Object[]{this}) : a();
            }

            public IMegaAdapter a() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (IMegaAdapter) ipChange2.ipc$dispatch("5413df29", new Object[]{this}) : new TMSMegaAdapter();
            }
        }));
        arrayList.add(new qpn.c(IWebAdapter.class, new com.taobao.themis.kernel.basic.b<IWebAdapter>() { // from class: com.taobao.themis.inside.b.12
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.taobao.themis.web.runtime.IWebAdapter] */
            @Override // com.taobao.themis.kernel.basic.b
            public /* synthetic */ IWebAdapter b() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("43b9c269", new Object[]{this}) : a();
            }

            public IWebAdapter a() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (IWebAdapter) ipChange2.ipc$dispatch("df34edd", new Object[]{this}) : new DefaultWebAdapter();
            }
        }));
        arrayList.add(new qpn.c(IABTestAdapter.class, new com.taobao.themis.kernel.basic.b<IABTestAdapter>() { // from class: com.taobao.themis.inside.b.13
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r0v2, types: [com.taobao.themis.kernel.adapter.IABTestAdapter, java.lang.Object] */
            @Override // com.taobao.themis.kernel.basic.b
            public /* synthetic */ IABTestAdapter b() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("43b9c269", new Object[]{this}) : a();
            }

            public IABTestAdapter a() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (IABTestAdapter) ipChange2.ipc$dispatch("918c0f2a", new Object[]{this}) : new ABTestAdapter();
            }
        }));
        return arrayList;
    }

    @Override // tb.qpn
    public List<qpn.e> getAbilities() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("cec13d0e", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new qpn.b(TMSClipboardBridge.class, AbilityType.GLOBAL));
        arrayList.add(new qpn.b(TMSDialogBridge.class, AbilityType.GLOBAL));
        arrayList.add(new qpn.b(TMSNavigatorBridge.class, AbilityType.INSTANCE));
        arrayList.add(new qpn.b(TMSSystemInfoBridge.class, AbilityType.SUBPAGE));
        arrayList.add(new qpn.b(TMSDeviceBridge.class, AbilityType.GLOBAL));
        return arrayList;
    }
}
