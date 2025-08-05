package com.taobao.detail.rate.model;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.detail.rate.model.itemrates.entity.RateKeyword;
import com.taobao.orange.OrangeConfig;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes7.dex */
public class RateInfo implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private long clickTimeMS;
    private String commentCount;
    private JSONObject detailRate;
    private JSONObject exParams;
    private String expression;
    private long feedId;
    private int foldFlag;
    private String groupId;
    private int invokeSource;
    private String itemId;
    private JSONObject itemInfo;
    private String mQuestionIcon;
    private String mQuestionLink;
    private String mQuestionText;
    private String mSelectTag;
    private long navTimeMS;
    public String openMode;
    private JSONObject rateExtParams;
    private List<RateKeyword> rateKeywordList;
    private String rateType;
    private String selectSku;
    private String sellerId;
    private String sellerType;
    private String shopId;
    private JSONObject skuInfo;
    private String skuVids;

    public RateInfo() {
    }

    public RateInfo(a aVar) {
        this.itemId = a.a(aVar);
        this.shopId = a.b(aVar);
        this.sellerType = a.c(aVar);
        this.commentCount = a.d(aVar);
        this.mQuestionText = a.e(aVar);
        this.mQuestionLink = a.f(aVar);
        this.rateKeywordList = a.g(aVar);
        this.mQuestionIcon = a.h(aVar);
        this.mSelectTag = a.i(aVar);
        this.sellerId = a.j(aVar);
        this.skuInfo = a.k(aVar);
        this.itemInfo = a.l(aVar);
        this.selectSku = a.m(aVar);
        this.invokeSource = a.n(aVar);
        this.feedId = a.o(aVar);
        this.skuVids = a.p(aVar);
        this.groupId = a.q(aVar);
        this.exParams = a.r(aVar);
        this.foldFlag = a.s(aVar);
        this.rateExtParams = a.t(aVar);
        this.expression = a.u(aVar);
        this.openMode = a.v(aVar);
        this.clickTimeMS = a.w(aVar);
        this.navTimeMS = a.x(aVar);
        this.detailRate = a.y(aVar);
    }

    public JSONObject getRateExtParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("7dafdd78", new Object[]{this}) : this.rateExtParams;
    }

    public void setRateExtParams(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3623a5a4", new Object[]{this, jSONObject});
        } else {
            this.rateExtParams = jSONObject;
        }
    }

    public String getShopId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3946bb2", new Object[]{this}) : this.shopId;
    }

    public void setShopId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea2f804", new Object[]{this, str});
        } else {
            this.shopId = str;
        }
    }

    public String getSellerType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3157730a", new Object[]{this}) : this.sellerType;
    }

    public void setSellerType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("708075ac", new Object[]{this, str});
        } else {
            this.sellerType = str;
        }
    }

    public String getCommentCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7e2a6253", new Object[]{this}) : this.commentCount;
    }

    public void setCommentCount(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7c05c83", new Object[]{this, str});
        } else {
            this.commentCount = str;
        }
    }

    public String getQuestionText() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b21bdf0", new Object[]{this}) : this.mQuestionText;
    }

    public void setQuestionText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9b47486", new Object[]{this, str});
        } else {
            this.mQuestionText = str;
        }
    }

    public String getQuestionLink() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("39020543", new Object[]{this}) : this.mQuestionLink;
    }

    public void setQuestionLink(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77dd1793", new Object[]{this, str});
        } else {
            this.mQuestionLink = str;
        }
    }

    public String getItemId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("beb1faf5", new Object[]{this}) : this.itemId;
    }

    public void setItemId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7375121", new Object[]{this, str});
        } else {
            this.itemId = str;
        }
    }

    public List<RateKeyword> getRateKeywordList() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("19ff584f", new Object[]{this}) : this.rateKeywordList;
    }

    public void setRateKeywordList(List<RateKeyword> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90851f5d", new Object[]{this, list});
            return;
        }
        if (list != null && list.size() > 0) {
            for (RateKeyword rateKeyword : list) {
                if (rateKeyword.type == 1) {
                    rateKeyword.type = -1;
                } else {
                    rateKeyword.type = 1;
                }
            }
        }
        this.rateKeywordList = list;
    }

    public String getQuestionIcon() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a22a8e24", new Object[]{this}) : this.mQuestionIcon;
    }

    public void setQuestionIcon(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33c5aad2", new Object[]{this, str});
        } else {
            this.mQuestionIcon = str;
        }
    }

    public String getSelectTag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d15159b1", new Object[]{this}) : this.mSelectTag;
    }

    public void setSelectTag(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db17984d", new Object[]{this, str});
        } else {
            this.mSelectTag = str;
        }
    }

    public String getSellerId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("822c6289", new Object[]{this}) : this.sellerId;
    }

    public void setSellerId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e3d490d", new Object[]{this, str});
        } else {
            this.sellerId = str;
        }
    }

    public JSONObject getSkuInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("2509985c", new Object[]{this}) : this.skuInfo;
    }

    public void setSkuInfo(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cfac040", new Object[]{this, jSONObject});
        } else {
            this.skuInfo = jSONObject;
        }
    }

    public JSONObject getItemInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("440443fe", new Object[]{this}) : this.itemInfo;
    }

    public void setItemInfo(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("511b5446", new Object[]{this, jSONObject});
        } else {
            this.itemInfo = jSONObject;
        }
    }

    public String getSelectSku() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("168ffc0e", new Object[]{this}) : this.selectSku;
    }

    public void setSelectSku(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dad4190", new Object[]{this, str});
        } else {
            this.selectSku = str;
        }
    }

    public int getInvokeSource() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("79f9b923", new Object[]{this})).intValue() : this.invokeSource;
    }

    public void setInvokeSource(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0d3ec47", new Object[]{this, new Integer(i)});
        } else {
            this.invokeSource = i;
        }
    }

    public long getFeedId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ea71e74a", new Object[]{this})).longValue() : this.feedId;
    }

    public void setFeedId(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa30eda2", new Object[]{this, new Long(j)});
        } else {
            this.feedId = j;
        }
    }

    public String getSkuVids() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2c918d90", new Object[]{this}) : this.skuVids;
    }

    public void setSkuVids(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ca3ad4e", new Object[]{this, str});
        } else {
            this.skuVids = str;
        }
    }

    public String getGroupId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("99b7d9b5", new Object[]{this}) : this.groupId;
    }

    public void setGroupId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a446e5c9", new Object[]{this, str});
        } else {
            this.groupId = str;
        }
    }

    public String getExpression() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("17aea92b", new Object[]{this}) : this.expression;
    }

    public void setExpression(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("551003ab", new Object[]{this, str});
        } else {
            this.expression = str;
        }
    }

    public String getRateType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("44197f49", new Object[]{this}) : this.rateType;
    }

    public void setRateType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9f3c44d", new Object[]{this, str});
        } else {
            this.rateType = str;
        }
    }

    public JSONObject getExParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("512995b6", new Object[]{this}) : this.exParams;
    }

    public void setExParams(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8a0398e", new Object[]{this, jSONObject});
        } else {
            this.exParams = jSONObject;
        }
    }

    public int getFoldFlag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5e955f7d", new Object[]{this})).intValue() : this.foldFlag;
    }

    public void setOpenMode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("144f52e0", new Object[]{this, str});
        } else {
            this.openMode = str;
        }
    }

    public String getOpenMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a9985256", new Object[]{this}) : this.openMode;
    }

    public long getClickTimeMS() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("90c0b9a0", new Object[]{this})).longValue() : this.clickTimeMS;
    }

    public void setClickTimeMS(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b5387a4", new Object[]{this, new Long(j)});
        } else {
            this.clickTimeMS = j;
        }
    }

    public long getNavTimeMS() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5f5301fb", new Object[]{this})).longValue() : this.navTimeMS;
    }

    public void setNavTimeMS(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53041da9", new Object[]{this, new Long(j)});
        } else {
            this.navTimeMS = j;
        }
    }

    public JSONObject getDetailRate() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("9478bcee", new Object[]{this}) : this.detailRate;
    }

    public void setDetailRate(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adaa2c56", new Object[]{this, jSONObject});
        } else {
            this.detailRate = jSONObject;
        }
    }

    /* loaded from: classes7.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f17007a;
        private String b;
        private String c;
        private String d;
        private String e;
        private String f;
        private String g;
        private String h;
        private JSONObject i;
        private JSONObject j;
        private String k;
        private String l;
        private int m;
        private long n;
        private List<RateKeyword> o;
        private JSONObject p;
        private String q;
        private String r;
        private JSONObject s;
        private JSONObject t;
        private int u;
        private String v;
        private String w;
        private long x;
        private long y;
        private JSONObject z;

        public static /* synthetic */ String a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6011a55c", new Object[]{aVar}) : aVar.b;
        }

        public static /* synthetic */ String b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("53a1299d", new Object[]{aVar}) : aVar.f17007a;
        }

        public static /* synthetic */ String c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4730adde", new Object[]{aVar}) : aVar.d;
        }

        public static /* synthetic */ String d(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3ac0321f", new Object[]{aVar}) : aVar.e;
        }

        public static /* synthetic */ String e(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2e4fb660", new Object[]{aVar}) : aVar.f;
        }

        public static /* synthetic */ String f(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("21df3aa1", new Object[]{aVar}) : aVar.g;
        }

        public static /* synthetic */ List g(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("f48c4509", new Object[]{aVar}) : aVar.o;
        }

        public static /* synthetic */ String h(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8fe4323", new Object[]{aVar}) : aVar.h;
        }

        public static /* synthetic */ String i(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fc8dc764", new Object[]{aVar}) : aVar.k;
        }

        public static /* synthetic */ String j(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f01d4ba5", new Object[]{aVar}) : aVar.c;
        }

        public static /* synthetic */ JSONObject k(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("623d1b1a", new Object[]{aVar}) : aVar.p;
        }

        public static /* synthetic */ JSONObject l(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("7b3e6cb9", new Object[]{aVar}) : aVar.s;
        }

        public static /* synthetic */ String m(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("cacbd868", new Object[]{aVar}) : aVar.l;
        }

        public static /* synthetic */ int n(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("32d380ca", new Object[]{aVar})).intValue() : aVar.m;
        }

        public static /* synthetic */ long o(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ec4b0e6a", new Object[]{aVar})).longValue() : aVar.n;
        }

        public static /* synthetic */ String p(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a57a652b", new Object[]{aVar}) : aVar.q;
        }

        public static /* synthetic */ String q(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9909e96c", new Object[]{aVar}) : aVar.r;
        }

        public static /* synthetic */ JSONObject r(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("11465673", new Object[]{aVar}) : aVar.t;
        }

        public static /* synthetic */ int s(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d22944e5", new Object[]{aVar})).intValue() : aVar.u;
        }

        public static /* synthetic */ JSONObject t(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("4348f9b1", new Object[]{aVar}) : aVar.j;
        }

        public static /* synthetic */ String u(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6747fa70", new Object[]{aVar}) : aVar.v;
        }

        public static /* synthetic */ String v(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5ad77eb1", new Object[]{aVar}) : aVar.w;
        }

        public static /* synthetic */ long w(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b8077b62", new Object[]{aVar})).longValue() : aVar.x;
        }

        public static /* synthetic */ long x(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("717f0901", new Object[]{aVar})).longValue() : aVar.y;
        }

        public static /* synthetic */ JSONObject y(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("c04f91cc", new Object[]{aVar}) : aVar.z;
        }

        public a a(List<RateKeyword> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("2b5205b5", new Object[]{this, list});
            }
            if (list != null && list.size() > 0) {
                for (RateKeyword rateKeyword : list) {
                    if (rateKeyword.type == 1) {
                        rateKeyword.type = -1;
                    } else {
                        rateKeyword.type = 1;
                    }
                }
            }
            this.o = list;
            return this;
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("dc6d9b8e", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }

        public a a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("e661bce4", new Object[]{this, jSONObject});
            }
            this.j = jSONObject;
            return this;
        }

        public String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.b;
        }

        public a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("cffd1fcf", new Object[]{this, str});
            }
            this.f17007a = str;
            return this;
        }

        public a c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("c38ca410", new Object[]{this, str});
            }
            this.v = str;
            return this;
        }

        public a d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("b71c2851", new Object[]{this, str});
            }
            this.e = str;
            return this;
        }

        public a e(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("aaabac92", new Object[]{this, str});
            }
            this.d = str;
            return this;
        }

        public RateInfo b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (RateInfo) ipChange.ipc$dispatch("ff981b22", new Object[]{this}) : new RateInfo(this);
        }

        public a f(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("9e3b30d3", new Object[]{this, str});
            }
            this.k = str;
            return this;
        }

        public a g(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("91cab514", new Object[]{this, str});
            }
            this.c = str;
            return this;
        }

        public a b(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("ff630e83", new Object[]{this, jSONObject});
            }
            this.i = jSONObject;
            if (jSONObject != null) {
                this.f = jSONObject.getString("askText");
                this.g = jSONObject.getString("linkUrl");
                this.h = jSONObject.getString("askIcon");
            }
            return this;
        }

        public a c(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("18646022", new Object[]{this, jSONObject});
            }
            this.p = jSONObject;
            return this;
        }

        public a d(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("3165b1c1", new Object[]{this, jSONObject});
            }
            this.s = jSONObject;
            return this;
        }

        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            } else {
                this.m = i;
            }
        }

        public void a(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
            } else {
                this.n = j;
            }
        }

        public void h(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb017cf9", new Object[]{this, str});
            } else {
                this.q = str;
            }
        }

        public void i(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4533163a", new Object[]{this, str});
            } else {
                this.r = str;
            }
        }

        public void j(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8f64af7b", new Object[]{this, str});
            } else {
                this.w = str;
            }
        }

        public void b(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a9d66ffb", new Object[]{this, new Long(j)});
            } else {
                this.x = j;
            }
        }

        public void c(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ab8b489a", new Object[]{this, new Long(j)});
            } else {
                this.y = j;
            }
        }

        public void f(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e9040aa3", new Object[]{this, jSONObject});
            } else {
                this.z = jSONObject;
            }
        }

        public a e(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("4a670360", new Object[]{this, jSONObject});
            }
            if ("true".equalsIgnoreCase(OrangeConfig.getInstance().getConfig("tb_ratedisplay_Android", "use_ex_params", "false"))) {
                this.t = jSONObject;
            }
            return this;
        }

        public a b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("cff1396", new Object[]{this, new Integer(i)});
            }
            this.u = i;
            return this;
        }
    }
}
