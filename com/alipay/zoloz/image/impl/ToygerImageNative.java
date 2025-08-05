package com.alipay.zoloz.image.impl;

import android.graphics.Bitmap;
import android.util.Log;
import com.alipay.streammedia.mmengine.MMNativeEngineApi;
import com.alipay.streammedia.mmengine.MMNativeException;
import com.alipay.zoloz.image.ToygerImage;
import com.alipay.zoloz.toyger.algorithm.TGFrame;
import com.android.alibaba.ip.runtime.IpChange;
import tv.danmaku.ijk.media.player.IjkLibLoader;

/* loaded from: classes3.dex */
public class ToygerImageNative implements ToygerImage {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alipay.zoloz.image.ToygerImage
    public Bitmap tgFrameToBitmap(TGFrame tGFrame, int i, float f, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("d4570f3a", new Object[]{this, tGFrame, new Integer(i), new Float(f), str, new Boolean(z)});
        }
        return null;
    }

    @Override // com.alipay.zoloz.image.ToygerImage
    public byte[] tgFrameToBlob(TGFrame tGFrame, int i, float f, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("8b39fd13", new Object[]{this, tGFrame, new Integer(i), new Float(f), str, new Boolean(z)});
        }
        return null;
    }

    static {
        try {
            MMNativeEngineApi.loadLibrariesOnce((IjkLibLoader) null);
        } catch (MMNativeException e) {
            Log.e(ToygerImage.TAG, "Failed to load MMNativeEngineApi jni so.", e);
        }
    }
}
