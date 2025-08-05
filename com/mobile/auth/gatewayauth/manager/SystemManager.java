package com.mobile.auth.gatewayauth.manager;

import android.content.Context;
import android.os.Debug;
import android.os.Looper;
import android.text.TextUtils;
import com.mobile.auth.O0Oo000;
import com.mobile.auth.O0o0;
import com.mobile.auth.OO000o0;
import com.mobile.auth.OO0oO;
import com.mobile.auth.gatewayauth.Constant;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import com.mobile.auth.gatewayauth.manager.base.Cache;
import com.mobile.auth.gatewayauth.manager.base.CacheKey;
import com.mobile.auth.gatewayauth.manager.compat.ResultCodeProcessor;
import com.mobile.auth.gatewayauth.model.TokenRet;
import com.mobile.auth.gatewayauth.utils.O0000Oo0;
import com.mobile.auth.gatewayauth.utils.security.CheckProxy;
import com.mobile.auth.gatewayauth.utils.security.CheckRoot;
import com.mobile.auth.gatewayauth.utils.security.EmulatorDetector;
import com.mobile.auth.gatewayauth.utils.security.PackageUtils;
import com.nirvana.tools.requestqueue.strategy.ThreadStrategy;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import tb.czn;
import tb.czp;
import tb.dax;
import tb.dba;

/* loaded from: classes4.dex */
public class SystemManager {
    private final Context O000000o;
    private String O00000Oo;
    private final OO0oO O00000o;
    private String O00000o0;
    private volatile boolean O00000oO = true;
    private Future<?> O00000oo;

    public SystemManager(final Context context, OO0oO oO0oO) {
        this.O000000o = context.getApplicationContext();
        this.O00000oo = czp.a().a(new Runnable() { // from class: com.mobile.auth.gatewayauth.manager.SystemManager.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    SystemManager.O000000o(SystemManager.this, PackageUtils.getPackageName(context));
                    SystemManager.O00000Oo(SystemManager.this, PackageUtils.getSign(context));
                } catch (Throwable th) {
                    try {
                        ExceptionProcessor.processException(th);
                    } catch (Throwable th2) {
                        ExceptionProcessor.processException(th2);
                    }
                }
            }
        });
        this.O00000o = oO0oO;
    }

    private TokenRet O000000o(ResultCodeProcessor resultCodeProcessor, String str) {
        try {
            if (!com.mobile.auth.gatewayauth.utils.O00000Oo.O00000oo(this.O000000o)) {
                return resultCodeProcessor.convertErrorInfo(Constant.CODE_ERROR_NO_SIM_FAIL, "SIM卡无法检测", str);
            }
            if (com.mobile.auth.gatewayauth.utils.O00000Oo.O00000oO(this.O000000o)) {
                return null;
            }
            return resultCodeProcessor.convertErrorInfo(Constant.CODE_ERROR_NO_MOBILE_NETWORK_FAIL, "移动网络未开启", str);
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

    static /* synthetic */ String O000000o(SystemManager systemManager, String str) {
        try {
            systemManager.O00000Oo = str;
            return str;
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

    static /* synthetic */ String O00000Oo(SystemManager systemManager, String str) {
        try {
            systemManager.O00000o0 = str;
            return str;
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

    private String requestCellularIp() {
        try {
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            final StringBuffer stringBuffer = new StringBuffer();
            dba.a().a(new O0o0(new dax<OO000o0>(ThreadStrategy.SAME_WITH_CALLABLE, 2000L) { // from class: com.mobile.auth.gatewayauth.manager.SystemManager.2
                public void O000000o(OO000o0 oO000o0) {
                    try {
                        if (oO000o0.O000000o() != null) {
                            stringBuffer.append(oO000o0.O000000o());
                        }
                        countDownLatch.countDown();
                    } catch (Throwable th) {
                        try {
                            ExceptionProcessor.processException(th);
                        } catch (Throwable th2) {
                            ExceptionProcessor.processException(th2);
                        }
                    }
                }

                @Override // tb.dax
                public /* synthetic */ void onResult(OO000o0 oO000o0) {
                    try {
                        O000000o(oO000o0);
                    } catch (Throwable th) {
                        try {
                            ExceptionProcessor.processException(th);
                        } catch (Throwable th2) {
                            ExceptionProcessor.processException(th2);
                        }
                    }
                }
            }, new O0Oo000(this.O000000o, this.O00000o)));
            try {
                countDownLatch.await(500L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                this.O00000o.O00000o("Get sim key failed, because change to 4G failed!", czp.a(e));
            }
            return stringBuffer.toString();
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

    public TokenRet O000000o(ResultCodeProcessor resultCodeProcessor, boolean z, String str) {
        try {
            TokenRet checkEnvSafe = checkEnvSafe(resultCodeProcessor, str);
            return (checkEnvSafe != null || !z) ? checkEnvSafe : O000000o(resultCodeProcessor, str);
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

    public synchronized String O000000o() {
        if (this.O00000oo != null) {
            try {
                try {
                    this.O00000oo.get();
                    this.O00000oo = null;
                } catch (ExecutionException e) {
                    e.printStackTrace();
                }
            } catch (InterruptedException e2) {
                e2.printStackTrace();
            }
        }
        return this.O00000Oo;
    }

    public void O000000o(String str) {
        try {
            if ((FeatureManager.getInstance().get("whiteFileCheck") != null && "false".equals(FeatureManager.getInstance().get("whiteFileCheck").toString())) || TextUtils.isEmpty(str)) {
                return;
            }
            InputStream inputStream = null;
            try {
                String a2 = czn.a(str);
                if (TextUtils.isEmpty(a2)) {
                    this.O00000oO = true;
                    return;
                }
                InputStream open = this.O000000o.getAssets().open(a2);
                this.O00000oO = false;
                if (open == null) {
                    return;
                }
                try {
                    open.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } catch (Exception unused) {
                this.O00000oO = true;
                if (0 == 0) {
                    return;
                }
                try {
                    inputStream.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
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

    /* JADX INFO: Access modifiers changed from: protected */
    public synchronized <T> boolean O000000o(String str, Cache<T> cache, long j) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (cache != null && cache.getKey() != null && cache.getKey().equals(str) && cache.getExpiredTime() - j > currentTimeMillis) {
                return true;
            }
            if (cache != null) {
                this.O00000o.O000000o("ExpiredTime:", String.valueOf(cache.getExpiredTime()), "|threshold:", String.valueOf(j), "|currTime:", String.valueOf(currentTimeMillis));
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

    public synchronized String O00000Oo() {
        if (this.O00000oo != null) {
            try {
                try {
                    this.O00000oo.get();
                    this.O00000oo = null;
                } catch (ExecutionException e) {
                    e.printStackTrace();
                }
            } catch (InterruptedException e2) {
                e2.printStackTrace();
            }
        }
        return this.O00000o0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x003c, code lost:
        if (r1 == 1) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003e, code lost:
        if (r1 == 2) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0040, code lost:
        return "unknown";
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0041, code lost:
        return com.mobile.auth.gatewayauth.Constant.CTCC;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0044, code lost:
        return com.mobile.auth.gatewayauth.Constant.CUCC;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String O00000Oo(java.lang.String r7) {
        /*
            r6 = this;
            java.lang.String r0 = "unknown"
            if (r7 != 0) goto L6
            return r0
        L6:
            r1 = -1
            int r2 = r7.hashCode()     // Catch: java.lang.Throwable -> L4a
            r3 = -1350608857(0xffffffffaf7f5827, float:-2.3223433E-10)
            r4 = 2
            r5 = 1
            if (r2 == r3) goto L31
            r3 = 95009260(0x5a9b9ec, float:1.596098E-35)
            if (r2 == r3) goto L27
            r3 = 880617272(0x347d2738, float:2.3576729E-7)
            if (r2 == r3) goto L1d
            goto L3a
        L1d:
            java.lang.String r2 = "cm_zyhl"
            boolean r7 = r7.equals(r2)     // Catch: java.lang.Throwable -> L4a
            if (r7 == 0) goto L3a
            r1 = 0
            goto L3a
        L27:
            java.lang.String r2 = "cu_xw"
            boolean r7 = r7.equals(r2)     // Catch: java.lang.Throwable -> L4a
            if (r7 == 0) goto L3a
            r1 = 1
            goto L3a
        L31:
            java.lang.String r2 = "ct_sjl"
            boolean r7 = r7.equals(r2)     // Catch: java.lang.Throwable -> L4a
            if (r7 == 0) goto L3a
            r1 = 2
        L3a:
            if (r1 == 0) goto L47
            if (r1 == r5) goto L44
            if (r1 == r4) goto L41
            return r0
        L41:
            java.lang.String r7 = "CTCC"
            return r7
        L44:
            java.lang.String r7 = "CUCC"
            return r7
        L47:
            java.lang.String r7 = "CMCC"
            return r7
        L4a:
            r7 = move-exception
            r0 = 0
            com.mobile.auth.gatewayauth.ExceptionProcessor.processException(r7)     // Catch: java.lang.Throwable -> L50
            return r0
        L50:
            r7 = move-exception
            com.mobile.auth.gatewayauth.ExceptionProcessor.processException(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mobile.auth.gatewayauth.manager.SystemManager.O00000Oo(java.lang.String):java.lang.String");
    }

    public String O00000o() {
        try {
            return com.mobile.auth.gatewayauth.utils.O00000Oo.O00000o0(this.O000000o);
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

    public String O00000o(String str) {
        try {
            return Constant.ACTION_SDK + O00000Oo(str).toLowerCase() + Constant.ACTION_SDK_PRE_AUTH_CODE;
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

    public String O00000o0() {
        try {
            return com.mobile.auth.gatewayauth.utils.O00000Oo.O00000Oo(this.O000000o);
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

    public String O00000o0(String str) {
        try {
            return Constant.ACTION_SDK + O00000Oo(str).toLowerCase() + Constant.ACTION_SDK_PRE_LOGIN_CODE;
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

    public Context O00000oO() {
        try {
            return this.O000000o;
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

    public String O00000oO(String str) {
        try {
            return Constant.ACTION_SDK + O00000Oo(str).toLowerCase() + Constant.ACTION_SDK_LOGIN_CODE;
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

    public String O00000oo(String str) {
        try {
            return Constant.ACTION_SDK + O00000Oo(str).toLowerCase() + Constant.ACTION_SDK_LOGIN_TOKEN;
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

    public String O0000O0o(String str) {
        try {
            return Constant.ACTION_SDK + O00000Oo(str).toLowerCase() + Constant.ACTION_SDK_AUTH_TOKEN;
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

    public TokenRet checkEnvSafe(ResultCodeProcessor resultCodeProcessor, String str) {
        try {
            try {
                boolean z = this.O00000oO;
                String isDeviceRooted = CheckRoot.isDeviceRooted();
                if (!TextUtils.isEmpty(isDeviceRooted)) {
                    return resultCodeProcessor.convertErrorInfo(Constant.CODE_ERROR_PHONE_UNSAFE_FAIL, "手机终端不安全:the phone is root, " + isDeviceRooted, str);
                } else if (Thread.currentThread() == Looper.getMainLooper().getThread() && EmulatorDetector.isEmulator(this.O000000o)) {
                    return resultCodeProcessor.convertErrorInfo(Constant.CODE_ERROR_PHONE_UNSAFE_FAIL, "手机终端不安全:Emulator is detected, please use real phone!", str);
                } else {
                    if (CheckProxy.isDevicedProxy(this.O000000o)) {
                        return resultCodeProcessor.convertErrorInfo(Constant.CODE_ERROR_PHONE_UNSAFE_FAIL, "手机终端不安全:the phone is proxy, please do not proxy!", str);
                    }
                    if (Debug.isDebuggerConnected() && !O0000Oo0.O000000o()) {
                        return resultCodeProcessor.convertErrorInfo(Constant.CODE_ERROR_PHONE_UNSAFE_FAIL, "手机终端不安全:the app is debuggerConnected, please do not debug!", str);
                    }
                    return null;
                }
            } catch (Exception e) {
                return resultCodeProcessor.convertErrorInfo(Constant.CODE_ERROR_PHONE_UNSAFE_FAIL, "无法判运营商: " + e.getMessage(), str);
            }
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

    /* JADX INFO: Access modifiers changed from: protected */
    public synchronized String decryptContent(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                str = czn.b(str, O000000o() + O00000Oo());
            }
        } catch (Exception e) {
            this.O00000o.O00000o("Decrypt content failed !", czp.a(e), "|content:", str);
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public synchronized String encryptContent(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                str = czn.a(str, O000000o() + O00000Oo());
            }
        } catch (Exception e) {
            this.O00000o.O00000o("Encrypt content failed!", czp.a(e));
        }
        return str;
    }

    public CacheKey getSimCacheKey(boolean z, String str) {
        if (!z) {
            try {
                if (FeatureManager.getInstance().get(FeatureManager.FEATURE_KEY_CACHE_LEVEL_VENDOR) == null) {
                    String O000000o = com.mobile.auth.gatewayauth.utils.O00000o.O000000o(this.O000000o);
                    if (!TextUtils.isEmpty(O000000o)) {
                        return CacheKey.newSimKey().O000000o(O000000o).O000000o(false).O000000o();
                    }
                    String O000000o2 = com.mobile.auth.gatewayauth.utils.O00000Oo.O000000o(this.O000000o, false);
                    if ("wifi".equals(O000000o2)) {
                        return CacheKey.newSimKey().O000000o(true).O000000o();
                    }
                    if (!"wifi+mobile".equals(O000000o2)) {
                        return CacheKey.newSimKey().O000000o(true).O000000o(com.mobile.auth.gatewayauth.utils.O00000Oo.O00000Oo()).O000000o();
                    }
                    CacheKey O000000o3 = CacheKey.newSimKey().O000000o(requestCellularIp()).O000000o(true).O000000o();
                    this.O00000o.O000000o("SimKey:", O000000o3.toString());
                    return O000000o3;
                }
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
        return getVendorCacheKey(str);
    }

    public CacheKey getVendorCacheKey(String str) {
        try {
            return CacheKey.newSimKey().O000000o(str).O000000o(false).O000000o();
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
}
