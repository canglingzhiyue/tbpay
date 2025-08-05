package com.taobao.android.tlog.protocol.model.reply.base;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tlog.protocol.model.request.base.FileInfo;
import java.util.LinkedHashMap;
import tb.kge;

/* loaded from: classes6.dex */
public class UploadTokenInfo extends LinkedHashMap<String, String> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long serialVersionUID = 1;
    public FileInfo fileInfo;

    static {
        kge.a(-1857939522);
    }

    public UploadTokenInfo set(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UploadTokenInfo) ipChange.ipc$dispatch("dc2bebf0", new Object[]{this, str, str2});
        }
        put(str, str2);
        return this;
    }
}
