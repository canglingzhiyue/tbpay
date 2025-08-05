package com.taobao.android.detail.core.performance;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes4.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(721291260);
    }

    public static String a(String str, BTags... bTagsArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8504b085", new Object[]{str, bTagsArr});
        }
        StringBuilder sb = new StringBuilder();
        for (BTags bTags : bTagsArr) {
            sb.append(bTags.tagName);
        }
        sb.append(str);
        return sb.toString();
    }
}
