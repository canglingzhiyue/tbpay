package tb;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class etq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final HashMap<String, a> f27569a;
    private static etq b;

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f27570a;
        public int b;

        static {
            kge.a(-2015495152);
        }

        public a(int i, int i2) {
            this.f27570a = i;
            this.b = i2;
        }
    }

    static {
        kge.a(-57800345);
        f27569a = new HashMap<>();
        b = new etq();
        tpc.a("com.taobao.android.detail.kit.view.widget.base.uikit.feature.features.FeatureFactory");
        f27569a.put("ClickDrawableMaskFeature", new a(R.styleable.DetailExt_FeatureNameSpace_clickDrawableMaskFeature, 750));
        f27569a.put("skuRatioFeature", new a(R.styleable.DetailExt_FeatureNameSpace_ratioFeature, 500));
        f27569a.put("skuRoundRectFeature", new a(R.styleable.DetailExt_FeatureNameSpace_roundRectFeature, 500));
        f27569a.put("skuRoundFeature", new a(R.styleable.DetailExt_FeatureNameSpace_roundFeature, 500));
        f27569a.put("skuClickViewMaskFeature", new a(R.styleable.DetailExt_FeatureNameSpace_clickViewMaskFeature, 250));
        f27569a.put("skuBinaryPageFeature", new a(R.styleable.DetailExt_FeatureNameSpace_binaryPageFeature, 500));
        f27569a.put("skuPinnedHeaderFeature", new a(R.styleable.DetailExt_FeatureNameSpace_pinnedHeaderFeature, 500));
        f27569a.put("skuPullToRefreshFeature", new a(R.styleable.DetailExt_FeatureNameSpace_pullToRefreshFeature, 500));
        f27569a.put("skuStickyScrollFeature", new a(R.styleable.DetailExt_FeatureNameSpace_stickyScrollFeature, 500));
        f27569a.put("skuParallaxScrollFeature", new a(R.styleable.DetailExt_FeatureNameSpace_parallaxScrollFeature, 500));
        f27569a.put("skuBounceScrollFeature", new a(R.styleable.DetailExt_FeatureNameSpace_bounceScrollFeature, 500));
        f27569a.put("skuPencilShapeFeature", new a(R.styleable.DetailExt_FeatureNameSpace_pencilShapeFeature, 500));
        f27569a.put("skuAutoScaleFeature", new a(R.styleable.DetailExt_FeatureNameSpace_autoScaleFeature, 500));
        f27569a.put("skuRotateFeature", new a(R.styleable.DetailExt_FeatureNameSpace_rotateFeature, 500));
        f27569a.put("skuImagesavefeature", new a(R.styleable.DetailExt_FeatureNameSpace_imagesavefeature, 500));
        f27569a.put("skuCellAnimatorFeature", new a(R.styleable.DetailExt_FeatureNameSpace_cellAnimatorFeature, 500));
        f27569a.put("skuRecyclerskuCellAnimatorFeature", new a(R.styleable.DetailExt_FeatureNameSpace_recyclerCellAnimatorFeature, 500));
        f27569a.put("skuDragToRefreshFeature", new a(R.styleable.DetailExt_FeatureNameSpace_dragToRefreshFeature, 500));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends View> ArrayList<etp<? super T>> a(Context context, TypedArray typedArray) {
        ArrayList<etp<? super T>> arrayList = (ArrayList<etp<? super T>>) new ArrayList();
        for (Map.Entry<String, a> entry : f27569a.entrySet()) {
            String key = entry.getKey();
            int i = entry.getValue().f27570a;
            if (i >= 0 && typedArray.getBoolean(i, false)) {
                try {
                    arrayList.add(Class.forName(b.getClass().getPackage().getName() + "." + key).newInstance());
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

    public static int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{str})).intValue();
        }
        if (!f27569a.containsKey(str)) {
            return 0;
        }
        return f27569a.get(str).b;
    }
}
