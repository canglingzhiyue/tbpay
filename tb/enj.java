package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.template.ActionModel;
import com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel;
import com.taobao.android.detail.datasdk.model.datamodel.template.DescModel;
import com.taobao.android.detail.datasdk.model.datamodel.template.RuleModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class enj implements enf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public HashMap<String, RuleModel> f27466a;
    public HashMap<String, ActionModel> b;
    private Context c;

    static {
        kge.a(67782437);
        kge.a(2146655042);
    }

    @Override // tb.enf
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "ID";
    }

    public enj(Context context) {
        this.c = context;
        emu.a("com.taobao.android.detail.datasdk.engine.structure.desc.DescProtocolManager");
    }

    @Override // tb.enf
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : emx.c(this.c);
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (jSONObject == null || jSONObject.isEmpty()) {
        } else {
            this.f27466a = epw.a(jSONObject, new epy<RuleModel>() { // from class: tb.enj.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.android.detail.datasdk.model.datamodel.template.RuleModel, java.lang.Object] */
                @Override // tb.epy
                public /* synthetic */ RuleModel b(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
                }

                public RuleModel a(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (RuleModel) ipChange2.ipc$dispatch("44684b89", new Object[]{this, obj}) : new RuleModel((JSONObject) obj);
                }
            });
        }
    }

    public void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
        } else if (jSONObject == null || jSONObject.isEmpty()) {
        } else {
            this.b = epw.a(jSONObject, new epy<ActionModel>() { // from class: tb.enj.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.android.detail.datasdk.model.datamodel.template.ActionModel, java.lang.Object] */
                @Override // tb.epy
                public /* synthetic */ ActionModel b(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
                }

                public ActionModel a(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (ActionModel) ipChange2.ipc$dispatch("344c7c83", new Object[]{this, obj}) : new ActionModel((JSONObject) obj);
                }
            });
        }
    }

    public DescModel a(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DescModel) ipChange.ipc$dispatch("cfb7eb92", new Object[]{this, jSONArray});
        }
        if (jSONArray == null || jSONArray.isEmpty()) {
            return null;
        }
        DescModel descModel = new DescModel();
        descModel.components = new ArrayList<>();
        Iterator<Object> it = jSONArray.iterator();
        while (it.hasNext()) {
            descModel.components.add(new ComponentModel((JSONObject) it.next(), this));
        }
        return descModel;
    }

    @Override // tb.enf
    public RuleModel a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RuleModel) ipChange.ipc$dispatch("fc17d351", new Object[]{this, str, str2});
        }
        if (eqg.a(this.f27466a) || StringUtils.isEmpty(str2)) {
            return null;
        }
        return this.f27466a.get(str2);
    }

    @Override // tb.enf
    public ActionModel a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActionModel) ipChange.ipc$dispatch("2f654ad5", new Object[]{this, str});
        }
        if (eqg.a(this.b) || StringUtils.isEmpty(str)) {
            return null;
        }
        return new ActionModel(this.b.get(str));
    }
}
