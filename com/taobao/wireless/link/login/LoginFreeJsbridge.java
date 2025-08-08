package com.taobao.wireless.link.login;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import org.json.JSONObject;
import tb.kge;
import tb.rkg;
import tb.rki;

/* loaded from: classes9.dex */
public class LoginFreeJsbridge extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTION_LOGIN = "saveTransferLoginInfo";
    public static final String CLASSNAME_LOGINFREEJSBRIDGE = "LoginFreeAPI";

    static {
        kge.a(429135050);
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (StringUtils.equals(str, ACTION_LOGIN)) {
            rkg.a("link_tag", "LoginFreeJsbridge === execute === 写入到手淘的信息：" + str2);
            try {
                JSONObject jSONObject = new JSONObject(str2);
                String str3 = (String) jSONObject.get("schemaUrl");
                String str4 = (String) jSONObject.get("packageName");
                a.a().f23600a = str3;
                if (!StringUtils.isEmpty(str4)) {
                    a.a().b.put(str4, false);
                }
                rkg.a("link_tag", "LoginFreeJsbridge === execute === 写免登信息：schemaUrl=" + str3);
                rki.a(rki.ARG1_WRITE_LOGIN_FREE, str2, str3, new HashMap());
            } catch (Exception e) {
                rkg.a("link_tag", "LoginFreeJsbridge === execute === 写免登信息异常=" + e);
                return false;
            }
        }
        return true;
    }
}
