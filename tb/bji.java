package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class bji implements Cloneable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f25940a;
    public String b;
    public String c;
    public JSONObject d;
    public JSONObject e;
    public JSONObject f;
    public String g;
    public boolean h;
    public String i;
    public String j;
    public boolean k = false;
    public String l;
    public String m;
    public String n;

    static {
        kge.a(693039531);
        kge.a(-723128125);
    }

    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("78b3604e", new Object[]{this}) : a();
    }

    public bji a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bji) ipChange.ipc$dispatch("f02cc1d", new Object[]{this});
        }
        bji bjiVar = new bji();
        bjiVar.f25940a = this.f25940a;
        bjiVar.b = this.b;
        bjiVar.c = this.c;
        JSONObject jSONObject = this.d;
        JSONObject jSONObject2 = null;
        bjiVar.d = jSONObject != null ? JSON.parseObject(jSONObject.toJSONString()) : null;
        JSONObject jSONObject3 = this.e;
        bjiVar.e = jSONObject3 != null ? JSON.parseObject(jSONObject3.toJSONString()) : null;
        JSONObject jSONObject4 = this.f;
        if (jSONObject4 != null) {
            jSONObject2 = JSON.parseObject(jSONObject4.toJSONString());
        }
        bjiVar.f = jSONObject2;
        bjiVar.g = this.g;
        bjiVar.h = this.h;
        bjiVar.i = this.i;
        bjiVar.k = this.k;
        bjiVar.l = this.l;
        bjiVar.n = this.n;
        bjiVar.j = this.j;
        return bjiVar;
    }
}
