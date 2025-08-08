package tb;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.android.detail2.core.framework.b;
import com.taobao.android.detail2.core.framework.data.global.NewDetailScreenConfig;
import com.taobao.android.detail2.core.framework.data.model.d;
import com.taobao.android.detail2.core.framework.view.navbar.AtmosParams;
import com.taobao.android.detail2.core.rearrange.a;
import com.taobao.tao.tbmainfragment.SupportActivity;
import com.taobao.utils.Global;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class fkr {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NO_ID_DEFAULT = "emptyId";
    public static final String VALUE_FALSE = "false";
    public static final String VALUE_TRUE = "true";
    private boolean A;
    private boolean C;
    private JSONObject D;
    private a E;
    private String H;
    private ctv J;
    private JSONObject K;
    private String L;
    private String M;
    private String N;
    private JSONObject O;
    private String T;

    /* renamed from: a  reason: collision with root package name */
    private fkt f28015a;
    private fkp b;
    private fkq c;
    private String e;
    private String f;
    private Context g;
    private b h;
    private String i;
    private JSONObject j;
    private JSONObject m;
    private fkx n;
    private boolean o;
    private String p;
    private JSONObject q;
    private AtmosParams r;
    private NewDetailScreenConfig s;
    private fks t;
    private fku u;
    private boolean v;
    private boolean w;
    private d x;
    private boolean y;
    private boolean z;
    private fkw d = new fkw();
    private long k = -1;
    private Map<String, Object> l = new HashMap();
    private int S = -1;
    private Map<String, String> B = new HashMap();
    private boolean F = false;
    private int G = 50;
    private int I = -1;
    private boolean P = false;
    private boolean Q = false;
    private boolean R = false;

    static {
        kge.a(373748653);
    }

    public static String o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b4719ea", new Object[0]) : "newdetail_android_optimize_keepliveweex_4";
    }

    public String I() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("136d6650", new Object[]{this}) : fhp.VIEWHOLDER_KEY;
    }

    public boolean z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ccb805", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public fkr(b bVar, Intent intent) {
        this.E = new a();
        boolean z = false;
        if (intent != null) {
            this.T = intent.getStringExtra(b.NAV_TOKEN);
        }
        this.h = bVar;
        b bVar2 = this.h;
        if (bVar2 != null) {
            this.g = bVar2.g();
        }
        if ((this.h.f() instanceof Fragment) && (this.h.g() instanceof SupportActivity)) {
            z = true;
        }
        this.v = z;
        this.d.a(intent);
        this.p = "NewDetail" + hashCode();
        this.f28015a = new fkt();
        this.b = new fkp();
        this.c = new fkq(this.h, this.d, this.p);
        this.J = fky.k(Global.getApplication());
        this.s = new NewDetailScreenConfig(this.h, this.f28015a.c());
        this.t = new fks();
        this.t.a(this.s.f());
        X();
        this.u = new fku(this.d);
        Y();
        this.E = fky.d(this.g, this.d.L);
    }

    public fkr(Intent intent) {
        this.E = new a();
        if (intent != null) {
            this.T = intent.getStringExtra(b.NAV_TOKEN);
        }
        this.d.a(intent);
        this.p = "NewDetail" + hashCode();
        this.f28015a = new fkt();
        this.J = fky.k(Global.getApplication());
        this.t = new fks();
        X();
        this.u = new fku(this.d);
        Y();
        this.E = fky.d(Global.getApplication(), this.d.L);
    }

    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8b7157", new Object[]{this, bVar});
            return;
        }
        this.h = bVar;
        b bVar2 = this.h;
        if (bVar2 != null) {
            this.g = bVar2.g();
        }
        if (!(this.h.f() instanceof Fragment) || !(this.h.g() instanceof SupportActivity)) {
            z = false;
        }
        this.v = z;
        this.b = new fkp();
        this.c = new fkq(this.h, this.d, this.p);
        this.s = new NewDetailScreenConfig(this.h, this.f28015a.c());
        this.t.a(this.s.f());
    }

    public void a(ctv ctvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e41dfe93", new Object[]{this, ctvVar});
        } else {
            this.J = ctvVar;
        }
    }

    public ctv r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ctv) ipChange.ipc$dispatch("91cf62e8", new Object[]{this}) : this.J;
    }

    private void X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ed98df", new Object[]{this});
            return;
        }
        for (String str : this.f28015a.H()) {
            if (!StringUtils.isEmpty(str)) {
                Map<String, String> map = this.B;
                map.put("nd_" + str, this.d.s.get(str));
            }
        }
        this.B.put("nd_appVersion", fji.a(Global.getApplication()));
    }

    private void Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fbb060", new Object[]{this});
            return;
        }
        ctu.a("initTargetParams");
        if (this.d.B == null) {
            ctu.a();
            return;
        }
        Z();
        aa();
        ao();
        ctu.a();
    }

    private void Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("509c7e1", new Object[]{this});
            return;
        }
        try {
            JSONObject jSONObject = this.d.B.getJSONObject(AtmosParams.KEY_ATMOS_PARAMS);
            if (jSONObject == null) {
                return;
            }
            this.r = new AtmosParams();
            this.r.parseRootData(jSONObject);
        } catch (Exception e) {
            StringWriter stringWriter = new StringWriter();
            e.printStackTrace(new PrintWriter(stringWriter));
            String stringWriter2 = stringWriter.toString();
            fjp.a(fjp.SCENE_ENTRANCE_ATMOS, fjp.ERROR_CODE_ATMOS_PARAMS_PARSE_ERROR, "stackTrace: " + stringWriter2, T());
            e.printStackTrace();
        }
    }

    private void aa() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aaf280a7", new Object[]{this});
        } else {
            this.q = this.d.B.getJSONObject(d.KEY_OPEN_IMMEDIATELY_DATA);
        }
    }

    private void ao() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abb7c9b5", new Object[]{this});
            return;
        }
        this.K = this.d.B.getJSONObject("simpleDeliverData");
        JSONObject jSONObject2 = this.K;
        if (jSONObject2 == null || (jSONObject = jSONObject2.getJSONObject("mainPicNative")) == null) {
            return;
        }
        this.N = jSONObject.getString("type");
        this.M = jSONObject.getString("dimension");
        this.L = jSONObject.getString("url");
        this.O = this.K.getJSONObject("feature");
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        fkw fkwVar = this.d;
        if (fkwVar == null) {
            return false;
        }
        return fkwVar.w;
    }

    public fkt b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fkt) ipChange.ipc$dispatch("16b6480e", new Object[]{this}) : this.f28015a;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.d.b().get("spm");
    }

    public String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : this.d.b().get("scm");
    }

    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : this.d.f28020a;
    }

    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50938a53", new Object[]{this});
        }
        if (!StringUtils.isEmpty(this.d.I)) {
            return this.d.I;
        }
        String e = e();
        return !StringUtils.isEmpty(e) ? e : NO_ID_DEFAULT;
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else {
            this.j = jSONObject;
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.i = str;
        }
    }

    public String g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this}) : this.f;
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        if (this.f28015a.aZ()) {
            if (this.e != null) {
                return;
            }
        } else {
            String str2 = this.e;
            if (str2 != null && str2.equals(str)) {
                return;
            }
        }
        this.e = str;
        try {
            this.f = URLEncoder.encode(this.e, "UTF-8");
        } catch (Exception unused) {
        }
    }

    public String h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this}) : this.d.g;
    }

    public String i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e424ba30", new Object[]{this}) : this.d.r;
    }

    public long j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5eb3fe5", new Object[]{this})).longValue() : this.k;
    }

    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
        } else {
            this.k = j;
        }
    }

    public String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82f346c", new Object[]{this, str});
        }
        HashMap<String, String> a2 = this.u.a();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(StringUtils.isEmpty(this.d.F) ? "" : this.d.F);
        return a2.get(sb.toString());
    }

    public fkw k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fkw) ipChange.ipc$dispatch("5bf518c2", new Object[]{this}) : this.d;
    }

    public Map<String, String> l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7666dbe8", new Object[]{this});
        }
        if (O()) {
            this.d.b(this.n.d());
        }
        return this.d.a();
    }

    public boolean m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6158678", new Object[]{this})).booleanValue() : this.o && this.f28015a.K();
    }

    public boolean n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[]{this})).booleanValue() : this.C;
    }

    public void a(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f32d068", new Object[]{this, jSONObject, jSONObject2});
            return;
        }
        if (jSONObject2 != null) {
            try {
                this.o = jSONObject2.getBooleanValue("enableRealTimeRequest");
            } catch (Exception e) {
                fjt.a("new_detail异常", "saveFeatureAndConfig异常", e);
                return;
            }
        }
        if (jSONObject == null) {
            return;
        }
        this.w = jSONObject.getBooleanValue("enablePreventBack");
        this.C = jSONObject.getBooleanValue("enableUpRecommend");
        this.F = jSONObject.getBooleanValue("enableExposeComplexId");
        this.G = jSONObject.getIntValue("exposeComplexIdNum");
        f(jSONObject);
        if (jSONObject.containsKey("scrollRecPreloadCount")) {
            this.I = jSONObject.getIntValue("scrollRecPreloadCount");
        }
        xjj.b(this.g, jSONObject.getJSONArray("entryParamWhiteList"));
    }

    private void f(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9040aa3", new Object[]{this, jSONObject});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("realtime");
        if (jSONObject2 == null) {
            return;
        }
        String string = jSONObject2.getString("invokeId");
        String string2 = jSONObject2.getString("bizIdentifier");
        String string3 = jSONObject2.getString("currentScene");
        if (StringUtils.isEmpty(string) || StringUtils.isEmpty(string2) || StringUtils.isEmpty(string3) || StringUtils.isEmpty(this.d.L)) {
            return;
        }
        this.E.a(string);
        this.E.b(string2);
        this.E.c(string3);
        fky.a(this.g, this.d.L, this.E);
    }

    public static boolean p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[0])).booleanValue() : ABGlobal.isFeatureOpened(Global.getApplication(), "newdetail_android_optimize_home_idle_preload_weex");
    }

    public boolean q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("64de47c", new Object[]{this})).booleanValue() : this.y || ABGlobal.isFeatureOpened(Global.getApplication(), o());
    }

    public static String u() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("326979a4", new Object[0]) : fkt.n();
    }

    public void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb6538e", new Object[]{this, str, obj});
            return;
        }
        if (this.l == null) {
            this.l = new HashMap();
        }
        this.l.put(str, obj);
    }

    public Object d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("1c8a47dd", new Object[]{this, str});
        }
        Map<String, Object> map = this.l;
        return map == null ? "" : map.get(str);
    }

    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
            return;
        }
        Map<String, Object> map = this.l;
        if (map == null) {
            return;
        }
        map.remove(str);
    }

    public void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
        } else {
            this.m = jSONObject;
        }
    }

    public JSONObject v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d63d11d", new Object[]{this});
        }
        JSONObject jSONObject = this.m;
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    public boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a27182", new Object[]{this})).booleanValue();
        }
        fkw fkwVar = this.d;
        if (fkwVar != null) {
            return fkwVar.z;
        }
        return false;
    }

    public boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b08903", new Object[]{this})).booleanValue();
        }
        fkw fkwVar = this.d;
        return fkwVar != null && fkwVar.A;
    }

    public String y() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4c806420", new Object[]{this}) : this.p;
    }

    public boolean A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a97c4c", new Object[]{this})).booleanValue();
        }
        if (StringUtils.isEmpty(c())) {
            return false;
        }
        for (String str : this.f28015a.j()) {
            if (!StringUtils.isEmpty(str) && c().contains(str)) {
                return true;
            }
        }
        return false;
    }

    public String B() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("65c54bf7", new Object[]{this}) : this.u.d();
    }

    public boolean b(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1cf2bb88", new Object[]{this, new Integer(i), str})).booleanValue();
        }
        if (!ab()) {
            return a(i, str);
        }
        return true;
    }

    public boolean ab() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab00982c", new Object[]{this})).booleanValue() : "vertical".equals(this.d.F);
    }

    public boolean ac() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab0eafad", new Object[]{this})).booleanValue() : ab() || C();
    }

    public boolean a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("20f12ca9", new Object[]{this, new Integer(i), str})).booleanValue();
        }
        if (!C()) {
            return false;
        }
        if ((!"item".equals(str) && !fhp.VIEWHOLDER_KEY.equals(str)) || i < 0) {
            return false;
        }
        int i2 = this.d.H;
        if (i2 > i) {
            return true;
        }
        return i2 == -1 && this.u.e().contains(String.valueOf(i));
    }

    public boolean ad() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab1cc72e", new Object[]{this})).booleanValue() : z() || C() || ab();
    }

    public boolean C() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c5ab4e", new Object[]{this})).booleanValue();
        }
        if (D() || (i = this.d.H) == 0 || this.d.T == 0) {
            return false;
        }
        if (af()) {
            return ae();
        }
        if (i > 0) {
            return true;
        }
        return this.u.b() && this.u.c() && !this.u.e().isEmpty();
    }

    private boolean af() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab38f630", new Object[]{this})).booleanValue() : this.d.T >= 0 && this.d.H >= 0;
    }

    public boolean ae() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab2adeaf", new Object[]{this})).booleanValue() : this.d.T > 0 && this.u.h() < this.d.T && this.d.H > 0 && !this.u.i();
    }

    public boolean D() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3d3c2cf", new Object[]{this})).booleanValue() : this.d.G;
    }

    public void a(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c119299", new Object[]{this, new Integer(i), new Boolean(z)});
        } else if (this.d.H >= 0) {
            if (this.d.H == Integer.MAX_VALUE || this.d.H == 0 || this.d.H < i) {
                return;
            }
            fkw fkwVar = this.d;
            fkwVar.H = i - 1;
            if (!z || fkwVar.H > 0) {
                return;
            }
            this.d.H = 1;
        } else {
            List<String> e = this.u.e();
            if (e.isEmpty() || e.size() < i) {
                return;
            }
            int i2 = i - 1;
            if (z && i2 <= 0) {
                i2 = 1;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            if (i2 >= e.size()) {
                return;
            }
            e.subList(i2, e.size()).clear();
        }
    }

    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
        } else if (this.d.H < 0 || this.d.H != Integer.MAX_VALUE || this.d.H == 0 || this.d.H < i) {
        } else {
            this.d.H = i - 1;
        }
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else if (i == 0) {
        } else {
            if (this.d.H >= 0) {
                if (this.d.H == Integer.MAX_VALUE || this.d.H == 0 || this.d.H <= i) {
                    return;
                }
                this.d.H = i;
                return;
            }
            List<String> e = this.u.e();
            if (e.isEmpty() || e.size() <= i) {
                return;
            }
            e.remove(String.valueOf(i));
        }
    }

    public Object E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("6939e66", new Object[]{this});
        }
        AtmosParams atmosParams = this.r;
        if (atmosParams != null && atmosParams.entranceCardParams != null) {
            return this.r.entranceCardParams;
        }
        return null;
    }

    public JSONObject F() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("5dec28ed", new Object[]{this}) : this.q;
    }

    public JSONObject s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("d26c569a", new Object[]{this}) : this.K;
    }

    public String t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("abe3bf05", new Object[]{this}) : this.L;
    }

    public String ak() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("dfb410f", new Object[]{this}) : this.M;
    }

    public String al() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9480fbae", new Object[]{this}) : this.N;
    }

    public JSONObject am() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3ccab9d3", new Object[]{this});
        }
        if (this.O == null) {
            this.O = new JSONObject();
        }
        return this.O;
    }

    public AtmosParams G() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtmosParams) ipChange.ipc$dispatch("60795750", new Object[]{this}) : this.r;
    }

    public boolean H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("40c20d3", new Object[]{this})).booleanValue();
        }
        AtmosParams atmosParams = this.r;
        return (atmosParams == null || atmosParams.layoutInfo == null || (this.r.mNeedClearLayoutInfo && this.r.mHasRefresh)) ? false : true;
    }

    public void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c50c34c6", new Object[]{this, jSONObject});
            return;
        }
        this.r = new AtmosParams();
        d(jSONObject);
    }

    public void d(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("265ed165", new Object[]{this, jSONObject});
            return;
        }
        if (this.r == null) {
            this.r = new AtmosParams();
        }
        this.r.refreshData(jSONObject);
        fkx fkxVar = this.n;
        if (fkxVar == null || !fkxVar.b() || (jSONObject2 = this.r.mRootData.getJSONObject(AtmosParams.KEY_ATMOS_FEED_PARAMS)) == null) {
            return;
        }
        jSONObject2.put(fkx.KEY_REFRESH_TRANS_STATE, (Object) this.n.d);
    }

    public boolean J() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4284fd5", new Object[]{this})).booleanValue() : this.z || ABGlobal.isFeatureOpened(Global.getApplication(), "newdetail_android_optimize_keep_live_with_activity");
    }

    public NewDetailScreenConfig K() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (NewDetailScreenConfig) ipChange.ipc$dispatch("75595a6b", new Object[]{this}) : this.s;
    }

    public fks L() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fks) ipChange.ipc$dispatch("6d7211c5", new Object[]{this}) : this.t;
    }

    public boolean M() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4529658", new Object[]{this})).booleanValue() : this.v;
    }

    public boolean N() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("460add9", new Object[]{this})).booleanValue() : this.w;
    }

    public boolean O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("46ec55a", new Object[]{this})).booleanValue();
        }
        fkx fkxVar = this.n;
        return fkxVar != null && fkxVar.a();
    }

    public void P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47cdcd7", new Object[]{this});
        } else {
            this.n = null;
        }
    }

    public fkx Q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fkx) ipChange.ipc$dispatch("93ea4d3b", new Object[]{this}) : this.n;
    }

    public void a(fkx fkxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8be9da5", new Object[]{this, fkxVar});
        } else {
            this.n = fkxVar;
        }
    }

    public void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a363f7be", new Object[]{this, dVar});
        } else {
            this.x = dVar;
        }
    }

    public d R() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("50f4b2f3", new Object[]{this}) : this.x;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.y = z;
        }
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.z = z;
        }
    }

    public boolean S() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4a7235e", new Object[]{this})).booleanValue() : this.A;
    }

    public String ai() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("efcbd1", new Object[]{this});
        }
        if (this.H == null) {
            this.H = ipa.J();
        }
        return this.H;
    }

    public int ap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("abc5e129", new Object[]{this})).intValue() : this.S;
    }

    public void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i)});
        } else {
            this.S = i;
        }
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else {
            this.A = z;
        }
    }

    public Map<String, String> T() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("2e6db1d0", new Object[]{this}) : this.B;
    }

    public void e(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87b16e04", new Object[]{this, jSONObject});
        } else {
            this.D = jSONObject;
        }
    }

    public JSONObject V() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("986960fd", new Object[]{this}) : this.D;
    }

    public a W() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("c60b1773", new Object[]{this}) : this.E;
    }

    public fku U() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fku) ipChange.ipc$dispatch("b2b0e25a", new Object[]{this}) : this.u;
    }

    public boolean ag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab470db1", new Object[]{this})).booleanValue() : this.F;
    }

    public int ah() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ab552521", new Object[]{this})).intValue() : this.G;
    }

    public int aj() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ab715423", new Object[]{this})).intValue();
        }
        int i = this.I;
        return i >= 0 ? i - 1 : b().g();
    }

    public boolean an() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aba9b238", new Object[]{this})).booleanValue() : this.P && !this.Q && !this.R;
    }

    public boolean ar() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("abe2103c", new Object[]{this})).booleanValue() : !this.Q && !this.R;
    }

    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
        } else {
            this.Q = z;
        }
    }

    public void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef535e8", new Object[]{this, new Boolean(z)});
        } else {
            this.P = z;
        }
    }

    public void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0aa0e87", new Object[]{this, new Boolean(z)});
        } else if (z) {
        } else {
            this.R = z;
        }
    }

    public String aq() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("351da0c9", new Object[]{this}) : this.T;
    }
}
