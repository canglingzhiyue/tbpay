package com.alibaba.security.realidentity.biz.entity;

import android.content.Context;
import android.os.Build;
import com.alibaba.security.realidentity.f2;
import com.alibaba.security.realidentity.g2;
import com.alibaba.security.realidentity.j;
import com.alibaba.security.realidentity.m;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.io.Serializable;

/* loaded from: classes3.dex */
public class ClientInfo implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String appName;
    public String appPackName;
    public String appVersion;
    public long availableMemory;
    public String clientType;
    public String cpuArch = m.b();
    public String faceSdkName;
    public String faceSdkVersion;
    public String livenessSdkName;
    public String livenessSdkVersion;
    public String manufacturer;
    public String mobileModel;
    public String osName;
    public String osVersion;
    public String rpSdkName;
    public String rpSdkVersion;
    public String supportNeon;
    public long totalMemory;
    public String versionTag;

    public ClientInfo(Context context) {
        this.supportNeon = m.k() ? "Yes" : "No";
        this.mobileModel = Build.MODEL;
        this.manufacturer = Build.MANUFACTURER;
        this.osName = "Android";
        this.osVersion = Build.VERSION.RELEASE;
        this.rpSdkName = f2.f3401a;
        this.rpSdkVersion = g2.f3421a;
        this.livenessSdkName = f2.e;
        this.livenessSdkVersion = g2.b;
        this.faceSdkName = f2.e;
        this.faceSdkVersion = g2.b;
        this.clientType = GrsBaseInfo.CountryCodeSource.APP;
        if (context != null) {
            this.appName = j.b(context);
            this.appVersion = j.a(context);
            this.appPackName = j.c(context);
            this.availableMemory = m.a(context);
            this.totalMemory = m.b(context);
        }
    }

    public String getAppName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("92150ca3", new Object[]{this}) : this.appName;
    }

    public String getAppPackName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c6f6b60a", new Object[]{this}) : this.appPackName;
    }

    public String getAppVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("65f009ac", new Object[]{this}) : this.appVersion;
    }

    public long getAvailableMemory() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ac2ef56f", new Object[]{this})).longValue() : this.availableMemory;
    }

    public String getClientType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("dd68fc3e", new Object[]{this}) : this.clientType;
    }

    public String getCpuArch() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("303d8211", new Object[]{this}) : this.cpuArch;
    }

    public String getFaceSdkName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9eefeaa7", new Object[]{this}) : this.faceSdkName;
    }

    public String getFaceSdkVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("57c23d28", new Object[]{this}) : this.faceSdkVersion;
    }

    public String getLivenessSdkName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b43b998d", new Object[]{this}) : this.livenessSdkName;
    }

    public String getLivenessSdkVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8a185c82", new Object[]{this}) : this.livenessSdkVersion;
    }

    public String getManufacturer() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("77efb12", new Object[]{this}) : this.manufacturer;
    }

    public String getMobileModel() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("22c7928", new Object[]{this}) : this.mobileModel;
    }

    public String getOsName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("59d4b694", new Object[]{this}) : this.osName;
    }

    public String getOsVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5f114e1b", new Object[]{this}) : this.osVersion;
    }

    public String getRpSdkName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8253dc88", new Object[]{this}) : this.rpSdkName;
    }

    public String getRpSdkVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("372f3a7", new Object[]{this}) : this.rpSdkVersion;
    }

    public String getSupportNeon() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c3d2f94a", new Object[]{this}) : this.supportNeon;
    }

    public long getTotalMemory() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("46341d2a", new Object[]{this})).longValue() : this.totalMemory;
    }

    public String getVersionTag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("92324a61", new Object[]{this}) : this.versionTag;
    }

    public void setAppName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b790109b", new Object[]{this, str});
        } else {
            this.appName = str;
        }
    }

    public void setAppPackName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f973a14", new Object[]{this, str});
        } else {
            this.appPackName = str;
        }
    }

    public void setAppVersion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cefab34a", new Object[]{this, str});
        } else {
            this.appVersion = str;
        }
    }

    public void setAvailableMemory(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54035fb5", new Object[]{this, new Long(j)});
        } else {
            this.availableMemory = j;
        }
    }

    public void setClientType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46a012f8", new Object[]{this, str});
        } else {
            this.clientType = str;
        }
    }

    public void setCpuArch(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de7648ed", new Object[]{this, str});
        } else {
            this.cpuArch = str;
        }
    }

    public void setFaceSdkName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c49917", new Object[]{this, str});
        } else {
            this.faceSdkName = str;
        }
    }

    public void setFaceSdkVersion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b151894e", new Object[]{this, str});
        } else {
            this.faceSdkVersion = str;
        }
    }

    public void setLivenessSdkName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d5f6cf1", new Object[]{this, str});
        } else {
            this.livenessSdkName = str;
        }
    }

    public void setLivenessSdkVersion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cc4ef34", new Object[]{this, str});
        } else {
            this.livenessSdkVersion = str;
        }
    }

    public void setManufacturer(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78fedba4", new Object[]{this, str});
        } else {
            this.manufacturer = str;
        }
    }

    public void setMobileModel(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b19dab6", new Object[]{this, str});
        } else {
            this.mobileModel = str;
        }
    }

    public void setOsName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("806c0962", new Object[]{this, str});
        } else {
            this.osName = str;
        }
    }

    public void setOsVersion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5563123", new Object[]{this, str});
        } else {
            this.osVersion = str;
        }
    }

    public void setRpSdkName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a657056", new Object[]{this, str});
        } else {
            this.rpSdkName = str;
        }
    }

    public void setRpSdkVersion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb89f5af", new Object[]{this, str});
        } else {
            this.rpSdkVersion = str;
        }
    }

    public void setSupportNeon(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce435ed4", new Object[]{this, str});
        } else {
            this.supportNeon = str;
        }
    }

    public void setTotalMemory(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("244c955a", new Object[]{this, new Long(j)});
        } else {
            this.totalMemory = j;
        }
    }

    public void setVersionTag(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b008935", new Object[]{this, str});
        } else {
            this.versionTag = str;
        }
    }
}
