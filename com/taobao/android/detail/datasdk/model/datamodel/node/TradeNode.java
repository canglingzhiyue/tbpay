package com.taobao.android.detail.datasdk.model.datamodel.node;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.infoflow.multitab.e;
import com.ut.share.utils.Constants;
import java.util.Collections;
import java.util.Map;
import tb.emu;
import tb.epw;
import tb.kge;

/* loaded from: classes4.dex */
public class TradeNode extends DetailNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "trade";
    public String addToCartToastText;
    public JSONObject afterAddToCartAction;
    public String buyNowUrl;
    public Map<String, String> buyParam;
    public String buyText;
    public boolean cartConfirmEnable;
    public String cartConfirmSubText;
    public String cartConfirmText;
    public Map<String, String> cartParam;
    public String cartText;
    public String degradeUrl;
    public String errorMessage;
    public HintBanner hintBanner;
    public boolean isBuyEnable;
    public boolean isCartEnable;
    public boolean isWaitForStart;
    public String redirectUrl;
    public Long startTime;

    /* loaded from: classes4.dex */
    public static class HintBanner extends DetailNode {
        public String bgColor;
        public String buttonText;
        public String eventId;
        public String subText;
        public String text;
        public String url;

        static {
            kge.a(2004845822);
        }

        public HintBanner(JSONObject jSONObject) {
            super(jSONObject);
            this.text = epw.a(jSONObject.getString("text"));
            this.subText = epw.a(jSONObject.getString("subText"));
            this.bgColor = epw.a(jSONObject.getString(e.KEY_BG_COLOR));
            this.buttonText = epw.a(jSONObject.getString("buttonText"));
            this.eventId = epw.a(jSONObject.getString("eventId"));
            this.url = epw.a(jSONObject.getString("url"));
        }
    }

    static {
        kge.a(15480121);
    }

    public TradeNode(JSONObject jSONObject) {
        super(jSONObject);
        this.isBuyEnable = initBuyEnable();
        this.isCartEnable = initCartEnable();
        this.cartParam = initTradeParams("cartParam");
        this.buyParam = initTradeParams("buyParam");
        this.afterAddToCartAction = jSONObject.getJSONObject("afterAddToCartAction");
        this.redirectUrl = epw.a(jSONObject.getString(Constants.WEIBO_REDIRECTURL_KEY));
        this.errorMessage = epw.a(jSONObject.getString("errorMessage"));
        this.degradeUrl = epw.a(jSONObject.getString(Constants.WEIBO_REDIRECTURL_KEY));
        this.isWaitForStart = jSONObject.getBooleanValue("waitForStart");
        this.startTime = jSONObject.getLong("startTime");
        this.buyText = epw.a(jSONObject.getString("buyText"));
        this.cartText = epw.a(jSONObject.getString("cartText"));
        this.hintBanner = initHintBanner();
        this.buyNowUrl = epw.a(jSONObject.getString("buyNowUrl"));
        this.cartConfirmText = epw.a(jSONObject.getString("cartConfirmText"));
        this.cartConfirmEnable = jSONObject.getBooleanValue("cartConfirmEnable");
        this.cartConfirmSubText = epw.a(jSONObject.getString("cartConfirmSubText"));
        this.addToCartToastText = epw.a(jSONObject.getString("addToCartToastText"));
        emu.a("com.taobao.android.detail.datasdk.model.datamodel.node.TradeNode");
    }

    private boolean initBuyEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7f802084", new Object[]{this})).booleanValue();
        }
        Boolean bool = this.data.getBoolean("buyEnable");
        if (bool == null) {
            return true;
        }
        return bool.booleanValue();
    }

    private boolean initCartEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ce1934fe", new Object[]{this})).booleanValue();
        }
        Boolean bool = this.data.getBoolean("cartEnable");
        if (bool == null) {
            return true;
        }
        return bool.booleanValue();
    }

    private HintBanner initHintBanner() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HintBanner) ipChange.ipc$dispatch("a4091bbd", new Object[]{this});
        }
        JSONObject jSONObject = this.data.getJSONObject("hintBanner");
        if (jSONObject == null) {
            return new HintBanner(new JSONObject());
        }
        return new HintBanner(jSONObject);
    }

    private Map<String, String> initTradeParams(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f9d6cae0", new Object[]{this, str});
        }
        JSONObject jSONObject = this.data.getJSONObject(str);
        return jSONObject != null ? jSONObject : Collections.EMPTY_MAP;
    }
}
