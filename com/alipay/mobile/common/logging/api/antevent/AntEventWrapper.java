package com.alipay.mobile.common.logging.api.antevent;

import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public class AntEventWrapper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private AntEvent f5417a;

    public AntEventWrapper(AntEvent antEvent) {
        this.f5417a = antEvent;
    }

    public AntEvent getAntEvent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AntEvent) ipChange.ipc$dispatch("a95adc39", new Object[]{this}) : this.f5417a;
    }

    public void setParam1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a067257", new Object[]{this, str});
            return;
        }
        AntEvent antEvent = this.f5417a;
        if (antEvent == null) {
            return;
        }
        antEvent.setParam1(str);
    }

    public void setParam2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4380b98", new Object[]{this, str});
            return;
        }
        AntEvent antEvent = this.f5417a;
        if (antEvent == null) {
            return;
        }
        antEvent.setParam1(str);
    }

    public void setParam3(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e69a4d9", new Object[]{this, str});
            return;
        }
        AntEvent antEvent = this.f5417a;
        if (antEvent == null) {
            return;
        }
        antEvent.setParam1(str);
    }

    public void setPageId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee1a849d", new Object[]{this, str});
            return;
        }
        AntEvent antEvent = this.f5417a;
        if (antEvent == null) {
            return;
        }
        antEvent.setPageId(str);
    }

    public void setAbtestId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddbd75c1", new Object[]{this, str});
            return;
        }
        AntEvent antEvent = this.f5417a;
        if (antEvent == null) {
            return;
        }
        antEvent.setAbtestId(str);
    }

    public void setRenderBizType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("376b1806", new Object[]{this, str});
            return;
        }
        AntEvent antEvent = this.f5417a;
        if (antEvent == null) {
            return;
        }
        antEvent.setRenderBizType(str);
    }

    public void setNeedAbtest(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f818ffa2", new Object[]{this, new Boolean(z)});
            return;
        }
        AntEvent antEvent = this.f5417a;
        if (antEvent == null) {
            return;
        }
        antEvent.setNeedAbtest(z);
    }

    public void addExtParams5(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39e2d4aa", new Object[]{this, str, str2});
            return;
        }
        AntEvent antEvent = this.f5417a;
        if (antEvent == null) {
            return;
        }
        antEvent.addExtParam5(str, str2);
    }
}
