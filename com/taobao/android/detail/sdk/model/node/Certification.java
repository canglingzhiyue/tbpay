package com.taobao.android.detail.sdk.model.node;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.utils.c;
import com.taobao.android.detail.sdk.utils.g;
import java.util.ArrayList;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class Certification extends DetailNode {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ArrayList<CertificationItem> items;

    /* loaded from: classes4.dex */
    public static class CertificationItem {
        public String icon;
        public String txt;

        static {
            kge.a(1910053340);
        }

        public CertificationItem(JSONObject jSONObject) {
            this.icon = c.a(jSONObject.getString("icon"));
            this.txt = c.a(jSONObject.getString("txt"));
        }
    }

    static {
        kge.a(-2044392077);
    }

    public Certification(JSONObject jSONObject) {
        super(jSONObject);
        try {
            this.items = initKeywords();
        } catch (Exception unused) {
            this.items = null;
        }
        tpc.a("com.taobao.android.detail.sdk.model.node.Certification");
    }

    private ArrayList<CertificationItem> initKeywords() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("42a5c9bb", new Object[]{this}) : c.a(this.root.getJSONArray("items"), new g<CertificationItem>() { // from class: com.taobao.android.detail.sdk.model.node.Certification.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.android.detail.sdk.model.node.Certification$CertificationItem, java.lang.Object] */
            @Override // com.taobao.android.detail.sdk.utils.g
            public /* synthetic */ CertificationItem b(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
            }

            public CertificationItem a(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (CertificationItem) ipChange2.ipc$dispatch("d3e1c0e5", new Object[]{this, obj}) : new CertificationItem((JSONObject) obj);
            }
        });
    }
}
