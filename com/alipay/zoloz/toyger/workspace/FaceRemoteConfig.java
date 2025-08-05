package com.alipay.zoloz.toyger.workspace;

import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.security.bio.config.bean.Coll;
import com.alipay.mobile.security.bio.config.bean.FaceTips;
import com.alipay.mobile.security.bio.config.bean.NavigatePage;
import com.alipay.mobile.security.bio.config.bean.SceneEnv;
import com.alipay.mobile.security.bio.utils.StringUtil;
import com.alipay.mobile.security.faceauth.circle.protocol.DeviceSetting;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class FaceRemoteConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private JSONObject d;
    private JSONObject e;

    /* renamed from: a  reason: collision with root package name */
    private SceneEnv f6320a = new SceneEnv();
    private NavigatePage b = new NavigatePage();
    private Coll c = new Coll();
    private FaceTips f = new FaceTips();
    private DeviceSetting[] g = new DeviceSetting[0];
    private int h = 0;
    private int i = 991;
    private String j = "normal";
    private String k = "0";

    public void setSceneEnv(SceneEnv sceneEnv) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b079e04", new Object[]{this, sceneEnv});
        } else {
            this.f6320a = sceneEnv;
        }
    }

    public SceneEnv getSceneEnv() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SceneEnv) ipChange.ipc$dispatch("72d9717c", new Object[]{this}) : this.f6320a;
    }

    public void setNavi(NavigatePage navigatePage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf4c5280", new Object[]{this, navigatePage});
        } else {
            this.b = navigatePage;
        }
    }

    public NavigatePage getNavi() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (NavigatePage) ipChange.ipc$dispatch("76fc09e2", new Object[]{this}) : this.b;
    }

    public void setColl(Coll coll) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8700b02e", new Object[]{this, coll});
        } else {
            this.c = coll;
        }
    }

    public Coll getColl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Coll) ipChange.ipc$dispatch("61d2735c", new Object[]{this}) : this.c;
    }

    public void setUpload(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("698c3426", new Object[]{this, jSONObject});
        } else {
            this.d = jSONObject;
        }
    }

    public JSONObject getUpload() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("6e38951e", new Object[]{this}) : this.d;
    }

    public void setAlgorithm(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7c5053c", new Object[]{this, jSONObject});
        } else {
            this.e = jSONObject;
        }
    }

    public JSONObject getAlgorithm() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("e9bfd0e0", new Object[]{this}) : this.e;
    }

    public void setEnv(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f94e2111", new Object[]{this, new Integer(i)});
        } else {
            this.h = i;
        }
    }

    public int getEnv() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("deec0ab1", new Object[]{this})).intValue() : this.h;
    }

    public void setUi(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("943ff686", new Object[]{this, new Integer(i)});
        } else {
            this.i = i;
        }
    }

    public int getUi() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("329b4c04", new Object[]{this})).intValue() : this.i;
    }

    public FaceTips getFaceTips() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FaceTips) ipChange.ipc$dispatch("3558d3fc", new Object[]{this}) : this.f;
    }

    public void setFaceTips(FaceTips faceTips) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e234bf1c", new Object[]{this, faceTips});
        } else {
            this.f = faceTips;
        }
    }

    public DeviceSetting[] getDeviceSettings() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DeviceSetting[]) ipChange.ipc$dispatch("bd61cebb", new Object[]{this}) : this.g;
    }

    public void setDeviceSettings(DeviceSetting[] deviceSettingArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35c405d", new Object[]{this, deviceSettingArr});
        } else {
            this.g = deviceSettingArr;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "FaceRemoteConfig{sceneEnv=" + this.f6320a + ", navi=" + this.b + ", coll=" + this.c + ", upload=" + this.d + ", algorithm=" + this.e + ", faceTips=" + this.f + ", deviceSettings=" + StringUtil.array2String(this.g) + ", env=" + this.h + ", ui=" + this.i + ", configVersion=" + this.k + '}';
    }

    public String getVerifyMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ec0b8887", new Object[]{this}) : this.j;
    }

    public void setVerifyMode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4f0fcf", new Object[]{this, str});
        } else {
            this.j = str;
        }
    }

    public String getConfigVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("738fbf79", new Object[]{this}) : this.k;
    }

    public void setConfigVersion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33081185", new Object[]{this, str});
        } else {
            this.k = str;
        }
    }
}
