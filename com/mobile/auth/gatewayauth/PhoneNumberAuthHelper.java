package com.mobile.auth.gatewayauth;

import android.content.Context;
import com.mobile.auth.BuildConfig;
import com.mobile.auth.gatewayauth.manager.compat.ResultCodeProcessor;
import com.mobile.auth.gatewayauth.utils.O0000O0o;
import tb.czp;

/* loaded from: classes4.dex */
public class PhoneNumberAuthHelper {
    public static final int SERVICE_TYPE_AUTH = 1;
    public static final int SERVICE_TYPE_LOGIN = 2;
    protected static volatile PhoneNumberAuthHelper mInstance;
    private PhoneNumberAuthHelperProxy mAuthProxy;
    private ResultCodeProcessor mCodeProcessorV2 = new com.mobile.auth.gatewayauth.manager.compat.O000000o();

    private PhoneNumberAuthHelper(Context context) {
        this.mAuthProxy = PhoneNumberAuthHelperProxy.getInstance(context, null);
    }

    static /* synthetic */ PhoneNumberAuthHelperProxy access$000(PhoneNumberAuthHelper phoneNumberAuthHelper) {
        try {
            return phoneNumberAuthHelper.mAuthProxy;
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return null;
        }
    }

    public static PhoneNumberAuthHelper getInstance(Context context) {
        try {
            if (mInstance == null && context != null) {
                synchronized (PhoneNumberAuthHelper.class) {
                    if (mInstance == null) {
                        mInstance = new PhoneNumberAuthHelper(context);
                    }
                }
            }
            return mInstance;
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return null;
        }
    }

    public static String getVersion() {
        return BuildConfig.VERSION_NAME;
    }

    public void accelerateVerify(int i, PreLoginResultListener preLoginResultListener) {
        try {
            this.mAuthProxy.accelerateVerify(i, preLoginResultListener);
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
        }
    }

    public void checkEnvAvailable(int i, TokenResultListener tokenResultListener) {
        try {
            this.mAuthProxy.checkEnvAvailable(i, tokenResultListener);
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
        }
    }

    @Deprecated
    public boolean checkEnvAvailable() {
        try {
            return this.mAuthProxy.checkEnvAvailable();
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return false;
        }
    }

    public void clearPreInfo() {
        try {
            this.mAuthProxy.clearPreInfo();
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
        }
    }

    public String getCurrentCarrierName() {
        try {
            return this.mAuthProxy.getCurrentCarrierName();
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return null;
        }
    }

    public void getLoginMaskPhone(final int i, final OnLoginPhoneListener onLoginPhoneListener) {
        try {
            czp.a().a(new O0000O0o.O000000o() { // from class: com.mobile.auth.gatewayauth.PhoneNumberAuthHelper.1
                @Override // com.mobile.auth.gatewayauth.utils.O0000O0o.O000000o
                protected void O000000o() {
                    try {
                        String O0000Oo = PhoneNumberAuthHelper.access$000(PhoneNumberAuthHelper.this).O00000Oo().O0000Oo();
                        PhoneNumberAuthHelper.access$000(PhoneNumberAuthHelper.this).getLoginMaskPhone(i, PhoneNumberAuthHelper.access$000(PhoneNumberAuthHelper.this).O000000o().O00000o0(), onLoginPhoneListener, false, true, O0000Oo);
                    } catch (Throwable th) {
                        ExceptionProcessor.processException(th);
                    }
                }
            });
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
        }
    }

    public void getLoginToken(int i, TokenResultListener tokenResultListener) {
        try {
            this.mAuthProxy.O000000o(i, tokenResultListener, this.mCodeProcessorV2);
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
        }
    }

    public PnsReporter getReporter() {
        try {
            return this.mAuthProxy.getReporter();
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return null;
        }
    }

    public void getVerifyToken(int i, TokenResultListener tokenResultListener) {
        try {
            this.mAuthProxy.getVerifyToken(i, tokenResultListener);
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
        }
    }

    public boolean isNeedUpdateMaskPhone() {
        try {
            return this.mAuthProxy.O00000o0();
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return false;
        }
    }

    public void prohibitUseUtdid() {
        try {
            this.mAuthProxy.prohibitUseUtdid();
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
        }
    }

    public void setAuthSDKInfo(String str) {
        try {
            this.mAuthProxy.setAuthSDKInfo(str);
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
        }
    }
}
