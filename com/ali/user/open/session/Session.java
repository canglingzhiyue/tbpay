package com.ali.user.open.session;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class Session {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String avatarUrl;
    public String bindToken;
    public long expireIn;
    public String hid;
    public long loginTime;
    public String nick;
    public String openId;
    public String openSid;
    public String sid;
    public String topAccessToken;
    public String topAuthCode;
    public String topExpireTime;

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "nick = " + this.nick + ", ava = " + this.avatarUrl + " , hid=" + this.hid + ", Sid=" + this.sid + ", topAccessToken=" + this.topAccessToken + ", topAuthCode=" + this.topAuthCode + ",topExpireTime=" + this.topExpireTime;
    }
}
