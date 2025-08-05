package com.taobao.alimama.utils;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.utils.Global;
import tb.kge;

/* loaded from: classes4.dex */
public final class EnvironmentUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes4.dex */
    public enum Env {
        UNKNOW(""),
        TAOBAO("com.taobao.taobao"),
        TMALL("com.tmall.wireless"),
        TAOBAO_LITE("com.taobao.htao.android"),
        IDLE_FISH("com.taobao.idlefish");
        
        public String PackageName;

        Env(String str) {
            this.PackageName = str;
        }
    }

    static {
        kge.a(361949816);
    }

    private EnvironmentUtils() {
    }

    public static Env getCurrentEnv() {
        Env[] values;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Env) ipChange.ipc$dispatch("d1ab17a1", new Object[0]);
        }
        for (Env env : Env.values()) {
            if (env.PackageName.equals(Global.getPackageName())) {
                return env;
            }
        }
        return Env.UNKNOW;
    }

    public static boolean isInTaobao() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4144b008", new Object[0])).booleanValue() : getCurrentEnv() == Env.TAOBAO;
    }
}
