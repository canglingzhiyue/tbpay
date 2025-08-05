package tb;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseBean;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseCellBean;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.searchbaseframe.util.i;
import com.taobao.android.task.Coordinator;
import com.taobao.search.common.util.r;
import com.taobao.search.common.util.s;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.jvm;

/* loaded from: classes7.dex */
public class ipl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private jvm.c f29212a;
    private TemplateBean b;
    private final AtomicBoolean c;
    private final List<MuiseCellBean> d;
    private jvm.c e;
    private TemplateBean f;
    private MuiseBean g;
    private Set<drb> h;

    /* loaded from: classes7.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final ipl f29216a;

        static {
            kge.a(-944388138);
            f29216a = new ipl();
        }

        public static /* synthetic */ ipl a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ipl) ipChange.ipc$dispatch("f061199", new Object[0]) : f29216a;
        }
    }

    static {
        kge.a(1005837786);
    }

    public static /* synthetic */ TemplateBean a(ipl iplVar, TemplateBean templateBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TemplateBean) ipChange.ipc$dispatch("2f9791a3", new Object[]{iplVar, templateBean});
        }
        iplVar.f = templateBean;
        return templateBean;
    }

    public static /* synthetic */ jvm.c a(ipl iplVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jvm.c) ipChange.ipc$dispatch("ada96373", new Object[]{iplVar}) : iplVar.e;
    }

    public static /* synthetic */ jvm.c a(ipl iplVar, jvm.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jvm.c) ipChange.ipc$dispatch("97b831e3", new Object[]{iplVar, cVar});
        }
        iplVar.e = cVar;
        return cVar;
    }

    public static /* synthetic */ TemplateBean b(ipl iplVar, TemplateBean templateBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TemplateBean) ipChange.ipc$dispatch("1e2a1d82", new Object[]{iplVar, templateBean});
        }
        iplVar.b = templateBean;
        return templateBean;
    }

    public static /* synthetic */ jvm.c b(ipl iplVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jvm.c) ipChange.ipc$dispatch("342f1e12", new Object[]{iplVar}) : iplVar.f29212a;
    }

    public static /* synthetic */ jvm.c b(ipl iplVar, jvm.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jvm.c) ipChange.ipc$dispatch("1fe871c2", new Object[]{iplVar, cVar});
        }
        iplVar.f29212a = cVar;
        return cVar;
    }

    public static /* synthetic */ void c(ipl iplVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb243595", new Object[]{iplVar});
        } else {
            iplVar.n();
        }
    }

    public static /* synthetic */ void d(ipl iplVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9a73c16", new Object[]{iplVar});
        } else {
            iplVar.m();
        }
    }

    public static /* synthetic */ void e(ipl iplVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a82a4297", new Object[]{iplVar});
        } else {
            iplVar.l();
        }
    }

    private ipl() {
        this.c = new AtomicBoolean(false);
        this.d = new ArrayList(4);
        this.h = new HashSet();
    }

    public void a(jvm.c cVar, TemplateBean templateBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba01bf32", new Object[]{this, cVar, templateBean});
            return;
        }
        this.f29212a = cVar;
        this.b = templateBean;
        s.a("m3_version", templateBean.version);
        s.a("m3_url", templateBean.url);
        s.a("m3_name", templateBean.templateName);
        s.a("m3_md5", templateBean.md5);
    }

    public void b(jvm.c cVar, TemplateBean templateBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810da633", new Object[]{this, cVar, templateBean});
            return;
        }
        this.e = cVar;
        this.f = templateBean;
        s.a("sort_version", templateBean.version);
        s.a("sort_url", templateBean.url);
        s.a("sort_name", templateBean.templateName);
        s.a("sort_md5", templateBean.md5);
    }

    private void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        String b = s.b("sort_version", "");
        String b2 = s.b("sort_url", "");
        String b3 = s.b("sort_name", "");
        String b4 = s.b("sort_md5", "");
        if (TextUtils.isEmpty(b) || TextUtils.isEmpty(b2) || TextUtils.isEmpty(b3) || TextUtils.isEmpty(b4)) {
            return;
        }
        final jvm.c a2 = jvm.c.a(dpm.a().c(b2), b2);
        if (a2.a() == null) {
            return;
        }
        final TemplateBean templateBean = new TemplateBean();
        templateBean.version = b;
        templateBean.url = b2;
        templateBean.templateName = b3;
        templateBean.md5 = b4;
        new Handler(Looper.getMainLooper()).post(new i() { // from class: tb.ipl.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.searchbaseframe.util.i
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else if (ipl.a(ipl.this) != null) {
                } else {
                    ipl.a(ipl.this, a2);
                    ipl.a(ipl.this, templateBean);
                }
            }
        });
    }

    private void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        String b = s.b("m3_version", "");
        String b2 = s.b("m3_url", "");
        String b3 = s.b("m3_name", "");
        String b4 = s.b("m3_md5", "");
        if (TextUtils.isEmpty(b) || TextUtils.isEmpty(b2) || TextUtils.isEmpty(b3) || TextUtils.isEmpty(b4)) {
            return;
        }
        final jvm.c a2 = jvm.c.a(dpm.a().c(b2), b2);
        if (a2.a() == null) {
            return;
        }
        final TemplateBean templateBean = new TemplateBean();
        templateBean.version = b;
        templateBean.url = b2;
        templateBean.templateName = b3;
        templateBean.md5 = b4;
        new Handler(Looper.getMainLooper()).post(new i() { // from class: tb.ipl.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.searchbaseframe.util.i
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else if (ipl.b(ipl.this) != null) {
                } else {
                    ipl.b(ipl.this, a2);
                    ipl.b(ipl.this, templateBean);
                    ipl.c(ipl.this);
                }
            }
        });
    }

    private void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        for (drb drbVar : this.h) {
            drbVar.q();
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!r.bw() || this.f29212a != null) {
        } else {
            Coordinator.execute(new Runnable() { // from class: tb.ipl.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    ipl.d(ipl.this);
                    ipl.e(ipl.this);
                }
            });
        }
    }

    public TemplateBean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TemplateBean) ipChange.ipc$dispatch("2724bb87", new Object[]{this}) : this.b;
    }

    public TemplateBean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TemplateBean) ipChange.ipc$dispatch("34d9c8e0", new Object[]{this}) : this.f;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.c.get();
    }

    public synchronized void a(JSONObject jSONObject, imn imnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("137e39ee", new Object[]{this, jSONObject, imnVar});
        } else if (!this.c.get()) {
            JSONArray jSONArray = jSONObject.getJSONArray("itemsArray");
            if (jSONArray.size() > 0) {
                for (int i = 0; i < 4; i++) {
                    MuiseCellBean muiseCellBean = (MuiseCellBean) imnVar.f().a(jSONArray.getJSONObject(0), (BaseSearchResult) null);
                    if (muiseCellBean != null) {
                        this.d.add(muiseCellBean);
                    }
                }
                this.c.set(true);
            }
        }
    }

    public synchronized void b(JSONObject jSONObject, imn imnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccf5c78d", new Object[]{this, jSONObject, imnVar});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("topBar");
        if (jSONObject2 == null) {
            return;
        }
        this.g = (MuiseBean) imnVar.g().a(jSONObject2, null);
    }

    public jvm.c d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jvm.c) ipChange.ipc$dispatch("d6afc1b", new Object[]{this}) : this.f29212a;
    }

    public jvm.c j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jvm.c) ipChange.ipc$dispatch("589db5d5", new Object[]{this}) : this.e;
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : this.f29212a != null;
    }

    public List<MuiseCellBean> f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("e89f38ba", new Object[]{this}) : this.d;
    }

    public MuiseBean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MuiseBean) ipChange.ipc$dispatch("5cf41dab", new Object[]{this}) : this.g;
    }

    public static ipl g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ipl) ipChange.ipc$dispatch("3d2ff1d3", new Object[0]) : a.a();
    }
}
