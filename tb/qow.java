package tb;

import android.graphics.Bitmap;
import com.alibaba.security.realidentity.f2;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.executor.IExecutorService;
import com.taobao.weex.common.Constants;
import com.uc.webview.internal.interfaces.IWebViewExtension;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0017B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0016\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J \u0010\u0013\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/taobao/themis/inside/utils/BlurTool;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "asyncBlur", "", f2.i, "Landroid/graphics/Bitmap;", "radius", "", DataReceiveMonitor.CB_LISTENER, "Lcom/taobao/themis/inside/utils/BlurTool$OnBlurCompleteListener;", Constants.Event.BLUR, "calculateSampling", "", "post", "runnable", "Ljava/lang/Runnable;", "stackBlur", "sentBitmap", "canModifyBitmap", "", "OnBlurCompleteListener", "themis_inside_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class qow {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final qow INSTANCE;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/taobao/themis/inside/utils/BlurTool$OnBlurCompleteListener;", "", "onBlurComplete", "", IWebViewExtension.SNAPSHOT_BUNDLE_KEY_BITMAP, "Landroid/graphics/Bitmap;", "themis_inside_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public interface a {
        void a(Bitmap bitmap);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a f33002a;
        public final /* synthetic */ Bitmap b;
        public final /* synthetic */ int c;

        public b(a aVar, Bitmap bitmap, int i) {
            this.f33002a = aVar;
            this.b = bitmap;
            this.c = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.f33002a == null) {
            } else {
                try {
                    final Bitmap a2 = qow.INSTANCE.a(this.b, this.c);
                    qow.a(qow.INSTANCE, new Runnable() { // from class: tb.qow.b.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public final void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                b.this.f33002a.a(a2);
                            }
                        }
                    });
                } catch (Exception e) {
                    qow.a(qow.INSTANCE, new Runnable() { // from class: tb.qow.b.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public final void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                b.this.f33002a.a(b.this.b);
                            }
                        }
                    });
                    TMSLogger.b("blur failed,return original image.", "", e);
                }
            }
        }
    }

    private final double a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a8219389", new Object[]{this, new Integer(i)})).doubleValue();
        }
        if (i <= 3) {
            return 0.5d;
        }
        return i <= 8 ? 0.25d : 0.125d;
    }

    static {
        kge.a(-1905496198);
        INSTANCE = new qow();
    }

    private qow() {
    }

    public static final /* synthetic */ void a(qow qowVar, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a697b1d", new Object[]{qowVar, runnable});
        } else {
            qowVar.a(runnable);
        }
    }

    public final Bitmap a(Bitmap originalImage, int i) {
        Bitmap sampledImage;
        String str;
        qow qowVar = this;
        IpChange ipChange = $ipChange;
        int i2 = 3;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("6ffe40db", new Object[]{qowVar, originalImage, new Integer(i)});
        }
        q.d(originalImage, "originalImage");
        long currentTimeMillis = System.currentTimeMillis();
        int min = Math.min(10, Math.max(0, i));
        if (min == 0) {
            return originalImage;
        }
        int width = originalImage.getWidth();
        int height = originalImage.getHeight();
        if (width > 0 && height > 0) {
            double a2 = qowVar.a(min);
            double d = width;
            double d2 = height;
            int i3 = min;
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(originalImage, (int) (a2 * d), (int) (a2 * d2), true);
            int i4 = 0;
            while (true) {
                Bitmap bitmap = createScaledBitmap;
                if (i4 >= i2) {
                    TMSLogger.b("BlurTool", "elapsed time on blurring image(radius:" + i3 + ",sampling: " + a2 + "): " + (System.currentTimeMillis() - currentTimeMillis) + "ms");
                    break;
                } else if (i3 == 0) {
                    return originalImage;
                } else {
                    try {
                        double a3 = qowVar.a(i3);
                        if (a3 != a2) {
                            str = "elapsed time on blurring image(radius:";
                            try {
                                sampledImage = Bitmap.createScaledBitmap(originalImage, (int) (a3 * d), (int) (a3 * d2), true);
                                a2 = a3;
                            } catch (Exception e) {
                                e = e;
                                sampledImage = bitmap;
                                a2 = a3;
                            }
                        } else {
                            str = "elapsed time on blurring image(radius:";
                            sampledImage = bitmap;
                        }
                        try {
                            q.b(sampledImage, "sampledImage");
                            Bitmap a4 = qowVar.a(sampledImage, i3, false);
                            q.a(a4);
                            StringBuilder sb = new StringBuilder();
                            sb.append(str);
                            sb.append(i3);
                            sb.append(",sampling: ");
                            sb.append(a2);
                            sb.append("): ");
                            double d3 = a2;
                            try {
                                sb.append(System.currentTimeMillis() - currentTimeMillis);
                                sb.append("ms");
                                TMSLogger.b("BlurTool", sb.toString());
                                return a4;
                            } catch (Exception e2) {
                                e = e2;
                                a2 = d3;
                            }
                        } catch (Exception e3) {
                            e = e3;
                        }
                    } catch (Exception e4) {
                        e = e4;
                        sampledImage = bitmap;
                    }
                }
                TMSLogger.b("BlurTool", "thrown exception when blurred image(times = " + i4 + "),", e);
                i3 = Math.max(0, i3 + (-1));
                i4++;
                createScaledBitmap = sampledImage;
                i2 = 3;
                qowVar = this;
            }
        }
        return originalImage;
    }

    public final void a(Bitmap originalImage, int i, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2a38d7", new Object[]{this, originalImage, new Integer(i), aVar});
            return;
        }
        q.d(originalImage, "originalImage");
        ((IExecutorService) qpt.a(IExecutorService.class)).getExecutor(ExecutorType.URGENT).execute(new b(aVar, originalImage, i));
    }

    private final void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
        } else {
            ((IExecutorService) qpt.a(IExecutorService.class)).getExecutor(ExecutorType.UI).execute(runnable);
        }
    }

    public final Bitmap a(Bitmap bitmap, int i, boolean z) {
        int[] iArr;
        Bitmap sentBitmap = bitmap;
        int i2 = i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("da31355", new Object[]{this, sentBitmap, new Integer(i2), new Boolean(z)});
        }
        q.d(sentBitmap, "sentBitmap");
        if (!z) {
            sentBitmap = sentBitmap.copy(bitmap.getConfig(), true);
            q.b(sentBitmap, "sentBitmap.copy(sentBitmap.config, true)");
        }
        if (i2 <= 0) {
            return null;
        }
        int width = sentBitmap.getWidth();
        int height = sentBitmap.getHeight();
        int i3 = width * height;
        int[] iArr2 = new int[i3];
        sentBitmap.getPixels(iArr2, 0, width, 0, 0, width, height);
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
        int[][] iArr8 = new int[i6];
        for (int i11 = 0; i11 < i6; i11++) {
            iArr8[i11] = new int[3];
        }
        int[][] iArr9 = iArr8;
        int i12 = i2 + 1;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i13 < height) {
            Bitmap bitmap2 = sentBitmap;
            int i16 = -i2;
            int i17 = 0;
            int i18 = 0;
            int i19 = 0;
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            int i23 = 0;
            int i24 = 0;
            int i25 = 0;
            while (i16 <= i2) {
                int i26 = height;
                int i27 = i5;
                int i28 = iArr2[Math.min(i4, Math.max(i16, 0)) + i14];
                int[] iArr10 = iArr9[i16 + i2];
                int i29 = i14;
                iArr10[0] = (i28 >> 16) & 255;
                iArr10[1] = (i28 >> 8) & 255;
                iArr10[2] = i28 & 255;
                int abs = i12 - Math.abs(i16);
                i17 += iArr10[0] * abs;
                i18 += iArr10[1] * abs;
                i19 += iArr10[2] * abs;
                if (i16 > 0) {
                    i23 += iArr10[0];
                    i24 += iArr10[1];
                    i25 += iArr10[2];
                } else {
                    i20 += iArr10[0];
                    i21 += iArr10[1];
                    i22 += iArr10[2];
                }
                i16++;
                height = i26;
                i5 = i27;
                i14 = i29;
            }
            int i30 = height;
            int i31 = i5;
            int i32 = i2;
            int i33 = 0;
            while (i33 < width) {
                iArr3[i14] = iArr7[i17];
                iArr4[i14] = iArr7[i18];
                iArr5[i14] = iArr7[i19];
                int i34 = i17 - i20;
                int i35 = i18 - i21;
                int i36 = i19 - i22;
                int[] iArr11 = iArr9[((i32 - i2) + i6) % i6];
                int i37 = i20 - iArr11[0];
                int i38 = i21 - iArr11[1];
                int i39 = i22 - iArr11[2];
                if (i13 == 0) {
                    iArr = iArr7;
                    iArr6[i33] = Math.min(i33 + i2 + 1, i4);
                } else {
                    iArr = iArr7;
                }
                int i40 = iArr2[i15 + iArr6[i33]];
                iArr11[0] = (i40 >> 16) & 255;
                iArr11[1] = (i40 >> 8) & 255;
                iArr11[2] = i40 & 255;
                int i41 = i23 + iArr11[0];
                int i42 = i24 + iArr11[1];
                int i43 = i25 + iArr11[2];
                i17 = i34 + i41;
                i18 = i35 + i42;
                i19 = i36 + i43;
                i32 = (i32 + 1) % i6;
                int[] iArr12 = iArr9[i32 % i6];
                i20 = i37 + iArr12[0];
                i21 = i38 + iArr12[1];
                i22 = i39 + iArr12[2];
                i23 = i41 - iArr12[0];
                i24 = i42 - iArr12[1];
                i25 = i43 - iArr12[2];
                i14++;
                i33++;
                i4 = i4;
                iArr7 = iArr;
            }
            i15 += width;
            i13++;
            sentBitmap = bitmap2;
            height = i30;
            i5 = i31;
        }
        Bitmap bitmap3 = sentBitmap;
        int i44 = height;
        int[] iArr13 = iArr7;
        int i45 = i5;
        int i46 = 0;
        while (i46 < width) {
            int i47 = -i2;
            int i48 = i47 * width;
            int i49 = 0;
            int i50 = 0;
            int i51 = 0;
            int i52 = 0;
            int i53 = 0;
            int i54 = 0;
            int i55 = 0;
            int i56 = 0;
            int i57 = 0;
            while (i47 <= i2) {
                int[] iArr14 = iArr6;
                int max = Math.max(0, i48) + i46;
                int[] iArr15 = iArr9[i47 + i2];
                iArr15[0] = iArr3[max];
                iArr15[1] = iArr4[max];
                iArr15[2] = iArr5[max];
                int abs2 = i12 - Math.abs(i47);
                i49 += iArr3[max] * abs2;
                i50 += iArr4[max] * abs2;
                i51 += iArr5[max] * abs2;
                if (i47 > 0) {
                    i55 += iArr15[0];
                    i56 += iArr15[1];
                    i57 += iArr15[2];
                } else {
                    i52 += iArr15[0];
                    i53 += iArr15[1];
                    i54 += iArr15[2];
                }
                int i58 = i45;
                if (i47 < i58) {
                    i48 += width;
                }
                i47++;
                i45 = i58;
                iArr6 = iArr14;
            }
            int[] iArr16 = iArr6;
            int i59 = i45;
            int i60 = i44;
            int i61 = i55;
            int i62 = i56;
            int i63 = 0;
            int i64 = i2;
            int i65 = i54;
            int i66 = i53;
            int i67 = i52;
            int i68 = i51;
            int i69 = i50;
            int i70 = i49;
            int i71 = i46;
            while (i63 < i60) {
                iArr2[i71] = (iArr2[i71] & (-16777216)) | (iArr13[i70] << 16) | (iArr13[i69] << 8) | iArr13[i68];
                int i72 = i70 - i67;
                int i73 = i69 - i66;
                int i74 = i68 - i65;
                int[] iArr17 = iArr9[((i64 - i2) + i6) % i6];
                int i75 = i67 - iArr17[0];
                int i76 = i66 - iArr17[1];
                int i77 = i65 - iArr17[2];
                if (i46 == 0) {
                    iArr16[i63] = Math.min(i63 + i12, i59) * width;
                }
                int i78 = iArr16[i63] + i46;
                iArr17[0] = iArr3[i78];
                iArr17[1] = iArr4[i78];
                iArr17[2] = iArr5[i78];
                int i79 = i61 + iArr17[0];
                int i80 = i62 + iArr17[1];
                int i81 = i57 + iArr17[2];
                i70 = i72 + i79;
                i69 = i73 + i80;
                i68 = i74 + i81;
                i64 = (i64 + 1) % i6;
                int[] iArr18 = iArr9[i64];
                i67 = i75 + iArr18[0];
                i66 = i76 + iArr18[1];
                i65 = i77 + iArr18[2];
                i61 = i79 - iArr18[0];
                i62 = i80 - iArr18[1];
                i57 = i81 - iArr18[2];
                i71 += width;
                i63++;
                i2 = i;
            }
            i46++;
            i2 = i;
            i44 = i60;
            i45 = i59;
            iArr6 = iArr16;
        }
        bitmap3.setPixels(iArr2, 0, width, 0, 0, width, i44);
        return bitmap3;
    }
}
