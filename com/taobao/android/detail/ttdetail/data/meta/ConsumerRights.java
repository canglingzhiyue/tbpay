package com.taobao.android.detail.ttdetail.data.meta;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.node.ConsumerRightsNode;
import com.taobao.android.detail.ttdetail.data.meta.Rights;
import com.taobao.android.detail.ttdetail.utils.z;
import java.util.ArrayList;
import tb.kge;

@MappingKey(key = ConsumerRightsNode.TAG)
/* loaded from: classes4.dex */
public class ConsumerRights extends Meta {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Rights.a channel;
    private JSONObject data;
    private String passValue;
    private ArrayList<Rights.b> rights;
    private String type;
    private String url;

    static {
        kge.a(1456961541);
    }

    public ConsumerRights(JSONObject jSONObject) {
        super(jSONObject);
        this.channel = initChannel();
        this.rights = initRights();
        this.data = jSONObject;
        this.passValue = jSONObject.getString("passValue");
        this.url = jSONObject.getString("url");
        this.type = jSONObject.getString("type");
    }

    private Rights.a initChannel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rights.a) ipChange.ipc$dispatch("1611d1f", new Object[]{this});
        }
        JSONObject jSONObject = this.data.getJSONObject("channel");
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        return new Rights.a(jSONObject);
    }

    private ArrayList<Rights.b> initRights() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("9d07c0e8", new Object[]{this});
        }
        JSONObject jSONObject2 = this.data.getJSONObject("tradeConsumerService");
        if (jSONObject2 != null && (jSONObject = jSONObject2.getJSONObject("service")) != null) {
            return z.a(jSONObject.getJSONArray("items"), new z.a<Rights.b>() { // from class: com.taobao.android.detail.ttdetail.data.meta.ConsumerRights.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.android.detail.ttdetail.data.meta.Rights$b, java.lang.Object] */
                @Override // com.taobao.android.detail.ttdetail.utils.z.a
                public /* synthetic */ Rights.b convert(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("cbc0bfdc", new Object[]{this, obj}) : a(obj);
                }

                public Rights.b a(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (Rights.b) ipChange2.ipc$dispatch("73547b28", new Object[]{this, obj}) : new Rights.b((JSONObject) obj);
                }
            });
        }
        return null;
    }
}
