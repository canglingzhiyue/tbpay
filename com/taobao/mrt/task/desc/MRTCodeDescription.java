package com.taobao.mrt.task.desc;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mrt.task.e;
import java.util.Objects;
import tb.kge;
import tb.msg;

/* loaded from: classes7.dex */
public class MRTCodeDescription extends MRTResourceDescription {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String mmd5;

    static {
        kge.a(1427606279);
    }

    public MRTCodeDescription(String str, String str2, String str3, MRTTaskDescription mRTTaskDescription) {
        super(str, str3, mRTTaskDescription);
        this.mmd5 = str2;
        this.uniqueKey = this.mmd5;
        this.resourceRootDirectory = e.b;
        this.resourceName = this.associatedTask.name;
        this.resourceMask = MRTResourceModel;
        this.resourceOperation = new msg(this);
        this.resourceType = "model";
    }

    @Override // com.taobao.mrt.task.desc.MRTResourceDescription
    public String getValidationMD5() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d738e3aa", new Object[]{this}) : this.mmd5;
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
            MRTCodeDescription mRTCodeDescription = (MRTCodeDescription) obj;
            if (Objects.equals(this.resourceName, mRTCodeDescription.resourceName) && Objects.equals(this.furl, mRTCodeDescription.furl) && Objects.equals(this.fmd5, mRTCodeDescription.fmd5)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue() : Objects.hash(this.resourceName, this.furl, this.fmd5);
    }
}
