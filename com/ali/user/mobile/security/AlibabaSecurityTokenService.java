package com.ali.user.mobile.security;

import mtopsdk.common.util.StringUtils;
import com.alibaba.wireless.security.open.SecException;
import com.alibaba.wireless.security.open.safetoken.ISafeTokenComponent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.log.LoginTLogAdapter;
import java.util.Map;
import java.util.TreeMap;
import tb.kge;

/* loaded from: classes2.dex */
public class AlibabaSecurityTokenService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "login.AlibabaSecurityTokenService";

    static {
        kge.a(-759679471);
    }

    public static synchronized boolean saveToken(String str, String str2) {
        synchronized (AlibabaSecurityTokenService.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("fef2849b", new Object[]{str, str2})).booleanValue();
            } else if (StringUtils.isEmpty(str)) {
                SecurityUTHitUtils.utHit("60001", "key = null", "Event_saveTokenFail");
                return true;
            } else {
                try {
                    ISafeTokenComponent safeTokenComp = SecurityGuardManagerWraper.getSecurityGuardManager().getSafeTokenComp();
                    if (safeTokenComp != null) {
                        return safeTokenComp.saveToken(str, str2, null, 0);
                    }
                    SecurityUTHitUtils.utHit("60001", "ISafeTokenComponent = null", "Event_saveTokenFail");
                    return false;
                } catch (SecException e) {
                    LoginTLogAdapter.e(TAG, "saveToken SecException", e);
                    SecurityUTHitUtils.utHit("60001", "ISafeTokenComponent " + e + ",errorCode=" + e.getErrorCode(), "Event_saveTokenFail");
                    return false;
                } catch (Throwable th) {
                    LoginTLogAdapter.e(TAG, "saveToken Throwable", th);
                    SecurityUTHitUtils.utHit("60001", "ISafeTokenComponent " + th, "Event_saveTokenFail");
                    return false;
                }
            }
        }
    }

    public static void removeSafeToken(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27370ad9", new Object[]{str});
            return;
        }
        try {
            SecurityGuardManagerWraper.getSecurityGuardManager().getSafeTokenComp().removeToken(str);
        } catch (SecException e) {
            LoginTLogAdapter.e(TAG, "removeSafeToken SecException", e);
            SecurityUTHitUtils.utHit("60002", "removeToken " + e + ",errorCode=" + e.getErrorCode(), "Event_removeTokenFail");
        } catch (Throwable th) {
            SecurityUTHitUtils.utHit("60002", "removeToke " + th, "Event_removeTokenFail");
            LoginTLogAdapter.e(TAG, "removeSafeToken SecException", th);
        }
    }

    public static String sign(String str, TreeMap<String, String> treeMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("70fdd84b", new Object[]{str, treeMap});
        }
        if (StringUtils.isEmpty(str)) {
            SecurityUTHitUtils.utHit("60003", "signError key is null", "Event_signFail");
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : treeMap.entrySet()) {
            sb.append(entry.getKey());
            sb.append("=");
            sb.append(entry.getValue());
            sb.append("&");
        }
        return sign(str, sb.substring(0, sb.length() - 1));
    }

    public static String sign(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d0aca0c8", new Object[]{str, str2});
        }
        try {
            String signWithToken = SecurityGuardManagerWraper.getSecurityGuardManager().getSafeTokenComp().signWithToken(str, str2.getBytes("UTF-8"), 0);
            if (signWithToken == null) {
                SecurityUTHitUtils.utHit("60009", "signResultNull", "Event_signFail");
            }
            return signWithToken;
        } catch (SecException e) {
            LoginTLogAdapter.e(TAG, "sign", e);
            SecurityUTHitUtils.utHit("60005", "signExceptionError " + e + ",errorCode=" + e.getErrorCode(), "Event_signFail");
            return null;
        } catch (Throwable th) {
            LoginTLogAdapter.e(TAG, "sign", th);
            SecurityUTHitUtils.utHit("60005", "signThrowableError " + th, "Event_signFail");
            return null;
        }
    }
}
