package tb;

import android.os.Build;
import android.os.Debug;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.metrickit.utils.d;
import com.taobao.tao.log.TLog;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class mks {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f31075a;
    private Map<String, ?> b;
    private long c;
    private long d;
    private long e;
    private long f;
    private long g;
    private long h;
    private final Map<String, String> i;
    private Debug.MemoryInfo j;

    public mks(Map<String, String> map) {
        this.i = new HashMap(map);
    }

    public mks(int i, Map<String, ?> map, long j, long j2, long j3, long j4, long j5, long j6, Map<String, String> map2, Debug.MemoryInfo memoryInfo) {
        this.f31075a = i;
        this.b = map;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = j4;
        this.g = j5;
        this.h = j6;
        this.i = new HashMap(map2);
        this.j = memoryInfo;
    }

    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.f31075a;
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        Map<String, ?> map = this.b;
        if (map != null && map.containsKey("level")) {
            Object obj = this.b.get("level");
            if (obj instanceof Integer) {
                return ((Integer) obj).intValue();
            }
        }
        return -1;
    }

    public long c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5e", new Object[]{this})).longValue() : this.c;
    }

    public long d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2df", new Object[]{this})).longValue() : this.d;
    }

    public long e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca60", new Object[]{this})).longValue() : this.e;
    }

    public long f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1e1", new Object[]{this})).longValue() : this.f;
    }

    public long g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f962", new Object[]{this})).longValue() : this.g;
    }

    public long h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5cf10e3", new Object[]{this})).longValue() : this.h;
    }

    public long i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5dd2864", new Object[]{this})).longValue() : mqe.a((Object) this.i.get("art.gc.gc-count"), 0L);
    }

    public long j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5eb3fe5", new Object[]{this})).longValue() : mqe.a((Object) this.i.get("art.gc.gc-time"), 0L);
    }

    public long k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5f95766", new Object[]{this})).longValue() : mqe.a((Object) this.i.get("art.gc.bytes-allocated"), 0L);
    }

    public long l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6076ee7", new Object[]{this})).longValue() : mqe.a((Object) this.i.get("art.gc.bytes-freed"), 0L);
    }

    public long m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6158668", new Object[]{this})).longValue() : mqe.a((Object) this.i.get("art.gc.blocking-gc-count"), 0L);
    }

    public long n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6239de9", new Object[]{this})).longValue() : mqe.a((Object) this.i.get("art.gc.blocking-gc-time"), 0L);
    }

    public Map<String, Long> o() {
        Debug.MemoryInfo memoryInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("df66012b", new Object[]{this});
        }
        if (Build.VERSION.SDK_INT >= 23 && (memoryInfo = this.j) != null) {
            Map<String, String> memoryStats = memoryInfo.getMemoryStats();
            HashMap hashMap = new HashMap();
            for (Map.Entry<String, String> entry : memoryStats.entrySet()) {
                hashMap.put(entry.getKey(), Long.valueOf(mqe.a((Object) entry.getValue(), 0L) << 10));
            }
            return hashMap;
        }
        return Collections.emptyMap();
    }

    public int p() {
        Debug.MemoryInfo memoryInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("63fccea", new Object[]{this})).intValue();
        }
        if (Build.VERSION.SDK_INT < 23 || (memoryInfo = this.j) == null) {
            return -1;
        }
        try {
            return ((Integer) d.a(Debug.MemoryInfo.class, "getOtherPrivate", memoryInfo, new Class[]{Integer.TYPE}, new Object[]{4})).intValue() << 10;
        } catch (Exception e) {
            e.printStackTrace();
            TLog.loge("MetricKit.MemoryCollectResult", "memoryInfo OTHER_GL_DEV get fail.", e);
            return -1;
        }
    }

    public int q() {
        Debug.MemoryInfo memoryInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("64de46b", new Object[]{this})).intValue();
        }
        if (Build.VERSION.SDK_INT < 23 || (memoryInfo = this.j) == null) {
            return -1;
        }
        try {
            return ((Integer) d.a(Debug.MemoryInfo.class, "getOtherPrivate", memoryInfo, new Class[]{Integer.TYPE}, new Object[]{14})).intValue() << 10;
        } catch (Exception e) {
            e.printStackTrace();
            TLog.loge("MetricKit.MemoryCollectResult", "memoryInfo OTHER_GRAPHICS get fail.", e);
            return -1;
        }
    }

    public int r() {
        Debug.MemoryInfo memoryInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65bfbec", new Object[]{this})).intValue();
        }
        if (Build.VERSION.SDK_INT < 23 || (memoryInfo = this.j) == null) {
            return -1;
        }
        try {
            return ((Integer) d.a(Debug.MemoryInfo.class, "getOtherPrivate", memoryInfo, new Class[]{Integer.TYPE}, new Object[]{15})).intValue() << 10;
        } catch (Exception e) {
            e.printStackTrace();
            TLog.loge("MetricKit.MemoryCollectResult", "memoryInfo OTHER_GL get fail.", e);
            return -1;
        }
    }
}
