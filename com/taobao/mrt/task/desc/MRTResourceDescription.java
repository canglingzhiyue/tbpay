package com.taobao.mrt.task.desc;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;
import tb.msj;

/* loaded from: classes7.dex */
public abstract class MRTResourceDescription implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static int MRTResourceFiles;
    public static int MRTResourceLibs;
    public static int MRTResourceModel;
    public static int MRTResourceNone;
    public MRTTaskDescription associatedTask;
    public String fmd5;
    public String furl;
    public int resourceMask = MRTResourceNone;
    public String resourceName;
    public msj resourceOperation;
    public String resourceRootDirectory;
    public String resourceType;
    public String uniqueKey;

    public abstract String getValidationMD5();

    static {
        kge.a(1793763910);
        kge.a(1028243835);
        MRTResourceNone = 0;
        MRTResourceModel = 1;
        MRTResourceFiles = 2;
        MRTResourceLibs = 4;
    }

    public MRTResourceDescription(String str, String str2, MRTTaskDescription mRTTaskDescription) {
        this.furl = str;
        this.fmd5 = str2;
        this.associatedTask = mRTTaskDescription;
        this.uniqueKey = this.fmd5;
    }
}
