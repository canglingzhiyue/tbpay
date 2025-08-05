package com.alipay.mobile.security.faceauth;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class FaceDetectType {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int defaultValue;
    public static final FaceDetectType AIMLESS = new FaceDetectType(0);
    public static final FaceDetectType BLINK = new FaceDetectType(1);
    public static final FaceDetectType MOUTH = new FaceDetectType(2);
    public static final FaceDetectType NONE = new FaceDetectType(3);
    public static final FaceDetectType POS_YAW = new FaceDetectType(4);
    public static final FaceDetectType POS_PITCH = new FaceDetectType(5);
    public static final FaceDetectType IDST = new FaceDetectType(6);

    public FaceDetectType(int i) {
        this.defaultValue = i;
    }

    public int getValue() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d1b766b5", new Object[]{this})).intValue() : this.defaultValue;
    }
}
