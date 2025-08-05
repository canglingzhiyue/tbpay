package com.taobao.android.mnncv;

import android.graphics.Bitmap;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.alinnpython.AliNNPythonJavaToPythonCallback;

/* loaded from: classes6.dex */
public class MNNCVImage implements AliNNPythonJavaToPythonCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Bitmap bitmap;
    public byte[] data;
    public int format;
    public int height;
    public long pythonPtr;
    public int width;

    private static native int[] nativeByteArrayToIntArray(byte[] bArr);

    private static native long nativeConvertBitMapToPythonObj(Bitmap bitmap);

    private static native long nativeConvertToPythonObj(byte[] bArr, int i, int i2, int i3);

    public MNNCVImage(byte[] bArr, int i, int i2, int i3) {
        this.data = bArr;
        this.width = i;
        this.height = i2;
        this.format = i3;
    }

    public MNNCVImage(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    public Bitmap toBitmap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("aad6feef", new Object[]{this});
        }
        Bitmap bitmap = this.bitmap;
        if (bitmap != null) {
            return bitmap;
        }
        this.bitmap = Bitmap.createBitmap(nativeByteArrayToIntArray(this.data), this.width, this.height, Bitmap.Config.ARGB_8888);
        return this.bitmap;
    }

    @Override // com.taobao.android.alinnpython.AliNNPythonJavaToPythonCallback
    public long javaToPython() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c2470f74", new Object[]{this})).longValue();
        }
        Bitmap bitmap = this.bitmap;
        if (bitmap != null) {
            return nativeConvertBitMapToPythonObj(bitmap);
        }
        return nativeConvertToPythonObj(this.data, this.width, this.height, this.format);
    }
}
