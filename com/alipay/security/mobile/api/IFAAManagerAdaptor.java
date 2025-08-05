package com.alipay.security.mobile.api;

import android.content.Context;
import com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.manager.IFAAFingerprintManagerFactory;
import com.alipay.security.mobile.auth.AuthenticatorLOG;
import com.alipay.security.mobile.auth.Constants;
import com.alipay.security.mobile.util.CommonUtils;
import com.alipay.security.mobile.util.ConfigServiceUtil;
import com.android.alibaba.ip.runtime.IpChange;
import org.ifaa.android.manager.IFAAManager;
import org.ifaa.android.manager.IFAAManagerV3;
import org.ifaa.android.manager.IFAAManagerV4;

/* loaded from: classes3.dex */
public class IFAAManagerAdaptor {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static int bioTypes;
    private static int ignoreFpIndexStatus;

    public static String getFingerprintExtInfo(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1010eec0", new Object[]{context});
        }
        try {
            IFAAManager iFAAManager = IFAAFingerprintManagerFactory.getIFAAManager(context);
            if (iFAAManager == null) {
                AuthenticatorLOG.fpInfo("not support");
                return null;
            }
            int supportBIOTypes = iFAAManager.getSupportBIOTypes(context);
            AuthenticatorLOG.fpInfo("bioTypes: " + supportBIOTypes);
            int i = Constants.TYPE_FINGERPRINT | 16;
            if ((supportBIOTypes & i) == i) {
                return ((IFAAManagerV3) iFAAManager).getExtInfo(Constants.TYPE_FINGERPRINT, "org.ifaa.ext.key.GET_SENSOR_LOCATION");
            }
            return null;
        } catch (Exception e) {
            AuthenticatorLOG.fpInfo(e.toString());
            return null;
        }
    }

    public static int getSupportBioTypes(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("feaf2a4a", new Object[]{context})).intValue();
        }
        int i = bioTypes;
        if (i != 0) {
            return i;
        }
        try {
            IFAAManager iFAAManager = IFAAFingerprintManagerFactory.getIFAAManager(context);
            if (iFAAManager == null) {
                AuthenticatorLOG.fpInfo("not support ifaa");
                return 0;
            }
            int supportBIOTypes = iFAAManager.getSupportBIOTypes(context);
            bioTypes = supportBIOTypes;
            return supportBIOTypes;
        } catch (Throwable th) {
            AuthenticatorLOG.fpInfo(th.toString());
            return bioTypes;
        }
    }

    public static boolean isUnderScreen(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b0d7198b", new Object[]{context})).booleanValue();
        }
        try {
            int supportBioTypes = getSupportBioTypes(context);
            if ((Constants.TYPE_FINGERPRINT & supportBioTypes) != 0 && (supportBioTypes & 16) != 0) {
                if (!CommonUtils.isBlank(getFingerprintExtInfo(context))) {
                    return true;
                }
            }
        } catch (Throwable th) {
            AuthenticatorLOG.fpInfo(th.toString());
        }
        return false;
    }

    public static boolean isSupportBioType(int i, Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ea4f908d", new Object[]{new Integer(i), context})).booleanValue() : (getSupportBioTypes(context) & i) == i;
    }

    public static boolean isIgnoreFpIndex(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b72219b9", new Object[]{context})).booleanValue();
        }
        try {
            if ("off".equalsIgnoreCase(ConfigServiceUtil.syncConfigMode(ConfigServiceUtil.KEY_IGNORE_FP, ""))) {
                AuthenticatorLOG.fpInfo("isIgnoreFpIndex=false,   configServer IGNORE_FP_INDEX_CLOSE");
                return false;
            } else if (ignoreFpIndexStatus != 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("isIgnoreFpIndex cache, cache result：");
                sb.append(ignoreFpIndexStatus == 2);
                AuthenticatorLOG.fpInfo(sb.toString());
                return ignoreFpIndexStatus == 2;
            } else {
                IFAAManager iFAAManager = IFAAFingerprintManagerFactory.getIFAAManager(context);
                if (iFAAManager.getVersion() < 4) {
                    AuthenticatorLOG.fpInfo("isIgnoreFpIndex=false,   ifaaManager.getVersion() < 4 ");
                    ignoreFpIndexStatus = 1;
                    return false;
                }
                IFAAManagerV4 iFAAManagerV4 = (IFAAManagerV4) iFAAManager;
                if (iFAAManagerV4.getEnabled(Constants.TYPE_FINGERPRINT) == 1000) {
                    int[] iDList = iFAAManagerV4.getIDList(Constants.TYPE_FINGERPRINT);
                    if (iDList != null && iDList.length > 0) {
                        AuthenticatorLOG.fpInfo("isIgnoreFpIndex=true");
                        ignoreFpIndexStatus = 2;
                        return true;
                    }
                    AuthenticatorLOG.fpInfo("isIgnoreFpIndex=false,   fingerprints idList is null");
                } else {
                    AuthenticatorLOG.fpInfo("isIgnoreFpIndex=false,   ifaaManagerV4.getEnabled != 1000");
                }
                ignoreFpIndexStatus = 1;
                return false;
            }
        } catch (Throwable th) {
            AuthenticatorLOG.error(th);
            ignoreFpIndexStatus = 1;
            return false;
        }
    }
}
