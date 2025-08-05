package com.taobao.android.detail.core.standard.widget.anchor;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.arc;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class PicGalleryScrollAnchorContainerLayout extends AbsPicGalleryAnchorContainerLayout implements ValueAnimator.AnimatorUpdateListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ANIMATION_DURATION_IN_MILLS = 250;
    public static final String TAG = "PicGalleryScrollAnchorContainerLayout";
    private ValueAnimator mAnimator;
    private b mLastSelectedScrollAnchorModel;
    private int mPreLeft;
    private final Map<String, TextView> mScrollAnchorItemCache;

    static {
        kge.a(-454574875);
        kge.a(1499308443);
    }

    public static /* synthetic */ Object ipc$super(PicGalleryScrollAnchorContainerLayout picGalleryScrollAnchorContainerLayout, String str, Object... objArr) {
        if (str.hashCode() == -244855388) {
            super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public PicGalleryScrollAnchorContainerLayout(Context context) {
        this(context, null);
    }

    public PicGalleryScrollAnchorContainerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PicGalleryScrollAnchorContainerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mScrollAnchorItemCache = new HashMap();
        this.mPreLeft = 0;
        emu.a("com.taobao.android.detail.core.standard.widget.anchor.PicGalleryScrollAnchorContainerLayout");
    }

    @Override // com.taobao.android.detail.core.standard.widget.anchor.AbsPicGalleryAnchorContainerLayout
    public void updateAnchors(c cVar, List<b> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e8e8e4f", new Object[]{this, cVar, list});
            return;
        }
        removeAllViews();
        for (b bVar : list) {
            TextView textView = this.mScrollAnchorItemCache.get(bVar.a());
            if (textView == null) {
                textView = createAnchor(cVar, bVar);
                this.mScrollAnchorItemCache.put(bVar.a(), textView);
            } else {
                textView.setTag(R.id.standard_detail_gallery_tag_gallery_anchor_view_model, bVar);
            }
            addView(textView);
        }
    }

    public void selectAnchor(c cVar, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8af6db9", new Object[]{this, cVar, bVar});
        } else if (!bVar.c()) {
            for (int i = 0; i < getChildCount(); i++) {
                TextView textView = (TextView) getChildAt(i);
                b anchorModelOfAnchorView = getAnchorModelOfAnchorView(textView);
                if (anchorModelOfAnchorView == bVar) {
                    textView.setTextColor(Color.parseColor(cVar.c()));
                    textView.setTypeface(Typeface.DEFAULT_BOLD);
                } else if (anchorModelOfAnchorView == this.mLastSelectedScrollAnchorModel) {
                    textView.setTextColor(Color.parseColor(cVar.d()));
                    textView.setTypeface(Typeface.DEFAULT);
                }
            }
            this.mLastSelectedScrollAnchorModel = bVar;
        }
    }

    public void moveSelectedAnchorToCenter(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45b0dccb", new Object[]{this, new Integer(i)});
        } else if (i == 0) {
        } else {
            int left = getLeft();
            ValueAnimator valueAnimator = this.mAnimator;
            if (valueAnimator != null && valueAnimator.isStarted()) {
                arc.a().a(TAG, "moveSelectedAnchorToCenter", "cancel first");
                this.mAnimator.cancel();
            }
            int i2 = left + i;
            this.mAnimator = ValueAnimator.ofInt(left, i2);
            this.mAnimator.setDuration(250L);
            this.mAnimator.addUpdateListener(this);
            this.mPreLeft = i2;
            this.mAnimator.start();
        }
    }

    public b getLastSelectedScrollAnchorModel() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("5eda17b2", new Object[]{this}) : this.mLastSelectedScrollAnchorModel;
    }

    private b getAnchorModelOfAnchorView(View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("c89d3747", new Object[]{this, view}) : (b) view.getTag(R.id.standard_detail_gallery_tag_gallery_anchor_view_model);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
        } else {
            ViewCompat.offsetLeftAndRight(this, ((Integer) valueAnimator.getAnimatedValue()).intValue() - getLeft());
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        ViewCompat.offsetLeftAndRight(this, this.mPreLeft - i);
    }
}
