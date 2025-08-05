package com.alipay.module.face.helper;

import com.alibaba.security.realidentity.RPEventListener;
import com.alibaba.security.realidentity.RPResult;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class NewAliFaceCallback extends RPEventListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private NewAliFaceResultCallback f6126a;

    /* loaded from: classes3.dex */
    public interface NewAliFaceResultCallback {
        void a(int i);
    }

    public NewAliFaceCallback(NewAliFaceResultCallback newAliFaceResultCallback) {
        this.f6126a = newAliFaceResultCallback;
    }

    @Override // com.alibaba.security.realidentity.RPEventListener
    public void onFinish(RPResult rPResult, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84fe467c", new Object[]{this, rPResult, str, str2});
        } else if (rPResult == null) {
            VerifyLogCat.i("AliFaceCertHelper", "集团人脸 result null");
            this.f6126a.a(-2);
        } else {
            int i = rPResult.code;
            VerifyLogCat.i("AliFaceCertHelper", "集团人脸 code:" + i);
            this.f6126a.a(i);
        }
    }
}
