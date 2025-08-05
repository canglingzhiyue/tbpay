package com.taobao.android.detail.datasdk.model.datamodel.node;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.node.RightsNode;
import java.util.ArrayList;
import tb.emu;
import tb.epw;
import tb.epy;
import tb.kge;

/* loaded from: classes4.dex */
public class ConsumerRightsNode extends DetailNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "tradeConsumerProtection";
    public RightsNode.a channel;
    public String passValue;
    public ArrayList<RightsNode.b> rights;
    public String type;
    public String url;

    static {
        kge.a(895896252);
    }

    public ConsumerRightsNode(JSONObject jSONObject) {
        super(jSONObject);
        this.channel = initChannel();
        this.rights = initRights();
        this.passValue = jSONObject.getString("passValue");
        this.url = jSONObject.getString("url");
        this.type = jSONObject.getString("type");
        emu.a("com.taobao.android.detail.datasdk.model.datamodel.node.ConsumerRightsNode");
    }

    private RightsNode.a initChannel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RightsNode.a) ipChange.ipc$dispatch("214aef08", new Object[]{this});
        }
        JSONObject jSONObject = this.data.getJSONObject("channel");
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        return new RightsNode.a(jSONObject);
    }

    private ArrayList<RightsNode.b> initRights() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("9d07c0e8", new Object[]{this});
        }
        JSONObject jSONObject2 = this.data.getJSONObject("tradeConsumerService");
        if (jSONObject2 != null && (jSONObject = jSONObject2.getJSONObject("service")) != null) {
            return epw.a(jSONObject.getJSONArray("items"), new epy<RightsNode.b>() { // from class: com.taobao.android.detail.datasdk.model.datamodel.node.ConsumerRightsNode.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.taobao.android.detail.datasdk.model.datamodel.node.RightsNode$b] */
                @Override // tb.epy
                public /* synthetic */ RightsNode.b b(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
                }

                public RightsNode.b a(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (RightsNode.b) ipChange2.ipc$dispatch("8626ab91", new Object[]{this, obj}) : new RightsNode.b((JSONObject) obj);
                }
            });
        }
        return null;
    }
}
