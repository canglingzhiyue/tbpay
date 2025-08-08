package com.alibaba.android.aura.taobao.adapter.extension.tinct;

import mtopsdk.common.util.StringUtils;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.umf.datamodel.protocol.ultron.UltronProtocol;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Component;
import com.alibaba.android.umf.node.service.parse.state.RenderComponent;
import com.alibaba.android.umf.node.service.parse.state.tree.MultiTreeNode;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.arc;
import tb.aso;
import tb.axy;
import tb.aya;
import tb.bau;
import tb.bga;
import tb.kge;

@AURAExtensionImpl(code = "aura.impl.userMarkTinct")
/* loaded from: classes2.dex */
public final class a extends aso implements axy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1528893179);
        kge.a(-29106604);
    }

    @Override // tb.aso
    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.aso, tb.asq
    public void a(MultiTreeNode multiTreeNode, UltronProtocol ultronProtocol) {
        Component component;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b99c82df", new Object[]{this, multiTreeNode, ultronProtocol});
            return;
        }
        RenderComponent data = multiTreeNode.data();
        if (data == null || (component = data.getComponent()) == null) {
            return;
        }
        Object features = component.getFeatures();
        if (!(features instanceof JSONObject)) {
            return;
        }
        JSONObject jSONObject = ((JSONObject) features).getJSONObject("dyeingInfo");
        if (bau.a(jSONObject)) {
            return;
        }
        String string = jSONObject.getString("changeCode");
        String string2 = jSONObject.getString("page");
        JSONArray jSONArray = jSONObject.getJSONArray("config");
        if (StringUtils.isEmpty(string) || StringUtils.isEmpty(string2) || bau.a(jSONArray)) {
            return;
        }
        this.f25572a.update("aura.userMark.dyeingInfo.globalData.key", jSONObject.toJSONString());
        for (int i = 0; i < jSONArray.size(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            String string3 = jSONObject2.getString("businessCode");
            if (!StringUtils.isEmpty(string3)) {
                String string4 = jSONObject2.getString("groupCode");
                if (StringUtils.isEmpty(string4)) {
                    string4 = "aura_default";
                }
                String string5 = jSONObject2.getString("isGray");
                if (StringUtils.isEmpty(string5)) {
                    string5 = "true";
                }
                bga.c.a(string4, string2, string3, string, Boolean.valueOf(string5).booleanValue());
            }
        }
    }

    @Override // tb.axy
    public Map<String, String> a(aya ayaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c4924304", new Object[]{this, ayaVar});
        }
        if (this.f25572a == null) {
            arc.a().a("getUserTrackArgs globalData is null!!");
            return null;
        }
        final String str = (String) this.f25572a.get("aura.userMark.dyeingInfo.globalData.key", String.class);
        if (!StringUtils.isEmpty(str)) {
            return new HashMap<String, String>() { // from class: com.alibaba.android.aura.taobao.adapter.extension.tinct.AURAUserMarkTinctExtension$1
                {
                    a.this = this;
                    put("aura.userMark.dyeingInfo", str);
                }
            };
        }
        return null;
    }
}
