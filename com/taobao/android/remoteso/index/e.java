package com.taobao.android.remoteso.index;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        int indexOf = str.indexOf("|");
        if (indexOf != -1) {
            return str.substring(0, indexOf);
        }
        return null;
    }
}
