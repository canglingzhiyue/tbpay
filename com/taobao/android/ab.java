package com.taobao.android;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes4.dex */
public class ab implements AliImageInterface {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final com.taobao.phenix.intf.b f8616a;

    public ab(com.taobao.phenix.intf.b bVar) {
        this.f8616a = bVar;
    }

    @Override // com.taobao.android.AliImageInterface
    public AliImageCreatorInterface a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AliImageCreatorInterface) ipChange.ipc$dispatch("48f2f26", new Object[]{this, str}) : new ac(this.f8616a.a(str));
    }
}
