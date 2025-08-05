package tb;

import android.text.TextUtils;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentContainer;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentLayout;
import com.alibaba.android.aura.datamodel.render.a;
import com.alibaba.android.aura.taobao.adapter.extension.linkage.event.AURASubmitEvent;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Component;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.ComponentView;
import com.alibaba.android.umf.node.service.parse.state.RenderComponent;
import com.alibaba.android.umf.node.service.parse.state.tree.MultiTreeNode;
import com.alibaba.android.umf.node.service.parse.state.tree.TreeNode;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class bst {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes2.dex */
    public interface a {
        boolean a(TreeNode<RenderComponent> treeNode, AURARenderComponent aURARenderComponent);
    }

    static {
        kge.a(595260833);
    }

    public static AURARenderComponent a(TreeNode<RenderComponent> treeNode, AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURARenderComponent) ipChange.ipc$dispatch("af26fec1", new Object[]{treeNode, aURARenderComponent});
        }
        AURARenderComponent aURARenderComponent2 = new AURARenderComponent();
        aURARenderComponent2.parent = aURARenderComponent;
        aURARenderComponent2.mirror = treeNode;
        RenderComponent data = treeNode.data();
        aURARenderComponent2.key = data.getKey();
        aURARenderComponent2.data = a(data);
        aURARenderComponent2.data.layout = b(data);
        return aURARenderComponent2;
    }

    public static AURARenderComponentData a(RenderComponent renderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURARenderComponentData) ipChange.ipc$dispatch("be4eaf0", new Object[]{renderComponent});
        }
        if (renderComponent == null || renderComponent.getComponent() == null) {
            return AURARenderComponentData.CreateEmptyUMFRenderComponentData();
        }
        Component component = renderComponent.getComponent();
        return new AURARenderComponentData(component.getType(), component.getFields(), component.getEvents(), component.getFeatures(), e(renderComponent), component.getCodePopupWindowMap(), component.getLocalFields(), component.getStatus());
    }

    private static AURARenderComponentContainer e(RenderComponent renderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURARenderComponentContainer) ipChange.ipc$dispatch("55d32097", new Object[]{renderComponent});
        }
        ComponentView componentView = renderComponent.getComponentView();
        AURARenderComponentContainer f = f(renderComponent);
        return f != null ? f : new AURARenderComponentContainer(componentView.getContainerType(), componentView.getName(), componentView.getVersion(), componentView.getType(), componentView.getUrl(), componentView.getMd5());
    }

    private static AURARenderComponentContainer f(RenderComponent renderComponent) {
        ComponentView componentView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURARenderComponentContainer) ipChange.ipc$dispatch("c5b7fa36", new Object[]{renderComponent});
        }
        Component component = renderComponent.getComponent();
        if (component == null) {
            return null;
        }
        String type = component.getType();
        if (!TextUtils.isEmpty(type) && (componentView = renderComponent.getComponentView()) != null && TextUtils.isEmpty(componentView.getContainerType()) && type.startsWith("native$")) {
            String[] split = type.split("\\$");
            if (split == null || split.length < 2) {
                ard a2 = arc.a();
                a2.c("【解析】", "【独立节点】", "组件type格式不对（native$componentType）|" + type);
            } else {
                return new AURARenderComponentContainer(split[1], "", "", null, "", "");
            }
        }
        return null;
    }

    public static void a(TreeNode<RenderComponent> treeNode, AURARenderComponent aURARenderComponent, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64f2fc86", new Object[]{treeNode, aURARenderComponent, aVar});
        } else if (treeNode != null && !treeNode.isLeaf() && treeNode.subtrees() != null) {
            for (TreeNode<RenderComponent> treeNode2 : treeNode.subtrees()) {
                if (treeNode2.data() != null && !c(treeNode2.data())) {
                    AURARenderComponent a2 = a(treeNode2, aURARenderComponent);
                    aURARenderComponent.addChildComponent(a2);
                    if (aVar != null && aVar.a(treeNode2, a2)) {
                        return;
                    }
                    a(treeNode2, a2, aVar);
                }
            }
        }
    }

    public static AURARenderComponentLayout b(RenderComponent renderComponent) {
        Component component;
        ComponentView componentView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURARenderComponentLayout) ipChange.ipc$dispatch("188d2671", new Object[]{renderComponent});
        }
        if (renderComponent == null || (component = renderComponent.getComponent()) == null || (componentView = renderComponent.getComponentView()) == null) {
            return null;
        }
        String name = componentView.getName();
        if (TextUtils.isEmpty(name) || !a.b.f.equals(componentView.getContainerType())) {
            return null;
        }
        AURARenderComponentLayout aURARenderComponentLayout = new AURARenderComponentLayout();
        aURARenderComponentLayout.type = name;
        aURARenderComponentLayout.style = component.getFields();
        return aURARenderComponentLayout;
    }

    public static boolean c(RenderComponent renderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c31aa855", new Object[]{renderComponent})).booleanValue();
        }
        if (renderComponent != null && renderComponent.getComponent() != null) {
            return renderComponent.getComponent().isHidden();
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.alibaba.fastjson.JSONObject] */
    /* JADX WARN: Type inference failed for: r5v6, types: [com.alibaba.fastjson.JSONObject] */
    public static JSONObject a(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a5543672", new Object[]{jSONObject, str});
        }
        if (jSONObject == null || TextUtils.isEmpty(str)) {
            return null;
        }
        ?? jSONObject2 = new JSONObject();
        jSONObject2.put(AURASubmitEvent.RPC_ENDPOINT, c(jSONObject, AURASubmitEvent.RPC_ENDPOINT));
        jSONObject2.put("global", c(jSONObject, "global"));
        jSONObject2.put("features", c(jSONObject, "features"));
        JSONObject jSONObject3 = jSONObject.getJSONObject("hierarchy");
        JSONObject jSONObject4 = jSONObject3 == null ? null : jSONObject3.getJSONObject("structure");
        JSONObject jSONObject5 = jSONObject.getJSONObject("data");
        JSONObject jSONObject6 = jSONObject.getJSONObject("container");
        List<String> d = d(jSONObject4, str);
        JSONObject jSONObject7 = new JSONObject();
        JSONObject jSONObject8 = new JSONObject();
        JSONObject jSONObject9 = new JSONObject();
        JSONObject jSONObject10 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        if (jSONObject4 == null) {
            return null;
        }
        Iterator<String> it = d.iterator();
        while (it.hasNext()) {
            String next = it.next();
            Iterator<String> it2 = it;
            Object obj = jSONObject4.get(next);
            JSONObject jSONObject11 = jSONObject4;
            if (obj instanceof JSONArray) {
                jSONObject8.put(next, obj);
            }
            Object obj2 = jSONObject5.get(next);
            if (obj2 instanceof JSONObject) {
                jSONObject9.put(next, obj2);
                JSONObject b = b(jSONObject6, ((JSONObject) obj2).getString("type"));
                if (b != null) {
                    jSONArray.add(b);
                }
            }
            it = it2;
            jSONObject4 = jSONObject11;
        }
        jSONObject7.put("structure", (Object) jSONObject8);
        jSONObject10.put("data", (Object) jSONArray);
        jSONObject7.put("root", (Object) str);
        jSONObject2.put("hierarchy", jSONObject7);
        jSONObject2.put("data", jSONObject9);
        jSONObject2.put("container", jSONObject10);
        return jSONObject2;
    }

    private static JSONObject b(JSONObject jSONObject, String str) {
        JSONObject jSONObject2;
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7af4d51", new Object[]{jSONObject, str});
        }
        if (jSONObject != null && !TextUtils.isEmpty(str)) {
            Iterator<Object> it = jSONObject.getJSONArray("data").iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if ((next instanceof JSONObject) && (jSONArray = (jSONObject2 = (JSONObject) next).getJSONArray("type")) != null && jSONArray.contains(str)) {
                    return jSONObject2;
                }
            }
        }
        return null;
    }

    private static JSONObject c(JSONObject jSONObject, String str) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("6a0a6430", new Object[]{jSONObject, str});
        }
        JSONObject jSONObject3 = new JSONObject();
        if (jSONObject != null && (jSONObject2 = jSONObject.getJSONObject(str)) != null) {
            jSONObject3.putAll(jSONObject2);
        }
        return jSONObject3;
    }

    private static List<String> d(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("3eca4a78", new Object[]{jSONObject, str});
        }
        ArrayList arrayList = new ArrayList();
        if (jSONObject != null && !TextUtils.isEmpty(str)) {
            a(jSONObject, str, arrayList);
        }
        return arrayList;
    }

    private static void a(JSONObject jSONObject, String str, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee58fc43", new Object[]{jSONObject, str, list});
            return;
        }
        list.add(str);
        JSONArray jSONArray = jSONObject.getJSONArray(str);
        if (jSONArray == null) {
            return;
        }
        Iterator<Object> it = jSONArray.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof String) {
                a(jSONObject, (String) next, list);
            }
        }
    }

    public static TreeNode<RenderComponent> a(MultiTreeNode multiTreeNode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TreeNode) ipChange.ipc$dispatch("dba18377", new Object[]{multiTreeNode, str});
        }
        if (!TextUtils.isEmpty(str) && multiTreeNode != null) {
            for (TreeNode<RenderComponent> treeNode : multiTreeNode.preOrdered()) {
                if (str.equals(treeNode.data().getKey())) {
                    return treeNode;
                }
            }
        }
        return null;
    }

    public static AURARenderComponent d(RenderComponent renderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURARenderComponent) ipChange.ipc$dispatch("647a637d", new Object[]{renderComponent});
        }
        AURARenderComponent aURARenderComponent = new AURARenderComponent();
        aURARenderComponent.key = renderComponent.getKey();
        Component component = renderComponent.getComponent();
        aURARenderComponent.data = new AURARenderComponentData(component.getType(), component.getFields(), component.getEvents(), component.getFeatures(), null, component.getCodePopupWindowMap(), component.getLocalFields(), component.getStatus());
        return aURARenderComponent;
    }
}
