package com.taobao.android.detail.sdk.vmodel.main;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.model.node.ItemNode;
import com.taobao.android.detail.sdk.model.node.NodeBundle;
import com.taobao.android.detail.sdk.model.node.ResourceNode;
import com.taobao.android.detail.sdk.model.template.ComponentModel;
import java.util.ArrayList;
import java.util.Iterator;
import tb.bsq;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class w extends MainViewModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f10448a;
    public ArrayList<String> b;
    public String c;
    public String d;
    public boolean e;
    public String f;
    public String g;
    public String h;
    public String i;
    public double j;
    public ResourceNode.Entry k;
    public boolean l;

    static {
        kge.a(273287458);
    }

    @Override // com.taobao.android.detail.sdk.vmodel.main.MainViewModel
    public int getViewModelType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7e14bda2", new Object[]{this})).intValue();
        }
        return 30001;
    }

    public w(ComponentModel componentModel, NodeBundle nodeBundle) {
        super(componentModel, nodeBundle);
        tpc.a("com.taobao.android.detail.sdk.vmodel.main.PicGalleryViewModel");
        this.b = nodeBundle.itemNode.images;
        this.f10448a = nodeBundle.itemNode.itemId;
        this.e = nodeBundle.featureNode.isMakeUp;
        this.l = nodeBundle.featureNode.renovation;
        this.i = nodeBundle.sellerNode.userId;
        this.f = nodeBundle.itemNode.spatialVideoUrl;
        this.h = nodeBundle.itemNode.spatialFileSize;
        this.k = nodeBundle.resourceNode.entrances.get(ResourceNode.MAP_KEY_TIMETUNNEL);
        this.g = nodeBundle.itemNode.spatialHdVideoUrl;
        Iterator<ItemNode.VideoItem> it = nodeBundle.itemNode.videos.iterator();
        while (it.hasNext()) {
            ItemNode.VideoItem next = it.next();
            if (next.type == 2) {
                this.c = next.url;
                this.d = next.videoThumbnailURL;
                break;
            }
        }
        try {
            this.j = componentModel.mapping.getDouble(bsq.KEY_HEIGHT_RATIO).doubleValue();
        } catch (Throwable unused) {
        }
    }
}
