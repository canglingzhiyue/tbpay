package com.taobao.android.detail.wrapper.ext.provider.option;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliConfigInterface;
import tb.emu;
import tb.kge;

/* loaded from: classes5.dex */
public class b implements com.taobao.android.detail.datasdk.protocol.adapter.optional.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private AliConfigInterface f11344a;

    static {
        kge.a(-1979285742);
        kge.a(-307413786);
    }

    public b(AliConfigInterface aliConfigInterface) {
        emu.a("com.taobao.android.detail.wrapper.ext.provider.option.TBConfigProvider");
        this.f11344a = aliConfigInterface;
    }

    @Override // com.taobao.android.detail.datasdk.protocol.adapter.optional.b
    public String a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("457cf91a", new Object[]{this, str, str2, str3});
        }
        AliConfigInterface aliConfigInterface = this.f11344a;
        return aliConfigInterface == null ? str3 : aliConfigInterface.a(str, str2, str3);
    }
}
