package com.taobao.android.detail.datasdk.model.datamodel.node;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import tb.emu;
import tb.epw;
import tb.epy;
import tb.kge;

/* loaded from: classes4.dex */
public class JhsNode extends DetailNode {
    public long endTime;
    public a globalInfo;
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
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f9973a;
        public String b;
        public String c;

        static {
            kge.a(-555915029);
        }

        public a(JSONObject jSONObject) {
            this.f9973a = jSONObject.getString("countryIcon");
            this.b = jSONObject.getString("countryName");
            this.c = jSONObject.getString("descText");
        }
    }

    /* loaded from: classes4.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static int f9974a;
        public static int b;

        static {
            kge.a(1948634637);
            f9974a = 0;
            b = 1;
        }
    }

    static {
        kge.a(-676069622);
    }

    public JhsNode(JSONObject jSONObject) {
        super(jSONObject);
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
            this.globalInfo = new a(jSONObject2);
        }
        this.goodsWayDesc = epw.a(jSONObject.getJSONArray("goodsWayDesc"), new epy<String>() { // from class: com.taobao.android.detail.datasdk.model.datamodel.node.JhsNode.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.lang.String] */
            @Override // tb.epy
            public /* synthetic */ String b(Object obj) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ipChange.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
            }

            public String a(Object obj) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8a5b32dc", new Object[]{this, obj}) : (String) obj;
            }
        });
        emu.a("com.taobao.android.detail.datasdk.model.datamodel.node.JhsNode");
    }
}
