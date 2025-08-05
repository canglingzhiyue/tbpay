package tb;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import com.alibaba.android.aura.AURAInputData;
import com.alibaba.android.aura.b;
import com.alibaba.android.aura.datamodel.c;
import com.alibaba.android.aura.datamodel.linkage.UMFLinkageTrigger;
import com.alibaba.android.aura.datamodel.nextrpc.AURANextRPCIO;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Component;
import com.alibaba.android.umf.node.service.parse.state.RenderComponent;
import com.alibaba.android.umf.node.service.parse.state.tree.TreeNode;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class ays extends arj<UMFLinkageTrigger, AURANextRPCIO> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CODE = "aura.service.submit";
    public static final String FLOW_DATA_KEY_LINKAGE_TRIGGER = "auraSubmitServiceLinkageTrigger";
    public static final String KEY_MSG = "msg";

    static {
        kge.a(1269590160);
    }

    public static /* synthetic */ Object ipc$super(ays aysVar, String str, Object... objArr) {
        if (str.hashCode() == 339629984) {
            super.a((AURAInputData) objArr[0], (aqq) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.arj
    public void a(AURAInputData<UMFLinkageTrigger> aURAInputData, aqq<AURANextRPCIO> aqqVar) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("143e57a0", new Object[]{this, aURAInputData, aqqVar});
            return;
        }
        super.a(aURAInputData, aqqVar);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("startTime", (Object) (System.currentTimeMillis() + ""));
        aURAInputData.getFlowData().update(FLOW_DATA_KEY_LINKAGE_TRIGGER, aURAInputData.getData());
        List<ayx> b = getExtensionManager().b(ayx.class);
        JSONObject a2 = a(aURAInputData);
        if (!(a2.getBoolean("success") != null ? a2.getBoolean("success").booleanValue() : false)) {
            RenderComponent renderComponent = (RenderComponent) a2.getObject("component", RenderComponent.class);
            String string = a2.getString("msg") != null ? a2.getString("msg") : "Validate data failed";
            for (ayx ayxVar : b) {
                if (ayxVar.a(renderComponent, a2)) {
                    z = true;
                }
            }
            if (!z) {
                a(getUserContext().e(), string);
                Object obj = aURAInputData.getGlobalData().get("render_view", Object.class);
                if (obj instanceof RecyclerView) {
                    a((RecyclerView) obj, renderComponent, 3);
                }
            }
            aqqVar.a();
            return;
        }
        ayw aywVar = (ayw) getExtensionManager().a(ayw.class);
        if (aywVar == null) {
            aqqVar.a(new b(0, "AURASubmitServiceDomain", "no_submit_linkage", "Can't find submit linkage"));
            return;
        }
        Iterator it = b.iterator();
        while (it.hasNext()) {
            it.next();
        }
        jSONObject.put(joq.STAGE_BEFORE_NETWORK, (Object) (System.currentTimeMillis() + ""));
        aURAInputData.getGlobalData().update("linkagePerformance", jSONObject);
        aqqVar.a(c.a(new AURANextRPCIO(aywVar.a(), aywVar.b()), aURAInputData));
    }

    private JSONObject a(AURAInputData<UMFLinkageTrigger> aURAInputData) {
        RenderComponent data;
        Component component;
        JSONObject validate;
        Map<String, Object> fields;
        JSONArray jSONArray;
        JSONArray jSONArray2;
        JSONArray jSONArray3;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f356e331", new Object[]{this, aURAInputData});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", (Object) true);
        for (TreeNode<RenderComponent> treeNode : aURAInputData.getData().getStateTree().postOrdered()) {
            if (treeNode != null && (treeNode.data() instanceof RenderComponent) && (component = (data = treeNode.data()).getComponent()) != null && (validate = component.getValidate()) != null && (fields = component.getFields()) != null && !fields.isEmpty() && (jSONArray = validate.getJSONArray("fields")) != null && !jSONArray.isEmpty() && (jSONArray2 = validate.getJSONArray("regex")) != null && !jSONArray2.isEmpty() && (jSONArray3 = validate.getJSONArray("msg")) != null && !jSONArray3.isEmpty()) {
                if (jSONArray.size() == jSONArray2.size() && jSONArray2.size() == jSONArray3.size()) {
                    for (int i = 0; i < jSONArray.size(); i++) {
                        Object obj = jSONArray.get(i);
                        Object obj2 = jSONArray2.get(i);
                        Object obj3 = jSONArray3.get(i);
                        if ((obj instanceof String) && (obj2 instanceof String) && (obj3 instanceof String)) {
                            Object obj4 = fields.get(obj);
                            if (obj4 == null) {
                                a(jSONObject, false, data, (String) obj3, "validate_failed");
                                return jSONObject;
                            }
                            try {
                                if (!(obj4 instanceof String)) {
                                    str = obj4.toString();
                                } else {
                                    str = (String) obj4;
                                }
                                if (!Pattern.compile((String) obj2).matcher(str).find()) {
                                    a(jSONObject, false, data, (String) obj3, "validate_failed");
                                    return jSONObject;
                                }
                            } catch (Exception unused) {
                                a(jSONObject, false, data, (String) obj3, "validate_exception");
                                return jSONObject;
                            }
                        }
                    }
                    continue;
                } else {
                    continue;
                }
            }
        }
        return jSONObject;
    }

    private void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{this, context, str});
        } else if (TextUtils.isEmpty(str) || !(context instanceof Activity)) {
        } else {
            bat.a((Activity) context, str);
        }
    }

    private void a(RecyclerView recyclerView, RenderComponent renderComponent, int i) {
        int max;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2b26", new Object[]{this, recyclerView, renderComponent, new Integer(i)});
        } else if (renderComponent == null) {
        } else {
            String key = renderComponent.getKey();
            if (TextUtils.isEmpty(key)) {
                return;
            }
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            if (!(adapter instanceof atn)) {
                return;
            }
            List<AURARenderComponent> a2 = ((atn) adapter).a();
            if (a2.isEmpty()) {
                return;
            }
            AURARenderComponent aURARenderComponent = null;
            int i2 = 0;
            while (true) {
                if (i2 < a2.size()) {
                    AURARenderComponent aURARenderComponent2 = a2.get(i2);
                    if (aURARenderComponent2 != null && !TextUtils.isEmpty(aURARenderComponent2.key) && aURARenderComponent2.key.equals(key)) {
                        aURARenderComponent = aURARenderComponent2;
                        break;
                    }
                    i2++;
                } else {
                    break;
                }
            }
            if (i2 == a2.size()) {
                return;
            }
            if (aURARenderComponent != null) {
                while (aURARenderComponent != null) {
                    if (aURARenderComponent.data != null && aURARenderComponent.data.layout != null && "sticky".equals(aURARenderComponent.data.layout.type)) {
                        return;
                    }
                    aURARenderComponent = aURARenderComponent.parent;
                }
            }
            if (recyclerView.getChildLayoutPosition(recyclerView.getChildAt(0)) < i2) {
                max = i2 + i;
                if (max >= a2.size()) {
                    max = i2;
                }
            } else {
                max = Math.max(i2 - i, 0);
            }
            recyclerView.smoothScrollToPosition(max);
        }
    }

    private void a(JSONObject jSONObject, boolean z, RenderComponent renderComponent, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f998c47", new Object[]{this, jSONObject, new Boolean(z), renderComponent, str, str2});
            return;
        }
        jSONObject.put("success", (Object) Boolean.valueOf(z));
        jSONObject.put("component", (Object) renderComponent);
        jSONObject.put("msg", (Object) str);
        jSONObject.put("errorType", (Object) str2);
    }
}
