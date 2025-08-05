package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.data.model.MainMediaInfo;
import com.taobao.tao.navigation.a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public class onl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public List<ova> f32210a = new ArrayList();
    private ove b = new ove();
    public okb c;
    public boolean d;

    static {
        kge.a(1850183341);
    }

    public onl(JSONObject jSONObject, JSONObject jSONObject2) {
        b();
        a(jSONObject);
        this.c = new okb(a.b());
        this.c.a(jSONObject2);
    }

    public void a(JSONObject jSONObject) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        this.f32210a.clear();
        if (jSONObject == null || (jSONArray = jSONObject.getJSONArray("data")) == null) {
            return;
        }
        for (int i = 0; i < jSONArray.size(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            if (jSONObject2 != null) {
                ova a2 = this.b.a(jSONObject2.getString("type"), jSONObject2);
                a2.d = i;
                if (a2 instanceof okd) {
                    this.d = true;
                }
                this.f32210a.add(a2);
            }
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.b.a(rbv.f, ovb.c());
        this.b.a(qnk.f, okd.b());
    }

    public MainMediaInfo a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MainMediaInfo) ipChange.ipc$dispatch("ce19f02f", new Object[]{this});
        }
        for (ova ovaVar : this.f32210a) {
            if (ovaVar != null && rbv.f.equals(ovaVar.a()) && (ovaVar instanceof ovb)) {
                return ((ovb) ovaVar).b();
            }
        }
        return null;
    }
}
