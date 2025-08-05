package com.taobao.android.detail.ttdetail.widget.listview.feature.features;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.utils.i;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes5.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final HashMap<String, a> f11035a;
    private static b b;

    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f11036a;
        public int b;

        static {
            kge.a(1606358974);
        }

        public a(int i, int i2) {
            this.f11036a = i;
            this.b = i2;
        }
    }

    static {
        kge.a(-896962951);
        f11035a = new HashMap<>();
        b = new b();
        f11035a.put("ClickDrawableMaskFeature", new a(R.styleable.TTDetailExt_FeatureNameSpace_clickDrawableMaskFeature, 750));
        f11035a.put("skuRatioFeature", new a(R.styleable.TTDetailExt_FeatureNameSpace_ratioFeature, 500));
        f11035a.put("skuRoundRectFeature", new a(R.styleable.TTDetailExt_FeatureNameSpace_roundRectFeature, 500));
        f11035a.put("skuRoundFeature", new a(R.styleable.TTDetailExt_FeatureNameSpace_roundFeature, 500));
        f11035a.put("skuClickViewMaskFeature", new a(R.styleable.TTDetailExt_FeatureNameSpace_clickViewMaskFeature, 250));
        f11035a.put("skuBinaryPageFeature", new a(R.styleable.TTDetailExt_FeatureNameSpace_binaryPageFeature, 500));
        f11035a.put("skuPinnedHeaderFeature", new a(R.styleable.TTDetailExt_FeatureNameSpace_pinnedHeaderFeature, 500));
        f11035a.put("skuPullToRefreshFeature", new a(R.styleable.TTDetailExt_FeatureNameSpace_pullToRefreshFeature, 500));
        f11035a.put("skuStickyScrollFeature", new a(R.styleable.TTDetailExt_FeatureNameSpace_stickyScrollFeature, 500));
        f11035a.put("skuParallaxScrollFeature", new a(R.styleable.TTDetailExt_FeatureNameSpace_parallaxScrollFeature, 500));
        f11035a.put("skuBounceScrollFeature", new a(R.styleable.TTDetailExt_FeatureNameSpace_bounceScrollFeature, 500));
        f11035a.put("skuPencilShapeFeature", new a(R.styleable.TTDetailExt_FeatureNameSpace_pencilShapeFeature, 500));
        f11035a.put("skuAutoScaleFeature", new a(R.styleable.TTDetailExt_FeatureNameSpace_autoScaleFeature, 500));
        f11035a.put("skuRotateFeature", new a(R.styleable.TTDetailExt_FeatureNameSpace_rotateFeature, 500));
        f11035a.put("skuImagesavefeature", new a(R.styleable.TTDetailExt_FeatureNameSpace_imagesavefeature, 500));
        f11035a.put("skuCellAnimatorFeature", new a(R.styleable.TTDetailExt_FeatureNameSpace_cellAnimatorFeature, 500));
        f11035a.put("skuRecyclerskuCellAnimatorFeature", new a(R.styleable.TTDetailExt_FeatureNameSpace_recyclerCellAnimatorFeature, 500));
        f11035a.put("skuDragToRefreshFeature", new a(R.styleable.TTDetailExt_FeatureNameSpace_dragToRefreshFeature, 500));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends View> ArrayList<com.taobao.android.detail.ttdetail.widget.listview.feature.features.a<? super T>> a(Context context, TypedArray typedArray) {
        ArrayList<com.taobao.android.detail.ttdetail.widget.listview.feature.features.a<? super T>> arrayList = (ArrayList<com.taobao.android.detail.ttdetail.widget.listview.feature.features.a<? super T>>) new ArrayList();
        for (Map.Entry<String, a> entry : f11035a.entrySet()) {
            String key = entry.getKey();
            int i = entry.getValue().f11036a;
            if (i >= 0 && typedArray.getBoolean(i, false)) {
                try {
                    arrayList.add(Class.forName(b.getClass().getPackage().getName() + "." + key).newInstance());
                } catch (ClassNotFoundException e) {
                    i.a("FeatureFactory", "Android UiKit can't find feature by id", e);
                } catch (Exception e2) {
                    i.a("FeatureFactory", "exception", e2);
                }
            }
        }
        return arrayList;
    }

    public static int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{str})).intValue();
        }
        if (!f11035a.containsKey(str)) {
            return 0;
        }
        return f11035a.get(str).b;
    }
}
