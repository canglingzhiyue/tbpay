package com.taobao.android.detail.core.detail.kit.view.widget.base.photo;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.view.widget.base.photo.b;
import com.taobao.android.detail.datasdk.protocol.image.DetailImageView;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class PhotoView extends DetailImageView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final b mAttacher;
    private ImageView.ScaleType mPendingScaleType;

    static {
        kge.a(852653551);
        kge.a(-1119332714);
    }

    public static /* synthetic */ Object ipc$super(PhotoView photoView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1150258430:
                super.setImageDrawable((Drawable) objArr[0]);
                return null;
            case -974402955:
                super.setImageResource(((Number) objArr[0]).intValue());
                return null;
            case 120759747:
                super.setScaleType((ImageView.ScaleType) objArr[0]);
                return null;
            case 792755437:
                super.setImageURI((Uri) objArr[0]);
                return null;
            case 949399698:
                super.onDetachedFromWindow();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public PhotoView(Context context) {
        this(context, null);
    }

    public PhotoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PhotoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setScaleType(ImageView.ScaleType.MATRIX);
        this.mAttacher = new b(this);
        ImageView.ScaleType scaleType = this.mPendingScaleType;
        if (scaleType != null) {
            setScaleType(scaleType);
            this.mPendingScaleType = null;
        }
        emu.a("com.taobao.android.detail.core.detail.kit.view.widget.base.photo.PhotoView");
    }

    public void setmSuppMatrix(Matrix matrix) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee7c987", new Object[]{this, matrix});
        } else if (matrix == null) {
        } else {
            this.mAttacher.a(matrix);
        }
    }

    public void setmCanScale(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55443d88", new Object[]{this, new Boolean(z)});
        } else {
            this.mAttacher.c(z);
        }
    }

    public boolean canZoom() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("12299ace", new Object[]{this})).booleanValue() : this.mAttacher.a();
    }

    public RectF getDisplayRect() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RectF) ipChange.ipc$dispatch("c7965670", new Object[]{this}) : this.mAttacher.c();
    }

    public float getMinScale() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b862e105", new Object[]{this})).floatValue() : this.mAttacher.e();
    }

    public float getMidScale() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2d8475cf", new Object[]{this})).floatValue() : this.mAttacher.f();
    }

    public float getMaxScale() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9c1bb633", new Object[]{this})).floatValue() : this.mAttacher.g();
    }

    public float getScale() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8f6c4a0b", new Object[]{this})).floatValue() : this.mAttacher.h();
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageView.ScaleType) ipChange.ipc$dispatch("16d492db", new Object[]{this}) : this.mAttacher.i();
    }

    public void setAllowParentInterceptOnEdge(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74342f80", new Object[]{this, new Boolean(z)});
        } else {
            this.mAttacher.a(z);
        }
    }

    public void setMinScale(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6d00fbf", new Object[]{this, new Float(f)});
        } else {
            this.mAttacher.a(f);
        }
    }

    public void setMidScale(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15e11435", new Object[]{this, new Float(f)});
        } else {
            this.mAttacher.b(f);
        }
    }

    public void setMaxScale(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a31e051", new Object[]{this, new Float(f)});
        } else {
            this.mAttacher.c(f);
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb707302", new Object[]{this, drawable});
            return;
        }
        super.setImageDrawable(drawable);
        b bVar = this.mAttacher;
        if (bVar == null) {
            return;
        }
        bVar.j();
    }

    public void update() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee4a30d0", new Object[]{this});
            return;
        }
        b bVar = this.mAttacher;
        if (bVar == null) {
            return;
        }
        bVar.j();
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5ebca75", new Object[]{this, new Integer(i)});
            return;
        }
        super.setImageResource(i);
        b bVar = this.mAttacher;
        if (bVar == null) {
            return;
        }
        bVar.j();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f407ced", new Object[]{this, uri});
            return;
        }
        super.setImageURI(uri);
        b bVar = this.mAttacher;
        if (bVar == null) {
            return;
        }
        bVar.j();
    }

    public void setOnMatrixChangeListener(b.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74802403", new Object[]{this, cVar});
        } else {
            this.mAttacher.a(cVar);
        }
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11f73f2f", new Object[]{this, onLongClickListener});
        } else {
            this.mAttacher.a(onLongClickListener);
        }
    }

    public void setOnPhotoTapListener(b.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("321f1222", new Object[]{this, dVar});
        } else {
            this.mAttacher.a(dVar);
        }
    }

    public void setOnViewTapListener(b.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7420964c", new Object[]{this, eVar});
        } else {
            this.mAttacher.a(eVar);
        }
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("732a5c3", new Object[]{this, scaleType});
            return;
        }
        b bVar = this.mAttacher;
        if (bVar != null) {
            bVar.a(scaleType);
        } else {
            this.mPendingScaleType = scaleType;
        }
    }

    public void setZoomable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5540e5e", new Object[]{this, new Boolean(z)});
        } else {
            this.mAttacher.b(z);
        }
    }

    public void zoomTo(float f, float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d99246b", new Object[]{this, new Float(f), new Float(f2), new Float(f3)});
        } else {
            this.mAttacher.b(f, f2, f3);
        }
    }

    @Override // com.taobao.android.detail.datasdk.protocol.image.DetailImageView, android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        this.mAttacher.b();
        super.onDetachedFromWindow();
    }
}
