package com.alipay.android.msp.framework.hardwarepay.neo;

import android.content.Context;
import com.alipay.android.msp.utils.EventLogUtil;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.security.mobile.api.AuthenticatorApi;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class SmartPayManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f4723a;

    public SmartPayManager(Context context) {
        this.f4723a = context.getApplicationContext();
        EventLogUtil.logPayEvent("104851", "content_type", "SmartPayManager");
    }

    public String getFastPayAuthData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("24072b27", new Object[]{this, str});
        }
        LogUtil.record(2, "SmartPayManager::getFastPayAuthData", "context:" + this.f4723a + ", userId:" + str);
        return AuthenticatorApi.getFastPayAuthData(this.f4723a, str);
    }

    public String getRegAuthData(int i, int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a174409f", new Object[]{this, new Integer(i), new Integer(i2), str});
        }
        LogUtil.record(2, "SmartPayManager::getRegAuthData", "context:" + this.f4723a + ",authType:" + i + ",wearableType:" + i2 + ",userId:" + str);
        return AuthenticatorApi.getRegAuthData(this.f4723a, i, i2, str);
    }
}
