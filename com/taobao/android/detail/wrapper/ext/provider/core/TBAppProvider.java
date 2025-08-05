package com.taobao.android.detail.wrapper.ext.provider.core;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.protocol.adapter.core.IAppAdapter;
import com.taobao.tao.Globals;
import com.taobao.tao.TaoApplication;
import com.taobao.tao.util.SystemBarDecorator;
import mtopsdk.mtop.global.SDKConfig;
import tb.ecr;
import tb.emu;
import tb.epo;
import tb.kge;

/* loaded from: classes5.dex */
public class TBAppProvider implements IAppAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Application tbApplication;

    static {
        kge.a(1276359613);
        kge.a(399091092);
        tbApplication = null;
    }

    public TBAppProvider() {
        emu.a("com.taobao.android.detail.wrapper.ext.provider.core.TBAppProvider");
    }

    @Override // com.taobao.android.detail.datasdk.protocol.adapter.core.IAppAdapter
    public Application getApplication() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("5749e470", new Object[]{this});
        }
        if (tbApplication == null) {
            tbApplication = Globals.getApplication();
        }
        return tbApplication;
    }

    @Override // com.taobao.android.detail.datasdk.protocol.adapter.core.IAppAdapter
    public String getTTID() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2e0d7a8", new Object[]{this}) : TaoApplication.getTTID();
    }

    @Override // com.taobao.android.detail.datasdk.protocol.adapter.core.IAppAdapter
    public String getAppKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("49079005", new Object[]{this}) : SDKConfig.getInstance().getGlobalAppKey();
    }

    @Override // com.taobao.android.detail.datasdk.protocol.adapter.core.IAppAdapter
    public String getAppVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("65f009ac", new Object[]{this}) : SDKConfig.getInstance().getGlobalAppVersion();
    }

    @Override // com.taobao.android.detail.datasdk.protocol.adapter.core.IAppAdapter
    public int getStatusBarHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a1b6fc8c", new Object[]{this})).intValue() : SystemBarDecorator.SystemBarConfig.getStatusBarHeight(epo.a());
    }

    @Override // com.taobao.android.detail.datasdk.protocol.adapter.core.IAppAdapter
    public int getsNavigtionBarHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fe1c70bc", new Object[]{this})).intValue() : ecr.d(epo.a());
    }
}
