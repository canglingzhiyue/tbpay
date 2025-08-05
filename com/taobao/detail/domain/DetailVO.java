package com.taobao.detail.domain;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.detail.clientDomain.TaobaoPreSaleInfo;
import com.taobao.detail.domain.base.ActionUnit;
import com.taobao.detail.domain.base.BaseVO;
import com.taobao.detail.domain.base.ButtonUnit;
import com.taobao.detail.domain.base.PriceUnit;
import com.taobao.detail.domain.base.TipDO;
import com.taobao.detail.domain.base.Unit;
import com.taobao.detail.domain.biz.InstallmentInfo;
import com.taobao.detail.domain.biz.SaleRegionInfo;
import com.taobao.detail.domain.biz.ServiceInfo;
import com.taobao.detail.domain.component.BaseInputView;
import com.taobao.detail.domain.control.WaitingControl;
import com.taobao.detail.domain.o2o.O2OInfo;
import com.taobao.detail.domain.rate.RateDetail;
import com.taobao.detail.domain.rate.RateTag;
import com.taobao.detail.domain.template.LayoutInfo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tb.kge;
import tb.rjq;

/* loaded from: classes7.dex */
public class DetailVO implements Serializable {
    public static final String MOCK_DYN = "defDyn";
    public List<Unit> apiStack;
    public long buyerId;
    public DynamicItem dynamicItem;
    public Map<String, Object> extras;
    public Map<String, Object> featureMap = new HashMap();
    public boolean forbid;
    public Map<String, Object> queryParams;
    public StaticItem staticItem;

    static {
        kge.a(-1127920630);
        kge.a(1028243835);
    }

    /* loaded from: classes7.dex */
    public static class StaticItem implements Serializable {
        public List<String> displayType;
        public O2OInfo o2oInfo;
        public ParamInfo paramInfo;
        public TaobaoPreSaleInfo taobaoPreSaleInfo;
        public Map<String, String> trackAllParams;
        public Map<String, String> trackParams;
        public ItemInfo itemInfo = new ItemInfo();
        public SaleInfo saleInfo = new SaleInfo();
        public Seller seller = new Seller();
        public GuaranteeInfo guaranteeInfo = new GuaranteeInfo();
        public List<Unit> props = new ArrayList();
        public DescInfo descInfo = new DescInfo();
        public RateInfo rateInfo = new RateInfo();

        /* loaded from: classes7.dex */
        public static class DescInfo extends BaseVO {
            public String briefDescUrl;
            public String fullDescUrl;
            public String h5DescUrl;
            public String h5DescUrl2;
            public String moduleDescUrl;
            public String moduleDescUrl2;
            public String pcDescUrl;
            public String showFullDetailDesc;
            public String wapDescUrl;

            static {
                kge.a(937952744);
            }
        }

        /* loaded from: classes7.dex */
        public static class ItemInfo extends BaseVO {
            public String categoryId;
            public String comboH5Url;
            public Unit comboUrl;
            public Long favcount;
            public String itemIcon;
            public String itemId;
            public String itemTypeLogo;
            public String itemTypeName;
            public String itemUrl;
            public String location;
            public List<String> picsPath;
            public String saleLine;
            public Boolean sku;
            public String startTime;
            public String stuffStatus;
            public String subTitle;
            public String title;
            public List<String> videosPath;
            public String weight;

            static {
                kge.a(1098150250);
            }
        }

        /* loaded from: classes7.dex */
        public static class ParamInfo implements Serializable {
            public Map<String, String> buyParam;
            public Map<String, String> cartParam;

            static {
                kge.a(-496769806);
                kge.a(1028243835);
            }
        }

        /* loaded from: classes7.dex */
        public static class RateInfo extends BaseVO {
            public Integer rateCounts;
            public List<RateDetail> rateDetailList;
            public List<RateTag> tagList;

            static {
                kge.a(342922423);
            }
        }

        /* loaded from: classes7.dex */
        public static class SaleInfo extends BaseVO {
            public CascadeInfo cascadeInfo;
            public ArrayList<BaseInputView> components;
            public String h5SkuUrl;
            public Map<String, String> ppathIdmap;
            public List<SkuProp> skuProps;
            public String skuTitle;

            /* loaded from: classes7.dex */
            public static class CascadeInfo implements Serializable {
                public Set<Long> rootPropIds = new HashSet();
                public Map<Long, Integer> casPropDepthMap = new HashMap();
                public Map<Long, List<SKUCascadeVO>> topSkuPVMap = new HashMap();
                public Map<String, List<SKUCascadeVO>> skuCascadeMap = new HashMap();

                /* loaded from: classes7.dex */
                public static class SKUCascadeVO implements Serializable {
                    public String actualValueText;
                    public String propertyText;
                    public String propertyValueId;
                    public Long valueId;

                    static {
                        kge.a(1047179576);
                        kge.a(1028243835);
                    }
                }

                static {
                    kge.a(234770012);
                    kge.a(1028243835);
                }
            }

            /* loaded from: classes7.dex */
            public static class SkuProp implements Serializable {
                public Long propId;
                public String propName;
                public List<SkuPropValue> values;

                /* loaded from: classes7.dex */
                public static class SkuPropValue implements Serializable {
                    public List<String> cascadeTitles;
                    public String imgUrl;
                    public String name;
                    public String propId;
                    public List<SkuPropValue> subProps;
                    public String valueAlias;
                    public Long valueId;

                    static {
                        kge.a(983111611);
                        kge.a(1028243835);
                    }
                }

                static {
                    kge.a(-2086116358);
                    kge.a(1028243835);
                }
            }

            static {
                kge.a(1856699550);
            }
        }

        /* loaded from: classes7.dex */
        public static class Seller extends BaseVO {
            public List<ActionUnit> actionUnits;
            public String bailAmount;
            public List<ButtonUnit> buttons;
            public String certificateLogo;
            public String certify;
            public Integer creditLevel;
            public String distance;
            public List<EvaluateInfoVO> evaluateInfo;
            public String fansCount;
            public String fansCountText;
            public String goodRatePercentage;
            public String hideDsr;
            public String hideWangwang;
            public String nick;
            public String o2oMapUrl;
            public String picUrl;
            public String shopBrand;
            public Integer shopCollectorCount;
            public String shopIcon;
            public Integer shopId;
            public String shopLocation;
            public String shopPromtionType;
            public String shopTitle;
            public String shopType;
            public String starts;
            public String tollFreeNumber;
            public String tollFreeSubNumber;
            public String type;
            public Long userNumId;
            public Long weitaoId;

            /* loaded from: classes7.dex */
            public static class EvaluateInfoVO implements Serializable {
                public String highGap;
                public String name;
                public String score;
                public String title;

                static {
                    kge.a(-4639396);
                    kge.a(1028243835);
                }
            }

            static {
                kge.a(-1424532280);
            }
        }

        static {
            kge.a(1887862683);
            kge.a(1028243835);
        }

        /* loaded from: classes7.dex */
        public static class GuaranteeInfo extends BaseVO {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            @Deprecated
            public List<Guarantee> afterGuarantees;
            @Deprecated
            public List<Guarantee> beforeGuarantees;
            @Deprecated
            public List<Guarantee> guarantees;

            static {
                kge.a(1807167981);
            }

            public List<Guarantee> list() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (List) ipChange.ipc$dispatch("b5f56d82", new Object[]{this});
                }
                ArrayList arrayList = new ArrayList();
                if (!rjq.a(this.beforeGuarantees)) {
                    arrayList.addAll(this.beforeGuarantees);
                }
                if (!rjq.a(this.guarantees)) {
                    arrayList.addAll(this.guarantees);
                }
                if (!rjq.a(this.afterGuarantees)) {
                    arrayList.addAll(this.afterGuarantees);
                }
                return arrayList;
            }

            /* loaded from: classes7.dex */
            public static class Guarantee implements Serializable {
                public Unit actionUrl;
                public String icon;
                public String title;

                static {
                    kge.a(-680577935);
                    kge.a(1028243835);
                }

                public Guarantee(String str, String str2) {
                    this.title = str;
                    this.icon = str2;
                }

                public Guarantee(String str) {
                    this.title = str;
                }

                public Guarantee() {
                }
            }
        }
    }

    /* loaded from: classes7.dex */
    public static class DynamicItem implements Serializable {
        public Map<String, String> abTestInfo;
        public Delivery delivery;
        public Double11Coupon double11Coupon;
        public boolean installmentEnable = false;
        public Map<String, List<InstallmentInfo>> installmentInfos;
        public boolean isMakeup;
        public ItemControl itemControl;
        public LayoutInfo layoutInfo;
        public String payedCount;
        public String points;
        public List<PriceUnit> priceUnits;
        public Long quantity;
        public String quantityText;
        public ServiceInfo serviceInfo;
        public ShareInfo shareInfo;
        public ShopPromotion shopPromotion;
        public String skuTitle;
        public Map<String, SkuPriceAndQuanitiy> skus;
        public String soldQuantityText;
        public StageInfo stageInfo;
        public List<String> subInfos;
        public Map<String, List<TipDO>> tips;
        public Integer totalSoldQuantity;

        /* loaded from: classes7.dex */
        public static class Coupon implements Serializable {
            public Long conponId;
            public String couponName;
            public String end;
            public String hasApply;
            public String start;
            public String startFee;
            public Integer type;
            public String value;

            static {
                kge.a(-785933262);
                kge.a(1028243835);
            }
        }

        /* loaded from: classes7.dex */
        public static class Delivery extends BaseVO {
            @Deprecated
            public String areaId;
            public Unit areaListApi;
            public List<String> deliveryFees;
            public String destination;
            @Deprecated
            public Unit getAreaApi;
            @Deprecated
            public SaleRegionInfo saleRegionInfo;
            @Deprecated
            public Unit updateAreaApi;

            static {
                kge.a(1826163968);
            }
        }

        /* loaded from: classes7.dex */
        public static class Double11Coupon extends BaseVO {
            public String logo;
            public String txt;
            public String url;

            static {
                kge.a(-2011970237);
            }
        }

        /* loaded from: classes7.dex */
        public static class ShareInfo extends BaseVO {
            public Map<String, String> params;
            public String name = "分享";
            public int iconType = 1;

            static {
                kge.a(-563523167);
            }
        }

        /* loaded from: classes7.dex */
        public static class ShopPromotion extends BaseVO {
            public List<Coupon> couponList;
            public List<String> descriptions;
            public String freeText;
            public String freeUrl;
            public String promotionData;
            public Boolean superAct;
            public String title;

            static {
                kge.a(-156889919);
            }
        }

        /* loaded from: classes7.dex */
        public static class SkuPriceAndQuanitiy extends BaseVO {
            public List<PriceUnit> priceUnits;
            public Integer quantity;
            public String quantityText;
            public String simplePrice;

            static {
                kge.a(-1306363637);
            }
        }

        /* loaded from: classes7.dex */
        public static class StageInfo extends BaseVO {
            public List<String> descriptions;
            public String title;

            static {
                kge.a(-1439556288);
            }
        }

        static {
            kge.a(1564905016);
            kge.a(1028243835);
        }

        /* loaded from: classes7.dex */
        public static class ItemControl implements Serializable {
            public String buyUrl;
            public String degradedItemUrl;
            public Map<String, UnitControl> skuControl;
            public Boolean smartbanner;
            public UnitControl unitControl;
            public WaitingControl waitingControl;

            static {
                kge.a(265574974);
                kge.a(1028243835);
            }

            /* loaded from: classes7.dex */
            public static class UnitControl implements Serializable {
                public static volatile transient /* synthetic */ IpChange $ipChange;
                public String baseTime;
                public Unit beforeBuyApi;
                public Unit beforeCartApi;
                public String errorCode;
                public String errorLink;
                public String errorMessage;
                public HintBanner hintBanner;
                public Integer limitCount;
                public String limitMultipleText;
                public String offShelfUrl;
                public String unitTip;
                public Integer limitMultipleCount = 1;
                public boolean cartSupport = true;
                public boolean buySupport = true;
                public String buyText = "立即购买";
                public String cartText = "加入购物车";
                public String submitText = "立即购买";

                static {
                    kge.a(-1067713101);
                    kge.a(1028243835);
                }

                public void setSupportCartTrue() {
                    IpChange ipChange = $ipChange;
                    boolean z = false;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("50a47402", new Object[]{this});
                        return;
                    }
                    boolean z2 = this.cartSupport;
                    if (z2 && z2) {
                        z = true;
                    }
                    this.cartSupport = z;
                }

                public void setSupportBuyTrue() {
                    IpChange ipChange = $ipChange;
                    boolean z = false;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("618e46e", new Object[]{this});
                        return;
                    }
                    boolean z2 = this.buySupport;
                    if (z2 && z2) {
                        z = true;
                    }
                    this.buySupport = z;
                }

                public void setSupportCartFalse() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("10d80dd", new Object[]{this});
                    } else {
                        this.cartSupport = false;
                    }
                }

                public void setSupportBuyFalse() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("fa271df1", new Object[]{this});
                    } else {
                        this.buySupport = false;
                    }
                }

                public void setCartSupport(boolean z) {
                    IpChange ipChange = $ipChange;
                    boolean z2 = true;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("e66ae480", new Object[]{this, new Boolean(z)});
                        return;
                    }
                    if (!z || !this.cartSupport) {
                        z2 = false;
                    }
                    this.cartSupport = z2;
                }

                public void setBuySupport(boolean z) {
                    IpChange ipChange = $ipChange;
                    boolean z2 = true;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("22696da2", new Object[]{this, new Boolean(z)});
                        return;
                    }
                    if (!z || !this.buySupport) {
                        z2 = false;
                    }
                    this.buySupport = z2;
                }
            }
        }
    }
}
