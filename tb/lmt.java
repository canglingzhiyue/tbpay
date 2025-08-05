package tb;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.text.TextPaint;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.WindowType;
import com.taobao.android.autosize.h;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.android.home.component.utils.j;
import com.taobao.homepage.utils.HomePageUtility;
import com.taobao.homepage.utils.b;
import com.taobao.tao.Globals;
import com.taobao.tao.infoflow.multitab.e;
import com.taobao.tao.infoflow.multitab.g;
import com.taobao.tao.infoflow.multitab.i;
import com.taobao.tao.infoflow.multitab.viewprovider.tablayout.f;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes8.dex */
public class lmt {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_TAB_PADDING_AP = 7;
    private final i D;
    public int E;
    private JSONObject G;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public String l;
    public boolean m;
    public int n;
    public boolean o;
    public boolean p;
    public String q;
    public String r;
    public String s;
    public String t;
    public Map<Integer, a> u;
    private final int v = Color.parseColor("#111111");
    private final int w = Color.parseColor("#FAFAFA");
    private final int x = 14;
    private final int y = 16;
    private final int z = 57;
    private final int A = 18;
    private final int B = Color.parseColor("#FFFFFF");
    private final int C = Color.parseColor("#FF5000");

    /* renamed from: a  reason: collision with root package name */
    public int f30721a = this.v;

    /* renamed from: tb.lmt$1  reason: invalid class name */
    /* loaded from: classes8.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f30722a = new int[WindowType.values().length];

        static {
            try {
                f30722a[WindowType.MIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30722a[WindowType.SMALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f30722a[WindowType.MEDIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f30722a[WindowType.LARGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f30722a[WindowType.MAX.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* loaded from: classes8.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f30723a;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;
        public String g;
        public String h;
        public String i;
        public boolean j;
        public boolean k;

        static {
            kge.a(402545541);
        }
    }

    static {
        kge.a(-506825070);
    }

    public lmt(i iVar) {
        int i = this.C;
        this.b = i;
        int i2 = this.B;
        this.c = i2;
        this.d = i2;
        this.e = i;
        this.f = i2;
        this.g = this.w;
        this.h = 14;
        this.i = 16;
        this.j = 57;
        this.k = 18;
        this.n = 7;
        this.E = 11;
        this.u = new ConcurrentHashMap();
        this.D = iVar;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : b.b() || (b.c() && !b.b(Globals.getApplication()));
    }

    public void a(JSONObject jSONObject, Context context) {
        List<JSONObject> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eefc1940", new Object[]{this, jSONObject, context});
        } else if (jSONObject == null) {
        } else {
            JSONObject jSONObject2 = jSONObject.getJSONObject("ext");
            if (jSONObject2 != null) {
                this.o = jSONObject2.getBooleanValue(e.KEY_EMBED_SEARCH_BAR);
                this.p = jSONObject2.getBooleanValue(e.KEY_IS_FESTIVAL);
            }
            JSONObject jSONObject3 = jSONObject.getJSONObject("subSection");
            if (jSONObject3 == null) {
                return;
            }
            Object a3 = HomePageUtility.a(jSONObject, e.PATH_DOWN_PANEL_ARROW_CONFIG);
            if (a3 instanceof JSONObject) {
                JSONObject jSONObject4 = (JSONObject) a3;
                this.q = jSONObject4.getString(e.KEY_DOWN_PANEL_DOWN_IMG);
                this.r = jSONObject4.getString(e.KEY_DOWN_PANEL_UP_IMG);
                this.s = jSONObject4.getString(e.KEY_DOWN_PANEL_DARK_DOWN_IMG);
                this.t = jSONObject4.getString(e.KEY_DOWN_PANEL_DARK_UP_IMG);
            } else {
                this.q = null;
                this.r = null;
                this.s = null;
                this.t = null;
            }
            JSONObject jSONObject5 = jSONObject3.getJSONObject("tabs");
            if (jSONObject5 == null || (a2 = e.a(jSONObject)) == null || a2.isEmpty()) {
                return;
            }
            a(a2, this.u);
            JSONObject jSONObject6 = jSONObject5.getJSONObject("ext");
            if (jSONObject6 == null) {
                return;
            }
            try {
                String string = jSONObject6.getString("textColor");
                if (!TextUtils.isEmpty(string)) {
                    this.f30721a = Color.parseColor(string);
                }
                String string2 = jSONObject6.getString(e.KEY_TEXT_SELECT_COLOR);
                if (!TextUtils.isEmpty(string2)) {
                    this.b = Color.parseColor(string2);
                }
                String string3 = jSONObject6.getString(e.KEY_BG_COLOR);
                if (!TextUtils.isEmpty(string3)) {
                    this.g = Color.parseColor(string3);
                }
                this.h = jSONObject6.getIntValue("textSize");
                this.i = jSONObject6.getIntValue(e.KEY_TEXT_SELECT_SIZE);
                this.k = jSONObject6.getIntValue(e.KEY_IMAGE_TAB_HEIGHT_AP) == 0 ? 18 : jSONObject6.getIntValue(e.KEY_IMAGE_TAB_HEIGHT_AP);
                this.j = jSONObject6.getIntValue(e.KEY_IMAGE_TAB_WIDTH_AP) == 0 ? 57 : jSONObject6.getIntValue(e.KEY_IMAGE_TAB_WIDTH_AP);
                this.l = jSONObject6.getString(e.KEY_BG_IMG);
                this.m = jSONObject6.getBooleanValue(e.KEY_SHOW_TAB_INDICATOR);
                String string4 = jSONObject6.getString(e.KEY_TAB_INDICATOR_COLOR);
                if (!TextUtils.isEmpty(string4)) {
                    this.e = Color.parseColor(string4);
                }
                String string5 = jSONObject6.getString(e.KEY_TAB_INDICATOR_DARK_COLOR);
                if (!TextUtils.isEmpty(string5)) {
                    this.f = Color.parseColor(string5);
                }
                String string6 = jSONObject6.getString(e.KEY_TAB_DARK_TEXT_COLOR);
                if (!TextUtils.isEmpty(string6)) {
                    this.c = Color.parseColor(string6);
                }
                String string7 = jSONObject6.getString(e.KEY_DARK_TEXT_SELECT_COLOR);
                if (!TextUtils.isEmpty(string7)) {
                    this.d = Color.parseColor(string7);
                }
                String string8 = jSONObject6.getString(e.KEY_TAB_SPACE_CONFIG);
                if (TextUtils.isEmpty(string8)) {
                    string8 = "{\"min\":\"12\",\"small\":\"17\",\"medium\":\"21\",\"large\":\"38\",\"max\":\"55\"}";
                }
                this.E = jSONObject6.getIntValue(e.KEY_TAB_MARGIN_LEFT);
                if (this.E <= 0) {
                    this.E = 11;
                }
                this.G = JSON.parseObject(string8);
                a(context, a2);
            } catch (Exception e) {
                g.a("TabUiConfig", "parse tab config error", e);
            }
        }
    }

    public void a(Context context, List<JSONObject> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9773151", new Object[]{this, context, list});
            return;
        }
        this.n = a(this.G, context, list);
        if (!b.b()) {
            return;
        }
        this.E = this.n + 7;
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[0])).booleanValue() : com.taobao.android.home.component.utils.b.a(Globals.getApplication());
    }

    private int b(Context context, List<JSONObject> list) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c2eebee3", new Object[]{this, context, list})).intValue();
        }
        int b = gbg.b(context);
        int max = Math.max(Math.min(list.size(), g()), h());
        int a2 = a(context, Math.min(list.size(), max));
        int a3 = f.a(context, b.b() ? 11.0f : this.E);
        if (!TextUtils.isEmpty(this.q)) {
            i = f.a(context, 33.0f);
        }
        int round = Math.round((((b - a2) - a3) - i) / (b.b() ? max : max - 1));
        g.a("TabUiConfig", "calculateTabSpace: " + round + " tabContentWidth: " + a2 + " marginLeft: " + a3 + " marginRight: " + i + " tabShowCount: " + max);
        return Math.max(round, f());
    }

    private int a(JSONObject jSONObject, Context context, List<JSONObject> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e3102624", new Object[]{this, jSONObject, context, list})).intValue();
        }
        if (d() && e()) {
            int b = b(context, list);
            if (b > 0) {
                return f.a(context, b / 2);
            }
            return 7;
        }
        return b(jSONObject, context);
    }

    private int b(JSONObject jSONObject, Context context) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e28b9d74", new Object[]{this, jSONObject, context})).intValue();
        }
        if (!(context instanceof Activity) || jSONObject == null) {
            return 7;
        }
        WindowType b = h.a().b((Activity) context);
        if (d()) {
            int i2 = AnonymousClass1.f30722a[b.ordinal()];
            if (i2 == 1) {
                i = jSONObject.getIntValue("min");
            } else if (i2 == 2) {
                i = jSONObject.getIntValue("small");
            } else if (i2 == 3) {
                i = jSONObject.getIntValue("medium");
            } else if (i2 == 4) {
                i = jSONObject.getIntValue("large");
            } else if (i2 == 5) {
                i = jSONObject.getIntValue("max");
            }
        } else {
            i = jSONObject.getIntValue("phoneSpace");
        }
        if (i > 0) {
            return i / 2;
        }
        return 7;
    }

    public boolean a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("84a2e1cc", new Object[]{this, aVar})).booleanValue();
        }
        if (aVar == null) {
            return false;
        }
        return (!TextUtils.isEmpty(aVar.b) && !TextUtils.isEmpty(aVar.c)) || (!TextUtils.isEmpty(aVar.h) && !TextUtils.isEmpty(aVar.i));
    }

    public String a(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1f6ec727", new Object[]{this, new Integer(i), new Boolean(z)});
        }
        boolean a2 = a();
        a aVar = this.u.get(Integer.valueOf(i));
        if (aVar == null) {
            return "";
        }
        if (!TextUtils.isEmpty(aVar.h) && !TextUtils.equals(com.taobao.tao.homepage.launcher.g.b(), "l")) {
            String str = a2 ? aVar.i : aVar.h;
            return TextUtils.isEmpty(str) ? aVar.h : str;
        }
        return a2 ? z ? TextUtils.isEmpty(aVar.e) ? aVar.c : aVar.e : TextUtils.isEmpty(aVar.d) ? aVar.b : aVar.d : z ? TextUtils.isEmpty(aVar.c) ? aVar.b : aVar.c : aVar.b;
    }

    public int a(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a821d35f", new Object[]{this, new Boolean(z)})).intValue() : a() ? z ? this.d : this.c : z ? this.b : this.f30721a;
    }

    public boolean a() {
        a aVar;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        if (!this.o || (aVar = this.u.get(Integer.valueOf(this.D.h()))) == null) {
            return false;
        }
        String a2 = FestivalMgr.a().a("global", "actionBarBackgroundColor");
        if (this.p || TextUtils.isEmpty(a2)) {
            z = false;
        }
        if (!z) {
            return aVar.j;
        }
        return TextUtils.equals(FestivalMgr.a().a("global", nom.KEY_NAVI_STYLE), "0");
    }

    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : a() ? this.f : this.e;
    }

    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue();
        }
        if (!this.o) {
            return this.g;
        }
        return 0;
    }

    public String b(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3c557ff5", new Object[]{this, new Boolean(z)}) : z ? (a() || i()) ? this.s : this.q : (a() || i()) ? this.t : this.r;
    }

    private void a(List<JSONObject> list, Map<Integer, a> map) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aeebb50c", new Object[]{this, list, map});
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            JSONObject jSONObject2 = list.get(i);
            if (jSONObject2 != null && (jSONObject = jSONObject2.getJSONObject("content")) != null) {
                a aVar = new a();
                aVar.f30723a = jSONObject.getString("text");
                aVar.b = jSONObject.getString(e.KEY_TAB_IMG_URL);
                aVar.c = jSONObject.getString(e.KEY_TAB_SELECTED_IMG);
                aVar.d = jSONObject.getString(e.KEY_DARK_TAB_IMG_URL);
                aVar.e = jSONObject.getString(e.KEY_DARK_TAB_SELECTED_IMG_URL);
                aVar.f = jSONObject.getString(e.KEY_TOP_BAR_BG_COLOR);
                aVar.g = jSONObject.getString(e.KEY_TOP_BAR_BG_IMG);
                aVar.h = jSONObject.getString(e.KEY_TAB_GIF_URL);
                aVar.i = jSONObject.getString(e.KEY_DARK_TAB_GIF_URL);
                aVar.j = jSONObject.getBooleanValue(e.KEY_IS_DEEP_COLOR);
                aVar.k = jSONObject.getBooleanValue(e.KEY_IS_STICKY_LEFT);
                map.put(Integer.valueOf(i), aVar);
            }
        }
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : j.a("dynamicTabSpace", true);
    }

    private int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[]{this})).intValue();
        }
        int a2 = j.a("fallbackStrategySpace", 40);
        if (a2 > 0) {
            return a2;
        }
        return 40;
    }

    private int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c0f961", new Object[]{this})).intValue();
        }
        int a2 = j.a("maxShowItemCount", 12);
        if (a2 > 0) {
            return a2;
        }
        return 12;
    }

    private int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5cf10e2", new Object[]{this})).intValue();
        }
        int a2 = j.a("miniShowItemCount", 8);
        if (a2 > 0) {
            return a2;
        }
        return 8;
    }

    private int a(Context context, int i) {
        int measureText;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("258f9a96", new Object[]{this, context, new Integer(i)})).intValue();
        }
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(f.a(context, this.h));
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            a aVar = this.u.get(Integer.valueOf(i3));
            if (aVar != null) {
                if (a(aVar)) {
                    measureText = f.a(context, this.j);
                } else {
                    measureText = (int) textPaint.measureText(aVar.f30723a);
                }
                i2 += measureText;
            }
        }
        return i2;
    }
}
