package com.taobao.umipublish.extension.preview.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.taobao.windvane.util.k;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.base.widget.LCTabView;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes9.dex */
public class PreviewIndexTabView extends LCTabView {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1085372326);
    }

    public static /* synthetic */ Object ipc$super(PreviewIndexTabView previewIndexTabView, String str, Object... objArr) {
        if (str.hashCode() == 1253364731) {
            super.addTab((LCTabView.a) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public PreviewIndexTabView(Context context) {
        super(context);
    }

    public PreviewIndexTabView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PreviewIndexTabView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.taobao.android.litecreator.base.widget.LCTabView
    public boolean isItemChecked(LCTabView.a aVar, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f6e5dfd6", new Object[]{this, aVar, new Integer(i)})).booleanValue() : aVar.c ? aVar.f13308a <= i : aVar.f13308a < i;
    }

    @Override // com.taobao.android.litecreator.base.widget.LCTabView
    public int rootViewId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c2fd8d9c", new Object[]{this})).intValue() : R.layout.lay_preview_index_tab;
    }

    @Override // com.taobao.android.litecreator.base.widget.LCTabView
    public int sliderId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6ea90456", new Object[]{this})).intValue() : R.id.v_tab_slider;
    }

    @Override // com.taobao.android.litecreator.base.widget.LCTabView
    public int tabViewId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f2fd488f", new Object[]{this})).intValue() : R.id.rg_index_tab;
    }

    @Override // com.taobao.android.litecreator.base.widget.LCTabView
    public void addTab(LCTabView.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ab4d3fb", new Object[]{this, aVar});
            return;
        }
        super.addTab(aVar);
        this.mTabSlider.getLayoutParams().width = getTabItemWidth(this.mItemList.size());
    }

    public void clearTabs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ee94672", new Object[]{this});
            return;
        }
        this.mItemList.clear();
        this.mTabItemContainer.removeAllViews();
    }

    private static int getTabItemWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bde782fb", new Object[]{new Integer(i)})).intValue();
        }
        if (i > 0) {
            return k.a() / i;
        }
        return 0;
    }

    @Override // com.taobao.android.litecreator.base.widget.LCTabView
    /* renamed from: generateSliderAnimByIndex  reason: collision with other method in class */
    public ObjectAnimator mo1570generateSliderAnimByIndex(View view, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ObjectAnimator) ipChange.ipc$dispatch("723edf68", new Object[]{this, view, new Integer(i)}) : ObjectAnimator.ofFloat(view, "translationX", view.getTranslationX(), getTabItemWidth(this.mItemList.size()) * i);
    }

    /* loaded from: classes9.dex */
    public static class a extends LCTabView.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private View d;
        private final int e;

        static {
            kge.a(1131794247);
        }

        public a(int i, int i2, String str) {
            super(i, str);
            this.e = i2;
        }

        @Override // com.taobao.android.litecreator.base.widget.LCTabView.a
        public View a(ViewGroup viewGroup) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("fb64bd29", new Object[]{this, viewGroup});
            }
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.lay_preview_index_tab_item, viewGroup, false);
            if (frameLayout.getLayoutParams() != null && this.e > 0) {
                frameLayout.getLayoutParams().width = k.a() / this.e;
            }
            this.d = frameLayout.findViewById(R.id.v_tab_item_bg);
            return frameLayout;
        }

        @Override // com.taobao.android.litecreator.base.widget.LCTabView.a
        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            } else {
                this.d.setBackgroundResource(z ? R.drawable.dw_umi_index_tab_item_bg_focus : R.drawable.dw_umi_index_tab_item_bg);
            }
        }
    }
}
