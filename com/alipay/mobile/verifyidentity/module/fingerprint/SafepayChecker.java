package com.alipay.mobile.verifyidentity.module.fingerprint;

import android.content.Context;
import com.alipay.android.app.smartpays.api.FingerprintManager;
import com.alipay.android.app.smartpays.api.SmartPayManager;
import com.alipay.android.app.smartpays.api.model.FingerprintResult;
import com.alipay.android.phone.seauthenticator.iotauth.authmanager.GlobalAuthenticatorManager;
import com.alipay.mobile.verifyidentity.common.Constants;
import com.alipay.mobile.verifyidentity.log.BehaviourIdEnum;
import com.alipay.mobile.verifyidentity.log.VerifyBehavorLogger;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.module.fingerprint.proxy.ApiFingerprintManagerProxy;
import com.alipay.mobile.verifyidentity.module.fingerprint.proxy.ApiSmartPayManagerProxy;
import com.alipay.mobile.verifyidentity.module.fingerprint.proxy.GlobalAuthenticatorManagerProxy;
import com.alipay.mobile.verifyidentity.utils.CommonConstant;
import com.alipay.mobile.verifyidentity.utils.ReportHelper;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public class SafepayChecker {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CREATE_COMMAND_TYPE = 1;
    public static final int TYPE_CHECK = 3;
    public static final int USER_STATUS_NORMAL = 2;
    public static final int VERSION = 2;

    /* renamed from: a  reason: collision with root package name */
    private static final String f5901a = "SafepayChecker";
    private FingerprintManager b;

    public static /* synthetic */ FingerprintManager access$000(SafepayChecker safepayChecker) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FingerprintManager) ipChange.ipc$dispatch("308d01d3", new Object[]{safepayChecker}) : safepayChecker.b;
    }

    public static /* synthetic */ FingerprintManager access$002(SafepayChecker safepayChecker, FingerprintManager fingerprintManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FingerprintManager) ipChange.ipc$dispatch("1686af74", new Object[]{safepayChecker, fingerprintManager});
        }
        safepayChecker.b = fingerprintManager;
        return fingerprintManager;
    }

    public static /* synthetic */ String access$100() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6c2478e8", new Object[0]) : f5901a;
    }

    private static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put(CommonConstant.EXCEPTION_TYPE, str);
            hashMap.put(CommonConstant.EXCEPTION_INFO, str2);
            VerifyBehavorLogger.logBehavor(BehaviourIdEnum.EVENT, CommonConstant.EXCEPTION_CASE_ID, Constants.VI_ENGINE_APPID, CommonConstant.EXCEPTION_BIZ, null, null, null, hashMap);
        } catch (Throwable th) {
            VerifyLogCat.w(f5901a, "logBehavior Exception", th);
        }
    }

    public FingerprintManager getFingerprintManager(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FingerprintManager) ipChange.ipc$dispatch("741ccab5", new Object[]{this, context});
        }
        if (this.b == null) {
            this.b = new FingerprintManager(context);
        }
        return this.b;
    }

    public int init(final Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b35ae305", new Object[]{this, context, new Integer(i)})).intValue();
        }
        this.b = new FingerprintManager(context);
        int i2 = 126;
        Object resultEvenTimeout = getResultEvenTimeout(new FutureTask(new Callable<Object>() { // from class: com.alipay.mobile.verifyidentity.module.fingerprint.SafepayChecker.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.concurrent.Callable
            public Object call() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ipChange2.ipc$dispatch("6d249ded", new Object[]{this});
                }
                try {
                    if (SafepayChecker.access$000(SafepayChecker.this) == null) {
                        SafepayChecker.access$002(SafepayChecker.this, new FingerprintManager(context));
                    }
                    FingerprintResult initHardwarePay = new ApiFingerprintManagerProxy(SafepayChecker.access$000(SafepayChecker.this)).initHardwarePay("");
                    String access$100 = SafepayChecker.access$100();
                    VerifyLogCat.d(access$100, "FingerprintChecker init:" + initHardwarePay);
                    return Integer.valueOf(initHardwarePay.mResult);
                } catch (Throwable unused) {
                    VerifyLogCat.d(SafepayChecker.access$100(), "init got exception!");
                    return 126;
                }
            }
        }));
        if (resultEvenTimeout != null) {
            i2 = Integer.valueOf(String.valueOf(resultEvenTimeout)).intValue();
        } else {
            a("bio_fp", "fp_init_timeout");
        }
        String str = f5901a;
        VerifyLogCat.i(str, "init by getResultEvenTimeout: " + i2);
        return i2;
    }

    public String getInterNalFpData(final Context context) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2da8a2e6", new Object[]{this, context});
        }
        Object resultEvenTimeout = getResultEvenTimeout(new FutureTask(new Callable<Object>() { // from class: com.alipay.mobile.verifyidentity.module.fingerprint.SafepayChecker.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.concurrent.Callable
            public Object call() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ipChange2.ipc$dispatch("6d249ded", new Object[]{this});
                }
                try {
                    long currentTimeMillis = System.currentTimeMillis();
                    String secData = new GlobalAuthenticatorManagerProxy(GlobalAuthenticatorManager.getInstance(context)).getSecData();
                    long currentTimeMillis2 = System.currentTimeMillis();
                    String access$100 = SafepayChecker.access$100();
                    VerifyLogCat.d(access$100, "VI getPayAuthData cost [" + (currentTimeMillis2 - currentTimeMillis) + "]ms!");
                    return secData;
                } catch (Throwable th) {
                    VerifyLogCat.w(SafepayChecker.access$100(), "getPayAuthData got exception!", th);
                    return "";
                }
            }
        }));
        if (resultEvenTimeout != null) {
            str = String.valueOf(resultEvenTimeout);
        } else {
            a("bio_fp", "fp_getdata_timeout");
            str = "";
        }
        String str2 = f5901a;
        VerifyLogCat.i(str2, "getPayAuthData by getResultEvenTimeout: " + str);
        return str;
    }

    public String getFpSecdata(final Context context, final boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cb867d32", new Object[]{this, context, new Boolean(z)});
        }
        Object resultEvenTimeout = getResultEvenTimeout(new FutureTask(new Callable<Object>() { // from class: com.alipay.mobile.verifyidentity.module.fingerprint.SafepayChecker.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.concurrent.Callable
            public Object call() {
                String fastPayAuthDataWithNoLog;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ipChange2.ipc$dispatch("6d249ded", new Object[]{this});
                }
                try {
                    long currentTimeMillis = System.currentTimeMillis();
                    SmartPayManager smartPayManager = new SmartPayManager(context);
                    if (z) {
                        fastPayAuthDataWithNoLog = new ApiSmartPayManagerProxy(smartPayManager, "UC-MobileIC-SafepayChecker.getFpSecdata-SmartPayManager.getRegAuthData").getRegAuthData(1, 0, null);
                    } else if ("Y".equalsIgnoreCase(ReportHelper.getReportFlag(context, ReportHelper.secdataOriIF))) {
                        VerifyLogCat.i(SafepayChecker.access$100(), "服务端指定secData用原来的接口获取");
                        fastPayAuthDataWithNoLog = new ApiSmartPayManagerProxy(smartPayManager, "UC-MobileIC-SafepayChecker.getFpSecdata-SmartPayManager.getFastPayAuthData").getFastPayAuthData(null);
                    } else {
                        VerifyLogCat.i(SafepayChecker.access$100(), "使用不带埋点日志的secData获取接口");
                        fastPayAuthDataWithNoLog = new ApiSmartPayManagerProxy(smartPayManager, "UC-MobileIC-SafepayChecker.getFpSecdata-SmartPayManager.getFastPayAuthDataWithNoLog").getFastPayAuthDataWithNoLog(null);
                    }
                    long currentTimeMillis2 = System.currentTimeMillis();
                    String access$100 = SafepayChecker.access$100();
                    VerifyLogCat.d(access$100, "VI getPayAuthData cost [" + (currentTimeMillis2 - currentTimeMillis) + "]ms!");
                    return fastPayAuthDataWithNoLog;
                } catch (Throwable th) {
                    VerifyLogCat.w(SafepayChecker.access$100(), "getPayAuthData got exception!", th);
                    return "";
                }
            }
        }));
        if (resultEvenTimeout != null) {
            str = String.valueOf(resultEvenTimeout);
        } else {
            a("bio_fp", "fp_getdata_timeout");
            str = "";
        }
        String str2 = f5901a;
        VerifyLogCat.i(str2, "getPayAuthData by getResultEvenTimeout: " + str);
        return str;
    }

    public boolean isFingerprintAvailable(final Context context, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("240fa055", new Object[]{this, context, new Integer(i)})).booleanValue();
        }
        Object resultEvenTimeout = getResultEvenTimeout(new FutureTask(new Callable<Object>() { // from class: com.alipay.mobile.verifyidentity.module.fingerprint.SafepayChecker.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.concurrent.Callable
            public Object call() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ipChange2.ipc$dispatch("6d249ded", new Object[]{this});
                }
                int init = SafepayChecker.this.init(context, i);
                if (init != 111 && init != 105 && init != 106 && init != 126) {
                    return true;
                }
                VerifyLogCat.i(SafepayChecker.access$100(), "fingerprint is disabled on this device!");
                return false;
            }
        }));
        if (resultEvenTimeout == null) {
            a("bio_fp", "fp_getavailable_timeout");
        }
        boolean booleanValue = Boolean.valueOf(String.valueOf(resultEvenTimeout)).booleanValue();
        String str = f5901a;
        VerifyLogCat.i(str, "isFingerprintAvailable by getResultEvenTimeout: " + booleanValue);
        return booleanValue;
    }

    public int checkUserStatus(final String str) {
        IpChange ipChange = $ipChange;
        int i = 2;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e76e2389", new Object[]{this, str})).intValue();
        }
        Object resultEvenTimeout = getResultEvenTimeout(new FutureTask(new Callable<Object>() { // from class: com.alipay.mobile.verifyidentity.module.fingerprint.SafepayChecker.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.concurrent.Callable
            public Object call() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ipChange2.ipc$dispatch("6d249ded", new Object[]{this});
                }
                if (SafepayChecker.access$000(SafepayChecker.this) != null) {
                    try {
                        return Integer.valueOf(new ApiFingerprintManagerProxy(SafepayChecker.access$000(SafepayChecker.this)).checkUserStatus(str));
                    } catch (Throwable unused) {
                        VerifyLogCat.d(SafepayChecker.access$100(), "checkUserStatus got exception!");
                    }
                }
                return 2;
            }
        }));
        if (resultEvenTimeout != null) {
            i = Integer.valueOf(String.valueOf(resultEvenTimeout)).intValue();
        } else {
            a("bio_fp", "fp_checkstatus_timeout");
        }
        String str2 = f5901a;
        VerifyLogCat.i(str2, "checkUserStatus by getResultEvenTimeout: " + i);
        return i;
    }

    public static Object getResultEvenTimeout(FutureTask<Object> futureTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("1472444c", new Object[]{futureTask});
        }
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.alipay.mobile.verifyidentity.module.fingerprint.SafepayChecker.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            private final AtomicInteger f5902a = new AtomicInteger(0);

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Thread) ipChange2.ipc$dispatch("d8079a58", new Object[]{this, runnable});
                }
                return new Thread(runnable, "SafepayChecker_" + this.f5902a.incrementAndGet());
            }
        });
        try {
            threadPoolExecutor.execute(futureTask);
            VerifyLogCat.w(f5901a, "getResultEvenTimeout executed");
            return futureTask.get(2000L, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            try {
                futureTask.cancel(true);
                VerifyLogCat.w(f5901a, "getResultEvenTimeout Exception", th);
                threadPoolExecutor.shutdown();
                return null;
            } finally {
                threadPoolExecutor.shutdown();
            }
        }
    }
}
