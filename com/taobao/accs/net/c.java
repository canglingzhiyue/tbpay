package com.taobao.accs.net;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import anet.channel.Config;
import anet.channel.SessionCenter;
import anet.channel.entity.ConnType;
import anet.channel.entity.ENV;
import anet.channel.strategy.ConnProtocol;
import anet.channel.strategy.StrategyTemplate;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.AccsException;
import com.taobao.accs.IHeartBeat;
import com.taobao.accs.base.AccsConnectStateListener;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.data.Message;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.BaseMonitor;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.accs.utl.l;
import com.taobao.accs.utl.m;
import com.taobao.search.common.util.k;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import org.android.agoo.common.AgooConstants;
import tb.dcd;
import tb.kge;
import tb.mto;

/* loaded from: classes.dex */
public abstract class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ACCS_RECEIVE_TIMEOUT = 40000;
    public static final int INAPP = 1;
    public static final int SERVICE = 0;
    public static volatile long e;
    public static volatile int p;

    /* renamed from: a  reason: collision with root package name */
    public String f8266a;
    public String b;
    public int c;
    public Context d;
    public com.taobao.accs.data.b f;
    public com.taobao.accs.client.b i;
    public AccsClientConfig j;
    public String k;
    public String m;
    public String o;
    public int g = 0;
    private long q = 0;
    public volatile boolean h = false;
    public String l = null;
    private boolean r = false;
    public LinkedHashMap<Integer, Message> n = new LinkedHashMap<Integer, Message>() { // from class: com.taobao.accs.net.BaseConnection$1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<Integer, Message> entry) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6471a6cf", new Object[]{this, entry})).booleanValue() : size() > 10;
        }
    };
    private final ArrayList<AccsConnectStateListener> s = new ArrayList<>();
    private final List<IHeartBeat> t = new ArrayList();

    public abstract void a(Message message, boolean z);

    public abstract void a(String str);

    public abstract void a(String str, boolean z, String str2);

    public abstract void a(boolean z, boolean z2);

    public abstract boolean b(String str);

    public abstract void c();

    public abstract void d();

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        }
    }

    public abstract void f();

    public abstract String g();

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        }
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[]{this})).booleanValue();
        }
        return false;
    }

    static {
        kge.a(-2012792597);
        e = 0L;
        p = 0;
    }

    public c(Context context, int i, String str) {
        this.b = "";
        this.c = i;
        this.d = context.getApplicationContext();
        this.j = AccsClientConfig.getConfigByTag(str);
        if (this.j == null) {
            ALog.e(g(), "BaseConnection config null!!", new Object[0]);
            try {
                this.j = new AccsClientConfig.Builder().setAppKey(ACCSManager.getDefaultAppkey(context)).setTag(str).build();
            } catch (AccsException e2) {
                ALog.e(g(), "BaseConnection build config", e2, new Object[0]);
            }
        }
        AccsClientConfig accsClientConfig = this.j;
        if (accsClientConfig != null) {
            this.o = accsClientConfig.getTag();
            this.b = this.j.getAppKey();
        }
        this.f = new com.taobao.accs.data.b(context, this);
        this.f.b = this.c;
        String g = g();
        ALog.e(g, "new connection " + this.o, new Object[0]);
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        AccsClientConfig accsClientConfig = this.j;
        return accsClientConfig != null && accsClientConfig.getVersion() == 2 && m.b();
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : !a();
    }

    public void b(Message message, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9117bcc8", new Object[]{this, message, new Boolean(z)});
        } else if (!message.isAck && !UtilityImpl.isNetworkConnected(this.d)) {
            ALog.e(g(), "sendMessage ready no network", "dataId", message.dataId);
            this.f.a(message, -13);
        } else {
            long a2 = message.getType() != 2 ? this.f.c.a(message.serviceId, message.bizId) : 0L;
            if (a2 == -1) {
                ALog.e(g(), "sendMessage ready server limit high", "dataId", message.dataId);
                this.f.a(message, 70021);
            } else if (a2 == -1000) {
                ALog.e(g(), "sendMessage ready server limit high for brush", "dataId", message.dataId);
                this.f.a(message, 70023);
            } else {
                int i = (a2 > 0L ? 1 : (a2 == 0L ? 0 : -1));
                if (i > 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    long j = this.q;
                    if (currentTimeMillis > j) {
                        message.delyTime = a2;
                    } else {
                        message.delyTime = (j + a2) - System.currentTimeMillis();
                    }
                    this.q = System.currentTimeMillis() + message.delyTime;
                }
                if (UtilityImpl.isServiceIdPrintLog(message.serviceId) || i > 0) {
                    ALog.e(g(), "sendMessage ready", "dataId", message.dataId, "type", Message.MsgType.name(message.getType()), "delay", Long.valueOf(message.delyTime));
                }
                try {
                    if (TextUtils.isEmpty(this.k)) {
                        this.k = UtilityImpl.getDeviceId(this.d);
                    }
                    if (!message.isTimeOut()) {
                        a(message, z);
                        return;
                    }
                    ALog.e(g(), "sendMessage timeout-18", "dataId", message.dataId);
                    this.f.a(message, -18);
                } catch (RejectedExecutionException unused) {
                    this.f.a(message, 70008);
                    ALog.e(g(), "sendMessage ready queue full", new Object[0]);
                }
            }
        }
    }

    public void a(final String str, final boolean z, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35a2622", new Object[]{this, str, new Boolean(z), new Long(j)});
        } else {
            com.taobao.accs.common.a.a().schedule(new Runnable() { // from class: com.taobao.accs.net.c.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Message a2 = c.this.f.a(str);
                    if (a2 == null) {
                        return;
                    }
                    c.this.f.a(a2, -9);
                    c.this.a(str, z, "receive data time out");
                    String g = c.this.g();
                    ALog.e(g, str + "-> receive data time out!", new Object[0]);
                }
            }, j, TimeUnit.MILLISECONDS);
        }
    }

    public boolean a(Message message, int i) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1cd8449c", new Object[]{this, message, new Integer(i)})).booleanValue();
        }
        try {
        } catch (Throwable th) {
            th = th;
            z = false;
        }
        if (message.retryTimes > 3) {
            return false;
        }
        message.retryTimes++;
        message.delyTime = i;
        ALog.e(g(), "reSend", "dataid", message.dataId, "delay", Integer.valueOf(i), " retryTimes", Integer.valueOf(message.retryTimes));
        b(message, true);
        try {
            if (message.getNetPermanceMonitor() != null) {
                message.getNetPermanceMonitor().retry_times = message.retryTimes;
                if (message.retryTimes == 1) {
                    com.taobao.accs.utl.d.a("accs", BaseMonitor.COUNT_POINT_RESEND, "total", mto.a.GEO_NOT_SUPPORT);
                }
            }
        } catch (Throwable th2) {
            th = th2;
            this.f.a(message, -8);
            ALog.e(g(), "reSend error", th, new Object[0]);
            return z;
        }
        return z;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (i >= 0) {
        } else {
            ALog.e(g(), "reSendAck", "dataId", Integer.valueOf(i));
            Message message = this.n.get(Integer.valueOf(i));
            if (message == null) {
                return;
            }
            a(message, 5000);
            com.taobao.accs.utl.d.a("accs", BaseMonitor.COUNT_POINT_RESEND, BaseMonitor.COUNT_ACK, mto.a.GEO_NOT_SUPPORT);
        }
    }

    public String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82f346c", new Object[]{this, str});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(k.HTTPS_PREFIX);
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        sb.append(str);
        sb.append(this.j.getInappHost());
        return sb.toString();
    }

    public String j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6aaa74cf", new Object[]{this}) : this.m;
    }

    public boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{this, context})).booleanValue();
        }
        try {
            ENV env = ENV.ONLINE;
            if (AccsClientConfig.mEnv == 2) {
                env = ENV.TEST;
                SessionCenter.switchEnvironment(env);
            } else if (AccsClientConfig.mEnv == 1) {
                env = ENV.PREPARE;
                SessionCenter.switchEnvironment(env);
            }
            SessionCenter.init(context, new Config.Builder().setAppkey(this.b).setAppSecret(this.j.getAppSecret()).setAuthCode(this.j.getAuthCode()).setEnv(env).setTag(this.j.getAppKey()).build());
            String str = ConnType.PK_ACS;
            if (this.j.getInappPubKey() == 10 || this.j.getInappPubKey() == 11) {
                str = "open";
            }
            ALog.i(g(), "init awcn register new conn protocol host:", this.j.getInappHost());
            if (a()) {
                StrategyTemplate.getInstance().registerConnProtocol(this.j.getInappHost(), ConnProtocol.valueOf(ConnType.HTTP3, null, null, false));
            } else {
                StrategyTemplate.getInstance().registerConnProtocol(this.j.getInappHost(), ConnProtocol.valueOf(ConnType.HTTP2, ConnType.RTT_0, str, false));
            }
        } catch (Throwable th) {
            ALog.e(g(), "initAwcn", th, new Object[0]);
        }
        return true;
    }

    public void b(Message message, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91177cf7", new Object[]{this, message, new Integer(i)});
        } else {
            this.f.a(message, i);
        }
    }

    public String k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f1302f6e", new Object[]{this}) : this.b;
    }

    public com.taobao.accs.client.b l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.accs.client.b) ipChange.ipc$dispatch("97c3954a", new Object[]{this});
        }
        if (this.i == null) {
            ALog.d(g(), "new ClientManager", Constants.KEY_CONFIG_TAG, this.o);
            this.i = new com.taobao.accs.client.b(this.d, this.o);
        }
        return this.i;
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        try {
            com.taobao.accs.common.a.a(new Runnable() { // from class: com.taobao.accs.net.c.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    ALog.d(c.this.g(), "startChannelService", new Object[0]);
                    Intent intent = new Intent(Constants.ACTION_START_SERVICE);
                    intent.putExtra("appKey", c.this.k());
                    intent.putExtra("ttid", c.this.f8266a);
                    intent.putExtra("packageName", GlobalClientInfo.getContext().getPackageName());
                    intent.putExtra("app_sercet", c.this.j.getAppSecret());
                    intent.putExtra("mode", AccsClientConfig.mEnv);
                    intent.putExtra(org.android.agoo.common.Config.PROPERTY_APP_KEY, org.android.agoo.common.Config.getAgooAppKey(GlobalClientInfo.getContext()));
                    intent.putExtra(Constants.KEY_CONFIG_TAG, c.this.o);
                    intent.setClassName(GlobalClientInfo.getContext().getPackageName(), com.taobao.accs.utl.c.channelService);
                    dcd.a(GlobalClientInfo.getContext(), intent);
                    Intent intent2 = new Intent();
                    intent2.setAction(AgooConstants.INTENT_FROM_AGOO_REPORT);
                    intent2.setPackage(GlobalClientInfo.getContext().getPackageName());
                    intent2.setClassName(GlobalClientInfo.getContext().getPackageName(), com.taobao.accs.client.a.a(GlobalClientInfo.getContext().getPackageName()));
                    dcd.a(GlobalClientInfo.getContext(), intent2);
                }
            }, 10000L, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            ALog.w(g(), "startChannelService", th, new Object[0]);
        }
    }

    public String d(String str) {
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4d254b", new Object[]{this, str});
        }
        String deviceId = UtilityImpl.getDeviceId(this.d);
        try {
            str2 = URLEncoder.encode(deviceId);
        } catch (Throwable th) {
            ALog.e(g(), "buildAuthUrl", th, new Object[0]);
            str2 = deviceId;
        }
        String appsign = UtilityImpl.getAppsign(this.d, k(), this.j.getAppSecret(), deviceId, this.o, !n());
        StringBuilder sb = new StringBuilder(256);
        sb.append(str);
        sb.append("auth");
        sb.append(l.s(this.d) ? "?version=2" : "?");
        if (l.s(this.d)) {
            str3 = "&0=" + l.q(this.d);
        } else {
            str3 = "";
        }
        sb.append(str3);
        sb.append("&1=");
        sb.append(str2);
        sb.append("&2=");
        sb.append(appsign);
        sb.append("&3=");
        sb.append(k());
        if (this.l != null) {
            sb.append("&4=");
            sb.append(this.l);
        }
        sb.append("&5=");
        sb.append(this.c);
        sb.append("&6=");
        sb.append(UtilityImpl.getNetworkType(this.d));
        sb.append("&7=");
        sb.append("null");
        sb.append("&8=");
        sb.append(this.c == 1 ? "1.1.2" : Integer.valueOf(Constants.SDK_VERSION_CODE));
        sb.append("&9=");
        sb.append(System.currentTimeMillis());
        sb.append("&10=");
        sb.append(1);
        sb.append("&11=");
        sb.append(Build.VERSION.SDK_INT);
        sb.append("&12=");
        sb.append(this.d.getPackageName());
        sb.append("&13=");
        sb.append(UtilityImpl.getAppVersion(this.d));
        sb.append("&14=");
        sb.append(this.f8266a);
        sb.append("&15=");
        sb.append(UtilityImpl.urlEncode(Build.MODEL));
        sb.append("&16=");
        sb.append(UtilityImpl.urlEncode(Build.BRAND));
        sb.append("&17=");
        sb.append(l.g(this.d));
        sb.append("&19=");
        sb.append(!n());
        sb.append("&20=");
        sb.append(this.j.getStoreId());
        if (p == 0 && l.f() && UtilityImpl.isChannelProcess(this.d) && !com.taobao.accs.connection.state.a.a().e(this.d)) {
            sb.append("&21=");
            sb.append(3);
        } else {
            sb.append("&21=");
            sb.append(p);
        }
        return sb.toString();
    }

    public String e(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("666b162a", new Object[]{this, str});
        }
        String deviceId = UtilityImpl.getDeviceId(this.d);
        try {
            str2 = URLEncoder.encode(deviceId);
        } catch (Throwable th) {
            ALog.e(g(), "buildAuthUrl", th, new Object[0]);
            str2 = deviceId;
        }
        String createRegIdAppSign = UtilityImpl.getCreateRegIdAppSign(this.d, k(), this.j.getAppSecret(), deviceId, this.o, !n());
        StringBuilder sb = new StringBuilder(256);
        sb.append(str);
        sb.append("createRegId?did=");
        sb.append(str2);
        sb.append("&appKey=");
        sb.append(k());
        sb.append("&sign=");
        sb.append(createRegIdAppSign);
        sb.append("&sec=");
        sb.append(!n());
        sb.append("&version=");
        sb.append(1);
        return sb.toString();
    }

    public boolean n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[]{this})).booleanValue() : 2 == this.j.getSecurity();
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        if (i == 1) {
            i2 = 1;
        }
        p = i2;
    }

    public boolean o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[]{this})).booleanValue() : p == 1;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.r = z;
        }
    }

    public boolean q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("64de47c", new Object[]{this})).booleanValue() : this.r;
    }

    public void a(AccsConnectStateListener accsConnectStateListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e13d2658", new Object[]{this, accsConnectStateListener});
            return;
        }
        synchronized (this.s) {
            if (!this.s.contains(accsConnectStateListener)) {
                this.s.add(accsConnectStateListener);
            }
        }
    }

    public void b(AccsConnectStateListener accsConnectStateListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f15c0b7", new Object[]{this, accsConnectStateListener});
            return;
        }
        synchronized (this.s) {
            this.s.remove(accsConnectStateListener);
        }
    }

    public ArrayList<AccsConnectStateListener> r() {
        ArrayList<AccsConnectStateListener> arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("72422953", new Object[]{this});
        }
        synchronized (this.s) {
            arrayList = new ArrayList<>(this.s);
        }
        return arrayList;
    }

    public void a(IHeartBeat iHeartBeat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d619b1a", new Object[]{this, iHeartBeat});
            return;
        }
        synchronized (this.t) {
            if (!this.t.contains(iHeartBeat)) {
                this.t.add(iHeartBeat);
            }
        }
    }

    public void b(IHeartBeat iHeartBeat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb39571b", new Object[]{this, iHeartBeat});
            return;
        }
        synchronized (this.t) {
            this.t.remove(iHeartBeat);
        }
    }

    public List<IHeartBeat> s() {
        ArrayList arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("abd71b8d", new Object[]{this});
        }
        synchronized (this.t) {
            arrayList = new ArrayList(this.t);
        }
        return arrayList;
    }

    public long t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6782aef", new Object[]{this})).longValue() : e + SystemClock.elapsedRealtime();
    }

    public long u() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6864270", new Object[]{this})).longValue() : e;
    }
}
