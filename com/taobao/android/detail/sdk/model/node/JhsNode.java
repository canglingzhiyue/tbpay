package com.taobao.android.detail.sdk.model.node;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.utils.c;
import com.taobao.android.detail.sdk.utils.g;
import java.util.ArrayList;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class JhsNode extends DetailNode {
    public long endTime;
    public GlobalInfo globalInfo;
    public ArrayList<String> goodsWayDesc;
    public boolean hasIntervalPrice;
    public boolean isNeedJoin;
    public boolean juCollection;
    public String marketText;
    public Boolean needNativeRefresh;
    public String refreshLayoutId;
    public String remindCount;
    public String soldCount;
    public long startTime;
    public int status;
    public String statusTitle;
    public long verticalBiz;

    /* loaded from: classes4.dex */
    public static class GlobalInfo {
        public String countryIcon;
        public String countryName;
        public String descText;

        static {
            kge.a(1110717989);
        }

        public GlobalInfo(JSONObject jSONObject) {
            this.countryIcon = jSONObject.getString("countryIcon");
            this.countryName = jSONObject.getString("countryName");
            this.descText = jSONObject.getString("descText");
        }
    }

    static {
        kge.a(2102997520);
    }

    public JhsNode(JSONObject jSONObject) {
        super(jSONObject);
        tpc.a("com.taobao.android.detail.sdk.model.node.JhsNode");
        this.startTime = jSONObject.getLong("startTime").longValue();
        this.endTime = jSONObject.getLong("endTime").longValue();
        this.soldCount = jSONObject.getString("soldCount");
        this.remindCount = jSONObject.getString("remindCount");
        this.status = jSONObject.getIntValue("status");
        this.statusTitle = jSONObject.getString("statusTitle");
        this.marketText = jSONObject.getString("marketText");
        this.isNeedJoin = jSONObject.getBooleanValue("needJoin");
        this.juCollection = jSONObject.getBooleanValue("juCollection");
        this.refreshLayoutId = jSONObject.getString("refreshLayoutId");
        this.needNativeRefresh = Boolean.valueOf(jSONObject.getBooleanValue("needNativeRefresh"));
        this.hasIntervalPrice = jSONObject.getBooleanValue("hasIntervalPrice");
        if (this.needNativeRefresh == null) {
            this.needNativeRefresh = false;
        }
        this.verticalBiz = jSONObject.getLong("verticalBiz").longValue();
        JSONObject jSONObject2 = jSONObject.getJSONObject("globalInfo");
        if (jSONObject2 != null) {
            this.globalInfo = new GlobalInfo(jSONObject2);
        }
        this.goodsWayDesc = c.a(jSONObject.getJSONArray("goodsWayDesc"), new g<String>() { // from class: com.taobao.android.detail.sdk.model.node.JhsNode.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.lang.String] */
            @Override // com.taobao.android.detail.sdk.utils.g
            public /* synthetic */ String b(Object obj) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ipChange.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
            }

            public String a(Object obj) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8a5b32dc", new Object[]{this, obj}) : (String) obj;
            }
        });
    }
}
