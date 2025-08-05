package com.taobao.android.fluid.framework.card.cards.video.layer.seekbar.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import tb.kge;
import tb.obu;
import tb.spz;

/* loaded from: classes5.dex */
public class SeekBarScrollInterceptView extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "SeekBarScrollInterceptView";
    private WeakReference<View> mBottomTabBarRef;
    private float mDownX;
    private float mDownY;
    private boolean mIsDownInSeekBar;
    private boolean mIsDownInTabBar;
    private boolean mIsScrolling;
    private ViewGroup mItemView;
    private float mLastX;
    private float mLastY;
    private View mRangeSeekBar;
    private int mTouchSlop;

    static {
        kge.a(-257074495);
    }

    public static /* synthetic */ Object ipc$super(SeekBarScrollInterceptView seekBarScrollInterceptView, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public SeekBarScrollInterceptView(Context context) {
        super(context);
    }

    public SeekBarScrollInterceptView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SeekBarScrollInterceptView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else {
            this.mTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        }
    }

    public void setCurrentRelatedView(ViewGroup viewGroup, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87f00ff3", new Object[]{this, viewGroup, view});
            return;
        }
        this.mItemView = viewGroup;
        this.mRangeSeekBar = view;
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean dispatchToBottomTabBar;
        boolean dispatchToRangeSeekBar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.mDownX = motionEvent.getX();
            this.mDownY = motionEvent.getY();
            this.mIsScrolling = false;
            dispatchToBottomTabBar = dispatchToBottomTabBar(motionEvent);
            dispatchToRangeSeekBar = dispatchToRangeSeekBar(motionEvent);
        } else if (action != 1) {
            if (action != 2) {
                dispatchToRangeSeekBar = false;
            } else {
                if (this.mIsScrolling) {
                    dispatchToRangeSeekBar = dispatchToRangeSeekBar(motionEvent);
                } else if (Math.abs(motionEvent.getX() - this.mLastX) <= Math.abs(motionEvent.getY() - this.mLastY) || Math.abs(motionEvent.getX() - this.mDownX) <= this.mTouchSlop) {
                    dispatchToRangeSeekBar = false;
                } else {
                    dispatchToRangeSeekBar = dispatchToRangeSeekBar(motionEvent);
                    this.mIsScrolling = true;
                }
                if (!dispatchToRangeSeekBar) {
                    dispatchToBottomTabBar = dispatchToBottomTabBar(motionEvent);
                }
            }
            dispatchToBottomTabBar = false;
        } else {
            dispatchToRangeSeekBar = this.mIsScrolling ? dispatchToRangeSeekBar(motionEvent) : false;
            dispatchToBottomTabBar = !dispatchToRangeSeekBar ? dispatchToBottomTabBar(motionEvent) : false;
            this.mIsScrolling = false;
            this.mIsDownInTabBar = false;
            this.mIsDownInSeekBar = false;
        }
        this.mLastX = motionEvent.getX();
        this.mLastY = motionEvent.getY();
        return dispatchToBottomTabBar || dispatchToRangeSeekBar;
    }

    private boolean dispatchToBottomTabBar(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("531ff2de", new Object[]{this, motionEvent})).booleanValue();
        }
        View sureBottomBar = sureBottomBar();
        if (sureBottomBar == null) {
            return false;
        }
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        sureBottomBar.getLocationOnScreen(iArr2);
        if (motionEvent.getAction() == 0) {
            float x = iArr[0] + motionEvent.getX();
            float y = iArr[1] + motionEvent.getY();
            this.mIsDownInTabBar = x >= ((float) iArr2[0]) && x < ((float) (iArr2[0] + sureBottomBar.getWidth())) && y >= ((float) iArr2[1]) && y < ((float) (iArr2[1] + sureBottomBar.getHeight()));
        }
        if (this.mIsDownInTabBar) {
            try {
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.offsetLocation(iArr[0] - iArr2[0], iArr[1] - iArr2[1]);
                boolean dispatchTouchEvent = sureBottomBar.dispatchTouchEvent(obtain);
                obtain.recycle();
                return dispatchTouchEvent;
            } catch (Exception e) {
                spz.c(TAG, e.toString());
            }
        }
        return false;
    }

    private boolean dispatchToRangeSeekBar(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("865ec053", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.mItemView != null && this.mRangeSeekBar != null) {
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            int[] iArr2 = new int[2];
            this.mItemView.getLocationOnScreen(iArr2);
            if (motionEvent.getAction() == 0) {
                float x = iArr[0] + motionEvent.getX();
                float y = iArr[1] + motionEvent.getY();
                int[] iArr3 = new int[2];
                this.mRangeSeekBar.getLocationOnScreen(iArr3);
                this.mIsDownInSeekBar = x >= ((float) iArr3[0]) && x < ((float) (iArr3[0] + this.mRangeSeekBar.getWidth())) && y >= ((float) iArr3[1]) && y < ((float) (iArr3[1] + this.mRangeSeekBar.getHeight()));
            }
            if (this.mIsDownInSeekBar) {
                try {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(iArr[0] - iArr2[0], iArr[1] - iArr2[1]);
                    boolean dispatchTouchEvent = this.mItemView.dispatchTouchEvent(obtain);
                    obtain.recycle();
                    return dispatchTouchEvent;
                } catch (Exception e) {
                    spz.c(TAG, e.toString());
                }
            }
        }
        return false;
    }

    private View sureBottomBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("a92f2a1c", new Object[]{this});
        }
        WeakReference<View> weakReference = this.mBottomTabBarRef;
        View view = weakReference != null ? weakReference.get() : null;
        if (view == null && (view = obu.g()) != null) {
            this.mBottomTabBarRef = new WeakReference<>(view);
        }
        return view;
    }
}
