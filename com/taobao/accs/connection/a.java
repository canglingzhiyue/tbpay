package com.taobao.accs.connection;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Pair;
import anet.channel.AwcnConfig;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.AccsIPCProvider;
import com.taobao.accs.base.AccsConnectStateListener;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.center.AccsMainCenter;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.BaseMonitor;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.accs.utl.f;
import com.taobao.accs.utl.m;
import com.taobao.accs.utl.o;
import com.taobao.aranger.exception.IPCException;
import com.taobao.search.common.util.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import tb.dcd;
import tb.hyq;
import tb.jzv;
import tb.kge;
import tb.mto;

/* loaded from: classes.dex */
public class a extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    public static final C0316a f8214a;
    private String e;
    private Context d = GlobalClientInfo.getContext();
    private final Map<String, IConnection> f = new ConcurrentHashMap();
    private Boolean g = null;
    private volatile boolean h = false;
    private boolean i = false;

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        if (str.hashCode() == -207205326) {
            super.a((String) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* renamed from: lambda$ZYqh-fUmbiTS-zYSkdt9kBzkIfQ */
    public static /* synthetic */ void m803lambda$ZYqhfUmbiTSzYSkdt9kBzkIfQ(a aVar) {
        aVar.h();
    }

    public static /* synthetic */ Context a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("17446615", new Object[]{aVar}) : aVar.d;
    }

    public static /* synthetic */ Map b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("9aff8393", new Object[]{aVar}) : aVar.f;
    }

    static {
        kge.a(222630877);
        f8214a = new C0316a();
    }

    @Override // com.taobao.accs.connection.b
    public List<IConnection> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("627608df", new Object[]{this});
        }
        try {
            return Arrays.asList(this.f.values().toArray(new IConnection[0]));
        } catch (Exception e) {
            ALog.e("AllWeatherConnectionService", "getConnections err", e, new Object[0]);
            return null;
        }
    }

    @Override // com.taobao.accs.connection.b
    public IConnection a(String str, AccsClientConfig accsClientConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IConnection) ipChange.ipc$dispatch("82d6b9ed", new Object[]{this, str, accsClientConfig});
        }
        if (this.f.get(str) == null) {
            this.e = str;
            String a2 = f8214a.a(com.taobao.aranger.utils.c.a());
            boolean z = TextUtils.isEmpty(a2) || a2.equals(this.d.getPackageName());
            if (o.e(this.d) && z) {
                this.b = new ConnectionWrapper(str);
                this.c = false;
            } else {
                try {
                    if (UtilityImpl.isMainProcess(this.d)) {
                        com.taobao.accs.common.a.a($$Lambda$a$xIonHZDe0GjWHnix5oL6rsyeRY.INSTANCE);
                        GlobalClientInfo.getInstance(this.d).recoverListener(str);
                    }
                    int i = (f.a().c() != 1 || !UtilityImpl.isForeground(GlobalClientInfo.mContext)) ? 0 : 1;
                    if (UtilityImpl.isChannelProcess(this.d)) {
                        this.b = new ConnectionWrapper(accsClientConfig, i);
                        this.c = false;
                    } else {
                        this.b = (IConnection) jzv.a(new ComponentName(this.d, AccsIPCProvider.class), IConnection.class, new Pair(AccsClientConfig.class, accsClientConfig), new Pair(Integer.class, Integer.valueOf(i)));
                        this.c = true;
                    }
                } catch (IPCException e) {
                    b(str);
                    ALog.e("AllWeatherConnectionService", "getConnection err ", e, new Object[0]);
                }
            }
            if (this.b != null) {
                this.f.put(str, this.b);
            }
            ALog.e("AllWeatherConnectionService", "getConnection-aw", "isUsingARanger", Boolean.valueOf(this.c), Constants.KEY_CONFIG_TAG, str);
        }
        return this.f.get(str);
    }

    public static /* synthetic */ void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[0]);
        } else if (!com.taobao.accs.utl.a.b()) {
        } else {
            ALog.e("AllWeatherConnectionService", "init MainBinder in getConnection", new Object[0]);
            AccsMainCenter.a().a(true);
        }
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        String a2 = com.taobao.aranger.utils.c.a();
        String a3 = f8214a.a(a2);
        boolean z = TextUtils.isEmpty(a3) || a3.equals(a2);
        Boolean bool = this.g;
        if (bool == null || bool.booleanValue() != z) {
            ALog.e("AllWeatherConnectionService", "isCurProcessAllow2Connect", "process", a3, "allowed", Boolean.valueOf(z));
        }
        Boolean valueOf = Boolean.valueOf(z);
        this.g = valueOf;
        return valueOf.booleanValue();
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        ALog.e("AllWeatherConnectionService", "setCurrentProcessToConnect", new Object[0]);
        f8214a.b(com.taobao.aranger.utils.c.a());
        try {
            ((ConnectionWrapper) this.f.get(this.e)).getConnection().e();
        } catch (Throwable th) {
            ALog.e("AllWeatherConnectionService", "setCurrentProcessToConnect err", th, new Object[0]);
        }
    }

    private void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        ALog.e("AllWeatherConnectionService", hyq.UMB_FEATURE_DOWN_GRADE, Constants.KEY_CONFIG_TAG, str);
        this.h = true;
        f8214a.b(this.d.getPackageName());
        if (UtilityImpl.isMainProcess(this.d)) {
            if (this.c) {
                a(str);
            }
            d.removeConnection(this.d, str);
        }
        if (this.f.get(str) == null) {
            this.b = new ConnectionWrapper(str);
            this.c = false;
            this.f.put(str, this.b);
            try {
                this.b.start();
            } catch (IPCException e) {
                ALog.e("AllWeatherConnectionService", "downGrade err", e, new Object[0]);
            }
        }
        if (UtilityImpl.isChannelProcessAlive(this.d)) {
            Intent intent = new Intent(Constants.ACTION_CLOSE_CONNECTION);
            intent.putExtra(Constants.KEY_CONFIG_TAG, str);
            intent.setClassName(this.d.getPackageName(), com.taobao.accs.utl.c.channelService);
            dcd.a(this.d, intent);
        }
        com.taobao.accs.utl.d.a("accs", BaseMonitor.COUNT_FULL_VERIFY, hyq.UMB_FEATURE_DOWN_GRADE, mto.a.GEO_NOT_SUPPORT);
    }

    @Override // com.taobao.accs.connection.b
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        ALog.e("AllWeatherConnectionService", "onConnectionStateChanged", "connected", Boolean.valueOf(z), "isUsingARanger", Boolean.valueOf(this.c));
        if (!z || this.c) {
            return;
        }
        for (Map.Entry<String, IConnection> entry : this.f.entrySet()) {
            a(entry.getKey(), entry.getValue());
        }
    }

    @Override // com.taobao.accs.connection.b
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        super.a(str);
        if (str == null) {
            return;
        }
        this.f.remove(str);
    }

    private void a(String str, IConnection iConnection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f3bab01", new Object[]{this, str, iConnection});
            return;
        }
        try {
            com.taobao.accs.net.c connection = ((ConnectionWrapper) iConnection).getConnection();
            if (connection instanceof com.taobao.accs.net.e) {
                a(str);
                AwcnConfig.setSendConnectInfoByService(false);
                ((com.taobao.accs.net.e) connection).v();
            }
            IConnection connectionWrapper = ConnectionServiceManager.getInstance().getConnectionWrapper(str);
            connectionWrapper.setForeBackState(f.a().c());
            if (m.u()) {
                GlobalClientInfo.getInstance(this.d).recoverConnectionListener(str);
                return;
            }
            ArrayList<AccsConnectStateListener> r = connection.r();
            if (r == null) {
                return;
            }
            Iterator<AccsConnectStateListener> it = r.iterator();
            while (it.hasNext()) {
                connectionWrapper.registerConnectStateListener(it.next());
            }
        } catch (Throwable th) {
            ALog.e("AllWeatherConnectionService", "channelConnListener err", th, Constants.KEY_CONFIG_TAG, str);
        }
    }

    @Override // com.taobao.accs.connection.b
    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.c;
    }

    @Override // com.taobao.accs.connection.b
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        for (String str : this.f.keySet()) {
            if (this.c && m.u()) {
                g();
            }
            try {
                GlobalClientInfo.getInstance(jzv.a()).recoverListener(str);
            } catch (Throwable th) {
                ALog.e("AllWeatherConnectionService", "on processStateListener global error", th, new Object[0]);
            }
            if (m.u()) {
                GlobalClientInfo.getInstance(jzv.a()).recoverConnectionListener(str);
            }
            try {
                a(str);
                IConnection a2 = a(str, AccsClientConfig.getConfigByTag(str));
                a2.start();
                a2.setForeBackState(f.a().c());
            } catch (Throwable th2) {
                ALog.e("AllWeatherConnectionService", "on processStateListener connection_service error", th2, new Object[0]);
            }
        }
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else {
            com.taobao.accs.common.a.f().execute(new Runnable() { // from class: com.taobao.accs.connection.-$$Lambda$a$ZYqh-fUmbiTS-zYSkdt9kBzkIfQ
                {
                    a.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    a.m803lambda$ZYqhfUmbiTSzYSkdt9kBzkIfQ(a.this);
                }
            });
        }
    }

    public /* synthetic */ void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        ArrayList<AccsConnectStateListener> connectionListenerList = GlobalClientInfo.getInstance(GlobalClientInfo.getContext()).getConnectionListenerList(this.e);
        if (connectionListenerList == null) {
            return;
        }
        AccsClientConfig configByTag = AccsClientConfig.getConfigByTag(this.e);
        if (configByTag == null) {
            ALog.e("AllWeatherConnectionService", "notifyConnDisconnected, cfg is NULL!", new Object[0]);
            return;
        }
        TaoBaseService.ConnectInfo connectInfo = new TaoBaseService.ConnectInfo(k.HTTPS_PREFIX + configByTag.getInappHost(), true, true, -101, "process dead");
        connectInfo.connected = false;
        Iterator<AccsConnectStateListener> it = connectionListenerList.iterator();
        while (it.hasNext()) {
            AccsConnectStateListener next = it.next();
            if (next != null) {
                try {
                    ALog.e("AllWeatherConnectionService", "notifyConnDisconnected: " + next.getClass().getName(), new Object[0]);
                    next.onDisconnected(connectInfo);
                } catch (Throwable th) {
                    ALog.e("AllWeatherConnectionService", "notifyConnDisconnected err", th, new Object[0]);
                }
            }
        }
    }

    @Override // com.taobao.accs.connection.b
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (this.h) {
            ALog.e("AllWeatherConnectionService", "onBackground() but already downGrade", new Object[0]);
        } else if (this.i) {
        } else {
            this.i = true;
            ALog.e("AllWeatherConnectionService", "onBackground schedule start", new Object[0]);
            com.taobao.accs.common.a.a().schedule(new Runnable() { // from class: com.taobao.accs.connection.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    a.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    boolean z = true;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("onBackground scheduling, ctx==null? ");
                    if (a.a(a.this) != null) {
                        z = false;
                    }
                    sb.append(z);
                    ALog.e("AllWeatherConnectionService", sb.toString(), new Object[0]);
                    try {
                        IChannelConnection iChannelConnection = (IChannelConnection) jzv.a(new ComponentName(a.a(a.this), AccsIPCProvider.class), IChannelConnection.class, new Pair[0]);
                        for (String str : a.b(a.this).keySet()) {
                            iChannelConnection.start(str, f.a().c(), new IChannelConnListener() { // from class: com.taobao.accs.connection.a.1.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                {
                                    AnonymousClass1.this = this;
                                }

                                @Override // com.taobao.accs.connection.IChannelConnListener
                                public void onStart() {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("7f2d84ca", new Object[]{this});
                                        return;
                                    }
                                    ALog.e("AllWeatherConnectionService", "onChannelStart()", new Object[0]);
                                    a.f8214a.b(UtilityImpl.getChannelProcessName(a.a(a.this)));
                                }
                            });
                        }
                    } catch (IPCException e) {
                        ALog.e("AllWeatherConnectionService", "IChannelConnection err", e, new Object[0]);
                    }
                }
            }, 5L, TimeUnit.SECONDS);
        }
    }

    /* renamed from: com.taobao.accs.connection.a$a */
    /* loaded from: classes.dex */
    public static class C0316a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        private long f8217a = -1;
        private String b;

        static {
            kge.a(1632824560);
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                a(1, null);
            }
        }

        public String a(String str) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str}) : a(0, str);
        }

        public void b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            } else {
                a(1, str);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:190:0x0151, code lost:
            if (r11 != null) goto L70;
         */
        /* JADX WARN: Removed duplicated region for block: B:215:0x014c A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:228:0x0160 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:234:0x0159 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private java.lang.String a(int r18, java.lang.String r19) {
            /*
                Method dump skipped, instructions count: 356
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.connection.a.C0316a.a(int, java.lang.String):java.lang.String");
        }
    }
}
