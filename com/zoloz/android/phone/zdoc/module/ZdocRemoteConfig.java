package com.zoloz.android.phone.zdoc.module;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.ArrayList;
import tb.kge;

/* loaded from: classes9.dex */
public class ZdocRemoteConfig implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CAPTURE_SCAN = 1;
    public static final int CAPTURE_SCAN_FANCY = 2;
    public static final int CAPTURE_TAKE_PHOTO = 0;
    public static String CURRENT_LANG;
    public static boolean isEnbaleHint;
    private int captureMode = 0;
    private float ratio = 0.7f;
    private int env = 1;
    private int uploadMonitorPic = 0;
    private int monitorMaxFrameCount = 11;
    private int monitorCaptureInterval = 3000;
    private int showGuidePage = 0;
    private String guidePageUrl = "";
    private ArrayList<DocModule> modules = new ArrayList<>();
    private String sceneCode = "DUMMY_BIZ_SCENE_CODE";
    private int showPowerByZoloz = 0;

    static {
        kge.a(1341651252);
        kge.a(1028243835);
        CURRENT_LANG = null;
        isEnbaleHint = true;
    }

    public int getCaptureMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("42288bcd", new Object[]{this})).intValue() : this.captureMode;
    }

    public void setCaptureMode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6e5f775", new Object[]{this, new Integer(i)});
        } else {
            this.captureMode = i;
        }
    }

    public float getRatio() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("13ea484c", new Object[]{this})).floatValue() : this.ratio;
    }

    public void setRatio(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("978378f0", new Object[]{this, new Float(f)});
        } else {
            this.ratio = f;
        }
    }

    public int getEnv() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("deec0ab1", new Object[]{this})).intValue() : this.env;
    }

    public void setEnv(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f94e2111", new Object[]{this, new Integer(i)});
        } else {
            this.env = i;
        }
    }

    public int getUploadMonitorPic() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3703e321", new Object[]{this})).intValue() : this.uploadMonitorPic;
    }

    public void setUploadMonitorPic(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("798ba809", new Object[]{this, new Integer(i)});
        } else {
            this.uploadMonitorPic = i;
        }
    }

    public int getShowGuidePage() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("60849f2", new Object[]{this})).intValue() : this.showGuidePage;
    }

    public void setShowGuidePage(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("522ceaf0", new Object[]{this, new Integer(i)});
        } else {
            this.showGuidePage = i;
        }
    }

    public String getGuidePageUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6085eeff", new Object[]{this}) : this.guidePageUrl;
    }

    public void setGuidePageUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40d66557", new Object[]{this, str});
        } else {
            this.guidePageUrl = str;
        }
    }

    public ArrayList<DocModule> getModules() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("9ac59f32", new Object[]{this}) : this.modules;
    }

    public void setModules(ArrayList<DocModule> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b932465e", new Object[]{this, arrayList});
        } else {
            this.modules = arrayList;
        }
    }

    public String getSceneCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8fb44f6", new Object[]{this}) : this.sceneCode;
    }

    public void setSceneCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98ab15a8", new Object[]{this, str});
        } else {
            this.sceneCode = str;
        }
    }

    public int getShowPowerByZoloz() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("15420033", new Object[]{this})).intValue() : this.showPowerByZoloz;
    }

    public void setShowPowerByZoloz(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63112d37", new Object[]{this, new Integer(i)});
        } else {
            this.showPowerByZoloz = i;
        }
    }

    public int getMonitorMaxFrameCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9766dcdc", new Object[]{this})).intValue() : this.monitorMaxFrameCount;
    }

    public void setMonitorMaxFrameCount(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f418bae", new Object[]{this, new Integer(i)});
        } else {
            this.monitorMaxFrameCount = i;
        }
    }

    public int getMonitorCaptureInterval() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fcd33561", new Object[]{this})).intValue() : this.monitorCaptureInterval;
    }

    public void setMonitorCaptureInterval(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5abf6c9", new Object[]{this, new Integer(i)});
        } else {
            this.monitorCaptureInterval = i;
        }
    }
}
