package com.alipay.security.mobile.ifaa.adapter;

import android.content.Context;
import com.alipay.security.mobile.auth.AuthenticatorLOG;
import com.alipay.security.mobile.auth.Constants;
import com.alipay.security.mobile.util.TrackEvent;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;
import org.ifaa.android.manager.IFAAAidlManager;
import org.ifaa.android.manager.IFAAManager;
import org.ifaa.android.manager.face.IFAAFaceManager;
import org.ifaa.android.manager.fingerprint.IFAAFingerprintManager;

/* loaded from: classes3.dex */
public class IFAAManagerFactoryAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CLASS_NAME_IFAAFACEMANAGER_FACTORY = "org.ifaa.android.manager.face.IFAAFaceManagerFactory";
    public static final String CLASS_NAME_IFAAFINGERPRINTMANAGER_FACTORY = "org.ifaa.android.manager.fingerprint.IFAAFingerprintManagerFactory";
    public static final String CLASS_NAME_IFAAMANAGER_FACTORY = "org.ifaa.android.manager.IFAAManagerFactory";
    public static final String METHOD_NAME_GETIFAAFACEMANAGER = "getIFAAFaceManager";
    public static final String METHOD_NAME_GETIFAAFINGERPRINTMANAGER = "getIFAAFingerprintManager";
    public static final String METHOD_NAME_GETIFAAMANAGER = "getIFAAManager";

    public static synchronized IFAAManager getIFAAManager(Context context) {
        IFAAManager iFAAManager;
        synchronized (IFAAManagerFactoryAdapter.class) {
            try {
                Method declaredMethod = Class.forName("org.ifaa.android.manager.IFAAManagerFactory").getDeclaredMethod("getIFAAManager", Context.class, Integer.TYPE);
                AuthenticatorLOG.fpInfo("IFAAManager reflect success");
                iFAAManager = (IFAAManager) declaredMethod.invoke(null, context, Integer.valueOf(Constants.TYPE_FINGERPRINT));
            } catch (Throwable th) {
                AuthenticatorLOG.error(th.toString());
                TrackEvent.getIns().event(null, "IFAAManager reflect failed!");
                AuthenticatorLOG.fpInfo("IFAAManagerFactoryAdapter aidl :: get ifaa manager.");
                IFAAManager iFAAManager2 = IFAAAidlManager.getIFAAManager(context);
                if (iFAAManager2 != null) {
                    return iFAAManager2;
                }
                AuthenticatorLOG.fpInfo("IFAAManager reflect failed");
                return null;
            }
        }
        return iFAAManager;
    }

    public static synchronized IFAAFingerprintManager getIFAAFingerprintManager(Context context) {
        IFAAFingerprintManager iFAAFingerprintManager;
        synchronized (IFAAManagerFactoryAdapter.class) {
            try {
                iFAAFingerprintManager = (IFAAFingerprintManager) Class.forName("org.ifaa.android.manager.fingerprint.IFAAFingerprintManagerFactory").getDeclaredMethod("getIFAAFingerprintManager", Context.class).invoke(null, context);
            } catch (Throwable th) {
                AuthenticatorLOG.error(th);
                AuthenticatorLOG.fpInfo("IFAAFingerprintManager reflect failed");
                return null;
            }
        }
        return iFAAFingerprintManager;
    }

    public static synchronized IFAAFaceManager getIFAAFaceManager(Context context) {
        IFAAFaceManager iFAAFaceManager;
        synchronized (IFAAManagerFactoryAdapter.class) {
            try {
                iFAAFaceManager = (IFAAFaceManager) Class.forName(CLASS_NAME_IFAAFACEMANAGER_FACTORY).getDeclaredMethod(METHOD_NAME_GETIFAAFACEMANAGER, Context.class).invoke(null, context);
            } catch (Throwable th) {
                AuthenticatorLOG.error(th);
                AuthenticatorLOG.fpInfo("IFAAFaceManager reflect failed");
                return null;
            }
        }
        return iFAAFaceManager;
    }
}
