package com.taobao.tao.flexbox.layoutmanager.core;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.h;
import com.taobao.tao.flexbox.layoutmanager.core.j;
import com.taobao.tao.flexbox.layoutmanager.filter.Utils;
import com.taobao.weex.common.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import tb.kge;
import tb.oeb;
import tb.oec;
import tb.ogg;
import tb.ogh;
import tb.ohe;
import tb.riy;

/* loaded from: classes8.dex */
public class af implements y, Utils.b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CELL_DIFF_NAME = "cell_diff";
    private static HashMap<String, List<String>> u;
    private static final String[] v;
    private static final String[] w;

    /* renamed from: a  reason: collision with root package name */
    public ab f20339a;
    public af b;
    public Map c;
    public aa e;
    public Map f;
    public h.b g;
    public h.b h;
    public String i;
    public b j;
    public Object k;
    public String l;
    public Map n;
    public HashMap<String, Object> o;
    public Object p;
    public Utils.b r;
    public volatile boolean s;
    private boolean x;
    public af y;
    public a q = new a();
    public d t = new d() { // from class: com.taobao.tao.flexbox.layoutmanager.core.af.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.tao.flexbox.layoutmanager.core.af.d
        public Object a(af afVar, ag agVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("5d821bc5", new Object[]{this, afVar, agVar});
            }
            if (agVar != null) {
                if (agVar.c != null) {
                    return new j.a(agVar.f20344a, agVar.c);
                }
                if (af.a(agVar.f20344a, com.taobao.android.weex_framework.util.a.ATOM_EXT_repeat) != null) {
                    return new j.a(agVar.f20344a, agVar.b);
                }
                return new j.a(agVar.f20344a, agVar.f20344a);
            } else if (afVar == null) {
                return null;
            } else {
                if (afVar.k != null) {
                    return new j.a(afVar.h, afVar.k);
                }
                if (afVar.m != null && afVar.m.containsKey("key")) {
                    return new j.a(afVar.h, afVar.m.get("key"));
                }
                if (af.a(afVar.h, com.taobao.android.weex_framework.util.a.ATOM_EXT_repeat) != null) {
                    return new j.a(afVar.h, afVar.p);
                }
                return new j.a(afVar.h, afVar.h);
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.af.d
        public boolean b(af afVar, ag agVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("42ad8b12", new Object[]{this, afVar, agVar})).booleanValue() : afVar.h == agVar.f20344a;
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.af.d
        public void c(af afVar, ag agVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7264bf0f", new Object[]{this, afVar, agVar});
                return;
            }
            afVar.a(agVar.b);
            afVar.j.b = agVar.d.b;
            if (agVar.g == null) {
                return;
            }
            if (afVar.r == null) {
                afVar.r = new Utils.a();
            }
            ((Utils.a) afVar.r).a(agVar.g);
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.af.d
        public af a(ag agVar) {
            Map jSONObject;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (af) ipChange.ipc$dispatch("f9bcc00f", new Object[]{this, agVar});
            }
            if (agVar.e == af.this.g) {
                jSONObject = af.this.n;
            } else {
                jSONObject = new JSONObject();
                Map map = agVar.f20344a.k;
                if (map != null) {
                    jSONObject.putAll(map);
                }
            }
            af afVar = new af(af.this.f20339a, af.this.f, agVar.e, agVar.f20344a, agVar.b, af.this.c, jSONObject, af.this, agVar.f, agVar.c, agVar.d);
            afVar.r = agVar.g;
            return afVar;
        }
    };
    public List<af> d = new LinkedList();
    public HashMap<String, Object> m = new HashMap<>();

    /* loaded from: classes8.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public af f20343a;
        public List<v> b;

        static {
            kge.a(-1459170525);
        }

        public c(af afVar, List<v> list) {
            this.f20343a = afVar;
            this.b = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes8.dex */
    public interface d {
        af a(ag agVar);

        Object a(af afVar, ag agVar);

        boolean b(af afVar, ag agVar);

        void c(af afVar, ag agVar);
    }

    public static /* synthetic */ Object a(h.b bVar, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("2f4cfb2e", new Object[]{bVar, str}) : b(bVar, str);
    }

    static {
        kge.a(1319114513);
        kge.a(-1679197260);
        kge.a(-1424308304);
        u = new HashMap<>();
        v = new String[]{com.taobao.android.weex_framework.util.a.ATOM_EXT_repeat, "if", "elseif", "key", Constants.Name.SCOPE};
        w = new String[]{com.taobao.android.weex_framework.util.a.ATOM_EXT_repeat, "if", "elseif", Constants.Name.SCOPE};
    }

    /* loaded from: classes8.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public String f20342a;
        public int b;
        public boolean c;

        static {
            kge.a(2070580337);
        }

        public b() {
            this.b = -1;
            this.c = true;
        }

        public b(String str, int i) {
            this.b = -1;
            this.c = true;
            this.f20342a = str;
            this.b = i;
        }
    }

    /* loaded from: classes8.dex */
    public class a implements y, Utils.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public ab f20341a;
        public Object b;
        public h.b c;
        public int d;
        public af e;
        public Map f;
        public Utils.b g;

        static {
            kge.a(1986579661);
            kge.a(-1679197260);
            kge.a(-1424308304);
        }

        public a() {
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.y
        public Object a(String str, String str2, List list) {
            Class c;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("7e58fc65", new Object[]{this, str, str2, list});
            }
            List<String> b = oec.b(str2.substring(2), '.');
            if (b != null && b.size() == 2 && (c = this.f20341a.c(b.get(0))) != null) {
                return com.taobao.tao.flexbox.layoutmanager.filter.a.a(this, str, this.f20341a, b.get(0), c, b.get(1), list);
            }
            return null;
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.y
        public Object a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("17307540", new Object[]{this, str});
            }
            if (str.equals(".")) {
                return this.b;
            }
            if ('.' == str.charAt(0)) {
                af afVar = this.e;
                while (afVar.b != null) {
                    afVar = afVar.b;
                }
                return afVar.a(str.substring(1));
            }
            if ('$' == str.charAt(0)) {
                if (str.equals("$")) {
                    return this.f20341a;
                }
                if (str.startsWith("$.")) {
                    String substring = str.substring(2);
                    if (substring.equals("index")) {
                        return Integer.valueOf(this.d);
                    }
                    if (substring.startsWith("vm.")) {
                        return af.a(af.this, this.f, substring.substring(3));
                    }
                    if (substring.equals(Constants.Weex.INSTANCEID)) {
                        af afVar2 = this.e;
                        while (afVar2.b != null) {
                            afVar2 = afVar2.b;
                        }
                        if (afVar2.g() != null) {
                            return Integer.valueOf(afVar2.g().E());
                        }
                        return Integer.valueOf(this.f20341a.A().E());
                    }
                    return af.a(af.this, this.f20341a.m(), substring);
                }
            }
            Object a2 = af.a(af.this, this.b, str);
            return a2 == null ? af.a((af) null, this.c.i, str) : a2;
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.filter.Utils.b
        public void a(String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8bb6538e", new Object[]{this, str, obj});
                return;
            }
            Utils.b bVar = this.g;
            if (bVar == null) {
                return;
            }
            bVar.a(str, obj);
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.filter.Utils.b
        public Object b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("6e4e661f", new Object[]{this, str});
            }
            Utils.b bVar = this.g;
            if (bVar == null) {
                return null;
            }
            return bVar.b(str);
        }

        public Object a(Utils.b bVar, String str, af afVar, Object obj, h.b bVar2, int i, Object obj2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("7eb3a514", new Object[]{this, bVar, str, afVar, obj, bVar2, new Integer(i), obj2});
            }
            this.e = afVar;
            this.f20341a = afVar.f20339a;
            this.f = afVar.c;
            this.b = obj;
            this.c = bVar2;
            this.d = i;
            this.g = bVar;
            Object a2 = l.a(str, obj2, this);
            this.e = null;
            this.f20341a = null;
            this.b = null;
            this.c = null;
            this.d = 0;
            this.f = null;
            this.g = null;
            return a2;
        }
    }

    public af(ab abVar, Map map, h.b bVar, h.b bVar2, Object obj, Map map2, Map map3, af afVar, String str, Object obj2, b bVar3) {
        this.f20339a = abVar;
        this.f = map;
        this.g = bVar;
        this.h = bVar2;
        this.l = bVar2.f20355a;
        this.p = obj;
        this.b = afVar;
        this.n = map3;
        this.c = map2;
        this.i = str;
        this.k = obj2;
        this.j = bVar3;
        if (afVar == null) {
            this.y = this;
            a(bVar2);
            return;
        }
        this.y = afVar.y;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.i;
    }

    public List c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("31b9b59d", new Object[]{this}) : this.d;
    }

    private void a(String[] strArr, Map map, h.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93f1e5f4", new Object[]{this, strArr, map, bVar});
            return;
        }
        Map map2 = bVar.j;
        if (map2 == null) {
            map2 = new JSONObject();
            bVar.j = map2;
        }
        for (String str : strArr) {
            Object remove = map.remove(str);
            if (remove != null) {
                map2.put(str, remove);
            }
        }
    }

    private Map a(String str, h.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6a1b1e65", new Object[]{this, str, bVar});
        }
        Map map = null;
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1001981477:
                if (str.equals("bindparentattrs")) {
                    c2 = 3;
                    break;
                }
                break;
            case -928162171:
                if (str.equals("bindattrs")) {
                    c2 = 1;
                    break;
                }
                break;
            case 93152418:
                if (str.equals("attrs")) {
                    c2 = 0;
                    break;
                }
                break;
            case 1017067064:
                if (str.equals("parentattrs")) {
                    c2 = 2;
                    break;
                }
                break;
        }
        if (c2 == 0) {
            map = bVar.c;
        } else if (c2 == 1) {
            map = bVar.h;
        } else if (c2 == 2) {
            map = bVar.k;
        } else if (c2 == 3) {
            map = bVar.l;
        }
        if (map != null) {
            a(map);
        }
        return map;
    }

    private void a(String[] strArr, Map map, Map map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee43ad7", new Object[]{this, strArr, map, map2});
            return;
        }
        for (String str : strArr) {
            Object obj = map.get(str);
            if (obj != null) {
                map2.put(str, obj);
                map.remove(str);
            }
        }
    }

    private void a(h.b bVar) {
        String str;
        String a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c331253a", new Object[]{this, bVar});
        } else if (!bVar.o) {
            ogh.a(com.taobao.android.weex_framework.util.a.ATOM_EXT_compile);
            if ("template".equals(bVar.f20355a)) {
                h.b bVar2 = new h.b();
                Map<? extends String, ? extends Object> map = bVar.c;
                String str2 = bVar.f;
                if (map != null) {
                    String str3 = (String) map.get("src");
                    if (this.f.get(str3) instanceof h.b) {
                        h.b.a(bVar2, (h.b) this.f.get(str3));
                    } else {
                        ogg.a("VNode", "templates map is null for src : " + str3);
                    }
                    map.remove("src");
                }
                List list = bVar.d;
                if (list != null && list.size() > 0) {
                    JSONObject jSONObject = null;
                    ArrayList arrayList = null;
                    for (int i = 0; i < list.size(); i++) {
                        h.b bVar3 = (h.b) list.get(i);
                        Map map2 = bVar3.c;
                        if (map2 != null && (a2 = oec.a(map2.get("slot"), (String) null)) != null) {
                            if (jSONObject == null) {
                                jSONObject = new JSONObject();
                            }
                            jSONObject.put((JSONObject) a2, (String) bVar3);
                        } else {
                            if (arrayList == null) {
                                List list2 = bVar2.d;
                                ArrayList arrayList2 = new ArrayList();
                                if (list2 != null) {
                                    arrayList2.addAll(list2);
                                }
                                arrayList = arrayList2;
                            }
                            arrayList.add(bVar3);
                        }
                    }
                    if (jSONObject != null) {
                        bVar2.m = jSONObject;
                    }
                    if (arrayList != null) {
                        bVar2.d = arrayList;
                    }
                }
                JSONObject jSONObject2 = new JSONObject();
                Map map3 = bVar2.h;
                if (map3 != null) {
                    jSONObject2.putAll(map3);
                }
                Map map4 = bVar.h;
                if (map4 != null) {
                    a(v, map4, jSONObject2);
                }
                if (map4 != null) {
                    bVar2.l = map4;
                }
                if (map != null && !map.isEmpty()) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.putAll(map);
                    bVar2.k = jSONObject3;
                }
                bVar2.h = jSONObject2;
                bVar2.b = bVar.b;
                bVar2.n = true;
                h.b.a(bVar, bVar2);
                if (!TextUtils.isEmpty(str2)) {
                    bVar.f = str2;
                }
            }
            Map a3 = a("attrs", bVar);
            if (a3 != null && (str = (String) a3.get("alias")) != null) {
                bVar.f20355a = str;
            }
            a("bindattrs", bVar);
            a("parentattrs", bVar);
            a("bindparentattrs", bVar);
            Map map5 = bVar.h;
            if (map5 != null) {
                a(w, map5, bVar);
            }
            bVar.o = true;
            ogh.b();
        }
    }

    private String a(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("144cdf80", new Object[]{this, obj, obj2});
        }
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            for (Object obj3 : map.keySet()) {
                Object obj4 = map.get(obj3);
                if (obj == obj4) {
                    return (String) obj3;
                }
                if ((obj4 instanceof List) || (obj4 instanceof Map)) {
                    String a2 = a(obj, obj4);
                    if (a2 != null) {
                        if (a2.startsWith(riy.ARRAY_START_STR)) {
                            return obj3 + a2;
                        }
                        return obj3 + "." + a2;
                    }
                }
            }
            return null;
        } else if (!(obj2 instanceof List)) {
            return null;
        } else {
            List list = (List) obj2;
            int a3 = oec.a(list, obj, true);
            if (a3 != -1) {
                return riy.ARRAY_START_STR + a3 + riy.ARRAY_END_STR;
            }
            for (int i = 0; i < list.size(); i++) {
                String a4 = a(obj, list.get(i));
                if (a4 != null) {
                    return riy.ARRAY_START_STR + i + riy.ARRAY_END_STR + "." + a4;
                }
            }
            return null;
        }
    }

    private boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d23b17f9", new Object[]{this, str})).booleanValue();
        }
        if (str == null || !str.startsWith(riy.ARRAY_START_STR) || !str.endsWith(riy.ARRAY_END_STR)) {
            return false;
        }
        for (int i = 1; i < str.length() - 1; i++) {
            char charAt = str.charAt(i);
            if ('0' > charAt || charAt > '9') {
                return false;
            }
        }
        return true;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[]{this});
        }
        LinkedList linkedList = new LinkedList();
        af afVar = this;
        while (afVar.b != null) {
            if (!afVar.j.c) {
                return e();
            }
            if (afVar.j.f20342a != null) {
                String str = afVar.j.f20342a;
                if (afVar.j.b >= 0) {
                    str = str + riy.ARRAY_START_STR + afVar.j.b + riy.ARRAY_END_STR;
                }
                linkedList.add(0, str);
            }
            afVar = afVar.b;
        }
        aa g = this.e.f20292a.g();
        if (oeb.R() && (g == null || g.c != afVar)) {
            return null;
        }
        ohe.a a2 = ohe.a();
        for (int i = 0; i < linkedList.size(); i++) {
            a2.a((String) linkedList.get(i));
            if (i < linkedList.size() - 1) {
                a2.a(".");
            }
        }
        return a2.toString();
    }

    public String e() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this});
        }
        Object obj = this.p;
        ArrayList arrayList = new ArrayList(5);
        Object obj2 = obj;
        af afVar = this;
        while (true) {
            af afVar2 = afVar.b;
            if (afVar2 == null) {
                break;
            }
            Object obj3 = afVar2.p;
            if (obj2 != obj3) {
                String a2 = a(obj2, obj3);
                if (a2 != null) {
                    arrayList.add(0, a2);
                } else if (oeb.R()) {
                    afVar = afVar2;
                    break;
                }
                obj2 = afVar2.p;
            }
            afVar = afVar2;
        }
        aa g = this.e.f20292a.g();
        if (oeb.R() && (g == null || g.c != afVar)) {
            return null;
        }
        int size = arrayList.size();
        while (true) {
            int i2 = size - 1;
            if (size <= 0) {
                break;
            }
            String str = (String) arrayList.get(i2);
            if (d(str) && i2 > 0) {
                arrayList.set(i2 - 1, ((String) arrayList.get(i)) + str);
                arrayList.remove(i2);
            }
            size = i2;
        }
        ohe.a a3 = ohe.a();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            a3.a((String) arrayList.get(i3));
            if (i3 < arrayList.size() - 1) {
                a3.a(".");
            }
        }
        return a3.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(com.taobao.tao.flexbox.layoutmanager.core.af r13, java.lang.Object r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.core.af.a(com.taobao.tao.flexbox.layoutmanager.core.af, java.lang.Object, java.lang.String):java.lang.Object");
    }

    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50938a53", new Object[]{this});
        }
        String str = this.l;
        return str != null ? str : "";
    }

    public aa g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (aa) ipChange.ipc$dispatch("a6f49310", new Object[]{this}) : this.e;
    }

    public ab h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ab) ipChange.ipc$dispatch("989e394e", new Object[]{this}) : this.f20339a;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.y
    public Object a(String str, String str2, List list) {
        Class c2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("7e58fc65", new Object[]{this, str, str2, list});
        }
        List<String> b2 = oec.b(str2.substring(2), '.');
        if (b2 == null || b2.size() != 2 || (c2 = this.f20339a.c(b2.get(0))) == null) {
            return null;
        }
        list.add(this);
        return com.taobao.tao.flexbox.layoutmanager.filter.a.a(this, str, this.f20339a, b2.get(0), c2, b2.get(1), list);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.y
    public Object a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("17307540", new Object[]{this, str});
        }
        if (".".equals(str)) {
            return this.p;
        }
        if ('.' != str.charAt(0)) {
            if ('$' == str.charAt(0)) {
                if ("$".equals(str)) {
                    return this.f20339a;
                }
                if (str.startsWith("$.")) {
                    String substring = str.substring(2);
                    if ("index".equals(substring)) {
                        af afVar = this;
                        while (true) {
                            af afVar2 = afVar.b;
                            if (afVar2 == null || afVar2.b == null || (afVar.h.j != null && afVar.h.j.containsKey(com.taobao.android.weex_framework.util.a.ATOM_EXT_repeat))) {
                                break;
                            }
                            afVar = afVar.b;
                        }
                        int i = 0;
                        for (af afVar3 : afVar.b.d) {
                            if (afVar3.h == afVar.h) {
                                if (afVar3 == afVar) {
                                    return Integer.valueOf(i);
                                }
                                i++;
                            }
                        }
                        return 0;
                    } else if (substring.equals("props")) {
                        return this.n;
                    } else {
                        if (substring.startsWith("props.")) {
                            return a(this, this.n, substring.substring(6));
                        }
                        if (substring.startsWith("attrs.")) {
                            return a(this, i(), substring.substring(6));
                        }
                        if (substring.startsWith("vm.")) {
                            return a(this, this.c, substring.substring(3));
                        }
                        if (substring.equals(Constants.Weex.INSTANCEID)) {
                            af afVar4 = this;
                            while (true) {
                                af afVar5 = afVar4.b;
                                if (afVar5 == null) {
                                    break;
                                }
                                afVar4 = afVar5;
                            }
                            if (afVar4.g() != null) {
                                return Integer.valueOf(afVar4.g().E());
                            }
                            return Integer.valueOf(this.f20339a.A().E());
                        }
                        return a(this, this.f20339a.m(), substring);
                    }
                }
            }
            Object a2 = a(this, this.p, str);
            if (a2 == null) {
                a2 = a(this, this.n, str);
            }
            return a2 == null ? a((af) null, this.g.i, str) : a2;
        }
        af afVar6 = this;
        while (true) {
            af afVar7 = afVar6.b;
            if (afVar7 == null) {
                return afVar6.a(str.substring(1));
            }
            afVar6 = afVar7;
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.filter.Utils.b
    public void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb6538e", new Object[]{this, str, obj});
            return;
        }
        if (this.r == null) {
            this.r = new Utils.a();
        }
        this.r.a(str, obj);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.filter.Utils.b
    public Object b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("6e4e661f", new Object[]{this, str});
        }
        Utils.b bVar = this.r;
        if (bVar == null) {
            return null;
        }
        return bVar.b(str);
    }

    private HashMap i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("100921d3", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        Map map = this.h.c;
        if (map != null) {
            hashMap.putAll(map);
        }
        HashMap<String, Object> hashMap2 = this.m;
        if (hashMap2 != null) {
            hashMap.putAll(hashMap2);
        }
        return hashMap;
    }

    public void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
        } else if (obj == this.p) {
        } else {
            if (com.taobao.android.weex_framework.util.a.ATOM_EXT_freeze.equals(b(this.h, Constants.Name.SCOPE))) {
                if (this.p != null) {
                    return;
                }
                this.p = new JSONObject();
            } else if (obj != null) {
                this.p = obj;
            } else {
                this.p = new JSONObject();
            }
        }
    }

    private boolean e(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1c6cb13a", new Object[]{this, str})).booleanValue() : "onpageselected".equals(str) || "ontabselected".equals(str) || "onloading".equals(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d1, code lost:
        r7.s = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List<com.taobao.tao.flexbox.layoutmanager.core.af.c> c(java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.core.af.c(java.lang.String):java.util.List");
    }

    private void a(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        ArrayList arrayList = null;
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str.startsWith("ios-")) {
                it.remove();
            } else if (str.startsWith("android-")) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(str);
            }
        }
        if (arrayList == null) {
            return;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            String str2 = (String) it2.next();
            Object obj = map.get(str2);
            map.remove(str2);
            map.put(str2.substring(8), obj);
        }
        arrayList.clear();
    }

    private void b(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3e87c", new Object[]{this, map});
        } else if (map != null && !map.containsKey("compiled")) {
            for (Object obj : map.values()) {
                if (obj instanceof Map) {
                    a((Map) obj);
                }
            }
            map.put("compiled", true);
        }
    }

    private Map b(String str, List<Map> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4915bf99", new Object[]{this, str, list});
        }
        if (list == null) {
            return null;
        }
        Map map = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            Map map2 = list.get(size);
            if (map2 != null && (map = oec.a(map2.get(str), (Map) null)) != null) {
                return map;
            }
        }
        return map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void a(String str, List<v> list) {
        String str2;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1aa3523", new Object[]{this, str, list});
            return;
        }
        if (this.o == null) {
            this.o = new HashMap<>();
        } else {
            z = false;
        }
        HashMap hashMap = null;
        List<String> b2 = str != null ? oec.b(str, ' ') : null;
        Map a2 = oec.a(this.f.get("."), (Map) null);
        af afVar = this.y;
        if (afVar == null || afVar.h.c == null) {
            str2 = null;
        } else {
            str2 = oec.a(this.y.h.c.get("skin-name"), (String) null);
            if (str2 == null && this.y.h.h != null) {
                str2 = oec.a(l.a("skin-name", this.y.h.h.get("skin-name"), this.y), (String) null);
            }
        }
        ArrayList<Map> arrayList = new ArrayList();
        Map map = a2 != null ? (Map) a2.get("theme") : null;
        if (map != null) {
            if (!TextUtils.isEmpty(str2)) {
                List<String> b3 = oec.b(str2, ' ');
                if (b3 != null) {
                    for (String str3 : b3) {
                        Map a3 = oec.a(map.get(str3), (Map) null);
                        if (a3 != null) {
                            arrayList.add(a3);
                        }
                    }
                }
            } else {
                arrayList.add(map);
            }
        }
        for (Map map2 : arrayList) {
            b(map2);
        }
        Map map3 = this.g.e;
        if (map3 != null) {
            b(map3);
            arrayList.add(map3);
        }
        if (b2 != null) {
            hashMap = new HashMap();
            Iterator<String> it = b2.iterator();
            while (it.hasNext()) {
                Map b4 = b("." + it.next(), arrayList);
                if (b4 != null) {
                    hashMap.putAll(b4);
                }
            }
        }
        if (hashMap == null) {
            return;
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            Object value = entry.getValue();
            if (z) {
                this.o.put(entry.getKey(), value);
                list.add(new v(5, entry.getKey(), value));
            } else if (!Utils.isEqual(this.o.get(entry.getKey()), value)) {
                this.o.put(entry.getKey(), value);
                list.add(new v(5, entry.getKey(), value));
            }
        }
    }

    private static Object b(h.b bVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("9dd40c6f", new Object[]{bVar, str});
        }
        Map map = bVar.j;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    private Object a(h.b bVar, Object obj, h.b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("909ceb66", new Object[]{this, bVar, obj, bVar2});
        }
        Object b2 = b(bVar, Constants.Name.SCOPE);
        if (b2 != null) {
            if (b2 instanceof List) {
                return this.q.a(null, null, this, obj, bVar2, 0, b2);
            }
            if ("copy".equals(b2)) {
                return oec.d(obj);
            }
            if (com.taobao.android.weex_framework.util.a.ATOM_EXT_freeze.equals(b2)) {
                return null;
            }
            if (obj instanceof Map) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putAll((Map) obj);
                return jSONObject;
            }
        }
        return obj;
    }

    private boolean f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("669e4a7b", new Object[]{this, str})).booleanValue();
        }
        aa aaVar = null;
        aa aaVar2 = this.e;
        if (aaVar2 != null) {
            aaVar = aaVar2;
        }
        return (aaVar == null || aaVar.I() == null || !aaVar.I().interceptVNodeDiff(str)) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0276 A[EDGE_INSN: B:129:0x0276->B:101:0x0276 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01e3  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.util.List<com.taobao.tao.flexbox.layoutmanager.core.v> j() {
        /*
            Method dump skipped, instructions count: 725
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.core.af.j():java.util.List");
    }

    private b a(Object obj, Object obj2, Object obj3, int i, Object obj4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("579a99d8", new Object[]{this, obj, obj2, obj3, new Integer(i), obj4});
        }
        b bVar = new b();
        if (obj3 == obj2) {
            bVar.f20342a = null;
            bVar.b = i;
        } else {
            if (obj instanceof List) {
                List list = (List) obj;
                if (list.size() == 1 && (list.get(0) instanceof String)) {
                    String str = (String) list.get(0);
                    if (str.startsWith("{{") && str.endsWith("}}")) {
                        String substring = str.substring(2, str.length() - 2);
                        if (substring.startsWith("$.") || substring.startsWith(".") || substring.startsWith("*.")) {
                            bVar.f20342a = null;
                        } else {
                            bVar.f20342a = substring;
                        }
                        bVar.b = i;
                        if (bVar.f20342a == null) {
                            bVar.c = false;
                        }
                    }
                }
            }
            if (i == -1) {
                bVar.f20342a = a(obj2, obj3);
                bVar.b = i;
            } else if (i >= 0) {
                bVar.f20342a = a(obj4, obj3);
                bVar.b = i;
                if (bVar.f20342a != null && bVar.f20342a.endsWith(riy.ARRAY_END_STR)) {
                    int lastIndexOf = bVar.f20342a.lastIndexOf(riy.ARRAY_START_STR);
                    bVar.b = Integer.parseInt(bVar.f20342a.substring(lastIndexOf + 1, bVar.f20342a.length() - 1));
                    bVar.f20342a = bVar.f20342a.substring(0, lastIndexOf);
                }
            }
            if (bVar.f20342a == null) {
                bVar.c = false;
            }
        }
        return bVar;
    }
}
