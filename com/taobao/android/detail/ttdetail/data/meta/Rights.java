package com.taobao.android.detail.ttdetail.data.meta;

import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.node.ConsumerRightsNode;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.i;
import com.taobao.android.detail.ttdetail.utils.z;
import java.util.ArrayList;
import tb.kge;

@MappingKey(key = ConsumerRightsNode.TAG)
/* loaded from: classes4.dex */
public class Rights extends Meta {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "consumerProtection";
    private a channel;
    private JSONObject data;
    private String params;
    private String passValue;
    private ArrayList<b> rights;
    private a special;
    private String strength;

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private String f10629a;
        private String b;

        static {
            kge.a(-200149586);
        }

        public a(JSONObject jSONObject) {
            this.f10629a = i.a(jSONObject.getString("title"));
            this.b = i.a(jSONObject.getString(MspFlybirdDefine.FLYBIRD_DIALOG_LOGO));
        }
    }

    /* loaded from: classes4.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private String f10630a;
        private String b;
        private String c;
        private int d;

        static {
            kge.a(-2101396166);
        }

        public b(JSONObject jSONObject) {
            this.f10630a = i.a(jSONObject.getString("serviceId"));
            this.b = i.a(jSONObject.getString("title"));
            this.c = i.a(jSONObject.getString("desc"));
            this.d = jSONObject.getIntValue("type");
        }
    }

    static {
        kge.a(1709666415);
    }

    public Rights(JSONObject jSONObject) {
        super(jSONObject);
        this.channel = initChannel();
        this.rights = initRights();
        this.special = initSpecialChannel();
        this.data = jSONObject;
        this.params = jSONObject.getString("params");
        this.passValue = jSONObject.getString("passValue");
        this.strength = jSONObject.getString("strength");
    }

    private a initSpecialChannel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("87b9b7c6", new Object[]{this});
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
            return (a) ipChange.ipc$dispatch("1611d1f", new Object[]{this});
        }
        JSONObject jSONObject = this.data.getJSONObject("channel");
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        return new a(jSONObject);
    }

    private ArrayList<b> initRights() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("9d07c0e8", new Object[]{this}) : z.a(this.data.getJSONArray("items"), new z.a<b>() { // from class: com.taobao.android.detail.ttdetail.data.meta.Rights.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.android.detail.ttdetail.data.meta.Rights$b, java.lang.Object] */
            @Override // com.taobao.android.detail.ttdetail.utils.z.a
            public /* synthetic */ b convert(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("cbc0bfdc", new Object[]{this, obj}) : a(obj);
            }

            public b a(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (b) ipChange2.ipc$dispatch("73547b28", new Object[]{this, obj}) : new b((JSONObject) obj);
            }
        });
    }
}
