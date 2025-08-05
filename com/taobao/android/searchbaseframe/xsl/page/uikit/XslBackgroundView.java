package com.taobao.android.searchbaseframe.xsl.page.uikit;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.kge;

/* loaded from: classes6.dex */
public class XslBackgroundView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private float mAlpha;
    private boolean mBgAnim;
    private TUrlImageView mImageView;

    static {
        kge.a(-1330360605);
        kge.a(2046212060);
    }

    public XslBackgroundView(Context context) {
        super(context);
        this.mAlpha = 1.0f;
        this.mBgAnim = true;
        createImageView(context);
    }

    public void createImageView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2be51e9d", new Object[]{this, context});
            return;
        }
        this.mImageView = new TUrlImageView(context);
        this.mImageView.setScaleType(ImageView.ScaleType.FIT_START);
        addView(this.mImageView, -1, -1);
    }

    public void offsetTo(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5be36a8e", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        if (i2 <= i3) {
            this.mAlpha = 1.0f;
        } else {
            this.mAlpha = (i - i3) / (i2 - i3);
        }
        if (!this.mBgAnim) {
            return;
        }
        this.mImageView.setAlpha(this.mAlpha);
    }

    public void setResource(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f2a5121", new Object[]{this, str});
        } else {
            this.mImageView.setImageResource(Integer.parseInt(str));
        }
    }

    public void setImageUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cec106a7", new Object[]{this, str});
        } else {
            this.mImageView.setImageUrl(str);
        }
    }

    public void setBgAnimation(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3823ae50", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mBgAnim = z;
        if (this.mBgAnim) {
            this.mImageView.setAlpha(this.mAlpha);
        } else {
            this.mImageView.setAlpha(1.0f);
        }
    }
}
