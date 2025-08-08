package com.alibaba.security.realidentity.biz.config;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;

/* loaded from: classes3.dex */
public class DegradeConfig implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean isHonorMagicWindowOff;
    public boolean isUseHwMagicWindow;
    public boolean isUseLiteVm;
    public boolean isUseNewCameraSwitchPreview = true;
    public boolean isBeautyOpen = true;
    public boolean isDazzleBioOpen = false;
    public long uploadTimeOut = 30;
    public boolean needCollectLocalImage = true;
    public boolean isWukongEnabled = true;
    public long rpsdkWukongCallbackTimeout = 0;
    public boolean isForceCameraSizeChange = true;
    public boolean isRemoteModelSwitchOn = true;
    public boolean isUseLosslessCertImage = true;
    public boolean isCtidRetrySwitchOn = true;

    public long getUploadTimeOut() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("64bcd7c5", new Object[]{this})).longValue() : this.uploadTimeOut;
    }

    public long getWukongCallbackTimeout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3a598726", new Object[]{this})).longValue();
        }
        if (this.isWukongEnabled) {
            return this.rpsdkWukongCallbackTimeout;
        }
        return 0L;
    }

    public void setUploadTimeOut(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("409366cf", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str)) {
            this.uploadTimeOut = 30L;
        } else {
            try {
                this.uploadTimeOut = Long.parseLong(str);
            } catch (Throwable unused) {
                this.uploadTimeOut = 30L;
            }
        }
    }

    public void setWukongCallbackTimeout(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef4cabf0", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str)) {
            this.rpsdkWukongCallbackTimeout = 0L;
        } else {
            try {
                this.rpsdkWukongCallbackTimeout = Long.parseLong(str);
            } catch (Throwable unused) {
                this.rpsdkWukongCallbackTimeout = 0L;
            }
        }
    }
}
