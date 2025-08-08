package tb;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.util.g;
import com.taobao.search.common.util.l;
import com.taobao.search.mmd.uikit.iconlist.a;
import com.taobao.search.searchdoor.searchbar.data.d;

/* loaded from: classes7.dex */
public class hmr extends hme<d> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static float h;
    private a i;
    private Drawable j;

    public static /* synthetic */ Object ipc$super(hmr hmrVar, String str, Object... objArr) {
        if (str.hashCode() == -1688871921) {
            super.onDrawableLoaded((BitmapDrawable) objArr[0], ((Number) objArr[1]).intValue(), (String) objArr[2]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        kge.a(-191027603);
        h = l.a(12);
    }

    public hmr(d dVar, boolean z, Context context) {
        super(dVar, z);
        String g;
        float f = h;
        this.i = new a(context, this, (int) f, (int) f, 0);
        a aVar = this.i;
        if (z && !StringUtils.isEmpty(dVar.h())) {
            g = dVar.h();
        } else {
            g = dVar.g();
        }
        aVar.a(g);
    }

    @Override // tb.hme
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.e = new TextPaint();
        this.e.setAntiAlias(true);
        this.e.setTextSize(l.a(((d) this.c).d()));
        this.e.setColor(g.a((!this.d || StringUtils.isEmpty(((d) this.c).c())) ? ((d) this.c).b() : ((d) this.c).c(), -1));
        this.e.setAlpha((int) (this.g * 255.0f));
        this.e.setFakeBoldText(true);
        if (StringUtils.isEmpty(((d) this.c).f()) && StringUtils.isEmpty(((d) this.c).e())) {
            return;
        }
        this.f = new Paint();
        this.f.setAntiAlias(true);
        this.f.setColor(g.a((!this.d || StringUtils.isEmpty(((d) this.c).f())) ? ((d) this.c).e() : ((d) this.c).f(), 0));
        this.f.setStyle(Paint.Style.FILL);
        this.f.setAlpha((int) (this.g * 255.0f));
    }

    @Override // tb.hme
    public float d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2db", new Object[]{this})).floatValue() : this.e.measureText(((d) this.c).a()) + h;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        if (this.f == null) {
            z = false;
        }
        if (z) {
            float f = f28734a;
            canvas.drawRoundRect(0.0f, 0.0f, d() + (f28734a * 2.0f), getIntrinsicHeight(), f, f, this.f);
        }
        if (this.j != null) {
            int intrinsicHeight = (int) ((getIntrinsicHeight() - h) / 2.0f);
            float f2 = f28734a;
            float f3 = h;
            this.j.setBounds((int) f28734a, intrinsicHeight, (int) (f2 + f3), (int) (intrinsicHeight + f3));
            this.j.draw(canvas);
        }
        canvas.drawText(((d) this.c).a(), f28734a + h, c(), this.e);
    }

    @Override // tb.hme, com.taobao.search.mmd.uikit.iconlist.a.InterfaceC0770a
    public void onDrawableLoaded(BitmapDrawable bitmapDrawable, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b55dc0f", new Object[]{this, bitmapDrawable, new Integer(i), str});
            return;
        }
        this.j = bitmapDrawable;
        Drawable drawable = this.j;
        if (drawable != null) {
            drawable.setAlpha((int) (this.g * 255.0f));
        }
        super.onDrawableLoaded(bitmapDrawable, i, str);
    }
}
