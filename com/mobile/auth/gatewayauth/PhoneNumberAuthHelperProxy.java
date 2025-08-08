package com.mobile.auth.gatewayauth;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import mtopsdk.common.util.StringUtils;
import com.mobile.auth.BuildConfig;
import com.mobile.auth.OO00Oo0;
import com.mobile.auth.OO0oO;
import com.mobile.auth.gatewayauth.manager.O00000o;
import com.mobile.auth.gatewayauth.manager.O0000O0o;
import com.mobile.auth.gatewayauth.manager.O0000OOo;
import com.mobile.auth.gatewayauth.manager.RequestCallback;
import com.mobile.auth.gatewayauth.manager.SystemManager;
import com.mobile.auth.gatewayauth.manager.TokenMaskManager;
import com.mobile.auth.gatewayauth.manager.VendorSdkInfoManager;
import com.mobile.auth.gatewayauth.manager.base.CacheKey;
import com.mobile.auth.gatewayauth.manager.compat.ResultCodeProcessor;
import com.mobile.auth.gatewayauth.model.ConfigRule;
import com.mobile.auth.gatewayauth.model.LoginPhoneInfo;
import com.mobile.auth.gatewayauth.model.MonitorStruct;
import com.mobile.auth.gatewayauth.model.TokenRet;
import com.mobile.auth.gatewayauth.model.UStruct;
import com.mobile.auth.gatewayauth.network.PrivateKeyRespone;
import com.mobile.auth.gatewayauth.network.PrivateRespone;
import com.mobile.auth.gatewayauth.network.RequestState;
import com.mobile.auth.gatewayauth.network.RequestUtil;
import com.mobile.auth.gatewayauth.network.UTSharedPreferencesHelper;
import com.mobile.auth.gatewayauth.utils.EncryptUtils;
import com.mobile.auth.gatewayauth.utils.O00000o0;
import com.mobile.auth.gatewayauth.utils.O0000O0o;
import com.nirvana.tools.jsoner.a;
import com.nirvana.tools.jsoner.d;
import java.lang.reflect.Field;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import tb.czm;
import tb.czp;
import tb.czu;
import tb.icf;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class PhoneNumberAuthHelperProxy {
    protected static volatile PhoneNumberAuthHelperProxy O000000o = null;
    public static final int SERVICE_TYPE_AUTH = 1;
    public static final int SERVICE_TYPE_LOGIN = 2;
    private TokenResultListener O00000Oo;
    private com.mobile.auth.gatewayauth.manager.O00000Oo O00000o;
    private SystemManager O00000o0;
    private VendorSdkInfoManager O00000oO;
    private TokenMaskManager O00000oo;
    private O00000o O0000O0o;
    private O0000OOo O0000OOo;
    private OO0oO O0000Oo;
    private Future<?> O0000Oo0;
    private String O0000OoO;
    private final ResultCodeProcessor O0000Ooo = new com.mobile.auth.gatewayauth.manager.compat.O000000o();
    private Handler O0000o0 = new Handler(Looper.getMainLooper()) { // from class: com.mobile.auth.gatewayauth.PhoneNumberAuthHelperProxy.12
        @Override // android.os.Handler
        public void dispatchMessage(Message message) {
            try {
                super.dispatchMessage(message);
                if (message.what != 0) {
                    return;
                }
                PhoneNumberAuthHelperProxy.O00000Oo(PhoneNumberAuthHelperProxy.this).O000000o("", new RequestCallback<Void, String>() { // from class: com.mobile.auth.gatewayauth.PhoneNumberAuthHelperProxy.12.1
                    public void O000000o(String str) {
                        try {
                            PhoneNumberAuthHelperProxy.O00000o(PhoneNumberAuthHelperProxy.this).O00000o("GetVendorList failed!", str);
                        } catch (Throwable th) {
                            try {
                                ExceptionProcessor.processException(th);
                            } catch (Throwable th2) {
                                ExceptionProcessor.processException(th2);
                            }
                        }
                    }

                    public void O000000o(Void r2) {
                        try {
                            PhoneNumberAuthHelperProxy.O00000o0(PhoneNumberAuthHelperProxy.this).O000000o(PhoneNumberAuthHelperProxy.O00000Oo(PhoneNumberAuthHelperProxy.this));
                        } catch (Throwable th) {
                            try {
                                ExceptionProcessor.processException(th);
                            } catch (Throwable th2) {
                                ExceptionProcessor.processException(th2);
                            }
                        }
                    }

                    @Override // com.mobile.auth.gatewayauth.manager.RequestCallback
                    public /* synthetic */ void onError(String str) {
                        try {
                            O000000o(str);
                        } catch (Throwable th) {
                            try {
                                ExceptionProcessor.processException(th);
                            } catch (Throwable th2) {
                                ExceptionProcessor.processException(th2);
                            }
                        }
                    }

                    @Override // com.mobile.auth.gatewayauth.manager.RequestCallback
                    public /* synthetic */ void onSuccess(Void r1) {
                        try {
                            O000000o(r1);
                        } catch (Throwable th) {
                            try {
                                ExceptionProcessor.processException(th);
                            } catch (Throwable th2) {
                                ExceptionProcessor.processException(th2);
                            }
                        }
                    }
                }, O0000O0o.O000000o(PhoneNumberAuthHelperProxy.O000000o(PhoneNumberAuthHelperProxy.this).O00000oO(), PhoneNumberAuthHelperProxy.O00000Oo(PhoneNumberAuthHelperProxy.this), PhoneNumberAuthHelperProxy.O00000oO(PhoneNumberAuthHelperProxy.this), PhoneNumberAuthHelperProxy.O00000o(PhoneNumberAuthHelperProxy.this)));
            } catch (Throwable th) {
                try {
                    ExceptionProcessor.processException(th);
                } catch (Throwable th2) {
                    ExceptionProcessor.processException(th2);
                }
            }
        }
    };
    private volatile String O0000o00;

    private PhoneNumberAuthHelperProxy(Context context, TokenResultListener tokenResultListener) {
        this.O00000Oo = tokenResultListener;
        czm.a(context.getApplicationContext());
        O000000o(context.getApplicationContext());
    }

    static /* synthetic */ SystemManager O000000o(PhoneNumberAuthHelperProxy phoneNumberAuthHelperProxy) {
        try {
            return phoneNumberAuthHelperProxy.O00000o0;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    private void O000000o(Context context) {
        try {
            this.O0000O0o = new O00000o(context);
            this.O0000Oo = this.O0000O0o.O000000o();
            this.O00000o0 = new SystemManager(context, this.O0000Oo);
            this.O00000oO = new VendorSdkInfoManager(this.O0000O0o, this.O00000o0);
            this.O00000o = new com.mobile.auth.gatewayauth.manager.O00000Oo(context, this.O00000oO, this.O0000O0o);
            this.O0000OOo = new O0000OOo(this.O00000o0, this.O0000O0o);
            this.O0000O0o.O000000o(this.O0000OOo);
            this.O00000oo = new TokenMaskManager(this.O00000o, this.O00000o0, this.O0000O0o, this.O0000OOo, this.O00000oO);
            czp.a().a(new Runnable() { // from class: com.mobile.auth.gatewayauth.PhoneNumberAuthHelperProxy.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        PhoneNumberAuthHelperProxy.O000000o(PhoneNumberAuthHelperProxy.this).getSimCacheKey(false, null);
                    } catch (Throwable th) {
                        try {
                            ExceptionProcessor.processException(th);
                        } catch (Throwable th2) {
                            ExceptionProcessor.processException(th2);
                        }
                    }
                }
            });
            if (O00000o0(this.O00000o0.O00000oO())) {
                this.O0000Oo0 = O00000o();
            }
            czu.a().a(EncryptUtils.getSecret5().substring(4, 10) + EncryptUtils.getSecret6().substring(1, 7), EncryptUtils.getSecret5().substring(15) + EncryptUtils.getSecret6().substring(38, 54), EncryptUtils.getSecret6().substring(70, 76) + EncryptUtils.getSecret6().substring(86, 92));
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    private void O000000o(Context context, boolean z) {
        try {
            OO00Oo0 privateKey = RequestUtil.getPrivateKey(context, this.O00000oO.O00000o0(), this.O0000O0o.O0000Oo());
            if (!privateKey.O00000Oo() || StringUtils.isEmpty(privateKey.O000000o())) {
                return;
            }
            try {
                PrivateRespone privateRespone = (PrivateRespone) a.a(new JSONObject(privateKey.O000000o()), (d<Object>) new d<PrivateRespone>() { // from class: com.mobile.auth.gatewayauth.PhoneNumberAuthHelperProxy.33
                }, (List<Field>) null);
                if (!icf.a.CONTROL_NAME_OK.equals(privateRespone.getCode())) {
                    return;
                }
                PrivateKeyRespone data = privateRespone.getData();
                if (data.getExpiredTime() <= System.currentTimeMillis()) {
                    return;
                }
                UTSharedPreferencesHelper.saveAuthSDKPrivateKey(context, com.mobile.auth.gatewayauth.utils.security.O000000o.O000000o(data.toJson().toString().getBytes()));
                RequestState.getInstance().setKeyRespone(data);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    static /* synthetic */ void O000000o(PhoneNumberAuthHelperProxy phoneNumberAuthHelperProxy, int i, ResultCodeProcessor resultCodeProcessor, boolean z, TokenResultListener tokenResultListener) {
        try {
            phoneNumberAuthHelperProxy.justGetToken(i, resultCodeProcessor, z, tokenResultListener);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    static /* synthetic */ void O000000o(PhoneNumberAuthHelperProxy phoneNumberAuthHelperProxy, long j, PreLoginResultListener preLoginResultListener) {
        try {
            phoneNumberAuthHelperProxy.justPreVerify(j, preLoginResultListener);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    static /* synthetic */ void O000000o(PhoneNumberAuthHelperProxy phoneNumberAuthHelperProxy, long j, PreLoginResultListener preLoginResultListener, ResultCodeProcessor resultCodeProcessor, boolean z, boolean z2) {
        try {
            phoneNumberAuthHelperProxy.justPreLogin(j, preLoginResultListener, resultCodeProcessor, z, z2);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    static /* synthetic */ void O000000o(PhoneNumberAuthHelperProxy phoneNumberAuthHelperProxy, long j, TokenResultListener tokenResultListener, ResultCodeProcessor resultCodeProcessor) {
        try {
            phoneNumberAuthHelperProxy.justGetLoginToken(j, tokenResultListener, resultCodeProcessor);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    static /* synthetic */ void O000000o(PhoneNumberAuthHelperProxy phoneNumberAuthHelperProxy, Context context, boolean z) {
        try {
            phoneNumberAuthHelperProxy.O000000o(context, z);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    static /* synthetic */ void O000000o(PhoneNumberAuthHelperProxy phoneNumberAuthHelperProxy, String str, String str2, String str3, String str4, TokenResultListener tokenResultListener, ResultCodeProcessor resultCodeProcessor, MonitorStruct monitorStruct, String str5) {
        try {
            phoneNumberAuthHelperProxy.O000000o(str, str2, str3, str4, tokenResultListener, resultCodeProcessor, monitorStruct, str5);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    static /* synthetic */ void O000000o(PhoneNumberAuthHelperProxy phoneNumberAuthHelperProxy, boolean z, boolean z2, String str, String str2, MonitorStruct monitorStruct, TokenResultListener tokenResultListener) {
        try {
            phoneNumberAuthHelperProxy.O000000o(z, z2, str, str2, monitorStruct, tokenResultListener);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    private void O000000o(String str, String str2, String str3, String str4, TokenResultListener tokenResultListener, ResultCodeProcessor resultCodeProcessor, MonitorStruct monitorStruct, String str5) {
        try {
            this.O0000O0o.O0000OOo();
            if (monitorStruct.getAction().equals(this.O00000o0.O00000o0(str4))) {
                O000000o(false, false, str, str2, str3, str4, monitorStruct, tokenResultListener, resultCodeProcessor, str5);
            } else {
                O000000o(false, true, str, str2, str3, str4, monitorStruct, tokenResultListener, resultCodeProcessor, str5);
            }
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    private void O000000o(final String str, final boolean z, final MonitorStruct monitorStruct, final boolean z2) {
        try {
            czp.a().a(new Runnable() { // from class: com.mobile.auth.gatewayauth.PhoneNumberAuthHelperProxy.26
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (monitorStruct != null) {
                            long currentTimeMillis = System.currentTimeMillis();
                            monitorStruct.setSuccess(z);
                            monitorStruct.setEndTime(currentTimeMillis);
                            if (!z) {
                                monitorStruct.setFailRet(str);
                            }
                            PhoneNumberAuthHelperProxy.O00000o(PhoneNumberAuthHelperProxy.this).O000000o(PhoneNumberAuthHelperProxy.O00000oo(PhoneNumberAuthHelperProxy.this).O000000o(monitorStruct), monitorStruct.getUrgency());
                        }
                        if (!z2) {
                            return;
                        }
                        PhoneNumberAuthHelperProxy.O00000o(PhoneNumberAuthHelperProxy.this).O000000o();
                    } catch (Throwable th) {
                        try {
                            ExceptionProcessor.processException(th);
                        } catch (Throwable th2) {
                            ExceptionProcessor.processException(th2);
                        }
                    }
                }
            });
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    private void O000000o(final boolean z, final String str, final TokenResultListener tokenResultListener) {
        try {
            czp.a().b(new czp.a() { // from class: com.mobile.auth.gatewayauth.PhoneNumberAuthHelperProxy.25
                @Override // tb.czp.a
                protected void onException(Throwable th) {
                    try {
                        PhoneNumberAuthHelperProxy.O00000o(PhoneNumberAuthHelperProxy.this).O00000o("TokenResultListener callback exception!", czp.a(th));
                    } catch (Throwable th2) {
                        try {
                            ExceptionProcessor.processException(th2);
                        } catch (Throwable th3) {
                            ExceptionProcessor.processException(th3);
                        }
                    }
                }

                @Override // tb.czp.a
                protected void safeRun() {
                    try {
                        if (z) {
                            tokenResultListener.onTokenSuccess(str);
                        } else {
                            tokenResultListener.onTokenFailed(str);
                        }
                    } catch (Throwable th) {
                        try {
                            ExceptionProcessor.processException(th);
                        } catch (Throwable th2) {
                            ExceptionProcessor.processException(th2);
                        }
                    }
                }
            });
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    private void O000000o(boolean z, boolean z2, String str, String str2, MonitorStruct monitorStruct, TokenResultListener tokenResultListener) {
        if (tokenResultListener != null) {
            try {
                O000000o(z, str2, tokenResultListener);
            } catch (Throwable th) {
                try {
                    ExceptionProcessor.processException(th);
                    return;
                } catch (Throwable th2) {
                    ExceptionProcessor.processException(th2);
                    return;
                }
            }
        }
        if (monitorStruct != null && !Constant.ACTION_SDK_LIFE_BODY_VERIFY.equals(monitorStruct.getAction())) {
            O000000o(str, z, monitorStruct, z2);
        }
    }

    static /* synthetic */ boolean O000000o(PhoneNumberAuthHelperProxy phoneNumberAuthHelperProxy, boolean z, String str, TokenResultListener tokenResultListener, ResultCodeProcessor resultCodeProcessor, String str2, MonitorStruct monitorStruct, String str3) {
        try {
            return phoneNumberAuthHelperProxy.O000000o(z, str, tokenResultListener, resultCodeProcessor, str2, monitorStruct, str3);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return false;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return false;
            }
        }
    }

    static /* synthetic */ boolean O000000o(PhoneNumberAuthHelperProxy phoneNumberAuthHelperProxy, boolean z, String str, ResultCodeProcessor resultCodeProcessor, MonitorStruct monitorStruct, String str2, TokenResultListener tokenResultListener, String str3) {
        try {
            return phoneNumberAuthHelperProxy.O000000o(z, str, resultCodeProcessor, monitorStruct, str2, tokenResultListener, str3);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return false;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return false;
            }
        }
    }

    private boolean O000000o(final String str, String str2, final String str3) {
        try {
            final long currentTimeMillis = System.currentTimeMillis();
            boolean z = str3 != null && !str3.equals(str2);
            final long currentTimeMillis2 = System.currentTimeMillis();
            final boolean z2 = z;
            czp.a().a(new Runnable() { // from class: com.mobile.auth.gatewayauth.PhoneNumberAuthHelperProxy.27
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        PhoneNumberAuthHelperProxy.O00000o(PhoneNumberAuthHelperProxy.this).O000000o(PhoneNumberAuthHelperProxy.O00000oo(PhoneNumberAuthHelperProxy.this).O000000o(str3, Constant.ACTION_SDK_CROSS_CARRIER_CHANGE, UStruct.newUStruct().isCarrierChanged(String.valueOf(z2)).requestId(PhoneNumberAuthHelperProxy.O00000oo(PhoneNumberAuthHelperProxy.this).O00000oO()).sessionId(str).startTime(currentTimeMillis).endTime(currentTimeMillis2).build(), ""), 2);
                    } catch (Throwable th) {
                        try {
                            ExceptionProcessor.processException(th);
                        } catch (Throwable th2) {
                            ExceptionProcessor.processException(th2);
                        }
                    }
                }
            });
            return z;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return false;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return false;
            }
        }
    }

    private boolean O000000o(boolean z, String str, TokenResultListener tokenResultListener, ResultCodeProcessor resultCodeProcessor, String str2, MonitorStruct monitorStruct, String str3) {
        try {
            this.O0000O0o.O0000OOo();
            if (!StringUtils.isEmpty(str2)) {
                O000000o(str2, str, monitorStruct, resultCodeProcessor, tokenResultListener);
                return true;
            }
            this.O0000Oo.O00000o("GetLoginToken from cache is null!");
            if (z) {
                monitorStruct.setAuthSdkCode(Constant.CODE_ERROR_UNKNOWN_FAIL);
                O000000o(false, true, Constant.CODE_ERROR_UNKNOWN_FAIL, "未知异常", com.mobile.auth.gatewayauth.utils.O000000o.O000000o(Constant.CODE_ERROR_UNKNOWN_FAIL, "未知异常"), str, monitorStruct, tokenResultListener, resultCodeProcessor, str3);
            }
            return false;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return false;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return false;
            }
        }
    }

    private boolean O000000o(boolean z, String str, ResultCodeProcessor resultCodeProcessor, MonitorStruct monitorStruct, String str2, TokenResultListener tokenResultListener, String str3) {
        try {
            this.O0000O0o.O0000Oo0();
            if (!StringUtils.isEmpty(str2)) {
                O000000o(str2, str, monitorStruct, resultCodeProcessor, tokenResultListener);
                return true;
            }
            this.O0000Oo.O00000o("GetVerifyToken from cache is null!");
            if (z) {
                O000000o(false, true, Constant.CODE_ERROR_UNKNOWN_FAIL, "未知异常", com.mobile.auth.gatewayauth.utils.O000000o.O000000o(Constant.CODE_ERROR_UNKNOWN_FAIL, "未知异常"), str, monitorStruct, tokenResultListener, resultCodeProcessor, str3);
            }
            return false;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return false;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return false;
            }
        }
    }

    static /* synthetic */ VendorSdkInfoManager O00000Oo(PhoneNumberAuthHelperProxy phoneNumberAuthHelperProxy) {
        try {
            return phoneNumberAuthHelperProxy.O00000oO;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    static /* synthetic */ void O00000Oo(PhoneNumberAuthHelperProxy phoneNumberAuthHelperProxy, String str, String str2, String str3, String str4, TokenResultListener tokenResultListener, ResultCodeProcessor resultCodeProcessor, MonitorStruct monitorStruct, String str5) {
        try {
            phoneNumberAuthHelperProxy.O00000Oo(str, str2, str3, str4, tokenResultListener, resultCodeProcessor, monitorStruct, str5);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    private void O00000Oo(String str, String str2, String str3, String str4, TokenResultListener tokenResultListener, ResultCodeProcessor resultCodeProcessor, MonitorStruct monitorStruct, String str5) {
        try {
            this.O0000O0o.O0000Oo0();
            if (monitorStruct.getAction().equals(this.O00000o0.O00000o(str4))) {
                O000000o(false, false, str, str2, str3, str4, monitorStruct, tokenResultListener, resultCodeProcessor, str5);
            } else {
                O000000o(false, true, str, str2, str3, str4, monitorStruct, tokenResultListener, resultCodeProcessor, str5);
            }
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    private boolean O00000Oo(final Context context) {
        try {
            String readAuthSDKPrivateKey = UTSharedPreferencesHelper.readAuthSDKPrivateKey(context);
            if (StringUtils.isEmpty(readAuthSDKPrivateKey)) {
                this.O0000Oo.O000000o("local pritekey is empty");
                RequestState.getInstance().setUseRequest(true);
                czp.a().a(new Runnable() { // from class: com.mobile.auth.gatewayauth.PhoneNumberAuthHelperProxy.23
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            PhoneNumberAuthHelperProxy.O000000o(PhoneNumberAuthHelperProxy.this, context, true);
                        } catch (Throwable th) {
                            try {
                                ExceptionProcessor.processException(th);
                            } catch (Throwable th2) {
                                ExceptionProcessor.processException(th2);
                            }
                        }
                    }
                });
                return false;
            }
            try {
                PrivateKeyRespone privateKeyRespone = (PrivateKeyRespone) a.a(new JSONObject(new String(com.mobile.auth.gatewayauth.utils.security.O000000o.O000000o(readAuthSDKPrivateKey))), (d<Object>) new d<PrivateKeyRespone>() { // from class: com.mobile.auth.gatewayauth.PhoneNumberAuthHelperProxy.28
                }, (List<Field>) null);
                if (privateKeyRespone == null) {
                    this.O0000Oo.O000000o("parse local privatekey is empty");
                    RequestState.getInstance().setUseRequest(true);
                    czp.a().a(new Runnable() { // from class: com.mobile.auth.gatewayauth.PhoneNumberAuthHelperProxy.29
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                PhoneNumberAuthHelperProxy.O000000o(PhoneNumberAuthHelperProxy.this, context, true);
                            } catch (Throwable th) {
                                try {
                                    ExceptionProcessor.processException(th);
                                } catch (Throwable th2) {
                                    ExceptionProcessor.processException(th2);
                                }
                            }
                        }
                    });
                    return false;
                }
                RequestState.getInstance().setKeyRespone(privateKeyRespone);
                if (RequestState.getInstance().checkTokenValied(30)) {
                    return true;
                }
                this.O0000Oo.O000000o("local privatekey expired not enough");
                long expiredTime = privateKeyRespone.getExpiredTime();
                long currentTimeMillis = System.currentTimeMillis();
                RequestState.getInstance().setUseRequest(true);
                czp.a().a(new Runnable() { // from class: com.mobile.auth.gatewayauth.PhoneNumberAuthHelperProxy.30
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            PhoneNumberAuthHelperProxy.O000000o(PhoneNumberAuthHelperProxy.this, context, true);
                        } catch (Throwable th) {
                            try {
                                ExceptionProcessor.processException(th);
                            } catch (Throwable th2) {
                                ExceptionProcessor.processException(th2);
                            }
                        }
                    }
                });
                if (expiredTime - currentTimeMillis > 0) {
                    return true;
                }
                this.O0000Oo.O000000o("local privatekey has expired");
                return false;
            } catch (JSONException e) {
                e.printStackTrace();
                this.O0000Oo.O000000o("parse local privatekey error");
                RequestState.getInstance().setUseRequest(true);
                czp.a().a(new Runnable() { // from class: com.mobile.auth.gatewayauth.PhoneNumberAuthHelperProxy.31
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            PhoneNumberAuthHelperProxy.O000000o(PhoneNumberAuthHelperProxy.this, context, true);
                        } catch (Throwable th) {
                            try {
                                ExceptionProcessor.processException(th);
                            } catch (Throwable th2) {
                                ExceptionProcessor.processException(th2);
                            }
                        }
                    }
                });
                return false;
            }
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return false;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return false;
            }
        }
    }

    static /* synthetic */ OO0oO O00000o(PhoneNumberAuthHelperProxy phoneNumberAuthHelperProxy) {
        try {
            return phoneNumberAuthHelperProxy.O0000Oo;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    private Future<?> O00000o() {
        try {
            return czp.a().a(new Runnable() { // from class: com.mobile.auth.gatewayauth.PhoneNumberAuthHelperProxy.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        final CountDownLatch countDownLatch = new CountDownLatch(1);
                        PhoneNumberAuthHelperProxy.O00000oO(PhoneNumberAuthHelperProxy.this).O000000o(new RequestCallback<ConfigRule, Void>() { // from class: com.mobile.auth.gatewayauth.PhoneNumberAuthHelperProxy.2.1
                            public void O000000o(ConfigRule configRule) {
                                try {
                                    countDownLatch.countDown();
                                } catch (Throwable th) {
                                    try {
                                        ExceptionProcessor.processException(th);
                                    } catch (Throwable th2) {
                                        ExceptionProcessor.processException(th2);
                                    }
                                }
                            }

                            public void O000000o(Void r1) {
                                try {
                                    countDownLatch.countDown();
                                } catch (Throwable th) {
                                    try {
                                        ExceptionProcessor.processException(th);
                                    } catch (Throwable th2) {
                                        ExceptionProcessor.processException(th2);
                                    }
                                }
                            }

                            @Override // com.mobile.auth.gatewayauth.manager.RequestCallback
                            public /* synthetic */ void onError(Void r1) {
                                try {
                                    O000000o(r1);
                                } catch (Throwable th) {
                                    try {
                                        ExceptionProcessor.processException(th);
                                    } catch (Throwable th2) {
                                        ExceptionProcessor.processException(th2);
                                    }
                                }
                            }

                            @Override // com.mobile.auth.gatewayauth.manager.RequestCallback
                            public /* synthetic */ void onSuccess(ConfigRule configRule) {
                                try {
                                    O000000o(configRule);
                                } catch (Throwable th) {
                                    try {
                                        ExceptionProcessor.processException(th);
                                    } catch (Throwable th2) {
                                        ExceptionProcessor.processException(th2);
                                    }
                                }
                            }
                        });
                        try {
                            countDownLatch.await(3000L, TimeUnit.MILLISECONDS);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } catch (Throwable th) {
                        try {
                            ExceptionProcessor.processException(th);
                        } catch (Throwable th2) {
                            ExceptionProcessor.processException(th2);
                        }
                    }
                }
            });
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    static /* synthetic */ O0000OOo O00000o0(PhoneNumberAuthHelperProxy phoneNumberAuthHelperProxy) {
        try {
            return phoneNumberAuthHelperProxy.O0000OOo;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    private boolean O00000o0(Context context) {
        try {
            String readAuthSDKPrivateKey = UTSharedPreferencesHelper.readAuthSDKPrivateKey(context);
            if (!StringUtils.isEmpty(readAuthSDKPrivateKey)) {
                try {
                    PrivateKeyRespone privateKeyRespone = (PrivateKeyRespone) a.a(new JSONObject(new String(com.mobile.auth.gatewayauth.utils.security.O000000o.O000000o(readAuthSDKPrivateKey))), (d<Object>) new d<PrivateKeyRespone>() { // from class: com.mobile.auth.gatewayauth.PhoneNumberAuthHelperProxy.32
                    }, (List<Field>) null);
                    if (privateKeyRespone == null) {
                        return false;
                    }
                    RequestState.getInstance().setKeyRespone(privateKeyRespone);
                    return RequestState.getInstance().checkTokenValied(0);
                } catch (JSONException e) {
                    e.printStackTrace();
                    this.O0000Oo.O000000o("parse local privatekey error");
                }
            }
            return false;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return false;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return false;
            }
        }
    }

    static /* synthetic */ com.mobile.auth.gatewayauth.manager.O00000Oo O00000oO(PhoneNumberAuthHelperProxy phoneNumberAuthHelperProxy) {
        try {
            return phoneNumberAuthHelperProxy.O00000o;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    static /* synthetic */ O00000o O00000oo(PhoneNumberAuthHelperProxy phoneNumberAuthHelperProxy) {
        try {
            return phoneNumberAuthHelperProxy.O0000O0o;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    static /* synthetic */ ResultCodeProcessor O0000O0o(PhoneNumberAuthHelperProxy phoneNumberAuthHelperProxy) {
        try {
            return phoneNumberAuthHelperProxy.O0000Ooo;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    static /* synthetic */ Future O0000OOo(PhoneNumberAuthHelperProxy phoneNumberAuthHelperProxy) {
        try {
            return phoneNumberAuthHelperProxy.O0000Oo0;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    public static PhoneNumberAuthHelperProxy getInstance(Context context, TokenResultListener tokenResultListener) {
        try {
            if (O000000o == null && context != null) {
                synchronized (PhoneNumberAuthHelperProxy.class) {
                    if (O000000o == null) {
                        O000000o = new PhoneNumberAuthHelperProxy(context, tokenResultListener);
                    }
                }
            }
            O000000o.setAuthListener(tokenResultListener);
            return O000000o;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    public static String getVersion() {
        return BuildConfig.VERSION_NAME;
    }

    private void justGetLoginPhone(final MonitorStruct monitorStruct, String str, int i, final ResultCodeProcessor resultCodeProcessor, boolean z, final RequestCallback<LoginPhoneInfo, com.mobile.auth.gatewayauth.manager.base.O00000Oo> requestCallback, String str2, String str3, int i2) {
        try {
            monitorStruct.setApiLevel(resultCodeProcessor.getApiLevel());
            monitorStruct.putApiParam("timeout", String.valueOf(i));
            monitorStruct.setSessionId(str3);
            monitorStruct.setRequestId(str2);
            monitorStruct.setAction(this.O00000o0.O00000oO(str));
            monitorStruct.setStartTime(System.currentTimeMillis());
            monitorStruct.setVendorKey(str);
            monitorStruct.setUrgency(1);
            monitorStruct.setNetworkType(com.mobile.auth.gatewayauth.utils.O00000Oo.O000000o(this.O00000o0.O00000oO(), true));
            long j = i <= 0 ? 5000 : i;
            final O00000Oo o00000Oo = new O00000Oo(j, new Runnable() { // from class: com.mobile.auth.gatewayauth.PhoneNumberAuthHelperProxy.19
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        requestCallback.onError(com.mobile.auth.gatewayauth.manager.base.O00000Oo.O000000o(ResultCode.CODE_ERROR_FUNCTION_TIME_OUT, "请求超时"));
                    } catch (Throwable th) {
                        try {
                            ExceptionProcessor.processException(th);
                        } catch (Throwable th2) {
                            ExceptionProcessor.processException(th2);
                        }
                    }
                }
            });
            o00000Oo.O000000o();
            TokenRet O000000o2 = this.O00000o0.O000000o(resultCodeProcessor, false, str);
            O00000o0.O000000o().O000000o(str2, "checkEnv", System.currentTimeMillis());
            if (O000000o2 != null) {
                if (o00000Oo.O00000o()) {
                    requestCallback.onError(com.mobile.auth.gatewayauth.manager.base.O00000Oo.O000000o(O000000o2.getCode(), O000000o2.getMsg()));
                }
                this.O0000Oo.O00000o("justGetLoginPhone env is not safe!", O000000o2.toJsonString());
            } else if (this.O0000OOo.O000000o(str) == null) {
                if (o00000Oo.O00000o()) {
                    requestCallback.onError(com.mobile.auth.gatewayauth.manager.base.O00000Oo.O000000o(Constant.CODE_ERROR_OPERATOR_UNKNOWN_FAIL, "无法判运营商"));
                }
                this.O0000Oo.O00000o("justGetLoginPhone errorCode = ", ResultCode.CODE_ERROR_OPERATOR_UNKNOWN_FAIL, "; errorMsg = ", "无法判运营商");
            } else if (this.O00000o.O00000o0()) {
                if (o00000Oo.O00000o()) {
                    requestCallback.onError(com.mobile.auth.gatewayauth.manager.base.O00000Oo.O000000o(Constant.CODE_ERROR_FUNCTION_DEMOTE, "系统维护，功能不可用"));
                }
                this.O0000Oo.O00000o("justGetLoginPhone errorCode = ", Constant.CODE_ERROR_FUNCTION_DEMOTE, "; errorMsg = ", "系统维护，功能不可用");
            } else {
                CacheKey simCacheKey = this.O00000o0.getSimCacheKey(!z, str);
                O00000o0.O000000o().O000000o(str2, "cacheKey", System.currentTimeMillis());
                if (z && !this.O00000oO.O000000o()) {
                    if (o00000Oo.O00000o()) {
                        requestCallback.onError(com.mobile.auth.gatewayauth.manager.base.O00000Oo.O000000o(ResultCode.CODE_ERROR_ANALYZE_SDK_INFO, ResultCode.MSG_ERROR_ANALYZE_SDK_INFO));
                    }
                    this.O0000Oo.O00000o("justGetLoginPhone SceneCode = null");
                    return;
                }
                if (!z) {
                    if (!this.O00000oO.O000000o(this.O0000O0o.O00000o0(), O0000O0o.O000000o(this.O00000o0.O00000oO(), this.O00000oO, this.O00000o, this.O0000Oo))) {
                        this.O0000Oo.O00000o("justGetLoginPhone SceneCode = null");
                        if (!o00000Oo.O00000o()) {
                            return;
                        }
                        requestCallback.onError(com.mobile.auth.gatewayauth.manager.base.O00000Oo.O000000o(ResultCode.CODE_ERROR_ANALYZE_SDK_INFO, ResultCode.MSG_ERROR_ANALYZE_SDK_INFO));
                        return;
                    }
                    this.O0000OOo.O000000o(this.O00000oO);
                }
                this.O0000OoO = str;
                this.O0000OOo.O000000o(str).O000000o(j);
                this.O00000oo.updateMask(j, str, new RequestCallback<com.mobile.auth.gatewayauth.manager.base.O00000Oo, com.mobile.auth.gatewayauth.manager.base.O00000Oo>() { // from class: com.mobile.auth.gatewayauth.PhoneNumberAuthHelperProxy.20
                    public void O000000o(com.mobile.auth.gatewayauth.manager.base.O00000Oo o00000Oo2) {
                        try {
                            if (!o00000Oo.O00000o()) {
                                return;
                            }
                            monitorStruct.setCache(String.valueOf(o00000Oo2.O00000oO()));
                            LoginPhoneInfo O0000OOo = o00000Oo2.O0000OOo();
                            monitorStruct.setPhoneNumber(O0000OOo.getPhoneNumber());
                            PhoneNumberAuthHelperProxy.this.O000000o(O0000OOo.getPhoneNumber());
                            monitorStruct.setAuthSdkCode(resultCodeProcessor.convertCode(Constant.CODE_GET_TOKEN_SUCCESS));
                            requestCallback.onSuccess(O0000OOo);
                        } catch (Throwable th) {
                            try {
                                ExceptionProcessor.processException(th);
                            } catch (Throwable th2) {
                                ExceptionProcessor.processException(th2);
                            }
                        }
                    }

                    public void O00000Oo(com.mobile.auth.gatewayauth.manager.base.O00000Oo o00000Oo2) {
                        try {
                            if (!o00000Oo.O00000o()) {
                                return;
                            }
                            monitorStruct.setCache("false");
                            monitorStruct.setCarrierFailedResultData(o00000Oo2.O00000o());
                            PhoneNumberAuthHelperProxy.O00000o(PhoneNumberAuthHelperProxy.this).O00000o("justGetLoginPhone failed!", o00000Oo2.O0000Oo0());
                            requestCallback.onError(o00000Oo2);
                        } catch (Throwable th) {
                            try {
                                ExceptionProcessor.processException(th);
                            } catch (Throwable th2) {
                                ExceptionProcessor.processException(th2);
                            }
                        }
                    }

                    @Override // com.mobile.auth.gatewayauth.manager.RequestCallback
                    public /* synthetic */ void onError(com.mobile.auth.gatewayauth.manager.base.O00000Oo o00000Oo2) {
                        try {
                            O00000Oo(o00000Oo2);
                        } catch (Throwable th) {
                            try {
                                ExceptionProcessor.processException(th);
                            } catch (Throwable th2) {
                                ExceptionProcessor.processException(th2);
                            }
                        }
                    }

                    @Override // com.mobile.auth.gatewayauth.manager.RequestCallback
                    public /* synthetic */ void onSuccess(com.mobile.auth.gatewayauth.manager.base.O00000Oo o00000Oo2) {
                        try {
                            O000000o(o00000Oo2);
                        } catch (Throwable th) {
                            try {
                                ExceptionProcessor.processException(th);
                            } catch (Throwable th2) {
                                ExceptionProcessor.processException(th2);
                            }
                        }
                    }
                }, simCacheKey, i2, this.O00000oO.O000000o(!z), str2, str3);
            }
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    private void justGetLoginToken(long j, final TokenResultListener tokenResultListener, final ResultCodeProcessor resultCodeProcessor) {
        try {
            final String O0000Oo = this.O0000O0o.O0000Oo();
            String O00000o0 = this.O0000O0o.O00000o0();
            final String O00000o02 = this.O00000o0.O00000o0();
            final MonitorStruct monitorStruct = new MonitorStruct();
            monitorStruct.putApiParam("timeout", String.valueOf(j));
            monitorStruct.setSessionId(O00000o0);
            monitorStruct.setRequestId(O0000Oo);
            monitorStruct.setStartTime(System.currentTimeMillis());
            monitorStruct.setVendorKey(O00000o02);
            monitorStruct.setAction(this.O00000o0.O00000oo(O00000o02));
            monitorStruct.setApiLevel(resultCodeProcessor.getApiLevel());
            monitorStruct.setUrgency(1);
            monitorStruct.setNetworkType(com.mobile.auth.gatewayauth.utils.O00000Oo.O000000o(this.O00000o0.O00000oO(), true));
            final O00000Oo o00000Oo = new O00000Oo(j, new Runnable() { // from class: com.mobile.auth.gatewayauth.PhoneNumberAuthHelperProxy.7
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        PhoneNumberAuthHelperProxy.O000000o(PhoneNumberAuthHelperProxy.this, ResultCode.CODE_ERROR_FUNCTION_TIME_OUT, "请求超时", com.mobile.auth.gatewayauth.utils.O000000o.O000000o(ResultCode.CODE_ERROR_FUNCTION_TIME_OUT, "请求超时"), O00000o02, tokenResultListener, resultCodeProcessor, monitorStruct, O0000Oo);
                        PhoneNumberAuthHelperProxy.O00000o(PhoneNumberAuthHelperProxy.this).O00000o("justGetLoginToken Timeout!");
                    } catch (Throwable th) {
                        try {
                            ExceptionProcessor.processException(th);
                        } catch (Throwable th2) {
                            ExceptionProcessor.processException(th2);
                        }
                    }
                }
            });
            o00000Oo.O000000o();
            TokenRet O000000o2 = this.O00000o0.O000000o(resultCodeProcessor, false, O00000o02);
            O00000o0.O000000o().O000000o(O0000Oo, "checkEnv", System.currentTimeMillis());
            if (O000000o2 != null) {
                if (!o00000Oo.O00000o()) {
                    return;
                }
                O000000o(O000000o2.getCode(), O000000o2.getMsg(), com.mobile.auth.gatewayauth.utils.O000000o.O000000o(O000000o2.getCode(), O000000o2.getMsg()), O00000o02, tokenResultListener, resultCodeProcessor, monitorStruct, O0000Oo);
                this.O0000Oo.O00000o("justGetLoginToken env is not safe!", O000000o2.toJsonString());
                return;
            }
            com.mobile.auth.gatewayauth.manager.O000000o O000000o3 = this.O0000OOo.O000000o(O00000o02);
            if (O000000o3 == null) {
                if (!o00000Oo.O00000o()) {
                    return;
                }
                O000000o(ResultCode.CODE_ERROR_OPERATOR_UNKNOWN_FAIL, "无法判运营商", com.mobile.auth.gatewayauth.utils.O000000o.O000000o(ResultCode.CODE_ERROR_OPERATOR_UNKNOWN_FAIL, "无法判运营商"), O00000o02, tokenResultListener, resultCodeProcessor, monitorStruct, O0000Oo);
                this.O0000Oo.O00000o("justGetLoginToken errorCode = ", ResultCode.CODE_ERROR_OPERATOR_UNKNOWN_FAIL, "; errorMsg = ", "无法判运营商");
            } else if (this.O00000o.O00000o0()) {
                if (!o00000Oo.O00000o()) {
                    return;
                }
                O000000o(Constant.CODE_ERROR_FUNCTION_DEMOTE, "系统维护，功能不可用", com.mobile.auth.gatewayauth.utils.O000000o.O000000o(Constant.CODE_ERROR_FUNCTION_DEMOTE, "系统维护，功能不可用"), O00000o02, tokenResultListener, resultCodeProcessor, monitorStruct, O0000Oo);
                this.O0000Oo.O00000o("justGetLoginToken errcode = ", Constant.CODE_ERROR_FUNCTION_DEMOTE, "; errorMsg = ", "系统维护，功能不可用", "; action = ", monitorStruct.getAction());
            } else {
                CacheKey vendorCacheKey = this.O00000o0.getVendorCacheKey(O00000o02);
                if (!O000000o(O00000o0, this.O0000OoO, O00000o02)) {
                    String O000000o4 = this.O00000oO.O000000o(false);
                    O000000o3.O000000o(j);
                    this.O00000oo.O00000Oo(j, O00000o02, new RequestCallback<com.mobile.auth.gatewayauth.manager.base.O00000Oo, com.mobile.auth.gatewayauth.manager.base.O00000Oo>() { // from class: com.mobile.auth.gatewayauth.PhoneNumberAuthHelperProxy.8
                        public void O000000o(com.mobile.auth.gatewayauth.manager.base.O00000Oo o00000Oo2) {
                            try {
                                if (!o00000Oo.O00000o()) {
                                    return;
                                }
                                monitorStruct.setCache(String.valueOf(o00000Oo2.O00000oO()));
                                PhoneNumberAuthHelperProxy.O000000o(PhoneNumberAuthHelperProxy.this, true, O00000o02, tokenResultListener, resultCodeProcessor, o00000Oo2.O00000o(), monitorStruct, O0000Oo);
                            } catch (Throwable th) {
                                try {
                                    ExceptionProcessor.processException(th);
                                } catch (Throwable th2) {
                                    ExceptionProcessor.processException(th2);
                                }
                            }
                        }

                        public void O00000Oo(com.mobile.auth.gatewayauth.manager.base.O00000Oo o00000Oo2) {
                            try {
                                if (!o00000Oo.O00000o()) {
                                    return;
                                }
                                monitorStruct.setCache("false");
                                monitorStruct.setCarrierFailedResultData(o00000Oo2.O00000o());
                                PhoneNumberAuthHelperProxy.O000000o(PhoneNumberAuthHelperProxy.this, o00000Oo2.O00000Oo(), o00000Oo2.O00000o0(), o00000Oo2.O0000O0o(), O00000o02, tokenResultListener, resultCodeProcessor, monitorStruct, O0000Oo);
                            } catch (Throwable th) {
                                try {
                                    ExceptionProcessor.processException(th);
                                } catch (Throwable th2) {
                                    ExceptionProcessor.processException(th2);
                                }
                            }
                        }

                        @Override // com.mobile.auth.gatewayauth.manager.RequestCallback
                        public /* synthetic */ void onError(com.mobile.auth.gatewayauth.manager.base.O00000Oo o00000Oo2) {
                            try {
                                O00000Oo(o00000Oo2);
                            } catch (Throwable th) {
                                try {
                                    ExceptionProcessor.processException(th);
                                } catch (Throwable th2) {
                                    ExceptionProcessor.processException(th2);
                                }
                            }
                        }

                        @Override // com.mobile.auth.gatewayauth.manager.RequestCallback
                        public /* synthetic */ void onSuccess(com.mobile.auth.gatewayauth.manager.base.O00000Oo o00000Oo2) {
                            try {
                                O000000o(o00000Oo2);
                            } catch (Throwable th) {
                                try {
                                    ExceptionProcessor.processException(th);
                                } catch (Throwable th2) {
                                    ExceptionProcessor.processException(th2);
                                }
                            }
                        }
                    }, vendorCacheKey, O000000o4, 10000L, 5, O0000Oo, O00000o0);
                } else if (!o00000Oo.O00000o()) {
                } else {
                    O000000o(ResultCode.CODE_ERROR_NET_SIM_CHANGE, ResultCode.MSG_ERROR_NET_SIM_CHANGE, com.mobile.auth.gatewayauth.utils.O000000o.O000000o(ResultCode.CODE_ERROR_NET_SIM_CHANGE, ResultCode.MSG_ERROR_NET_SIM_CHANGE), O00000o02, tokenResultListener, resultCodeProcessor, monitorStruct, O0000Oo);
                    this.O0000Oo.O00000o("Sim card changed", "LoginPhoneVendorKey:", this.O0000OoO, ", Current VendorKey:", vendorCacheKey.getKey());
                }
            }
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    private void justGetToken(int i, final ResultCodeProcessor resultCodeProcessor, boolean z, final TokenResultListener tokenResultListener) {
        String str;
        MonitorStruct monitorStruct;
        try {
            final String O0000Oo = this.O0000O0o.O0000Oo();
            String O00000o = this.O0000O0o.O00000o();
            int i2 = i <= 0 ? 5000 : i;
            long j = i2;
            final String O00000o0 = this.O00000o0.O00000o0();
            final MonitorStruct monitorStruct2 = new MonitorStruct();
            monitorStruct2.setApiLevel(resultCodeProcessor.getApiLevel());
            monitorStruct2.putApiParam("timeout", String.valueOf(i2));
            monitorStruct2.setSessionId(O00000o);
            monitorStruct2.setRequestId(O0000Oo);
            monitorStruct2.setStartTime(System.currentTimeMillis());
            monitorStruct2.setUrgency(1);
            monitorStruct2.setVendorKey(O00000o0);
            monitorStruct2.setNetworkType(com.mobile.auth.gatewayauth.utils.O00000Oo.O000000o(this.O00000o0.O00000oO(), true));
            monitorStruct2.setAction(this.O00000o0.O0000O0o(O00000o0));
            final O00000Oo o00000Oo = new O00000Oo(j, new Runnable() { // from class: com.mobile.auth.gatewayauth.PhoneNumberAuthHelperProxy.9
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        PhoneNumberAuthHelperProxy.O00000Oo(PhoneNumberAuthHelperProxy.this, ResultCode.CODE_ERROR_FUNCTION_TIME_OUT, "请求超时", com.mobile.auth.gatewayauth.utils.O000000o.O000000o(ResultCode.CODE_ERROR_FUNCTION_TIME_OUT, "请求超时"), O00000o0, tokenResultListener, resultCodeProcessor, monitorStruct2, O0000Oo);
                        PhoneNumberAuthHelperProxy.O00000o(PhoneNumberAuthHelperProxy.this).O00000o("justGetToken Timeout!");
                    } catch (Throwable th) {
                        try {
                            ExceptionProcessor.processException(th);
                        } catch (Throwable th2) {
                            ExceptionProcessor.processException(th2);
                        }
                    }
                }
            });
            o00000Oo.O000000o();
            boolean z2 = false;
            TokenRet O000000o2 = this.O00000o0.O000000o(resultCodeProcessor, false, O00000o0);
            O00000o0.O000000o().O000000o(O0000Oo, "checkEnv", System.currentTimeMillis());
            if (O000000o2 != null) {
                if (!o00000Oo.O00000o()) {
                    return;
                }
                monitorStruct2.setAuthSdkCode(O000000o2.getCode());
                O00000Oo(O000000o2.getCode(), O000000o2.getMsg(), com.mobile.auth.gatewayauth.utils.O000000o.O000000o(O000000o2.getCode(), O000000o2.getMsg()), O00000o0, tokenResultListener, resultCodeProcessor, monitorStruct2, O0000Oo);
                this.O0000Oo.O00000o("justGetToken env is not safe!", O000000o2.toJsonString());
                return;
            }
            com.mobile.auth.gatewayauth.manager.O000000o O000000o3 = this.O0000OOo.O000000o(O00000o0);
            if (O000000o3 == null) {
                if (!o00000Oo.O00000o()) {
                    return;
                }
                O00000Oo(ResultCode.CODE_ERROR_OPERATOR_UNKNOWN_FAIL, "无法判运营商", com.mobile.auth.gatewayauth.utils.O000000o.O000000o(ResultCode.CODE_ERROR_OPERATOR_UNKNOWN_FAIL, "无法判运营商"), O00000o0, tokenResultListener, resultCodeProcessor, monitorStruct2, O0000Oo);
                this.O0000Oo.O00000o("justGetToken errorCode = ", ResultCode.CODE_ERROR_OPERATOR_UNKNOWN_FAIL, "; errorMsg = ", "无法判运营商");
            } else if (this.O00000o.O00000Oo()) {
                if (o00000Oo.O00000o()) {
                    monitorStruct = monitorStruct2;
                    O00000Oo(Constant.CODE_ERROR_FUNCTION_DEMOTE, "系统维护，功能不可用", com.mobile.auth.gatewayauth.utils.O000000o.O000000o(Constant.CODE_ERROR_FUNCTION_DEMOTE, "系统维护，功能不可用"), O00000o0, tokenResultListener, resultCodeProcessor, monitorStruct2, O0000Oo);
                } else {
                    monitorStruct = monitorStruct2;
                }
                this.O0000Oo.O00000o("justGetToken errorCode = ", Constant.CODE_ERROR_FUNCTION_DEMOTE, "; errorMsg = ", "系统维护，功能不可用", "; action = ", monitorStruct.getAction());
            } else {
                CacheKey simCacheKey = this.O00000o0.getSimCacheKey(!z, O00000o0);
                O00000o0.O000000o().O000000o(O0000Oo, "cacheKey", System.currentTimeMillis());
                VendorSdkInfoManager vendorSdkInfoManager = this.O00000oO;
                if (!z) {
                    z2 = true;
                }
                String O000000o4 = vendorSdkInfoManager.O000000o(z2);
                if (z && !this.O00000oO.O000000o()) {
                    this.O0000Oo.O00000o("justGetToken SceneCode = null");
                    if (!o00000Oo.O00000o()) {
                        return;
                    }
                    O00000Oo(ResultCode.CODE_ERROR_ANALYZE_SDK_INFO, ResultCode.MSG_ERROR_ANALYZE_SDK_INFO, com.mobile.auth.gatewayauth.utils.O000000o.O000000o(ResultCode.CODE_ERROR_ANALYZE_SDK_INFO, ResultCode.MSG_ERROR_ANALYZE_SDK_INFO), O00000o0, tokenResultListener, resultCodeProcessor, monitorStruct2, O0000Oo);
                    return;
                }
                if (!z) {
                    str = O00000o;
                    if (!this.O00000oO.O000000o(str, O0000O0o.O000000o(this.O00000o0.O00000oO(), this.O00000oO, this.O00000o, this.O0000Oo))) {
                        this.O0000Oo.O00000o("justGetToken SceneCode = null");
                        if (!o00000Oo.O00000o()) {
                            return;
                        }
                        O00000Oo(Constant.CODE_ERROR_GET_CONFIG_FAIL, "获取运营商配置信息失败", com.mobile.auth.gatewayauth.utils.O000000o.O000000o(Constant.CODE_ERROR_GET_CONFIG_FAIL, "获取运营商配置信息失败"), O00000o0, tokenResultListener, resultCodeProcessor, monitorStruct2, O0000Oo);
                        return;
                    }
                    this.O0000OOo.O000000o(this.O00000oO);
                } else {
                    str = O00000o;
                }
                O000000o3.O000000o(j);
                this.O00000oo.O000000o(j, O00000o0, new RequestCallback<com.mobile.auth.gatewayauth.manager.base.O00000Oo, com.mobile.auth.gatewayauth.manager.base.O00000Oo>() { // from class: com.mobile.auth.gatewayauth.PhoneNumberAuthHelperProxy.10
                    public void O000000o(com.mobile.auth.gatewayauth.manager.base.O00000Oo o00000Oo2) {
                        try {
                            if (!o00000Oo.O00000o()) {
                                return;
                            }
                            monitorStruct2.setCache(String.valueOf(o00000Oo2.O00000oO()));
                            PhoneNumberAuthHelperProxy.O000000o(PhoneNumberAuthHelperProxy.this, true, O00000o0, resultCodeProcessor, monitorStruct2, o00000Oo2.O00000o(), tokenResultListener, O0000Oo);
                        } catch (Throwable th) {
                            try {
                                ExceptionProcessor.processException(th);
                            } catch (Throwable th2) {
                                ExceptionProcessor.processException(th2);
                            }
                        }
                    }

                    public void O00000Oo(com.mobile.auth.gatewayauth.manager.base.O00000Oo o00000Oo2) {
                        try {
                            if (!o00000Oo.O00000o()) {
                                return;
                            }
                            monitorStruct2.setCache("false");
                            monitorStruct2.setCarrierFailedResultData(o00000Oo2.O00000o());
                            PhoneNumberAuthHelperProxy.O00000Oo(PhoneNumberAuthHelperProxy.this, o00000Oo2.O00000Oo(), o00000Oo2.O00000o0(), o00000Oo2.O0000O0o(), O00000o0, tokenResultListener, resultCodeProcessor, monitorStruct2, O0000Oo);
                        } catch (Throwable th) {
                            try {
                                ExceptionProcessor.processException(th);
                            } catch (Throwable th2) {
                                ExceptionProcessor.processException(th2);
                            }
                        }
                    }

                    @Override // com.mobile.auth.gatewayauth.manager.RequestCallback
                    public /* synthetic */ void onError(com.mobile.auth.gatewayauth.manager.base.O00000Oo o00000Oo2) {
                        try {
                            O00000Oo(o00000Oo2);
                        } catch (Throwable th) {
                            try {
                                ExceptionProcessor.processException(th);
                            } catch (Throwable th2) {
                                ExceptionProcessor.processException(th2);
                            }
                        }
                    }

                    @Override // com.mobile.auth.gatewayauth.manager.RequestCallback
                    public /* synthetic */ void onSuccess(com.mobile.auth.gatewayauth.manager.base.O00000Oo o00000Oo2) {
                        try {
                            O000000o(o00000Oo2);
                        } catch (Throwable th) {
                            try {
                                ExceptionProcessor.processException(th);
                            } catch (Throwable th2) {
                                ExceptionProcessor.processException(th2);
                            }
                        }
                    }
                }, simCacheKey, 10000L, O000000o4, O0000Oo, str);
            }
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    private void justPreLogin(long j, final PreLoginResultListener preLoginResultListener, final ResultCodeProcessor resultCodeProcessor, boolean z, boolean z2) {
        String str;
        int i;
        String str2;
        String str3;
        try {
            final String O0000Oo = this.O0000O0o.O0000Oo();
            String O00000oo = this.O0000O0o.O00000oo();
            long j2 = j <= 0 ? 5000L : j;
            final String O00000o0 = this.O00000o0.O00000o0();
            final String O00000Oo = this.O00000o0.O00000Oo(O00000o0);
            final MonitorStruct monitorStruct = new MonitorStruct();
            monitorStruct.setApiLevel(resultCodeProcessor.getApiLevel());
            monitorStruct.putApiParam("timeout", String.valueOf(j2));
            monitorStruct.setSessionId(O00000oo);
            monitorStruct.setRequestId(O0000Oo);
            monitorStruct.setStartTime(System.currentTimeMillis());
            monitorStruct.setVendorKey(O00000o0);
            monitorStruct.setAction(this.O00000o0.O00000o0(O00000o0));
            monitorStruct.setUrgency(1);
            monitorStruct.setNetworkType(com.mobile.auth.gatewayauth.utils.O00000Oo.O000000o(this.O00000o0.O00000oO(), true));
            if (preLoginResultListener == null) {
                O000000o(Constant.CODE_ERROR_UNKNOWN_FAIL, "PreLoginResultListener is null", com.mobile.auth.gatewayauth.utils.O000000o.O000000o(Constant.CODE_ERROR_UNKNOWN_FAIL, "PreLoginResultListener is null"), O00000o0, (TokenResultListener) null, resultCodeProcessor, monitorStruct, O0000Oo);
                this.O0000Oo.O00000o("accelerateLoginPage errorMsg = PreLoginResultListener is null");
                return;
            }
            final TokenResultListener tokenResultListener = new TokenResultListener() { // from class: com.mobile.auth.gatewayauth.PhoneNumberAuthHelperProxy.21
                @Override // com.mobile.auth.gatewayauth.TokenResultListener
                public void onTokenFailed(String str4) {
                    try {
                        preLoginResultListener.onTokenFailed(O00000Oo, str4);
                    } catch (Throwable th) {
                        try {
                            ExceptionProcessor.processException(th);
                        } catch (Throwable th2) {
                            ExceptionProcessor.processException(th2);
                        }
                    }
                }

                @Override // com.mobile.auth.gatewayauth.TokenResultListener
                public void onTokenSuccess(String str4) {
                    try {
                        preLoginResultListener.onTokenSuccess(O00000Oo);
                    } catch (Throwable th) {
                        try {
                            ExceptionProcessor.processException(th);
                        } catch (Throwable th2) {
                            ExceptionProcessor.processException(th2);
                        }
                    }
                }
            };
            final O00000Oo o00000Oo = new O00000Oo(j2, new Runnable() { // from class: com.mobile.auth.gatewayauth.PhoneNumberAuthHelperProxy.22
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        PhoneNumberAuthHelperProxy.O000000o(PhoneNumberAuthHelperProxy.this, ResultCode.CODE_ERROR_FUNCTION_TIME_OUT, "请求超时", com.mobile.auth.gatewayauth.utils.O000000o.O000000o(ResultCode.CODE_ERROR_FUNCTION_TIME_OUT, "请求超时"), O00000o0, tokenResultListener, resultCodeProcessor, monitorStruct, O0000Oo);
                        PhoneNumberAuthHelperProxy.O00000o(PhoneNumberAuthHelperProxy.this).O00000o("justPreLogin errorCode = ", ResultCode.CODE_ERROR_FUNCTION_TIME_OUT, "; errorMsg = ", "请求超时", "; action = ", monitorStruct.getAction());
                    } catch (Throwable th) {
                        try {
                            ExceptionProcessor.processException(th);
                        } catch (Throwable th2) {
                            ExceptionProcessor.processException(th2);
                        }
                    }
                }
            });
            o00000Oo.O000000o();
            boolean z3 = false;
            TokenRet O000000o2 = this.O00000o0.O000000o(resultCodeProcessor, false, O00000o0);
            if (O000000o2 != null && o00000Oo.O00000o()) {
                O000000o(O000000o2.getCode(), O000000o2.getMsg(), com.mobile.auth.gatewayauth.utils.O000000o.O000000o(O000000o2.getCode(), O000000o2.getMsg()), O00000o0, tokenResultListener, resultCodeProcessor, monitorStruct, O0000Oo);
                this.O0000Oo.O00000o("justPreLogin errorCode = ", O000000o2.getCode(), "; errorMsg = ", O000000o2.getMsg(), "; action = ", monitorStruct.getAction());
                return;
            }
            com.mobile.auth.gatewayauth.manager.O000000o O000000o3 = this.O0000OOo.O000000o(O00000o0);
            if (O000000o3 == null) {
                if (o00000Oo.O00000o()) {
                    str2 = "justPreLogin errorCode = ";
                    str3 = "; errorMsg = ";
                    O000000o(ResultCode.CODE_ERROR_OPERATOR_UNKNOWN_FAIL, "无法判运营商", com.mobile.auth.gatewayauth.utils.O000000o.O000000o(ResultCode.CODE_ERROR_OPERATOR_UNKNOWN_FAIL, "无法判运营商"), O00000o0, tokenResultListener, resultCodeProcessor, monitorStruct, O0000Oo);
                } else {
                    str2 = "justPreLogin errorCode = ";
                    str3 = "; errorMsg = ";
                }
                this.O0000Oo.O00000o(str2, ResultCode.CODE_ERROR_OPERATOR_UNKNOWN_FAIL, str3, "无法判运营商");
            } else if (this.O00000o.O00000o0()) {
                if (o00000Oo.O00000o()) {
                    i = 6;
                    O000000o(Constant.CODE_ERROR_FUNCTION_DEMOTE, "系统维护，功能不可用", com.mobile.auth.gatewayauth.utils.O000000o.O000000o(Constant.CODE_ERROR_FUNCTION_DEMOTE, "系统维护，功能不可用"), O00000o0, tokenResultListener, resultCodeProcessor, monitorStruct, O0000Oo);
                } else {
                    i = 6;
                }
                OO0oO oO0oO = this.O0000Oo;
                String[] strArr = new String[i];
                strArr[0] = "justPreLogin errorCode = ";
                strArr[1] = Constant.CODE_ERROR_FUNCTION_DEMOTE;
                strArr[2] = "; errorMsg = ";
                strArr[3] = "系统维护，功能不可用";
                strArr[4] = "; action = ";
                strArr[5] = monitorStruct.getAction();
                oO0oO.O00000o(strArr);
            } else if (z2) {
                if (o00000Oo.O00000o()) {
                    O000000o(ResultCode.CODE_ERROR_CALL_PRE_LOGIN_IN_AUTH_PAGE, ResultCode.MSG_ERROR_CALL_PRE_LOGIN_IN_AUTH_PAGE, com.mobile.auth.gatewayauth.utils.O000000o.O000000o(ResultCode.CODE_ERROR_CALL_PRE_LOGIN_IN_AUTH_PAGE, ResultCode.MSG_ERROR_CALL_PRE_LOGIN_IN_AUTH_PAGE), O00000o0, tokenResultListener, resultCodeProcessor, monitorStruct, O0000Oo);
                }
                this.O0000Oo.O00000o("Auth page has been showing!");
            } else if (z && !this.O00000oO.O000000o()) {
                this.O0000Oo.O00000o("justGetToken SceneCode = null");
                if (!o00000Oo.O00000o()) {
                    return;
                }
                O000000o(ResultCode.CODE_ERROR_ANALYZE_SDK_INFO, ResultCode.MSG_ERROR_ANALYZE_SDK_INFO, com.mobile.auth.gatewayauth.utils.O000000o.O000000o(ResultCode.CODE_ERROR_ANALYZE_SDK_INFO, ResultCode.MSG_ERROR_ANALYZE_SDK_INFO), O00000Oo, tokenResultListener, resultCodeProcessor, monitorStruct, O0000Oo);
            } else {
                if (!z) {
                    str = O00000oo;
                    if (!this.O00000oO.O000000o(str, O0000O0o.O000000o(this.O00000o0.O00000oO(), this.O00000oO, this.O00000o, this.O0000Oo))) {
                        this.O0000Oo.O00000o("justGetToken SceneCode = null");
                        if (!o00000Oo.O00000o()) {
                            return;
                        }
                        O000000o(Constant.CODE_ERROR_GET_CONFIG_FAIL, "获取运营商配置信息失败", com.mobile.auth.gatewayauth.utils.O000000o.O000000o(Constant.CODE_ERROR_GET_CONFIG_FAIL, "获取运营商配置信息失败"), O00000Oo, tokenResultListener, resultCodeProcessor, monitorStruct, O0000Oo);
                        return;
                    }
                    this.O0000OOo.O000000o(this.O00000oO);
                } else {
                    str = O00000oo;
                }
                O000000o3.O000000o(j2);
                TokenMaskManager tokenMaskManager = this.O00000oo;
                String str4 = str;
                RequestCallback<com.mobile.auth.gatewayauth.manager.base.O00000Oo, com.mobile.auth.gatewayauth.manager.base.O00000Oo> requestCallback = new RequestCallback<com.mobile.auth.gatewayauth.manager.base.O00000Oo, com.mobile.auth.gatewayauth.manager.base.O00000Oo>() { // from class: com.mobile.auth.gatewayauth.PhoneNumberAuthHelperProxy.24
                    public void O000000o(com.mobile.auth.gatewayauth.manager.base.O00000Oo o00000Oo2) {
                        try {
                            if (!o00000Oo.O00000o()) {
                                return;
                            }
                            monitorStruct.setCache(String.valueOf(o00000Oo2.O00000oO()));
                            monitorStruct.setAuthSdkCode(resultCodeProcessor.convertCode(Constant.CODE_GET_TOKEN_SUCCESS));
                            PhoneNumberAuthHelperProxy.O000000o(PhoneNumberAuthHelperProxy.this, true, false, "", O00000Oo, monitorStruct, tokenResultListener);
                        } catch (Throwable th) {
                            try {
                                ExceptionProcessor.processException(th);
                            } catch (Throwable th2) {
                                ExceptionProcessor.processException(th2);
                            }
                        }
                    }

                    public void O00000Oo(com.mobile.auth.gatewayauth.manager.base.O00000Oo o00000Oo2) {
                        try {
                            if (!o00000Oo.O00000o()) {
                                return;
                            }
                            monitorStruct.setCache("false");
                            monitorStruct.setCarrierFailedResultData(o00000Oo2.O00000o());
                            PhoneNumberAuthHelperProxy.O000000o(PhoneNumberAuthHelperProxy.this, o00000Oo2.O00000Oo(), o00000Oo2.O00000o0(), o00000Oo2.O0000O0o(), O00000o0, tokenResultListener, resultCodeProcessor, monitorStruct, O0000Oo);
                        } catch (Throwable th) {
                            try {
                                ExceptionProcessor.processException(th);
                            } catch (Throwable th2) {
                                ExceptionProcessor.processException(th2);
                            }
                        }
                    }

                    @Override // com.mobile.auth.gatewayauth.manager.RequestCallback
                    public /* synthetic */ void onError(com.mobile.auth.gatewayauth.manager.base.O00000Oo o00000Oo2) {
                        try {
                            O00000Oo(o00000Oo2);
                        } catch (Throwable th) {
                            try {
                                ExceptionProcessor.processException(th);
                            } catch (Throwable th2) {
                                ExceptionProcessor.processException(th2);
                            }
                        }
                    }

                    @Override // com.mobile.auth.gatewayauth.manager.RequestCallback
                    public /* synthetic */ void onSuccess(com.mobile.auth.gatewayauth.manager.base.O00000Oo o00000Oo2) {
                        try {
                            O000000o(o00000Oo2);
                        } catch (Throwable th) {
                            try {
                                ExceptionProcessor.processException(th);
                            } catch (Throwable th2) {
                                ExceptionProcessor.processException(th2);
                            }
                        }
                    }
                };
                CacheKey simCacheKey = this.O00000o0.getSimCacheKey(!z, O00000o0);
                VendorSdkInfoManager vendorSdkInfoManager = this.O00000oO;
                if (!z) {
                    z3 = true;
                }
                tokenMaskManager.updateMask(j2, O00000o0, requestCallback, simCacheKey, 6, vendorSdkInfoManager.O000000o(z3), O0000Oo, str4);
            }
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    private void justPreVerify(long j, final PreLoginResultListener preLoginResultListener) {
        int i;
        char c;
        String str;
        String str2;
        String str3;
        String str4;
        int i2;
        char c2;
        char c3;
        long j2 = j <= 0 ? 5000L : j;
        try {
            final String O0000Oo = this.O0000O0o.O0000Oo();
            String O0000O0o = this.O0000O0o.O0000O0o();
            final MonitorStruct monitorStruct = new MonitorStruct();
            monitorStruct.setApiLevel(this.O0000Ooo.getApiLevel());
            final String O00000o0 = this.O00000o0.O00000o0();
            final String O00000Oo = this.O00000o0.O00000Oo(O00000o0);
            monitorStruct.putApiParam("timeout", String.valueOf(j2));
            monitorStruct.setSessionId(O0000O0o);
            monitorStruct.setRequestId(O0000Oo);
            monitorStruct.setStartTime(System.currentTimeMillis());
            monitorStruct.setVendorKey(O00000o0);
            monitorStruct.setAction(this.O00000o0.O00000o(O00000o0));
            monitorStruct.setUrgency(1);
            monitorStruct.setNetworkType(com.mobile.auth.gatewayauth.utils.O00000Oo.O000000o(this.O00000o0.O00000oO(), true));
            if (preLoginResultListener == null) {
                O00000Oo(Constant.CODE_ERROR_UNKNOWN_FAIL, "PreLoginResultListener is null", com.mobile.auth.gatewayauth.utils.O000000o.O000000o(Constant.CODE_ERROR_UNKNOWN_FAIL, "PreLoginResultListener is null"), O00000o0, null, this.O0000Ooo, monitorStruct, O0000Oo);
                this.O0000Oo.O00000o("accelerateVerify errorMsg = PreLoginResultListener is null");
                return;
            }
            final TokenResultListener tokenResultListener = new TokenResultListener() { // from class: com.mobile.auth.gatewayauth.PhoneNumberAuthHelperProxy.15
                @Override // com.mobile.auth.gatewayauth.TokenResultListener
                public void onTokenFailed(String str5) {
                    try {
                        preLoginResultListener.onTokenFailed(O00000Oo, str5);
                    } catch (Throwable th) {
                        try {
                            ExceptionProcessor.processException(th);
                        } catch (Throwable th2) {
                            ExceptionProcessor.processException(th2);
                        }
                    }
                }

                @Override // com.mobile.auth.gatewayauth.TokenResultListener
                public void onTokenSuccess(String str5) {
                    try {
                        preLoginResultListener.onTokenSuccess(O00000Oo);
                    } catch (Throwable th) {
                        try {
                            ExceptionProcessor.processException(th);
                        } catch (Throwable th2) {
                            ExceptionProcessor.processException(th2);
                        }
                    }
                }
            };
            final O00000Oo o00000Oo = new O00000Oo(j2, new Runnable() { // from class: com.mobile.auth.gatewayauth.PhoneNumberAuthHelperProxy.16
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        PhoneNumberAuthHelperProxy.O00000Oo(PhoneNumberAuthHelperProxy.this, ResultCode.CODE_ERROR_FUNCTION_TIME_OUT, "请求超时", com.mobile.auth.gatewayauth.utils.O000000o.O000000o(ResultCode.CODE_ERROR_FUNCTION_TIME_OUT, "请求超时"), O00000o0, tokenResultListener, PhoneNumberAuthHelperProxy.O0000O0o(PhoneNumberAuthHelperProxy.this), monitorStruct, O0000Oo);
                        PhoneNumberAuthHelperProxy.O00000o(PhoneNumberAuthHelperProxy.this).O00000o("justPreVerify errorCode = ", ResultCode.CODE_ERROR_FUNCTION_TIME_OUT, "; errorMsg = ", "请求超时", "; action = ", monitorStruct.getAction());
                    } catch (Throwable th) {
                        try {
                            ExceptionProcessor.processException(th);
                        } catch (Throwable th2) {
                            ExceptionProcessor.processException(th2);
                        }
                    }
                }
            });
            o00000Oo.O000000o();
            TokenRet O000000o2 = this.O00000o0.O000000o(this.O0000Ooo, false, O00000o0);
            if (O000000o2 != null) {
                if (o00000Oo.O00000o()) {
                    str3 = "justPreVerify errorCode = ";
                    str4 = "; errorMsg = ";
                    i2 = 6;
                    c2 = 0;
                    c3 = 1;
                    O00000Oo(O000000o2.getCode(), O000000o2.getMsg(), com.mobile.auth.gatewayauth.utils.O000000o.O000000o(O000000o2.getCode(), O000000o2.getMsg()), O00000o0, tokenResultListener, this.O0000Ooo, monitorStruct, O0000Oo);
                } else {
                    str3 = "justPreVerify errorCode = ";
                    str4 = "; errorMsg = ";
                    i2 = 6;
                    c2 = 0;
                    c3 = 1;
                }
                OO0oO oO0oO = this.O0000Oo;
                String[] strArr = new String[i2];
                strArr[c2] = str3;
                strArr[c3] = O000000o2.getCode();
                strArr[2] = str4;
                strArr[3] = O000000o2.getMsg();
                strArr[4] = "; action = ";
                strArr[5] = monitorStruct.getAction();
                oO0oO.O00000o(strArr);
                return;
            }
            com.mobile.auth.gatewayauth.manager.O000000o O000000o3 = this.O0000OOo.O000000o(O00000o0);
            if (O000000o3 == null) {
                if (o00000Oo.O00000o()) {
                    str = "justPreVerify errorCode = ";
                    str2 = "; errorMsg = ";
                    O00000Oo(ResultCode.CODE_ERROR_OPERATOR_UNKNOWN_FAIL, "无法判运营商", com.mobile.auth.gatewayauth.utils.O000000o.O000000o(ResultCode.CODE_ERROR_OPERATOR_UNKNOWN_FAIL, "无法判运营商"), O00000o0, tokenResultListener, this.O0000Ooo, monitorStruct, O0000Oo);
                } else {
                    str = "justPreVerify errorCode = ";
                    str2 = "; errorMsg = ";
                }
                this.O0000Oo.O00000o(str, ResultCode.CODE_ERROR_OPERATOR_UNKNOWN_FAIL, str2, "无法判运营商");
            } else if (!this.O00000o.O00000Oo()) {
                if (this.O00000oO.O000000o()) {
                    O000000o3.O000000o(j2);
                    this.O00000oo.O00000Oo(j2, O00000o0, new RequestCallback<String, com.mobile.auth.gatewayauth.manager.base.O00000Oo>() { // from class: com.mobile.auth.gatewayauth.PhoneNumberAuthHelperProxy.17
                        public void O000000o(com.mobile.auth.gatewayauth.manager.base.O00000Oo o00000Oo2) {
                            try {
                                if (!o00000Oo.O00000o()) {
                                    return;
                                }
                                monitorStruct.setCache("false");
                                monitorStruct.setCarrierFailedResultData(o00000Oo2.O00000o());
                                PhoneNumberAuthHelperProxy.O00000Oo(PhoneNumberAuthHelperProxy.this, o00000Oo2.O00000Oo(), o00000Oo2.O00000o0(), o00000Oo2.O0000O0o(), O00000o0, tokenResultListener, PhoneNumberAuthHelperProxy.O0000O0o(PhoneNumberAuthHelperProxy.this), monitorStruct, O0000Oo);
                            } catch (Throwable th) {
                                try {
                                    ExceptionProcessor.processException(th);
                                } catch (Throwable th2) {
                                    ExceptionProcessor.processException(th2);
                                }
                            }
                        }

                        public void O000000o(String str5) {
                            try {
                                if (!o00000Oo.O00000o()) {
                                    return;
                                }
                                monitorStruct.setCache(str5);
                                monitorStruct.setAuthSdkCode(PhoneNumberAuthHelperProxy.O0000O0o(PhoneNumberAuthHelperProxy.this).convertCode(Constant.CODE_GET_TOKEN_SUCCESS));
                                PhoneNumberAuthHelperProxy.O000000o(PhoneNumberAuthHelperProxy.this, true, false, "", O00000Oo, monitorStruct, tokenResultListener);
                            } catch (Throwable th) {
                                try {
                                    ExceptionProcessor.processException(th);
                                } catch (Throwable th2) {
                                    ExceptionProcessor.processException(th2);
                                }
                            }
                        }

                        @Override // com.mobile.auth.gatewayauth.manager.RequestCallback
                        public /* synthetic */ void onError(com.mobile.auth.gatewayauth.manager.base.O00000Oo o00000Oo2) {
                            try {
                                O000000o(o00000Oo2);
                            } catch (Throwable th) {
                                try {
                                    ExceptionProcessor.processException(th);
                                } catch (Throwable th2) {
                                    ExceptionProcessor.processException(th2);
                                }
                            }
                        }

                        @Override // com.mobile.auth.gatewayauth.manager.RequestCallback
                        public /* synthetic */ void onSuccess(String str5) {
                            try {
                                O000000o(str5);
                            } catch (Throwable th) {
                                try {
                                    ExceptionProcessor.processException(th);
                                } catch (Throwable th2) {
                                    ExceptionProcessor.processException(th2);
                                }
                            }
                        }
                    }, this.O00000o0.getSimCacheKey(false, O00000o0), com.mobile.auth.gatewayauth.manager.O00000o0.O000000o(O00000o0), this.O00000oO.O000000o(false), O0000Oo, O0000O0o);
                    return;
                }
                this.O0000Oo.O00000o("justPreVerify SceneCode = null");
                if (!o00000Oo.O00000o()) {
                    return;
                }
                O00000Oo(ResultCode.CODE_ERROR_ANALYZE_SDK_INFO, ResultCode.MSG_ERROR_ANALYZE_SDK_INFO, com.mobile.auth.gatewayauth.utils.O000000o.O000000o(ResultCode.CODE_ERROR_ANALYZE_SDK_INFO, ResultCode.MSG_ERROR_ANALYZE_SDK_INFO), O00000Oo, tokenResultListener, this.O0000Ooo, monitorStruct, O0000Oo);
            } else {
                if (o00000Oo.O00000o()) {
                    c = 0;
                    i = 6;
                    O00000Oo(Constant.CODE_ERROR_FUNCTION_DEMOTE, "系统维护，功能不可用", com.mobile.auth.gatewayauth.utils.O000000o.O000000o(Constant.CODE_ERROR_FUNCTION_DEMOTE, "系统维护，功能不可用"), O00000o0, tokenResultListener, this.O0000Ooo, monitorStruct, O0000Oo);
                } else {
                    i = 6;
                    c = 0;
                }
                OO0oO oO0oO2 = this.O0000Oo;
                String[] strArr2 = new String[i];
                strArr2[c] = "justPreVerify errorCode = ";
                strArr2[1] = Constant.CODE_ERROR_FUNCTION_DEMOTE;
                strArr2[2] = "; errorMsg = ";
                strArr2[3] = "系统维护，功能不可用";
                strArr2[4] = "; action = ";
                strArr2[5] = monitorStruct.getAction();
                oO0oO2.O00000o(strArr2);
            }
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public SystemManager O000000o() {
        try {
            return this.O00000o0;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void O000000o(final long j, final TokenResultListener tokenResultListener, final ResultCodeProcessor resultCodeProcessor) {
        try {
            czp.a().a(new O0000O0o.O000000o(tokenResultListener) { // from class: com.mobile.auth.gatewayauth.PhoneNumberAuthHelperProxy.6
                @Override // com.mobile.auth.gatewayauth.utils.O0000O0o.O000000o
                protected void O000000o() {
                    try {
                        PhoneNumberAuthHelperProxy.O000000o(PhoneNumberAuthHelperProxy.this, j, tokenResultListener, resultCodeProcessor);
                    } catch (Throwable th) {
                        try {
                            ExceptionProcessor.processException(th);
                        } catch (Throwable th2) {
                            ExceptionProcessor.processException(th2);
                        }
                    }
                }
            });
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public synchronized void O000000o(String str) {
        try {
            this.O0000o00 = str;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    protected void O000000o(String str, String str2, MonitorStruct monitorStruct, ResultCodeProcessor resultCodeProcessor, TokenResultListener tokenResultListener) {
        if (tokenResultListener == null) {
            return;
        }
        try {
            TokenRet convertErrorInfo = resultCodeProcessor.convertErrorInfo(Constant.CODE_GET_TOKEN_SUCCESS, "获取token成功", str2);
            convertErrorInfo.setToken(str);
            convertErrorInfo.setRequestId(monitorStruct.getRequestId());
            monitorStruct.setPerformanceTrace(O00000o0.O000000o().O000000o(monitorStruct.getRequestId()));
            monitorStruct.setAccessCode(str);
            monitorStruct.setAuthSdkCode(convertErrorInfo.getCode());
            O000000o(true, true, "", convertErrorInfo.toJsonString(), monitorStruct, tokenResultListener);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    protected void O000000o(boolean z, boolean z2, String str, String str2, String str3, String str4, MonitorStruct monitorStruct, TokenResultListener tokenResultListener, ResultCodeProcessor resultCodeProcessor, String str5) {
        try {
            TokenRet convertErrorInfo = resultCodeProcessor.convertErrorInfo(str, str2, str4);
            if (monitorStruct != null) {
                monitorStruct.setPerformanceTrace(O00000o0.O000000o().O000000o(str5));
                monitorStruct.setAuthSdkCode(convertErrorInfo.getCode());
                convertErrorInfo.setCarrierFailedResultData(monitorStruct.getCarrierFailedResultData());
            }
            convertErrorInfo.setRequestId(str5);
            O000000o(z, z2, str3, convertErrorInfo.toJsonString(), monitorStruct, tokenResultListener);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public O00000o O00000Oo() {
        try {
            return this.O0000O0o;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    public boolean O00000o0() {
        try {
            LoginPhoneInfo O000000o2 = this.O00000oo.O000000o(this.O00000o0.getSimCacheKey(false, this.O00000o0.O00000o0()));
            if (O000000o2 == null || StringUtils.isEmpty(O000000o2.getPhoneNumber())) {
                return true;
            }
            return !O000000o2.getPhoneNumber().equals(this.O0000o00);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return false;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return false;
            }
        }
    }

    public void accelerateLoginPage(final int i, final PreLoginResultListener preLoginResultListener, final boolean z) {
        try {
            czp.a().a(new O0000O0o.O000000o(this.O00000Oo) { // from class: com.mobile.auth.gatewayauth.PhoneNumberAuthHelperProxy.11
                @Override // com.mobile.auth.gatewayauth.utils.O0000O0o.O000000o
                protected void O000000o() {
                    try {
                        PhoneNumberAuthHelperProxy.O000000o(PhoneNumberAuthHelperProxy.this, i, preLoginResultListener, PhoneNumberAuthHelperProxy.O0000O0o(PhoneNumberAuthHelperProxy.this), true, z);
                    } catch (Throwable th) {
                        try {
                            ExceptionProcessor.processException(th);
                        } catch (Throwable th2) {
                            ExceptionProcessor.processException(th2);
                        }
                    }
                }
            });
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public void accelerateVerify(final int i, final PreLoginResultListener preLoginResultListener) {
        try {
            czp.a().a(new O0000O0o.O000000o(new TokenResultListener() { // from class: com.mobile.auth.gatewayauth.PhoneNumberAuthHelperProxy.13
                @Override // com.mobile.auth.gatewayauth.TokenResultListener
                public void onTokenFailed(String str) {
                    try {
                        if (preLoginResultListener == null) {
                            return;
                        }
                        preLoginResultListener.onTokenFailed("", str);
                    } catch (Throwable th) {
                        try {
                            ExceptionProcessor.processException(th);
                        } catch (Throwable th2) {
                            ExceptionProcessor.processException(th2);
                        }
                    }
                }

                @Override // com.mobile.auth.gatewayauth.TokenResultListener
                public void onTokenSuccess(String str) {
                }
            }) { // from class: com.mobile.auth.gatewayauth.PhoneNumberAuthHelperProxy.14
                @Override // com.mobile.auth.gatewayauth.utils.O0000O0o.O000000o
                protected void O000000o() {
                    try {
                        PhoneNumberAuthHelperProxy.O000000o(PhoneNumberAuthHelperProxy.this, i, preLoginResultListener);
                    } catch (Throwable th) {
                        try {
                            ExceptionProcessor.processException(th);
                        } catch (Throwable th2) {
                            ExceptionProcessor.processException(th2);
                        }
                    }
                }
            });
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public void checkEnvAvailable(final int i, final TokenResultListener tokenResultListener) {
        try {
            czp.a().a(new O0000O0o.O000000o() { // from class: com.mobile.auth.gatewayauth.PhoneNumberAuthHelperProxy.4
                /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:74:0x02b8 A[Catch: Throwable -> 0x0311, TryCatch #2 {Throwable -> 0x0311, blocks: (B:3:0x0006, B:10:0x0037, B:12:0x0042, B:18:0x009c, B:20:0x00a7, B:29:0x00fc, B:31:0x0107, B:36:0x0158, B:38:0x0163, B:49:0x01d0, B:51:0x01db, B:63:0x0273, B:72:0x02ad, B:74:0x02b8, B:56:0x0225, B:58:0x0230, B:75:0x02df, B:77:0x02ea, B:78:0x0310), top: B:88:0x0006 }] */
                @Override // com.mobile.auth.gatewayauth.utils.O0000O0o.O000000o
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                protected void O000000o() {
                    /*
                        Method dump skipped, instructions count: 796
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.mobile.auth.gatewayauth.PhoneNumberAuthHelperProxy.AnonymousClass4.O000000o():void");
                }
            });
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0254  */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean checkEnvAvailable() {
        /*
            Method dump skipped, instructions count: 629
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mobile.auth.gatewayauth.PhoneNumberAuthHelperProxy.checkEnvAvailable():boolean");
    }

    public void clearPreInfo() {
        try {
            this.O00000oo.O000000o();
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public String getCurrentCarrierName() {
        try {
            return this.O00000o0.O00000o();
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    public String getLoginMaskPhone(int i, final String str, final OnLoginPhoneListener onLoginPhoneListener, final boolean z, boolean z2, final String str2) {
        try {
            final MonitorStruct monitorStruct = new MonitorStruct();
            String O00000oo = this.O0000O0o.O00000oo();
            monitorStruct.setStartTime(System.currentTimeMillis());
            justGetLoginPhone(monitorStruct, str, i, this.O0000Ooo, z2, new RequestCallback<LoginPhoneInfo, com.mobile.auth.gatewayauth.manager.base.O00000Oo>() { // from class: com.mobile.auth.gatewayauth.PhoneNumberAuthHelperProxy.18
                public void O000000o(com.mobile.auth.gatewayauth.manager.base.O00000Oo o00000Oo) {
                    try {
                        PhoneNumberAuthHelperProxy.O00000oo(PhoneNumberAuthHelperProxy.this).O0000OOo();
                        PhoneNumberAuthHelperProxy.this.O000000o(false, true, o00000Oo.O00000Oo(), o00000Oo.O00000o0(), o00000Oo.O0000O0o(), str, monitorStruct, new TokenResultListener() { // from class: com.mobile.auth.gatewayauth.PhoneNumberAuthHelperProxy.18.3
                            @Override // com.mobile.auth.gatewayauth.TokenResultListener
                            public void onTokenFailed(String str3) {
                                try {
                                    onLoginPhoneListener.onGetFailed(str3);
                                } catch (Throwable th) {
                                    try {
                                        ExceptionProcessor.processException(th);
                                    } catch (Throwable th2) {
                                        ExceptionProcessor.processException(th2);
                                    }
                                }
                            }

                            @Override // com.mobile.auth.gatewayauth.TokenResultListener
                            public void onTokenSuccess(String str3) {
                            }
                        }, PhoneNumberAuthHelperProxy.O0000O0o(PhoneNumberAuthHelperProxy.this), str2);
                    } catch (Throwable th) {
                        try {
                            ExceptionProcessor.processException(th);
                        } catch (Throwable th2) {
                            ExceptionProcessor.processException(th2);
                        }
                    }
                }

                public void O000000o(final LoginPhoneInfo loginPhoneInfo) {
                    try {
                        loginPhoneInfo.setVendor(PhoneNumberAuthHelperProxy.O000000o(PhoneNumberAuthHelperProxy.this).O00000Oo(str));
                        if (!com.mobile.auth.gatewayauth.utils.O00000Oo.O00000oO(PhoneNumberAuthHelperProxy.O000000o(PhoneNumberAuthHelperProxy.this).O00000oO())) {
                            PhoneNumberAuthHelperProxy.this.O000000o(false, true, ResultCode.CODE_ERROR_NO_MOBILE_NETWORK_FAIL, ResultCode.MSG_ERROR_NO_MOBILE_NETWORK_FAIL, "", str, monitorStruct, new TokenResultListener() { // from class: com.mobile.auth.gatewayauth.PhoneNumberAuthHelperProxy.18.2
                                @Override // com.mobile.auth.gatewayauth.TokenResultListener
                                public void onTokenFailed(String str3) {
                                    try {
                                        onLoginPhoneListener.onGetFailed(str3);
                                    } catch (Throwable th) {
                                        try {
                                            ExceptionProcessor.processException(th);
                                        } catch (Throwable th2) {
                                            ExceptionProcessor.processException(th2);
                                        }
                                    }
                                }

                                @Override // com.mobile.auth.gatewayauth.TokenResultListener
                                public void onTokenSuccess(String str3) {
                                }
                            }, PhoneNumberAuthHelperProxy.O0000O0o(PhoneNumberAuthHelperProxy.this), str2);
                            return;
                        }
                        PhoneNumberAuthHelperProxy.this.O000000o(true, z, "600000", "获取掩码成功", "", str, monitorStruct, null, PhoneNumberAuthHelperProxy.O0000O0o(PhoneNumberAuthHelperProxy.this), str2);
                        czp.a().b(new czp.a() { // from class: com.mobile.auth.gatewayauth.PhoneNumberAuthHelperProxy.18.1
                            @Override // tb.czp.a
                            protected void onException(Throwable th) {
                            }

                            @Override // tb.czp.a
                            protected void safeRun() {
                                try {
                                    onLoginPhoneListener.onGetLoginPhone(loginPhoneInfo);
                                } catch (Throwable th) {
                                    try {
                                        ExceptionProcessor.processException(th);
                                    } catch (Throwable th2) {
                                        ExceptionProcessor.processException(th2);
                                    }
                                }
                            }
                        });
                    } catch (Throwable th) {
                        try {
                            ExceptionProcessor.processException(th);
                        } catch (Throwable th2) {
                            ExceptionProcessor.processException(th2);
                        }
                    }
                }

                @Override // com.mobile.auth.gatewayauth.manager.RequestCallback
                public /* synthetic */ void onError(com.mobile.auth.gatewayauth.manager.base.O00000Oo o00000Oo) {
                    try {
                        O000000o(o00000Oo);
                    } catch (Throwable th) {
                        try {
                            ExceptionProcessor.processException(th);
                        } catch (Throwable th2) {
                            ExceptionProcessor.processException(th2);
                        }
                    }
                }

                @Override // com.mobile.auth.gatewayauth.manager.RequestCallback
                public /* synthetic */ void onSuccess(LoginPhoneInfo loginPhoneInfo) {
                    try {
                        O000000o(loginPhoneInfo);
                    } catch (Throwable th) {
                        try {
                            ExceptionProcessor.processException(th);
                        } catch (Throwable th2) {
                            ExceptionProcessor.processException(th2);
                        }
                    }
                }
            }, str2, O00000oo, 6);
            return str2;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    public PnsReporter getReporter() {
        try {
            return this.O0000O0o.O00000Oo();
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    public void getVerifyToken(final int i, final TokenResultListener tokenResultListener) {
        try {
            czp.a().a(new O0000O0o.O000000o(tokenResultListener) { // from class: com.mobile.auth.gatewayauth.PhoneNumberAuthHelperProxy.5
                @Override // com.mobile.auth.gatewayauth.utils.O0000O0o.O000000o
                protected void O000000o() {
                    try {
                        PhoneNumberAuthHelperProxy.O000000o(PhoneNumberAuthHelperProxy.this, i, PhoneNumberAuthHelperProxy.O0000O0o(PhoneNumberAuthHelperProxy.this), true, tokenResultListener);
                    } catch (Throwable th) {
                        try {
                            ExceptionProcessor.processException(th);
                        } catch (Throwable th2) {
                            ExceptionProcessor.processException(th2);
                        }
                    }
                }
            });
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public void prohibitUseUtdid() {
        try {
            if (this.O0000O0o == null) {
                return;
            }
            this.O0000O0o.O0000o0();
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public void setAuthListener(TokenResultListener tokenResultListener) {
        try {
            this.O00000Oo = tokenResultListener;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public void setAuthSDKInfo(String str) {
        try {
            this.O0000Oo.O000000o("setAuthSDKInfo secretInfo = ", str);
            this.O00000o0.O000000o(str);
            this.O00000oO.setLocalVendorSdkInfo(str);
            if (!this.O0000OOo.O000000o(this.O00000oO)) {
                this.O0000Oo.O00000o("VendorSdkFactor update local VendorConfig failed!");
                return;
            }
            com.mobile.auth.gatewayauth.utils.O00000Oo.O0000O0o(this.O00000o0.O00000oO());
            if (!O00000Oo(this.O00000o0.O00000oO()) || RequestState.getInstance().checkTokenValied(1) || RequestState.getInstance().isUseRequest() || RequestState.getInstance().checkTokenValied(1)) {
                return;
            }
            czp.a().a(new Runnable() { // from class: com.mobile.auth.gatewayauth.PhoneNumberAuthHelperProxy.3
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        PhoneNumberAuthHelperProxy.O000000o(PhoneNumberAuthHelperProxy.this, PhoneNumberAuthHelperProxy.O000000o(PhoneNumberAuthHelperProxy.this).O00000oO(), true);
                    } catch (Throwable th) {
                        try {
                            ExceptionProcessor.processException(th);
                        } catch (Throwable th2) {
                            ExceptionProcessor.processException(th2);
                        }
                    }
                }
            });
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }
}
