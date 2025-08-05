package com.alipay.android.app.smartpays.fingerprint.callback;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.alipay.android.app.safepaylog.utils.LogUtils;
import com.alipay.android.app.smartpays.api.callback.IFingerprintCallback;
import com.alipay.android.app.smartpays.api.model.FingerprintResult;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.draft.DraftMediaHelper;

@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: classes3.dex */
public class FingerprintSensorProxyCallback extends FingerprintProxyCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FP_SENSOR_STATUS_INTENT = "com.alipay.security.mobile.alipayauthenticatorservice.broadcast.FINGERPRINTSENSOR_STATUS_ACTION";
    public static final String FP_SENSOR_STATUS_VALUE = "com.alipay.security.mobile.alipayauthenticatorservice.broadcast.FINGERPRINTSENSOR_STATUS_VALUE";

    /* renamed from: a  reason: collision with root package name */
    private BroadcastReceiver f4410a;

    public static /* synthetic */ Object ipc$super(FingerprintSensorProxyCallback fingerprintSensorProxyCallback, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public FingerprintSensorProxyCallback(Context context, IFingerprintCallback iFingerprintCallback) {
        super(context, iFingerprintCallback);
    }

    @Override // com.alipay.android.app.smartpays.fingerprint.callback.FingerprintProxyCallback
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            c();
        }
    }

    @Override // com.alipay.android.app.smartpays.fingerprint.callback.FingerprintProxyCallback
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            e();
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        LogUtils.record(2, "FingerprintSensorProxyCallback::unregisterFpSensorReceiver", "");
        if (this.f4410a == null) {
            return;
        }
        try {
            this.f.unregisterReceiver(this.f4410a);
        } catch (Throwable th) {
            LogUtils.printExceptionStackTrace(th);
        }
        this.f4410a = null;
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        LogUtils.record(2, "FingerprintSensorProxyCallback::registerFpSensorReceiver", "");
        if (this.f4410a != null) {
            return;
        }
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.alipay.android.app.smartpays.fingerprint.callback.FingerprintSensorProxyCallback.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    return;
                }
                int intExtra = intent.getIntExtra("com.alipay.security.mobile.alipayauthenticatorservice.broadcast.FINGERPRINTSENSOR_STATUS_VALUE", 0);
                LogUtils.record(2, "FingerprintSensorProxyCallback::registerFpSensorReceiver", "onReceive, status=" + intExtra);
                if (intExtra == 0 || intExtra == 1 || intExtra != 2) {
                    return;
                }
                FingerprintSensorProxyCallback.this.onProgressChanged(false, new FingerprintResult(FingerprintResult.FingerprintStatus.COMMON_VERIFYING));
            }
        };
        try {
            IntentFilter intentFilter = new IntentFilter("com.alipay.security.mobile.alipayauthenticatorservice.broadcast.FINGERPRINTSENSOR_STATUS_ACTION");
            if (Build.VERSION.SDK_INT >= 33) {
                this.f.registerReceiver(broadcastReceiver, intentFilter, 4);
            } else {
                this.f.registerReceiver(broadcastReceiver, intentFilter);
            }
        } catch (Throwable th) {
            LogUtils.printExceptionStackTrace(th);
        }
        this.f4410a = broadcastReceiver;
    }
}
