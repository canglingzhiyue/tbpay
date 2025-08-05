package com.taobao.android.detail.ttdetail.data.meta;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.utils.z;
import java.util.ArrayList;
import tb.kge;

@MappingKey(key = "price")
/* loaded from: classes4.dex */
public class Price extends Meta {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final ArrayList<a> extraPrices;
    private final a price;

    static {
        kge.a(-1886089295);
    }

    public Price(JSONObject jSONObject) {
        super(jSONObject);
        this.price = a.a(jSONObject.getJSONObject("price"));
        this.extraPrices = initExtraPrices(jSONObject);
    }

    private ArrayList<a> initExtraPrices(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("605a3299", new Object[]{this, jSONObject}) : z.a(jSONObject.getJSONArray("extraPrices"), new z.a<a>() { // from class: com.taobao.android.detail.ttdetail.data.meta.Price.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.android.detail.ttdetail.data.meta.Price$a, java.lang.Object] */
            @Override // com.taobao.android.detail.ttdetail.utils.z.a
            public /* synthetic */ a convert(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("cbc0bfdc", new Object[]{this, obj}) : a(obj);
            }

            public a a(Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (a) ipChange2.ipc$dispatch("d95af7d3", new Object[]{this, obj});
                }
                if (!(obj instanceof JSONObject)) {
                    return null;
                }
                return new a((JSONObject) obj);
            }
        });
    }

    public a getPrice() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("4da2b93d", new Object[]{this}) : this.price;
    }

    public ArrayList<a> getExtraPrices() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("c9a94625", new Object[]{this}) : this.extraPrices;
    }

    /* loaded from: classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final String f10614a;
        private final int b;

        static {
            kge.a(731363136);
        }

        public static a a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("1946510f", new Object[]{jSONObject});
            }
            if (jSONObject == null) {
                return null;
            }
            return new a(jSONObject);
        }

        public int a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.b;
        }

        private a(JSONObject jSONObject) {
            this.f10614a = jSONObject.getString("priceText");
            this.b = jSONObject.getIntValue("type");
        }

        public String b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.f10614a;
        }
    }
}
