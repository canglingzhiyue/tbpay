package com.taobao.tao.flexbox.layoutmanager.filter;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import tb.kge;
import tb.oec;

/* loaded from: classes8.dex */
public class MapUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1449515741);
    }

    @FilterHandler(name = "mergeMap")
    public static Map mergeMap(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("138d18b8", new Object[]{obj, obj2});
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (!map.isEmpty()) {
                linkedHashMap.putAll(map);
            }
        }
        if (obj2 instanceof Map) {
            Map map2 = (Map) obj2;
            if (!map2.isEmpty()) {
                linkedHashMap.putAll(map2);
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.Map] */
    @FilterHandler(name = "deleteKey")
    public static Object deleteKey(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("fef5c51f", new Object[]{obj, obj2});
        }
        if (obj instanceof Map) {
            obj = oec.a((Map) obj);
            if (obj2 instanceof List) {
                for (Object obj3 : (List) obj2) {
                    obj.remove(obj3);
                }
            } else {
                obj.remove(obj2);
            }
        }
        return obj;
    }

    @FilterHandler(name = "buildMap")
    public static Object buildMap(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("533edb05", new Object[]{obj, obj2});
        }
        HashMap hashMap = new HashMap();
        hashMap.put(obj, obj2);
        return hashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
        if (r0 == 1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
        if (r0 == 2) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005c, code lost:
        return buildMap(r7.get(0), r7.get(1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0069, code lost:
        return deleteKey(r7.get(0), r7.get(1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
        return "";
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(java.lang.String r6, java.util.List r7) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.tao.flexbox.layoutmanager.filter.MapUtils.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L16
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r3] = r6
            r1[r4] = r7
            java.lang.String r6 = "f1cf6c6f"
            java.lang.Object r6 = r0.ipc$dispatch(r6, r1)
            return r6
        L16:
            r0 = -1
            int r1 = r6.hashCode()     // Catch: java.lang.Throwable -> L77
            r5 = -1430673394(0xffffffffaab9a80e, float:-3.2979213E-13)
            if (r1 == r5) goto L40
            r5 = -501711356(0xffffffffe2187e04, float:-7.032464E20)
            if (r1 == r5) goto L35
            r5 = -358728524(0xffffffffea9e3cb4, float:-9.564847E25)
            if (r1 == r5) goto L2b
            goto L49
        L2b:
            java.lang.String r1 = "deleteKey"
            boolean r1 = r6.equals(r1)     // Catch: java.lang.Throwable -> L77
            if (r1 == 0) goto L49
            r0 = 1
            goto L49
        L35:
            java.lang.String r1 = "mergeMap"
            boolean r1 = r6.equals(r1)     // Catch: java.lang.Throwable -> L77
            if (r1 == 0) goto L49
            r0 = 0
            goto L49
        L40:
            java.lang.String r1 = "buildMap"
            boolean r1 = r6.equals(r1)     // Catch: java.lang.Throwable -> L77
            if (r1 == 0) goto L49
            r0 = 2
        L49:
            if (r0 == 0) goto L6a
            if (r0 == r4) goto L5d
            if (r0 == r2) goto L50
            goto L96
        L50:
            java.lang.Object r0 = r7.get(r3)     // Catch: java.lang.Throwable -> L77
            java.lang.Object r7 = r7.get(r4)     // Catch: java.lang.Throwable -> L77
            java.lang.Object r6 = buildMap(r0, r7)     // Catch: java.lang.Throwable -> L77
            return r6
        L5d:
            java.lang.Object r0 = r7.get(r3)     // Catch: java.lang.Throwable -> L77
            java.lang.Object r7 = r7.get(r4)     // Catch: java.lang.Throwable -> L77
            java.lang.Object r6 = deleteKey(r0, r7)     // Catch: java.lang.Throwable -> L77
            return r6
        L6a:
            java.lang.Object r0 = r7.get(r3)     // Catch: java.lang.Throwable -> L77
            java.lang.Object r7 = r7.get(r4)     // Catch: java.lang.Throwable -> L77
            java.util.Map r6 = mergeMap(r0, r7)     // Catch: java.lang.Throwable -> L77
            return r6
        L77:
            r7 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "error:"
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r7.getMessage()
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r7 = "map.filter"
            tb.ogg.a(r7, r6)
        L96:
            java.lang.String r6 = ""
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.filter.MapUtils.a(java.lang.String, java.util.List):java.lang.Object");
    }
}
