package com.ali.user.open.securityguard;

import android.text.TextUtils;
import com.ali.user.open.core.callback.MemberCallback;
import com.ali.user.open.core.config.ConfigManager;
import com.ali.user.open.core.config.Environment;
import com.ali.user.open.core.context.KernelContext;
import com.ali.user.open.core.model.WUAData;
import com.ali.user.open.core.service.StorageService;
import com.ali.user.open.core.trace.SDKLogger;
import com.alibaba.wireless.security.open.SecException;
import com.alibaba.wireless.security.open.SecurityGuardManager;
import com.alibaba.wireless.security.open.dynamicdataencrypt.IDynamicDataEncryptComponent;
import com.alibaba.wireless.security.open.safetoken.ISafeTokenComponent;
import com.alibaba.wireless.security.open.securitybody.ISecurityBodyComponent;
import com.alibaba.wireless.security.open.umid.IUMIDComponent;
import com.alibaba.wireless.security.open.umid.IUMIDInitListenerEx;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public class SecurityGuardWrapper implements StorageService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String SEED_KEY = "seed_key";
    public static final String TAG = "SecurityGuardWrapper";

    @Override // com.ali.user.open.core.service.StorageService
    public void setUmid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eaf3a06", new Object[]{this, str});
        }
    }

    private SecurityGuardManager getSecurityGuardManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SecurityGuardManager) ipChange.ipc$dispatch("e7fb8de8", new Object[]{this});
        }
        try {
            return SecurityGuardManager.getInstance(KernelContext.applicationContext);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    @Override // com.ali.user.open.core.service.StorageService
    public String getValue(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("948b7d58", new Object[]{this, str, new Boolean(z)});
        }
        try {
            if (z) {
                return getSecurityGuardManager().getDynamicDataStoreComp().getString(str);
            }
            return getSecurityGuardManager().getStaticDataStoreComp().getExtraData(str, ConfigManager.POSTFIX_OF_SECURITY_JPG);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.ali.user.open.core.service.StorageService
    public void putValue(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c42fb2b7", new Object[]{this, str, str2, new Boolean(z)});
            return;
        }
        try {
            getSecurityGuardManager().getDynamicDataStoreComp().putString(str, str2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.ali.user.open.core.service.StorageService
    public void removeValue(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8b50876", new Object[]{this, str, new Boolean(z)});
        } else if (!z) {
        } else {
            try {
                getSecurityGuardManager().getDynamicDataStoreComp().removeString(str);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    @Override // com.ali.user.open.core.service.StorageService
    public void putDDpExValue(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f19bbd8", new Object[]{this, str, str2});
            return;
        }
        try {
            getSecurityGuardManager().getDynamicDataStoreComp().putStringDDpEx(str, str2, 0);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.ali.user.open.core.service.StorageService
    public String getDDpExValue(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d4d49f6b", new Object[]{this, str});
        }
        try {
            return getSecurityGuardManager().getDynamicDataStoreComp().getStringDDpEx(str, 0);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.ali.user.open.core.service.StorageService
    public void removeDDpExValue(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e74cb03", new Object[]{this, str});
            return;
        }
        try {
            getSecurityGuardManager().getDynamicDataStoreComp().removeStringDDpEx(str, 0);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.ali.user.open.core.service.StorageService
    public String getUmid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3a229470", new Object[]{this});
        }
        try {
            return getSecurityGuardManager().getUMIDComp().getSecurityToken();
        } catch (Throwable unused) {
            return "";
        }
    }

    @Override // com.ali.user.open.core.service.StorageService
    public void getUmid(final MemberCallback<String> memberCallback) {
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f183f46", new Object[]{this, memberCallback});
            return;
        }
        try {
            if (ConfigManager.getInstance().getEnvironment() == Environment.TEST) {
                i = 2;
            } else if (ConfigManager.getInstance().getEnvironment() != Environment.PRE) {
                i = 0;
            }
            IUMIDComponent uMIDComp = getSecurityGuardManager().getUMIDComp();
            String securityToken = uMIDComp.getSecurityToken(i);
            if (!TextUtils.isEmpty(securityToken) && securityToken.length() != 24) {
                if (memberCallback == null) {
                    return;
                }
                memberCallback.onSuccess(securityToken);
                return;
            }
            uMIDComp.initUMID(i, new IUMIDInitListenerEx() { // from class: com.ali.user.open.securityguard.SecurityGuardWrapper.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alibaba.wireless.security.open.umid.IUMIDInitListenerEx
                public void onUMIDInitFinishedEx(String str, int i2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("1c2fc40b", new Object[]{this, str, new Integer(i2)});
                        return;
                    }
                    MemberCallback memberCallback2 = memberCallback;
                    if (memberCallback2 == null) {
                        return;
                    }
                    memberCallback2.onSuccess(str);
                }
            });
        } catch (Throwable th) {
            th.printStackTrace();
            if (memberCallback == null) {
                return;
            }
            memberCallback.onSuccess("");
        }
    }

    @Override // com.ali.user.open.core.service.StorageService
    public WUAData getWUA() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WUAData) ipChange.ipc$dispatch("2e3a45fa", new Object[]{this});
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            String valueOf = String.valueOf(currentTimeMillis);
            String appKey = getAppKey();
            return new WUAData(appKey, valueOf, ((ISecurityBodyComponent) getSecurityGuardManager().getInterface(ISecurityBodyComponent.class)).getSecurityBodyDataEx(String.valueOf(currentTimeMillis), appKey, "", null, 4, convertEnvToMtop()));
        } catch (Exception e) {
            SDKLogger.e("SecurityGuardWrapper", e.getMessage());
            return null;
        }
    }

    private int convertEnvToMtop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65bf83b7", new Object[]{this})).intValue();
        }
        if (ConfigManager.getInstance().getEnvironment() == Environment.TEST) {
            return 2;
        }
        return ConfigManager.getInstance().getEnvironment() == Environment.PRE ? 1 : 0;
    }

    @Override // com.ali.user.open.core.service.StorageService
    public String getAppKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("49079005", new Object[]{this});
        }
        if (ConfigManager.forceAppkey != null) {
            return ConfigManager.forceAppkey;
        }
        try {
            return getSecurityGuardManager().getStaticDataStoreComp().getAppKeyByIndex(ConfigManager.getAppKeyIndex(), ConfigManager.POSTFIX_OF_SECURITY_JPG);
        } catch (Throwable unused) {
            return "21646297";
        }
    }

    @Override // com.ali.user.open.core.service.StorageService
    public synchronized boolean saveSafeToken(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9b5c8e", new Object[]{this, str, str2})).booleanValue();
        } else if (TextUtils.isEmpty(str) || getSecurityGuardManager() == null) {
            return false;
        } else {
            try {
                ISafeTokenComponent safeTokenComp = getSecurityGuardManager().getSafeTokenComp();
                if (safeTokenComp == null) {
                    return false;
                }
                String[] strArr = {"", "", "", ""};
                int length = strArr.length;
                return safeTokenComp.saveToken(str, str2, strArr[0], 0);
            } catch (SecException e) {
                e.printStackTrace();
                return false;
            } catch (Throwable th) {
                th.printStackTrace();
                return false;
            }
        }
    }

    @Override // com.ali.user.open.core.service.StorageService
    public void removeSafeToken(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27370ad9", new Object[]{this, str});
            return;
        }
        try {
            getSecurityGuardManager().getSafeTokenComp().removeToken(str);
        } catch (SecException e) {
            e.printStackTrace();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.ali.user.open.core.service.StorageService
    public String signMap(String str, TreeMap<String, String> treeMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e5c8a66d", new Object[]{this, str, treeMap});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : treeMap.entrySet()) {
            sb.append(entry.getKey());
            sb.append("=");
            sb.append(entry.getValue());
            sb.append("&");
        }
        return signForLogin(str, sb.substring(0, sb.length() - 1));
    }

    private String signForLogin(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1f1ce988", new Object[]{this, str, str2});
        }
        try {
            return getSecurityGuardManager().getSafeTokenComp().signWithToken(str, str2.getBytes("UTF-8"), 0);
        } catch (SecException e) {
            e.printStackTrace();
            return null;
        } catch (UnsupportedEncodingException e2) {
            e2.printStackTrace();
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    @Override // com.ali.user.open.core.service.StorageService
    public String decrypt(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("72c54002", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            IDynamicDataEncryptComponent dynamicDataEncryptComp = getSecurityGuardManager().getDynamicDataEncryptComp();
            if (dynamicDataEncryptComp == null) {
                return "";
            }
            String dynamicDecryptDDp = dynamicDataEncryptComp.dynamicDecryptDDp(str);
            return TextUtils.isEmpty(dynamicDecryptDDp) ? str : dynamicDecryptDDp;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    @Override // com.ali.user.open.core.service.StorageService
    public String encode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f52dc359", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                IDynamicDataEncryptComponent dynamicDataEncryptComp = getSecurityGuardManager().getDynamicDataEncryptComp();
                if (dynamicDataEncryptComp != null) {
                    String dynamicEncryptDDp = dynamicDataEncryptComp.dynamicEncryptDDp(str);
                    return TextUtils.isEmpty(dynamicEncryptDDp) ? str : dynamicEncryptDDp;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return str;
    }
}
