package com.alipay.bifrost;

import mtopsdk.common.util.StringUtils;
import com.alipay.mars.sdt.SdtLogic;
import com.alipay.mars.stn.StnLogic;
import com.alipay.mobile.common.amnet.util.AmnetLibraryLoadUtils;
import com.alipay.mobile.common.amnetcore.AmnetSwitchManager;
import com.alipay.mobile.common.amnetcore.DftAmnetSwitchManager;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transportext.amnet.Channel;
import com.alipay.mobile.common.transportext.amnet.Linkage;
import com.alipay.mobile.common.transportext.amnet.Mercury;
import com.alipay.mobile.common.transportext.amnet.NetTest;
import com.alipay.mobile.common.transportext.amnet.Notepad;
import com.alipay.mobile.common.transportext.amnet.Storage;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.BitSet;
import java.util.LinkedList;
import java.util.Map;

/* loaded from: classes3.dex */
public class Bifrost {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static String f5222a = "Bifrost";
    private static Bifrost g;
    private Target b;
    private static AmnetSwitchManager f = new DftAmnetSwitchManager();
    private static BitSet i = new BitSet();
    private boolean h = false;
    private Notepad c = new DftNotepad();
    private Mercury d = new Messenger();
    private Alarm e = new DftAlarm();

    /* loaded from: classes3.dex */
    public interface Alarm {
        void handle(Throwable th);
    }

    /* loaded from: classes3.dex */
    public static class CmdResult implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private byte[] f5223a;

        public CmdResult(byte[] bArr) {
            this.f5223a = bArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Target a2 = Bifrost.a(Bifrost.b());
            if (a2 == null) {
                return;
            }
            a2.g(this.f5223a);
        }
    }

    /* loaded from: classes3.dex */
    public static class ConnResult implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private byte[] f5224a;

        public ConnResult(byte[] bArr) {
            this.f5224a = bArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Target a2 = Bifrost.a(Bifrost.b());
            if (a2 == null) {
                return;
            }
            a2.d(this.f5224a);
        }
    }

    /* loaded from: classes3.dex */
    public static class ConnectionStatus implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private int f5225a;
        private int b;

        public ConnectionStatus(int i, int i2) {
            this.f5225a = i;
            this.b = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Target a2 = Bifrost.a(Bifrost.b());
            if (a2 != null) {
                a2.a(this.f5225a, this.b);
            }
            Bifrost.a(this.f5225a, this.b);
        }
    }

    /* loaded from: classes3.dex */
    public static class DataPackage implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private byte[] f5226a;

        public DataPackage(byte[] bArr) {
            this.f5226a = bArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Target a2 = Bifrost.a(Bifrost.b());
            if (a2 == null) {
                return;
            }
            a2.b(this.f5226a);
        }
    }

    /* loaded from: classes3.dex */
    public static class DataRecycle implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private byte[] f5227a;

        public DataRecycle(byte[] bArr) {
            this.f5227a = bArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Target a2 = Bifrost.a(Bifrost.b());
            if (a2 == null) {
                return;
            }
            a2.c(this.f5227a);
        }
    }

    /* loaded from: classes3.dex */
    public static class DataResult implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private int f5228a;
        private int b;
        private int c;

        public DataResult(int i, int i2, int i3) {
            this.f5228a = i;
            this.b = i2;
            this.c = i3;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (Bifrost.a(Bifrost.b()) == null) {
            } else {
                Bifrost.a(this.f5228a, this.b, this.c);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class DisconnResult implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private byte[] f5231a;

        public DisconnResult(byte[] bArr) {
            this.f5231a = bArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Target a2 = Bifrost.a(Bifrost.b());
            if (a2 == null) {
                return;
            }
            a2.e(this.f5231a);
        }
    }

    /* loaded from: classes3.dex */
    public static class HbResult implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private byte[] f5232a;

        public HbResult(byte[] bArr) {
            this.f5232a = bArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Target a2 = Bifrost.a(Bifrost.b());
            if (a2 == null) {
                return;
            }
            a2.f(this.f5232a);
        }
    }

    /* loaded from: classes3.dex */
    public static class InitResult implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private byte[] f5233a;

        public InitResult(byte[] bArr) {
            this.f5233a = bArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Target a2 = Bifrost.a(Bifrost.b());
            if (a2 == null) {
                return;
            }
            a2.a(this.f5233a);
        }
    }

    /* loaded from: classes3.dex */
    public static class LaunchResult implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private long f5234a;
        private byte[] b;

        public LaunchResult(long j, byte[] bArr) {
            this.f5234a = j;
            this.b = bArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Target a2 = Bifrost.a(Bifrost.b());
            if (a2 == null) {
                return;
            }
            a2.a(this.f5234a, this.b);
        }
    }

    /* loaded from: classes3.dex */
    public static class LoginRetry implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Target a2 = Bifrost.a(Bifrost.b());
            if (a2 == null) {
                return;
            }
            a2.d();
        }
    }

    /* loaded from: classes3.dex */
    public static class ReportPerfinfo implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private byte[] f5236a;

        public ReportPerfinfo(byte[] bArr) {
            this.f5236a = bArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Target a2 = Bifrost.a(Bifrost.b());
            if (a2 == null) {
                return;
            }
            a2.h(this.f5236a);
        }
    }

    /* loaded from: classes3.dex */
    public static class RestrictByServer implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private int f5237a;
        private String b;

        public RestrictByServer(int i, String str) {
            this.f5237a = i;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Target a2 = Bifrost.a(Bifrost.b());
            if (a2 == null) {
                return;
            }
            a2.a(this.f5237a, this.b);
        }
    }

    /* loaded from: classes3.dex */
    public static class SaveCfg implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private byte[] f5238a;
        private boolean b;
        private boolean c;
        private boolean d;

        public SaveCfg(byte[] bArr, boolean z, boolean z2, boolean z3) {
            this.f5238a = bArr;
            this.b = z;
            this.c = z2;
            this.d = z3;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Target a2 = Bifrost.a(Bifrost.b());
            if (a2 == null) {
                return;
            }
            a2.a(this.f5238a, this.b, this.c, this.d);
        }
    }

    /* loaded from: classes3.dex */
    public static class SendTrafficTelling implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private int f5239a;
        private long b;
        private int c;
        private int d;

        public SendTrafficTelling(int i, long j, int i2, int i3) {
            this.f5239a = i;
            this.b = j;
            this.c = i2;
            this.d = i3;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Target a2 = Bifrost.a(Bifrost.b());
            if (a2 == null) {
                return;
            }
            a2.a(this.f5239a, this.b, this.c, this.d);
        }
    }

    /* loaded from: classes3.dex */
    public static class SeqAck implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private long f5240a;

        public SeqAck(long j) {
            this.f5240a = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (Bifrost.a(Bifrost.b()) == null) {
            } else {
                Bifrost.a(this.f5240a);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class SeqUpdate implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private long f5241a;
        private boolean b;
        private boolean c;

        public SeqUpdate(long j, boolean z, boolean z2) {
            this.f5241a = j;
            this.b = z;
            this.c = z2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (Bifrost.a(Bifrost.b()) == null) {
            } else {
                Bifrost.a(this.f5241a, this.b, this.c);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class SessionCompensate implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Target a2 = Bifrost.a(Bifrost.b());
            if (a2 == null) {
                return;
            }
            a2.e();
        }
    }

    /* loaded from: classes3.dex */
    public static class SorryMsg implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private long f5242a;
        private int b;
        private String c;
        private int d;

        public SorryMsg(long j, int i, String str, int i2) {
            this.f5242a = j;
            this.b = i;
            this.c = str;
            this.d = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Target a2 = Bifrost.a(Bifrost.b());
            if (a2 == null) {
                return;
            }
            a2.a(this.f5242a, this.b, this.c, this.d);
        }
    }

    private static native void acknowledge(long j);

    public static native void alert(byte[] bArr);

    public static native void alter(byte[] bArr);

    public static native int ask();

    private static native void changeConnStatus(int i2, int i3);

    private static native void changeSeq(long j, boolean z, boolean z2);

    public static native void init();

    public static native void initialize(byte[] bArr);

    public static native void launch(long j);

    public static native void post(byte[] bArr);

    public static native void preConnect(String str, int i2, boolean z, int i3);

    private static native void prepare();

    public static native void readLock();

    public static native void readUnlock();

    public static native void remind();

    private static native void report(int i2, int i3, int i4);

    public static native void setCfg(byte[] bArr);

    public static native void setSwitch(byte[] bArr);

    public static native boolean start(byte[] bArr);

    public static native void stop();

    public static native void writeLock();

    public static native void writeUnlock();

    public static /* synthetic */ Target a(Bifrost bifrost) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Target) ipChange.ipc$dispatch("a88352ba", new Object[]{bifrost}) : bifrost.b;
    }

    public static /* synthetic */ void a(int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{new Integer(i2), new Integer(i3)});
        } else {
            changeConnStatus(i2, i3);
        }
    }

    public static /* synthetic */ void a(int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2619793b", new Object[]{new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            report(i2, i3, i4);
        }
    }

    public static /* synthetic */ void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{new Long(j)});
        } else {
            acknowledge(j);
        }
    }

    public static /* synthetic */ void a(long j, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("262f8adc", new Object[]{new Long(j), new Boolean(z), new Boolean(z2)});
        } else {
            changeSeq(j, z, z2);
        }
    }

    public static /* synthetic */ Alarm b(Bifrost bifrost) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Alarm) ipChange.ipc$dispatch("eb6e9000", new Object[]{bifrost}) : bifrost.e;
    }

    public static /* synthetic */ Bifrost b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bifrost) ipChange.ipc$dispatch("5f2ec368", new Object[0]) : g;
    }

    public static /* synthetic */ void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
        } else {
            prepare();
        }
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        AmnetLibraryLoadUtils.a("c++_shared", false);
        AmnetLibraryLoadUtils.a("openssl", false);
        AmnetLibraryLoadUtils.a("Bifrost", false);
        StnLogic.checkLibrary();
        SdtLogic.checkLibrary();
    }

    public synchronized void bifrostInit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e387f94", new Object[]{this});
        } else if (this.h) {
        } else {
            if (0 >= 3) {
                return;
            }
            if (!i.get(1)) {
                a();
                i.set(1);
            }
            if (!i.get(2)) {
                init();
                i.set(2);
            }
            this.h = true;
        }
    }

    public void register(Notepad notepad) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64c363dd", new Object[]{this, notepad});
        } else {
            this.c = notepad;
        }
    }

    public boolean activate(long j, Storage storage, Linkage linkage, AmnetSwitchManager amnetSwitchManager, Map<Byte, Channel> map, String str, String str2, String str3, Map<String, String> map2, Map<String, String> map3, Map<String, String> map4, String str4, String str5, boolean z, boolean z2, boolean z3, int i2, Map<String, Object> map5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e4df3a78", new Object[]{this, new Long(j), storage, linkage, amnetSwitchManager, map, str, str2, str3, map2, map3, map4, str4, str5, new Boolean(z), new Boolean(z2), new Boolean(z3), new Integer(i2), map5})).booleanValue();
        }
        Target target = this.b;
        if (target != null && !target.a(j)) {
            this.b.b();
            this.b = null;
        }
        if (this.b == null) {
            this.b = new Target(this.d, j);
        }
        return this.b.a(storage, linkage, amnetSwitchManager, map, str, str2, str3, map2, map3, map4, str4, str5, z, z2, z3, i2, map5);
    }

    public boolean post(long j, long j2, long j3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str, byte b, String str2, String str3, Map<String, String> map, byte[] bArr, Map<String, String> map2, long j4, long j5, boolean z6, boolean z7) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f634c2c", new Object[]{this, new Long(j), new Long(j2), new Long(j3), new Boolean(z), new Boolean(z2), new Boolean(z3), new Boolean(z4), new Boolean(z5), str, new Byte(b), str2, str3, map, bArr, map2, new Long(j4), new Long(j5), new Boolean(z6), new Boolean(z7)})).booleanValue();
        }
        Target target = this.b;
        if (target == null || !target.a(j)) {
            return false;
        }
        this.b.a(j2, j3, z, z2, z3, z4, z5, str, b, str2, str3, map, bArr, map2, j4, j5, z6, z7);
        return true;
    }

    public boolean alter(long j, int i2, String str, String str2, Map<Byte, byte[]> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("caaa3359", new Object[]{this, new Long(j), new Integer(i2), str, str2, map})).booleanValue();
        }
        Target target = this.b;
        if (target == null || !target.a(j)) {
            return false;
        }
        this.b.a(i2, str, str2, map);
        return true;
    }

    public boolean alert(long j, long j2, long j3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe1c7f85", new Object[]{this, new Long(j), new Long(j2), new Long(j3)})).booleanValue();
        }
        Target target = this.b;
        if (target == null || !target.a(j)) {
            return false;
        }
        this.b.a(j2, j3);
        return true;
    }

    public boolean launch(long j, NetTest netTest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1859f313", new Object[]{this, new Long(j), netTest})).booleanValue();
        }
        Target target = this.b;
        if (target == null || !target.a(j)) {
            return false;
        }
        this.b.a(netTest);
        return true;
    }

    public int query(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f324a748", new Object[]{this, new Long(j)})).intValue();
        }
        Target target = this.b;
        if (target != null && target.a(j)) {
            return this.b.a();
        }
        return -1;
    }

    public void inactivate(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46890505", new Object[]{this, new Long(j)});
            return;
        }
        Target target = this.b;
        if (target == null || !target.a(j)) {
            return;
        }
        this.b.b();
        this.b = null;
    }

    public void preConnect(long j, String str, int i2, boolean z, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("363119f2", new Object[]{this, new Long(j), str, new Integer(i2), new Boolean(z), new Integer(i3)});
            return;
        }
        Target target = this.b;
        if (target == null || !target.a(j)) {
            return;
        }
        this.b.a(str, i2, z, i3);
    }

    public Mercury getHandler() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Mercury) ipChange.ipc$dispatch("ab60c160", new Object[]{this}) : this.d;
    }

    public static void setSwchmng(AmnetSwitchManager amnetSwitchManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("faf34a6a", new Object[]{amnetSwitchManager});
        } else if (amnetSwitchManager == null) {
        } else {
            f = amnetSwitchManager;
        }
    }

    public static AmnetSwitchManager getSwchmng() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AmnetSwitchManager) ipChange.ipc$dispatch("1503dfaa", new Object[0]) : f;
    }

    public static final Bifrost instance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bifrost) ipChange.ipc$dispatch("a1e268d5", new Object[0]);
        }
        if (g == null) {
            d();
        }
        return g;
    }

    public static void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{str, str2, str3});
        } else {
            g.c.print(str, str2, str3);
        }
    }

    /* loaded from: classes3.dex */
    public static class InitInfCollect implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private InitInfCollect() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Target a2 = Bifrost.a(Bifrost.b());
            if (a2 == null) {
                return;
            }
            Bifrost.c();
            a2.c();
        }
    }

    /* loaded from: classes3.dex */
    public class DftNotepad implements Notepad {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.alipay.mobile.common.transportext.amnet.Notepad
        public void print(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7290cb92", new Object[]{this, str, str2, str3});
            }
        }

        private DftNotepad() {
        }
    }

    /* loaded from: classes3.dex */
    public class DftAlarm implements Alarm {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private DftAlarm() {
        }

        @Override // com.alipay.bifrost.Bifrost.Alarm
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
    public static class ReadZstdFileTelling implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private ReadZstdFileTelling() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Target a2 = Bifrost.a(Bifrost.b());
            if (a2 == null) {
                return;
            }
            a2.f();
        }
    }

    /* loaded from: classes3.dex */
    public class Messenger implements Mercury {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private LinkedList<Runnable> b;
        private LinkedList<Runnable> c;

        private Messenger() {
            this.b = new LinkedList<>();
            this.c = new LinkedList<>();
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Mercury
        public void post(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dd609e25", new Object[]{this, runnable});
                return;
            }
            synchronized (this) {
                this.b.addLast(runnable);
            }
            Bifrost.remind();
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Mercury
        public void drive() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ae704911", new Object[]{this});
                return;
            }
            LinkedList<Runnable> linkedList = this.c;
            synchronized (this) {
                this.c = this.b;
                this.b = linkedList;
            }
            while (!this.c.isEmpty()) {
                Runnable removeFirst = this.c.removeFirst();
                if (removeFirst != null) {
                    try {
                        removeFirst.run();
                    } finally {
                    }
                }
            }
        }
    }

    private Bifrost() {
    }

    private static synchronized void d() {
        synchronized (Bifrost.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("596b2eb", new Object[0]);
                return;
            }
            if (g == null) {
                g = new Bifrost();
            }
        }
    }

    public static final void routine() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82c6e34b", new Object[0]);
        } else {
            g.d.drive();
        }
    }

    public static final void saveCfg(byte[] bArr, boolean z, boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59d0d43f", new Object[]{bArr, new Boolean(z), new Boolean(z2), new Boolean(z3)});
        } else {
            g.d.post(new SaveCfg(bArr, z, z2, z3));
        }
    }

    public static final byte[] getCfg(String str, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("160744be", new Object[]{str, new Boolean(z), new Boolean(z2)});
        }
        Bifrost bifrost = g;
        if (bifrost == null) {
            a("ERROR", f5222a, "[getCfg] instance is null. ");
            return new byte[0];
        } else if (bifrost.b == null) {
            a("ERROR", f5222a, "[getCfg] instance.target is null. ");
            return new byte[0];
        } else if (StringUtils.isEmpty(str)) {
            a("ERROR", f5222a, "[getCfg] key is null or empty. ");
            return new byte[0];
        } else {
            return g.b.a(str, z, z2);
        }
    }

    public static final void collectInitInf() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc56d2e", new Object[0]);
        } else {
            g.d.post(new InitInfCollect());
        }
    }

    public static final void updateSeq(long j, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93bc62c7", new Object[]{new Long(j), new Boolean(z), new Boolean(z2)});
        } else {
            g.d.post(new SeqUpdate(j, z, z2));
        }
    }

    public static final void ackSeq(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2beeedc7", new Object[]{new Long(j)});
        } else {
            g.d.post(new SeqAck(j));
        }
    }

    public static final void statusConnection(int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea122f97", new Object[]{new Integer(i2), new Integer(i3)});
        } else {
            g.d.post(new ConnectionStatus(i2, i3));
        }
    }

    public static final void resultData(int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f941175", new Object[]{new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            g.d.post(new DataResult(i2, i3, i4));
        }
    }

    public static final void resultLaunch(long j, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c98fc074", new Object[]{new Long(j), bArr});
        } else {
            g.d.post(new LaunchResult(j, bArr));
        }
    }

    public static final void resultInit(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5880309b", new Object[]{bArr});
        } else {
            g.d.post(new InitResult(bArr));
        }
    }

    public static final void packageData(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a00eec9e", new Object[]{bArr});
        } else {
            g.d.post(new DataPackage(bArr));
        }
    }

    public static final void recycleData(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25496eab", new Object[]{bArr});
        } else {
            g.d.post(new DataRecycle(bArr));
        }
    }

    public static final void resultConn(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd0c75b7", new Object[]{bArr});
        } else {
            g.d.post(new ConnResult(bArr));
        }
    }

    public static final void resultDisconn(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e7c7bab", new Object[]{bArr});
        } else {
            g.d.post(new DisconnResult(bArr));
        }
    }

    public static final void resultHb(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("361a9c45", new Object[]{bArr});
        } else {
            g.d.post(new HbResult(bArr));
        }
    }

    public static final void serverRestrict(int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d65c9c27", new Object[]{new Integer(i2), str});
        } else {
            g.d.post(new RestrictByServer(i2, str));
        }
    }

    public static final void resultCmd(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e9a49ab", new Object[]{bArr});
        } else {
            g.d.post(new CmdResult(bArr));
        }
    }

    public static final void reLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfb6f27d", new Object[0]);
        } else {
            g.d.post(new LoginRetry());
        }
    }

    public static final void resendSessionid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80e3e1bd", new Object[0]);
        } else {
            g.d.post(new SessionCompensate());
        }
    }

    public static final void tellSendTraffic(int i2, long j, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87e9c22c", new Object[]{new Integer(i2), new Long(j), new Integer(i3), new Integer(i4)});
        } else {
            g.d.post(new SendTrafficTelling(i2, j, i3, i4));
        }
    }

    public static final void sorry(long j, int i2, String str, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("743eb976", new Object[]{new Long(j), new Integer(i2), str, new Integer(i3)});
        } else {
            g.d.post(new SorryMsg(j, i2, str, i3));
        }
    }

    public static final void track(int i2, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34acf585", new Object[]{new Integer(i2), str, str2});
        } else {
            a(i2 == 0 ? "VERBOSE" : i2 == 1 ? "DEBUG" : i2 == 2 ? "INFO" : i2 == 3 ? "WARN" : i2 == 4 ? "ERROR" : i2 == 5 ? "FATAL" : i2 == 6 ? "NONE" : "UNKNOWN", str, str2);
        }
    }

    public static final void reportPerfinfo(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("695037b9", new Object[]{bArr});
        } else {
            g.d.post(new ReportPerfinfo(bArr));
        }
    }

    public static final void tellReadZstdFile() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e687d13", new Object[0]);
        } else {
            g.d.post(new ReadZstdFileTelling());
        }
    }

    public boolean isHasInitBifrost() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("35199e88", new Object[]{this})).booleanValue() : this.h;
    }
}
