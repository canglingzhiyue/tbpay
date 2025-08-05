package com.taobao.uikit.feature.features;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.feature.callback.CanvasCallback;
import com.taobao.uikit.feature.callback.ImageCallback;
import com.taobao.uikit.feature.callback.LayoutCallback;

/* loaded from: classes9.dex */
public class RoundRectShapeFeature extends AbsFeature<ImageView> implements CanvasCallback, ImageCallback, LayoutCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private float topLeftRadius = 0.0f;
    private float topRightRadius = 0.0f;
    private float bottomLeftRadius = 0.0f;
    private float bottomRightRadius = 0.0f;
    private boolean isOutlineProviderSet = false;

    public static /* synthetic */ Object ipc$super(RoundRectShapeFeature roundRectShapeFeature, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.uikit.feature.callback.CanvasCallback
    public void afterDispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84822824", new Object[]{this, canvas});
        }
    }

    @Override // com.taobao.uikit.feature.callback.CanvasCallback
    public void afterDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f42b97e", new Object[]{this, canvas});
        }
    }

    @Override // com.taobao.uikit.feature.callback.CanvasCallback
    public void afterOnDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99d9525f", new Object[]{this, canvas});
        }
    }

    @Override // com.taobao.uikit.feature.callback.CanvasCallback
    public void beforeDispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8b3e1e1", new Object[]{this, canvas});
        }
    }

    @Override // com.taobao.uikit.feature.callback.CanvasCallback
    public void beforeDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6014803b", new Object[]{this, canvas});
        }
    }

    @Override // com.taobao.uikit.feature.callback.CanvasCallback
    public void beforeOnDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd545ddc", new Object[]{this, canvas});
        }
    }

    @Override // com.taobao.uikit.feature.callback.LayoutCallback
    public void beforeOnLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed76dbe5", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
    }

    @Override // com.taobao.uikit.feature.features.AbsFeature
    public void constructor(Context context, AttributeSet attributeSet, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8928939c", new Object[]{this, context, attributeSet, new Integer(i)});
        }
    }

    @Override // com.taobao.uikit.feature.callback.ImageCallback
    public Drawable wrapImageDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Drawable) ipChange.ipc$dispatch("442ee360", new Object[]{this, drawable}) : drawable;
    }

    @Override // com.taobao.uikit.feature.callback.LayoutCallback
    public void afterOnLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c4dfb28", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            clipHost();
        }
    }

    public void setCornerRadius(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81c784f0", new Object[]{this, new Float(f)});
        } else if (f < 0.0f) {
        } else {
            setCornerRadius(f, f, f, f);
        }
    }

    public void setCornerRadius(float f, float f2, float f3, float f4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92d984d0", new Object[]{this, new Float(f), new Float(f2), new Float(f3), new Float(f4)});
        } else if (f < 0.0f || f2 < 0.0f || f3 < 0.0f || f4 < 0.0f) {
        } else {
            this.topLeftRadius = f;
            this.topRightRadius = f2;
            this.bottomLeftRadius = f3;
            this.bottomRightRadius = f4;
            this.isOutlineProviderSet = false;
        }
    }

    public void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        ImageView host = getHost();
        if (Build.VERSION.SDK_INT <= 21 || host == null) {
            return;
        }
        host.setOutlineProvider(null);
        host.setClipToOutline(false);
        this.isOutlineProviderSet = false;
    }

    private boolean floatRadiusCompare(float f, float f2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57736482", new Object[]{this, new Float(f), new Float(f2)})).booleanValue() : Float.compare(f, f2) == 0;
    }

    private void clipHost() {
        int i;
        final int i2;
        final int i3;
        final int i4;
        int i5;
        final int i6;
        final int i7;
        final int i8;
        final int i9;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc1c1d9f", new Object[]{this});
            return;
        }
        ImageView host = getHost();
        if (Build.VERSION.SDK_INT <= 21 || host == null || this.isOutlineProviderSet) {
            return;
        }
        int i10 = -1;
        if (floatRadiusCompare(this.topLeftRadius, this.topRightRadius) && floatRadiusCompare(this.topLeftRadius, this.bottomLeftRadius) && floatRadiusCompare(this.bottomLeftRadius, this.bottomRightRadius)) {
            i10 = (int) this.topLeftRadius;
        }
        if (floatRadiusCompare(this.topLeftRadius, this.topRightRadius) && this.bottomLeftRadius == 0.0f && this.bottomRightRadius == 0.0f) {
            i10 = (int) this.topLeftRadius;
            i2 = -i10;
            i = i10;
        } else {
            i = 0;
            i2 = 0;
        }
        if (floatRadiusCompare(this.bottomLeftRadius, this.bottomRightRadius) && this.topLeftRadius == 0.0f && this.topRightRadius == 0.0f) {
            i10 = (int) this.bottomLeftRadius;
            i4 = i10;
            i3 = -i10;
        } else {
            i3 = i;
            i4 = 0;
        }
        if (floatRadiusCompare(this.topLeftRadius, this.bottomLeftRadius) && this.topRightRadius == 0.0f && this.bottomRightRadius == 0.0f) {
            i10 = (int) this.topLeftRadius;
            i6 = -i10;
            i5 = i10;
        } else {
            i5 = 0;
            i6 = 0;
        }
        if (floatRadiusCompare(this.topRightRadius, this.bottomRightRadius) && this.topLeftRadius == 0.0f && this.bottomLeftRadius == 0.0f) {
            int i11 = (int) this.topRightRadius;
            i8 = -i11;
            i9 = i11;
            i7 = i9;
        } else {
            i7 = i10;
            i8 = i5;
            i9 = 0;
        }
        if (i7 < 0) {
            return;
        }
        host.setOutlineProvider(new ViewOutlineProvider() { // from class: com.taobao.uikit.feature.features.RoundRectShapeFeature.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7054f590", new Object[]{this, view, outline});
                    return;
                }
                outline.setRoundRect(i6, i2, view.getWidth() + i9, view.getHeight() + i4, i7);
                outline.offset(i8, i3);
            }
        });
        host.setClipToOutline(true);
        this.isOutlineProviderSet = true;
    }
}
