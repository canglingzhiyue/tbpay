package com.taobao.tao.flexbox.layoutmanager.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v4.view.GravityCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import tb.kge;
import tb.ogw;
import tb.ohd;

/* loaded from: classes8.dex */
public class c extends Drawable implements ImageLoader.d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean A;
    private int B;
    private int C;
    private int D;
    private ColorStateList b;
    private int d;
    private PorterDuff.Mode e;
    private boolean f;
    private String g;
    private ImageLoader.c h;
    private ImageLoader i;
    private boolean j;
    private Bitmap k;
    private int l;
    private Paint o;
    private BitmapShader p;
    private float r;
    private float[] s;
    private int t;
    private int u;
    private PorterDuff.Mode c = PorterDuff.Mode.SRC_IN;
    private int m = 119;
    private final Paint n = new Paint(3);
    private final Matrix q = new Matrix();
    private Path v = new Path();
    private Path w = new Path();

    /* renamed from: a  reason: collision with root package name */
    public final Rect f20384a = new Rect();
    private final RectF x = new RectF();
    private final RectF y = new RectF();
    private boolean z = true;

    static {
        kge.a(-240370766);
        kge.a(622630254);
    }

    private static boolean b(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9d660fb", new Object[]{new Float(f)})).booleanValue() : f > 0.05f;
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        if (str.hashCode() == -2054040210) {
            super.onBoundsChange((Rect) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader.c
    public void onImageLoaded(BitmapDrawable bitmapDrawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30484add", new Object[]{this, bitmapDrawable});
        }
    }

    public final Bitmap a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bitmap) ipChange.ipc$dispatch("bc740346", new Object[]{this}) : this.k;
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        this.B = this.k.getScaledWidth(this.l);
        this.C = this.k.getScaledHeight(this.l);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b194884", new Object[]{this, new Boolean(z)});
            return;
        }
        this.n.setFilterBitmap(z);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2271105", new Object[]{this, new Boolean(z)});
            return;
        }
        this.n.setDither(z);
        invalidateSelf();
    }

    public void a(int i, int i2, int i3, Rect rect, Rect rect2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("548aaddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), rect, rect2});
        } else {
            GravityCompat.apply(i, i2, i3, rect, rect2, 0);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!this.z) {
        } else {
            if (this.A) {
                int min = Math.min(this.B, this.C);
                a(this.m, min, min, getBounds(), this.f20384a);
                int min2 = Math.min(this.f20384a.width(), this.f20384a.height());
                this.f20384a.inset(Math.max(0, (this.f20384a.width() - min2) / 2), Math.max(0, (this.f20384a.height() - min2) / 2));
                this.r = min2 * 0.5f;
            } else {
                a(this.m, this.B, this.C, getBounds(), this.f20384a);
            }
            this.x.set(this.f20384a);
            if (this.t > 0) {
                this.y.set(this.f20384a);
                RectF rectF = this.y;
                int i = this.t;
                rectF.inset(i / 2, i / 2);
                Rect rect = this.f20384a;
                int i2 = this.t;
                rect.inset(i2, i2);
                this.x.set(this.f20384a);
            }
            float[] fArr = this.s;
            if (fArr != null) {
                this.w.addRoundRect(this.y, fArr, Path.Direction.CW);
                this.v.addRoundRect(this.x, this.s, Path.Direction.CW);
            }
            BitmapShader bitmapShader = this.p;
            if (bitmapShader != null) {
                bitmapShader.setLocalMatrix(this.q);
                this.n.setShader(this.p);
            }
            this.z = false;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        Bitmap bitmap = this.k;
        if (bitmap == null && this.D == 0) {
            return;
        }
        int i = this.D;
        if (i != 0) {
            canvas.drawColor(i);
            return;
        }
        b();
        if (this.n.getShader() == null) {
            canvas.drawBitmap(bitmap, (Rect) null, this.f20384a, this.n);
        } else if (this.s != null) {
            if (this.t > 0) {
                canvas.drawPath(this.v, this.n);
                canvas.drawPath(this.w, this.o);
                return;
            }
            canvas.drawPath(this.v, this.n);
        } else {
            int i2 = this.t;
            if (i2 > 0) {
                RectF rectF = this.x;
                float f = this.r;
                canvas.drawRoundRect(rectF, f - i2, f - i2, this.n);
                RectF rectF2 = this.y;
                float f2 = this.r;
                canvas.drawRoundRect(rectF2, f2, f2, this.o);
                return;
            }
            RectF rectF3 = this.x;
            float f3 = this.r;
            canvas.drawRoundRect(rectF3, f3, f3, this.n);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d144fec0", new Object[]{this, new Integer(i)});
        } else if (i == this.n.getAlpha()) {
        } else {
            this.n.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("dbf8c822", new Object[]{this})).intValue() : this.n.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65fee558", new Object[]{this, colorFilter});
            return;
        }
        this.n.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ColorFilter) ipChange.ipc$dispatch("65433e22", new Object[]{this}) : this.n.getColorFilter();
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else {
            this.r = Math.min(this.C, this.B) / 2;
        }
    }

    public void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
        } else if (this.r == f) {
        } else {
            this.s = null;
            this.A = false;
            if (b(f)) {
                this.n.setShader(this.p);
            } else {
                this.n.setShader(null);
            }
            this.r = f;
            invalidateSelf();
        }
    }

    public void a(float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c197633", new Object[]{this, fArr});
            return;
        }
        float[] fArr2 = this.s;
        if (fArr == fArr2) {
            return;
        }
        if (fArr != null && fArr2 != null && fArr[0] == fArr2[0] && fArr[1] == fArr2[1] && fArr[2] == fArr2[2] && fArr[3] == fArr2[3]) {
            return;
        }
        this.A = false;
        this.r = 0.0f;
        this.s = fArr;
        this.n.setShader(this.p);
        invalidateSelf();
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (this.t == i) {
        } else {
            this.A = false;
            this.t = i;
            if (this.o == null) {
                this.o = new Paint(3);
                this.o.setStyle(Paint.Style.STROKE);
            }
            this.o.setStrokeWidth(i);
            invalidateSelf();
        }
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else if (this.u == i) {
        } else {
            this.A = false;
            this.u = i;
            if (this.o == null) {
                this.o = new Paint(3);
                this.o.setStyle(Paint.Style.STROKE);
            }
            this.o.setColor(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8591d56e", new Object[]{this, rect});
            return;
        }
        super.onBoundsChange(rect);
        if (this.A) {
            f();
        }
        this.z = true;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2990b5b1", new Object[]{this})).intValue() : this.B;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c2b8a1d0", new Object[]{this})).intValue() : this.C;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Bitmap bitmap;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2242c5cf", new Object[]{this})).intValue() : (this.m != 119 || this.A || (bitmap = this.k) == null || bitmap.hasAlpha() || this.n.getAlpha() < 255 || b(this.r)) ? -3 : -1;
    }

    public c(Resources resources) {
        this.l = 160;
        if (resources != null) {
            this.l = resources.getDisplayMetrics().densityDpi;
        }
        this.k = null;
    }

    public void a(Bitmap bitmap) {
        float f;
        float f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acc0f2c6", new Object[]{this, bitmap});
        } else if (this.k == bitmap) {
        } else {
            this.D = 0;
            this.k = bitmap;
            if (this.k != null) {
                e();
                int width = this.k.getWidth();
                int height = this.k.getHeight();
                int width2 = getBounds().width();
                int height2 = getBounds().height();
                float f3 = 0.0f;
                if (width * height2 > width2 * height) {
                    float f4 = height2 / height;
                    f3 = (width2 - (width * f4)) * 0.5f;
                    f = f4;
                    f2 = 0.0f;
                } else {
                    f = width2 / width;
                    f2 = (height2 - (height * f)) * 0.5f;
                }
                this.q.setScale(f, f);
                this.q.postTranslate(Math.round(f3), Math.round(f2));
                Bitmap bitmap2 = this.k;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                this.p = new BitmapShader(bitmap2, tileMode, tileMode);
            } else {
                this.C = -1;
                this.B = -1;
                this.p = null;
            }
            this.z = true;
            invalidateSelf();
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        if (this.i == null) {
            this.i = com.taobao.tao.flexbox.layoutmanager.adapter.a.a().i();
        }
        this.i.a(!z);
        if (!z || this.i.c() != 1) {
            return;
        }
        a(this.g);
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        this.g = str;
        if (str != null && str.startsWith(ogw.BASE64_TAG)) {
            Bitmap a2 = ohd.a(str);
            if (a2 == null) {
                return;
            }
            a(a2);
            return;
        }
        if (this.i == null) {
            this.i = com.taobao.tao.flexbox.layoutmanager.adapter.a.a().i();
        }
        this.i.a(ab.a(), str, -1, -1, this);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader.d
    public void onImageLoaded(String str, BitmapDrawable bitmapDrawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72686e27", new Object[]{this, str, bitmapDrawable});
        } else if (this.j) {
        } else {
            a(bitmapDrawable.getBitmap());
            ImageLoader.c cVar = this.h;
            if (cVar == null) {
                return;
            }
            if (cVar instanceof ImageLoader.d) {
                ((ImageLoader.d) cVar).onImageLoaded(str, bitmapDrawable);
            } else {
                cVar.onImageLoaded(bitmapDrawable);
            }
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader.d
    public void onImageLoadFailed(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd6d6a1d", new Object[]{this, new Integer(i)});
            return;
        }
        ImageLoader.c cVar = this.h;
        if (cVar == null) {
            return;
        }
        if (cVar instanceof ImageLoader.d) {
            ((ImageLoader.d) cVar).onImageLoadFailed(i);
        } else {
            cVar.onImageLoadFailed();
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader.c
    public void onImageLoadFailed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3feabda6", new Object[]{this});
            return;
        }
        ImageLoader.c cVar = this.h;
        if (cVar == null) {
            return;
        }
        cVar.onImageLoadFailed();
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        this.j = z;
        if (!z) {
            return;
        }
        this.g = null;
    }

    public void a(ImageLoader.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fa7c878", new Object[]{this, cVar});
        } else {
            this.h = cVar;
        }
    }

    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.g;
    }

    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
            return;
        }
        this.D = i;
        this.k = null;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5dac540", new Object[]{this, colorStateList});
            return;
        }
        this.b = colorStateList;
        a(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8699ed2", new Object[]{this, mode});
            return;
        }
        this.c = mode;
        a(getState());
    }

    private boolean a(int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c19817a", new Object[]{this, iArr})).booleanValue();
        }
        ColorStateList colorStateList = this.b;
        if (colorStateList != null && this.c != null) {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            PorterDuff.Mode mode = this.c;
            if (!this.f || colorForState != this.d || mode != this.e) {
                setColorFilter(colorForState, mode);
                this.d = colorForState;
                this.e = mode;
                this.f = true;
                return true;
            }
        } else {
            this.f = false;
            clearColorFilter();
        }
        return false;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.b = null;
        this.e = null;
        this.d = 0;
        this.f = false;
        this.c = PorterDuff.Mode.SRC_IN;
        this.D = 0;
        this.k = null;
        this.f20384a.setEmpty();
        this.y.setEmpty();
        this.x.setEmpty();
        this.q.reset();
        this.s = null;
        this.r = 0.0f;
        this.t = 0;
        this.C = -1;
        this.B = -1;
        this.p = null;
        this.n.reset();
        Paint paint = this.o;
        if (paint != null) {
            paint.reset();
        }
        this.z = true;
        this.h = null;
        this.g = null;
        this.v.reset();
        this.w.reset();
        invalidateSelf();
    }
}
