package com.taobao.android;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;

/* loaded from: classes4.dex */
public class AliNavServiceImp implements AliNavServiceInterface {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.taobao.android.AliNavServiceInterface
    public AliNavInterface a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AliNavInterface) ipChange.ipc$dispatch("48f28784", new Object[]{this, context}) : new AliNavImp(Nav.from(context));
    }
}
