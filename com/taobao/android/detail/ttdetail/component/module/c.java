package com.taobao.android.detail.ttdetail.component.module;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.component.module.a;

/* loaded from: classes4.dex */
public class c implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a.C0406a f10538a;

    public c(a.C0406a c0406a) {
        this.f10538a = c0406a;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else {
            a.C0406a.a(this.f10538a);
        }
    }
}
