package tb;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_uikit.util.b;

/* loaded from: classes6.dex */
public class jwx extends jwy {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int b;
    private int c;
    private String d;
    private Shader e;
    private int f;
    private int g;
    private Paint h;
    private int i;
    private int j;
    private Rect k;
    private boolean l;
    private final boolean m;

    static {
        kge.a(1027761855);
    }

    public static /* synthetic */ Object ipc$super(jwx jwxVar, String str, Object... objArr) {
        if (str.hashCode() == -2054040210) {
            super.onBoundsChange((Rect) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.jwy, android.graphics.drawable.Drawable
    public int getOpacity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2242c5cf", new Object[]{this})).intValue();
        }
        return -1;
    }

    public jwx(String str, int i, int i2) {
        this.j = 0;
        this.l = true;
        this.d = str;
        this.b = i;
        this.c = i2;
        this.m = false;
        a(true);
    }

    public jwx(int i) {
        this.j = 0;
        this.l = true;
        this.i = i;
        this.m = true;
        a(false);
        if (i == 0) {
            this.l = false;
        }
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.h = new Paint(1);
        this.k = new Rect();
        if (!z) {
            this.h.setColor(this.i);
        }
        this.h.setStyle(Paint.Style.FILL);
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8591d56e", new Object[]{this, rect});
            return;
        }
        super.onBoundsChange(rect);
        this.k.set(rect);
        if (this.d == null) {
            return;
        }
        if (this.e == null || this.f != rect.width() || this.g != rect.height()) {
            float[] a2 = b.a(this.d, rect.width(), rect.height());
            this.e = new LinearGradient(a2[0], a2[1], a2[2], a2[3], this.b, this.c, Shader.TileMode.CLAMP);
            this.h.setShader(this.e);
        }
        this.f = rect.width();
        this.g = rect.height();
    }

    @Override // tb.jwy
    public void a(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3f391fd", new Object[]{this, canvas});
        } else if (!this.l) {
        } else {
            canvas.drawRect(this.k, this.h);
        }
    }

    @Override // tb.jwy, android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d144fec0", new Object[]{this, new Integer(i)});
        } else {
            this.h.setAlpha(i);
        }
    }

    @Override // tb.jwy, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65fee558", new Object[]{this, colorFilter});
        } else {
            this.h.setColorFilter(colorFilter);
        }
    }

    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.i;
    }

    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.j;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        this.j = i;
        if (!this.m) {
            return;
        }
        this.h.setColor(this.j);
        invalidateSelf();
    }
}
