package com.taobao.android.detail.sdk.model.node;

import com.alibaba.fastjson.JSONObject;
import com.taobao.android.detail.datasdk.event.sku.OpenSkuEvent;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class VerticalNode extends DetailNode {
    public AskAllNode askAllNode;
    public ChinaQualityNode chinaQualityNode;
    public DisabledItem disabledItem;
    public GlobalSellNode globalSellNode;
    public HKNode hkNode;
    public HotNode hotNode;
    public IsvCustomNode isvCustomNode;
    public JhsNode jhsNode;
    public LadyGoNode ladyGoNode;
    public ShopCardNode mShopCardNode;
    public WwPromptNode mWwPromptNode;
    public MeiLiHuiNode meiLiHuiNode;
    public MemberShopNode memberShopNode;
    public O2ONode o2oNode;
    public PackTradeNode packTradeNode;
    public PintuanNode pintuanNode;
    public PresaleNode presaleNode;
    public QiangGouNode qiangGouNode;
    public SellOutNode sellOutNode;
    public SendGiftNode sendGiftNode;
    public SuperMarketNode superMarketNode;
    public VideoFlowVNode videoFlowVNode;
    public ZhizuNode zhizuNode;

    static {
        kge.a(1719577279);
    }

    public VerticalNode(JSONObject jSONObject) {
        super(jSONObject);
        tpc.a("com.taobao.android.detail.sdk.model.node.VerticalNode");
        try {
            this.jhsNode = new JhsNode(jSONObject.getJSONObject("jhs"));
        } catch (Throwable unused) {
        }
        try {
            this.o2oNode = new O2ONode(jSONObject.getJSONObject(com.o2o.ad.a.O2O_URL));
        } catch (Throwable unused2) {
        }
        try {
            this.presaleNode = new PresaleNode(jSONObject.getJSONObject("presale"));
        } catch (Throwable unused3) {
        }
        try {
            this.superMarketNode = new SuperMarketNode(jSONObject.getJSONObject("supermarket"));
        } catch (Throwable unused4) {
        }
        try {
            this.hkNode = new HKNode(jSONObject.getJSONObject("inter"));
        } catch (Throwable unused5) {
        }
        try {
            this.disabledItem = new DisabledItem(jSONObject.getJSONObject("disabledItem"));
        } catch (Throwable unused6) {
        }
        try {
            this.hotNode = new HotNode(jSONObject.getJSONObject("hotItem"));
        } catch (Throwable unused7) {
        }
        try {
            this.chinaQualityNode = new ChinaQualityNode(jSONObject.getJSONObject("chinaQuality"));
        } catch (Throwable unused8) {
        }
        try {
            this.qiangGouNode = new QiangGouNode(jSONObject.getJSONObject("qianggou"));
        } catch (Throwable unused9) {
        }
        try {
            this.sellOutNode = new SellOutNode(jSONObject.getJSONObject("sellOut"));
        } catch (Throwable unused10) {
        }
        try {
            this.ladyGoNode = new LadyGoNode(jSONObject.getJSONObject("ladyGo"));
        } catch (Throwable unused11) {
        }
        try {
            this.meiLiHuiNode = new MeiLiHuiNode(jSONObject.getJSONObject("meiLiHui"));
        } catch (Throwable unused12) {
        }
        try {
            this.videoFlowVNode = new VideoFlowVNode(jSONObject.getJSONObject("videoFlow"));
        } catch (Throwable unused13) {
        }
        try {
            this.askAllNode = new AskAllNode(jSONObject.getJSONObject("askAll"));
        } catch (Throwable unused14) {
        }
        try {
            this.isvCustomNode = new IsvCustomNode(jSONObject.getJSONObject("isvCustom"));
        } catch (Throwable unused15) {
        }
        try {
            this.memberShopNode = new MemberShopNode(jSONObject.getJSONObject("memberShop"));
        } catch (Throwable unused16) {
        }
        try {
            this.zhizuNode = new ZhizuNode(jSONObject.getJSONObject("zhiZuData"));
        } catch (Throwable unused17) {
        }
        try {
            this.globalSellNode = new GlobalSellNode(jSONObject.getJSONObject("globalSell"));
        } catch (Throwable unused18) {
        }
        try {
            this.mShopCardNode = new ShopCardNode(jSONObject.getJSONObject("shopCard"));
        } catch (Throwable unused19) {
        }
        try {
            this.mWwPromptNode = new WwPromptNode(jSONObject.getJSONObject("wangPromptMsg"));
        } catch (Throwable unused20) {
        }
        try {
            this.packTradeNode = new PackTradeNode(jSONObject.getJSONObject("ctPackageTrade"));
        } catch (Throwable unused21) {
        }
        try {
            this.pintuanNode = new PintuanNode(jSONObject.getJSONObject("pintuan"));
        } catch (Throwable unused22) {
        }
        try {
            this.sendGiftNode = new SendGiftNode(jSONObject.getJSONObject(OpenSkuEvent.BIZ_TYPE_SEND_GIFT));
        } catch (Throwable unused23) {
        }
    }
}
