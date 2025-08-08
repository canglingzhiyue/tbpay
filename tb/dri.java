package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.config.BHRTaskConfigBase;
import com.taobao.android.behavix.behavixswitch.d;
import com.taobao.android.behavix.behavixswitch.f;
import com.taobao.android.ucp.bridge.NativeDelegate;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class dri {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f26921a;
    private List<f> b;
    private List<f> c;
    private List<f> d;
    private List<f> e;
    private List<f> f;
    private List<f> g;
    private List<f> h;
    private List<f> i;
    private Map<String, List<f>> j;
    private Map<String, List<f>> k;

    static {
        kge.a(-975871551);
    }

    public dri(JSONObject jSONObject) {
        this.f26921a = jSONObject.getString("type");
        if (StringUtils.equals(this.f26921a, BHRTaskConfigBase.TYPE_CONFIG_UT)) {
            this.b = d.a(jSONObject.getJSONArray("pgIn"));
            this.c = d.a(jSONObject.getJSONArray("pgNIn"));
            this.d = d.a(a(jSONObject.getJSONArray("eIdIn")));
            this.e = d.a(a(jSONObject.getJSONArray("eIdNIn")));
            this.f = d.a(jSONObject.getJSONArray("arg1In"));
            this.g = d.a(jSONObject.getJSONArray("arg1NIn"));
            this.h = d.a(jSONObject.getJSONArray("arg2In"));
            this.i = d.a(jSONObject.getJSONArray("arg2NIn"));
            this.j = d.a(jSONObject.getJSONObject("argsIn"));
            this.k = d.a(jSONObject.getJSONObject("argsNIn"));
        } else if (!StringUtils.equals(this.f26921a, NativeDelegate.SETTING_BIZ)) {
        } else {
            this.b = d.a(jSONObject.getJSONArray("sceneIn"));
            this.c = d.a(jSONObject.getJSONArray("sceneNIn"));
            this.d = d.a(jSONObject.getJSONArray("actionTypeIn"));
            this.e = d.a(jSONObject.getJSONArray("actionTypeNIn"));
            this.f = d.a(jSONObject.getJSONArray("actionNameIn"));
            this.g = d.a(jSONObject.getJSONArray("actionNameNIn"));
            this.h = d.a(jSONObject.getJSONArray("bizIdIn"));
            this.h = d.a(jSONObject.getJSONArray("bizIdNIn"));
            this.j = d.a(jSONObject.getJSONObject("bizArgsIn"));
            this.k = d.a(jSONObject.getJSONObject("bizArgsNIn"));
        }
    }

    private JSONArray a(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("b36fc2ae", new Object[]{this, jSONArray});
        }
        if (jSONArray == null || jSONArray.size() <= 0) {
            return jSONArray;
        }
        JSONArray jSONArray2 = new JSONArray();
        for (int i = 0; i < jSONArray.size(); i++) {
            String string = jSONArray.getString(i);
            if (!StringUtils.isEmpty(string)) {
                jSONArray2.add(dro.a(string));
            }
        }
        return jSONArray2;
    }

    public List<f> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("627608df", new Object[]{this}) : this.b;
    }

    public List<f> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("4a17df3e", new Object[]{this}) : this.c;
    }

    public List<f> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("31b9b59d", new Object[]{this}) : this.d;
    }

    public List<f> d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("195b8bfc", new Object[]{this}) : this.e;
    }

    public List<f> e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("fd625b", new Object[]{this}) : this.f;
    }

    public List<f> f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("e89f38ba", new Object[]{this}) : this.g;
    }

    public Map<String, List<f>> g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("7212f323", new Object[]{this}) : this.j;
    }

    public String h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this}) : this.f26921a;
    }
}
