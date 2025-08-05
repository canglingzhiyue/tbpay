package tb;

import com.alibaba.android.aura.AURAInputData;
import com.alibaba.android.aura.b;
import com.alibaba.android.aura.datamodel.c;
import com.alibaba.android.aura.datamodel.linkage.UMFLinkageTrigger;
import com.alibaba.android.aura.datamodel.nextrpc.AURANextRPCEndpoint;
import com.alibaba.android.aura.datamodel.nextrpc.AURANextRPCIO;
import com.alibaba.android.aura.taobao.adapter.extension.linkage.service.utils.LinkageUtils;
import com.alibaba.android.aura.taobao.adapter.extension.linkage.service.utils.a;
import com.alibaba.android.umf.datamodel.protocol.ultron.UltronProtocol;
import com.alibaba.android.umf.node.service.parse.state.tree.MultiTreeNode;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class ayr extends arj<UMFLinkageTrigger, AURANextRPCIO> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CODE = "aura.service.linkage.adjust";
    public static final String HEADER_FEATURE_KEY = "feature";
    public static final String HEADER_FEATURE_VAL = "{\"gzip\":\"true\"}";

    static {
        kge.a(-79691538);
    }

    public static /* synthetic */ Object ipc$super(ayr ayrVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode != 339629984) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.a((AURAInputData) objArr[0], (aqq) objArr[1]);
            return null;
        }
    }

    @Override // tb.arj
    public void a(AURAInputData<UMFLinkageTrigger> aURAInputData, aqq<AURANextRPCIO> aqqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("143e57a0", new Object[]{this, aURAInputData, aqqVar});
            return;
        }
        super.a(aURAInputData, aqqVar);
        UMFLinkageTrigger data = aURAInputData.getData();
        if (data == null) {
            b bVar = new b(0, "AURALinkagePluginDomain", "-1000_INVALID_TRIGGER", "回收插件服务输入的linkageTrigger为空");
            bVar.a(a());
            aqqVar.a(bVar);
            return;
        }
        MultiTreeNode multiTreeNode = (MultiTreeNode) aURAInputData.getGlobalData().get(ayj.GLOBAL_DATA_STATE_TREE, MultiTreeNode.class);
        UltronProtocol ultronProtocol = (UltronProtocol) aURAInputData.getGlobalData().get(ayj.GLOBAL_DATA_PROTOCOL, UltronProtocol.class);
        HashMap hashMap = new HashMap();
        try {
            JSONObject a2 = LinkageUtils.a(multiTreeNode, ultronProtocol, data, true);
            if (a2 != null) {
                for (ayt aytVar : getExtensionManager().b(ayt.class)) {
                    aytVar.a(a2);
                }
            }
            hashMap.put("params", a.a(JSONObject.toJSONString(a2)));
            hashMap.put("feature", "{\"gzip\":\"true\"}");
        } catch (Throwable th) {
            aqqVar.a(new b(0, "AURALinkagePluginDomain", "-1000_INVALID_TRIGGER", th.getMessage()));
        }
        ayv ayvVar = (ayv) getExtensionManager().a(ayv.class);
        if (ayvVar == null) {
            b bVar2 = new b(0, "AURALinkagePluginDomain", "-2000_EMPTY_EXTENSION", "回收插件服务扩展点未实现");
            bVar2.a(a());
            aqqVar.a(bVar2);
            return;
        }
        AURANextRPCEndpoint a3 = ayvVar.a();
        String b = ayvVar.b();
        if (a3 == null) {
            b bVar3 = new b(0, "AURALinkagePluginDomain", "-2001_EMPTY_EXTENSION_ENDPOINT", "回收插件服务扩展点未实现getEndpoint扩展点");
            bVar3.a(a());
            aqqVar.a(bVar3);
            return;
        }
        a3.appendParams(hashMap);
        aqqVar.a(c.a(new AURANextRPCIO(b, a3), aURAInputData));
    }

    private Map<String, Object> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("linkageType", "adjust");
        return hashMap;
    }

    @Override // com.alibaba.android.aura.n, tb.arl
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            super.onDestroy();
        }
    }
}
