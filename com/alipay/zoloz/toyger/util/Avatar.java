package com.alipay.zoloz.toyger.util;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.alipay.mobile.security.bio.utils.OutputStreamUtils;
import com.alipay.zoloz.toyger.face.FaceBlobManager;
import com.alipay.zoloz.toyger.face.ToygerFaceAttr;
import com.alipay.zoloz.toyger.workspace.task.ToygerBaseTask;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;

/* loaded from: classes3.dex */
public class Avatar {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static byte[] genAvatar(Bitmap bitmap, ToygerFaceAttr toygerFaceAttr) {
        byte[] bArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("1895f8db", new Object[]{bitmap, toygerFaceAttr});
        }
        ByteArrayOutputStream byteArrayOutputStream = null;
        byte[] bArr2 = null;
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Rect convertFaceRegion = FaceBlobManager.convertFaceRegion(toygerFaceAttr.faceRegion, width, height, 0, false);
        BioLog.d("avatar", "bitmapWidth=" + width + ", bitmapHeight=" + height + ", attr.faceRegion=" + toygerFaceAttr.faceRegion + ", rect=" + convertFaceRegion);
        int i = convertFaceRegion.left;
        int i2 = convertFaceRegion.top;
        int i3 = convertFaceRegion.right;
        int i4 = convertFaceRegion.bottom;
        int i5 = (i3 - i) / 2;
        int max = Math.max(0, i - i5);
        int i6 = (i4 - i2) / 2;
        int max2 = Math.max(0, i2 - i6);
        int min = Math.min(width, i3 + i5);
        int min2 = Math.min(height, i4 + i6);
        int i7 = min - max;
        int i8 = min2 - max2;
        BioLog.d("avatar", "left=" + max + ", top=" + max2 + ", right=" + min + ", bottom=" + min2 + ", width=" + i7 + ", height=" + i8);
        try {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap, max, max2, i7, i8);
            Bitmap blur = ToygerBaseTask.blur(createBitmap, 1, 6.0f);
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                blur.compress(Bitmap.CompressFormat.JPEG, 80, byteArrayOutputStream2);
                bArr2 = byteArrayOutputStream2.toByteArray();
                BioLog.d("avatar", "avatar.width=" + blur.getWidth() + ", avatar.height=" + blur.getHeight() + ", avatar.length=[" + bArr2.length + "] bytes.");
                createBitmap.recycle();
                blur.recycle();
                OutputStreamUtils.close(byteArrayOutputStream2);
                return bArr2;
            } catch (Throwable th) {
                th = th;
                bArr = bArr2;
                byteArrayOutputStream = byteArrayOutputStream2;
                try {
                    BioLog.e(th);
                    OutputStreamUtils.close(byteArrayOutputStream);
                    return bArr;
                } catch (Throwable th2) {
                    OutputStreamUtils.close(byteArrayOutputStream);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            bArr = null;
        }
    }
}
