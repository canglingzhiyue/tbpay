package com.taobao.android.detail.core.detail.kit.view.widget.base.uikit.feature.features;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.utils.i;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class FeatureFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int PRIORITY_ABOVE_NORMAL = 750;
    public static final int PRIORITY_BELOW_NORMAL = 250;
    public static final int PRIORITY_HIGHEST = 1000;
    public static final int PRIORITY_LOWEST = 0;
    public static final int PRIORITY_NORMAL = 500;
    private static final HashMap<String, a> featureMap;
    private static FeatureFactory mSelf;

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f9617a;
        public int b;

        static {
            kge.a(-1465307710);
        }

        public a(int i, int i2) {
            this.f9617a = i;
            this.b = i2;
        }
    }

    static {
        kge.a(1519448821);
        featureMap = new HashMap<>();
        mSelf = new FeatureFactory();
        emu.a("com.taobao.android.detail.core.detail.kit.view.widget.base.uikit.feature.features.FeatureFactory");
        featureMap.put("ClickDrawableMaskFeature", new a(R.styleable.DetailExt_FeatureNameSpace_clickDrawableMaskFeature, 750));
        featureMap.put("skuRatioFeature", new a(R.styleable.DetailExt_FeatureNameSpace_ratioFeature, 500));
        featureMap.put("skuRoundRectFeature", new a(R.styleable.DetailExt_FeatureNameSpace_roundRectFeature, 500));
        featureMap.put("skuRoundFeature", new a(R.styleable.DetailExt_FeatureNameSpace_roundFeature, 500));
        featureMap.put("skuClickViewMaskFeature", new a(R.styleable.DetailExt_FeatureNameSpace_clickViewMaskFeature, 250));
        featureMap.put("skuBinaryPageFeature", new a(R.styleable.DetailExt_FeatureNameSpace_binaryPageFeature, 500));
        featureMap.put("skuPinnedHeaderFeature", new a(R.styleable.DetailExt_FeatureNameSpace_pinnedHeaderFeature, 500));
        featureMap.put("skuPullToRefreshFeature", new a(R.styleable.DetailExt_FeatureNameSpace_pullToRefreshFeature, 500));
        featureMap.put("skuStickyScrollFeature", new a(R.styleable.DetailExt_FeatureNameSpace_stickyScrollFeature, 500));
        featureMap.put("skuParallaxScrollFeature", new a(R.styleable.DetailExt_FeatureNameSpace_parallaxScrollFeature, 500));
        featureMap.put("skuBounceScrollFeature", new a(R.styleable.DetailExt_FeatureNameSpace_bounceScrollFeature, 500));
        featureMap.put("skuPencilShapeFeature", new a(R.styleable.DetailExt_FeatureNameSpace_pencilShapeFeature, 500));
        featureMap.put("skuAutoScaleFeature", new a(R.styleable.DetailExt_FeatureNameSpace_autoScaleFeature, 500));
        featureMap.put("skuRotateFeature", new a(R.styleable.DetailExt_FeatureNameSpace_rotateFeature, 500));
        featureMap.put("skuImagesavefeature", new a(R.styleable.DetailExt_FeatureNameSpace_imagesavefeature, 500));
        featureMap.put("skuCellAnimatorFeature", new a(R.styleable.DetailExt_FeatureNameSpace_cellAnimatorFeature, 500));
        featureMap.put("skuRecyclerskuCellAnimatorFeature", new a(R.styleable.DetailExt_FeatureNameSpace_recyclerCellAnimatorFeature, 500));
        featureMap.put("skuDragToRefreshFeature", new a(R.styleable.DetailExt_FeatureNameSpace_dragToRefreshFeature, 500));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends View> ArrayList<com.taobao.android.detail.core.detail.kit.view.widget.base.uikit.feature.features.a<? super T>> creator(Context context, TypedArray typedArray) {
        ArrayList<com.taobao.android.detail.core.detail.kit.view.widget.base.uikit.feature.features.a<? super T>> arrayList = (ArrayList<com.taobao.android.detail.core.detail.kit.view.widget.base.uikit.feature.features.a<? super T>>) new ArrayList();
        for (Map.Entry<String, a> entry : featureMap.entrySet()) {
            String key = entry.getKey();
            int i = entry.getValue().f9617a;
            if (i >= 0 && typedArray.getBoolean(i, false)) {
                try {
                    arrayList.add(Class.forName(mSelf.getClass().getPackage().getName() + "." + key).newInstance());
                } catch (ClassNotFoundException e) {
                    i.a("FeatureFactory", "Android UiKit can't find feature by id", e);
                } catch (Exception e2) {
                    i.a("FeatureFactory", "exception", e2);
                }
            }
        }
        return arrayList;
    }

    public static int getFeaturePriority(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("23271408", new Object[]{str})).intValue();
        }
        if (!featureMap.containsKey(str)) {
            return 0;
        }
        return featureMap.get(str).b;
    }
}
