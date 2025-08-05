package com.alibaba.android.aura.service.parse;

import android.text.TextUtils;
import com.ali.user.mobile.ability.excutor.BaseExecutor;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.datamodel.parse.AURAParseIO;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.alibaba.android.aura.taobao.adapter.extension.linkage.event.AURASubmitEvent;
import com.alibaba.android.aura.util.AURATraceUtil;
import com.alibaba.android.umf.datamodel.protocol.ultron.ProtocolType;
import com.alibaba.android.umf.datamodel.protocol.ultron.UltronDeltaProtocol;
import com.alibaba.android.umf.datamodel.protocol.ultron.UltronProtocol;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Component;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.ComponentView;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Delta;
import com.alibaba.android.umf.node.service.parse.state.RenderComponent;
import com.alibaba.android.umf.node.service.parse.state.b;
import com.alibaba.android.umf.node.service.parse.state.tree.MultiTreeNode;
import com.alibaba.android.umf.node.service.parse.state.tree.TreeNode;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import tb.arc;
import tb.ard;
import tb.aso;
import tb.asp;
import tb.asq;
import tb.asr;
import tb.baz;
import tb.bbh;
import tb.bqu;
import tb.bst;
import tb.jot;
import tb.kge;

/* loaded from: classes2.dex */
public class AURAParseProcessor implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final b b;
    private final f e;
    private final boolean f;
    private final boolean g;
    private boolean h;
    private final boolean i;
    private JSONObject k;

    /* renamed from: a  reason: collision with root package name */
    private final MultiTreeNode f2173a = new MultiTreeNode(new RenderComponent());
    private List<asq> c = new ArrayList();
    private List<aso> j = new ArrayList();
    private List<asp> d = new ArrayList();
    private final ExecutorService l = bbh.a(2, 4, 1, TimeUnit.MINUTES, "aura-parse-service");

    static {
        kge.a(1509999203);
        kge.a(-295156598);
    }

    public static /* synthetic */ void a(AURAParseProcessor aURAParseProcessor, RenderComponent renderComponent, RenderComponent renderComponent2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cf221e4", new Object[]{aURAParseProcessor, renderComponent, renderComponent2});
        } else {
            aURAParseProcessor.a(renderComponent, renderComponent2);
        }
    }

    public static /* synthetic */ void a(AURAParseProcessor aURAParseProcessor, com.alibaba.android.umf.node.service.parse.state.b bVar, MultiTreeNode multiTreeNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf404cb8", new Object[]{aURAParseProcessor, bVar, multiTreeNode});
        } else {
            aURAParseProcessor.a(bVar, multiTreeNode);
        }
    }

    public static /* synthetic */ void a(AURAParseProcessor aURAParseProcessor, MultiTreeNode multiTreeNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("220315c4", new Object[]{aURAParseProcessor, multiTreeNode});
        } else {
            aURAParseProcessor.a(multiTreeNode);
        }
    }

    public static /* synthetic */ void a(AURAParseProcessor aURAParseProcessor, MultiTreeNode multiTreeNode, UltronProtocol ultronProtocol, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("503b315f", new Object[]{aURAParseProcessor, multiTreeNode, ultronProtocol, jSONObject});
        } else {
            aURAParseProcessor.b(multiTreeNode, ultronProtocol, jSONObject);
        }
    }

    public static /* synthetic */ void a(AURAParseProcessor aURAParseProcessor, MultiTreeNode multiTreeNode, UltronProtocol ultronProtocol, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9710ea2", new Object[]{aURAParseProcessor, multiTreeNode, ultronProtocol, list});
        } else {
            aURAParseProcessor.a(multiTreeNode, ultronProtocol, list);
        }
    }

    public AURAParseProcessor(q qVar, b bVar, f fVar) {
        this.f = Boolean.TRUE.equals(qVar.a("enableParsePerf", Boolean.class, false));
        this.g = Boolean.TRUE.equals(qVar.a("enableParsePerfV2", Boolean.class, false));
        this.i = Boolean.TRUE.equals(qVar.a("enableFilterEmptyNode", Boolean.class, false));
        this.b = bVar;
        this.e = fVar;
    }

    @Override // com.alibaba.android.aura.service.parse.c
    public void a(AURAGlobalData aURAGlobalData, AURAParseIO aURAParseIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e145ee", new Object[]{this, aURAGlobalData, aURAParseIO});
            return;
        }
        f fVar = this.e;
        if (fVar != null) {
            this.c = fVar.b(asq.class);
            this.j = this.e.b(aso.class);
            this.d = this.e.b(asp.class);
        }
        com.alibaba.android.umf.node.service.parse.state.b a2 = a(aURAGlobalData);
        String action = aURAParseIO.getAction();
        a(action, a2.b());
        long currentTimeMillis = System.currentTimeMillis();
        AURATraceUtil.a(3, "aura-parse-createStateTree");
        AURATraceUtil.c(3, "aura-parse-createStateTree");
        if (!"rollback".equals(action)) {
            List<com.alibaba.android.aura.datamodel.parse.a> data = aURAParseIO.getData();
            if (!a(data)) {
                return;
            }
            for (com.alibaba.android.aura.datamodel.parse.a aVar : data) {
                JSONObject a3 = aVar.a();
                if (a3 != null && !a(a2, a3, aVar.c(), aVar.b(), aURAParseIO.getRootKey())) {
                    arc.a().a("AURAParseProcessor", BaseExecutor.EXECUTOR_SUFFIX, "protocolDispatch false ");
                    return;
                }
            }
        }
        AURATraceUtil.b(3);
        AURATraceUtil.a(3);
        long currentTimeMillis2 = System.currentTimeMillis();
        if (this.h) {
            ard a4 = arc.a();
            a4.a("生成状态树 耗时 = " + (currentTimeMillis2 - currentTimeMillis), arc.a.a().a("AURA/performance").a("start", currentTimeMillis).a("end", currentTimeMillis2).b());
        }
        if (a2.b().e() == null || TextUtils.isEmpty(a2.b().k())) {
            arc.a().b("AURAParseProcessor", BaseExecutor.EXECUTOR_SUFFIX, "stateTree is empty");
            a(1, "-5000_RENDER_STATE_TREE_EMPTY", "状态树为空，不执行渲染", (HashMap<String, Object>) null);
            return;
        }
        if (this.g) {
            a(a2.b().e(), a2.b().i(), this.k);
        }
        a(a2.b());
        AURATraceUtil.a(3, "aura-parse-createRenderTree");
        AURATraceUtil.c(3, "aura-parse-createRenderTree");
        a(aURAGlobalData, a2);
        AURATraceUtil.b(3);
        AURATraceUtil.a(3);
        this.k = null;
    }

    @Override // com.alibaba.android.aura.service.parse.c
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.l.shutdown();
        }
    }

    private void a(com.alibaba.android.umf.node.service.parse.state.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5f4d395", new Object[]{this, aVar});
            return;
        }
        MultiTreeNode d = aVar.d();
        UltronProtocol i = aVar.i();
        if (d == null) {
            return;
        }
        for (asq asqVar : this.c) {
            asqVar.b(d, i);
        }
    }

    private com.alibaba.android.umf.node.service.parse.state.b a(AURAGlobalData aURAGlobalData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.android.umf.node.service.parse.state.b) ipChange.ipc$dispatch("c65f3064", new Object[]{this, aURAGlobalData});
        }
        com.alibaba.android.umf.node.service.parse.state.b bVar = (com.alibaba.android.umf.node.service.parse.state.b) aURAGlobalData.get("aura_parse_global_data_parse", com.alibaba.android.umf.node.service.parse.state.b.class);
        return bVar != null ? bVar : com.alibaba.android.umf.node.service.parse.state.b.a();
    }

    private boolean a(com.alibaba.android.umf.node.service.parse.state.b bVar, JSONObject jSONObject, String str, boolean z, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("38d699c", new Object[]{this, bVar, jSONObject, str, new Boolean(z), str2})).booleanValue();
        }
        if (str == null) {
            str = jSONObject.getJSONObject("hierarchy").get("delta") != null ? "DELTA" : ProtocolType.COMPLETE;
        }
        ard a2 = arc.a();
        a2.a("AURAParseProcessor", "protocolType", "protocolType=" + str);
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -1838660736) {
            if (hashCode != 64930712) {
                if (hashCode == 183181625 && str.equals(ProtocolType.COMPLETE)) {
                    c = 1;
                }
            } else if (str.equals("DELTA")) {
                c = 0;
            }
        } else if (str.equals(ProtocolType.STREAM)) {
            c = 2;
        }
        if (c == 0) {
            this.h = false;
            return a(bVar, jSONObject, z);
        } else if (c == 1) {
            this.h = true;
            return a(bVar, jSONObject, str2, (JSONObject) null);
        } else if (c != 2) {
            return false;
        } else {
            JSONObject a3 = a(bVar.b().j(), jSONObject);
            this.k = jSONObject.getJSONObject("data");
            return a(bVar, a3, str2, this.k);
        }
    }

    private void a(String str, com.alibaba.android.umf.node.service.parse.state.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa9d425f", new Object[]{this, str, aVar});
        } else if (str == null) {
        } else {
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -1068795718) {
                if (hashCode != -259719452) {
                    if (hashCode == 1544803905 && str.equals("default")) {
                        c = 1;
                    }
                } else if (str.equals("rollback")) {
                    c = 0;
                }
            } else if (str.equals("modify")) {
                c = 2;
            }
            if (c == 0) {
                aVar.b();
            } else if (c != 1) {
            } else {
                aVar.c();
            }
        }
    }

    private boolean a(com.alibaba.android.umf.node.service.parse.state.b bVar, JSONObject jSONObject, String str, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7cb576e", new Object[]{this, bVar, jSONObject, str, jSONObject2})).booleanValue();
        }
        if (a(jSONObject)) {
            return false;
        }
        UltronProtocol ultronProtocol = this.f ? new UltronProtocol(jSONObject) : (UltronProtocol) JSON.toJavaObject(jSONObject, UltronProtocol.class);
        ultronProtocol.setOriginData(jSONObject);
        bVar.a(com.alibaba.android.umf.node.service.parse.state.a.a(bVar.b(), jSONObject, ultronProtocol));
        a(bVar, jSONObject, ultronProtocol, str, jSONObject2);
        return true;
    }

    private JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("87d5db88", new Object[]{this, jSONObject, jSONObject2}) : jSONObject == null ? jSONObject2 : jot.a(jSONObject2, jSONObject);
    }

    private boolean a(com.alibaba.android.umf.node.service.parse.state.b bVar, JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("739420dc", new Object[]{this, bVar, jSONObject, new Boolean(z)})).booleanValue();
        }
        if (bVar.b().d() == null) {
            a(1, "-5001_DELTA_STATE_TREE_EMPTY", "状态树为空，不执行差量操作", (HashMap<String, Object>) null);
            return false;
        }
        return a(bVar, this.f ? new UltronDeltaProtocol(jSONObject) : (UltronDeltaProtocol) JSON.toJavaObject(jSONObject, UltronDeltaProtocol.class), z);
    }

    private void a(com.alibaba.android.umf.node.service.parse.state.b bVar, JSONObject jSONObject, UltronProtocol ultronProtocol, String str, JSONObject jSONObject2) {
        String str2;
        String str3;
        MultiTreeNode multiTreeNode;
        MultiTreeNode multiTreeNode2;
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cf6c25d", new Object[]{this, bVar, jSONObject, ultronProtocol, str, jSONObject2});
            return;
        }
        String root = ultronProtocol.getHierarchy().getRoot();
        if (TextUtils.isEmpty(root)) {
            arc.a().a("AURAParseProcessor", "createStateTree", "protocol[hierarchy.root] is NULL!");
        }
        long currentTimeMillis = System.currentTimeMillis();
        RenderComponent a2 = asr.a(ultronProtocol, root);
        long currentTimeMillis2 = System.currentTimeMillis();
        MultiTreeNode multiTreeNode3 = new MultiTreeNode(a2);
        if (this.h) {
            ard a3 = arc.a();
            str2 = "createStateTree";
            StringBuilder sb = new StringBuilder();
            str3 = "AURAParseProcessor";
            sb.append("t1 耗时 = ");
            multiTreeNode = multiTreeNode3;
            sb.append(currentTimeMillis2 - currentTimeMillis);
            a3.a(sb.toString(), arc.a.a().a("AURA/performance").a("start", currentTimeMillis).a("end", currentTimeMillis2).b());
        } else {
            str2 = "createStateTree";
            str3 = "AURAParseProcessor";
            multiTreeNode = multiTreeNode3;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(root, a2);
        if (!this.g) {
            multiTreeNode2 = multiTreeNode;
            b(multiTreeNode2, ultronProtocol, jSONObject2);
        } else {
            multiTreeNode2 = multiTreeNode;
        }
        a(multiTreeNode2);
        JSONObject structure = ultronProtocol.getHierarchy().getStructure();
        long currentTimeMillis3 = System.currentTimeMillis();
        a(bVar, ultronProtocol, multiTreeNode2, structure, root, hashMap, jSONObject2);
        long currentTimeMillis4 = System.currentTimeMillis();
        if (this.h) {
            ard a4 = arc.a();
            str4 = "end";
            a4.a("状态树遍历 耗时 = " + (currentTimeMillis4 - currentTimeMillis3), arc.a.a().a("AURA/performance").a("start", currentTimeMillis3).a(str4, currentTimeMillis4).a("树节点数量", multiTreeNode2.size()).b());
        } else {
            str4 = "end";
        }
        long currentTimeMillis5 = System.currentTimeMillis();
        MultiTreeNode multiTreeNode4 = new MultiTreeNode(new RenderComponent());
        a(multiTreeNode2, multiTreeNode4);
        ard a5 = arc.a();
        a5.a(str3, str2, "状态树总长：" + multiTreeNode2.size() + ";渲染状态树总长：" + multiTreeNode4.size());
        long currentTimeMillis6 = System.currentTimeMillis();
        if (this.h) {
            ard a6 = arc.a();
            a6.a("渲染状态树遍历 耗时 = " + (currentTimeMillis6 - currentTimeMillis5), arc.a.a().a("AURA/performance").a("start", currentTimeMillis5).a(str4, currentTimeMillis6).b());
        }
        String k = bVar.b().k();
        if (!TextUtils.isEmpty(str)) {
            k = str;
        } else if (TextUtils.isEmpty(k)) {
            k = root;
        }
        bVar.b(com.alibaba.android.umf.node.service.parse.state.a.a(k, jSONObject, ultronProtocol, multiTreeNode2, multiTreeNode4, hashMap, null, null));
    }

    private void a(MultiTreeNode multiTreeNode, MultiTreeNode multiTreeNode2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efe7b2a8", new Object[]{this, multiTreeNode, multiTreeNode2});
        } else if (multiTreeNode != null) {
            for (TreeNode<RenderComponent> treeNode : this.f2173a.subtrees()) {
                multiTreeNode2.add(treeNode);
            }
            multiTreeNode2.add(multiTreeNode);
            this.f2173a.clear();
        }
    }

    private boolean a(final com.alibaba.android.umf.node.service.parse.state.b bVar, UltronDeltaProtocol ultronDeltaProtocol, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("765a1b71", new Object[]{this, bVar, ultronDeltaProtocol, new Boolean(z)})).booleanValue();
        }
        for (Delta delta : ultronDeltaProtocol.getHierarchy().getDelta()) {
            try {
                bVar.a(delta.getOpType(), new bqu(delta, ultronDeltaProtocol, z), new b.a() { // from class: com.alibaba.android.aura.service.parse.AURAParseProcessor.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.alibaba.android.umf.node.service.parse.state.b.a
                    public void a(TreeNode<RenderComponent> treeNode) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("87a5e2c5", new Object[]{this, treeNode});
                            return;
                        }
                        AURAParseProcessor.a(AURAParseProcessor.this, bVar.b().f().get(treeNode.data().key), treeNode.data());
                        MultiTreeNode multiTreeNode = (MultiTreeNode) treeNode;
                        AURAParseProcessor.a(AURAParseProcessor.this, multiTreeNode, bVar.b().i(), (JSONObject) null);
                        AURAParseProcessor.a(AURAParseProcessor.this, multiTreeNode);
                        AURAParseProcessor.a(AURAParseProcessor.this, bVar, multiTreeNode);
                    }
                });
            } catch (Throwable th) {
                this.b.a(new com.alibaba.android.aura.b(0, "AURAParseServiceDomain", "-4000_DELTA_MERGER_EXCEPTION", th.toString()));
                return false;
            }
        }
        return true;
    }

    private void a(com.alibaba.android.umf.node.service.parse.state.b bVar, MultiTreeNode multiTreeNode) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("923cd466", new Object[]{this, bVar, multiTreeNode});
        } else if (!multiTreeNode.isValid()) {
            arc.a().b("AURAParseProcessor", "mergeDeltaData", "current node is not valid!");
        } else {
            String str = multiTreeNode.data().key;
            UltronProtocol i = bVar.b().i();
            Component component = multiTreeNode.data().component;
            if (component != null) {
                i.getData().put(str, component);
            }
            JSONObject j = bVar.b().j();
            if (j == null || (jSONObject = j.getJSONObject("data")) == null) {
                return;
            }
            jSONObject.put(str, (Object) component);
        }
    }

    private Map<String, AURARenderComponent> a(com.alibaba.android.umf.node.service.parse.state.a aVar, AURAGlobalData aURAGlobalData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c4075ce6", new Object[]{this, aVar, aURAGlobalData});
        }
        HashMap hashMap = new HashMap();
        MultiTreeNode d = aVar.d();
        if (d == null) {
            return hashMap;
        }
        Map<String, AURARenderComponent> l = aVar.l();
        JSONObject j = aVar.j();
        for (TreeNode<RenderComponent> treeNode : d.subtrees()) {
            RenderComponent data = treeNode.data();
            if (data != null) {
                String str = data.key;
                if (!TextUtils.isEmpty(str)) {
                    a(aURAGlobalData, treeNode, aVar.k());
                    AURARenderComponent a2 = a((AURARenderComponent) null, treeNode, l);
                    a(treeNode, a2, l, j);
                    hashMap.put(str, a2);
                }
            }
        }
        aVar.a(l);
        return hashMap;
    }

    private void a(AURAGlobalData aURAGlobalData, TreeNode<RenderComponent> treeNode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc978465", new Object[]{this, aURAGlobalData, treeNode, str});
        } else if (TextUtils.isEmpty(str) || !str.equals(treeNode.data().key)) {
        } else {
            aURAGlobalData.update("global_data_render_root", treeNode);
        }
    }

    private AURARenderComponent a(AURARenderComponent aURARenderComponent, TreeNode<RenderComponent> treeNode, Map<String, AURARenderComponent> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURARenderComponent) ipChange.ipc$dispatch("6a0ef800", new Object[]{this, aURARenderComponent, treeNode, map});
        }
        String str = treeNode.data().key;
        AURARenderComponent aURARenderComponent2 = map.get(str);
        if (aURARenderComponent2 == null) {
            aURARenderComponent2 = bst.a(treeNode, aURARenderComponent);
            if (!TextUtils.isEmpty(str)) {
                map.put(str, aURARenderComponent2);
            }
            if (aURARenderComponent != null) {
                aURARenderComponent.addChildComponent(aURARenderComponent2);
            }
        } else {
            a(treeNode, aURARenderComponent2);
        }
        return aURARenderComponent2;
    }

    private void a(TreeNode<RenderComponent> treeNode, AURARenderComponent aURARenderComponent, Map<String, AURARenderComponent> map, JSONObject jSONObject) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("181ab5e1", new Object[]{this, treeNode, aURARenderComponent, map, jSONObject});
        } else if (aURARenderComponent != null && treeNode != null && !treeNode.isLeaf() && treeNode.subtrees() != null) {
            for (TreeNode<RenderComponent> treeNode2 : treeNode.subtrees()) {
                RenderComponent data = treeNode2.data();
                if (data != null && !bst.c(data) && !b(treeNode2)) {
                    if (!this.d.isEmpty()) {
                        Iterator<asp> it = this.d.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (it.next().a(data)) {
                                    z = true;
                                    break;
                                }
                            } else {
                                z = false;
                                break;
                            }
                        }
                        if (z) {
                            continue;
                        }
                    }
                    AURARenderComponent a2 = a(aURARenderComponent, treeNode2, map);
                    if (data.isPopupWindowNode()) {
                        continue;
                    } else {
                        ComponentView componentView = data.componentView;
                        if (componentView != null && "rax-container".equals(componentView.getContainerType())) {
                            a2.protocol = bst.a(jSONObject, data.key);
                            return;
                        } else if (a(jSONObject, treeNode2, a2)) {
                            return;
                        } else {
                            a(treeNode2, a2, map, jSONObject);
                        }
                    }
                }
            }
        }
    }

    private boolean a(JSONObject jSONObject, TreeNode<RenderComponent> treeNode, AURARenderComponent aURARenderComponent) {
        Component component;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("506662ba", new Object[]{this, jSONObject, treeNode, aURARenderComponent})).booleanValue();
        }
        RenderComponent data = treeNode.data();
        if (data == null || (component = data.component) == null || !component.isIndependentNode()) {
            return false;
        }
        aURARenderComponent.protocol = bst.a(jSONObject, treeNode.data().key);
        return true;
    }

    private boolean b(TreeNode<RenderComponent> treeNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("78f7724a", new Object[]{this, treeNode})).booleanValue();
        }
        if (!this.i || !treeNode.isLeaf()) {
            return false;
        }
        RenderComponent data = treeNode.data();
        if (data == null) {
            return true;
        }
        Component component = data.component;
        return component.getFields() == null || component.getFields().isEmpty();
    }

    private void a(TreeNode<RenderComponent> treeNode, AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("862d55d6", new Object[]{this, treeNode, aURARenderComponent});
            return;
        }
        RenderComponent data = treeNode.data();
        aURARenderComponent.key = data.key;
        aURARenderComponent.data = bst.a(data);
        aURARenderComponent.data.layout = bst.b(data);
    }

    private void a(AURAGlobalData aURAGlobalData, com.alibaba.android.umf.node.service.parse.state.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d81718a", new Object[]{this, aURAGlobalData, bVar});
            return;
        }
        com.alibaba.android.umf.node.service.parse.state.a b = bVar.b();
        String k = b.k();
        if (this.b == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        AURARenderComponent a2 = a(k, b, aURAGlobalData);
        aURAGlobalData.update("aura_parse_global_data_parse", bVar);
        aURAGlobalData.update("aura_data_protocol_json", bVar.b().j());
        aURAGlobalData.update("aura_data_protocol_bean", bVar.b().i());
        long currentTimeMillis2 = System.currentTimeMillis();
        if (this.h) {
            ard a3 = arc.a();
            a3.a("生成渲染树 耗时 = " + (currentTimeMillis2 - currentTimeMillis), arc.a.a().a("AURA/performance").a("start", currentTimeMillis).a("end", currentTimeMillis2).b());
        }
        this.b.a(a2);
    }

    private AURARenderComponent a(String str, com.alibaba.android.umf.node.service.parse.state.a aVar, AURAGlobalData aURAGlobalData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURARenderComponent) ipChange.ipc$dispatch("fdc1d212", new Object[]{this, str, aVar, aURAGlobalData});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        AURARenderComponent aURARenderComponent = a(aVar, aURAGlobalData).get(str);
        if (aURARenderComponent == null) {
            arc.a().a("渲染树为null", arc.a.a().b("AURAParseProcessor").a("AURA/error").a("renderRootKey", str).b());
        }
        return aURARenderComponent;
    }

    private void a(com.alibaba.android.umf.node.service.parse.state.b bVar, UltronProtocol ultronProtocol, TreeNode<RenderComponent> treeNode, JSONObject jSONObject, String str, Map<String, RenderComponent> map, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a568fc7", new Object[]{this, bVar, ultronProtocol, treeNode, jSONObject, str, map, jSONObject2});
            return;
        }
        JSONArray jSONArray = jSONObject.getJSONArray(str);
        if (jSONArray == null) {
            return;
        }
        for (int i = 0; i < jSONArray.size(); i++) {
            String string = jSONArray.getString(i);
            if (!TextUtils.isEmpty(string)) {
                RenderComponent a2 = asr.a(ultronProtocol, string);
                a(bVar.b().f().get(string), a2);
                map.put(string, a2);
                MultiTreeNode multiTreeNode = new MultiTreeNode(a2);
                treeNode.add(multiTreeNode);
                if (!this.g) {
                    b(multiTreeNode, ultronProtocol, jSONObject2);
                }
                a(multiTreeNode);
                a(bVar, ultronProtocol, multiTreeNode, jSONObject, string, map, jSONObject2);
            }
        }
    }

    private void a(RenderComponent renderComponent, RenderComponent renderComponent2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d69a176", new Object[]{this, renderComponent, renderComponent2});
        } else if (renderComponent != null && renderComponent.component != null && renderComponent.component.getLocalFields() != null) {
            if (renderComponent2.component == null) {
                renderComponent2.component = new Component();
            }
            renderComponent2.component.localFields = renderComponent.component.getLocalFields();
            if (renderComponent2.component.getLocalFields() == null) {
                return;
            }
            for (Map.Entry<String, Object> entry : renderComponent2.component.getLocalFields().entrySet()) {
                String key = entry.getKey();
                if (!TextUtils.isEmpty(key)) {
                    renderComponent2.component.getFields().put(key, entry.getValue());
                }
            }
        }
    }

    private void a(MultiTreeNode multiTreeNode, UltronProtocol ultronProtocol, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8d5cff1", new Object[]{this, multiTreeNode, ultronProtocol, jSONObject});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (aso asoVar : this.j) {
            if (asoVar.c()) {
                arrayList.add(asoVar);
            } else {
                arrayList2.add(asoVar);
            }
        }
        for (TreeNode<RenderComponent> treeNode : multiTreeNode.preOrdered()) {
            if (!baz.a("disableStreamParseEach", true) || jSONObject == null || jSONObject.containsKey(treeNode.data().getKey())) {
                a((MultiTreeNode) treeNode, ultronProtocol, arrayList, arrayList2);
            }
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        arc.a().a("执行扩展点共 耗时 = " + (currentTimeMillis2 - currentTimeMillis), arc.a.a().a("AURA/performance").a("message", "主线程任务：" + arrayList.size() + " 工作线程任务：" + arrayList2.size()).a("start", currentTimeMillis).a("end", currentTimeMillis2).b());
    }

    private void b(MultiTreeNode multiTreeNode, UltronProtocol ultronProtocol, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c88d8272", new Object[]{this, multiTreeNode, ultronProtocol, jSONObject});
        } else if (!baz.a("disableStreamParseEach", true) || jSONObject == null || jSONObject.containsKey(multiTreeNode.data().getKey())) {
            for (asq asqVar : this.c) {
                asqVar.a(multiTreeNode, ultronProtocol);
            }
        }
    }

    private void a(final MultiTreeNode multiTreeNode, final UltronProtocol ultronProtocol, List<aso> list, final List<aso> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5305ec1", new Object[]{this, multiTreeNode, ultronProtocol, list, list2});
            return;
        }
        bbh.a(new Runnable() { // from class: com.alibaba.android.aura.service.parse.AURAParseProcessor.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    AURAParseProcessor.a(AURAParseProcessor.this, multiTreeNode, ultronProtocol, list2);
                }
            }
        });
        a(multiTreeNode, ultronProtocol, list);
    }

    private void a(MultiTreeNode multiTreeNode, UltronProtocol ultronProtocol, List<aso> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("333f71d0", new Object[]{this, multiTreeNode, ultronProtocol, list});
            return;
        }
        for (aso asoVar : list) {
            asoVar.a(multiTreeNode, ultronProtocol);
        }
    }

    private void a(MultiTreeNode multiTreeNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d067f872", new Object[]{this, multiTreeNode});
        } else if (multiTreeNode.data() == null || !multiTreeNode.data().isPopupWindowNode() || multiTreeNode.isRoot()) {
        } else {
            a((TreeNode<RenderComponent>) multiTreeNode);
            this.f2173a.add(multiTreeNode);
        }
    }

    private boolean a(List<com.alibaba.android.aura.datamodel.parse.a> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c705295d", new Object[]{this, list})).booleanValue();
        }
        for (com.alibaba.android.aura.datamodel.parse.a aVar : list) {
            JSONObject a2 = aVar.a();
            if (a2 != null && asr.a(a2)) {
                a(0, "-3003_PROTOCOL_DEGRADE", "endpoint包含degrade，协议降级", (HashMap<String, Object>) null);
                return false;
            }
        }
        return true;
    }

    private boolean a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("266fb8c", new Object[]{this, jSONObject})).booleanValue();
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject(AURASubmitEvent.RPC_ENDPOINT);
        if (jSONObject2 == null) {
            a(0, "-2003_EMPTY_ENDPOINT", "全量协议protocol[endpoint]为空", (HashMap<String, Object>) null);
            return true;
        }
        String string = jSONObject2.getString("protocolVersion");
        if (TextUtils.isEmpty(string) || string.compareTo("4.0") < 0) {
            HashMap<String, Object> hashMap = new HashMap<>();
            if (string.compareTo("3.0") == 0) {
                hashMap.put("NextRPCRemoteResponseJson", jSONObject);
            }
            a(0, "-3000_EMPTY_PROTOCOL_VERSION_BELOW_4", "全量协议endpoint[protocolVersion]小于4.0版本", hashMap);
            return true;
        }
        for (asq asqVar : this.c) {
            String a2 = asqVar.a(jSONObject2);
            if (!"0".equals(a2)) {
                a(0, a2, "自定义error", (HashMap<String, Object>) null);
                return true;
            }
        }
        return false;
    }

    private void a(int i, String str, String str2, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df253624", new Object[]{this, new Integer(i), str, str2, hashMap});
        } else if (this.b == null) {
        } else {
            com.alibaba.android.aura.b bVar = new com.alibaba.android.aura.b(i, "AURAParseServiceDomain", str, str2);
            if (hashMap != null) {
                bVar.a(hashMap);
            }
            this.b.a(bVar);
        }
    }

    private void a(TreeNode<RenderComponent> treeNode) {
        RenderComponent data;
        RenderComponent data2;
        Component component;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87a5e2c5", new Object[]{this, treeNode});
            return;
        }
        TreeNode<RenderComponent> parent = treeNode.parent();
        if (parent == null || (data = parent.data()) == null || (data2 = treeNode.data()) == null || TextUtils.isEmpty(data2.key) || (component = data2.component) == null || component.getFields() == null) {
            return;
        }
        Object obj = component.getFields().get("code");
        if (!(obj instanceof String)) {
            return;
        }
        data.getComponent().addCodePopupWindow((String) obj, data2);
    }
}
