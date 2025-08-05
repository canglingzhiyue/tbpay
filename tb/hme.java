package tb;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.l;
import com.taobao.search.mmd.uikit.iconlist.a;
import com.taobao.search.searchdoor.searchbar.data.a;

/* loaded from: classes7.dex */
public abstract class hme<HINT extends a> extends Drawable implements a.InterfaceC0770a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static float f28734a;
    public static float b;
    public HINT c;
    public boolean d;
    public TextPaint e;
    public Paint f;
    public float g = 0.35f;
    private float h;

    public abstract void a();

    public abstract float d();

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2242c5cf", new Object[]{this})).intValue();
        }
        return 0;
    }

    @Override // com.taobao.search.mmd.uikit.iconlist.a.InterfaceC0770a
    public boolean isLayoutRequested() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bb97a465", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d144fec0", new Object[]{this, new Integer(i)});
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65fee558", new Object[]{this, colorFilter});
        }
    }

    static {
        kge.a(-197952307);
        kge.a(-227018379);
        f28734a = l.a(3);
        b = l.a(2);
    }

    public hme(HINT hint, boolean z) {
        this.c = hint;
        this.d = z;
        a();
        setBounds(0, 0, getIntrinsicWidth(), getIntrinsicHeight());
    }

    @Override // com.taobao.search.mmd.uikit.iconlist.a.InterfaceC0770a
    public void onDrawableLoaded(BitmapDrawable bitmapDrawable, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b55dc0f", new Object[]{this, bitmapDrawable, new Integer(i), str});
        } else {
            invalidateSelf();
        }
    }

    public float b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83d9", new Object[]{this})).floatValue();
        }
        if (this.h == 0.0f) {
            Paint.FontMetrics fontMetrics = this.e.getFontMetrics();
            this.h = fontMetrics.descent - fontMetrics.ascent;
        }
        return this.h;
    }

    public float c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5a", new Object[]{this})).floatValue();
        }
        float abs = Math.abs(this.e.getFontMetrics().ascent);
        return this.f != null ? abs + b : abs;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2990b5b1", new Object[]{this})).intValue();
        }
        float d = d();
        if (this.f != null) {
            d += f28734a * 2.0f;
        }
        return (int) d;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c2b8a1d0", new Object[]{this})).intValue();
        }
        int b2 = (int) b();
        return this.f != null ? (int) (b2 + (b * 2.0f)) : b2;
    }
}
