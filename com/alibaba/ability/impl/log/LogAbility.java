package com.alibaba.ability.impl.log;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import com.taobao.tao.log.LogLevel;
import com.taobao.tao.log.e;
import com.taobao.trtc.api.TrtcConstants;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.ai;
import kotlin.jvm.internal.q;
import tb.alm;
import tb.als;
import tb.amc$a;
import tb.kge;

/* loaded from: classes2.dex */
public final class LogAbility extends alm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String API_DEBUG = "debug";
    public static final String API_ERROR = "error";
    public static final String API_INFO = "info";
    public static final String API_WARN = "warn";
    public static final amc$a Companion;

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentHashMap<String, Integer> f1910a = new ConcurrentHashMap<>();

    static {
        kge.a(-558094662);
        Companion = new amc$a(null);
    }

    public static /* synthetic */ Object ipc$super(LogAbility logAbility, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public LogAbility() {
        e.a().a("Megability/Log", LogLevel.I);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0058, code lost:
        if (r9.equals("error") != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0075, code lost:
        if (r9.equals(com.alibaba.ability.impl.log.LogAbility.API_WARN) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007e, code lost:
        if (r9.equals("info") != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0080, code lost:
        com.alibaba.ability.e.c(new tb.amc$b(r8, r11, r9, r10, r12));
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0090, code lost:
        return null;
     */
    @Override // com.alibaba.ability.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.alibaba.ability.result.ExecuteResult execute(final java.lang.String r9, final tb.als r10, final java.util.Map<java.lang.String, ? extends java.lang.Object> r11, final tb.aln r12) {
        /*
            r8 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.alibaba.ability.impl.log.LogAbility.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L21
            r1 = 5
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r8
            r2 = 1
            r1[r2] = r9
            r9 = 2
            r1[r9] = r10
            r9 = 3
            r1[r9] = r11
            r9 = 4
            r1[r9] = r12
            java.lang.String r9 = "a38490db"
            java.lang.Object r9 = r0.ipc$dispatch(r9, r1)
            com.alibaba.ability.result.ExecuteResult r9 = (com.alibaba.ability.result.ExecuteResult) r9
            return r9
        L21:
            java.lang.String r0 = "api"
            kotlin.jvm.internal.q.d(r9, r0)
            java.lang.String r0 = "context"
            kotlin.jvm.internal.q.d(r10, r0)
            java.lang.String r0 = "params"
            kotlin.jvm.internal.q.d(r11, r0)
            java.lang.String r0 = "callback"
            kotlin.jvm.internal.q.d(r12, r0)
            r0 = 0
            java.lang.String r1 = "event"
            java.lang.String r1 = com.alibaba.ability.e.a(r11, r1, r0)
            if (r1 != 0) goto L4a
            com.alibaba.ability.result.a$a$a r9 = com.alibaba.ability.result.a$a.Companion
            java.lang.String r10 = "缺少 event 参数"
            com.alibaba.ability.result.ErrorResult r9 = r9.b(r10)
            com.alibaba.ability.result.ExecuteResult r9 = (com.alibaba.ability.result.ExecuteResult) r9
            return r9
        L4a:
            int r1 = r9.hashCode()
            switch(r1) {
                case 3237038: goto L78;
                case 3641990: goto L6e;
                case 95458899: goto L5b;
                case 96784904: goto L52;
                default: goto L51;
            }
        L51:
            goto L91
        L52:
            java.lang.String r1 = "error"
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L91
            goto L80
        L5b:
            java.lang.String r12 = "debug"
            boolean r12 = r9.equals(r12)
            if (r12 == 0) goto L91
            tb.amc$c r12 = new tb.amc$c
            r12.<init>()
            java.lang.Runnable r12 = (java.lang.Runnable) r12
            com.alibaba.ability.e.c(r12)
            return r0
        L6e:
            java.lang.String r1 = "warn"
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L91
            goto L80
        L78:
            java.lang.String r1 = "info"
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L91
        L80:
            tb.amc$b r1 = new tb.amc$b
            r2 = r1
            r3 = r8
            r4 = r11
            r5 = r9
            r6 = r10
            r7 = r12
            r2.<init>()
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            com.alibaba.ability.e.c(r1)
            return r0
        L91:
            com.alibaba.ability.result.a$a$a r9 = com.alibaba.ability.result.a$a.Companion
            java.lang.String r10 = "能力没找到"
            com.alibaba.ability.result.ErrorResult r9 = r9.a(r10)
            com.alibaba.ability.result.ExecuteResult r9 = (com.alibaba.ability.result.ExecuteResult) r9
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ability.impl.log.LogAbility.execute(java.lang.String, tb.als, java.util.Map, tb.aln):com.alibaba.ability.result.ExecuteResult");
    }

    private final boolean a(als alsVar, Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("783ac159", new Object[]{this, alsVar, map})).booleanValue();
        }
        Object c = alsVar.c("pageId");
        if (!(c instanceof String)) {
            c = null;
        }
        String str = (String) c;
        if (str == null) {
            str = "default";
        }
        q.a((Object) str, (Object) "default");
        Integer num = this.f1910a.get(str);
        if (num == null) {
            num = 0;
        }
        q.b(num, "logSizeMap[pageId] ?: 0");
        int intValue = num.intValue() + new JSONObject(map).toJSONString().length();
        if (intValue > 1048576) {
            return true;
        }
        this.f1910a.put(str, Integer.valueOf(intValue));
        return false;
    }

    private final String b(als alsVar, Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e6ca2a6c", new Object[]{this, alsVar, map});
        }
        String a2 = com.alibaba.ability.e.a(map, "parentId", (String) null);
        if (a2 != null) {
            return a2;
        }
        Object c = alsVar.c("pageId");
        if (!(c instanceof String)) {
            c = null;
        }
        return (String) c;
    }

    private final RVLLevel a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RVLLevel) ipChange.ipc$dispatch("b9297161", new Object[]{this, str});
        }
        int hashCode = str.hashCode();
        if (hashCode != 3237038) {
            if (hashCode != 3641990) {
                if (hashCode == 96784904 && str.equals("error")) {
                    return RVLLevel.Error;
                }
            } else if (str.equals(API_WARN)) {
                return RVLLevel.Warn;
            }
        } else if (str.equals("info")) {
            return RVLLevel.Info;
        }
        return RVLLevel.Debug;
    }

    private final Map<String, Object> a(Map<String, ? extends Object> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("85c7b09c", new Object[]{this, map, str});
        }
        Map<String, Object> c = ai.c(map);
        if (c.containsKey("errorMessage")) {
            c.put("errorMsg", c.get("errorMessage"));
            c.remove("errorMessage");
        }
        c.put("parentId", c.get("parentID"));
        c.remove("parentID");
        c.put("ext", c.get(TrtcConstants.TRTC_PARAMS_EXTENSION));
        c.remove(TrtcConstants.TRTC_PARAMS_EXTENSION);
        c.put("level", a(str));
        return c;
    }
}
