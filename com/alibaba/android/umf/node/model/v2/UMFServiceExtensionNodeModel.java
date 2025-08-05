package com.alibaba.android.umf.node.model.v2;

import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.trtc.api.TrtcConstants;
import tb.kge;

/* loaded from: classes2.dex */
public class UMFServiceExtensionNodeModel extends UMFBaseNodeModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "priority")
    public int priority;

    static {
        kge.a(725752497);
    }

    @Override // com.alibaba.android.umf.node.model.IUMFNodeModel
    public String getNodeType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("35374867", new Object[]{this}) : TrtcConstants.TRTC_PARAMS_EXTENSION;
    }
}
