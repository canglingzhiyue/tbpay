package com.alipay.mobile.intelligentdecision.callback;

import com.android.alibaba.ip.runtime.IpChange;
import com.tmall.android.dai.DAICallback;
import com.tmall.android.dai.DAIError;

/* loaded from: classes3.dex */
public class TBDaiCallBack implements DAICallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private DaiCallback f5722a;

    /* loaded from: classes3.dex */
    public interface DaiCallback {
        void a(DAIError dAIError);

        void a(Object... objArr);
    }

    public TBDaiCallBack(DaiCallback daiCallback) {
        this.f5722a = daiCallback;
    }

    @Override // com.tmall.android.dai.DAICallback
    public void onSuccess(Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f85dc9a6", new Object[]{this, objArr});
            return;
        }
        DaiCallback daiCallback = this.f5722a;
        if (daiCallback == null) {
            return;
        }
        daiCallback.a(objArr);
    }

    @Override // com.tmall.android.dai.DAICallback
    public void onError(DAIError dAIError) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("326e086b", new Object[]{this, dAIError});
            return;
        }
        DaiCallback daiCallback = this.f5722a;
        if (daiCallback == null) {
            return;
        }
        daiCallback.a(dAIError);
    }
}
