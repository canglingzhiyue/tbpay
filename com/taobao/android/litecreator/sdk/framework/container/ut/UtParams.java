package com.taobao.android.litecreator.sdk.framework.container.ut;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes5.dex */
public class UtParams extends HashMap<String, String> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(555074013);
    }

    public static UtParams newInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UtParams) ipChange.ipc$dispatch("49b7c6c", new Object[0]) : new UtParams();
    }

    public UtParams putParams(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UtParams) ipChange.ipc$dispatch("203f99b8", new Object[]{this, str, str2});
        }
        put(str, str2);
        return this;
    }

    public UtParams safePutParams(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UtParams) ipChange.ipc$dispatch("221468e5", new Object[]{this, str, str2});
        }
        if (!StringUtils.isEmpty(str2)) {
            put(str, str2);
        }
        return this;
    }
}
