package tb;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.l;
import com.taobao.search.mmd.uikit.iconlist.a;
import com.taobao.search.searchdoor.searchbar.data.b;

/* loaded from: classes7.dex */
public class hmh extends hme<b> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static float h;
    private float i;
    private a j;
    private Drawable k;

    public static /* synthetic */ Object ipc$super(hmh hmhVar, String str, Object... objArr) {
        if (str.hashCode() == -1688871921) {
            super.onDrawableLoaded((BitmapDrawable) objArr[0], ((Number) objArr[1]).intValue(), (String) objArr[2]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.hme
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        }
    }

    static {
        kge.a(-2110960096);
        h = l.a(14);
    }

    public hmh(b bVar, boolean z, Context context) {
        super(bVar, z);
        this.j = new a(context, this, getIntrinsicWidth(), getIntrinsicHeight(), 0);
        this.j.a(e());
    }

    @Override // tb.hme, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c2b8a1d0", new Object[]{this})).intValue() : (int) h;
    }

    @Override // tb.hme, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2990b5b1", new Object[]{this})).intValue();
        }
        if (this.i == 0.0f) {
            this.i = l.a(((b) this.c).c());
        }
        return (int) this.i;
    }

    private String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this});
        }
        if (this.d && !StringUtils.isEmpty(((b) this.c).b())) {
            return ((b) this.c).b();
        }
        return ((b) this.c).a();
    }

    @Override // tb.hme
    public float d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2db", new Object[]{this})).floatValue() : getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        Drawable drawable = this.k;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(0, 0, (int) d(), (int) h);
        this.k.draw(canvas);
    }

    @Override // tb.hme, com.taobao.search.mmd.uikit.iconlist.a.InterfaceC0770a
    public void onDrawableLoaded(BitmapDrawable bitmapDrawable, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b55dc0f", new Object[]{this, bitmapDrawable, new Integer(i), str});
            return;
        }
        this.k = bitmapDrawable;
        Drawable drawable = this.k;
        if (drawable != null) {
            drawable.setAlpha((int) (this.g * 255.0f));
        }
        super.onDrawableLoaded(bitmapDrawable, i, str);
    }
}
