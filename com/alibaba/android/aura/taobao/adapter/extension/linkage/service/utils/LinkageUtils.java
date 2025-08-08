package com.alibaba.android.aura.taobao.adapter.extension.linkage.service.utils;

import mtopsdk.common.util.StringUtils;
import com.alibaba.android.aura.datamodel.linkage.UMFLinkageTrigger;
import com.alibaba.android.aura.taobao.adapter.extension.linkage.event.AURASubmitEvent;
import com.alibaba.android.umf.datamodel.protocol.ultron.UltronProtocol;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Component;
import com.alibaba.android.umf.node.service.parse.state.RenderComponent;
import com.alibaba.android.umf.node.service.parse.state.tree.MultiTreeNode;
import com.alibaba.android.umf.node.service.parse.state.tree.TreeNode;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collection;
import tb.bst;
import tb.kge;

/* loaded from: classes2.dex */
public class LinkageUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface PolicyType {
        public static final String ALL = "all";
        public static final String CHILDREN = "children";
        public static final String RULE = "rule";
        public static final String SELF = "self";
    }

    static {
        kge.a(-834537804);
    }

    public static JSONObject a(MultiTreeNode multiTreeNode, UltronProtocol ultronProtocol, UMFLinkageTrigger uMFLinkageTrigger, boolean z) throws CloneNotSupportedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f0b7ad22", new Object[]{multiTreeNode, ultronProtocol, uMFLinkageTrigger, new Boolean(z)});
        }
        if (multiTreeNode == null || ultronProtocol == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("linkage", ultronProtocol.getLinkage());
        jSONObject.put("hierarchy", ultronProtocol.getHierarchy());
        jSONObject.put(AURASubmitEvent.RPC_ENDPOINT, ultronProtocol.getEndpoint());
        JSONObject a2 = a(multiTreeNode.postOrdered(), z ? "input" : "submit");
        if (uMFLinkageTrigger != null) {
            String triggerComponentKey = uMFLinkageTrigger.getTriggerComponentKey();
            String eventKey = uMFLinkageTrigger.getEventKey();
            String action = uMFLinkageTrigger.getAction();
            TreeNode<RenderComponent> a3 = bst.a(multiTreeNode, triggerComponentKey);
            if (a3 != null && a3.data() != null && a3.data().getComponent() != null) {
                Component component = a3.data().getComponent();
                a2.put(a3.data().getKey(), (Object) component);
                a(a3, component, z);
            }
            MultiTreeNode stateTree = uMFLinkageTrigger.getStateTree();
            if (bst.a(stateTree, triggerComponentKey) != null) {
                a2.putAll(a((TreeNode<RenderComponent>) stateTree, true, true));
            }
            if (!StringUtils.isEmpty(triggerComponentKey)) {
                jSONObject.put("operator", (Object) triggerComponentKey);
            }
            if (!StringUtils.isEmpty(eventKey)) {
                jSONObject.put("operatorEvent", (Object) eventKey);
            }
            if (!StringUtils.isEmpty(action)) {
                jSONObject.put("operatorAction", (Object) action);
            }
        }
        jSONObject.put("data", (Object) a2);
        jSONObject.put("operatorTime", Long.valueOf(System.currentTimeMillis()));
        return jSONObject;
    }

    private static JSONObject a(Collection<TreeNode<RenderComponent>> collection, String str) throws CloneNotSupportedException {
        Component component;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a4dd90c3", new Object[]{collection, str});
        }
        JSONObject jSONObject2 = new JSONObject();
        for (TreeNode<RenderComponent> treeNode : collection) {
            RenderComponent data = treeNode.data();
            if (data != null && (component = data.getComponent()) != null) {
                Component m149clone = component.m149clone();
                Object features = m149clone.getFeatures();
                if ((features instanceof JSONObject) && (jSONObject = ((JSONObject) features).getJSONObject("linkage")) != null && jSONObject.getBooleanValue(str) && !StringUtils.isEmpty(data.getKey())) {
                    jSONObject2.put(data.getKey(), (Object) m149clone);
                }
            }
        }
        return jSONObject2;
    }

    private static void a(TreeNode<RenderComponent> treeNode, Component component, boolean z) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66865f75", new Object[]{treeNode, component, new Boolean(z)});
        } else if (component == null) {
        } else {
            Object features = component.getFeatures();
            if (!(features instanceof JSONObject) || (jSONObject = ((JSONObject) features).getJSONObject("linkage")) == null) {
                return;
            }
            a(treeNode, component, jSONObject, z);
        }
    }

    private static void a(TreeNode<RenderComponent> treeNode, Component component, JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6df40163", new Object[]{treeNode, component, jSONObject, new Boolean(z)});
            return;
        }
        String string = jSONObject.getString(z ? "adjustPolicy" : "submitPolicy");
        if (StringUtils.isEmpty(string)) {
            return;
        }
        char c = 65535;
        int hashCode = string.hashCode();
        if (hashCode != 96673) {
            if (hashCode != 3512060) {
                if (hashCode == 1659526655 && string.equals("children")) {
                    c = 1;
                }
            } else if (string.equals(PolicyType.RULE)) {
                c = 2;
            }
        } else if (string.equals("all")) {
            c = 0;
        }
        if (c != 0 && c != 1) {
            return;
        }
        component.setChildren(a(treeNode, false, false));
    }

    private static JSONObject a(TreeNode<RenderComponent> treeNode, boolean z, boolean z2) {
        RenderComponent data;
        Component component;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c0c3f725", new Object[]{treeNode, new Boolean(z), new Boolean(z2)});
        }
        JSONObject jSONObject2 = new JSONObject();
        if (treeNode == null) {
            return jSONObject2;
        }
        for (TreeNode<RenderComponent> treeNode2 : treeNode.preOrdered()) {
            if (treeNode2 != null && (data = treeNode2.data()) != null && (component = data.getComponent()) != null) {
                String key = data.getKey();
                if (!StringUtils.isEmpty(key)) {
                    if (z2) {
                        Object features = component.getFeatures();
                        if ((features instanceof JSONObject) && (jSONObject = ((JSONObject) features).getJSONObject("linkage")) != null && jSONObject.getString("ref") != null) {
                        }
                    }
                    if (z || treeNode.data() == null || !key.equals(treeNode.data().getKey())) {
                        jSONObject2.put(key, (Object) component);
                    }
                }
            }
        }
        return jSONObject2;
    }
}
