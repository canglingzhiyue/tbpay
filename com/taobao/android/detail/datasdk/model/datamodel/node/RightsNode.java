package com.taobao.android.detail.datasdk.model.datamodel.node;

import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import tb.emu;
import tb.epw;
import tb.epy;
import tb.kge;

/* loaded from: classes4.dex */
public class RightsNode extends DetailNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "consumerProtection";
    public a channel;
    public String params;
    public String passValue;
    public ArrayList<b> rights;
    public a special;
    public String strength;

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f10021a;
        public String b;

        static {
            kge.a(93765989);
        }

        public a(JSONObject jSONObject) {
            this.f10021a = epw.a(jSONObject.getString("title"));
            this.b = epw.a(jSONObject.getString(MspFlybirdDefine.FLYBIRD_DIALOG_LOGO));
        }
    }

    /* loaded from: classes4.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public String f10022a;
        public String b;
        public String c;
        public int d;

        static {
            kge.a(1178597169);
        }

        public b(JSONObject jSONObject) {
            this.f10022a = epw.a(jSONObject.getString("serviceId"));
            this.b = epw.a(jSONObject.getString("title"));
            this.c = epw.a(jSONObject.getString("desc"));
            this.d = jSONObject.getIntValue("type");
        }
    }

    static {
        kge.a(1544741670);
    }

    public RightsNode(JSONObject jSONObject) {
        super(jSONObject);
        this.channel = initChannel();
        this.special = initSpecialChannel();
        this.rights = initRights();
        this.params = jSONObject.getString("params");
        this.passValue = jSONObject.getString("passValue");
        this.strength = jSONObject.getString("strength");
        emu.a("com.taobao.android.detail.datasdk.model.datamodel.node.RightsNode");
    }

    private a initSpecialChannel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("49b0596f", new Object[]{this});
        }
        JSONObject jSONObject = this.data.getJSONObject("special");
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        return new a(jSONObject);
    }

    private a initChannel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("214aef08", new Object[]{this});
        }
        JSONObject jSONObject = this.data.getJSONObject("channel");
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        return new a(jSONObject);
    }

    private ArrayList<b> initRights() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("9d07c0e8", new Object[]{this}) : epw.a(this.data.getJSONArray("items"), new epy<b>() { // from class: com.taobao.android.detail.datasdk.model.datamodel.node.RightsNode.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.taobao.android.detail.datasdk.model.datamodel.node.RightsNode$b] */
            @Override // tb.epy
            public /* synthetic */ b b(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
            }

            public b a(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (b) ipChange2.ipc$dispatch("8626ab91", new Object[]{this, obj}) : new b((JSONObject) obj);
            }
        });
    }
}
