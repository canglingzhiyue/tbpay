package tb;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public class alz {
    public static final String BizKeyAll = "all";
    public static final String BizKeyCart = "cart";
    public static final String BizKeyDetail = "detail";
    public static final String BizKeyLivegoods = "livegoods";
    public static final String BizKeyMessage = "message";
    public static final String BizKeyMytaobao = "mytaobao";
    public static final String BizKeyNewDetail = "NewDetail";
    public static final String BizKeyNewbuy = "newbuy";
    public static final String BizKeyOrderDetail = "orderDetail";
    public static final String BizKeyOrderList = "orderList";
    public static final String BizKeyPackageList = "packageList";
    public static final String BizKeyPaysuccess = "paysuccess";
    public static final String BizKeyPurchase = "purchase";
    public static final String BizKeyRefund = "refund";
    public static final String BizKeyRefundDetail = "refundDetail";
    public static final String BizKeySku = "sku";
    public static final List<String> BizNames;

    static {
        kge.a(1575115868);
        BizNames = Arrays.asList("all", "cart", "purchase", BizKeyOrderList, BizKeyOrderDetail, BizKeyRefund, "sku", "newbuy", BizKeyPaysuccess, "mytaobao", "detail", BizKeyLivegoods, "NewDetail", BizKeyRefundDetail, BizKeyPackageList, "message");
    }
}
