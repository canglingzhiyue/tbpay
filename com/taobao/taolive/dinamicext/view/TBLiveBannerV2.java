package com.taobao.taolive.dinamicext.view;

import android.content.Context;
import android.graphics.Color;
import android.os.Looper;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.taolive.uikit.view.TBLIndicatorView;
import java.util.ArrayList;
import java.util.Iterator;
import tb.fpr;
import tb.kge;
import tb.pqs;
import tb.pqv;
import tb.pqw;
import tb.prp;
import tb.prt;

/* loaded from: classes8.dex */
public class TBLiveBannerV2 extends FrameLayout implements pqs, pqw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int DEFAULT_CYCLE_INTERVAL_MILLS = 3000;
    private static final int MAX_CACHE_SIZE = 5;
    private b mAdapter;
    public pqw.a mCInfo;
    private pqv mCardChangeListener;
    private ArrayList<View> mChildViews;
    public TBLIndicatorView mIndicator;
    private float mRatio;
    private int mScrollInterval;
    private prt mTimer;
    private prt.a mTimerHandlerListener;
    private ViewPager.PageTransformer mTransformer;
    public ViewPager mViewPager;

    static {
        kge.a(-1221907325);
        kge.a(-750533237);
        kge.a(1123141180);
    }

    public static /* synthetic */ Object ipc$super(TBLiveBannerV2 tBLiveBannerV2, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -270519527:
                super.onFinishTemporaryDetach();
                return null;
            case 348684699:
                super.onVisibilityChanged((View) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 949399698:
                super.onDetachedFromWindow();
                return null;
            case 1626033557:
                super.onAttachedToWindow();
                return null;
            case 1861606664:
                super.onStartTemporaryDetach();
                return null;
            case 2075560917:
                return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
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

    public static /* synthetic */ b access$000(TBLiveBannerV2 tBLiveBannerV2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("e98ec697", new Object[]{tBLiveBannerV2}) : tBLiveBannerV2.mAdapter;
    }

    public static /* synthetic */ pqv access$100(TBLiveBannerV2 tBLiveBannerV2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (pqv) ipChange.ipc$dispatch("27e3796b", new Object[]{tBLiveBannerV2}) : tBLiveBannerV2.mCardChangeListener;
    }

    public static /* synthetic */ ViewPager.PageTransformer access$200(TBLiveBannerV2 tBLiveBannerV2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewPager.PageTransformer) ipChange.ipc$dispatch("4aff872b", new Object[]{tBLiveBannerV2}) : tBLiveBannerV2.mTransformer;
    }

    public static /* synthetic */ int access$300(TBLiveBannerV2 tBLiveBannerV2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("238dcc97", new Object[]{tBLiveBannerV2})).intValue() : tBLiveBannerV2.getViewPagerClientWidth();
    }

    public TBLiveBannerV2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mScrollInterval = 3000;
        this.mCInfo = new pqw.a();
        this.mTimerHandlerListener = new prt.a() { // from class: com.taobao.taolive.dinamicext.view.TBLiveBannerV2.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.prt.a
            public int a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
                }
                return 0;
            }

            @Override // tb.prt.a
            public void b() {
                int count;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                } else if (TBLiveBannerV2.this.mViewPager == null || TBLiveBannerV2.this.mViewPager.getAdapter() == null || (count = TBLiveBannerV2.this.mViewPager.getAdapter().getCount()) == 0) {
                } else {
                    TBLiveBannerV2.this.mViewPager.setCurrentItem((TBLiveBannerV2.this.mViewPager.getCurrentItem() + 1) % count, true);
                }
            }
        };
        init(context, attributeSet, i);
    }

    public TBLiveBannerV2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mScrollInterval = 3000;
        this.mCInfo = new pqw.a();
        this.mTimerHandlerListener = new prt.a() { // from class: com.taobao.taolive.dinamicext.view.TBLiveBannerV2.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.prt.a
            public int a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
                }
                return 0;
            }

            @Override // tb.prt.a
            public void b() {
                int count;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                } else if (TBLiveBannerV2.this.mViewPager == null || TBLiveBannerV2.this.mViewPager.getAdapter() == null || (count = TBLiveBannerV2.this.mViewPager.getAdapter().getCount()) == 0) {
                } else {
                    TBLiveBannerV2.this.mViewPager.setCurrentItem((TBLiveBannerV2.this.mViewPager.getCurrentItem() + 1) % count, true);
                }
            }
        };
        init(context, attributeSet, 0);
    }

    public TBLiveBannerV2(Context context) {
        super(context);
        this.mScrollInterval = 3000;
        this.mCInfo = new pqw.a();
        this.mTimerHandlerListener = new prt.a() { // from class: com.taobao.taolive.dinamicext.view.TBLiveBannerV2.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.prt.a
            public int a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
                }
                return 0;
            }

            @Override // tb.prt.a
            public void b() {
                int count;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                } else if (TBLiveBannerV2.this.mViewPager == null || TBLiveBannerV2.this.mViewPager.getAdapter() == null || (count = TBLiveBannerV2.this.mViewPager.getAdapter().getCount()) == 0) {
                } else {
                    TBLiveBannerV2.this.mViewPager.setCurrentItem((TBLiveBannerV2.this.mViewPager.getCurrentItem() + 1) % count, true);
                }
            }
        };
        init(context, null, 0);
    }

    private void init(Context context, AttributeSet attributeSet, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa26a346", new Object[]{this, context, attributeSet, new Integer(i)});
            return;
        }
        pqw.a aVar = this.mCInfo;
        aVar.b = 5;
        aVar.f32823a = true;
        aVar.c = -1;
        initAttr(context, attributeSet, i);
        initView();
    }

    private void initAttr(Context context, AttributeSet attributeSet, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d31a655", new Object[]{this, context, attributeSet, new Integer(i)});
            return;
        }
        this.mScrollInterval = 3000;
        this.mRatio = 0.3125f;
    }

    private void initTimer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fb3ce1c", new Object[]{this});
        } else if (this.mScrollInterval == 0) {
        } else {
            if (this.mTimer != null) {
                disableAutoScroll();
            }
            this.mTimer = new prt(this.mTimerHandlerListener, this.mScrollInterval, Looper.getMainLooper());
            startTimer();
        }
    }

    private void disableAutoScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ba0a0eb", new Object[]{this});
            return;
        }
        stopTimer();
        this.mTimer = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        startTimer();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        stopTimer();
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        disableAutoScroll();
        this.mCInfo.c = -1;
        b bVar = (b) this.mViewPager.getAdapter();
        if (bVar == null) {
            return;
        }
        bVar.c();
    }

    public void setAutoScroll(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6cef2be", new Object[]{this, new Integer(i)});
            return;
        }
        this.mScrollInterval = i;
        initTimer();
    }

    public void setAdapter(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d07db0c", new Object[]{this, bVar});
            return;
        }
        this.mViewPager.setAdapter(bVar);
        this.mViewPager.setCurrentItem(bVar.b());
        this.mIndicator.setTotal(bVar.a());
        if (bVar.a() != 0) {
            this.mIndicator.setIndex(bVar.b() % bVar.a());
        } else {
            this.mIndicator.setIndex(0);
        }
    }

    public void setLayout(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e54ca8b0", new Object[]{this, new Integer(i)});
        } else {
            setLayout(LayoutInflater.from(getContext()).inflate(i, (ViewGroup) null));
        }
    }

    public void setLayout(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d66bbd3f", new Object[]{this, view});
        } else if (view.findViewById(R.id.tbliveuikit_banner_viewpager) != null && view.findViewById(R.id.tbliveuikit_banner_indicator) != null) {
            removeAllViews();
            addView(view);
            initView();
        } else {
            throw new RuntimeException("banner need two views which's are viewpager and indicator");
        }
    }

    public void setRatio(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("978378f0", new Object[]{this, new Float(f)});
        } else {
            this.mRatio = f;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        doTimerEvent(motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    private void doTimerEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d625591c", new Object[]{this, motionEvent});
        } else if (this.mTimer == null) {
        } else {
            int action = motionEvent.getAction();
            if (action == 0) {
                stopTimer();
            }
            if (action != 1 && action != 3) {
                return;
            }
            startTimer();
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14c8819b", new Object[]{this, view, new Integer(i)});
            return;
        }
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            startTimer();
        } else {
            stopTimer();
        }
    }

    private void startTimer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edfb8b0a", new Object[]{this});
            return;
        }
        prt prtVar = this.mTimer;
        if (prtVar == null || this.mViewPager == null || !prtVar.a()) {
            return;
        }
        this.mTimer.a(this.mTimerHandlerListener);
        this.mTimer.removeCallbacksAndMessages(null);
        this.mTimer.a(0);
        this.mTimer.a(false);
    }

    private void stopTimer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b325b6a", new Object[]{this});
            return;
        }
        prt prtVar = this.mTimer;
        if (prtVar == null || this.mViewPager == null || prtVar.a()) {
            return;
        }
        this.mTimer.removeCallbacksAndMessages(null);
        this.mTimer.a((prt.a) null);
        this.mTimer.a(true);
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ef5dd08", new Object[]{this});
            return;
        }
        super.onStartTemporaryDetach();
        stopTimer();
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efe03319", new Object[]{this});
            return;
        }
        super.onFinishTemporaryDetach();
        startTimer();
    }

    private void initView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(getContext()).inflate(R.layout.tbliveuikit_banner_v2_layout, (ViewGroup) null, false);
        if (viewGroup == null) {
            return;
        }
        this.mViewPager = (ViewPager) viewGroup.findViewById(R.id.tbliveuikit_banner_viewpager);
        if (this.mViewPager != null) {
            this.mViewPager.setPadding(0, 0, fpr.a(getContext(), "153ap", (int) (fpr.a(getContext()) * 0.408f)), 0);
            int a2 = fpr.a(getContext(), "216ap", 0);
            int indexOfChild = viewGroup.indexOfChild(this.mViewPager);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, a2);
            viewGroup.removeView(this.mViewPager);
            viewGroup.addView(this.mViewPager, indexOfChild, layoutParams);
        }
        this.mIndicator = (TBLIndicatorView) viewGroup.findViewById(R.id.tbliveuikit_banner_indicator);
        TBLIndicatorView tBLIndicatorView = this.mIndicator;
        if (tBLIndicatorView != null) {
            tBLIndicatorView.setFocusColor(Color.parseColor("#ff2851"));
        }
        addView(viewGroup);
        setRatio(0.576f);
        setAutoScroll(10500);
        setBackgroundColor(0);
        this.mTransformer = new a(getContext());
        this.mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.taobao.taolive.dinamicext.view.TBLiveBannerV2.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.support.v4.view.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
                }
            }

            @Override // android.support.v4.view.ViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
                    return;
                }
                if (TBLiveBannerV2.access$000(TBLiveBannerV2.this) != null && TBLiveBannerV2.access$000(TBLiveBannerV2.this).a() != 0) {
                    i %= TBLiveBannerV2.access$000(TBLiveBannerV2.this).a();
                }
                TBLiveBannerV2.this.mIndicator.setIndex(i);
                if (TBLiveBannerV2.access$100(TBLiveBannerV2.this) == null) {
                    return;
                }
                TBLiveBannerV2.access$100(TBLiveBannerV2.this).a(i);
            }

            @Override // android.support.v4.view.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
                } else if (i == 0 && TBLiveBannerV2.access$200(TBLiveBannerV2.this) != null) {
                    int scrollX = TBLiveBannerV2.this.mViewPager.getScrollX();
                    int childCount = TBLiveBannerV2.this.mViewPager.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = TBLiveBannerV2.this.mViewPager.getChildAt(i2);
                        if (!((ViewPager.LayoutParams) childAt.getLayoutParams()).isDecor) {
                            TBLiveBannerV2.access$200(TBLiveBannerV2.this).transformPage(childAt, (childAt.getLeft() - scrollX) / TBLiveBannerV2.access$300(TBLiveBannerV2.this));
                        }
                    }
                }
            }
        });
        this.mViewPager.setOffscreenPageLimit(2);
        this.mViewPager.setPageTransformer(true, this.mTransformer);
    }

    private int getViewPagerClientWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2c71c52d", new Object[]{this})).intValue();
        }
        ViewPager viewPager = this.mViewPager;
        if (viewPager == null) {
            return 1;
        }
        return (viewPager.getMeasuredWidth() - this.mViewPager.getPaddingLeft()) - this.mViewPager.getPaddingRight();
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
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e45e555", new Object[]{this, new Integer(i)});
        } else if (i < 0 || i >= this.mChildViews.size()) {
        } else {
            this.mViewPager.setCurrentItem(this.mAdapter.b() + i);
            if (i == 0 && (view = this.mChildViews.get(0)) != null) {
                View a2 = prp.a("bottomMaskView", view);
                if (a2 != null) {
                    a2.setAlpha(1.0f);
                }
                View a3 = prp.a("bottomBlackMaskView", view);
                if (a3 != null) {
                    a3.setAlpha(0.0f);
                }
            }
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
        b bVar = this.mAdapter;
        if (bVar == null) {
            return;
        }
        bVar.notifyDataSetChanged();
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
        b bVar = this.mAdapter;
        if (bVar == null) {
            this.mAdapter = new b(arrayList);
            setAdapter(this.mAdapter);
            return;
        }
        bVar.notifyDataSetChanged();
        this.mIndicator.setTotal(this.mAdapter.a());
    }

    public pqw.a getInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (pqw.a) ipChange.ipc$dispatch("eee81108", new Object[]{this}) : this.mCInfo;
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
    public class b extends PagerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private ArrayList<View> b;

        static {
            kge.a(769274556);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
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

        public b(ArrayList<View> arrayList) {
            this.b = arrayList;
        }

        @Override // android.support.v4.view.PagerAdapter
        public int getCount() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
            }
            ArrayList<View> arrayList = this.b;
            if (arrayList == null || arrayList.size() == 0) {
                return 0;
            }
            if (1 != this.b.size()) {
                return a() * 1000;
            }
            return 1;
        }

        public int a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
            }
            ArrayList<View> arrayList = this.b;
            if (arrayList == null || arrayList.size() == 0) {
                return 0;
            }
            if (1 == this.b.size()) {
                return 1;
            }
            if (-1 != TBLiveBannerV2.this.mCInfo.c) {
                return TBLiveBannerV2.this.mCInfo.c;
            }
            return this.b.size();
        }

        public int b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
            }
            ArrayList<View> arrayList = this.b;
            if (arrayList != null && 1 != arrayList.size()) {
                return a() * 500;
            }
            return 0;
        }

        @Override // android.support.v4.view.PagerAdapter
        public Object instantiateItem(ViewGroup viewGroup, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("1038d332", new Object[]{this, viewGroup, new Integer(i)});
            }
            if (a() == 0) {
                return null;
            }
            int a2 = a(i);
            View view = this.b.get(a2);
            viewGroup.removeView(view);
            viewGroup.addView(view);
            if (TBLiveBannerV2.access$100(TBLiveBannerV2.this) != null) {
                TBLiveBannerV2.access$100(TBLiveBannerV2.this).b(a2);
            }
            return view;
        }

        @Override // android.support.v4.view.PagerAdapter
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2a141ccc", new Object[]{this, viewGroup, new Integer(i), obj});
            } else if (a() == 0) {
                viewGroup.removeView((View) obj);
            } else if (a() <= 5) {
            } else {
                viewGroup.removeView(this.b.get(a(i)));
            }
        }

        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            } else {
                this.b.clear();
            }
        }

        private int a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{this, new Integer(i)})).intValue();
            }
            if (-1 != TBLiveBannerV2.this.mCInfo.c && this.b.size() != 0) {
                return i % this.b.size();
            }
            return a() != 0 ? i % a() : i;
        }
    }

    /* loaded from: classes8.dex */
    public class a implements ViewPager.PageTransformer {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private int b;

        static {
            kge.a(1420163810);
            kge.a(941956907);
        }

        public a(Context context) {
            this.b = fpr.a(context);
        }

        @Override // android.support.v4.view.ViewPager.PageTransformer
        public void transformPage(View view, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7b6a8f50", new Object[]{this, view, new Float(f)});
                return;
            }
            View a2 = prp.a("bottomMaskView", view);
            View a3 = prp.a("bottomBlackMaskView", view);
            if (f < -1.0f) {
                if (a2 != null) {
                    a2.setAlpha(0.0f);
                }
                if (a3 == null) {
                    return;
                }
                a3.setAlpha(1.0f);
            } else if (f < 0.0f) {
                view.setTranslationX(this.b * Math.abs(f) * (-0.03f));
                float f2 = 1.0f + f;
                float f3 = (0.120000005f * f2) + 0.88f;
                view.setScaleX(f3);
                view.setScaleY(f3);
                if (a2 != null) {
                    a2.setAlpha(f2);
                }
                if (a3 == null) {
                    return;
                }
                a3.setAlpha(Math.abs(f));
            } else if (f == 0.0f) {
                view.setTranslationX(0.0f);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                if (a2 != null) {
                    a2.setAlpha(1.0f);
                }
                if (a3 == null) {
                    return;
                }
                a3.setAlpha(0.0f);
            } else if (f < 1.0f) {
                view.setTranslationX(this.b * f * (-0.03f));
                float f4 = 1.0f - f;
                float f5 = (0.120000005f * f4) + 0.88f;
                view.setScaleX(f5);
                view.setScaleY(f5);
                if (a2 != null) {
                    a2.setAlpha(f4);
                }
                if (a3 == null) {
                    return;
                }
                a3.setAlpha(f);
            } else {
                view.setTranslationX(this.b * (-0.03f));
                view.setScaleX(0.88f);
                view.setScaleY(0.88f);
                if (a2 != null) {
                    a2.setAlpha(0.0f);
                }
                if (a3 == null) {
                    return;
                }
                a3.setAlpha(1.0f);
            }
        }
    }
}
