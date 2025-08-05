package tb;

import android.text.TextUtils;
import com.alibaba.android.split.b;
import com.alibaba.android.split.g;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.bhc;
import tb.bnk;

/* loaded from: classes2.dex */
public class bgn extends asa implements bgo<cak> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private bhe b;
    private bgu e = (bgu) com.alibaba.android.split.a.b(bgu.class, "InitialInstantialtor");

    /* renamed from: a  reason: collision with root package name */
    public g f25876a = new b();

    /* loaded from: classes2.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static Map<String, cak> f25879a;

        static {
            kge.a(-2127748182);
            f25879a = new HashMap();
        }

        public static /* synthetic */ Map a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a014a89d", new Object[0]) : f25879a;
        }
    }

    static {
        kge.a(313559096);
        kge.a(503218550);
    }

    public static /* synthetic */ bhe a(bgn bgnVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bhe) ipChange.ipc$dispatch("5bed7938", new Object[]{bgnVar}) : bgnVar.b;
    }

    public static /* synthetic */ bgu b(bgn bgnVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bgu) ipChange.ipc$dispatch("438f4dc6", new Object[]{bgnVar}) : bgnVar.e;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [tb.cak, java.lang.Object] */
    @Override // tb.bgo
    public /* synthetic */ cak b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("43b9c269", new Object[]{this}) : a();
    }

    public bgn(bhe bheVar) {
        this.b = bheVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10, types: [tb.cak] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    public cak a() {
        String a2 = this.b.a();
        if (TextUtils.isEmpty(a2) && !TextUtils.isEmpty(this.b.d())) {
            a2 = this.f25876a.h(this.b.d());
        }
        ?? r2 = null;
        if (!TextUtils.isEmpty(a2)) {
            try {
                this.e.d("InitialInstantialtor create Instance: %s", a2);
                final long currentTimeMillis = System.currentTimeMillis();
                try {
                    if (!TextUtils.isEmpty(this.b.d())) {
                        if (a.a().get(this.b.d()) == null) {
                            bnk c = this.d.c();
                            c.i = this.b.b();
                            c.h = this.b.d();
                            c.f = this;
                            c.d = a2;
                            c.b = new bnk.b() { // from class: tb.bgn.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // tb.bnk.b
                                public void a(Object obj) {
                                    IpChange ipChange = $ipChange;
                                    if (ipChange instanceof IpChange) {
                                        ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
                                    } else if (obj == null || !(obj instanceof cak)) {
                                    } else {
                                        cak cakVar = (cak) obj;
                                        a.a().put(bgn.a(bgn.this).d(), cakVar);
                                        bgn.b(bgn.this).d("InitialInstantialtor create Instance cost: %s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                                        if (bgn.a(bgn.this).f() == null) {
                                            return;
                                        }
                                        bgn.a(bgn.this).f().a((bhc.b<cak>) cakVar, bgn.a(bgn.this).e());
                                    }
                                }
                            };
                            c.c = new bnk.a() { // from class: tb.bgn.2
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // tb.bnk.a
                                public void a(String str) {
                                    IpChange ipChange = $ipChange;
                                    if (ipChange instanceof IpChange) {
                                        ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
                                    } else if (bgn.a(bgn.this).f() == null) {
                                    } else {
                                        bgn.a(bgn.this).f().a(str, bgn.a(bgn.this).e());
                                    }
                                }
                            };
                            this.d.b(c);
                            this.e.d("InitialInstantialtor create Instance cost: %s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                        } else {
                            cak cakVar = (cak) a.a().get(this.b.d());
                            a2 = cakVar;
                            if (this.b.f() != null) {
                                this.b.f().a((bhc.b<cak>) cakVar, this.b.e());
                                a2 = cakVar;
                            }
                        }
                    } else {
                        cak cakVar2 = (cak) Class.forName(a2).newInstance();
                        a2 = cakVar2;
                        if (this.b.f() != null) {
                            this.b.f().a((bhc.b<cak>) cakVar2, this.b.e());
                            a2 = cakVar2;
                        }
                    }
                    r2 = a2;
                    this.e.d("InitialInstantialtor create Instance cost: %s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                } catch (Exception e) {
                    r2 = a2;
                    e = e;
                    e.printStackTrace();
                    if (this.b.f() != null) {
                        this.b.f().a(e.getMessage(), this.b.e());
                    }
                    return r2;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } else if (this.b.f() != null) {
            this.b.f().a("Initclass is empty", this.b.e());
        }
        return r2;
    }
}
