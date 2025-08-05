package com.taobao.alimama.cpm;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.utils.c;
import tb.kge;

/* loaded from: classes4.dex */
public class CpmView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ImageView mAdImageView;

    static {
        kge.a(197041658);
    }

    public CpmView(Context context) {
        super(context);
        this.mAdImageView = new ImageView(getContext());
        this.mAdImageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        if (c.i()) {
            this.mAdImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        } else {
            this.mAdImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        }
        addView(this.mAdImageView);
    }

    public void updateAdBitmap(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb69e4c", new Object[]{this, bitmap});
        } else {
            this.mAdImageView.setImageBitmap(bitmap);
        }
    }

    public void updateAdGif(BitmapDrawable bitmapDrawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1e9614", new Object[]{this, bitmapDrawable});
        } else {
            this.mAdImageView.setImageDrawable(bitmapDrawable);
        }
    }
}
