package com.ifaa.seccam;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.SharedMemory;
import android.support.v4.view.MotionEventCompat;
import android.util.Base64;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import tb.cyx;

/* loaded from: classes4.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f7637a = "0123456789ABCDEF".toCharArray();

    public static synchronized SharedMemory a(byte[] bArr) {
        synchronized (h.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SharedMemory) ipChange.ipc$dispatch("4dd805ef", new Object[]{bArr});
            }
            try {
                SharedMemory create = SharedMemory.create("secccam", 524288);
                ByteBuffer mapReadWrite = create.mapReadWrite();
                mapReadWrite.putInt(bArr.length);
                mapReadWrite.put(bArr);
                return create;
            } catch (Exception e) {
                Log.e("SecCamUtils", "str2Sm error ! e = ", e);
                return null;
            }
        }
    }

    public static synchronized byte[] a(SharedMemory sharedMemory) {
        synchronized (h.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (byte[]) ipChange.ipc$dispatch("ff2b76b5", new Object[]{sharedMemory});
            }
            try {
                ByteBuffer mapReadWrite = sharedMemory.mapReadWrite();
                int i = mapReadWrite.getInt();
                byte[] bArr = new byte[i];
                mapReadWrite.get(bArr, 0, i);
                return bArr;
            } catch (Exception e) {
                String str = "sm2Byte error ! e = " + e.toString();
                return null;
            }
        }
    }

    public static int a(byte[] bArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2713f1a7", new Object[]{bArr, new Integer(i)})).intValue() : ((bArr[i + 3] & 255) << 24) + ((bArr[i + 2] & 255) << 16) + ((bArr[i + 1] & 255) << 8) + (bArr[i] & 255);
    }

    public static Bitmap b(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("d0c7a14e", new Object[]{bArr});
        }
        Bitmap a2 = a(bArr, 640, 480);
        if (a2 == null) {
            return null;
        }
        return a2;
    }

    public static Bitmap a(byte[] bArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bitmap) ipChange.ipc$dispatch("2e7049ad", new Object[]{bArr, new Integer(i), new Integer(i2)}) : a(bArr, i, i2, 0, 1);
    }

    private static Bitmap a(byte[] bArr, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("4268124d", new Object[]{bArr, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
        int i5 = i * i2;
        int[] iArr = new int[i5];
        int i6 = i5;
        int i7 = 0;
        int i8 = 0;
        while (i7 < i2) {
            int i9 = i6;
            int i10 = i8;
            int i11 = 0;
            while (i11 < i) {
                int i12 = (bArr[i9 + i3] & 255) - 128;
                int i13 = (bArr[i9 + i4] & 255) - 128;
                int i14 = (bArr[i10] & 255) * 1192;
                int i15 = (i13 * 1634) + i14;
                int i16 = (i14 - (i13 * 833)) - (i12 * 400);
                int i17 = i14 + (i12 * 2066);
                if (i15 < 0) {
                    i15 = 0;
                } else if (i15 > 262143) {
                    i15 = 262143;
                }
                if (i16 < 0) {
                    i16 = 0;
                } else if (i16 > 262143) {
                    i16 = 262143;
                }
                if (i17 < 0) {
                    i17 = 0;
                } else if (i17 > 262143) {
                    i17 = 262143;
                }
                iArr[i10] = ((i16 >> 2) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) | ((i15 << 6) & 16711680) | ((i17 >> 10) & 255);
                int i18 = i10 + 1;
                if ((i10 & 1) == 1) {
                    i9 += 2;
                }
                i11++;
                i10 = i18;
            }
            if ((i7 & 1) == 0) {
                i9 -= i;
            }
            i7++;
            i8 = i10;
            i6 = i9;
        }
        return a(a(Bitmap.createBitmap(iArr, i, i2, Bitmap.Config.RGB_565), -90), 480, 640);
    }

    public static Bitmap a(Bitmap bitmap, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("6ffe40db", new Object[]{bitmap, new Integer(i)});
        }
        Matrix matrix = new Matrix();
        matrix.setRotate(i, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
        try {
            return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        } catch (OutOfMemoryError unused) {
            return null;
        }
    }

    public static Bitmap a(Bitmap bitmap, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("3f40f684", new Object[]{bitmap, new Integer(i), new Integer(i2)});
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Matrix matrix = new Matrix();
        matrix.postScale(-1.0f, 1.0f);
        Bitmap createBitmap2 = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
        canvas.drawBitmap(createBitmap2, new Rect(0, 0, createBitmap2.getWidth(), createBitmap2.getHeight()), new Rect(0, 0, i, i2), (Paint) null);
        return createBitmap;
    }

    public static boolean a(c cVar, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7f132a2e", new Object[]{cVar, bArr})).booleanValue();
        }
        if (bArr == null) {
            return false;
        }
        try {
            String str = "seccam byte length = " + bArr.length;
            int i = 0;
            while (i < bArr.length) {
                byte[] bArr2 = new byte[4];
                System.arraycopy(bArr, i, bArr2, 0, 4);
                int i2 = i + 4;
                byte[] bArr3 = new byte[4];
                System.arraycopy(bArr, i2, bArr3, 0, 4);
                int i3 = i2 + 4;
                int a2 = a(bArr2, 0);
                int a3 = a(bArr3, 0);
                String str2 = "the tlv tag = " + a2 + "  |  the tlv len = " + a3;
                if (a2 == 0) {
                    break;
                } else if (a2 == 1) {
                    byte[] bArr4 = new byte[a3];
                    System.arraycopy(bArr, i3, bArr4, 0, a3);
                    i = i3 + a3;
                    cVar.d(bArr4);
                } else if (a2 == 2) {
                    byte[] bArr5 = new byte[a3];
                    System.arraycopy(bArr, i3, bArr5, 0, a3);
                    i = i3 + a3;
                    cVar.c(bArr5);
                } else if (a2 != 3) {
                    if (a2 == 4) {
                        System.arraycopy(bArr, i3, new byte[a3], 0, a3);
                    }
                    i = i3 + a3;
                } else {
                    byte[] bArr6 = new byte[a3];
                    System.arraycopy(bArr, i3, bArr6, 0, a3);
                    i = i3 + a3;
                    cVar.b(bArr6);
                }
            }
            return true;
        } catch (Exception e) {
            String str3 = "get image e = " + e.toString();
            return false;
        }
    }

    public static boolean a(Context context, cyx cyxVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("767adcd2", new Object[]{context, cyxVar})).booleanValue() : a.a(context, cyxVar);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        if (g.a().f7634a == null || !g.a().f7634a.asBinder().isBinderAlive()) {
            return false;
        }
        f.a("SecCamUtils", " aidl :: connected");
        return true;
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        return context.getPackageManager().checkPermission("android.permission.RECORD_AUDIO", "packageName") == 0;
    }

    public static String b(Bitmap bitmap, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("783e3722", new Object[]{bitmap, new Integer(i)});
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, i, byteArrayOutputStream);
        return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
    }
}
