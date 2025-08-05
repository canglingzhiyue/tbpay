package com.etao.feimagesearch.regionedit;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes3.dex */
public final class c implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private List<b> f6962a;
    private final float c;
    private final Paint b = new Paint(1);
    private float d = 1.0f;

    static {
        kge.a(1530130177);
        kge.a(1132942606);
    }

    @Override // com.etao.feimagesearch.regionedit.b
    public RectF a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("f7d777ff", new Object[]{this});
        }
        return null;
    }

    public c() {
        this.b.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OUT));
        this.b.setStyle(Paint.Style.FILL);
        this.c = com.etao.feimagesearch.util.g.a(4.0f);
    }

    private final void a(MaskView maskView, Canvas canvas, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dedebb13", new Object[]{this, maskView, canvas, new Boolean(z)});
            return;
        }
        this.b.setColor(d.$ipChange);
        View targetImageView = maskView.getTargetImageView();
        if (z || targetImageView == null) {
            canvas.drawRect(0.0f, 0.0f, maskView.getWidth(), maskView.getHeight(), this.b);
            return;
        }
        canvas.translate(targetImageView.getLeft() + targetImageView.getTranslationX(), targetImageView.getTop() + targetImageView.getTranslationY());
        canvas.drawRect(0.0f, 0.0f, maskView.getRealWidth() * this.d, maskView.getRealHeight() * this.d, this.b);
        canvas.translate((-targetImageView.getLeft()) - targetImageView.getTranslationX(), (-targetImageView.getTop()) - targetImageView.getTranslationY());
    }

    private final void b(MaskView maskView, Canvas canvas) {
        View targetImageView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21a16d00", new Object[]{this, maskView, canvas});
        } else if (this.f6962a != null && (targetImageView = maskView.getTargetImageView()) != null) {
            this.b.setColor(0);
            canvas.translate(targetImageView.getLeft() + targetImageView.getTranslationX(), targetImageView.getTop() + targetImageView.getTranslationY());
            List<b> list = this.f6962a;
            if (list == null) {
                q.a();
            }
            for (b bVar : list) {
                RectF a2 = bVar.a();
                if (a2 != null) {
                    float f = this.c;
                    canvas.drawRoundRect(a2, f, f, this.b);
                }
            }
            canvas.translate((-targetImageView.getLeft()) - targetImageView.getTranslationX(), (-targetImageView.getTop()) - targetImageView.getTranslationY());
        }
    }

    @Override // com.etao.feimagesearch.regionedit.b
    public void a(MaskView targetView, Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73073e1", new Object[]{this, targetView, canvas});
            return;
        }
        q.c(targetView, "targetView");
        q.c(canvas, "canvas");
        a(targetView, canvas, targetView.isMainMaskFullOfParent());
        b(targetView, canvas);
    }

    @Override // com.etao.feimagesearch.regionedit.b
    public void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
        } else {
            this.d = f;
        }
    }

    public final void a(List<b> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else {
            this.f6962a = list;
        }
    }

    @Override // com.etao.feimagesearch.regionedit.b
    public void a(MaskView view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b09d204", new Object[]{this, view});
            return;
        }
        q.c(view, "view");
        view.setLayerType(2, null);
    }

    @Override // com.etao.feimagesearch.regionedit.b
    public void b(MaskView view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a936c05", new Object[]{this, view});
            return;
        }
        q.c(view, "view");
        view.setLayerType(0, null);
    }
}
