package com.alibaba.android.umf.node.model.v2;

import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class UMFServiceNodeModel extends UMFBaseNodeModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Map<String, List<UMFServiceExtensionNodeModel>> extensionModelMap;
    @JSONField(name = "extensions")
    public Map<String, List<String>> extensions;

    static {
        kge.a(-1788976578);
    }

    @Override // com.alibaba.android.umf.node.model.IUMFNodeModel
    public String getNodeType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("35374867", new Object[]{this}) : "service";
    }

    public Map<String, List<UMFServiceExtensionNodeModel>> getExtensionModel() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a043a19c", new Object[]{this}) : this.extensionModelMap;
    }

    public void addExtensionModel(String str, UMFServiceExtensionNodeModel uMFServiceExtensionNodeModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8000e5a", new Object[]{this, str, uMFServiceExtensionNodeModel});
            return;
        }
        if (this.extensionModelMap == null) {
            this.extensionModelMap = new HashMap();
        }
        List<UMFServiceExtensionNodeModel> list = this.extensionModelMap.get(str);
        if (list == null) {
            list = new ArrayList<>();
            this.extensionModelMap.put(str, list);
        }
        if (list.contains(uMFServiceExtensionNodeModel)) {
            return;
        }
        list.add(uMFServiceExtensionNodeModel);
    }
}
