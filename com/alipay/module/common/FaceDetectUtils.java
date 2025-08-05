package com.alipay.module.common;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class FaceDetectUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9064aa65", new Object[]{new Integer(i)});
        }
        if (i == 1010 || i == 1011) {
            return "网络异常";
        }
        if (i == 3004) {
            return "用户取消";
        }
        switch (i) {
            case 100:
                return "摄像头权限未开通，无法使用，请开通权限再试";
            case 101:
                return "设备无法使用请检查你的前置摄像头是否可用";
            case 102:
                return "CPU性能不符合要求";
            case 103:
                return "前置条件,像素不达标";
            default:
                return "人气大爆发，一会儿接待您";
        }
    }
}
