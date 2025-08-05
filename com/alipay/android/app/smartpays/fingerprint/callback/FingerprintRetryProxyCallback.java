package com.alipay.android.app.smartpays.fingerprint.callback;

import android.content.Context;
import com.alipay.android.app.base.SPTaskHelper;
import com.alipay.android.app.safepaylog.utils.LogUtils;
import com.alipay.android.app.smartpays.api.callback.IFingerprintCallback;
import com.alipay.android.app.smartpays.api.model.FingerprintResult;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.draft.DraftMediaHelper;

@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: classes3.dex */
public abstract class FingerprintRetryProxyCallback extends FingerprintCanceableProxyCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f4407a;
    private boolean b;

    public static /* synthetic */ Object ipc$super(FingerprintRetryProxyCallback fingerprintRetryProxyCallback, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 90991720) {
            super.a();
            return null;
        } else if (hashCode == 91915241) {
            super.b();
            return null;
        } else if (hashCode != 1264806606) {
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
        this.f4407a = 0;
        this.b = false;
    }

    @Override // com.alipay.android.app.smartpays.fingerprint.callback.FingerprintProxyCallback, com.alipay.android.app.smartpays.api.callback.IFingerprintCallback
    public void onProgressChanged(boolean z, FingerprintResult fingerprintResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b636ace", new Object[]{this, new Boolean(z), fingerprintResult});
            return;
        }
        super.onProgressChanged(z, fingerprintResult);
        onStatusChanged(z, fingerprintResult);
    }

    @Override // com.alipay.android.app.smartpays.fingerprint.callback.FingerprintProxyCallback, com.alipay.android.app.smartpays.api.callback.IFingerprintCallback
    public void onCallBack(FingerprintResult fingerprintResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("646591f4", new Object[]{this, fingerprintResult});
        } else if (this.b) {
            LogUtils.record(2, "FingerprintRetryProxyCallback::onCallBack", "mTerminated=true, result=" + fingerprintResult.toString());
        } else {
            this.b = a(fingerprintResult.mStatus);
            this.f4407a++;
            if (this.b) {
                onProgressChanged(true, fingerprintResult);
                a(fingerprintResult);
            } else if (this.f4407a < 3) {
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

    private boolean a(FingerprintResult.FingerprintStatus fingerprintStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcf1a403", new Object[]{this, fingerprintStatus})).booleanValue();
        }
        switch (fingerprintStatus) {
            case COMMON_SUCCESS:
            case COMMON_TIMEOUT:
            case COMMON_BUSY:
            case COMMON_CANCELED:
            case COMMON_TO_PWD:
            case DLG_TOPWD:
            case DLG_CANCEL:
                return true;
            default:
                return false;
        }
    }

    @Override // com.alipay.android.app.smartpays.fingerprint.callback.FingerprintCanceableProxyCallback, com.alipay.android.app.smartpays.fingerprint.callback.FingerprintSensorProxyCallback, com.alipay.android.app.smartpays.fingerprint.callback.FingerprintProxyCallback
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            super.a();
        }
    }

    @Override // com.alipay.android.app.smartpays.fingerprint.callback.FingerprintCanceableProxyCallback, com.alipay.android.app.smartpays.fingerprint.callback.FingerprintSensorProxyCallback, com.alipay.android.app.smartpays.fingerprint.callback.FingerprintProxyCallback
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
            ipChange.ipc$dispatch("34a327b1", new Object[]{this, fingerprintResult});
            return;
        }
        LogUtils.record(2, "FingerprintRetryProxyCallback::finish", "result=" + fingerprintResult.toString());
        b();
        SPTaskHelper.execute(new Runnable() { // from class: com.alipay.android.app.smartpays.fingerprint.callback.FingerprintRetryProxyCallback.1
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
                    LogUtils.printExceptionStackTrace(th);
                }
                FingerprintRetryProxyCallback.this.onFinish(fingerprintResult.mStatus);
                if (FingerprintRetryProxyCallback.this.g == null) {
                    return;
                }
                FingerprintRetryProxyCallback.this.g.onCallBack(fingerprintResult);
            }
        });
    }
}
