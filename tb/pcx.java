package tb;

import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.taolive.room.utils.aw;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes8.dex */
public class pcx {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PAGE_TAOLIVE_WATCH = "Page_TaobaoLiveWatch";

    /* renamed from: a  reason: collision with root package name */
    private static final String f32563a = "pcx";
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private long h;
    private long i;
    private long j;
    private String m;
    private String o;
    private boolean p;
    private String u;
    private long k = -1;
    private boolean l = false;
    private String n = "other";
    private long v = 0;
    private long w = 0;
    private long x = 0;
    private long y = 0;
    private int z = 0;
    private Map<String, String> q = new HashMap();
    private long r = -1;
    private long s = -1;
    private long t = -1;

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else {
            this.o = str;
        }
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
        } else {
            this.m = str;
        }
    }

    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
        } else {
            this.e = str;
        }
    }

    public void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("669e4a77", new Object[]{this, str});
        } else {
            this.n = str;
        }
    }

    public void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0cfe3b8", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb017cf9", new Object[]{this, str});
        } else {
            this.f = str;
        }
    }

    public void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f64af7b", new Object[]{this, str});
        } else {
            this.u = str;
        }
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        if (this.v == 0) {
            this.v = System.currentTimeMillis();
        }
        pmd.a().m().a(f32563a + "-upDownSwipe#", "swipeInStart: id=" + this.c + ", liveSource=" + this.b + ", time=" + this.v);
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        if (this.x == 0) {
            this.x = System.currentTimeMillis();
        }
        pmd.a().m().a(f32563a + "-upDownSwipe#", "swipeInEnd: id=" + this.c + ", liveSource=" + this.b + ", time=" + this.x);
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        if (this.w == 0) {
            this.w = System.currentTimeMillis();
        }
        pmd.a().m().a(f32563a + "-upDownSwipe#", "swipeOutEnd: id=" + this.c + ", liveSource=" + this.b + ", time=" + this.w);
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
            return;
        }
        if (this.y == 0) {
            this.y = System.currentTimeMillis();
        }
        pmd.a().m().a(f32563a + "-upDownSwipe#", "firstFrameFinish: id=" + this.c + ", liveSource=" + this.b + ", time=" + this.y);
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        if (this.z == 0) {
            this.z = i;
        }
        pmd.a().m().a(f32563a + "-upDownSwipe#", "playerErrorCode: id=" + this.c + ", liveSource=" + this.b + ", errorCode=" + i);
    }

    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
            return;
        }
        if (j <= 0) {
            j = System.currentTimeMillis();
        }
        this.h = j;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.h;
        a("kPageInitFinish", currentTimeMillis, currentTimeMillis);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.i = System.currentTimeMillis();
        pnj m = pmd.a().m();
        m.c("livedetailResponse", "mtopBegin" + this.i);
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.p) {
        } else {
            this.p = true;
            long currentTimeMillis = System.currentTimeMillis();
            this.k = currentTimeMillis;
            long j = currentTimeMillis - this.h;
            a("kPlayerReceivePlayData", j, j);
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.j = System.currentTimeMillis();
        long j = this.j;
        a("kMtopReceive", j - this.i, j - this.h);
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - this.j;
        long j2 = currentTimeMillis - this.h;
        this.r = j2;
        a("kUIRenderFinish", j, j2);
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - this.j;
        long j2 = currentTimeMillis - this.h;
        this.r = j2;
        a("kUIRenderFinish2", j, j2);
    }

    public void a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123b0d2", new Object[]{this, str, new Long(j)});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.h;
        a("kInteractiveRenderFinish#" + str + "#", j, currentTimeMillis);
    }

    public void a(String str, int i, boolean z, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3970beed", new Object[]{this, str, new Integer(i), new Boolean(z), str2});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.h;
        this.l = this.l || z;
        a(String.format("kRightComponent%dRenderFinish#%s#%s#", Integer.valueOf(i), str, str2), 0L, currentTimeMillis);
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - this.j;
        long j2 = currentTimeMillis - this.h;
        this.s = j2;
        a("kInteractiveH5RenderFinish", j, j2);
    }

    public void b(long j) {
        long j2;
        long j3;
        long j4 = j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66ffb", new Object[]{this, new Long(j4)});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        int i = (j4 > 0L ? 1 : (j4 == 0L ? 0 : -1));
        if (i <= 0) {
            j4 = currentTimeMillis;
        }
        long j5 = j4 - this.k;
        long j6 = this.h;
        long j7 = j4 - j6;
        if (i == 0 || j5 < 0 || j6 == 0 || j7 < 0) {
            j2 = 1;
            j3 = 1;
        } else {
            j3 = j7;
            j2 = j5;
        }
        this.t = j3;
        a("kPlayerFirstFrameFinish", j2, j3);
        a("kPlayerFirstFrameRealFinish", currentTimeMillis - this.k, currentTimeMillis - this.h);
    }

    private void a(String str, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a352e032", new Object[]{this, str, new Long(j), new Long(j2)});
            return;
        }
        Map<String, String> map = this.q;
        map.put(str + "Duration", String.valueOf(j));
        Map<String, String> map2 = this.q;
        map2.put(str + "TotalDuration", String.valueOf(j2));
        b(f32563a, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0040, code lost:
        if (r6 >= r10) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void q() {
        /*
            r12 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.pcx.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L12
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r3] = r12
            java.lang.String r2 = "64de478"
            r0.ipc$dispatch(r2, r1)
            return
        L12:
            long r0 = r12.x
            r4 = 0
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 != 0) goto L1b
            return
        L1b:
            long r6 = r12.y
            long r8 = r12.v
            long r8 = r6 - r8
            int r10 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r10 != 0) goto L27
        L25:
            r0 = 0
            goto L2c
        L27:
            int r10 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r10 >= 0) goto L25
            r0 = 1
        L2c:
            long r6 = r12.y
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 != 0) goto L34
        L32:
            r2 = 0
            goto L42
        L34:
            long r10 = r12.w
            int r1 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r1 <= 0) goto L42
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 <= 0) goto L42
            int r1 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r1 >= 0) goto L32
        L42:
            java.util.Map<java.lang.String, java.lang.String> r1 = r12.q
            java.lang.String r3 = java.lang.String.valueOf(r0)
            java.lang.String r4 = "isPlayBeforeStable"
            r1.put(r4, r3)
            java.util.Map<java.lang.String, java.lang.String> r1 = r12.q
            java.lang.String r3 = java.lang.String.valueOf(r2)
            java.lang.String r4 = "isPlayBeforeSwipe"
            r1.put(r4, r3)
            java.util.Map<java.lang.String, java.lang.String> r1 = r12.q
            java.lang.String r3 = java.lang.String.valueOf(r8)
            java.lang.String r4 = "startSwipeToFirstFrameDuration"
            r1.put(r4, r3)
            tb.pmd r1 = tb.pmd.a()
            tb.pnj r1 = r1.m()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = tb.pcx.f32563a
            r3.append(r4)
            java.lang.String r4 = "-upDownSwipe#"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "send: id="
            r4.append(r5)
            java.lang.String r5 = r12.c
            r4.append(r5)
            java.lang.String r5 = ", liveSource="
            r4.append(r5)
            java.lang.String r5 = r12.b
            r4.append(r5)
            java.lang.String r5 = ", isPlayBeforeStable="
            r4.append(r5)
            r4.append(r0)
            java.lang.String r0 = ", isPlayBeforeSwipe="
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = ", startSwipeToFirstFrameDuration="
            r4.append(r0)
            r4.append(r8)
            java.lang.String r0 = r4.toString()
            r1.a(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.pcx.q():void");
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
            return;
        }
        int i = this.z;
        if (i == 0) {
            return;
        }
        this.q.put("playerErrorCode", String.valueOf(i));
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else if (r()) {
            t();
        } else {
            s();
        }
    }

    private boolean r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("65bfbfd", new Object[]{this})).booleanValue() : Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("tblive", "enableFixPerformanceUt", "true"));
    }

    private void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
        } else if (this.t < 0 || this.r <= 0 || this.k <= 0) {
        } else {
            this.p = false;
            this.q.put("feedId", this.c);
            this.q.put("livesource", this.b);
            this.q.put("deviceLevel", this.o);
            this.q.put(aw.PARAM_PLAYER_TOKEN, this.d);
            this.q.put("viewMode", this.f);
            this.q.put("enableMultiBatchRender", String.valueOf(this.l));
            if (!StringUtils.isEmpty(this.e)) {
                this.q.put("urlPlayMode", this.e);
            }
            if (!StringUtils.isEmpty(this.u)) {
                this.q.put(aw.PARAM_PLAY_MODE, this.u);
            }
            if (!StringUtils.isEmpty(this.m)) {
                this.q.put("h5RenderVersion", this.m);
            }
            if (!StringUtils.isEmpty(this.n)) {
                this.q.put(sku.KEY_VIDEO_TYPE, this.n);
            }
            if (!StringUtils.isEmpty(this.g)) {
                this.q.put("videoFormat", this.g);
            }
            pmd.a().e().a("Page_TaobaoLiveWatch", "kLifeCycle", this.q);
        }
    }

    private void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6782afb", new Object[]{this});
            return;
        }
        this.p = false;
        this.q.put("feedId", this.c);
        this.q.put("livesource", this.b);
        this.q.put("deviceLevel", this.o);
        this.q.put(aw.PARAM_PLAYER_TOKEN, this.d);
        this.q.put("viewMode", this.f);
        this.q.put("enableMultiBatchRender", String.valueOf(this.l));
        this.q.put("firstFrameTime", String.valueOf(this.t));
        this.q.put("uiRenderFinish", String.valueOf(this.r));
        this.q.put("playerReceivePlayData", String.valueOf(this.k));
        if (!StringUtils.isEmpty(this.e)) {
            this.q.put("urlPlayMode", this.e);
        }
        if (!StringUtils.isEmpty(this.u)) {
            this.q.put(aw.PARAM_PLAY_MODE, this.u);
        }
        if (!StringUtils.isEmpty(this.m)) {
            this.q.put("h5RenderVersion", this.m);
        }
        if (!StringUtils.isEmpty(this.n)) {
            this.q.put(sku.KEY_VIDEO_TYPE, this.n);
        }
        if (!StringUtils.isEmpty(this.g)) {
            this.q.put("videoFormat", this.g);
        }
        pmd.a().e().a("Page_TaobaoLiveWatch", "kLifeCycle", this.q);
        pmd.a().I().a("kLifeCycle", "Page_TaobaoLiveWatch", this.q);
        a(this.q);
    }

    private boolean u() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6864280", new Object[]{this})).booleanValue() : (pmd.a().u().c().getApplicationInfo().flags & 2) != 0;
    }

    private void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else if (!u()) {
        } else {
            StringBuilder sb = new StringBuilder();
            ArrayList arrayList = new ArrayList(map.keySet());
            Collections.sort(arrayList);
            sb.append(" [ \n");
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                sb.append("\t");
                sb.append(str);
                sb.append(":");
                sb.append(map.get(str));
                sb.append("\n");
            }
            sb.append(" ] \n");
            Log.e("kLifeCycle", sb.toString());
        }
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        this.l = false;
        this.h = 0L;
        this.e = null;
        this.v = 0L;
        this.x = 0L;
        this.w = 0L;
        this.y = 0L;
        this.z = 0;
        this.q.clear();
    }

    public long j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5eb3fe5", new Object[]{this})).longValue() : this.s;
    }

    private void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
            return;
        }
        Map<String, String> k = k();
        k.put("pointString", str2);
        if (pmd.a().m() == null) {
            return;
        }
        pmd.a().m().a(str, JSON.toJSONString(k));
    }

    public Map<String, String> k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a8bc7a27", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        if (pmd.a().q() != null) {
            hashMap.put("userId", pmd.a().q().a());
        }
        return hashMap;
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else {
            this.q.put(str, str2);
        }
    }
}
