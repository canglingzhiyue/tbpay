package com.tmall.android.dai.internal.jsbridge;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes9.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String WALLE_API = "WVDAIHandler";

    static {
        kge.a(-611620255);
    }

    public static boolean a(String str, String str2, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cd6db0cb", new Object[]{str, str2, aVar})).booleanValue();
        }
        com.tmall.android.dai.internal.util.a.a("DAI", 19999, "handleWVDAIHandleEvent", str, str2, null);
        if (StringUtils.equals("runCompute", str)) {
            b(str2, aVar);
            return true;
        } else if (StringUtils.equals("setKKValue", str) || StringUtils.equals("removeKKValue", str)) {
            try {
                a(str2);
            } catch (Throwable th) {
                com.taobao.mrt.utils.a.b("WalleJsEventHandle", "put failed", th);
            }
            return true;
        } else if (!StringUtils.equals("getKKValue", str)) {
            return false;
        } else {
            try {
                a(str2, aVar);
            } catch (Throwable th2) {
                com.taobao.mrt.utils.a.b("WalleJsEventHandle", "get failed", th2);
            }
            return true;
        }
    }

    private static void a(String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4871c51", new Object[]{str, aVar});
            return;
        }
        KKVParams parseStringToKKVParams = KKVParams.parseStringToKKVParams(str);
        if (parseStringToKKVParams == null || StringUtils.isEmpty(parseStringToKKVParams.key)) {
            if (aVar == null) {
                return;
            }
            aVar.a(false, null, null, "params format error");
            return;
        }
        String str2 = parseStringToKKVParams.get();
        if (aVar == null) {
            return;
        }
        if (str2 == null) {
            aVar.a(false, null, null, "get value failed");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("value", str2);
        aVar.b(true, null, hashMap, null);
    }

    private static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        KKVParams parseStringToKKVParams = KKVParams.parseStringToKKVParams(str);
        if (parseStringToKKVParams != null && !StringUtils.isEmpty(parseStringToKKVParams.key)) {
            return parseStringToKKVParams.save();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void b(java.lang.String r7, final com.tmall.android.dai.internal.jsbridge.a r8) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.tmall.android.dai.internal.jsbridge.b.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            if (r1 == 0) goto L15
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r7
            r7 = 1
            r1[r7] = r8
            java.lang.String r7 = "2eb6a470"
            r0.ipc$dispatch(r7, r1)
            return
        L15:
            r0 = 0
            java.util.HashMap r1 = com.taobao.mrt.utils.f.b(r7)     // Catch: java.lang.Throwable -> L35
            if (r1 == 0) goto L32
            java.lang.String r3 = "name"
            java.lang.Object r3 = r1.get(r3)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L2f
            java.lang.String r4 = "inputData"
            java.lang.Object r4 = r1.get(r4)     // Catch: java.lang.Throwable -> L2d
            java.util.Map r4 = (java.util.Map) r4     // Catch: java.lang.Throwable -> L2d
            goto L42
        L2d:
            r4 = move-exception
            goto L38
        L2f:
            r4 = move-exception
            r3 = r0
            goto L38
        L32:
            r3 = r0
            r4 = r3
            goto L42
        L35:
            r4 = move-exception
            r1 = r0
            r3 = r1
        L38:
            java.lang.String r5 = r4.getMessage()
            java.lang.String r6 = "WalleJsEventHandle"
            com.taobao.mrt.utils.a.b(r6, r5, r4)
            r4 = r0
        L42:
            boolean r5 = android.text.StringUtils.isEmpty(r3)
            if (r5 == 0) goto L60
            if (r8 == 0) goto L5f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "参数错误. params="
            r3.append(r4)
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            r8.a(r2, r1, r0, r7)
        L5f:
            return
        L60:
            com.tmall.android.dai.internal.jsbridge.b$1 r7 = new com.tmall.android.dai.internal.jsbridge.b$1
            r7.<init>()
            com.tmall.android.dai.DAI.runCompute(r3, r4, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tmall.android.dai.internal.jsbridge.b.b(java.lang.String, com.tmall.android.dai.internal.jsbridge.a):void");
    }
}
