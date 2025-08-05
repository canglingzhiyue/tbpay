package com.taobao.taopai2.material.business.materialdetail;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taopai.material.bean.MaterialDetail;
import java.io.Serializable;
import java.util.Objects;
import tb.kge;

/* loaded from: classes8.dex */
public class MaterialDetailBean implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String extend;
    public long id;
    public long lastModified;
    public String logoUrl;
    public int materialType;
    public String name;
    private String resourceExtUrl;
    public String resourceUrl;
    public int version;

    static {
        kge.a(791261042);
        kge.a(1028243835);
    }

    public int getTid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("eee3a153", new Object[]{this})).intValue() : (int) this.id;
    }

    public void setTid(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8495eaf", new Object[]{this, new Integer(i)});
        } else {
            this.id = i;
        }
    }

    public String getName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this}) : this.name;
    }

    public void setName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99b22cde", new Object[]{this, str});
        } else {
            this.name = str;
        }
    }

    public long getModifiedTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("adb79e27", new Object[]{this})).longValue() : this.lastModified;
    }

    public void setModifiedTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4d2ab65", new Object[]{this, new Long(j)});
        } else {
            this.lastModified = j;
        }
    }

    public String getLogoUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fbe2b42b", new Object[]{this}) : this.logoUrl;
    }

    public void setLogoUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87775a13", new Object[]{this, str});
        } else {
            this.logoUrl = str;
        }
    }

    public String getResourceUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3d0b4e8e", new Object[]{this}) : this.resourceUrl;
    }

    public void setResourceUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c15b210", new Object[]{this, str});
        } else {
            this.resourceUrl = str;
        }
    }

    public int getMaterialType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a85c0071", new Object[]{this})).intValue() : this.materialType;
    }

    public void setMaterialType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eba8eb9", new Object[]{this, new Integer(i)});
        } else {
            this.materialType = i;
        }
    }

    public int getVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2d6bc1c", new Object[]{this})).intValue() : this.version;
    }

    public void setVersion(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e4a3706", new Object[]{this, new Integer(i)});
        } else {
            this.version = i;
        }
    }

    public String getExtend() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("78c636e9", new Object[]{this}) : this.extend;
    }

    public void setExtend(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3faa93ad", new Object[]{this, str});
        } else {
            this.extend = str;
        }
    }

    public void setResourceExtUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68fb7e4f", new Object[]{this, str});
        } else {
            this.resourceExtUrl = str;
        }
    }

    public String getResourceExtUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("76752407", new Object[]{this}) : this.resourceExtUrl;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            MaterialDetail materialDetail = (MaterialDetail) obj;
            if (getTid() == materialDetail.getTid() && getVersion() == materialDetail.getVersion() && getModifiedTime() == materialDetail.getModifiedTime() && getMaterialType() == materialDetail.getMaterialType() && Objects.equals(getName(), materialDetail.getName()) && Objects.equals(getLogoUrl(), materialDetail.getLogoUrl()) && Objects.equals(getResourceUrl(), materialDetail.getResourceUrl())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue() : Objects.hash(Integer.valueOf(getTid()), Integer.valueOf(getVersion()), getName(), Long.valueOf(getModifiedTime()), getLogoUrl(), getResourceUrl(), Integer.valueOf(getMaterialType()), getExtend());
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "MaterialDetail{tid=" + this.id + ", version=" + this.version + ", name='" + this.name + "', modifiedTime=" + this.lastModified + ", logoUrl='" + this.logoUrl + "', resourceUrl='" + this.resourceUrl + "', materialType=" + this.materialType + ", extend=" + this.extend + '}';
    }
}
