package com.taobao.themis.kernel.utils;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0007H\u0007J\n\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0007J\b\u0010\t\u001a\u00020\u0007H\u0007J\b\u0010\n\u001a\u00020\u0007H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/taobao/themis/kernel/utils/LocalSwitchUtils;", "", "()V", "FLAG_DEBUG", "", "LOCAL_PATH", "forcePHADowngrade", "", "getMockUrlForFragment", "isDebugMode", "switchFragment", "themis_kernel_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final g INSTANCE;

    static {
        kge.a(-2111668756);
        INSTANCE = new g();
    }

    private g() {
    }

    @JvmStatic
    public static final boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : new File("/data/local/tmp/.themis_local_switch/.ThemisDebugMode").exists();
    }

    @JvmStatic
    public static final boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : new File("/data/local/tmp/.themis_local_switch/.forcePhaDowngrade").exists();
    }

    @JvmStatic
    public static final boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : new File("/data/local/tmp/.themis_local_switch/.ThemisFragment").exists();
    }

    @JvmStatic
    public static final String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[0]);
        }
        if (c() && new File("/data/local/tmp/.themis_local_switch/.fragment_path").exists()) {
            return kotlin.io.f.a(new File("/data/local/tmp/.themis_local_switch/.fragment_path"), null, 1, null);
        }
        return null;
    }
}
