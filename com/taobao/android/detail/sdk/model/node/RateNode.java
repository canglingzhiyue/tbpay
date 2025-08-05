package com.taobao.android.detail.sdk.model.node;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.utils.c;
import com.taobao.android.detail.sdk.utils.g;
import java.util.ArrayList;
import tb.ewk;
import tb.kge;
import tb.tfu;
import tb.tpc;

/* loaded from: classes4.dex */
public class RateNode extends DetailNode {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ArrayList<RateKeyword> keywords;
    public ArrayList<PropRate> propRates;
    public ArrayList<SimpleRateItem> rateList;
    public long totalCount;

    /* loaded from: classes4.dex */
    public static class PropRate {
        public String avatar;
        public String comment;
        public String commentCount;
        public String feedId;
        public String image;
        public String propName;
        public String skuvids;

        static {
            kge.a(1585083038);
        }

        public PropRate(JSONObject jSONObject) {
            this.propName = c.a(jSONObject.getString("propName"));
            this.avatar = c.a(jSONObject.getString("avatar"));
            this.comment = c.a(jSONObject.getString(tfu.COMMENT));
            this.commentCount = c.a(jSONObject.getString("commentCount"));
            this.image = c.a(jSONObject.getString("image"));
            this.feedId = c.a(jSONObject.getString("feedId"));
            this.skuvids = c.a(jSONObject.getString("skuVids"));
        }
    }

    /* loaded from: classes4.dex */
    public static class RateKeyword {
        public String attribute;
        public String count;
        public RateKeywordType type;
        public String word;

        /* loaded from: classes4.dex */
        public enum RateKeywordType {
            POSITIVE,
            NEGATIVE
        }

        static {
            kge.a(2143967054);
        }

        public RateKeyword(JSONObject jSONObject) {
            this.word = c.a(jSONObject.getString("word"));
            this.count = c.a(jSONObject.getString("count"));
            this.attribute = c.a(jSONObject.getString("attribute"));
            this.type = jSONObject.getIntValue("type") > 0 ? RateKeywordType.POSITIVE : RateKeywordType.NEGATIVE;
        }
    }

    /* loaded from: classes4.dex */
    public static class SimpleRateItem {
        public String content;
        public String dateTime;
        public String headPic;
        public String[] images;
        public String skuInfo;
        public String taobaoLevel;
        public String tmallLevel;
        public String userIcon;
        public String username;

        static {
            kge.a(-944042144);
        }

        public SimpleRateItem(JSONObject jSONObject) {
            this.content = c.a(jSONObject.getString("content"));
            this.username = c.a(jSONObject.getString("userName"));
            this.headPic = c.a(jSONObject.getString("headPic"));
            this.taobaoLevel = c.a(jSONObject.getString("memberLevel"));
            this.tmallLevel = c.a(jSONObject.getString("tmallMemberLevel"));
            this.userIcon = c.a(jSONObject.getString("userIcon"));
            this.dateTime = c.a(jSONObject.getString("dateTime"));
            this.skuInfo = c.a(jSONObject.getString("skuInfo"));
            JSONArray jSONArray = jSONObject.getJSONArray("images");
            this.images = jSONArray != null ? (String[]) JSONObject.toJavaObject(jSONArray, String[].class) : ewk.EMPTY_STRING_ARRAY;
        }
    }

    static {
        kge.a(-42666327);
    }

    public RateNode(JSONObject jSONObject) {
        super(jSONObject);
        tpc.a("com.taobao.android.detail.sdk.model.node.RateNode");
        try {
            this.totalCount = jSONObject.getLongValue("totalCount");
        } catch (Exception unused) {
            this.totalCount = 0L;
        }
        this.keywords = initKeywords();
        this.rateList = initRateList();
        this.propRates = initPropRate();
    }

    private ArrayList<RateKeyword> initKeywords() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("42a5c9bb", new Object[]{this}) : c.a(this.root.getJSONArray("keywords"), new g<RateKeyword>() { // from class: com.taobao.android.detail.sdk.model.node.RateNode.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.android.detail.sdk.model.node.RateNode$RateKeyword, java.lang.Object] */
            @Override // com.taobao.android.detail.sdk.utils.g
            public /* synthetic */ RateKeyword b(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
            }

            public RateKeyword a(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (RateKeyword) ipChange2.ipc$dispatch("2b61b67", new Object[]{this, obj}) : new RateKeyword((JSONObject) obj);
            }
        });
    }

    private ArrayList<SimpleRateItem> initRateList() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("6cd58faf", new Object[]{this}) : c.a(this.root.getJSONArray("rateList"), new g<SimpleRateItem>() { // from class: com.taobao.android.detail.sdk.model.node.RateNode.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.android.detail.sdk.model.node.RateNode$SimpleRateItem, java.lang.Object] */
            @Override // com.taobao.android.detail.sdk.utils.g
            public /* synthetic */ SimpleRateItem b(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
            }

            public SimpleRateItem a(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (SimpleRateItem) ipChange2.ipc$dispatch("5c78e1e1", new Object[]{this, obj}) : new SimpleRateItem((JSONObject) obj);
            }
        });
    }

    private ArrayList<PropRate> initPropRate() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("a05c49f4", new Object[]{this}) : c.a(this.root.getJSONArray("propRate"), new g<PropRate>() { // from class: com.taobao.android.detail.sdk.model.node.RateNode.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.taobao.android.detail.sdk.model.node.RateNode$PropRate] */
            @Override // com.taobao.android.detail.sdk.utils.g
            public /* synthetic */ PropRate b(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
            }

            public PropRate a(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (PropRate) ipChange2.ipc$dispatch("10b7a2e3", new Object[]{this, obj}) : new PropRate((JSONObject) obj);
            }
        });
    }
}
