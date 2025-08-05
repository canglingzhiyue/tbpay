package tb;

import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.b;
import com.alibaba.android.aura.datamodel.linkage.UMFLinkageTrigger;
import com.alibaba.android.aura.datamodel.nextrpc.AURANextRPCEndpoint;
import com.alibaba.android.aura.datamodel.nextrpc.a;
import com.alibaba.android.aura.taobao.adapter.extension.linkage.service.utils.LinkageUtils;
import com.alibaba.android.umf.datamodel.protocol.ultron.UltronProtocol;
import com.alibaba.android.umf.node.service.parse.state.tree.MultiTreeNode;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

@AURAExtensionImpl(code = ayk.CODE)
/* loaded from: classes2.dex */
public final class ayk extends asf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BRANCH_CODE_ENABLE_SUBMIT_UPLOAD_TRIGGER = "aura.branch.enableSubmitUploadTrigger";
    public static final String CODE = "aura.impl.nextrpc.submit";
    public static final String HEADER_FEATURE_KEY = "feature";
    public static final String HEADER_FEATURE_VAL = "{\"gzip\":\"true\"}";

    /* renamed from: a  reason: collision with root package name */
    private MultiTreeNode f25690a;
    private UltronProtocol b;
    private aqs c;

    static {
        kge.a(1321135077);
    }

    public static /* synthetic */ Object ipc$super(ayk aykVar, String str, Object... objArr) {
        if (str.hashCode() == 563256106) {
            super.onDataChanged((AURAFlowData) objArr[0], (AURAGlobalData) objArr[1], (aqs) objArr[2]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.asf, tb.asg
    public void a(AURANextRPCEndpoint aURANextRPCEndpoint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24827ecb", new Object[]{this, aURANextRPCEndpoint});
        }
    }

    @Override // tb.asf, tb.asg
    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6572dace", new Object[]{this, aVar});
        }
    }

    @Override // tb.asf, tb.asg
    public Map<String, String> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[]{this});
        }
        return null;
    }

    @Override // tb.asf, tb.asg
    public Map<String, String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this});
        }
        try {
            JSONObject a2 = LinkageUtils.a(this.f25690a, this.b, (UMFLinkageTrigger) null, false);
            if (a2 != null) {
                for (ayu ayuVar : d().b(ayu.class)) {
                    ayuVar.a(a2);
                }
            }
            String jSONString = JSONObject.toJSONString(a2);
            HashMap hashMap = new HashMap();
            hashMap.put("params", com.alibaba.android.aura.taobao.adapter.extension.linkage.service.utils.a.a(jSONString));
            hashMap.put("feature", "{\"gzip\":\"true\"}");
            return hashMap;
        } catch (Throwable th) {
            aqs aqsVar = this.c;
            if (aqsVar != null) {
                aqsVar.a(new b(1, "AURALinkagePluginDomain", "-3001_SUBMIT_CREATE_PARAM", th.getMessage()));
            }
            return null;
        }
    }

    @Override // tb.asf, tb.ark
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21929b2a", new Object[]{this, aURAFlowData, aURAGlobalData, aqsVar});
            return;
        }
        super.onDataChanged(aURAFlowData, aURAGlobalData, aqsVar);
        this.c = aqsVar;
        this.f25690a = (MultiTreeNode) aURAGlobalData.get(ayj.GLOBAL_DATA_STATE_TREE, MultiTreeNode.class);
        this.b = (UltronProtocol) aURAGlobalData.get(ayj.GLOBAL_DATA_PROTOCOL, UltronProtocol.class);
    }
}
