package com.alipay.mobile.security.bio.config.bean;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class SceneEnv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f5782a = "";
    private String b = "normal";

    public void setSceneCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98ab15a8", new Object[]{this, str});
        } else {
            this.f5782a = str;
        }
    }

    public String getSceneCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8fb44f6", new Object[]{this}) : this.f5782a;
    }

    public void setSceneType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b20f4f35", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public String getSceneType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("229325c9", new Object[]{this}) : this.b;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "SceneEnv{sceneCode='" + this.f5782a + "', sceneType='" + this.b + "'}";
    }
}
