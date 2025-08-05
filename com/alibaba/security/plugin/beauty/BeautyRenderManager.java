package com.alibaba.security.plugin.beauty;

import android.content.Context;
import android.opengl.GLES20;
import com.alibaba.security.realidentity.a;
import com.alibaba.security.realidentity.h2;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.librace.MediaChainEngine;

/* loaded from: classes3.dex */
public class BeautyRenderManager implements h2 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "BeautyRenderManager";
    public MediaChainEngine mMediaChainEngine;
    public int mOrientation;
    public int mPreHeight;
    public int mPreWidth;

    @Override // com.alibaba.security.realidentity.h2
    public void draw(byte[] bArr, float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5864751d", new Object[]{this, bArr, fArr});
            return;
        }
        MediaChainEngine mediaChainEngine = this.mMediaChainEngine;
        if (mediaChainEngine == null || bArr == null) {
            return;
        }
        try {
            mediaChainEngine.a(bArr, 1, this.mPreWidth, this.mPreHeight, 0, this.mOrientation, 0, 2);
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16384);
            this.mMediaChainEngine.a(fArr);
        } catch (Throwable unused) {
        }
    }

    @Override // com.alibaba.security.realidentity.h2
    public void onChanged(int i, int i2) {
        MediaChainEngine mediaChainEngine;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("903f4f3c", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (i <= 0 || (mediaChainEngine = this.mMediaChainEngine) == null) {
        } else {
            int i3 = (this.mPreWidth * i) / this.mPreHeight;
            mediaChainEngine.a(0, (i2 - i3) / 2, i, i3);
        }
    }

    @Override // com.alibaba.security.realidentity.h2
    public void onCreated(Context context, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4ca7278", new Object[]{this, context, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        try {
            this.mPreWidth = i;
            this.mPreHeight = i2;
            this.mOrientation = i3;
            MediaChainEngine mediaChainEngine = new MediaChainEngine(context, true);
            this.mMediaChainEngine = mediaChainEngine;
            mediaChainEngine.a(i4, i2, i, true);
            this.mMediaChainEngine.a(0, 0, i2, i);
            this.mMediaChainEngine.a(0, true);
            this.mMediaChainEngine.a(1, true);
            this.mMediaChainEngine.a(4, true);
            this.mMediaChainEngine.a(3, true, false);
            this.mMediaChainEngine.a(2, true, false);
            this.mMediaChainEngine.a(1, 0.8f);
            this.mMediaChainEngine.a(3, 0.5f);
            this.mMediaChainEngine.a(2, 1.0f);
            this.mMediaChainEngine.a(6, 1.0f);
            this.mMediaChainEngine.b(0, 0.2f);
            this.mMediaChainEngine.b(1, 0.8f);
            this.mMediaChainEngine.b(2, 0.4f);
            this.mMediaChainEngine.b(3, 0.0f);
            this.mMediaChainEngine.b(4, 0.4f);
            this.mMediaChainEngine.b(5, 0.0f);
            this.mMediaChainEngine.b(6, 0.0f);
            this.mMediaChainEngine.b(7, 0.0f);
            this.mMediaChainEngine.b(8, 0.6f);
            this.mMediaChainEngine.b(9, 0.0f);
            this.mMediaChainEngine.b(10, 0.0f);
            this.mMediaChainEngine.b(11, 0.0f);
            this.mMediaChainEngine.b(12, 0.0f);
            this.mMediaChainEngine.b(13, 0.0f);
            this.mMediaChainEngine.b(14, 0.2f);
            this.mMediaChainEngine.b(15, 0.0f);
            this.mMediaChainEngine.b(16, 0.0f);
            this.mMediaChainEngine.b(17, 0.0f);
            this.mMediaChainEngine.b(18, 0.0f);
            this.mMediaChainEngine.b(19, 0.0f);
            this.mMediaChainEngine.b(20, 0.0f);
            this.mMediaChainEngine.b(21, 0.0f);
        } catch (Throwable th) {
            a.a(TAG, "face engine init fail", th);
        }
    }

    @Override // com.alibaba.security.realidentity.h2
    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        try {
            if (this.mMediaChainEngine == null) {
                return;
            }
            this.mMediaChainEngine.k();
            this.mMediaChainEngine = null;
        } catch (Throwable unused) {
        }
    }
}
