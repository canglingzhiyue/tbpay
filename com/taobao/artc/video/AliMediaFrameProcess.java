package com.taobao.artc.video;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.nio.ByteBuffer;
import tb.kge;

/* loaded from: classes6.dex */
public class AliMediaFrameProcess {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes6.dex */
    public enum TextureType {
        ORI_TEXTURE,
        MIX_TEXTURE,
        SCALE_TEXTURE
    }

    static {
        kge.a(-564308488);
    }

    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
        }
        return 0;
    }

    public int a(int i, int i2, int i3, float[] fArr, ByteBuffer[] byteBufferArr, int[] iArr, int i4, int i5, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb86b237", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), fArr, byteBufferArr, iArr, new Integer(i4), new Integer(i5), new Boolean(z)})).intValue();
        }
        return 0;
    }

    public int a(TextureType textureType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e2811f41", new Object[]{this, textureType})).intValue();
        }
        return 0;
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        return 0;
    }

    public AliMediaFrameProcess(Context context, int i, int i2) {
    }
}
