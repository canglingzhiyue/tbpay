package com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.callback;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.model.FingerprintResult;
import com.alipay.android.msp.utils.EventLogUtil;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class FingerprintSensorProxyCallback extends FingerprintProxyCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private BroadcastReceiver f4751a;

    public FingerprintSensorProxyCallback(Context context, IFingerprintCallback iFingerprintCallback) {
        super(context, iFingerprintCallback);
        EventLogUtil.logPayEvent("104851", "content_type", "FingerprintSensorProxyCallback");
    }

    @Override // com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.callback.FingerprintProxyCallback
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        LogUtil.record(2, "FingerprintSensorProxyCallback::registerFpSensorReceiver", "");
        if (this.f4751a != null) {
            return;
        }
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.callback.FingerprintSensorProxyCallback.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    return;
                }
                int intExtra = intent.getIntExtra("com.alipay.security.mobile.alipayauthenticatorservice.broadcast.FINGERPRINTSENSOR_STATUS_VALUE", 0);
                LogUtil.record(2, "FingerprintSensorProxyCallback::registerFpSensorReceiver", "onReceive, status=".concat(String.valueOf(intExtra)));
                if (intExtra == 0 || intExtra == 1 || intExtra != 2) {
                    return;
                }
                FingerprintSensorProxyCallback.this.onProgressChanged(false, new FingerprintResult(FingerprintResult.FingerprintStatus.COMMON_VERIFYING));
            }
        };
        try {
            IntentFilter intentFilter = new IntentFilter("com.alipay.security.mobile.alipayauthenticatorservice.broadcast.FINGERPRINTSENSOR_STATUS_ACTION");
            if (Build.VERSION.SDK_INT >= 33) {
                this.e.registerReceiver(broadcastReceiver, intentFilter, 4);
            } else {
                this.e.registerReceiver(broadcastReceiver, intentFilter);
            }
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
        this.f4751a = broadcastReceiver;
    }

    @Override // com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.callback.FingerprintProxyCallback
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        LogUtil.record(2, "FingerprintSensorProxyCallback::unregisterFpSensorReceiver", "");
        if (this.f4751a == null) {
            return;
        }
        try {
            this.e.unregisterReceiver(this.f4751a);
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
        this.f4751a = null;
    }
}
