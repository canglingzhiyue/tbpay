package com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.callback;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.model.FingerprintResult;
import com.alipay.android.msp.utils.EventLogUtil;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class FingerprintCancelableProxyCallback extends FingerprintSensorProxyCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private BroadcastReceiver f4746a;

    public static /* synthetic */ Object ipc$super(FingerprintCancelableProxyCallback fingerprintCancelableProxyCallback, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 90991720) {
            super.a();
            return null;
        } else if (hashCode != 91915241) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.b();
            return null;
        }
    }

    public FingerprintCancelableProxyCallback(Context context, IFingerprintCallback iFingerprintCallback) {
        super(context, iFingerprintCallback);
        EventLogUtil.logPayEvent("104851", "content_type", "FingerprintCancelableProxyCallback");
    }

    @Override // com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.callback.FingerprintSensorProxyCallback, com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.callback.FingerprintProxyCallback
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        super.a();
        LogUtil.record(2, "FingerprintCancelableProxyCallback::registerCancelReceiver", "");
        if (this.f4746a != null) {
            return;
        }
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.callback.FingerprintCancelableProxyCallback.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    return;
                }
                LogUtil.record(2, "FingerprintCancelableProxyCallback::registerCancelReceiver", "onReceive Broadcast");
                FingerprintCancelableProxyCallback.this.onCallBack(new FingerprintResult(FingerprintResult.FingerprintStatus.COMMON_TIMEOUT));
            }
        };
        try {
            LocalBroadcastManager.getInstance(this.e).registerReceiver(broadcastReceiver, new IntentFilter("com.alipay.android.app.FINGERPRINT_VERIFY_CHANGED"));
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
        this.f4746a = broadcastReceiver;
    }

    @Override // com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.callback.FingerprintSensorProxyCallback, com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.callback.FingerprintProxyCallback
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        super.b();
        LogUtil.record(2, "FingerprintCancelableProxyCallback::unregisterCancelReceiver", "");
        if (this.f4746a == null) {
            return;
        }
        try {
            LocalBroadcastManager.getInstance(this.e).unregisterReceiver(this.f4746a);
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
        this.f4746a = null;
    }
}
