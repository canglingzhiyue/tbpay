package com.alipay.security.mobile.auth;

import android.os.Bundle;
import android.os.Message;
import com.alipay.security.mobile.auth.message.AuthenticatorMessage;
import com.alipay.security.mobile.auth.message.AuthenticatorResponse;
import com.alipay.security.mobile.cache.AuthenticatorCache;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import tb.riy;

/* loaded from: classes3.dex */
public class AuthenticatorUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void sendAuthenticatorMessage(AuthenticatorCallback authenticatorCallback, int i, int i2, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cd22186", new Object[]{authenticatorCallback, new Integer(i), new Integer(i2), new Boolean(z), str});
        } else {
            sendAuthenticatorMessage(authenticatorCallback, i, i2, z, str, null);
        }
    }

    public static void sendAuthenticatorMessage(AuthenticatorCallback authenticatorCallback, int i, int i2, boolean z, String str, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6248e277", new Object[]{authenticatorCallback, new Integer(i), new Integer(i2), new Boolean(z), str, list});
        } else if (authenticatorCallback == null) {
        } else {
            Message message = new Message();
            Bundle bundle = new Bundle();
            bundle.putInt(AuthenticatorMessage.KEY_OPERATIONT_TYPE, i);
            bundle.putInt(AuthenticatorMessage.KEY_RESULT, i2);
            bundle.putBoolean(AuthenticatorMessage.KEY_CHECKING_POLICY, z);
            bundle.putStringArrayList(AuthenticatorMessage.KEY_REGISTERED_TOKENS, (ArrayList) list);
            bundle.putString(AuthenticatorMessage.KEY_MESSAGE, str);
            message.setData(bundle);
            AuthenticatorResponse authenticatorResponse = AuthenticatorResponseUtil.getAuthenticatorResponse(message);
            if (authenticatorResponse != null && authenticatorResponse.getType() != 9 && (authenticatorResponse.getType() == 8 || authenticatorResponse.getType() == 10)) {
                AuthenticatorCache.getInstance().refreshCache(null, "", 5000L);
            }
            if (authenticatorResponse != null) {
                AuthenticatorLOG.fpInfo("SamsungNNLFIDOFingerPrint.processAsyn callback [type:" + authenticatorResponse.getType() + "] [result:" + authenticatorResponse.getResult() + riy.ARRAY_END_STR);
            } else {
                AuthenticatorLOG.fpInfo("SamsungNNLFIDOFingerPrint.processAsyn callback [null]");
            }
            authenticatorCallback.callback(authenticatorResponse);
        }
    }
}
