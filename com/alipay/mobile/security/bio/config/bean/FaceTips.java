package com.alipay.mobile.security.bio.config.bean;

import com.android.alibaba.ip.runtime.IpChange;
import tb.riy;

/* loaded from: classes3.dex */
public class FaceTips {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f5780a;
    private String b;
    private String c;
    private String d = "";
    private String e = "";
    public String sceneText = "";
    public String topText = "";
    public String bottomText = "";
    public String topText_noface = "";
    public String topText_light = "";
    public String topText_rectwidth = "";
    public String topText_integrity = "";
    public String topText_angle = "";
    public String topText_blur = "";
    public String topText_quality = "";
    public String topText_blink = "";
    public String topText_stay = "";
    public String topText_max_rectwidth = "";
    public String topText_pitch = "";
    public String topText_yaw = "";
    public String topText_openness = "";
    public String topText_stack_time = "";
    public String topText_depth_damage = "";
    public String animationText = "";
    private String f = "";
    private String g = "";
    public String processingText = "";
    private AlertConfig h = new AlertConfig();
    private AlertConfig i = new AlertConfig();
    private AlertConfig j = new AlertConfig();
    private AlertConfig k = new AlertConfig();
    private AlertConfig l = new AlertConfig();
    private AlertConfig m = new AlertConfig();
    private AlertConfig n = new AlertConfig();
    private AlertConfig o = new AlertConfig();
    private AlertConfig p = new AlertConfig();
    private AlertConfig q = new AlertConfig();
    private AlertConfig r = new AlertConfig();
    private AlertConfig s = new AlertConfig();
    private SwitchAuthCfg t = new SwitchAuthCfg();

    public FaceTips() {
        this.h.setReturnCode(102);
        this.i.setReturnCode(105);
        this.j.setReturnCode(205);
        this.k.setReturnCode(100);
        this.l.setReturnCode(202);
        this.m.setReturnCode(203);
        this.n.setReturnCode(208);
        this.o.setReturnCode(209);
        this.p.setReturnCode(207);
        this.q.setReturnCode(202);
        this.r.setReturnCode(210);
        this.s.setReturnCode(202);
        this.t.setReturnCode(305);
    }

    public void setNoFaceText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d30542de", new Object[]{this, str});
        } else {
            this.f5780a = str;
        }
    }

    public String getNoFaceText() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4d4b3798", new Object[]{this}) : this.f5780a;
    }

    public void setNoBlinkText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48b70a37", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public String getNoBlinkText() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1a5ad587", new Object[]{this}) : this.b;
    }

    public void setAdjustPoseText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69b6860", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public String getAdjustPoseText() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ad1733d6", new Object[]{this}) : this.c;
    }

    public AlertConfig getUnsurpportAlert() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AlertConfig) ipChange.ipc$dispatch("56db2726", new Object[]{this}) : this.h;
    }

    public void setUnsurpportAlert(AlertConfig alertConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("272a234a", new Object[]{this, alertConfig});
        } else {
            this.h = alertConfig;
        }
    }

    public AlertConfig getSystemVersionErrorAlert() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AlertConfig) ipChange.ipc$dispatch("cc5732cb", new Object[]{this}) : this.i;
    }

    public void setSystemVersionErrorAlert(AlertConfig alertConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78aed845", new Object[]{this, alertConfig});
        } else {
            this.i = alertConfig;
        }
    }

    public AlertConfig getSystemErrorAlert() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AlertConfig) ipChange.ipc$dispatch("d25a18d9", new Object[]{this}) : this.j;
    }

    public void setSystemErrorAlert(AlertConfig alertConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45642f8f", new Object[]{this, alertConfig});
        } else {
            this.j = alertConfig;
        }
    }

    public AlertConfig getCameraNoPermissionAlert() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AlertConfig) ipChange.ipc$dispatch("bac83921", new Object[]{this}) : this.k;
    }

    public void setCameraNoPermissionAlert(AlertConfig alertConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("585e9caf", new Object[]{this, alertConfig});
        } else {
            this.k = alertConfig;
        }
    }

    public String getTopText_stack_time() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("60fe9702", new Object[]{this}) : this.topText_stack_time;
    }

    public void setTopText_stack_time(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22a604b4", new Object[]{this, str});
        } else {
            this.topText_stack_time = str;
        }
    }

    public String getTopText_depth_damage() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("894dd3db", new Object[]{this}) : this.topText_depth_damage;
    }

    public void setTopText_depth_damage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84b64ffb", new Object[]{this, str});
        } else {
            this.topText_depth_damage = str;
        }
    }

    public AlertConfig getExitAlert() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AlertConfig) ipChange.ipc$dispatch("dcac768a", new Object[]{this}) : this.l;
    }

    public void setExitAlert(AlertConfig alertConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af36766", new Object[]{this, alertConfig});
        } else {
            this.l = alertConfig;
        }
    }

    public AlertConfig getTimeoutAlert() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AlertConfig) ipChange.ipc$dispatch("4de1a621", new Object[]{this}) : this.m;
    }

    public void setTimeoutAlert(AlertConfig alertConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("510db147", new Object[]{this, alertConfig});
        } else {
            this.m = alertConfig;
        }
    }

    public AlertConfig getFailAlert() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AlertConfig) ipChange.ipc$dispatch("4cbc948a", new Object[]{this}) : this.n;
    }

    public void setFailAlert(AlertConfig alertConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dce70966", new Object[]{this, alertConfig});
        } else {
            this.n = alertConfig;
        }
    }

    public AlertConfig getLimitAlert() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AlertConfig) ipChange.ipc$dispatch("b0f23efb", new Object[]{this}) : this.o;
    }

    public void setLimitAlert(AlertConfig alertConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("387506ad", new Object[]{this, alertConfig});
        } else {
            this.o = alertConfig;
        }
    }

    public AlertConfig getNetworkErrorAlert() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AlertConfig) ipChange.ipc$dispatch("84aebbe6", new Object[]{this}) : this.p;
    }

    public void setNetworkErrorAlert(AlertConfig alertConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef22198a", new Object[]{this, alertConfig});
        } else {
            this.p = alertConfig;
        }
    }

    public AlertConfig getInterruptAlert() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AlertConfig) ipChange.ipc$dispatch("b58aca3", new Object[]{this}) : this.q;
    }

    public void setInterruptAlert(AlertConfig alertConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dffb6805", new Object[]{this, alertConfig});
        } else {
            this.q = alertConfig;
        }
    }

    public AlertConfig getAuthorizationAlert() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AlertConfig) ipChange.ipc$dispatch("40c5f9b9", new Object[]{this}) : this.r;
    }

    public void setAuthorizationAlert(AlertConfig alertConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d439d7af", new Object[]{this, alertConfig});
        } else {
            this.r = alertConfig;
        }
    }

    public AlertConfig getFailNoRetryAlert() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AlertConfig) ipChange.ipc$dispatch("4dcddc29", new Object[]{this}) : this.s;
    }

    public void setFailNoRetryAlert(AlertConfig alertConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3868d63f", new Object[]{this, alertConfig});
        } else {
            this.s = alertConfig;
        }
    }

    public String getBrandTip() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("13cb602f", new Object[]{this}) : this.d;
    }

    public void setBrandTip(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f07e0027", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public String getStopScanTip() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f2509173", new Object[]{this}) : this.e;
    }

    public void setStopScanTip(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f78cbcb", new Object[]{this, str});
        } else {
            this.e = str;
        }
    }

    public SwitchAuthCfg getSwitchAuthCfg() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SwitchAuthCfg) ipChange.ipc$dispatch("f4f70cd6", new Object[]{this}) : this.t;
    }

    public void setSwitchAuthCfg(SwitchAuthCfg switchAuthCfg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22955086", new Object[]{this, switchAuthCfg});
        } else {
            this.t = switchAuthCfg;
        }
    }

    public void setAnimationText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0c9aae0", new Object[]{this, str});
        } else {
            this.animationText = str;
        }
    }

    public String getAnimationText() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5ed80ebe", new Object[]{this}) : this.animationText;
    }

    public void setShowFaceText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee59269a", new Object[]{this, str});
        } else {
            this.f = str;
        }
    }

    public String getShowFaceText() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3cd4795c", new Object[]{this}) : this.f;
    }

    public void setVersion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e718c27", new Object[]{this, str});
        } else {
            this.g = str;
        }
    }

    public String getVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2a8fef97", new Object[]{this}) : this.g;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "FaceTips{noFaceText='" + this.f5780a + "', noBlinkText='" + this.b + "', adjustPoseText='" + this.c + "', brandTip='" + this.d + "', stopScanTip='" + this.e + "', sceneText='" + this.sceneText + "', topText='" + this.topText + "', bottomText='" + this.bottomText + "', topText_noface='" + this.topText_noface + "', topText_light='" + this.topText_light + "', topText_rectwidth='" + this.topText_rectwidth + "', topText_integrity='" + this.topText_integrity + "', topText_angle='" + this.topText_angle + "', topText_blur='" + this.topText_blur + "', topText_quality='" + this.topText_quality + "', topText_blink='" + this.topText_blink + "', topText_stay='" + this.topText_stay + "', topText_max_rectwidth='" + this.topText_max_rectwidth + "', topText_pitch='" + this.topText_pitch + "', topText_yaw='" + this.topText_yaw + "', topText_openness='" + this.topText_openness + "', topText_stack_time='" + this.topText_stack_time + "', topText_depth_damage='" + this.topText_depth_damage + "', unsurpportAlert=" + this.h + ", systemVersionErrorAlert=" + this.i + ", systemErrorAlert=" + this.j + ", cameraNoPermissionAlert=" + this.k + ", exitAlert=" + this.l + ", timeoutAlert=" + this.m + ", failAlert=" + this.n + ", limitAlert=" + this.o + ", networkErrorAlert=" + this.p + ", interruptAlert=" + this.q + ", authorizationAlert=" + this.r + ", failNoRetryAlert=" + this.s + ", switchAuthCfg=" + this.t + ", animationText=" + this.animationText + ", showFaceText=" + this.f + ", version=" + this.g + ", processingText=" + this.processingText + riy.BLOCK_END_STR;
    }
}
