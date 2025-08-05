package com.alibaba.security.realidentity.biz.config;

import android.graphics.Bitmap;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.security.realidentity.biz.dynamic.model.PureWirelessConfHttpResponse;
import java.io.Serializable;

/* loaded from: classes3.dex */
public class BasicsConfig implements Serializable {
    @JSONField(serialize = false)
    public transient Bitmap faceBitmap;
    public PureWirelessConfHttpResponse.ModelInfo modelInfo;
    public String sgAppKey;
    public long startBeginTime;
    public String umidToken;
    public String verifyStartType;
    public String verifyToken;
}
