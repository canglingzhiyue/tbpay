package com.taobao.android.fluid.framework.adapter;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import tb.kge;

/* loaded from: classes5.dex */
public class LoginAdapter implements ILoginAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(983262255);
        kge.a(614421318);
    }

    @Override // com.taobao.android.fluid.framework.adapter.IAdapter
    public String getName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this}) : ILoginAdapter.ADAPTER_NAME;
    }

    @Override // com.taobao.android.fluid.framework.adapter.ILoginAdapter
    public String getNick() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9d48c0c0", new Object[]{this}) : Login.getNick();
    }

    @Override // com.taobao.android.fluid.framework.adapter.ILoginAdapter
    public String getUserId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("58ad3b3d", new Object[]{this}) : Login.getUserId();
    }

    @Override // com.taobao.android.fluid.framework.adapter.ILoginAdapter
    public String getUserNickLink() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("481f1c5b", new Object[]{this}) : Login.getHeadPicLink();
    }

    @Override // com.taobao.android.fluid.framework.adapter.ILoginAdapter
    public boolean isSessionValid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f14699db", new Object[]{this})).booleanValue() : Login.checkSessionValid();
    }
}
