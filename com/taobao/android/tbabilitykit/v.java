package com.taobao.android.tbabilitykit;

import com.alibaba.ability.b;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public final class v implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String API_ZCACHE_PREFETCH = "prefetch";
    public static final a Companion;
    public static final String ZCAHCE_PREFETCH = "2783373117543948173";

    static {
        kge.a(664999648);
        kge.a(-948502777);
        Companion = new a(null);
    }

    /* loaded from: classes6.dex */
    public static final class a {
        static {
            kge.a(-1528042968);
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005f, code lost:
        if (kotlin.jvm.internal.x.e(r5) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006d, code lost:
        if (kotlin.jvm.internal.x.e(r5) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006f, code lost:
        r5 = null;
     */
    @Override // com.alibaba.ability.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.alibaba.ability.result.ExecuteResult execute(java.lang.String r5, tb.als r6, java.util.Map<java.lang.String, ? extends java.lang.Object> r7, tb.aln r8) {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.tbabilitykit.v.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 3
            if (r1 == 0) goto L21
            r1 = 5
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r3 = 0
            r1[r3] = r4
            r3 = 1
            r1[r3] = r5
            r5 = 2
            r1[r5] = r6
            r1[r2] = r7
            r5 = 4
            r1[r5] = r8
            java.lang.String r5 = "a38490db"
            java.lang.Object r5 = r0.ipc$dispatch(r5, r1)
            com.alibaba.ability.result.ExecuteResult r5 = (com.alibaba.ability.result.ExecuteResult) r5
            return r5
        L21:
            java.lang.String r0 = "api"
            kotlin.jvm.internal.q.d(r5, r0)
            java.lang.String r0 = "context"
            kotlin.jvm.internal.q.d(r6, r0)
            java.lang.String r6 = "params"
            kotlin.jvm.internal.q.d(r7, r6)
            java.lang.String r6 = "callback"
            kotlin.jvm.internal.q.d(r8, r6)
            int r6 = r5.hashCode()
            r8 = -1288666633(0xffffffffb33081f7, float:-4.1096396E-8)
            if (r6 == r8) goto L40
            goto L8a
        L40:
            java.lang.String r6 = "prefetch"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L8a
            java.lang.String r5 = "resources"
            java.lang.Object r6 = r7.get(r5)
            boolean r6 = kotlin.jvm.internal.x.e(r6)
            r8 = 0
            if (r6 == 0) goto L62
            java.lang.Object r5 = r7.get(r5)
            boolean r6 = kotlin.jvm.internal.x.e(r5)
            if (r6 != 0) goto L70
            goto L6f
        L62:
            java.lang.String r5 = "prefetchList"
            java.lang.Object r5 = r7.get(r5)
            boolean r6 = kotlin.jvm.internal.x.e(r5)
            if (r6 != 0) goto L70
        L6f:
            r5 = r8
        L70:
            java.util.List r5 = (java.util.List) r5
            if (r5 != 0) goto L7f
            com.alibaba.ability.result.a$a$a r5 = com.alibaba.ability.result.a$a.Companion
            java.lang.String r6 = "ZCache prefetch list is empty"
            com.alibaba.ability.result.ErrorResult r5 = r5.b(r6)
            com.alibaba.ability.result.ExecuteResult r5 = (com.alibaba.ability.result.ExecuteResult) r5
            return r5
        L7f:
            com.taobao.zcache.n.a(r5)
            com.alibaba.ability.result.FinishResult r5 = new com.alibaba.ability.result.FinishResult
            r5.<init>(r8, r8, r2, r8)
            com.alibaba.ability.result.ExecuteResult r5 = (com.alibaba.ability.result.ExecuteResult) r5
            return r5
        L8a:
            com.alibaba.ability.result.a$a$a r5 = com.alibaba.ability.result.a$a.Companion
            java.lang.String r6 = "Api not found"
            com.alibaba.ability.result.ErrorResult r5 = r5.a(r6)
            com.alibaba.ability.result.ExecuteResult r5 = (com.alibaba.ability.result.ExecuteResult) r5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.tbabilitykit.v.execute(java.lang.String, tb.als, java.util.Map, tb.aln):com.alibaba.ability.result.ExecuteResult");
    }
}
