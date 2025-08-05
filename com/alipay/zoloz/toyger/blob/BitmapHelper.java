package com.alipay.zoloz.toyger.blob;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public class BitmapHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int FRAME_MODE_BGR = 2;
    public static final int FRAME_MODE_BGRA = 1;
    public static final int FRAME_MODE_GRAY_16 = 5;
    public static final int FRAME_MODE_GRAY_8 = 6;
    public static final int FRAME_MODE_NV21 = 0;
    public static final int FRAME_MODE_RGB = 4;
    public static final int FRAME_MODE_RGBA = 3;

    public static int convertByteToInt(byte b) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c7839cf", new Object[]{new Byte(b)})).intValue() : (((b >> 4) & 15) << 4) + (b & 15);
    }

    public static Bitmap bytes2Bitmap(byte[] bArr, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("4fcec5bd", new Object[]{bArr, new Integer(i), new Integer(i2), new Integer(i3)});
        }
        if (i3 == 0) {
            return getYUVBitmap(bArr, i, i2);
        }
        if (i3 == 1 || i3 == 2) {
            return null;
        }
        if (i3 == 3) {
            return RGBABytes2Bitmap(bArr, i, i2);
        }
        if (i3 == 4) {
            return RGBBytes2Bitmap(bArr, i, i2);
        }
        return null;
    }

    public static Bitmap bytes2Bitmap(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("a086e722", new Object[]{bArr});
        }
        if (bArr.length == 0) {
            return null;
        }
        return BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
    }

    public static Bitmap RGBABytes2Bitmap(byte[] bArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("572c55d6", new Object[]{bArr, new Integer(i), new Integer(i2)});
        }
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        createBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(bArr));
        return createBitmap;
    }

    public static Bitmap RGBBytes2Bitmap(byte[] bArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("1a7aa7cf", new Object[]{bArr, new Integer(i), new Integer(i2)});
        }
        int[] convertBytesToInts = convertBytesToInts(bArr);
        if (convertBytesToInts != null) {
            return Bitmap.createBitmap(convertBytesToInts, 0, i, i, i2, Bitmap.Config.ARGB_8888);
        }
        return null;
    }

    public static int[] convertBytesToInts(byte[] bArr) {
        int i;
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("2dd3d71f", new Object[]{bArr});
        }
        int length = bArr.length;
        if (length == 0) {
            return null;
        }
        int i3 = length % 3 != 0 ? 1 : 0;
        int[] iArr = new int[(length / 3) + i3];
        int length2 = iArr.length;
        if (i3 == 0) {
            while (i2 < length2) {
                int i4 = i2 * 3;
                iArr[i2] = convertByteToInt(bArr[i4 + 2]) | (convertByteToInt(bArr[i4]) << 16) | (convertByteToInt(bArr[i4 + 1]) << 8) | (-16777216);
                i2++;
            }
        } else {
            while (true) {
                i = length2 - 1;
                if (i2 >= i) {
                    break;
                }
                int i5 = i2 * 3;
                iArr[i2] = convertByteToInt(bArr[i5 + 2]) | (convertByteToInt(bArr[i5]) << 16) | (convertByteToInt(bArr[i5 + 1]) << 8) | (-16777216);
                i2++;
            }
            iArr[i] = -16777216;
        }
        return iArr;
    }

    public static Bitmap readBitMap(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("5b03d365", new Object[]{context, new Integer(i)});
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        options.inPurgeable = true;
        options.inInputShareable = true;
        return BitmapFactory.decodeStream(context.getResources().openRawResource(i), null, options);
    }

    public static Bitmap zoomBitmap(Bitmap bitmap, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("3edc62e3", new Object[]{bitmap, new Integer(i), new Integer(i2)});
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.postScale(i / width, i2 / height);
        return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
    }

    public static byte[] bitmap2Bytes(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("4be8497e", new Object[]{bitmap});
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (bitmap != null) {
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static byte[] Bitmap2BytesEx(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("3bd68131", new Object[]{bitmap});
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] iArr = new int[width * height];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        return a(iArr, width, height);
    }

    private static byte[] a(int[] iArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        int i3 = 0;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("bdde2f47", new Object[]{iArr, new Integer(i), new Integer(i2)});
        }
        byte[] bArr = new byte[(i2 * i) << 2];
        int length = iArr.length - 1;
        while (length >= i) {
            int i4 = length - i;
            for (int i5 = i4 + 1; i5 <= length; i5++) {
                bArr[i3] = (byte) iArr[i5];
                bArr[i3 + 1] = (byte) (iArr[i5] >> 8);
                bArr[i3 + 2] = (byte) (iArr[i5] >> 16);
                bArr[i3 + 3] = (byte) (iArr[i5] >> 24);
                i3 += 4;
            }
            length = i4;
        }
        return bArr;
    }

    public static Bitmap resize(Bitmap bitmap, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("e370b8d1", new Object[]{bitmap, new Integer(i), new Integer(i2)});
        }
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.postScale(i / width, i2 / height);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
        bitmap.recycle();
        return createBitmap;
    }

    public static Bitmap resizeByHeight(Bitmap bitmap, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("d2aa92ec", new Object[]{bitmap, new Integer(i)});
        }
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float f = i / height;
        Matrix matrix = new Matrix();
        matrix.postScale(f, f);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
        bitmap.recycle();
        return createBitmap;
    }

    public static Bitmap resizeByWidth(Bitmap bitmap, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("43a19955", new Object[]{bitmap, new Integer(i)});
        }
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float f = i / width;
        Matrix matrix = new Matrix();
        matrix.postScale(f, f);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
        bitmap.recycle();
        return createBitmap;
    }

    public static void recycle(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a23c45d4", new Object[]{bitmap});
        } else if (bitmap == null || bitmap.isRecycled()) {
        } else {
            bitmap.recycle();
        }
    }

    public static Bitmap getBitmap(byte[] bArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("5ce04d71", new Object[]{bArr, new Integer(i), new Integer(i2)});
        }
        if (bArr == 0) {
            return null;
        }
        int length = bArr.length / 3;
        int[] iArr = new int[length];
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = i3 * 3;
            int i5 = bArr[i4];
            int i6 = bArr[i4 + 1];
            int i7 = bArr[i4 + 2];
            if (i5 < 0) {
                i5 += 256;
            }
            if (i6 < 0) {
                i6 += 256;
            }
            if (i7 < 0) {
                i7 += 256;
            }
            iArr[i3] = Color.rgb(i5, i6, i7);
        }
        return Bitmap.createBitmap(iArr, i, i2, Bitmap.Config.ARGB_8888);
    }

    public static Bitmap getYUVBitmap(byte[] bArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("e5ed153f", new Object[]{bArr, new Integer(i), new Integer(i2)});
        }
        YuvImage yuvImage = new YuvImage(bArr, 17, i, i2, null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        yuvImage.compressToJpeg(new Rect(0, 0, i, i2), 100, byteArrayOutputStream);
        try {
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            return BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
        } catch (OutOfMemoryError | Error unused) {
            return null;
        }
    }

    public static Bitmap getYUVBitmap(byte[] bArr, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("872caea0", new Object[]{bArr, new Integer(i), new Integer(i2), new Integer(i3)});
        }
        YuvImage yuvImage = new YuvImage(bArr, 17, i, i2, null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        yuvImage.compressToJpeg(new Rect(0, 0, i, i2), i3, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            return BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
        } catch (OutOfMemoryError unused) {
            return null;
        }
    }

    public static byte[] processImage(byte[] bArr, int i, int i2, int i3, int i4, int i5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("8e6cde34", new Object[]{bArr, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
        }
        if (i == 0) {
            return rotateYUVImage(bArr, i2, i3, i4, i5);
        }
        if (i == 1 || i == 2) {
            return null;
        }
        if (i == 3) {
            return compressRGBAImage(bArr, i2, i3, i4, i5);
        }
        if (i == 4) {
            return compressRGBImage(bArr, i2, i3, i4, i5);
        }
        return null;
    }

    public static byte[] bitmapToByteArray(Bitmap bitmap, float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("8c51a8bd", new Object[]{bitmap, new Float(f)}) : bitmapToByteArray(bitmap, f, BlobManager.UPLOAD_IMAGE_TYPE_JPEG);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] bitmapToByteArray(android.graphics.Bitmap r3, float r4, java.lang.String r5) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.alipay.zoloz.toyger.blob.BitmapHelper.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L20
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            java.lang.Float r2 = new java.lang.Float
            r2.<init>(r4)
            r1[r3] = r2
            r3 = 2
            r1[r3] = r5
            java.lang.String r3 = "6acb8033"
            java.lang.Object r3 = r0.ipc$dispatch(r3, r1)
            byte[] r3 = (byte[]) r3
            return r3
        L20:
            r0 = 0
            r1 = 1065353216(0x3f800000, float:1.0)
            r2 = 0
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 > 0) goto L31
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 <= 0) goto L31
            r1 = 1120403456(0x42c80000, float:100.0)
            float r4 = r4 * r1
            goto L38
        L31:
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 > 0) goto L38
            r4 = 70
            goto L39
        L38:
            int r4 = (int) r4
        L39:
            java.lang.String r1 = "hevc"
            boolean r1 = r1.equalsIgnoreCase(r5)
            if (r1 == 0) goto L6f
            com.alipay.mobile.framework.LauncherApplicationAgent r5 = com.alipay.mobile.framework.LauncherApplicationAgent.getInstance()
            com.alipay.mobile.framework.MicroApplicationContext r5 = r5.getMicroApplicationContext()
            java.lang.Class<com.alipay.android.phone.mobilecommon.multimedia.api.MultimediaImageProcessor> r1 = com.alipay.android.phone.mobilecommon.multimedia.api.MultimediaImageProcessor.class
            java.lang.String r1 = r1.getName()
            java.lang.Object r5 = r5.findServiceByInterface(r1)
            com.alipay.android.phone.mobilecommon.multimedia.api.MultimediaImageProcessor r5 = (com.alipay.android.phone.mobilecommon.multimedia.api.MultimediaImageProcessor) r5
            com.alipay.android.phone.mobilecommon.multimedia.api.data.image.processor.encode.APEncodeOptions r1 = new com.alipay.android.phone.mobilecommon.multimedia.api.data.image.processor.encode.APEncodeOptions     // Catch: java.lang.Exception -> L6a
            r1.<init>()     // Catch: java.lang.Exception -> L6a
            r2 = 5
            r1.outFormat = r2     // Catch: java.lang.Exception -> L6a
            r1.quality = r4     // Catch: java.lang.Exception -> L6a
            com.alipay.android.phone.mobilecommon.multimedia.api.data.image.processor.encode.APEncodeResult r3 = r5.compress(r3, r1)     // Catch: java.lang.Exception -> L6a
            if (r3 == 0) goto Lbb
            byte[] r3 = r3.encodeData     // Catch: java.lang.Exception -> L6a
            r0 = r3
            goto Lbb
        L6a:
            r3 = move-exception
            r3.printStackTrace()
            goto Lbb
        L6f:
            java.lang.String r1 = "webp"
            boolean r5 = r1.equalsIgnoreCase(r5)
            if (r5 == 0) goto La2
            com.alipay.mobile.framework.LauncherApplicationAgent r4 = com.alipay.mobile.framework.LauncherApplicationAgent.getInstance()
            com.alipay.mobile.framework.MicroApplicationContext r4 = r4.getMicroApplicationContext()
            java.lang.Class<com.alipay.android.phone.mobilecommon.multimedia.api.MultimediaImageProcessor> r5 = com.alipay.android.phone.mobilecommon.multimedia.api.MultimediaImageProcessor.class
            java.lang.String r5 = r5.getName()
            java.lang.Object r4 = r4.findServiceByInterface(r5)
            com.alipay.android.phone.mobilecommon.multimedia.api.MultimediaImageProcessor r4 = (com.alipay.android.phone.mobilecommon.multimedia.api.MultimediaImageProcessor) r4
            com.alipay.android.phone.mobilecommon.multimedia.api.data.image.processor.encode.APEncodeOptions r5 = new com.alipay.android.phone.mobilecommon.multimedia.api.data.image.processor.encode.APEncodeOptions     // Catch: java.lang.Exception -> L9d
            r5.<init>()     // Catch: java.lang.Exception -> L9d
            r1 = 4
            r5.outFormat = r1     // Catch: java.lang.Exception -> L9d
            com.alipay.android.phone.mobilecommon.multimedia.api.data.image.processor.encode.APEncodeResult r3 = r4.compress(r3, r5)     // Catch: java.lang.Exception -> L9d
            if (r3 == 0) goto Lbb
            byte[] r0 = r3.encodeData     // Catch: java.lang.Exception -> L9d
            goto Lbb
        L9d:
            r3 = move-exception
            r3.printStackTrace()
            goto Lbb
        La2:
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream
            r5.<init>()
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.JPEG
            r3.compress(r0, r4, r5)
            r5.flush()     // Catch: java.io.IOException -> Lb3
            r5.close()     // Catch: java.io.IOException -> Lb3
            goto Lb7
        Lb3:
            r3 = move-exception
            r3.printStackTrace()
        Lb7:
            byte[] r0 = r5.toByteArray()
        Lbb:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.zoloz.toyger.blob.BitmapHelper.bitmapToByteArray(android.graphics.Bitmap, float, java.lang.String):byte[]");
    }

    public static byte[] compressRGBImage(byte[] bArr, int i, int i2, int i3, int i4) {
        byte[] bArr2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("ae18513f", new Object[]{bArr, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
        Bitmap RGBBytes2Bitmap = RGBBytes2Bitmap(bArr, i, i2);
        if (i3 == 90 || i3 == 270) {
            Matrix matrix = new Matrix();
            matrix.setRotate(i3);
            Bitmap createBitmap = Bitmap.createBitmap(RGBBytes2Bitmap, 0, 0, RGBBytes2Bitmap.getWidth(), RGBBytes2Bitmap.getHeight(), matrix, true);
            byte[] bitmapToByteArray = bitmapToByteArray(createBitmap, i4);
            createBitmap.recycle();
            bArr2 = bitmapToByteArray;
        } else {
            bArr2 = bitmapToByteArray(RGBBytes2Bitmap, i4);
        }
        RGBBytes2Bitmap.recycle();
        return bArr2;
    }

    public static byte[] compressRGBAImage(byte[] bArr, int i, int i2, int i3, int i4) {
        byte[] bArr2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("bcb5a0ca", new Object[]{bArr, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
        Bitmap RGBABytes2Bitmap = RGBABytes2Bitmap(bArr, i, i2);
        if (i3 == 90 || i3 == 270) {
            Matrix matrix = new Matrix();
            matrix.setRotate(i3);
            Bitmap createBitmap = Bitmap.createBitmap(RGBABytes2Bitmap, 0, 0, RGBABytes2Bitmap.getWidth(), RGBABytes2Bitmap.getHeight(), matrix, true);
            byte[] bitmapToByteArray = bitmapToByteArray(createBitmap, i4);
            createBitmap.recycle();
            bArr2 = bitmapToByteArray;
        } else {
            bArr2 = bitmapToByteArray(RGBABytes2Bitmap, i4);
        }
        RGBABytes2Bitmap.recycle();
        return bArr2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:6|(1:8)(2:19|(1:21)(7:22|10|(1:12)|13|14|15|16))|9|10|(0)|13|14|15|16) */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] rotateYUVImage(byte[] r10, int r11, int r12, int r13, int r14) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.alipay.zoloz.toyger.blob.BitmapHelper.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            if (r1 == 0) goto L35
            r1 = 5
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r10
            r10 = 1
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r11)
            r1[r10] = r2
            r10 = 2
            java.lang.Integer r11 = new java.lang.Integer
            r11.<init>(r12)
            r1[r10] = r11
            r10 = 3
            java.lang.Integer r11 = new java.lang.Integer
            r11.<init>(r13)
            r1[r10] = r11
            r10 = 4
            java.lang.Integer r11 = new java.lang.Integer
            r11.<init>(r14)
            r1[r10] = r11
            java.lang.String r10 = "d867a4b3"
            java.lang.Object r10 = r0.ipc$dispatch(r10, r1)
            byte[] r10 = (byte[]) r10
            return r10
        L35:
            r0 = 90
            if (r13 != r0) goto L3f
            byte[] r10 = rotateYUV420Degree270(r10, r11, r12)
        L3d:
            r4 = r10
            goto L4c
        L3f:
            r0 = 270(0x10e, float:3.78E-43)
            if (r13 != r0) goto L48
            byte[] r10 = a(r10, r11, r12)
            goto L3d
        L48:
            r4 = r10
            r9 = r12
            r12 = r11
            r11 = r9
        L4c:
            java.io.ByteArrayOutputStream r10 = new java.io.ByteArrayOutputStream
            r10.<init>()
            if (r4 == 0) goto L66
            android.graphics.YuvImage r13 = new android.graphics.YuvImage
            r5 = 17
            r8 = 0
            r3 = r13
            r6 = r12
            r7 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r2, r2, r12, r11)
            r13.compressToJpeg(r0, r14, r10)
        L66:
            r10.close()     // Catch: java.io.IOException -> L69
        L69:
            byte[] r10 = r10.toByteArray()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.zoloz.toyger.blob.BitmapHelper.rotateYUVImage(byte[], int, int, int, int):byte[]");
    }

    private static byte[] a(byte[] bArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("b1ec42ee", new Object[]{bArr, new Integer(i), new Integer(i2)});
        }
        int i3 = i * i2;
        int i4 = (i3 * 3) / 2;
        byte[] bArr2 = new byte[i4];
        int i5 = 0;
        for (int i6 = 0; i6 < i; i6++) {
            for (int i7 = i2 - 1; i7 >= 0; i7--) {
                bArr2[i5] = bArr[(i7 * i) + i6];
                i5++;
            }
        }
        int i8 = i4 - 1;
        int i9 = i - 1;
        while (i9 > 0) {
            int i10 = i8;
            for (int i11 = 0; i11 < i2 / 2; i11++) {
                int i12 = (i11 * i) + i3;
                bArr2[i10] = bArr[i12 + i9];
                int i13 = i10 - 1;
                bArr2[i13] = bArr[i12 + (i9 - 1)];
                i10 = i13 - 1;
            }
            i9 -= 2;
            i8 = i10;
        }
        return bArr2;
    }

    private static byte[] b(byte[] bArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        int i3 = 0;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("a635b40d", new Object[]{bArr, new Integer(i), new Integer(i2)});
        }
        int i4 = i * i2;
        int i5 = (i4 * 3) / 2;
        byte[] bArr2 = new byte[i5];
        for (int i6 = i4 - 1; i6 >= 0; i6--) {
            bArr2[i3] = bArr[i6];
            i3++;
        }
        for (int i7 = i5 - 1; i7 >= i4; i7 -= 2) {
            int i8 = i3 + 1;
            bArr2[i3] = bArr[i7 - 1];
            i3 = i8 + 1;
            bArr2[i8] = bArr[i7];
        }
        return bArr2;
    }

    public static byte[] rotateYUV420Degree270(byte[] bArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("4a1d35c3", new Object[]{bArr, new Integer(i), new Integer(i2)}) : b(a(bArr, i, i2), i, i2);
    }

    public static Bitmap flipBitmap(Bitmap bitmap, int i) {
        float[] fArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("10cbb636", new Object[]{bitmap, new Integer(i)});
        }
        if (bitmap == null) {
            return null;
        }
        if (i == 0) {
            fArr = new float[]{-1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        } else {
            fArr = new float[]{1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        }
        Matrix matrix = new Matrix();
        matrix.setValues(fArr);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        bitmap.recycle();
        return createBitmap;
    }

    public static Bitmap rotateBitmap(Bitmap bitmap, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("ddbfca24", new Object[]{bitmap, new Integer(i)});
        }
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.setRotate(i);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, false);
        if (createBitmap.equals(bitmap)) {
            return createBitmap;
        }
        bitmap.recycle();
        return createBitmap;
    }

    public static Bitmap cropBitmap(Bitmap bitmap, Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("40b5b56f", new Object[]{bitmap, rect});
        }
        bitmap.getWidth();
        bitmap.getHeight();
        return Bitmap.createBitmap(bitmap, rect.left, rect.top, rect.right - rect.left, rect.bottom - rect.top);
    }
}
