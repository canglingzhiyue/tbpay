package com.alibaba.android.split;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes.dex */
public class SplitFileInfo implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String appVersion;
    public long fileSize;
    public String md5;
    public String splitName;
    public int status = 0;
    public String url;
    public String version;

    static {
        kge.a(905492942);
        kge.a(1028243835);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "SplitFileInfo{url='" + this.url + "', md5='" + this.md5 + "', appVersion='" + this.appVersion + "', version='" + this.version + "', status=" + this.status + ", fileSize=" + this.fileSize + ", splitName='" + this.splitName + "'}";
    }
}
