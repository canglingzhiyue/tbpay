package com.alibaba.poplayer.config.manager;

import android.util.LruCache;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final LruCache<String, String> f3177a;

    static {
        kge.a(434306983);
        f3177a = new LruCache<>(20);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(java.lang.String r7, java.lang.String r8) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.alibaba.poplayer.config.manager.d.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1c
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r7
            r1[r3] = r8
            java.lang.String r7 = "d9378d80"
            java.lang.Object r7 = r0.ipc$dispatch(r7, r1)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            return r7
        L1c:
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 == 0) goto L2a
            java.lang.Object[] r7 = new java.lang.Object[r2]
            java.lang.String r8 = "SceneMatcher.paramFilter is empty,check success."
            com.alibaba.poplayer.utils.c.a(r8, r7)
            return r3
        L2a:
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            java.lang.String r1 = "}"
            java.lang.String r4 = ""
            java.lang.String r5 = "configCheck"
            if (r0 == 0) goto L4f
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "SceneMatcher.curUrl is empty,check fail.paramFilter{"
        L3e:
            r7.append(r0)
            r7.append(r8)
            r7.append(r1)
            java.lang.String r7 = r7.toString()
            com.alibaba.poplayer.utils.c.c(r5, r4, r7)
            return r2
        L4f:
            r0 = 0
            android.util.LruCache<java.lang.String, java.lang.String> r6 = com.alibaba.poplayer.config.manager.d.f3177a     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r6 = r6.get(r7)     // Catch: java.lang.Throwable -> L6e
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L6e
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L6d
            if (r0 == 0) goto L6b
            java.lang.String r0 = "utf-8"
            java.lang.String r0 = java.net.URLDecoder.decode(r7, r0)     // Catch: java.lang.Throwable -> L6d
            android.util.LruCache<java.lang.String, java.lang.String> r6 = com.alibaba.poplayer.config.manager.d.f3177a     // Catch: java.lang.Throwable -> L6e
            r6.put(r7, r0)     // Catch: java.lang.Throwable -> L6e
            goto L77
        L6b:
            r0 = r6
            goto L77
        L6d:
            r0 = r6
        L6e:
            java.lang.Object[] r6 = new java.lang.Object[r3]
            r6[r2] = r7
            java.lang.String r7 = "SceneMatcher.currentParam:{%s} decode failed"
            com.alibaba.poplayer.utils.c.a(r7, r6)
        L77:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r6 = "SceneMatcher.after decode:currentParam:{"
            r7.append(r6)
            r7.append(r0)
            java.lang.String r6 = "},paramFilter{"
            r7.append(r6)
            r7.append(r8)
            r7.append(r1)
            java.lang.String r7 = r7.toString()
            com.alibaba.poplayer.utils.c.c(r5, r4, r7)
            if (r0 != 0) goto La1
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "SceneMatcher.miss.currentParam == null.notContains.paramContain"
            goto L3e
        La1:
            int r7 = r8.length()
            java.lang.String r1 = "."
            if (r7 <= r3) goto Ldc
            java.lang.String r7 = "@"
            boolean r2 = r8.startsWith(r7)
            if (r2 == 0) goto Ldc
            boolean r7 = r8.endsWith(r7)
            if (r7 == 0) goto Ldc
            int r7 = r8.length()
            int r7 = r7 - r3
            java.lang.String r7 = r8.substring(r3, r7)
            boolean r7 = com.alibaba.poplayer.utils.d.a(r7, r0)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "SceneMatcher.byRegex.match="
            r8.append(r0)
            r8.append(r7)
            r8.append(r1)
            java.lang.String r8 = r8.toString()
            com.alibaba.poplayer.utils.c.c(r5, r4, r8)
            return r7
        Ldc:
            boolean r7 = r0.contains(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "SceneMatcher.byContains.match="
            r8.append(r0)
            r8.append(r7)
            r8.append(r1)
            java.lang.String r8 = r8.toString()
            com.alibaba.poplayer.utils.c.c(r5, r4, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.poplayer.config.manager.d.a(java.lang.String, java.lang.String):boolean");
    }
}
