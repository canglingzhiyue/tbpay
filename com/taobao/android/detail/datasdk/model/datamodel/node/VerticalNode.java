package com.taobao.android.detail.datasdk.model.datamodel.node;

import com.alibaba.fastjson.JSONObject;
import com.taobao.unit.center.templatesync.ITemplateSyncService;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class VerticalNode extends DetailNode {
    public static final String TAG = "vertical";
    public AskAllNode askAllNode;
    public BubbleNode bubbleNode;
    public ChinaQualityNode chinaQualityNode;
    public DisabledItem disabledItem;
    public GlobalSellNode globalSellNode;
    public HKNode hkNode;
    public IsvCustomNode isvCustomNode;
    public JhsNode jhsNode;
    public LadyGoNode ladyGoNode;
    public ShopCardNode mShopCardNode;
    public WwPromptNode mWwPromptNode;
    public MeiLiHuiNode meiLiHuiNode;
    public MemberShopNode memberShopNode;
    public PackTradeNode packTradeNode;
    public PintuanNode pintuanNode;
    public PresaleNode presaleNode;
    public QiangGouNode qiangGouNode;
    public SellOutNode sellOutNode;
    public SuperMarketNode superMarketNode;
    public VideoFlowVNode videoFlowVNode;
    public ZhizuNode zhizuNode;

    static {
        kge.a(1000270341);
    }

    public VerticalNode(JSONObject jSONObject) {
        super(jSONObject);
        try {
            this.jhsNode = new JhsNode(jSONObject.getJSONObject("jhs"));
        } catch (Throwable unused) {
        }
        try {
            this.presaleNode = new PresaleNode(jSONObject.getJSONObject("presale"));
        } catch (Throwable unused2) {
        }
        try {
            this.superMarketNode = new SuperMarketNode(jSONObject.getJSONObject("supermarket"));
        } catch (Throwable unused3) {
        }
        try {
            this.hkNode = new HKNode(jSONObject.getJSONObject("inter"));
        } catch (Throwable unused4) {
        }
        try {
            this.disabledItem = new DisabledItem(jSONObject.getJSONObject("disabledItem"));
        } catch (Throwable unused5) {
        }
        try {
            this.chinaQualityNode = new ChinaQualityNode(jSONObject.getJSONObject("chinaQuality"));
        } catch (Throwable unused6) {
        }
        try {
            this.qiangGouNode = new QiangGouNode(jSONObject.getJSONObject("qianggou"));
        } catch (Throwable unused7) {
        }
        try {
            this.sellOutNode = new SellOutNode(jSONObject.getJSONObject("sellOut"));
        } catch (Throwable unused8) {
        }
        try {
            this.ladyGoNode = new LadyGoNode(jSONObject.getJSONObject("ladyGo"));
        } catch (Throwable unused9) {
        }
        try {
            this.meiLiHuiNode = new MeiLiHuiNode(jSONObject.getJSONObject("meiLiHui"));
        } catch (Throwable unused10) {
        }
        try {
            this.videoFlowVNode = new VideoFlowVNode(jSONObject.getJSONObject("videoFlow"));
        } catch (Throwable unused11) {
        }
        try {
            this.askAllNode = new AskAllNode(jSONObject.getJSONObject("askAll"));
        } catch (Throwable unused12) {
        }
        try {
            this.isvCustomNode = new IsvCustomNode(jSONObject.getJSONObject("isvCustom"));
        } catch (Throwable unused13) {
        }
        try {
            this.memberShopNode = new MemberShopNode(jSONObject.getJSONObject("memberShop"));
        } catch (Throwable unused14) {
        }
        try {
            this.zhizuNode = new ZhizuNode(jSONObject.getJSONObject("zhiZuData"));
        } catch (Throwable unused15) {
        }
        try {
            this.globalSellNode = new GlobalSellNode(jSONObject.getJSONObject("globalSell"));
        } catch (Throwable unused16) {
        }
        try {
            this.mShopCardNode = new ShopCardNode(jSONObject.getJSONObject("shopCard"));
        } catch (Throwable unused17) {
        }
        try {
            this.mWwPromptNode = new WwPromptNode(jSONObject.getJSONObject("wangPromptMsg"));
        } catch (Throwable unused18) {
        }
        try {
            this.packTradeNode = new PackTradeNode(jSONObject.getJSONObject("ctPackageTrade"));
        } catch (Throwable unused19) {
        }
        try {
            this.pintuanNode = new PintuanNode(jSONObject.getJSONObject("pintuan"));
        } catch (Throwable unused20) {
        }
        try {
            this.bubbleNode = new BubbleNode(jSONObject.getJSONObject(ITemplateSyncService.LAYOUT_STYLE_BUBBLE));
        } catch (Throwable unused21) {
        }
        emu.a("com.taobao.android.detail.datasdk.model.datamodel.node.VerticalNode");
    }
}
