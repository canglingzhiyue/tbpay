package com.alibaba.android.aura.datamodel.render;

import com.alibaba.android.umf.node.service.parse.state.RenderComponent;
import com.alibaba.android.umf.node.service.parse.state.tree.TreeNode;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import tb.baz;
import tb.bbc;
import tb.bbk;
import tb.kge;

/* loaded from: classes2.dex */
public class AURARenderComponent implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_ASYNC_STATUS = "asyncStatus";
    private static final long serialVersionUID = 3021285964321808330L;
    public List<AURARenderComponent> children;
    public AURARenderComponentData data;
    public String key;
    @JSONField(serialize = false)
    public TreeNode<RenderComponent> mirror;
    @JSONField(serialize = false)
    public AURARenderComponent parent;
    public JSONObject protocol;

    static {
        kge.a(647518982);
        kge.a(1028243835);
    }

    @JSONField(serialize = false)
    public void addChildComponent(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("585b7652", new Object[]{this, aURARenderComponent});
            return;
        }
        if (this.children == null) {
            this.children = new ArrayList();
        }
        aURARenderComponent.parent = this;
        this.children.add(aURARenderComponent);
    }

    @JSONField(serialize = false)
    public boolean isValidLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aa87ed47", new Object[]{this})).booleanValue();
        }
        AURARenderComponentData aURARenderComponentData = this.data;
        return (aURARenderComponentData == null || aURARenderComponentData.layout == null || bbk.a(this.data.layout.type)) ? false : true;
    }

    @JSONField(serialize = false)
    public TreeNode<RenderComponent> getMirror() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TreeNode) ipChange.ipc$dispatch("df319c77", new Object[]{this}) : this.mirror;
    }

    @JSONField(serialize = false)
    public boolean isAsync() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e0622afd", new Object[]{this})).booleanValue();
        }
        AURARenderComponentData aURARenderComponentData = this.data;
        if (aURARenderComponentData != null && aURARenderComponentData.fields != null) {
            return this.data.fields.get("asyncStatus") instanceof String;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0062, code lost:
        if (r0.equals("success") != false) goto L22;
     */
    @com.alibaba.fastjson.annotation.JSONField(serialize = false)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String asyncStatus() {
        /*
            r11 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.alibaba.android.aura.datamodel.render.AURARenderComponent.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L15
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r2] = r11
            java.lang.String r2 = "f26e622b"
            java.lang.Object r0 = r0.ipc$dispatch(r2, r1)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L15:
            com.alibaba.android.aura.datamodel.render.AURARenderComponentData r0 = r11.data
            java.lang.String r1 = "none"
            if (r0 == 0) goto L70
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.fields
            if (r0 != 0) goto L20
            goto L70
        L20:
            com.alibaba.android.aura.datamodel.render.AURARenderComponentData r0 = r11.data
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.fields
            java.lang.String r4 = "asyncStatus"
            java.lang.Object r0 = r0.get(r4)
            boolean r4 = r0 instanceof java.lang.String
            if (r4 != 0) goto L2f
            return r1
        L2f:
            java.lang.String r0 = (java.lang.String) r0
            r4 = -1
            int r5 = r0.hashCode()
            r6 = -1867169789(0xffffffff90b54003, float:-7.149054E-29)
            java.lang.String r7 = "init"
            java.lang.String r8 = "failed"
            java.lang.String r9 = "success"
            r10 = 2
            if (r5 == r6) goto L5e
            r2 = -1281977283(0xffffffffb396943d, float:-7.011884E-8)
            if (r5 == r2) goto L56
            r2 = 3237136(0x316510, float:4.536194E-39)
            if (r5 == r2) goto L4e
            goto L65
        L4e:
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L65
            r2 = 2
            goto L66
        L56:
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L65
            r2 = 1
            goto L66
        L5e:
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L65
            goto L66
        L65:
            r2 = -1
        L66:
            if (r2 == 0) goto L6f
            if (r2 == r3) goto L6e
            if (r2 == r10) goto L6d
            return r1
        L6d:
            return r7
        L6e:
            return r8
        L6f:
            return r9
        L70:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.android.aura.datamodel.render.AURARenderComponent.asyncStatus():java.lang.String");
    }

    @JSONField(serialize = false)
    public boolean isRoot() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c6b36bb7", new Object[]{this})).booleanValue() : this.parent == null;
    }

    @JSONField(serialize = false)
    public boolean isRenderAbleLeaf() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a70bbe3", new Object[]{this})).booleanValue();
        }
        if (isValidLayout()) {
            return false;
        }
        if (isAURALeafNode()) {
            return true;
        }
        return isContainerTypeValid() && isLeaf();
    }

    private boolean isContainerTypeValid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b21e336", new Object[]{this})).booleanValue();
        }
        AURARenderComponentData aURARenderComponentData = this.data;
        return (aURARenderComponentData == null || aURARenderComponentData.container == null || bbk.a(this.data.container.containerType)) ? false : true;
    }

    public boolean isLeaf() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2dc4ec33", new Object[]{this})).booleanValue();
        }
        List<AURARenderComponent> list = this.children;
        return list == null || list.isEmpty();
    }

    private boolean isAURALeafNode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d11fcd38", new Object[]{this})).booleanValue();
        }
        AURARenderComponentData aURARenderComponentData = this.data;
        if (aURARenderComponentData != null && aURARenderComponentData.fields != null) {
            return "true".equalsIgnoreCase((String) bbc.a(this.data.fields, "isAURALeafNode", String.class, "false"));
        }
        return false;
    }

    public boolean isInvisible() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab07fcae", new Object[]{this})).booleanValue();
        }
        AURARenderComponentData aURARenderComponentData = this.data;
        if (aURARenderComponentData != null && aURARenderComponentData.fields != null) {
            boolean z = this.data.fields.containsKey("ignoreWhenNoData") && Boolean.parseBoolean((String) bbc.a(this.data.fields, "ignoreWhenNoData", String.class, "false"));
            int size = this.data.fields.size();
            if (1 != size) {
                z = 2 == size && z && this.data.fields.containsKey("cornerType");
            }
            if (z) {
                return true;
            }
            String str = (String) bbc.a(this.data.fields, "visible", String.class, "true");
            if (baz.a("enableFilterInvisibleNode", true) && "false".equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    public String getContainerType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c6db7474", new Object[]{this});
        }
        AURARenderComponentData aURARenderComponentData = this.data;
        if (aURARenderComponentData != null && aURARenderComponentData.container != null) {
            return this.data.container.containerType;
        }
        return null;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "AURARenderComponent{, key='" + this.key + "', data=" + this.data + '}';
    }
}
