package com.taobao.android.litecreator.sdk.editor;

import com.android.alibaba.ip.runtime.IpChange;
import tb.hen;
import tb.kge;

/* loaded from: classes5.dex */
public final class aj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-581373447);
        kge.a(9544392);
    }

    public static void a(ai aiVar, hen henVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10345685", new Object[]{aiVar, henVar});
        } else {
            aiVar.f13391a = henVar;
        }
    }
}
