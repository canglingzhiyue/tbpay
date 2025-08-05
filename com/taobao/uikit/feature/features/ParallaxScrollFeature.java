package com.taobao.uikit.feature.features;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.feature.callback.ScrollCallback;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import tb.kge;

/* loaded from: classes9.dex */
public class ParallaxScrollFeature extends AbsFeature<ScrollView> implements ScrollCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static boolean isAPI11;
    private int mParallaxNum = 1;
    private float mInnerParallaxFactor = 1.8f;
    private float mParallaxFactor = 1.8f;
    private ArrayList<ParallaxView> mParallaxViews = new ArrayList<>();

    public static /* synthetic */ Object ipc$super(ParallaxScrollFeature parallaxScrollFeature, String str, Object... objArr) {
        if (str.hashCode() == 1336372353) {
            super.setHost((ParallaxScrollFeature) ((View) objArr[0]));
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.uikit.feature.callback.ScrollCallback
    public void afterComputeScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("559935ef", new Object[]{this});
        }
    }

    @Override // com.taobao.uikit.feature.callback.ScrollCallback
    public void beforeComputeScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6c216ac", new Object[]{this});
        }
    }

    @Override // com.taobao.uikit.feature.callback.ScrollCallback
    public void beforeOnScrollChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b65ccad0", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
    }

    public static /* synthetic */ void access$000(ParallaxScrollFeature parallaxScrollFeature) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63afbd11", new Object[]{parallaxScrollFeature});
        } else {
            parallaxScrollFeature.makeViewsParallax();
        }
    }

    public static /* synthetic */ boolean access$100() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f1bc42bc", new Object[0])).booleanValue() : isAPI11;
    }

    static {
        kge.a(661936505);
        kge.a(1628629155);
        isAPI11 = Build.VERSION.SDK_INT >= 11;
    }

    @Override // com.taobao.uikit.feature.features.AbsFeature
    public void constructor(Context context, AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8928939c", new Object[]{this, context, attributeSet, new Integer(i)});
        } else if (attributeSet == null || (obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ParallaxScrollFeature, i, 0)) == null) {
        } else {
            this.mParallaxFactor = obtainStyledAttributes.getFloat(R.styleable.ParallaxScrollFeature_uik_parallaxFactor, this.mParallaxFactor);
            this.mInnerParallaxFactor = obtainStyledAttributes.getFloat(R.styleable.ParallaxScrollFeature_uik_innerParallaxFactor, this.mInnerParallaxFactor);
            this.mParallaxNum = obtainStyledAttributes.getInt(R.styleable.ParallaxScrollFeature_uik_parallaxNum, this.mParallaxNum);
            obtainStyledAttributes.recycle();
        }
    }

    @Override // com.taobao.uikit.feature.callback.ScrollCallback
    public void afterOnScrollChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41622bd3", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        float f = this.mParallaxFactor;
        int size = this.mParallaxViews.size();
        for (int i5 = 0; i5 < size; i5++) {
            this.mParallaxViews.get(i5).setOffset(i2 / f);
            f *= this.mInnerParallaxFactor;
        }
    }

    @Override // com.taobao.uikit.feature.features.AbsFeature
    public void setHost(ScrollView scrollView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cff071d3", new Object[]{this, scrollView});
            return;
        }
        super.setHost((ParallaxScrollFeature) scrollView);
        getHost().setOnHierarchyChangeListener(new ViewGroup.OnHierarchyChangeListener() { // from class: com.taobao.uikit.feature.features.ParallaxScrollFeature.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.ViewGroup.OnHierarchyChangeListener
            public void onChildViewAdded(View view, View view2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c61913e5", new Object[]{this, view, view2});
                } else {
                    ParallaxScrollFeature.access$000(ParallaxScrollFeature.this);
                }
            }

            @Override // android.view.ViewGroup.OnHierarchyChangeListener
            public void onChildViewRemoved(View view, View view2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b61353c5", new Object[]{this, view, view2});
                } else {
                    ParallaxScrollFeature.access$000(ParallaxScrollFeature.this);
                }
            }
        });
    }

    private void makeViewsParallax() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72c65bde", new Object[]{this});
            return;
        }
        this.mParallaxViews.clear();
        if (getHost().getChildCount() <= 0 || !(getHost().getChildAt(0) instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getHost().getChildAt(0);
        int min = Math.min(this.mParallaxNum, viewGroup.getChildCount());
        for (int i = 0; i < min; i++) {
            this.mParallaxViews.add(new ParallaxView(viewGroup.getChildAt(i)));
        }
    }

    public void setParallaxNum(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abf81ecf", new Object[]{this, new Integer(i)});
            return;
        }
        this.mParallaxNum = i;
        makeViewsParallax();
    }

    public void setParallaxFactor(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11107651", new Object[]{this, new Float(f)});
        } else {
            this.mParallaxFactor = f;
        }
    }

    public void setInnerParallaxFactor(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("befcf25f", new Object[]{this, new Float(f)});
        } else {
            this.mInnerParallaxFactor = f;
        }
    }

    /* loaded from: classes9.dex */
    public class ParallaxView {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public int lastOffset = 0;
        public WeakReference<View> view;

        static {
            kge.a(-1784870329);
        }

        public ParallaxView(View view) {
            this.view = new WeakReference<>(view);
        }

        public void setOffset(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b976ada4", new Object[]{this, new Float(f)});
                return;
            }
            View view = this.view.get();
            if (view == null) {
                return;
            }
            if (ParallaxScrollFeature.access$100()) {
                view.setTranslationY(f);
            } else {
                translatePreICS(view, f);
            }
        }

        public void translatePreICS(View view, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b4c8c419", new Object[]{this, view, new Float(f)});
                return;
            }
            int i = (int) f;
            view.offsetTopAndBottom(i - this.lastOffset);
            this.lastOffset = i;
        }
    }
}
