package com.taobao.search.sf.newsearch.widgets;

import android.animation.ValueAnimator;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.meta.uikit.MetaLayout;
import com.taobao.search.common.util.l;
import tb.itl;
import tb.kge;

/* loaded from: classes8.dex */
public class a extends com.taobao.android.searchbaseframe.meta.uikit.header.behavior.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final itl e;
    private int f;
    private ValueAnimator g;
    private MetaLayout h;
    private final InterfaceC0787a i;

    /* renamed from: com.taobao.search.sf.newsearch.widgets.a$a  reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    public interface InterfaceC0787a {
        void aI_();
    }

    static {
        kge.a(-861113410);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        if (str.hashCode() == -1474194533) {
            super.a(((Number) objArr[0]).intValue());
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.searchbaseframe.meta.uikit.header.behavior.a, tb.itj
    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        return 0;
    }

    @Override // com.taobao.android.searchbaseframe.meta.uikit.header.behavior.a, tb.itj
    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public static /* synthetic */ int a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8e0112d8", new Object[]{aVar})).intValue() : aVar.b;
    }

    public static /* synthetic */ int a(a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3221bcb1", new Object[]{aVar, new Integer(i)})).intValue();
        }
        aVar.b = i;
        return i;
    }

    public static /* synthetic */ void a(a aVar, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3221b17b", new Object[]{aVar, new Float(f)});
        } else {
            aVar.a(f);
        }
    }

    public static /* synthetic */ View b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("5a4813e8", new Object[]{aVar}) : aVar.j();
    }

    public static /* synthetic */ int c(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("78f55f5a", new Object[]{aVar})).intValue() : aVar.c;
    }

    public static /* synthetic */ MetaLayout d(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MetaLayout) ipChange.ipc$dispatch("73a050a5", new Object[]{aVar}) : aVar.h;
    }

    public static /* synthetic */ itl e(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (itl) ipChange.ipc$dispatch("9c6b9dfc", new Object[]{aVar}) : aVar.e;
    }

    public a(itl itlVar, InterfaceC0787a interfaceC0787a, View view, int i) {
        super(view, true, i);
        this.f = 0;
        this.g = null;
        this.e = itlVar;
        this.i = interfaceC0787a;
    }

    @Override // com.taobao.android.searchbaseframe.meta.uikit.header.behavior.a, tb.itj
    public void a(MetaLayout metaLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5b8809f", new Object[]{this, metaLayout});
        } else {
            this.h = metaLayout;
        }
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        ValueAnimator valueAnimator = this.g;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return;
        }
        this.g.cancel();
        this.g = null;
    }

    @Override // com.taobao.android.searchbaseframe.meta.uikit.header.behavior.a, tb.itj
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            super.a(i);
        }
    }

    @Override // com.taobao.android.searchbaseframe.meta.uikit.header.behavior.a, tb.itj
    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        this.h.setCanFling(true);
        if (this.b <= 0) {
            return;
        }
        this.g = ValueAnimator.ofInt(this.b, 0);
        this.g.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.search.sf.newsearch.widgets.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                    return;
                }
                a.a(a.this, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                a aVar = a.this;
                a.a(aVar, 1.0f - ((Math.min(0, a.a(aVar)) * 1.0f) / ((a.b(a.this).getMeasuredHeight() - a.c(a.this)) - a.d(a.this).getListStart())));
                a.e(a.this).a(true, a.this.h());
                a.d(a.this).requestLayout();
            }
        });
        this.g.start();
        if (this.b < l.a(50)) {
            return;
        }
        this.i.aI_();
    }

    @Override // com.taobao.android.searchbaseframe.meta.uikit.header.behavior.c, tb.itj
    public int a(int i, int i2, int i3) {
        int i4;
        boolean z;
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2619792e", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)})).intValue();
        }
        float f = this.b;
        float f2 = i;
        float f3 = f - f2;
        if (i3 == 0) {
            i();
            if (this.b < 0 || i >= 0) {
                i4 = i;
                z2 = false;
            } else {
                i4 = (int) (f2 * 0.3f);
                if (i4 == 0) {
                    i4 = -1;
                }
                z2 = true;
            }
            float f4 = f - i4;
            if (i4 < -100000 && f4 > 0.0f) {
                f4 = 0.0f;
            } else if (i4 > 0) {
                float f5 = i2;
                if ((j().getMeasuredHeight() + f4) - this.c < f5) {
                    f4 = (f5 - j().getMeasuredHeight()) + this.c;
                }
            }
            this.h.setCanFling(f4 <= 0.0f);
            z = z2;
            f3 = f4;
        } else {
            if (i >= 0 || f3 <= 0.0f) {
                if (i > 0) {
                    float f6 = i2;
                    if ((j().getMeasuredHeight() + f3) - this.c < f6) {
                        f3 = (f6 - j().getMeasuredHeight()) + this.c;
                    }
                }
                i4 = i;
            } else {
                i4 = i;
                f3 = 0.0f;
            }
            z = false;
        }
        this.b = (int) f3;
        a(1.0f - ((Math.abs(Math.min(0, this.b)) * 1.0f) / ((j().getMeasuredHeight() - this.c) - i2)));
        return (i3 != 1 || i4 >= 0) ? z ? i : (int) (f - f3) : i4;
    }

    @Override // com.taobao.android.searchbaseframe.meta.uikit.header.behavior.a
    public int g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f961", new Object[]{this})).intValue() : (-this.b) + this.c;
    }
}
