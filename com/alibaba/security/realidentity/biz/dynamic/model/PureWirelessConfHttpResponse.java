package com.alibaba.security.realidentity.biz.dynamic.model;

import java.io.Serializable;

/* loaded from: classes3.dex */
public class PureWirelessConfHttpResponse implements Serializable {
    public String rpArupTimeOut;
    public String rpCamera2Close;
    public String rpCameraPreview;
    public String rpsdkBiometricsBeautyEffect;
    public String rpsdkBiometricsBioBlockTip;
    public String rpsdkCameraSizeChange;
    public String rpsdkClientTypeRestructSwitch;
    public String rpsdkCollectLocalImage;
    public String rpsdkColorfulBioSwitch;
    public String rpsdkCtidRetrySwitch;
    public String rpsdkHonorMagicWinOff;
    public ModelInfo rpsdkModelInfo;
    public String rpsdkRemoteModelSwitch;
    public String rpsdkStartSensorSwitch;
    public String rpsdkUseHwMagicWindow;
    public String rpsdkUseLiteVM;
    public String rpsdkUseLosslessCertImage;
    public String rpsdkWukongCallbackTimeout;
    public String rpsdkWukongSwitch;

    /* loaded from: classes3.dex */
    public static class ModelInfo implements Serializable {
        public String md5;
        public String modelName;
        public String modelUrl;
        public String size;
    }
}
