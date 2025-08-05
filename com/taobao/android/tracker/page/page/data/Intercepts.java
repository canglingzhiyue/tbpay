package com.taobao.android.tracker.page.page.data;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.List;
import tb.kge;

/* loaded from: classes6.dex */
public class Intercepts implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean enabled;
    private String logkey;
    private String pageName;
    private List<Point> points;
    private String spmA;
    private String spmB;
    private boolean needExposureBackView = true;
    private boolean enableMatchKey = false;
    private boolean enableImmediateCommit = false;

    static {
        kge.a(734157580);
        kge.a(1028243835);
    }

    public String getSpmA() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ea448852", new Object[]{this}) : this.spmA;
    }

    public void setSpmA(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2cbc264", new Object[]{this, str});
        } else {
            this.spmA = str;
        }
    }

    public String getSpmB() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("70ca42f1", new Object[]{this}) : this.spmB;
    }

    public void setSpmB(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cfd5ba5", new Object[]{this, str});
        } else {
            this.spmB = str;
        }
    }

    public String getPageName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("707fddc9", new Object[]{this}) : this.pageName;
    }

    public void setPageName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a5935cd", new Object[]{this, str});
        } else {
            this.pageName = str;
        }
    }

    public List<Point> getPoints() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("8848a667", new Object[]{this}) : this.points;
    }

    public void setPoints(List<Point> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b44f2dd", new Object[]{this, list});
        } else {
            this.points = list;
        }
    }

    public boolean getEnabled() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("84d1ce16", new Object[]{this})).booleanValue() : this.enabled;
    }

    public void setEnabled(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bb1a20e", new Object[]{this, new Boolean(z)});
        } else {
            this.enabled = z;
        }
    }

    public String getLogkey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("98291c08", new Object[]{this}) : this.logkey;
    }

    public void setLogkey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca4526e", new Object[]{this, str});
        } else {
            this.logkey = str;
        }
    }

    public boolean isNeedExposureBackView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("37225e5e", new Object[]{this})).booleanValue() : this.needExposureBackView;
    }

    public void setNeedExposureBackView(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7a57f82", new Object[]{this, new Boolean(z)});
        } else {
            this.needExposureBackView = z;
        }
    }

    public boolean getEnableMatchKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b448b0fe", new Object[]{this})).booleanValue() : this.enableMatchKey;
    }

    public void setEnableMatchKey(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2312e08e", new Object[]{this, new Boolean(z)});
        } else {
            this.enableMatchKey = z;
        }
    }

    public boolean isEnableImmediateCommit() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("49fe7046", new Object[]{this})).booleanValue() : this.enableImmediateCommit;
    }

    public void setEnableImmediateCommit(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fac0e40a", new Object[]{this, new Boolean(z)});
        } else {
            this.enableImmediateCommit = z;
        }
    }
}
