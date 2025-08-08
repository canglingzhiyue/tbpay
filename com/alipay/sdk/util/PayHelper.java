package com.alipay.sdk.util;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import android.util.Pair;
import com.alipay.android.app.IAlixPay;
import com.alipay.android.app.IRemoteServiceCallback;
import com.alipay.android.msp.ui.views.MspBaseActivity;
import com.alipay.sdk.app.statistic.StatisticManager;
import com.alipay.sdk.app.statistic.StatisticRecord;
import com.alipay.sdk.data.DynamicConfig;
import com.alipay.sdk.sys.BizContext;
import com.alipay.sdk.util.Utils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class PayHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BIND_FAILED = "failed";
    public static final String SCHEME_FAILED = "scheme_failed";

    /* renamed from: a  reason: collision with root package name */
    private Activity f6171a;
    private volatile IAlixPay b;
    private boolean d;
    private IAlipayBindListener e;
    private final BizContext f;
    private final Object c = IAlixPay.class;
    private String g = null;

    /* loaded from: classes3.dex */
    public interface IAlipayBindListener {
        void onBinded();

        void onStartActivity();
    }

    public static /* synthetic */ IAlixPay a(PayHelper payHelper, IAlixPay iAlixPay) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IAlixPay) ipChange.ipc$dispatch("bb0dacba", new Object[]{payHelper, iAlixPay});
        }
        payHelper.b = iAlixPay;
        return iAlixPay;
    }

    public static /* synthetic */ BizContext a(PayHelper payHelper) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BizContext) ipChange.ipc$dispatch("55d44b8b", new Object[]{payHelper}) : payHelper.f;
    }

    public static /* synthetic */ String a(PayHelper payHelper, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2c9be0f2", new Object[]{payHelper, str});
        }
        payHelper.g = str;
        return str;
    }

    public static /* synthetic */ Activity b(PayHelper payHelper) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("f75fdd85", new Object[]{payHelper}) : payHelper.f6171a;
    }

    public static /* synthetic */ Object c(PayHelper payHelper) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("4157c210", new Object[]{payHelper}) : payHelper.c;
    }

    public static /* synthetic */ IAlipayBindListener d(PayHelper payHelper) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IAlipayBindListener) ipChange.ipc$dispatch("1de6e07d", new Object[]{payHelper}) : payHelper.e;
    }

    public PayHelper(Activity activity, BizContext bizContext, IAlipayBindListener iAlipayBindListener) {
        this.f6171a = activity;
        this.f = bizContext;
        this.e = iAlipayBindListener;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0068 A[Catch: Throwable -> 0x0073, TryCatch #0 {Throwable -> 0x0073, blocks: (B:10:0x002b, B:12:0x0033, B:15:0x003a, B:17:0x0042, B:19:0x004a, B:21:0x004e, B:24:0x005b, B:26:0x0064, B:28:0x0068, B:25:0x0060, B:29:0x006b), top: B:38:0x002b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String pay4Client(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.String r0 = "biz"
            com.android.alibaba.ip.runtime.IpChange r1 = com.alipay.sdk.util.PayHelper.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L1a
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2 = 0
            r0[r2] = r7
            r2 = 1
            r0[r2] = r8
            java.lang.String r8 = "7991fad8"
            java.lang.Object r8 = r1.ipc$dispatch(r8, r0)
            java.lang.String r8 = (java.lang.String) r8
            return r8
        L1a:
            java.lang.String r1 = ""
            r2 = 0
            java.util.List<com.alipay.sdk.data.DynamicConfig$LaunchAppSwitchItem> r3 = com.alipay.sdk.app.RegionUtils.defaultItems     // Catch: java.lang.Throwable -> L75
            com.alipay.sdk.sys.BizContext r4 = r7.f     // Catch: java.lang.Throwable -> L75
            android.app.Activity r5 = r7.f6171a     // Catch: java.lang.Throwable -> L75
            com.alipay.sdk.util.Utils$ExpectedPkg r3 = com.alipay.sdk.util.Utils.getExpectedPkg(r4, r5, r3)     // Catch: java.lang.Throwable -> L75
            java.lang.String r4 = "failed"
            if (r3 == 0) goto L6b
            com.alipay.sdk.sys.BizContext r5 = r7.f     // Catch: java.lang.Throwable -> L73
            boolean r5 = r3.isSignIllegal(r5)     // Catch: java.lang.Throwable -> L73
            if (r5 != 0) goto L6b
            boolean r5 = r3.isVersionIllegal()     // Catch: java.lang.Throwable -> L73
            if (r5 == 0) goto L3a
            goto L6b
        L3a:
            android.content.pm.PackageInfo r5 = r3.pkgInfo     // Catch: java.lang.Throwable -> L73
            boolean r5 = com.alipay.sdk.util.Utils.a(r5)     // Catch: java.lang.Throwable -> L73
            if (r5 == 0) goto L4a
            com.alipay.sdk.sys.BizContext r5 = r7.f     // Catch: java.lang.Throwable -> L73
            java.lang.String r6 = "PkgExcludeVersion"
            com.alipay.sdk.app.statistic.StatisticManager.putAction(r5, r0, r6)     // Catch: java.lang.Throwable -> L73
            return r4
        L4a:
            android.content.pm.PackageInfo r4 = r3.pkgInfo     // Catch: java.lang.Throwable -> L73
            if (r4 == 0) goto L60
            java.lang.String r4 = "com.eg.android.AlipayGphone"
            android.content.pm.PackageInfo r5 = r3.pkgInfo     // Catch: java.lang.Throwable -> L73
            java.lang.String r5 = r5.packageName     // Catch: java.lang.Throwable -> L73
            boolean r4 = r4.equals(r5)     // Catch: java.lang.Throwable -> L73
            if (r4 == 0) goto L5b
            goto L60
        L5b:
            android.content.pm.PackageInfo r4 = r3.pkgInfo     // Catch: java.lang.Throwable -> L73
            java.lang.String r1 = r4.packageName     // Catch: java.lang.Throwable -> L73
            goto L64
        L60:
            java.lang.String r1 = com.alipay.sdk.util.Utils.a()     // Catch: java.lang.Throwable -> L73
        L64:
            android.content.pm.PackageInfo r4 = r3.pkgInfo     // Catch: java.lang.Throwable -> L73
            if (r4 == 0) goto L7e
            android.content.pm.PackageInfo r2 = r3.pkgInfo     // Catch: java.lang.Throwable -> L73
            goto L7e
        L6b:
            com.alipay.sdk.sys.BizContext r5 = r7.f     // Catch: java.lang.Throwable -> L73
            java.lang.String r6 = "PkgIllegal"
            com.alipay.sdk.app.statistic.StatisticManager.putAction(r5, r0, r6)     // Catch: java.lang.Throwable -> L73
            return r4
        L73:
            r4 = move-exception
            goto L77
        L75:
            r4 = move-exception
            r3 = r2
        L77:
            com.alipay.sdk.sys.BizContext r5 = r7.f
            java.lang.String r6 = "CheckClientSignEx"
            com.alipay.sdk.app.statistic.StatisticManager.putError(r5, r0, r6, r4)
        L7e:
            java.lang.String r8 = r7.a(r8, r1, r2, r3)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.util.PayHelper.pay4Client(java.lang.String):java.lang.String");
    }

    private String a(String str, String str2, PackageInfo packageInfo, Utils.ExpectedPkg expectedPkg) {
        Activity activity;
        PackageInfo packageInfo2;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e97137d2", new Object[]{this, str, str2, packageInfo, expectedPkg});
        }
        if (packageInfo != null) {
            i = packageInfo.versionCode;
        }
        String str3 = "";
        String str4 = packageInfo != null ? packageInfo.versionName : str3;
        LogUtils.i("mspl", "pay bind or scheme");
        BizContext bizContext = this.f;
        StatisticManager.putAction(bizContext, "biz", StatisticRecord.EC_PROGRESS_WALLET_VERSION, str2 + "|" + str4);
        try {
            if (DynamicConfig.isFalse("skip_trans") && expectedPkg != null && (packageInfo2 = expectedPkg.pkgInfo) != null) {
                String str5 = packageInfo2.packageName;
                Intent intent = new Intent();
                intent.setClassName(str5, "com.alipay.android.app.TransProcessPayActivity");
                this.f6171a.startActivity(intent);
                Thread.sleep(200L);
            }
        } catch (Throwable unused) {
        }
        Pair<String, Boolean> a2 = a(str, str2, this.f);
        String str6 = (String) a2.first;
        try {
            if ("failed".equals(str6) && ((Boolean) a2.second).booleanValue() && DynamicConfig.isFalse("degrade_retry_bnd_once")) {
                StatisticManager.putAction(this.f, "biz", "BindRetry");
                str6 = (String) a(str, str2, this.f).first;
            }
        } catch (Throwable th) {
            StatisticManager.putError(this.f, "biz", "BindRetryEx", th);
        }
        LogUtils.i("mspl", "pay bind result: ".concat(String.valueOf(str6)));
        if ("failed".equals(str6) && DynamicConfig.isFalse("degrade_standard_pay_start_activity")) {
            if (!"com.eg.android.AlipayGphone".equals(str2)) {
                BizContext bizContext2 = this.f;
                StatisticManager.putAction(bizContext2, "biz", "BSPNotStartByAlipay", str2 + "|" + i);
                return str6;
            } else if (i >= 460 && (activity = this.f6171a) != null && a(str2, activity, this.f)) {
                if (packageInfo != null) {
                    str3 = packageInfo.versionName;
                }
                LogUtils.i("mspl", "pay payInvokeAct");
                BizContext bizContext3 = this.f;
                StatisticManager.putAction(bizContext3, "biz", StatisticRecord.EC_PROGRESS_WALLET_VERSION, str2 + "|" + str3 + "|payInvokeAct");
                return a(str, str2);
            }
        }
        return str6;
    }

    private Pair<String, Boolean> a(String str, String str2, BizContext bizContext) {
        int i;
        AlipayServiceCallback alipayServiceCallback;
        Activity activity;
        Activity activity2;
        String Pay;
        Activity activity3;
        Activity activity4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("e890945", new Object[]{this, str, str2, bizContext});
        }
        Intent intent = new Intent();
        intent.setPackage(str2);
        intent.setAction(Utils.a(str2));
        long elapsedRealtime = SystemClock.elapsedRealtime();
        StringBuilder sb = new StringBuilder();
        sb.append(elapsedRealtime);
        sb.append("|");
        sb.append(str != null ? str.length() : 0);
        StatisticManager.putAction(bizContext, "biz", StatisticRecord.EC_PROGRESS_BIND_STARTING, sb.toString());
        try {
            if (DynamicConfig.isFalse("degrade_start_srv_first")) {
                ComponentName startService = this.f6171a.getApplication().startService(intent);
                StatisticManager.putAction(bizContext, "biz", "stSrv", startService != null ? startService.getPackageName() : "null");
            } else {
                StatisticManager.putAction(bizContext, "biz", "stSrv", "skipped");
            }
            if (DynamicConfig.isFalse("degrade_bind_use_imp")) {
                i = 65;
                StatisticManager.putAction(bizContext, "biz", "bindFlg", "imp");
            } else {
                i = 1;
            }
            AlipayServiceConnection alipayServiceConnection = new AlipayServiceConnection();
            if (!this.f6171a.getApplicationContext().bindService(intent, alipayServiceConnection, i)) {
                throw new Throwable("bindService fail");
            }
            synchronized (this.c) {
                if (this.b == null) {
                    try {
                        this.c.wait(15000L);
                    } catch (InterruptedException e) {
                        StatisticManager.putError(bizContext, "biz", StatisticRecord.EC_BIND_WAIT_TIMEOUT_EX, e);
                    }
                }
            }
            IAlixPay iAlixPay = this.b;
            try {
                if (iAlixPay == null) {
                    StatisticManager.putError(bizContext, "biz", StatisticRecord.EC_BIND_TIMEOUT);
                    Pair<String, Boolean> pair = new Pair<>("failed", Boolean.TRUE);
                    try {
                        this.f6171a.getApplicationContext().unbindService(alipayServiceConnection);
                    } catch (Throwable th) {
                        LogUtils.printExceptionStackTrace(th);
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(SystemClock.elapsedRealtime());
                    StatisticManager.putAction(bizContext, "biz", StatisticRecord.EC_PROGRESS_BIND_ENDED, sb2.toString());
                    this.b = null;
                    if (this.d && (activity4 = this.f6171a) != null) {
                        activity4.setRequestedOrientation(0);
                        this.d = false;
                    }
                    return pair;
                }
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                StatisticManager.putAction(bizContext, "biz", StatisticRecord.EC_PROGRESS_BINDED, String.valueOf(elapsedRealtime2));
                if (this.e != null) {
                    this.e.onBinded();
                }
                if (this.f6171a.getRequestedOrientation() == 0) {
                    this.f6171a.setRequestedOrientation(1);
                    this.d = true;
                }
                int version = iAlixPay.getVersion();
                alipayServiceCallback = new AlipayServiceCallback();
                try {
                    if (version >= 3) {
                        iAlixPay.registerCallback03(alipayServiceCallback, str, null);
                    } else {
                        iAlixPay.registerCallback(alipayServiceCallback);
                    }
                    long elapsedRealtime3 = SystemClock.elapsedRealtime();
                    StatisticManager.putAction(bizContext, "biz", StatisticRecord.EC_PROGRESS_BIND_PAY, String.valueOf(elapsedRealtime3));
                    if (version >= 3) {
                        iAlixPay.r03("biz", "bind_pay", null);
                    }
                    if (version >= 2) {
                        HashMap<String, String> generateApInfo = BizContext.generateApInfo(bizContext);
                        generateApInfo.put("ts_bind", String.valueOf(elapsedRealtime));
                        generateApInfo.put("ts_bend", String.valueOf(elapsedRealtime2));
                        generateApInfo.put("ts_pay", String.valueOf(elapsedRealtime3));
                        Pay = iAlixPay.pay02(str, generateApInfo);
                    } else {
                        Pay = iAlixPay.Pay(str);
                    }
                    String str3 = Pay;
                    try {
                        iAlixPay.unregisterCallback(alipayServiceCallback);
                    } catch (Throwable th2) {
                        LogUtils.printExceptionStackTrace(th2);
                    }
                    try {
                        this.f6171a.getApplicationContext().unbindService(alipayServiceConnection);
                    } catch (Throwable th3) {
                        LogUtils.printExceptionStackTrace(th3);
                    }
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(SystemClock.elapsedRealtime());
                    StatisticManager.putAction(bizContext, "biz", StatisticRecord.EC_PROGRESS_BIND_ENDED, sb3.toString());
                    this.b = null;
                    if (this.d && (activity3 = this.f6171a) != null) {
                        activity3.setRequestedOrientation(0);
                        this.d = false;
                    }
                    return new Pair<>(str3, Boolean.FALSE);
                } catch (Throwable th4) {
                    th = th4;
                    try {
                        StatisticManager.putError(bizContext, "biz", StatisticRecord.EC_BIND_FAILED, th);
                        Pair<String, Boolean> pair2 = new Pair<>("failed", Boolean.TRUE);
                        if (alipayServiceCallback != null) {
                            try {
                                iAlixPay.unregisterCallback(alipayServiceCallback);
                            } catch (Throwable th5) {
                                LogUtils.printExceptionStackTrace(th5);
                            }
                        }
                        try {
                            this.f6171a.getApplicationContext().unbindService(alipayServiceConnection);
                        } catch (Throwable th6) {
                            LogUtils.printExceptionStackTrace(th6);
                        }
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(SystemClock.elapsedRealtime());
                        StatisticManager.putAction(bizContext, "biz", StatisticRecord.EC_PROGRESS_BIND_ENDED, sb4.toString());
                        this.b = null;
                        if (this.d && (activity2 = this.f6171a) != null) {
                            activity2.setRequestedOrientation(0);
                            this.d = false;
                        }
                        return pair2;
                    } catch (Throwable th7) {
                        if (alipayServiceCallback != null) {
                            try {
                                iAlixPay.unregisterCallback(alipayServiceCallback);
                            } catch (Throwable th8) {
                                LogUtils.printExceptionStackTrace(th8);
                            }
                        }
                        try {
                            this.f6171a.getApplicationContext().unbindService(alipayServiceConnection);
                        } catch (Throwable th9) {
                            LogUtils.printExceptionStackTrace(th9);
                        }
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(SystemClock.elapsedRealtime());
                        StatisticManager.putAction(bizContext, "biz", StatisticRecord.EC_PROGRESS_BIND_ENDED, sb5.toString());
                        this.b = null;
                        if (this.d && (activity = this.f6171a) != null) {
                            activity.setRequestedOrientation(0);
                            this.d = false;
                        }
                        throw th7;
                    }
                }
            } catch (Throwable th10) {
                th = th10;
                alipayServiceCallback = null;
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:34:0x010a
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:82)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:48)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    private java.lang.String a(java.lang.String r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.util.PayHelper.a(java.lang.String, java.lang.String):java.lang.String");
    }

    public void clearContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a713a29", new Object[]{this});
            return;
        }
        this.f6171a = null;
        this.e = null;
    }

    /* loaded from: classes3.dex */
    public class AlipayServiceConnection implements ServiceConnection {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private AlipayServiceConnection() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ef237", new Object[]{this, componentName});
                return;
            }
            StatisticManager.putAction(PayHelper.a(PayHelper.this), "biz", "srvDis");
            PayHelper.a(PayHelper.this, (IAlixPay) null);
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1495fa3c", new Object[]{this, componentName, iBinder});
                return;
            }
            StatisticManager.putAction(PayHelper.a(PayHelper.this), "biz", "srvCon");
            synchronized (PayHelper.c(PayHelper.this)) {
                PayHelper.a(PayHelper.this, IAlixPay.Stub.asInterface(iBinder));
                PayHelper.c(PayHelper.this).notify();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class AlipayServiceCallback extends IRemoteServiceCallback.Stub {
        @Override // com.alipay.android.app.IRemoteServiceCallback
        public int getVersion() throws RemoteException {
            return 3;
        }

        @Override // com.alipay.android.app.IRemoteServiceCallback
        public boolean isHideLoadingScreen() throws RemoteException {
            return false;
        }

        @Override // com.alipay.android.app.IRemoteServiceCallback
        public void payEnd(boolean z, String str) throws RemoteException {
        }

        private AlipayServiceCallback() {
        }

        @Override // com.alipay.android.app.IRemoteServiceCallback
        public void r03(String str, String str2, Map map) throws RemoteException {
            StatisticManager.putAction(PayHelper.a(PayHelper.this), StatisticRecord.ET_WLT, str, str2);
            if (!StringUtils.equals(str2, "ActivityStartSuccess") || PayHelper.d(PayHelper.this) == null) {
                return;
            }
            PayHelper.d(PayHelper.this).onStartActivity();
        }

        @Override // com.alipay.android.app.IRemoteServiceCallback
        public void startActivity(String str, String str2, int i, Bundle bundle) throws RemoteException {
            Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
            if (bundle == null) {
                bundle = new Bundle();
            }
            try {
                bundle.putInt(MspBaseActivity.KEY_ID, i);
                intent.putExtras(bundle);
            } catch (Exception e) {
                StatisticManager.putError(PayHelper.a(PayHelper.this), "biz", StatisticRecord.EC_PROGRESS_ERR_INTENT_EX, e);
            }
            intent.setClassName(str, str2);
            try {
                if (Build.VERSION.SDK_INT >= 16) {
                    ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                    ActivityManager.getMyMemoryState(runningAppProcessInfo);
                    BizContext a2 = PayHelper.a(PayHelper.this);
                    StatisticManager.putAction(a2, "biz", "isFg", runningAppProcessInfo.processName + "|" + runningAppProcessInfo.importance + "|");
                }
            } catch (Throwable unused) {
            }
            try {
                if (PayHelper.b(PayHelper.this) != null) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    PayHelper.b(PayHelper.this).startActivity(intent);
                    BizContext a3 = PayHelper.a(PayHelper.this);
                    StringBuilder sb = new StringBuilder();
                    sb.append(SystemClock.elapsedRealtime() - elapsedRealtime);
                    StatisticManager.putAction(a3, "biz", "stAct2", sb.toString());
                    return;
                }
                StatisticManager.putError(PayHelper.a(PayHelper.this), "biz", StatisticRecord.EC_PROGRESS_ERR_ACTIVITY_NULL);
                Context appContext = PayHelper.a(PayHelper.this).getAppContext();
                if (appContext == null) {
                    return;
                }
                appContext.startActivity(intent);
            } catch (Throwable th) {
                StatisticManager.putError(PayHelper.a(PayHelper.this), "biz", StatisticRecord.EC_PROGRESS_ERR_ACTIVITY_EX, th);
                throw th;
            }
        }
    }

    private static boolean a(String str, Context context, BizContext bizContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9bbb625", new Object[]{str, context, bizContext})).booleanValue();
        }
        try {
            Intent intent = new Intent();
            intent.setClassName(str, "com.alipay.android.app.flybird.ui.window.FlyBirdWindowActivity");
            if (intent.resolveActivityInfo(context.getPackageManager(), 0) != null) {
                return true;
            }
            StatisticManager.putAction(bizContext, "biz", "BSADetectFail");
            return false;
        } catch (Throwable th) {
            StatisticManager.putError(bizContext, "biz", "BSADetectFail", th);
            return false;
        }
    }
}
