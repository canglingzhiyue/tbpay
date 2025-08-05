package com.alibaba.wireless.aliprivacyext.jsbridge.api;

import android.content.Context;
import com.alibaba.wireless.aliprivacy.PrivacyAuthSetParam;
import com.alibaba.wireless.aliprivacy.PrivacyCode;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

@com.alibaba.wireless.aliprivacyext.jsbridge.c(name = {"setAuthStatusByScenes"})
/* loaded from: classes3.dex */
public class h extends com.alibaba.wireless.aliprivacyext.jsbridge.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String e = "h";

    /* loaded from: classes3.dex */
    public class a extends HashMap<String, Object> {
        public final /* synthetic */ PrivacyCode val$resultCode;

        public a(PrivacyCode privacyCode) {
            this.val$resultCode = privacyCode;
            put("resultCode", this.val$resultCode.toString());
        }
    }

    @Override // com.alibaba.wireless.aliprivacyext.jsbridge.a
    public boolean a(Context context, String str, String str2, com.alibaba.wireless.aliprivacyext.plugins.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b709cffc", new Object[]{this, context, str, str2, bVar})).booleanValue();
        }
        try {
            PrivacyAuthSetParam privacyAuthSetParam = (PrivacyAuthSetParam) com.alibaba.wireless.aliprivacyext.f.a(str2, PrivacyAuthSetParam.class);
            if (privacyAuthSetParam == null || privacyAuthSetParam.getAuthSetParams() == null || privacyAuthSetParam.getAuthSetParams().isEmpty()) {
                b(bVar, "参数异常", null);
                return true;
            }
            a(bVar, "调用成功", new a(com.alibaba.wireless.aliprivacy.b.a(context, privacyAuthSetParam, "h5")));
            return true;
        } catch (Throwable th) {
            com.alibaba.wireless.aliprivacy.c.b(e, "", th);
            b(bVar, com.alibaba.wireless.aliprivacyext.jsbridge.a.d, null);
            return true;
        }
    }
}
