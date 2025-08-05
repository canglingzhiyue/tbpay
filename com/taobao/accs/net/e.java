package com.taobao.accs.net;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import anet.channel.AwcnConfig;
import anet.channel.CustomDataFrameCb;
import anet.channel.IAuth;
import anet.channel.ISessionListener;
import anet.channel.RequestCb;
import anet.channel.Session;
import anet.channel.SessionCenter;
import anet.channel.SessionInfo;
import anet.channel.bytes.ByteArray;
import anet.channel.entity.ConnType;
import anet.channel.entity.Event;
import anet.channel.entity.EventCb;
import anet.channel.heartbeat.IHeartbeat;
import anet.channel.request.Request;
import anet.channel.session.TnetSpdySession;
import anet.channel.statist.RequestStatistic;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.ConnProtocol;
import anet.channel.strategy.StrategyTemplate;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.phone.mobilesdk.socketcraft.monitor.MonitorItemConstants;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.IHeartBeat;
import com.taobao.accs.base.AccsConnectStateListener;
import com.taobao.accs.base.AccsConnectStateListener2;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.connection.ConnectionServiceManager;
import com.taobao.accs.connection.state.TimeMeter;
import com.taobao.accs.data.Message;
import com.taobao.accs.init.Launcher_InitAgooLifecycle;
import com.taobao.accs.internal.ACCSRestartService;
import com.taobao.accs.ut.monitor.AccsForegroundMonitor;
import com.taobao.accs.ut.monitor.NetPerformanceMonitor;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.BaseMonitor;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.accs.utl.i;
import com.taobao.accs.utl.l;
import com.taobao.accs.utl.m;
import com.taobao.aranger.exception.IPCException;
import com.taobao.search.common.util.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import tb.dcd;
import tb.dcf;
import tb.kat;
import tb.kge;
import tb.mto;
import tb.nog;

/* loaded from: classes.dex */
public class e extends com.taobao.accs.net.c implements CustomDataFrameCb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static a I;
    public static boolean J;
    public static volatile long q;
    private static final Map<String, String> z;
    private Runnable A;
    private Boolean B;
    private ISessionListener C;
    private byte[] D;
    private Runnable E;
    private Set<String> F;
    private IHeartbeat G;
    private boolean r;
    private String s;
    private long t;
    private ScheduledFuture u;
    private g v;
    private int x;
    private volatile boolean y;

    /* loaded from: classes.dex */
    public interface c {
        void a(byte[] bArr);
    }

    public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -1642240924) {
            if (hashCode != -1445565382) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            super.b(((Number) objArr[0]).intValue());
            return null;
        }
        return new Boolean(super.a((Context) objArr[0]));
    }

    public static /* synthetic */ void lambda$3k4D4DdU1wd6tFqax4CkzzxZXQ4(e eVar) {
        eVar.D();
    }

    public static /* synthetic */ void lambda$9a1jlDCB6dC5SMUhT8wk9Sx7xtk(e eVar, Context context, boolean z2) {
        eVar.b(context, z2);
    }

    public static /* synthetic */ void lambda$CefkAkE3KTpe2t7JP54ZU74rlDk(e eVar) {
        eVar.F();
    }

    /* renamed from: lambda$Uplml2Ud-L8vBwuu8ruZwLg2nbU */
    public static /* synthetic */ void m808lambda$Uplml2UdL8vBwuu8ruZwLg2nbU(e eVar) {
        eVar.E();
    }

    public static /* synthetic */ void lambda$aXIEcRqvbhz5eTXnbolsT4oQ1mQ(e eVar) {
        eVar.C();
    }

    public static /* synthetic */ a A() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("8bbb1613", new Object[0]) : I;
    }

    public static /* synthetic */ ISessionListener a(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ISessionListener) ipChange.ipc$dispatch("316a9581", new Object[]{eVar}) : eVar.C;
    }

    public static /* synthetic */ a a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("eb40173e", new Object[]{aVar});
        }
        I = aVar;
        return aVar;
    }

    public static /* synthetic */ Boolean a(e eVar, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("69f9cf3a", new Object[]{eVar, bool});
        }
        eVar.B = bool;
        return bool;
    }

    public static /* synthetic */ void a(e eVar, Context context, String str, boolean z2, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e19178fb", new Object[]{eVar, context, str, new Boolean(z2), new Integer(i), str2});
        } else {
            eVar.a(context, str, z2, i, str2);
        }
    }

    public static /* synthetic */ void a(e eVar, Context context, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe2c465c", new Object[]{eVar, context, new Boolean(z2)});
        } else {
            eVar.a(context, z2);
        }
    }

    public static /* synthetic */ void a(e eVar, TaoBaseService.ConnectInfo connectInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1911cbc7", new Object[]{eVar, connectInfo});
        } else {
            eVar.a(connectInfo);
        }
    }

    public static /* synthetic */ void a(e eVar, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("665a1284", new Object[]{eVar, new Boolean(z2)});
        } else {
            eVar.b(z2);
        }
    }

    public static /* synthetic */ void a(e eVar, byte[] bArr, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c896b62", new Object[]{eVar, bArr, cVar});
        } else {
            eVar.a(bArr, cVar);
        }
    }

    public static /* synthetic */ Boolean b(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Boolean) ipChange.ipc$dispatch("e20c956c", new Object[]{eVar}) : eVar.B;
    }

    public static /* synthetic */ boolean b(e eVar, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8fa9f709", new Object[]{eVar, new Boolean(z2)})).booleanValue();
        }
        eVar.y = z2;
        return z2;
    }

    public static /* synthetic */ String c(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("90ff7952", new Object[]{eVar}) : eVar.s;
    }

    public static /* synthetic */ g d(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("c0566713", new Object[]{eVar}) : eVar.v;
    }

    public static /* synthetic */ void e(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("216807cc", new Object[]{eVar});
        } else {
            eVar.B();
        }
    }

    public static /* synthetic */ Map z() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("b5b83476", new Object[0]) : z;
    }

    static {
        kge.a(-945985058);
        kge.a(-415630702);
        kge.a(-153806433);
        q = 0L;
        z = new LinkedHashMap<String, String>() { // from class: com.taobao.accs.net.InAppConnection$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.LinkedHashMap
            public boolean removeEldestEntry(Map.Entry<String, String> entry) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6471a6cf", new Object[]{this, entry})).booleanValue() : size() > 200;
            }
        };
    }

    public g y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("f0b466e6", new Object[]{this});
        }
        if (this.v == null) {
            ALog.e(this.s, "null SmartHb", new Object[0]);
            com.taobao.accs.utl.d.a("accs", BaseMonitor.COUNT_FULL_VERIFY, "null SmartHb", mto.a.GEO_NOT_SUPPORT);
        }
        return this.v;
    }

    public /* synthetic */ void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eff1cd", new Object[]{this});
            return;
        }
        ALog.d(g(), "sendAccsHeartbeatMessage", new Object[0]);
        try {
            ACCSManager.AccsRequest accsRequest = new ACCSManager.AccsRequest(null, null, new i.a().a("dataType", "pingreq").a("timeInterval", Long.valueOf(this.t)).a().toString().getBytes("utf-8"), UUID.randomUUID().toString());
            accsRequest.setTarget("accs-iot");
            accsRequest.setTargetServiceName("sal");
            a(Message.buildRequest(this.d, c((String) null), g(), this.j.getStoreId(), this.d.getPackageName(), Constants.TARGET_SERVICE, accsRequest, true), true);
        } catch (Exception e) {
            ALog.e(g(), "send accs heartbeat message", e, new Object[0]);
        }
    }

    public e(Context context, int i, String str, int i2) {
        super(context, i, str);
        this.s = "InAppConn_";
        this.r = true;
        this.t = 3600000L;
        this.y = true;
        this.A = new Runnable() { // from class: com.taobao.accs.net.-$$Lambda$e$CefkAkE3KTpe2t7JP54ZU74rlDk
            {
                e.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                e.lambda$CefkAkE3KTpe2t7JP54ZU74rlDk(e.this);
            }
        };
        this.B = null;
        this.C = new ISessionListener() { // from class: com.taobao.accs.net.e.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                e.this = this;
            }

            @Override // anet.channel.ISessionListener
            public void onConnectionChanged(Intent intent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("e661809b", new Object[]{this, intent});
                } else if (intent == null) {
                    ALog.e(e.this.g(), "onConnectionChanged", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "null");
                } else {
                    Context context2 = GlobalClientInfo.getContext();
                    boolean booleanExtra = intent.getBooleanExtra(Constants.KEY_CONNECT_AVAILABLE, false);
                    String stringExtra = intent.getStringExtra("host");
                    String g = e.this.g();
                    ALog.e(g, "onConnectionChanged", "currentHost", k.HTTPS_PREFIX + e.this.j.getInappHost(), "changeHost", stringExtra, "state", Boolean.valueOf(booleanExtra), "process", com.taobao.aranger.utils.c.a(), "hash", Integer.valueOf(e.this.hashCode()));
                    if (!(k.HTTPS_PREFIX + e.this.j.getInappHost()).equals(stringExtra)) {
                        return;
                    }
                    d.a(context2).b();
                    e.a(e.this, booleanExtra);
                    a(context2, booleanExtra, intent);
                }
            }

            private void a(Context context2, boolean z2, Intent intent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("72804631", new Object[]{this, context2, new Boolean(z2), intent});
                    return;
                }
                String stringExtra = intent.getStringExtra("host");
                int intExtra = intent.getIntExtra("errorCode", -1);
                String stringExtra2 = intent.getStringExtra(Constants.KEY_ERROR_DETAIL);
                boolean booleanExtra = intent.getBooleanExtra(Constants.KEY_TYPE_INAPP, false);
                boolean booleanExtra2 = intent.getBooleanExtra(Constants.KEY_CENTER_HOST, false);
                if (!AwcnConfig.isSendConnectInfoByService() && UtilityImpl.isMainProcessAlive(e.this.d)) {
                    if (UtilityImpl.isChannelProcess(context2)) {
                        e.a(e.this, context2, stringExtra, z2, intExtra, stringExtra2);
                    } else {
                        AwcnConfig.setSendConnectInfoByService(true);
                    }
                }
                a(context2, z2);
                TaoBaseService.ConnectInfo connectInfo = z2 ? new TaoBaseService.ConnectInfo(stringExtra, booleanExtra, booleanExtra2) : new TaoBaseService.ConnectInfo(stringExtra, booleanExtra, booleanExtra2, intExtra, stringExtra2);
                connectInfo.connected = z2;
                e.a(e.this, context2, z2);
                e eVar = e.this;
                e.b(eVar, e.a(eVar, Boolean.valueOf(z2)).booleanValue());
                if (!ConnectionServiceManager.getInstance().isCurProcessAllow2Connect(e.this.o)) {
                    ALog.e(e.this.g(), "onConnectionChanged not allow to notify", new Object[0]);
                    SessionCenter.getInstance(e.this.j.getAppKey()).unregisterAccsSessionListener(e.a(e.this));
                    return;
                }
                if (intent.getBooleanExtra("isSendConnectInfoByService", false)) {
                    ALog.e(e.this.g(), "onConnectionChanged, distribute message", new Object[0]);
                    com.taobao.accs.data.c.a(e.this.d, intent);
                }
                e.a(e.this, connectInfo);
            }

            private void a(Context context2, boolean z2) {
                List<String> a2;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("258fda74", new Object[]{this, context2, new Boolean(z2)});
                } else if (z2) {
                    AwcnConfig.setAccsReconnectionDelayPeriod(10000);
                    Collection<Message> a3 = e.this.f.a();
                    List<String> b2 = l.b(context2, 0, Constants.SP_FILE_NAME);
                    if (a3 != null && b2 != null && !b2.isEmpty()) {
                        for (Message message : a3) {
                            if (!message.isAck && !message.isTimeOut()) {
                                String str2 = message.serviceId;
                                if (!TextUtils.isEmpty(str2) && b2.contains(str2) && !e.z().containsKey(message.getDataId())) {
                                    e.this.a(message, 0);
                                    e.z().put(message.getDataId(), null);
                                }
                            }
                        }
                    }
                    com.taobao.accs.utl.d.a("accs", BaseMonitor.ALARM_CONNECT_RESULT, "");
                    if (UtilityImpl.isMainProcess(context2)) {
                        Launcher_InitAgooLifecycle.monitorConnected();
                    }
                    if (e.b(e.this) == null || e.b(e.this).booleanValue() || (a2 = m.a(7)) == null) {
                        return;
                    }
                    for (String str3 : a2) {
                        dcf.a().a(str3, null);
                    }
                }
            }
        };
        this.E = new Runnable() { // from class: com.taobao.accs.net.e.12
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                e.this = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    if (e.this.d == null || TextUtils.isEmpty(e.this.k())) {
                        return;
                    }
                    ALog.i(e.this.g(), "mTryStartServiceRunable bindapp", new Object[0]);
                    e.this.m();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        this.F = Collections.synchronizedSet(new HashSet());
        this.G = new IHeartbeat() { // from class: com.taobao.accs.net.e.13
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // anet.channel.heartbeat.IHeartbeat
            public void reSchedule() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("fd73a171", new Object[]{this});
                }
            }

            {
                e.this = this;
            }

            @Override // anet.channel.heartbeat.IHeartbeat
            public void start(Session session) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("6af21441", new Object[]{this, session});
                } else if (e.d(e.this) == null) {
                } else {
                    e.d(e.this).start(session);
                }
            }

            @Override // anet.channel.heartbeat.IHeartbeat
            public void stop() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("6623bb89", new Object[]{this});
                } else if (e.d(e.this) == null) {
                } else {
                    e.d(e.this).stop();
                }
            }
        };
        f(str);
        b(i2);
        com.taobao.accs.common.a.a().schedule(this.E, 120000L, TimeUnit.MILLISECONDS);
    }

    private void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("669e4a77", new Object[]{this, str});
            return;
        }
        this.s += str;
        this.v = new g(this, p);
    }

    @Override // com.taobao.accs.net.c
    public synchronized void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        ALog.e(g(), "start", new Object[0]);
        if (a(this.d)) {
            this.r = true;
        }
    }

    private void a(final Context context, final String str, final boolean z2, final int i, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e5913e3", new Object[]{this, context, str, new Boolean(z2), new Integer(i), str2});
        } else {
            com.taobao.accs.common.a.a(new Runnable() { // from class: com.taobao.accs.net.e.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    e.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    boolean z3 = true;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (!com.taobao.accs.connection.state.a.a().a(context)) {
                    } else {
                        try {
                            ALog.e(e.c(e.this), "sendConnectInfoToAccsByService", new Object[0]);
                            Intent intent = new Intent(Constants.ACTION_RECEIVE);
                            intent.setPackage(context.getPackageName());
                            intent.setClassName(context, com.taobao.accs.utl.c.msgService);
                            intent.putExtra("command", 103);
                            intent.putExtra("host", str);
                            intent.putExtra(Constants.KEY_CENTER_HOST, true);
                            if (!z2) {
                                intent.putExtra("errorCode", i);
                                intent.putExtra(Constants.KEY_ERROR_DETAIL, str2);
                            }
                            intent.putExtra(Constants.KEY_CONNECT_AVAILABLE, z2);
                            intent.putExtra(Constants.KEY_TYPE_INAPP, true);
                            if (com.taobao.accs.connection.state.a.a().a(context)) {
                                z3 = false;
                            }
                            intent.putExtra(Constants.KEY_INVOKE_MAIN, z3);
                            dcd.a(context, intent);
                        } catch (Throwable th) {
                            ALog.e(e.c(e.this), "sendConnectInfoToAccsByService err", th, new Object[0]);
                        }
                    }
                }
            }, com.taobao.accs.utl.a.a() ? 1000L : 500L, TimeUnit.MILLISECONDS);
        }
    }

    private void b(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z2)});
        } else if (!b()) {
        } else {
            if (!z2) {
                try {
                    if (p == 1 && UtilityImpl.isNetworkConnected(this.d) && q > 0) {
                        long elapsedRealtime = SystemClock.elapsedRealtime() - q;
                        if (elapsedRealtime >= 10000 && elapsedRealtime <= 11000) {
                            com.taobao.accs.utl.d.a("accs", BaseMonitor.COUNT_FAKE_CONN, MonitorItemConstants.WS_MONITOR_TITLE_CONN, mto.a.GEO_NOT_SUPPORT);
                            ALog.e(g(), "fake connection", new Object[0]);
                        }
                    }
                } catch (Throwable th) {
                    ALog.e(g(), "connectionMonitor error", th, new Object[0]);
                    com.taobao.accs.utl.d.a("accs", BaseMonitor.COUNT_VERIFY, "connectionMonitor", mto.a.GEO_NOT_SUPPORT);
                    return;
                }
            }
            if ((this.B != null && this.B.booleanValue() == z2) || !"default".equals(this.o)) {
                return;
            }
            if (z2) {
                AccsForegroundMonitor.online(this.d);
            } else {
                AccsForegroundMonitor.offline();
            }
            if (!UtilityImpl.isChannelProcess(this.d)) {
                return;
            }
            ACCSRestartService.a(this.d);
        }
    }

    private void a(final Context context, final boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("258fda74", new Object[]{this, context, new Boolean(z2)});
        } else if (!J) {
        } else {
            com.taobao.accs.common.a.a(new Runnable() { // from class: com.taobao.accs.net.-$$Lambda$e$9a1jlDCB6dC5SMUhT8wk9Sx7xtk
                {
                    e.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    e.lambda$9a1jlDCB6dC5SMUhT8wk9Sx7xtk(e.this, context, z2);
                }
            }, 100L, TimeUnit.MILLISECONDS);
        }
    }

    public /* synthetic */ void b(Context context, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a78a2b5", new Object[]{this, context, new Boolean(z2)});
        } else if (!UtilityImpl.isChannelProcess(context) || !com.taobao.accs.connection.state.a.a().a(context)) {
        } else {
            ALog.e(g(), "notifyConnectionChanged2Main", new Object[0]);
            Intent intent = new Intent(Constants.ACTION_CHANNEL_CONNECTION_CHANGED);
            intent.setClassName(context.getPackageName(), com.taobao.accs.utl.c.msgService);
            intent.putExtra(com.taobao.android.msoa.c.TAG, z2);
            dcd.a(context, intent);
            J = false;
        }
    }

    private void a(TaoBaseService.ConnectInfo connectInfo) {
        ArrayList<AccsConnectStateListener> r;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d90d1caf", new Object[]{this, connectInfo});
            return;
        }
        if (m.u()) {
            r = GlobalClientInfo.getInstance(this.d).getConnectionListenerList(this.o);
        } else {
            r = r();
        }
        ArrayList arrayList = null;
        Iterator<AccsConnectStateListener> it = r.iterator();
        while (it.hasNext()) {
            AccsConnectStateListener next = it.next();
            try {
                if (connectInfo.connected) {
                    next.onConnected(connectInfo);
                } else {
                    next.onDisconnected(connectInfo);
                }
            } catch (Exception e) {
                ALog.e(g(), "onConnectionChanged callback error", e, new Object[0]);
                if (e instanceof IPCException) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(next);
                }
            }
        }
        if (arrayList == null || com.taobao.accs.connection.state.a.a().a(this.d)) {
            return;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            b((AccsConnectStateListener) it2.next());
        }
    }

    @Override // com.taobao.accs.net.c
    public void a(final Message message, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cd88469", new Object[]{this, message, new Boolean(z2)});
        } else if (!c(message, z2)) {
        } else {
            if (!this.r || message == null) {
                String g = g();
                ALog.e(g, "not running or msg null! " + this.r, new Object[0]);
                return;
            }
            c();
            ScheduledThreadPoolExecutor c2 = b() ? com.taobao.accs.common.a.c() : com.taobao.accs.common.a.d();
            try {
                if (!(a() && Constants.TARGET_SYNC.equals(message.getTarget())) && c2.getQueue().size() > 1000) {
                    throw new RejectedExecutionException("accs");
                }
                if (UtilityImpl.isServiceIdPrintLog(message.serviceId)) {
                    ALog.e(g(), "sendMessage schedule", "dataId", message.getDataId());
                }
                ScheduledFuture<?> schedule = c2.schedule(new Runnable() { // from class: com.taobao.accs.net.InAppConnection$4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* JADX WARN: Removed duplicated region for block: B:77:0x02a5  */
                    /* JADX WARN: Removed duplicated region for block: B:90:0x02f3  */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public void run() {
                        /*
                            Method dump skipped, instructions count: 1053
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.net.InAppConnection$4.run():void");
                    }
                }, message.delyTime, TimeUnit.MILLISECONDS);
                if (message.getType() == 1 && message.cunstomDataId != null) {
                    if (message.isControlFrame() && b(message.cunstomDataId)) {
                        this.f.b(message);
                    }
                    this.f.f8234a.put(message.cunstomDataId, schedule);
                }
                NetPerformanceMonitor netPermanceMonitor = message.getNetPermanceMonitor();
                if (netPermanceMonitor == null) {
                    return;
                }
                netPermanceMonitor.setConnType(this.c);
                netPermanceMonitor.onEnterQueueData();
            } catch (RejectedExecutionException unused) {
                this.f.a(message, 70008);
                String g2 = g();
                ALog.e(g2, "send queue full count:" + c2.getQueue().size(), "dataId", message.dataId);
            } catch (Throwable th) {
                this.f.a(message, -8);
                ALog.e(g(), "send error", th, new Object[0]);
            }
        }
    }

    private boolean c(Message message, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("556f52b", new Object[]{this, message, new Boolean(z2)})).booleanValue();
        }
        if (!ConnectionServiceManager.getInstance().isCurProcessAllow2Connect(this.o)) {
            if (UtilityImpl.isChannelProcess(this.d)) {
                ALog.e(g(), "send in main", new Object[0]);
                Intent intent = new Intent(Constants.ACTION_SENDMESSAGE_INMAIN);
                intent.setClassName(this.d.getPackageName(), com.taobao.accs.utl.c.msgService);
                intent.putExtra("m", message);
                intent.putExtra(com.taobao.android.msoa.c.TAG, z2);
                intent.putExtra("tag", this.o);
                dcd.a(this.d, intent);
                return false;
            } else if (UtilityImpl.isMainProcess(this.d)) {
                try {
                    ConnectionServiceManager connectionServiceManager = ConnectionServiceManager.getInstance();
                    if (!connectionServiceManager.isProxyConnection(this.o) && connectionServiceManager.isAllWeather(this.o)) {
                        ALog.e(g(), "force-proxy conn", new Object[0]);
                        connectionServiceManager.onChannelConnectionChanged(true);
                    }
                    if (message.retryTimes > 9) {
                        ALog.e(g(), "reject msg, retryTimes > 9", new Object[0]);
                        com.taobao.accs.utl.d.a("accs", BaseMonitor.COUNT_RETRY_MULTI, message.getDataId(), message.retryTimes);
                        return false;
                    }
                    message.retryTimes++;
                    ALog.e(g(), "send in channel", new Object[0]);
                    connectionServiceManager.getConnectionWrapper(this.o).send(message, z2);
                    return false;
                } catch (IPCException unused) {
                    ALog.e(g(), "not running or msg null! " + this.r, new Object[0]);
                }
            }
        }
        return true;
    }

    @Override // com.taobao.accs.net.c
    public void a(final String str, final boolean z2, long j) {
        ScheduledThreadPoolExecutor a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35a2622", new Object[]{this, str, new Boolean(z2), new Long(j)});
            return;
        }
        Runnable runnable = new Runnable() { // from class: com.taobao.accs.net.e.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                e.this = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                Message a3 = e.this.f.a(str);
                if (a3 == null) {
                    return;
                }
                e.this.f.a(a3, -9);
                e.this.a(str, z2, "receive data time out");
                String g = e.this.g();
                ALog.e(g, str + "-> receive data time out!", new Object[0]);
            }
        };
        if (a()) {
            a2 = com.taobao.accs.common.a.b();
        } else {
            a2 = com.taobao.accs.common.a.a();
        }
        a2.schedule(runnable, j, TimeUnit.MILLISECONDS);
    }

    @Override // com.taobao.accs.net.c
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        ALog.e(g(), "shut down", new Object[0]);
        this.r = false;
    }

    @Override // com.taobao.accs.net.c
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.g = 0;
        }
    }

    @Override // com.taobao.accs.net.c
    public void a(boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z2), new Boolean(z3)});
        } else {
            com.taobao.accs.common.a.c().execute(new Runnable() { // from class: com.taobao.accs.net.-$$Lambda$e$Uplml2Ud-L8vBwuu8ruZwLg2nbU
                {
                    e.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    e.m808lambda$Uplml2UdL8vBwuu8ruZwLg2nbU(e.this);
                }
            });
        }
    }

    public /* synthetic */ void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e1da4c", new Object[]{this});
        } else if (!this.h) {
        } else {
            if (!ConnectionServiceManager.getInstance().isCurProcessAllow2Connect(this.o)) {
                ALog.e(g(), "Current process is not allowed to ping", new Object[0]);
                return;
            }
            try {
                a(SessionCenter.getInstance(this.j.getAppKey()), this.j.getInappHost(), this.j.isKeepalive());
                Session b2 = com.taobao.accs.net.a.b(SessionCenter.getInstance(this.j.getAppKey()), c((String) null), ConnType.TypeLevel.SPDY, 0L, this.o);
                ALog.e(g(), "try session ping", MspGlobalDefine.SESSION, b2);
                if (b2 == null) {
                    return;
                }
                int pingTimeout = this.j.getPingTimeout();
                if (m.k()) {
                    com.taobao.accs.net.a.a(b2, Integer.valueOf(pingTimeout));
                } else if (pingTimeout > 0) {
                    b2.ping(true, pingTimeout);
                } else {
                    b2.ping(true);
                }
            } catch (Exception e) {
                ALog.e(g(), "ping error", e, new Object[0]);
            }
        }
    }

    @Override // com.taobao.accs.net.c
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        ALog.e(g(), "close", new Object[0]);
        try {
            SessionCenter.getInstance(this.j.getAppKey()).unregisterAccsSessionListener(this.C);
        } catch (Exception e) {
            ALog.e(g(), "close error", e, new Object[0]);
        }
    }

    @Override // com.taobao.accs.net.c
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        ALog.e(g(), "registerSessionListener", new Object[0]);
        try {
            SessionCenter.getInstance(this.j.getAppKey()).registerAccsSessionListener(this.C);
        } catch (Throwable th) {
            ALog.e(g(), "registerSessionListener err", th, new Object[0]);
        }
    }

    @Override // com.taobao.accs.net.c
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        try {
            if (!p()) {
                return;
            }
            Session b2 = com.taobao.accs.net.a.b(SessionCenter.getInstance(this.j.getAppKey()), c((String) null), 0L, this.o);
            ALog.e(g(), "reConnecting", "appkey", this.j.getAppKey(), "host", this.j.getInappHost(), MspGlobalDefine.SESSION, b2);
            if (b2 == null) {
                return;
            }
            AwcnConfig.setAccsReconnectionDelayPeriod(0);
            b2.close(true);
        } catch (Exception e) {
            ALog.e(g(), "reConnect error", e, new Object[0]);
        }
    }

    @Override // com.taobao.accs.net.c
    public void a(String str, boolean z2, String str2) {
        Session b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3b0622c", new Object[]{this, str, new Boolean(z2), str2});
            return;
        }
        try {
            Message b3 = this.f.b(str);
            if (b3 == null || b3.host == null || (b2 = com.taobao.accs.net.a.b(SessionCenter.getInstance(this.j.getAppKey()), b3.host.toString(), 0L, this.o)) == null) {
                return;
            }
            if (z2) {
                ALog.e(g(), "close session by time out", new Object[0]);
                b2.close(true);
                return;
            }
            b2.ping(true);
        } catch (Exception e) {
            ALog.e(g(), "onTimeOut", e, new Object[0]);
        }
    }

    @Override // anet.channel.CustomDataFrameCb
    public void onDataReceive(final TnetSpdySession tnetSpdySession, byte[] bArr, final int i, final int i2, int i3, final Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2636add6", new Object[]{this, tnetSpdySession, bArr, new Integer(i), new Integer(i2), new Integer(i3), map});
            return;
        }
        if (ALog.isPrintLog(ALog.Level.E)) {
            ALog.e(g(), "onDataReceive", "type", Integer.valueOf(i2), "dataid", Integer.valueOf(i));
        }
        AccsForegroundMonitor.refreshOnlineTime(this.d);
        if (m.b() && a() && i3 != bArr.length) {
            bArr = Arrays.copyOf(bArr, i3);
        }
        final byte[] bArr2 = bArr;
        if (this.v != null) {
            if (a()) {
                if (TimeMeter.a(TimeMeter.TAG_MSG_RESCHEDULE_HB, 5000L)) {
                    this.v.b();
                }
            } else if (!m.r()) {
                this.v.reSchedule();
            }
        }
        if (map != null) {
            map.put(Constants.KEY_DATA_RECEIVED_TIME, Long.valueOf(t()));
        }
        final long currentTimeMillis = System.currentTimeMillis();
        (b() ? com.taobao.accs.common.a.a() : com.taobao.accs.common.a.i()).execute(new Runnable() { // from class: com.taobao.accs.net.e.10
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                e.this = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ALog.e(e.this.g(), "onDataScheduled", "dataid", Integer.valueOf(i), "frameType", Integer.valueOf(i2));
                if (i2 == 200 || (e.this.a() && i2 == 202)) {
                    try {
                        e.this.f.a(bArr2, tnetSpdySession.getHost(), currentTimeMillis, map);
                    } catch (Throwable th) {
                        ALog.e(e.this.g(), "onDataScheduled err", th, new Object[0]);
                    }
                } else if (e.this.a() && i2 == 201) {
                    e.a(e.this, bArr2, new c() { // from class: com.taobao.accs.net.e.10.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        {
                            AnonymousClass10.this = this;
                        }

                        @Override // com.taobao.accs.net.e.c
                        public void a(byte[] bArr3) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c19672f", new Object[]{this, bArr3});
                                return;
                            }
                            try {
                                e.this.f.a(bArr3, tnetSpdySession.getHost(), currentTimeMillis, map);
                            } catch (Throwable th2) {
                                ALog.e(e.this.g(), "onDataScheduled2 err", th2, new Object[0]);
                                com.taobao.accs.utl.d.a("accs", BaseMonitor.COUNT_VERIFY, "onDataScheduled2", mto.a.GEO_NOT_SUPPORT);
                            }
                        }
                    });
                } else {
                    String g = e.this.g();
                    ALog.e(g, "drop frame len:" + bArr2.length + " frameType" + i2, new Object[0]);
                }
            }
        });
    }

    private void a(byte[] bArr, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51985a4a", new Object[]{this, bArr, cVar});
            return;
        }
        byte[] bArr2 = this.D;
        if (bArr2 == null) {
            this.D = b(bArr, cVar);
            return;
        }
        byte[] bArr3 = new byte[bArr2.length + bArr.length];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, 0, bArr3, this.D.length, bArr.length);
        this.D = b(bArr3, cVar);
    }

    private byte[] b(byte[] bArr, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("5f4aabd4", new Object[]{this, bArr, cVar});
        }
        while (bArr != null && bArr.length >= 4) {
            int i = ((bArr[2] & 255) << 8) | ((bArr[3] & 255) + 4);
            if (i == bArr.length) {
                cVar.a(bArr);
                return null;
            } else if (i > bArr.length) {
                return bArr;
            } else {
                cVar.a(Arrays.copyOf(bArr, i));
                byte[] bArr2 = new byte[bArr.length - i];
                System.arraycopy(bArr, i, bArr2, 0, bArr2.length);
                if (bArr2.length <= 0) {
                    return null;
                }
                bArr = bArr2;
            }
        }
        return bArr;
    }

    @Override // anet.channel.CustomDataFrameCb
    public void onException(final int i, final int i2, final boolean z2, String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bce0ebe", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z2), str, map});
            return;
        }
        String g = g();
        ALog.e(g, "errorId:" + i2 + "detail:" + str + " dataId:" + i + " needRetry:" + z2, new Object[0]);
        com.taobao.accs.common.a.a().execute(new Runnable() { // from class: com.taobao.accs.net.e.11
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                e.this = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                Message b2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                int i3 = i;
                if (i3 > 0) {
                    Message.Id id = new Message.Id(i3, "");
                    Message.Id id2 = null;
                    Iterator<Message.Id> it = e.this.f.b().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Message.Id next = it.next();
                        if (next.equals(id)) {
                            id2 = next;
                            break;
                        }
                    }
                    if (id2 != null && (b2 = e.this.f.b(id2.getDataId())) != null) {
                        if (z2) {
                            if (!e.this.a(b2, 2000)) {
                                e.this.f.a(b2, i2);
                            }
                            if (b2.getNetPermanceMonitor() != null) {
                                com.taobao.accs.utl.d.a("accs", BaseMonitor.COUNT_POINT_RESEND, "total_tnet", mto.a.GEO_NOT_SUPPORT);
                            }
                        } else {
                            e.this.f.a(b2, i2);
                        }
                    }
                }
                int i4 = i;
                if (i4 >= 0 || !z2) {
                    return;
                }
                e.this.a(i4);
            }
        });
    }

    @Override // com.taobao.accs.net.c
    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue();
        }
        if (str == null) {
            return false;
        }
        ScheduledFuture<?> scheduledFuture = this.f.f8234a.get(str);
        boolean cancel = scheduledFuture != null ? scheduledFuture.cancel(false) : false;
        if (cancel) {
            ALog.e(g(), "cancel", "customDataId", str);
        }
        return cancel;
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32861656", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
            ALog.e(g(), "onReceiveAccsHeartbeatResp response data is null", new Object[0]);
        } else {
            if (ALog.isPrintLog(ALog.Level.I)) {
                ALog.i(g(), "onReceiveAccsHeartbeatResp", "data", jSONObject);
            }
            try {
                int i = jSONObject.getInt("timeInterval");
                if (i == -1) {
                    if (this.u == null) {
                        return;
                    }
                    this.u.cancel(true);
                    return;
                }
                long j = i * 1000;
                if (this.t == j) {
                    return;
                }
                if (i == 0) {
                    j = 3600000;
                }
                this.t = j;
                if (this.u != null) {
                    this.u.cancel(true);
                }
                this.u = com.taobao.accs.common.a.a().scheduleAtFixedRate(this.A, this.t, this.t, TimeUnit.MILLISECONDS);
            } catch (JSONException e) {
                ALog.e(g(), "onReceiveAccsHeartbeatResp", "e", e.getMessage());
            }
        }
    }

    @Override // com.taobao.accs.net.c
    public String g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this}) : this.s;
    }

    @Override // com.taobao.accs.net.c
    public boolean a(Context context) {
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{this, context})).booleanValue();
        }
        try {
        } catch (Throwable th) {
            ALog.e(g(), "initAwcn", th, new Object[0]);
        }
        if (this.h) {
            return true;
        }
        if (!ConnectionServiceManager.getInstance().isCurProcessAllow2Connect(this.o)) {
            return false;
        }
        super.a(context);
        if (!UtilityImpl.isMainProcessAlive(context) || UtilityImpl.isChannelProcess(context)) {
            AwcnConfig.setSendConnectInfoByService(false);
            if (!UtilityImpl.isChannelProcess(context)) {
                ALog.e(g(), "setSendConnectInfoByService(false)", new Object[0]);
                com.taobao.accs.utl.d.a("accs", BaseMonitor.COUNT_VERIFY, "setSendConnectInfoByService", mto.a.GEO_NOT_SUPPORT);
            }
        }
        ALog.e(g(), "register accs session listener", new Object[0]);
        SessionCenter.getInstance(this.j.getAppKey()).registerAccsSessionListener(this.C);
        String inappHost = this.j.getInappHost();
        if (!i() || !this.j.isKeepalive()) {
            ALog.d(g(), "initAwcn close keepalive", new Object[0]);
            z2 = false;
        } else {
            z2 = true;
        }
        AwcnConfig.setAccsSessionCreateForbiddenInBg(false);
        a(SessionCenter.getInstance(this.j.getAppKey()), inappHost, z2);
        this.h = true;
        ALog.e(g(), "initAwcn success!", new Object[0]);
        return true;
    }

    public void a(SessionCenter sessionCenter, String str, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90c9bf7f", new Object[]{this, sessionCenter, str, new Boolean(z2)});
        } else if (!ConnectionServiceManager.getInstance().isCurProcessAllow2Connect(this.o)) {
            ALog.e(g(), "current process is not allowed to connect", new Object[0]);
        } else if (this.F.contains(str)) {
        } else {
            if (this.v == null) {
                this.v = new g(this, p);
                kat.a("accs", BaseMonitor.COUNT_FULL_VERIFY, "smart init", mto.a.GEO_NOT_SUPPORT);
            }
            sessionCenter.registerSessionInfo(SessionInfo.create(str, z2, true, (IAuth) new b(this, str), this.G, (CustomDataFrameCb) this));
            sessionCenter.registerPublicKey(str, this.j.getInappPubKey());
            this.F.add(str);
            ALog.e(g(), "registerSessionInfo", "host", str);
        }
    }

    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69459fd", new Object[]{this});
            return;
        }
        String inappHost = this.j.getInappHost();
        SessionCenter sessionCenter = SessionCenter.getInstance(this.j.getAppKey());
        if (sessionCenter == null) {
            ALog.w(g(), "updateConfig not need update", new Object[0]);
            return;
        }
        sessionCenter.unregisterSessionInfo(inappHost);
        ALog.w(g(), "updateConfig unregisterSessionInfo", "host", inappHost);
        if (!this.F.contains(inappHost)) {
            return;
        }
        this.F.remove(inappHost);
        ALog.w(g(), "updateConfig removeSessionRegistered", "oldHost", inappHost);
    }

    public void a(AccsClientConfig accsClientConfig) {
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("798e3e6e", new Object[]{this, accsClientConfig});
        } else if (accsClientConfig == null) {
            ALog.i(g(), "updateConfig null", new Object[0]);
        } else if (accsClientConfig.equals(this.j)) {
            ALog.w(g(), "updateConfig not any changed", new Object[0]);
        } else {
            ALog.e(g(), "updateConfig", "config", accsClientConfig);
            if (!this.h) {
                this.j = accsClientConfig;
                a(this.d);
                return;
            }
            try {
                ALog.w(g(), "updateConfig", "old", this.j, "new", accsClientConfig);
                String inappHost = accsClientConfig.getInappHost();
                SessionCenter sessionCenter = SessionCenter.getInstance(this.j.getAppKey());
                if (sessionCenter == null) {
                    ALog.w(g(), "updateConfig not need update", new Object[0]);
                    return;
                }
                v();
                this.j = accsClientConfig;
                if (!TextUtils.isEmpty(this.b) && !this.b.equals(this.j.getAppKey())) {
                    com.taobao.accs.utl.d.a("accs", BaseMonitor.COUNT_APPKEY_CHANGED, "", mto.a.GEO_NOT_SUPPORT);
                }
                this.b = this.j.getAppKey();
                this.o = this.j.getTag();
                String str = ConnType.PK_ACS;
                if (this.j.getInappPubKey() == 10 || this.j.getInappPubKey() == 11) {
                    str = "open";
                }
                ALog.i(g(), "update config register new conn protocol host:", this.j.getInappHost());
                StrategyTemplate.getInstance().registerConnProtocol(this.j.getInappHost(), ConnProtocol.valueOf(ConnType.HTTP2, ConnType.RTT_0, str, false));
                if (!i() || !this.j.isKeepalive()) {
                    ALog.i(g(), "updateConfig close keepalive", new Object[0]);
                    z2 = false;
                }
                a(sessionCenter, inappHost, z2);
            } catch (Throwable th) {
                ALog.e(g(), "updateConfig", th, new Object[0]);
            }
        }
    }

    public void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a2717e", new Object[]{this});
            return;
        }
        ALog.e(this.s, "onPingSuccess", new Object[0]);
        this.x = 0;
        q = 0L;
        AccsForegroundMonitor.refreshOnlineTime(this.d);
        if (this.v != null && !m.r() && this.v.a()) {
            this.v.a(false);
        }
        ACCSRestartService.a(this.d);
        com.taobao.accs.common.a.f().execute(new Runnable() { // from class: com.taobao.accs.net.-$$Lambda$e$3k4D4DdU1wd6tFqax4CkzzxZXQ4
            {
                e.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                e.lambda$3k4D4DdU1wd6tFqax4CkzzxZXQ4(e.this);
            }
        });
    }

    public /* synthetic */ void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d3c2cb", new Object[]{this});
            return;
        }
        List<IHeartBeat> s = s();
        if (s == null) {
            ALog.e(this.s, "onPingSuccess, empty listener", new Object[0]);
            return;
        }
        for (IHeartBeat iHeartBeat : s) {
            try {
                iHeartBeat.onPingSuccess(this.o);
            } catch (IPCException e) {
                ALog.e(this.s, "onPingSuccess callback err", e, new Object[0]);
            }
        }
    }

    public void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b088ff", new Object[]{this});
            return;
        }
        ALog.e(this.s, "onPingTimeout", new Object[0]);
        this.x++;
        if (this.v != null && this.x >= 3 && m.j()) {
            this.v.a(true);
        }
        if (NetworkStatusHelper.isConnected() && !o() && b()) {
            ALog.e(this.s, "bg fake connection", new Object[0]);
            com.taobao.accs.utl.d.a("accs", BaseMonitor.COUNT_FAKE_CONN, "conn_bg", mto.a.GEO_NOT_SUPPORT);
        }
        com.taobao.accs.common.a.f().execute(new Runnable() { // from class: com.taobao.accs.net.-$$Lambda$e$aXIEcRqvbhz5eTXnbolsT4oQ1mQ
            {
                e.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                e.lambda$aXIEcRqvbhz5eTXnbolsT4oQ1mQ(e.this);
            }
        });
    }

    public /* synthetic */ void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c5ab4a", new Object[]{this});
            return;
        }
        List<IHeartBeat> s = s();
        if (s == null) {
            return;
        }
        for (IHeartBeat iHeartBeat : s) {
            try {
                iHeartBeat.onPingTimeout(this.o);
            } catch (IPCException e) {
                ALog.e(this.s, "onPingSuccess callback err", e, new Object[0]);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b implements IAuth {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        private String f8278a;
        private String b;
        private e c;
        private String d;

        static {
            kge.a(474656974);
            kge.a(1740176978);
        }

        public static /* synthetic */ String a(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e01b00e", new Object[]{bVar}) : bVar.b;
        }

        public static /* synthetic */ void a(b bVar, Session session, IAuth.AuthCallback authCallback) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6c8b56f8", new Object[]{bVar, session, authCallback});
            } else {
                bVar.a(session, authCallback);
            }
        }

        public static /* synthetic */ e b(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("b743f9d9", new Object[]{bVar}) : bVar.c;
        }

        public b(e eVar, String str) {
            this.b = eVar.g();
            this.c = eVar;
            this.d = str;
        }

        @Override // anet.channel.IAuth
        public void auth(final Session session, final IAuth.AuthCallback authCallback) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cd6ac6fb", new Object[]{this, session, authCallback});
                return;
            }
            a(session);
            if (l.r(this.c.d)) {
                e eVar = this.c;
                session.request(new Request.Builder().setUrl(eVar.e(k.HTTPS_PREFIX + this.d + "/")).build(), new RequestCb() { // from class: com.taobao.accs.net.e.b.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // anet.channel.RequestCb
                    public void onDataReceive(ByteArray byteArray, boolean z) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("a65ed612", new Object[]{this, byteArray, new Boolean(z)});
                        }
                    }

                    @Override // anet.channel.RequestCb
                    public void onFinish(int i, String str, RequestStatistic requestStatistic) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("c490acd4", new Object[]{this, new Integer(i), str, requestStatistic});
                        }
                    }

                    {
                        b.this = this;
                    }

                    @Override // anet.channel.RequestCb
                    public void onResponseCode(int i, Map<String, List<String>> map) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("38c34976", new Object[]{this, new Integer(i), map});
                            return;
                        }
                        ALog.e(b.a(b.this), "getRegId resp", "httpStatusCode", Integer.valueOf(i));
                        String str = null;
                        try {
                            if (i == 200) {
                                Map<String, String> header = UtilityImpl.getHeader(map);
                                if (l.r(b.b(b.this).d)) {
                                    str = header.get(Constants.KEY_X_REGID);
                                    com.taobao.accs.utl.d.a("accs", BaseMonitor.COUNT_POINT_REGID_ONLINE, "get regId by online", mto.a.GEO_NOT_SUPPORT);
                                }
                            }
                            if (TextUtils.isEmpty(str)) {
                                str = UtilityImpl.createRegId();
                                com.taobao.accs.utl.d.a("accs", BaseMonitor.COUNT_POINT_REGID_NATIVE, "get regId by native", mto.a.GEO_NOT_SUPPORT);
                            }
                            if (!TextUtils.isEmpty(str)) {
                                synchronized (e.class) {
                                    if (l.r(b.b(b.this).d)) {
                                        l.c(b.b(b.this).d, str);
                                    }
                                }
                            }
                        } catch (Exception e) {
                            com.taobao.accs.utl.d.a("accs", BaseMonitor.COUNT_POINT_REGID_EXCEPTION, "get regId exception: " + e.getMessage(), mto.a.GEO_NOT_SUPPORT);
                            ALog.e(b.a(b.this), "get regId error", e, new Object[0]);
                        } finally {
                            b.a(b.this, session, authCallback);
                        }
                    }
                });
                return;
            }
            com.taobao.accs.utl.d.a("accs", BaseMonitor.COUNT_POINT_REGID_DISABLE, "regId disable", mto.a.GEO_NOT_SUPPORT);
            a(session, authCallback);
        }

        private void a(Session session, final IAuth.AuthCallback authCallback) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1c195ca2", new Object[]{this, session, authCallback});
            } else if (!ConnectionServiceManager.getInstance().isCurProcessAllow2Connect(this.c.o)) {
                if (session != null) {
                    session.close();
                }
                ALog.e(this.b, "current process is not allowed to startAuthRequest", new Object[0]);
            } else {
                this.c.c();
                e eVar = this.c;
                this.f8278a = eVar.d(k.HTTPS_PREFIX + this.d + "/accs/");
                ALog.e(this.b, "auth", "utdid", UtilityImpl.getDeviceId(this.c.d), "hash", Integer.valueOf(hashCode()), MonitorItemConstants.KEY_URL, this.f8278a);
                final int i = com.taobao.accs.net.c.p;
                Request build = new Request.Builder().setUrl(this.f8278a).build();
                final long elapsedRealtime = SystemClock.elapsedRealtime();
                session.request(build, new RequestCb() { // from class: com.taobao.accs.net.e.b.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // anet.channel.RequestCb
                    public void onDataReceive(ByteArray byteArray, boolean z) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("a65ed612", new Object[]{this, byteArray, new Boolean(z)});
                        }
                    }

                    {
                        b.this = this;
                    }

                    @Override // anet.channel.RequestCb
                    public void onResponseCode(int i2, Map<String, List<String>> map) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("38c34976", new Object[]{this, new Integer(i2), map});
                            return;
                        }
                        if (i2 == 200) {
                            long elapsedRealtime2 = SystemClock.elapsedRealtime();
                            if (b.b(b.this).b()) {
                                com.taobao.accs.utl.d.a("accs", BaseMonitor.COUNT_FAKE_CONN, "auth", mto.a.GEO_NOT_SUPPORT);
                            }
                            authCallback.onAuthSuccess();
                            if (l.b()) {
                                if (com.taobao.accs.net.c.p == 0) {
                                    if (i == com.taobao.accs.net.c.p) {
                                        b.b(b.this).a(true);
                                    }
                                    ALog.e(b.a(b.this), "sendServerPingSignal after auth", new Object[0]);
                                    e.d(b.b(b.this)).b(true);
                                }
                            }
                            e.e(b.b(b.this));
                            try {
                                long parseLong = Long.parseLong(map.get("x-auth-time").get(0)) - ((elapsedRealtime + elapsedRealtime2) / 2);
                                long abs = Math.abs(parseLong - com.taobao.accs.net.c.e);
                                ALog.e(b.a(b.this), "time sync", "deltaTime", Long.valueOf(parseLong), "timeDiff", Long.valueOf(abs), "authSpentTime", Long.valueOf(elapsedRealtime2 - elapsedRealtime));
                                com.taobao.accs.utl.d.a("accs", "delta_time", "", abs);
                                com.taobao.accs.net.c.e = parseLong;
                            } catch (Exception e) {
                                ALog.e(b.a(b.this), "parse aserver date err", e, new Object[0]);
                            }
                        } else {
                            authCallback.onAuthFail(i2, "auth fail");
                        }
                        Map<String, String> header = UtilityImpl.getHeader(map);
                        if (ALog.isPrintLog(ALog.Level.D)) {
                            ALog.d(b.a(b.this), "auth", "header", header);
                        }
                        String str = header.get("x-at");
                        if (!TextUtils.isEmpty(str)) {
                            b.b(b.this).l = str;
                        }
                        b.b(b.this).m = header.get("x-gw-unit");
                        ALog.e(b.a(b.this), "aserver info", "via", header.get("via"), nog.PRICE_UNIT, b.b(b.this).m);
                    }

                    @Override // anet.channel.RequestCb
                    public void onFinish(int i2, String str, RequestStatistic requestStatistic) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("c490acd4", new Object[]{this, new Integer(i2), str, requestStatistic});
                        } else if (i2 >= 0) {
                        } else {
                            ALog.e(b.a(b.this), "auth onFinish", "statusCode", Integer.valueOf(i2));
                            authCallback.onAuthFail(i2, "onFinish auth fail");
                        }
                    }
                });
            }
        }

        private void a(Session session) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("92c33f80", new Object[]{this, session});
                return;
            }
            try {
                if (e.A() == null) {
                    e.a(new a());
                    e.A().a(this.c);
                }
                session.registerEventcb(3456, e.A());
            } catch (Exception e) {
                ALog.e(this.b, "registerSessionEvent err", e, new Object[0]);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class a implements EventCb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        private e f8277a;

        static {
            kge.a(918829665);
            kge.a(-1004686676);
        }

        public void a(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e23ea50", new Object[]{this, eVar});
            } else {
                this.f8277a = eVar;
            }
        }

        @Override // anet.channel.entity.EventCb
        public void onEvent(Session session, int i, Event event) {
            String str;
            int i2;
            ArrayList<AccsConnectStateListener> r;
            IpChange ipChange = $ipChange;
            boolean z = true;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("786c54ab", new Object[]{this, session, new Integer(i), event});
                return;
            }
            try {
                if (i == 128) {
                    this.f8277a.w();
                } else if (i == 2048) {
                    ALog.e("ACCSEventCb", "connection.ping() timeout", new Object[0]);
                    this.f8277a.x();
                } else if (i != 256 && i != 1024) {
                } else {
                    String valueOf = String.valueOf(i);
                    if (event != null) {
                        int i3 = event.errorCode;
                        str = event.errorDetail;
                        i2 = i3;
                    } else {
                        str = valueOf;
                        i2 = -1;
                    }
                    Object[] objArr = new Object[6];
                    objArr[0] = "err_code";
                    objArr[1] = Integer.valueOf(i2);
                    objArr[2] = "err_detail";
                    objArr[3] = str;
                    objArr[4] = "connection";
                    if (this.f8277a != null) {
                        z = false;
                    }
                    objArr[5] = Boolean.valueOf(z);
                    ALog.e("ACCSEventCb", "conn fail", objArr);
                    com.taobao.accs.utl.d.a("accs", BaseMonitor.ALARM_CONNECT_RESULT, "", String.valueOf(i2), str);
                    if (this.f8277a == null) {
                        return;
                    }
                    TaoBaseService.ConnectInfo connectInfo = new TaoBaseService.ConnectInfo(null, true, true, i2, str);
                    if (m.u()) {
                        r = GlobalClientInfo.getInstance(this.f8277a.d).getConnectionListenerList(this.f8277a.o);
                    } else {
                        r = this.f8277a.r();
                    }
                    Iterator<AccsConnectStateListener> it = r.iterator();
                    while (it.hasNext()) {
                        AccsConnectStateListener next = it.next();
                        if (next instanceof AccsConnectStateListener2) {
                            ((AccsConnectStateListener2) next).onConnectFail(connectInfo);
                        }
                    }
                }
            } catch (Throwable th) {
                ALog.e("ACCSEventCb", "sessionEventCb err", th, new Object[0]);
            }
        }
    }

    private void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b793c9", new Object[]{this});
        } else if (!this.j.isAccsHeartbeatEnable()) {
        } else {
            ALog.e(g(), "startAccsHeartBeat", new Object[0]);
            ScheduledFuture scheduledFuture = this.u;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            ScheduledThreadPoolExecutor a2 = com.taobao.accs.common.a.a();
            Runnable runnable = this.A;
            long j = this.t;
            this.u = a2.scheduleAtFixedRate(runnable, j, j, TimeUnit.MILLISECONDS);
        }
    }

    @Override // com.taobao.accs.net.c
    public void b(int i) {
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        String g = g();
        Object[] objArr = new Object[4];
        objArr[0] = "state";
        objArr[1] = Integer.valueOf(i);
        objArr[2] = "smartHeartbeat";
        objArr[3] = Boolean.valueOf(this.v != null);
        ALog.e(g, "setForeBackStateInApp", objArr);
        super.b(i);
        g gVar = this.v;
        if (gVar != null) {
            gVar.a(i);
        }
        if (i != 0) {
            z2 = false;
        }
        a(z2);
    }

    @Override // com.taobao.accs.net.c
    public boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[]{this})).booleanValue();
        }
        ALog.e(this.s, "isConnected", "state", Boolean.valueOf(this.y));
        return this.y;
    }
}
