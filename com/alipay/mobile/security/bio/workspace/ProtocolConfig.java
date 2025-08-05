package com.alipay.mobile.security.bio.workspace;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class ProtocolConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private NavPageConfig navigatepage;
    private int env = 0;
    private int ui = 991;
    public String version = "1.0";

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

    public NavPageConfig getNavigatepage() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (NavPageConfig) ipChange.ipc$dispatch("b877848e", new Object[]{this}) : this.navigatepage;
    }

    public void setNavigatepage(NavPageConfig navPageConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66244ade", new Object[]{this, navPageConfig});
        } else {
            this.navigatepage = navPageConfig;
        }
    }

    public String getVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2a8fef97", new Object[]{this}) : this.version;
    }

    public void setVersion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e718c27", new Object[]{this, str});
        } else {
            this.version = str;
        }
    }

    public int getUi() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("329b4c04", new Object[]{this})).intValue() : this.ui;
    }

    public void setUi(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("943ff686", new Object[]{this, new Integer(i)});
        } else {
            this.ui = i;
        }
    }
}
