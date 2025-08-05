package com.taobao.android.virtual_thread.stub.config;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import tb.kge;

/* loaded from: classes6.dex */
public class StubConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DO_NOTHING = 0;
    public static final int USE_VIRTUAL_THREAD_POOL = 1;
    private static Set<String> exThreadPoolConfig;
    private static volatile boolean isSupportRedexVt32;
    public static int stubToken;
    private static Set<String> workThreadPoolConfig;

    static {
        kge.a(943459322);
        stubToken = 0;
        exThreadPoolConfig = new HashSet();
        workThreadPoolConfig = new HashSet();
        isSupportRedexVt32 = false;
    }

    public static void setStubToken(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e54b153", new Object[]{new Integer(i)});
        } else {
            stubToken = i;
        }
    }

    public static void setExThreadPoolConfig(Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2683e13b", new Object[]{set});
        } else if (set == null) {
        } else {
            exThreadPoolConfig = new HashSet(set);
        }
    }

    public static void setWorkThreadPoolConfig(Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3e9629d", new Object[]{set});
        } else if (set == null) {
        } else {
            workThreadPoolConfig = new HashSet(set);
        }
    }

    public static boolean isExcludeThread(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7adce68f", new Object[]{str})).booleanValue();
        }
        for (String str2 : exThreadPoolConfig) {
            if (Pattern.matches(str2, str)) {
                return true;
            }
        }
        if (workThreadPoolConfig.size() > 0) {
            for (String str3 : workThreadPoolConfig) {
                if (Pattern.matches(str3, str)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isVirtualThreadPool() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d129b3b2", new Object[0])).booleanValue() : (stubToken & 1) > 0;
    }

    public static boolean isSupportRedexVt32() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("13c5f187", new Object[0])).booleanValue() : isSupportRedexVt32;
    }

    public static void setSupportRedexVt32(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f76b7579", new Object[]{new Boolean(z)});
        } else {
            isSupportRedexVt32 = z;
        }
    }
}
