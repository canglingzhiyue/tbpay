package com.taobao.android.detail.sdk.model.node;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.utils.c;
import com.taobao.tao.infoflow.multitab.e;
import com.ut.share.utils.Constants;
import java.util.Collections;
import java.util.Map;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class TradeNode extends DetailNode {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String addToCartToastText;
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
            kge.a(1616374712);
        }

        public HintBanner(JSONObject jSONObject) {
            super(jSONObject);
            this.text = c.a(jSONObject.getString("text"));
            this.subText = c.a(jSONObject.getString("subText"));
            this.bgColor = c.a(jSONObject.getString(e.KEY_BG_COLOR));
            this.buttonText = c.a(jSONObject.getString("buttonText"));
            this.eventId = c.a(jSONObject.getString("eventId"));
            this.url = c.a(jSONObject.getString("url"));
        }
    }

    static {
        kge.a(-770654529);
    }

    public TradeNode(JSONObject jSONObject) {
        super(jSONObject);
        tpc.a("com.taobao.android.detail.sdk.model.node.TradeNode");
        this.isBuyEnable = initBuyEnable();
        this.isCartEnable = initCartEnable();
        this.cartParam = initTradeParams("cartParam");
        this.buyParam = initTradeParams("buyParam");
        this.redirectUrl = c.a(jSONObject.getString(Constants.WEIBO_REDIRECTURL_KEY));
        this.errorMessage = c.a(jSONObject.getString("errorMessage"));
        this.degradeUrl = c.a(jSONObject.getString(Constants.WEIBO_REDIRECTURL_KEY));
        this.isWaitForStart = jSONObject.getBooleanValue("waitForStart");
        this.startTime = jSONObject.getLong("startTime");
        this.buyText = c.a(jSONObject.getString("buyText"));
        this.cartText = c.a(jSONObject.getString("cartText"));
        this.hintBanner = initHintBanner();
        this.buyNowUrl = c.a(jSONObject.getString("buyNowUrl"));
        this.cartConfirmText = c.a(jSONObject.getString("cartConfirmText"));
        this.cartConfirmEnable = jSONObject.getBooleanValue("cartConfirmEnable");
        this.cartConfirmSubText = c.a(jSONObject.getString("cartConfirmSubText"));
        this.addToCartToastText = c.a(jSONObject.getString("addToCartToastText"));
    }

    private boolean initBuyEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7f802084", new Object[]{this})).booleanValue();
        }
        Boolean bool = this.root.getBoolean("buyEnable");
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
        Boolean bool = this.root.getBoolean("cartEnable");
        if (bool == null) {
            return true;
        }
        return bool.booleanValue();
    }

    private HintBanner initHintBanner() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HintBanner) ipChange.ipc$dispatch("e379dc43", new Object[]{this});
        }
        JSONObject jSONObject = this.root.getJSONObject("hintBanner");
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
        JSONObject jSONObject = this.root.getJSONObject(str);
        return jSONObject != null ? jSONObject : Collections.EMPTY_MAP;
    }
}
