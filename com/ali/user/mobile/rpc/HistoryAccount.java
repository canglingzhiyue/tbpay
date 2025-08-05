package com.ali.user.mobile.rpc;

import android.text.TextUtils;
import com.ali.user.mobile.app.init.Debuggable;
import com.ali.user.mobile.login.model.LoginConstant;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Comparator;
import tb.kge;

/* loaded from: classes2.dex */
public class HistoryAccount implements Comparator {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final boolean DEBUG;
    public String accountId;
    public String alipayCrossed;
    public long alipayHid;
    public String autologinToken;
    public String biometricId;
    public String email;
    public int hasPwd = -1;
    public String headImg;
    public boolean isVip;
    public String loginAccount;
    public String loginPhone;
    public int loginSite;
    public long loginTime;
    public String loginType;
    public String mobile;
    public String nick;
    public String nickName;
    public String srcLoginType;
    public String tokenKey;
    public long userId;
    public String userInputName;
    public String vipExpireTime;

    static {
        kge.a(-850038869);
        kge.a(-2099169482);
        DEBUG = Debuggable.isDebug();
    }

    public String getLoginPhone() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b105ea5e", new Object[]{this}) : this.loginPhone;
    }

    public void setLoginPhone(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6a0e8d8", new Object[]{this, str});
        } else {
            this.loginPhone = str;
        }
    }

    public int getLoginSite() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ae3eff14", new Object[]{this})).intValue() : this.loginSite;
    }

    public void setLoginSite(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e197c00e", new Object[]{this, new Integer(i)});
        } else {
            this.loginSite = i;
        }
    }

    public String getAccountId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("387f3cc7", new Object[]{this}) : this.accountId;
    }

    public void setAccountId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59a617f7", new Object[]{this, str});
        } else {
            this.accountId = str;
        }
    }

    public int isHasPwd() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("eff01207", new Object[]{this})).intValue() : this.hasPwd;
    }

    public void setHasPwd(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d259c137", new Object[]{this, new Integer(i)});
        } else {
            this.hasPwd = i;
        }
    }

    public HistoryAccount() {
    }

    public HistoryAccount(String str, String str2, String str3, long j, long j2, String str4, long j3, String str5, String str6, String str7, String str8, String str9, int i) {
        this.userInputName = str;
        this.mobile = str2;
        this.headImg = str3;
        this.userId = j;
        this.alipayHid = j2;
        this.autologinToken = str4;
        this.loginTime = j3;
        this.tokenKey = str5;
        this.loginType = str6;
        this.nick = str7;
        this.email = str8;
        this.alipayCrossed = str9;
        this.loginSite = i;
    }

    public HistoryAccount(String str, String str2, String str3, long j, long j2, String str4, String str5, String str6) {
        this.mobile = str;
        this.email = str2;
        this.headImg = str3;
        this.userId = j;
        this.loginTime = j2;
        this.loginType = str4;
        this.nickName = str5;
        this.loginAccount = str6;
    }

    public void update(HistoryAccount historyAccount) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54d3c0f4", new Object[]{this, historyAccount});
        } else if (this.userId != historyAccount.userId) {
        } else {
            this.biometricId = historyAccount.biometricId;
            this.autologinToken = historyAccount.autologinToken;
            if (!TextUtils.isEmpty(historyAccount.userInputName)) {
                this.userInputName = historyAccount.userInputName;
            }
            if (!TextUtils.isEmpty(historyAccount.tokenKey)) {
                this.tokenKey = historyAccount.tokenKey;
            }
            this.email = historyAccount.email;
            if (!TextUtils.isEmpty(historyAccount.headImg)) {
                this.headImg = historyAccount.headImg;
            }
            if (!TextUtils.isEmpty(historyAccount.loginType)) {
                this.loginType = historyAccount.loginType;
            }
            this.nick = historyAccount.nick;
            this.mobile = historyAccount.mobile;
            if (!TextUtils.isEmpty(historyAccount.loginAccount)) {
                this.loginAccount = historyAccount.loginAccount;
            }
            long j = historyAccount.loginTime;
            if (j > 0) {
                this.loginTime = j;
            }
            this.loginPhone = historyAccount.loginPhone;
            this.loginSite = historyAccount.loginSite;
            this.alipayCrossed = historyAccount.alipayCrossed;
            this.hasPwd = historyAccount.hasPwd;
            this.isVip = historyAccount.isVip;
            this.vipExpireTime = historyAccount.vipExpireTime;
            setSrcLoginType(historyAccount.srcLoginType);
            this.biometricId = historyAccount.biometricId;
        }
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6a9be197", new Object[]{this, obj, obj2})).intValue();
        }
        long j = ((HistoryAccount) obj).loginTime;
        long j2 = ((HistoryAccount) obj2).loginTime;
        if (j > j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    public String getAccount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("774e9962", new Object[]{this});
        }
        if (!TextUtils.isEmpty(this.loginAccount)) {
            return this.loginAccount;
        }
        return TextUtils.isEmpty(this.mobile) ? this.email : this.mobile;
    }

    public void setSrcLoginType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca820a12", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str) || TextUtils.equals(str, LoginConstant.LOGIN_TYPE_FINGERPRINT)) {
        } else {
            this.srcLoginType = str;
        }
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue() : super.equals(obj);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        if (DEBUG) {
            return "HistoryAccount{, userId=" + this.userId + ", nick=" + this.nick + ", nickName=" + this.nickName + ", email=" + this.email + ", mobile=" + this.mobile + ", loginPhone=" + this.loginPhone + ", loginAccount=" + this.loginAccount + ", loginTime=" + this.loginTime + ", loginType=" + this.loginType + ", srcLoginType=" + this.srcLoginType + ", headImg=" + this.headImg + ", tokenKey=" + this.tokenKey;
        }
        return super.toString();
    }
}
