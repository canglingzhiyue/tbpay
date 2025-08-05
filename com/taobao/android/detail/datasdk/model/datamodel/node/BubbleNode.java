package com.taobao.android.detail.datasdk.model.datamodel.node;

import com.alibaba.fastjson.JSONObject;
import com.taobao.android.behavir.config.BHRTaskConfigBase;
import tb.emu;
import tb.epw;
import tb.kge;

/* loaded from: classes4.dex */
public class BubbleNode extends DetailNode {
    public String buttonText;
    public String link;
    public String picIcon;
    public String status;
    public String tip;
    public JSONObject ut;

    static {
        kge.a(-1216760997);
    }

    public BubbleNode(JSONObject jSONObject) {
        super(jSONObject);
        this.ut = new JSONObject();
        this.tip = epw.a(jSONObject.getString("tip"));
        this.link = epw.a(jSONObject.getString("link"));
        this.picIcon = epw.a(jSONObject.getString("picIcon"));
        this.status = epw.a(jSONObject.getString("animationType"));
        this.buttonText = epw.a(jSONObject.getString("buttonText"));
        this.ut = jSONObject.getJSONObject(BHRTaskConfigBase.TYPE_CONFIG_UT);
        emu.a("com.taobao.android.detail.datasdk.model.datamodel.node.BubbleNode");
    }
}
