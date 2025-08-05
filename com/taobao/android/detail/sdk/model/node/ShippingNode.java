package com.taobao.android.detail.sdk.model.node;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.utils.c;
import com.taobao.android.detail.sdk.utils.g;
import java.util.ArrayList;
import tb.gbk;
import tb.kge;
import tb.mrm;
import tb.tpc;

/* loaded from: classes4.dex */
public class ShippingNode extends DetailNode {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String addressId;
    public String addressWeexUrl;
    public String areaId;
    public boolean areaSell;
    public String completedTo;
    public String from;
    public ExtraInfo nextDayArriveInfo;
    public String postage;
    public boolean showAreaChooser;
    public ArrayList<StageInfo> stages;
    public String to;

    /* loaded from: classes4.dex */
    public static class ExtraInfo {
        public String icon;
        public String label;
        public String text;

        static {
            kge.a(-957175471);
        }

        public ExtraInfo(JSONObject jSONObject) {
            this.icon = c.a(jSONObject.getString("icon"));
            this.label = c.a(jSONObject.getString("label"));
            this.text = c.a(jSONObject.getString("text"));
        }
    }

    /* loaded from: classes4.dex */
    public static class StageInfo {
        public String icon;
        public boolean isSelected;
        public String text;

        static {
            kge.a(1133031743);
        }

        public StageInfo(JSONObject jSONObject) {
            boolean booleanValue;
            this.icon = c.a(jSONObject.getString("icon"));
            if (!jSONObject.containsKey("isSelected")) {
                booleanValue = jSONObject.containsKey(gbk.TYPE_SELECTED) ? jSONObject.getBoolean(gbk.TYPE_SELECTED).booleanValue() : booleanValue;
                this.text = c.a(jSONObject.getString("text"));
            }
            jSONObject.getBooleanValue("isSelected");
            this.isSelected = booleanValue;
            this.text = c.a(jSONObject.getString("text"));
        }
    }

    static {
        kge.a(1357333751);
    }

    public ShippingNode(JSONObject jSONObject) {
        super(jSONObject);
        this.from = c.a(jSONObject.getString("from"));
        this.to = c.a(jSONObject.getString("to"));
        this.completedTo = c.a(jSONObject.getString("completedTo"));
        this.areaId = c.a(jSONObject.getString(mrm.KEY_AREA_ID));
        this.addressId = c.a(jSONObject.getString("addressId"));
        this.postage = c.a(jSONObject.getString("postage"));
        this.areaSell = jSONObject.getBooleanValue("areaSell");
        this.showAreaChooser = jSONObject.getBooleanValue("showAreaChooser");
        this.addressWeexUrl = jSONObject.getString("addressWeexUrl");
        this.nextDayArriveInfo = initNextDayArriveInfo();
        tpc.a("com.taobao.android.detail.sdk.model.node.ShippingNode");
    }

    private ExtraInfo initNextDayArriveInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExtraInfo) ipChange.ipc$dispatch("af4dbc05", new Object[]{this});
        }
        JSONObject jSONObject = this.root.getJSONObject("extras");
        if (jSONObject != null) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("PostTime");
            if (jSONObject2 != null) {
                return new ExtraInfo(jSONObject2);
            }
            this.stages = c.a(this.root.getJSONArray("multistage"), new g<StageInfo>() { // from class: com.taobao.android.detail.sdk.model.node.ShippingNode.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.android.detail.sdk.model.node.ShippingNode$StageInfo, java.lang.Object] */
                @Override // com.taobao.android.detail.sdk.utils.g
                public /* synthetic */ StageInfo b(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
                }

                public StageInfo a(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (StageInfo) ipChange2.ipc$dispatch("3f83b916", new Object[]{this, obj}) : new StageInfo((JSONObject) obj);
                }
            });
        }
        return new ExtraInfo(new JSONObject());
    }
}
