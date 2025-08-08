package com.taobao.infoflow.taobao.subservice.biz.videoplaycontrollerservice.impl.model;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.utils.lang3.ObjectUtils;
import com.taobao.infoflow.taobao.subservice.biz.videoplaycontrollerservice.impl.strategy.protocol.PlayControlStrategy;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes.dex */
public class PlayControllerConfig implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean playControlEnable = true;
    private String playControlFocusAreaType = PlayControlStrategy.PLAY_CONTROL_FOCUS_AREA_CENTER;
    private float playControlFocusAreaMinPercent = 0.2f;

    static {
        kge.a(1488226519);
        kge.a(1028243835);
    }

    public PlayControllerConfig deepCopy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PlayControllerConfig) ipChange.ipc$dispatch("cf193286", new Object[]{this});
        }
        PlayControllerConfig playControllerConfig = new PlayControllerConfig();
        playControllerConfig.setPlayControlEnable(this.playControlEnable);
        playControllerConfig.setPlayControlFocusAreaType(this.playControlFocusAreaType);
        playControllerConfig.setPlayControlFocusAreaMinPercent(this.playControlFocusAreaMinPercent);
        return playControllerConfig;
    }

    public boolean isValid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue() : !StringUtils.isEmpty(this.playControlFocusAreaType);
    }

    public boolean isPlayControlEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7eef25ed", new Object[]{this})).booleanValue() : this.playControlEnable;
    }

    public void setPlayControlEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ad43f43", new Object[]{this, new Boolean(z)});
        } else {
            this.playControlEnable = z;
        }
    }

    public String getPlayControlFocusAreaType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bab5a7ad", new Object[]{this}) : this.playControlFocusAreaType;
    }

    public void setPlayControlFocusAreaType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b331069", new Object[]{this, str});
        } else {
            this.playControlFocusAreaType = str;
        }
    }

    public float getPlayControlFocusAreaMinPercent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("750d199c", new Object[]{this})).floatValue() : this.playControlFocusAreaMinPercent;
    }

    public void setPlayControlFocusAreaMinPercent(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc75db08", new Object[]{this, new Float(f)});
        } else {
            this.playControlFocusAreaMinPercent = f;
        }
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            PlayControllerConfig playControllerConfig = (PlayControllerConfig) obj;
            if (this.playControlEnable == playControllerConfig.playControlEnable && ObjectUtils.a(this.playControlFocusAreaType, playControllerConfig.playControlFocusAreaType) && ObjectUtils.a(Float.valueOf(this.playControlFocusAreaMinPercent), Float.valueOf(playControllerConfig.playControlFocusAreaMinPercent))) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "PlayControllerConfig{playControlEnable=" + this.playControlEnable + ", playControlFocusAreaType='" + this.playControlFocusAreaType + "', playControlFocusAreaMinPercent=" + this.playControlFocusAreaMinPercent + '}';
    }
}
