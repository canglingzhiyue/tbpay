package com.taobao.tbpoplayer.nativerender;

import android.content.Context;
import android.os.Handler;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tbpoplayer.nativerender.dsl.DSLModel;
import com.taobao.tbpoplayer.nativerender.dsl.PopCloseBtnModel;
import com.taobao.tbpoplayer.nativerender.dsl.StateBaseModel;
import com.taobao.tbpoplayer.nativerender.dsl.StateModel;
import com.taobao.tbpoplayer.nativerender.dsl.StateVersionModel;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import tb.alu;
import tb.kge;

/* loaded from: classes8.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ENGINE_FIELD_POP = 0;
    public static final int ENGINE_FIELD_WIDGET = 1;
    public static final String WIDGET_SWITCH_ENABLE_CORNER_RADIUS = "enableCornerRadius";
    public static final String WIDGET_SWITCH_ENABLE_NEW_CORNER_RADIUS = "enableNewCornerRadius";
    private String A;

    /* renamed from: a  reason: collision with root package name */
    private int f22222a;
    private final Context b;
    private final Handler c;
    private String d;
    private DSLModel e;
    private String g;
    private List<String> h;
    private StateModel n;
    private StateBaseModel o;
    private PopCloseBtnModel p;
    private int q;
    private int r;
    private Map<String, String> u;
    private StateVersionModel v;
    private alu w;
    private String x;
    private String y;
    private String z;
    private final JSONObject f = new JSONObject();
    private boolean j = false;
    private boolean B = false;
    private boolean i = false;
    private long k = 0;
    private int l = 0;
    private boolean m = false;
    private final AtomicInteger s = new AtomicInteger(0);
    private final AtomicInteger t = new AtomicInteger(0);

    static {
        kge.a(-693425895);
    }

    public d(Context context, Handler handler, int i) {
        this.f22222a = 0;
        this.b = context;
        this.c = handler;
        this.f22222a = i;
    }

    public Context a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("75941360", new Object[]{this}) : this.b;
    }

    public Handler b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("ac18683d", new Object[]{this}) : this.c;
    }

    public int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.f22222a;
    }

    public String C() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ec4b0696", new Object[]{this}) : this.x;
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else {
            this.x = str;
        }
    }

    public String D() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("72d0c135", new Object[]{this}) : this.y;
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
        } else {
            this.y = str;
        }
    }

    public String E() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f9567bd4", new Object[]{this}) : this.z;
    }

    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
        } else {
            this.z = str;
        }
    }

    public String G() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("661f112", new Object[]{this}) : this.A;
    }

    public void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("669e4a77", new Object[]{this, str});
        } else {
            this.A = str;
        }
    }

    public String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : this.d;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public DSLModel e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DSLModel) ipChange.ipc$dispatch("83b58aeb", new Object[]{this}) : this.e;
    }

    public void a(DSLModel dSLModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("733aa727", new Object[]{this, dSLModel});
        } else {
            this.e = dSLModel;
        }
    }

    public JSONObject f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("d2e6990d", new Object[]{this}) : this.f;
    }

    public boolean F() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3eff1d1", new Object[]{this})).booleanValue() : this.j;
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.j = z;
        }
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : this.i;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.i = z;
        }
    }

    public boolean H() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("40c20d3", new Object[]{this})).booleanValue() : this.B;
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else {
            this.B = z;
        }
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue() : this.l == 0;
    }

    public long i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5dd2864", new Object[]{this})).longValue() : this.k;
    }

    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
        } else {
            this.k = j;
        }
    }

    public StateModel j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (StateModel) ipChange.ipc$dispatch("37395204", new Object[]{this}) : this.n;
    }

    public void a(StateModel stateModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da922f3b", new Object[]{this, stateModel});
        } else {
            this.n = stateModel;
        }
    }

    public StateVersionModel A() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (StateVersionModel) ipChange.ipc$dispatch("204998a1", new Object[]{this}) : this.v;
    }

    public void a(StateVersionModel stateVersionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("623c543b", new Object[]{this, stateVersionModel});
        } else {
            this.v = stateVersionModel;
        }
    }

    public StateBaseModel k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (StateBaseModel) ipChange.ipc$dispatch("d09fb7f6", new Object[]{this}) : this.o;
    }

    public void a(StateBaseModel stateBaseModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("427ebb2c", new Object[]{this, stateBaseModel});
        } else {
            this.o = stateBaseModel;
        }
    }

    public PopCloseBtnModel l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PopCloseBtnModel) ipChange.ipc$dispatch("bece716a", new Object[]{this}) : this.p;
    }

    public void a(PopCloseBtnModel popCloseBtnModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("659a2d1f", new Object[]{this, popCloseBtnModel});
        } else {
            this.p = popCloseBtnModel;
        }
    }

    public String m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fe3ba4ac", new Object[]{this});
        }
        StateModel stateModel = this.n;
        return stateModel != null ? stateModel.id : "";
    }

    public String n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("84c15f4b", new Object[]{this});
        }
        StateBaseModel stateBaseModel = this.o;
        return String.valueOf(stateBaseModel instanceof StateVersionModel ? ((StateVersionModel) stateBaseModel).verId : "");
    }

    public int o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("631b569", new Object[]{this})).intValue() : this.l;
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
            return;
        }
        this.l++;
        this.m = false;
    }

    public boolean q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("64de47c", new Object[]{this})).booleanValue() : this.m;
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
        } else {
            this.m = true;
        }
    }

    public String s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("255e0466", new Object[]{this}) : this.g;
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.g = str;
        }
    }

    public List<String> t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("9378f1ec", new Object[]{this}) : this.h;
    }

    public void a(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else {
            this.h = list;
        }
    }

    public int u() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("686426f", new Object[]{this})).intValue() : this.q;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.q = i;
        }
    }

    public int v() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("69459f0", new Object[]{this})).intValue() : this.r;
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            this.r = i;
        }
    }

    public Map<String, String> w() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("4cb90f33", new Object[]{this}) : this.u;
    }

    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else {
            this.u = map;
        }
    }

    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
            return;
        }
        this.s.set(i);
        this.t.set(i);
        com.alibaba.poplayer.utils.c.a("setFirstStateResCount.done.count=%s", Integer.valueOf(i));
    }

    public void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b088ff", new Object[]{this});
        } else {
            this.t.decrementAndGet();
        }
    }

    public int y() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6bea073", new Object[]{this})).intValue() : this.s.get();
    }

    public int z() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6ccb7f4", new Object[]{this})).intValue() : this.t.get();
    }

    public alu B() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (alu) ipChange.ipc$dispatch("207f5a33", new Object[]{this}) : this.w;
    }

    public void a(alu aluVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0431cee", new Object[]{this, aluVar});
        } else {
            this.w = aluVar;
        }
    }
}
