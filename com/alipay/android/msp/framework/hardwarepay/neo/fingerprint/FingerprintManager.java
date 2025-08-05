package com.alipay.android.msp.framework.hardwarepay.neo.fingerprint;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import android.widget.Toast;
import com.alipay.android.msp.framework.hardwarepay.base.IDialogActionListener;
import com.alipay.android.msp.framework.hardwarepay.neo.SmartPayConstants;
import com.alipay.android.msp.framework.hardwarepay.neo.dialog.FingerprintDialog;
import com.alipay.android.msp.framework.hardwarepay.neo.dialog.impl.VerifyEnum;
import com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.callback.FingerprintRetryProxyCallback;
import com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.callback.IFingerprintCallback;
import com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.model.FingerprintRequest;
import com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.model.FingerprintResult;
import com.alipay.android.msp.framework.smartpay.fingerprint.impl.FingerprintAuthenticator;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.language.LanguageHelper;
import com.alipay.android.msp.utils.EventLogUtil;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.riy;

/* loaded from: classes3.dex */
public class FingerprintManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private FingerprintAuthenticator f4737a = new FingerprintAuthenticator();
    private Context b;

    /* renamed from: com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.FingerprintManager$6  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass6 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f4744a = new int[FingerprintResult.FingerprintStatus.values().length];

        static {
            try {
                f4744a[FingerprintResult.FingerprintStatus.COMMON_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4744a[FingerprintResult.FingerprintStatus.COMMON_BUSY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4744a[FingerprintResult.FingerprintStatus.COMMON_CANCELED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4744a[FingerprintResult.FingerprintStatus.COMMON_TIMEOUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4744a[FingerprintResult.FingerprintStatus.COMMON_FAILED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4744a[FingerprintResult.FingerprintStatus.COMMON_VERIFYING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4744a[FingerprintResult.FingerprintStatus.RETRY_LIMIT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f4744a[FingerprintResult.FingerprintStatus.RETRY_ING.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f4744a[FingerprintResult.FingerprintStatus.DLG_CANCEL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f4744a[FingerprintResult.FingerprintStatus.COMMON_TO_PWD.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f4744a[FingerprintResult.FingerprintStatus.DLG_TOPWD.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public static /* synthetic */ Context a(FingerprintManager fingerprintManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("a9e40aca", new Object[]{fingerprintManager}) : fingerprintManager.b;
    }

    public static /* synthetic */ void a(FingerprintManager fingerprintManager, int i, int i2, FingerprintRequest fingerprintRequest, IFingerprintCallback iFingerprintCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca087303", new Object[]{fingerprintManager, new Integer(i), new Integer(i2), fingerprintRequest, iFingerprintCallback});
        } else {
            fingerprintManager.a(i, i2, fingerprintRequest, iFingerprintCallback);
        }
    }

    public static /* synthetic */ FingerprintAuthenticator b(FingerprintManager fingerprintManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FingerprintAuthenticator) ipChange.ipc$dispatch("b0e17f72", new Object[]{fingerprintManager}) : fingerprintManager.f4737a;
    }

    public FingerprintManager(Context context) {
        this.b = context.getApplicationContext();
        EventLogUtil.logPayEvent("104851", "content_type", "FingerprintManager");
    }

    public FingerprintResult initHardwarePay(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FingerprintResult) ipChange.ipc$dispatch("54b0e4c7", new Object[]{this, str});
        }
        LogUtil.record(2, "FingerprintManager:initHardwarePay", "");
        int initHardwarePay = this.f4737a.initHardwarePay(this.b, str);
        if (initHardwarePay == 127) {
            initHardwarePay = 106;
        }
        return new FingerprintResult(initHardwarePay, this.f4737a.getAuthInfo(this.b));
    }

    public int checkUserStatus(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e76e2389", new Object[]{this, str})).intValue();
        }
        LogUtil.record(2, "FingerprintManager::checkUserStatus", "");
        this.f4737a.initHardwarePay(this.b, str);
        return this.f4737a.checkUserStatus(this.b, str);
    }

    public int getRegisteredNumber() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("150b8fdb", new Object[]{this})).intValue();
        }
        LogUtil.record(2, "FingerprintManager::getRegisteredNumber", "");
        return this.f4737a.registeredFingerPrintNumber(this.b);
    }

    public FingerprintResult checkUpdate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FingerprintResult) ipChange.ipc$dispatch("1cba8e30", new Object[]{this});
        }
        LogUtil.record(2, "FingerprintManager::checkUpdate", "");
        return new FingerprintResult(a(SmartPayConstants.PT_CHECK_UPDATE, 0, new FingerprintRequest().mData));
    }

    public FingerprintResult openFingerprintManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FingerprintResult) ipChange.ipc$dispatch("82d5324e", new Object[]{this});
        }
        LogUtil.record(2, "FingerprintManager::openFingerprintManager", "");
        return new FingerprintResult(a(SmartPayConstants.PT_OPEN_FP_MANAGER, 0, new FingerprintRequest().mData));
    }

    public void register(FingerprintRequest fingerprintRequest, IFingerprintCallback iFingerprintCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a0bac0b", new Object[]{this, fingerprintRequest, iFingerprintCallback});
            return;
        }
        LogUtil.record(2, "FingerprintManager::register", "");
        a(SmartPayConstants.PT_REGISTER, 2, fingerprintRequest, iFingerprintCallback);
    }

    public void registerWithDialog(Activity activity, final FingerprintRequest fingerprintRequest, IFingerprintCallback iFingerprintCallback) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f11b0fab", new Object[]{this, activity, fingerprintRequest, iFingerprintCallback});
            return;
        }
        LogUtil.record(2, "FingerprintManager::registerWithDialog", "");
        if (fingerprintRequest.mScanType != 4 && fingerprintRequest.mScanType != 5) {
            z = false;
        }
        final FingerprintDialog fingerprintDialog = z ? null : new FingerprintDialog(activity, VerifyEnum.OPEN);
        final Context applicationContext = activity.getApplicationContext();
        final FingerprintRetryProxyCallback fingerprintRetryProxyCallback = new FingerprintRetryProxyCallback(applicationContext, iFingerprintCallback) { // from class: com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.FingerprintManager.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.callback.FingerprintRetryProxyCallback
            public void onRetryLimit() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("fda89cb9", new Object[]{this});
                }
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            @Override // com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.callback.FingerprintRetryProxyCallback
            public void onStatusChanged(boolean z2, FingerprintResult fingerprintResult) {
                IpChange ipChange2 = $ipChange;
                boolean z3 = true;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b114e29c", new Object[]{this, new Boolean(z2), fingerprintResult});
                    return;
                }
                String str = null;
                int i = -16777216;
                switch (AnonymousClass6.f4744a[fingerprintResult.mStatus.ordinal()]) {
                    case 1:
                        str = LanguageHelper.localizedStringForKey("flybird_fp_val_ok", applicationContext.getString(R.string.flybird_fp_val_ok), new Object[0]);
                        break;
                    case 2:
                        str = LanguageHelper.localizedStringForKey("flybird_fp_validate_too_often", applicationContext.getString(R.string.flybird_fp_validate_too_often), new Object[0]);
                        i = -65536;
                        z3 = false;
                        break;
                    case 3:
                    case 4:
                    case 5:
                        str = LanguageHelper.localizedStringForKey("flybird_fp_val_failed", applicationContext.getString(R.string.flybird_fp_val_failed), new Object[0]);
                        i = -65536;
                        z3 = false;
                        break;
                    case 6:
                        str = LanguageHelper.localizedStringForKey("flybird_fp_validating", applicationContext.getString(R.string.flybird_fp_validating), new Object[0]);
                        z3 = false;
                        break;
                    case 7:
                        str = LanguageHelper.localizedStringForKey("flybird_fp_retry_tips", applicationContext.getString(R.string.flybird_fp_retry_tips), new Object[0]);
                        z3 = false;
                        break;
                    case 8:
                    case 9:
                        z3 = false;
                        break;
                    default:
                        str = LanguageHelper.localizedStringForKey("flybird_fp_val_failed", applicationContext.getString(R.string.flybird_fp_val_failed), new Object[0]);
                        i = -65536;
                        z3 = false;
                        break;
                }
                if (str == null || fingerprintDialog == null) {
                    return;
                }
                if (fingerprintResult.mResult > 0 && !z3) {
                    str = str + riy.ARRAY_START_STR + fingerprintResult.mResult + riy.ARRAY_END_STR;
                }
                fingerprintDialog.updateMsg(str, 0, i);
            }

            @Override // com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.callback.FingerprintRetryProxyCallback
            public void onRetry() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c2145010", new Object[]{this});
                } else {
                    FingerprintManager.a(FingerprintManager.this, SmartPayConstants.PT_REGISTER, 2, fingerprintRequest, this);
                }
            }

            @Override // com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.callback.FingerprintRetryProxyCallback
            public void onFinish(FingerprintResult.FingerprintStatus fingerprintStatus) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("86b82fb9", new Object[]{this, fingerprintStatus});
                    return;
                }
                LogUtil.record(2, "FingerprintManager:getOpenCallback", "onFinish, status=".concat(String.valueOf(fingerprintStatus)));
                FingerprintDialog fingerprintDialog2 = fingerprintDialog;
                if (fingerprintDialog2 != null) {
                    fingerprintDialog2.dismiss();
                }
                if (fingerprintStatus == FingerprintResult.FingerprintStatus.OEM_NEED_UPGRADE) {
                    TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.FingerprintManager.2.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            try {
                                Toast.makeText(applicationContext, LanguageHelper.localizedStringForKey("flybird_fp_oem_need_upgrade", applicationContext.getString(R.string.flybird_fp_oem_need_upgrade), new Object[0]), 1).show();
                            } catch (Throwable th) {
                                LogUtil.printExceptionStackTrace(th);
                            }
                        }
                    });
                }
                FingerprintManager.this.cancel();
            }
        };
        if (fingerprintDialog != null && activity != null) {
            fingerprintDialog.showDialog(activity, LanguageHelper.localizedStringForKey("flybird_fp_open", activity.getString(R.string.flybird_fp_open), new Object[0]), new IDialogActionListener() { // from class: com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.FingerprintManager.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.android.msp.framework.hardwarepay.base.IDialogActionListener
                public void onDialogAction(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("2d7a4c5f", new Object[]{this, new Integer(i)});
                    } else if (i != 0) {
                    } else {
                        fingerprintRetryProxyCallback.onCallBack(new FingerprintResult(FingerprintResult.FingerprintStatus.DLG_CANCEL));
                    }
                }
            });
        }
        a(SmartPayConstants.PT_REGISTER, 2, fingerprintRequest, fingerprintRetryProxyCallback);
    }

    public void verifyWithDialog(Activity activity, FingerprintRequest fingerprintRequest, IFingerprintCallback iFingerprintCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2f1515", new Object[]{this, activity, fingerprintRequest, iFingerprintCallback});
            return;
        }
        LogUtil.record(2, "FingerprintManager::verifyWithDialog", "");
        FingerprintDialog fingerprintDialog = fingerprintRequest.mIsSamsung ? null : new FingerprintDialog(activity, VerifyEnum.VERIFY);
        final FingerprintRetryProxyCallback a2 = a(activity.getApplicationContext(), fingerprintDialog, fingerprintRequest, iFingerprintCallback);
        if (fingerprintDialog != null) {
            fingerprintDialog.showDialog(activity, LanguageHelper.localizedStringForKey("flybird_fp_tips", activity.getString(R.string.flybird_fp_tips), new Object[0]), new IDialogActionListener() { // from class: com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.FingerprintManager.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.android.msp.framework.hardwarepay.base.IDialogActionListener
                public void onDialogAction(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("2d7a4c5f", new Object[]{this, new Integer(i)});
                    } else if (i == 0) {
                        a2.onCallBack(new FingerprintResult(FingerprintResult.FingerprintStatus.DLG_CANCEL));
                    } else if (i != 2) {
                    } else {
                        a2.onCallBack(new FingerprintResult(FingerprintResult.FingerprintStatus.DLG_TOPWD));
                    }
                }
            });
        }
        a(3, 2, fingerprintRequest, a2);
    }

    public void vertify(FingerprintRequest fingerprintRequest, IFingerprintCallback iFingerprintCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e245b183", new Object[]{this, fingerprintRequest, iFingerprintCallback});
            return;
        }
        LogUtil.record(2, "FingerprintManager::vertify", "custom view");
        a(3, 2, fingerprintRequest, a(this.b, (FingerprintDialog) null, fingerprintRequest, iFingerprintCallback));
    }

    public void cancelVerify() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a442e29a", new Object[]{this});
            return;
        }
        LogUtil.record(2, "FingerprintManager::cancelVerify", "");
        try {
            Intent intent = new Intent();
            intent.setAction("com.alipay.android.app.FINGERPRINT_VERIFY_CHANGED");
            LocalBroadcastManager.getInstance(this.b).sendBroadcast(intent);
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }

    public void unregister(FingerprintRequest fingerprintRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6547564f", new Object[]{this, fingerprintRequest});
            return;
        }
        LogUtil.record(2, "FingerprintManager::unregister", "");
        a(SmartPayConstants.PT_UNREGISTER, 0, fingerprintRequest, (IFingerprintCallback) null);
    }

    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
            return;
        }
        LogUtil.record(2, "FingerprintManager::cancel", "");
        TaskHelper.execute(new Runnable() { // from class: com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.FingerprintManager.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    FingerprintManager.b(FingerprintManager.this).cancel(FingerprintManager.a(FingerprintManager.this));
                }
            }
        });
    }

    private String a(int i, int i2, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7529d04e", new Object[]{this, new Integer(i), new Integer(i2), str}) : this.f4737a.process(this.b, i, i2, str);
    }

    private void a(int i, int i2, FingerprintRequest fingerprintRequest, IFingerprintCallback iFingerprintCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24c55a2d", new Object[]{this, new Integer(i), new Integer(i2), fingerprintRequest, iFingerprintCallback});
        } else {
            this.f4737a.processAsync(this.b, fingerprintRequest.mUserId, i, i2, fingerprintRequest.mData, iFingerprintCallback);
        }
    }

    private FingerprintRetryProxyCallback a(final Context context, final FingerprintDialog fingerprintDialog, final FingerprintRequest fingerprintRequest, IFingerprintCallback iFingerprintCallback) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FingerprintRetryProxyCallback) ipChange.ipc$dispatch("bfb2cb7a", new Object[]{this, context, fingerprintDialog, fingerprintRequest, iFingerprintCallback}) : new FingerprintRetryProxyCallback(context, iFingerprintCallback) { // from class: com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.FingerprintManager.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.callback.FingerprintRetryProxyCallback
            public void onRetryLimit() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("fda89cb9", new Object[]{this});
                }
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            @Override // com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.callback.FingerprintRetryProxyCallback
            public void onStatusChanged(boolean z, FingerprintResult fingerprintResult) {
                IpChange ipChange2 = $ipChange;
                boolean z2 = true;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b114e29c", new Object[]{this, new Boolean(z), fingerprintResult});
                    return;
                }
                String str = null;
                int i = -16777216;
                switch (AnonymousClass6.f4744a[fingerprintResult.mStatus.ordinal()]) {
                    case 1:
                        str = LanguageHelper.localizedStringForKey("flybird_fp_val_ok", context.getString(R.string.flybird_fp_val_ok), new Object[0]);
                        break;
                    case 2:
                        str = LanguageHelper.localizedStringForKey("flybird_fp_validate_too_often", context.getString(R.string.flybird_fp_validate_too_often), new Object[0]);
                        i = -65536;
                        z2 = false;
                        break;
                    case 3:
                    case 4:
                    case 5:
                    case 10:
                        str = LanguageHelper.localizedStringForKey("flybird_fp_val_failed", context.getString(R.string.flybird_fp_val_failed), new Object[0]);
                        i = -65536;
                        z2 = false;
                        break;
                    case 6:
                        str = LanguageHelper.localizedStringForKey("flybird_fp_validating", context.getString(R.string.flybird_fp_validating), new Object[0]);
                        z2 = false;
                        break;
                    case 7:
                        str = LanguageHelper.localizedStringForKey("flybird_fp_retry_tips", context.getString(R.string.flybird_fp_retry_tips), new Object[0]);
                        z2 = false;
                        break;
                    case 8:
                    case 9:
                    case 11:
                        z2 = false;
                        break;
                    default:
                        str = LanguageHelper.localizedStringForKey("flybird_fp_val_failed", context.getString(R.string.flybird_fp_val_failed), new Object[0]);
                        i = -65536;
                        z2 = false;
                        break;
                }
                if (str == null || fingerprintDialog == null) {
                    return;
                }
                if (z && !z2) {
                    str = str + "\n转密码支付";
                }
                if (fingerprintResult.mResult > 0 && !z2) {
                    str = str + riy.ARRAY_START_STR + fingerprintResult.mResult + riy.ARRAY_END_STR;
                }
                fingerprintDialog.updateMsg(str, 0, i);
            }

            @Override // com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.callback.FingerprintRetryProxyCallback
            public void onRetry() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c2145010", new Object[]{this});
                } else {
                    FingerprintManager.a(FingerprintManager.this, 3, 2, fingerprintRequest, this);
                }
            }

            @Override // com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.callback.FingerprintRetryProxyCallback
            public void onFinish(FingerprintResult.FingerprintStatus fingerprintStatus) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("86b82fb9", new Object[]{this, fingerprintStatus});
                    return;
                }
                FingerprintDialog fingerprintDialog2 = fingerprintDialog;
                if (fingerprintDialog2 != null) {
                    fingerprintDialog2.dismiss();
                }
                FingerprintManager.this.cancel();
            }
        };
    }
}
