package com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.node.FeatureNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.GalleryNode;
import com.taobao.android.detail.datasdk.model.datamodel.sku.SkuPageModel;
import com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel;
import com.taobao.android.detail.datasdk.model.viewmodel.main.MultiMediaModel;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.ArrayList;
import tb.emu;
import tb.epb;
import tb.epj;
import tb.kge;

/* loaded from: classes5.dex */
public class TBMultiMediaModel extends MultiMediaModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public GalleryVideoModel mGalleryVideoModel;
    private boolean mHasInitNewGallery;
    private boolean mNewIndicator;
    public GalleryNode.GalleryItemNode mOpenUrlGalleryItemNode;
    private boolean mUseNewGallery;
    public GalleryNode.GalleryItemNode mVideoGalleryItemNode;

    static {
        kge.a(-2022602059);
    }

    public static /* synthetic */ Object ipc$super(TBMultiMediaModel tBMultiMediaModel, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.detail.datasdk.model.viewmodel.main.MultiMediaModel, com.taobao.android.detail.datasdk.model.viewmodel.main.b
    public String getType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this}) : "pic_gallery";
    }

    public TBMultiMediaModel(ComponentModel componentModel, ArrayList<String> arrayList) {
        super(componentModel, arrayList);
        this.mUseNewGallery = true;
        this.mHasInitNewGallery = false;
        emu.a("com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.TBMultiMediaModel");
    }

    public TBMultiMediaModel(ComponentModel componentModel, epb epbVar) {
        super(componentModel, epbVar);
        this.mUseNewGallery = true;
        this.mHasInitNewGallery = false;
        emu.a("com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.TBMultiMediaModel");
    }

    public TBMultiMediaModel(ComponentModel componentModel, com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        super(componentModel, bVar);
        this.mUseNewGallery = true;
        this.mHasInitNewGallery = false;
        emu.a("com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.TBMultiMediaModel");
    }

    private void initConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6811c3f9", new Object[]{this});
        } else if (this.mHasInitNewGallery) {
        } else {
            try {
                this.mUseNewGallery = "true".equals(epj.h().a("android_detail", "use_new_gallery_node", "true"));
                this.mHasInitNewGallery = true;
            } catch (Throwable unused) {
            }
        }
    }

    private void initIndicatorConfig(FeatureNode featureNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71f40d4c", new Object[]{this, featureNode});
        } else if (featureNode == null) {
        } else {
            this.mNewIndicator = featureNode.newIndicator;
            try {
                this.mNewIndicator = "true".equals(epj.h().a("android_detail", "enable_simple_indicator", "true")) & this.mNewIndicator;
            } catch (Throwable unused) {
                this.mNewIndicator = false;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0081  */
    @Override // com.taobao.android.detail.datasdk.model.viewmodel.main.MultiMediaModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void initCreateByNodeBundle(com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel r12, com.taobao.android.detail.datasdk.model.datamodel.node.b r13) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.TBMultiMediaModel.initCreateByNodeBundle(com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel, com.taobao.android.detail.datasdk.model.datamodel.node.b):void");
    }

    public TBMultiMediaModel(SkuPageModel skuPageModel) {
        super(skuPageModel);
        this.mUseNewGallery = true;
        this.mHasInitNewGallery = false;
        emu.a("com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.TBMultiMediaModel");
    }

    @Override // com.taobao.android.detail.datasdk.model.viewmodel.main.MultiMediaModel, com.taobao.android.detail.datasdk.model.viewmodel.main.SubItemModel
    public int getIndex() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("cf396596", new Object[]{this})).intValue() : this.index;
    }

    @Override // com.taobao.android.detail.datasdk.model.viewmodel.main.MultiMediaModel, com.taobao.android.detail.datasdk.model.viewmodel.main.SubItemModel
    public void setIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46180fcc", new Object[]{this, new Integer(i)});
        } else {
            this.index = i;
        }
    }

    public boolean isNewIndicator() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("24488aa4", new Object[]{this})).booleanValue() : this.mNewIndicator;
    }

    public TBMultiMediaModel(IDMComponent iDMComponent, com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        super(iDMComponent, bVar);
        this.mUseNewGallery = true;
        this.mHasInitNewGallery = false;
        emu.a("com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.TBMultiMediaModel");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0081  */
    @Override // com.taobao.android.detail.datasdk.model.viewmodel.main.MultiMediaModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void ultronInitCreateByNodeBundle(com.taobao.android.ultron.common.model.IDMComponent r12, com.taobao.android.detail.datasdk.model.datamodel.node.b r13) {
        /*
            Method dump skipped, instructions count: 371
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.TBMultiMediaModel.ultronInitCreateByNodeBundle(com.taobao.android.ultron.common.model.IDMComponent, com.taobao.android.detail.datasdk.model.datamodel.node.b):void");
    }
}
