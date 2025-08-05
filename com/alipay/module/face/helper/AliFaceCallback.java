package com.alipay.module.face.helper;

import com.alibaba.security.rp.scanface.AuditResultCallback;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class AliFaceCallback implements AuditResultCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public AliFaceResultCallback f6109a;

    /* loaded from: classes3.dex */
    public interface AliFaceResultCallback {
        void a(int i);
    }

    public AliFaceCallback(AliFaceResultCallback aliFaceResultCallback) {
        this.f6109a = aliFaceResultCallback;
    }

    @Override // com.alibaba.security.rp.scanface.AuditResultCallback
    public void onAuditStatus(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1e42fce", new Object[]{this, new Integer(i)});
        } else {
            this.f6109a.a(i);
        }
    }
}
