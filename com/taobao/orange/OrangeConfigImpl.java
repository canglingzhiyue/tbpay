package com.taobao.orange;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.IBinder;
import android.os.Process;
import android.text.TextUtils;
import anet.channel.util.ABSwitchUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OConstant;
import com.taobao.orange.aidl.IOrangeApiService;
import com.taobao.orange.aidl.IOrangeBindService;
import com.taobao.orange.aidl.OrangeApiServiceStub;
import com.taobao.orange.aidl.OrangeConfigListenerStub;
import com.taobao.orange.model.ConfigDO;
import com.taobao.orange.service.OrangeBindService;
import com.taobao.orange.util.OLog;
import com.taobao.orange.util.h;
import com.taobao.search.common.util.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kge;
import tb.kxd;
import tb.naa;

/* loaded from: classes.dex */
public class OrangeConfigImpl extends OrangeConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static OrangeConfigImpl m;

    /* renamed from: a  reason: collision with root package name */
    public volatile Context f18559a;
    public volatile IOrangeApiService b;
    public volatile CountDownLatch c;
    public volatile OConfig d;
    public volatile double f;
    public volatile double r;
    public AtomicBoolean e = new AtomicBoolean(false);
    public AtomicBoolean q = new AtomicBoolean(false);
    public AtomicBoolean p = new AtomicBoolean(false);
    public volatile String g = null;
    public final Set<String> h = Collections.synchronizedSet(new HashSet());
    public final Map<String, Set<OrangeConfigListenerStub>> i = new ConcurrentHashMap();
    public final Map<String, Set<OrangeConfigListenerStub>> j = new ConcurrentHashMap();
    public final List<OCandidate> k = Collections.synchronizedList(new ArrayList());
    public final Set<String> l = new HashSet<String>() { // from class: com.taobao.orange.OrangeConfigImpl.1
        {
            add(com.taobao.downloader.sync.b.GROUP);
            add("flow_customs_config");
            add("custom_out_config");
        }
    };
    private ServiceConnection n = new ServiceConnection() { // from class: com.taobao.orange.OrangeConfigImpl.12
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ef237", new Object[]{this, componentName});
                return;
            }
            OLog.e("OrangeConfigImpl", "mConnection onServiceDisconnected " + Process.myPid() + ", " + OrangeConfigImpl.c(OrangeConfigImpl.this).hashCode(), new Object[0]);
            OrangeConfigImpl orangeConfigImpl = OrangeConfigImpl.this;
            orangeConfigImpl.b = null;
            orangeConfigImpl.e.set(false);
            if (OrangeConfigImpl.this.c != null) {
                OrangeConfigImpl.this.c.countDown();
            }
            if (!a.d) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            a.c = false;
            OLog.e("OrangeConfigImpl", "binderDied: " + Process.myPid(), new Object[0]);
            if (OrangeConfigImpl.this.f18559a != null) {
                try {
                    OLog.e("OrangeConfigImpl", "binderDied: unbindService " + (System.currentTimeMillis() - currentTimeMillis), new Object[0]);
                    OrangeConfigImpl.this.f18559a.unbindService(OrangeConfigImpl.c(OrangeConfigImpl.this));
                    com.taobao.orange.util.d.a(OConstant.MONITOR_MODULE, OConstant.POINT_PROCESS_BIND_MODE, "unbind");
                } finally {
                    try {
                    } finally {
                    }
                }
            }
            OLog.e("OrangeConfigImpl", "binderDied: channel " + a.d + ", mainProcess alive " + a.c + ", duration = " + (System.currentTimeMillis() - currentTimeMillis), new Object[0]);
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1495fa3c", new Object[]{this, componentName, iBinder});
                return;
            }
            OLog.e("OrangeConfigImpl", "mConnection onServiceConnected " + Process.myPid() + ", " + OrangeConfigImpl.c(OrangeConfigImpl.this).hashCode(), new Object[0]);
            OrangeConfigImpl.this.b = IOrangeApiService.Stub.asInterface(iBinder);
            OrangeConfigImpl.this.e.set(false);
            double currentTimeMillis = ((double) System.currentTimeMillis()) - OrangeConfigImpl.this.f;
            OLog.e("OrangeConfigImpl", "bindService duration = " + currentTimeMillis, new Object[0]);
            com.taobao.orange.util.d.a("bind_service", currentTimeMillis);
            if (OrangeConfigImpl.this.c != null) {
                OrangeConfigImpl.this.c.countDown();
            }
            try {
                if (((Boolean) h.b(a.g, OConstant.SYSKEY_SERVICE_DELAY_BIND, (Object) true)).booleanValue()) {
                    OLog.e("OrangeConfigImpl", "mConnection serviceDelayBind is true, already execute bind OrangeBindService. isMainProcess:" + a.b + ", isChannelProcess:" + a.d + ", isMainProcessAlive:" + a.c + ", isChannelProcessAlive:" + a.e, new Object[0]);
                    return;
                }
                OLog.e("OrangeConfigImpl", "mConnection onServiceConnected: " + a.d + ", " + a.b + ", " + a.e, new Object[0]);
                if (!a.b || !a.e) {
                    return;
                }
                e.a(new Runnable() { // from class: com.taobao.orange.OrangeConfigImpl.12.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            if (OrangeConfigImpl.this.f18559a == null) {
                                return;
                            }
                            Intent intent = new Intent(OrangeConfigImpl.this.f18559a, OrangeBindService.class);
                            intent.setAction(OrangeBindService.class.getName());
                            intent.addCategory("android.intent.category.DEFAULT");
                            boolean bindService = OrangeConfigImpl.this.f18559a.bindService(intent, OrangeConfigImpl.d(OrangeConfigImpl.this), 1);
                            OLog.e("OrangeConfigImpl", "bind OrangeBindService", new Object[0]);
                            if (bindService) {
                                com.taobao.orange.util.d.a(OConstant.MONITOR_MODULE, OConstant.POINT_BIND_CHANNEL_SERVICE, "bind no serviceDelayBind");
                            } else {
                                com.taobao.orange.util.d.a(OConstant.MONITOR_MODULE, OConstant.POINT_BIND_CHANNEL_SERVICE, "bind no serviceDelayBind", "-1", "return false");
                            }
                        } catch (Throwable th) {
                            com.taobao.orange.util.d.a(OConstant.MONITOR_MODULE, OConstant.POINT_BIND_CHANNEL_SERVICE, "bind no serviceDelayBind", "-2", th.getMessage());
                        }
                    }
                });
            } catch (Throwable th) {
                OLog.e("OrangeConfigImpl", "bind service exception" + th.toString(), new Object[0]);
            }
        }
    };
    private ServiceConnection o = new ServiceConnection() { // from class: com.taobao.orange.OrangeConfigImpl.13
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1495fa3c", new Object[]{this, componentName, iBinder});
                return;
            }
            OLog.e("OrangeConfigImpl", "mBindChannelConnection onServiceConnected: " + Process.myPid() + ", " + OrangeConfigImpl.d(OrangeConfigImpl.this).hashCode(), new Object[0]);
            com.taobao.orange.util.d.a(OConstant.MONITOR_MODULE, OConstant.POINT_PROCESS_BIND_MODE, com.taobao.android.weex_framework.util.a.ATOM_EXT_bind);
            if (com.taobao.orange.util.f.a(OrangeConfigImpl.this.f18559a)) {
                OLog.e("OrangeConfigImpl", "mBindChannelConnection OrangeBindService keep alive", new Object[0]);
                e.a(new Runnable() { // from class: com.taobao.orange.OrangeConfigImpl.13.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            IOrangeBindService asInterface = IOrangeBindService.Stub.asInterface(iBinder);
                            if (asInterface == null) {
                                return;
                            }
                            asInterface.setRemoteService(new OrangeApiServiceStub(OrangeConfigImpl.this.f18559a));
                        } catch (Throwable th) {
                            OLog.e("OrangeConfigImpl", "mBindChannelConnection setRemoteService exception " + th, new Object[0]);
                        }
                    }
                });
            } else if (OrangeConfigImpl.this.f18559a == null) {
            } else {
                e.a(new Runnable() { // from class: com.taobao.orange.OrangeConfigImpl.13.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        boolean z;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            z = IOrangeBindService.Stub.asInterface(iBinder).isBind();
                        } catch (Throwable th) {
                            OLog.e("OrangeConfigImpl", "isBind exception " + th, new Object[0]);
                            z = false;
                        }
                        if (OrangeConfigImpl.this.f18559a == null || !z) {
                            com.taobao.orange.util.d.a(OConstant.MONITOR_MODULE, OConstant.POINT_UNBIND_CHANNEL_SERVICE, "unbind", "-1", "ret " + z);
                            return;
                        }
                        try {
                            OLog.e("OrangeConfigImpl", "start unbind channel service, context hashcode", Integer.valueOf(OrangeConfigImpl.this.f18559a.hashCode()));
                            OrangeConfigImpl.this.f18559a.unbindService(OrangeConfigImpl.d(OrangeConfigImpl.this));
                            com.taobao.orange.util.d.a(OConstant.MONITOR_MODULE, OConstant.POINT_UNBIND_CHANNEL_SERVICE, "unbind");
                        } catch (Throwable th2) {
                            OLog.e("OrangeConfigImpl", "unbindService exception" + th2, new Object[0]);
                            com.taobao.orange.util.d.a(OConstant.MONITOR_MODULE, OConstant.POINT_UNBIND_CHANNEL_SERVICE, "unbind", "-2", th2.getMessage());
                        }
                    }
                });
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ef237", new Object[]{this, componentName});
                return;
            }
            OLog.e("OrangeConfigImpl", "mBindChannelConnection onServiceDisconnected: " + Process.myPid() + ", " + OrangeConfigImpl.d(OrangeConfigImpl.this).hashCode(), new Object[0]);
            if (!com.taobao.orange.util.f.a(OrangeConfigImpl.this.f18559a)) {
                return;
            }
            a.e = false;
            OrangeConfigImpl.this.q.set(false);
            e.a(new Runnable() { // from class: com.taobao.orange.OrangeConfigImpl.13.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        OrangeConfigImpl.b(OrangeConfigImpl.this, 0);
                    }
                }
            }, 15000L);
        }
    };

    public static /* synthetic */ Object ipc$super(OrangeConfigImpl orangeConfigImpl, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void a(OrangeConfigImpl orangeConfigImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b86fdb39", new Object[]{orangeConfigImpl});
        } else {
            orangeConfigImpl.c();
        }
    }

    public static /* synthetic */ void a(OrangeConfigImpl orangeConfigImpl, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("558bfeea", new Object[]{orangeConfigImpl, new Integer(i)});
        } else {
            orangeConfigImpl.a(i);
        }
    }

    public static /* synthetic */ void b(OrangeConfigImpl orangeConfigImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4510063a", new Object[]{orangeConfigImpl});
        } else {
            orangeConfigImpl.d();
        }
    }

    public static /* synthetic */ void b(OrangeConfigImpl orangeConfigImpl, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf13409", new Object[]{orangeConfigImpl, new Integer(i)});
        } else {
            orangeConfigImpl.b(i);
        }
    }

    public static /* synthetic */ ServiceConnection c(OrangeConfigImpl orangeConfigImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ServiceConnection) ipChange.ipc$dispatch("67dcad2f", new Object[]{orangeConfigImpl}) : orangeConfigImpl.n;
    }

    public static /* synthetic */ ServiceConnection d(OrangeConfigImpl orangeConfigImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ServiceConnection) ipChange.ipc$dispatch("9b8ad7f0", new Object[]{orangeConfigImpl}) : orangeConfigImpl.o;
    }

    static {
        kge.a(1305816990);
        m = new OrangeConfigImpl();
    }

    private OrangeConfigImpl() {
    }

    @Override // com.taobao.orange.OrangeConfig
    public void init(final Context context, final OConfig oConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7508d46d", new Object[]{this, context, oConfig});
        } else if (context == null) {
            OLog.e("OrangeConfigImpl", "init error as ctx is null", new Object[0]);
        } else {
            String packageName = context.getPackageName();
            a.f18576a = !TextUtils.isEmpty(packageName) && packageName.equals("com.taobao.taobao");
            a.b = com.taobao.orange.util.a.a(context);
            boolean z = (context.getApplicationInfo().flags & 2) != 0;
            if (z) {
                OLog.isUseTlog = false;
            } else {
                OLog.isUseTlog = true;
            }
            OLog.i("OrangeConfigImpl", "init", com.taobao.tao.log.statistics.d.PARAM_IS_DEBUG, Boolean.valueOf(z), "isMainProcess", Boolean.valueOf(a.b));
            if (TextUtils.isEmpty(oConfig.appKey) || TextUtils.isEmpty(oConfig.appVersion)) {
                OLog.e("OrangeConfigImpl", "init error as appKey or appVersion is empty", new Object[0]);
                return;
            }
            if (this.f18559a == null) {
                this.f18559a = context.getApplicationContext();
            }
            a.g = this.f18559a;
            a.J = OConstant.ENV.valueOf(oConfig.env);
            a.h = oConfig.appKey;
            a.j = oConfig.appVersion;
            this.d = oConfig;
            e.a(new Runnable() { // from class: com.taobao.orange.OrangeConfigImpl.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        OrangeConfigImpl.this.a(context, oConfig);
                    }
                }
            });
        }
    }

    @Override // com.taobao.orange.OrangeConfig
    public void reInitRemoteService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc659cf3", new Object[]{this});
        } else {
            e.a(new Runnable() { // from class: com.taobao.orange.OrangeConfigImpl.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        if (OrangeConfigImpl.this.f18559a == null || OrangeConfigImpl.this.d == null || !com.taobao.orange.util.a.a(OrangeConfigImpl.this.f18559a, true)) {
                            return;
                        }
                        IOrangeApiService iOrangeApiService = OrangeConfigImpl.this.b;
                        OrangeConfigImpl.this.b = null;
                        OrangeConfigImpl.this.a(OrangeConfigImpl.this.f18559a, OrangeConfigImpl.this.d);
                        if (!(OrangeConfigImpl.this.b instanceof OrangeApiServiceStub) || OrangeConfigImpl.this.j.size() == 0) {
                            return;
                        }
                        for (Map.Entry<String, Set<OrangeConfigListenerStub>> entry : OrangeConfigImpl.this.j.entrySet()) {
                            for (OrangeConfigListenerStub orangeConfigListenerStub : entry.getValue()) {
                                OrangeConfigImpl.this.b.registerListener(entry.getKey(), orangeConfigListenerStub, orangeConfigListenerStub.isAppend());
                            }
                        }
                    } catch (Throwable th) {
                        OLog.e("OrangeConfigImpl", "reInitRemoteService failed", th.toString());
                    }
                }
            }, ((Long) h.b(a.g, OConstant.SYSKEY_REINIT_SERVICE_DELAY_TIME, (Object) 0L)).longValue());
        }
    }

    public void a(Context context, OConfig oConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("382148be", new Object[]{this, context, oConfig});
            return;
        }
        a(context, true);
        if (this.b == null) {
            return;
        }
        if (a.d && (this.b instanceof OrangeApiServiceStub)) {
            try {
                a();
                oConfig.time = 0L;
                oConfig.channelIndexUpdate = true;
                this.b.init(oConfig);
                OLog.e("OrangeConfigImpl", "init local stub on channel process", new Object[0]);
                a(context);
                return;
            } catch (Throwable th) {
                OLog.e("OrangeConfigImpl", "int local stub failed", th.toString());
            }
        }
        try {
            a();
            this.b.init(oConfig);
        } catch (Throwable th2) {
            OLog.e("OrangeConfigImpl", "asyncInit", th2, new Object[0]);
        }
    }

    private void a(Context context) {
        final int i;
        int i2;
        IpChange ipChange = $ipChange;
        int i3 = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        OLog.e("OrangeConfigImpl", "processQuery ", Boolean.valueOf(a.B));
        if (!a.B) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        if (!TextUtils.isEmpty(a.C)) {
            String[] split = a.C.split("#");
            long parseLong = Long.parseLong(split[0]);
            long parseLong2 = Long.parseLong(split[1]);
            if (currentTimeMillis > parseLong && currentTimeMillis < parseLong2) {
                OLog.e("OrangeConfigImpl", "hit query forbid time", new Object[0]);
                return;
            }
        }
        long longValue = ((Long) h.b(context, OConstant.PROCESS_QUERY_SENT_LAST_TIME_SECONDS, (Object) 0L)).longValue();
        if (!TextUtils.isEmpty(a.D)) {
            String[] split2 = a.D.split("#");
            i2 = (int) ((Math.random() * Integer.parseInt(split2[0])) + 1.0d);
            if (longValue > 0) {
                long j = currentTimeMillis - longValue;
                if (j < Long.parseLong(split2[1])) {
                    OLog.e("OrangeConfigImpl", "last query time send too near ", Long.valueOf(j));
                    return;
                }
                int parseInt = Integer.parseInt(split2[2]);
                i = ((Integer) h.b(context, OConstant.PROCESS_QUERY_SENT_COUNT, (Object) 5)).intValue();
                if (i >= parseInt && a(currentTimeMillis, longValue, TimeZone.getDefault())) {
                    OLog.e("OrangeConfigImpl", "exceed sent count limit ", Integer.valueOf(i), Integer.valueOf(parseInt));
                    return;
                }
                i3 = 1;
            } else {
                i3 = 1;
                i = 0;
            }
        } else {
            i = 0;
            i2 = 1200;
        }
        Object[] objArr = new Object[i3];
        objArr[0] = Integer.valueOf(i2);
        OLog.e("OrangeConfigImpl", "ready to send query at delay time", objArr);
        e.a(new Runnable() { // from class: com.taobao.orange.OrangeConfigImpl.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                OLog.e("OrangeConfigImpl", "trigger index update", new Object[0]);
                OrangeConfigImpl.a(OrangeConfigImpl.this, i);
            }
        }, i2 * 1000);
    }

    private void a(int i) {
        naa naaVar = null;
        try {
            naa newInstance = a.f.newInstance();
            try {
                String b = b();
                if (TextUtils.isEmpty(b)) {
                    OLog.e("OrangeConfigImpl", "triggerIndexUpdate", "get request url failed");
                    if (newInstance == null) {
                        return;
                    }
                    newInstance.e();
                    return;
                }
                newInstance.a(b);
                newInstance.b("GET");
                newInstance.d();
                int b2 = newInstance.b();
                OLog.e("OrangeConfigImpl", "triggerIndexUpdate", "send success", Integer.valueOf(b2));
                if (200 == b2) {
                    h.a(a.g, OConstant.PROCESS_QUERY_SENT_COUNT, Integer.valueOf(i + 1));
                    h.a(a.g, OConstant.PROCESS_QUERY_SENT_LAST_TIME_SECONDS, Long.valueOf(System.currentTimeMillis() / 1000));
                }
                if (newInstance == null) {
                    return;
                }
                newInstance.e();
            } catch (Throwable th) {
                th = th;
                naaVar = newInstance;
                try {
                    OLog.e("OrangeConfigImpl", "triggerIndexUpdate", "send failed", th.getMessage());
                    if (naaVar == null) {
                        return;
                    }
                    naaVar.e();
                } catch (Throwable th2) {
                    naa naaVar2 = naaVar;
                    if (naaVar2 != null) {
                        naaVar2.e();
                    }
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        return k.HTTP_PREFIX + OConstant.SUB_PROCESS_INDEX_QUERY_HOSTS[a.J.getEnvMode()] + OConstant.SUB_PROCESS_INDEX_QUERY_URL;
    }

    public static boolean a(long j, long j2, TimeZone timeZone) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("422b702", new Object[]{new Long(j), new Long(j2), timeZone})).booleanValue();
        }
        long j3 = j - j2;
        return j3 < 86400 && j3 > -86400 && a(j, timeZone) == a(j2, timeZone);
    }

    private static long a(long j, TimeZone timeZone) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4ba3c166", new Object[]{new Long(j), timeZone})).longValue() : (timeZone.getOffset(j) + j) / 86400;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.b != null) {
            try {
                OLog.i("OrangeConfigImpl", "sendFailItems start", new Object[0]);
                long currentTimeMillis = System.currentTimeMillis();
                if (this.g != null) {
                    this.b.setUserId(this.g);
                    this.g = null;
                }
                if (this.h.size() > 0) {
                    this.b.addFails((String[]) this.h.toArray(new String[this.h.size()]));
                }
                this.h.clear();
                for (Map.Entry<String, Set<OrangeConfigListenerStub>> entry : this.i.entrySet()) {
                    for (OrangeConfigListenerStub orangeConfigListenerStub : entry.getValue()) {
                        this.b.registerListener(entry.getKey(), orangeConfigListenerStub, orangeConfigListenerStub.isAppend());
                    }
                }
                this.i.clear();
                if (a.b) {
                    for (OCandidate oCandidate : this.k) {
                        this.b.addCandidate(oCandidate.a(), oCandidate.b(), oCandidate.c());
                    }
                }
                this.k.clear();
                OLog.i("OrangeConfigImpl", "sendFailItems end", "cost", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            } catch (Throwable th) {
                OLog.e("OrangeConfigImpl", "sendFailItems", th, new Object[0]);
            }
        }
    }

    @Override // com.taobao.orange.OrangeConfig
    public String getConfig(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("611c4ee3", new Object[]{this, str, str2, str3});
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            OLog.e("OrangeConfigImpl", "getConfig error as param is empty", new Object[0]);
            return str3;
        }
        a(this.f18559a, false);
        if (this.b == null) {
            if (!this.h.add(str)) {
                return str3;
            }
            OLog.w("OrangeConfigImpl", "getConfig wait", "namespace", str);
            return str3;
        } else if (a.f18576a && !a.b && this.l.contains(str)) {
            return str3;
        } else {
            try {
                return this.b.getConfig(str, str2, str3);
            } catch (Throwable th) {
                OLog.e("OrangeConfigImpl", kxd.GET_CONFIG_PREFIX, th, new Object[0]);
                return str3;
            }
        }
    }

    @Override // com.taobao.orange.OrangeConfig
    public Map<String, String> getConfigs(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6165ac1", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            OLog.e("OrangeConfigImpl", "getConfig error as param is empty", new Object[0]);
            return null;
        }
        a(this.f18559a, false);
        if (this.b == null) {
            if (!this.h.add(str)) {
                return null;
            }
            OLog.w("OrangeConfigImpl", "getConfigs wait", "namespace", str);
            return null;
        } else if (a.f18576a && !a.b && this.l.contains(str)) {
            return null;
        } else {
            try {
                return this.b.getConfigs(str);
            } catch (Throwable th) {
                OLog.e("OrangeConfigImpl", "getConfigs", th, new Object[0]);
                return null;
            }
        }
    }

    @Override // com.taobao.orange.OrangeConfig
    public String getCustomConfig(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3a44377c", new Object[]{this, str, str2});
        }
        if (TextUtils.isEmpty(str)) {
            OLog.e("OrangeConfigImpl", "getCustomConfig error as param is empty", new Object[0]);
            return null;
        }
        a(this.f18559a, false);
        if (this.b == null) {
            if (this.h.add(str)) {
                OLog.w("OrangeConfigImpl", "getCustomConfig wait", "namespace", str);
            }
        } else if (a.f18576a && !a.b && this.l.contains(str)) {
            return null;
        } else {
            try {
                return this.b.getCustomConfig(str, str2);
            } catch (Throwable th) {
                OLog.e("OrangeConfigImpl", "getCustomConfig", th, new Object[0]);
            }
        }
        return str2;
    }

    @Override // com.taobao.orange.OrangeConfig
    public void registerListener(String[] strArr, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32f34e08", new Object[]{this, strArr, fVar});
        } else {
            a(strArr, (String[]) fVar, true);
        }
    }

    @Override // com.taobao.orange.OrangeConfig
    public void registerListener(String[] strArr, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32f3c267", new Object[]{this, strArr, gVar});
        } else {
            a(strArr, (String[]) gVar, true);
        }
    }

    @Override // com.taobao.orange.OrangeConfig
    public void registerListener(String[] strArr, d dVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b5af6ca", new Object[]{this, strArr, dVar, new Boolean(z)});
        } else {
            a(strArr, (String[]) dVar, z);
        }
    }

    private <T extends c> void a(final String[] strArr, T t, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc48379f", new Object[]{this, strArr, t, new Boolean(z)});
        } else if (strArr == null || strArr.length == 0 || t == null) {
            OLog.e("OrangeConfigImpl", "registerListener error as param null", new Object[0]);
        } else {
            final OrangeConfigListenerStub orangeConfigListenerStub = new OrangeConfigListenerStub(t, z);
            if (a.d) {
                b(strArr, orangeConfigListenerStub);
            }
            if (this.b == null) {
                OLog.w("OrangeConfigImpl", "registerListener wait", "namespaces", Arrays.asList(strArr));
                for (String str : strArr) {
                    a(str).add(orangeConfigListenerStub);
                }
                return;
            }
            e.a(new Runnable() { // from class: com.taobao.orange.OrangeConfigImpl.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        OrangeConfigImpl.this.a(strArr, orangeConfigListenerStub);
                    }
                }
            });
        }
    }

    public void a(String[] strArr, OrangeConfigListenerStub orangeConfigListenerStub) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58801227", new Object[]{this, strArr, orangeConfigListenerStub});
        } else if (this.b != null && strArr != null && strArr.length != 0 && orangeConfigListenerStub != null) {
            for (String str : strArr) {
                try {
                    this.b.registerListener(str, orangeConfigListenerStub, orangeConfigListenerStub.isAppend());
                } catch (Throwable th) {
                    OLog.w("OrangeConfigImpl", "registerListener", th, new Object[0]);
                }
            }
        }
    }

    public void b(String[] strArr, OrangeConfigListenerStub orangeConfigListenerStub) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f8bf928", new Object[]{this, strArr, orangeConfigListenerStub});
        } else if (strArr != null && strArr.length != 0 && orangeConfigListenerStub != null) {
            for (String str : strArr) {
                Set<OrangeConfigListenerStub> set = this.j.get(str);
                if (set == null) {
                    set = new HashSet<>();
                    this.j.put(str, set);
                }
                set.add(orangeConfigListenerStub);
            }
        }
    }

    private Set<OrangeConfigListenerStub> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("bf40e8a1", new Object[]{this, str});
        }
        Set<OrangeConfigListenerStub> set = this.i.get(str);
        if (set != null) {
            return set;
        }
        HashSet hashSet = new HashSet();
        this.i.put(str, hashSet);
        return hashSet;
    }

    @Override // com.taobao.orange.OrangeConfig
    public void unregisterListener(String[] strArr, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1207bd80", new Object[]{this, strArr, gVar});
        } else if (strArr == null || strArr.length == 0 || gVar == null) {
            OLog.e("OrangeConfigImpl", "unregisterListenerV1 error as param null", new Object[0]);
        } else if (this.b != null) {
            try {
                for (String str : strArr) {
                    this.b.unregisterListener(str, new OrangeConfigListenerStub(gVar));
                }
            } catch (Throwable th) {
                OLog.e("OrangeConfigImpl", "unregisterListenerV1", th, new Object[0]);
            }
        } else {
            OLog.w("OrangeConfigImpl", "unregisterListenerV1 fail", new Object[0]);
        }
    }

    @Override // com.taobao.orange.OrangeConfig
    public void unregisterListener(String[] strArr, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12066063", new Object[]{this, strArr, dVar});
        } else if (strArr == null || strArr.length == 0 || dVar == null) {
            OLog.e("OrangeConfigImpl", "unregisterListener error as param null", new Object[0]);
        } else if (this.b != null) {
            try {
                for (String str : strArr) {
                    this.b.unregisterListener(str, new OrangeConfigListenerStub(dVar));
                }
            } catch (Throwable th) {
                OLog.e("OrangeConfigImpl", "unregisterListener", th, new Object[0]);
            }
        } else {
            OLog.w("OrangeConfigImpl", "unregisterListener fail", new Object[0]);
        }
    }

    @Override // com.taobao.orange.OrangeConfig
    public void unregisterListener(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dca95a28", new Object[]{this, strArr});
        } else if (strArr == null || strArr.length == 0) {
            OLog.e("OrangeConfigImpl", "unregisterListeners error as namespaces is null", new Object[0]);
        } else if (this.b != null) {
            try {
                for (String str : strArr) {
                    this.b.unregisterListeners(str);
                }
            } catch (Throwable th) {
                OLog.e("OrangeConfigImpl", "unregisterListeners", th, new Object[0]);
            }
        } else {
            OLog.w("OrangeConfigImpl", "unregisterListeners fail", new Object[0]);
        }
    }

    @Override // com.taobao.orange.OrangeConfig
    public void forceCheckUpdate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b2de18d", new Object[]{this});
        } else if (this.b != null) {
            try {
                this.b.forceCheckUpdate();
            } catch (Throwable th) {
                OLog.e("OrangeConfigImpl", "forceCheckUpdate", th, new Object[0]);
            }
        } else {
            OLog.w("OrangeConfigImpl", "forceCheckUpdate fail", new Object[0]);
        }
    }

    @Override // com.taobao.orange.OrangeConfig
    public void enterForeground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc1a8d42", new Object[]{this});
        } else {
            forceCheckUpdate();
        }
    }

    @Override // com.taobao.orange.OrangeConfig
    public void setUserId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ca419d9", new Object[]{this, str});
            return;
        }
        if (str == null) {
            str = "";
        }
        if (this.b == null) {
            this.g = str;
            return;
        }
        try {
            this.b.setUserId(str);
        } catch (Throwable th) {
            OLog.e("OrangeConfigImpl", "setUserId", th, new Object[0]);
        }
    }

    @Override // com.taobao.orange.OrangeConfig
    public void addCandidate(OCandidate oCandidate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66e48a36", new Object[]{this, oCandidate});
        } else if (oCandidate == null) {
            OLog.e("OrangeConfigImpl", "addCandidate error as candidate is null", new Object[0]);
        } else {
            String a2 = oCandidate.a();
            if ("app_ver".equals(a2) || "os_ver".equals(a2) || OConstant.CANDIDATE_MANUFACTURER.equals(a2) || OConstant.CANDIDATE_BRAND.equals(a2) || OConstant.CANDIDATE_MODEL.equals(a2) || "did_hash".equals(a2)) {
                OLog.e("OrangeConfigImpl", "addCandidate fail as not allow override build-in candidate", "key", a2);
            } else if (this.b == null) {
                if (!this.k.add(oCandidate)) {
                    return;
                }
                OLog.w("OrangeConfigImpl", "addCandidate wait", "candidate", oCandidate);
            } else {
                try {
                    if (!a.b) {
                        return;
                    }
                    this.b.addCandidate(oCandidate.a(), oCandidate.b(), oCandidate.c());
                } catch (Throwable th) {
                    OLog.e("OrangeConfigImpl", "addCandidate", th, new Object[0]);
                }
            }
        }
    }

    @Override // com.taobao.orange.OrangeConfig
    public void enterBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("436c8bad", new Object[]{this});
        } else {
            OLog.e("OrangeConfigImpl", "enterBackground api is @Deprecated", new Object[0]);
        }
    }

    @Override // com.taobao.orange.OrangeConfig
    public void setAppSecret(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6199740", new Object[]{this, str});
        } else {
            OLog.e("OrangeConfigImpl", "setAppSecret api is @Deprecated, please set appSecret in init(OConfig config) api", new Object[0]);
        }
    }

    @Override // com.taobao.orange.OrangeConfig
    public void setIndexUpdateMode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("722e0920", new Object[]{this, new Integer(i)});
        } else {
            OLog.e("OrangeConfigImpl", "setIndexUpdateMode api is @Deprecated, please set indexUpdateMode in init(OConfig config) api", new Object[0]);
        }
    }

    @Override // com.taobao.orange.OrangeConfig
    public void setHosts(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6450581", new Object[]{this, list});
        } else {
            OLog.e("OrangeConfigImpl", "setHosts api is @Deprecated, please set probeHosts in init(OConfig config) api", new Object[0]);
        }
    }

    @Override // com.taobao.orange.OrangeConfig
    public void setEnableDiffIndex(boolean z) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baaa2b65", new Object[]{this, new Boolean(z)});
            return;
        }
        if (z) {
            i = 2;
        }
        a.y = i;
    }

    public void a(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        int i = 3;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("258fda74", new Object[]{this, context, new Boolean(z)});
        } else if (this.b != null) {
        } else {
            b(context);
            if (!z) {
                return;
            }
            if (this.c == null) {
                this.c = new CountDownLatch(1);
            }
            if (this.b != null) {
                return;
            }
            try {
                if (a.b) {
                    i = ((Integer) h.b(a.g, OConstant.SYSKEY_BIND_TIMEOUT, (Object) 3)).intValue();
                }
                OLog.i("OrangeConfigImpl", "syncGetBindService bindTimeout", Integer.valueOf(i));
                this.c.await(i, TimeUnit.SECONDS);
            } catch (Throwable th) {
                OLog.e("OrangeConfigImpl", "syncGetBindService", th, new Object[0]);
            }
            if (this.b == null && context != null && a.b) {
                OLog.w("OrangeConfigImpl", "syncGetBindService", "bind service timeout local stub in main process");
                this.b = new OrangeApiServiceStub(context);
                com.taobao.orange.util.d.a(OConstant.MONITOR_MODULE, OConstant.POINT_EXCEPTION, String.valueOf(System.currentTimeMillis() - 0), "101", "bind fail and start local stub");
                return;
            }
            com.taobao.orange.util.d.a(OConstant.MONITOR_MODULE, OConstant.POINT_EXCEPTION, String.valueOf(System.currentTimeMillis() - 0), "101", "bind fail in other process");
        }
    }

    private void d(Context context) {
        ConfigDO configDO;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a023673d", new Object[]{this, context});
            return;
        }
        try {
            a.d = com.taobao.orange.util.a.b(context);
            OLog.e("OrangeConfigImpl", "current process is ", "channel", Boolean.valueOf(a.d), "main", Boolean.valueOf(a.b));
            if (a.d) {
                ConfigDO configDO2 = (ConfigDO) com.taobao.orange.util.b.b(OConstant.PROCESS_ISOLATED_LOCAL_CONFIG);
                if (configDO2 != null && configDO2.content != null) {
                    String str = configDO2.content.get("processIsolated");
                    if (!TextUtils.isEmpty(str)) {
                        a.A = Boolean.parseBoolean(str);
                    }
                    String str2 = configDO2.content.get(OConstant.SYSKEY_PROCESS_QUERY);
                    if (!TextUtils.isEmpty(str2)) {
                        a.B = Boolean.parseBoolean(str2);
                    }
                    String str3 = configDO2.content.get(OConstant.SYSKEY_PROCESS_QUERY_FORBID_TIME);
                    if (!TextUtils.isEmpty(str3)) {
                        a.C = str3;
                    }
                    String str4 = configDO2.content.get(OConstant.SYSKEY_PROCESS_QUERY_STRATEGY);
                    if (!TextUtils.isEmpty(str4)) {
                        a.D = str4;
                    }
                    String str5 = configDO2.content.get(OConstant.SYSKEY_PROCESS_MEMORY_OPTIMIZE);
                    if (!TextUtils.isEmpty(str5) && "OPPO".equalsIgnoreCase(Build.BRAND)) {
                        a.H = Boolean.parseBoolean(str5);
                    }
                    com.taobao.orange.util.b.b(configDO2, OConstant.ORANGE_LOCAL_FILE);
                }
                OLog.e("OrangeConfigImpl", "channelMemoryOptimize", "enable", Boolean.valueOf(a.H));
            } else if (!a.b || (configDO = (ConfigDO) com.taobao.orange.util.b.b(OConstant.ORANGE_LOCAL_FILE)) == null || configDO.content == null) {
            } else {
                String str6 = configDO.content.get("processIsolated");
                if (TextUtils.isEmpty(str6)) {
                    return;
                }
                a.A = Boolean.parseBoolean(str6);
            }
        } catch (Throwable th) {
            OLog.e("OrangeConfigImpl", "parse from local process isolated result failed", th.toString());
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    private void b(android.content.Context r19) {
        /*
            Method dump skipped, instructions count: 576
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.orange.OrangeConfigImpl.b(android.content.Context):void");
    }

    private void b(final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else if (this.q.get()) {
        } else {
            com.taobao.orange.util.a.e(this.f18559a);
            if (a.e) {
                c();
            } else if (i < 10) {
                e.a(new Runnable() { // from class: com.taobao.orange.OrangeConfigImpl.8
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            OrangeConfigImpl.b(OrangeConfigImpl.this, i + 1);
                        }
                    }
                }, 15000L);
            } else {
                OLog.e("OrangeConfigImpl", "Reached max retry times to bind service", new Object[0]);
                e.a(new Runnable() { // from class: com.taobao.orange.OrangeConfigImpl.9
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            OrangeConfigImpl.b(OrangeConfigImpl.this, 0);
                        }
                    }
                }, 86400000L);
            }
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        try {
            if (!this.q.compareAndSet(false, true)) {
                OLog.i("OrangeConfigImpl", "channel service is binding", "isChannelProcessAlive", Boolean.valueOf(a.e));
                return;
            }
            Intent intent = new Intent(this.f18559a, OrangeBindService.class);
            intent.setAction(OrangeBindService.class.getName());
            intent.addCategory("android.intent.category.DEFAULT");
            OLog.e("OrangeConfigImpl", "bind OrangeBindService  context hashcode", Integer.valueOf(this.f18559a.hashCode()));
            if (!this.f18559a.bindService(intent, this.o, 1)) {
                OLog.e("OrangeConfigImpl", "bind OrangeBindService fail", new Object[0]);
                com.taobao.orange.util.d.a(OConstant.MONITOR_MODULE, OConstant.POINT_BIND_CHANNEL_SERVICE, "bind serviceDelayBind", "-1", "return false");
                return;
            }
            com.taobao.orange.util.d.a(OConstant.MONITOR_MODULE, OConstant.POINT_BIND_CHANNEL_SERVICE, "bind serviceDelayBind");
        } catch (Throwable th) {
            OLog.e("OrangeConfigImpl", "bind OrangeBindService exception ", th, new Object[0]);
            com.taobao.orange.util.d.a(OConstant.MONITOR_MODULE, OConstant.POINT_BIND_CHANNEL_SERVICE, "bind fail", "-2", th.getMessage());
        }
    }

    public static void a(IOrangeApiService iOrangeApiService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba9ed036", new Object[]{iOrangeApiService});
            return;
        }
        OrangeConfigImpl orangeConfigImpl = m;
        if (orangeConfigImpl == null) {
            return;
        }
        orangeConfigImpl.b(iOrangeApiService);
    }

    private void b(final IOrangeApiService iOrangeApiService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3018f677", new Object[]{this, iOrangeApiService});
        } else if (iOrangeApiService == null) {
            OLog.e("OrangeConfigImpl", "remoteService is null", new Object[0]);
            a.c = false;
            if (this.b instanceof OrangeApiServiceStub) {
                return;
            }
            OLog.e("OrangeConfigImpl", "use channel stub", new Object[0]);
            this.b = null;
            e.a(new Runnable() { // from class: com.taobao.orange.OrangeConfigImpl.10
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    if (OrangeConfigImpl.this.b == null) {
                        OrangeConfigImpl orangeConfigImpl = OrangeConfigImpl.this;
                        orangeConfigImpl.b = new OrangeApiServiceStub(orangeConfigImpl.f18559a);
                    }
                    double d = OrangeConfigImpl.this.r;
                    OrangeConfigImpl.this.r = System.currentTimeMillis();
                    com.taobao.orange.util.d.a("success", "local", OrangeConfigImpl.this.r, d);
                    OLog.e("OrangeConfigImpl", "local stub start reInit", "lastBindTime", Double.valueOf(d), "lastLocalTime", Double.valueOf(OrangeConfigImpl.this.r));
                    OrangeConfigImpl.b(OrangeConfigImpl.this);
                }
            });
        } else {
            a.c = true;
            e.a(new Runnable() { // from class: com.taobao.orange.OrangeConfigImpl.11
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        OLog.e("OrangeConfigImpl", "start replace remoteService", new Object[0]);
                        boolean z = OrangeConfigImpl.this.b instanceof OrangeApiServiceStub;
                        if (OrangeConfigImpl.this.d != null && a.c) {
                            OrangeConfigImpl.this.b = iOrangeApiService;
                            double d = OrangeConfigImpl.this.r;
                            OrangeConfigImpl.this.r = System.currentTimeMillis();
                            com.taobao.orange.util.d.a("success", com.taobao.android.weex_framework.util.a.ATOM_EXT_bind, d, OrangeConfigImpl.this.r);
                            OrangeConfigImpl.b(OrangeConfigImpl.this);
                            OLog.e("OrangeConfigImpl", "replace remoteService done", "lastLocalMode", Boolean.valueOf(z), "lastBindTime", Double.valueOf(OrangeConfigImpl.this.r), "lastLocalTime", Double.valueOf(d));
                            return;
                        }
                        OLog.e("OrangeConfigImpl", "replaceRemoteService mConfig is null or main process die, return", "isMainProcessAlive", Boolean.valueOf(a.c));
                    } catch (Throwable th) {
                        OLog.e("OrangeConfigImpl", "replaceRemoteService failed", th.toString());
                        com.taobao.orange.util.d.a("fail", com.taobao.android.weex_framework.util.a.ATOM_EXT_bind, OrangeConfigImpl.this.r, System.currentTimeMillis());
                    }
                }
            });
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.f18559a != null && this.d != null) {
            try {
                d(this.f18559a);
                a(this.f18559a, this.d);
                if (this.j.size() == 0) {
                    return;
                }
                for (Map.Entry<String, Set<OrangeConfigListenerStub>> entry : this.j.entrySet()) {
                    for (OrangeConfigListenerStub orangeConfigListenerStub : entry.getValue()) {
                        this.b.registerListener(entry.getKey(), orangeConfigListenerStub, orangeConfigListenerStub.isAppend());
                    }
                }
            } catch (Throwable th) {
                OLog.e("OrangeConfigImpl", "reInitServiceInChannel init failed", th.toString());
            }
        }
    }

    private static void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f76bb9e", new Object[]{context});
            return;
        }
        try {
            PackageManager packageManager = context.getApplicationContext().getPackageManager();
            ComponentName componentName = new ComponentName(context.getPackageName(), "com.taobao.orange.service.OrangeApiService");
            if (packageManager.getComponentEnabledSetting(componentName) != 2) {
                return;
            }
            packageManager.setComponentEnabledSetting(componentName, 1, 1);
        } catch (Throwable th) {
            OLog.e("OrangeConfigImpl", "try to change component state failed, component:com.taobao.orange.service.OrangeApiService", th, new Object[0]);
        }
    }

    @Override // com.taobao.orange.OrangeConfig
    public void fetchCriticalConfigs(Context context, String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c13770a6", new Object[]{this, context, str, str2, new Integer(i)});
        } else if (context == null || !(context instanceof Application)) {
            OLog.e("OrangeConfigImpl", "start fetch error as ctx is null", new Object[0]);
        } else if (!this.p.compareAndSet(false, true)) {
            OLog.e("OrangeConfigImpl", "has fetch critical configs, just return", new Object[0]);
        } else if (i == OConstant.ENV.TEST.getEnvMode()) {
        } else {
            int intValue = ((Integer) h.b(context, OConstant.SYSKEY_ENABLE_FETCH_CRITICAL_CONFIGS, (Object) 1)).intValue();
            a.T = intValue;
            if (intValue == 0) {
                return;
            }
            try {
                Boolean isABGlobalFeatureOpened = ABSwitchUtils.isABGlobalFeatureOpened(context, "Home_Page_SecondRefreshOpt");
                if (isABGlobalFeatureOpened == null) {
                    return;
                }
                if (isABGlobalFeatureOpened.equals(false)) {
                    return;
                }
                if (this.f18559a == null) {
                    this.f18559a = context;
                }
                a.g = this.f18559a;
                a.J = OConstant.ENV.valueOf(i);
                a.h = str;
                a.j = str2;
                ConfigCenter.getInstance().fetchCriticalConfigs(true);
            } catch (Throwable th) {
                OLog.e("OrangeConfigImpl", "get NetworkAB fail as not found networkSdk." + th, new Object[0]);
            }
        }
    }
}
