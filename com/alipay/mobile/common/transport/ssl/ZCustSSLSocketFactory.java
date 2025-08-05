package com.alipay.mobile.common.transport.ssl;

import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.IpChange;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes3.dex */
public class ZCustSSLSocketFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f5611a = true;
    private static SSLSocketFactory b;

    public static final SSLSocketFactory getSSLSocketFactory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SSLSocketFactory) ipChange.ipc$dispatch("8af93504", new Object[0]);
        }
        try {
            if (!f5611a) {
                return a();
            }
        } catch (Throwable th) {
            f5611a = true;
            LogCatUtil.warn("ZCustSSLSocketFactory", "getSSLSocketFactory Exception: " + th.toString() + ", will downgrade to 'DefaultSSLSocketFactory'", th);
        }
        return HttpsURLConnection.getDefaultSSLSocketFactory();
    }

    private static SSLSocketFactory a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SSLSocketFactory) ipChange.ipc$dispatch("b1c7c784", new Object[0]);
        }
        try {
            if (b != null) {
                return b;
            }
            synchronized (ZCustSSLSocketFactory.class) {
                if (b != null) {
                    return b;
                }
                b = ZSSLContextFactory.getSingletonSSLContext().getSocketFactory();
                LogCatUtil.info("ZCustSSLSocketFactory", "[getCustomSslSocketFactory] Use custom 'SSLSocketFactory'.");
                return b;
            }
        } catch (Throwable th) {
            f5611a = true;
            LogCatUtil.warn("ZCustSSLSocketFactory", "[getCustomSslSocketFactory]  Exception: " + th.toString() + ", will downgrade to 'DefaultSSLSocketFactory'", th);
            return HttpsURLConnection.getDefaultSSLSocketFactory();
        }
    }
}
