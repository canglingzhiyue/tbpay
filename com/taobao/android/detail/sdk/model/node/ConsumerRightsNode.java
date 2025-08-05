package com.taobao.android.detail.sdk.model.node;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.model.node.RightsNode;
import com.taobao.android.detail.sdk.utils.c;
import com.taobao.android.detail.sdk.utils.g;
import java.util.ArrayList;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class ConsumerRightsNode extends DetailNode {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public RightsNode.Channel channel;
    public String passValue;
    public ArrayList<RightsNode.RightItem> rights;
    public String type;
    public String url;

    static {
        kge.a(-1732438026);
    }

    public ConsumerRightsNode(JSONObject jSONObject) {
        super(jSONObject);
        this.channel = initChannel();
        this.rights = initRights();
        this.passValue = jSONObject.getString("passValue");
        this.url = jSONObject.getString("url");
        this.type = jSONObject.getString("type");
        tpc.a("com.taobao.android.detail.sdk.model.node.ConsumerRightsNode");
    }

    private RightsNode.Channel initChannel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RightsNode.Channel) ipChange.ipc$dispatch("23acee4c", new Object[]{this});
        }
        JSONObject jSONObject = this.root.getJSONObject("channel");
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        return new RightsNode.Channel(jSONObject);
    }

    private ArrayList<RightsNode.RightItem> initRights() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("9d07c0e8", new Object[]{this});
        }
        JSONObject jSONObject2 = this.root.getJSONObject("tradeConsumerService");
        if (jSONObject2 != null && (jSONObject = jSONObject2.getJSONObject("service")) != null) {
            return c.a(jSONObject.getJSONArray("items"), new g<RightsNode.RightItem>() { // from class: com.taobao.android.detail.sdk.model.node.ConsumerRightsNode.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.android.detail.sdk.model.node.RightsNode$RightItem, java.lang.Object] */
                @Override // com.taobao.android.detail.sdk.utils.g
                public /* synthetic */ RightsNode.RightItem b(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
                }

                public RightsNode.RightItem a(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (RightsNode.RightItem) ipChange2.ipc$dispatch("3d28e86a", new Object[]{this, obj}) : new RightsNode.RightItem((JSONObject) obj);
                }
            });
        }
        return null;
    }
}
