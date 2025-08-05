package com.taobao.ptr;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.ptr.PullBase;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes7.dex */
public class PullLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int mLayoutId;
    private final PullBase.Mode mMode;
    private int mScrollDirection;

    /* renamed from: com.taobao.ptr.PullLayout$1  reason: invalid class name */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f18958a = new int[PullBase.Mode.values().length];

        static {
            try {
                f18958a[PullBase.Mode.PULL_FROM_END.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18958a[PullBase.Mode.PULL_FROM_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        kge.a(-564198237);
    }

    public static /* synthetic */ Object ipc$super(PullLayout pullLayout, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public void onInit(Context context, PullBase.Mode mode, int i, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47e6ed4f", new Object[]{this, context, mode, new Integer(i), attributeSet});
        }
    }

    public void onScrollDirectionUpdated(PullBase.Mode mode, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("babf5d42", new Object[]{this, mode, new Integer(i)});
        }
    }

    public PullLayout(Context context, PullBase.Mode mode, int i, AttributeSet attributeSet) {
        super(context);
        this.mLayoutId = -1;
        this.mMode = mode;
        this.mScrollDirection = i;
        init(context, mode, i, attributeSet);
    }

    public void updateScrollDirection(PullBase.Mode mode, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74c18061", new Object[]{this, mode, new Integer(i)});
            return;
        }
        this.mScrollDirection = i;
        onScrollDirectionUpdated(mode, i);
    }

    private void init(Context context, PullBase.Mode mode, int i, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5594eae", new Object[]{this, context, mode, new Integer(i), attributeSet});
            return;
        }
        Drawable drawable = null;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.Pull);
        if (AnonymousClass1.f18958a[mode.ordinal()] == 1) {
            if (obtainStyledAttributes.hasValue(R.styleable.Pull_pullEndBackground)) {
                drawable = obtainStyledAttributes.getDrawable(R.styleable.Pull_pullEndBackground);
            }
            if (obtainStyledAttributes.hasValue(R.styleable.Pull_pullEndLayout)) {
                this.mLayoutId = obtainStyledAttributes.getResourceId(R.styleable.Pull_pullEndLayout, -1);
            }
        } else {
            if (obtainStyledAttributes.hasValue(R.styleable.Pull_pullStartBackground)) {
                drawable = obtainStyledAttributes.getDrawable(R.styleable.Pull_pullStartBackground);
            }
            if (obtainStyledAttributes.hasValue(R.styleable.Pull_pullStartLayout)) {
                this.mLayoutId = obtainStyledAttributes.getResourceId(R.styleable.Pull_pullStartLayout, -1);
            }
        }
        obtainStyledAttributes.recycle();
        setPullBackground(drawable);
        inflateChildLayout(this.mLayoutId);
        onInit(context, mode, i, attributeSet);
    }

    private void inflateChildLayout(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73223fdd", new Object[]{this, new Integer(i)});
        } else if (i <= 0) {
        } else {
            LayoutInflater.from(getContext()).inflate(this.mLayoutId, (ViewGroup) this, true);
        }
    }

    public final void setHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fde48d3", new Object[]{this, new Integer(i)});
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        layoutParams.height = View.MeasureSpec.makeMeasureSpec(i, 1073741824);
        setLayoutParams(layoutParams);
        requestLayout();
    }

    public final void setWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baf60358", new Object[]{this, new Integer(i)});
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        layoutParams.width = View.MeasureSpec.makeMeasureSpec(i, 1073741824);
        setLayoutParams(layoutParams);
        requestLayout();
    }

    public final int getLayoutId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bf537e55", new Object[]{this})).intValue() : this.mLayoutId;
    }

    public final PullBase.Mode getMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PullBase.Mode) ipChange.ipc$dispatch("c0b499e8", new Object[]{this}) : this.mMode;
    }

    public final int getScrollDirection() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bc210f76", new Object[]{this})).intValue() : this.mScrollDirection;
    }

    public final void setPullBackground(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab673980", new Object[]{this, drawable});
        } else if (drawable == null) {
        } else {
            i.a(this, drawable);
        }
    }
}
