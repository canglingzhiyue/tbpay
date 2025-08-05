package com.taobao.android.searchbaseframe.roman.model;

import com.alibaba.ariver.kernel.RVStartParams;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Objects;
import tb.kge;

/* loaded from: classes6.dex */
public class RomanPage implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = RVStartParams.KEY_URL_SHORT)
    private String pageUrl;
    @JSONField(name = "p")
    private boolean preload;
    @JSONField(name = "s")
    private double sversion;
    @JSONField(name = "v")
    private int version;

    static {
        kge.a(1072789606);
        kge.a(1028243835);
    }

    public double getSversion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fec05170", new Object[]{this})).doubleValue() : this.sversion;
    }

    public void setSversion(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c20a570", new Object[]{this, new Double(d)});
        } else {
            this.sversion = d;
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

    public String getPageUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("72d4e50f", new Object[]{this}) : this.pageUrl;
    }

    public void setPageUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eecb45af", new Object[]{this, str});
        } else {
            this.pageUrl = str;
        }
    }

    public boolean isPreload() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("85a6628a", new Object[]{this})).booleanValue() : this.preload;
    }

    public void setPreload(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3c33c46", new Object[]{this, new Boolean(z)});
        } else {
            this.preload = z;
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
        if (obj != null && getClass() == obj.getClass()) {
            RomanPage romanPage = (RomanPage) obj;
            if (Double.compare(romanPage.sversion, this.sversion) == 0 && this.version == romanPage.version && this.preload == romanPage.preload && this.pageUrl.equals(romanPage.pageUrl)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue() : Objects.hash(Double.valueOf(this.sversion), Integer.valueOf(this.version), this.pageUrl, Boolean.valueOf(this.preload));
    }
}
