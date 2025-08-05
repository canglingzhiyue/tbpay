package com.alipay.mobile.common.transport;

import android.content.Context;
import com.alipay.mobile.common.transport.http.inner.CoreHttpManager;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.TransportEnvUtil;
import com.alipay.mobile.common.transport.utils.inner.NetSdkConstants;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class AlipayNetStarter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static AlipayNetStarter f5514a;

    public String getNetSDKVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2fa8ab14", new Object[]{this}) : NetSdkConstants.NET_SDK_VERSION;
    }

    public static AlipayNetStarter getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AlipayNetStarter) ipChange.ipc$dispatch("2dc824d3", new Object[0]);
        }
        AlipayNetStarter alipayNetStarter = f5514a;
        if (alipayNetStarter != null) {
            return alipayNetStarter;
        }
        synchronized (AlipayNetStarter.class) {
            if (f5514a != null) {
                return f5514a;
            }
            f5514a = new AlipayNetStarter();
            return f5514a;
        }
    }

    private AlipayNetStarter() {
    }

    public void initNetwork(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e852ae3", new Object[]{this, context});
            return;
        }
        if (context == null) {
            try {
                LogCatUtil.debug("AlipayNetStarter", "initNetwork context is null");
                context = TransportEnvUtil.getContext();
            } catch (Throwable th) {
                LogCatUtil.error("AlipayNetStarter", "initNetwork ex=" + th.toString());
                return;
            }
        }
        CoreHttpManager.getInstance(context);
    }
}
