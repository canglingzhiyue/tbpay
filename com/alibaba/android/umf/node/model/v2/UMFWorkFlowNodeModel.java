package com.alibaba.android.umf.node.model.v2;

import com.alibaba.android.umf.node.model.IUMFNodeModel;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes2.dex */
public class UMFWorkFlowNodeModel extends UMFBaseNodeModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "type")
    public String type;
    private List<IUMFNodeModel> workFlowNodeModels;
    @JSONField(name = "nodes")
    public List<String> workFlowNodes;

    static {
        kge.a(1515582332);
    }

    @Override // com.alibaba.android.umf.node.model.IUMFNodeModel
    public String getNodeType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("35374867", new Object[]{this}) : "workFlow";
    }

    public List<IUMFNodeModel> getWorkFlowNodeModels() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("51bd82ff", new Object[]{this}) : this.workFlowNodeModels;
    }

    public void addNodeModel(IUMFNodeModel iUMFNodeModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5883dcb", new Object[]{this, iUMFNodeModel});
            return;
        }
        if (this.workFlowNodeModels == null) {
            this.workFlowNodeModels = new ArrayList();
        }
        this.workFlowNodeModels.add(iUMFNodeModel);
    }
}
