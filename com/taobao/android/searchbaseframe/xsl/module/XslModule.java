package com.taobao.android.searchbaseframe.xsl.module;

import android.app.Activity;
import android.os.AsyncTask;
import mtopsdk.common.util.StringUtils;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.business.weex.multiplelist.XslMUSComponent;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.searchbaseframe.util.k;
import com.taobao.android.searchbaseframe.xsl.page.uikit.XslPageLayout;
import com.taobao.android.searchbaseframe.xsl.refact.h;
import com.taobao.android.weex_framework.monitor.MUSMonitor;
import com.taobao.android.weex_framework.p;
import com.taobao.android.weex_framework.r;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tb.imn;
import tb.irt;
import tb.iso;
import tb.iss;
import tb.ist;
import tb.isv;
import tb.isx;
import tb.itu;
import tb.ity;
import tb.iub;
import tb.iul;
import tb.ium;
import tb.ius;
import tb.kge;

/* loaded from: classes6.dex */
public class XslModule implements ium {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static d e;
    private static b f;
    private static a g;
    private static volatile imn h;
    private XslDatasource A;
    private String B;
    private String C;
    private String D;
    private String E;
    private String F;
    private String G;
    private String H;
    private int R;
    private int S;
    private int T;
    private int U;
    private int V;
    private int W;
    private int X;
    private int Y;
    private int Z;

    /* renamed from: a  reason: collision with root package name */
    public e f15030a;
    private int aa;
    private boolean ai;
    public c b;
    private com.taobao.android.searchbaseframe.xsl.refact.a c;
    private com.taobao.android.searchbaseframe.xsl.refact.b i;
    private JSONObject k;
    private irt m;
    private com.taobao.android.searchbaseframe.xsl.module.a x;
    private com.taobao.android.searchbaseframe.xsl.module.b y;
    private final Activity z;
    private final List<XslDatasource> j = new ArrayList();
    private boolean d = false;
    private boolean n = false;
    private boolean o = false;
    private int p = -1;
    private int q = -1;
    private String r = null;
    private String s = null;
    private p t = null;
    private boolean u = false;
    private boolean v = false;
    private boolean w = true;
    private boolean I = true;
    private boolean J = false;
    private boolean K = false;
    private JSONObject L = null;
    private final Map<String, String> M = new HashMap();
    private int N = 0;
    private boolean O = true;
    private boolean l = false;
    private int P = 0;
    private int Q = 0;
    private Integer ah = null;
    private int ab = -1;
    private int ac = -1;
    private int ad = 2;
    private boolean ae = false;
    private final Map<String, String> af = new HashMap();
    private final Map<String, String> ag = new HashMap();

    /* loaded from: classes6.dex */
    public interface a {
    }

    /* loaded from: classes6.dex */
    public interface b {
        XslDatasource a(XslModule xslModule, imn imnVar, boolean z);

        com.taobao.android.searchbaseframe.xsl.refact.b a(XslModule xslModule, Activity activity, XslDatasource xslDatasource);
    }

    /* loaded from: classes6.dex */
    public interface c {
        void onDataLoaded(com.taobao.android.searchbaseframe.datasource.a<?, ?, ?> aVar);

        void onDataLoadedMeta(com.taobao.android.searchbaseframe.datasource.a<?, ?, ?> aVar);

        void onDynamicError(String str, Object obj, String str2, String str3);

        void onPageScroll(int i);

        void onPageScrollStateChange(boolean z, int i);

        void onTabChanged(int i);
    }

    /* loaded from: classes6.dex */
    public interface d {
        imn a();
    }

    /* loaded from: classes6.dex */
    public interface e {
        void a(int i);

        void a(int i, int i2);
    }

    static {
        kge.a(783310854);
        kge.a(-1747045540);
    }

    public static /* synthetic */ com.taobao.android.searchbaseframe.xsl.refact.b a(XslModule xslModule) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.searchbaseframe.xsl.refact.b) ipChange.ipc$dispatch("7c7512a6", new Object[]{xslModule}) : xslModule.i;
    }

    public static void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("882a4ef6", new Object[]{aVar});
        } else {
            g = aVar;
        }
    }

    public static void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("882ac355", new Object[]{bVar});
        } else {
            f = bVar;
        }
    }

    public static synchronized void a(d dVar) {
        synchronized (XslModule.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("882bac13", new Object[]{dVar});
            } else {
                e = dVar;
            }
        }
    }

    public void t(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c88da768", new Object[]{this, new Integer(i)});
            return;
        }
        com.taobao.android.searchbaseframe.xsl.refact.b bVar = this.i;
        if (bVar == null) {
            return;
        }
        bVar.k_(i);
    }

    public static imn a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (imn) ipChange.ipc$dispatch("f060694", new Object[0]);
        }
        if (h != null) {
            return h;
        }
        synchronized (XslModule.class) {
            if (h != null) {
                return h;
            }
            imn a2 = e.a();
            h = a2;
            return a2;
        }
    }

    public static imn b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (imn) ipChange.ipc$dispatch("16b7abf3", new Object[0]);
        }
        if (h != null) {
            return h;
        }
        synchronized (XslModule.class) {
            if (h != null) {
                return h;
            }
            d dVar = e;
            if (dVar == null) {
                return null;
            }
            imn a2 = dVar.a();
            h = a2;
            return a2;
        }
    }

    public XslModule(Activity activity) {
        this.z = activity;
    }

    public void a(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11e8b525", new Object[]{this, pVar});
        } else {
            this.t = pVar;
        }
    }

    public void a(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cdec50f", new Object[]{this, num});
        } else {
            this.ah = num;
        }
    }

    public Integer q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Integer) ipChange.ipc$dispatch("a8fc559f", new Object[]{this}) : this.ah;
    }

    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
            return;
        }
        this.B = str;
        this.C = str2;
        this.D = str3;
        XslDatasource xslDatasource = this.A;
        if (xslDatasource == null) {
            return;
        }
        xslDatasource.setApi(str, str2, str3);
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.r = str;
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.s = str;
        }
    }

    public boolean r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("65bfbfd", new Object[]{this})).booleanValue() : this.ai;
    }

    public void i(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5c89864", new Object[]{this, new Boolean(z)});
        } else {
            this.ai = z;
        }
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.J;
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        this.J = z;
        irt irtVar = this.m;
        if (irtVar == null) {
            return;
        }
        irtVar.a("XslPageConfig_PreventRequest", Boolean.valueOf(this.J));
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        this.N = i;
        com.taobao.android.searchbaseframe.xsl.refact.b bVar = this.i;
        if (bVar == null) {
            return;
        }
        bVar.c_(i);
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else {
            this.O = z;
        }
    }

    public void h(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b413bfc5", new Object[]{this, new Boolean(z)});
            return;
        }
        this.l = z;
        com.taobao.android.searchbaseframe.xsl.refact.b bVar = this.i;
        if (bVar == null) {
            return;
        }
        bVar.a(z);
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        this.P = i;
        com.taobao.android.searchbaseframe.xsl.refact.b bVar = this.i;
        if (bVar == null) {
            return;
        }
        bVar.d_(i);
        this.i.postEvent(new iss(i));
    }

    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
            return;
        }
        this.Q = i;
        com.taobao.android.searchbaseframe.xsl.refact.b bVar = this.i;
        if (bVar == null) {
            return;
        }
        bVar.c(i);
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else {
            this.E = str;
        }
    }

    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        this.af.clear();
        this.af.putAll(map);
        XslDatasource xslDatasource = this.A;
        if (xslDatasource == null) {
            return;
        }
        a(xslDatasource);
    }

    public void b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3e87c", new Object[]{this, map});
            return;
        }
        this.ag.clear();
        this.ag.putAll(map);
        XslDatasource xslDatasource = this.A;
        if (xslDatasource == null) {
            return;
        }
        a(xslDatasource);
    }

    private void a(XslDatasource xslDatasource) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89e2f79a", new Object[]{this, xslDatasource});
            return;
        }
        if (xslDatasource != null) {
            xslDatasource.setFlatParams(this.u);
        }
        for (Map.Entry<String, String> entry : this.af.entrySet()) {
            xslDatasource.setParam(entry.getKey(), entry.getValue());
        }
        for (Map.Entry<String, String> entry2 : this.ag.entrySet()) {
            xslDatasource.addTppParam(entry2.getKey(), entry2.getValue());
        }
    }

    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
        } else {
            this.u = z;
        }
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
            return;
        }
        this.G = str;
        com.taobao.android.searchbaseframe.xsl.refact.b bVar = this.i;
        if (bVar == null) {
            return;
        }
        bVar.a(str);
    }

    public void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef535e8", new Object[]{this, new Boolean(z)});
            return;
        }
        this.I = z;
        com.taobao.android.searchbaseframe.xsl.refact.b bVar = this.i;
        if (bVar == null) {
            return;
        }
        bVar.b(z);
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        this.F = str;
        this.H = str2;
        com.taobao.android.searchbaseframe.xsl.refact.b bVar = this.i;
        if (bVar == null) {
            return;
        }
        bVar.a(this.F, this.H);
    }

    public void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i)});
        } else if (this.R == i) {
        } else {
            this.R = i;
            irt irtVar = this.m;
            if (irtVar == null) {
                return;
            }
            irtVar.a("XslPageConfig_TopPaddingTop", Integer.valueOf(this.R));
        }
    }

    public void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef4f617", new Object[]{this, new Integer(i)});
        } else if (this.S == i) {
        } else {
            this.S = i;
            irt irtVar = this.m;
            if (irtVar == null) {
                return;
            }
            irtVar.a("XslPageConfig_TopPaddingBottom", Integer.valueOf(this.S));
        }
    }

    public void f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0a9ceb6", new Object[]{this, new Integer(i)});
        } else if (this.T == i) {
        } else {
            this.T = i;
            irt irtVar = this.m;
            if (irtVar == null) {
                return;
            }
            irtVar.a("XslPageConfig_FoldPaddingTop", Integer.valueOf(this.T));
        }
    }

    public void g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b25ea755", new Object[]{this, new Integer(i)});
        } else if (this.U == i) {
        } else {
            this.U = i;
            irt irtVar = this.m;
            if (irtVar == null) {
                return;
            }
            irtVar.a("XslPageConfig_FoldPaddingBottom", Integer.valueOf(this.U));
        }
    }

    public void h(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4137ff4", new Object[]{this, new Integer(i)});
        } else if (this.V == i) {
        } else {
            this.V = i;
            irt irtVar = this.m;
            if (irtVar == null) {
                return;
            }
            irtVar.a("XslPageConfig_ListHeaderPaddingTop", Integer.valueOf(this.V));
        }
    }

    public void i(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5c85893", new Object[]{this, new Integer(i)});
        } else if (this.W == i) {
        } else {
            this.W = i;
            irt irtVar = this.m;
            if (irtVar == null) {
                return;
            }
            irtVar.a("XslPageConfig_ListHeaderPaddingBottom", Integer.valueOf(this.W));
        }
    }

    public void j(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b77d3132", new Object[]{this, new Integer(i)});
        } else if (this.X == i) {
        } else {
            this.X = i;
            irt irtVar = this.m;
            if (irtVar == null) {
                return;
            }
            irtVar.a("XslPageConfig_ListItemsPaddingTop", Integer.valueOf(this.X));
        }
    }

    public void k(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b93209d1", new Object[]{this, new Integer(i)});
        } else if (this.Y == i) {
        } else {
            this.Y = i;
            irt irtVar = this.m;
            if (irtVar == null) {
                return;
            }
            irtVar.a("XslPageConfig_ListItemsPaddingBottom", Integer.valueOf(this.Y));
        }
    }

    public void l(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bae6e270", new Object[]{this, new Integer(i)});
        } else if (this.Z == i) {
        } else {
            this.Z = i;
            irt irtVar = this.m;
            if (irtVar == null) {
                return;
            }
            irtVar.a("XslPageConfig_ListFooterPaddingTop", Integer.valueOf(this.Z));
        }
    }

    public void m(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc9bbb0f", new Object[]{this, new Integer(i)});
        } else if (this.aa == i) {
        } else {
            this.aa = i;
            irt irtVar = this.m;
            if (irtVar == null) {
                return;
            }
            irtVar.a("XslPageConfig_ListFooterPaddingBottom", Integer.valueOf(this.aa));
        }
    }

    public void n(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be5093ae", new Object[]{this, new Integer(i)});
        } else if (this.ab == i) {
        } else {
            this.ab = i;
            irt irtVar = this.m;
            if (irtVar != null) {
                irtVar.a("XslPageConfig_ItemSpacing", Integer.valueOf(i));
            }
            com.taobao.android.searchbaseframe.xsl.refact.b bVar = this.i;
            if (bVar == null) {
                return;
            }
            bVar.g(this.ab);
        }
    }

    public void o(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0056c4d", new Object[]{this, new Integer(i)});
        } else if (this.ad == i) {
        } else {
            this.ad = i;
            irt irtVar = this.m;
            if (irtVar != null) {
                irtVar.a("XslPageConfig_ColumnCount", Integer.valueOf(i));
            }
            com.taobao.android.searchbaseframe.xsl.refact.b bVar = this.i;
            if (bVar == null) {
                return;
            }
            bVar.h(i);
        }
    }

    public void p(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1ba44ec", new Object[]{this, new Integer(i)});
        } else if (this.ac == i) {
        } else {
            this.ac = i;
            irt irtVar = this.m;
            if (irtVar != null) {
                irtVar.a("XslPageConfig_ItemMargin", Integer.valueOf(i));
            }
            com.taobao.android.searchbaseframe.xsl.refact.b bVar = this.i;
            if (bVar == null) {
                return;
            }
            bVar.f(this.ac);
        }
    }

    public XslDatasource q(int i) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (XslDatasource) ipChange.ipc$dispatch("96cf4d3d", new Object[]{this, new Integer(i)});
        }
        XslDatasource r = r(i);
        if (r != null) {
            return r;
        }
        if (i != 0) {
            z = false;
        }
        XslDatasource a2 = a(this, z);
        a(i, a2);
        return a2;
    }

    public static XslDatasource a(XslModule xslModule, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (XslDatasource) ipChange.ipc$dispatch("f6d3b053", new Object[]{xslModule, new Boolean(z)});
        }
        b bVar = f;
        if (bVar != null) {
            return bVar.a(xslModule, a(), z);
        }
        return new XslDatasource(a());
    }

    private void a(int i, XslDatasource xslDatasource) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ebf6d47", new Object[]{this, new Integer(i), xslDatasource});
            return;
        }
        xslDatasource.setBundleUrl(this.s);
        xslDatasource.subscribe(this, 10);
        xslDatasource.setCurrentTabIndex(i);
        xslDatasource.setExtraStatus(this.k);
        b(xslDatasource);
        this.j.add(xslDatasource);
    }

    public void c(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2985bedb", new Object[]{this, map});
            return;
        }
        this.M.clear();
        this.M.putAll(map);
        for (XslDatasource xslDatasource : this.j) {
            b(xslDatasource);
        }
    }

    private void b(XslDatasource xslDatasource) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4127fb9", new Object[]{this, xslDatasource});
            return;
        }
        for (Map.Entry<String, String> entry : this.M.entrySet()) {
            xslDatasource.forceSetFallbackType(entry.getKey(), entry.getValue());
        }
    }

    public XslDatasource r(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (XslDatasource) ipChange.ipc$dispatch("fed55c", new Object[]{this, new Integer(i)});
        }
        for (XslDatasource xslDatasource : this.j) {
            if (xslDatasource.getCurrentTabIndex() == i) {
                return xslDatasource;
            }
        }
        return null;
    }

    public void a(com.taobao.android.searchbaseframe.xsl.refact.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf8a4a5c", new Object[]{this, aVar});
            return;
        }
        this.c = aVar;
        c();
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.d = z;
        e();
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        com.taobao.android.searchbaseframe.xsl.refact.b bVar = this.i;
        if (bVar == null) {
            return;
        }
        ((h) bVar.m().a()).a(this.c);
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        com.taobao.android.searchbaseframe.xsl.refact.b bVar = this.i;
        if (bVar == null) {
            return;
        }
        ((h) bVar.m().a()).ao().a((com.taobao.android.meta.data.d<Boolean>) Boolean.valueOf(this.d));
    }

    public ViewGroup f() {
        XslDatasource xslDatasource;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("40865d88", new Object[]{this});
        }
        if (this.i != null) {
            throw new IllegalStateException("XslModule can't create twice");
        }
        if (!StringUtils.isEmpty(this.E)) {
            this.A = com.taobao.android.searchbaseframe.xsl.f.a().a(this.E, this.B, this.C, this.af, this.ag);
        }
        if (this.A == null) {
            p();
        } else {
            p pVar = this.t;
            if (pVar != null) {
                pVar.setMonitorDetailDims(MUSMonitor.DIMS_PAGE_DATA_PRELOAD, "true");
            }
            a(0, this.A);
            this.n = true;
        }
        String str = this.r;
        if (str != null && (xslDatasource = this.A) != null) {
            xslDatasource.setTrackingName(str);
        }
        b bVar = f;
        if (bVar != null) {
            this.i = bVar.a(this, this.z, this.A);
            c();
            e();
        }
        int i = this.Q;
        if (i != 0) {
            this.i.c(i);
        }
        JSONObject jSONObject = this.L;
        if (jSONObject != null) {
            this.i.a(jSONObject);
        }
        p pVar2 = this.t;
        if (pVar2 != null) {
            Object tag = pVar2.getTag(XslMUSComponent.PAGE_SCROLL_LISTENER);
            if (tag instanceof XslPageLayout.a) {
                this.i.a((XslPageLayout.a) tag);
                this.t.getInstanceTags().remove(XslMUSComponent.PAGE_SCROLL_LISTENER);
            }
            Object tag2 = this.t.getTag(XslMUSComponent.PAGE_PERF_STATICS_CALLBACK);
            if (tag2 instanceof com.taobao.android.searchbaseframe.datasource.d) {
                this.A.perfStaticsCallback = (com.taobao.android.searchbaseframe.datasource.d) tag2;
                this.t.getInstanceTags().remove(XslMUSComponent.PAGE_PERF_STATICS_CALLBACK);
            }
        }
        this.m = this.i.m().e();
        this.m.a(this.s);
        o();
        this.m.a("XslPageConfig_TopPaddingTop", Integer.valueOf(this.R));
        this.m.a("XslPageConfig_TopPaddingBottom", Integer.valueOf(this.S));
        this.m.a("XslPageConfig_FoldPaddingTop", Integer.valueOf(this.T));
        this.m.a("XslPageConfig_FoldPaddingBottom", Integer.valueOf(this.U));
        this.m.a("XslPageConfig_ListHeaderPaddingTop", Integer.valueOf(this.V));
        this.m.a("XslPageConfig_ListHeaderPaddingBottom", Integer.valueOf(this.W));
        this.m.a("XslPageConfig_ListItemsPaddingTop", Integer.valueOf(this.X));
        this.m.a("XslPageConfig_ListItemsPaddingBottom", Integer.valueOf(this.Y));
        this.m.a("XslPageConfig_ListFooterPaddingBottom", Integer.valueOf(this.Z));
        this.m.a("XslPageConfig_ListFooterPaddingBottom", Integer.valueOf(this.aa));
        this.m.a("XslPageConfig_ItemMargin", Integer.valueOf(this.ac));
        this.m.a("XslPageConfig_ItemSpacing", Integer.valueOf(this.ab));
        this.m.a("XslPageConfig_ColumnCount", Integer.valueOf(this.ad));
        this.m.a("XslPageConfig_ObserveSection", Boolean.valueOf(this.ae));
        this.m.a("XslPageConfig_PreventRequest", Boolean.valueOf(this.J));
        this.i.subscribeEvent(this);
        this.i.a(this.F, this.H);
        this.i.b(this.I);
        this.i.a(this.G);
        this.i.c_(this.N);
        this.i.a(this.l);
        this.i.d_(this.P);
        this.i.a(new com.taobao.android.searchbaseframe.meta.uikit.c() { // from class: com.taobao.android.searchbaseframe.xsl.module.XslModule.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.searchbaseframe.meta.uikit.c
            public void d(int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i2)});
                }
            }

            @Override // com.taobao.android.searchbaseframe.meta.uikit.c
            public void a(int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i2)});
                } else if (XslModule.this.b == null) {
                } else {
                    XslModule.this.b.onPageScrollStateChange(true, i2);
                }
            }

            @Override // com.taobao.android.searchbaseframe.meta.uikit.c
            public void b(int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i2)});
                } else if (XslModule.this.b == null) {
                } else {
                    XslModule.this.b.onPageScrollStateChange(false, i2);
                }
            }

            @Override // com.taobao.android.searchbaseframe.meta.uikit.c
            public void c(int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i2)});
                } else if (XslModule.this.b == null) {
                } else {
                    XslModule.this.b.onPageScroll(i2);
                }
            }
        });
        this.i.c(this.K);
        this.i.a(new itu() { // from class: com.taobao.android.searchbaseframe.xsl.module.XslModule.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.itu
            public void a(iul iulVar, String str2, Object obj, String str3, String str4) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("da215b52", new Object[]{this, iulVar, str2, obj, str3, str4});
                } else if (XslModule.this.b == null) {
                } else {
                    XslModule.this.b.onDynamicError(str2, obj, str3, str4);
                }
            }
        });
        return this.i.l();
    }

    private void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
            return;
        }
        com.taobao.android.searchbaseframe.xsl.refact.b bVar = this.i;
        if (bVar == null) {
            return;
        }
        bVar.d(this.R, this.S);
        this.i.e(this.T, this.U);
        this.i.a(this.V, this.W);
        this.i.b(this.X, this.Y);
        this.i.c(this.Z, this.aa);
        this.i.f(this.ac);
        this.i.g(this.ab);
        this.i.h(this.ad);
        this.i.d(this.ae);
    }

    private void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
            return;
        }
        this.A = q(0);
        this.A.setApi(this.B, this.C, this.D);
        a(this.A);
    }

    public void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("882c2072", new Object[]{this, eVar});
        } else {
            this.f15030a = eVar;
        }
    }

    public void a(com.taobao.android.searchbaseframe.xsl.module.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("297f3f2f", new Object[]{this, aVar});
        } else {
            this.x = aVar;
        }
    }

    public void a(com.taobao.android.searchbaseframe.xsl.module.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("297fb38e", new Object[]{this, bVar});
        } else {
            this.y = bVar;
        }
    }

    public void onEventMainThread(iso isoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5b5bfd0", new Object[]{this, isoVar});
        } else if (this.x == null) {
        } else {
            if (isoVar.c) {
                this.x.a(isoVar.f29281a, isoVar.b, "list");
            } else {
                this.x.b(isoVar.f29281a, isoVar.b, "list");
            }
        }
    }

    public void onEventMainThread(ist istVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5b805ab", new Object[]{this, istVar});
            return;
        }
        com.taobao.android.searchbaseframe.xsl.module.a aVar = this.x;
        if (aVar == null) {
            return;
        }
        aVar.a(istVar.f29285a, istVar.b, istVar.c, istVar.d);
    }

    public void onEventMainThread(isx isxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5b9d727", new Object[]{this, isxVar});
            return;
        }
        com.taobao.android.searchbaseframe.xsl.module.b bVar = this.y;
        if (bVar == null) {
            return;
        }
        bVar.a(isxVar.f29299a, isxVar.b, isxVar.c);
    }

    private void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        XslDatasource r = r(i);
        if (r == null || r.isJsRequestEventFired() || r.isTaskRunning()) {
            return;
        }
        r.setJsRequestEventFired(true);
        e eVar = this.f15030a;
        if (eVar != null) {
            eVar.a(i, i2);
        }
        if (i2 != 1) {
            z = false;
        }
        r.triggerBefore(z, false, false);
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else {
            this.w = true;
        }
    }

    public void a(int i, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e86c6b5", new Object[]{this, new Integer(i), jSONObject});
            return;
        }
        XslDatasource r = r(i);
        if (r == null && i != 0 && this.j.size() == 1 && !this.v && this.J) {
            r = r(0);
            this.v = true;
        }
        if (r == null) {
            k b2 = a().b();
            b2.b("XslModule", "setRequestedData of null datasource: tab " + i);
            return;
        }
        r.setJsRequestEventFired(false);
        r.doNewSearch(jSONObject);
    }

    public void b(int i, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1787bdf6", new Object[]{this, new Integer(i), jSONObject});
            return;
        }
        this.w = true;
        XslDatasource r = r(i);
        if (r == null) {
            k b2 = a().b();
            b2.b("XslModule", "appendRequestedData of null datasource: tab " + i);
            return;
        }
        r.setJsRequestEventFired(false);
        if (r.getTotalSearchResult() == 0) {
            r.doNewSearch(jSONObject);
        } else {
            r.doNextPageSearch(jSONObject);
        }
    }

    public void a(int i, JSONObject jSONObject, Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a53f776a", new Object[]{this, new Integer(i), jSONObject, set});
            return;
        }
        XslDatasource r = r(i);
        if (r == null) {
            k b2 = a().b();
            b2.b("XslModule", "setPartialData of null datasource: tab " + i);
            return;
        }
        r.setJsRequestEventFired(false);
        if (r.getTotalSearchResult() == 0) {
            k b3 = a().b();
            b3.b("XslModule", "setPartialData of none-first datasource: tab " + i);
            return;
        }
        r.doPartialSearch(set, jSONObject);
    }

    public void a(final int i, int i2, final JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86606128", new Object[]{this, new Integer(i), new Integer(i2), jSONObject});
            return;
        }
        final imn core = getCore();
        final XslDatasource r = r(i);
        if (r == null) {
            a().b().b("XslModule", "Insert before ds created");
            return;
        }
        final XslSearchResult xslSearchResult = (XslSearchResult) r.getTotalSearchResult();
        if (xslSearchResult == null || xslSearchResult.isFailed()) {
            a().b().b("XslModule", "Insert to not exist or failed ds");
            return;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if (xslSearchResult.getCellsCount() <= i2) {
            i2 = xslSearchResult.getCellsCount();
        }
        final int i3 = i2;
        new AsyncTask<Void, Void, List<BaseCellBean>>() { // from class: com.taobao.android.searchbaseframe.xsl.module.XslModule.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.util.List<com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean>] */
            @Override // android.os.AsyncTask
            public /* synthetic */ List<BaseCellBean> doInBackground(Void[] voidArr) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("e83e4786", new Object[]{this, voidArr}) : a(voidArr);
            }

            @Override // android.os.AsyncTask
            public /* synthetic */ void onPostExecute(List<BaseCellBean> list) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b105c779", new Object[]{this, list});
                } else {
                    a(list);
                }
            }

            public List<BaseCellBean> a(Void... voidArr) {
                BaseCellBean a2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (List) ipChange2.ipc$dispatch("ed23ac73", new Object[]{this, voidArr});
                }
                try {
                    Map<String, TemplateBean> a3 = iub.a(jSONObject.getJSONArray("templates"), core);
                    JSONObject jSONObject2 = jSONObject.getJSONObject("pageInfo");
                    JSONArray jSONArray = jSONObject.getJSONArray("listItems");
                    ArrayList arrayList = new ArrayList(jSONArray.size());
                    int size = jSONArray.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        JSONObject jSONObject3 = jSONArray.getJSONObject(i4);
                        if (jSONObject3 != null && (a2 = core.f().a(jSONObject3, xslSearchResult, jSONObject2)) != null) {
                            arrayList.add(a2);
                            a2.pagePos = i4;
                            a2.pageSize = size;
                            a2.pageNo = xslSearchResult.getPageNo();
                        }
                    }
                    r rVar = new r();
                    rVar.a(r.getBundleUrl());
                    rVar.b(r.getTrackingPageName());
                    ity.a(rVar, a3, core, r.getTemplateFiles());
                    r.mergeTemplates(a3);
                    return arrayList;
                } catch (Exception e2) {
                    core.b().b("XslModule", "insertListItemsData bg exception", e2);
                    return null;
                }
            }

            public void a(List<BaseCellBean> list) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c7052959", new Object[]{this, list});
                    return;
                }
                try {
                    XslDatasource r2 = XslModule.this.r(i);
                    if (r2 == r && r2.getTotalSearchResult() == xslSearchResult) {
                        int cellsCount = xslSearchResult.getCellsCount();
                        int i4 = i3;
                        if (i4 < cellsCount) {
                            cellsCount = i4;
                        }
                        if (cellsCount < 0) {
                            cellsCount = 0;
                        }
                        for (BaseCellBean baseCellBean : list) {
                            r2.insertCellToTotal(baseCellBean, cellsCount);
                            cellsCount++;
                        }
                        if (!r2.isMetaMode()) {
                            return;
                        }
                        ius<?, ?, ?> i5 = XslModule.a(XslModule.this).i(r2.getCurrentTabIndex());
                        if (!(i5 instanceof com.taobao.android.searchbaseframe.xsl.refact.e)) {
                            return;
                        }
                        ((com.taobao.android.searchbaseframe.xsl.refact.e) i5).b(false);
                        return;
                    }
                    core.b().d("XslModule", "insertListItemsData has researched");
                } catch (Exception e2) {
                    core.b().b("XslModule", "insertListItemsData post exception", e2);
                }
            }
        }.executeOnExecutor(getCore().c().k().e, new Void[0]);
    }

    public void s(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6d8cec9", new Object[]{this, new Integer(i)});
        } else {
            a(i, true);
        }
    }

    public void a(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c119299", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        com.taobao.android.searchbaseframe.xsl.refact.b bVar = this.i;
        if (bVar == null) {
            return;
        }
        bVar.a(i, z);
    }

    public void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0aa0e87", new Object[]{this, new Boolean(z)});
            return;
        }
        this.K = z;
        com.taobao.android.searchbaseframe.xsl.refact.b bVar = this.i;
        if (bVar == null) {
            return;
        }
        bVar.c(z);
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        this.L = jSONObject;
        com.taobao.android.searchbaseframe.xsl.refact.b bVar = this.i;
        if (bVar == null) {
            return;
        }
        bVar.a(jSONObject);
    }

    public void a(String str, String str2, Map<String, String> map, Map<String, String> map2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbdbfca7", new Object[]{this, str, str2, map, map2, new Integer(i)});
            return;
        }
        XslDatasource r = r(i);
        if (r == null) {
            return;
        }
        if (str != null) {
            r.setApi(str, str2);
        }
        r.setParams(map2);
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                r.addTppParam(entry.getKey(), entry.getValue());
            }
        }
        if (!r.isJsParamReady() || !this.i.d(i)) {
            return;
        }
        this.i.i(i).bindWithData(null);
    }

    public void h() {
        XslDatasource xslDatasource;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else if (this.i == null || (xslDatasource = this.A) == null) {
        } else {
            if (this.o) {
                a().b().b("XslModule", "InitSearch call twice");
                return;
            }
            this.o = true;
            if (this.n) {
                if (xslDatasource.getTotalSearchResult() == 0) {
                    a().b().f("XslModule", "BindPreload: not return yet");
                } else if (this.i.i()) {
                    a().b().f("XslModule", "BindPreload: already notified");
                } else {
                    a().b().f("XslModule", "BindPreload: fire after event");
                    this.A.triggerAfter(true, false, false);
                }
            } else if (xslDatasource.isFirstSearchDone()) {
            } else {
                if (this.J) {
                    k.d("[XS.xsl]", "First request for tab %d, params: %s", 0, "js request mtop, no param");
                    a(0, 1);
                } else if (!this.A.isJsParamReady()) {
                    a().b().b("XslModule", "JsParam not ready");
                } else {
                    this.A.doNewSearch();
                }
            }
        }
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        com.taobao.android.searchbaseframe.xsl.refact.b bVar = this.i;
        if (bVar == null) {
            return;
        }
        bVar.onCtxResumeInternal();
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        com.taobao.android.searchbaseframe.xsl.refact.b bVar = this.i;
        if (bVar == null) {
            return;
        }
        bVar.onCtxPauseInternal();
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        this.w = true;
        if (this.i == null) {
            return;
        }
        for (XslDatasource xslDatasource : this.j) {
            xslDatasource.unsubscribe(this);
        }
        this.i.onCtxDestroyInternal();
        this.i.destroyAndRemoveFromParent();
        this.i = null;
        this.A.destroy();
        this.A = null;
    }

    @Override // tb.ium
    public imn getCore() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (imn) ipChange.ipc$dispatch("f78bd660", new Object[]{this}) : a();
    }

    public void onEventMainThread(isv.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a0bf04c", new Object[]{this, aVar});
            return;
        }
        XslDatasource xslDatasource = (XslDatasource) aVar.a();
        if (this.A == xslDatasource && xslDatasource.getTotalSearchResult() == xslDatasource.getLastSearchResult() && xslDatasource.getTotalSearchResult() != 0) {
            XslSearchResult xslSearchResult = (XslSearchResult) xslDatasource.getTotalSearchResult();
            a(xslSearchResult);
            this.A.setCurrentTabIndex(xslSearchResult.getDefaultTabIndex());
        }
        c cVar = this.b;
        if (cVar == null) {
            return;
        }
        cVar.onDataLoaded(xslDatasource);
    }

    public void a(XslSearchResult xslSearchResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bd6163a", new Object[]{this, xslSearchResult});
        } else if (this.i == null) {
        } else {
            if (StringUtils.isEmpty(this.F)) {
                this.i.a(xslSearchResult.getAtmosphereType(), xslSearchResult.getAtmosphereUrl());
                this.i.b(xslSearchResult.isAtmosphereAnim());
            }
            if (!StringUtils.isEmpty(this.G)) {
                return;
            }
            this.i.a(xslSearchResult.getAtmosphereListBgColor());
        }
    }

    public XslDatasource l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (XslDatasource) ipChange.ipc$dispatch("1cf952a5", new Object[]{this}) : this.A;
    }

    public void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
            return;
        }
        this.k = jSONObject;
        for (XslDatasource xslDatasource : this.j) {
            xslDatasource.setExtraStatus(this.k);
        }
    }

    public void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("882b37b4", new Object[]{this, cVar});
        } else {
            this.b = cVar;
        }
    }

    public void g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b25ee726", new Object[]{this, new Boolean(z)});
        } else if (this.ae == z) {
        } else {
            this.ae = z;
            irt irtVar = this.m;
            if (irtVar == null) {
                return;
            }
            irtVar.a("XslPageConfig_ObserveSection", Boolean.valueOf(z));
        }
    }

    public boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6158678", new Object[]{this})).booleanValue();
        }
        com.taobao.android.searchbaseframe.xsl.refact.b bVar = this.i;
        if (bVar != null) {
            return bVar.j();
        }
        return true;
    }

    public boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[]{this})).booleanValue();
        }
        com.taobao.android.searchbaseframe.xsl.refact.b bVar = this.i;
        if (bVar != null) {
            return bVar.k();
        }
        return true;
    }

    public void a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ad11", new Object[]{this, str, new Integer(i)});
        } else {
            a(str, i, false);
        }
    }

    public void a(String str, int i, boolean z, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c702c780", new Object[]{this, str, new Integer(i), new Boolean(z), new Integer(i2)});
            return;
        }
        com.taobao.android.searchbaseframe.xsl.refact.b bVar = this.i;
        if (bVar == null) {
            return;
        }
        bVar.a(str, i, z, i2);
    }

    public void a(String str, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a352a7e3", new Object[]{this, str, new Integer(i), new Boolean(z)});
        } else {
            a(str, i, z, 0);
        }
    }

    public void a(boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c190d17", new Object[]{this, new Boolean(z), new Integer(i)});
            return;
        }
        com.taobao.android.searchbaseframe.xsl.refact.b bVar = this.i;
        if (bVar == null) {
            return;
        }
        bVar.a(z, i);
    }

    public void onEventMainThread(com.taobao.android.searchbaseframe.track.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d7d1d65", new Object[]{this, aVar});
            return;
        }
        XslDatasource xslDatasource = this.A;
        if (xslDatasource == null || this.t == null) {
            return;
        }
        com.taobao.android.searchbaseframe.track.d firstRequestPerf = xslDatasource.getFirstRequestPerf();
        this.t.setMonitorDetailDims("page_template_download_count", String.valueOf(firstRequestPerf.k));
        this.t.setMonitorDetailDims("page_template_download_succ_count", String.valueOf(firstRequestPerf.l));
        this.t.setMonitorDetailDims(MUSMonitor.DIMS_PAGE_DATA_PRELOAD, String.valueOf(this.n));
        this.t.setMonitorDetailTime("page_template_download_count", firstRequestPerf.k);
        this.t.setMonitorDetailTime("page_template_download_succ_count", firstRequestPerf.l);
        this.t.setMonitorDetailTime(MUSMonitor.KEY_PAGE_TEMPLATE_DOWNLOAD_TIME, firstRequestPerf.j);
        if (aVar.f() != 0 && aVar.d() != 0) {
            this.t.setMonitorDetailTime(MUSMonitor.KEY_PAGE_FIRST_SCREEN_TIME, aVar.d() - aVar.f());
        }
        this.t.setMonitorDetailTime(MUSMonitor.KEY_PAGE_MTOP_TIME, firstRequestPerf.h);
        if (!this.n || aVar.f() == 0) {
            return;
        }
        this.t.setMonitorDetailTime(MUSMonitor.KEY_PAGE_CONTAINER_TO_PRELOAD_START, firstRequestPerf.e - aVar.f());
        this.t.setMonitorDetailTime(MUSMonitor.KEY_PAGE_CONTAINER_TO_PRELOAD_FINISH, firstRequestPerf.f - aVar.f());
    }

    public void a(int i, int i2, JSONObject jSONObject, int i3, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b90469b", new Object[]{this, new Integer(i), new Integer(i2), jSONObject, new Integer(i3), new Boolean(z), new Boolean(z2)});
            return;
        }
        XslDatasource r = r(i);
        if (r == null) {
            k b2 = a().b();
            b2.b("XslModule", "updateListItemsData of null datasource: tab " + i);
            return;
        }
        r.setJsRequestEventFired(false);
        if (r.getTotalSearchResult() == 0) {
            k b3 = a().b();
            b3.b("XslModule", "updateListItemsData of none-first datasource: tab " + i);
            return;
        }
        r.doUpdateSearch(jSONObject, i2, i3, z, z2);
    }
}
