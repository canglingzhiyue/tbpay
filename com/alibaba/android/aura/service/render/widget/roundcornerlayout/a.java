package com.alibaba.android.aura.service.render.widget.roundcornerlayout;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Paint f2181a;
    private Paint b;
    private float c;
    private float d;
    private float e;
    private float f;
    private boolean g = false;
    private ViewGroup h;

    static {
        kge.a(1700155647);
    }

    private a() {
    }

    public a(ViewGroup viewGroup) {
        this.h = viewGroup;
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        if (b()) {
            float f = this.c;
            if (f == this.d) {
                float f2 = this.e;
                if (f == f2 && f2 == this.f) {
                    final int i = (int) f;
                    this.h.setOutlineProvider(new ViewOutlineProvider() { // from class: com.alibaba.android.aura.service.render.widget.roundcornerlayout.a.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.view.ViewOutlineProvider
                        public void getOutline(View view, Outline outline) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("7054f590", new Object[]{this, view, outline});
                            } else {
                                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), i);
                            }
                        }
                    });
                    this.h.setClipToOutline(true);
                    this.g = true;
                    return;
                }
            }
            float f3 = this.c;
            if (f3 == this.d && this.e == 0.0f && this.f == 0.0f) {
                final int i2 = (int) f3;
                this.h.setOutlineProvider(new ViewOutlineProvider() { // from class: com.alibaba.android.aura.service.render.widget.roundcornerlayout.a.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.ViewOutlineProvider
                    public void getOutline(View view, Outline outline) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7054f590", new Object[]{this, view, outline});
                            return;
                        }
                        outline.setRoundRect(0, -i2, view.getWidth(), view.getHeight(), i2);
                        outline.offset(0, i2);
                    }
                });
                this.h.setClipToOutline(true);
                this.g = true;
                return;
            }
            float f4 = this.e;
            if (f4 == this.f && this.c == 0.0f && this.d == 0.0f) {
                final int i3 = (int) f4;
                this.h.setOutlineProvider(new ViewOutlineProvider() { // from class: com.alibaba.android.aura.service.render.widget.roundcornerlayout.a.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.ViewOutlineProvider
                    public void getOutline(View view, Outline outline) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7054f590", new Object[]{this, view, outline});
                            return;
                        }
                        int width = view.getWidth();
                        int height = view.getHeight();
                        int i4 = i3;
                        outline.setRoundRect(0, 0, width, height + i4, i4);
                        outline.offset(0, -i3);
                    }
                });
                this.h.setClipToOutline(true);
                this.g = true;
                return;
            }
            float f5 = this.c;
            if (f5 == this.e && this.d == 0.0f && this.f == 0.0f) {
                final int i4 = (int) f5;
                this.h.setOutlineProvider(new ViewOutlineProvider() { // from class: com.alibaba.android.aura.service.render.widget.roundcornerlayout.a.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.ViewOutlineProvider
                    public void getOutline(View view, Outline outline) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7054f590", new Object[]{this, view, outline});
                            return;
                        }
                        outline.setRoundRect(-i4, 0, view.getWidth(), view.getHeight(), i4);
                        outline.offset(i4, 0);
                    }
                });
                this.h.setClipToOutline(true);
                this.g = true;
                return;
            }
            float f6 = this.d;
            if (f6 == this.f && this.c == 0.0f && this.e == 0.0f) {
                final int i5 = (int) f6;
                this.h.setOutlineProvider(new ViewOutlineProvider() { // from class: com.alibaba.android.aura.service.render.widget.roundcornerlayout.a.5
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.ViewOutlineProvider
                    public void getOutline(View view, Outline outline) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7054f590", new Object[]{this, view, outline});
                            return;
                        }
                        outline.setRoundRect(0, 0, view.getWidth() + i5, view.getHeight(), i5);
                        outline.offset(-i5, 0);
                    }
                });
                this.h.setClipToOutline(true);
                this.g = true;
                return;
            }
        }
        if (this.f2181a == null) {
            this.f2181a = new Paint();
            this.f2181a.setColor(-1);
            this.f2181a.setAntiAlias(true);
            this.f2181a.setStyle(Paint.Style.FILL);
            this.f2181a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        }
        if (this.b != null) {
            return;
        }
        this.b = new Paint();
        this.b.setXfermode(null);
    }

    public void a(float f, float f2, float f3, float f4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97cbe868", new Object[]{this, new Float(f), new Float(f2), new Float(f3), new Float(f4)});
            return;
        }
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        a();
    }

    public void a(Canvas canvas, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b91a9bfb", new Object[]{this, canvas, runnable});
        } else if (this.g || this.b == null || this.f2181a == null) {
            runnable.run();
        } else {
            canvas.saveLayer(new RectF(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight()), this.b, 31);
            runnable.run();
            a(canvas);
            b(canvas);
            c(canvas);
            d(canvas);
            canvas.restore();
        }
    }

    private void a(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3f391fd", new Object[]{this, canvas});
        } else if (this.c <= 0.0f || this.f2181a == null) {
        } else {
            Path path = new Path();
            path.moveTo(0.0f, this.c);
            path.lineTo(0.0f, 0.0f);
            path.lineTo(this.c, 0.0f);
            float f = this.c;
            path.arcTo(new RectF(0.0f, 0.0f, f * 2.0f, f * 2.0f), -90.0f, -90.0f);
            path.close();
            canvas.drawPath(path, this.f2181a);
        }
    }

    private void b(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4a03d9c", new Object[]{this, canvas});
        } else if (this.d <= 0.0f || this.f2181a == null) {
        } else {
            int width = this.h.getWidth();
            Path path = new Path();
            float f = width;
            path.moveTo(f - this.d, 0.0f);
            path.lineTo(f, 0.0f);
            path.lineTo(f, this.d);
            float f2 = this.d;
            path.arcTo(new RectF(f - (f2 * 2.0f), 0.0f, f, f2 * 2.0f), 0.0f, -90.0f);
            path.close();
            canvas.drawPath(path, this.f2181a);
        }
    }

    private void c(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d54ce93b", new Object[]{this, canvas});
        } else if (this.e <= 0.0f || this.f2181a == null) {
        } else {
            int height = this.h.getHeight();
            Path path = new Path();
            float f = height;
            path.moveTo(0.0f, f - this.e);
            path.lineTo(0.0f, f);
            path.lineTo(this.e, f);
            float f2 = this.e;
            path.arcTo(new RectF(0.0f, f - (f2 * 2.0f), f2 * 2.0f, f), 90.0f, 90.0f);
            path.close();
            canvas.drawPath(path, this.f2181a);
        }
    }

    private void d(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5f994da", new Object[]{this, canvas});
        } else if (this.f <= 0.0f || this.f2181a == null) {
        } else {
            int height = this.h.getHeight();
            int width = this.h.getWidth();
            Path path = new Path();
            float f = width;
            float f2 = height;
            path.moveTo(f - this.f, f2);
            path.lineTo(f, f2);
            path.lineTo(f, f2 - this.f);
            float f3 = this.f;
            path.arcTo(new RectF(f - (f3 * 2.0f), f2 - (f3 * 2.0f), f, f2), 0.0f, 90.0f);
            path.close();
            canvas.drawPath(path, this.f2181a);
        }
    }

    private boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : Build.VERSION.SDK_INT >= 22 && Build.VERSION.SDK_INT < 29;
    }
}
