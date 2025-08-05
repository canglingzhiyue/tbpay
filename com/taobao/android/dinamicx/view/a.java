package com.taobao.android.dinamicx.view;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private float f11952a;
    private float b;
    private float c;
    private float d;
    private Paint e;
    private Paint f;
    private boolean g = false;

    static {
        kge.a(2059460497);
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.g;
    }

    private void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            return;
        }
        if (b()) {
            float f = this.f11952a;
            if (f == this.b) {
                float f2 = this.c;
                if (f == f2 && f2 == this.d) {
                    final int i = (int) f;
                    view.setOutlineProvider(new ViewOutlineProvider() { // from class: com.taobao.android.dinamicx.view.a.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.view.ViewOutlineProvider
                        public void getOutline(View view2, Outline outline) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("7054f590", new Object[]{this, view2, outline});
                            } else {
                                outline.setRoundRect(0, 0, view2.getWidth(), view2.getHeight(), i);
                            }
                        }
                    });
                    view.setClipToOutline(true);
                    this.g = true;
                    return;
                }
            }
            float f3 = this.f11952a;
            if (f3 == this.b && this.c == 0.0f && this.d == 0.0f) {
                final int i2 = (int) f3;
                view.setOutlineProvider(new ViewOutlineProvider() { // from class: com.taobao.android.dinamicx.view.a.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.ViewOutlineProvider
                    public void getOutline(View view2, Outline outline) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7054f590", new Object[]{this, view2, outline});
                            return;
                        }
                        outline.setRoundRect(0, -i2, view2.getWidth(), view2.getHeight(), i2);
                        outline.offset(0, i2);
                    }
                });
                view.setClipToOutline(true);
                this.g = true;
                return;
            }
            float f4 = this.c;
            if (f4 == this.d && this.f11952a == 0.0f && this.b == 0.0f) {
                final int i3 = (int) f4;
                view.setOutlineProvider(new ViewOutlineProvider() { // from class: com.taobao.android.dinamicx.view.a.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.ViewOutlineProvider
                    public void getOutline(View view2, Outline outline) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7054f590", new Object[]{this, view2, outline});
                            return;
                        }
                        int width = view2.getWidth();
                        int height = view2.getHeight();
                        int i4 = i3;
                        outline.setRoundRect(0, 0, width, height + i4, i4);
                        outline.offset(0, -i3);
                    }
                });
                view.setClipToOutline(true);
                this.g = true;
                return;
            }
            float f5 = this.f11952a;
            if (f5 == this.c && this.b == 0.0f && this.d == 0.0f) {
                final int i4 = (int) f5;
                view.setOutlineProvider(new ViewOutlineProvider() { // from class: com.taobao.android.dinamicx.view.a.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.ViewOutlineProvider
                    public void getOutline(View view2, Outline outline) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7054f590", new Object[]{this, view2, outline});
                            return;
                        }
                        outline.setRoundRect(-i4, 0, view2.getWidth(), view2.getHeight(), i4);
                        outline.offset(i4, 0);
                    }
                });
                view.setClipToOutline(true);
                this.g = true;
                return;
            }
            float f6 = this.b;
            if (f6 == this.d && this.f11952a == 0.0f && this.c == 0.0f) {
                final int i5 = (int) f6;
                view.setOutlineProvider(new ViewOutlineProvider() { // from class: com.taobao.android.dinamicx.view.a.5
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.ViewOutlineProvider
                    public void getOutline(View view2, Outline outline) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7054f590", new Object[]{this, view2, outline});
                            return;
                        }
                        outline.setRoundRect(0, 0, view2.getWidth() + i5, view2.getHeight(), i5);
                        outline.offset(-i5, 0);
                    }
                });
                view.setClipToOutline(true);
                this.g = true;
                return;
            }
        }
        this.e = new Paint();
        this.e.setColor(-1);
        this.e.setAntiAlias(true);
        this.e.setStyle(Paint.Style.FILL);
        this.e.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.f = new Paint();
        this.f.setXfermode(null);
    }

    public void a(View view, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3af196", new Object[]{this, view, new Float(f)});
        } else {
            a(view, f, f, f, f);
        }
    }

    public void a(View view, float f, float f2, float f3, float f4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1ea0e6a", new Object[]{this, view, new Float(f), new Float(f2), new Float(f3), new Float(f4)});
            return;
        }
        this.f11952a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        a(view);
    }

    public void a(View view, Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f54a13b", new Object[]{this, view, canvas});
        } else {
            canvas.saveLayer(new RectF(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight()), this.f, 31);
        }
    }

    public void b(View view, Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ede3b3c", new Object[]{this, view, canvas});
            return;
        }
        c(view, canvas);
        d(view, canvas);
        e(view, canvas);
        f(view, canvas);
        canvas.restore();
    }

    private void c(View view, Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e67d53d", new Object[]{this, view, canvas});
        } else if (this.f11952a <= 0.0f) {
        } else {
            Path path = new Path();
            path.moveTo(0.0f, this.f11952a);
            path.lineTo(0.0f, 0.0f);
            path.lineTo(this.f11952a, 0.0f);
            float f = this.f11952a;
            path.arcTo(new RectF(0.0f, 0.0f, f * 2.0f, f * 2.0f), -90.0f, -90.0f);
            path.close();
            canvas.drawPath(path, this.e);
        }
    }

    private void d(View view, Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8df16f3e", new Object[]{this, view, canvas});
        } else if (this.b <= 0.0f) {
        } else {
            int width = view.getWidth();
            Path path = new Path();
            float f = width;
            path.moveTo(f - this.b, 0.0f);
            path.lineTo(f, 0.0f);
            path.lineTo(f, this.b);
            float f2 = this.b;
            path.arcTo(new RectF(f - (f2 * 2.0f), 0.0f, f, f2 * 2.0f), 0.0f, -90.0f);
            path.close();
            canvas.drawPath(path, this.e);
        }
    }

    private void e(View view, Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d7b093f", new Object[]{this, view, canvas});
        } else if (this.c <= 0.0f) {
        } else {
            int height = view.getHeight();
            Path path = new Path();
            float f = height;
            path.moveTo(0.0f, f - this.c);
            path.lineTo(0.0f, f);
            path.lineTo(this.c, f);
            float f2 = this.c;
            path.arcTo(new RectF(0.0f, f - (f2 * 2.0f), f2 * 2.0f, f), 90.0f, 90.0f);
            path.close();
            canvas.drawPath(path, this.e);
        }
    }

    private void f(View view, Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d04a340", new Object[]{this, view, canvas});
        } else if (this.d <= 0.0f) {
        } else {
            int height = view.getHeight();
            int width = view.getWidth();
            Path path = new Path();
            float f = width;
            float f2 = height;
            path.moveTo(f - this.d, f2);
            path.lineTo(f, f2);
            path.lineTo(f, f2 - this.d);
            float f3 = this.d;
            path.arcTo(new RectF(f - (f3 * 2.0f), f2 - (f3 * 2.0f), f, f2), 0.0f, 90.0f);
            path.close();
            canvas.drawPath(path, this.e);
        }
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : Build.VERSION.SDK_INT >= 22;
    }
}
