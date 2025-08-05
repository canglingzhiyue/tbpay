package com.taobao.tao;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes8.dex */
public class g extends l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public g(Application application, String str, String str2) {
        super(application, str, str2);
    }

    @Override // com.taobao.tao.l
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        }
    }
}
