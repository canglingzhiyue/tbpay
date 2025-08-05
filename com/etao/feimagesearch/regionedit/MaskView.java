package com.etao.feimagesearch.regionedit;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes3.dex */
public final class MaskView extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean attached;
    private View imageView;
    private boolean isMainMaskFullOfParent;
    private final c maskDrawable;
    private final List<b> objectDrawList;

    static {
        kge.a(1530316211);
    }

    public static /* synthetic */ Object ipc$super(MaskView maskView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else if (hashCode != 1626033557) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onAttachedToWindow();
            return null;
        }
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("459be768", new Object[]{this, new Float(f)});
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaskView(Context context) {
        super(context);
        q.c(context, "context");
        this.maskDrawable = new c();
        this.objectDrawList = new ArrayList(1);
        setPivotX(0.0f);
        setPivotY(0.0f);
    }

    public final boolean isMainMaskFullOfParent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("48df34a", new Object[]{this})).booleanValue() : this.isMainMaskFullOfParent;
    }

    public final void setMainMaskFullOfParent(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7ac8816", new Object[]{this, new Boolean(z)});
        } else {
            this.isMainMaskFullOfParent = z;
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f64be870", new Object[]{this, new Float(f)});
        } else {
            invalidate();
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f800c10f", new Object[]{this, new Float(f)});
        } else {
            invalidate();
        }
    }

    public final void setParts(List<b> parts) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15800416", new Object[]{this, parts});
            return;
        }
        q.c(parts, "parts");
        this.objectDrawList.clear();
        this.objectDrawList.addAll(parts);
        this.maskDrawable.a(parts);
        if (this.attached) {
            onAttached();
        }
        invalidate();
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43e70ec9", new Object[]{this, new Float(f)});
            return;
        }
        this.maskDrawable.a(f);
        for (b bVar : this.objectDrawList) {
            bVar.a(f);
        }
    }

    private final void onAttached() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11f51baa", new Object[]{this});
            return;
        }
        this.maskDrawable.a(this);
        for (b bVar : this.objectDrawList) {
            bVar.a(this);
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        this.attached = true;
        onAttached();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        this.attached = false;
        this.maskDrawable.b(this);
        for (b bVar : this.objectDrawList) {
            bVar.b(this);
        }
    }

    public final void setImageView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e2252cd", new Object[]{this, view});
            return;
        }
        q.c(view, "view");
        this.imageView = view;
    }

    public final int getRealWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eabfd38c", new Object[]{this})).intValue();
        }
        View view = this.imageView;
        if (view == null) {
            return 0;
        }
        return view.getWidth();
    }

    public final int getRealHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("276d3f55", new Object[]{this})).intValue();
        }
        View view = this.imageView;
        if (view == null) {
            return 0;
        }
        return view.getHeight();
    }

    public final View getTargetImageView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("d87cb622", new Object[]{this}) : this.imageView;
    }

    public final void triggerMainMaskViewFullOfParent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a3f2019", new Object[]{this});
        } else {
            this.isMainMaskFullOfParent = true;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
        } else if (canvas != null) {
            this.maskDrawable.a(this, canvas);
            View view = this.imageView;
            if (view == null) {
                q.a();
            }
            float left = view.getLeft();
            View view2 = this.imageView;
            if (view2 == null) {
                q.a();
            }
            float translationX = left + view2.getTranslationX();
            View view3 = this.imageView;
            if (view3 == null) {
                q.a();
            }
            float top = view3.getTop();
            View view4 = this.imageView;
            if (view4 == null) {
                q.a();
            }
            canvas.translate(translationX, top + view4.getTranslationY());
            for (b bVar : this.objectDrawList) {
                bVar.a(this, canvas);
            }
            View view5 = this.imageView;
            if (view5 == null) {
                q.a();
            }
            float f = -view5.getLeft();
            View view6 = this.imageView;
            if (view6 == null) {
                q.a();
            }
            float translationX2 = f - view6.getTranslationX();
            View view7 = this.imageView;
            if (view7 == null) {
                q.a();
            }
            float f2 = -view7.getTop();
            View view8 = this.imageView;
            if (view8 == null) {
                q.a();
            }
            canvas.translate(translationX2, f2 - view8.getTranslationY());
        }
    }
}
