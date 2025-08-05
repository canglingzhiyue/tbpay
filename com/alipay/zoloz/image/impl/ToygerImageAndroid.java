package com.alipay.zoloz.image.impl;

import android.graphics.Bitmap;
import com.alipay.zoloz.image.ToygerImage;
import com.alipay.zoloz.toyger.ToygerLog;
import com.alipay.zoloz.toyger.algorithm.TGFrame;
import com.alipay.zoloz.toyger.blob.BitmapHelper;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class ToygerImageAndroid implements ToygerImage {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    private int a(TGFrame tGFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ae5510a7", new Object[]{this, tGFrame})).intValue();
        }
        switch (tGFrame.frameMode) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 6;
            case 6:
                return 4;
            default:
                return -1;
        }
    }

    @Override // com.alipay.zoloz.image.ToygerImage
    public byte[] tgFrameToBlob(TGFrame tGFrame, int i, float f, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("8b39fd13", new Object[]{this, tGFrame, new Integer(i), new Float(f), str, new Boolean(z)});
        }
        long currentTimeMillis = System.currentTimeMillis();
        byte[] bArr = null;
        if (tGFrame != null) {
            Bitmap tgFrameToBitmap = tgFrameToBitmap(tGFrame, i, f, str, false);
            if (tgFrameToBitmap != null) {
                bArr = BitmapHelper.bitmapToByteArray(tgFrameToBitmap, f, str);
            } else {
                ToygerLog.e(ToygerImage.TAG, "ToygerImageAndroid.tgFrameToBlob resizedBitmap = null");
            }
        } else {
            ToygerLog.e(ToygerImage.TAG, "ToygerImageAndroid.tgFrameToBlob input tgframe = null");
        }
        ToygerLog.i(ToygerImage.TAG, "ToygerImageAndroid.tgFrameToBlob(desiredWidth=" + i + ", compressRate=" + f + ") cost: " + (System.currentTimeMillis() - currentTimeMillis) + "ms.");
        return bArr;
    }

    @Override // com.alipay.zoloz.image.ToygerImage
    public Bitmap tgFrameToBitmap(TGFrame tGFrame, int i, float f, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("d4570f3a", new Object[]{this, tGFrame, new Integer(i), new Float(f), str, new Boolean(z)});
        }
        if (tGFrame != null) {
            int a2 = a(tGFrame);
            if (a2 >= 0) {
                Bitmap bytes2Bitmap = BitmapHelper.bytes2Bitmap(tGFrame.data, tGFrame.width, tGFrame.height, a2);
                if (bytes2Bitmap != null) {
                    if (tGFrame.rotation == 90 || tGFrame.rotation == 270) {
                        int i2 = tGFrame.height;
                        if (i2 <= i || i <= 0) {
                            i = i2;
                        }
                        if (i != i2) {
                            bytes2Bitmap = BitmapHelper.resizeByHeight(bytes2Bitmap, i);
                        }
                    } else {
                        int i3 = tGFrame.width;
                        if (i3 <= i || i <= 0) {
                            i = i3;
                        }
                        if (i != i3) {
                            bytes2Bitmap = BitmapHelper.resizeByWidth(bytes2Bitmap, i);
                        }
                    }
                    Bitmap rotateBitmap = BitmapHelper.rotateBitmap(bytes2Bitmap, tGFrame.rotation);
                    if (z) {
                        rotateBitmap = BitmapHelper.flipBitmap(rotateBitmap, 0);
                    }
                    return rotateBitmap;
                }
                ToygerLog.e(ToygerImage.TAG, "ToygerImageAndroid.tgFrameToBitmap BitmapHelper.bytes2Bitmap error");
                return null;
            }
            ToygerLog.e(ToygerImage.TAG, "ToygerImageAndroid.tgFrameToBitmap unrecognized mode");
            return null;
        }
        ToygerLog.e(ToygerImage.TAG, "ToygerImageAndroid.tgFrameToBitmap input tgframe = null");
        return null;
    }
}
