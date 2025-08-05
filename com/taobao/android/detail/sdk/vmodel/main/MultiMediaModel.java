package com.taobao.android.detail.sdk.vmodel.main;

import android.app.Application;
import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.event.video.GallerySourceType;
import com.taobao.android.detail.sdk.model.node.NodeBundle;
import com.taobao.android.detail.sdk.model.node.ResourceNode;
import com.taobao.android.detail.sdk.model.node.SkuBaseNode;
import com.taobao.android.detail.sdk.model.template.ComponentModel;
import com.taobao.tao.newsku.NewSkuModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.ewl;
import tb.ewu;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class MultiMediaModel extends MainViewModel implements SubItemModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ArrayList<SubItemModel> childModels;
    public ArrayList<Integer> children;
    public int currentIndex;
    public double heightRatio;
    private int index;
    public boolean isFromDetailMain;
    public boolean isPopupMode;
    public String itemId;
    public Application mApp;
    public boolean needIndex;
    public boolean needVideoFlow;
    public NodeBundle nodeBundle;
    public GallerySourceType popGallerySource;
    public View popupParentView;
    public View popupView;
    public String sellerId;
    public String shopId;
    public boolean singlePopupMode;
    public int size;
    public ResourceNode.Entry timeTunnel;
    public Map<String, String> trackEventParams;

    static {
        kge.a(1884724708);
        kge.a(1394383120);
    }

    @Override // com.taobao.android.detail.sdk.vmodel.main.MainViewModel
    public int getViewModelType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7e14bda2", new Object[]{this})).intValue();
        }
        return 30001;
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
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            t tVar = new t();
            tVar.f10444a = it.next();
            tVar.b = this;
            addChild(tVar, 1004);
        }
        tpc.a("com.taobao.android.detail.sdk.vmodel.main.MultiMediaModel");
    }

    public MultiMediaModel(ComponentModel componentModel, ewl ewlVar) {
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
        tpc.a("com.taobao.android.detail.sdk.vmodel.main.MultiMediaModel");
        t tVar = new t();
        tVar.f10444a = ewlVar.f27608a;
        tVar.b = this;
        addChild(tVar, 1004);
        b bVar = new b();
        bVar.f10421a = this;
        addChild(bVar, 1005);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MultiMediaModel(com.taobao.android.detail.sdk.model.template.ComponentModel r8, com.taobao.android.detail.sdk.model.node.NodeBundle r9) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail.sdk.vmodel.main.MultiMediaModel.<init>(com.taobao.android.detail.sdk.model.template.ComponentModel, com.taobao.android.detail.sdk.model.node.NodeBundle):void");
    }

    public MultiMediaModel(NewSkuModel newSkuModel) {
        super(new ComponentModel());
        this.childModels = new ArrayList<>();
        this.children = new ArrayList<>();
        int i = 0;
        this.size = 0;
        this.needIndex = true;
        this.currentIndex = 0;
        this.isFromDetailMain = false;
        this.isPopupMode = false;
        this.needVideoFlow = false;
        this.singlePopupMode = false;
        tpc.a("com.taobao.android.detail.sdk.vmodel.main.MultiMediaModel");
        this.needIndex = false;
        List<SkuBaseNode.SkuProperty> skuProps = newSkuModel.getSkuProps();
        if (!ewu.a(skuProps)) {
            for (SkuBaseNode.SkuProperty skuProperty : skuProps) {
                Iterator<SkuBaseNode.SkuPropertyValue> it = skuProperty.values.iterator();
                while (it.hasNext()) {
                    SkuBaseNode.SkuPropertyValue next = it.next();
                    if (!TextUtils.isEmpty(next.image)) {
                        String str = next.image;
                        String str2 = TextUtils.isEmpty(next.alias) ? next.name : next.alias;
                        t tVar = new t();
                        tVar.f10444a = str;
                        tVar.d = str2;
                        tVar.b = this;
                        if (i == 0) {
                            tVar.f = true;
                        }
                        addChild(tVar, 1004);
                        i++;
                    }
                }
            }
        }
    }

    private void addChild(SubItemModel subItemModel, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b3e8a82", new Object[]{this, subItemModel, new Integer(i)});
            return;
        }
        subItemModel.setIndex(this.size);
        this.childModels.add(subItemModel);
        this.children.add(Integer.valueOf(i));
        this.size++;
    }

    @Override // com.taobao.android.detail.sdk.vmodel.main.SubItemModel
    public int getIndex() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("cf396596", new Object[]{this})).intValue() : this.index;
    }

    @Override // com.taobao.android.detail.sdk.vmodel.main.SubItemModel
    public void setIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46180fcc", new Object[]{this, new Integer(i)});
        } else {
            this.index = i;
        }
    }
}
