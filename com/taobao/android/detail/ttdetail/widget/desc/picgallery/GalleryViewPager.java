package com.taobao.android.detail.ttdetail.widget.desc.picgallery;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.utils.f;
import com.taobao.android.detail.ttdetail.utils.i;
import com.taobao.android.detail.ttdetail.widget.desc.picgallery.CustomViewPager;
import tb.kge;

/* loaded from: classes5.dex */
public class GalleryViewPager extends CustomViewPager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "GalleryViewPager";
    public TouchImageView mCurrentView;
    private int mPagingDistance;

    static {
        kge.a(92152365);
    }

    public static /* synthetic */ Object ipc$super(GalleryViewPager galleryViewPager, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -1447998406) {
            if (hashCode != -407533570) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
        }
        return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
    }

    public GalleryViewPager(Context context) {
        super(context);
        init(context);
    }

    public GalleryViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        setOverScrollMode(2);
        this.mPagingDistance = f.a(context) / 4;
    }

    @Override // android.support.v4.view.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.mCurrentView == null) {
            return super.onTouchEvent(motionEvent);
        }
        float[] handleMotionEvent = handleMotionEvent(motionEvent);
        if ((motionEvent.getAction() & 255) == 1) {
            try {
                int currentItem = getCurrentItem();
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if (!this.mCurrentView.pagerCanScroll()) {
                    CustomViewPager.a onPageEdgeScrollLimitListener = getOnPageEdgeScrollLimitListener();
                    if (handleMotionEvent != null && this.mCurrentView.onRightSide && handleMotionEvent[0] < (-this.mPagingDistance) && getAdapter().getCount() - 2 <= currentItem && onPageEdgeScrollLimitListener != null) {
                        onPageEdgeScrollLimitListener.onPageLastScrollLimit();
                    }
                    if (handleMotionEvent != null && this.mCurrentView.onLeftSide && handleMotionEvent[0] > 0.0f && currentItem == 0 && onPageEdgeScrollLimitListener != null) {
                        onPageEdgeScrollLimitListener.onPageFirstScrollLimit();
                    }
                }
                return onTouchEvent;
            } catch (Exception e) {
                i.a("GalleryViewPager", "onTouchEvent", e);
                return false;
            }
        } else if (this.mCurrentView.pagerCanScroll()) {
            try {
                return super.onTouchEvent(motionEvent);
            } catch (Exception e2) {
                i.a("GalleryViewPager", "onTouchEvent", e2);
                return false;
            }
        } else if (handleMotionEvent != null && this.mCurrentView.onRightSide && handleMotionEvent[0] < 0.0f) {
            try {
                return super.onTouchEvent(motionEvent);
            } catch (Exception e3) {
                i.a("GalleryViewPager", "onTouchEvent", e3);
                return false;
            }
        } else if (handleMotionEvent != null && this.mCurrentView.onLeftSide && handleMotionEvent[0] > 0.0f) {
            try {
                return super.onTouchEvent(motionEvent);
            } catch (Exception e4) {
                i.a("GalleryViewPager", "onTouchEvent", e4);
                return false;
            }
        } else {
            if (handleMotionEvent == null && (this.mCurrentView.onLeftSide || this.mCurrentView.onRightSide)) {
                try {
                    return super.onTouchEvent(motionEvent);
                } catch (Exception e5) {
                    i.a("GalleryViewPager", "onTouchEvent", e5);
                }
            }
            return false;
        }
    }

    @Override // android.support.v4.view.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        if ((motionEvent.getAction() & 255) == 1) {
            try {
                super.onInterceptTouchEvent(motionEvent);
            } catch (IllegalArgumentException e) {
                i.a("GalleryViewPager", "onInterceptTouchEvent", e);
                return false;
            }
        }
        float[] handleMotionEvent = handleMotionEvent(motionEvent);
        TouchImageView touchImageView = this.mCurrentView;
        if (touchImageView == null) {
            try {
                return super.onInterceptTouchEvent(motionEvent);
            } catch (IllegalArgumentException e2) {
                i.a("GalleryViewPager", "onInterceptTouchEvent", e2);
                return false;
            }
        } else if (touchImageView.pagerCanScroll()) {
            try {
                return super.onInterceptTouchEvent(motionEvent);
            } catch (ArrayIndexOutOfBoundsException e3) {
                i.a("GalleryViewPager", "onInterceptTouchEvent", e3);
                return false;
            } catch (IllegalArgumentException e4) {
                i.a("GalleryViewPager", "onInterceptTouchEvent", e4);
                return false;
            }
        } else if (handleMotionEvent != null && this.mCurrentView.onRightSide && handleMotionEvent[0] < 0.0f) {
            try {
                return super.onInterceptTouchEvent(motionEvent);
            } catch (ArrayIndexOutOfBoundsException e5) {
                i.a("GalleryViewPager", "onInterceptTouchEvent", e5);
                return false;
            } catch (IllegalArgumentException e6) {
                i.a("GalleryViewPager", "onInterceptTouchEvent", e6);
                return false;
            }
        } else if (handleMotionEvent != null && this.mCurrentView.onLeftSide && handleMotionEvent[0] > 0.0f) {
            try {
                return super.onInterceptTouchEvent(motionEvent);
            } catch (ArrayIndexOutOfBoundsException e7) {
                i.a("GalleryViewPager", "onInterceptTouchEvent", e7);
                return false;
            } catch (IllegalArgumentException e8) {
                i.a("GalleryViewPager", "onInterceptTouchEvent", e8);
                return false;
            }
        } else if (handleMotionEvent == null && (this.mCurrentView.onLeftSide || this.mCurrentView.onRightSide)) {
            try {
                return super.onInterceptTouchEvent(motionEvent);
            } catch (ArrayIndexOutOfBoundsException e9) {
                i.a("GalleryViewPager", "onInterceptTouchEvent", e9);
                return false;
            } catch (IllegalArgumentException e10) {
                i.a("GalleryViewPager", "onInterceptTouchEvent", e10);
                return false;
            }
        } else {
            i.a("GalleryViewPager", "onInterceptTouchEvent");
            return false;
        }
    }
}
