package com.taobao.android.detail.sdk.model.node;

import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.utils.c;
import com.taobao.android.detail.sdk.utils.g;
import java.util.ArrayList;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class RightsNode extends DetailNode {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Channel channel;
    public String params;
    public String passValue;
    public ArrayList<RightItem> rights;
    public Channel special;
    public String strength;

    /* loaded from: classes4.dex */
    public static class Channel {
        public String logo;
        public String title;

        static {
            kge.a(1760399007);
        }

        public Channel(JSONObject jSONObject) {
            this.title = c.a(jSONObject.getString("title"));
            this.logo = c.a(jSONObject.getString(MspFlybirdDefine.FLYBIRD_DIALOG_LOGO));
        }
    }

    /* loaded from: classes4.dex */
    public static class RightItem {
        public String desc;
        public String id;
        public String title;
        public int type;

        static {
            kge.a(790126059);
        }

        public RightItem(JSONObject jSONObject) {
            this.id = c.a(jSONObject.getString("serviceId"));
            this.title = c.a(jSONObject.getString("title"));
            this.desc = c.a(jSONObject.getString("desc"));
            this.type = jSONObject.getIntValue("type");
        }
    }

    static {
        kge.a(-1350596000);
    }

    public RightsNode(JSONObject jSONObject) {
        super(jSONObject);
        this.channel = initChannel();
        this.special = initSpecialChannel();
        this.rights = initRights();
        this.params = jSONObject.getString("params");
        this.passValue = jSONObject.getString("passValue");
        this.strength = jSONObject.getString("strength");
        tpc.a("com.taobao.android.detail.sdk.model.node.RightsNode");
    }

    private Channel initSpecialChannel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Channel) ipChange.ipc$dispatch("89daafb3", new Object[]{this});
        }
        JSONObject jSONObject = this.root.getJSONObject("special");
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        return new Channel(jSONObject);
    }

    private Channel initChannel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Channel) ipChange.ipc$dispatch("23acee4c", new Object[]{this});
        }
        JSONObject jSONObject = this.root.getJSONObject("channel");
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        return new Channel(jSONObject);
    }

    private ArrayList<RightItem> initRights() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("9d07c0e8", new Object[]{this}) : c.a(this.root.getJSONArray("items"), new g<RightItem>() { // from class: com.taobao.android.detail.sdk.model.node.RightsNode.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.android.detail.sdk.model.node.RightsNode$RightItem, java.lang.Object] */
            @Override // com.taobao.android.detail.sdk.utils.g
            public /* synthetic */ RightItem b(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
            }

            public RightItem a(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (RightItem) ipChange2.ipc$dispatch("3d28e86a", new Object[]{this, obj}) : new RightItem((JSONObject) obj);
            }
        });
    }
}
