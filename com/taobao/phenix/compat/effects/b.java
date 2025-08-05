package com.taobao.phenix.compat.effects;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.renderscript.RSRuntimeException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pexode.PexodeOptions;
import com.taobao.phenix.compat.effects.internal.NdkCore;
import java.lang.reflect.Array;
import tb.nia;
import tb.qol;

/* loaded from: classes7.dex */
public class b implements nia {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static int f18898a = 25;
    private static int b = 1;
    private final Context c;
    private final int d;
    private final int e;

    public b(Context context) {
        this(context, f18898a, b);
    }

    public b(Context context, int i) {
        this(context, i, b);
    }

    public b(Context context, int i, int i2) {
        boolean z = true;
        com.taobao.tcommon.core.b.a(i > 0, "blur radius must be greater than zero");
        com.taobao.tcommon.core.b.a(i2 <= 0 ? false : z, "blur sampling must be greater than zero");
        this.c = context;
        this.d = i;
        this.e = i2;
    }

    @Override // tb.nia
    public String getId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("81e05888", new Object[]{this});
        }
        return "R" + this.d + "$S" + this.e;
    }

    @Override // tb.nia
    public Bitmap process(String str, nia.a aVar, Bitmap bitmap) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("6877629f", new Object[]{this, str, aVar, bitmap});
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i2 = this.e;
        int i3 = width / i2;
        int i4 = height / i2;
        if (i3 == 0 || i4 == 0) {
            qol.h("Effects4Phenix", "process blur width = " + i3 + ", height = " + i4, new Object[0]);
            return bitmap;
        }
        Bitmap a2 = aVar.a(i3, i4, bitmap.getConfig() != null ? bitmap.getConfig() : PexodeOptions.CONFIG);
        Canvas canvas = new Canvas(a2);
        int i5 = this.e;
        canvas.scale(1.0f / i5, 1.0f / i5);
        Paint paint = new Paint();
        paint.setFlags(2);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        Bitmap a3 = NdkCore.a(a2, this.d);
        if (a3 == null && Build.VERSION.SDK_INT >= 18 && (i = this.d) <= f18898a) {
            try {
                a3 = a(this.c, a2, i);
            } catch (RSRuntimeException e) {
                qol.f("Effects4Phenix", "render script blur error=%s", e);
            }
        }
        return a3 == null ? a(a2, this.d, true) : a3;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap a(android.content.Context r4, android.graphics.Bitmap r5, int r6) throws android.renderscript.RSRuntimeException {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.phenix.compat.effects.b.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            if (r1 == 0) goto L20
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r3 = 0
            r1[r3] = r4
            r1[r2] = r5
            r4 = 2
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r6)
            r1[r4] = r5
            java.lang.String r4 = "25284ad3"
            java.lang.Object r4 = r0.ipc$dispatch(r4, r1)
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4
            return r4
        L20:
            r0 = 0
            android.renderscript.RenderScript r4 = android.renderscript.RenderScript.create(r4)     // Catch: java.lang.Throwable -> L6f
            android.renderscript.RenderScript$RSMessageHandler r1 = new android.renderscript.RenderScript$RSMessageHandler     // Catch: java.lang.Throwable -> L6c
            r1.<init>()     // Catch: java.lang.Throwable -> L6c
            r4.setMessageHandler(r1)     // Catch: java.lang.Throwable -> L6c
            android.renderscript.Allocation$MipmapControl r1 = android.renderscript.Allocation.MipmapControl.MIPMAP_NONE     // Catch: java.lang.Throwable -> L6c
            android.renderscript.Allocation r1 = android.renderscript.Allocation.createFromBitmap(r4, r5, r1, r2)     // Catch: java.lang.Throwable -> L6c
            android.renderscript.Type r2 = r1.getType()     // Catch: java.lang.Throwable -> L69
            android.renderscript.Allocation r2 = android.renderscript.Allocation.createTyped(r4, r2)     // Catch: java.lang.Throwable -> L69
            android.renderscript.Element r3 = android.renderscript.Element.U8_4(r4)     // Catch: java.lang.Throwable -> L65
            android.renderscript.ScriptIntrinsicBlur r0 = android.renderscript.ScriptIntrinsicBlur.create(r4, r3)     // Catch: java.lang.Throwable -> L65
            r0.setInput(r1)     // Catch: java.lang.Throwable -> L65
            float r6 = (float) r6     // Catch: java.lang.Throwable -> L65
            r0.setRadius(r6)     // Catch: java.lang.Throwable -> L65
            r0.forEach(r2)     // Catch: java.lang.Throwable -> L65
            r2.copyTo(r5)     // Catch: java.lang.Throwable -> L65
            if (r4 == 0) goto L55
            r4.destroy()
        L55:
            if (r1 == 0) goto L5a
            r1.destroy()
        L5a:
            if (r2 == 0) goto L5f
            r2.destroy()
        L5f:
            if (r0 == 0) goto L64
            r0.destroy()
        L64:
            return r5
        L65:
            r5 = move-exception
            r6 = r0
            r0 = r2
            goto L73
        L69:
            r5 = move-exception
            r6 = r0
            goto L73
        L6c:
            r5 = move-exception
            r6 = r0
            goto L72
        L6f:
            r5 = move-exception
            r4 = r0
            r6 = r4
        L72:
            r1 = r6
        L73:
            if (r4 == 0) goto L78
            r4.destroy()
        L78:
            if (r1 == 0) goto L7d
            r1.destroy()
        L7d:
            if (r0 == 0) goto L82
            r0.destroy()
        L82:
            if (r6 == 0) goto L87
            r6.destroy()
        L87:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.phenix.compat.effects.b.a(android.content.Context, android.graphics.Bitmap, int):android.graphics.Bitmap");
    }

    public static Bitmap a(Bitmap bitmap, int i, boolean z) {
        int[] iArr;
        Bitmap bitmap2 = bitmap;
        int i2 = i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("da31355", new Object[]{bitmap2, new Integer(i2), new Boolean(z)});
        }
        if (!z) {
            bitmap2 = bitmap2.copy(bitmap.getConfig(), true);
        }
        if (i2 <= 0) {
            return null;
        }
        int width = bitmap2.getWidth();
        int height = bitmap2.getHeight();
        int i3 = width * height;
        int[] iArr2 = new int[i3];
        bitmap2.getPixels(iArr2, 0, width, 0, 0, width, height);
        int i4 = width - 1;
        int i5 = height - 1;
        int i6 = i2 + i2 + 1;
        int[] iArr3 = new int[i3];
        int[] iArr4 = new int[i3];
        int[] iArr5 = new int[i3];
        int[] iArr6 = new int[Math.max(width, height)];
        int i7 = (i6 + 1) >> 1;
        int i8 = i7 * i7;
        int i9 = i8 * 256;
        int[] iArr7 = new int[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            iArr7[i10] = i10 / i8;
        }
        int[][] iArr8 = (int[][]) Array.newInstance(int.class, i6, 3);
        int i11 = i2 + 1;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i12 < height) {
            Bitmap bitmap3 = bitmap2;
            int i15 = -i2;
            int i16 = 0;
            int i17 = 0;
            int i18 = 0;
            int i19 = 0;
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            int i23 = 0;
            int i24 = 0;
            while (i15 <= i2) {
                int i25 = height;
                int i26 = i5;
                int i27 = iArr2[Math.min(i4, Math.max(i15, 0)) + i13];
                int[] iArr9 = iArr8[i15 + i2];
                int i28 = i13;
                iArr9[0] = (i27 >> 16) & 255;
                iArr9[1] = (i27 >> 8) & 255;
                iArr9[2] = i27 & 255;
                int abs = i11 - Math.abs(i15);
                i16 += iArr9[0] * abs;
                i17 += iArr9[1] * abs;
                i18 += iArr9[2] * abs;
                if (i15 > 0) {
                    i22 += iArr9[0];
                    i23 += iArr9[1];
                    i24 += iArr9[2];
                } else {
                    i19 += iArr9[0];
                    i20 += iArr9[1];
                    i21 += iArr9[2];
                }
                i15++;
                height = i25;
                i5 = i26;
                i13 = i28;
            }
            int i29 = height;
            int i30 = i5;
            int i31 = i2;
            int i32 = 0;
            while (i32 < width) {
                iArr3[i13] = iArr7[i16];
                iArr4[i13] = iArr7[i17];
                iArr5[i13] = iArr7[i18];
                int i33 = i16 - i19;
                int i34 = i17 - i20;
                int i35 = i18 - i21;
                int[] iArr10 = iArr8[((i31 - i2) + i6) % i6];
                int i36 = i19 - iArr10[0];
                int i37 = i20 - iArr10[1];
                int i38 = i21 - iArr10[2];
                if (i12 == 0) {
                    iArr = iArr7;
                    iArr6[i32] = Math.min(i32 + i2 + 1, i4);
                } else {
                    iArr = iArr7;
                }
                int i39 = iArr2[i14 + iArr6[i32]];
                iArr10[0] = (i39 >> 16) & 255;
                iArr10[1] = (i39 >> 8) & 255;
                iArr10[2] = i39 & 255;
                int i40 = i22 + iArr10[0];
                int i41 = i23 + iArr10[1];
                int i42 = i24 + iArr10[2];
                i16 = i33 + i40;
                i17 = i34 + i41;
                i18 = i35 + i42;
                i31 = (i31 + 1) % i6;
                int[] iArr11 = iArr8[i31 % i6];
                i19 = i36 + iArr11[0];
                i20 = i37 + iArr11[1];
                i21 = i38 + iArr11[2];
                i22 = i40 - iArr11[0];
                i23 = i41 - iArr11[1];
                i24 = i42 - iArr11[2];
                i13++;
                i32++;
                i4 = i4;
                iArr7 = iArr;
            }
            i14 += width;
            i12++;
            bitmap2 = bitmap3;
            height = i29;
            i5 = i30;
        }
        Bitmap bitmap4 = bitmap2;
        int i43 = height;
        int[] iArr12 = iArr7;
        int i44 = i5;
        int i45 = 0;
        while (i45 < width) {
            int i46 = -i2;
            int i47 = i46 * width;
            int i48 = 0;
            int i49 = 0;
            int i50 = 0;
            int i51 = 0;
            int i52 = 0;
            int i53 = 0;
            int i54 = 0;
            int i55 = 0;
            int i56 = 0;
            while (i46 <= i2) {
                int[] iArr13 = iArr6;
                int max = Math.max(0, i47) + i45;
                int[] iArr14 = iArr8[i46 + i2];
                iArr14[0] = iArr3[max];
                iArr14[1] = iArr4[max];
                iArr14[2] = iArr5[max];
                int abs2 = i11 - Math.abs(i46);
                i48 += iArr3[max] * abs2;
                i49 += iArr4[max] * abs2;
                i50 += iArr5[max] * abs2;
                if (i46 > 0) {
                    i54 += iArr14[0];
                    i55 += iArr14[1];
                    i56 += iArr14[2];
                } else {
                    i51 += iArr14[0];
                    i52 += iArr14[1];
                    i53 += iArr14[2];
                }
                int i57 = i44;
                if (i46 < i57) {
                    i47 += width;
                }
                i46++;
                i44 = i57;
                iArr6 = iArr13;
            }
            int[] iArr15 = iArr6;
            int i58 = i44;
            int i59 = i43;
            int i60 = i54;
            int i61 = i55;
            int i62 = 0;
            int i63 = i2;
            int i64 = i53;
            int i65 = i52;
            int i66 = i51;
            int i67 = i50;
            int i68 = i49;
            int i69 = i48;
            int i70 = i45;
            while (i62 < i59) {
                iArr2[i70] = (iArr2[i70] & (-16777216)) | (iArr12[i69] << 16) | (iArr12[i68] << 8) | iArr12[i67];
                int i71 = i69 - i66;
                int i72 = i68 - i65;
                int i73 = i67 - i64;
                int[] iArr16 = iArr8[((i63 - i2) + i6) % i6];
                int i74 = i66 - iArr16[0];
                int i75 = i65 - iArr16[1];
                int i76 = i64 - iArr16[2];
                if (i45 == 0) {
                    iArr15[i62] = Math.min(i62 + i11, i58) * width;
                }
                int i77 = iArr15[i62] + i45;
                iArr16[0] = iArr3[i77];
                iArr16[1] = iArr4[i77];
                iArr16[2] = iArr5[i77];
                int i78 = i60 + iArr16[0];
                int i79 = i61 + iArr16[1];
                int i80 = i56 + iArr16[2];
                i69 = i71 + i78;
                i68 = i72 + i79;
                i67 = i73 + i80;
                i63 = (i63 + 1) % i6;
                int[] iArr17 = iArr8[i63];
                i66 = i74 + iArr17[0];
                i65 = i75 + iArr17[1];
                i64 = i76 + iArr17[2];
                i60 = i78 - iArr17[0];
                i61 = i79 - iArr17[1];
                i56 = i80 - iArr17[2];
                i70 += width;
                i62++;
                i2 = i;
            }
            i45++;
            i2 = i;
            i43 = i59;
            i44 = i58;
            iArr6 = iArr15;
        }
        bitmap4.setPixels(iArr2, 0, width, 0, 0, width, i43);
        return bitmap4;
    }
}
