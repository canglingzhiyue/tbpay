package com.alibaba.android.aura.nodemodel.workflow;

import com.alibaba.android.aura.nodemodel.branch.c;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class AURAExecuteNodeModel implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "branch")
    public c branch;
    public String code;
    public Map<String, List<AURAExecuteNodeModel>> extensions;
    public String type;

    static {
        kge.a(932369938);
        kge.a(1028243835);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "code=" + this.code + ", type=" + this.type;
    }
}
