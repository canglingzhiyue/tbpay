package com.taobao.android.litecreator.base.widget;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.util.f;
import com.taobao.android.litecreator.util.t;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes5.dex */
public class LCTabView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public List<a> mItemList;
    public b mOnTabChangeListener;
    public ViewGroup mTabItemContainer;
    public View mTabSlider;
    public Animator mTabSwitchAnim;

    /* loaded from: classes5.dex */
    public interface b {
        void a(int i, boolean z);
    }

    static {
        kge.a(-540211246);
    }

    public LCTabView(Context context) {
        super(context);
        this.mItemList = new ArrayList();
        initialize();
    }

    public LCTabView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mItemList = new ArrayList();
        initialize();
    }

    public LCTabView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mItemList = new ArrayList();
        initialize();
    }

    private void initialize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b110817", new Object[]{this});
            return;
        }
        int rootViewId = rootViewId();
        if (rootViewId != -1) {
            LayoutInflater.from(getContext()).inflate(rootViewId, this);
        }
        this.mTabSlider = findViewById(sliderId());
        this.mTabItemContainer = (ViewGroup) findViewById(tabViewId());
    }

    public int rootViewId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c2fd8d9c", new Object[]{this})).intValue() : R.layout.lay_lc_mediapick_tab;
    }

    public int sliderId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6ea90456", new Object[]{this})).intValue() : R.id.v_tab_slider;
    }

    public int tabViewId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f2fd488f", new Object[]{this})).intValue() : R.id.rg_mediaptype_tab;
    }

    /* renamed from: generateSliderAnimByIndex */
    public Animator mo1570generateSliderAnimByIndex(View view, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Animator) ipChange.ipc$dispatch("39d12e27", new Object[]{this, view, new Integer(i)}) : ObjectAnimator.ofFloat(view, "translationX", view.getTranslationX(), f.a(70.0f) * i);
    }

    public void addTab(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("760b1ac5", new Object[]{this, str});
        } else {
            addTab(new com.taobao.android.litecreator.base.widget.b(this.mItemList.size(), str));
        }
    }

    public void addTab(final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ab4d3fb", new Object[]{this, aVar});
            return;
        }
        t.a("LCTabView.Item.createView");
        View a2 = aVar.a(this.mTabItemContainer);
        t.a();
        a2.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.litecreator.base.widget.LCTabView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                LCTabView.this.performTabClicked(aVar.f13308a, true);
                LCTabView.this.playSliderAnim(aVar.f13308a);
            }
        });
        this.mItemList.add(aVar);
        this.mTabItemContainer.addView(a2);
    }

    public void performTabClicked(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28c629cb", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        for (a aVar : this.mItemList) {
            if (!isItemChecked(aVar, i)) {
                if (aVar.a()) {
                    aVar.c = false;
                    aVar.a(false);
                }
            } else if (!aVar.a()) {
                aVar.c = true;
                aVar.a(true);
                b bVar = this.mOnTabChangeListener;
                if (bVar != null) {
                    bVar.a(i, z);
                }
            }
        }
    }

    public boolean isItemChecked(a aVar, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f6e5dfd6", new Object[]{this, aVar, new Integer(i)})).booleanValue() : aVar.f13308a == i;
    }

    public void setFocused(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a91713c7", new Object[]{this, new Integer(i)});
        } else if (i < 0 || i >= this.mItemList.size()) {
        } else {
            performTabClicked(i, false);
            playSliderAnim(i);
        }
    }

    public int getFocused() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5e8ac33b", new Object[]{this})).intValue();
        }
        for (a aVar : this.mItemList) {
            if (aVar.a()) {
                return aVar.f13308a;
            }
        }
        return -1;
    }

    public ViewGroup getTabItemContainer() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("1c8943bf", new Object[]{this}) : this.mTabItemContainer;
    }

    public void setOnTabChangeListener(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("668112be", new Object[]{this, bVar});
        } else {
            this.mOnTabChangeListener = bVar;
        }
    }

    public void playSliderAnim(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95565236", new Object[]{this, new Integer(i)});
            return;
        }
        Animator animator = this.mTabSwitchAnim;
        if (animator != null && animator.isRunning()) {
            this.mTabSwitchAnim.cancel();
        }
        this.mTabSwitchAnim = mo1570generateSliderAnimByIndex(this.mTabSlider, i);
        Animator animator2 = this.mTabSwitchAnim;
        if (animator2 == null) {
            return;
        }
        animator2.setDuration(200L);
        this.mTabSwitchAnim.setInterpolator(new AccelerateDecelerateInterpolator());
        this.mTabSwitchAnim.start();
    }

    /* loaded from: classes5.dex */
    public static abstract class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f13308a;
        public String b;
        public boolean c;

        static {
            kge.a(1387743429);
        }

        public abstract View a(ViewGroup viewGroup);

        public abstract void a(boolean z);

        public a(int i, String str) {
            this.f13308a = i;
            this.b = str;
        }

        public boolean a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.c;
        }
    }
}
