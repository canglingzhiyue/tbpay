package com.alipay.zoloz.toyger.algorithm;

import android.content.Context;
import com.alipay.zoloz.toyger.ToygerAttr;
import com.alipay.zoloz.toyger.face.ToygerDataInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class Toyger {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static native ByteBuffer allocDepthFrameData(long j);

    public static native ByteBuffer allocIRFrameData(long j);

    public static native ByteBuffer allocRGBFrameData(long j);

    public static native void config(IToygerDelegate iToygerDelegate, ToygerConfig toygerConfig);

    public static native void fetchDepthFrameData(ShortBuffer shortBuffer, long j);

    public static native void fetchIRFrameData(ByteBuffer byteBuffer, long j);

    public static native void fetchRGBFrameData(ByteBuffer byteBuffer, long j);

    public static final native List<ToygerDataInfo> getCollectionData();

    public static native long getCurrentToygerPtr();

    public static native Map<String, String> getRuntimeInfo();

    public static native String getVersion();

    public static native boolean init(Context context, byte[] bArr, String str, String str2, Map map);

    public static native boolean loadModel(byte[] bArr, int i);

    public static native void processImage(List<TGFrame> list, TGDepthFrame tGDepthFrame, ToygerAttr toygerAttr);

    public static native void processSensorData(float[] fArr, float[] fArr2, float[] fArr3, long j);

    public static native void release();

    public static native void releaseDepthFrameData(ByteBuffer byteBuffer);

    public static native void releaseIRFrameData(ByteBuffer byteBuffer);

    public static native void releaseRGBFrameData(ByteBuffer byteBuffer);

    public static native void reset();

    public static native boolean tryLoadXnn(long j, byte[] bArr);
}
