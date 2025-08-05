package com.taobao.tao.flexbox.layoutmanager.filter;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.f;
import tb.kge;

/* loaded from: classes8.dex */
public class ThemeUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-876597930);
    }

    @FilterHandler(name = f.IS_ELDER)
    public static boolean isElder() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f4e0938b", new Object[0])).booleanValue() : com.taobao.tao.flexbox.layoutmanager.adapter.a.a().z().a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
        return "";
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(java.lang.String r3, java.util.List r4) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.tao.flexbox.layoutmanager.filter.ThemeUtils.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            if (r1 == 0) goto L16
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r3
            r3 = 1
            r1[r3] = r4
            java.lang.String r3 = "f1cf6c6f"
            java.lang.Object r3 = r0.ipc$dispatch(r3, r1)
            return r3
        L16:
            r4 = -1
            int r0 = r3.hashCode()     // Catch: java.lang.Throwable -> L37
            r1 = 2057998080(0x7aaa8f00, float:4.4279543E35)
            if (r0 == r1) goto L21
            goto L2b
        L21:
            java.lang.String r0 = "isElder"
            boolean r0 = r3.equals(r0)     // Catch: java.lang.Throwable -> L37
            if (r0 == 0) goto L2b
            r4 = 0
        L2b:
            if (r4 == 0) goto L2e
            goto L56
        L2e:
            boolean r4 = isElder()     // Catch: java.lang.Throwable -> L37
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Throwable -> L37
            return r3
        L37:
            r4 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "error:"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r4.getMessage()
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r4 = "theme.filter"
            tb.ogg.a(r4, r3)
        L56:
            java.lang.String r3 = ""
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.filter.ThemeUtils.a(java.lang.String, java.util.List):java.lang.Object");
    }
}
