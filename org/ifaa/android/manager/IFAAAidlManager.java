package org.ifaa.android.manager;

import android.content.Context;
import android.os.Build;
import com.alipay.security.mobile.agent.managerservice.ServiceImpl;
import com.alipay.security.mobile.auth.AuthenticatorLOG;
import com.alipay.security.mobile.util.ConfigServiceUtil;
import com.alipay.security.mobile.util.TrackEvent;

/* loaded from: classes9.dex */
public class IFAAAidlManager {
    private static final String TAG = "IFAAAidlManager";

    public static synchronized IFAAManager getIFAAManager(Context context) {
        synchronized (IFAAAidlManager.class) {
            AuthenticatorLOG.fpInfo("IFAAAidlManager aidl :: ifaa create IFAAAidlManager getIFAAManager");
            try {
                if (!"off".equals(ConfigServiceUtil.syncConfigMode(ConfigServiceUtil.KEY_AIDL_MANAGER_SWITCH, "")) && Build.VERSION.SDK_INT >= 28) {
                    return ServiceImpl.getInstance(context).getIFAAManager();
                }
                return null;
            } catch (Exception e) {
                AuthenticatorLOG.error(TAG, "aidl :: " + e.toString());
                TrackEvent ins = TrackEvent.getIns();
                ins.event(null, "aidl IFAAAidlManager Exception e = " + e);
                return null;
            }
        }
    }
}
