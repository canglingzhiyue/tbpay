package com.alipay.android.msp.framework.smartpay.fingerprint.impl;

import android.content.Context;
import com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.callback.IFingerprintCallback;
import com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.model.FingerprintResult;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.security.mobile.auth.AuthInfo;
import com.alipay.security.mobile.auth.AuthenticatorCallback;
import com.alipay.security.mobile.auth.AuthenticatorFactory;
import com.alipay.security.mobile.auth.IAuthenticator;
import com.alipay.security.mobile.auth.message.AuthenticatorMessage;
import com.alipay.security.mobile.auth.message.AuthenticatorResponse;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class FingerprintAuthenticator {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int HARDWAREPAY_TYPE_FP = 1;

    /* renamed from: a  reason: collision with root package name */
    private IAuthenticator f4844a;

    public static /* synthetic */ IAuthenticator a(FingerprintAuthenticator fingerprintAuthenticator) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IAuthenticator) ipChange.ipc$dispatch("bb0c3580", new Object[]{fingerprintAuthenticator}) : fingerprintAuthenticator.f4844a;
    }

    public int initHardwarePay(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6037502e", new Object[]{this, context, str})).intValue();
        }
        a(context);
        return this.f4844a.init(context, new AuthenticatorCallback() { // from class: com.alipay.android.msp.framework.smartpay.fingerprint.impl.FingerprintAuthenticator.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.security.mobile.auth.AuthenticatorCallback
            public void callback(AuthenticatorResponse authenticatorResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e8b9fa1b", new Object[]{this, authenticatorResponse});
                    return;
                }
                LogUtil.record(2, "FingerprintAuthenticator:initHardwarePay", "callback, type=" + authenticatorResponse.getType());
            }
        }, str);
    }

    public int checkUserStatus(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a982b739", new Object[]{this, context, str})).intValue();
        }
        a(context);
        int checkUserStatus = this.f4844a.checkUserStatus(str);
        LogUtil.record(2, "FingerprintAuthenticator::checkUserStatus", "userId:" + str + ",result:" + checkUserStatus);
        return checkUserStatus;
    }

    public int registeredFingerPrintNumber(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a554e229", new Object[]{this, context})).intValue();
        }
        a(context);
        int registedFingerPrintNumber = this.f4844a.registedFingerPrintNumber();
        LogUtil.record(2, "FingerprintAuthenticator::registeredFingerPrintNumber", "num:".concat(String.valueOf(registedFingerPrintNumber)));
        return registedFingerPrintNumber;
    }

    public String process(Context context, int i, int i2, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f0155e4", new Object[]{this, context, new Integer(i), new Integer(i2), str});
        }
        a(context);
        try {
            str2 = this.f4844a.process(new AuthenticatorMessage(i, i2, str));
        } catch (Throwable unused) {
            str2 = "";
        }
        LogUtil.record(2, "FingerprintAuthenticator::process", String.format("version=%s,data=%s,type=%s,result=%s", Integer.valueOf(i2), str, Integer.valueOf(i), str2));
        return str2;
    }

    public void processAsync(final Context context, final String str, final int i, final int i2, final String str2, final IFingerprintCallback iFingerprintCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e133676b", new Object[]{this, context, str, new Integer(i), new Integer(i2), str2, iFingerprintCallback});
        } else {
            TaskHelper.execute(new Runnable() { // from class: com.alipay.android.msp.framework.smartpay.fingerprint.impl.FingerprintAuthenticator.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    AuthenticatorCallback a2 = FingerprintAuthenticator.a(FingerprintAuthenticator.this, iFingerprintCallback);
                    try {
                        FingerprintAuthenticator.this.initHardwarePay(context, str);
                        FingerprintAuthenticator.a(FingerprintAuthenticator.this).process(new AuthenticatorMessage(i, i2, str2), a2);
                    } catch (Throwable unused) {
                    }
                    LogUtil.record(2, "FingerprintAuthenticator::processAsync", String.format("type=%s, version=%s, data=%s", Integer.valueOf(i), Integer.valueOf(i2), str2));
                }
            });
        }
    }

    private void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else if (this.f4844a != null) {
        } else {
            LogUtil.record(2, "FingerprintAuthenticator::initAuthenticator", "mAuthenticator is null");
            try {
                this.f4844a = AuthenticatorFactory.create(context, 1);
            } catch (Throwable unused) {
            }
        }
    }

    public void cancel(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9196b8e7", new Object[]{this, context});
            return;
        }
        a(context);
        try {
            this.f4844a.cancel(context);
        } catch (Throwable unused) {
        }
    }

    public String getAuthInfo(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9c5e408b", new Object[]{this, context});
        }
        a(context);
        JSONObject jSONObject = new JSONObject();
        try {
            AuthInfo authInfo = this.f4844a.getAuthInfo();
            if (authInfo == null) {
                LogUtil.record(2, "FingerprintAuthenticator::getAuthInfo", "authInfo is null");
            } else {
                jSONObject.put("authInfoType", authInfo.getType());
                jSONObject.put("vendor", authInfo.getVendor());
                jSONObject.put("phoneModel", authInfo.getPhoneModle());
                jSONObject.put("protocolVersion", authInfo.getProtocolVersion());
                jSONObject.put("protocolType", authInfo.getProtocolType());
                jSONObject.put("mfacDownloadUrl", authInfo.getDownloadUrl());
            }
        } catch (Throwable unused) {
        }
        return jSONObject.toString();
    }

    public static /* synthetic */ AuthenticatorCallback a(FingerprintAuthenticator fingerprintAuthenticator, final IFingerprintCallback iFingerprintCallback) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AuthenticatorCallback) ipChange.ipc$dispatch("fc3786b7", new Object[]{fingerprintAuthenticator, iFingerprintCallback}) : new AuthenticatorCallback() { // from class: com.alipay.android.msp.framework.smartpay.fingerprint.impl.FingerprintAuthenticator.3
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
                LogUtil.record(2, "FingerprintAuthenticator::getProcessAsyncCallback", fingerprintResult.toString());
                IFingerprintCallback iFingerprintCallback2 = iFingerprintCallback;
                if (iFingerprintCallback2 == null) {
                    return;
                }
                iFingerprintCallback2.onCallBack(fingerprintResult);
            }
        };
    }

    public static /* synthetic */ FingerprintResult.FingerprintStatus a(FingerprintAuthenticator fingerprintAuthenticator, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FingerprintResult.FingerprintStatus) ipChange.ipc$dispatch("664dc6bc", new Object[]{fingerprintAuthenticator, new Integer(i)});
        }
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
        if (i == 406) {
            return FingerprintResult.FingerprintStatus.OEM_NEED_UPGRADE;
        }
        return FingerprintResult.FingerprintStatus.COMMON_FAILED;
    }
}
