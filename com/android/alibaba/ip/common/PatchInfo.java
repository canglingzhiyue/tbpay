package com.android.alibaba.ip.common;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes.dex */
public class PatchInfo implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String baseVersion;
    private String httpsUrl;
    private String md5;
    private String patchUrl;
    public int patchVersion;
    public int priority;
    private long size;
    private String type;

    static {
        kge.a(249325913);
        kge.a(1028243835);
    }

    public int getPatchVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a58ce760", new Object[]{this})).intValue() : this.patchVersion;
    }

    public void setPatchVersion(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7a685aa", new Object[]{this, new Integer(i)});
        } else {
            this.patchVersion = i;
        }
    }

    public String getBaseVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ebcd6c08", new Object[]{this}) : this.baseVersion;
    }

    public void setBaseVersion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a59743d6", new Object[]{this, str});
        } else {
            this.baseVersion = str;
        }
    }

    public int getPriority() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("49b31e94", new Object[]{this})).intValue() : this.priority;
    }

    public void setPriority(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f878ef6", new Object[]{this, new Integer(i)});
        } else {
            this.priority = i;
        }
    }

    public String getPatchUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1360499c", new Object[]{this}) : this.patchUrl;
    }

    public void setPatchUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e386445a", new Object[]{this, str});
        } else {
            this.patchUrl = str;
        }
    }

    public long getSize() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ae43b972", new Object[]{this})).longValue() : this.size;
    }

    public void setSize(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7687ad7a", new Object[]{this, new Long(j)});
        } else {
            this.size = j;
        }
    }

    public String getHttpsUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6e81393f", new Object[]{this}) : this.httpsUrl;
    }

    public void setHttpsUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec834917", new Object[]{this, str});
        } else {
            this.httpsUrl = str;
        }
    }

    public String getType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this}) : this.type;
    }

    public void setType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd56044d", new Object[]{this, str});
        } else {
            this.type = str;
        }
    }

    public String getMd5() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("91115b1", new Object[]{this}) : this.md5;
    }

    public void setMd5(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79e834d", new Object[]{this, str});
        } else {
            this.md5 = str;
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
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PatchInfo patchInfo = (PatchInfo) obj;
        if (this.patchVersion != patchInfo.patchVersion || this.priority != patchInfo.priority) {
            return false;
        }
        return this.baseVersion.equals(patchInfo.baseVersion);
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue() : (((this.patchVersion * 31) + this.baseVersion.hashCode()) * 31) + this.priority;
    }
}
