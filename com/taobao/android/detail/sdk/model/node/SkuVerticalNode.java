package com.taobao.android.detail.sdk.model.node;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.utils.c;
import com.taobao.android.detail.sdk.utils.g;
import java.util.List;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class SkuVerticalNode extends DetailNode {
    public List<ContractNode> contractNode;
    public InstallmentNode installmentNode;

    static {
        kge.a(-1773495602);
    }

    public SkuVerticalNode(JSONObject jSONObject) {
        super(jSONObject);
        tpc.a("com.taobao.android.detail.sdk.model.node.SkuVerticalNode");
        try {
            this.installmentNode = new InstallmentNode(jSONObject.getJSONObject("installment"));
        } catch (Throwable unused) {
        }
        try {
            this.contractNode = c.a(jSONObject.getJSONArray("contractData"), new g<ContractNode>() { // from class: com.taobao.android.detail.sdk.model.node.SkuVerticalNode.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.android.detail.sdk.model.node.ContractNode, java.lang.Object] */
                @Override // com.taobao.android.detail.sdk.utils.g
                public /* synthetic */ ContractNode b(Object obj) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? ipChange.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
                }

                public ContractNode a(Object obj) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (ContractNode) ipChange.ipc$dispatch("509287fa", new Object[]{this, obj}) : new ContractNode((JSONObject) obj);
                }
            });
        } catch (Throwable unused2) {
        }
    }
}
