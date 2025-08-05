package com.taobao.android.dinamicx;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliLogInterface;
import tb.fuy;

/* loaded from: classes.dex */
public class aj implements fuy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private volatile AliLogInterface f11802a;

    private synchronized void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        if (this.f11802a == null) {
            this.f11802a = com.taobao.android.n.a();
        }
    }

    @Override // tb.fuy
    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
            return;
        }
        if (this.f11802a == null) {
            a();
        }
        if (this.f11802a == null) {
            return;
        }
        this.f11802a.b(str, str2, str3);
    }

    @Override // tb.fuy
    public void b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3509d07", new Object[]{this, str, str2, str3});
            return;
        }
        if (this.f11802a == null) {
            a();
        }
        if (this.f11802a == null) {
            return;
        }
        this.f11802a.d(str, str2, str3);
    }
}
