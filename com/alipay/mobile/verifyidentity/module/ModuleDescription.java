package com.alipay.mobile.verifyidentity.module;

import com.android.alibaba.ip.runtime.IpChange;
import tb.riy;

/* loaded from: classes3.dex */
public class ModuleDescription {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String mClassName;
    public String mModuleName;

    public ModuleDescription setModuleName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ModuleDescription) ipChange.ipc$dispatch("b00fb94c", new Object[]{this, str});
        }
        this.mModuleName = str;
        return this;
    }

    public String getModuleName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c8cdd20c", new Object[]{this}) : this.mModuleName;
    }

    public ModuleDescription setClassName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ModuleDescription) ipChange.ipc$dispatch("bab0b214", new Object[]{this, str});
        }
        this.mClassName = str;
        return this;
    }

    public String getClassName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("68ef37ac", new Object[]{this}) : this.mClassName;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ModuleDescription [mModuleName=" + this.mModuleName + ",mClassName=" + this.mClassName + riy.ARRAY_END_STR;
    }
}
