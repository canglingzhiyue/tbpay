package com.taobao.android.detail.datasdk.model.viewmodel.main;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class DivaBeautyModel implements SubItemModel, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String animationSrc;
    private List<SkuItem> beautyProps;
    public SkuItem currentItem;
    public String dataUrl;
    public String fileId;
    public int index;
    public MultiMediaModel parentModel;
    public String thumbnailUrl;
    public int initialCount = -1;
    public int increaseCount = 0;

    /* loaded from: classes4.dex */
    public class SkuItem implements Serializable {
        public String animationSrc;
        public String color;
        public String icon;
        public String id;
        public Map<String, String> images;
        public String name;

        static {
            kge.a(977766766);
            kge.a(1028243835);
        }

        public SkuItem() {
        }
    }

    static {
        kge.a(-137802142);
        kge.a(1162456369);
        kge.a(1028243835);
    }

    public DivaBeautyModel() {
        emu.a("com.taobao.android.detail.datasdk.model.viewmodel.main.DivaBeautyModel");
    }

    public List<SkuItem> getBeautyProps() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("5f39d102", new Object[]{this}) : this.beautyProps;
    }

    public void setBeautyProps(List<SkuItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4037970a", new Object[]{this, list});
            return;
        }
        this.beautyProps = list;
        List<SkuItem> list2 = this.beautyProps;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        this.currentItem = this.beautyProps.get(0);
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
