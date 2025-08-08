package com.alipay.ma.analyze.api;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.YuvImage;
import mtopsdk.common.util.StringUtils;
import com.alipay.ma.analyze.helper.MaResultTypeHelper;
import com.alipay.ma.decode.DecodeResult;
import com.alipay.ma.decode.DecodeType;
import com.alipay.ma.decode.MaDecode;
import com.alipay.ma.util.ImageTool;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class MaAnalyzeAPI {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static DecodeResult[] decode(YuvImage yuvImage, Rect rect, DecodeType... decodeTypeArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DecodeResult[]) ipChange.ipc$dispatch("47294f61", new Object[]{yuvImage, rect, decodeTypeArr});
        }
        if (yuvImage != null) {
            return decode(yuvImage.getYuvData(), yuvImage.getWidth(), yuvImage.getHeight(), rect, decodeTypeArr);
        }
        return null;
    }

    public static DecodeResult[] decodeScanMode(byte[] bArr, int i, int i2, int i3, Rect rect, int i4) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DecodeResult[]) ipChange.ipc$dispatch("e0049f49", new Object[]{bArr, new Integer(i), new Integer(i2), new Integer(i3), rect, new Integer(i4)}) : decodeScanMode(bArr, i, i2, i3, rect, i4, 1.0f);
    }

    public static DecodeResult[] decodeScanMode(byte[] bArr, int i, int i2, int i3, Rect rect, int i4, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DecodeResult[]) ipChange.ipc$dispatch("b84f764b", new Object[]{bArr, new Integer(i), new Integer(i2), new Integer(i3), rect, new Integer(i4), new Float(f)});
        }
        DecodeResult[] codeDecode = MaDecode.codeDecode(bArr, i, i2, i3, rect == null ? a(i, i2) : rect, i4, "", null, f);
        if (codeDecode == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (DecodeResult decodeResult : codeDecode) {
            if (decodeResult != null && !StringUtils.isEmpty(decodeResult.strCode) && (decodeResult.type | i4) > 0) {
                decodeResult.resultMaType = MaResultTypeHelper.getMaType(decodeResult);
                arrayList.add(decodeResult);
            }
        }
        return (DecodeResult[]) arrayList.toArray(new DecodeResult[arrayList.size()]);
    }

    public static DecodeResult[] decode(byte[] bArr, int i, int i2, Rect rect, DecodeType... decodeTypeArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DecodeResult[]) ipChange.ipc$dispatch("6cee5a96", new Object[]{bArr, new Integer(i), new Integer(i2), rect, decodeTypeArr}) : decode(bArr, i, i2, i, rect, decodeTypeArr);
    }

    public static DecodeResult[] decode(byte[] bArr, int i, int i2, int i3, Rect rect, DecodeType... decodeTypeArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DecodeResult[]) ipChange.ipc$dispatch("3ca259e1", new Object[]{bArr, new Integer(i), new Integer(i2), new Integer(i3), rect, decodeTypeArr});
        }
        int i4 = 0;
        for (DecodeType decodeType : decodeTypeArr) {
            i4 |= decodeType.getCodeType();
        }
        return decodeScanMode(bArr, i, i2, i3, rect, i4);
    }

    public static DecodeResult[] decode(String str, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DecodeResult[]) ipChange.ipc$dispatch("8c7fa56", new Object[]{str, new Integer(i)}) : decode(str, i, false);
    }

    public static DecodeResult[] decode(String str, int i, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DecodeResult[]) ipChange.ipc$dispatch("426bb94a", new Object[]{str, new Integer(i), new Boolean(z)}) : decode(str, i, 4, z);
    }

    public static DecodeResult[] decode(String str, int i, int i2, boolean z) {
        DecodeResult[] codeDecodePictureWithQr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DecodeResult[]) ipChange.ipc$dispatch("e42f6d85", new Object[]{str, new Integer(i), new Integer(i2), new Boolean(z)});
        }
        if (!StringUtils.isEmpty(str) && (codeDecodePictureWithQr = MaDecode.codeDecodePictureWithQr(str, i, i2, z)) != null && codeDecodePictureWithQr.length != 0) {
            ArrayList arrayList = new ArrayList();
            for (DecodeResult decodeResult : codeDecodePictureWithQr) {
                if (decodeResult == null || StringUtils.isEmpty(decodeResult.strCode)) {
                    return null;
                }
                decodeResult.resultMaType = MaResultTypeHelper.getMaType(decodeResult);
                arrayList.add(decodeResult);
            }
            if (arrayList.size() > 0) {
                return (DecodeResult[]) arrayList.toArray(new DecodeResult[arrayList.size()]);
            }
        }
        return null;
    }

    public static DecodeResult[] decode(String str, Context context, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DecodeResult[]) ipChange.ipc$dispatch("ce1d5a00", new Object[]{str, context, new Integer(i)}) : decode(str, context, i, false);
    }

    public static DecodeResult[] decode(String str, Context context, int i, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DecodeResult[]) ipChange.ipc$dispatch("27c24ee0", new Object[]{str, context, new Integer(i), new Boolean(z)}) : decode(str, context, i, 4, z);
    }

    public static DecodeResult[] decode(String str, Context context, int i, int i2, boolean z) {
        DecodeResult[] codeDecodePictureWithQr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DecodeResult[]) ipChange.ipc$dispatch("a9ab8aaf", new Object[]{str, context, new Integer(i), new Integer(i2), new Boolean(z)});
        }
        if (!StringUtils.isEmpty(str) && context != null && (codeDecodePictureWithQr = MaDecode.codeDecodePictureWithQr(str, context, i, i2, z)) != null && codeDecodePictureWithQr.length != 0) {
            ArrayList arrayList = new ArrayList();
            for (DecodeResult decodeResult : codeDecodePictureWithQr) {
                if (decodeResult == null || StringUtils.isEmpty(decodeResult.strCode)) {
                    return null;
                }
                decodeResult.resultMaType = MaResultTypeHelper.getMaType(decodeResult);
                arrayList.add(decodeResult);
            }
            if (arrayList.size() > 0) {
                return (DecodeResult[]) arrayList.toArray(new DecodeResult[arrayList.size()]);
            }
        }
        return null;
    }

    public static DecodeResult[] decode(Bitmap bitmap, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DecodeResult[]) ipChange.ipc$dispatch("823657b0", new Object[]{bitmap, new Integer(i)}) : decode(bitmap, i, false);
    }

    public static DecodeResult[] decode(Bitmap bitmap, int i, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DecodeResult[]) ipChange.ipc$dispatch("f6c90730", new Object[]{bitmap, new Integer(i), new Boolean(z)}) : decode(bitmap, i, 4, z);
    }

    public static DecodeResult[] decode(Bitmap bitmap, int i, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DecodeResult[]) ipChange.ipc$dispatch("148c47b0", new Object[]{bitmap, new Integer(i), new Boolean(z), new Boolean(z2)});
        }
        if (z2) {
            MaDecode.setReaderParamsJ("kDownGradeAlbum", "1");
            DecodeResult[] decode = decode(bitmap, i, 4, z);
            MaDecode.setReaderParamsJ("kDownGradeAlbum", "0");
            return decode;
        }
        return decode(bitmap, i, 4, z);
    }

    public static DecodeResult[] decode(Bitmap bitmap, int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DecodeResult[]) ipChange.ipc$dispatch("bb7bdc5f", new Object[]{bitmap, new Integer(i), new Integer(i2), new Boolean(z)}) : decode(bitmap, i, i2, z, (ImageTool.ImageSampleOutInfo) null);
    }

    public static DecodeResult[] decode(Bitmap bitmap, int i, int i2, boolean z, ImageTool.ImageSampleOutInfo imageSampleOutInfo) {
        DecodeResult[] codeDecodePictureWithQr;
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DecodeResult[]) ipChange.ipc$dispatch("a82a9345", new Object[]{bitmap, new Integer(i), new Integer(i2), new Boolean(z), imageSampleOutInfo});
        }
        if (bitmap == null) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.outWidth = bitmap.getWidth();
        options.outHeight = bitmap.getHeight();
        int computeSampleSize = ImageTool.computeSampleSize(options, 1500, 2250000);
        if (imageSampleOutInfo != null) {
            imageSampleOutInfo.sampleSize = computeSampleSize;
            imageSampleOutInfo.beforeSampleHeight = options.outHeight;
            imageSampleOutInfo.beforeSampleWidth = options.outWidth;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (computeSampleSize > 1) {
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, bitmap.getWidth() / computeSampleSize, bitmap.getHeight() / computeSampleSize, false);
            codeDecodePictureWithQr = MaDecode.codeDecodePictureWithQr(createScaledBitmap, i, i2, z);
            i3 = bitmap.getWidth() / computeSampleSize;
            height = bitmap.getHeight() / computeSampleSize;
            createScaledBitmap.recycle();
        } else {
            codeDecodePictureWithQr = MaDecode.codeDecodePictureWithQr(bitmap, i, i2, z);
            i3 = width;
        }
        if (imageSampleOutInfo != null) {
            imageSampleOutInfo.afterSampleWidth = i3;
            imageSampleOutInfo.afterSampleHeight = height;
            imageSampleOutInfo.type = bitmap.getConfig() != null ? bitmap.getConfig().name() : "null";
        }
        if (codeDecodePictureWithQr != null && codeDecodePictureWithQr.length != 0) {
            ArrayList arrayList = new ArrayList();
            for (DecodeResult decodeResult : codeDecodePictureWithQr) {
                if (decodeResult == null || StringUtils.isEmpty(decodeResult.strCode)) {
                    return null;
                }
                decodeResult.resultMaType = MaResultTypeHelper.getMaType(decodeResult);
                arrayList.add(decodeResult);
            }
            if (arrayList.size() > 0) {
                return (DecodeResult[]) arrayList.toArray(new DecodeResult[arrayList.size()]);
            }
        }
        return null;
    }

    private static Rect a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("55265e11", new Object[]{new Integer(i), new Integer(i2)});
        }
        int min = Math.min(i, i2) & (-8);
        return new Rect(Math.abs((i - i2) / 2) & (-4), 0, min, min);
    }
}
