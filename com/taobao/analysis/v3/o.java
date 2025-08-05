package com.taobao.analysis.v3;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.dis;
import tb.myr;
import tb.mze;
import tb.mzf;
import tb.mzh;
import tb.mzi;
import tb.mzm;
import tb.mzp;
import tb.mzq;
import tb.riy;

/* loaded from: classes.dex */
public class o extends mzm implements n {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean b;
    private StageList c;
    public String j;
    private boolean k;
    private v l;
    private int m;
    private int n;
    private StageList r_;
    public static final mzh e = new mzh("_module");
    public static final mze f = new mze("_status");
    public static final mzh g = new mzh("_layer");
    public static final mzf h = new mzf("_stages");
    public static final mzh i = new mzh("_pStage");

    /* renamed from: a  reason: collision with root package name */
    private static CopyOnWriteArrayList<String> f8591a = new CopyOnWriteArrayList<>();

    public static /* synthetic */ Object ipc$super(o oVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1445564421) {
            super.b(((Number) objArr[0]).longValue());
            return null;
        } else if (hashCode != 1848324648) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            return super.a((mzi<mzi>) objArr[0], (mzi) objArr[1]);
        }
    }

    public boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66a137e", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.mzm, tb.myr
    public /* synthetic */ myr f(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (myr) ipChange.ipc$dispatch("7fd208a9", new Object[]{this, str}) : d(str);
    }

    public o(v vVar, String str, String str2, long j, Map<String, Object> map, List<mzp> list, String str3) {
        super(vVar, str2, j, map, list);
        this.c = new StageList();
        this.r_ = new StageList();
        boolean z = false;
        this.m = 0;
        this.n = 0;
        this.j = "unfinished";
        this.l = vVar;
        b((mzi<mzh>) e, (mzh) str2);
        b((mzi<mze>) f, (mze) 0);
        b((mzi<mzh>) g, (mzh) str3);
        if (p()) {
            if (!TextUtils.isEmpty(str)) {
                b("_scene", str);
            } else {
                b("_scene", "unknownScene");
            }
        }
        String h2 = h("_stage");
        if (!TextUtils.isEmpty(h2)) {
            b((mzi<mzh>) i, (mzh) h2);
            b("_stage", (String) null);
        }
        if (a() && !ds_()) {
            z = true;
        }
        this.b = z;
        this.k = this.l.f(h("_scene"));
        if (!this.b || !s()) {
            return;
        }
        this.l.dt_().startSpan(this);
    }

    private boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        if (dis.b() || this.l.d(bB_())) {
            return true;
        }
        if (!this.l.e(b()) || !p()) {
            return f8591a.contains(h().a());
        }
        f8591a.add(h().a());
        return true;
    }

    public String bB_() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3c4da41a", new Object[]{this}) : h("_scene");
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : String.valueOf(i(e.a()));
    }

    @Override // com.taobao.analysis.v3.n
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            a(str, (Map<String, ?>) null);
        }
    }

    public void a(String str, Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
        } else if (!this.b) {
        } else {
            this.n += str.length();
            this.l.dt_().releaseLog(this, b(str, map));
        }
    }

    public n d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("d389b8d4", new Object[]{this, str});
        }
        if (this.b && !TextUtils.isEmpty(str)) {
            this.n += str.length();
            this.l.dt_().releaseLog(this, b(str, (Map<String, ?>) null));
        }
        return this;
    }

    @Override // com.taobao.analysis.v3.n
    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            a(n(), str);
        }
    }

    @Override // tb.mzm, tb.myr
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            b("succeed");
        }
    }

    @Override // tb.mzm, tb.myr
    public void b(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66ffb", new Object[]{this, new Long(j)});
        } else {
            a(j, "succeed");
        }
    }

    public void a(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d8a2226", new Object[]{this, new Long(j), str});
        } else if (ds_()) {
        } else {
            this.j = str;
            b((mzi<mze>) f, (mze) Integer.valueOf(j(str)));
            r();
            super.b(j);
            if (this.b) {
                this.l.dt_().finishSpan(this);
                if (p()) {
                    f8591a.remove(h().a());
                }
            }
            if (!this.k) {
                return;
            }
            this.l.e().a(this);
        }
    }

    private int j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8f64af6e", new Object[]{this, str})).intValue();
        }
        if ("succeed".equals(str)) {
            return 1;
        }
        if ("failed".equals(str)) {
            return 2;
        }
        return "cancel".equals(str) ? 3 : 0;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : String.valueOf(i(g.a()));
    }

    public void b_(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4d65a83", new Object[]{this, l});
            return;
        }
        int size = this.c.size();
        if (size <= 0) {
            return;
        }
        for (int i2 = size - 1; i2 >= 0; i2--) {
            q qVar = this.c.get(i2);
            if (qVar.d <= 0) {
                qVar.b(l);
                return;
            }
        }
    }

    private void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
            return;
        }
        b_(Long.valueOf(n()));
        StageList stageList = this.r_.size() > 0 ? this.r_ : this.c;
        if (stageList.isEmpty()) {
            return;
        }
        b((mzi<mzf>) h, (mzf) stageList);
    }

    @Override // com.taobao.analysis.v3.n
    public p c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p) ipChange.ipc$dispatch("99bf1733", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Iterator<q> it = this.r_.iterator();
        while (it.hasNext()) {
            q next = it.next();
            if (str.equals(next.a())) {
                return next;
            }
        }
        d dVar = new d(str);
        this.r_.add(dVar);
        b("_stage", str);
        return dVar;
    }

    public q e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q) ipChange.ipc$dispatch("d545b10", new Object[]{this, str});
        }
        Iterator<q> it = this.c.iterator();
        while (it.hasNext()) {
            q next = it.next();
            if (str.equals(next.a())) {
                return next;
            }
        }
        u uVar = new u(str);
        this.c.add(uVar);
        if (this.r_.size() <= 0) {
            b("_stage", str);
        }
        return uVar;
    }

    private String b(String str, Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2e314d2e", new Object[]{this, str, map});
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(h().a());
        sb.append(",");
        sb.append(h().b());
        sb.append(",");
        sb.append(i());
        sb.append(",");
        Object i2 = i(h.a());
        if (i2 != null) {
            sb.append(i2);
        }
        sb.append("|");
        if (map != null && !map.isEmpty()) {
            sb.append("@");
            sb.append(riy.BLOCK_START_STR);
            for (Map.Entry<String, ?> entry : map.entrySet()) {
                if (z) {
                    sb.append(",");
                }
                sb.append(mzq.a(entry.getKey()));
                sb.append("=");
                sb.append(mzq.a(String.valueOf(entry.getValue())));
                z = true;
            }
            sb.append(riy.BLOCK_END_STR);
            sb.append(",");
        }
        sb.append(str);
        return sb.toString();
    }

    @Override // tb.mzm
    public String toString() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(h().a());
        sb.append(",");
        sb.append(h().b());
        sb.append(",");
        sb.append(mzq.a(i()));
        sb.append(",");
        sb.append(k());
        sb.append(",");
        sb.append(o());
        sb.append(",");
        sb.append(mzq.a(d()));
        sb.append(",");
        sb.append(mzq.a(bB_()));
        sb.append(",");
        sb.append(mzq.a(e()));
        sb.append(",");
        sb.append(mzq.a(b()));
        sb.append(",");
        sb.append(j(this.j));
        sb.append("|");
        boolean z2 = false;
        for (Map.Entry<String, String> entry : h().c()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value) && !"_scene".equals(key) && !"_stage".equals(key)) {
                if (z2) {
                    sb.append(",");
                }
                sb.append(mzq.a(key));
                sb.append("=");
                sb.append(mzq.a(value));
                z2 = true;
            }
        }
        sb.append("|");
        for (Map.Entry<String, ?> entry2 : j().entrySet()) {
            String key2 = entry2.getKey();
            Object value2 = entry2.getValue();
            if (!TextUtils.isEmpty(key2) && value2 != null && !g.a().equals(key2) && !e.a().equals(key2) && !f.a().equals(key2) && !h.a().equals(key2) && !i.a().equals(key2)) {
                if (z) {
                    sb.append(",");
                }
                sb.append(mzq.a(key2));
                sb.append("=");
                sb.append(mzq.a(String.valueOf(value2)));
                z = true;
            }
        }
        sb.append("|");
        Object i2 = i(h.a());
        if (i2 != null) {
            sb.append(i2);
        }
        String sb2 = sb.toString();
        this.m += sb2.length();
        return sb2;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this});
        }
        Object i2 = i(i.a());
        return i2 != null ? String.valueOf(i2) : "";
    }

    public int f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[]{this})).intValue() : this.n;
    }

    public int g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f961", new Object[]{this})).intValue() : this.m;
    }

    private <T> void b(mzi<T> mziVar, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("274c0a19", new Object[]{this, mziVar, t});
        } else {
            super.a((mzi<mzi<T>>) mziVar, (mzi<T>) t);
        }
    }
}
