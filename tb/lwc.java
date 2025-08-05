package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.h;
import com.taobao.android.order.constants.OrderBizCode;
import java.util.HashMap;
import tb.cts;

/* loaded from: classes7.dex */
public class lwc implements ljr {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final lwc NEW_FACE_CHILD;
    public static final lwc NEW_FACE_CHILD_CAMPAIGN;
    public static final lwc NEW_FACE_CHILD_INTL;
    public static final lwc NEW_FACE_CHILD_INTL_LITE;
    public static final lwc NEW_FACE_PARENT;
    public static final lwc NEW_FACE_PARENT_INTL;
    public static final lwc REC_CART;
    public static final lwc REC_CONFIRM_RECEIPT;
    public static final lwc REC_DETAIL;
    public static final lwc REC_DETAIL_EXPIRE;
    public static final lwc REC_DIRECT_SALE_CART;
    public static final lwc REC_FAVORITE;
    public static final lwc REC_LOGISTICS;
    public static final lwc REC_MC_CART;
    public static final lwc REC_ORDER_DETAIL;
    public static final lwc REC_ORDER_LIST;
    public static final lwc REC_ORDER_LIST_CATAPULT;
    public static final lwc REC_ORDER_SEARCH_RESULTS;
    public static final lwc REC_PAY_SUCCESS;
    private static HashMap<String, lwc> d;

    /* renamed from: a  reason: collision with root package name */
    public final String f30931a;
    public final String b;
    public final String c;

    static {
        kge.a(751141225);
        kge.a(-1617636887);
        d = new HashMap<>();
        REC_DETAIL = new lwc("recommend_itemdetail_main", "itemdetail", "Page_Detail");
        REC_DETAIL_EXPIRE = new lwc("recommend_itemdetail_main", "itemdetail", "Page_Detail");
        REC_FAVORITE = new lwc("recommend_collection_main", "favorite", "Page_Collection");
        REC_CART = new lwc("recommend_cart_main", "cart", "Page_ShoppingCart");
        REC_MC_CART = new lwc("recommend_tmallcart_main", "tmallcart", "Page_TmMarket");
        REC_ORDER_LIST = new lwc("recommend_orderlist_main", OrderBizCode.orderList, cts.a.BIZ_ORDER_LIST);
        REC_ORDER_LIST_CATAPULT = new lwc("recommend_orderlist_catapult_main", "orderlist_catapult", cts.a.BIZ_ORDER_LIST);
        REC_ORDER_SEARCH_RESULTS = new lwc("recommend_orderlist_main", "orderlist_search", cts.a.BIZ_ORDER_LIST);
        REC_ORDER_DETAIL = new lwc("recommend_orderdetail_main", OrderBizCode.orderDetail, cts.a.BIZ_ORDER_DETAIL);
        REC_LOGISTICS = new lwc("recommend_logistics_main", "logistics", "Page_Logistic");
        REC_DIRECT_SALE_CART = new lwc("recommend_intlcart_main", "directcart", "Page_ShoppingCart");
        REC_PAY_SUCCESS = new lwc("recommend_pay_success", alz.BizKeyPaysuccess, cts.a.BIZ_PAY_SUCCESS);
        REC_CONFIRM_RECEIPT = new lwc("recommend_confirm_receipt", "confirmreceipt", "Page_ConfirmReceipt");
        NEW_FACE_PARENT = new lwc(h.HOMEPAGE_NEWFACE, h.HOMEPAGE_NEWFACE, "Page_Home");
        NEW_FACE_CHILD = new lwc("newface_home_sub", "newface_home_sub", "Page_Home");
        NEW_FACE_PARENT_INTL = new lwc("newface_home_main_intl", "newface_home_main_intl", "Page_Home");
        NEW_FACE_CHILD_INTL = new lwc("newface_home_sub_intl", "newface_home_sub_intl", "Page_Home");
        NEW_FACE_CHILD_INTL_LITE = new lwc("taote_sub_intl", "taote_sub_intl", "Page_TMGTaote");
        NEW_FACE_CHILD_CAMPAIGN = new lwc("newface_campaign_sub", "newface_campaign_sub", "Page_HomeSale");
    }

    public lwc(String str, String str2, String str3) {
        this.f30931a = str;
        this.b = str2;
        this.c = str3;
        a(this.f30931a, d);
    }

    private void a(String str, HashMap<String, lwc> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3202a441", new Object[]{this, str, hashMap});
            return;
        }
        if (hashMap.containsKey(str) && lxm.b()) {
            Log.e("ContainerType", "containerId 已被注册 : containerId : " + str);
        }
        hashMap.put(str, this);
    }

    public static lwc a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lwc) ipChange.ipc$dispatch("7c7230dc", new Object[]{str}) : d.get(str);
    }

    @Override // tb.ljr
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f30931a;
    }

    @Override // tb.ljr
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
    }

    @Override // tb.ljr
    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.c;
    }
}
