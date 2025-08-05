package com.taobao.android.dinamic.tempate;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes5.dex */
public class DinamicTemplate implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String compilerVersion;
    private String interpreterVersion;
    public String name;
    public String templateUrl;
    public String version;

    static {
        kge.a(-2029164283);
        kge.a(1028243835);
    }

    public String getInterpreterVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d85cc85", new Object[]{this}) : this.interpreterVersion;
    }

    public void setInterpreterVersion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7057f91", new Object[]{this, str});
        } else {
            this.interpreterVersion = str;
        }
    }

    public String getCompilerVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("62bd05d6", new Object[]{this}) : this.compilerVersion;
    }

    public void setCompilerVersion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af0b89c8", new Object[]{this, str});
        } else {
            this.compilerVersion = str;
        }
    }

    public boolean checkValid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2b6d1a5f", new Object[]{this})).booleanValue() : !TextUtils.isEmpty(this.name);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "name=" + this.name + "version=" + this.version + "templateUrl=" + this.templateUrl;
    }

    public boolean isPreset() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("da1adcb4", new Object[]{this})).booleanValue() : TextUtils.isEmpty(this.version);
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
            DinamicTemplate dinamicTemplate = (DinamicTemplate) obj;
            String str = this.name;
            if (str == null ? dinamicTemplate.name != null : !str.equals(dinamicTemplate.name)) {
                return false;
            }
            String str2 = this.version;
            if (str2 != null) {
                return str2.equals(dinamicTemplate.version);
            }
            if (dinamicTemplate.version == null) {
                return true;
            }
        }
        return false;
    }
}
