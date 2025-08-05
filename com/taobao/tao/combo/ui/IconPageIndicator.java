package com.taobao.tao.combo.ui;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.kge;

/* loaded from: classes8.dex */
public class IconPageIndicator extends HorizontalScrollView implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int FIRST_NULL_PAGER = -1;
    public static final int LAST_NULL_PAGER = -2;
    private Context mContext;
    private a mIconClickedListener;
    private Runnable mIconSelector;
    private final LinearLayout mLinearLayout;
    private ViewPager.OnPageChangeListener mListener;
    private int mSelectedIndex;
    private DirectionViewPager mViewPager;

    /* loaded from: classes8.dex */
    public interface a {
        void a(int i);
    }

    static {
        kge.a(-51225395);
        kge.a(-1375682164);
    }

    public static /* synthetic */ Object ipc$super(IconPageIndicator iconPageIndicator, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else if (hashCode != 1626033557) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onAttachedToWindow();
            return null;
        }
    }

    public static /* synthetic */ Runnable access$002(IconPageIndicator iconPageIndicator, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("a8b6797b", new Object[]{iconPageIndicator, runnable});
        }
        iconPageIndicator.mIconSelector = runnable;
        return runnable;
    }

    public static /* synthetic */ a access$100(IconPageIndicator iconPageIndicator) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("bada1703", new Object[]{iconPageIndicator}) : iconPageIndicator.mIconClickedListener;
    }

    public IconPageIndicator(Context context) {
        this(context, null);
    }

    public IconPageIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mContext = context;
        setHorizontalScrollBarEnabled(false);
        this.mLinearLayout = new LinearLayout(context);
        this.mLinearLayout.setOrientation(0);
        int dip2px = dip2px(8.0f);
        this.mLinearLayout.setPadding(dip2px, dip2px, 0, dip2px);
        addView(this.mLinearLayout, new FrameLayout.LayoutParams(-1, -1, 16));
    }

    public void setIconClickedListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb262e10", new Object[]{this, aVar});
        } else {
            this.mIconClickedListener = aVar;
        }
    }

    private int dip2px(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("777b781d", new Object[]{this, new Float(f)})).intValue() : (int) ((f * getContext().getResources().getDisplayMetrics().density) + 0.5f);
    }

    private void animateToIcon(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85a1e0a7", new Object[]{this, new Integer(i)});
            return;
        }
        final View childAt = this.mLinearLayout.getChildAt(i);
        Runnable runnable = this.mIconSelector;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        this.mIconSelector = new Runnable() { // from class: com.taobao.tao.combo.ui.IconPageIndicator.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                IconPageIndicator.this.smoothScrollTo(childAt.getLeft() - ((IconPageIndicator.this.getWidth() - childAt.getWidth()) / 2), 0);
                IconPageIndicator.access$002(IconPageIndicator.this, null);
            }
        };
        post(this.mIconSelector);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        Runnable runnable = this.mIconSelector;
        if (runnable == null) {
            return;
        }
        post(runnable);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        Runnable runnable = this.mIconSelector;
        if (runnable == null) {
            return;
        }
        removeCallbacks(runnable);
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
            return;
        }
        ViewPager.OnPageChangeListener onPageChangeListener = this.mListener;
        if (onPageChangeListener == null) {
            return;
        }
        onPageChangeListener.onPageScrollStateChanged(i);
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i, float f, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
            return;
        }
        ViewPager.OnPageChangeListener onPageChangeListener = this.mListener;
        if (onPageChangeListener == null) {
            return;
        }
        onPageChangeListener.onPageScrolled(i, f, i2);
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
            return;
        }
        int viewPagerClassify = this.mViewPager.getViewPagerClassify();
        int count = this.mViewPager.getAdapter().getCount();
        int i2 = -2;
        if (viewPagerClassify != 0) {
            if (viewPagerClassify != 1) {
                if (viewPagerClassify == 2) {
                    if (i == 0 || count == i + 1) {
                        ViewPager.OnPageChangeListener onPageChangeListener = this.mListener;
                        if (onPageChangeListener == null) {
                            return;
                        }
                        if (i == 0) {
                            i2 = -1;
                        }
                        onPageChangeListener.onPageSelected(i2);
                        return;
                    }
                }
            } else if (i == 0) {
                ViewPager.OnPageChangeListener onPageChangeListener2 = this.mListener;
                if (onPageChangeListener2 == null) {
                    return;
                }
                onPageChangeListener2.onPageSelected(-1);
                return;
            }
            i--;
        } else if (count == i + 1) {
            ViewPager.OnPageChangeListener onPageChangeListener3 = this.mListener;
            if (onPageChangeListener3 == null) {
                return;
            }
            onPageChangeListener3.onPageSelected(-2);
            return;
        }
        setCurrentItem(i);
        ViewPager.OnPageChangeListener onPageChangeListener4 = this.mListener;
        if (onPageChangeListener4 == null) {
            return;
        }
        onPageChangeListener4.onPageSelected(i);
    }

    public void setViewPager(DirectionViewPager directionViewPager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("206abdd9", new Object[]{this, directionViewPager});
            return;
        }
        DirectionViewPager directionViewPager2 = this.mViewPager;
        if (directionViewPager2 == directionViewPager) {
            return;
        }
        if (directionViewPager2 != null) {
            directionViewPager2.setOnPageChangeListener(null);
        }
        if (directionViewPager.getAdapter() == null) {
            throw new IllegalStateException("ViewPager does not have adapter instance.");
        }
        this.mViewPager = directionViewPager;
        directionViewPager.setOnPageChangeListener(this);
        notifyDataSetChanged();
    }

    public void notifyDataSetChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eee9a4ec", new Object[]{this});
            return;
        }
        this.mLinearLayout.removeAllViews();
        com.taobao.tao.combo.ui.a aVar = (com.taobao.tao.combo.ui.a) this.mViewPager.getAdapter();
        int count = aVar.getCount();
        int viewPagerClassify = this.mViewPager.getViewPagerClassify();
        if (viewPagerClassify == 0 || viewPagerClassify == 1) {
            count--;
        } else if (viewPagerClassify == 2) {
            count -= 2;
        }
        LayoutInflater from = LayoutInflater.from(this.mContext);
        int i = 0;
        while (i < count) {
            LinearLayout linearLayout = (LinearLayout) from.inflate(R.layout.shop_combo_buttom_scroll_item, (ViewGroup) null);
            if (linearLayout == null) {
                return;
            }
            ((TUrlImageView) linearLayout.findViewById(R.id.shop_combo_buttom_scroll_item_turlImgview)).setImageUrl(aVar.a(i));
            int i2 = i + 1;
            if (i2 < count) {
                ((ImageView) linearLayout.findViewById(R.id.shop_combo_buttom_scroll_item_add)).setVisibility(0);
            }
            linearLayout.setTag(Integer.valueOf(i));
            linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.tao.combo.ui.IconPageIndicator.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    int intValue = ((Integer) view.getTag()).intValue();
                    IconPageIndicator.this.setCurrentItem(intValue);
                    if (IconPageIndicator.access$100(IconPageIndicator.this) == null) {
                        return;
                    }
                    IconPageIndicator.access$100(IconPageIndicator.this).a(intValue);
                }
            });
            this.mLinearLayout.addView(linearLayout);
            i = i2;
        }
        if (this.mSelectedIndex > count) {
            this.mSelectedIndex = count - 1;
        }
        setCurrentItem(this.mSelectedIndex);
        requestLayout();
    }

    private void setItemShape(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bf8dcd0", new Object[]{this, new Integer(i)});
            return;
        }
        int count = ((com.taobao.tao.combo.ui.a) this.mViewPager.getAdapter()).getCount();
        int viewPagerClassify = this.mViewPager.getViewPagerClassify();
        if (viewPagerClassify == 0 || viewPagerClassify == 1) {
            count--;
        } else if (viewPagerClassify == 2) {
            count -= 2;
        }
        for (int i2 = 0; i2 < count; i2++) {
            LinearLayout linearLayout = (LinearLayout) this.mLinearLayout.getChildAt(i2);
            if (i2 == i) {
                linearLayout.getChildAt(0).setBackgroundResource(R.drawable.shop_combo_buttom_item_selected_shape);
            } else {
                linearLayout.getChildAt(0).setBackgroundDrawable(getResources().getDrawable(R.drawable.shop_combo_buttom_item_shape));
            }
        }
    }

    public void setViewPager(DirectionViewPager directionViewPager, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eced704a", new Object[]{this, directionViewPager, new Integer(i)});
            return;
        }
        setViewPager(directionViewPager);
        setCurrentItem(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
        if (r0 != 3) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setCurrentItem(int r7) {
        /*
            r6 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.tao.combo.ui.IconPageIndicator.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L1a
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r3] = r6
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r7)
            r1[r4] = r2
            java.lang.String r7 = "d416f32"
            r0.ipc$dispatch(r7, r1)
            return
        L1a:
            com.taobao.tao.combo.ui.DirectionViewPager r0 = r6.mViewPager
            if (r0 == 0) goto L66
            r6.mSelectedIndex = r7
            int r0 = r0.getViewPagerClassify()
            if (r0 == 0) goto L3e
            if (r0 == r4) goto L36
            if (r0 == r2) goto L2e
            r1 = 3
            if (r0 == r1) goto L3e
            goto L43
        L2e:
            com.taobao.tao.combo.ui.DirectionViewPager r0 = r6.mViewPager
            int r1 = r7 + 1
            r0.setCurrentItem(r1)
            goto L43
        L36:
            com.taobao.tao.combo.ui.DirectionViewPager r0 = r6.mViewPager
            int r1 = r7 + 1
            r0.setCurrentItem(r1)
            goto L43
        L3e:
            com.taobao.tao.combo.ui.DirectionViewPager r0 = r6.mViewPager
            r0.setCurrentItem(r7)
        L43:
            r6.setItemShape(r7)
            android.widget.LinearLayout r0 = r6.mLinearLayout
            int r0 = r0.getChildCount()
            r1 = 0
        L4d:
            if (r1 >= r0) goto L65
            android.widget.LinearLayout r2 = r6.mLinearLayout
            android.view.View r2 = r2.getChildAt(r1)
            if (r1 != r7) goto L59
            r5 = 1
            goto L5a
        L59:
            r5 = 0
        L5a:
            r2.setSelected(r5)
            if (r5 == 0) goto L62
            r6.animateToIcon(r7)
        L62:
            int r1 = r1 + 1
            goto L4d
        L65:
            return
        L66:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "ViewPager has not been bound."
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.combo.ui.IconPageIndicator.setCurrentItem(int):void");
    }

    public void setOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c756499", new Object[]{this, onPageChangeListener});
        } else {
            this.mListener = onPageChangeListener;
        }
    }
}
