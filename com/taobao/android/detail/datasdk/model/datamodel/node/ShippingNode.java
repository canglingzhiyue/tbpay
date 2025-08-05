package com.taobao.android.detail.datasdk.model.datamodel.node;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import tb.emu;
import tb.epw;
import tb.epy;
import tb.gbk;
import tb.kge;
import tb.mrm;

/* loaded from: classes4.dex */
public class ShippingNode extends DetailNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "delivery";
    public String addressId;
    public String addressWeexUrl;
    public String areaId;
    public boolean areaSell;
    public String completedTo;
    public String from;
    public a nextDayArriveInfo;
    public String postage;
    public boolean showAreaChooser;
    public ArrayList<b> stages;
    public String to;

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f10035a;
        public String b;
        public String c;

        static {
            kge.a(-1298593513);
        }

        public a(JSONObject jSONObject) {
            this.f10035a = epw.a(jSONObject.getString("icon"));
            this.b = epw.a(jSONObject.getString("label"));
            this.c = epw.a(jSONObject.getString("text"));
        }
    }

    /* loaded from: classes4.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public String f10036a;
        public boolean b;
        public String c;

        static {
            kge.a(791613701);
        }

        public b(JSONObject jSONObject) {
            boolean booleanValue;
            this.f10036a = epw.a(jSONObject.getString("icon"));
            if (!jSONObject.containsKey("isSelected")) {
                booleanValue = jSONObject.containsKey(gbk.TYPE_SELECTED) ? jSONObject.getBoolean(gbk.TYPE_SELECTED).booleanValue() : booleanValue;
                this.c = epw.a(jSONObject.getString("text"));
            }
            jSONObject.getBooleanValue("isSelected");
            this.b = booleanValue;
            this.c = epw.a(jSONObject.getString("text"));
        }
    }

    static {
        kge.a(638026813);
    }

    public ShippingNode(JSONObject jSONObject) {
        super(jSONObject);
        this.from = epw.a(jSONObject.getString("from"));
        this.to = epw.a(jSONObject.getString("to"));
        this.completedTo = epw.a(jSONObject.getString("completedTo"));
        this.areaId = epw.a(jSONObject.getString(mrm.KEY_AREA_ID));
        this.addressId = epw.a(jSONObject.getString("addressId"));
        this.postage = epw.a(jSONObject.getString("postage"));
        this.areaSell = jSONObject.getBooleanValue("areaSell");
        this.showAreaChooser = jSONObject.getBooleanValue("showAreaChooser");
        this.addressWeexUrl = jSONObject.getString("addressWeexUrl");
        this.nextDayArriveInfo = initNextDayArriveInfo();
        emu.a("com.taobao.android.detail.datasdk.model.datamodel.node.ShippingNode");
    }

    private a initNextDayArriveInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("478a1c7c", new Object[]{this});
        }
        JSONObject jSONObject = this.data.getJSONObject("extras");
        if (jSONObject != null) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("PostTime");
            if (jSONObject2 != null) {
                return new a(jSONObject2);
            }
            this.stages = epw.a(this.data.getJSONArray("multistage"), new epy<b>() { // from class: com.taobao.android.detail.datasdk.model.datamodel.node.ShippingNode.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.taobao.android.detail.datasdk.model.datamodel.node.ShippingNode$b] */
                @Override // tb.epy
                public /* synthetic */ b b(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
                }

                public b a(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (b) ipChange2.ipc$dispatch("1d9c789a", new Object[]{this, obj}) : new b((JSONObject) obj);
                }
            });
        }
        return new a(new JSONObject());
    }
}
