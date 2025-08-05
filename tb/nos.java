package tb;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.util.j;
import com.taobao.search.common.dynamic.bean.SearchDomBean;
import com.taobao.search.mmd.datasource.bean.IconBean;
import com.taobao.search.mmd.util.d;

/* loaded from: classes7.dex */
public class nos extends Drawable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static int i;
    private static int j;
    private static int k;
    private IconBean d;
    private SearchDomBean e;
    private boolean g;
    private int h;

    /* renamed from: a  reason: collision with root package name */
    private Paint f31613a = new Paint();
    private Paint b = new Paint();
    private Paint c = new Paint();
    private final RectF f = new RectF();

    public static /* synthetic */ Object ipc$super(nos nosVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2242c5cf", new Object[]{this})).intValue();
        }
        return -3;
    }

    static {
        kge.a(-596378362);
        i = j.a(0.5f);
        j = j.a(13.0f);
        k = j.a(6.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c2b8a1d0", new Object[]{this})).intValue() : j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2990b5b1", new Object[]{this})).intValue() : this.h;
    }

    public nos(IconBean iconBean, SearchDomBean searchDomBean) {
        this.g = false;
        this.d = iconBean;
        this.e = searchDomBean;
        b(searchDomBean);
        d(searchDomBean);
        e(searchDomBean);
        this.f31613a.setAntiAlias(true);
        this.g = c(searchDomBean);
        this.c.setStrokeWidth(i);
        this.c.setAntiAlias(true);
        this.c.setStyle(Paint.Style.STROKE);
        this.h = ((int) this.f31613a.measureText(iconBean.text)) + (k * 2);
        this.f.set(0.0f, 0.0f, this.h, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        canvas.clipRect(this.f);
        if (this.g) {
            RectF rectF = this.f;
            int i3 = i;
            rectF.inset(i3 / 2, i3 / 2);
        }
        RectF rectF2 = this.f;
        int i4 = j;
        canvas.drawRoundRect(rectF2, i4 / 2, i4 / 2, this.b);
        if (this.g) {
            RectF rectF3 = this.f;
            int i5 = j;
            canvas.drawRoundRect(rectF3, i5 / 2, i5 / 2, this.c);
        }
        if (this.g || this.b.getColor() != 0) {
            i2 = k;
        }
        canvas.drawText(this.d.text, i2, j - this.f31613a.descent(), this.f31613a);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d144fec0", new Object[]{this, new Integer(i2)});
            return;
        }
        this.f31613a.setAlpha(i2);
        this.b.setAlpha(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65fee558", new Object[]{this, colorFilter});
            return;
        }
        this.b.setColorFilter(colorFilter);
        this.f31613a.setColorFilter(colorFilter);
    }

    private boolean a(SearchDomBean searchDomBean) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d1800df2", new Object[]{this, searchDomBean})).booleanValue() : !TextUtils.isEmpty(searchDomBean.backgroundGradientStart) && !TextUtils.isEmpty(searchDomBean.backgroundGradientEnd);
    }

    private void b(SearchDomBean searchDomBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e6d250d", new Object[]{this, searchDomBean});
            return;
        }
        this.b.setColor(d.a(searchDomBean.backgroundColor, 0));
        if (a(searchDomBean)) {
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, searchDomBean.width, 0.0f, Color.parseColor(searchDomBean.backgroundGradientStart), Color.parseColor(searchDomBean.backgroundGradientEnd), Shader.TileMode.CLAMP);
            this.b.setColor(-16711936);
            this.b.setShader(linearGradient);
            return;
        }
        this.b.setShader(null);
    }

    private boolean c(SearchDomBean searchDomBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eb5a3c30", new Object[]{this, searchDomBean})).booleanValue();
        }
        String str = searchDomBean.borderColor;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        this.c.setColor(d.a(str, 0));
        return true;
    }

    private void d(SearchDomBean searchDomBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7847534b", new Object[]{this, searchDomBean});
        } else if (searchDomBean.textSize > 0.0f) {
            this.f31613a.setTextSize(j.a(searchDomBean.textSize));
        } else {
            this.f31613a.setTextSize(j.a(10.0f));
        }
    }

    private void e(SearchDomBean searchDomBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5346a6a", new Object[]{this, searchDomBean});
        } else {
            this.f31613a.setColor(d.a(searchDomBean.textColor, -1));
        }
    }
}
