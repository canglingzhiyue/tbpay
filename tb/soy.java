package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.bizmessage.k;
import com.taobao.android.detail.ttdetail.bizmessage.l;
import com.taobao.android.detail.ttdetail.communication.ThreadMode;
import com.taobao.android.detail.ttdetail.communication.f;
import com.taobao.android.detail.ttdetail.communication.g;
import com.taobao.android.detail.ttdetail.component.module.DataEntry;
import com.taobao.android.detail.ttdetail.component.module.d;
import com.taobao.android.detail.ttdetail.data.common.SimpleEntry;
import com.taobao.android.detail.ttdetail.data.meta.Resource;
import com.taobao.android.detail.ttdetail.skeleton.navbar.c;
import com.taobao.android.detail.ttdetail.skeleton.navbar.e;
import com.taobao.android.detail.ttdetail.skeleton.navbar.search.search.SearchInfoController;
import com.taobao.android.detail.ttdetail.utils.at;
import com.taobao.android.detail.ttdetail.utils.i;
import com.taobao.android.detail.ttdetail.widget.scrollerlayout.TTDetailScrollerLayout;
import com.taobao.android.livehome.plugin.atype.flexalocal.business.search.TaoliveSearchHotWords;
import com.taobao.uikit.actionbar.ITBPublicMenu;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.onp;

/* loaded from: classes5.dex */
public class soy extends d implements f<l, Integer>, g, TTDetailScrollerLayout.a, onp.b, onp.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private b f33791a;
    private e b;
    private c c;
    private Context d;
    private eyx e;
    private SearchInfoController f;
    private String g;
    private ITBPublicMenu h;
    private TTDetailScrollerLayout i;
    private int j;
    private float k;
    private float l;
    private ViewGroup m;
    private tac n;
    private tac o;

    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f33795a;
        public String b;

        static {
            kge.a(-349604002);
        }
    }

    static {
        kge.a(-203750050);
        kge.a(111058316);
        kge.a(872200859);
        kge.a(-1832920982);
        kge.a(-1098665475);
        kge.a(-767194759);
        kge.a(1548924286);
    }

    public static /* synthetic */ Object ipc$super(soy soyVar, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.d
    public View onGetComponentView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f631742", new Object[]{this, view});
        }
        return null;
    }

    public static /* synthetic */ e a(soy soyVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("4717a175", new Object[]{soyVar}) : soyVar.b;
    }

    public static /* synthetic */ eyx b(soy soyVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (eyx) ipChange.ipc$dispatch("bda536a6", new Object[]{soyVar}) : soyVar.e;
    }

    public soy(Context context, eyx eyxVar, eyy eyyVar, DataEntry... dataEntryArr) {
        super(context, eyxVar, eyyVar, dataEntryArr);
        this.n = new tac() { // from class: tb.soy.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.tac
            public void a(Object obj, Object obj2) {
                IpChange ipChange = $ipChange;
                int i = 0;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("184a7920", new Object[]{this, obj, obj2});
                } else if (!(obj2 instanceof Integer) || soy.a(soy.this) == null) {
                } else {
                    if (((Integer) obj2).intValue() == 1) {
                        i = 1;
                    }
                    soy.a(soy.this).a(i);
                }
            }
        };
        this.o = new tac() { // from class: tb.soy.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.tac
            public void a(Object obj, Object obj2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("184a7920", new Object[]{this, obj, obj2});
                } else if (!(obj2 instanceof SimpleEntry)) {
                } else {
                    SimpleEntry simpleEntry = (SimpleEntry) obj2;
                    if (soy.a(soy.this) == null || !(simpleEntry.getKey() instanceof Integer) || !(simpleEntry.getValue() instanceof Float)) {
                        return;
                    }
                    soy.a(soy.this).a(((Integer) simpleEntry.getKey()).intValue(), ((Float) simpleEntry.getValue()).floatValue());
                }
            }
        };
        this.d = context;
        this.e = eyxVar;
        a(this.d);
    }

    public void a(eyy eyyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7cf8273", new Object[]{this, eyyVar});
            return;
        }
        JSONObject e = eyyVar.e();
        if (e != null) {
            this.f33791a = b.a(e);
        }
        this.g = (String) this.e.e().a("requestItemId");
    }

    public void a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a1860a7", new Object[]{this, viewGroup});
            return;
        }
        float f = 0.0f;
        c cVar = this.c;
        if (cVar != null) {
            f = cVar.getTransparency();
        }
        this.m = viewGroup;
        a(this.d, this.f33791a, viewGroup);
        a(f);
    }

    @Override // tb.onp.c
    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        c cVar = this.c;
        if (cVar == null) {
            return;
        }
        this.j = (i - cVar.getActionBarHeight()) - this.c.getElevatorContainerHeight();
        float abs = Math.abs(i2) / this.j;
        if (abs <= 0.0f) {
            abs = 0.0f;
        } else if (abs >= 1.0f) {
            abs = 1.0f;
        }
        this.k = abs;
        a(abs);
    }

    public void b(float f) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d660f7", new Object[]{this, new Float(f)});
        } else if (this.m == null) {
        } else {
            float pow = (float) Math.pow(1.0f - f, 5.0d);
            this.m.setAlpha(pow);
            if (pow < 0.2f) {
                z = false;
            }
            this.m.setClickable(z);
        }
    }

    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
        }
        c cVar = this.c;
        if (cVar != null) {
            return cVar.getActionBarHeight() + this.c.getElevatorContainerHeight();
        }
        return 0;
    }

    @Override // com.taobao.android.detail.ttdetail.communication.f
    public Integer a(l lVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Integer) ipChange.ipc$dispatch("e3a63f7c", new Object[]{this, lVar}) : Integer.valueOf(this.c.getActionBarHeight());
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        c cVar = this.c;
        if (cVar == null) {
            return;
        }
        cVar.highlightTab(str);
    }

    /* loaded from: classes5.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public c f33796a;
        public C1182b b;
        public ArrayList<a> c = new ArrayList<>();
        public ArrayList<d> d = new ArrayList<>();

        static {
            kge.a(451161779);
        }

        public static b a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("2748183", new Object[]{jSONObject});
            }
            b bVar = new b();
            JSONObject jSONObject2 = jSONObject.getJSONObject("title");
            if (jSONObject2 != null) {
                bVar.f33796a = c.a(jSONObject2);
            }
            JSONObject jSONObject3 = jSONObject.getJSONObject("search");
            if (jSONObject3 != null) {
                bVar.b = C1182b.a(jSONObject3);
            }
            JSONArray jSONArray = jSONObject.getJSONArray("right");
            if (jSONArray != null) {
                for (int i = 0; i < jSONArray.size(); i++) {
                    bVar.c.add(a.a(jSONArray.getJSONObject(i)));
                }
            }
            JSONArray jSONArray2 = jSONObject.getJSONArray("tabs");
            if (jSONArray2 != null) {
                for (int i2 = 0; i2 < jSONArray2.size(); i2++) {
                    bVar.d.add(d.a(jSONArray2.getJSONObject(i2)));
                }
            }
            return bVar;
        }

        /* loaded from: classes5.dex */
        public static class c {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public String f33799a;
            public String b;
            public String c;
            public String d;
            public String e;
            public String f;
            public String g;
            public String h;
            public String i;
            public String j;
            public String k;
            public boolean l;

            static {
                kge.a(-37436153);
            }

            public static c a(JSONObject jSONObject) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (c) ipChange.ipc$dispatch("3759e2a4", new Object[]{jSONObject});
                }
                c cVar = new c();
                cVar.f33799a = jSONObject.getString("detail");
                cVar.b = jSONObject.getString("detailColor");
                cVar.c = jSONObject.getString("content");
                cVar.d = jSONObject.getString("shop");
                cVar.e = jSONObject.getString(com.alibaba.triver.triver_shop.newShop.ext.g.KEY_APM_SHOP_URL);
                cVar.f = jSONObject.getString("gradientColor");
                cVar.g = jSONObject.getString("rateText");
                cVar.h = jSONObject.getString("leftPic");
                cVar.i = jSONObject.getString("rightPic");
                cVar.j = jSONObject.getString("leftBlackPic");
                cVar.k = jSONObject.getString("rightBlackPic");
                cVar.l = jSONObject.getBooleanValue("isReviewPageShow");
                return cVar;
            }
        }

        /* renamed from: tb.soy$b$b  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static class C1182b {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public String f33798a;
            public String b;
            public boolean c;
            public String d;
            public String e;

            static {
                kge.a(-1193404199);
            }

            public static C1182b a(JSONObject jSONObject) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (C1182b) ipChange.ipc$dispatch("3759e285", new Object[]{jSONObject});
                }
                C1182b c1182b = new C1182b();
                c1182b.f33798a = jSONObject.getString("icon");
                c1182b.b = jSONObject.getString(TaoliveSearchHotWords.TYPE_HINT);
                c1182b.c = jSONObject.getBooleanValue("asyncText");
                c1182b.d = jSONObject.getString("action");
                c1182b.e = jSONObject.getString("args");
                return c1182b;
            }
        }

        /* loaded from: classes5.dex */
        public static class a {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public String f33797a;
            public String b;
            public String c;
            public String d;
            public boolean e;
            public int f;
            public String g;

            static {
                kge.a(1982199422);
            }

            public static a a(JSONObject jSONObject) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (a) ipChange.ipc$dispatch("3759e266", new Object[]{jSONObject});
                }
                a aVar = new a();
                aVar.f33797a = jSONObject.getString("key");
                aVar.b = jSONObject.getString(TaoliveSearchHotWords.TYPE_HINT);
                aVar.c = jSONObject.getString("icon");
                aVar.d = jSONObject.getString("action");
                aVar.e = jSONObject.getBooleanValue("showBadge");
                aVar.f = jSONObject.getIntValue("badge");
                aVar.g = jSONObject.getString("args");
                return aVar;
            }
        }

        /* loaded from: classes5.dex */
        public static class d {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public String f33800a;
            public String b;

            static {
                kge.a(-1693892092);
            }

            public static d a(JSONObject jSONObject) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (d) ipChange.ipc$dispatch("3759e2c3", new Object[]{jSONObject});
                }
                d dVar = new d();
                dVar.f33800a = jSONObject.getString("name");
                dVar.b = jSONObject.getString("targetBizId");
                return dVar;
            }
        }
    }

    public void a(ITBPublicMenu iTBPublicMenu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b621230a", new Object[]{this, iTBPublicMenu});
        } else {
            this.h = iTBPublicMenu;
        }
    }

    private void a(Context context, b bVar, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39d6114", new Object[]{this, context, bVar, viewGroup});
            return;
        }
        e eVar = new e(context, this.g);
        eVar.a(this.h);
        eVar.a(g());
        eVar.c(h());
        eVar.a(true);
        eVar.a(bVar.b.d);
        eVar.a(new e.a() { // from class: tb.soy.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.ttdetail.skeleton.navbar.e.a
            public void onTabChange(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d6eaaa96", new Object[]{this, new Integer(i)});
                } else {
                    soy.b(soy.this).e().a("pageType", Integer.valueOf(i));
                }
            }
        });
        this.b = eVar;
        this.c = (c) this.b.a(context, (ViewGroup) null);
        a(bVar.b.c);
        this.b.a(viewGroup, false);
        this.b.a(a(bVar));
        this.b.a(bVar, e());
    }

    public void a(boolean z) {
        eyx eyxVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        e eVar = this.b;
        if (eVar == null || !(eVar instanceof SearchInfoController.a) || (eyxVar = this.e) == null || eyxVar.a().c() || TextUtils.isEmpty(this.g)) {
            return;
        }
        if (this.f == null) {
            this.f = new SearchInfoController(this.d, Boolean.valueOf(z));
        }
        this.f.a(this.g);
        this.f.a(this.b);
        this.f.a();
    }

    private List<a> a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("32a7faca", new Object[]{this, bVar});
        }
        ArrayList arrayList = new ArrayList();
        if (bVar.d == null) {
            return arrayList;
        }
        Iterator<b.d> it = bVar.d.iterator();
        while (it.hasNext()) {
            b.d next = it.next();
            a aVar = new a();
            aVar.f33795a = next.b;
            aVar.b = next.f33800a;
            arrayList.add(aVar);
        }
        return arrayList;
    }

    private JSONObject e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("bf3ec58c", new Object[]{this});
        }
        Resource resource = (Resource) this.e.a().a(Resource.class);
        if (resource != null) {
            return resource.getTopAtmosphere();
        }
        return null;
    }

    public Map<String, String> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7212f323", new Object[]{this});
        }
        Resource resource = (Resource) this.e.a().a(Resource.class);
        if (resource != null) {
            return resource.getRsExtParams();
        }
        return null;
    }

    public String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this});
        }
        pir pirVar = (pir) this.e.a().a(pkw.PARSER_ID);
        if (!at.a(pirVar)) {
            return null;
        }
        return at.c(pirVar);
    }

    private JSONObject i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("dde1390", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        if (this.f33791a.f33796a != null) {
            jSONObject.put("isReviewPageShow", (Object) Boolean.valueOf(this.f33791a.f33796a.l));
            jSONObject.put("rateText", (Object) this.f33791a.f33796a.g);
            jSONObject.put("leftBlackPic", (Object) this.f33791a.f33796a.j);
            jSONObject.put("rightBlackPic", (Object) this.f33791a.f33796a.k);
            jSONObject.put("leftPic", (Object) this.f33791a.f33796a.h);
            jSONObject.put("rightPic", (Object) this.f33791a.f33796a.i);
        }
        return jSONObject;
    }

    public List<String> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4a17df3e", new Object[]{this});
        }
        if (this.f33791a == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<b.d> it = this.f33791a.d.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().b);
        }
        return arrayList;
    }

    private void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
        } else if (this.c == null) {
        } else {
            if (com.taobao.android.detail.ttdetail.utils.e.a(this.d)) {
                f = 1.0f;
            }
            this.c.setTransparency(f);
        }
    }

    private float f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5b2e1dd", new Object[]{this})).floatValue();
        }
        c cVar = this.c;
        if (cVar != null) {
            return cVar.getTransparency();
        }
        return 0.0f;
    }

    @Override // com.taobao.android.detail.ttdetail.widget.scrollerlayout.TTDetailScrollerLayout.a
    public void a(View view, int i, int i2, int i3) {
        int scrollY;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("287d8af9", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3)});
        } else if (!(view instanceof TTDetailScrollerLayout)) {
        } else {
            i.a("TTNavBarComponent", "newY:" + i);
            this.i = (TTDetailScrollerLayout) view;
            if (this.c == null || (scrollY = this.i.getScrollY()) <= 0) {
                return;
            }
            float f = this.k;
            if (f >= 1.0f) {
                return;
            }
            float f2 = scrollY / this.j;
            float f3 = f + f2 > 1.0f ? 1.0f : f2 + f;
            if (f() >= 1.0f && f3 >= 1.0f) {
                return;
            }
            a(f3);
        }
    }

    private void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        com.taobao.android.detail.ttdetail.communication.c.a((Object) context, k.class, (g) this);
        com.taobao.android.detail.ttdetail.communication.c.a((Object) context, com.taobao.android.detail.ttdetail.bizmessage.g.class, (g) this);
        com.taobao.android.detail.ttdetail.communication.c.a((Object) context, l.class, (f) this);
        this.e.e().a("pageType", this.n);
        this.e.e().a("scrollOffset", this.o);
    }

    private void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{this, context});
            return;
        }
        com.taobao.android.detail.ttdetail.communication.c.a(context, k.class);
        com.taobao.android.detail.ttdetail.communication.c.a(context, com.taobao.android.detail.ttdetail.bizmessage.g.class);
        com.taobao.android.detail.ttdetail.communication.c.b(context, l.class);
        this.e.e().b("pageType", this.n);
        this.e.e().b("scrollOffset", this.o);
    }

    @Override // com.taobao.android.detail.ttdetail.communication.g
    public boolean receiveMessage(com.taobao.android.detail.ttdetail.communication.d dVar) {
        c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("318750e6", new Object[]{this, dVar})).booleanValue();
        }
        if ((dVar instanceof k) && (cVar = this.c) != null) {
            this.l = cVar.getTransparency();
            this.c.setNavTabsBarVisibility(8);
            this.c.setTransparency(1.0f);
            if (this.b != null) {
                JSONObject i = i();
                k kVar = (k) dVar;
                boolean booleanValue = kVar.b().booleanValue();
                i.put("pageTitle", (Object) kVar.a());
                this.b.a(i, booleanValue);
            }
            return true;
        } else if (!(dVar instanceof com.taobao.android.detail.ttdetail.bizmessage.g) || this.c == null) {
            return false;
        } else {
            e eVar = this.b;
            if (eVar != null) {
                eVar.k();
            }
            this.c.setNavTabsBarVisibility(0);
            this.c.setTransparency(this.l);
            return true;
        }
    }

    @Override // com.taobao.android.detail.ttdetail.communication.g
    public ThreadMode onRunThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("e1b5ec98", new Object[]{this}) : ThreadMode.MainThread;
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.d
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        Context context = this.d;
        if (context != null) {
            b(context);
        }
        e eVar = this.b;
        if (eVar == null) {
            return;
        }
        eVar.e();
    }
}
