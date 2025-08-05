package com.taobao.tao.sku.widget.base.uikit.feature.features;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import tb.eva;
import tb.kge;

/* loaded from: classes8.dex */
public class FeatureFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int PRIORITY_ABOVE_NORMAL = 750;
    public static final int PRIORITY_BELOW_NORMAL = 250;
    public static final int PRIORITY_HIGHEST = 1000;
    public static final int PRIORITY_LOWEST = 0;
    public static final int PRIORITY_NORMAL = 500;
    private static final HashMap<String, a> featureMap;
    private static FeatureFactory mSelf;

    /* loaded from: classes8.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f21107a;
        public int b;

        static {
            kge.a(-1596466180);
        }

        public a(int i, int i2) {
            this.f21107a = i;
            this.b = i2;
        }
    }

    static {
        kge.a(-478092037);
        featureMap = new HashMap<>();
        mSelf = new FeatureFactory();
        featureMap.put("skuClickDrawableMaskFeature", new a(R.styleable.DetailExt_FeatureNameSpace_skuClickDrawableMaskFeature, 750));
        featureMap.put("skuRatioFeature", new a(R.styleable.DetailExt_FeatureNameSpace_skuRatioFeature, 500));
        featureMap.put("skuRoundRectFeature", new a(R.styleable.DetailExt_FeatureNameSpace_skuRoundRectFeature, 500));
        featureMap.put("skuRoundFeature", new a(R.styleable.DetailExt_FeatureNameSpace_skuRoundFeature, 500));
        featureMap.put("skuClickViewMaskFeature", new a(R.styleable.DetailExt_FeatureNameSpace_skuClickViewMaskFeature, 250));
        featureMap.put("skuBinaryPageFeature", new a(R.styleable.DetailExt_FeatureNameSpace_skuBinaryPageFeature, 500));
        featureMap.put("skuPinnedHeaderFeature", new a(R.styleable.DetailExt_FeatureNameSpace_skuPinnedHeaderFeature, 500));
        featureMap.put("skuPullToRefreshFeature", new a(R.styleable.DetailExt_FeatureNameSpace_skuPullToRefreshFeature, 500));
        featureMap.put("skuStickyScrollFeature", new a(R.styleable.DetailExt_FeatureNameSpace_skuStickyScrollFeature, 500));
        featureMap.put("skuParallaxScrollFeature", new a(R.styleable.DetailExt_FeatureNameSpace_skuParallaxScrollFeature, 500));
        featureMap.put("skuBounceScrollFeature", new a(R.styleable.DetailExt_FeatureNameSpace_skuBounceScrollFeature, 500));
        featureMap.put("skuPencilShapeFeature", new a(R.styleable.DetailExt_FeatureNameSpace_skuPencilShapeFeature, 500));
        featureMap.put("skuAutoScaleFeature", new a(R.styleable.DetailExt_FeatureNameSpace_skuAutoScaleFeature, 500));
        featureMap.put("skuRotateFeature", new a(R.styleable.DetailExt_FeatureNameSpace_skuRotateFeature, 500));
        featureMap.put("skuImagesavefeature", new a(R.styleable.DetailExt_FeatureNameSpace_skuImagesavefeature, 500));
        featureMap.put("skuCellAnimatorFeature", new a(R.styleable.DetailExt_FeatureNameSpace_skuCellAnimatorFeature, 500));
        featureMap.put("skuRecyclerskuCellAnimatorFeature", new a(R.styleable.DetailExt_FeatureNameSpace_skuRecyclerskuCellAnimatorFeature, 500));
        featureMap.put("skuDragToRefreshFeature", new a(R.styleable.DetailExt_FeatureNameSpace_skuDragToRefreshFeature, 500));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends View> ArrayList<com.taobao.tao.sku.widget.base.uikit.feature.features.a<? super T>> creator(Context context, TypedArray typedArray) {
        ArrayList<com.taobao.tao.sku.widget.base.uikit.feature.features.a<? super T>> arrayList = (ArrayList<com.taobao.tao.sku.widget.base.uikit.feature.features.a<? super T>>) new ArrayList();
        for (Map.Entry<String, a> entry : featureMap.entrySet()) {
            String key = entry.getKey();
            int i = entry.getValue().f21107a;
            if (i >= 0 && typedArray.getBoolean(i, false)) {
                try {
                    arrayList.add(Class.forName(mSelf.getClass().getPackage().getName() + "." + key).newInstance());
                } catch (ClassNotFoundException e) {
                    eva.a("Android UiKit", "can't find feature by id");
                    eva.a(e);
                } catch (Exception e2) {
                    eva.a(e2);
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
