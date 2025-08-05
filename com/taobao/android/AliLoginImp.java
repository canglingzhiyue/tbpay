package com.taobao.android;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;

/* loaded from: classes4.dex */
public class AliLoginImp implements AliLoginInterface {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.taobao.android.AliLoginInterface
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            Login.login(z);
        }
    }

    @Override // com.taobao.android.AliLoginInterface
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            Login.refreshCookies();
        }
    }

    @Override // com.taobao.android.AliLoginInterface
    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : Login.checkSessionValid();
    }

    @Override // com.taobao.android.AliLoginInterface
    public String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : Login.getNick();
    }

    @Override // com.taobao.android.AliLoginInterface
    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : Login.getUserId();
    }
}
