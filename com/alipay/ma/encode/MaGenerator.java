package com.alipay.ma.encode;

import android.graphics.Bitmap;
import com.alipay.ma.MaLogger;
import com.alipay.ma.decode.MaDecode;
import com.alipay.ma.encode.InputParameters.Gen0InputParameters;
import com.alipay.ma.encode.InputParameters.Gen3InputParameters;
import com.alipay.ma.encode.InputParameters.LogoBWInputParameters;
import com.alipay.ma.encode.InputParameters.MaEncodeInputParameters;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class MaGenerator {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "MaGenerator";

    private static native byte[] generateBWQRCode(String str, String str2, int i, int i2, int i3, int i4, char c);

    private static native byte[] generateGen3Code(String str, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, char c, char c2, int i9, int i10, int i11);

    private static native byte[] generateLogoQRCode(String str, int i, int i2, int i3, byte[] bArr, int i4, int i5, int i6, int i7, int i8, int i9, int i10);

    static {
        MaLogger.v(TAG, "MaGenerator: loading so files");
        MaDecode.init("maGenerator");
    }

    public static Bitmap facade(MaEncodeInputParameters maEncodeInputParameters) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("9f528d14", new Object[]{maEncodeInputParameters});
        }
        if (!maEncodeInputParameters.isLegal()) {
            return null;
        }
        try {
            i = maEncodeInputParameters.type;
        } catch (Exception e) {
            e.toString();
        }
        if (i == 0) {
            String str = "encodeWhat = " + maEncodeInputParameters.type;
            return a((Gen0InputParameters) maEncodeInputParameters);
        }
        if (i != 1) {
            if (i != 3) {
                if (i != 4) {
                    return null;
                }
                return a((LogoBWInputParameters) maEncodeInputParameters);
            }
            String str2 = "encodeWhat = " + maEncodeInputParameters.type;
            return a((Gen3InputParameters) maEncodeInputParameters);
        }
        return null;
    }

    private static synchronized Bitmap a(LogoBWInputParameters logoBWInputParameters) {
        synchronized (MaGenerator.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Bitmap) ipChange.ipc$dispatch("c77838d1", new Object[]{logoBWInputParameters});
            }
            try {
                try {
                    byte[] generateLogoQRCode = generateLogoQRCode(logoBWInputParameters.publicData, logoBWInputParameters.margin, logoBWInputParameters.qrSize, logoBWInputParameters.version, logoBWInputParameters.logoData, logoBWInputParameters.logoWidth, logoBWInputParameters.logoHeight, logoBWInputParameters.logoChannel, logoBWInputParameters.logoSize, logoBWInputParameters.logoX, logoBWInputParameters.logoY, logoBWInputParameters.qrcolor);
                    int sqrt = (int) Math.sqrt(generateLogoQRCode.length / 3.0d);
                    return a(generateLogoQRCode, sqrt, sqrt, 3);
                } catch (UnsatisfiedLinkError e) {
                    MaLogger.e(TAG, "Failed to load libtbdecode.so", e);
                    return null;
                }
            } catch (Exception e2) {
                MaLogger.e("Failed to load libtbdecode.so 2", e2);
                return null;
            }
        }
    }

    private static synchronized Bitmap a(Gen3InputParameters gen3InputParameters) {
        synchronized (MaGenerator.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Bitmap) ipChange.ipc$dispatch("334c2474", new Object[]{gen3InputParameters});
            }
            try {
                byte[] generateGen3Code = generateGen3Code(gen3InputParameters.publicData, gen3InputParameters.bgImage_data, gen3InputParameters.bgImage_width, gen3InputParameters.bgImage_height, gen3InputParameters.bgImage_channel, gen3InputParameters.bgImage_step, gen3InputParameters.qrX, gen3InputParameters.qrY, gen3InputParameters.qrSize, gen3InputParameters.gen3format, gen3InputParameters.domainIndex, gen3InputParameters.errorCorrectionLevel, gen3InputParameters.visual_level, gen3InputParameters.version, gen3InputParameters.type);
                int sqrt = (int) Math.sqrt(generateGen3Code.length / 3.0d);
                return a(generateGen3Code, sqrt, sqrt, gen3InputParameters.bgImage_channel);
            } catch (Exception e) {
                MaLogger.e(TAG, "Failed to load libtbdecode.so 2", e);
                return null;
            } catch (UnsatisfiedLinkError e2) {
                MaLogger.e(TAG, "Failed to load libtbdecode.so", e2);
                return null;
            }
        }
    }

    private static synchronized Bitmap a(Gen0InputParameters gen0InputParameters) {
        synchronized (MaGenerator.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Bitmap) ipChange.ipc$dispatch("8387d831", new Object[]{gen0InputParameters});
            }
            try {
                byte[] generateBWQRCode = generateBWQRCode(gen0InputParameters.publicData, gen0InputParameters.hiddenData, gen0InputParameters.margin, gen0InputParameters.qrSize, gen0InputParameters.version, gen0InputParameters.rotation, gen0InputParameters.errorCorrectionLevel);
                int sqrt = (int) Math.sqrt(generateBWQRCode.length);
                return a(generateBWQRCode, sqrt, sqrt);
            } catch (Exception e) {
                MaLogger.e(TAG, "Failed to load libtbdecode.so 2", e);
                return null;
            } catch (UnsatisfiedLinkError e2) {
                MaLogger.e(TAG, "Failed to load libtbdecode.so", e2);
                return null;
            }
        }
    }

    private static Bitmap a(byte[] bArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        int i3 = 0;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("2e7049ad", new Object[]{bArr, new Integer(i), new Integer(i2)});
        }
        if (bArr == null) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        int[] iArr = new int[i * i2];
        int i4 = 0;
        while (i3 < bArr.length) {
            iArr[i4] = (((bArr[i3] & 255) << 16) - 16777216) + ((bArr[i3] & 255) << 8) + (bArr[i3] & 255);
            i3++;
            i4++;
        }
        createBitmap.setPixels(iArr, 0, i, 0, 0, i, i2);
        return createBitmap;
    }

    private static Bitmap a(byte[] bArr, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        int i4 = 0;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("4f1007f2", new Object[]{bArr, new Integer(i), new Integer(i2), new Integer(i3)});
        }
        if (bArr == null) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        int[] iArr = new int[i * i2];
        int i5 = 0;
        while (i4 < bArr.length) {
            iArr[i5] = (i3 == 4 ? (bArr[i4 + 3] & 255) << 24 : -16777216) + ((bArr[i4] & 255) << 16) + ((bArr[i4 + 1] & 255) << 8) + (bArr[i4 + 2] & 255);
            i4 += i3;
            i5++;
        }
        createBitmap.setPixels(iArr, 0, i, 0, 0, i, i2);
        return createBitmap;
    }
}
