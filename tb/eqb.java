package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.node.ConsumerRightsNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.ContentNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.DetailClientDataNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.DetailOptNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.DiversionNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.FeatureNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.GalleryNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.ItemNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.NativeFloatButtonNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.PriceNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.Props2Node;
import com.taobao.android.detail.datasdk.model.datamodel.node.PropsNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.RateNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.ResourceNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.RightsNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.SellerNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.ShippingNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.SkuBaseNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.SkuCoreNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.SkuVerticalNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.TraceDatasNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.TradeNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.VerticalNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.YxgDataNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.b;

/* loaded from: classes4.dex */
public class eqb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(232051549);
        emu.a("com.taobao.android.detail.datasdk.utils.NodeDataUtils");
    }

    public static DiversionNode a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DiversionNode) ipChange.ipc$dispatch("37fd15bb", new Object[]{bVar});
        }
        DiversionNode diversionNode = (DiversionNode) bVar.b(DiversionNode.TAG, DiversionNode.class);
        return diversionNode == null ? new DiversionNode(new JSONObject()) : diversionNode;
    }

    public static GalleryNode b(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GalleryNode) ipChange.ipc$dispatch("2cff63db", new Object[]{bVar});
        }
        GalleryNode galleryNode = (GalleryNode) bVar.b(GalleryNode.TAG, GalleryNode.class);
        return galleryNode == null ? new GalleryNode(new JSONObject()) : galleryNode;
    }

    public static ItemNode c(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ItemNode) ipChange.ipc$dispatch("7b48aa53", new Object[]{bVar});
        }
        ItemNode itemNode = (ItemNode) bVar.b("item", ItemNode.class);
        return itemNode == null ? new ItemNode(new JSONObject()) : itemNode;
    }

    public static SellerNode d(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SellerNode) ipChange.ipc$dispatch("9ac29228", new Object[]{bVar});
        }
        SellerNode sellerNode = (SellerNode) bVar.b("seller", SellerNode.class);
        return sellerNode == null ? new SellerNode(new JSONObject()) : sellerNode;
    }

    public static TradeNode e(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TradeNode) ipChange.ipc$dispatch("cb675da6", new Object[]{bVar});
        }
        TradeNode tradeNode = (TradeNode) bVar.b("trade", TradeNode.class);
        return tradeNode == null ? new TradeNode(new JSONObject()) : tradeNode;
    }

    public static FeatureNode f(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FeatureNode) ipChange.ipc$dispatch("484a4733", new Object[]{bVar});
        }
        FeatureNode featureNode = (FeatureNode) bVar.b("feature", FeatureNode.class);
        return featureNode == null ? new FeatureNode(new JSONObject()) : featureNode;
    }

    public static VerticalNode g(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VerticalNode) ipChange.ipc$dispatch("d0877454", new Object[]{bVar});
        }
        VerticalNode verticalNode = (VerticalNode) bVar.b("vertical", VerticalNode.class);
        return verticalNode == null ? new VerticalNode(new JSONObject()) : verticalNode;
    }

    public static ShippingNode h(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShippingNode) ipChange.ipc$dispatch("22f514dd", new Object[]{bVar});
        }
        ShippingNode shippingNode = (ShippingNode) bVar.b(ShippingNode.TAG, ShippingNode.class);
        return shippingNode == null ? new ShippingNode(new JSONObject()) : shippingNode;
    }

    public static SkuBaseNode i(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SkuBaseNode) ipChange.ipc$dispatch("1db6eff8", new Object[]{bVar});
        }
        SkuBaseNode skuBaseNode = (SkuBaseNode) bVar.b(SkuBaseNode.TAG, SkuBaseNode.class);
        return skuBaseNode == null ? new SkuBaseNode(new JSONObject()) : skuBaseNode;
    }

    public static SkuCoreNode j(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SkuCoreNode) ipChange.ipc$dispatch("bf84a809", new Object[]{bVar});
        }
        SkuCoreNode skuCoreNode = (SkuCoreNode) bVar.b(SkuCoreNode.TAG, SkuCoreNode.class);
        return skuCoreNode == null ? new SkuCoreNode(new JSONObject()) : skuCoreNode;
    }

    public static RateNode k(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RateNode) ipChange.ipc$dispatch("a038d2ae", new Object[]{bVar});
        }
        RateNode rateNode = (RateNode) bVar.b(RateNode.TAG, RateNode.class);
        return rateNode == null ? new RateNode(new JSONObject()) : rateNode;
    }

    public static ResourceNode l(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ResourceNode) ipChange.ipc$dispatch("fc00f981", new Object[]{bVar});
        }
        ResourceNode resourceNode = (ResourceNode) bVar.b("resource", ResourceNode.class);
        return resourceNode == null ? new ResourceNode(new JSONObject()) : resourceNode;
    }

    public static PriceNode m(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PriceNode) ipChange.ipc$dispatch("78f923d9", new Object[]{bVar});
        }
        PriceNode priceNode = (PriceNode) bVar.b("price", PriceNode.class);
        return priceNode == null ? new PriceNode(new JSONObject()) : priceNode;
    }

    public static Props2Node n(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Props2Node) ipChange.ipc$dispatch("fcf7aecf", new Object[]{bVar});
        }
        Props2Node props2Node = (Props2Node) bVar.b(Props2Node.TAG, Props2Node.class);
        return props2Node == null ? new Props2Node(new JSONObject()) : props2Node;
    }

    public static RightsNode o(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RightsNode) ipChange.ipc$dispatch("368f66db", new Object[]{bVar});
        }
        RightsNode rightsNode = (RightsNode) bVar.b(RightsNode.TAG, RightsNode.class);
        return rightsNode == null ? new RightsNode(new JSONObject()) : rightsNode;
    }

    public static ConsumerRightsNode p(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConsumerRightsNode) ipChange.ipc$dispatch("25a1eb06", new Object[]{bVar});
        }
        ConsumerRightsNode consumerRightsNode = (ConsumerRightsNode) bVar.b(ConsumerRightsNode.TAG, ConsumerRightsNode.class);
        return consumerRightsNode == null ? new ConsumerRightsNode(new JSONObject()) : consumerRightsNode;
    }

    public static PropsNode q(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PropsNode) ipChange.ipc$dispatch("6a1f3b8e", new Object[]{bVar});
        }
        PropsNode propsNode = (PropsNode) bVar.b("props", PropsNode.class);
        return propsNode == null ? new PropsNode(new JSONObject()) : propsNode;
    }

    public static TraceDatasNode r(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TraceDatasNode) ipChange.ipc$dispatch("f7fadf11", new Object[]{bVar}) : (TraceDatasNode) bVar.b(TraceDatasNode.TAG, TraceDatasNode.class);
    }

    public static YxgDataNode s(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (YxgDataNode) ipChange.ipc$dispatch("9f4c0c4a", new Object[]{bVar}) : (YxgDataNode) bVar.b(YxgDataNode.TAG, YxgDataNode.class);
    }

    public static SkuVerticalNode t(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SkuVerticalNode) ipChange.ipc$dispatch("a5a5c548", new Object[]{bVar}) : (SkuVerticalNode) bVar.b(SkuVerticalNode.TAG, SkuVerticalNode.class);
    }

    public static DetailOptNode u(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DetailOptNode) ipChange.ipc$dispatch("d4f1fa98", new Object[]{bVar}) : (DetailOptNode) bVar.b(DetailOptNode.TAG, DetailOptNode.class);
    }

    public static DetailClientDataNode v(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DetailClientDataNode) ipChange.ipc$dispatch("9c6448d3", new Object[]{bVar}) : (DetailClientDataNode) bVar.b(DetailClientDataNode.TAG, DetailClientDataNode.class);
    }

    public static NativeFloatButtonNode w(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NativeFloatButtonNode) ipChange.ipc$dispatch("eb31d201", new Object[]{bVar});
        }
        if (bVar != null) {
            return (NativeFloatButtonNode) bVar.b("resource", NativeFloatButtonNode.class);
        }
        return null;
    }

    public static ContentNode x(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ContentNode) ipChange.ipc$dispatch("9bfb29be", new Object[]{bVar}) : (ContentNode) bVar.b("content", ContentNode.class);
    }
}
