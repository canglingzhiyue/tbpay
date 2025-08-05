package com.alipay.mobile.security.bio.utils;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class RotateBitmapHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static Bitmap getRotateBitmap(Bitmap bitmap, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("4ebcf5d7", new Object[]{bitmap, new Float(f)});
        }
        if (bitmap == null) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(f);
        try {
            return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        } catch (NullPointerException e) {
            BioLog.e(e.toString());
            return null;
        } catch (OutOfMemoryError e2) {
            BioLog.e(e2.toString());
            return null;
        }
    }

    public static Bitmap getVerticalRotateBitmap(Bitmap bitmap, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("bd974ded", new Object[]{bitmap, new Float(f)});
        }
        if (bitmap == null || bitmap.isRecycled()) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.postScale(1.0f, -1.0f);
        matrix.postRotate(f);
        try {
            return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
        } catch (OutOfMemoryError e) {
            BioLog.e(e.toString());
            return null;
        }
    }

    public static Bitmap getUprightBitmap(Bitmap bitmap, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("785dfab1", new Object[]{bitmap, new Float(f)});
        }
        if (bitmap == null) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(f);
        matrix.postScale(1.0f, -1.0f);
        try {
            return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        } catch (NullPointerException e) {
            BioLog.e(e.toString());
            return null;
        } catch (OutOfMemoryError e2) {
            BioLog.e(e2.toString());
            return null;
        }
    }
}
