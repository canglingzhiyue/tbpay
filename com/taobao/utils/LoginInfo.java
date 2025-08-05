package com.taobao.utils;

import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.login.e;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes.dex */
public class LoginInfo implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "nickname")
    public String nickname;
    @JSONField(name = "user_id")
    public String userId;

    static {
        kge.a(17537318);
        kge.a(1028243835);
    }

    @JSONField(serialize = false)
    public boolean isValid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue() : !TextUtils.isEmpty(this.userId) && !TextUtils.isEmpty(this.nickname);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof LoginInfo)) {
            return false;
        }
        LoginInfo loginInfo = (LoginInfo) obj;
        return TextUtils.equals(loginInfo.nickname, this.nickname) && TextUtils.equals(loginInfo.userId, this.userId);
    }

    public static LoginInfo from(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LoginInfo) ipChange.ipc$dispatch("f13852a5", new Object[]{eVar});
        }
        LoginInfo loginInfo = new LoginInfo();
        if (eVar != null) {
            loginInfo.nickname = eVar.c;
            loginInfo.userId = eVar.b;
        }
        return loginInfo;
    }
}
