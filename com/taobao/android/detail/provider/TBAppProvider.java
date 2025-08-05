package com.taobao.android.detail.provider;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.protocol.adapter.core.IAppAdapter;
import com.taobao.tao.Globals;
import com.taobao.tao.TaoApplication;
import mtopsdk.mtop.global.SDKConfig;
import tb.ezx;
import tb.kge;

/* loaded from: classes4.dex */
public class TBAppProvider implements IAppAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Application tbApplication;

    static {
        kge.a(1158733265);
        kge.a(903374995);
        tbApplication = null;
    }

    @Override // com.taobao.android.detail.protocol.adapter.core.IAppAdapter
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

    @Override // com.taobao.android.detail.protocol.adapter.core.IAppAdapter
    public String getTTID() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2e0d7a8", new Object[]{this}) : TaoApplication.getTTID();
    }

    @Override // com.taobao.android.detail.protocol.adapter.core.IAppAdapter
    public String getAppKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("49079005", new Object[]{this}) : SDKConfig.getInstance().getGlobalAppKey();
    }

    @Override // com.taobao.android.detail.protocol.adapter.core.IAppAdapter
    public String getAppVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("65f009ac", new Object[]{this}) : SDKConfig.getInstance().getGlobalAppVersion();
    }

    @Override // com.taobao.android.detail.protocol.adapter.core.IAppAdapter
    public int getStatusBarHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a1b6fc8c", new Object[]{this})).intValue() : ezx.a();
    }
}
