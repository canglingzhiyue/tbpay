package com.taobao.android.detail.sdk.vmodel.main;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.model.node.ItemNode;
import com.taobao.android.detail.sdk.model.node.NodeBundle;
import java.util.List;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class an implements SubItemModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f10420a;
    public String b;
    public String c;
    public String d;
    public String e;
    public NodeBundle f;
    public List<ItemNode.VideoItem.AnchorInfo> g;
    public String h;
    public String i;
    public String j;
    public String k;
    public boolean l;
    public boolean m;
    public MultiMediaModel n;
    public boolean o = true;
    public boolean p = false;
    public boolean q = false;
    public boolean r = true;
    public int s;
    public String t;
    public String u;

    static {
        kge.a(-1892330104);
        kge.a(1394383120);
    }

    public an(ItemNode.VideoItem videoItem, MultiMediaModel multiMediaModel) {
        boolean z = false;
        this.l = false;
        this.m = false;
        this.u = "";
        tpc.a("com.taobao.android.detail.sdk.vmodel.main.VideoModel");
        this.f10420a = videoItem.url;
        this.b = videoItem.videoThumbnailURL;
        this.d = videoItem.videoId;
        this.e = videoItem.interactiveId;
        this.g = videoItem.anchors;
        this.t = videoItem.spatialVideoDimension;
        this.c = videoItem.weexRecommendUrl;
        this.f = multiMediaModel.nodeBundle;
        NodeBundle nodeBundle = this.f;
        if (nodeBundle != null) {
            if (nodeBundle.priceNode != null) {
                this.h = this.f.priceNode.transmitPrice.priceText;
            }
            if (this.f.itemNode != null) {
                this.i = this.f.itemNode.title;
                this.j = this.f.itemNode.sellCount;
            }
            if (this.f.resourceNode != null && this.f.resourceNode.couponNode != null) {
                this.l = this.f.resourceNode.couponNode.mainItems.size() != 0 ? true : z;
            }
            if (this.f.featureNode != null) {
                this.m = this.f.featureNode.needVideoFlow;
            }
            if (this.f.itemNode != null) {
                this.k = this.f.itemNode.itemId;
            }
            if (this.f.verticalNode == null || this.f.verticalNode.videoFlowVNode == null) {
                return;
            }
            this.u = this.f.verticalNode.videoFlowVNode.bitmap;
        }
    }

    @Override // com.taobao.android.detail.sdk.vmodel.main.SubItemModel
    public int getIndex() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("cf396596", new Object[]{this})).intValue() : this.s;
    }

    @Override // com.taobao.android.detail.sdk.vmodel.main.SubItemModel
    public void setIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46180fcc", new Object[]{this, new Integer(i)});
        } else {
            this.s = i;
        }
    }
}
