package com.taobao.securityjni;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.wireless.security.sdk.SecurityGuardManager;
import com.taobao.wireless.security.sdk.pkgvaliditycheck.IPkgValidityCheckComponent;
import tb.kge;

@Deprecated
/* loaded from: classes8.dex */
public class PkgValidityCheck {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static int FLAG_DEX_FILE;
    public static int FLAG_DEX_MANIFEST;

    public int checkEnvAndFiles(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c2662c6", new Object[]{this, strArr})).intValue();
        }
        return 0;
    }

    public boolean isPackageValid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dcc95c35", new Object[]{this, str})).booleanValue();
        }
        return false;
    }

    static {
        kge.a(1688825543);
        FLAG_DEX_MANIFEST = 0;
        FLAG_DEX_FILE = 1;
    }

    public PkgValidityCheck(Context context) {
    }

    public String getDexHash(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1fafca27", new Object[]{this, str, str2, new Integer(i)});
        }
        IPkgValidityCheckComponent packageValidityCheckComp = SecurityGuardManager.getInstance(GlobalInit.getGlobalContext()).getPackageValidityCheckComp();
        if (packageValidityCheckComp == null) {
            return null;
        }
        return packageValidityCheckComp.getDexHash(str, str2, i);
    }
}
