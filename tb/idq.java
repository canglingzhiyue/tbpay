package tb;

import com.alibaba.android.aura.taobao.adapter.extension.linkage.event.AURASubmitEvent;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class idq {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static JSONObject c;
    private static JSONObject d;
    private static JSONObject e;

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f28939a;
    private JSONObject b;

    static {
        kge.a(2112663706);
    }

    public JSONObject a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("709f7788", new Object[]{this});
        }
        JSONObject jSONObject = this.f28939a;
        if (jSONObject != null) {
            return jSONObject;
        }
        this.f28939a = new JSONObject();
        this.f28939a.put("container", (Object) b());
        this.f28939a.put("data", (Object) e());
        this.f28939a.put(AURASubmitEvent.RPC_ENDPOINT, (Object) c());
        this.f28939a.put("hierarchy", (Object) d());
        return this.f28939a;
    }

    public JSONObject b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("84474b09", new Object[]{this});
        }
        JSONObject jSONObject = c;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject parseObject = JSONObject.parseObject("{\"data\":[{\"containerType\":\"dinamicx\",\"name\":\"buy_v2_action_bar\",\"type\":[\"dinamicx$buy_v2_action_bar$0$generalv2\"],\"version\":\"38\",\"url\":\"https://dinamicx.alibabausercontent.com/pub/buy_v2_action_bar/1718703347261/buy_v2_action_bar.zip\"},{\"containerType\":\"dinamicx\",\"name\":\"buy_v2_pop_error\",\"type\":[\"dinamicx$buy_v2_pop_error$0$generalv2\"],\"version\":\"19\",\"url\":\"https://dinamicx.alibabausercontent.com/pub/buy_v2_pop_error/1718765334008/buy_v2_pop_error.zip\"},{\"containerType\":\"dinamicx\",\"name\":\"buy_v2_pop_bottom\",\"type\":[\"dinamicx$buy_v2_pop_bottom$0$generalv2\"],\"version\":\"12\",\"url\":\"https://dinamicx.alibabausercontent.com/pub/buy_v2_pop_bottom/1718767942463/buy_v2_pop_bottom.zip\"},{\"containerType\":\"dinamicx\",\"name\":\"buy_v2_pop_title\",\"type\":[\"dinamicx$buy_v2_pop_title$0$generalv2\"],\"version\":\"14\",\"url\":\"https://dinamicx.alibabausercontent.com/pub/buy_v2_pop_title/1718766927143/buy_v2_pop_title.zip\"},{\"containerType\":\"dinamicx\",\"name\":\"buy_v2_pop_item\",\"type\":[\"dinamicx$buy_v2_pop_item$0$generalv2\"],\"version\":\"26\",\"url\":\"https://dinamicx.alibabausercontent.com/pub/buy_v2_pop_item/1719902703360/buy_v2_pop_item.zip\"},{\"name\":\"popup_window\",\"containerType\":\"layout\",\"version\":\"0\",\"url\":null,\"md5\":null,\"type\":[\"layout$popup_window$0$0\"]},{\"containerType\":\"layout\",\"name\":\"card\",\"type\":[\"layout$card$0$0\"],\"version\":\"0\"},{\"containerType\":\"dinamicx\",\"name\":\"buy_v2_address\",\"type\":[\"dinamicx$buy_v2_address$0$generalv2\"],\"version\":\"83\",\"url\":\"https://dinamicx.alibabausercontent.com/pub/buy_v2_address/1719471309086/buy_v2_address.zip\"},{\"containerType\":\"dinamicx\",\"name\":\"buy_v2_common_title\",\"type\":[\"dinamicx$buy_v2_common_title$0$generalv2\"],\"version\":\"30\",\"url\":\"https://dinamicx.alibabausercontent.com/pub/buy_v2_common_title/1718591668972/buy_v2_common_title.zip\"},{\"containerType\":\"dinamicx\",\"name\":\"buy_v2_item\",\"type\":[\"dinamicx$buy_v2_item$0$generalv2\"],\"version\":\"98\",\"url\":\"https://dinamicx.alibabausercontent.com/pub/buy_v2_item/1725951579699/buy_v2_item.zip\"},{\"containerType\":\"dinamicx\",\"name\":\"buy_v2_item_ext\",\"type\":[\"dinamicx$buy_v2_item_ext$0$generalv2\"],\"version\":\"92\",\"url\":\"https://dinamicx.alibabausercontent.com/pub/buy_v2_item_ext/1722594243954/buy_v2_item_ext.zip\"},{\"containerType\":\"dinamicx\",\"name\":\"buy_v2_price\",\"type\":[\"dinamicx$buy_v2_price$0$generalv2\"],\"version\":\"55\",\"url\":\"https://dinamicx.alibabausercontent.com/pub/buy_v2_price/1723603428565/buy_v2_price.zip\"},{\"containerType\":\"dinamicx\",\"name\":\"buy_v2_payment\",\"type\":[\"dinamicx$buy_v2_payment$0$generalv2\"],\"version\":\"62\",\"url\":\"https://dinamicx.alibabausercontent.com/pub/buy_v2_payment/1718595849068/buy_v2_payment.zip\"},{\"containerType\":\"dinamicx\",\"name\":\"buy_alipay_selection_attachment_v2\",\"type\":[\"dinamicx$buy_alipay_selection_attachment_v2$0$generalv2\"],\"version\":\"26\",\"url\":\"https://dinamicx.alibabausercontent.com/pub/buy_alipay_selection_attachment_v2/1724234674372/buy_alipay_selection_attachment_v2.zip\"},{\"containerType\":\"dinamicx\",\"name\":\"buy_v2_item_sale_agreement\",\"type\":[\"dinamicx$buy_v2_item_sale_agreement$0$generalv2\"],\"version\":\"17\",\"url\":\"https://dinamicx.alibabausercontent.com/pub/buy_v2_item_sale_agreement/1718591126498/buy_v2_item_sale_agreement.zip\"},{\"containerType\":\"dinamicx\",\"name\":\"buy_v2_separater\",\"type\":[\"dinamicx$buy_v2_separater$0$generalv2\"],\"url\":\"https://ossgw.alicdn.com/rapid-oss-bucket/1648622952399/buy_v2_separater.zip\",\"version\":\"2\"},{\"containerType\":\"layout\",\"name\":\"sticky\",\"type\":[\"layout$sticky$0$0\"],\"version\":\"0\"},{\"containerType\":\"dinamicx\",\"name\":\"buy_v3_submit_order\",\"type\":[\"dinamicx$buy_v3_submit_order$0$generalv2\"],\"version\":\"7\",\"url\":\"https://dinamicx.alibabausercontent.com/pub/buy_v3_submit_order/1726221226082/buy_v3_submit_order.zip\"}]}");
        c = parseObject;
        return parseObject;
    }

    public JSONObject c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("97ef1e8a", new Object[]{this});
        }
        JSONObject jSONObject = d;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject parseObject = JSONObject.parseObject("{\"protocolVersion\":\"4.0\",\"umfVersions\":{\"version\":\"0.1.0\"}}");
        d = parseObject;
        return parseObject;
    }

    public JSONObject d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ab96f20b", new Object[]{this});
        }
        JSONObject jSONObject = e;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject parseObject = JSONObject.parseObject("{\"root\":\"generalV2\",\"structure\":{\"addressCard\":[\"baseAddress\"],\"baseAddress\":[\"address\"],\"checkboxAgreemnet\":[\"newtonCheckboxAgreements\"],\"footer\":[\"submitOrder\"],\"generalV2\":[\"errorPopup\",\"actionBarComponent\",\"addressCard\",\"shopCard_3ffff6cd7857594544f8c684f1e29638\",\"settlementCard\",\"paymentCard\",\"checkboxAgreemnet\",\"bottomMargin\",\"footer\"],\"errorPopup\":[\"commonErrorPopup\",\"itemErrorPopup\"],\"commonErrorPopup\":[\"commonErrorPopupTips\",\"commonErrorPopupFooter\"],\"commonErrorPopupFooter\":[\"commonErrorActionButtion\"],\"itemErrorPopup\":[\"itemErrorPopupHeader\",\"itemErrorPopupBody\",\"itemErrorPopupFooter\"],\"itemErrorPopupHeader\":[\"ItemErrorTitle\"],\"itemErrorPopupBody\":[\"errorItem_0\",\"errorItem_1\"],\"itemErrorPopupFooter\":[\"itemErrorButton\"],\"item_86fc1804e610aa6762585a82bee9d8ca\":[\"itemInfo_86fc1804e610aa6762585a82bee9d8ca\"],\"newtonCheckboxAgreements\":[\"newtonCheckboxAgreement_privacy_protect_privacyCheckbox_1\"],\"newtonOrderExt_Invoice4Newton_hiddenInvoiceCard_3ffff6cd7857594544f8c684f1e29638\":[\"newtonNormalOrderExt_Invoice4Newton_hiddenInvoiceCard_3ffff6cd7857594544f8c684f1e29638\"],\"orderExt_3ffff6cd7857594544f8c684f1e29638\":[\"newtonOrderExt_Invoice4Newton_hiddenInvoiceCard_3ffff6cd7857594544f8c684f1e29638\",\"orderRemarks_3ffff6cd7857594544f8c684f1e29638\"],\"orderLine_86fc1804e610aa6762585a82bee9d8ca\":[\"item_86fc1804e610aa6762585a82bee9d8ca\"],\"orderRemarks_3ffff6cd7857594544f8c684f1e29638\":[\"orderRemark_3ffff6cd7857594544f8c684f1e29638\"],\"order_3ffff6cd7857594544f8c684f1e29638\":[\"orderLine_86fc1804e610aa6762585a82bee9d8ca\",\"delivery_3ffff6cd7857594544f8c684f1e29638\"],\"paymentCard\":[\"payment_AlipayFrontPlanB4Newton\",\"payment_Agency4Newton\"],\"paymentUse_Agency4Newton\":[\"paymentUsePrimaryAction_Agency4Newton\"],\"paymentUse_AlipayFrontPlanB4Newton\":[\"paymentUsePrimaryAction_AlipayFrontPlanB4Newton\",\"paymentUseThirdAction_AlipayFrontPlanB4Newton\"],\"payment_Agency4Newton\":[\"paymentUse_Agency4Newton\"],\"payment_AlipayFrontPlanB4Newton\":[\"paymentUse_AlipayFrontPlanB4Newton\"],\"settlementCard\":[\"settlementHeader\",\"settlementFees\",\"settlementDiscounts\",\"settlementFooter\"],\"settlementDiscounts\":[\"settlementDiscount_compositeShopPromotion\",\"settlementDiscount_RedCouponCrossShopPromotionPrice\"],\"settlementFees\":[\"settlementFee_ItemPrice\"],\"settlementHeader\":[\"settlementTitle\"],\"shopCard_3ffff6cd7857594544f8c684f1e29638\":[\"shopHead_3ffff6cd7857594544f8c684f1e29638\",\"order_3ffff6cd7857594544f8c684f1e29638\",\"shopPromotion_3ffff6cd7857594544f8c684f1e29638\",\"orderExt_3ffff6cd7857594544f8c684f1e29638\"],\"shopHead_3ffff6cd7857594544f8c684f1e29638\":[\"shopTitle_3ffff6cd7857594544f8c684f1e29638\"],\"shopPromotion_3ffff6cd7857594544f8c684f1e29638\":[\"shopPromotionSelect_3ffff6cd7857594544f8c684f1e29638\"],\"submitOrder\":[\"submit\"]}}");
        e = parseObject;
        return parseObject;
    }

    public JSONObject e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("bf3ec58c", new Object[]{this});
        }
        JSONObject jSONObject = this.b;
        if (jSONObject != null) {
            return jSONObject;
        }
        this.b = JSONObject.parseObject("{\"commonErrorPopup\":{\"type\":\"layout$popup_window$0$0\",\"fields\":{\"style\":{\"heightRatio\":\"0.5\",\"needCloseButton\":\"false\",\"showCloseButton\":\"false\"}}},\"commonErrorPopupTips\":{\"type\":\"dinamicx$buy_v2_pop_error$0$generalv2\"},\"commonErrorPopupFooter\":{\"type\":\"layout$sticky$0$0\"},\"commonErrorActionButtion\":{\"type\":\"dinamicx$buy_v2_pop_bottom$0$generalv2\"},\"itemErrorPopup\":{\"type\":\"layout$popup_window$0$0\"},\"itemErrorPopupHeader\":{\"type\":\"layout$sticky$0$0\",\"fields\":{\"position\":\"top\"}},\"ItemErrorTitle\":{\"type\":\"dinamicx$buy_v2_pop_title$0$generalv2\"},\"errorItem_0\":{\"type\":\"dinamicx$buy_v2_pop_item$0$generalv2\",\"fields\":{\"visible\":\"false\"}},\"errorItem_1\":{\"type\":\"dinamicx$buy_v2_pop_item$0$generalv2\",\"fields\":{\"visible\":\"false\"}},\"itemErrorPopupFooter\":{\"type\":\"layout$sticky$0$0\"},\"itemErrorButton\":{\"type\":\"dinamicx$buy_v2_pop_bottom$0$generalv2\"},\"actionBarComponent\":{\"fields\":{\"bgColor\":\"#00000000\",\"position\":\"actionBar\",\"speed\":\"4000\",\"title\":\"确认订单\"},\"type\":\"dinamicx$buy_v2_action_bar$0$generalv2\"},\"address\":{\"fields\":{\"address\":\"@data{header.fields.addressText}\",\"arrow\":\"true\",\"descStyle\":\"desc\",\"icon\":\"https://img.alicdn.com/imgextra/i4/O1CN01DhxFsl1Ug74Neipic_!!6000000002546-2-tps-66-66.png\",\"name\":\"@data{header.fields.fullName}\",\"phone\":\"@data{header.fields.mobile}\",\"cornerType\":\"top\"},\"type\":\"dinamicx$buy_v2_address$0$generalv2\"},\"addressCard\":{\"cardGroup\":\"true\",\"fields\":{\"style\":{\"cornerRadius\":\"25\",\"dividerHeght\":\"9\",\"marginLeft\":\"12\",\"marginRight\":\"12\"}},\"type\":\"layout$card$0$0\"},\"bottomMargin\":{\"fields\":{\"hello\":\"world\"},\"position\":\"body\",\"type\":\"dinamicx$buy_v2_separater$0$generalv2\"},\"checkboxAgreemnet\":{\"cardGroup\":\"true\",\"fields\":{\"style\":{\"cornerRadius\":\"25\",\"dividerHeght\":\"9\",\"marginLeft\":\"12\",\"marginRight\":\"12\"}},\"type\":\"layout$card$0$0\"},\"footer\":{\"fields\":{\"position\":\"bottom\"},\"position\":\"footer\",\"type\":\"layout$sticky$0$0\"},\"itemInfo_86fc1804e610aa6762585a82bee9d8ca\":{\"fields\":{\"arrow\":\"true\",\"desc\":\"@data{item[0].fields.sku.title}\",\"icon\":\"@data{item[0].fields.pic}\",\"label\":\"@data{item[0].fields.label}\",\"max\":\"50\",\"min\":\"1\",\"price\":\"@data{item[0].fields.pay.nowTitle}\",\"quantity\":\"@data{item[0].fields.quantity}\",\"serviceDesc\":[{\"price\":\"\",\"text\":\"选择相关服务\"}],\"step\":\"1\",\"title\":\"@data{item[0].fields.title}\"},\"type\":\"dinamicx$buy_v2_item$0$generalv2\",\"events\":{\"quantityChange\":[]}},\"newtonCheckboxAgreement_privacy_protect_privacyCheckbox_1\":{\"fields\":{\"attachInfo\":\"\",\"helpIconUrl\":\"https://img.alicdn.com/imgextra/i1/O1CN01QKhsKS23TkxhwpL7L_!!6000000007257-2-tps-32-32.png\",\"icon\":\"https://img.alicdn.com/imgextra/i1/O1CN01EuZ7xH1DaIamKYT04_!!6000000000232-2-tps-66-66.png\",\"state\":\"disable\",\"subtitle\":[{\"style\":{\"color\":\"#999999\"},\"text\":\"隐藏收件人真实手机号，保护隐私\"}],\"title\":\"号码保护\"},\"type\":\"dinamicx$buy_v2_item_sale_agreement$0$generalv2\"},\"newtonNormalOrderExt_Invoice4Newton_hiddenInvoiceCard_3ffff6cd7857594544f8c684f1e29638\":{\"fields\":{\"arrow\":\"true\",\"isPreView\":\"true\",\"title\":\"开具发票\"},\"type\":\"dinamicx$buy_v2_item_ext$0$generalv2\"},\"orderRemark_3ffff6cd7857594544f8c684f1e29638\":{\"fields\":{\"arrow\":\"true\",\"isPreView\":\"true\",\"title\":\"订单备注\"},\"type\":\"dinamicx$buy_v2_item_ext$0$generalv2\"},\"paymentCard\":{\"cardGroup\":\"true\",\"fields\":{\"style\":{\"cornerRadius\":\"25\",\"dividerHeght\":\"9\",\"marginLeft\":\"12\",\"marginRight\":\"12\"}},\"type\":\"layout$card$0$0\"},\"paymentUsePrimaryAction_Agency4Newton\":{\"fields\":{\"icon\":\"//img.alicdn.com/imgextra/i4/O1CN01U4WSFq1cwcGj2zGOS_!!6000000003665-2-tps-66-66.png\",\"showMainLine\":\"true\",\"showSecondLine\":\"false\",\"state\":\"disable\",\"subtitle\":\"找人帮忙付，购物更方便\",\"subtitleStyle\":\"desc\",\"title\":\"找朋友帮忙付\"},\"type\":\"dinamicx$buy_v2_payment$0$generalv2\"},\"paymentUsePrimaryAction_AlipayFrontPlanB4Newton\":{\"fields\":{\"icon\":\"//img.alicdn.com/imgextra/i2/O1CN01GU2o4m1VzBAjv2zYV_!!6000000002723-2-tps-66-66.png\",\"showMainLine\":\"true\",\"showSecondLine\":\"false\",\"state\":\"disable\",\"title\":\"支付宝\"},\"type\":\"dinamicx$buy_v2_payment$0$generalv2\"},\"settlementCard\":{\"cardGroup\":\"true\",\"fields\":{\"style\":{\"cornerRadius\":\"25\",\"dividerHeght\":\"9\",\"marginLeft\":\"12\",\"marginRight\":\"12\"}},\"type\":\"layout$card$0$0\"},\"settlementDiscount_RedCouponCrossShopPromotionPrice\":{\"fields\":{\"isPreView\":\"true\",\"title\":\"红包\"},\"type\":\"dinamicx$buy_v2_price$0$generalv2\"},\"settlementDiscount_compositeShopPromotion\":{\"fields\":{\"arrow\":\"true\",\"isPreView\":\"true\",\"title\":\"店铺优惠\"},\"type\":\"dinamicx$buy_v2_price$0$generalv2\"},\"settlementFee_ItemPrice\":{\"fields\":{\"isPreView\":\"false\",\"title\":\"商品总价\"},\"type\":\"dinamicx$buy_v2_price$0$generalv2\"},\"settlementTitle\":{\"fields\":{\"title\":\"价格明细\"},\"type\":\"dinamicx$buy_v2_common_title$0$generalv2\"},\"shopCard_3ffff6cd7857594544f8c684f1e29638\":{\"cardGroup\":\"true\",\"fields\":{\"style\":{\"cornerRadius\":\"25\",\"dividerHeght\":\"9\",\"marginLeft\":\"12\",\"marginRight\":\"12\"}},\"type\":\"layout$card$0$0\"},\"shopPromotionSelect_3ffff6cd7857594544f8c684f1e29638\":{\"fields\":{\"arrow\":\"true\",\"isPreView\":\"true\",\"title\":\"店铺优惠\"},\"type\":\"dinamicx$buy_v2_item_ext$0$generalv2\"},\"shopTitle_3ffff6cd7857594544f8c684f1e29638\":{\"fields\":{\"icon\":\"@data{item[0].fields.shopIcon}\",\"title\":\"@data{item[0].fields.shopName}\"},\"type\":\"dinamicx$buy_v2_common_title$0$generalv2\"},\"submit\":{\"fields\":{\"isPreView\":\"true\"},\"position\":\"footer\",\"type\":\"dinamicx$buy_v3_submit_order$0$generalv2\"},\"submitOrder\":{\"position\":\"footer\"}}");
        return this.b;
    }
}
