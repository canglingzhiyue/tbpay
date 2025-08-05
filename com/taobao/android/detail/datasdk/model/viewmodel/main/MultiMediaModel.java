package com.taobao.android.detail.datasdk.model.viewmodel.main;

import android.app.Application;
import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.event.video.GallerySourceType;
import com.taobao.android.detail.datasdk.model.datamodel.node.FeatureNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.ItemNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.ResourceNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.SellerNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.SkuBaseNode;
import com.taobao.android.detail.datasdk.model.datamodel.sku.SkuPageModel;
import com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.bsq;
import tb.epb;
import tb.eqb;
import tb.eqg;
import tb.kge;

/* loaded from: classes4.dex */
public class MultiMediaModel extends b implements SubItemModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ArrayList<SubItemModel> childModels;
    public ArrayList<Integer> children;
    public int currentIndex;
    public double heightRatio;
    public int index;
    public boolean isFromDetailMain;
    public boolean isPopupMode;
    public String itemId;
    public Application mApp;
    public boolean needIndex;
    public boolean needVideoFlow;
    public com.taobao.android.detail.datasdk.model.datamodel.node.b nodeBundle;
    public GallerySourceType popGallerySource;
    public View popupParentView;
    public View popupView;
    public String sellerId;
    public String shopId;
    public boolean singlePopupMode;
    public int size;
    public ResourceNode.b timeTunnel;
    public Map<String, String> trackEventParams;

    static {
        kge.a(-1137702365);
        kge.a(1162456369);
    }

    @Override // com.taobao.android.detail.datasdk.model.viewmodel.main.b
    public String getFullClassName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7324d71b", new Object[]{this}) : "com.taobao.android.detail.datasdk.model.viewmodel.main.MultiMediaModel";
    }

    @Override // com.taobao.android.detail.datasdk.model.viewmodel.main.b
    public String getType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this}) : "pic_gallery";
    }

    public MultiMediaModel(ComponentModel componentModel, ArrayList<String> arrayList) {
        super(componentModel);
        this.childModels = new ArrayList<>();
        this.children = new ArrayList<>();
        this.size = 0;
        this.needIndex = true;
        this.currentIndex = 0;
        this.isFromDetailMain = false;
        this.isPopupMode = false;
        this.needVideoFlow = false;
        this.singlePopupMode = false;
        initUserForOnlyPopup(componentModel, arrayList);
    }

    public void initUserForOnlyPopup(ComponentModel componentModel, ArrayList<String> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bfc0d63", new Object[]{this, componentModel, arrayList});
            return;
        }
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            NormalImageModel normalImageModel = new NormalImageModel();
            normalImageModel.imageUrl = it.next();
            normalImageModel.parentModel = this;
            addChild(normalImageModel, 1004);
        }
    }

    public MultiMediaModel(ComponentModel componentModel, epb epbVar) {
        super(componentModel);
        this.childModels = new ArrayList<>();
        this.children = new ArrayList<>();
        this.size = 0;
        this.needIndex = true;
        this.currentIndex = 0;
        this.isFromDetailMain = false;
        this.isPopupMode = false;
        this.needVideoFlow = false;
        this.singlePopupMode = false;
        initPreset(componentModel, epbVar);
    }

    public void initPreset(ComponentModel componentModel, epb epbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50764323", new Object[]{this, componentModel, epbVar});
            return;
        }
        NormalImageModel normalImageModel = new NormalImageModel();
        normalImageModel.imageUrl = epbVar.f27502a;
        normalImageModel.parentModel = this;
        addChild(normalImageModel, 1004);
        BounceImageModel bounceImageModel = new BounceImageModel();
        bounceImageModel.parentModel = this;
        addChild(bounceImageModel, 1005);
    }

    public MultiMediaModel(ComponentModel componentModel, com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        super(componentModel);
        this.childModels = new ArrayList<>();
        this.children = new ArrayList<>();
        this.size = 0;
        this.needIndex = true;
        this.currentIndex = 0;
        this.isFromDetailMain = false;
        this.isPopupMode = false;
        this.needVideoFlow = false;
        this.singlePopupMode = false;
        initCreateByNodeBundle(componentModel, bVar);
    }

    public void initCreateByNodeBundle(ComponentModel componentModel, com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3a992c", new Object[]{this, componentModel, bVar});
            return;
        }
        FeatureNode f = eqb.f(bVar);
        ItemNode c = eqb.c(bVar);
        ResourceNode l = eqb.l(bVar);
        SellerNode d = eqb.d(bVar);
        this.needVideoFlow = f.needVideoFlow;
        this.timeTunnel = l.entrances.get(ResourceNode.MAP_KEY_TIMETUNNEL);
        this.itemId = c.itemId;
        this.nodeBundle = bVar;
        Iterator<String> it = c.images.iterator();
        while (it.hasNext()) {
            NormalImageModel normalImageModel = new NormalImageModel();
            normalImageModel.imageUrl = it.next();
            normalImageModel.parentModel = this;
            addChild(normalImageModel, 1004);
        }
        BounceImageModel bounceImageModel = new BounceImageModel();
        bounceImageModel.parentModel = this;
        addChild(bounceImageModel, 1005);
        try {
            this.heightRatio = componentModel.mapping.getDouble(bsq.KEY_HEIGHT_RATIO).doubleValue();
        } catch (Throwable unused) {
        }
        this.sellerId = d.userId;
        this.shopId = d.shopId;
        this.trackEventParams = bVar.d();
    }

    public MultiMediaModel(SkuPageModel skuPageModel) {
        super(new ComponentModel());
        this.childModels = new ArrayList<>();
        this.children = new ArrayList<>();
        this.size = 0;
        this.needIndex = true;
        this.currentIndex = 0;
        this.isFromDetailMain = false;
        this.isPopupMode = false;
        this.needVideoFlow = false;
        this.singlePopupMode = false;
        initCreateByNewSkuModel(skuPageModel);
    }

    public void initCreateByNewSkuModel(SkuPageModel skuPageModel) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79d7f650", new Object[]{this, skuPageModel});
            return;
        }
        this.needIndex = false;
        List<SkuBaseNode.SkuProperty> skuProps = skuPageModel.getSkuProps();
        if (eqg.a(skuProps)) {
            return;
        }
        for (SkuBaseNode.SkuProperty skuProperty : skuProps) {
            Iterator<SkuBaseNode.SkuPropertyValue> it = skuProperty.values.iterator();
            while (it.hasNext()) {
                SkuBaseNode.SkuPropertyValue next = it.next();
                if (!TextUtils.isEmpty(next.image)) {
                    String str = next.image;
                    String str2 = TextUtils.isEmpty(next.alias) ? next.name : next.alias;
                    NormalImageModel normalImageModel = new NormalImageModel();
                    normalImageModel.imageUrl = str;
                    normalImageModel.skuBottomText = str2;
                    normalImageModel.parentModel = this;
                    if (i == 0) {
                        normalImageModel.skuFirstPhotoFlag = true;
                    }
                    addChild(normalImageModel, 1004);
                    i++;
                }
            }
        }
    }

    public void addChild(SubItemModel subItemModel, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c40d715", new Object[]{this, subItemModel, new Integer(i)});
            return;
        }
        subItemModel.setIndex(this.size);
        this.childModels.add(subItemModel);
        this.children.add(Integer.valueOf(i));
        this.size++;
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

    public MultiMediaModel(IDMComponent iDMComponent, com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        super(iDMComponent);
        this.childModels = new ArrayList<>();
        this.children = new ArrayList<>();
        this.size = 0;
        this.needIndex = true;
        this.currentIndex = 0;
        this.isFromDetailMain = false;
        this.isPopupMode = false;
        this.needVideoFlow = false;
        this.singlePopupMode = false;
        ultronInitCreateByNodeBundle(iDMComponent, bVar);
    }

    public void ultronInitCreateByNodeBundle(IDMComponent iDMComponent, com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c130b96c", new Object[]{this, iDMComponent, bVar});
            return;
        }
        FeatureNode f = eqb.f(bVar);
        ItemNode c = eqb.c(bVar);
        ResourceNode l = eqb.l(bVar);
        SellerNode d = eqb.d(bVar);
        this.needVideoFlow = f.needVideoFlow;
        this.timeTunnel = l.entrances.get(ResourceNode.MAP_KEY_TIMETUNNEL);
        this.itemId = c.itemId;
        this.nodeBundle = bVar;
        Iterator<String> it = c.images.iterator();
        while (it.hasNext()) {
            NormalImageModel normalImageModel = new NormalImageModel();
            normalImageModel.imageUrl = it.next();
            normalImageModel.parentModel = this;
            addChild(normalImageModel, 1004);
        }
        BounceImageModel bounceImageModel = new BounceImageModel();
        bounceImageModel.parentModel = this;
        addChild(bounceImageModel, 1005);
        try {
            this.heightRatio = iDMComponent.getFields().getDouble(bsq.KEY_HEIGHT_RATIO).doubleValue();
        } catch (Throwable unused) {
        }
        this.sellerId = d.userId;
        this.shopId = d.shopId;
        this.trackEventParams = bVar.d();
    }
}
