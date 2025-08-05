package com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader;

import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.lsjwzh.widget.recyclerviewpager.RecyclerViewPager;
import tb.emu;
import tb.kge;

/* loaded from: classes5.dex */
public class GalleryRecyclerView extends RecyclerViewPager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private PointF mCurrentPt;
    private PointF mLastPt;

    static {
        kge.a(-220846697);
    }

    public static /* synthetic */ Object ipc$super(GalleryRecyclerView galleryRecyclerView, String str, Object... objArr) {
        if (str.hashCode() == 2075560917) {
            return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public GalleryRecyclerView(Context context) {
        super(context);
        this.mLastPt = new PointF();
        this.mCurrentPt = new PointF();
        emu.a("com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.GalleryRecyclerView");
    }

    public GalleryRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mLastPt = new PointF();
        this.mCurrentPt = new PointF();
        emu.a("com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.GalleryRecyclerView");
    }

    public GalleryRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mLastPt = new PointF();
        this.mCurrentPt = new PointF();
        emu.a("com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.GalleryRecyclerView");
    }

    public int getDx() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("166c4a04", new Object[]{this})).intValue() : (int) (this.mLastPt.x - this.mCurrentPt.x);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.mLastPt.x = motionEvent.getX();
            this.mLastPt.y = motionEvent.getY();
        } else if (action == 1 || action == 2) {
            this.mCurrentPt.x = motionEvent.getX();
            this.mCurrentPt.y = motionEvent.getY();
        } else if (action == 5 || action == 6) {
            if (motionEvent.getPointerCount() > 1) {
                requestDisallowInterceptTouchEvent(true);
            } else {
                requestDisallowInterceptTouchEvent(false);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
