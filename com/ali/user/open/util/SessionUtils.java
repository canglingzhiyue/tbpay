package com.ali.user.open.util;

import com.ali.user.mobile.model.DeviceTokenSignParam;
import com.ali.user.open.core.util.JSONUtils;
import com.ali.user.open.session.InternalSession;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.session.constants.SessionConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class SessionUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String toInternalSessionJSON(InternalSession internalSession) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1055198c", new Object[]{internalSession});
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(SessionConstants.LOGIN_TIME, internalSession.loginTime);
            jSONObject.put("expireIn", internalSession.expireIn);
            jSONObject.put("sid", internalSession.sid);
            jSONObject.put("site", internalSession.site);
            jSONObject.put("mobile", internalSession.mobile);
            jSONObject.put("loginId", internalSession.loginId);
            jSONObject.put(DeviceTokenSignParam.KEY_AUTOLOGINTOKEN, internalSession.autoLoginToken);
            jSONObject.put("topAccessToken", internalSession.topAccessToken);
            jSONObject.put("topAuthCode", internalSession.topAuthCode);
            jSONObject.put("topExpireTime", internalSession.topExpireTime);
            jSONObject.put("avatarUrl", internalSession.avatarUrl);
            jSONObject.put("userId", internalSession.userId);
            jSONObject.put("openId", internalSession.openId);
            jSONObject.put("openSid", internalSession.openSid);
            jSONObject.put("nick", internalSession.nick);
            jSONObject.put("deviceTokenKey", internalSession.deviceTokenKey);
            jSONObject.put("deviceTokenSalt", internalSession.deviceTokenSalt);
            if (internalSession.otherInfo != null) {
                jSONObject.put("otherInfo", JSONUtils.toJsonObject(internalSession.otherInfo));
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
}
