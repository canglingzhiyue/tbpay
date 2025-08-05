package tb;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.view.View;
import android.widget.HorizontalScrollView;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes8.dex */
public class ibp {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final int[] h;
    private static final int[] i;
    private static final int[] j;
    private static final int[] k;

    /* renamed from: a  reason: collision with root package name */
    private View f28898a;
    private int[] b;
    private Shader d;
    private Shader e;
    private Paint c = new Paint(1);
    private Rect f = new Rect();
    private Rect g = new Rect();
    private boolean l = false;
    private boolean m = false;

    static {
        kge.a(-1567866503);
        h = new int[]{0, -16777216};
        i = new int[]{-16777216, 0};
        j = new int[]{0, 0, -16777216};
        k = new int[]{-16777216, 0, 0};
    }

    public ibp(View view) {
        this.f28898a = view;
        this.c.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.l = z;
        }
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.m = z;
        }
    }

    public void a(int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c198176", new Object[]{this, iArr});
            return;
        }
        if (iArr != null && iArr.length != 4) {
            iArr = null;
        }
        this.b = iArr;
        this.f28898a.invalidate();
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        int[] iArr = this.b;
        return iArr != null && (iArr[0] > 0 || iArr[1] > 0);
    }

    public int a(Canvas canvas) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d3f391f0", new Object[]{this, canvas})).intValue() : canvas.saveLayer(0.0f, 0.0f, this.f28898a.getWidth() + this.f28898a.getScrollX(), this.f28898a.getHeight(), null, 31);
    }

    public void a(Canvas canvas, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa7f20a6", new Object[]{this, canvas, new Integer(i2)});
        } else {
            canvas.restoreToCount(i2);
        }
    }

    public void b(Canvas canvas) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4a03d9c", new Object[]{this, canvas});
        } else if (!a()) {
        } else {
            Paint paint = this.c;
            int width = this.f28898a.getWidth() - this.f28898a.getPaddingRight();
            View view = this.f28898a;
            if (view instanceof HorizontalScrollView) {
                if (((HorizontalScrollView) view).getChildCount() == 0) {
                    return;
                }
                view = ((HorizontalScrollView) this.f28898a).getChildAt(0);
            }
            boolean z2 = ((view.getRight() - view.getLeft()) - this.f28898a.getScrollX()) - width > 0;
            if (this.f28898a.getScrollX() <= (this.m ? this.f28898a.getPaddingLeft() : 0)) {
                z = false;
            }
            if (z2 || this.l) {
                c();
                paint.setShader(this.e);
                canvas.drawRect(this.g, paint);
            }
            if (!z && !this.l) {
                return;
            }
            b();
            paint.setShader(this.d);
            canvas.drawRect(this.f, paint);
        }
    }

    private void b() {
        int[] iArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        int[] iArr2 = this.b;
        int i2 = iArr2[0] + iArr2[2];
        int paddingLeft = (this.m ? 0 : this.f28898a.getPaddingLeft()) + this.f28898a.getScrollX();
        int paddingTop = this.f28898a.getPaddingTop();
        int i3 = paddingLeft + i2;
        this.f.set(paddingLeft, paddingTop, i3, this.f28898a.getHeight() - this.f28898a.getPaddingBottom());
        if (this.b[2] > 0) {
            float f = paddingTop;
            this.d = new LinearGradient(paddingLeft, f, i3, f, j, new float[]{0.0f, iArr[2] / i2, 1.0f}, Shader.TileMode.CLAMP);
            return;
        }
        float f2 = paddingTop;
        this.d = new LinearGradient(paddingLeft, f2, i3, f2, h, (float[]) null, Shader.TileMode.CLAMP);
    }

    private void c() {
        int[] iArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        int[] iArr2 = this.b;
        int i2 = iArr2[1] + iArr2[3];
        int paddingLeft = ((this.f28898a.getPaddingLeft() + ((this.f28898a.getWidth() - this.f28898a.getPaddingLeft()) - this.f28898a.getPaddingRight())) - i2) + this.f28898a.getScrollX();
        int paddingTop = this.f28898a.getPaddingTop();
        int i3 = paddingLeft + i2;
        this.g.set(paddingLeft, paddingTop, i3, this.f28898a.getHeight() - this.f28898a.getPaddingBottom());
        if (this.b[3] > 0) {
            float f = paddingTop;
            this.e = new LinearGradient(paddingLeft, f, i3, f, k, new float[]{0.0f, iArr[1] / i2, 1.0f}, Shader.TileMode.CLAMP);
            return;
        }
        float f2 = paddingTop;
        this.e = new LinearGradient(paddingLeft, f2, i3, f2, i, (float[]) null, Shader.TileMode.CLAMP);
    }
}
