package com.taobao.android.searchbaseframe.xsl.section;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.util.j;
import tb.kge;

/* loaded from: classes6.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Rect f15051a;
    private c b;
    private Bitmap g;
    private a j;
    private final RectF c = new RectF();
    private final Paint d = new Paint(1);
    private final Paint e = new Paint(1);
    private final int f = j.a(10.0f);
    private final Path h = new Path();
    private final float[] i = new float[8];

    /* loaded from: classes6.dex */
    public interface a {
        com.taobao.android.searchbaseframe.business.weex.multiplelist.a h();
    }

    static {
        kge.a(-1761228255);
        f15051a = new Rect();
    }

    public g() {
        a();
    }

    public void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d439a6a", new Object[]{this, cVar});
        } else {
            this.b = cVar;
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.d.setStyle(Paint.Style.FILL);
        this.e.setStyle(Paint.Style.FILL);
        this.e.setShader(new LinearGradient(0.0f, this.f, 0.0f, 0.0f, -1, 0, Shader.TileMode.CLAMP));
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e06f0289", new Object[]{this, aVar});
        } else {
            this.j = aVar;
        }
    }

    public void a(Canvas canvas, PartnerRecyclerView partnerRecyclerView) {
        int i;
        int i2;
        boolean z;
        boolean z2;
        int i3;
        int i4;
        int i5;
        RecyclerView.Adapter adapter;
        int i6;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f20a7c5f", new Object[]{this, canvas, partnerRecyclerView});
            return;
        }
        int childCount = partnerRecyclerView.getChildCount();
        int headerViewsCount = partnerRecyclerView.getHeaderViewsCount();
        int footerViewsCount = partnerRecyclerView.getFooterViewsCount();
        RecyclerView.Adapter adapter2 = partnerRecyclerView.getAdapter();
        if (adapter2 == null) {
            return;
        }
        a aVar = this.j;
        com.taobao.android.searchbaseframe.business.weex.multiplelist.a h = aVar == null ? null : aVar.h();
        if (h != null) {
            i = h.d();
            i2 = h.e();
            this.d.setColor(h.c());
            z = h.a();
            z2 = h.b();
        } else {
            i = 0;
            i2 = 0;
            z = true;
            z2 = false;
        }
        int i7 = i;
        int i8 = -1;
        int i9 = 0;
        int i10 = Integer.MIN_VALUE;
        boolean z3 = false;
        boolean z4 = true;
        while (true) {
            if (i9 >= childCount) {
                i3 = i7;
                break;
            }
            View childAt = partnerRecyclerView.getChildAt(i9);
            i3 = i7;
            int childAdapterPosition = partnerRecyclerView.getChildAdapterPosition(childAt);
            if (childAdapterPosition >= headerViewsCount) {
                adapter = adapter2;
                if (childAdapterPosition >= adapter2.getItemCount() - footerViewsCount) {
                    break;
                }
                int i11 = childAdapterPosition - headerViewsCount;
                if (!z || !c(i11)) {
                    if (z4) {
                        if (i11 > 0) {
                            i4 = headerViewsCount;
                            i6 = 0;
                        } else {
                            i4 = headerViewsCount;
                            i6 = i3;
                        }
                        z4 = false;
                    } else {
                        i4 = headerViewsCount;
                        i6 = i3;
                    }
                    h i12 = this.b.i(i11);
                    if ((h == null || h.c() == 0) && (i12 == null || i12.c() == 0)) {
                        i5 = footerViewsCount;
                        i7 = i6;
                    } else {
                        if (h == null && i12 != null) {
                            i5 = footerViewsCount;
                            this.d.setColor(i12.c());
                        } else {
                            i5 = footerViewsCount;
                            if (z2 && i12 != null && i12.c() != 0) {
                                this.d.setColor(i12.c());
                            }
                        }
                        partnerRecyclerView.getDecoratedBoundsWithMargins(childAt, f15051a);
                        if (i10 == Integer.MIN_VALUE) {
                            i10 = f15051a.top;
                        }
                        int i13 = f15051a.bottom;
                        boolean f = this.b.f(i11);
                        if (f || this.b.e(i11 + 1)) {
                            int max = Math.max(i8, i13);
                            this.c.set(0.0f, i10, partnerRecyclerView.getWidth(), max);
                            if (!f && i9 < childCount - 1) {
                                partnerRecyclerView.getDecoratedBoundsWithMargins(partnerRecyclerView.getChildAt(i9 + 1), f15051a);
                                if (this.c.bottom < f15051a.top) {
                                    this.c.bottom = f15051a.top;
                                }
                            }
                            a(canvas, i6, i2, this.c);
                            i7 = i6;
                            i8 = max;
                            i10 = Integer.MIN_VALUE;
                            z3 = false;
                        } else {
                            i8 = Math.max(i8, i13);
                            i7 = i6;
                            z3 = true;
                        }
                    }
                } else {
                    i4 = headerViewsCount;
                    i5 = footerViewsCount;
                    i7 = i3;
                    i10 = Integer.MIN_VALUE;
                }
            } else {
                i4 = headerViewsCount;
                i5 = footerViewsCount;
                adapter = adapter2;
                i7 = i3;
            }
            i9++;
            headerViewsCount = i4;
            adapter2 = adapter;
            footerViewsCount = i5;
        }
        if (!z3) {
            return;
        }
        this.c.set(0.0f, i10, partnerRecyclerView.getWidth(), i8);
        a(canvas, i3, i2, this.c);
    }

    private void a(Canvas canvas, int i, int i2, RectF rectF) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e3d7f2e", new Object[]{this, canvas, new Integer(i), new Integer(i2), rectF});
        } else if (i == 0 && i2 == 0) {
            canvas.drawRect(rectF, this.d);
        } else if (i == i2) {
            float f = i;
            canvas.drawRoundRect(rectF, f, f, this.d);
        } else {
            this.h.reset();
            float[] fArr = this.i;
            float f2 = i;
            fArr[0] = f2;
            fArr[1] = f2;
            fArr[2] = f2;
            fArr[3] = f2;
            float f3 = i2;
            fArr[4] = f3;
            fArr[5] = f3;
            fArr[6] = f3;
            fArr[7] = f3;
            this.h.addRoundRect(rectF, fArr, Path.Direction.CW);
            this.h.close();
            canvas.drawPath(this.h, this.d);
        }
    }

    public void a(Canvas canvas, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1b6743d", new Object[]{this, canvas, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else if (!a(i)) {
        } else {
            b(i3 - i2);
            canvas.drawBitmap(this.g, 0.0f, i4 - this.f, (Paint) null);
        }
    }

    private boolean a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{this, new Integer(i)})).booleanValue();
        }
        BaseCellBean j = this.b.j(i);
        if (j != null && j.isSectionClip()) {
            BaseCellBean j2 = this.b.j(i - 1);
            if (j2 != null && j2.clipHeight > 0) {
                return true;
            }
            BaseCellBean j3 = this.b.j(i - 2);
            if (j3 != null && j3.clipHeight > 0) {
                return true;
            }
        }
        return false;
    }

    private void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else if (this.g != null) {
        } else {
            Canvas canvas = new Canvas();
            this.g = Bitmap.createBitmap(i, this.f, Bitmap.Config.ARGB_4444);
            canvas.setBitmap(this.g);
            Rect rect = new Rect();
            rect.set(0, 0, i, this.f);
            canvas.drawRect(rect, this.e);
        }
    }

    private boolean c(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab8b44dd", new Object[]{this, new Integer(i)})).booleanValue() : this.b.e(i);
    }
}
