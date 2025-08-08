package tb;

import android.content.Context;
import android.content.Intent;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class jnb implements jnd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public jnc f29642a;
    public jnf b;

    static {
        kge.a(1669693806);
        kge.a(380677914);
    }

    @Override // tb.jnd
    public void S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a7235a", new Object[]{this});
        }
    }

    @Override // tb.jnd
    public void a(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79f30285", new Object[]{this, new Integer(i), new Integer(i2), intent});
        }
    }

    @Override // tb.jnd
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        }
    }

    public JSONObject d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ab96f20b", new Object[]{this});
        }
        return null;
    }

    @Override // tb.jnd
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        }
    }

    @Override // tb.jnd
    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.jnd
    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.jnd
    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.jnd
    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public int k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5f95765", new Object[]{this})).intValue();
        }
        return 19999;
    }

    @Override // tb.jnd
    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686427c", new Object[]{this});
        }
    }

    public jnb(jnc jncVar) {
        this.f29642a = jncVar;
    }

    public Context a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("75941360", new Object[]{this}) : this.f29642a.getContext();
    }

    public jnc b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jnc) ipChange.ipc$dispatch("16b822be", new Object[]{this}) : this.f29642a;
    }

    public jnf c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jnf) ipChange.ipc$dispatch("1e69c87a", new Object[]{this}) : this.b;
    }

    @Override // tb.jnd
    public void a(jnf jnfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efb417f6", new Object[]{this, jnfVar});
            return;
        }
        this.b = jnfVar;
        j();
    }

    public void j() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        JSONObject m = m();
        if (m == null || (jSONObject = m.getJSONObject("exposure")) == null) {
            return;
        }
        String string = jSONObject.getString("name");
        if (StringUtils.isEmpty(string)) {
            return;
        }
        String string2 = jSONObject.getString("page");
        if (StringUtils.isEmpty(string2)) {
            string2 = jmq.d().a();
        }
        String str = string2;
        JSONObject jSONObject2 = jSONObject.getJSONObject("args");
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        String trackId = this.f29642a.getTrackId();
        if (!StringUtils.isEmpty(trackId)) {
            jSONObject2.put("trackId", (Object) trackId);
        }
        List<String> b = b(jSONObject2);
        jmw d = jmq.d();
        int k = k();
        d.a(str, k, str + "_" + string, null, null, (String[]) b.toArray(new String[b.size()]));
    }

    public void b(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("676c0fdd", new Object[]{this, str, jSONObject});
            return;
        }
        JSONObject m = m();
        if (m == null || (jSONObject2 = m.getJSONObject("exposure")) == null) {
            return;
        }
        if (StringUtils.isEmpty(str)) {
            str = jSONObject2.getString("name");
            if (StringUtils.isEmpty(str)) {
                return;
            }
        }
        String string = jSONObject2.getString("page");
        if (StringUtils.isEmpty(string)) {
            string = jmq.d().a();
        }
        String str2 = string;
        JSONObject jSONObject3 = jSONObject2.getJSONObject("args");
        if (jSONObject3 == null) {
            jSONObject3 = new JSONObject();
        }
        jSONObject3.putAll(jSONObject);
        String trackId = this.f29642a.getTrackId();
        if (!StringUtils.isEmpty(trackId)) {
            jSONObject3.put("trackId", (Object) trackId);
        }
        List<String> b = b(jSONObject3);
        jmw d = jmq.d();
        int k = k();
        d.a(str2, k, str2 + "_" + str, null, null, (String[]) b.toArray(new String[b.size()]));
    }

    private List<String> b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("cca20740", new Object[]{this, jSONObject});
        }
        ArrayList arrayList = new ArrayList();
        if (jSONObject != null && !jSONObject.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for (String str : jSONObject.keySet()) {
                sb.delete(0, sb.length());
                sb.append(str);
                sb.append(" = ");
                Object obj = jSONObject.get(str);
                if (obj instanceof String) {
                    sb.append(obj);
                } else {
                    sb.append(JSON.toJSONString(obj));
                }
                arrayList.add(sb.toString());
            }
        }
        return arrayList;
    }

    public JSONObject m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("5c7d6194", new Object[]{this});
        }
        jnf jnfVar = this.b;
        JSONObject jSONObject = null;
        if (jnfVar == null) {
            return null;
        }
        JSONObject e = jnfVar.e();
        try {
            jSONObject = e.getJSONObject("trackInfo");
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if (jSONObject != null) {
            return jSONObject;
        }
        try {
            JSONObject jSONObject2 = e.getJSONObject("style");
            return jSONObject2 != null ? jSONObject2.getJSONObject("trackInfo") : jSONObject;
        } catch (Exception e3) {
            e3.printStackTrace();
            return jSONObject;
        }
    }
}
