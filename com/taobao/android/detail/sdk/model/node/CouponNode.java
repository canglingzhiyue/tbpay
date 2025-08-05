package com.taobao.android.detail.sdk.model.node;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.utils.c;
import com.taobao.android.detail.sdk.utils.g;
import java.util.List;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class CouponNode extends DetailNode {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String linkUrl;
    public List<MainItem> mainItems;
    public String mtopUrl;
    public String rightButton;

    /* loaded from: classes4.dex */
    public static class MainItem {
        public String iconUrl;
        public String title;

        static {
            kge.a(948253793);
        }

        public MainItem(JSONObject jSONObject) {
            if (jSONObject == null) {
                return;
            }
            this.iconUrl = c.a(jSONObject.getString("icon"));
            this.title = c.a(jSONObject.getString("title"));
        }
    }

    static {
        kge.a(629154095);
    }

    public CouponNode(JSONObject jSONObject) {
        super(jSONObject);
        tpc.a("com.taobao.android.detail.sdk.model.node.CouponNode");
        if (jSONObject == null) {
            return;
        }
        this.rightButton = c.a(jSONObject.getString("linkWriting"));
        this.linkUrl = jSONObject.getString("linkUrl");
        this.mtopUrl = jSONObject.getString("mtop");
        initMainItems(jSONObject.getJSONArray("couponList"));
    }

    private void initMainItems(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1406c86", new Object[]{this, jSONArray});
        } else {
            this.mainItems = c.a(jSONArray, new g<MainItem>() { // from class: com.taobao.android.detail.sdk.model.node.CouponNode.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.taobao.android.detail.sdk.model.node.CouponNode$MainItem] */
                @Override // com.taobao.android.detail.sdk.utils.g
                public /* synthetic */ MainItem b(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
                }

                public MainItem a(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (MainItem) ipChange2.ipc$dispatch("e1ad000", new Object[]{this, obj}) : new MainItem((JSONObject) obj);
                }
            });
        }
    }
}
