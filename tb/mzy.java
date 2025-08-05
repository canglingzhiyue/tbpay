package tb;

import android.content.Context;
import com.alibaba.wireless.security.open.SecException;
import com.alibaba.wireless.security.open.SecurityGuardManager;
import com.alibaba.wireless.security.open.SecurityGuardParamContext;
import com.alibaba.wireless.security.open.securesignature.ISecureSignatureComponent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OConstant;
import com.taobao.orange.util.OLog;
import java.util.HashMap;

/* loaded from: classes7.dex */
public class mzy implements nab {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f31351a;

    static {
        kge.a(19757043);
        kge.a(1678113215);
        f31351a = false;
        try {
            Class.forName(OConstant.REFLECT_SECURITYGUARD);
            f31351a = true;
        } catch (ClassNotFoundException unused) {
            f31351a = false;
        }
    }

    @Override // tb.nab
    public String a(Context context, String str, String str2, String str3, String str4) {
        SecurityGuardManager securityGuardManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("61b42118", new Object[]{this, context, str, str2, str3, str4});
        }
        if (!f31351a) {
            OLog.e("TBGuardSign", "no security guard exist", new Object[0]);
            return null;
        }
        try {
            securityGuardManager = SecurityGuardManager.getInstance(context);
        } catch (SecException e) {
            OLog.e("TBGuardSign", "sign", e, new Object[0]);
            securityGuardManager = null;
        }
        if (securityGuardManager == null) {
            OLog.e("TBGuardSign", "get SecurityGuardManager null", new Object[0]);
            return null;
        }
        ISecureSignatureComponent secureSignatureComp = securityGuardManager.getSecureSignatureComp();
        HashMap hashMap = new HashMap();
        hashMap.put("INPUT", str3);
        SecurityGuardParamContext securityGuardParamContext = new SecurityGuardParamContext();
        securityGuardParamContext.appKey = str;
        securityGuardParamContext.paramMap = hashMap;
        securityGuardParamContext.requestType = 3;
        try {
            return secureSignatureComp.signRequest(securityGuardParamContext, str4);
        } catch (SecException e2) {
            OLog.e("TBGuardSign", "sign", e2, new Object[0]);
            return null;
        }
    }
}
