package com.alibaba.aliweex.utils;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.utils.WXLogUtils;
import java.lang.reflect.Array;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import tb.kge;

/* loaded from: classes2.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static ExecutorService f2027a;

    /* renamed from: com.alibaba.aliweex.utils.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0064a {
        void a(Bitmap bitmap);
    }

    private static double a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a8219389", new Object[]{new Integer(i)})).doubleValue();
        }
        if (i <= 3) {
            return 0.5d;
        }
        return i <= 8 ? 0.25d : 0.125d;
    }

    public static /* synthetic */ void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{runnable});
        } else {
            b(runnable);
        }
    }

    static {
        kge.a(2054345262);
        f2027a = Executors.newCachedThreadPool(new ThreadFactory() { // from class: com.alibaba.aliweex.utils.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable}) : new Thread(runnable, "wx_blur_thread");
            }
        });
    }

    public static Bitmap a(Bitmap bitmap, int i) {
        String str;
        double d;
        Bitmap bitmap2;
        double d2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("6ffe40db", new Object[]{bitmap, new Integer(i)});
        }
        long currentTimeMillis = System.currentTimeMillis();
        int min = Math.min(10, Math.max(0, i));
        if (min == 0) {
            return bitmap;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width > 0 && height > 0) {
            double a2 = a(min);
            double d3 = width;
            double d4 = height;
            int i2 = min;
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) (a2 * d3), (int) (a2 * d4), true);
            int i3 = 0;
            while (true) {
                Bitmap bitmap3 = createScaledBitmap;
                if (i3 >= 3) {
                    WXLogUtils.d("BlurTool", "elapsed time on blurring image(radius:" + i2 + ",sampling: " + a2 + "): " + (System.currentTimeMillis() - currentTimeMillis) + "ms");
                    break;
                } else if (i2 == 0) {
                    return bitmap;
                } else {
                    try {
                        double a3 = a(i2);
                        if (a3 != a2) {
                            str = "): ";
                            try {
                                bitmap2 = Bitmap.createScaledBitmap(bitmap, (int) (a3 * d3), (int) (a3 * d4), true);
                                d = a3;
                            } catch (Exception e) {
                                e = e;
                                createScaledBitmap = bitmap3;
                                a2 = a3;
                            }
                        } else {
                            str = "): ";
                            d = a2;
                            bitmap2 = bitmap3;
                        }
                        try {
                            Bitmap a4 = a(bitmap2, i2, false);
                            StringBuilder sb = new StringBuilder();
                            sb.append("elapsed time on blurring image(radius:");
                            sb.append(i2);
                            sb.append(",sampling: ");
                            sb.append(d);
                            sb.append(str);
                            d2 = d;
                            try {
                                sb.append(System.currentTimeMillis() - currentTimeMillis);
                                sb.append("ms");
                                WXLogUtils.d("BlurTool", sb.toString());
                                return a4;
                            } catch (Exception e2) {
                                e = e2;
                                createScaledBitmap = bitmap2;
                                a2 = d2;
                                WXLogUtils.e("BlurTool", "thrown exception when blurred image(times = " + i3 + ")," + e.getMessage());
                                i2 = Math.max(0, i2 + (-1));
                                i3++;
                            }
                        } catch (Exception e3) {
                            e = e3;
                            d2 = d;
                        }
                    } catch (Exception e4) {
                        e = e4;
                        createScaledBitmap = bitmap3;
                    }
                }
                WXLogUtils.e("BlurTool", "thrown exception when blurred image(times = " + i3 + ")," + e.getMessage());
                i2 = Math.max(0, i2 + (-1));
                i3++;
            }
        }
        return bitmap;
    }

    public static void a(final Bitmap bitmap, final int i, final InterfaceC0064a interfaceC0064a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c20edef5", new Object[]{bitmap, new Integer(i), interfaceC0064a});
        } else {
            f2027a.execute(new Runnable() { // from class: com.alibaba.aliweex.utils.a.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (InterfaceC0064a.this == null) {
                    } else {
                        try {
                            final Bitmap a2 = a.a(bitmap, i);
                            a.a(new Runnable() { // from class: com.alibaba.aliweex.utils.a.2.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    } else {
                                        InterfaceC0064a.this.a(a2);
                                    }
                                }
                            });
                        } catch (Exception unused) {
                            a.a(new Runnable() { // from class: com.alibaba.aliweex.utils.a.2.2
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    } else {
                                        InterfaceC0064a.this.a(bitmap);
                                    }
                                }
                            });
                            WXLogUtils.e("blur failed,return original image.");
                        }
                    }
                }
            });
        }
    }

    private static void b(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87c15fe7", new Object[]{runnable});
        } else {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
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
