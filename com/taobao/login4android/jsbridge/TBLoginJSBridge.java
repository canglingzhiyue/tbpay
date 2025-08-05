package com.taobao.login4android.jsbridge;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.text.TextUtils;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.session.SessionManager;
import com.taobao.login4android.session.constants.SessionConstants;
import com.taobao.tao.Globals;
import tb.kge;

/* loaded from: classes7.dex */
public class TBLoginJSBridge extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public SessionManager session = SessionManager.getInstance(Globals.getApplication());

    static {
        kge.a(1542670414);
    }

    public void getUserInfo(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52e6b1d3", new Object[]{this, wVCallBackContext});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("nick", (Object) this.session.getOldNick());
        jSONObject.put("userId", (Object) this.session.getOldUserId());
        jSONObject.put(SessionConstants.OLD_ENCRYPTED_USERID, (Object) this.session.getOldEncryptedUserId());
        wVCallBackContext.success(jSONObject.toJSONString());
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                UserTrackAdapter.sendUT(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if ("getUserInfo".equals(str)) {
            getUserInfo(wVCallBackContext);
            return true;
        }
        wVCallBackContext.error();
        return false;
    }
}
