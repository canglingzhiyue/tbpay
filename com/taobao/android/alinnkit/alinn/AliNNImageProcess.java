package com.taobao.android.alinnkit.alinn;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.alinnkit.alinn.AliNNNetInstance;
import tb.kge;

/* loaded from: classes4.dex */
public class AliNNImageProcess {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes4.dex */
    public enum Filter {
        NEAREST(0),
        BILINEAL(1),
        BICUBIC(2);
        
        public int type;

        Filter(int i) {
            this.type = i;
        }
    }

    /* loaded from: classes4.dex */
    public enum Format {
        RGBA(0),
        RGB(1),
        BGR(2),
        GRAY(3),
        BGRA(4),
        YUV_420(10),
        YUV_NV21(11);
        
        public int type;

        Format(int i) {
            this.type = i;
        }
    }

    /* loaded from: classes4.dex */
    public enum Wrap {
        CLAMP_TO_EDGE(0),
        ZERO(1),
        REPEAT(2);
        
        public int type;

        Wrap(int i) {
            this.type = i;
        }
    }

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public float[] f9017a = {0.0f, 0.0f, 0.0f, 0.0f};
        public float[] b = {1.0f, 1.0f, 1.0f, 1.0f};
        public Format c = Format.RGBA;
        public Format d = Format.BGR;
        public Filter e = Filter.NEAREST;
        public Wrap f = Wrap.CLAMP_TO_EDGE;

        static {
            kge.a(1145102953);
        }
    }

    static {
        kge.a(75000701);
    }

    public static boolean a(Bitmap bitmap, AliNNNetInstance.c.a aVar, a aVar2, Matrix matrix) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("777efa49", new Object[]{bitmap, aVar, aVar2, matrix})).booleanValue();
        }
        if (matrix == null) {
            matrix = new Matrix();
        }
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        return AliNNNetNative.nativeConvertBitmapToTensor(bitmap, aVar.a(), aVar2.d.type, aVar2.e.type, aVar2.f.type, fArr, aVar2.f9017a, aVar2.b);
    }
}
