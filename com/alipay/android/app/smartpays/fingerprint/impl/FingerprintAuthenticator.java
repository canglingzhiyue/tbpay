package com.alipay.android.app.smartpays.fingerprint.impl;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.android.app.base.SPTaskHelper;
import com.alipay.android.app.safepaylog.utils.LogUtils;
import com.alipay.android.app.safepaylogv2.api.StatisticCollector;
import com.alipay.android.app.smartpays.api.callback.IFingerprintCallback;
import com.alipay.android.app.smartpays.api.model.FingerprintResult;
import com.alipay.android.app.smartpays.cons.Constants;
import com.alipay.android.app.smartpays.cons.CountValue;
import com.alipay.android.app.utils.SpOuterUtil;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorCode;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.alipay.security.mobile.api.AuthenticatorApi;
import com.alipay.security.mobile.auth.AuthInfo;
import com.alipay.security.mobile.auth.AuthenticatorCallback;
import com.alipay.security.mobile.auth.AuthenticatorFactory;
import com.alipay.security.mobile.auth.IAuthenticator;
import com.alipay.security.mobile.auth.message.AuthenticatorMessage;
import com.alipay.security.mobile.auth.message.AuthenticatorResponse;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.draft.DraftMediaHelper;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: classes3.dex */
public class FingerprintAuthenticator {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int HARDWAREPAY_TYPE_FP = 1;

    /* renamed from: a  reason: collision with root package name */
    private IAuthenticator f4412a;

    public static /* synthetic */ FingerprintResult.FingerprintStatus a(FingerprintAuthenticator fingerprintAuthenticator, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FingerprintResult.FingerprintStatus) ipChange.ipc$dispatch("f2b65ace", new Object[]{fingerprintAuthenticator, new Integer(i)}) : fingerprintAuthenticator.a(i);
    }

    public static /* synthetic */ AuthenticatorCallback a(FingerprintAuthenticator fingerprintAuthenticator, int i, IFingerprintCallback iFingerprintCallback) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AuthenticatorCallback) ipChange.ipc$dispatch("5cbaac4", new Object[]{fingerprintAuthenticator, new Integer(i), iFingerprintCallback}) : fingerprintAuthenticator.a(i, iFingerprintCallback);
    }

    public static /* synthetic */ IAuthenticator a(FingerprintAuthenticator fingerprintAuthenticator) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IAuthenticator) ipChange.ipc$dispatch("7738f485", new Object[]{fingerprintAuthenticator}) : fingerprintAuthenticator.f4412a;
    }

    public static /* synthetic */ void a(FingerprintAuthenticator fingerprintAuthenticator, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c85bd24", new Object[]{fingerprintAuthenticator, new Integer(i), new Integer(i2)});
        } else {
            fingerprintAuthenticator.a(i, i2);
        }
    }

    private void a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123b0d2", new Object[]{this, str, new Long(j)});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - j;
        LogUtils.record(2, "FingerprintAuthenticator::logElapsed", "fpV1, code=" + str + ", time cost:" + currentTimeMillis + "ms");
    }

    public int initHardwarePay(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6037502e", new Object[]{this, context, str})).intValue();
        }
        LogUtils.record(2, "FingerprintAuthenticator::initHardwarePay", "start");
        a(context);
        AuthenticatorCallback authenticatorCallback = new AuthenticatorCallback() { // from class: com.alipay.android.app.smartpays.fingerprint.impl.FingerprintAuthenticator.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.security.mobile.auth.AuthenticatorCallback
            public void callback(AuthenticatorResponse authenticatorResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e8b9fa1b", new Object[]{this, authenticatorResponse});
                    return;
                }
                LogUtils.record(2, "FingerprintAuthenticator::initHardwarePay", "callback, type=" + authenticatorResponse.getType());
            }
        };
        long currentTimeMillis = System.currentTimeMillis();
        int init = this.f4412a.init(context, authenticatorCallback, str);
        a("FpInitV1", currentTimeMillis);
        HashMap hashMap = new HashMap();
        hashMap.put("action", "FingerprintAuthenticator");
        SpOuterUtil.walletEventLog("1010897", "pay", hashMap);
        return init;
    }

    public int checkUserStatus(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a982b739", new Object[]{this, context, str})).intValue();
        }
        LogUtils.record(2, "FingerprintAuthenticator::checkUserStatus", "start");
        a(context);
        long currentTimeMillis = System.currentTimeMillis();
        int checkUserStatus = this.f4412a.checkUserStatus(str);
        LogUtils.record(2, "FingerprintAuthenticator::checkUserStatus", "userId:" + str + ",result:" + checkUserStatus + ", FpCheckUserStatusV1 cost: " + (System.currentTimeMillis() - currentTimeMillis) + "ms");
        return checkUserStatus;
    }

    public int registedFingerPrintNumber(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e05ac8fc", new Object[]{this, context})).intValue();
        }
        LogUtils.record(2, "FingerprintAuthenticator::registedFingerPrintNumber", "start");
        a(context);
        long currentTimeMillis = System.currentTimeMillis();
        int registedFingerPrintNumber = this.f4412a.registedFingerPrintNumber();
        LogUtils.record(2, "FingerprintAuthenticator::registedFingerPrintNumber", "num:" + registedFingerPrintNumber + ", FpRegNumberV1 cost: " + (System.currentTimeMillis() - currentTimeMillis) + "ms");
        return registedFingerPrintNumber;
    }

    public String process(Context context, int i, int i2, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f0155e4", new Object[]{this, context, new Integer(i), new Integer(i2), str});
        }
        LogUtils.record(2, "FingerprintAuthenticator::process", "start");
        a(context);
        long currentTimeMillis = System.currentTimeMillis();
        try {
            str2 = this.f4412a.process(new AuthenticatorMessage(i, i2, str));
        } catch (Throwable th) {
            StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, "fpV1", ErrorCode.FP_V1_PROCESS_SYNC_EX, th);
            str2 = "";
        }
        LogUtils.record(2, "FingerprintAuthenticator::process", "version=" + i2 + ",data=" + str + ",type=" + i + ",result=" + str2 + ", FpProcessSyncV1 cost: " + (System.currentTimeMillis() - currentTimeMillis) + "ms");
        return str2;
    }

    public void processAsync(final Context context, final String str, final int i, final int i2, final String str2, final IFingerprintCallback iFingerprintCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd2a6ba2", new Object[]{this, context, str, new Integer(i), new Integer(i2), str2, iFingerprintCallback});
        } else {
            SPTaskHelper.execute(new Runnable() { // from class: com.alipay.android.app.smartpays.fingerprint.impl.FingerprintAuthenticator.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    AuthenticatorCallback a2 = FingerprintAuthenticator.a(FingerprintAuthenticator.this, i, iFingerprintCallback);
                    long currentTimeMillis = System.currentTimeMillis();
                    try {
                        FingerprintAuthenticator.this.initHardwarePay(context, str);
                        FingerprintAuthenticator.a(FingerprintAuthenticator.this).process(new AuthenticatorMessage(i, i2, str2), a2);
                    } catch (Throwable th) {
                        StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, "fpV1", ErrorCode.FP_V1_PROCESS_ASYNC_EX, th);
                    }
                    LogUtils.record(2, "FingerprintAuthenticator::processAsync", "type=" + i + ", version=" + i2 + ", data=" + str2 + ", FpProcessAsyncV1 cost: " + (System.currentTimeMillis() - currentTimeMillis) + "ms");
                }
            });
        }
    }

    public String getFpInfo(Context context) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e827e8ad", new Object[]{this, context});
        }
        LogUtils.record(2, "FingerprintAuthenticator::getFpInfo", "start");
        try {
            str = AuthenticatorApi.getFingerprintExtInfo(context);
        } catch (Throwable th) {
            LogUtils.printExceptionStackTrace(th);
            str = "{\"type\":-1}";
        }
        return !TextUtils.isEmpty(str) ? str : "{\"type\":-1}";
    }

    private AuthenticatorCallback a(final int i, final IFingerprintCallback iFingerprintCallback) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AuthenticatorCallback) ipChange.ipc$dispatch("7b3a5a0", new Object[]{this, new Integer(i), iFingerprintCallback}) : new AuthenticatorCallback() { // from class: com.alipay.android.app.smartpays.fingerprint.impl.FingerprintAuthenticator.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.security.mobile.auth.AuthenticatorCallback
            public void callback(AuthenticatorResponse authenticatorResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e8b9fa1b", new Object[]{this, authenticatorResponse});
                    return;
                }
                FingerprintResult fingerprintResult = new FingerprintResult();
                fingerprintResult.mType = authenticatorResponse.getType();
                fingerprintResult.mResult = authenticatorResponse.getResult();
                fingerprintResult.mMessage = authenticatorResponse.getResultMessage();
                fingerprintResult.mData = authenticatorResponse.getData();
                fingerprintResult.mStatus = FingerprintAuthenticator.a(FingerprintAuthenticator.this, authenticatorResponse.getResult());
                List<String> resgistedTokens = authenticatorResponse.getResgistedTokens();
                if (resgistedTokens != null && resgistedTokens.size() > 0) {
                    fingerprintResult.mTokenId = resgistedTokens.get(0);
                }
                FingerprintAuthenticator.a(FingerprintAuthenticator.this, i, fingerprintResult.mResult);
                LogUtils.record(2, "FingerprintAuthenticator::getProcessAyncCallback", fingerprintResult.toString());
                IFingerprintCallback iFingerprintCallback2 = iFingerprintCallback;
                if (iFingerprintCallback2 == null) {
                    return;
                }
                iFingerprintCallback2.onCallBack(fingerprintResult);
            }
        };
    }

    private void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (Constants.PT_REGISTER == i) {
        } else {
            int i3 = Constants.PT_UNREGISTER;
        }
    }

    private FingerprintResult.FingerprintStatus a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FingerprintResult.FingerprintStatus) ipChange.ipc$dispatch("1ce22172", new Object[]{this, new Integer(i)});
        }
        FingerprintResult.FingerprintStatus fingerprintStatus = FingerprintResult.FingerprintStatus.COMMON_SUCCESS;
        if (i == 100) {
            return FingerprintResult.FingerprintStatus.COMMON_SUCCESS;
        }
        if (i == 102) {
            return FingerprintResult.FingerprintStatus.COMMON_CANCELED;
        }
        if (i == 113) {
            return FingerprintResult.FingerprintStatus.COMMON_TIMEOUT;
        }
        if (i == 121) {
            return FingerprintResult.FingerprintStatus.COMMON_TO_PWD;
        }
        if (i == 129) {
            return FingerprintResult.FingerprintStatus.COMMON_BUSY;
        }
        return FingerprintResult.FingerprintStatus.COMMON_FAILED;
    }

    private void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        LogUtils.record(2, "FingerprintAuthenticator::initAuthenticator", "start");
        if (this.f4412a != null) {
            return;
        }
        LogUtils.record(2, "FingerprintAuthenticator::initAuthenticator", "mAuthenticator is null");
        long currentTimeMillis = System.currentTimeMillis();
        try {
            this.f4412a = AuthenticatorFactory.create(context, 1);
        } catch (Throwable th) {
            StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, "fpV1", ErrorCode.FP_V1_CREATE_EX, th);
        }
        a("FpCreateV1", currentTimeMillis);
    }

    public void cancel(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9196b8e7", new Object[]{this, context});
            return;
        }
        a(context);
        long currentTimeMillis = System.currentTimeMillis();
        try {
            this.f4412a.cancel();
        } catch (Throwable th) {
            StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, "fpV1", ErrorCode.FP_V1_CANCEL_EX, th);
        }
        a("FpCreateV1", currentTimeMillis);
    }

    public String getAuthInfo(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9c5e408b", new Object[]{this, context});
        }
        LogUtils.record(2, "FingerprintAuthenticator::getAuthInfo", "start");
        a(context);
        JSONObject jSONObject = new JSONObject();
        long currentTimeMillis = System.currentTimeMillis();
        try {
            AuthInfo authInfo = this.f4412a.getAuthInfo();
            if (authInfo != null) {
                jSONObject.put("authInfoType", authInfo.getType());
                jSONObject.put("vendor", authInfo.getVendor());
                jSONObject.put("phoneModel", authInfo.getPhoneModle());
                jSONObject.put("protocolVersion", authInfo.getProtocolVersion());
                jSONObject.put("protocolType", authInfo.getProtocolType());
                jSONObject.put("mfacDownloadUrl", authInfo.getDownloadUrl());
            } else {
                LogUtils.record(4, "getAuthInfo", CountValue.C_FP_INIT_V1_DEVICE_UNSUPPORT);
            }
        } catch (Throwable th) {
            StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, "fpV1", ErrorCode.FP_V1_AUTH_INFO_EX, th);
        }
        a("FpAuthInfoV1", currentTimeMillis);
        return jSONObject.toString();
    }
}
