package com.taobao.android.detail.sdk.model.node;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.utils.c;
import com.taobao.android.detail.sdk.utils.g;
import com.taobao.ju.track.server.JTrackParams;
import java.util.Map;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class NodeBundle {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Map<String, String> aliAbTestTrackParams;
    public BuyerNode buyerNode;
    public Certification certification;
    public ConsumerRightsNode consumerRightsNode;
    public Object extObjNode;
    public FeatureNode featureNode;
    public GlobalNode globalNode;
    public ItemNode itemNode;
    public String msoaToken;
    public PriceNode priceNode;
    public Props2Node props2Node;
    public PropsNode propsNode;
    public RateNode rateNode;
    public ResourceNode resourceNode;
    public RightsNode rightsNode;
    public JSONObject root;
    public SellerNode sellerNode;
    public ServiceNode serviceNode;
    public ShippingNode shippingNode;
    public SkuBaseNode skuBaseNode;
    public SkuCoreNode skuCoreNode;
    public SkuVerticalNode skuVerticalNode;
    public TraceDatasNode traceDatasNode;
    public Map<String, String> trackEventParams;
    public Map<String, String> trackParams;
    public TradeNode tradeNode;
    public VerticalNode verticalNode;
    public WeAppNode weappNode;
    public YxgDataNode yxgDataNode;

    static {
        kge.a(745958155);
    }

    public NodeBundle() {
        tpc.a("com.taobao.android.detail.sdk.model.node.NodeBundle");
    }

    public NodeBundle(JSONObject jSONObject) {
        this.root = jSONObject;
        tpc.a("com.taobao.android.detail.sdk.model.node.NodeBundle");
        this.msoaToken = jSONObject.getString("msoaToken");
        try {
            this.globalNode = new GlobalNode();
        } catch (Throwable unused) {
        }
        try {
            this.itemNode = new ItemNode(jSONObject.getJSONObject("item"));
        } catch (Throwable unused2) {
            this.itemNode = new ItemNode(new JSONObject());
        }
        try {
            this.priceNode = new PriceNode(jSONObject.getJSONObject("price"));
        } catch (Throwable unused3) {
            this.priceNode = new PriceNode(new JSONObject());
        }
        try {
            this.rateNode = new RateNode(jSONObject.getJSONObject(com.taobao.android.detail.datasdk.model.datamodel.node.RateNode.TAG));
        } catch (Throwable unused4) {
            this.rateNode = new RateNode(new JSONObject());
        }
        try {
            this.skuBaseNode = new SkuBaseNode(jSONObject.getJSONObject(com.taobao.android.detail.datasdk.model.datamodel.node.SkuBaseNode.TAG));
        } catch (Throwable unused5) {
            this.skuBaseNode = new SkuBaseNode(new JSONObject());
        }
        try {
            this.skuCoreNode = new SkuCoreNode(jSONObject.getJSONObject(com.taobao.android.detail.datasdk.model.datamodel.node.SkuCoreNode.TAG));
        } catch (Throwable unused6) {
            this.skuCoreNode = new SkuCoreNode(new JSONObject());
        }
        try {
            this.serviceNode = new ServiceNode(jSONObject.getJSONObject(com.taobao.android.detail.datasdk.model.datamodel.node.ServiceNode.TAG));
        } catch (Throwable unused7) {
            this.serviceNode = new ServiceNode(new JSONObject());
        }
        try {
            this.buyerNode = new BuyerNode(jSONObject.getJSONObject(com.taobao.android.detail.datasdk.model.datamodel.node.BuyerNode.TAG));
        } catch (Throwable unused8) {
            this.buyerNode = new BuyerNode(new JSONObject());
        }
        try {
            this.sellerNode = new SellerNode(jSONObject.getJSONObject("seller"));
        } catch (Throwable unused9) {
            this.sellerNode = new SellerNode(new JSONObject());
        }
        try {
            this.featureNode = new FeatureNode(jSONObject.getJSONObject("feature"));
        } catch (Throwable unused10) {
            this.featureNode = new FeatureNode(new JSONObject());
        }
        try {
            this.rightsNode = new RightsNode(jSONObject.getJSONObject(com.taobao.android.detail.datasdk.model.datamodel.node.RightsNode.TAG));
        } catch (Throwable unused11) {
            this.rightsNode = new RightsNode(new JSONObject());
        }
        try {
            this.consumerRightsNode = new ConsumerRightsNode(jSONObject.getJSONObject(com.taobao.android.detail.datasdk.model.datamodel.node.ConsumerRightsNode.TAG));
        } catch (Throwable unused12) {
            this.consumerRightsNode = new ConsumerRightsNode(new JSONObject());
        }
        try {
            this.shippingNode = new ShippingNode(jSONObject.getJSONObject(com.taobao.android.detail.datasdk.model.datamodel.node.ShippingNode.TAG));
        } catch (Throwable unused13) {
            this.shippingNode = new ShippingNode(new JSONObject());
        }
        try {
            this.propsNode = new PropsNode(jSONObject.getJSONObject("props"));
        } catch (Throwable unused14) {
            this.propsNode = new PropsNode(new JSONObject());
        }
        try {
            this.props2Node = new Props2Node(jSONObject.getJSONObject(com.taobao.android.detail.datasdk.model.datamodel.node.Props2Node.TAG));
        } catch (Throwable unused15) {
            this.props2Node = new Props2Node(new JSONObject());
        }
        try {
            this.resourceNode = new ResourceNode(jSONObject.getJSONObject("resource"));
        } catch (Throwable unused16) {
            this.resourceNode = new ResourceNode(new JSONObject());
        }
        try {
            this.tradeNode = new TradeNode(jSONObject.getJSONObject("trade"));
        } catch (Throwable unused17) {
            this.tradeNode = new TradeNode(new JSONObject());
        }
        try {
            this.verticalNode = new VerticalNode(jSONObject.getJSONObject("vertical"));
        } catch (Throwable unused18) {
            this.verticalNode = new VerticalNode(new JSONObject());
        }
        try {
            this.weappNode = new WeAppNode(jSONObject.getJSONObject(com.taobao.android.detail.datasdk.model.datamodel.node.WeAppNode.TAG));
        } catch (Throwable unused19) {
            this.weappNode = new WeAppNode(new JSONObject());
        }
        try {
            this.skuVerticalNode = new SkuVerticalNode(jSONObject.getJSONObject(com.taobao.android.detail.datasdk.model.datamodel.node.SkuVerticalNode.TAG));
        } catch (Throwable unused20) {
            this.skuVerticalNode = new SkuVerticalNode(new JSONObject());
        }
        try {
            this.certification = new Certification(jSONObject.getJSONObject(com.taobao.android.detail.datasdk.model.datamodel.node.Certification.TAG));
        } catch (Throwable unused21) {
            this.certification = new Certification(new JSONObject());
        }
        try {
            this.yxgDataNode = new YxgDataNode(jSONObject.getJSONObject(com.taobao.android.detail.datasdk.model.datamodel.node.YxgDataNode.TAG));
        } catch (Throwable unused22) {
            this.yxgDataNode = null;
        }
        try {
            this.traceDatasNode = new TraceDatasNode(jSONObject.getJSONObject(com.taobao.android.detail.datasdk.model.datamodel.node.TraceDatasNode.TAG));
        } catch (Throwable unused23) {
            this.traceDatasNode = null;
        }
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("params");
            if (jSONObject2 == null || jSONObject2.isEmpty()) {
                return;
            }
            JSONObject jSONObject3 = jSONObject2.getJSONObject(JTrackParams.TRACK_PARAMS);
            if (jSONObject3 != null && !jSONObject3.isEmpty()) {
                this.trackParams = c.a(jSONObject3, new g<String>() { // from class: com.taobao.android.detail.sdk.model.node.NodeBundle.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.lang.String] */
                    @Override // com.taobao.android.detail.sdk.utils.g
                    public /* synthetic */ String b(Object obj) {
                        IpChange ipChange = $ipChange;
                        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
                    }

                    public String a(Object obj) {
                        IpChange ipChange = $ipChange;
                        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8a5b32dc", new Object[]{this, obj}) : String.valueOf(obj);
                    }
                });
            }
            JSONObject jSONObject4 = jSONObject2.getJSONObject("aliAbTestTrackParams");
            if (jSONObject4 != null && !jSONObject4.isEmpty()) {
                this.aliAbTestTrackParams = c.a(jSONObject4, new g<String>() { // from class: com.taobao.android.detail.sdk.model.node.NodeBundle.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.lang.String] */
                    @Override // com.taobao.android.detail.sdk.utils.g
                    public /* synthetic */ String b(Object obj) {
                        IpChange ipChange = $ipChange;
                        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
                    }

                    public String a(Object obj) {
                        IpChange ipChange = $ipChange;
                        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8a5b32dc", new Object[]{this, obj}) : String.valueOf(obj);
                    }
                });
            }
            JSONObject jSONObject5 = jSONObject2.getJSONObject("trackEventParams");
            if (jSONObject5 == null || jSONObject5.isEmpty()) {
                return;
            }
            this.trackEventParams = c.a(jSONObject5, new g<String>() { // from class: com.taobao.android.detail.sdk.model.node.NodeBundle.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.lang.String] */
                @Override // com.taobao.android.detail.sdk.utils.g
                public /* synthetic */ String b(Object obj) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? ipChange.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
                }

                public String a(Object obj) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8a5b32dc", new Object[]{this, obj}) : (String) obj;
                }
            });
        } catch (Throwable unused24) {
        }
    }

    public void setExtendData(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbe67c09", new Object[]{this, obj});
            return;
        }
        this.extObjNode = obj;
        if (obj == null) {
            return;
        }
        this.root.put("extendData", obj);
    }
}
