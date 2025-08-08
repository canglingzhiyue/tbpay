package com.taobao.android.detail.datasdk.model.datamodel.node;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import java.util.HashMap;
import java.util.Map;
import tb.emu;
import tb.epw;
import tb.kge;

/* loaded from: classes4.dex */
public class YxgDataNode extends DetailNode {
    public static final String TAG = "yxgData";
    public String avatar;
    public String barBgIcon;
    public boolean barDisable;
    public String barText;
    public String crownIcon;
    public a dialogInfo;
    public String fisrtLaunchKey;
    public boolean hasMoreChance;
    public boolean isShowYxgBar;
    public String noChancePoplayerUrl;
    public Map<String, String> yxgParams;

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f10046a;
        public String b;
        public String c;
        public String d;
        public String e;

        static {
            kge.a(-1412053517);
        }

        public a(JSONObject jSONObject) {
            this.f10046a = epw.a(jSONObject.getString("avatar"));
            this.b = epw.a(jSONObject.getString("contents"));
            this.c = epw.a(jSONObject.getString("buttonText"));
            this.d = epw.a(jSONObject.getString("buttonLink"));
            this.e = epw.a(jSONObject.getString("contentUrl"));
        }
    }

    static {
        kge.a(46731527);
    }

    public YxgDataNode(JSONObject jSONObject) {
        super(jSONObject);
        this.isShowYxgBar = false;
        this.barDisable = false;
        this.avatar = epw.a(jSONObject.getString("avatar"));
        this.isShowYxgBar = jSONObject.getBooleanValue("isShowYxgBar");
        this.barText = epw.a(jSONObject.getString("barText"));
        this.barDisable = jSONObject.getBooleanValue("barDisable");
        this.hasMoreChance = jSONObject.getBooleanValue("hasMoreChance");
        this.noChancePoplayerUrl = epw.a(jSONObject.getString("noChancePoplayerUrl"));
        this.fisrtLaunchKey = epw.a(jSONObject.getString("fisrtLaunchKey"));
        this.barBgIcon = epw.a(jSONObject.getString("barBgIcon"));
        this.crownIcon = epw.a(jSONObject.getString("crownIcon"));
        this.fisrtLaunchKey = StringUtils.isEmpty(this.fisrtLaunchKey) ? "detail_fisrtLaunchKey" : "detail_" + this.fisrtLaunchKey.replace(" ", "");
        this.yxgParams = new HashMap();
        JSONObject jSONObject2 = jSONObject.getJSONObject("yxgParams");
        if (jSONObject2 != null && jSONObject2.keySet().size() > 0) {
            for (String str : jSONObject2.keySet()) {
                this.yxgParams.put(str, epw.a(jSONObject2.getString(str)));
            }
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("dialogInfo");
        if (jSONObject3 != null) {
            this.dialogInfo = new a(jSONObject3);
        }
        emu.a("com.taobao.android.detail.datasdk.model.datamodel.node.YxgDataNode");
    }
}
