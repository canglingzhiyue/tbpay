package com.taobao.android.detail.sdk.model.node;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.utils.c;
import com.taobao.android.detail.sdk.utils.g;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public class ContractNode extends DetailNode {
    public List<Map<String, Object>> componentData;
    public Version version;

    /* loaded from: classes4.dex */
    public static class Version implements Serializable {
        public int categoryId;
        public boolean enableClick;
        public boolean limit;
        public String nativeDesc;
        public boolean noShopCart;
        public String planId;
        public String secondJumpTitle;
        public List<?> skuId;
        public String versionCode;
        public String versionEntry;
        public String versionName;

        static {
            kge.a(1689689967);
            kge.a(1028243835);
        }
    }

    static {
        kge.a(353445467);
    }

    public ContractNode() {
        super(new JSONObject());
    }

    public ContractNode(JSONObject jSONObject) {
        super(jSONObject);
        try {
            this.componentData = c.a(jSONObject.getJSONArray("componentData"), new g<Map<String, Object>>() { // from class: com.taobao.android.detail.sdk.model.node.ContractNode.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v3, types: [java.util.Map<java.lang.String, java.lang.Object>, java.lang.Object] */
                @Override // com.taobao.android.detail.sdk.utils.g
                public /* synthetic */ Map<String, Object> b(Object obj) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? ipChange.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
                }

                public Map<String, Object> a(Object obj) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("42d7dd79", new Object[]{this, obj}) : c.a((JSONObject) obj, new g<Object>() { // from class: com.taobao.android.detail.sdk.model.node.ContractNode.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.android.detail.sdk.utils.g
                        public Object b(Object obj2) {
                            IpChange ipChange2 = $ipChange;
                            return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj2}) : obj2;
                        }
                    });
                }
            });
        } catch (Throwable unused) {
        }
        try {
            this.version = (Version) jSONObject.getObject("version", Version.class);
        } catch (Throwable unused2) {
        }
    }
}
