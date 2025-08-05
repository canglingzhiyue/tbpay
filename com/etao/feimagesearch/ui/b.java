package com.etao.feimagesearch.ui;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.v4.view.InputDeviceCompat;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.util.g;
import java.util.LinkedList;
import java.util.List;
import tb.kge;

/* loaded from: classes3.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private View h;

    /* renamed from: a  reason: collision with root package name */
    private final int f6995a = -1;
    private final int b = InputDeviceCompat.SOURCE_ANY;
    private final int c = g.a(8.0f);
    private final int d = g.a(5.0f);
    private List<a> e = new LinkedList();
    private ValueAnimator f = ValueAnimator.ofInt(0, 300);
    private float g = 0.0f;
    private Paint i = new Paint(1);

    static {
        kge.a(1944642224);
    }

    public static /* synthetic */ float a(b bVar, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8e20dccd", new Object[]{bVar, new Float(f)})).floatValue();
        }
        bVar.g = f;
        return f;
    }

    public static /* synthetic */ List a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("c1090a4", new Object[]{bVar}) : bVar.e;
    }

    public b(final View view, int i) {
        this.h = view;
        this.f.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.etao.feimagesearch.ui.b.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                } else if (b.a(b.this).isEmpty()) {
                } else {
                    b.a(b.this, valueAnimator.getAnimatedFraction());
                    view.invalidate();
                }
            }
        });
        this.f.setStartDelay(i);
    }

    public void a(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3f391fd", new Object[]{this, canvas});
            return;
        }
        for (a aVar : this.e) {
            this.i.setAlpha((int) (this.g * 255.0f));
            this.i.setColor(-1);
            canvas.drawCircle(a.a(aVar), a.b(aVar), this.g * this.c, this.i);
            this.i.setColor(InputDeviceCompat.SOURCE_ANY);
            canvas.drawCircle(a.a(aVar), a.b(aVar), this.g * this.d, this.i);
        }
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.e.isEmpty();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.f.start();
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.e.clear();
        if (!this.f.isRunning()) {
            return;
        }
        this.f.cancel();
    }

    public void a(List<RectF> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else {
            b(list);
        }
    }

    private void b(List<RectF> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39e1eda", new Object[]{this, list});
        } else if (list != null && !list.isEmpty()) {
            for (RectF rectF : list) {
                a aVar = new a();
                a.a(aVar, ((int) (rectF.left * this.h.getWidth())) + (((int) (rectF.width() * this.h.getWidth())) / 2.0f));
                a.b(aVar, ((int) (rectF.top * this.h.getHeight())) + (((int) (rectF.height() * this.h.getHeight())) / 2.0f));
                this.e.add(aVar);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private float f6997a;
        private float b;

        static {
            kge.a(1470008978);
        }

        private a() {
        }

        public static /* synthetic */ float a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("34c32696", new Object[]{aVar})).floatValue() : aVar.f6997a;
        }

        public static /* synthetic */ float a(a aVar, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("63a215ca", new Object[]{aVar, new Float(f)})).floatValue();
            }
            aVar.f6997a = f;
            return f;
        }

        public static /* synthetic */ float b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a9025ef5", new Object[]{aVar})).floatValue() : aVar.b;
        }

        public static /* synthetic */ float b(a aVar, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("7749e94b", new Object[]{aVar, new Float(f)})).floatValue();
            }
            aVar.b = f;
            return f;
        }
    }
}
