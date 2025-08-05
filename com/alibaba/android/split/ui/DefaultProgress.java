package com.alibaba.android.split.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes2.dex */
public class DefaultProgress extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private b mProgressDrawable;
    private ImageView mProgressView;

    static {
        kge.a(2080646089);
    }

    public static /* synthetic */ Object ipc$super(DefaultProgress defaultProgress, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1894755994:
                return new Boolean(super.verifyDrawable((Drawable) objArr[0]));
            case 348684699:
                super.onVisibilityChanged((View) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            case 949399698:
                super.onDetachedFromWindow();
                return null;
            case 1389530587:
                super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            case 1626033557:
                super.onAttachedToWindow();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public DefaultProgress(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mProgressDrawable = new b(-1, 16.0f);
        this.mProgressDrawable.setCallback(this);
        View.inflate(context, R.layout.feature_install_progress, this);
        this.mProgressView = (ImageView) findViewById(R.id.at_circularProgress);
        this.mProgressDrawable.a(-6710887);
        this.mProgressDrawable.c(context.getResources().getDisplayMetrics().density * 2.0f);
        int i2 = (int) (context.getResources().getDisplayMetrics().density * 32.0f);
        this.mProgressView.getLayoutParams().width = i2;
        this.mProgressView.getLayoutParams().height = i2;
        this.mProgressView.setImageDrawable(this.mProgressDrawable);
        setBackgroundDrawable(context.getResources().getDrawable(R.drawable.waitview));
        setAlpha(1.0f);
    }

    public DefaultProgress(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DefaultProgress(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        this.mProgressDrawable.setBounds(0, 0, i, i2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        b bVar = this.mProgressDrawable;
        if (bVar == null) {
            return;
        }
        bVar.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        b bVar = this.mProgressDrawable;
        if (bVar == null) {
            return;
        }
        bVar.stop();
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14c8819b", new Object[]{this, view, new Integer(i)});
            return;
        }
        super.onVisibilityChanged(view, i);
        b bVar = this.mProgressDrawable;
        if (bVar == null) {
            return;
        }
        if (i != 8 && i != 4) {
            bVar.start();
        } else {
            this.mProgressDrawable.stop();
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8f105166", new Object[]{this, drawable})).booleanValue() : drawable == this.mProgressDrawable || super.verifyDrawable(drawable);
    }
}
