package com.taobao.android.detail.datasdk.model.viewmodel.main;

import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.node.FeatureNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.ItemNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.PriceNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.ResourceNode;
import java.util.List;
import tb.emu;
import tb.eqb;
import tb.kge;

/* loaded from: classes4.dex */
public class VideoModel implements SubItemModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public List<ItemNode.VideoItem.AnchorInfo> anchors;
    public boolean hasCouponList;
    public int index;
    public String interactiveId;
    public boolean isFullScreen;
    public String itemId;
    public boolean needVideoFlow;
    public com.taobao.android.detail.datasdk.model.datamodel.node.b nodeBundle;
    public MultiMediaModel parentModel;
    public String spatialVideoDimension;
    public String thumbnailUrl;
    public String title;
    public String totalSoldQuantity;
    public String transmitPrice;
    public String userId;
    public String videoId;
    public String videoUrl;
    public View videoView;
    public String weexRecommendUrl;
    public boolean needAutoPlay = true;
    public boolean isPlayState = false;
    public boolean popupPlayFlag = false;
    public boolean scrollPlay = true;

    static {
        kge.a(-399835671);
        kge.a(1162456369);
    }

    public VideoModel(ItemNode.VideoItem videoItem, MultiMediaModel multiMediaModel) {
        boolean z = false;
        this.hasCouponList = false;
        this.needVideoFlow = false;
        this.videoUrl = videoItem.url;
        this.thumbnailUrl = videoItem.videoThumbnailURL;
        this.videoId = videoItem.videoId;
        this.interactiveId = videoItem.interactiveId;
        this.anchors = videoItem.anchors;
        this.spatialVideoDimension = videoItem.spatialVideoDimension;
        this.weexRecommendUrl = videoItem.weexRecommendUrl;
        this.nodeBundle = multiMediaModel.nodeBundle;
        com.taobao.android.detail.datasdk.model.datamodel.node.b bVar = this.nodeBundle;
        if (bVar != null) {
            PriceNode m = eqb.m(bVar);
            if (m != null) {
                this.transmitPrice = m.transmitPrice.priceText;
            }
            ItemNode c = eqb.c(this.nodeBundle);
            if (c != null) {
                this.title = c.title;
                this.totalSoldQuantity = c.sellCount;
            }
            ResourceNode l = eqb.l(this.nodeBundle);
            if (l != null && l.couponNode != null) {
                this.hasCouponList = l.couponNode.mainItems.size() != 0 ? true : z;
            }
            FeatureNode f = eqb.f(this.nodeBundle);
            if (f != null) {
                this.needVideoFlow = f.needVideoFlow;
            }
            if (c != null) {
                this.itemId = c.itemId;
            }
        }
        emu.a("com.taobao.android.detail.datasdk.model.viewmodel.main.VideoModel");
    }

    public static boolean isVideoSize_3_4(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d87272d0", new Object[]{str})).booleanValue();
        }
        if (!StringUtils.isEmpty(str)) {
            String[] split = str.split(":");
            try {
                double intValue = Integer.valueOf(split[0]).intValue() / Integer.valueOf(split[1]).intValue();
                if (intValue > 0.7d && intValue < 0.8d) {
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    @Override // com.taobao.android.detail.datasdk.model.viewmodel.main.SubItemModel
    public int getIndex() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("cf396596", new Object[]{this})).intValue() : this.index;
    }

    @Override // com.taobao.android.detail.datasdk.model.viewmodel.main.SubItemModel
    public void setIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46180fcc", new Object[]{this, new Integer(i)});
        } else {
            this.index = i;
        }
    }
}
