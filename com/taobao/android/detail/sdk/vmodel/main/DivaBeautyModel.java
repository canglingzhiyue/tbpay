package com.taobao.android.detail.sdk.vmodel.main;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import tb.kge;
import tb.tpc;

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
            kge.a(2076363823);
            kge.a(1028243835);
        }

        public SkuItem() {
        }
    }

    static {
        kge.a(-1410342365);
        kge.a(1394383120);
        kge.a(1028243835);
    }

    public DivaBeautyModel() {
        tpc.a("com.taobao.android.detail.sdk.vmodel.main.DivaBeautyModel");
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

    public List<SkuItem> getBeautyProps() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("5f39d102", new Object[]{this}) : this.beautyProps;
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
