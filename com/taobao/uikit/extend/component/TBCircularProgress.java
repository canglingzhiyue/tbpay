package com.taobao.uikit.extend.component;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.material.TBCircularProgressDrawable;
import tb.kge;

/* loaded from: classes9.dex */
public class TBCircularProgress extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private float mAlpha;
    private Drawable mProgressBackground;
    private TBCircularProgressDrawable mProgressDrawable;
    private String mProgressText;
    private ImageView mProgressView;
    private int mRingColor;
    private int mRingSize;
    private int mRingWidth;
    private int mTextColor;
    private int mTextSize;
    private TextView mTextView;

    static {
        kge.a(1753366785);
    }

    public static /* synthetic */ Object ipc$super(TBCircularProgress tBCircularProgress, String str, Object... objArr) {
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

    public TBCircularProgress(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mAlpha = 1.0f;
        this.mProgressDrawable = new TBCircularProgressDrawable(-1, 16.0f);
        this.mProgressDrawable.setCallback(this);
        View.inflate(context, R.layout.uik_circular_progress, this);
        this.mProgressView = (ImageView) findViewById(R.id.uik_circularProgress);
        this.mTextView = (TextView) findViewById(R.id.uik_progressText);
        setOrientation(1);
        initAttr(context, attributeSet, i);
        updateView();
    }

    public TBCircularProgress(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TBCircularProgress(Context context) {
        this(context, null);
    }

    private void initAttr(Context context, AttributeSet attributeSet, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d31a655", new Object[]{this, context, attributeSet, new Integer(i)});
        } else if (attributeSet != null) {
            Resources resources = context.getResources();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.TBCircularProgress, i, 0);
            if (obtainStyledAttributes == null) {
                return;
            }
            this.mRingColor = obtainStyledAttributes.getColor(R.styleable.TBCircularProgress_uik_ringColor, resources.getColor(R.color.uik_ringColor));
            this.mRingWidth = (int) obtainStyledAttributes.getDimension(R.styleable.TBCircularProgress_uik_ringWidth, resources.getDimension(R.dimen.uik_ringWidth));
            this.mRingSize = (int) obtainStyledAttributes.getDimension(R.styleable.TBCircularProgress_uik_ringSize, resources.getDimension(R.dimen.uik_ringSize));
            this.mProgressText = obtainStyledAttributes.getString(R.styleable.TBCircularProgress_uik_progressText);
            this.mTextSize = (int) obtainStyledAttributes.getDimension(R.styleable.TBCircularProgress_uik_progressTextSize, resources.getDimension(R.dimen.uik_progressTextSize));
            this.mTextColor = obtainStyledAttributes.getColor(R.styleable.TBCircularProgress_uik_progressTextColor, resources.getColor(R.color.uik_progressTextColor));
            this.mAlpha = obtainStyledAttributes.getFloat(R.styleable.TBCircularProgress_uik_progressAlpha, 1.0f);
            this.mProgressBackground = obtainStyledAttributes.getDrawable(R.styleable.TBCircularProgress_uik_progressBackground);
            if (this.mProgressBackground == null) {
                this.mProgressBackground = resources.getDrawable(R.drawable.uik_shape_waitview);
            }
            obtainStyledAttributes.recycle();
        } else {
            this.mRingColor = ContextCompat.getColor(getContext(), R.color.uik_ringColor);
            this.mRingWidth = (int) getContext().getResources().getDimension(R.dimen.uik_ringWidth);
            this.mRingSize = (int) getContext().getResources().getDimension(R.dimen.uik_ringSize);
            this.mTextSize = (int) getContext().getResources().getDimension(R.dimen.uik_progressTextSize);
            this.mTextColor = ContextCompat.getColor(getContext(), R.color.uik_progressTextColor);
            this.mAlpha = 1.0f;
            if (this.mProgressBackground != null) {
                return;
            }
            this.mProgressBackground = ContextCompat.getDrawable(getContext(), R.drawable.uik_shape_waitview);
        }
    }

    private void updateView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b12a895", new Object[]{this});
            return;
        }
        this.mProgressDrawable.setRingColor(this.mRingColor);
        this.mProgressDrawable.setRingWidth(this.mRingWidth);
        this.mProgressView.getLayoutParams().width = this.mRingSize;
        this.mProgressView.getLayoutParams().height = this.mRingSize;
        this.mProgressView.setImageDrawable(this.mProgressDrawable);
        String str = this.mProgressText;
        if (str != null) {
            this.mTextView.setText(str);
        }
        this.mTextView.setTextSize(0, this.mTextSize);
        this.mTextView.setTextColor(this.mTextColor);
        setBackgroundDrawable(this.mProgressBackground);
        setAlpha(this.mAlpha);
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
        TBCircularProgressDrawable tBCircularProgressDrawable = this.mProgressDrawable;
        if (tBCircularProgressDrawable == null) {
            return;
        }
        tBCircularProgressDrawable.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        TBCircularProgressDrawable tBCircularProgressDrawable = this.mProgressDrawable;
        if (tBCircularProgressDrawable == null) {
            return;
        }
        tBCircularProgressDrawable.stop();
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14c8819b", new Object[]{this, view, new Integer(i)});
            return;
        }
        super.onVisibilityChanged(view, i);
        TBCircularProgressDrawable tBCircularProgressDrawable = this.mProgressDrawable;
        if (tBCircularProgressDrawable == null) {
            return;
        }
        if (i == 8 || i == 4) {
            this.mProgressDrawable.stop();
        } else {
            tBCircularProgressDrawable.start();
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8f105166", new Object[]{this, drawable})).booleanValue() : drawable == this.mProgressDrawable || super.verifyDrawable(drawable);
    }

    public void setRingColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1643f52b", new Object[]{this, new Integer(i)});
            return;
        }
        this.mRingColor = i;
        updateView();
    }

    public void setRingWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6acb7ca8", new Object[]{this, new Integer(i)});
            return;
        }
        this.mRingWidth = i;
        updateView();
    }

    public void setRingSize(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8475c669", new Object[]{this, new Integer(i)});
            return;
        }
        this.mRingSize = i;
        updateView();
    }

    public void setProgressText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c547200d", new Object[]{this, str});
            return;
        }
        this.mProgressText = str;
        updateView();
    }

    public void setTextSize(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b5ef80c", new Object[]{this, new Integer(i)});
            return;
        }
        this.mTextSize = i;
        updateView();
    }

    public void setTextColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc80f7e8", new Object[]{this, new Integer(i)});
            return;
        }
        this.mTextColor = i;
        updateView();
    }
}
