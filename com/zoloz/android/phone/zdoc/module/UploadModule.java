package com.zoloz.android.phone.zdoc.module;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes9.dex */
public class UploadModule implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String docType = "";
    private int pageNo = 1;
    private float ratio = 0.7f;

    static {
        kge.a(-512254149);
        kge.a(1028243835);
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

    public float getRatio() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("13ea484c", new Object[]{this})).floatValue() : this.ratio;
    }

    public void setRatio(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("978378f0", new Object[]{this, new Float(f)});
        } else {
            this.ratio = f;
        }
    }
}
