package com.alipay.bis.core.protocol;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class BioRuntimeDependency {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ArrayList<BioLibFile> libFiles;
    private ArrayList<BioModelFile> modelFiles;
    private String resVersion = "0";

    public static BioRuntimeDependency createFromJson(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BioRuntimeDependency) ipChange.ipc$dispatch("af629034", new Object[]{str});
        }
        if (str == null) {
            return null;
        }
        try {
            return (BioRuntimeDependency) JSON.parseObject(str, BioRuntimeDependency.class);
        } catch (Exception unused) {
            return null;
        }
    }

    public ArrayList<BioLibFile> getLibFiles() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("b95d5749", new Object[]{this});
        }
        if (this.libFiles == null) {
            this.libFiles = new ArrayList<>();
        }
        return this.libFiles;
    }

    public void setLibFiles(ArrayList<BioLibFile> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5f388f", new Object[]{this, arrayList});
        } else {
            this.libFiles = arrayList;
        }
    }

    public ArrayList<BioModelFile> getModelFiles() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("ff46eba5", new Object[]{this});
        }
        if (this.modelFiles == null) {
            this.modelFiles = new ArrayList<>();
        }
        return this.modelFiles;
    }

    public void setModelFiles(ArrayList<BioModelFile> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a290e2b3", new Object[]{this, arrayList});
        } else {
            this.modelFiles = arrayList;
        }
    }

    public String getResVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3de9a3ab", new Object[]{this}) : this.resVersion;
    }

    public void setResVersion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f634592b", new Object[]{this, str});
        } else {
            this.resVersion = str;
        }
    }
}
