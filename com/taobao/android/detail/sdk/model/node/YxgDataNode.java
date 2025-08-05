package com.taobao.android.detail.sdk.model.node;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.taobao.android.detail.sdk.utils.c;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class YxgDataNode extends DetailNode {
    public String avatar;
    public String barBgIcon;
    public boolean barDisable;
    public String barText;
    public String crownIcon;
    public DialogInfo dialogInfo;
    public String fisrtLaunchKey;
    public boolean hasMoreChance;
    public boolean isShowYxgBar;
    public String noChancePoplayerUrl;
    public Map<String, String> yxgParams;

    /* loaded from: classes4.dex */
    public static class DialogInfo {
        public String buttonLink;
        public String buttonText;
        public String contentUrl;
        public String contents;
        public String title;

        static {
            kge.a(-1070635475);
        }

        public DialogInfo(JSONObject jSONObject) {
            this.title = c.a(jSONObject.getString("avatar"));
            this.contents = c.a(jSONObject.getString("contents"));
            this.buttonText = c.a(jSONObject.getString("buttonText"));
            this.buttonLink = c.a(jSONObject.getString("buttonLink"));
            this.contentUrl = c.a(jSONObject.getString("contentUrl"));
        }
    }

    static {
        kge.a(485576973);
    }

    public YxgDataNode(JSONObject jSONObject) {
        this.isShowYxgBar = false;
        this.barDisable = false;
        this.avatar = c.a(jSONObject.getString("avatar"));
        this.isShowYxgBar = jSONObject.getBooleanValue("isShowYxgBar");
        this.barText = c.a(jSONObject.getString("barText"));
        this.barDisable = jSONObject.getBooleanValue("barDisable");
        this.hasMoreChance = jSONObject.getBooleanValue("hasMoreChance");
        this.noChancePoplayerUrl = c.a(jSONObject.getString("noChancePoplayerUrl"));
        this.fisrtLaunchKey = c.a(jSONObject.getString("fisrtLaunchKey"));
        this.barBgIcon = c.a(jSONObject.getString("barBgIcon"));
        this.crownIcon = c.a(jSONObject.getString("crownIcon"));
        this.fisrtLaunchKey = TextUtils.isEmpty(this.fisrtLaunchKey) ? "detail_fisrtLaunchKey" : "detail_" + this.fisrtLaunchKey.replace(" ", "");
        this.yxgParams = new HashMap();
        JSONObject jSONObject2 = jSONObject.getJSONObject("yxgParams");
        if (jSONObject2 != null && jSONObject2.keySet().size() > 0) {
            for (String str : jSONObject2.keySet()) {
                this.yxgParams.put(str, c.a(jSONObject2.getString(str)));
            }
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("dialogInfo");
        if (jSONObject3 != null) {
            this.dialogInfo = new DialogInfo(jSONObject3);
        }
        tpc.a("com.taobao.android.detail.sdk.model.node.YxgDataNode");
    }
}
