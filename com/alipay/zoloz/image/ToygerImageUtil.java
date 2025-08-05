package com.alipay.zoloz.image;

import android.graphics.Bitmap;
import com.alipay.zoloz.image.impl.ToygerImageAndroid;
import com.alipay.zoloz.image.impl.ToygerImageNative;
import com.alipay.zoloz.toyger.ToygerLog;
import com.alipay.zoloz.toyger.algorithm.TGFrame;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class ToygerImageUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static ToygerImageAndroid f6258a = new ToygerImageAndroid();
    private static ToygerImageNative b = null;

    public static byte[] tgFrameToBlob(TGFrame tGFrame, int i, float f, String str, boolean z) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("8b39fd13", new Object[]{tGFrame, new Integer(i), new Float(f), str, new Boolean(z)});
        }
        byte[] bArr = null;
        ToygerLog.i("TOYGER_FLOW_ANDROID::ToygerImageUtil:ToygerImageNative::tgFrameToBlob imageOptimized:false");
        if (f > 1.0d) {
            try {
                bArr = b.tgFrameToBlob(tGFrame, i, f, str, z);
            } catch (Throwable unused) {
                ToygerLog.e("TOYGER_FLOW_ANDROID::ToygerImageUtil:ToygerImageNative::tgFrameToBlob error !!!! compressRate:" + f);
            }
        } else {
            try {
                bArr = b.tgFrameToBlob(tGFrame, i, f * 100.0f, str, z);
            } catch (Throwable unused2) {
                ToygerLog.e("TOYGER_FLOW_ANDROID::ToygerImageUtil:ToygerImageNative::tgFrameToBlob error !!!! compressRate:" + f);
            }
        }
        if (bArr == null && (bArr = f6258a.tgFrameToBlob(tGFrame, i, f, str, z)) == null) {
            ToygerLog.e("TOYGER_FLOW_ANDROID::ToygerImageUtil:ToygerImageAndroid::tgFrameToBlob");
        }
        if (bArr != null) {
            i2 = bArr.length;
        }
        ToygerLog.i("TOYGER_FLOW_ANDROID:: ToygerImageUtil.tgFrameToBlob", str + " image size " + i2);
        return bArr;
    }

    public static Bitmap tgFrameToBitmap(TGFrame tGFrame, int i, float f, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bitmap) ipChange.ipc$dispatch("e54bc244", new Object[]{tGFrame, new Integer(i), new Float(f), new Boolean(z)}) : f6258a.tgFrameToBitmap(tGFrame, i, f, null, z);
    }
}
