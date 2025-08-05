package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.h;
import com.taobao.android.order.constants.OrderBizCode;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import tb.cts;

/* loaded from: classes.dex */
public class ksk {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ksk HOME_CUN;
    public static final ksk HOME_INTL;
    public static final ksk HOME_MAIN;
    public static final ksk HOME_OLD;
    public static final ksk IMAGE_CONTENT_DETAIL;
    public static final ksk NEW_FACE_CHILD;
    public static final ksk NEW_FACE_CHILD_CAMPAIGN;
    public static final ksk NEW_FACE_CHILD_INTL;
    public static final ksk NEW_FACE_CHILD_INTL_LITE;
    public static final ksk NEW_FACE_PARENT;
    public static final ksk NEW_FACE_PARENT_INTL;
    public static final ksk REC_CART;
    public static final ksk REC_CONFIRM_RECEIPT;
    public static final ksk REC_CUN;
    public static final ksk REC_DETAIL;
    public static final ksk REC_DETAIL_EXPIRE;
    public static final ksk REC_DIRECT_SALE_CART;
    public static final ksk REC_FAVORITE;
    public static final ksk REC_INTL;
    public static final ksk REC_LOGISTICS;
    public static final ksk REC_MAIN;
    public static final ksk REC_MC_CART;
    public static final ksk REC_OLD;
    public static final ksk REC_ORDER_DETAIL;
    public static final ksk REC_ORDER_LIST;
    public static final ksk REC_ORDER_LIST_CATAPULT;
    public static final ksk REC_ORDER_SEARCH_RESULTS;
    public static final ksk REC_PAY_SUCCESS;
    public static final ksk REC_TAB_LIST;
    private static final Map<String, ksk> d;

    /* renamed from: a  reason: collision with root package name */
    public final String f30287a;
    public final String b;
    public final String c;

    static {
        kge.a(1741347607);
        d = new HashMap();
        HOME_MAIN = new ksk("entrance_home_main", "home_main", "Page_Home");
        HOME_INTL = new ksk("entrance_home_intl", "home_intl", "Page_Home");
        HOME_CUN = new ksk("entrance_home_cun", "home_cun", "Page_Home");
        HOME_OLD = new ksk("entrance_home_old", "home_old", "Page_Home");
        REC_MAIN = new ksk("recommend_home_main", "recommend_home_main", "Page_Home");
        REC_INTL = new ksk("recommend_home_intl", "recommend_home_intl", "Page_Home");
        REC_CUN = new ksk("recommend_home_cun", "recommend_home_cun", "Page_Home");
        REC_OLD = new ksk("recommend_home_old", "recommend_home_old", "Page_Home");
        REC_TAB_LIST = new ksk("recommend_home_main_tab", "recommend_home_main_tab", "Page_Home");
        REC_DETAIL = new ksk("recommend_itemdetail_main", "itemdetail", "Page_Detail");
        REC_DETAIL_EXPIRE = new ksk("recommend_itemdetail_main", "itemdetail", "Page_Detail");
        REC_FAVORITE = new ksk("recommend_collection_main", "favorite", "Page_Collection");
        REC_CART = new ksk("recommend_cart_main", "cart", "Page_ShoppingCart");
        REC_MC_CART = new ksk("recommend_tmallcart_main", "tmallcart", "Page_TmMarket");
        REC_ORDER_LIST = new ksk("recommend_orderlist_main", OrderBizCode.orderList, cts.a.BIZ_ORDER_LIST);
        REC_ORDER_LIST_CATAPULT = new ksk("recommend_orderlist_catapult_main", "orderlist_catapult", cts.a.BIZ_ORDER_LIST);
        REC_ORDER_SEARCH_RESULTS = new ksk("recommend_orderlist_main", "orderlist_search", cts.a.BIZ_ORDER_LIST);
        REC_ORDER_DETAIL = new ksk("recommend_orderdetail_main", OrderBizCode.orderDetail, cts.a.BIZ_ORDER_DETAIL);
        REC_LOGISTICS = new ksk("recommend_logistics_main", "logistics", "Page_Logistic");
        REC_DIRECT_SALE_CART = new ksk("recommend_intlcart_main", "directcart", "Page_ShoppingCart");
        REC_PAY_SUCCESS = new ksk("recommend_pay_success", alz.BizKeyPaysuccess, cts.a.BIZ_PAY_SUCCESS);
        REC_CONFIRM_RECEIPT = new ksk("recommend_confirm_receipt", "confirmreceipt", "Page_ConfirmReceipt");
        NEW_FACE_PARENT = new ksk(h.HOMEPAGE_NEWFACE, h.HOMEPAGE_NEWFACE, "Page_Home");
        NEW_FACE_CHILD = new ksk("newface_home_sub", "newface_home_sub", "Page_Home");
        NEW_FACE_PARENT_INTL = new ksk("newface_home_main_intl", "newface_home_main_intl", "Page_Home");
        NEW_FACE_CHILD_INTL = new ksk("newface_home_sub_intl", "newface_home_sub_intl", "Page_Home");
        NEW_FACE_CHILD_INTL_LITE = new ksk("taote_sub_intl", "taote_sub_intl", "Page_TMGTaote");
        NEW_FACE_CHILD_CAMPAIGN = new ksk("newface_campaign_sub", "newface_campaign_sub", "Page_HomeSale");
        IMAGE_CONTENT_DETAIL = new ksk("recommend_ugc_image_detail", "recommend_ugc_image_detail", "Page_GuangGuangSoloDetail");
    }

    public ksk(String str, String str2, String str3) {
        this.f30287a = str;
        this.b = str2;
        this.c = str3;
        a(this.f30287a, d);
    }

    public static ksk[] values() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ksk[]) ipChange.ipc$dispatch("9ab6fc7b", new Object[0]);
        }
        Collection<ksk> values = d.values();
        return (ksk[]) values.toArray(new ksk[values.size()]);
    }

    public static ksk a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ksk) ipChange.ipc$dispatch("7c71ae71", new Object[]{str}) : d.get(str);
    }

    public static ksk b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ksk) ipChange.ipc$dispatch("7d1e5a10", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (ksk kskVar : d.values()) {
            if (kskVar.b.equals(str)) {
                return kskVar;
            }
        }
        return null;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f30287a;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.c;
    }

    private void a(String str, Map<String, ksk> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
            return;
        }
        if (map.containsKey(str) && lxm.b()) {
            ldf.d("GatewayContainerType", "containerId 已被声明注册 : containerId : " + str);
        }
        map.put(str, this);
    }
}
