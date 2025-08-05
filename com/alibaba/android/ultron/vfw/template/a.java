package com.alibaba.android.ultron.vfw.template;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public abstract class a implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1592422666);
        kge.a(1728594497);
    }

    public boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, str, str2})).booleanValue();
        }
        return false;
    }
}
