package tb;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.taobao.accs.AccsMainService;
import com.taobao.accs.base.AccsDataListener;
import com.taobao.accs.center.IAccsMainBinder;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.common.a;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.BaseMonitor;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.accs.utl.a;
import com.taobao.accs.utl.b;
import com.taobao.accs.utl.c;
import com.taobao.accs.utl.d;
import com.taobao.accs.utl.l;
import com.taobao.accs.utl.m;
import com.taobao.accs.utl.o;
import com.taobao.adaemon.TriggerChannelService;
import com.taobao.android.fluid.core.exception.FluidException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import tb.mto;

/* loaded from: classes.dex */
public class dcd {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String TAG;

    /* renamed from: a  reason: collision with root package name */
    private static final List<String> f26671a;
    private static final ConcurrentHashMap<String, Messenger> b;
    private static ScheduledThreadPoolExecutor c;

    public static /* synthetic */ ConcurrentHashMap a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConcurrentHashMap) ipChange.ipc$dispatch("f779de7e", new Object[0]) : b;
    }

    public static /* synthetic */ void a(Context context, ServiceConnection serviceConnection, ComponentName componentName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6805998b", new Object[]{context, serviceConnection, componentName});
        } else {
            b(context, serviceConnection, componentName);
        }
    }

    public static /* synthetic */ void a(Context context, String str, String str2, String str3, String str4, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1892cf4c", new Object[]{context, str, str2, str3, str4, new Boolean(z)});
        } else {
            b(context, str, str2, str3, str4, z);
        }
    }

    static {
        kge.a(-2078122431);
        TAG = dcd.class.getSimpleName();
        f26671a = new ArrayList();
        b = new ConcurrentHashMap<>();
        f26671a.add("org.android.agoo.accs.AgooService");
        f26671a.add("com.taobao.taobao.TaobaoIntentService");
        f26671a.add(c.msgService);
    }

    public static void a(Context context, Intent intent) {
        String str;
        String className;
        String packageName;
        Messenger messenger;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c9cc1d", new Object[]{context, intent});
        } else if (context == null || intent == null) {
            ALog.e(TAG, "dispatchIntent context or intent is null", new Object[0]);
        } else {
            Context applicationContext = context.getApplicationContext();
            try {
                if (intent.getComponent() == null) {
                    className = intent.toString();
                    packageName = "";
                } else {
                    className = intent.getComponent().getClassName();
                    packageName = intent.getComponent().getPackageName();
                }
                String str2 = packageName;
                String str3 = className;
                try {
                    a(applicationContext, str2, str3);
                    if ((AccsMainService.className.equals(str3) && a.c()) || (c.msgService.equals(str3) && a.d())) {
                        ALog.e(TAG, "try use MainBinder", FluidException.SERVICE_NAME, str3);
                        IBinder mainBinder = GlobalClientInfo.getInstance(context).getMainBinder();
                        if (mainBinder != null) {
                            IAccsMainBinder.Stub.asInterface(mainBinder).onMessage(intent);
                            d.a("accs", BaseMonitor.ALARM_MAIN_BINDER_IPC_RES, str3);
                            return;
                        }
                        ALog.e(TAG, "MainBinder null, downgrade", "service", str3);
                        if (UtilityImpl.isMainProcessAlive(context)) {
                            String valueOf = String.valueOf(com.taobao.accs.connection.state.a.a().a(context));
                            d.a("accs", BaseMonitor.ALARM_MAIN_BINDER_IPC_RES, com.taobao.android.weex_framework.util.a.ATOM_EXT_Null, "-1", valueOf);
                            d.a("accs", BaseMonitor.ALARM_MAIN_BINDER_IPC_FAIL, com.taobao.android.weex_framework.util.a.ATOM_EXT_Null, "-1", valueOf);
                        }
                    }
                    if (o.a(applicationContext)) {
                        ALog.e(TAG, "dispatchIntent bind service start", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, intent.toString());
                        String stringExtra = intent.getStringExtra("serviceId");
                        boolean a2 = l.a(applicationContext, 3, stringExtra);
                        boolean z = (!a2 || intent.getBooleanExtra(Constants.KEY_REUSE_BINDER, true)) ? a2 : false;
                        if (z && (messenger = b.get(stringExtra)) != null) {
                            Message message = new Message();
                            message.getData().putParcelable(CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, intent);
                            messenger.send(message);
                            ALog.e(TAG, "reuseBinder succ", new Object[0]);
                            b(context, str2, TriggerChannelService.EXTRA_BINDER, null, null, true);
                            return;
                        }
                        a(applicationContext, intent, str2, z, stringExtra, str3);
                        return;
                    }
                    ALog.e(TAG, "dispatchIntent start service ", new Object[0]);
                    applicationContext.startService(intent);
                } catch (Exception e) {
                    e = e;
                    str = str2;
                    ALog.e(TAG, "dispatchIntent method call with exception ", e, new Object[0]);
                    if (!o.a(applicationContext)) {
                        return;
                    }
                    b(context, str, "bind_svc", "2003", UtilityImpl.getExceptionMsg(e), false);
                }
            } catch (Exception e2) {
                e = e2;
                str = null;
            }
        }
    }

    private static void a(Context context, Intent intent, String str, boolean z, String str2, String str3) {
        boolean bindService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e85631a1", new Object[]{context, intent, str, new Boolean(z), str2, str3});
            return;
        }
        int i = (!z || !UtilityImpl.isAppKeepAlive()) ? 1 : 33;
        if (!StringUtils.isEmpty(str3) && m.h().contains(str3)) {
            ALog.e(TAG, "bindServiceAsync", "serviceId", str2, FluidException.SERVICE_NAME, str3);
            jzv.a(intent, b(context, intent, str, z, str2), i, $$Lambda$dcd$2__hpkHAfcAqTMf3_UaPpcomAZg.INSTANCE);
            return;
        }
        if (m.c()) {
            b(context, intent);
        }
        if (UtilityImpl.isChannelProcess(context) && Build.VERSION.SDK_INT >= 31) {
            bindService = context.bindService(intent, i, b(), b(context, intent, str, z, str2));
        } else {
            bindService = context.bindService(intent, b(context, intent, str, z, str2), i);
        }
        ALog.e(TAG, "bindService， ", "serviceId", str2, "reuseBinder", Boolean.valueOf(z), "result", Boolean.valueOf(bindService));
        if (bindService) {
            return;
        }
        d.a("accs", BaseMonitor.COUNT_MSG_LOST, "bindService", mto.a.GEO_NOT_SUPPORT);
        b(context, str, "bind_svc", "2001", null, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{new Boolean(z)});
        } else {
            ALog.e(TAG, "bindServiceAsync", "success", Boolean.valueOf(z));
        }
    }

    private static void b(Context context, Intent intent) {
        boolean a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23e54abc", new Object[]{context, intent});
            return;
        }
        try {
            ServiceInfo serviceInfo = context.getPackageManager().getServiceInfo(intent.getComponent(), 4);
            if (serviceInfo == null) {
                return;
            }
            if (serviceInfo.processName.endsWith(":channel")) {
                a2 = com.taobao.accs.connection.state.a.a().g(context);
            } else {
                a2 = com.taobao.accs.connection.state.a.a().a(context);
            }
            if (a2) {
                return;
            }
            ALog.e(TAG, "recordStartProcService", "service", intent);
            d.a("accs", BaseMonitor.COUNT_START_PROC_SERVICE, serviceInfo.name, mto.a.GEO_NOT_SUPPORT);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private static ServiceConnection b(final Context context, final Intent intent, final String str, final boolean z, final String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ServiceConnection) ipChange.ipc$dispatch("c3c21d0c", new Object[]{context, intent, str, new Boolean(z), str2}) : new ServiceConnection() { // from class: tb.dcd.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1495fa3c", new Object[]{this, componentName, iBinder});
                    return;
                }
                if (componentName != null && "com.alibaba.dingtalk.accs.connection.AccsBridgeService".equals(componentName.getClassName())) {
                    ALog.e(dcd.TAG, "bindService connected", "componentName", componentName.toString());
                } else {
                    ALog.d(dcd.TAG, "bindService connected", "componentName", componentName.toString());
                }
                Messenger messenger = new Messenger(iBinder);
                Message message = new Message();
                try {
                    message.getData().putParcelable(CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, intent);
                    messenger.send(message);
                    dcd.a(context, str, "bind_svc", (String) null, (String) null, true);
                    if (z) {
                        dcd.a().put(str2, messenger);
                        iBinder.linkToDeath(new IBinder.DeathRecipient() { // from class: tb.dcd.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // android.os.IBinder.DeathRecipient
                            public void binderDied() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("25f12e35", new Object[]{this});
                                    return;
                                }
                                ALog.e(dcd.TAG, "on binderDied", new Object[0]);
                                try {
                                    dcd.a().remove(str2);
                                    iBinder.unlinkToDeath(this, 0);
                                } catch (Throwable th) {
                                    ALog.e(dcd.TAG, "binderDied err", th, new Object[0]);
                                }
                            }
                        }, 0);
                    }
                } catch (Throwable th) {
                    try {
                        ALog.e(dcd.TAG, "dispatch intent with exception", th, "\nCause:", th.getCause());
                        String exceptionMsg = UtilityImpl.getExceptionMsg(th);
                        dcd.a(context, str, "bind_svc", "2002", exceptionMsg, false);
                        d.a("accs", BaseMonitor.COUNT_MSG_LOST, "bindService_ipc", mto.a.GEO_NOT_SUPPORT);
                        if (com.taobao.accs.connection.state.a.a().a(context) && l.a(context, 6, str2) && exceptionMsg.startsWith("android.os.DeadObjectException")) {
                            ALog.e(dcd.TAG, "turn to using listener", new Object[0]);
                            AccsDataListener listener = GlobalClientInfo.getInstance(context).getListener(str2);
                            if (listener != null) {
                                b.a(context, intent, listener);
                            }
                            if (m.t() && Constants.IMPAAS.equals(str2)) {
                                AccsDataListener listener2 = GlobalClientInfo.getInstance(context).getListener(Constants.IMPAAS_MOCK);
                                if (listener2 != null) {
                                    String stringExtra = intent.getStringExtra("dataId");
                                    ALog.e(dcd.TAG, "callback by mockListener", "dataId", stringExtra);
                                    d.a("accs", BaseMonitor.COUNT_TRY_MOCK_LISTENER, stringExtra, 1.0d);
                                    b.a(context, intent, listener2);
                                }
                            } else {
                                d.a("accs", BaseMonitor.COUNT_VERIFY, "turnToListener", mto.a.GEO_NOT_SUPPORT);
                            }
                        }
                        if (z) {
                            return;
                        }
                        dcd.a(context, this, componentName);
                    } finally {
                        if (!z) {
                            dcd.a(context, this, componentName);
                        }
                    }
                }
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5a4ef237", new Object[]{this, componentName});
                    return;
                }
                ALog.e(dcd.TAG, "bindService on disconnect", "componentName", componentName.toString());
                if (!m.c()) {
                    dcd.a(context, this, componentName);
                }
                if (!z) {
                    return;
                }
                dcd.a().remove(str2);
            }
        };
    }

    private static ScheduledThreadPoolExecutor b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledThreadPoolExecutor) ipChange.ipc$dispatch("111ace6e", new Object[0]);
        }
        if (c == null) {
            synchronized (dcd.class) {
                if (c == null) {
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new a.ThreadFactoryC0314a("ACCS-IPC")) { // from class: tb.dcd.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        public static /* synthetic */ Object ipc$super(AnonymousClass2 anonymousClass2, String str, Object... objArr) {
                            if (str.hashCode() == 452660730) {
                                super.execute((Runnable) objArr[0]);
                                return null;
                            }
                            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                        }

                        @Override // java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
                        public void execute(final Runnable runnable) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("1afb0dfa", new Object[]{this, runnable});
                            } else {
                                super.execute(new Runnable() { // from class: tb.dcd.2.1
                                    public static volatile transient /* synthetic */ IpChange $ipChange;

                                    @Override // java.lang.Runnable
                                    public void run() {
                                        IpChange ipChange3 = $ipChange;
                                        if (ipChange3 instanceof IpChange) {
                                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                            return;
                                        }
                                        try {
                                            runnable.run();
                                        } catch (Throwable th) {
                                            ALog.e(dcd.TAG, "getIpcScheduledExecutor err", th, new Object[0]);
                                        }
                                    }
                                });
                            }
                        }
                    };
                    c = scheduledThreadPoolExecutor;
                    scheduledThreadPoolExecutor.setKeepAliveTime(10L, TimeUnit.SECONDS);
                    c.allowCoreThreadTimeOut(true);
                }
            }
        }
        return c;
    }

    private static void b(Context context, ServiceConnection serviceConnection, ComponentName componentName) {
        String className;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4887616a", new Object[]{context, serviceConnection, componentName});
            return;
        }
        if (componentName == null) {
            className = "";
        } else {
            try {
                className = componentName.getClassName();
            } catch (Throwable th) {
                ALog.e(TAG, "saveUnbindService err", th, new Object[0]);
                return;
            }
        }
        if (!StringUtils.isEmpty(className) && m.h().contains(className)) {
            jzv.a(serviceConnection);
        } else {
            context.unbindService(serviceConnection);
        }
    }

    private static void a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d18de974", new Object[]{context, str, str2});
        } else if (!f26671a.contains(str2)) {
            ALog.i(TAG, "dynamicEnableService, not exist in list", new Object[0]);
        } else {
            ALog.i(TAG, "dynamicEnableService start", new Object[0]);
            ComponentName componentName = new ComponentName(str, str2);
            if (UtilityImpl.getServiceEnabled(context, componentName)) {
                return;
            }
            UtilityImpl.enableService(context, componentName);
        }
    }

    private static void b(Context context, String str, String str2, String str3, String str4, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bf93e8d", new Object[]{context, str, str2, str3, str4, new Boolean(z)});
        } else if (!context.getPackageName().equals(str)) {
        } else {
            if (z) {
                d.a("accs", BaseMonitor.ALARM_POINT_BIND, str2);
            } else {
                d.a("accs", BaseMonitor.ALARM_POINT_BIND, str2, str3, str4);
            }
        }
    }
}
