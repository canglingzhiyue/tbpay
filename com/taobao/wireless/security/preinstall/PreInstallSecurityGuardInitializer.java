package com.taobao.wireless.security.preinstall;

import android.content.Context;
import com.alibaba.wireless.security.open.SecException;
import com.alibaba.wireless.security.open.SecurityGuardManager;
import com.alibaba.wireless.security.open.initialize.IInitializeComponent;
import com.alibaba.wireless.security.open.initialize.a;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes9.dex */
public final class PreInstallSecurityGuardInitializer {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1547960229);
    }

    private PreInstallSecurityGuardInitializer() {
    }

    public static int Initialize(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c1be1364", new Object[]{context})).intValue() : Initialize(context, null);
    }

    public static int Initialize(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fe79a2ee", new Object[]{context, str})).intValue();
        }
        try {
            IInitializeComponent initializer = SecurityGuardManager.getInitializer();
            if (initializer != null && (initializer instanceof a)) {
                return ((a) initializer).a(context, str, false);
            }
            return 1;
        } catch (SecException e) {
            e.printStackTrace();
            return 1;
        }
    }
}
