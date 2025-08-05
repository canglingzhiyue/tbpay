package com.taobao.android.dinamicx;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliLogInterface;
import tb.fpc;

/* loaded from: classes.dex */
public class bt implements fpc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private AliLogInterface f11828a = com.taobao.android.n.a();

    @Override // tb.fpc
    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
            return;
        }
        AliLogInterface aliLogInterface = this.f11828a;
        if (aliLogInterface == null) {
            return;
        }
        aliLogInterface.b(str, str2, str3);
    }

    @Override // tb.fpc
    public void b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3509d07", new Object[]{this, str, str2, str3});
            return;
        }
        AliLogInterface aliLogInterface = this.f11828a;
        if (aliLogInterface == null) {
            return;
        }
        aliLogInterface.d(str, str2, str3);
    }
}
