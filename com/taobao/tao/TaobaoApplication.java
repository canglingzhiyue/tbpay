package com.taobao.tao;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Handler;
import android.os.Process;
import mtopsdk.common.util.StringUtils;
import com.alibaba.android.split.s;
import com.alibaba.flexa.compat.b;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.bootstrap.tao.ability.ipc.a;
import com.taobao.android.lifecycle.PanguApplication;
import java.util.HashMap;
import tb.cjd;
import tb.gso;
import tb.gtu;
import tb.gtw;
import tb.gtx;
import tb.gvt;
import tb.ovh;
import tb.rfx;

/* loaded from: classes.dex */
public class TaobaoApplication extends PanguApplication implements a.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static long START;
    public static String sAppVersion;
    public static TaobaoApplication sApplication;
    public static long sLauncherStartTime;
    public static Handler sMainHandler;
    public static String sPackageName;
    public static String sProcessName;
    public static long sStartTime;
    public static String sTTID;
    private gtu bootstrap;
    private boolean isIsolatedProcess = false;
    private final gso.a getter = new gso.a() { // from class: com.taobao.tao.TaobaoApplication.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.gso.a
        public SharedPreferences a(Context context, String str, int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (SharedPreferences) ipChange.ipc$dispatch("692cecad", new Object[]{this, context, str, new Integer(i)}) : new i(TaobaoApplication.access$001(TaobaoApplication.this, str, i));
        }
    };
    private final a.InterfaceC0506a ipcContext = new a.InterfaceC0506a() { // from class: com.taobao.tao.TaobaoApplication.3
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.launcher.bootstrap.tao.ability.ipc.a.InterfaceC0506a
        public Intent a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Intent) ipChange.ipc$dispatch("3dd0f555", new Object[]{this, broadcastReceiver, intentFilter, str, handler}) : TaobaoApplication.access$101(TaobaoApplication.this, broadcastReceiver, intentFilter, str, handler);
        }

        @Override // com.taobao.android.launcher.bootstrap.tao.ability.ipc.a.InterfaceC0506a
        public Intent a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Intent) ipChange.ipc$dispatch("536266ae", new Object[]{this, broadcastReceiver, intentFilter, str, handler, new Integer(i)}) : TaobaoApplication.access$201(TaobaoApplication.this, broadcastReceiver, intentFilter, str, handler, i);
        }

        @Override // com.taobao.android.launcher.bootstrap.tao.ability.ipc.a.InterfaceC0506a
        public Intent a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Intent) ipChange.ipc$dispatch("db5ddb8f", new Object[]{this, broadcastReceiver, intentFilter}) : TaobaoApplication.access$301(TaobaoApplication.this, broadcastReceiver, intentFilter);
        }

        @Override // com.taobao.android.launcher.bootstrap.tao.ability.ipc.a.InterfaceC0506a
        public Intent a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Intent) ipChange.ipc$dispatch("677247b4", new Object[]{this, broadcastReceiver, intentFilter, new Integer(i)}) : TaobaoApplication.access$401(TaobaoApplication.this, broadcastReceiver, intentFilter, i);
        }

        @Override // com.taobao.android.launcher.bootstrap.tao.ability.ipc.a.InterfaceC0506a
        public Context a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("75941360", new Object[]{this}) : TaobaoApplication.this;
        }
    };

    public static /* synthetic */ Object ipc$super(TaobaoApplication taobaoApplication, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -976790220:
                return super.getApplicationContext();
            case -406270088:
                return super.openOrCreateDatabase((String) objArr[0], ((Number) objArr[1]).intValue(), (SQLiteDatabase.CursorFactory) objArr[2]);
            case -40033047:
                return super.getSharedPreferences((String) objArr[0], ((Number) objArr[1]).intValue());
            case 413640386:
                super.onCreate();
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 922616583:
                return super.getResources();
            case 1070661222:
                return super.registerReceiver((BroadcastReceiver) objArr[0], (IntentFilter) objArr[1], (String) objArr[2], (Handler) objArr[3]);
            case 1106102624:
                return super.registerReceiver((BroadcastReceiver) objArr[0], (IntentFilter) objArr[1]);
            case 2064626307:
                return super.getAssets();
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ SharedPreferences access$001(TaobaoApplication taobaoApplication, String str, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SharedPreferences) ipChange.ipc$dispatch("97ddd928", new Object[]{taobaoApplication, str, new Integer(i)}) : super.getSharedPreferences(str, i);
    }

    public static /* synthetic */ Intent access$101(TaobaoApplication taobaoApplication, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Intent) ipChange.ipc$dispatch("c5c43873", new Object[]{taobaoApplication, broadcastReceiver, intentFilter, str, handler}) : super.registerReceiver(broadcastReceiver, intentFilter, str, handler);
    }

    public static /* synthetic */ Intent access$201(TaobaoApplication taobaoApplication, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Intent) ipChange.ipc$dispatch("b548882f", new Object[]{taobaoApplication, broadcastReceiver, intentFilter, str, handler, new Integer(i)}) : super.registerReceiver(broadcastReceiver, intentFilter, str, handler, i);
    }

    public static /* synthetic */ Intent access$301(TaobaoApplication taobaoApplication, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Intent) ipChange.ipc$dispatch("c38d252f", new Object[]{taobaoApplication, broadcastReceiver, intentFilter}) : super.registerReceiver(broadcastReceiver, intentFilter);
    }

    public static /* synthetic */ Intent access$401(TaobaoApplication taobaoApplication, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Intent) ipChange.ipc$dispatch("194b4233", new Object[]{taobaoApplication, broadcastReceiver, intentFilter, new Integer(i)}) : super.registerReceiver(broadcastReceiver, intentFilter, i);
    }

    public TaobaoApplication() {
        long currentTimeMillis = System.currentTimeMillis();
        sStartTime = currentTimeMillis;
        START = currentTimeMillis;
        sLauncherStartTime = System.nanoTime();
        sMainHandler = new Handler();
    }

    @Override // com.taobao.android.lifecycle.PanguApplication, android.app.Application
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        super.onCreate();
        if (this.isIsolatedProcess) {
            return;
        }
        initAppBundle();
        gtu gtuVar = this.bootstrap;
        if (gtuVar == null) {
            return;
        }
        gtuVar.a();
    }

    private void initAppBundle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb909da", new Object[]{this});
        } else if (!isMainProcess() && !isChannelProcess() && !isInitFlexaAllProcess()) {
        } else {
            c.a(new Runnable() { // from class: com.taobao.tao.TaobaoApplication.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        com.taobao.appbundle.c.Companion.a().a(b.a(TaobaoApplication.this).a((com.alibaba.android.split.j) null).a((s) null).c(true).a(false).b(true).a());
                    }
                }
            });
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AssetManager) ipChange.ipc$dispatch("7b0fb283", new Object[]{this});
        }
        AssetManager assets = super.getAssets();
        ovh.a(assets);
        return assets;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Resources) ipChange.ipc$dispatch("36fe0307", new Object[]{this});
        }
        ovh.a(super.getAssets());
        return super.getResources();
    }

    @Override // com.taobao.android.launcher.bootstrap.tao.ability.ipc.a.c
    public a.InterfaceC0506a getContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a.InterfaceC0506a) ipChange.ipc$dispatch("f6ced455", new Object[]{this}) : this.ipcContext;
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        sProcessName = getProcessName(context);
        sPackageName = getPackageName(context);
        try {
            sAppVersion = getPackageManager().getPackageInfo(sPackageName, 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            sAppVersion = "1.0.0";
        }
        if (StringUtils.equals(sProcessName, sPackageName)) {
            gso.a(context, this.getter);
            this.isIsolatedProcess = false;
        } else {
            this.isIsolatedProcess = c.a();
        }
        sApplication = this;
        if (this.isIsolatedProcess) {
            sProcessName = getProcessNameIsolate(context);
        } else if (!cjd.a(context)) {
            Process.killProcess(Process.myPid());
            return;
        }
        if (c.a(sProcessName)) {
            return;
        }
        l.a(this, sPackageName, sProcessName, this.isIsolatedProcess).run();
        if (this.isIsolatedProcess) {
            return;
        }
        gtx gtxVar = new gtx();
        String str = sPackageName;
        gtxVar.f28453a = str;
        String str2 = sProcessName;
        gtxVar.b = str2;
        gtxVar.d = sAppVersion;
        gtxVar.c = sStartTime;
        if (StringUtils.equals(str2, str)) {
            HashMap hashMap = new HashMap();
            hashMap.put("appVersion", sAppVersion);
            com.alibaba.android.patronus.g.a(this, hashMap);
        }
        this.bootstrap = new gtw.a(this, gtxVar).a();
        this.bootstrap.a(this);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Context getApplicationContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("c5c75d34", new Object[]{this});
        }
        Context applicationContext = super.getApplicationContext();
        return applicationContext == null ? this : applicationContext;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Intent registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Intent) ipChange.ipc$dispatch("d2e01403", new Object[]{this, broadcastReceiver, intentFilter, new Integer(i)}) : a.a(this, broadcastReceiver, intentFilter, i);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Intent registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Intent) ipChange.ipc$dispatch("41edc960", new Object[]{this, broadcastReceiver, intentFilter}) : a.a(this, broadcastReceiver, intentFilter);
    }

    public String getProcessNameIsolate(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8ed38d06", new Object[]{this, context});
        }
        if (sProcessName == null) {
            sProcessName = c.b(context);
        }
        return sProcessName;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public SQLiteDatabase openOrCreateDatabase(String str, int i, SQLiteDatabase.CursorFactory cursorFactory) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SQLiteDatabase) ipChange.ipc$dispatch("e7c8cf78", new Object[]{this, str, new Integer(i), cursorFactory});
        }
        String str2 = sProcessName;
        if (StringUtils.isEmpty(str2)) {
            return hookDatabase(str, i, cursorFactory);
        }
        if (str2.equals(getPackageName())) {
            return hookDatabase(str, i, cursorFactory);
        }
        String[] split = str2.split(":");
        if (split.length <= 1) {
            return hookDatabase(str, i, cursorFactory);
        }
        return hookDatabase(split[1] + "_" + str, i, cursorFactory);
    }

    public SQLiteDatabase hookDatabase(String str, int i, SQLiteDatabase.CursorFactory cursorFactory) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SQLiteDatabase) ipChange.ipc$dispatch("dd072c72", new Object[]{this, str, new Integer(i), cursorFactory});
        }
        try {
            return super.openOrCreateDatabase(str, i, cursorFactory);
        } catch (SQLiteException unused) {
            if (!deleteDatabase(str)) {
                return null;
            }
            try {
                return super.openOrCreateDatabase(str, i, cursorFactory);
            } catch (SQLiteException unused2) {
                return null;
            }
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public SharedPreferences getSharedPreferences(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("fd9d24e9", new Object[]{this, str, new Integer(i)});
        }
        gvt.a("getSP4" + str);
        SharedPreferences a2 = gso.a(this, str, i, this.getter);
        gvt.a();
        return a2;
    }

    public static String getPackageName(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("34b1a51a", new Object[]{context});
        }
        if (!StringUtils.isEmpty(sPackageName)) {
            return sPackageName;
        }
        if (context == null) {
            return "packageName:null";
        }
        String packageName = context.getPackageName();
        sPackageName = packageName;
        return packageName;
    }

    public static String getProcessName(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7512d303", new Object[]{context});
        }
        if (!StringUtils.isEmpty(sProcessName)) {
            return sProcessName;
        }
        if (context == null) {
            return "processName:null";
        }
        String c = c.c(context);
        sProcessName = c;
        return c;
    }

    public static String getTTID() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2e0d7a8", new Object[0]);
        }
        if (StringUtils.isEmpty(sTTID)) {
            sTTID = TaoPackageInfo.getTTID();
        }
        return sTTID;
    }

    public static String getAppVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("65f009ac", new Object[0]);
        }
        if (StringUtils.isEmpty(sAppVersion)) {
            sAppVersion = TaoPackageInfo.getVersion();
        }
        return sAppVersion;
    }

    public static boolean isMainProcess() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("97b74977", new Object[0])).booleanValue() : "com.taobao.taobao".equals(getProcessName(sApplication));
    }

    public static boolean isChannelProcess() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("86016141", new Object[0])).booleanValue() : "com.taobao.taobao:channel".equalsIgnoreCase(getProcessName(sApplication));
    }

    private boolean isInitFlexaAllProcess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eecba507", new Object[]{this})).booleanValue();
        }
        SharedPreferences sharedPreferences = getSharedPreferences(rfx.UPDATE_CONFIG_GROUP, 0);
        return sharedPreferences.getBoolean(rfx.INIT_FLEXA_ALL + "_" + getAppVersion(), false);
    }
}
