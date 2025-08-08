package com.taobao.android.purchase.aura.extension.utTrack;

import mtopsdk.common.util.StringUtils;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.nextrpc.AURANextRPCEndpoint;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.alibaba.android.umf.datamodel.protocol.ultron.Global;
import com.alibaba.android.umf.datamodel.protocol.ultron.UltronProtocol;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Component;
import com.alibaba.android.umf.node.service.parse.state.RenderComponent;
import com.alibaba.android.umf.node.service.parse.state.tree.MultiTreeNode;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.purchase.aura.utils.e;
import com.taobao.android.purchase.core.utils.c;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;
import java.util.Map;
import tb.aqs;
import tb.asg;
import tb.aso;
import tb.bau;
import tb.bbc;
import tb.bbh;
import tb.ifz;
import tb.kge;

@AURAExtensionImpl(code = "tbbuy.impl.parse.stateTree.userTrack")
/* loaded from: classes6.dex */
public final class a extends aso implements asg {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private q e;
    private Map<String, Map<String, String>> f;
    private boolean g;
    private Map<String, String> h;

    static {
        kge.a(-1019560236);
        kge.a(-1774324441);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.asg
    public Map<String, String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this});
        }
        return null;
    }

    @Override // tb.asg
    public void a(com.alibaba.android.aura.datamodel.nextrpc.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6572dace", new Object[]{this, aVar});
        }
    }

    @Override // tb.asg
    public Map<String, String> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[]{this});
        }
        return null;
    }

    @Override // tb.asg
    public void b(AURANextRPCEndpoint aURANextRPCEndpoint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15d40e4c", new Object[]{this, aURANextRPCEndpoint});
        }
    }

    @Override // tb.aso
    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.aso, tb.ark
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21929b2a", new Object[]{this, aURAFlowData, aURAGlobalData, aqsVar});
        }
    }

    @Override // tb.aso, tb.arl
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    public static /* synthetic */ void a(a aVar, UltronProtocol ultronProtocol) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2b487c7", new Object[]{aVar, ultronProtocol});
        } else {
            aVar.a(ultronProtocol);
        }
    }

    public static /* synthetic */ void b(a aVar, UltronProtocol ultronProtocol) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4da5a048", new Object[]{aVar, ultronProtocol});
        } else {
            aVar.c(ultronProtocol);
        }
    }

    @Override // tb.aso, tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
            return;
        }
        this.e = qVar;
        this.f = new HashMap();
        this.g = e.c();
    }

    @Override // tb.aso, tb.asq
    public void a(MultiTreeNode multiTreeNode, UltronProtocol ultronProtocol) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b99c82df", new Object[]{this, multiTreeNode, ultronProtocol});
            return;
        }
        RenderComponent data = multiTreeNode.data();
        if (data == null || !this.g) {
            return;
        }
        try {
            a(data);
        } catch (Throwable th) {
            ifz.a("COMPONENTS_UPDATE_EXCEPTION", th.getMessage());
        }
    }

    @Override // tb.aso, tb.asq
    public void b(MultiTreeNode multiTreeNode, final UltronProtocol ultronProtocol) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45d9383e", new Object[]{this, multiTreeNode, ultronProtocol});
        } else {
            bbh.a(new Runnable() { // from class: com.taobao.android.purchase.aura.extension.utTrack.TBBuyUserTrackParserExtension$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    a.a(a.this, ultronProtocol);
                    a.b(a.this, ultronProtocol);
                }
            });
        }
    }

    private void c(UltronProtocol ultronProtocol) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a7c87d7", new Object[]{this, ultronProtocol});
        } else if (!this.g) {
        } else {
            try {
                a(this.h);
                a(ultronProtocol, this.f);
            } catch (Throwable th) {
                ifz.a("TBBuyUserTrackParserExtension_Exception", th.getMessage());
            }
        }
    }

    private void a(UltronProtocol ultronProtocol) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4252155", new Object[]{this, ultronProtocol});
            return;
        }
        try {
            Global global = ultronProtocol.getGlobal();
            if (global == null) {
                return;
            }
            Object params = global.getParams();
            if (!(params instanceof JSONObject)) {
                return;
            }
            UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(this.e.e(), (Map) JSON.toJavaObject((JSONObject) params, Map.class));
        } catch (Throwable th) {
            ifz.a("serverPageUtTracker_Exception", th.getMessage());
        }
    }

    @Override // tb.asg
    public void a(AURANextRPCEndpoint aURANextRPCEndpoint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24827ecb", new Object[]{this, aURANextRPCEndpoint});
        } else {
            this.h = aURANextRPCEndpoint.getDataParams();
        }
    }

    private void a(RenderComponent renderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcc341cf", new Object[]{this, renderComponent});
            return;
        }
        String containerType = renderComponent.componentView.getContainerType();
        if (!StringUtils.isEmpty(containerType) && containerType.contains("layout")) {
            return;
        }
        Map<String, Object> fields = renderComponent.component.getFields();
        if (bau.a(fields)) {
            return;
        }
        String str = (String) bbc.a(fields, "state", String.class, "");
        HashMap hashMap = new HashMap();
        if (!StringUtils.isEmpty(str)) {
            hashMap.put("state", str);
        }
        this.f.put(renderComponent.key, hashMap);
    }

    private void a(UltronProtocol ultronProtocol, Map<String, Map<String, String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8954590", new Object[]{this, ultronProtocol, map});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("components", JSONObject.toJSONString(map));
        String b = b(ultronProtocol);
        if (!StringUtils.isEmpty(b)) {
            hashMap.put("aura.userMark.dyeingInfo", b);
        }
        c.a("Page_NewConfirmOrder_OrderBuildResponseInfo", hashMap);
    }

    private String b(UltronProtocol ultronProtocol) {
        Component component;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("38a61eca", new Object[]{this, ultronProtocol});
        }
        if (ultronProtocol.getHierarchy() != null && ultronProtocol.getData() != null) {
            String root = ultronProtocol.getHierarchy().getRoot();
            if (!StringUtils.isEmpty(root) && (component = ultronProtocol.getData().get(root)) != null && (component.getFeatures() instanceof JSONObject)) {
                return ((JSONObject) component.getFeatures()).getString("dyeingInfo");
            }
        }
        return null;
    }

    private void a(final Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else if (map == null) {
        } else {
            c.a("Page_NewConfirmOrder_OrderBuildRequestInfo", new HashMap<String, String>() { // from class: com.taobao.android.purchase.aura.extension.utTrack.TBBuyUserTrackParserExtension$2
                {
                    put("requestParams", JSONObject.toJSONString(map));
                }
            });
        }
    }
}
