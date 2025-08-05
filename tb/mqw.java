package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.data.meta.Rate;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class mqw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT = "default";
    public static final String POP = "pop";
    public static final String POP_MULTI_TAB = "pop_multi_tab";

    /* renamed from: a  reason: collision with root package name */
    private Rate.Keywords f31211a;
    private List<Rate.Keywords> b;
    private String c;
    private long d;
    private JSONObject f;
    private JSONObject g;
    private String h;
    private long j;
    private JSONObject k;
    private int e = -1;
    private boolean i = false;
    private String l = "default";
    private int m = 1;
    private List<Rate.Keywords> n = new ArrayList();
    private boolean o = true;

    static {
        kge.a(1216923461);
    }

    public static mqw a(Rate.Keywords keywords, List<Rate.Keywords> list) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (mqw) ipChange.ipc$dispatch("ed983501", new Object[]{keywords, list}) : new mqw(keywords, list);
    }

    public static mqw a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (mqw) ipChange.ipc$dispatch("2904150b", new Object[]{jSONObject}) : new mqw(jSONObject);
    }

    private mqw(Rate.Keywords keywords, List<Rate.Keywords> list) {
        this.f31211a = keywords;
        this.b = list;
    }

    private mqw(JSONObject jSONObject) {
        a(this, jSONObject);
    }

    public static void a(mqw mqwVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9bf40eb", new Object[]{mqwVar, jSONObject});
            return;
        }
        mqwVar.f = jSONObject;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String string = jSONObject.getString("feedId");
        if (!TextUtils.isEmpty(string)) {
            try {
                mqwVar.d = Long.parseLong(string);
            } catch (Exception unused) {
            }
        }
        mqwVar.c = jSONObject.getString("skuVids");
        String string2 = jSONObject.getString("invokeSource");
        if (!TextUtils.isEmpty(string2)) {
            try {
                mqwVar.e = Integer.parseInt(string2);
            } catch (Exception unused2) {
            }
        }
        mqwVar.g = jSONObject.getJSONObject("exParams");
        jSONObject.put("exParams", (Object) mqwVar.g);
    }

    public Rate.Keywords a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Rate.Keywords) ipChange.ipc$dispatch("bd0daa67", new Object[]{this}) : this.f31211a;
    }

    public List<Rate.Keywords> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("4a17df3e", new Object[]{this}) : this.b;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.c;
    }

    public long d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2df", new Object[]{this})).longValue() : this.d;
    }

    public int e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue() : this.e;
    }

    public JSONObject f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("d2e6990d", new Object[]{this}) : this.f;
    }

    public JSONObject g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("e68e6c8e", new Object[]{this}) : this.g;
    }

    public String h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this}) : this.h;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.h = str;
        }
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue() : this.i;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.i = z;
        }
    }

    public long j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5eb3fe5", new Object[]{this})).longValue() : this.j;
    }

    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
        } else {
            this.j = j;
        }
    }

    public JSONObject k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("352dba92", new Object[]{this}) : this.k;
    }

    public void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
        } else {
            this.k = jSONObject;
        }
    }

    public String l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("77b5ea0d", new Object[]{this}) : this.l;
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.l = str;
        }
    }

    public int m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6158667", new Object[]{this})).intValue() : this.m;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.m = i;
        }
    }

    public List<Rate.Keywords> n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("25adebb2", new Object[]{this});
        }
        JSONObject jSONObject = this.k;
        if (jSONObject == null) {
            return this.n;
        }
        JSONArray jSONArray = jSONObject.getJSONArray("keywords");
        if (jSONArray == null || jSONArray.isEmpty()) {
            return this.n;
        }
        int size = jSONArray.size();
        for (int i = 0; i < size; i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            if (jSONObject2 != null) {
                this.n.add(Rate.Keywords.a(jSONObject2));
            }
        }
        return this.n;
    }

    public boolean o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[]{this})).booleanValue() : this.o;
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.o = z;
        }
    }
}
