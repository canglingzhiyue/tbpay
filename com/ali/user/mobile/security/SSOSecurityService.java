package com.ali.user.mobile.security;

import android.content.Context;
import android.text.TextUtils;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.app.init.Debuggable;
import com.alibaba.wireless.security.open.SecException;
import com.alibaba.wireless.security.open.SecurityGuardParamContext;
import com.alibaba.wireless.security.open.securesignature.ISecureSignatureComponent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.log.LoginTLogAdapter;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import tb.kge;

/* loaded from: classes2.dex */
public class SSOSecurityService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "Login.SSOSecurityService";
    private static ISecureSignatureComponent signComponent;
    private static SSOSecurityService ssoSecurityService;

    static {
        kge.a(1181460077);
    }

    public static SSOSecurityService getInstace(Context context) throws SecException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SSOSecurityService) ipChange.ipc$dispatch("e9669d9e", new Object[]{context});
        }
        if (ssoSecurityService == null) {
            ssoSecurityService = new SSOSecurityService();
            if (SecurityGuardManagerWraper.getSecurityGuardManager() != null) {
                signComponent = SecurityGuardManagerWraper.getSecurityGuardManager().getSecureSignatureComp();
            }
        }
        return ssoSecurityService;
    }

    private SSOSecurityService() {
    }

    private static ISecureSignatureComponent getSignComponent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ISecureSignatureComponent) ipChange.ipc$dispatch("6b4a0063", new Object[0]);
        }
        if (signComponent == null && SecurityGuardManagerWraper.getSecurityGuardManager() != null) {
            signComponent = SecurityGuardManagerWraper.getSecurityGuardManager().getSecureSignatureComp();
        }
        return signComponent;
    }

    public String sign(String str, TreeMap<String, String> treeMap, String str2) throws SecException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d3e8c701", new Object[]{this, str, treeMap, str2});
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
        return sign(str, sb.substring(0, sb.length() - 1), str2);
    }

    public String sign(String str, TreeMap<String, String> treeMap) throws SecException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("70fdd84b", new Object[]{this, str, treeMap}) : sign(str, treeMap, "");
    }

    public static String sign(String str, String str2, String str3) throws SecException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6ca74a3e", new Object[]{str, str2, str3});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("INPUT", str2);
        if (!TextUtils.isEmpty(str3)) {
            hashMap.put("ATLAS", str3);
        }
        if (DataProviderFactory.getDataProvider().getEnvType() == 1) {
            hashMap.put("ATLAS", "daily");
        }
        SecurityGuardParamContext securityGuardParamContext = new SecurityGuardParamContext();
        securityGuardParamContext.appKey = str;
        securityGuardParamContext.paramMap = hashMap;
        securityGuardParamContext.requestType = 5;
        String str4 = "";
        if (getSignComponent() != null) {
            str4 = getSignComponent().signRequest(securityGuardParamContext, str4);
        }
        if (Debuggable.isDebug()) {
            LoginTLogAdapter.e(TAG, "sign = " + str4 + " ,appKey = " + str + ", beSigned = " + str2);
        }
        return str4;
    }

    public static String sign(String str, String str2) throws SecException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d0aca0c8", new Object[]{str, str2}) : sign(str, str2, "");
    }
}
