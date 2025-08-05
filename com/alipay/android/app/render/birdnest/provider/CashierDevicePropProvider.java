package com.alipay.android.app.render.birdnest.provider;

import android.os.Build;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.alipay.android.app.render.api.ICashierProvider;
import com.alipay.android.app.render.birdnest.utils.ClientInfo;
import com.alipay.birdnest.api.BirdNestEngine;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.draft.DraftMediaHelper;
import java.util.Map;

@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: classes3.dex */
public class CashierDevicePropProvider implements BirdNestEngine.DevicePropProvider {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ICashierProvider f4367a;

    public CashierDevicePropProvider(ICashierProvider iCashierProvider) {
        this.f4367a = iCashierProvider;
    }

    @Override // com.alipay.birdnest.api.BirdNestEngine.DevicePropProvider
    public String getProperty(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8f437f57", new Object[]{this, str, map});
        }
        if (DispatchConstants.PLATFORM_VERSION.equals(str)) {
            return Build.VERSION.RELEASE;
        }
        if ("clientVersion".equals(str) || "clientChannel".equals(str)) {
            return "";
        }
        if ("debug".equals(str)) {
            return "false";
        }
        if (!"getClientInfo".equals(str)) {
            return null;
        }
        return ClientInfo.buildClientInfo(this.f4367a);
    }

    @Override // com.alipay.birdnest.api.BirdNestEngine.DevicePropProvider
    public boolean capableOf(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b4797978", new Object[]{this, str})).booleanValue() : DispatchConstants.PLATFORM_VERSION.equals(str) || "clientVersion".equals(str) || "clientChannel".equals(str) || "debug".equals(str);
    }
}
