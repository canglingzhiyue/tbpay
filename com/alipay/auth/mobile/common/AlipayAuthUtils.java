package com.alipay.auth.mobile.common;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.wireless.security.open.SecException;
import com.alibaba.wireless.security.open.SecurityGuardParamContext;
import com.alibaba.wireless.security.open.securesignature.ISecureSignatureComponent;
import com.alipay.auth.mobile.api.IAlipayAuthMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.wireless.security.sdk.SecurityGuardManager;
import com.taobao.wireless.security.sdk.staticdataencrypt.IStaticDataEncryptComponent;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class AlipayAuthUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String strJoint(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e331349b", new Object[]{map}) : strJoint(null, map);
    }

    public static String strJoint(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b7923e65", new Object[]{str, map});
        }
        String str2 = null;
        if (map != null && map.size() > 0) {
            StringBuilder sb = new StringBuilder();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                sb.append(entry.getKey());
                sb.append("=");
                sb.append(entry.getValue());
                sb.append("&");
            }
            str2 = sb.substring(0, sb.lastIndexOf("&"));
        }
        if (!TextUtils.isEmpty(str)) {
            str2 = str + "&" + str2;
        }
        LoggerUtils.d("AlipayAuthUtils", str2);
        return str2;
    }

    public static String encrypt(Context context, String str, String str2, IAlipayAuthMonitor iAlipayAuthMonitor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("19ec37a0", new Object[]{context, str, str2, iAlipayAuthMonitor});
        }
        String str3 = "";
        try {
            LoggerUtils.d("AlipayAuthUtils", "encrypt param appkey=" + str + " data=" + str2);
            SecurityGuardManager securityGuardManager = SecurityGuardManager.getInstance(context);
            if (securityGuardManager == null) {
                return str3;
            }
            LoggerUtils.d("AlipayAuthUtils", "sgMgr != null");
            IStaticDataEncryptComponent staticDataEncryptComp = securityGuardManager.getStaticDataEncryptComp();
            if (staticDataEncryptComp == null) {
                return str3;
            }
            LoggerUtils.d("AlipayAuthUtils", "comp != null");
            str3 = staticDataEncryptComp.staticSafeEncrypt(16, str, str2);
            LoggerUtils.d("AlipayAuthUtils", "encryptData=" + str3);
            return str3;
        } catch (Throwable th) {
            LoggerUtils.e("AlipayAuthUtils", "encrypt error", th);
            MonitorAlipayAuth.getInstance().monitorAlipayAuth(iAlipayAuthMonitor, "AliPayAuth_EncError");
            return str3;
        }
    }

    public static String atlasSignData(Context context, String str, String str2, IAlipayAuthMonitor iAlipayAuthMonitor) {
        String str3 = "";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ed3efaf3", new Object[]{context, str, str2, iAlipayAuthMonitor});
        }
        try {
            com.alibaba.wireless.security.open.SecurityGuardManager securityGuardManager = com.alibaba.wireless.security.open.SecurityGuardManager.getInstance(context);
            LoggerUtils.d("AlipayAuthUtils", "获取sgMgr对象");
            if (securityGuardManager != null) {
                LoggerUtils.d("AlipayAuthUtils", "sgMgr not null");
                ISecureSignatureComponent secureSignatureComp = securityGuardManager.getSecureSignatureComp();
                HashMap hashMap = new HashMap();
                hashMap.put("INPUT", str2);
                hashMap.put("ATLAS", "a");
                SecurityGuardParamContext securityGuardParamContext = new SecurityGuardParamContext();
                securityGuardParamContext.appKey = str;
                securityGuardParamContext.paramMap = hashMap;
                securityGuardParamContext.requestType = 5;
                str3 = secureSignatureComp.signRequest(securityGuardParamContext, str3);
                LoggerUtils.d("AlipayAuthUtils", "sign = " + str3);
            }
        } catch (SecException e) {
            LoggerUtils.e("AlipayAuthUtils", "atlasSignData SecException error", e);
            MonitorAlipayAuth.getInstance().monitorAlipayAuth(iAlipayAuthMonitor, "AliPayAuth_SignError");
        } catch (Throwable th) {
            LoggerUtils.e("AlipayAuthUtils", "atlasSignData error", th);
            MonitorAlipayAuth.getInstance().monitorAlipayAuth(iAlipayAuthMonitor, "AliPayAuth_SignError");
        }
        LoggerUtils.d("AlipayAuthUtils", "end sign = " + str3);
        return str3;
    }
}
