package com.alibaba.android.split.core.splitcompat;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.IOException;
import tb.kge;

/* loaded from: classes.dex */
public class l implements com.alibaba.android.split.l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-146133900);
        kge.a(-1764788693);
    }

    @Override // com.alibaba.android.split.l
    public File a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("c26a5a1b", new Object[]{this, str});
        }
        try {
            File a2 = j.h().c().b(str).a();
            if (a2 != null && a2.exists()) {
                return a2;
            }
            File c = j.h().b().c(str);
            if (c == null) {
                return null;
            }
            if (!c.exists()) {
                return null;
            }
            return c;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
