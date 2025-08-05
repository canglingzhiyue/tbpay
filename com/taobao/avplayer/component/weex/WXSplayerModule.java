package com.taobao.avplayer.component.weex;

import com.ali.adapt.api.AliAdaptServiceManager;
import com.ali.adapt.api.AliServiceFindedCallback;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobaoavsdk.CodeUsageCounter;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.bridge.WXBridgeManager;
import com.taobao.weex.common.WXModule;
import com.taobao.weex.common.WXModuleAnno;
import tb.kck;
import tb.kge;
import tb.nyf;

/* loaded from: classes6.dex */
public class WXSplayerModule extends WXModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1182384311);
    }

    @JSMethod
    public void findBestPlay(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a77be2", new Object[]{this, str});
            return;
        }
        CodeUsageCounter.a().a(CodeUsageCounter.componentName.dw_adapter_WXSplayerModule);
        c.a().a(str);
    }

    @JSMethod
    public void pauseAll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("314d36d2", new Object[]{this});
            return;
        }
        CodeUsageCounter.a().a(CodeUsageCounter.componentName.dw_adapter_WXSplayerModule);
        c.a().b();
    }

    @JSMethod
    public void pauseGroup(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e40e6ffa", new Object[]{this, str});
            return;
        }
        CodeUsageCounter.a().a(CodeUsageCounter.componentName.dw_adapter_WXSplayerModule);
        c.a().b(str);
    }

    @WXModuleAnno
    public void getAutoPlayVideoUnderWifi(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("871e277c", new Object[]{this, str});
            return;
        }
        CodeUsageCounter.a().a(CodeUsageCounter.componentName.dw_adapter_WXSplayerModule);
        try {
            AliAdaptServiceManager.getInstance().findAliAdaptService(nyf.class, new AliServiceFindedCallback<nyf>() { // from class: com.taobao.avplayer.component.weex.WXSplayerModule.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.adapt.api.AliServiceFindedCallback
                public /* synthetic */ void onServiceFinded(nyf nyfVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9cd135b1", new Object[]{this, nyfVar});
                    } else {
                        a(nyfVar);
                    }
                }

                public void a(nyf nyfVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f7227cfd", new Object[]{this, nyfVar});
                    } else if (nyfVar == null) {
                    } else {
                        WXBridgeManager.getInstance().callback(WXSplayerModule.this.mWXSDKInstance.N(), str, String.valueOf(nyfVar.isAutoPlayVideoUnderWifi(kck.f29959a, true)));
                    }
                }
            });
        } catch (Throwable unused) {
            WXBridgeManager.getInstance().callback(this.mWXSDKInstance.N(), str, "true");
        }
    }

    @WXModuleAnno
    public void getAutoPlayUserSettingResult(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1004505a", new Object[]{this, str});
            return;
        }
        CodeUsageCounter.a().a(CodeUsageCounter.componentName.dw_adapter_WXSplayerModule);
        try {
            AliAdaptServiceManager.getInstance().findAliAdaptService(nyf.class, new AliServiceFindedCallback<nyf>() { // from class: com.taobao.avplayer.component.weex.WXSplayerModule.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.adapt.api.AliServiceFindedCallback
                public /* synthetic */ void onServiceFinded(nyf nyfVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9cd135b1", new Object[]{this, nyfVar});
                    } else {
                        a(nyfVar);
                    }
                }

                public void a(nyf nyfVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f7227cfd", new Object[]{this, nyfVar});
                    } else if (nyfVar == null) {
                    } else {
                        WXBridgeManager.getInstance().callback(WXSplayerModule.this.mWXSDKInstance.N(), str, String.valueOf(nyfVar.isAutoPlayVideoUnderCurrentNetwork(kck.f29959a)));
                    }
                }
            });
        } catch (Throwable unused) {
            WXBridgeManager.getInstance().callback(this.mWXSDKInstance.N(), str, "true");
        }
    }
}
