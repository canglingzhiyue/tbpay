package com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.node.RateNode;
import com.taobao.android.detail.datasdk.model.viewmodel.main.SubItemModel;
import tb.emu;
import tb.kge;

/* loaded from: classes5.dex */
public class NormalImageModel implements SubItemModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String imageUrl;
    public int index;
    public TBMultiMediaModel parentModel;
    public RateNode.a propRate;
    public String skuBottomText;
    public boolean supportLongPress = true;
    public boolean skuFirstPhotoFlag = false;
    public boolean isSkuPic = false;

    static {
        kge.a(914624272);
        kge.a(1162456369);
    }

    public NormalImageModel() {
        emu.a("com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.NormalImageModel");
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
