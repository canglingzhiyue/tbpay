package com.taobao.taolive.uikit.view;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.view.PagerAdapter;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.component.Banner;
import com.taobao.uikit.component.IndicatorView;
import com.taobao.uikit.component.LoopViewPager;
import java.util.ArrayList;
import java.util.Iterator;
import tb.kge;
import tb.pqs;
import tb.pqv;
import tb.pqw;

/* loaded from: classes8.dex */
public class TBLiveBanner extends Banner implements pqs, pqw {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private a mAdapter;
    private pqv mCardChangeListener;
    private ArrayList<View> mChildViews;

    static {
        kge.a(-311594417);
        kge.a(-750533237);
        kge.a(1123141180);
    }

    public static /* synthetic */ Object ipc$super(TBLiveBanner tBLiveBanner, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -265261157) {
            super.destory();
            return null;
        } else if (hashCode != 650865254) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        }
    }

    public pqw.a getInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pqw.a) ipChange.ipc$dispatch("eee81108", new Object[]{this});
        }
        return null;
    }

    @Override // tb.pqw
    public boolean needLazyLoad() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c7455bb", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.pqs
    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
        }
    }

    @Override // tb.pqs
    public void resume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
        }
    }

    public static /* synthetic */ IndicatorView access$000(TBLiveBanner tBLiveBanner) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IndicatorView) ipChange.ipc$dispatch("878083ac", new Object[]{tBLiveBanner}) : tBLiveBanner.mIndicator;
    }

    public static /* synthetic */ pqv access$100(TBLiveBanner tBLiveBanner) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (pqv) ipChange.ipc$dispatch("98f0d959", new Object[]{tBLiveBanner}) : tBLiveBanner.mCardChangeListener;
    }

    public TBLiveBanner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    public TBLiveBanner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public TBLiveBanner(Context context) {
        super(context);
        init();
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.tbliveuikit_banner_layout, (ViewGroup) null, false);
        if (inflate == null) {
            return;
        }
        View findViewById = inflate.findViewById(R.id.tbliveuikit_banner_viewpager);
        if (findViewById != null) {
            findViewById.setId(R.id.viewpager);
        }
        View findViewById2 = inflate.findViewById(R.id.tbliveuikit_banner_indicator);
        if (findViewById2 != null) {
            findViewById2.setId(R.id.indicator);
            ((IndicatorView) findViewById2).setFocusColor(Color.parseColor("#ff2851"));
        }
        setLayout(inflate);
        setRatio(1.0f);
        setAutoScroll(true);
        setScrollInterval(10000);
        setBackgroundColor(0);
        this.mViewPager.setOnPageChangeListener(new LoopViewPager.OnPageChangeListener() { // from class: com.taobao.taolive.uikit.view.TBLiveBanner.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.uikit.component.LoopViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
                }
            }

            @Override // com.taobao.uikit.component.LoopViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
                }
            }

            @Override // com.taobao.uikit.component.LoopViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
                    return;
                }
                TBLiveBanner.access$000(TBLiveBanner.this).setIndex(i);
                if (TBLiveBanner.access$100(TBLiveBanner.this) == null) {
                    return;
                }
                TBLiveBanner.access$100(TBLiveBanner.this).a(i);
            }
        });
    }

    @Override // tb.pqw
    public void setOnCardChangeListener(pqv pqvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5ef8d37", new Object[]{this, pqvVar});
        } else {
            this.mCardChangeListener = pqvVar;
        }
    }

    @Override // tb.pqw
    public void setCurrentCard(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e45e555", new Object[]{this, new Integer(i)});
        } else if (i < 0 || i >= this.mChildViews.size()) {
        } else {
            this.mViewPager.setCurrentItem(i);
            pqv pqvVar = this.mCardChangeListener;
            if (pqvVar == null) {
                return;
            }
            pqvVar.a(i);
        }
    }

    @Override // tb.pqs
    public void setChildViews(ArrayList<View> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f643e54f", new Object[]{this, arrayList});
        } else if (arrayList == null || arrayList.size() <= 0) {
        } else {
            removeChildViews();
            Iterator<View> it = arrayList.iterator();
            while (it.hasNext()) {
                addChildView(it.next());
            }
        }
    }

    public void addChildView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51bfb6ab", new Object[]{this, view});
            return;
        }
        if (this.mChildViews == null) {
            this.mChildViews = new ArrayList<>();
        }
        if (view == null) {
            return;
        }
        this.mChildViews.add(view);
    }

    @Override // tb.pqs
    public void removeChildViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4d36fdd", new Object[]{this});
            return;
        }
        ArrayList<View> arrayList = this.mChildViews;
        if (arrayList == null) {
            return;
        }
        arrayList.clear();
        a aVar = this.mAdapter;
        if (aVar == null) {
            return;
        }
        aVar.notifyDataSetChanged();
        this.mAdapter = null;
    }

    @Override // tb.pqs
    public void makeView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("960c80ba", new Object[]{this});
            return;
        }
        ArrayList<View> arrayList = this.mChildViews;
        if (arrayList == null) {
            return;
        }
        a aVar = this.mAdapter;
        if (aVar == null) {
            this.mAdapter = new a(arrayList);
            setAdapter(this.mAdapter);
            return;
        }
        aVar.notifyDataSetChanged();
        this.mIndicator.setTotal(this.mChildViews.size());
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        super.destory();
        a aVar = (a) this.mViewPager.getAdapter();
        if (aVar == null) {
            return;
        }
        aVar.a();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            super.onMeasure(i, i2);
        }
    }

    /* loaded from: classes8.dex */
    public class a extends PagerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private ArrayList<View> b;

        static {
            kge.a(119038856);
        }

        @Override // android.support.v4.view.PagerAdapter
        public int getItemPosition(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("304bee8", new Object[]{this, obj})).intValue();
            }
            return -2;
        }

        @Override // android.support.v4.view.PagerAdapter
        public boolean isViewFromObject(View view, Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e758b33", new Object[]{this, view, obj})).booleanValue() : view == obj;
        }

        public a(ArrayList<View> arrayList) {
            this.b = arrayList;
        }

        @Override // android.support.v4.view.PagerAdapter
        public int getCount() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue() : this.b.size();
        }

        @Override // android.support.v4.view.PagerAdapter
        public Object instantiateItem(ViewGroup viewGroup, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("1038d332", new Object[]{this, viewGroup, new Integer(i)});
            }
            View view = this.b.get(i);
            viewGroup.removeView(view);
            viewGroup.addView(view);
            if (TBLiveBanner.access$100(TBLiveBanner.this) != null) {
                TBLiveBanner.access$100(TBLiveBanner.this).b(i);
            }
            return view;
        }

        @Override // android.support.v4.view.PagerAdapter
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2a141ccc", new Object[]{this, viewGroup, new Integer(i), obj});
            } else {
                viewGroup.removeView((View) obj);
            }
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                this.b.clear();
            }
        }
    }
}
