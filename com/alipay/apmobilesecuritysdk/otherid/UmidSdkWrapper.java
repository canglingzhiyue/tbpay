package com.alipay.apmobilesecuritysdk.otherid;

import android.content.Context;
import android.util.Log;
import com.alibaba.wireless.security.open.SecException;
import com.alibaba.wireless.security.open.SecurityGuardManager;
import com.alibaba.wireless.security.open.umid.IUMIDComponent;
import com.alibaba.wireless.security.open.umid.IUMIDInitListenerEx;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.dp.DeviceSecuritySDK;
import tb.cjw;
import tb.ckg;
import tb.ckn;

/* loaded from: classes3.dex */
public class UmidSdkWrapper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String UMIDTOKEN_FILE_NAME = "xxxwww_v2";
    private static final String UMIDTOKEN_KEY_NAME = "umidtk";
    private static volatile String cachedUmidToken = "";
    private static volatile boolean initUmidFinished = false;

    public static /* synthetic */ boolean access$002(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e1554b7f", new Object[]{new Boolean(z)})).booleanValue();
        }
        initUmidFinished = z;
        return z;
    }

    private static String compatUmidBug(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8c4ce534", new Object[]{context, str});
        }
        if (!cjw.a(str) && !cjw.a(str, "000000000000000000000000")) {
            return str;
        }
        String utdid = UtdidWrapper.getUtdid(context);
        if (utdid != null && utdid.contains("?")) {
            utdid = "";
        }
        return cjw.a(utdid) ? "" : utdid;
    }

    public static synchronized String getSecurityToken(Context context) {
        String securityToken;
        synchronized (UmidSdkWrapper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("11405f42", new Object[]{context});
            }
            if (cjw.a(cachedUmidToken)) {
                String a2 = ckg.a(context, UMIDTOKEN_FILE_NAME, UMIDTOKEN_KEY_NAME);
                cachedUmidToken = a2;
                if (cjw.a(a2)) {
                    try {
                        securityToken = DeviceSecuritySDK.getInstance(context).getSecurityToken();
                    } catch (Throwable unused) {
                    }
                    cachedUmidToken = compatUmidBug(context, securityToken);
                }
            }
            return cachedUmidToken;
        }
    }

    public static String startUmidTaskSync(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ee0fe029", new Object[]{context, new Integer(i)});
        }
        String str = "";
        try {
            initUmidFinished = false;
            if (i == 3) {
                i = 1;
            }
            try {
                IUMIDComponent uMIDComp = SecurityGuardManager.getInstance(context).getUMIDComp();
                if (uMIDComp != null) {
                    try {
                        uMIDComp.initUMID(i, new IUMIDInitListenerEx() { // from class: com.alipay.apmobilesecuritysdk.otherid.UmidSdkWrapper.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.alibaba.wireless.security.open.umid.IUMIDInitListenerEx
                            public final void onUMIDInitFinishedEx(String str2, int i2) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("1c2fc40b", new Object[]{this, str2, new Integer(i2)});
                                } else if (i2 != 200) {
                                } else {
                                    UmidSdkWrapper.access$002(true);
                                }
                            }
                        });
                    } catch (SecException e) {
                        Log.e("APSecuritySdk", "[UmidSdkWrapper] umidComponent.registerInitListener Error: " + e.getErrorCode());
                        return str;
                    }
                }
                for (int i2 = 3000; !initUmidFinished && i2 > 0; i2 -= 10) {
                    Thread.sleep(10L);
                }
                if (uMIDComp != null) {
                    str = uMIDComp.getSecurityToken(0);
                }
                "[UmidSdkWrapper] startUmidTaskSync() tmpUmidToken: ".concat(String.valueOf(str));
            } catch (SecException e2) {
                Log.e("APSecuritySdk", "[UmidSdkWrapper] SecurityGuardManager.getInstance(context) Error: " + e2.getErrorCode());
                return str;
            }
        } catch (Throwable th) {
            ckn.a("Umid request error.");
            ckn.a(th);
        }
        String compatUmidBug = compatUmidBug(context, str);
        updateLocalUmidToken(context, compatUmidBug);
        return compatUmidBug;
    }

    private static synchronized void updateLocalUmidToken(Context context, String str) {
        synchronized (UmidSdkWrapper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5564227", new Object[]{context, str});
                return;
            }
            if (cjw.b(str)) {
                ckg.a(context, UMIDTOKEN_FILE_NAME, UMIDTOKEN_KEY_NAME, str);
                cachedUmidToken = str;
            }
        }
    }
}
