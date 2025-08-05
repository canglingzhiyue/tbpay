package com.taobao.themis.taobao.impl;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.ability_taobao.TMSAPMBridge;
import com.taobao.themis.ability_taobao.TMSEBizBridge;
import com.taobao.themis.ability_taobao.TMSPubBridge;
import com.taobao.themis.ability_taobao.TMSTBBizBridge;
import com.taobao.themis.ability_taobao.TMSTBLoginBridge;
import com.taobao.themis.ability_taobao.TMSTitleBarBridge;
import com.taobao.themis.ability_taobao.TMSUserTrackerBridge;
import com.taobao.themis.ability_taobao.share.TMSTBShareBridge;
import com.taobao.themis.container.app.page.IContainerViewFactory;
import com.taobao.themis.container.splash.ISplashViewFactory;
import com.taobao.themis.inside.adapter.DefaultTraceAdapter;
import com.taobao.themis.inside.adapter.TBDBProxyImpl;
import com.taobao.themis.kernel.ability.register.AbilityType;
import com.taobao.themis.kernel.adapter.IAccountAdapter;
import com.taobao.themis.kernel.adapter.IApiInvokerChainFactory;
import com.taobao.themis.kernel.adapter.IAudioContextFactory;
import com.taobao.themis.kernel.adapter.IBizLaunchAdapter;
import com.taobao.themis.kernel.adapter.IEnvironmentService;
import com.taobao.themis.kernel.adapter.IGlobalMenuAdapter;
import com.taobao.themis.kernel.adapter.IInstanceLifecycleAdapter;
import com.taobao.themis.kernel.adapter.INavigatorAdapter;
import com.taobao.themis.kernel.adapter.IShareAdapter;
import com.taobao.themis.kernel.adapter.ITraceAdapter;
import com.taobao.themis.kernel.db.TMSDBAdapter;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.utils.n;
import com.taobao.themis.open.ability.TMSBroadCastBridge;
import com.taobao.themis.open.ability.TMSCommonBridge;
import com.taobao.themis.open.ability.TMSMegaBridge;
import com.taobao.themis.open.ability.TMSSendMtopBridge;
import com.taobao.themis.open.ability.TMSStorageBridge;
import com.taobao.themis.open.ability.TMSSubPackageBridge;
import com.taobao.themis.open.ability.TMSVibrateBridge;
import com.taobao.themis.open.ability.TMSWebSocketBridge;
import com.taobao.themis.open.ability.audio.MegaPlayerInstance;
import com.taobao.themis.open.ability.audio.TMSForegroundAudioBridge;
import com.taobao.themis.open.ability.audio.TMSNewForegroundAudioBridge;
import com.taobao.themis.open.ability.calendar.TMSCalendarBridge;
import com.taobao.themis.open.ability.file.FSManagerBridge;
import com.taobao.themis.open.ability.file.TMSFileBridge;
import com.taobao.themis.open.ability.image.TMSImageBridge;
import com.taobao.themis.open.ability.network.TMSNetworkBridge;
import com.taobao.themis.open.permission.auth.TMSAuthBridge;
import com.taobao.themis.taobao.account.TMSAccountAdapter;
import com.taobao.themis.taobao.container.TBGlobalMenuAdapter;
import com.taobao.themis.taobao.container.TMSTBSplashViewFactory;
import com.taobao.themis.taobao.env.TBEnvironmentAdapterImpl;
import com.taobao.themis.taobao.lifecycle.TBInstanceLifecycleAdapter;
import com.taobao.themis.taobao.nav.TMSNavigatorAdapter;
import com.taobao.themis.taobao.share.TMSTBShareAdapter;
import com.taobao.themis.taobao.view.TMSTBContainerViewFactory;
import com.taobao.themis.web.runtime.IWebAdapter;
import com.taobao.themis.widget.TMSWidgetBridge;
import com.taobao.themis.widget.broadcast.TMSWidgetBroadcastBridge;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import tb.kge;
import tb.qpn;

/* loaded from: classes9.dex */
public class TBTMSManifest extends com.taobao.themis.inside.b implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-195991401);
        kge.a(1028243835);
    }

    public static /* synthetic */ Object ipc$super(TBTMSManifest tBTMSManifest, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -826196722) {
            if (hashCode != 1197175846) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            return super.getAdapters();
        }
        return super.getAbilities();
    }

    @Override // com.taobao.themis.inside.b, tb.qpn
    public List<qpn.f> getAdapters() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("475b7426", new Object[]{this});
        }
        List<qpn.f> adapters = super.getAdapters();
        if (adapters == null) {
            adapters = new ArrayList<>();
        }
        adapters.add(new qpn.c(TMSDBAdapter.class, new com.taobao.themis.kernel.basic.b<TMSDBAdapter>() { // from class: com.taobao.themis.taobao.impl.TBTMSManifest.1
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
        adapters.add(new qpn.c(IEnvironmentService.class, new com.taobao.themis.kernel.basic.b<IEnvironmentService>() { // from class: com.taobao.themis.taobao.impl.TBTMSManifest.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r0v2, types: [com.taobao.themis.kernel.adapter.IEnvironmentService, java.lang.Object] */
            @Override // com.taobao.themis.kernel.basic.b
            public /* synthetic */ IEnvironmentService b() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("43b9c269", new Object[]{this}) : a();
            }

            public IEnvironmentService a() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (IEnvironmentService) ipChange2.ipc$dispatch("e3ff272e", new Object[]{this}) : new TBEnvironmentAdapterImpl();
            }
        }));
        adapters.add(new qpn.c(IContainerViewFactory.class, new com.taobao.themis.kernel.basic.b<IContainerViewFactory>() { // from class: com.taobao.themis.taobao.impl.TBTMSManifest.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.taobao.themis.container.app.page.IContainerViewFactory] */
            @Override // com.taobao.themis.kernel.basic.b
            public /* synthetic */ IContainerViewFactory b() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("43b9c269", new Object[]{this}) : a();
            }

            public IContainerViewFactory a() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (IContainerViewFactory) ipChange2.ipc$dispatch("6a68721e", new Object[]{this}) : new TMSTBContainerViewFactory();
            }
        }));
        adapters.add(new qpn.c(INavigatorAdapter.class, new com.taobao.themis.kernel.basic.b<INavigatorAdapter>() { // from class: com.taobao.themis.taobao.impl.TBTMSManifest.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r0v2, types: [com.taobao.themis.kernel.adapter.INavigatorAdapter, java.lang.Object] */
            @Override // com.taobao.themis.kernel.basic.b
            public /* synthetic */ INavigatorAdapter b() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("43b9c269", new Object[]{this}) : a();
            }

            public INavigatorAdapter a() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (INavigatorAdapter) ipChange2.ipc$dispatch("331e4358", new Object[]{this}) : new TMSNavigatorAdapter();
            }
        }));
        adapters.add(new qpn.c(IAccountAdapter.class, new com.taobao.themis.kernel.basic.b<IAccountAdapter>() { // from class: com.taobao.themis.taobao.impl.TBTMSManifest.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r0v2, types: [com.taobao.themis.kernel.adapter.IAccountAdapter, java.lang.Object] */
            @Override // com.taobao.themis.kernel.basic.b
            public /* synthetic */ IAccountAdapter b() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("43b9c269", new Object[]{this}) : a();
            }

            public IAccountAdapter a() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (IAccountAdapter) ipChange2.ipc$dispatch("4efcae6e", new Object[]{this}) : new TMSAccountAdapter();
            }
        }));
        adapters.add(new qpn.c(ISplashViewFactory.class, new com.taobao.themis.kernel.basic.b<ISplashViewFactory>() { // from class: com.taobao.themis.taobao.impl.TBTMSManifest.10
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.taobao.themis.container.splash.ISplashViewFactory] */
            @Override // com.taobao.themis.kernel.basic.b
            public /* synthetic */ ISplashViewFactory b() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("43b9c269", new Object[]{this}) : a();
            }

            public ISplashViewFactory a() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (ISplashViewFactory) ipChange2.ipc$dispatch("cb01a700", new Object[]{this}) : new TMSTBSplashViewFactory();
            }
        }));
        adapters.add(new qpn.c(IShareAdapter.class, new com.taobao.themis.kernel.basic.b<IShareAdapter>() { // from class: com.taobao.themis.taobao.impl.TBTMSManifest.11
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r0v2, types: [com.taobao.themis.kernel.adapter.IShareAdapter, java.lang.Object] */
            @Override // com.taobao.themis.kernel.basic.b
            public /* synthetic */ IShareAdapter b() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("43b9c269", new Object[]{this}) : a();
            }

            public IShareAdapter a() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (IShareAdapter) ipChange2.ipc$dispatch("c2d23360", new Object[]{this}) : new TMSTBShareAdapter();
            }
        }));
        adapters.add(new qpn.c(IBizLaunchAdapter.class, new com.taobao.themis.kernel.basic.b<IBizLaunchAdapter>() { // from class: com.taobao.themis.taobao.impl.TBTMSManifest.12
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r0v2, types: [com.taobao.themis.kernel.adapter.IBizLaunchAdapter, java.lang.Object] */
            @Override // com.taobao.themis.kernel.basic.b
            public /* synthetic */ IBizLaunchAdapter b() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("43b9c269", new Object[]{this}) : a();
            }

            public IBizLaunchAdapter a() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (IBizLaunchAdapter) ipChange2.ipc$dispatch("90598ca7", new Object[]{this}) : new TMSTBBizLaunchAdapter();
            }
        }));
        adapters.add(new qpn.c(IAudioContextFactory.class, new com.taobao.themis.kernel.basic.b<IAudioContextFactory>() { // from class: com.taobao.themis.taobao.impl.TBTMSManifest.13
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r0v2, types: [com.taobao.themis.kernel.adapter.IAudioContextFactory, java.lang.Object] */
            @Override // com.taobao.themis.kernel.basic.b
            public /* synthetic */ IAudioContextFactory b() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("43b9c269", new Object[]{this}) : a();
            }

            public IAudioContextFactory a() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (IAudioContextFactory) ipChange2.ipc$dispatch("72b6d755", new Object[]{this}) : new IAudioContextFactory() { // from class: com.taobao.themis.taobao.impl.TBTMSManifest.9.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.themis.kernel.adapter.IAudioContextFactory
                    public com.taobao.themis.kernel.adapter.a createAudioContext(String str, ITMSPage iTMSPage) {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            return (com.taobao.themis.kernel.adapter.a) ipChange3.ipc$dispatch("6109a98f", new Object[]{this, str, iTMSPage});
                        }
                        com.taobao.themis.kernel.container.a x = iTMSPage.b().x();
                        return (!n.bj() || x == null || !x.f().getBoolean("enableMixPlayer").booleanValue()) ? new com.taobao.themis.open.ability.audio.e(str, iTMSPage) : new MegaPlayerInstance(str, iTMSPage);
                    }
                };
            }
        }));
        adapters.add(new qpn.c(IApiInvokerChainFactory.class, new com.taobao.themis.kernel.basic.b<IApiInvokerChainFactory>() { // from class: com.taobao.themis.taobao.impl.TBTMSManifest.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.taobao.themis.kernel.adapter.IApiInvokerChainFactory] */
            @Override // com.taobao.themis.kernel.basic.b
            public /* synthetic */ IApiInvokerChainFactory b() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("43b9c269", new Object[]{this}) : a();
            }

            public IApiInvokerChainFactory a() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (IApiInvokerChainFactory) ipChange2.ipc$dispatch("4fbdd407", new Object[]{this}) : new TBApiInvokerChainFactory();
            }
        }));
        adapters.add(new qpn.c(IWebAdapter.class, new com.taobao.themis.kernel.basic.b<IWebAdapter>() { // from class: com.taobao.themis.taobao.impl.TBTMSManifest.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.taobao.themis.web.runtime.IWebAdapter] */
            @Override // com.taobao.themis.kernel.basic.b
            public /* synthetic */ IWebAdapter b() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("43b9c269", new Object[]{this}) : a();
            }

            public IWebAdapter a() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (IWebAdapter) ipChange2.ipc$dispatch("df34edd", new Object[]{this}) : new TBWebAdapter();
            }
        }));
        adapters.add(new qpn.c(IGlobalMenuAdapter.class, new com.taobao.themis.kernel.basic.b<IGlobalMenuAdapter>() { // from class: com.taobao.themis.taobao.impl.TBTMSManifest.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r0v2, types: [com.taobao.themis.kernel.adapter.IGlobalMenuAdapter, java.lang.Object] */
            @Override // com.taobao.themis.kernel.basic.b
            public /* synthetic */ IGlobalMenuAdapter b() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("43b9c269", new Object[]{this}) : a();
            }

            public IGlobalMenuAdapter a() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (IGlobalMenuAdapter) ipChange2.ipc$dispatch("3d4bda19", new Object[]{this}) : new TBGlobalMenuAdapter();
            }
        }));
        adapters.add(new qpn.c(IInstanceLifecycleAdapter.class, new com.taobao.themis.kernel.basic.b<IInstanceLifecycleAdapter>() { // from class: com.taobao.themis.taobao.impl.TBTMSManifest.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r0v2, types: [com.taobao.themis.kernel.adapter.IInstanceLifecycleAdapter, java.lang.Object] */
            @Override // com.taobao.themis.kernel.basic.b
            public /* synthetic */ IInstanceLifecycleAdapter b() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("43b9c269", new Object[]{this}) : a();
            }

            public IInstanceLifecycleAdapter a() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (IInstanceLifecycleAdapter) ipChange2.ipc$dispatch("7ea2056", new Object[]{this}) : new TBInstanceLifecycleAdapter();
            }
        }));
        adapters.add(new qpn.c(ITraceAdapter.class, new com.taobao.themis.kernel.basic.b<ITraceAdapter>() { // from class: com.taobao.themis.taobao.impl.TBTMSManifest.14
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r0v2, types: [com.taobao.themis.kernel.adapter.ITraceAdapter, java.lang.Object] */
            @Override // com.taobao.themis.kernel.basic.b
            public /* synthetic */ ITraceAdapter b() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("43b9c269", new Object[]{this}) : a();
            }

            public ITraceAdapter a() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (ITraceAdapter) ipChange2.ipc$dispatch("adf80ec6", new Object[]{this}) : new DefaultTraceAdapter();
            }
        }));
        return adapters;
    }

    @Override // com.taobao.themis.inside.b, tb.qpn
    public List<qpn.e> getAbilities() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("cec13d0e", new Object[]{this});
        }
        List<qpn.e> abilities = super.getAbilities();
        if (abilities == null) {
            abilities = new ArrayList<>();
        }
        abilities.add(new qpn.b(TMSTitleBarBridge.class, AbilityType.SUBPAGE));
        abilities.add(new qpn.b(TMSPubBridge.class, AbilityType.INSTANCE));
        abilities.add(new qpn.b(TMSAPMBridge.class, AbilityType.INSTANCE));
        abilities.add(new qpn.b(TMSTBLoginBridge.class, AbilityType.INSTANCE));
        abilities.add(new qpn.b(TMSTBBizBridge.class, AbilityType.INSTANCE));
        abilities.add(new qpn.b(TMSTBShareBridge.class, AbilityType.SUBPAGE));
        abilities.add(new qpn.b(TMSUserTrackerBridge.class, AbilityType.INSTANCE));
        abilities.add(new qpn.b(TMSCalendarBridge.class, AbilityType.GLOBAL));
        abilities.add(new qpn.b(TMSFileBridge.class, AbilityType.INSTANCE));
        if (n.U()) {
            abilities.add(new qpn.b(TMSNewForegroundAudioBridge.class, AbilityType.INSTANCE));
        } else {
            abilities.add(new qpn.b(TMSForegroundAudioBridge.class, AbilityType.INSTANCE));
        }
        abilities.add(new qpn.b(FSManagerBridge.class, AbilityType.INSTANCE));
        abilities.add(new qpn.b(TMSStorageBridge.class, AbilityType.INSTANCE));
        abilities.add(new qpn.b(TMSNetworkBridge.class, AbilityType.INSTANCE));
        abilities.add(new qpn.b(TMSVibrateBridge.class, AbilityType.INSTANCE));
        abilities.add(new qpn.b(TMSSubPackageBridge.class, AbilityType.INSTANCE));
        abilities.add(new qpn.b(TMSBroadCastBridge.class, AbilityType.INSTANCE));
        abilities.add(new qpn.b(TMSSendMtopBridge.class, AbilityType.INSTANCE));
        abilities.add(new qpn.b(TMSMegaBridge.class, AbilityType.SUBPAGE));
        abilities.add(new qpn.b(TMSWebSocketBridge.class, AbilityType.INSTANCE));
        abilities.add(new qpn.b(TMSImageBridge.class, AbilityType.GLOBAL));
        abilities.add(new qpn.b(TMSEBizBridge.class, AbilityType.GLOBAL));
        try {
            abilities.add(new qpn.b(Class.forName("com.taobao.alimama.AlimamaMiniGameBridgeExtension"), AbilityType.INSTANCE));
        } catch (Throwable th) {
            th.printStackTrace();
        }
        abilities.add(new qpn.b(TMSWidgetBridge.class, AbilityType.GLOBAL));
        abilities.add(new qpn.b(TMSWidgetBroadcastBridge.class, AbilityType.INSTANCE));
        abilities.add(new qpn.b(TMSAuthBridge.class, AbilityType.GLOBAL));
        abilities.add(new qpn.b(TMSCommonBridge.class, AbilityType.GLOBAL));
        return abilities;
    }
}
