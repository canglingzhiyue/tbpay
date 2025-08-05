package com.taobao.search.m3;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.search.common.dynamic.bean.SearchDomBean;
import com.taobao.search.jarvis.bean.DynamicCardBean;
import com.taobao.search.mmd.datasource.bean.AuctionBaseBean;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes7.dex */
public class M3CellBean extends BaseCellBean {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final int FEEDBACK_ALL = 1;
    public static final int FEEDBACK_CLICK = 3;
    public static final int FEEDBACK_LONG_PRESS = 2;
    public static final int FEEDBACK_PLT = 4;
    public static final int ICON_UPS_MERGE_ICON = 2;
    public static final int ICON_UPS_MERGE_USP = 1;
    public static final int MERGE_LOC_TO_PRICE_BOTTOM = 2;
    public static final int MERGE_LOC_TO_PRICE_TOP = 1;
    private static final HashSet<String> summaryShowType;
    private String auctionURL;
    private JSONObject backCardRqParams;
    private com.taobao.search.m3.interactive.b bottomTagInfo;
    private JSONObject clickBackParams;
    private String clickUrl;
    private com.taobao.search.m3.comment.a commentInfo;
    private com.taobao.search.m3.composite.b compositeInfo;
    private com.taobao.search.m3.discount.a discountInfo;
    private DynamicCardBean dynamicCardBean;
    private boolean exposed;
    private JSONObject extDetailParams;
    private JSONArray extraParams;
    private com.taobao.search.m3.feedback.a feedback;
    private String finalTargetUrl;
    private com.taobao.search.m3.flash.b flashSaleInfo;
    private boolean hasPreRequestDetail;
    private com.taobao.search.m3.icons.b iconInfo;
    private com.taobao.search.m3.interactive.b interactiveInfo;
    private boolean isClicked;
    private com.taobao.search.m3.more.a jiaGouInfo;
    private Boolean jiaGouSupport;
    private boolean jiaGouUt;
    private com.taobao.search.m3.image.c leftScriptInfo;
    private boolean listIconInTop;
    private boolean moveP4pIconBottom;
    private String newDate;
    private JSONObject originData;
    private com.taobao.search.m3.image.i p4pIcon;
    private boolean p4pIconBottomLeft;
    private int p4pIconHeight;
    private String p4pIconUrl;
    private int p4pIconWidth;
    private JSONObject pageInfo;
    private String picPath;
    private com.taobao.search.m3.more.pk.a pkInfo;
    private String pltSimilarUrl;
    private String prefetchImgRatio;
    private com.taobao.search.m3.price.e priceInfo;
    private com.taobao.search.m3.property.a propertyInfo;
    private com.taobao.search.m3.shoinfo.b shopInfo;
    private String similarSameUrl;
    private com.taobao.search.m3.singlerow.b singleRowInfo;
    private String skuSourceType;
    private com.taobao.search.m3.property.a summaryTips;
    private String title;
    private SearchDomBean titleIcon;
    private List<SearchDomBean> titleIcons;
    private String uprightImage;
    private boolean useAuctionURL;
    private boolean uspBottom;
    private boolean uspInWhiteList;
    private JSONObject utLogMap;
    private boolean videoAutoPlay;
    private boolean videoForcePlay;
    private String wfRatioOrigin;
    private JSONObject wsData;
    private int x_qzt_ad;
    private float wfRatio = 1.0f;
    private int wfTitleLines = 1;
    private int listTitleLines = 2;
    private int iconUspMerge = -1;
    private int mergeLocToPrice = -1;
    private int listMergeLocToPrice = -1;
    private int feedbackType = 4;
    private AuctionBaseBean auctionBean = new AuctionBaseBean();
    private String etype = "";

    /* loaded from: classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1792412235);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        public final HashSet<String> a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (HashSet) ipChange.ipc$dispatch("be7f2185", new Object[]{this}) : M3CellBean.access$getSummaryShowType$cp();
        }
    }

    public static final /* synthetic */ HashSet access$getSummaryShowType$cp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashSet) ipChange.ipc$dispatch("a21493ee", new Object[0]) : summaryShowType;
    }

    static {
        kge.a(1860353709);
        Companion = new a(null);
        HashSet<String> hashSet = new HashSet<>();
        summaryShowType = hashSet;
        hashSet.add("adAbstract");
        summaryShowType.add("tmRank");
        summaryShowType.add("shopRank");
        summaryShowType.add("aiSalePoint");
    }

    public final String getPicPath() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a860c800", new Object[]{this}) : this.picPath;
    }

    public final void setPicPath(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6abbc0de", new Object[]{this, str});
        } else {
            this.picPath = str;
        }
    }

    public final com.taobao.search.m3.image.i getP4pIcon() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.search.m3.image.i) ipChange.ipc$dispatch("df507f2f", new Object[]{this}) : this.p4pIcon;
    }

    public final void setP4pIcon(com.taobao.search.m3.image.i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d8d0ef9", new Object[]{this, iVar});
        } else {
            this.p4pIcon = iVar;
        }
    }

    public final boolean getMoveP4pIconBottom() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("906ff354", new Object[]{this})).booleanValue() : this.moveP4pIconBottom;
    }

    public final void setMoveP4pIconBottom(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afd2c590", new Object[]{this, new Boolean(z)});
        } else {
            this.moveP4pIconBottom = z;
        }
    }

    public final String getP4pIconUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50c8bd99", new Object[]{this}) : this.p4pIconUrl;
    }

    public final void setP4pIconUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f387cfd", new Object[]{this, str});
        } else {
            this.p4pIconUrl = str;
        }
    }

    public final int getP4pIconWidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6158ae71", new Object[]{this})).intValue() : this.p4pIconWidth;
    }

    public final void setP4pIconWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a553a0b9", new Object[]{this, new Integer(i)});
        } else {
            this.p4pIconWidth = i;
        }
    }

    public final int getP4pIconHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("83efc110", new Object[]{this})).intValue() : this.p4pIconHeight;
    }

    public final void setP4pIconHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91345792", new Object[]{this, new Integer(i)});
        } else {
            this.p4pIconHeight = i;
        }
    }

    public final boolean getP4pIconBottomLeft() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5120f3cc", new Object[]{this})).booleanValue() : this.p4pIconBottomLeft;
    }

    public final void setP4pIconBottomLeft(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("541d418", new Object[]{this, new Boolean(z)});
        } else {
            this.p4pIconBottomLeft = z;
        }
    }

    public final String getUprightImage() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5c7fc109", new Object[]{this}) : this.uprightImage;
    }

    public final void setUprightImage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c416d48d", new Object[]{this, str});
        } else {
            this.uprightImage = str;
        }
    }

    public final float getWfRatio() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f15767bd", new Object[]{this})).floatValue() : this.wfRatio;
    }

    public final void setWfRatio(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fdef49f", new Object[]{this, new Float(f)});
        } else {
            this.wfRatio = f;
        }
    }

    public final String getWfRatioOrigin() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9210496d", new Object[]{this}) : this.wfRatioOrigin;
    }

    public final void setWfRatioOrigin(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e498c611", new Object[]{this, str});
        } else {
            this.wfRatioOrigin = str;
        }
    }

    public final String getTitle() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b5267f97", new Object[]{this}) : this.title;
    }

    public final void setTitle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c820927", new Object[]{this, str});
        } else {
            this.title = str;
        }
    }

    public final List<SearchDomBean> getTitleIcons() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("8c170848", new Object[]{this}) : this.titleIcons;
    }

    public final void setTitleIcons(List<SearchDomBean> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7a0e71c", new Object[]{this, list});
        } else {
            this.titleIcons = list;
        }
    }

    public final SearchDomBean getTitleIcon() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SearchDomBean) ipChange.ipc$dispatch("251c24c8", new Object[]{this}) : this.titleIcon;
    }

    public final void setTitleIcon(SearchDomBean searchDomBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6590160", new Object[]{this, searchDomBean});
        } else {
            this.titleIcon = searchDomBean;
        }
    }

    public final String getNewDate() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("40a028c1", new Object[]{this}) : this.newDate;
    }

    public final void setNewDate(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da68783d", new Object[]{this, str});
        } else {
            this.newDate = str;
        }
    }

    public final int getWfTitleLines() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fbe808a6", new Object[]{this})).intValue() : this.wfTitleLines;
    }

    public final void setWfTitleLines(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5caf8d24", new Object[]{this, new Integer(i)});
        } else {
            this.wfTitleLines = i;
        }
    }

    public final int getListTitleLines() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ce5bceb5", new Object[]{this})).intValue() : this.listTitleLines;
    }

    public final void setListTitleLines(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b633bf5", new Object[]{this, new Integer(i)});
        } else {
            this.listTitleLines = i;
        }
    }

    public final boolean isClicked() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("19b245a8", new Object[]{this})).booleanValue() : this.isClicked;
    }

    public final void setClicked(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e133bce8", new Object[]{this, new Boolean(z)});
        } else {
            this.isClicked = z;
        }
    }

    public final com.taobao.search.m3.flash.b getFlashSaleInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.search.m3.flash.b) ipChange.ipc$dispatch("ffaa2341", new Object[]{this}) : this.flashSaleInfo;
    }

    public final void setFlashSaleInfo(com.taobao.search.m3.flash.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78164c4b", new Object[]{this, bVar});
        } else {
            this.flashSaleInfo = bVar;
        }
    }

    public final com.taobao.search.m3.discount.a getDiscountInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.search.m3.discount.a) ipChange.ipc$dispatch("c798b155", new Object[]{this}) : this.discountInfo;
    }

    public final void setDiscountInfo(com.taobao.search.m3.discount.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62e314c1", new Object[]{this, aVar});
        } else {
            this.discountInfo = aVar;
        }
    }

    public final com.taobao.search.m3.price.e getPriceInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.search.m3.price.e) ipChange.ipc$dispatch("b2e4acf3", new Object[]{this}) : this.priceInfo;
    }

    public final void setPriceInfo(com.taobao.search.m3.price.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b427e621", new Object[]{this, eVar});
        } else {
            this.priceInfo = eVar;
        }
    }

    public final com.taobao.search.m3.shoinfo.b getShopInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.search.m3.shoinfo.b) ipChange.ipc$dispatch("71c7a15e", new Object[]{this}) : this.shopInfo;
    }

    public final void setShopInfo(com.taobao.search.m3.shoinfo.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1321deb6", new Object[]{this, bVar});
        } else {
            this.shopInfo = bVar;
        }
    }

    public final com.taobao.search.m3.icons.b getIconInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.search.m3.icons.b) ipChange.ipc$dispatch("ff468949", new Object[]{this}) : this.iconInfo;
    }

    public final void setIconInfo(com.taobao.search.m3.icons.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c41a44c7", new Object[]{this, bVar});
        } else {
            this.iconInfo = bVar;
        }
    }

    public final com.taobao.search.m3.interactive.b getInteractiveInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.search.m3.interactive.b) ipChange.ipc$dispatch("34a83364", new Object[]{this}) : this.interactiveInfo;
    }

    public final void setInteractiveInfo(com.taobao.search.m3.interactive.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15c596a4", new Object[]{this, bVar});
        } else {
            this.interactiveInfo = bVar;
        }
    }

    public final com.taobao.search.m3.interactive.b getBottomTagInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.search.m3.interactive.b) ipChange.ipc$dispatch("55711837", new Object[]{this}) : this.bottomTagInfo;
    }

    public final void setBottomTagInfo(com.taobao.search.m3.interactive.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81881931", new Object[]{this, bVar});
        } else {
            this.bottomTagInfo = bVar;
        }
    }

    public final com.taobao.search.m3.comment.a getCommentInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.search.m3.comment.a) ipChange.ipc$dispatch("abf3be8b", new Object[]{this}) : this.commentInfo;
    }

    public final void setCommentInfo(com.taobao.search.m3.comment.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f09ff6e5", new Object[]{this, aVar});
        } else {
            this.commentInfo = aVar;
        }
    }

    public final com.taobao.search.m3.composite.b getCompositeInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.search.m3.composite.b) ipChange.ipc$dispatch("83c2789a", new Object[]{this}) : this.compositeInfo;
    }

    public final void setCompositeInfo(com.taobao.search.m3.composite.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fed3744", new Object[]{this, bVar});
        } else {
            this.compositeInfo = bVar;
        }
    }

    public final com.taobao.search.m3.singlerow.b getSingleRowInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.search.m3.singlerow.b) ipChange.ipc$dispatch("4e8c9924", new Object[]{this}) : this.singleRowInfo;
    }

    public final void setSingleRowInfo(com.taobao.search.m3.singlerow.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b39b3844", new Object[]{this, bVar});
        } else {
            this.singleRowInfo = bVar;
        }
    }

    public final com.taobao.search.m3.property.a getPropertyInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.search.m3.property.a) ipChange.ipc$dispatch("a213d4d5", new Object[]{this}) : this.propertyInfo;
    }

    public final void setPropertyInfo(com.taobao.search.m3.property.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f73e3699", new Object[]{this, aVar});
        } else {
            this.propertyInfo = aVar;
        }
    }

    public final com.taobao.search.m3.property.a getSummaryTips() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.search.m3.property.a) ipChange.ipc$dispatch("8b5bc584", new Object[]{this}) : this.summaryTips;
    }

    public final void setSummaryTips(com.taobao.search.m3.property.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b528462", new Object[]{this, aVar});
        } else {
            this.summaryTips = aVar;
        }
    }

    public final int getIconUspMerge() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8131d5cf", new Object[]{this})).intValue() : this.iconUspMerge;
    }

    public final void setIconUspMerge(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("809f651b", new Object[]{this, new Integer(i)});
        } else {
            this.iconUspMerge = i;
        }
    }

    public final int getMergeLocToPrice() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ca189cca", new Object[]{this})).intValue() : this.mergeLocToPrice;
    }

    public final void setMergeLocToPrice(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f34ea018", new Object[]{this, new Integer(i)});
        } else {
            this.mergeLocToPrice = i;
        }
    }

    public final int getListMergeLocToPrice() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a46e8e4c", new Object[]{this})).intValue() : this.listMergeLocToPrice;
    }

    public final void setListMergeLocToPrice(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("993078d6", new Object[]{this, new Integer(i)});
        } else {
            this.listMergeLocToPrice = i;
        }
    }

    public final boolean getListIconInTop() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("23044d4e", new Object[]{this})).booleanValue() : this.listIconInTop;
    }

    public final void setListIconInTop(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4b190d6", new Object[]{this, new Boolean(z)});
        } else {
            this.listIconInTop = z;
        }
    }

    public final boolean getUspBottom() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6a9320b2", new Object[]{this})).booleanValue() : this.uspBottom;
    }

    public final void setUspBottom(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afc80ff2", new Object[]{this, new Boolean(z)});
        } else {
            this.uspBottom = z;
        }
    }

    public final boolean getUspInWhiteList() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("47ca5251", new Object[]{this})).booleanValue() : this.uspInWhiteList;
    }

    public final void setUspInWhiteList(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffc5699b", new Object[]{this, new Boolean(z)});
        } else {
            this.uspInWhiteList = z;
        }
    }

    public final JSONObject getUtLogMap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("40e47994", new Object[]{this}) : this.utLogMap;
    }

    public final void setUtLogMap(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f041d170", new Object[]{this, jSONObject});
        } else {
            this.utLogMap = jSONObject;
        }
    }

    public final JSONObject getClickBackParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("4e52aae6", new Object[]{this}) : this.clickBackParams;
    }

    public final void setClickBackParams(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb0e32f6", new Object[]{this, jSONObject});
        } else {
            this.clickBackParams = jSONObject;
        }
    }

    public final JSONObject getBackCardRqParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("ab9ec879", new Object[]{this}) : this.backCardRqParams;
    }

    public final void setBackCardRqParams(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35ddab2b", new Object[]{this, jSONObject});
        } else {
            this.backCardRqParams = jSONObject;
        }
    }

    public final com.taobao.search.m3.feedback.a getFeedback() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.search.m3.feedback.a) ipChange.ipc$dispatch("67cc7287", new Object[]{this}) : this.feedback;
    }

    public final void setFeedback(com.taobao.search.m3.feedback.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73d4f3c7", new Object[]{this, aVar});
        } else {
            this.feedback = aVar;
        }
    }

    public final int getFeedbackType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ec5948cf", new Object[]{this})).intValue() : this.feedbackType;
    }

    public final void setFeedbackType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a66521b", new Object[]{this, new Integer(i)});
        } else {
            this.feedbackType = i;
        }
    }

    public final String getPltSimilarUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9ee5dad3", new Object[]{this}) : this.pltSimilarUrl;
    }

    public final void setPltSimilarUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7275616b", new Object[]{this, str});
        } else {
            this.pltSimilarUrl = str;
        }
    }

    public final String getSimilarSameUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d4a53bc5", new Object[]{this}) : this.similarSameUrl;
    }

    public final void setSimilarSameUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0ce5e51", new Object[]{this, str});
        } else {
            this.similarSameUrl = str;
        }
    }

    public final DynamicCardBean getDynamicCardBean() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DynamicCardBean) ipChange.ipc$dispatch("f967758b", new Object[]{this}) : this.dynamicCardBean;
    }

    public final void setDynamicCardBean(DynamicCardBean dynamicCardBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f91d7947", new Object[]{this, dynamicCardBean});
        } else {
            this.dynamicCardBean = dynamicCardBean;
        }
    }

    public final Boolean getJiaGouSupport() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Boolean) ipChange.ipc$dispatch("f487d332", new Object[]{this}) : this.jiaGouSupport;
    }

    public final void setJiaGouSupport(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af14db44", new Object[]{this, bool});
        } else {
            this.jiaGouSupport = bool;
        }
    }

    public final boolean getJiaGouUt() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("207ca42b", new Object[]{this})).booleanValue() : this.jiaGouUt;
    }

    public final void setJiaGouUt(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81eefa01", new Object[]{this, new Boolean(z)});
        } else {
            this.jiaGouUt = z;
        }
    }

    public final com.taobao.search.m3.more.a getJiaGouInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.search.m3.more.a) ipChange.ipc$dispatch("1c97baab", new Object[]{this}) : this.jiaGouInfo;
    }

    public final void setJiaGouInfo(com.taobao.search.m3.more.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("665f8203", new Object[]{this, aVar});
        } else {
            this.jiaGouInfo = aVar;
        }
    }

    public final AuctionBaseBean getAuctionBean() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AuctionBaseBean) ipChange.ipc$dispatch("e8e51145", new Object[]{this}) : this.auctionBean;
    }

    public final void setAuctionBean(AuctionBaseBean auctionBaseBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8906459", new Object[]{this, auctionBaseBean});
            return;
        }
        q.c(auctionBaseBean, "<set-?>");
        this.auctionBean = auctionBaseBean;
    }

    public final String getFinalTargetUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("42268b7b", new Object[]{this}) : this.finalTargetUrl;
    }

    public final void setFinalTargetUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1377055b", new Object[]{this, str});
        } else {
            this.finalTargetUrl = str;
        }
    }

    public final int getX_qzt_ad() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("18b35b0e", new Object[]{this})).intValue() : this.x_qzt_ad;
    }

    public final void setX_qzt_ad(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("908ee1bc", new Object[]{this, new Integer(i)});
        } else {
            this.x_qzt_ad = i;
        }
    }

    public final String getEtype() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5c4c1f30", new Object[]{this}) : this.etype;
    }

    public final void setEtype(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da105cae", new Object[]{this, str});
        } else {
            this.etype = str;
        }
    }

    public final String getClickUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("69622edc", new Object[]{this}) : this.clickUrl;
    }

    public final void setClickUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dc1071a", new Object[]{this, str});
        } else {
            this.clickUrl = str;
        }
    }

    public final String getAuctionURL() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("de062017", new Object[]{this}) : this.auctionURL;
    }

    public final void setAuctionURL(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59a76a3f", new Object[]{this, str});
        } else {
            this.auctionURL = str;
        }
    }

    public final boolean getUseAuctionURL() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4a50f68", new Object[]{this})).booleanValue() : this.useAuctionURL;
    }

    public final void setUseAuctionURL(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("272911fc", new Object[]{this, new Boolean(z)});
        } else {
            this.useAuctionURL = z;
        }
    }

    public final String getPrefetchImgRatio() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bb6a3d84", new Object[]{this}) : this.prefetchImgRatio;
    }

    public final void setPrefetchImgRatio(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee200172", new Object[]{this, str});
        } else {
            this.prefetchImgRatio = str;
        }
    }

    public final JSONArray getExtraParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONArray) ipChange.ipc$dispatch("47000057", new Object[]{this}) : this.extraParams;
    }

    public final void setExtraParams(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2cd7fa3", new Object[]{this, jSONArray});
        } else {
            this.extraParams = jSONArray;
        }
    }

    public final String getSkuSourceType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("da91913d", new Object[]{this}) : this.skuSourceType;
    }

    public final void setSkuSourceType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac407841", new Object[]{this, str});
        } else {
            this.skuSourceType = str;
        }
    }

    public final JSONObject getPageInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("3e68ff7a", new Object[]{this}) : this.pageInfo;
    }

    public final void setPageInfo(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a34e084a", new Object[]{this, jSONObject});
        } else {
            this.pageInfo = jSONObject;
        }
    }

    public final com.taobao.search.m3.more.pk.a getPkInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.search.m3.more.pk.a) ipChange.ipc$dispatch("f4d7b36d", new Object[]{this}) : this.pkInfo;
    }

    public final void setPkInfo(com.taobao.search.m3.more.pk.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f676a6f", new Object[]{this, aVar});
        } else {
            this.pkInfo = aVar;
        }
    }

    public final com.taobao.search.m3.image.c getLeftScriptInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.search.m3.image.c) ipChange.ipc$dispatch("c7cae06e", new Object[]{this}) : this.leftScriptInfo;
    }

    public final void setLeftScriptInfo(com.taobao.search.m3.image.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bcca67e", new Object[]{this, cVar});
        } else {
            this.leftScriptInfo = cVar;
        }
    }

    public final JSONObject getExtDetailParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("14055e69", new Object[]{this}) : this.extDetailParams;
    }

    public final void setExtDetailParams(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbb1efd3", new Object[]{this, jSONObject});
        } else {
            this.extDetailParams = jSONObject;
        }
    }

    public final boolean getExposed() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("786da075", new Object[]{this})).booleanValue() : this.exposed;
    }

    public final void setExposed(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb901b8f", new Object[]{this, new Boolean(z)});
        } else {
            this.exposed = z;
        }
    }

    public final boolean getHasPreRequestDetail() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("13d0d96c", new Object[]{this})).booleanValue() : this.hasPreRequestDetail;
    }

    public final void setHasPreRequestDetail(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1617cf78", new Object[]{this, new Boolean(z)});
        } else {
            this.hasPreRequestDetail = z;
        }
    }

    public final JSONObject getOriginData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("6d23a08d", new Object[]{this}) : this.originData;
    }

    public final void setOriginData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea5bbc97", new Object[]{this, jSONObject});
        } else {
            this.originData = jSONObject;
        }
    }

    public final JSONObject getWsData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("86527d43", new Object[]{this}) : this.wsData;
    }

    public final void setWsData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54af50a1", new Object[]{this, jSONObject});
        } else {
            this.wsData = jSONObject;
        }
    }

    public final boolean getVideoAutoPlay() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("16b287f3", new Object[]{this})).booleanValue() : this.videoAutoPlay;
    }

    public final void setVideoAutoPlay(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56caaad1", new Object[]{this, new Boolean(z)});
        } else {
            this.videoAutoPlay = z;
        }
    }

    public final boolean getVideoForcePlay() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8ad90705", new Object[]{this})).booleanValue() : this.videoForcePlay;
    }

    public final void setVideoForcePlay(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e8d4b67", new Object[]{this, new Boolean(z)});
        } else {
            this.videoForcePlay = z;
        }
    }
}
