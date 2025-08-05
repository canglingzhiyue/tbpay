package com.taobao.android.detail.ttdetail.data.meta;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.node.RateNode;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

@MappingKey(key = RateNode.TAG)
/* loaded from: classes4.dex */
public class Rate extends Meta {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final List<Keywords> keywords;
    private final JSONObject rateExtParams;

    static {
        kge.a(1463222648);
    }

    public Rate(JSONObject jSONObject) {
        super(jSONObject);
        this.keywords = initKeywords(jSONObject);
        this.rateExtParams = jSONObject.getJSONObject("rateExtParams");
    }

    private List<Keywords> initKeywords(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("857593b8", new Object[]{this, jSONObject});
        }
        JSONArray jSONArray = jSONObject.getJSONArray("keywords");
        if (jSONArray == null || jSONArray.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int size = jSONArray.size();
        for (int i = 0; i < size; i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            if (jSONObject2 != null) {
                arrayList.add(Keywords.a(jSONObject2));
            }
        }
        return arrayList;
    }

    public List<Keywords> getKeywords() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("80669dc0", new Object[]{this}) : this.keywords;
    }

    public JSONObject getRateExtParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("7dafdd78", new Object[]{this}) : this.rateExtParams;
    }

    /* loaded from: classes4.dex */
    public static class Keywords {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final String f10616a;
        private final String b;
        private final String c;
        private final RateKeywordType d;
        private final JSONArray e;
        private final String f;
        private final String g;
        private final String h;
        private final int i;

        /* loaded from: classes4.dex */
        public enum RateKeywordType {
            POSITIVE,
            NEGATIVE
        }

        static {
            kge.a(-1624259210);
        }

        public static Keywords a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Keywords) ipChange.ipc$dispatch("bae72747", new Object[]{jSONObject});
            }
            if (jSONObject == null) {
                return null;
            }
            return new Keywords(jSONObject);
        }

        private Keywords(JSONObject jSONObject) {
            this.f10616a = jSONObject.getString("word");
            this.b = jSONObject.getString("count");
            this.c = jSONObject.getString("attribute");
            this.d = jSONObject.getIntValue("type") > 0 ? RateKeywordType.POSITIVE : RateKeywordType.NEGATIVE;
            this.i = jSONObject.getIntValue("type");
            this.f = jSONObject.getString("level");
            this.g = jSONObject.getString("attributeId");
            this.e = jSONObject.getJSONArray("subImprList");
            this.h = jSONObject.getString("rateType");
        }

        public String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f10616a;
        }

        public String b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
        }

        public String c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.c;
        }

        public RateKeywordType d() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (RateKeywordType) ipChange.ipc$dispatch("8e864e5", new Object[]{this}) : this.d;
        }

        public int i() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5dd2863", new Object[]{this})).intValue() : this.i;
        }

        public JSONArray e() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (JSONArray) ipChange.ipc$dispatch("ad1c0252", new Object[]{this}) : this.e;
        }

        public String f() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : this.f;
        }

        public String g() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this}) : this.g;
        }

        public String h() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this}) : this.h;
        }
    }
}
