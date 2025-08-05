package com.etao.feimagesearch.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.JvmStatic;
import tb.kge;

/* loaded from: classes4.dex */
public final class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final e INSTANCE;

    static {
        kge.a(437610311);
        INSTANCE = new e();
    }

    private e() {
    }

    @JvmStatic
    public static final Bitmap a(Context ctx, Bitmap bitmap, Bitmap bitmap2, int i, int i2) {
        Bitmap createBitmap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("aa8c635e", new Object[]{ctx, bitmap, bitmap2, new Integer(i), new Integer(i2)});
        }
        kotlin.jvm.internal.q.c(ctx, "ctx");
        kotlin.jvm.internal.q.c(bitmap, "bitmap");
        if (bitmap.getConfig() != Bitmap.Config.ARGB_8888) {
            Bitmap createBitmap2 = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap2);
            Paint paint = new Paint(1);
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.set(new float[]{0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f});
            paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
            bitmap = createBitmap2;
        }
        RenderScript create = RenderScript.create(ctx);
        if (bitmap2 == null) {
            createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            kotlin.jvm.internal.q.a((Object) createBitmap, "Bitmap.createBitmap(widt… Bitmap.Config.ARGB_8888)");
        } else {
            createBitmap = Bitmap.createBitmap(bitmap2.getWidth(), bitmap2.getHeight(), Bitmap.Config.ARGB_8888);
            kotlin.jvm.internal.q.a((Object) createBitmap, "Bitmap.createBitmap(resu… Bitmap.Config.ARGB_8888)");
        }
        Allocation input = Allocation.createFromBitmap(create, bitmap);
        kotlin.jvm.internal.q.a((Object) input, "input");
        Allocation createTyped = Allocation.createTyped(create, input.getType());
        ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
        create2.setInput(input);
        create2.setRadius(25.0f);
        create2.forEach(createTyped);
        createTyped.copyTo(createBitmap);
        create.destroy();
        input.destroy();
        createTyped.destroy();
        return createBitmap;
    }
}
