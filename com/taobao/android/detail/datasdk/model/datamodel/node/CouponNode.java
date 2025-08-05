package com.taobao.android.detail.datasdk.model.datamodel.node;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.emu;
import tb.epw;
import tb.epy;
import tb.kge;

/* loaded from: classes4.dex */
public class CouponNode extends DetailNode {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String linkUrl;
    public List<a> mainItems;
    public String mtopUrl;
    public String rightButton;

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f9961a;
        public String b;

        static {
            kge.a(822237787);
        }

        public a(JSONObject jSONObject) {
            if (jSONObject == null) {
                return;
            }
            this.f9961a = epw.a(jSONObject.getString("icon"));
            this.b = epw.a(jSONObject.getString("title"));
        }
    }

    static {
        kge.a(-770475531);
    }

    public CouponNode(JSONObject jSONObject) {
        super(jSONObject);
        if (jSONObject == null) {
            return;
        }
        this.rightButton = epw.a(jSONObject.getString("linkWriting"));
        this.linkUrl = jSONObject.getString("linkUrl");
        this.mtopUrl = jSONObject.getString("mtop");
        initMainItems(jSONObject.getJSONArray("couponList"));
        emu.a("com.taobao.android.detail.datasdk.model.datamodel.node.CouponNode");
    }

    private void initMainItems(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1406c86", new Object[]{this, jSONArray});
        } else {
            this.mainItems = epw.a(jSONArray, new epy<a>() { // from class: com.taobao.android.detail.datasdk.model.datamodel.node.CouponNode.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.android.detail.datasdk.model.datamodel.node.CouponNode$a, java.lang.Object] */
                @Override // tb.epy
                public /* synthetic */ a b(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
                }

                public a a(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (a) ipChange2.ipc$dispatch("94b46e43", new Object[]{this, obj}) : new a((JSONObject) obj);
                }
            });
        }
    }
}
