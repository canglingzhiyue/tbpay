package com.taobao.themis.kernel.metaInfo.manifest.storage;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.metaInfo.manifest.AppManifest;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes9.dex */
public final class AppManifestDao implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String appId;
    private AppManifest appManifest;
    private long lastRequestTimeStamp;
    private long lastUsedTimeStamp;
    private String version;

    static {
        kge.a(-1379087850);
        kge.a(1028243835);
    }

    public final String getAppId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("94038553", new Object[]{this}) : this.appId;
    }

    public final void setAppId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9945baeb", new Object[]{this, str});
        } else {
            this.appId = str;
        }
    }

    public final String getVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2a8fef97", new Object[]{this}) : this.version;
    }

    public final void setVersion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e718c27", new Object[]{this, str});
        } else {
            this.version = str;
        }
    }

    public final AppManifest getAppManifest() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AppManifest) ipChange.ipc$dispatch("8a818d34", new Object[]{this}) : this.appManifest;
    }

    public final void setAppManifest(AppManifest appManifest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e52fa74", new Object[]{this, appManifest});
        } else {
            this.appManifest = appManifest;
        }
    }

    public final long getLastUsedTimeStamp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("82349008", new Object[]{this})).longValue() : this.lastUsedTimeStamp;
    }

    public final void setLastUsedTimeStamp(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6a1853c", new Object[]{this, new Long(j)});
        } else {
            this.lastUsedTimeStamp = j;
        }
    }

    public final long getLastRequestTimeStamp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8e7ea14e", new Object[]{this})).longValue() : this.lastRequestTimeStamp;
    }

    public final void setLastRequestTimeStamp(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b22591e", new Object[]{this, new Long(j)});
        } else {
            this.lastRequestTimeStamp = j;
        }
    }
}
