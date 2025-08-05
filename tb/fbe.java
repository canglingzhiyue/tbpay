package tb;

import android.util.Pair;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public class fbe extends epf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f27737a;
    public ArrayList<a> b;

    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f27739a;
        public ArrayList<Pair<String, String>> b;

        static {
            kge.a(764580052);
        }

        public a(JSONObject jSONObject) {
            this.f27739a = epw.a(jSONObject.getString("title"));
            this.b = epw.a(JSON.parseArray(jSONObject.getString("wearData")), new epy<Pair<String, String>>() { // from class: tb.fbe.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v3, types: [android.util.Pair<java.lang.String, java.lang.String>, java.lang.Object] */
                @Override // tb.epy
                public /* synthetic */ Pair<String, String> b(Object obj) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? ipChange.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
                }

                public Pair<String, String> a(Object obj) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        return (Pair) ipChange.ipc$dispatch("4f747b8e", new Object[]{this, obj});
                    }
                    JSONObject jSONObject2 = (JSONObject) obj;
                    return new Pair<>(epw.a(jSONObject2.getString("name")), epw.a(jSONObject2.getString("content")));
                }
            });
        }
    }

    static {
        kge.a(-1333007330);
    }

    @Override // tb.epf
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public fbe(ComponentModel componentModel) {
        super(componentModel);
        this.f27737a = "";
        emu.a("com.taobao.android.detail.wrapper.ext.component.desc.viewmodel.ModelWearViewModel");
    }

    @Override // tb.epf
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        if (jSONObject.containsKey("title")) {
            this.f27737a = jSONObject.getString("title");
        }
        JSONArray jSONArray = jSONObject.getJSONArray("data");
        if (jSONArray == null) {
            return;
        }
        this.b = epw.a(jSONArray, new epy<a>() { // from class: tb.fbe.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [tb.fbe$a, java.lang.Object] */
            @Override // tb.epy
            public /* synthetic */ a b(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
            }

            public a a(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (a) ipChange2.ipc$dispatch("532ef51c", new Object[]{this, obj}) : new a((JSONObject) obj);
            }
        });
    }
}
