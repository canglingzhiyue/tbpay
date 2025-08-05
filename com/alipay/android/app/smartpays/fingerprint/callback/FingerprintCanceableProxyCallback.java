package com.alipay.android.app.smartpays.fingerprint.callback;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import com.alipay.android.app.safepaylog.utils.LogUtils;
import com.alipay.android.app.smartpays.api.callback.IFingerprintCallback;
import com.alipay.android.app.smartpays.api.model.FingerprintResult;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.draft.DraftMediaHelper;

@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: classes3.dex */
public class FingerprintCanceableProxyCallback extends FingerprintSensorProxyCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private BroadcastReceiver f4405a;

    public static /* synthetic */ Object ipc$super(FingerprintCanceableProxyCallback fingerprintCanceableProxyCallback, String str, Object... objArr) {
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

    public FingerprintCanceableProxyCallback(Context context, IFingerprintCallback iFingerprintCallback) {
        super(context, iFingerprintCallback);
    }

    @Override // com.alipay.android.app.smartpays.fingerprint.callback.FingerprintSensorProxyCallback, com.alipay.android.app.smartpays.fingerprint.callback.FingerprintProxyCallback
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        super.a();
        c();
    }

    @Override // com.alipay.android.app.smartpays.fingerprint.callback.FingerprintSensorProxyCallback, com.alipay.android.app.smartpays.fingerprint.callback.FingerprintProxyCallback
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        super.b();
        d();
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        LogUtils.record(2, "FingerprintCanceableProxyCallback::registerCancelReceiver", "");
        if (this.f4405a != null) {
            return;
        }
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.alipay.android.app.smartpays.fingerprint.callback.FingerprintCanceableProxyCallback.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    return;
                }
                LogUtils.record(2, "FingerprintCanceableProxyCallback::registerCancelReceiver", "onReceive Broadcast");
                FingerprintCanceableProxyCallback.this.onCallBack(new FingerprintResult(FingerprintResult.FingerprintStatus.COMMON_TIMEOUT));
            }
        };
        try {
            LocalBroadcastManager.getInstance(this.f).registerReceiver(broadcastReceiver, new IntentFilter("com.alipay.android.app.FINGERPRINT_VERIFY_CHANGED"));
        } catch (Throwable th) {
            LogUtils.printExceptionStackTrace(th);
        }
        this.f4405a = broadcastReceiver;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        LogUtils.record(2, "FingerprintCanceableProxyCallback::unregisterCancelReceiver", "");
        if (this.f4405a == null) {
            return;
        }
        try {
            LocalBroadcastManager.getInstance(this.f).unregisterReceiver(this.f4405a);
        } catch (Throwable th) {
            LogUtils.printExceptionStackTrace(th);
        }
        this.f4405a = null;
    }
}
