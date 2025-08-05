package com.taobao.android.tlog.protocol.model.reply.base;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashMap;
import tb.kge;

/* loaded from: classes6.dex */
public class StorageInfo extends LinkedHashMap<String, String> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long serialVersionUID = 1;

    static {
        kge.a(-960608191);
    }

    public StorageInfo set(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StorageInfo) ipChange.ipc$dispatch("21d9d4d", new Object[]{this, str, str2});
        }
        put(str, str2);
        return this;
    }
}
