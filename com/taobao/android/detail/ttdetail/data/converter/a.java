package com.taobao.android.detail.ttdetail.data.converter;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.data.converter.a;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static String f10604a;
    private static String b;
    private static String c;
    private static String d;
    private static String e;
    private static String f;
    private static String g;

    /* renamed from: com.taobao.android.detail.ttdetail.data.converter.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0414a {
        void a(String str, JSONObject jSONObject, JSONObject jSONObject2, List<String> list, int i, int i2, int i3);
    }

    static {
        kge.a(913422386);
        f10604a = "frameVideo";
        b = "frameImage";
        c = "frameFloat";
        d = "id";
        e = "type";
        f = "fields";
        g = "events";
    }

    public static boolean a(JSONObject jSONObject, JSONObject jSONObject2, JSONArray jSONArray, JSONObject jSONObject3, JSONObject jSONObject4) {
        JSONArray jSONArray2;
        JSONArray jSONArray3;
        String str;
        int i;
        String str2;
        JSONArray jSONArray4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3bb8394", new Object[]{jSONObject, jSONObject2, jSONArray, jSONObject3, jSONObject4})).booleanValue();
        }
        JSONArray jSONArray5 = jSONObject.getJSONArray("detailHeaderPic");
        if (jSONArray5 == null || jSONArray5.isEmpty()) {
            return false;
        }
        String str3 = "headerPic";
        if (!str3.equals(jSONArray5.getString(0)) || (jSONArray2 = jSONObject.getJSONArray("mainFrame")) == null || jSONArray2.isEmpty()) {
            return false;
        }
        JSONObject jSONObject5 = new JSONObject();
        JSONObject jSONObject6 = new JSONObject();
        JSONObject jSONObject7 = jSONObject2.getJSONObject("mainContainer");
        String str4 = g;
        jSONObject6.put(str4, (Object) jSONObject7.getJSONObject(str4));
        String str5 = f;
        jSONObject6.put(str5, (Object) jSONObject7.getJSONObject(str5).getJSONObject("pullStyle"));
        jSONObject5.put("dragEnd", (Object) jSONObject6);
        JSONArray jSONArray6 = jSONObject.getJSONArray("locatorBar");
        if (jSONArray6 != null && !jSONArray6.isEmpty()) {
            JSONArray jSONArray7 = new JSONArray();
            int size = jSONArray6.size();
            for (int i2 = 0; i2 < size; i2++) {
                JSONObject jSONObject8 = jSONObject2.getJSONObject(jSONArray6.getString(i2));
                if (jSONObject8 != null) {
                    JSONObject jSONObject9 = jSONObject8.getJSONObject("fields");
                    final String string = jSONObject9.getString("locator");
                    final String string2 = jSONObject9.getString("text");
                    jSONArray7.add(new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3HeaderPicConverter$1
                        {
                            put("id", (Object) string);
                            put("name", (Object) string2);
                        }
                    });
                }
            }
            jSONObject5.put("locators", (Object) jSONArray7);
        }
        JSONObject a2 = a(jSONArray);
        ArrayList<e> arrayList = new ArrayList();
        int size2 = jSONArray2.size();
        int i3 = 0;
        while (i3 < size2) {
            String string3 = jSONArray2.getString(i3);
            e eVar = new e();
            eVar.a(string3);
            eVar.a(a(jSONObject2, string3));
            ArrayList arrayList2 = new ArrayList();
            eVar.a(arrayList2);
            JSONArray jSONArray8 = jSONObject.getJSONArray(string3);
            if (jSONArray8 == null || jSONArray8.isEmpty()) {
                jSONArray3 = jSONArray2;
                str = str3;
                i = size2;
            } else {
                int size3 = jSONArray8.size();
                int i4 = 0;
                while (i4 < size3) {
                    JSONArray jSONArray9 = jSONArray2;
                    String string4 = jSONArray8.getString(i4);
                    int i5 = size3;
                    int i6 = size2;
                    c cVar = new c();
                    cVar.a(string4);
                    cVar.a(a(jSONObject2, string4));
                    ArrayList arrayList3 = new ArrayList();
                    cVar.a(arrayList3);
                    JSONArray jSONArray10 = jSONObject.getJSONArray(string4);
                    if (jSONArray10 == null || jSONArray10.isEmpty()) {
                        str2 = str3;
                        jSONArray4 = jSONArray8;
                    } else {
                        jSONArray4 = jSONArray8;
                        int size4 = jSONArray10.size();
                        int i7 = 0;
                        while (i7 < size4) {
                            int i8 = size4;
                            String string5 = jSONArray10.getString(i7);
                            JSONArray jSONArray11 = jSONArray10;
                            String str6 = str3;
                            d dVar = new d();
                            if (string5.startsWith("frameFloat_")) {
                                JSONArray jSONArray12 = jSONObject.getJSONArray(string5);
                                if (jSONArray12 != null && !jSONArray12.isEmpty()) {
                                    string5 = jSONArray12.getString(0);
                                }
                                i7++;
                                size4 = i8;
                                jSONArray10 = jSONArray11;
                                str3 = str6;
                            }
                            dVar.a(string5);
                            f a3 = a(jSONObject2, string5);
                            dVar.a(a3);
                            dVar.a(b(a2, a3.c()));
                            arrayList3.add(dVar);
                            i7++;
                            size4 = i8;
                            jSONArray10 = jSONArray11;
                            str3 = str6;
                        }
                        str2 = str3;
                        arrayList2.add(cVar);
                    }
                    i4++;
                    jSONArray2 = jSONArray9;
                    size3 = i5;
                    size2 = i6;
                    jSONArray8 = jSONArray4;
                    str3 = str2;
                }
                jSONArray3 = jSONArray2;
                str = str3;
                i = size2;
                arrayList.add(eVar);
            }
            i3++;
            jSONArray2 = jSONArray3;
            size2 = i;
            str3 = str;
        }
        String str7 = str3;
        JSONArray jSONArray13 = new JSONArray();
        if (arrayList.isEmpty()) {
            return false;
        }
        for (e eVar2 : arrayList) {
            JSONObject jSONObject10 = new JSONObject();
            jSONObject10.put("id", eVar2.a());
            jSONObject10.put("locatorId", eVar2.b().a());
            List<c> c2 = eVar2.c();
            if (!c2.isEmpty()) {
                JSONArray jSONArray14 = new JSONArray();
                for (c cVar2 : c2) {
                    JSONObject jSONObject11 = new JSONObject();
                    JSONObject d2 = cVar2.b().d();
                    jSONObject11.put("id", (Object) cVar2.a());
                    jSONObject11.put("dimension", (Object) d2.getString("dimension"));
                    jSONObject11.put("tagName", (Object) d2.getString("tag"));
                    jSONObject11.put("enableLightOff", (Object) d2.getString("showLightOff"));
                    List<d> c3 = cVar2.c();
                    if (!c3.isEmpty()) {
                        for (d dVar2 : c3) {
                            String b2 = dVar2.b().b();
                            b c4 = dVar2.c();
                            if (c4 != null) {
                                jSONObject3.put(dVar2.b().c(), (Object) a(c4));
                            }
                            if (f10604a.equals(b2) || b.equals(b2)) {
                                JSONObject jSONObject12 = new JSONObject();
                                jSONObject12.put(d, (Object) dVar2.a());
                                jSONObject12.put(e, (Object) dVar2.b().c());
                                jSONObject12.put(g, (Object) dVar2.b().e());
                                jSONObject12.put(f, (Object) dVar2.b().d());
                                jSONObject11.put("content", (Object) jSONObject12);
                            } else {
                                JSONObject jSONObject13 = new JSONObject();
                                jSONObject13.put(d, (Object) dVar2.a());
                                jSONObject13.put(e, (Object) dVar2.b().c());
                                jSONObject13.put(g, (Object) dVar2.b().e());
                                jSONObject13.put(f, (Object) dVar2.b().d());
                                jSONObject11.put("floatContent", (Object) jSONObject13);
                            }
                        }
                        jSONArray14.add(jSONObject11);
                    }
                }
                jSONObject10.put("items", (Object) jSONArray14);
                jSONArray13.add(jSONObject10);
            }
        }
        if (jSONArray13.isEmpty()) {
            return false;
        }
        jSONObject5.put("groups", (Object) jSONArray13);
        jSONObject4.put(str7, (Object) jSONObject5);
        return true;
    }

    private static JSONObject a(final b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("a70e6c5b", new Object[]{bVar}) : new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3HeaderPicConverter$2
            {
                put("name", (Object) a.b.this.a());
                put("type", (Object) a.b.this.b());
                put("version", (Object) a.b.this.c());
                put("url", (Object) a.b.this.d());
            }
        };
    }

    private static f a(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("f52df621", new Object[]{jSONObject, str});
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject(str);
        String string = jSONObject2.getString("id");
        String string2 = jSONObject2.getString("tag");
        String string3 = jSONObject2.getString("type");
        JSONObject jSONObject3 = jSONObject2.getJSONObject("fields");
        JSONObject jSONObject4 = jSONObject2.getJSONObject("events");
        f fVar = new f();
        fVar.a(string);
        fVar.b(string2);
        fVar.c(string3);
        fVar.a(jSONObject3);
        fVar.b(jSONObject4);
        return fVar;
    }

    private static JSONObject a(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("836310b0", new Object[]{jSONArray});
        }
        JSONObject jSONObject = new JSONObject();
        int size = jSONArray.size();
        for (int i = 0; i < size; i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            if (jSONObject2 != null) {
                JSONArray jSONArray2 = jSONObject2.getJSONArray("type");
                int size2 = jSONArray2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    jSONObject.put(jSONArray2.getString(i2), (Object) jSONObject2);
                }
            }
        }
        return jSONObject;
    }

    private static b b(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("35a90b44", new Object[]{jSONObject, str});
        }
        if (str.startsWith("native$")) {
            String[] split = str.split("\\$");
            if (split.length == 2) {
                b bVar = new b();
                bVar.a(split[1]);
                bVar.b(split[0]);
                bVar.c("0");
                bVar.d("");
                return bVar;
            }
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject(str);
        if (jSONObject2 == null || jSONObject2.isEmpty()) {
            return null;
        }
        b bVar2 = new b();
        bVar2.a(jSONObject2.getString("name"));
        bVar2.b(jSONObject2.getString("containerType"));
        bVar2.c(jSONObject2.getString("version"));
        bVar2.d(jSONObject2.getString("url"));
        return bVar2;
    }

    /* loaded from: classes4.dex */
    public static class e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f10608a;
        private f b;
        private List<c> c;

        static {
            kge.a(1494966909);
        }

        private e() {
        }

        public String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f10608a;
        }

        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            } else {
                this.f10608a = str;
            }
        }

        public f b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("6f1b6f78", new Object[]{this}) : this.b;
        }

        public void a(f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bf0d3eb7", new Object[]{this, fVar});
            } else {
                this.b = fVar;
            }
        }

        public List<c> c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("31b9b59d", new Object[]{this}) : this.c;
        }

        public void a(List<c> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            } else {
                this.c = list;
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f10606a;
        private f b;
        private List<d> c;

        static {
            kge.a(-742061790);
        }

        private c() {
        }

        public String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f10606a;
        }

        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            } else {
                this.f10606a = str;
            }
        }

        public f b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("6f1b6f78", new Object[]{this}) : this.b;
        }

        public void a(f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bf0d3eb7", new Object[]{this, fVar});
            } else {
                this.b = fVar;
            }
        }

        public List<d> c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("31b9b59d", new Object[]{this}) : this.c;
        }

        public void a(List<d> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            } else {
                this.c = list;
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f10605a;
        private String b;
        private String c;
        private String d;

        static {
            kge.a(912833845);
        }

        private b() {
        }

        public String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f10605a;
        }

        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            } else {
                this.f10605a = str;
            }
        }

        public String b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
        }

        public void b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            } else {
                this.b = str;
            }
        }

        public String c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.c;
        }

        public void c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            } else {
                this.c = str;
            }
        }

        public String d() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : this.d;
        }

        public void d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
            } else {
                this.d = str;
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f10607a;
        private f b;
        private b c;

        static {
            kge.a(-998429677);
        }

        private d() {
        }

        public String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f10607a;
        }

        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            } else {
                this.f10607a = str;
            }
        }

        public f b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("6f1b6f78", new Object[]{this}) : this.b;
        }

        public void a(f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bf0d3eb7", new Object[]{this, fVar});
            } else {
                this.b = fVar;
            }
        }

        public b c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("7fd13bbd", new Object[]{this}) : this.c;
        }

        public void a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bf0b6d3b", new Object[]{this, bVar});
            } else {
                this.c = bVar;
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f10609a;
        private String b;
        private String c;
        private JSONObject d;
        private JSONObject e;

        static {
            kge.a(1815956577);
        }

        private f() {
        }

        public String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f10609a;
        }

        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            } else {
                this.f10609a = str;
            }
        }

        public String b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
        }

        public void b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            } else {
                this.b = str;
            }
        }

        public String c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.c;
        }

        public void c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            } else {
                this.c = str;
            }
        }

        public JSONObject d() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("ab96f20b", new Object[]{this}) : this.d;
        }

        public void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            } else {
                this.d = jSONObject;
            }
        }

        public JSONObject e() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("bf3ec58c", new Object[]{this}) : this.e;
        }

        public void b(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
            } else {
                this.e = jSONObject;
            }
        }
    }
}
