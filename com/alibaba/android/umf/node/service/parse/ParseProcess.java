package com.alibaba.android.umf.node.service.parse;

import android.text.TextUtils;
import com.alibaba.android.aura.AURAInputData;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.taobao.adapter.extension.linkage.event.AURASubmitEvent;
import com.alibaba.android.umf.datamodel.protocol.ultron.UltronDeltaProtocol;
import com.alibaba.android.umf.datamodel.protocol.ultron.UltronProtocol;
import com.alibaba.android.umf.datamodel.protocol.ultron.UltronProtocolException;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Component;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.ComponentView;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Delta;
import com.alibaba.android.umf.datamodel.service.parse.UMFParseIO;
import com.alibaba.android.umf.node.service.parse.state.RenderComponent;
import com.alibaba.android.umf.node.service.parse.state.b;
import com.alibaba.android.umf.node.service.parse.state.tree.MultiTreeNode;
import com.alibaba.android.umf.node.service.parse.state.tree.TreeNode;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.welcome.h;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.bqe;
import tb.bqp;
import tb.bqu;
import tb.bst;
import tb.kge;

/* loaded from: classes2.dex */
public class ParseProcess {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private bqp d;
    private JSONObject f;
    private String g;
    private final Map<String, RenderComponent> b = new HashMap();
    private final CopyOnWriteArrayList<a> c = new CopyOnWriteArrayList<>();
    private UltronProtocol e = new UltronProtocol();

    /* renamed from: a  reason: collision with root package name */
    private final b f2846a = new b();

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface ProtocolType {
        public static final String ALL = "ALL";
        public static final String DELTA = "DELTA";
    }

    /* loaded from: classes2.dex */
    public interface a {
        void a(List<AURARenderComponent> list, List<Map<String, String>> list2);
    }

    static {
        kge.a(-1789909155);
    }

    public static /* synthetic */ JSONObject a(ParseProcess parseProcess) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("31458ffc", new Object[]{parseProcess}) : parseProcess.f;
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95c485ff", new Object[]{this, aVar});
        } else {
            this.c.add(aVar);
        }
    }

    public void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("142589de", new Object[]{this, aVar});
        } else {
            this.c.remove(aVar);
        }
    }

    @Deprecated
    public void a(JSONObject jSONObject, bqp bqpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c59457", new Object[]{this, jSONObject, bqpVar});
        } else {
            a((AURAInputData<UMFParseIO>) null, jSONObject, bqpVar);
        }
    }

    public void a(AURAInputData<UMFParseIO> aURAInputData, JSONObject jSONObject, bqp bqpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99b236ce", new Object[]{this, aURAInputData, jSONObject, bqpVar});
            return;
        }
        this.d = bqpVar;
        JSONObject c = c(jSONObject);
        String e = e(c);
        char c2 = 65535;
        int hashCode = e.hashCode();
        if (hashCode != 64897) {
            if (hashCode == 64930712 && e.equals("DELTA")) {
                c2 = 0;
            }
        } else if (e.equals("ALL")) {
            c2 = 1;
        }
        if (c2 == 0) {
            a(c);
        } else if (c2 == 1) {
            b(c);
        }
        b(this.f2846a.b());
    }

    private void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else {
            a((UltronDeltaProtocol) JSON.toJavaObject(jSONObject, UltronDeltaProtocol.class));
        }
    }

    private void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
            return;
        }
        this.f = jSONObject;
        this.e = (UltronProtocol) JSON.toJavaObject(jSONObject, UltronProtocol.class);
        a(jSONObject, this.e);
    }

    private void a(JSONObject jSONObject, UltronProtocol ultronProtocol) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16ef6875", new Object[]{this, jSONObject, ultronProtocol});
            return;
        }
        this.g = ultronProtocol.getHierarchy().getRoot();
        if (TextUtils.isEmpty(this.g)) {
            throw new UltronProtocolException("ultron protocol[hierarchy.root] is NULL!");
        }
        Component a2 = a(this.g);
        ComponentView componentView = new ComponentView();
        if (a2 != null) {
            componentView = b(a2.getType());
        }
        RenderComponent a3 = a(this.g, a2, componentView);
        MultiTreeNode multiTreeNode = new MultiTreeNode(a3);
        this.b.put(this.g, a3);
        JSONObject structure = ultronProtocol.getHierarchy().getStructure();
        if (structure == null) {
            throw new UltronProtocolException("ultron protocol[hierarchy.structure] is NULL!");
        }
        a(multiTreeNode, structure, this.g);
        MultiTreeNode multiTreeNode2 = new MultiTreeNode(new RenderComponent());
        a(multiTreeNode, multiTreeNode2);
        this.f2846a.a(com.alibaba.android.umf.node.service.parse.state.a.a(this.g, jSONObject, ultronProtocol, multiTreeNode, multiTreeNode2, this.b, null, null));
    }

    private void a(MultiTreeNode multiTreeNode, MultiTreeNode multiTreeNode2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efe7b2a8", new Object[]{this, multiTreeNode, multiTreeNode2});
        } else if (multiTreeNode != null) {
            TreeNode<RenderComponent> clone = multiTreeNode.m155clone();
            for (TreeNode<RenderComponent> treeNode : a(clone).subtrees()) {
                clone.remove(treeNode);
            }
            multiTreeNode2.add(clone);
        }
    }

    private TreeNode<RenderComponent> a(TreeNode<RenderComponent> treeNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TreeNode) ipChange.ipc$dispatch("d2604d4e", new Object[]{this, treeNode});
        }
        final MultiTreeNode multiTreeNode = new MultiTreeNode(new RenderComponent());
        treeNode.traversePreOrder(new TreeNode.a<TreeNode<RenderComponent>>() { // from class: com.alibaba.android.umf.node.service.parse.ParseProcess.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.umf.node.service.parse.state.tree.TreeNode.a
            public boolean a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
                }
                return false;
            }

            @Override // com.alibaba.android.umf.node.service.parse.state.tree.TreeNode.a
            public void a(TreeNode<RenderComponent> treeNode2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("87a5e2c5", new Object[]{this, treeNode2});
                } else if (treeNode2 == null || treeNode2.data() == null || treeNode2.data().getComponentView() == null || !"layout".equals(treeNode2.data().getComponentView().getContainerType()) || !"popup_window".equals(treeNode2.data().getComponentView().getName())) {
                } else {
                    Component component = treeNode2.data().getComponent();
                    if (component != null && component.getFields() != null) {
                        Object obj = component.getFields().get("code");
                        if ((obj instanceof String) && !TextUtils.isEmpty(treeNode2.data().getKey()) && treeNode2.parent() != null && treeNode2.parent().data() != null) {
                            Component component2 = treeNode2.parent().data().getComponent();
                            if (component2 == null) {
                                component2 = new Component();
                            }
                            component2.addCodePopupWindow((String) obj, treeNode2.data());
                        }
                    }
                    multiTreeNode.add(treeNode2);
                }
            }
        });
        return multiTreeNode;
    }

    private void a(UltronDeltaProtocol ultronDeltaProtocol) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ecf153", new Object[]{this, ultronDeltaProtocol});
            return;
        }
        for (Delta delta : ultronDeltaProtocol.getHierarchy().getDelta()) {
            try {
                this.f2846a.a(delta.getOpType(), new bqu(delta, ultronDeltaProtocol, true), null);
            } catch (Throwable th) {
                bqe.a().c("ProtocolProcess", th.toString());
            }
        }
    }

    private List<AURARenderComponent> a(com.alibaba.android.umf.node.service.parse.state.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f7d6c212", new Object[]{this, aVar});
        }
        MultiTreeNode d = aVar.d();
        if (d == null) {
            throw new StateStoreException("StateTree is NULL !!");
        }
        ArrayList arrayList = new ArrayList();
        for (TreeNode<RenderComponent> treeNode : d.subtrees()) {
            AURARenderComponent a2 = bst.a(treeNode, (AURARenderComponent) null);
            bst.a(treeNode, a2, new bst.a() { // from class: com.alibaba.android.umf.node.service.parse.ParseProcess.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.bst.a
                public boolean a(TreeNode<RenderComponent> treeNode2, AURARenderComponent aURARenderComponent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("862d55da", new Object[]{this, treeNode2, aURARenderComponent})).booleanValue();
                    }
                    if (treeNode2 == null || treeNode2.data() == null || treeNode2.data().getComponentView() == null || !"rax-container".equals(treeNode2.data().getComponentView().getContainerType())) {
                        return false;
                    }
                    if (treeNode2.data().getComponent() == null) {
                        new Component().fields = new HashMap();
                    }
                    aURARenderComponent.protocol = bst.a(ParseProcess.a(ParseProcess.this), treeNode2.data().getKey());
                    return true;
                }
            });
            arrayList.add(a2);
        }
        return arrayList;
    }

    private void b(com.alibaba.android.umf.node.service.parse.state.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb88dc96", new Object[]{this, aVar});
            return;
        }
        if (this.d != null) {
            aVar.d();
        }
        List<AURARenderComponent> a2 = a(aVar);
        String str = null;
        bqp bqpVar = this.d;
        if (bqpVar != null) {
            str = bqpVar.a();
        }
        if (TextUtils.isEmpty(str)) {
            if (TextUtils.isEmpty(this.g)) {
                return;
            }
            str = this.g;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(h.TYPE_GENERAL, str);
        ArrayList arrayList = new ArrayList();
        arrayList.add(hashMap);
        Iterator<a> it = this.c.iterator();
        while (it.hasNext()) {
            it.next().a(a2, arrayList);
        }
    }

    private void a(TreeNode<RenderComponent> treeNode, JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("640631d5", new Object[]{this, treeNode, jSONObject, str});
            return;
        }
        JSONArray jSONArray = jSONObject.getJSONArray(str);
        if (jSONArray == null) {
            return;
        }
        for (int i = 0; i < jSONArray.size(); i++) {
            String string = jSONArray.getString(i);
            if (!TextUtils.isEmpty(string)) {
                ComponentView componentView = null;
                Component a2 = a(string);
                if (a2 != null) {
                    componentView = b(a2.getType());
                }
                RenderComponent a3 = a(string, a2, componentView);
                this.b.put(string, a3);
                MultiTreeNode multiTreeNode = new MultiTreeNode(a3);
                treeNode.add(multiTreeNode);
                a(multiTreeNode, jSONObject, string);
            }
        }
    }

    private Component a(String str) {
        Map<String, Component> data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Component) ipChange.ipc$dispatch("33007c9e", new Object[]{this, str});
        }
        UltronProtocol ultronProtocol = this.e;
        if (ultronProtocol != null && (data = ultronProtocol.getData()) != null) {
            return data.get(str);
        }
        return null;
    }

    private ComponentView b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ComponentView) ipChange.ipc$dispatch("8fe94c58", new Object[]{this, str});
        }
        for (ComponentView componentView : this.e.getContainer().getData()) {
            if (componentView.getType().contains(str)) {
                return componentView;
            }
        }
        return new ComponentView();
    }

    private RenderComponent a(String str, Component component, ComponentView componentView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RenderComponent) ipChange.ipc$dispatch("592c535c", new Object[]{this, str, component, componentView});
        }
        RenderComponent renderComponent = new RenderComponent();
        renderComponent.key = str;
        renderComponent.component = component;
        renderComponent.componentView = componentView;
        return renderComponent;
    }

    private JSONObject c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("b45647e6", new Object[]{this, jSONObject}) : (jSONObject.containsKey(AURASubmitEvent.RPC_ENDPOINT) || jSONObject.containsKey("hierarchy")) ? jSONObject : jSONObject.getJSONObject("data");
    }

    private void d(JSONObject jSONObject) throws UltronProtocolException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("265ed165", new Object[]{this, jSONObject});
        } else if (!jSONObject.containsKey(AURASubmitEvent.RPC_ENDPOINT)) {
            throw new UltronProtocolException("ultron protocol[endpoint] is NULL!");
        } else {
            if (!jSONObject.getJSONObject(AURASubmitEvent.RPC_ENDPOINT).containsKey("protocolVersion")) {
                throw new UltronProtocolException("ultron protocol[protocolVersion] is NULL!");
            }
            if (jSONObject.getJSONObject(AURASubmitEvent.RPC_ENDPOINT).getString("protocolVersion").compareTo("4.0") < 0) {
                throw new UltronProtocolException("ultron protocol[endpoint] is < 4.0!");
            }
            if (!jSONObject.containsKey("data")) {
                throw new UltronProtocolException("ultron protocol[data] is NULL!");
            }
            if (!jSONObject.containsKey("container")) {
                throw new UltronProtocolException("ultron protocol[container] is NULL!");
            }
            if (!jSONObject.getJSONObject("hierarchy").containsKey("structure")) {
                throw new UltronProtocolException("ultron protocol[hierarchy.structure] is NULL!");
            }
        }
    }

    private String e(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bb19cf1c", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            throw new UltronProtocolException("protocol is NULL!");
        }
        if (!jSONObject.containsKey("hierarchy")) {
            throw new UltronProtocolException("protocol[hierarchy] is NULL!");
        }
        if (jSONObject.getJSONObject("hierarchy").containsKey("delta")) {
            return "DELTA";
        }
        d(jSONObject);
        return "ALL";
    }
}
