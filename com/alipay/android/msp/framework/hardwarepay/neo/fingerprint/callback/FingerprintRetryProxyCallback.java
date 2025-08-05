package com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.callback;

import android.content.Context;
import com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.model.FingerprintResult;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.utils.EventLogUtil;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public abstract class FingerprintRetryProxyCallback extends FingerprintCancelableProxyCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f4748a;
    private boolean b;

    public static /* synthetic */ Object ipc$super(FingerprintRetryProxyCallback fingerprintRetryProxyCallback, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 90991720) {
            super.a();
            return null;
        } else if (hashCode == 91915241) {
            super.b();
            return null;
        } else if (hashCode != 1387948631) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onProgressChanged(((Boolean) objArr[0]).booleanValue(), (FingerprintResult) objArr[1]);
            return null;
        }
    }

    public abstract void onFinish(FingerprintResult.FingerprintStatus fingerprintStatus);

    public abstract void onRetry();

    public abstract void onRetryLimit();

    public abstract void onStatusChanged(boolean z, FingerprintResult fingerprintResult);

    public FingerprintRetryProxyCallback(Context context, IFingerprintCallback iFingerprintCallback) {
        super(context, iFingerprintCallback);
        this.f4748a = 0;
        this.b = false;
        EventLogUtil.logPayEvent("104851", "content_type", "FingerprintRetryProxyCallback");
    }

    @Override // com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.callback.FingerprintProxyCallback, com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.callback.IFingerprintCallback
    public void onProgressChanged(boolean z, FingerprintResult fingerprintResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52ba6a57", new Object[]{this, new Boolean(z), fingerprintResult});
            return;
        }
        super.onProgressChanged(z, fingerprintResult);
        onStatusChanged(z, fingerprintResult);
    }

    @Override // com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.callback.FingerprintProxyCallback, com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.callback.IFingerprintCallback
    public void onCallBack(FingerprintResult fingerprintResult) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2ff7d", new Object[]{this, fingerprintResult});
        } else if (this.b) {
            LogUtil.record(2, "FingerprintRetryProxyCallback::onCallBack", "mTerminated=true, result=" + fingerprintResult.toString());
        } else {
            switch (fingerprintResult.mStatus) {
                case COMMON_SUCCESS:
                case COMMON_TIMEOUT:
                case COMMON_BUSY:
                case COMMON_CANCELED:
                case COMMON_TO_PWD:
                case DLG_TOPWD:
                case DLG_CANCEL:
                case OEM_NEED_UPGRADE:
                    z = true;
                    break;
                default:
                    z = false;
                    break;
            }
            this.b = z;
            this.f4748a++;
            if (this.b) {
                onProgressChanged(true, fingerprintResult);
                a(fingerprintResult);
            } else if (this.f4748a < 3) {
                a();
                onProgressChanged(false, fingerprintResult);
                onProgressChanged(false, new FingerprintResult(FingerprintResult.FingerprintStatus.RETRY_ING));
                onRetry();
            } else {
                onProgressChanged(true, new FingerprintResult(FingerprintResult.FingerprintStatus.RETRY_LIMIT));
                onRetryLimit();
                a(fingerprintResult);
            }
        }
    }

    @Override // com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.callback.FingerprintCancelableProxyCallback, com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.callback.FingerprintSensorProxyCallback, com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.callback.FingerprintProxyCallback
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            super.a();
        }
    }

    @Override // com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.callback.FingerprintCancelableProxyCallback, com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.callback.FingerprintSensorProxyCallback, com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.callback.FingerprintProxyCallback
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            super.b();
        }
    }

    private void a(final FingerprintResult fingerprintResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de5a6e3a", new Object[]{this, fingerprintResult});
            return;
        }
        LogUtil.record(2, "FingerprintRetryProxyCallback::finish", "result=" + fingerprintResult.toString());
        b();
        TaskHelper.execute(new Runnable() { // from class: com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.callback.FingerprintRetryProxyCallback.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    Thread.sleep(100L);
                } catch (Throwable th) {
                    LogUtil.printExceptionStackTrace(th);
                }
                FingerprintRetryProxyCallback.this.onFinish(fingerprintResult.mStatus);
                if (FingerprintRetryProxyCallback.this.f == null) {
                    return;
                }
                FingerprintRetryProxyCallback.this.f.onCallBack(fingerprintResult);
            }
        });
    }
}
