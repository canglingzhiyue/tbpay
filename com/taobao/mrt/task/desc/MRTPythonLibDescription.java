package com.taobao.mrt.task.desc;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mrt.task.e;
import tb.kge;
import tb.msi;

/* loaded from: classes7.dex */
public class MRTPythonLibDescription extends MRTResourceDescription {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String mmd5;
    public String name;

    static {
        kge.a(-637292549);
    }

    public MRTPythonLibDescription(String str, String str2, String str3, String str4, MRTTaskDescription mRTTaskDescription) {
        super(str3, str4, mRTTaskDescription);
        this.name = str;
        this.mmd5 = str2;
        this.uniqueKey = this.mmd5;
        this.resourceRootDirectory = e.f18256a;
        this.resourceName = this.name;
        this.resourceOperation = new msi(this);
    }

    @Override // com.taobao.mrt.task.desc.MRTResourceDescription
    public String getValidationMD5() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d738e3aa", new Object[]{this}) : this.mmd5;
    }
}
