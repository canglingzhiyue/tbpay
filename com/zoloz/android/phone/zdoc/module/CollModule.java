package com.zoloz.android.phone.zdoc.module;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes9.dex */
public class CollModule implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String icons;
    private int retryLimit = 3;
    private int scanTimeout = 30;
    private int uiType = -1;
    private int pageNo = 1;
    private String docType = "006200001";
    private int algoType = 1;

    static {
        kge.a(-1598511258);
        kge.a(1028243835);
    }

    public int getRetryLimit() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bd72c1e3", new Object[]{this})).intValue() : this.retryLimit;
    }

    public void setRetryLimit(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27bc8887", new Object[]{this, new Integer(i)});
        } else {
            this.retryLimit = i;
        }
    }

    public int getScanTimeout() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("30c8ec68", new Object[]{this})).intValue() : this.scanTimeout;
    }

    public void setScanTimeout(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c51aa3a", new Object[]{this, new Integer(i)});
        } else {
            this.scanTimeout = i;
        }
    }

    public int getUiType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3f5b3d5e", new Object[]{this})).intValue() : this.uiType;
    }

    public void setUiType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4272566c", new Object[]{this, new Integer(i)});
        } else {
            this.uiType = i;
        }
    }

    public int getPageNo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("320a6920", new Object[]{this})).intValue() : this.pageNo;
    }

    public void setPageNo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5a8a2ea", new Object[]{this, new Integer(i)});
        } else {
            this.pageNo = i;
        }
    }

    public String getDocType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ab09d81d", new Object[]{this}) : this.docType;
    }

    public void setDocType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd34b461", new Object[]{this, str});
        } else {
            this.docType = str;
        }
    }

    public int getAlgoType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8a6e949d", new Object[]{this})).intValue() : this.algoType;
    }

    public void setAlgoType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("563ada0d", new Object[]{this, new Integer(i)});
        } else {
            this.algoType = i;
        }
    }

    public String getIcons() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8b59bc15", new Object[]{this}) : this.icons;
    }

    public void setIcons(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cb65c69", new Object[]{this, str});
        } else {
            this.icons = str;
        }
    }
}
