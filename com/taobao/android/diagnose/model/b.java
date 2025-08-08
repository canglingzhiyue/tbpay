package com.taobao.android.diagnose.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;

/* loaded from: classes.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String AVAIL_INTERNAL_SPACE = "availInternalSpace";
    public static final String AVAIL_MEM = "availMem";
    public static final String BATTERY_CAPACITY = "batteryLevel";
    public static final String DALVIK_MAX = "dalvikMax";
    public static final String DALVIK_PRIVATE_DIRTY = "dalvikPDirty";
    public static final String DALVIK_PSS = "dalvikPss";
    public static final String DALVIK_USED = "dalvikUsed";
    public static final String DALVIK_USED_RATIO = "dalvikUsedRatio";
    public static final String GC_ALLOC_SIZE = "gcAllocSize";
    public static final String GC_BLOCK_COUNT = "gcBlockCount";
    public static final String GC_BLOCK_TIME = "gcBlockTime";
    public static final String GC_COUNT = "gcCount";
    public static final String GC_FREE_SIZE = "gcFreeSize";
    public static final String GC_TIME = "gcTime";
    public static final String GL_DEV_MEM = "glDev";
    public static final String GL_MEM = "gl";
    public static final String GRAPHICS_MEM = "graphics";
    public static final String IS_CHARGING = "isCharging";
    public static final String NATIVE_HEAP = "nativeHeap";
    public static final String NATIVE_HEAP_USED = "nativeHeapUsed";
    public static final String NATIVE_PRIVATE_DIRTY = "nativePDirty";
    public static final String NATIVE_PSS = "nativePss";
    public static final String TOTAL_INTERNAL_SPACE = "totalInternalSpace";
    public static final String TOTAL_MEM = "totalMem";
    public static final String TOTAL_PRIVATE_DIRTY = "totalPDirty";
    public static final String TOTAL_PSS = "totalPss";

    /* renamed from: a  reason: collision with root package name */
    public long f11714a;
    private final Map<String, Long> b = new ConcurrentHashMap();

    static {
        kge.a(-2062075486);
    }

    public void a(long j, long j2, long j3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("262808dc", new Object[]{this, new Long(j), new Long(j2), new Long(j3)});
            return;
        }
        a(DALVIK_USED_RATIO, j3);
        a(DALVIK_USED, j2);
        a(DALVIK_MAX, j);
    }

    public void c(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5de416a", new Object[]{this, new Long(j), new Long(j2)});
            return;
        }
        a(TOTAL_INTERNAL_SPACE, j);
        a(AVAIL_INTERNAL_SPACE, j2);
    }

    public void a(long j, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1206f8", new Object[]{this, new Long(j), new Boolean(z)});
            return;
        }
        a(BATTERY_CAPACITY, j);
        a(IS_CHARGING, z ? 1L : 0L);
    }

    public void a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123b0d2", new Object[]{this, str, new Long(j)});
        } else {
            this.b.put(str, Long.valueOf(j));
        }
    }

    public Map<String, String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, Long> entry : this.b.entrySet()) {
            hashMap.put(entry.getKey(), b(entry.getKey(), entry.getValue().longValue()));
        }
        return hashMap;
    }

    public String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        Long l = this.b.get(str);
        return l != null ? b(str, l.longValue()) : "";
    }

    public long b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3dd7e567", new Object[]{this, str})).longValue();
        }
        Long l = this.b.get(str);
        if (l == null) {
            return 0L;
        }
        return l.longValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
        if (r5.equals(com.taobao.android.diagnose.model.b.DALVIK_USED_RATIO) != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String b(java.lang.String r5, long r6) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.diagnose.model.b.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            r4 = 2
            if (r1 == 0) goto L1d
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r3] = r5
            java.lang.Long r5 = new java.lang.Long
            r5.<init>(r6)
            r1[r2] = r5
            java.lang.String r5 = "ea37ed0f"
            java.lang.Object r5 = r0.ipc$dispatch(r5, r1)
            java.lang.String r5 = (java.lang.String) r5
            return r5
        L1d:
            boolean r0 = android.text.StringUtils.isEmpty(r5)
            if (r0 == 0) goto L26
            java.lang.String r5 = ""
            return r5
        L26:
            r0 = -1
            int r1 = r5.hashCode()
            switch(r1) {
                case -1708606089: goto L6f;
                case -1252129335: goto L64;
                case -176816749: goto L59;
                case 199051134: goto L4e;
                case 642845115: goto L43;
                case 1860104830: goto L38;
                case 2037570085: goto L2f;
                default: goto L2e;
            }
        L2e:
            goto L79
        L2f:
            java.lang.String r1 = "dalvikUsedRatio"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L79
            goto L7a
        L38:
            java.lang.String r1 = "gcBlockCount"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L79
            r2 = 6
            goto L7a
        L43:
            java.lang.String r1 = "isCharging"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L79
            r2 = 2
            goto L7a
        L4e:
            java.lang.String r1 = "gcBlockTime"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L79
            r2 = 3
            goto L7a
        L59:
            java.lang.String r1 = "gcCount"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L79
            r2 = 5
            goto L7a
        L64:
            java.lang.String r1 = "gcTime"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L79
            r2 = 4
            goto L7a
        L6f:
            java.lang.String r1 = "batteryLevel"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L79
            r2 = 0
            goto L7a
        L79:
            r2 = -1
        L7a:
            switch(r2) {
                case 0: goto La8;
                case 1: goto La8;
                case 2: goto L9a;
                case 3: goto L87;
                case 4: goto L87;
                case 5: goto L82;
                case 6: goto L82;
                default: goto L7d;
            }
        L7d:
            java.lang.String r5 = com.taobao.android.diagnose.common.d.a(r6)
            return r5
        L82:
            java.lang.String r5 = java.lang.String.valueOf(r6)
            return r5
        L87:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r6)
            java.lang.String r6 = "ms"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            return r5
        L9a:
            r0 = 1
            int r5 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r5 != 0) goto La4
            java.lang.String r5 = "true"
            return r5
        La4:
            java.lang.String r5 = "false"
            return r5
        La8:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r6)
            java.lang.String r6 = "%"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.diagnose.model.b.b(java.lang.String, long):java.lang.String");
    }
}
