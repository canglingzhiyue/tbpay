package com.taobao.homepage.view.widgets.bgcontainer;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public class BGConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String animationImg;
    public String animationType;
    public String beginColor;
    public float bgEndOffset;
    public String bgEndSection;
    public String bottomMaskImg;
    public String darkBeginColor;
    public String darkEndColor;
    public String degradeAnimationImg;
    public String endColor;
    public String maskImg;
    public String topMaskImg;
    public boolean cutBanner = false;
    public boolean clearSearchBar = false;
    public int animationTime = 16000;
    public int animationCount = -1;
    public float centerY = 320.0f;
    public float animationHeight = 567.5f;
    public float maskHeight = 275.0f;
    public float maskTop = 325.5f;
    public float topMaskHotSearch = 30.0f;
    public float bottomMaskOffset = 0.0f;
    public float bottomMaskHeight = 0.0f;

    static {
        kge.a(38810070);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            BGConfig bGConfig = (BGConfig) obj;
            if (Float.compare(bGConfig.bgEndOffset, this.bgEndOffset) == 0 && this.cutBanner == bGConfig.cutBanner && this.clearSearchBar == bGConfig.clearSearchBar && this.animationTime == bGConfig.animationTime && this.animationCount == bGConfig.animationCount && Float.compare(bGConfig.centerY, this.centerY) == 0 && Float.compare(bGConfig.animationHeight, this.animationHeight) == 0 && Float.compare(bGConfig.maskHeight, this.maskHeight) == 0 && Float.compare(bGConfig.maskTop, this.maskTop) == 0 && Float.compare(bGConfig.topMaskHotSearch, this.topMaskHotSearch) == 0 && Float.compare(bGConfig.bottomMaskOffset, this.bottomMaskOffset) == 0 && Float.compare(bGConfig.bottomMaskHeight, this.bottomMaskHeight) == 0 && objectEquals(this.beginColor, bGConfig.beginColor) && objectEquals(this.endColor, bGConfig.endColor) && objectEquals(this.bgEndSection, bGConfig.bgEndSection) && objectEquals(this.darkBeginColor, bGConfig.darkBeginColor) && objectEquals(this.darkEndColor, bGConfig.darkEndColor) && objectEquals(this.animationType, bGConfig.animationType) && objectEquals(this.animationImg, bGConfig.animationImg) && objectEquals(this.degradeAnimationImg, bGConfig.degradeAnimationImg) && objectEquals(this.maskImg, bGConfig.maskImg) && objectEquals(this.topMaskImg, bGConfig.topMaskImg) && objectEquals(this.bottomMaskImg, bGConfig.bottomMaskImg)) {
                return true;
            }
        }
        return false;
    }

    public static boolean objectEquals(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7eb0dba1", new Object[]{obj, obj2})).booleanValue() : obj == obj2 || (obj != null && obj.equals(obj2));
    }
}
