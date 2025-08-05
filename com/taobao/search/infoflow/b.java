package com.taobao.search.infoflow;

import android.arch.lifecycle.LifecycleOwner;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1308450937);
    }

    public static a a(String str, Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("219f994d", new Object[]{str, context}) : context instanceof LifecycleOwner ? new SearchInfoFlowImpl(str, context, (LifecycleOwner) context) : new SearchInfoFlowImpl(str, context, null);
    }
}
