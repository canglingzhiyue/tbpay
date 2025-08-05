package com.taobao.search.musie.component.shadow;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.search.musie.component.shadow.TbShadow;
import tb.jwy;
import tb.kge;

/* loaded from: classes7.dex */
public class a extends jwy {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Bitmap b;
    private TbShadow.a c;
    private UINode e;
    private int g;
    private boolean d = false;
    private float f = 1.0f;

    static {
        kge.a(-1150285345);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public void a(UINode uINode, TbShadow.a aVar, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252e68ab", new Object[]{this, uINode, aVar, new Float(f)});
            return;
        }
        this.e = uINode;
        this.c = aVar;
        this.d = true;
        this.g = (int) f;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.c = null;
        c();
    }

    @Override // tb.jwy
    public void a(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3f391fd", new Object[]{this, canvas});
            return;
        }
        TbShadow.a aVar = this.c;
        if (aVar != null && aVar.a()) {
            b();
            canvas.save();
            float f = this.f;
            canvas.scale(1.0f / f, 1.0f / f, 0.0f, 0.0f);
            canvas.translate(-((int) ((this.b.getWidth() - (this.e.getLayoutWidth() * this.f)) / 2.0f)), -((int) ((this.b.getHeight() - (this.e.getLayoutHeight() * this.f)) / 2.0f)));
            if (this.c.f19234a != 0 || this.c.b != 0) {
                canvas.translate(this.c.f19234a, this.c.b);
            }
            canvas.drawBitmap(this.b, 0.0f, 0.0f, (Paint) null);
            canvas.restore();
            return;
        }
        c();
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        boolean z = this.d;
        this.d = false;
        int i = this.c.c * 3;
        int layoutWidth = this.e.getLayoutWidth() + i;
        int layoutHeight = this.e.getLayoutHeight() + i;
        float f = layoutHeight;
        float f2 = layoutWidth;
        float f3 = (f * 1.0f) / f2;
        int max = (int) Math.max(f2 * 0.5f, 100.0f);
        int max2 = (int) Math.max(0.5f * f, max * f3);
        this.f = (max2 * 1.0f) / f;
        Bitmap bitmap = this.b;
        if (bitmap == null || bitmap.getWidth() != max || this.b.getHeight() != max2) {
            c();
            this.b = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
            z = true;
        }
        if (!z) {
            return;
        }
        Canvas canvas = new Canvas();
        canvas.setBitmap(this.b);
        float f4 = this.f;
        canvas.scale(f4, f4);
        this.c.a(canvas, layoutWidth, layoutHeight, this.g);
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        Bitmap bitmap = this.b;
        if (bitmap == null) {
            return;
        }
        bitmap.recycle();
        this.b = null;
    }
}
