package com.alipay.mobile.common.transportext;

import android.content.Context;
import com.alipay.bifrost.AppLogicICallBackImpl;
import com.alipay.bifrost.Bifrost;
import com.alipay.bifrost.BifrostEnvUtils;
import com.alipay.bifrost.StnLogicICallBackImpl;
import com.alipay.mars.Mars;
import com.alipay.mars.app.AppLogic;
import com.alipay.mars.stn.StnLogic;
import com.alipay.mobile.common.amnetcore.AmnetSwitchManager;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.NetworkAsyncTaskExecutor;
import com.alipay.mobile.common.transportext.amnet.Channel;
import com.alipay.mobile.common.transportext.amnet.Linkage;
import com.alipay.mobile.common.transportext.amnet.Mercury;
import com.alipay.mobile.common.transportext.amnet.NetTest;
import com.alipay.mobile.common.transportext.amnet.Notepad;
import com.alipay.mobile.common.transportext.amnet.Storage;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.v3.t;
import java.lang.reflect.Field;
import java.util.BitSet;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/* loaded from: classes3.dex */
public class Transport {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static Transport h = null;
    private static boolean j = false;
    private static BitSet k = new BitSet();
    private Mercury i = null;

    /* renamed from: a  reason: collision with root package name */
    private Result f5643a = new DftResult();
    private Notepad b = new DftNotepad();
    private Mercury c = new Messenger();
    private Alarm d = new DftAlarm();
    private Bifrost e = Bifrost.instance();
    private boolean f = false;
    private int g = 0;

    /* loaded from: classes3.dex */
    public interface Alarm {
        void handle(Throwable th);
    }

    /* loaded from: classes3.dex */
    public class Alerter implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private Alerting f5644a;
        private Result b;

        public Alerter(Alerting alerting, Result result) {
            this.f5644a = alerting;
            this.b = result == null ? Transport.access$000(Transport.this) : result;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.f5644a == null) {
                this.b.notify(false);
            } else if (!Transport.access$300(Transport.this).alert(this.f5644a.id, this.f5644a.receipt, this.f5644a.duration)) {
            } else {
                this.b.notify(true);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class Alerting {
        public long duration;
        public long id;
        public long receipt;
    }

    /* loaded from: classes3.dex */
    public class Alterer implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private Altering f5645a;
        private Result b;

        public Alterer(Altering altering, Result result) {
            this.f5645a = altering;
            this.b = result == null ? Transport.access$000(Transport.this) : result;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.f5645a == null) {
                this.b.notify(false);
            } else if (!Transport.access$300(Transport.this).alter(this.f5645a.id, this.f5645a.status, this.f5645a.infMajor, this.f5645a.infMinor, this.f5645a.extMap)) {
            } else {
                this.b.notify(true);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class Altering {
        public Map<Byte, byte[]> extMap;
        public long id;
        public String infMajor;
        public String infMinor;
        public int status;
    }

    /* loaded from: classes3.dex */
    public class Asker implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private Asking f5646a;
        private Result b;

        public Asker(Asking asking, Result result) {
            this.f5646a = asking;
            this.b = result == null ? Transport.access$000(Transport.this) : result;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.f5646a == null) {
                this.b.notify(false);
            } else {
                this.f5646a.answer(Transport.access$300(Transport.this).query(this.f5646a.id));
                this.b.notify(true);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class Asking {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public long id;

        public abstract void answer(int i);
    }

    /* loaded from: classes3.dex */
    public class Detecter implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private Detecting f5647a;
        private Result b;

        public Detecter(Detecting detecting, Result result) {
            this.f5647a = detecting;
            this.b = result == null ? Transport.access$000(Transport.this) : result;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.f5647a == null) {
                this.b.notify(false);
            } else if (!Transport.access$300(Transport.this).launch(this.f5647a.id, this.f5647a.report)) {
            } else {
                this.b.notify(true);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class Detecting {
        public long id;
        public NetTest report;
    }

    /* loaded from: classes3.dex */
    public class Logger implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private Notepad f5648a;
        private Result b;

        public Logger(Notepad notepad, Result result) {
            this.f5648a = notepad;
            this.b = result == null ? Transport.access$000(Transport.this) : result;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            }
        }
    }

    /* loaded from: classes3.dex */
    public class Poster implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private Posting f5650a;
        private Result b;
        private long c;

        public Poster(Posting posting, Result result, long j) {
            this.f5650a = posting;
            this.b = result == null ? Transport.access$000(Transport.this) : result;
            this.c = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.f5650a == null) {
                this.b.notify(false);
            } else {
                long currentTimeMillis = System.currentTimeMillis() - this.c;
                Notepad access$100 = Transport.access$100(Transport.this);
                access$100.print("INFO", "-AMNET-DATA", "Poster run, rpcid=" + this.f5650a.receipt + ", using time=" + currentTimeMillis);
                if (!Transport.access$300(Transport.this).post(this.f5650a.id, this.f5650a.stamp, this.f5650a.receipt, this.f5650a.important, this.f5650a.secret, this.f5650a.nearing, this.f5650a.shortcut, this.f5650a.nolong, this.f5650a.shortLinkIPList, this.f5650a.channel, this.f5650a.fwdip, this.f5650a.traceid, this.f5650a.header, this.f5650a.body, this.f5650a.params, currentTimeMillis, this.c, this.f5650a.multiplex, this.f5650a.isUrgent)) {
                    return;
                }
                this.b.notify(true);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class Posting {
        public byte[] body;
        public byte channel;
        public String fwdip;
        public Map<String, String> header;
        public long id;
        public boolean important;
        public boolean isUrgent;
        public boolean nearing;
        public boolean nolong;
        public Map<String, String> params;
        public long receipt;
        public boolean secret;
        public String shortLinkIPList;
        public boolean shortcut;
        public String traceid;
        public boolean multiplex = false;
        public long stamp = System.nanoTime();
    }

    /* loaded from: classes3.dex */
    public class PreConnecter implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private long f5651a;
        private String b;
        private int c;
        private boolean d;
        private int e;
        private Result f;

        public PreConnecter(long j, String str, int i, boolean z, int i2, Result result) {
            this.f5651a = j;
            this.b = str;
            this.c = i;
            this.d = z;
            this.e = i2;
            this.f = result == null ? Transport.access$000(Transport.this) : result;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Transport.access$300(Transport.this).preConnect(this.f5651a, this.b, this.c, this.d, this.e);
            this.f.notify(true);
        }
    }

    /* loaded from: classes3.dex */
    public interface Result {
        void notify(boolean z);
    }

    /* loaded from: classes3.dex */
    public class Stopper implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private long f5653a;
        private Result b;

        public Stopper(long j, Result result) {
            this.f5653a = j;
            this.b = result == null ? Transport.access$000(Transport.this) : result;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Transport.access$100(Transport.this).print("INFO", "MNET", "stop active");
            Transport.access$700(Transport.this, this.f5653a);
            this.b.notify(true);
        }
    }

    private native void nop();

    public native void connect();

    public native void record(int i, String str, String str2);

    public native void remind();

    public void transportNop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca29206d", new Object[]{this});
        }
    }

    public static /* synthetic */ Result access$000(Transport transport) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Result) ipChange.ipc$dispatch("41d31a1a", new Object[]{transport}) : transport.f5643a;
    }

    public static /* synthetic */ Notepad access$100(Transport transport) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Notepad) ipChange.ipc$dispatch("42a7f720", new Object[]{transport}) : transport.b;
    }

    public static /* synthetic */ boolean access$200(Transport transport) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ebbe8bcc", new Object[]{transport})).booleanValue() : transport.f;
    }

    public static /* synthetic */ boolean access$202(Transport transport, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("debc4a92", new Object[]{transport, new Boolean(z)})).booleanValue();
        }
        transport.f = z;
        return z;
    }

    public static /* synthetic */ Bifrost access$300(Transport transport) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bifrost) ipChange.ipc$dispatch("d32fa1ea", new Object[]{transport}) : transport.e;
    }

    public static /* synthetic */ int access$400(Transport transport) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ee2b3179", new Object[]{transport})).intValue() : transport.g;
    }

    public static /* synthetic */ int access$402(Transport transport, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("29e41cb2", new Object[]{transport, new Integer(i)})).intValue();
        }
        transport.g = i;
        return i;
    }

    public static /* synthetic */ boolean access$500() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c5552fc0", new Object[0])).booleanValue() : j;
    }

    public static /* synthetic */ boolean access$502(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e8bb2bda", new Object[]{new Boolean(z)})).booleanValue();
        }
        j = z;
        return z;
    }

    public static /* synthetic */ BitSet access$600() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BitSet) ipChange.ipc$dispatch("344e1dd3", new Object[0]) : k;
    }

    public static /* synthetic */ void access$700(Transport transport, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47f79101", new Object[]{transport, new Long(j2)});
        } else {
            transport.a(j2);
        }
    }

    public static /* synthetic */ Transport access$800() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Transport) ipChange.ipc$dispatch("ff5c2a90", new Object[0]) : h;
    }

    public static /* synthetic */ Alarm access$900(Transport transport) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Alarm) ipChange.ipc$dispatch("b62e78c5", new Object[]{transport}) : transport.d;
    }

    /* loaded from: classes3.dex */
    public static class Activating {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public Map<String, String> cfgLongLink;
        public Map<String, String> cfgMultiplexLink;
        public Map<String, String> cfgShortLink;
        public Context context;
        public String domainLongLink;
        public String domainMultiplexLink;
        public String domainShortLink;
        public Map<String, Object> extParams;
        public boolean ground;
        public long id;
        public Linkage linkage;
        public boolean master;
        public String netMajor;
        public String netMinor;
        public boolean screen;
        public Map<Byte, Channel> service;
        public Storage storage;
        public AmnetSwitchManager swchmng;
        public boolean universal;
        public int targetType = 0;
        public boolean isReconnect = false;

        public void addExtParam(String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b44c8dda", new Object[]{this, str, obj});
            } else if (str == null || str.trim().length() <= 0 || obj == null) {
            } else {
                if (this.extParams == null) {
                    this.extParams = new HashMap(1);
                }
                this.extParams.put(str, obj);
            }
        }

        public boolean isTargetMmtp() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d4df8722", new Object[]{this})).booleanValue() : this.targetType == 0;
        }

        public boolean isTargetH2() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9bdf3b90", new Object[]{this})).booleanValue() : this.targetType == 1;
        }

        public boolean isTargetMqtt() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a8b0d22a", new Object[]{this})).booleanValue() : this.targetType == 2;
        }
    }

    public void register(Alarm alarm) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83e0a54a", new Object[]{this, alarm});
        } else if (alarm == null) {
        } else {
            synchronized (h) {
                this.d = alarm;
            }
        }
    }

    public void register(Notepad notepad, Result result) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("239972ab", new Object[]{this, notepad, result});
        } else {
            this.e.register(notepad);
        }
    }

    public void activate(Activating activating, Result result) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8da90e63", new Object[]{this, activating, result});
        } else if (activating != null) {
            a(activating.universal).post(new Starter(activating, result));
        } else {
            a().post(new Starter(activating, result));
        }
    }

    public void post(Posting posting, Result result) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ff5eeea", new Object[]{this, posting, result});
        } else {
            a().post(new Poster(posting, result, System.currentTimeMillis()));
        }
    }

    public void alter(Altering altering, Result result) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb8f5bea", new Object[]{this, altering, result});
        } else {
            a().post(new Alterer(altering, result));
        }
    }

    public void alert(Alerting alerting, Result result) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e178b776", new Object[]{this, alerting, result});
        } else {
            a().post(new Alerter(alerting, result));
        }
    }

    public void detect(Detecting detecting, Result result) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c796eca", new Object[]{this, detecting, result});
        } else {
            a().post(new Detecter(detecting, result));
        }
    }

    public void ask(Asking asking, Result result) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c86b9f0", new Object[]{this, asking, result});
        } else {
            a().post(new Asker(asking, result));
        }
    }

    public void inactivate(long j2, Result result) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb297bd3", new Object[]{this, new Long(j2), result});
        } else {
            a().post(new Stopper(j2, result));
        }
    }

    public void preConnect(long j2, String str, int i, boolean z, int i2, Result result) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d91e5c0", new Object[]{this, new Long(j2), str, new Integer(i), new Boolean(z), new Integer(i2), result});
        } else {
            a().post(new PreConnecter(j2, str, i, z, i2, result));
        }
    }

    public static final Transport instance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Transport) ipChange.ipc$dispatch("aa281ad", new Object[0]);
        }
        if (h == null) {
            b();
        }
        return h;
    }

    public final void routine() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82c6e34b", new Object[]{this});
        } else {
            this.c.drive();
        }
    }

    public final void track(int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34acf585", new Object[]{this, new Integer(i), str, str2});
        } else {
            this.b.print(i == 3 ? "DEBUG" : i == 4 ? "INFO" : i == 5 ? "WARN" : i == 6 ? "ERROR" : i == 7 ? "FATAL" : "VERBOSE", str, str2);
        }
    }

    /* loaded from: classes3.dex */
    public static class DftResult implements Result {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.alipay.mobile.common.transportext.Transport.Result
        public void notify(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("954c4d84", new Object[]{this, new Boolean(z)});
            }
        }

        private DftResult() {
        }
    }

    /* loaded from: classes3.dex */
    public class DftAlarm implements Alarm {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private DftAlarm() {
        }

        @Override // com.alipay.mobile.common.transportext.Transport.Alarm
        public void handle(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c32ca8a6", new Object[]{this, th});
            } else {
                LogCatUtil.error("-AMNET-MNG", th);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class DftNotepad implements Notepad {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private DftNotepad() {
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Notepad
        public void print(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            int i = 3;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7290cb92", new Object[]{this, str, str2, str3});
                return;
            }
            if (str.compareTo("DEBUG") != 0) {
                if (str.compareTo("INFO") == 0) {
                    i = 4;
                } else if (str.compareTo("WARN") == 0) {
                    i = 5;
                } else if (str.compareTo("ERROR") == 0) {
                    i = 6;
                } else {
                    i = str.compareTo("FATAL") == 0 ? 7 : 2;
                }
            }
            Bifrost.track(i, str2, str3);
        }
    }

    /* loaded from: classes3.dex */
    public class Starter implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private Activating f5652a;
        private Result b;
        private int c;

        public Starter(Activating activating, Result result) {
            this.f5652a = activating;
            this.b = result == null ? Transport.access$000(Transport.this) : result;
            this.c = 0;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            boolean z = false;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.f5652a == null) {
                this.b.notify(false);
            } else {
                Notepad access$100 = Transport.access$100(Transport.this);
                StringBuilder sb = new StringBuilder();
                sb.append("start active, bifrost:");
                sb.append(this.f5652a.universal);
                sb.append(", contex:");
                sb.append(this.f5652a.context != null);
                access$100.print("INFO", "MNET", sb.toString());
                if (!b()) {
                    this.b.notify(true);
                    return;
                }
                if (this.f5652a.context != null) {
                    BifrostEnvUtils.setContext(this.f5652a.context);
                }
                if (this.f5652a.universal) {
                    Bifrost.setSwchmng(this.f5652a.swchmng);
                    if (!a()) {
                        Transport.access$100(Transport.this).print("ERROR", "MNET", "initMars error");
                        return;
                    }
                    Transport transport = Transport.this;
                    Transport.access$202(transport, Transport.access$300(transport).activate(this.f5652a.id, this.f5652a.storage, this.f5652a.linkage, this.f5652a.swchmng, this.f5652a.service, this.f5652a.domainLongLink, this.f5652a.domainShortLink, this.f5652a.domainMultiplexLink, this.f5652a.cfgLongLink, this.f5652a.cfgShortLink, this.f5652a.cfgMultiplexLink, this.f5652a.netMajor, this.f5652a.netMinor, this.f5652a.ground, this.f5652a.screen, this.f5652a.master, this.f5652a.targetType, this.f5652a.extParams));
                    if (Transport.access$200(Transport.this)) {
                        Transport.access$402(Transport.this, this.c);
                    }
                    this.b.notify(Transport.access$200(Transport.this));
                }
                Notepad access$1002 = Transport.access$100(Transport.this);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("end active, bifrost:");
                sb2.append(this.f5652a.universal);
                sb2.append(", contex:");
                if (this.f5652a.context != null) {
                    z = true;
                }
                sb2.append(z);
                access$1002.print("INFO", "MNET", sb2.toString());
            }
        }

        private boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
            }
            if (Transport.access$500()) {
                return true;
            }
            for (int i = 0; i < 3; i++) {
                try {
                    if (!Transport.access$600().get(2)) {
                        AppLogicICallBackImpl.getInstance().register(this.f5652a.context);
                        Transport.access$600().set(2);
                    }
                    if (!Transport.access$600().get(3)) {
                        AppLogic.setCallBack(AppLogicICallBackImpl.getInstance());
                        StnLogic.setCallBack(StnLogicICallBackImpl.getInstance());
                        Transport.access$600().set(3);
                    }
                    if (!Transport.access$600().get(4)) {
                        Mars.init(this.f5652a.context, null);
                        Transport.access$600().set(4);
                    }
                    if (!Transport.access$600().get(5)) {
                        Mars.onCreate(true);
                        Transport.access$600().set(5);
                    }
                    Transport.access$502(true);
                    return true;
                } catch (Throwable th) {
                    LogCatUtil.error("MNET", "initMars exception, i:" + i, th);
                    if (i < 3) {
                        try {
                            Thread.sleep(20L);
                        } catch (Throwable th2) {
                            LogCatUtil.error("MNET", th2);
                        }
                    }
                }
            }
            return false;
        }

        private boolean b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
            }
            if (!this.f5652a.isReconnect && Transport.access$200(Transport.this)) {
                if (!this.f5652a.universal) {
                    this.c = 1;
                } else if (this.f5652a.targetType == 0) {
                    this.c = 2;
                } else if (1 == this.f5652a.targetType) {
                    this.c = 3;
                } else if (2 == this.f5652a.targetType) {
                    this.c = 4;
                } else {
                    Transport.access$100(Transport.this).print("WARN", "MNET", "target is error");
                }
                if (this.c == Transport.access$400(Transport.this) && Transport.access$400(Transport.this) != 0) {
                    Transport.access$100(Transport.this).print("WARN", "MNET", "already has same lib, do not activate");
                    return false;
                }
                Transport.access$100(Transport.this).print("WARN", "MNET", "already has lib, first stop");
                Transport.access$700(Transport.this, this.f5652a.id);
            }
            return true;
        }
    }

    /* loaded from: classes3.dex */
    public class Messenger implements Mercury {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private LinkedList<Runnable> f5649a = new LinkedList<>();
        private LinkedList<Runnable> b = new LinkedList<>();

        public Messenger() {
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Mercury
        public void post(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dd609e25", new Object[]{this, runnable});
                return;
            }
            synchronized (this) {
                this.f5649a.addLast(runnable);
            }
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Mercury
        public void drive() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ae704911", new Object[]{this});
                return;
            }
            LinkedList<Runnable> linkedList = this.b;
            synchronized (this) {
                this.b = this.f5649a;
                this.f5649a = linkedList;
            }
            while (!this.b.isEmpty()) {
                Runnable removeFirst = this.b.removeFirst();
                if (removeFirst != null) {
                    try {
                        removeFirst.run();
                    } finally {
                    }
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public class DftMercury implements Mercury {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public boolean ret;

        @Override // com.alipay.mobile.common.transportext.amnet.Mercury
        public void drive() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ae704911", new Object[]{this});
            }
        }

        private DftMercury() {
            this.ret = false;
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Mercury
        public void post(Runnable runnable) {
            synchronized (this) {
                if (runnable != null) {
                    try {
                        if (runnable instanceof Logger) {
                            this.ret = true;
                        } else {
                            this.ret = false;
                        }
                        Field declaredField = runnable.getClass().getDeclaredField(t.CALL_BACK);
                        declaredField.setAccessible(true);
                        Object obj = declaredField.get(runnable);
                        if (obj != null && (obj instanceof Result)) {
                            final Result result = (Result) obj;
                            NetworkAsyncTaskExecutor.execute(new Runnable() { // from class: com.alipay.mobile.common.transportext.Transport.DftMercury.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange = $ipChange;
                                    if (ipChange instanceof IpChange) {
                                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                                        return;
                                    }
                                    LogCatUtil.debug("Transport", "DftMercury post, notify=" + DftMercury.this.ret + ",hash=" + hashCode());
                                    result.notify(DftMercury.this.ret);
                                }
                            });
                        }
                    }
                }
            }
        }
    }

    private Transport() {
    }

    private void a(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j2)});
            return;
        }
        this.e.inactivate(j2);
        this.f = false;
        this.g = 0;
    }

    private Mercury a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Mercury) ipChange.ipc$dispatch("b8a3e3ad", new Object[]{this});
        }
        Mercury mercury = this.i;
        if (mercury != null) {
            if (mercury instanceof DftMercury) {
                LogCatUtil.debug("Transport", "diverterHandler instanceof DftMercury,hash=" + this.i.hashCode());
                if (this.e.isHasInitBifrost()) {
                    this.i = this.e.getHandler();
                    LogCatUtil.debug("Transport", "diverterHandler hash=" + this.i.hashCode());
                }
            }
            return this.i;
        }
        return new DftMercury();
    }

    private Mercury a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Mercury) ipChange.ipc$dispatch("ad2e90b1", new Object[]{this, new Boolean(z)});
        }
        if (z) {
            this.e.bifrostInit();
            this.i = this.e.getHandler();
        } else {
            this.i = this.c;
        }
        if (this.i == null) {
            LogCatUtil.warn("Transport", "getHandler,diverterHandler is null");
            this.i = new DftMercury();
        }
        return this.i;
    }

    private static synchronized void b() {
        synchronized (Transport.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[0]);
                return;
            }
            if (h == null) {
                h = new Transport();
            }
        }
    }
}
