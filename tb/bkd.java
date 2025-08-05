package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.order.core.f;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class bkd {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String COMBINE_EVENT_ADD_NEXT_EVENT = "combineEventAddNext";
    public static final String COMBINE_EVENT_DISPATCH_EVENT = "combineEventDispatchEvent";
    public static final String COMBINE_EVENT_START = "combineEventStart";
    public static final String COMMON_EVENT_END = "commonEventEnd";
    public static final String COMMON_EVENT_START = "commonEventStart";
    public static final String ERROR_CODE_EVENT_CHAIN_COLOR_PARSE_ERROR = "EVENT_CHAIN_COLOR_PARSE_ERROR";
    public static final String ERROR_CODE_EVENT_CHAIN_EXPRESSION_PARSER_ENGINE_PARSE_ERROR = "EVENT_CHAIN_EXPRESSION_PARSER_ENGINE_PARSE_ERROR";
    public static final String ERROR_CODE_EVENT_CHAIN_NOT_FOUND = "EVENT_CHAIN_NOT_FOUND";
    public static final String ERROR_CODE_EVENT_CHAIN_PARAMS_VALID_ERROR = "EVENT_CHAIN_PARAMS_VALID_ERROR";
    public static final String ERROR_CODE_EVENT_CHAIN_TRY_EXCEPTION_ERROR = "EVENT_CHAIN_TRY_EXCEPTION_ERROR";
    public static final String EVENT_CHAIN_END = "eventChainOver";
    public static final String EVENT_CHAIN_NEXT = "eventChainNext";
    public static final String FEATURE_TYPE = "EventChain";

    static {
        kge.a(-548198845);
    }

    public static void a(String str, String str2, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("434e6e23", new Object[]{str, str2, strArr});
        } else if (f.b() == null) {
        } else {
            f.b().a(str, str2, "", "", 0, strArr);
        }
    }

    public static void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{str, str2, str3});
            return;
        }
        String str4 = "EVENT_CHAIN_PARAMS_VALID_ERROR".equals(str2) ? "参数错误" : str2;
        HashMap hashMap = new HashMap();
        hashMap.put("msg", str3);
        hzz a2 = f.a();
        if (a2 != null) {
            a2.a("EventChain", str + "-onHandleEventChain", str2, str4, hashMap);
        }
        a(str, str + "-onHandleEventChain", str2, str4, str3);
    }

    public static void a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee2b490", new Object[]{str, str2, str3, str4});
            return;
        }
        String str5 = "EVENT_CHAIN_PARAMS_VALID_ERROR".equals(str3) ? "参数错误" : str3;
        HashMap hashMap = new HashMap();
        hashMap.put("msg", str4);
        hzz a2 = f.a();
        if (a2 != null) {
            a2.a("EventChain", str + "-" + str2, str3, str5, hashMap);
        }
        a(str, str + "-" + str2, str3, str5, str4);
    }

    public static void a(String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("109fb67f", new Object[]{str, str2, str3, map});
            return;
        }
        String str4 = "EVENT_CHAIN_PARAMS_VALID_ERROR".equals(str3) ? "参数错误" : str3;
        hzz a2 = f.a();
        if (a2 != null) {
            a2.a("EventChain", str + "-" + str2, str3, str4, map);
        }
        a(str, str + "-" + str2, str3, str4, map.toString());
    }

    private static void a(String str, String str2, String str3, String str4, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e010a68f", new Object[]{str, str2, str3, str4, strArr});
        } else if (f.b() == null) {
        } else {
            f.b().a(str, str2, str3, str4, 0, strArr);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    public static java.lang.String a(java.lang.Throwable r3) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.bkd.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L15
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r3
            java.lang.String r3 = "1003a7b3"
            java.lang.Object r3 = r0.ipc$dispatch(r3, r1)
            java.lang.String r3 = (java.lang.String) r3
            return r3
        L15:
            if (r3 != 0) goto L1a
            java.lang.String r3 = ""
            return r3
        L1a:
            r0 = 0
            java.io.StringWriter r1 = new java.io.StringWriter     // Catch: java.lang.Throwable -> L53
            r1.<init>()     // Catch: java.lang.Throwable -> L53
            java.io.PrintWriter r2 = new java.io.PrintWriter     // Catch: java.lang.Throwable -> L54
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L54
            r3.printStackTrace(r2)     // Catch: java.lang.Throwable -> L3b
            java.lang.String r3 = r1.toString()     // Catch: java.lang.Throwable -> L3b
            r2.close()     // Catch: java.io.IOException -> L33
            r1.close()     // Catch: java.io.IOException -> L33
            goto L37
        L33:
            r0 = move-exception
            b(r0)
        L37:
            return r3
        L38:
            r3 = move-exception
            r0 = r2
            goto L41
        L3b:
            r0 = r2
            goto L54
        L3d:
            r3 = move-exception
            goto L41
        L3f:
            r3 = move-exception
            r1 = r0
        L41:
            if (r0 == 0) goto L49
            r0.close()     // Catch: java.io.IOException -> L47
            goto L49
        L47:
            r0 = move-exception
            goto L4f
        L49:
            if (r1 == 0) goto L52
            r1.close()     // Catch: java.io.IOException -> L47
            goto L52
        L4f:
            b(r0)
        L52:
            throw r3
        L53:
            r1 = r0
        L54:
            if (r0 == 0) goto L5c
            r0.close()     // Catch: java.io.IOException -> L5a
            goto L5c
        L5a:
            r3 = move-exception
            goto L62
        L5c:
            if (r1 == 0) goto L65
            r1.close()     // Catch: java.io.IOException -> L5a
            goto L65
        L62:
            b(r3)
        L65:
            java.lang.String r3 = "getStackTrace Exception"
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.bkd.a(java.lang.Throwable):java.lang.String");
    }

    public static void b(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd742bac", new Object[]{th});
        } else if (!DinamicXEngine.j() || th == null) {
        } else {
            th.printStackTrace();
        }
    }
}
