package com.alipay.android.app.smartpays.api;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import com.alipay.android.app.base.SPTaskHelper;
import com.alipay.android.app.safepaylog.utils.LogUtils;
import com.alipay.android.app.smartpays.api.callback.IFingerprintCallback;
import com.alipay.android.app.smartpays.api.model.FingerprintRequest;
import com.alipay.android.app.smartpays.api.model.FingerprintResult;
import com.alipay.android.app.smartpays.cons.Constants;
import com.alipay.android.app.smartpays.fingerprint.callback.FingerprintRetryProxyCallback;
import com.alipay.android.app.smartpays.fingerprint.impl.FingerprintAuthenticator;
import com.alipay.android.app.smartpays.res.IResourceLoader;
import com.alipay.android.app.smartpays.res.loader.ResourceLoader;
import com.alipay.android.app.smartpays.res.provider.ResourceProvider;
import com.alipay.android.app.smartpays.widget.dialog.FingerprintDialog;
import com.alipay.android.app.smartpays.widget.dialog.IDialogActionListener;
import com.alipay.android.app.smartpays.widget.dialog.impl.VerifyEnum;
import com.alipay.android.app.utils.SpOuterUtil;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.draft.DraftMediaHelper;
import java.util.HashMap;

@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: classes3.dex */
public class FingerprintManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private FingerprintAuthenticator f4397a = new FingerprintAuthenticator();
    private Context b;
    private ResourceLoader c;

    @MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
    /* renamed from: com.alipay.android.app.smartpays.api.FingerprintManager$6  reason: invalid class name */
    /* loaded from: classes3.dex */
    public /* synthetic */ class AnonymousClass6 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f4403a = new int[FingerprintResult.FingerprintStatus.values().length];

        static {
            try {
                f4403a[FingerprintResult.FingerprintStatus.COMMON_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4403a[FingerprintResult.FingerprintStatus.COMMON_BUSY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4403a[FingerprintResult.FingerprintStatus.COMMON_CANCELED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4403a[FingerprintResult.FingerprintStatus.COMMON_TIMEOUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4403a[FingerprintResult.FingerprintStatus.COMMON_FAILED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4403a[FingerprintResult.FingerprintStatus.COMMON_VERIFYING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4403a[FingerprintResult.FingerprintStatus.RETRY_LIMIT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f4403a[FingerprintResult.FingerprintStatus.RETRY_ING.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f4403a[FingerprintResult.FingerprintStatus.DLG_CANCEL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f4403a[FingerprintResult.FingerprintStatus.COMMON_TO_PWD.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f4403a[FingerprintResult.FingerprintStatus.DLG_TOPWD.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public static /* synthetic */ Context a(FingerprintManager fingerprintManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("7ec157f3", new Object[]{fingerprintManager}) : fingerprintManager.b;
    }

    public static /* synthetic */ void a(FingerprintManager fingerprintManager, int i, int i2, FingerprintRequest fingerprintRequest, IFingerprintCallback iFingerprintCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50575b9a", new Object[]{fingerprintManager, new Integer(i), new Integer(i2), fingerprintRequest, iFingerprintCallback});
        } else {
            fingerprintManager.a(i, i2, fingerprintRequest, iFingerprintCallback);
        }
    }

    public static /* synthetic */ FingerprintAuthenticator b(FingerprintManager fingerprintManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FingerprintAuthenticator) ipChange.ipc$dispatch("bb24c518", new Object[]{fingerprintManager}) : fingerprintManager.f4397a;
    }

    public FingerprintManager(Context context) {
        this.b = context.getApplicationContext();
        HashMap hashMap = new HashMap();
        hashMap.put("action", "FingerprintManagerInit");
        SpOuterUtil.walletEventLog("1010897", "pay", hashMap);
    }

    public void setResourceProvider(IResourceProvider iResourceProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0e331e4", new Object[]{this, iResourceProvider});
            return;
        }
        LogUtils.record(2, "FingerprintManager::setResourceProvider", "provider:" + iResourceProvider);
        if (iResourceProvider == null) {
            return;
        }
        this.c = new ResourceLoader(iResourceProvider);
    }

    public FingerprintResult initHardwarePay(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FingerprintResult) ipChange.ipc$dispatch("67bf3dfe", new Object[]{this, str});
        }
        LogUtils.record(2, "FingerprintManager::initHardwarePay", "");
        int initHardwarePay = this.f4397a.initHardwarePay(this.b, str);
        if (initHardwarePay == 127) {
            initHardwarePay = 106;
        }
        return new FingerprintResult(initHardwarePay, this.f4397a.getAuthInfo(this.b));
    }

    public int checkUserStatus(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e76e2389", new Object[]{this, str})).intValue();
        }
        LogUtils.record(2, "FingerprintManager::checkUserStatus", "");
        this.f4397a.initHardwarePay(this.b, str);
        return this.f4397a.checkUserStatus(this.b, str);
    }

    public int getRegistedNumber() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("27d289ae", new Object[]{this})).intValue();
        }
        LogUtils.record(2, "FingerprintManager::getRegistedNumber", "");
        return this.f4397a.registedFingerPrintNumber(this.b);
    }

    public FingerprintResult checkUpdate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FingerprintResult) ipChange.ipc$dispatch("f3f55267", new Object[]{this});
        }
        LogUtils.record(2, "FingerprintManager::checkUpdate", "");
        return new FingerprintResult(a(Constants.PT_CHECK_UPDATE, 0, new FingerprintRequest().mData));
    }

    public FingerprintResult openFingerprintManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FingerprintResult) ipChange.ipc$dispatch("5de0f085", new Object[]{this});
        }
        LogUtils.record(2, "FingerprintManager::openFingerprintManager", "");
        return new FingerprintResult(a(Constants.PT_OPEN_FP_MANAGER, 0, new FingerprintRequest().mData));
    }

    public void register(FingerprintRequest fingerprintRequest, IFingerprintCallback iFingerprintCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c697b2b", new Object[]{this, fingerprintRequest, iFingerprintCallback});
            return;
        }
        LogUtils.record(2, "FingerprintManager::register", "");
        a(Constants.PT_REGISTER, 2, fingerprintRequest, iFingerprintCallback);
    }

    public void registerWithDialog(Activity activity, FingerprintRequest fingerprintRequest, IFingerprintCallback iFingerprintCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36a9ecb", new Object[]{this, activity, fingerprintRequest, iFingerprintCallback});
            return;
        }
        LogUtils.record(2, "FingerprintManager::registerWithDialog", "");
        FingerprintDialog a2 = a(activity, fingerprintRequest);
        FingerprintRetryProxyCallback a3 = a(activity, a2, fingerprintRequest, iFingerprintCallback);
        a(activity, a2, a3);
        a(Constants.PT_REGISTER, 2, fingerprintRequest, a3);
    }

    public void verifyWithDialog(Activity activity, FingerprintRequest fingerprintRequest, IFingerprintCallback iFingerprintCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("606ae035", new Object[]{this, activity, fingerprintRequest, iFingerprintCallback});
            return;
        }
        LogUtils.record(2, "FingerprintManager::verifyWithDialog", "");
        FingerprintDialog b = b(activity, fingerprintRequest);
        FingerprintRetryProxyCallback a2 = a((Context) activity, b, fingerprintRequest, iFingerprintCallback);
        b(activity, b, fingerprintRequest, a2);
        a(3, 2, fingerprintRequest, a2);
    }

    public void vertify(FingerprintRequest fingerprintRequest, IFingerprintCallback iFingerprintCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f90150a3", new Object[]{this, fingerprintRequest, iFingerprintCallback});
            return;
        }
        LogUtils.record(2, "FingerprintManager::vertify", "custom view");
        a(3, 2, fingerprintRequest, a(this.b, (FingerprintDialog) null, fingerprintRequest, iFingerprintCallback));
    }

    public void cancelVerify() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a442e29a", new Object[]{this});
            return;
        }
        LogUtils.record(2, "FingerprintManager::cancelVerify", "");
        try {
            Intent intent = new Intent();
            intent.setAction("com.alipay.android.app.FINGERPRINT_VERIFY_CHANGED");
            LocalBroadcastManager.getInstance(this.b).sendBroadcast(intent);
        } catch (Throwable th) {
            LogUtils.printExceptionStackTrace(th);
        }
    }

    public void unregister(FingerprintRequest fingerprintRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abc70ab8", new Object[]{this, fingerprintRequest});
            return;
        }
        LogUtils.record(2, "FingerprintManager::unregister", "");
        a(Constants.PT_UNREGISTER, 0, fingerprintRequest, (IFingerprintCallback) null);
    }

    public String getFpInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c170002b", new Object[]{this});
        }
        LogUtils.record(2, "FingerprintManager::getFpInfo", "");
        return this.f4397a.getFpInfo(this.b);
    }

    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
            return;
        }
        LogUtils.record(2, "FingerprintManager::cancel", "");
        SPTaskHelper.execute(new Runnable() { // from class: com.alipay.android.app.smartpays.api.FingerprintManager.1
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
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7529d04e", new Object[]{this, new Integer(i), new Integer(i2), str}) : this.f4397a.process(this.b, i, i2, str);
    }

    private void a(int i, int i2, FingerprintRequest fingerprintRequest, IFingerprintCallback iFingerprintCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33f8b54d", new Object[]{this, new Integer(i), new Integer(i2), fingerprintRequest, iFingerprintCallback});
        } else {
            this.f4397a.processAsync(this.b, fingerprintRequest.mUserId, i, i2, fingerprintRequest.mData, iFingerprintCallback);
        }
    }

    private boolean a(FingerprintRequest fingerprintRequest) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("84199877", new Object[]{this, fingerprintRequest})).booleanValue() : fingerprintRequest.mScanType == 4 || fingerprintRequest.mScanType == 5;
    }

    private FingerprintRetryProxyCallback a(final Activity activity, final FingerprintDialog fingerprintDialog, final FingerprintRequest fingerprintRequest, IFingerprintCallback iFingerprintCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FingerprintRetryProxyCallback) ipChange.ipc$dispatch("b0a6f25d", new Object[]{this, activity, fingerprintDialog, fingerprintRequest, iFingerprintCallback});
        }
        final IResourceLoader a2 = a(activity);
        return new FingerprintRetryProxyCallback(activity, iFingerprintCallback) { // from class: com.alipay.android.app.smartpays.api.FingerprintManager.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Removed duplicated region for block: B:20:0x0071  */
            /* JADX WARN: Removed duplicated region for block: B:28:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
            @Override // com.alipay.android.app.smartpays.fingerprint.callback.FingerprintRetryProxyCallback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void onStatusChanged(boolean r7, com.alipay.android.app.smartpays.api.model.FingerprintResult r8) {
                /*
                    r6 = this;
                    com.android.alibaba.ip.runtime.IpChange r0 = com.alipay.android.app.smartpays.api.FingerprintManager.AnonymousClass2.$ipChange
                    boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
                    r2 = 1
                    r3 = 0
                    if (r1 == 0) goto L1d
                    r1 = 3
                    java.lang.Object[] r1 = new java.lang.Object[r1]
                    r1[r3] = r6
                    java.lang.Boolean r3 = new java.lang.Boolean
                    r3.<init>(r7)
                    r1[r2] = r3
                    r7 = 2
                    r1[r7] = r8
                    java.lang.String r7 = "3fae2213"
                    r0.ipc$dispatch(r7, r1)
                    return
                L1d:
                    r7 = -16777216(0xffffffffff000000, float:-1.7014118E38)
                    int[] r0 = com.alipay.android.app.smartpays.api.FingerprintManager.AnonymousClass6.f4403a
                    com.alipay.android.app.smartpays.api.model.FingerprintResult$FingerprintStatus r1 = r8.mStatus
                    int r1 = r1.ordinal()
                    r0 = r0[r1]
                    java.lang.String r1 = "safepay_fp_val_failed"
                    r4 = -1
                    r5 = -65536(0xffffffffffff0000, float:NaN)
                    switch(r0) {
                        case 1: goto L63;
                        case 2: goto L59;
                        case 3: goto L52;
                        case 4: goto L52;
                        case 5: goto L52;
                        case 6: goto L46;
                        case 7: goto L3c;
                        case 8: goto L3a;
                        case 9: goto L3a;
                        default: goto L32;
                    }
                L32:
                    com.alipay.android.app.smartpays.res.IResourceLoader r7 = r4
                    int r7 = r7.getStringId(r1)
                L38:
                    r2 = 0
                    goto L6f
                L3a:
                    r7 = -1
                    goto L50
                L3c:
                    com.alipay.android.app.smartpays.res.IResourceLoader r0 = r4
                    java.lang.String r1 = "safepay_fp_retry_tips"
                    int r0 = r0.getStringId(r1)
                    goto L4f
                L46:
                    com.alipay.android.app.smartpays.res.IResourceLoader r0 = r4
                    java.lang.String r1 = "safepay_fp_validating"
                    int r0 = r0.getStringId(r1)
                L4f:
                    r7 = r0
                L50:
                    r2 = 0
                    goto L6d
                L52:
                    com.alipay.android.app.smartpays.res.IResourceLoader r7 = r4
                    int r7 = r7.getStringId(r1)
                    goto L38
                L59:
                    com.alipay.android.app.smartpays.res.IResourceLoader r7 = r4
                    java.lang.String r0 = "safepay_fp_validate_too_often"
                    int r7 = r7.getStringId(r0)
                    goto L38
                L63:
                    com.alipay.android.app.smartpays.res.IResourceLoader r0 = r4
                    java.lang.String r1 = "safepay_fp_val_ok"
                    int r0 = r0.getStringId(r1)
                    r7 = r0
                L6d:
                    r5 = -16777216(0xffffffffff000000, float:-1.7014118E38)
                L6f:
                    if (r7 == r4) goto La1
                    com.alipay.android.app.smartpays.widget.dialog.FingerprintDialog r0 = r5
                    if (r0 == 0) goto La1
                    android.app.Activity r0 = r6
                    java.lang.String r7 = r0.getString(r7)
                    int r0 = r8.mResult
                    if (r0 <= 0) goto L9c
                    if (r2 != 0) goto L9c
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    r0.append(r7)
                    java.lang.String r7 = "["
                    r0.append(r7)
                    int r7 = r8.mResult
                    r0.append(r7)
                    java.lang.String r7 = "]"
                    r0.append(r7)
                    java.lang.String r7 = r0.toString()
                L9c:
                    com.alipay.android.app.smartpays.widget.dialog.FingerprintDialog r8 = r5
                    r8.updateMsg(r7, r3, r5)
                La1:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.app.smartpays.api.FingerprintManager.AnonymousClass2.onStatusChanged(boolean, com.alipay.android.app.smartpays.api.model.FingerprintResult):void");
            }

            @Override // com.alipay.android.app.smartpays.fingerprint.callback.FingerprintRetryProxyCallback
            public void onRetry() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c2145010", new Object[]{this});
                } else {
                    FingerprintManager.a(FingerprintManager.this, Constants.PT_REGISTER, 2, fingerprintRequest, this);
                }
            }

            @Override // com.alipay.android.app.smartpays.fingerprint.callback.FingerprintRetryProxyCallback
            public void onRetryLimit() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("fda89cb9", new Object[]{this});
                } else {
                    LogUtils.record(2, "FingerprintManager:getOpenCallback", "onRetryLimit");
                }
            }

            @Override // com.alipay.android.app.smartpays.fingerprint.callback.FingerprintRetryProxyCallback
            public void onFinish(FingerprintResult.FingerprintStatus fingerprintStatus) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4c6e1c70", new Object[]{this, fingerprintStatus});
                    return;
                }
                FingerprintResult.FingerprintStatus fingerprintStatus2 = FingerprintResult.FingerprintStatus.COMMON_SUCCESS;
                FingerprintDialog fingerprintDialog2 = fingerprintDialog;
                if (fingerprintDialog2 != null) {
                    fingerprintDialog2.dismiss(activity);
                }
                FingerprintManager.this.cancel();
            }
        };
    }

    private FingerprintDialog a(Activity activity, FingerprintRequest fingerprintRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FingerprintDialog) ipChange.ipc$dispatch("4e4482f4", new Object[]{this, activity, fingerprintRequest});
        }
        if (!a(fingerprintRequest)) {
            return new FingerprintDialog(activity, VerifyEnum.OPEN);
        }
        return null;
    }

    private FingerprintDialog a(Activity activity, FingerprintDialog fingerprintDialog, final IFingerprintCallback iFingerprintCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FingerprintDialog) ipChange.ipc$dispatch("6fa6e902", new Object[]{this, activity, fingerprintDialog, iFingerprintCallback});
        }
        if (fingerprintDialog == null) {
            return null;
        }
        IResourceLoader a2 = a(activity);
        String string = activity.getString(a2.getStringId("safepay_fp_open"));
        fingerprintDialog.setResourceLoader(a2);
        fingerprintDialog.showDialog(activity, string, new IDialogActionListener() { // from class: com.alipay.android.app.smartpays.api.FingerprintManager.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.android.app.smartpays.widget.dialog.IDialogActionListener
            public void onAction(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("781efb87", new Object[]{this, new Integer(i)});
                } else if (i != 0) {
                } else {
                    LogUtils.record(2, "FingerprintManager:IDialogActionListener", "ACTION_CANCEL");
                    iFingerprintCallback.onCallBack(new FingerprintResult(FingerprintResult.FingerprintStatus.DLG_CANCEL));
                    FingerprintManager.this.cancel();
                }
            }
        });
        return fingerprintDialog;
    }

    private FingerprintRetryProxyCallback a(final Context context, final FingerprintDialog fingerprintDialog, final FingerprintRequest fingerprintRequest, IFingerprintCallback iFingerprintCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FingerprintRetryProxyCallback) ipChange.ipc$dispatch("94a1a77", new Object[]{this, context, fingerprintDialog, fingerprintRequest, iFingerprintCallback});
        }
        final IResourceLoader a2 = a(context);
        return new FingerprintRetryProxyCallback(context, iFingerprintCallback) { // from class: com.alipay.android.app.smartpays.api.FingerprintManager.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Removed duplicated region for block: B:20:0x0071  */
            /* JADX WARN: Removed duplicated region for block: B:32:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
            @Override // com.alipay.android.app.smartpays.fingerprint.callback.FingerprintRetryProxyCallback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void onStatusChanged(boolean r8, com.alipay.android.app.smartpays.api.model.FingerprintResult r9) {
                /*
                    r7 = this;
                    com.android.alibaba.ip.runtime.IpChange r0 = com.alipay.android.app.smartpays.api.FingerprintManager.AnonymousClass4.$ipChange
                    boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
                    r2 = 1
                    r3 = 0
                    if (r1 == 0) goto L1d
                    r1 = 3
                    java.lang.Object[] r1 = new java.lang.Object[r1]
                    r1[r3] = r7
                    java.lang.Boolean r3 = new java.lang.Boolean
                    r3.<init>(r8)
                    r1[r2] = r3
                    r8 = 2
                    r1[r8] = r9
                    java.lang.String r8 = "3fae2213"
                    r0.ipc$dispatch(r8, r1)
                    return
                L1d:
                    r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
                    int[] r1 = com.alipay.android.app.smartpays.api.FingerprintManager.AnonymousClass6.f4403a
                    com.alipay.android.app.smartpays.api.model.FingerprintResult$FingerprintStatus r4 = r9.mStatus
                    int r4 = r4.ordinal()
                    r1 = r1[r4]
                    java.lang.String r4 = "safepay_fp_val_failed"
                    r5 = -1
                    r6 = -65536(0xffffffffffff0000, float:NaN)
                    switch(r1) {
                        case 1: goto L63;
                        case 2: goto L59;
                        case 3: goto L52;
                        case 4: goto L52;
                        case 5: goto L52;
                        case 6: goto L46;
                        case 7: goto L3c;
                        case 8: goto L3a;
                        case 9: goto L3a;
                        case 10: goto L52;
                        case 11: goto L3a;
                        default: goto L32;
                    }
                L32:
                    com.alipay.android.app.smartpays.res.IResourceLoader r0 = r4
                    int r0 = r0.getStringId(r4)
                L38:
                    r2 = 0
                    goto L6f
                L3a:
                    r0 = -1
                    goto L50
                L3c:
                    com.alipay.android.app.smartpays.res.IResourceLoader r1 = r4
                    java.lang.String r2 = "safepay_fp_retry_tips"
                    int r1 = r1.getStringId(r2)
                    goto L4f
                L46:
                    com.alipay.android.app.smartpays.res.IResourceLoader r1 = r4
                    java.lang.String r2 = "safepay_fp_validating"
                    int r1 = r1.getStringId(r2)
                L4f:
                    r0 = r1
                L50:
                    r2 = 0
                    goto L6d
                L52:
                    com.alipay.android.app.smartpays.res.IResourceLoader r0 = r4
                    int r0 = r0.getStringId(r4)
                    goto L38
                L59:
                    com.alipay.android.app.smartpays.res.IResourceLoader r0 = r4
                    java.lang.String r1 = "safepay_fp_validate_too_often"
                    int r0 = r0.getStringId(r1)
                    goto L38
                L63:
                    com.alipay.android.app.smartpays.res.IResourceLoader r1 = r4
                    java.lang.String r4 = "safepay_fp_val_ok"
                    int r1 = r1.getStringId(r4)
                    r0 = r1
                L6d:
                    r6 = -16777216(0xffffffffff000000, float:-1.7014118E38)
                L6f:
                    if (r0 == r5) goto Lc8
                    com.alipay.android.app.smartpays.widget.dialog.FingerprintDialog r1 = r5
                    if (r1 == 0) goto Lc8
                    android.content.Context r1 = r6
                    java.lang.String r0 = r1.getString(r0)
                    if (r8 == 0) goto La2
                    if (r2 != 0) goto La2
                    java.lang.StringBuilder r8 = new java.lang.StringBuilder
                    r8.<init>()
                    r8.append(r0)
                    java.lang.String r0 = "\n"
                    r8.append(r0)
                    android.content.Context r0 = r6
                    com.alipay.android.app.smartpays.res.IResourceLoader r1 = r4
                    java.lang.String r4 = "safepay_fp_to_pwd_pay"
                    int r1 = r1.getStringId(r4)
                    java.lang.String r0 = r0.getString(r1)
                    r8.append(r0)
                    java.lang.String r0 = r8.toString()
                La2:
                    int r8 = r9.mResult
                    if (r8 <= 0) goto Lc3
                    if (r2 != 0) goto Lc3
                    java.lang.StringBuilder r8 = new java.lang.StringBuilder
                    r8.<init>()
                    r8.append(r0)
                    java.lang.String r0 = "["
                    r8.append(r0)
                    int r9 = r9.mResult
                    r8.append(r9)
                    java.lang.String r9 = "]"
                    r8.append(r9)
                    java.lang.String r0 = r8.toString()
                Lc3:
                    com.alipay.android.app.smartpays.widget.dialog.FingerprintDialog r8 = r5
                    r8.updateMsg(r0, r3, r6)
                Lc8:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.app.smartpays.api.FingerprintManager.AnonymousClass4.onStatusChanged(boolean, com.alipay.android.app.smartpays.api.model.FingerprintResult):void");
            }

            @Override // com.alipay.android.app.smartpays.fingerprint.callback.FingerprintRetryProxyCallback
            public void onRetry() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c2145010", new Object[]{this});
                } else {
                    FingerprintManager.a(FingerprintManager.this, 3, 2, fingerprintRequest, this);
                }
            }

            @Override // com.alipay.android.app.smartpays.fingerprint.callback.FingerprintRetryProxyCallback
            public void onRetryLimit() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("fda89cb9", new Object[]{this});
                } else {
                    LogUtils.record(2, "FingerprintManager:getVerifyCallback", "onRetryLimit");
                }
            }

            @Override // com.alipay.android.app.smartpays.fingerprint.callback.FingerprintRetryProxyCallback
            public void onFinish(FingerprintResult.FingerprintStatus fingerprintStatus) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4c6e1c70", new Object[]{this, fingerprintStatus});
                    return;
                }
                FingerprintResult.FingerprintStatus fingerprintStatus2 = FingerprintResult.FingerprintStatus.COMMON_SUCCESS;
                FingerprintDialog fingerprintDialog2 = fingerprintDialog;
                if (fingerprintDialog2 != null) {
                    fingerprintDialog2.dismiss(context);
                }
                FingerprintManager.this.cancel();
            }
        };
    }

    private FingerprintDialog b(Activity activity, FingerprintRequest fingerprintRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FingerprintDialog) ipChange.ipc$dispatch("198883b5", new Object[]{this, activity, fingerprintRequest});
        }
        if (!fingerprintRequest.mIsSamsung) {
            return new FingerprintDialog(activity, VerifyEnum.VERIFY);
        }
        return null;
    }

    private FingerprintDialog b(Activity activity, FingerprintDialog fingerprintDialog, FingerprintRequest fingerprintRequest, final IFingerprintCallback iFingerprintCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FingerprintDialog) ipChange.ipc$dispatch("7612d99a", new Object[]{this, activity, fingerprintDialog, fingerprintRequest, iFingerprintCallback});
        }
        if (fingerprintDialog == null) {
            return null;
        }
        IResourceLoader a2 = a(activity);
        String str = fingerprintRequest.mTipsMsg;
        if (TextUtils.isEmpty(str)) {
            str = activity.getString(a2.getStringId("safepay_fp_tips"));
        }
        fingerprintDialog.setResourceLoader(a2);
        fingerprintDialog.showDialog(activity, str, new IDialogActionListener() { // from class: com.alipay.android.app.smartpays.api.FingerprintManager.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.android.app.smartpays.widget.dialog.IDialogActionListener
            public void onAction(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("781efb87", new Object[]{this, new Integer(i)});
                } else if (i == 0) {
                    iFingerprintCallback.onCallBack(new FingerprintResult(FingerprintResult.FingerprintStatus.DLG_CANCEL));
                    FingerprintManager.this.cancel();
                } else if (i != 2) {
                } else {
                    iFingerprintCallback.onCallBack(new FingerprintResult(FingerprintResult.FingerprintStatus.DLG_TOPWD));
                    FingerprintManager.this.cancel();
                }
            }
        });
        return fingerprintDialog;
    }

    private IResourceLoader a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IResourceLoader) ipChange.ipc$dispatch("41e0e84a", new Object[]{this, context});
        }
        if (this.c == null) {
            this.c = new ResourceLoader(new ResourceProvider(context));
        }
        return this.c;
    }
}
