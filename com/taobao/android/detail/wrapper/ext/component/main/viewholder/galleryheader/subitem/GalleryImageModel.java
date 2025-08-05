package com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.node.GalleryNode;
import com.taobao.android.detail.datasdk.model.viewmodel.main.SubItemModel;
import tb.emu;
import tb.kge;

/* loaded from: classes5.dex */
public class GalleryImageModel implements SubItemModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public GalleryNode.GalleryItemNode galleryItemNode;
    private int index;
    public TBMultiMediaModel parentModel;

    static {
        kge.a(-1611352411);
        kge.a(1162456369);
    }

    public GalleryImageModel(GalleryNode.GalleryItemNode galleryItemNode, TBMultiMediaModel tBMultiMediaModel) {
        this.galleryItemNode = galleryItemNode;
        this.parentModel = tBMultiMediaModel;
        emu.a("com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.GalleryImageModel");
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
