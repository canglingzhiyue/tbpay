package tb;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.node.FeatureNode;
import com.taobao.android.detail.datasdk.model.viewmodel.main.MultiMediaModel;
import com.taobao.android.detail.datasdk.model.viewmodel.main.NormalImageModel;
import com.taobao.android.detail.datasdk.model.viewmodel.main.SubItemModel;
import com.taobao.android.detail.datasdk.model.viewmodel.main.VideoModel;
import com.taobao.android.fluid.business.usertrack.track.b;
import com.taobao.android.trade.event.f;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class dzh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-363540453);
        emu.a("com.taobao.android.detail.core.detail.kit.profile.PathTracker");
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else {
            eps.a(context, "SizeSuite", "EditSize", new Pair("user_id", epo.g().e()));
        }
    }

    public static void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{context});
        } else {
            eps.a(context, "SizeSuite", "Measure", new Pair("user_id", epo.g().e()));
        }
    }

    public static void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f76bb9e", new Object[]{context});
        } else {
            eps.a(context, "SizeSuite", "SaveSize", new Pair("user_id", epo.g().e()));
        }
    }

    public static void d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a023673d", new Object[]{context});
        } else {
            eps.a(context, "CommentsTag", new Pair("spm", "a2141.7631564.comments"));
        }
    }

    public static void e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0d012dc", new Object[]{context});
        } else {
            eps.a(context, "CustomProtection", new Pair[0]);
        }
    }

    public static void f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a17cbe7b", new Object[]{context});
        } else {
            eps.a(context, "SKU", new Pair("spm", "a2141.7631564.sku"));
        }
    }

    public static void g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2296a1a", new Object[]{context});
        } else {
            eps.a(context, "TitleShare", new Pair[0]);
        }
    }

    public static void h(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2d615b9", new Object[]{context});
        } else {
            eps.a(context, "GetShopBouns", new Pair[0]);
        }
    }

    public static void a(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("258f9aa3", new Object[]{context, new Integer(i)});
            return;
        }
        eps.a(context, "BigPic", new Pair("spm", "a2141.7631564.1999020712." + i));
    }

    private static SubItemModel a(MultiMediaModel multiMediaModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SubItemModel) ipChange.ipc$dispatch("58434f34", new Object[]{multiMediaModel});
        }
        if (multiMediaModel != null && multiMediaModel.childModels != null && multiMediaModel.childModels.size() > 0) {
            return multiMediaModel.childModels.get(0);
        }
        return null;
    }

    public static void a(Context context, int i, MultiMediaModel multiMediaModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6df8a64f", new Object[]{context, new Integer(i), multiMediaModel});
            return;
        }
        SubItemModel a2 = a(multiMediaModel);
        if (a2 instanceof VideoModel) {
            VideoModel videoModel = (VideoModel) a2;
            HashMap hashMap = new HashMap();
            hashMap.put("spm", "a2141.7631564.1999020712." + i);
            hashMap.put("scaletype", videoModel.spatialVideoDimension);
            hashMap.put("tagamt", String.valueOf(videoModel.anchors.size()));
            eps.a(context, "BigPic", hashMap);
            return;
        }
        a(context, i);
    }

    public static void i(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a382c158", new Object[]{context});
        } else {
            eps.a(context, "GetShopCoupon", new Pair[0]);
        }
    }

    public static void j(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a42f6cf7", new Object[]{context});
        } else {
            eps.a(context, "ItemPruductParam", new Pair[0]);
        }
    }

    public static void k(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4dc1896", new Object[]{context});
        } else {
            eps.a(context, "Remind-TimingShelves", new Pair[0]);
        }
    }

    public static void l(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a588c435", new Object[]{context});
        } else {
            eps.a(context, "ShopPromotionInfoDetail_Entrance", new Pair[0]);
        }
    }

    public static void a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d18de974", new Object[]{context, str, str2});
        } else {
            eps.a(context, "AddToFavorite", new Pair("spm", "a2141.7631564.addtofavorite"), new Pair("categoryId", str), new Pair("rootCategoryId", str2));
        }
    }

    public static void b(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bbd7193", new Object[]{context, str, str2});
        } else {
            eps.a(context, "CancelFavorite", new Pair("categoryId", str), new Pair("rootCategoryId", str2));
        }
    }

    public static void a(Context context, MultiMediaModel multiMediaModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6daefb0c", new Object[]{context, multiMediaModel});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("item_id", multiMediaModel.itemId);
        hashMap.put("seller_id", multiMediaModel.sellerId);
        eps.a(context, "VideoDetail-Favor", hashMap);
    }

    public static void b(Context context, MultiMediaModel multiMediaModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("360d1fab", new Object[]{context, multiMediaModel});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("item_id", multiMediaModel.itemId);
        hashMap.put("seller_id", multiMediaModel.sellerId);
        eps.a(context, "VideoDetail-CancelFavor", hashMap);
    }

    public static void c(Context context, MultiMediaModel multiMediaModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe6b444a", new Object[]{context, multiMediaModel});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("item_id", multiMediaModel.itemId);
        hashMap.put("seller_id", multiMediaModel.sellerId);
        eps.a(context, "VideoDetail-AddCart", hashMap);
    }

    public static void d(Context context, MultiMediaModel multiMediaModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6c968e9", new Object[]{context, multiMediaModel});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("item_id", multiMediaModel.itemId);
        hashMap.put("seller_id", multiMediaModel.sellerId);
        hashMap.put("spm", "a2141.7631564.videodetail");
        eps.a(context, "VideoDetail-Buy", hashMap);
    }

    public static void a(Context context, String str, MultiMediaModel multiMediaModel) {
        FeatureNode f;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("204312d6", new Object[]{context, str, multiMediaModel});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("item_id", multiMediaModel.itemId);
        hashMap.put("seller_id", multiMediaModel.sellerId);
        hashMap.put("stay_time", str);
        if (multiMediaModel != null && multiMediaModel.nodeBundle != null && (f = eqb.f(multiMediaModel.nodeBundle)) != null) {
            z = f.needVideoFlow;
        }
        hashMap.put("video_flow", z ? "1" : "0");
        eps.a(context, "VideoDetailClose", hashMap);
    }

    public static void e(Context context, MultiMediaModel multiMediaModel) {
        FeatureNode f;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f278d88", new Object[]{context, multiMediaModel});
            return;
        }
        SubItemModel a2 = a(multiMediaModel);
        HashMap hashMap = new HashMap();
        hashMap.put("item_id", multiMediaModel.itemId);
        hashMap.put("seller_id", multiMediaModel.sellerId);
        if (a2 instanceof VideoModel) {
            hashMap.put(b.PROPERTY_VIDEO_ID, ((VideoModel) a2).videoId);
        }
        if (multiMediaModel != null && multiMediaModel.nodeBundle != null && (f = eqb.f(multiMediaModel.nodeBundle)) != null) {
            z = f.needVideoFlow;
        }
        hashMap.put("video_flow", z ? "1" : "0");
        eps.a(context, "VideoPause ", hashMap);
    }

    public static void c(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5ecf9b2", new Object[]{context, str, str2});
        } else {
            eps.a(context, "QualityBigPic", a(str, str2));
        }
    }

    public static void d(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("101c81d1", new Object[]{context, str, str2});
        } else {
            eps.a(context, "DESC-LoadMore", a(str, str2));
        }
    }

    public static void e(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a4c09f0", new Object[]{context, str, str2});
        } else {
            eps.a(context, "DESC-LoadLess", a(str, str2));
        }
    }

    public static void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{context, str});
            return;
        }
        eps.a(context, "Custom-Module" + str, new Pair[0]);
    }

    public static void f(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e47b920f", new Object[]{context, str, str2});
        } else {
            eps.a(context, "DESC-goodsmatching", a(str, str2));
        }
    }

    public static void g(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4eab1a2e", new Object[]{context, str, str2});
        } else {
            eps.a(context, "DESC-HangTag", a(str, str2));
        }
    }

    public static void b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b80d809", new Object[]{context, str});
            return;
        }
        eps.a(context, "DESC-Service" + str, new Pair[0]);
    }

    public static Pair<String, String>[] a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair[]) ipChange.ipc$dispatch("f4b321ff", new Object[]{str, str2});
        }
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            arrayList.add(new Pair("spm", str));
        }
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(new Pair("scm", str2));
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return (Pair[]) arrayList.toArray(new Pair[arrayList.size()]);
    }

    public static void m(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6356fd4", new Object[]{context});
        } else {
            eps.a(context, "GotoPromotion", new Pair("spm", "a2141.7631564.2209827"));
        }
    }

    public static void n(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6e21b73", new Object[]{context});
        } else {
            eps.a(context, "GotoDetail", new Pair("spm", "a2141.7631564.2209827"));
        }
    }

    public static void o(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a78ec712", new Object[]{context});
        } else {
            eps.a(context, "ItemDetail2", new Pair[0]);
        }
    }

    public static void f(Context context, MultiMediaModel multiMediaModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5785b227", new Object[]{context, multiMediaModel});
            return;
        }
        SubItemModel a2 = a(multiMediaModel);
        if (a2 instanceof VideoModel) {
            VideoModel videoModel = (VideoModel) a2;
            HashMap hashMap = new HashMap();
            hashMap.put("scaletype", videoModel.spatialVideoDimension);
            hashMap.put("tagamt", String.valueOf(videoModel.anchors.size()));
            eps.a(context, "ItemDetail2", hashMap);
            return;
        }
        o(context);
    }

    public static void p(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a83b72b1", new Object[]{context});
        } else {
            eps.a(context, "ItemDetail3", new Pair[0]);
        }
    }

    public static void g(Context context, MultiMediaModel multiMediaModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fe3d6c6", new Object[]{context, multiMediaModel});
            return;
        }
        SubItemModel a2 = a(multiMediaModel);
        if (a2 instanceof VideoModel) {
            VideoModel videoModel = (VideoModel) a2;
            HashMap hashMap = new HashMap();
            hashMap.put("scaletype", videoModel.spatialVideoDimension);
            hashMap.put("tagamt", String.valueOf(videoModel.anchors.size()));
            eps.a(context, "ItemDetail3", hashMap);
            return;
        }
        p(context);
    }

    public static void h(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8daa24d", new Object[]{context, str, str2});
        } else {
            eps.a(context, "HeadTimeTunnel", a(str, str2, (String) null));
        }
    }

    public static Pair<String, String>[] a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair[]) ipChange.ipc$dispatch("167c6f5", new Object[]{str, str2, str3});
        }
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            arrayList.add(new Pair("spm", str));
        }
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(new Pair("scm", str2));
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(new Pair(b.PROPERTY_VIDEO_ID, str3));
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return (Pair[]) arrayList.toArray(new Pair[arrayList.size()]);
    }

    public static void b(Context context, int i, MultiMediaModel multiMediaModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b15f1590", new Object[]{context, new Integer(i), multiMediaModel});
            return;
        }
        SubItemModel a2 = a(multiMediaModel);
        if (!(a2 instanceof VideoModel)) {
            eps.a(context, "MovePic", new Pair("spm", "a2141.7631564.1999020712." + i));
            return;
        }
        VideoModel videoModel = (VideoModel) a2;
        HashMap hashMap = new HashMap();
        hashMap.put("spm", "a2141.7631564.1999020712." + i);
        hashMap.put("scaletype", videoModel.spatialVideoDimension);
        hashMap.put("tagamt", String.valueOf(videoModel.anchors.size()));
        eps.a(context, "MovePic", hashMap);
    }

    public static void h(Context context, MultiMediaModel multiMediaModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e841fb65", new Object[]{context, multiMediaModel});
            return;
        }
        SubItemModel a2 = a(multiMediaModel);
        enp enpVar = new enp(null);
        enpVar.f27473a = new HashMap<>();
        if (a2 instanceof VideoModel) {
            VideoModel videoModel = (VideoModel) a2;
            enpVar.f27473a.put("trackPage", "Page_Detail_Show_Detail");
            enpVar.f27473a.put("item_id", multiMediaModel.itemId);
            enpVar.f27473a.put("seller_id", multiMediaModel.sellerId);
            enpVar.f27473a.put(b.PROPERTY_VIDEO_ID, videoModel.videoId);
            enpVar.f27473a.put("spm", "a2141.7631564.1999020712");
            enpVar.f27473a.put("scm", "20140620.1.1.8");
            enpVar.f27473a.put("scaletype", videoModel.spatialVideoDimension);
            enpVar.f27473a.put("tagamt", String.valueOf(videoModel.anchors.size()));
            f.a(context, enpVar);
        } else if (!(a2 instanceof NormalImageModel)) {
        } else {
            enpVar.f27473a.put("trackPage", "Page_Detail_Show_Detail");
            enpVar.f27473a.put("item_id", multiMediaModel.itemId);
            enpVar.f27473a.put("seller_id", multiMediaModel.sellerId);
            enpVar.f27473a.put("spm", "a2141.7631564.1999020712");
            enpVar.f27473a.put("scm", "20140620.1.1.9");
            f.a(context, enpVar);
        }
    }

    public static void i(Context context, MultiMediaModel multiMediaModel) {
        FeatureNode f;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0a02004", new Object[]{context, multiMediaModel});
            return;
        }
        enp enpVar = new enp(null);
        if (multiMediaModel != null && multiMediaModel.nodeBundle != null && (f = eqb.f(multiMediaModel.nodeBundle)) != null) {
            z = f.needVideoFlow;
        }
        enpVar.f27473a = new HashMap<>();
        enpVar.f27473a.put("trackId", "2201");
        enpVar.f27473a.put("trackPage", "Page_Detail_Show_VideoDetail");
        enpVar.f27473a.put("spm", "a2141.7631564.videodetail");
        enpVar.f27473a.put("item_id", multiMediaModel.itemId);
        enpVar.f27473a.put("seller_id", multiMediaModel.sellerId);
        enpVar.f27473a.put("video_flow", z ? "1" : "0");
        f.a(context, enpVar);
    }

    public static void q(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8e81e50", new Object[]{context});
        } else {
            eps.a(context, "VideoEntrancePlay", new Pair[0]);
        }
    }

    public static void c(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d54b79e8", new Object[]{context, str});
        } else {
            eps.a(context, "PlayPagePlay", new Pair("sourcetype", str));
        }
    }

    public static void j(Context context, MultiMediaModel multiMediaModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78fe44a3", new Object[]{context, multiMediaModel});
            return;
        }
        SubItemModel a2 = a(multiMediaModel);
        HashMap hashMap = new HashMap();
        if (a2 instanceof VideoModel) {
            VideoModel videoModel = (VideoModel) a2;
            hashMap.put("scaletype", videoModel.spatialVideoDimension);
            hashMap.put("tagamt", String.valueOf(videoModel.anchors.size()));
            hashMap.put(b.PROPERTY_VIDEO_ID, videoModel.videoId);
        }
        eps.a(context, "VDPicClick", hashMap);
    }

    public static void c(Context context, int i, MultiMediaModel multiMediaModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4c584d1", new Object[]{context, new Integer(i), multiMediaModel});
            return;
        }
        SubItemModel a2 = a(multiMediaModel);
        if (!(a2 instanceof VideoModel)) {
            return;
        }
        VideoModel videoModel = (VideoModel) a2;
        HashMap hashMap = new HashMap();
        String str = videoModel.spatialVideoDimension;
        if (TextUtils.isEmpty(str)) {
            str = "0:0";
        }
        hashMap.put("scaletype", str);
        hashMap.put("tagamt", String.valueOf(videoModel.anchors.size()));
        hashMap.put(b.PROPERTY_VIDEO_ID, videoModel.videoId);
        hashMap.put("item_id", multiMediaModel.itemId);
        hashMap.put("seller_id", multiMediaModel.sellerId);
        hashMap.put("index", videoModel.anchors.get(i).desc);
        eps.a(context, "VDTagDisplay", hashMap);
    }

    public static void i(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("230a2a6c", new Object[]{context, str, str2});
            return;
        }
        enp enpVar = new enp(null);
        enpVar.f27473a = new HashMap<>();
        enpVar.f27473a.put("trackId", "2201");
        enpVar.f27473a.put("trackPage", "Page_Detail_Show_PieceTogether");
        enpVar.f27473a.put("spm", "a2141.7631564.piecetogether");
        enpVar.f27473a.put("item_id", str);
        enpVar.f27473a.put("seller_id", str2);
        f.a(context).a(enpVar);
    }

    public static void j(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d39b28b", new Object[]{context, str, str2});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("spm", "a2141.7631564.piecetogether");
        hashMap.put("item_id", str);
        hashMap.put("seller_id", str2);
        f.a(context).a(new eny("Button-", "PieceTogether", hashMap));
    }
}
