package com.taobao.update.apk;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes9.dex */
public class MainUpdateData implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public long applicationId;
    public long batchId;
    public String channelNum;
    public String etag;
    public String httpsUrl;
    public String info;
    public String md5;
    public String packageUrl;
    public long productId;
    public int remindCount;
    public int remindStrategy;
    public long size;
    public String version;

    static {
        kge.a(-1206993070);
        kge.a(1028243835);
    }

    public String getDownloadUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c9b30508", new Object[]{this});
        }
        if (!TextUtils.isEmpty(this.httpsUrl)) {
            return this.httpsUrl;
        }
        return this.packageUrl;
    }
}
