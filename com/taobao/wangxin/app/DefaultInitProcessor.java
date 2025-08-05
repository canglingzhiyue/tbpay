package com.taobao.wangxin.app;

import android.app.Application;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.taobao.mulitenv.EnvironmentSwitcher;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.base.Versions;
import com.taobao.message.kit.core.GlobalContainer;
import com.taobao.message.kit.provider.IMPLocalizedProvider;
import com.taobao.message.kit.provider.IToLargeScreenProvider;
import com.taobao.message.launcher.init.InitOpenPoint;
import com.taobao.message.uikit.util.ApplicationUtil;
import com.taobao.message.util.TBMPLocalizedProvider;
import com.taobao.message.util.ToLargeScreenProvider;
import com.taobao.tao.TaoPackageInfo;
import com.ut.device.UTDevice;
import tb.kge;

/* loaded from: classes9.dex */
public class DefaultInitProcessor implements InitOpenPoint.InitOpenPointProcessor {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Application mApplication;

    static {
        kge.a(819123159);
        kge.a(1951003349);
    }

    @Override // com.taobao.message.launcher.init.InitOpenPoint.InitOpenPointProcessor
    public void after() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cae3c63", new Object[]{this});
        }
    }

    @Override // com.taobao.message.launcher.init.InitOpenPoint.InitOpenPointProcessor
    public void before() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ed5ec86", new Object[]{this});
        }
    }

    @Override // com.taobao.message.launcher.init.InitOpenPoint.InitOpenPointProcessor
    public String getName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this}) : "default-msg";
    }

    public DefaultInitProcessor(Application application) {
        this.mApplication = application;
        ApplicationUtil.setApplication(application);
        ApplicationUtil.setDebug(Versions.isDebug());
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.mApplication);
        ApplicationUtil.setEnvType(defaultSharedPreferences.getInt("envType", defaultSharedPreferences.getInt(EnvironmentSwitcher.SPKEY_ENV, 0)));
        ApplicationUtil.setUTDID(UTDevice.getUtdid(this.mApplication));
        ApplicationUtil.setTTID(TaoPackageInfo.getTTID());
        ApplicationUtil.setAppKey("21646297");
        GlobalContainer.getInstance().register(IToLargeScreenProvider.class, new ToLargeScreenProvider());
        GlobalContainer.getInstance().register(IMPLocalizedProvider.class, new TBMPLocalizedProvider());
    }
}
