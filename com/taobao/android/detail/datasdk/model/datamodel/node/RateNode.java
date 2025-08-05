package com.taobao.android.detail.datasdk.model.datamodel.node;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import tb.emu;
import tb.epa;
import tb.epw;
import tb.epy;
import tb.kge;
import tb.tfu;

/* loaded from: classes4.dex */
public class RateNode extends DetailNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String KEYWORDS = "keywords";
    private static final String RATE_EXT_PARAMS = "rateExtParams";
    public static final String TAG = "rate";
    public ArrayList<RateKeyword> keywords;
    public ArrayList<a> propRates;
    public JSONObject rateExtParams;
    public ArrayList<b> rateList;
    public long totalCount;

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f9994a;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;
        public String g;

        static {
            kge.a(-1239625960);
        }

        public a(JSONObject jSONObject) {
            this.f9994a = epw.a(jSONObject.getString("propName"));
            this.b = epw.a(jSONObject.getString("avatar"));
            this.c = epw.a(jSONObject.getString(tfu.COMMENT));
            this.d = epw.a(jSONObject.getString("commentCount"));
            this.e = epw.a(jSONObject.getString("image"));
            this.f = epw.a(jSONObject.getString("feedId"));
            this.g = epw.a(jSONObject.getString("skuVids"));
        }
    }

    /* loaded from: classes4.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public String f9995a;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;
        public String g;
        public String h;
        public String[] i;

        static {
            kge.a(1356900442);
        }

        public b(JSONObject jSONObject) {
            this.f9995a = epw.a(jSONObject.getString("content"));
            this.b = epw.a(jSONObject.getString("userName"));
            this.c = epw.a(jSONObject.getString("headPic"));
            this.d = epw.a(jSONObject.getString("memberLevel"));
            this.e = epw.a(jSONObject.getString("tmallMemberLevel"));
            this.f = epw.a(jSONObject.getString("userIcon"));
            this.g = epw.a(jSONObject.getString("dateTime"));
            this.h = epw.a(jSONObject.getString("skuInfo"));
            JSONArray jSONArray = jSONObject.getJSONArray("images");
            this.i = jSONArray != null ? (String[]) JSONObject.toJavaObject(jSONArray, String[].class) : epa.EMPTY_STRING_ARRAY;
        }
    }

    static {
        kge.a(-294401809);
    }

    public RateNode(JSONObject jSONObject) {
        super(jSONObject);
        try {
            this.totalCount = jSONObject.getLongValue("totalCount");
        } catch (Exception unused) {
            this.totalCount = 0L;
        }
        this.keywords = initKeywords();
        this.rateList = initRateList();
        this.propRates = initPropRate();
        this.rateExtParams = initRateExtParams();
        emu.a("com.taobao.android.detail.datasdk.model.datamodel.node.RateNode");
    }

    private ArrayList<RateKeyword> initKeywords() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("42a5c9bb", new Object[]{this}) : epw.a(this.data.getJSONArray(KEYWORDS), new epy<RateKeyword>() { // from class: com.taobao.android.detail.datasdk.model.datamodel.node.RateNode.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.android.detail.datasdk.model.datamodel.node.RateNode$RateKeyword, java.lang.Object] */
            @Override // tb.epy
            public /* synthetic */ RateKeyword b(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
            }

            public RateKeyword a(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (RateKeyword) ipChange2.ipc$dispatch("e99edd61", new Object[]{this, obj}) : new RateKeyword((JSONObject) obj);
            }
        });
    }

    private ArrayList<b> initRateList() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("6cd58faf", new Object[]{this}) : epw.a(this.data.getJSONArray("rateList"), new epy<b>() { // from class: com.taobao.android.detail.datasdk.model.datamodel.node.RateNode.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.android.detail.datasdk.model.datamodel.node.RateNode$b, java.lang.Object] */
            @Override // tb.epy
            public /* synthetic */ b b(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
            }

            public b a(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (b) ipChange2.ipc$dispatch("61730ba8", new Object[]{this, obj}) : new b((JSONObject) obj);
            }
        });
    }

    private ArrayList<a> initPropRate() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("a05c49f4", new Object[]{this}) : epw.a(this.data.getJSONArray("propRate"), new epy<a>() { // from class: com.taobao.android.detail.datasdk.model.datamodel.node.RateNode.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.android.detail.datasdk.model.datamodel.node.RateNode$a, java.lang.Object] */
            @Override // tb.epy
            public /* synthetic */ a b(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
            }

            public a a(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (a) ipChange2.ipc$dispatch("61730b89", new Object[]{this, obj}) : new a((JSONObject) obj);
            }
        });
    }

    private JSONObject initRateExtParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("b9db5afe", new Object[]{this}) : this.data.getJSONObject(RATE_EXT_PARAMS);
    }

    /* loaded from: classes4.dex */
    public static class RateKeyword {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f9993a;
        public String b;
        public String c;
        public RateKeywordType d;
        public JSONArray e;
        public String f;
        public String g;
        public String h;
        public int i;

        /* loaded from: classes4.dex */
        public enum RateKeywordType {
            POSITIVE,
            NEGATIVE
        }

        static {
            kge.a(-1762529132);
        }

        public RateKeyword(JSONObject jSONObject) {
            if (jSONObject != null) {
                a(jSONObject);
            }
        }

        private void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
                return;
            }
            this.f9993a = epw.a(jSONObject.getString("word"));
            this.b = epw.a(jSONObject.getString("count"));
            this.c = epw.a(jSONObject.getString("attribute"));
            this.d = jSONObject.getIntValue("type") > 0 ? RateKeywordType.POSITIVE : RateKeywordType.NEGATIVE;
            this.i = jSONObject.getIntValue("type");
            this.f = epw.a(jSONObject.getString("level"));
            this.g = epw.a(jSONObject.getString("attributeId"));
            this.e = jSONObject.getJSONArray("subImprList");
            this.h = epw.a(jSONObject.getString("rateType"));
        }
    }
}
