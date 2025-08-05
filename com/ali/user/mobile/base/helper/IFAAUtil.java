package com.ali.user.mobile.base.helper;

import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.manager.IFAAFingerprintManagerFactory;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.log.LoginTLogAdapter;
import org.ifaa.android.manager.IFAAManager;
import org.ifaa.android.manager.IFAAManagerV4;
import tb.kge;

/* loaded from: classes2.dex */
public class IFAAUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "Login.IFAAUtil";

    static {
        kge.a(-450422070);
    }

    public static int[] getFingerIds() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (int[]) ipChange.ipc$dispatch("6e7d2504", new Object[0]) : getIds(1);
    }

    public static int[] getIds(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("77b58b0a", new Object[]{new Integer(i)});
        }
        try {
            IFAAManager iFAAManager = IFAAFingerprintManagerFactory.getIFAAManager(DataProviderFactory.getApplicationContext());
            if (iFAAManager.getVersion() < 4) {
                LoginTLogAdapter.e(TAG, "version < 4");
                return null;
            }
            return ((IFAAManagerV4) iFAAManager).getIDList(i);
        } catch (Throwable th) {
            LoginTLogAdapter.e(TAG, "type: " + i + " , getIds exception , message=" + th.getMessage());
            return null;
        }
    }
}
