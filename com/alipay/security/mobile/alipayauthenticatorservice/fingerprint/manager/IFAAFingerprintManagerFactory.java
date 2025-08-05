package com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.manager;

import android.content.Context;
import com.alipay.security.mobile.auth.AuthenticatorLOG;
import com.alipay.security.mobile.util.TrackEvent;
import com.android.alibaba.ip.runtime.IpChange;
import org.ifaa.android.manager.IFAAAidlManager;
import org.ifaa.android.manager.IFAAManager;
import org.ifaa.android.manager.fingerprint.IFAAFingerprintManager;

/* loaded from: classes3.dex */
public class IFAAFingerprintManagerFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static synchronized IFAAManager getIFAAManager(Context context) {
        IFAAManager iFAAManager;
        synchronized (IFAAFingerprintManagerFactory.class) {
            try {
                iFAAManager = (IFAAManager) Class.forName("org.ifaa.android.manager.IFAAManagerFactory").getDeclaredMethod("getIFAAManager", Context.class, Integer.TYPE).invoke(null, context, 1);
            } catch (Throwable unused) {
                TrackEvent.getIns().event(null, "IFAAManager reflect failed!");
                AuthenticatorLOG.fpInfo("IFAAManagerFactoryAdapter aidl :: get ifaa manager.");
                IFAAManager iFAAManager2 = IFAAAidlManager.getIFAAManager(context);
                if (iFAAManager2 != null) {
                    return iFAAManager2;
                }
                AuthenticatorLOG.error("not support IFAA");
                return null;
            }
        }
        return iFAAManager;
    }

    public static synchronized IFAAFingerprintManager getIFAAFingerprintManager(Context context) {
        IFAAFingerprintManager iFAAFingerprintManager;
        synchronized (IFAAFingerprintManagerFactory.class) {
            try {
                iFAAFingerprintManager = (IFAAFingerprintManager) Class.forName("org.ifaa.android.manager.fingerprint.IFAAFingerprintManagerFactory").getDeclaredMethod("getIFAAFingerprintManager", Context.class).invoke(null, context);
            } catch (Exception unused) {
                return null;
            }
        }
        return iFAAFingerprintManager;
    }
}
