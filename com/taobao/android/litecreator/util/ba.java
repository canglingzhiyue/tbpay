package com.taobao.android.litecreator.util;

import mtopsdk.common.util.StringUtils;
import com.ali.user.mobile.model.TokenType;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.Login;
import com.taobao.tao.Globals;
import com.ut.device.UTDevice;
import java.util.Map;
import tb.hfi;
import tb.kge;

/* loaded from: classes5.dex */
public class ba {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1372882082);
    }

    public static String a() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        String userId = Login.getUserId();
        String utdid = UTDevice.getUtdid(Globals.getApplication());
        if (StringUtils.isEmpty(userId)) {
            u.d(TokenType.LOGIN, "Login.getUserId() is empty");
            str = "Login_UserId_Empty";
        } else {
            str = "Login_UserId_Not_Empty";
        }
        hfi.a("Page_UmiPublish", str, (Map<String, String>) null);
        return !StringUtils.isEmpty(userId) ? userId : !StringUtils.isEmpty(utdid) ? utdid : "default";
    }
}
