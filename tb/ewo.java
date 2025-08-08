package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.model.template.ActionModel;
import com.taobao.android.detail.sdk.model.template.ComponentModel;
import com.taobao.android.detail.sdk.model.template.DescModel;
import com.taobao.android.detail.sdk.model.template.RuleModel;
import com.taobao.android.detail.sdk.structure.IProtocol;
import com.taobao.android.detail.sdk.utils.c;
import com.taobao.android.detail.sdk.utils.g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class ewo implements IProtocol {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public HashMap<String, RuleModel> f27612a;
    public HashMap<String, ActionModel> b;

    @Override // com.taobao.android.detail.sdk.structure.IProtocol
    public String getRuleIdKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b4ab3347", new Object[]{this}) : "ID";
    }

    static {
        kge.a(518911266);
        kge.a(1168839397);
        tpc.a("com.taobao.android.detail.sdk.structure.desc.DescProtocolManager");
    }

    public ewo() {
        tpc.a("com.taobao.android.detail.sdk.structure.desc.DescProtocolManager");
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (jSONObject == null || jSONObject.isEmpty()) {
        } else {
            this.f27612a = c.a(jSONObject, new g<RuleModel>() { // from class: tb.ewo.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.taobao.android.detail.sdk.model.template.RuleModel] */
                @Override // com.taobao.android.detail.sdk.utils.g
                public /* synthetic */ RuleModel b(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
                }

                public RuleModel a(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (RuleModel) ipChange2.ipc$dispatch("281c2843", new Object[]{this, obj}) : new RuleModel((JSONObject) obj);
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
            this.b = c.a(jSONObject, new g<ActionModel>() { // from class: tb.ewo.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.taobao.android.detail.sdk.model.template.ActionModel] */
                @Override // com.taobao.android.detail.sdk.utils.g
                public /* synthetic */ ActionModel b(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
                }

                public ActionModel a(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (ActionModel) ipChange2.ipc$dispatch("fa7c12bd", new Object[]{this, obj}) : new ActionModel((JSONObject) obj);
                }
            });
        }
    }

    public DescModel a(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DescModel) ipChange.ipc$dispatch("c74a734c", new Object[]{this, jSONArray});
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

    @Override // com.taobao.android.detail.sdk.structure.IProtocol
    public RuleModel findRuleById(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RuleModel) ipChange.ipc$dispatch("c224d7e5", new Object[]{this, str, str2});
        }
        if (ewu.a(this.f27612a) || StringUtils.isEmpty(str2)) {
            return null;
        }
        return this.f27612a.get(str2);
    }

    @Override // com.taobao.android.detail.sdk.structure.IProtocol
    public ActionModel findActionByKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActionModel) ipChange.ipc$dispatch("ff1c0777", new Object[]{this, str});
        }
        if (ewu.a(this.b) || StringUtils.isEmpty(str)) {
            return null;
        }
        return new ActionModel(this.b.get(str));
    }
}
