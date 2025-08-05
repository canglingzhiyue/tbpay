package com.taobao.android.detail.datasdk.model.datamodel.node;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.emu;
import tb.epw;
import tb.epy;
import tb.kge;

/* loaded from: classes4.dex */
public class SkuVerticalNode extends DetailNode {
    public static final String TAG = "skuVertical";
    public List<ContractNode> contractNode;
    public InstallmentNode installmentNode;

    static {
        kge.a(1240321480);
    }

    public SkuVerticalNode(JSONObject jSONObject) {
        super(jSONObject);
        try {
            this.installmentNode = new InstallmentNode(jSONObject.getJSONObject("installment"));
        } catch (Throwable unused) {
        }
        try {
            this.contractNode = epw.a(jSONObject.getJSONArray("contractData"), new epy<ContractNode>() { // from class: com.taobao.android.detail.datasdk.model.datamodel.node.SkuVerticalNode.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.android.detail.datasdk.model.datamodel.node.ContractNode, java.lang.Object] */
                @Override // tb.epy
                public /* synthetic */ ContractNode b(Object obj) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? ipChange.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
                }

                public ContractNode a(Object obj) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (ContractNode) ipChange.ipc$dispatch("2831e3f4", new Object[]{this, obj}) : new ContractNode((JSONObject) obj);
                }
            });
        } catch (Throwable unused2) {
        }
        emu.a("com.taobao.android.detail.datasdk.model.datamodel.node.SkuVerticalNode");
    }
}
