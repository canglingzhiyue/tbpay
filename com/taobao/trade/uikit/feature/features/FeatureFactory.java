package com.taobao.trade.uikit.feature.features;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes9.dex */
public class FeatureFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int PRIORITY_ABOVE_NORMAL = 750;
    public static final int PRIORITY_BELOW_NORMAL = 250;
    public static final int PRIORITY_HIGHEST = 1000;
    public static final int PRIORITY_LOWEST = 0;
    public static final int PRIORITY_NORMAL = 500;
    private static final HashMap<String, a> featureMap;
    private static FeatureFactory mSelf;

    /* loaded from: classes9.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f22993a;
        public int b;

        static {
            kge.a(-699928555);
        }

        public a(int i, int i2) {
            this.f22993a = i;
            this.b = i2;
        }
    }

    static {
        kge.a(-2093717886);
        featureMap = new HashMap<>();
        mSelf = new FeatureFactory();
        featureMap.put("ClickDrawableMaskFeature", new a(R.styleable.TradeFeatureNameSpace_trade_uik_clickDrawableMaskFeature, 750));
        featureMap.put("RatioFeature", new a(R.styleable.TradeFeatureNameSpace_trade_uik_ratioFeature, 500));
        featureMap.put("RoundRectFeature", new a(R.styleable.TradeFeatureNameSpace_trade_uik_roundRectFeature, 500));
        featureMap.put("RoundFeature", new a(R.styleable.TradeFeatureNameSpace_trade_uik_roundFeature, 500));
        featureMap.put("ClickViewMaskFeature", new a(R.styleable.TradeFeatureNameSpace_trade_uik_clickViewMaskFeature, 250));
        featureMap.put("BinaryPageFeature", new a(R.styleable.TradeFeatureNameSpace_trade_uik_binaryPageFeature, 500));
        featureMap.put("PinnedHeaderFeature", new a(R.styleable.TradeFeatureNameSpace_trade_uik_pinnedHeaderFeature, 500));
        featureMap.put("PullToRefreshFeature", new a(R.styleable.TradeFeatureNameSpace_trade_uik_pullToRefreshFeature, 500));
        featureMap.put("StickyScrollFeature", new a(R.styleable.TradeFeatureNameSpace_trade_uik_stickyScrollFeature, 500));
        featureMap.put("ParallaxScrollFeature", new a(R.styleable.TradeFeatureNameSpace_trade_uik_parallaxScrollFeature, 500));
        featureMap.put("BounceScrollFeature", new a(R.styleable.TradeFeatureNameSpace_trade_uik_bounceScrollFeature, 500));
        featureMap.put("PencilShapeFeature", new a(R.styleable.TradeFeatureNameSpace_trade_uik_pencilShapeFeature, 500));
        featureMap.put("AutoScaleFeature", new a(R.styleable.TradeFeatureNameSpace_trade_uik_autoScaleFeature, 500));
        featureMap.put("RotateFeature", new a(R.styleable.TradeFeatureNameSpace_trade_uik_rotateFeature, 500));
        featureMap.put("ImageSaveFeature", new a(R.styleable.TradeFeatureNameSpace_trade_uik_imagesavefeature, 500));
        featureMap.put("CellAnimatorFeature", new a(R.styleable.TradeFeatureNameSpace_trade_uik_cellAnimatorFeature, 500));
        featureMap.put("RecyclerCellAnimatorFeature", new a(R.styleable.TradeFeatureNameSpace_trade_uik_recyclerCellAnimatorFeature, 500));
        featureMap.put("DragToRefreshFeature", new a(R.styleable.TradeFeatureNameSpace_trade_uik_dragToRefreshFeature, 500));
        featureMap.put("ImageShapeFeature", new a(R.styleable.TradeFeatureNameSpace_trade_uik_imageShapeFeature, 500));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends View> ArrayList<com.taobao.trade.uikit.feature.features.a<? super T>> creator(Context context, TypedArray typedArray) {
        ArrayList<com.taobao.trade.uikit.feature.features.a<? super T>> arrayList = (ArrayList<com.taobao.trade.uikit.feature.features.a<? super T>>) new ArrayList();
        for (Map.Entry<String, a> entry : featureMap.entrySet()) {
            String key = entry.getKey();
            int i = entry.getValue().f22993a;
            if (i >= 0 && typedArray.getBoolean(i, false)) {
                try {
                    arrayList.add(Class.forName(mSelf.getClass().getPackage().getName() + "." + key).newInstance());
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                } catch (Exception e2) {
                    e2.printStackTrace();
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
