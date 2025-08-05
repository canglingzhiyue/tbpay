package com.taobao.search.musie.img;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_uikit.widget.img.UIImageDrawable;
import tb.kge;

/* loaded from: classes7.dex */
public class a extends UIImageDrawable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int b;
    private Drawable c;

    static {
        kge.a(236023993);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        if (str.hashCode() == -586974324) {
            super.a((Drawable) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.weex_uikit.widget.img.UIImageDrawable, com.taobao.android.weex_framework.adapter.d.a
    public void a(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd037b8c", new Object[]{this, drawable});
            return;
        }
        this.c = drawable;
        if ((drawable instanceof BitmapDrawable) && this.b != 0) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            Canvas canvas = new Canvas();
            Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
            canvas.setBitmap(createBitmap);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            Paint paint = new Paint(1);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            paint.setColor(this.b);
            canvas.drawRect(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight(), paint);
            drawable = new BitmapDrawable(createBitmap);
        }
        super.a(drawable);
    }

    public void b(int i) {
        Drawable drawable;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        if (this.b == i) {
            z = false;
        }
        this.b = i;
        if (!z || (drawable = this.c) == null) {
            return;
        }
        a(drawable);
        invalidateSelf();
    }
}
