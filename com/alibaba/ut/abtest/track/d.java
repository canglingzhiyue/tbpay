package com.alibaba.ut.abtest.track;

import mtopsdk.common.util.StringUtils;
import com.alibaba.ut.abtest.internal.util.q;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.l;
import tb.kge;

/* loaded from: classes.dex */
public class d extends com.ut.mini.module.plugin.a implements l.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String UT_PARAM = "utparam-cnt";

    /* renamed from: a  reason: collision with root package name */
    private String f4222a;
    private final int[] b = {2001, 2101, 2201};

    static {
        kge.a(-10553556);
        kge.a(786836730);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "TrackUTPlugin";
    }

    @Override // com.ut.mini.module.plugin.a
    public int[] getAttentionEventIds() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (int[]) ipChange.ipc$dispatch("873e4cb7", new Object[]{this}) : this.b;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:9|10|11|12|13|14|(2:16|(10:18|19|(3:21|22|23)|24|25|26|27|(2:32|33)(1:29)|30|31))|45|26|27|(0)(0)|30|31) */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0124, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0125, code lost:
        r14 = r17;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.ut.mini.module.plugin.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.Map<java.lang.String, java.lang.String> onEventDispatch(java.lang.String r19, int r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.util.Map<java.lang.String, java.lang.String> r24) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ut.abtest.track.d.onEventDispatch(java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.util.Map):java.util.Map");
    }

    @Override // com.ut.mini.l.a
    public void onPageAppear(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df7330a6", new Object[]{this, obj});
        } else {
            this.f4222a = q.a(obj);
        }
    }

    @Override // com.ut.mini.l.a
    public void onPageDisAppear(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4c99138", new Object[]{this, obj});
        } else if (StringUtils.isEmpty(this.f4222a) || !StringUtils.equals(q.a(obj), this.f4222a)) {
        } else {
            this.f4222a = null;
        }
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        try {
            d dVar = new d();
            UTAnalytics.getInstance().registerPlugin(dVar);
            l.addPageChangerListener(dVar);
            return true;
        } catch (Throwable th) {
            com.alibaba.ut.abtest.internal.util.b.a("TrackUTPlugin.register", th);
            return false;
        }
    }
}
