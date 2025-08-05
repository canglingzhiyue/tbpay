package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.network.diagnosis.c;
import com.taobao.mtop.wvplugin.a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes9.dex */
public class roi {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static volatile boolean s = false;
    private static final byte[] t = new byte[0];

    /* renamed from: a  reason: collision with root package name */
    public String f33267a;
    public int b;
    public String c;
    public int d;
    public int e;
    public String f;
    public String g;
    public int h;
    public int i;
    public long j;
    public long k;
    public long l;
    public int m;
    public double n;
    public double o;
    public int p;
    public int q;
    public long r;

    public static /* synthetic */ Set a(roi roiVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("423b887b", new Object[]{roiVar}) : roiVar.e();
    }

    public static /* synthetic */ boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{new Boolean(z)})).booleanValue();
        }
        s = z;
        return z;
    }

    public static /* synthetic */ Set b(roi roiVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("7b8c993c", new Object[]{roiVar}) : roiVar.d();
    }

    public static /* synthetic */ boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : s;
    }

    public static /* synthetic */ byte[] c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("ab8ad2b3", new Object[0]) : t;
    }

    private Set<String> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("916979a", new Object[]{this});
        }
        HashSet hashSet = new HashSet();
        hashSet.add(c.IP);
        hashSet.add("port");
        hashSet.add("protocol");
        hashSet.add(a.RESULT_KEY);
        hashSet.add("errorcode");
        hashSet.add("scid");
        hashSet.add("dcid");
        hashSet.add("congcontrolkind");
        hashSet.add("xqc0rttstatus");
        return hashSet;
    }

    private Set<String> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("d6c0f95b", new Object[]{this});
        }
        HashSet hashSet = new HashSet();
        hashSet.add("connecttime");
        hashSet.add("livetime");
        hashSet.add("requestcount");
        hashSet.add("sendcount");
        hashSet.add("retransmissionrate");
        hashSet.add("lossrate");
        hashSet.add("tlpcount");
        hashSet.add("rtocount");
        hashSet.add("srtt");
        return hashSet;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            rpa.a(new Runnable() { // from class: tb.roi.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put(c.IP, roi.this.f33267a);
                    hashMap.put("port", String.valueOf(roi.this.b));
                    hashMap.put("protocol", roi.this.c);
                    hashMap.put(a.RESULT_KEY, String.valueOf(roi.this.d));
                    hashMap.put("errorcode", String.valueOf(roi.this.e));
                    hashMap.put("scid", roi.this.f);
                    hashMap.put("dcid", roi.this.g);
                    hashMap.put("congcontrolkind", String.valueOf(roi.this.h));
                    hashMap.put("xqc0rttstatus", String.valueOf(roi.this.i));
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("connecttime", Double.valueOf(roi.this.j));
                    hashMap2.put("livetime", Double.valueOf(roi.this.k));
                    hashMap2.put("requestcount", Double.valueOf(roi.this.l));
                    hashMap2.put("sendcount", Double.valueOf(roi.this.m));
                    hashMap2.put("retransmissionrate", Double.valueOf(roi.this.n));
                    hashMap2.put("lossrate", Double.valueOf(roi.this.o));
                    hashMap2.put("tlpcount", Double.valueOf(roi.this.p));
                    hashMap2.put("rtocount", Double.valueOf(roi.this.q));
                    hashMap2.put("srtt", Double.valueOf(roi.this.r));
                    if (!roi.b()) {
                        synchronized (roi.c()) {
                            if (!roi.b()) {
                                com.uploader.implement.c.a("ARUP", "Session", roi.a(roi.this), roi.b(roi.this), false);
                                roi.a(true);
                            }
                        }
                    }
                    if (com.uploader.implement.a.a(16)) {
                        com.uploader.implement.a.a(16, "SessionStatistics", "commit statistic, dimensions:" + hashMap + ", measures:" + hashMap2);
                    }
                    com.uploader.implement.c.a("ARUP", "Session", hashMap2, hashMap);
                }
            });
        }
    }
}
