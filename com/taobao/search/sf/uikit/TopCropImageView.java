package com.taobao.search.sf.uikit;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes8.dex */
public final class TopCropImageView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final TUrlImageView innerImageView;

    static {
        kge.a(-1841956560);
    }

    public static /* synthetic */ Object ipc$super(TopCropImageView topCropImageView, String str, Object... objArr) {
        if (str.hashCode() == 1907907562) {
            super.measureChildWithMargins((View) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public TopCropImageView(Context context) {
        super(context);
        this.innerImageView = new TUrlImageView(context);
        this.innerImageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        this.innerImageView.setAdjustViewBounds(true);
        this.innerImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        addView(this.innerImageView);
    }

    public final void setImageUrl(String url) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cec106a7", new Object[]{this, url});
            return;
        }
        q.c(url, "url");
        this.innerImageView.setImageUrl(url);
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71b85bea", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            super.measureChildWithMargins(view, i, i2, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 0), i4);
        }
    }
}
