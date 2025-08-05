package com.taobao.android.tschedule.parser.expr.login;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes6.dex */
public class LoginInfo implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String nick;
    private String oldNick;
    private String oldUserId;
    private String userId;
    private String userName;

    static {
        kge.a(-759953328);
        kge.a(1028243835);
    }

    public LoginInfo() {
    }

    public LoginInfo(String str, String str2, String str3, String str4, String str5) {
        this.userId = str;
        this.oldUserId = str2;
        this.userName = str3;
        this.nick = str4;
        this.oldNick = str5;
    }

    public String getUserId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("58ad3b3d", new Object[]{this}) : this.userId;
    }

    public String getOldUserId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("32ec82c2", new Object[]{this}) : this.oldUserId;
    }

    public String getUserName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d328f00d", new Object[]{this}) : this.userName;
    }

    public String getNick() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9d48c0c0", new Object[]{this}) : this.nick;
    }

    public String getOldNick() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e34e2585", new Object[]{this}) : this.oldNick;
    }
}
