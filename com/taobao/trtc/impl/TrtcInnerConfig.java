package com.taobao.trtc.impl;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.trtc.api.TrtcConfig;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.kge;

/* loaded from: classes9.dex */
public class TrtcInnerConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TRTC_ENGINE_CONFIG_EXTERNAL_CAPTURER_BIT = 1;
    public static final int TRTC_ENGINE_CONFIG_EXTERNAL_RENDERER_BIT = 2;
    public static final int TRTC_ENGINE_CONFIG_LOAD_TAOAUDIO = 8;
    public static final int TRTC_ENGINE_CONFIG_USE_MUSIC_MODE = 4;
    public TrtcConfig config;
    public String networkType = "4G";
    public String model = "";
    public String carriers = "";
    public String platform = "android";
    public String os = "android";
    public String osVersion = "";
    public String chipset = "";
    public String board = "";
    public String orangeConfigs = "";
    public boolean isEnvOnline = true;
    public boolean hwH264DecodeEnable = false;
    public String hwH264DecoderName = "";
    public String hwH264DecodeLowLatencyConfigStr = "";
    public boolean hwH265DecodeEnable = false;
    public String hwH265DecoderName = "";
    public String hwH265DecodeLowLatencyConfigStr = "";

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes9.dex */
    public @interface EngineConfigFlagBits {
    }

    static {
        kge.a(895707147);
    }

    public int getEngineConfigFlags() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("da08207", new Object[]{this})).intValue();
        }
        int isUseExternalVideoCapture = this.config.isUseExternalVideoCapture() | (this.config.isUseExternalVideoRender() ? 2 : 0) | (this.config.isUseMusicMode() ? 4 : 0);
        if (this.config.isUseTaoAudio()) {
            i = 8;
        }
        return isUseExternalVideoCapture | i;
    }

    public String ToString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("572a47ed", new Object[]{this});
        }
        return "inner config:{ " + this.config.ToString() + "network type: " + this.networkType + ", model: " + this.model + ", carriers: " + this.carriers + ", os: " + this.os + ", chipset: " + this.chipset + ", board: " + this.board + " }";
    }

    public int getWorkMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("23d65144", new Object[]{this})).intValue() : this.config.getWorkMode().ordinal();
    }
}
