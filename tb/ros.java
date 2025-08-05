package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.network.diagnosis.c;
import com.taobao.mtop.wvplugin.a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes9.dex */
public class ros {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static volatile boolean h = false;
    private static final byte[] i = new byte[0];

    /* renamed from: a  reason: collision with root package name */
    public String f33279a;
    public int b;
    public String c;
    public String d;
    public int e;
    public int f;
    public long g;

    public static /* synthetic */ Set a(ros rosVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("efee5db1", new Object[]{rosVar}) : rosVar.e();
    }

    public static /* synthetic */ boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{new Boolean(z)})).booleanValue();
        }
        h = z;
        return z;
    }

    public static /* synthetic */ Set b(ros rosVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("293f6e72", new Object[]{rosVar}) : rosVar.d();
    }

    public static /* synthetic */ boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : h;
    }

    public static /* synthetic */ byte[] c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("ab8ad2b3", new Object[0]) : i;
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
        hashSet.add("nettype");
        hashSet.add(a.RESULT_KEY);
        hashSet.add("code");
        return hashSet;
    }

    private Set<String> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("d6c0f95b", new Object[]{this});
        }
        HashSet hashSet = new HashSet();
        hashSet.add("connecttime");
        return hashSet;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            rpa.a(new Runnable() { // from class: tb.ros.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put(c.IP, ros.this.f33279a);
                    hashMap.put("port", String.valueOf(ros.this.b));
                    hashMap.put("protocol", ros.this.c);
                    hashMap.put("nettype", ros.this.d);
                    hashMap.put(a.RESULT_KEY, String.valueOf(ros.this.e));
                    hashMap.put("code", String.valueOf(ros.this.f));
                    HashMap hashMap2 = new HashMap();
                    if (ros.this.g > 0) {
                        hashMap2.put("connecttime", Double.valueOf(ros.this.g));
                    }
                    if (!ros.b()) {
                        synchronized (ros.c()) {
                            if (!ros.b()) {
                                com.uploader.implement.c.a("ARUP", "QuicDetect", ros.a(ros.this), ros.b(ros.this), false);
                                ros.a(true);
                            }
                        }
                    }
                    if (com.uploader.implement.a.a(16)) {
                        com.uploader.implement.a.a(16, "QuicDetectStatistics", "commit statistic, dimensions:" + hashMap + ", measures:" + hashMap2);
                    }
                    com.uploader.implement.c.a("ARUP", "QuicDetect", hashMap2, hashMap);
                }
            });
        }
    }
}
