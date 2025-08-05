package com.taobao.android.remoteso.index;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.compiler.gen.IndexFromCompiler2;
import tb.ikq;

/* loaded from: classes6.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    private static Object a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("17307540", new Object[]{str});
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -1300347934) {
            if (hashCode == 1204979280 && str.equals("swallows_rso_index")) {
                c = 0;
            }
        } else if (str.equals("swallows_rso_index2")) {
            c = 1;
        }
        if (c == 0) {
            return IndexFromCompiler2.buildIndex();
        }
        if (c == 1) {
            return IndexFromCompiler2.buildIndex2();
        }
        return null;
    }

    public static <T> T a(String str, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("21de4147", new Object[]{str, cls});
        }
        try {
            T t = (T) a(str);
            if (!cls.isInstance(t)) {
                return null;
            }
            return t;
        } catch (Throwable th) {
            ikq.a("IndexBuilderOpt", th);
            return null;
        }
    }
}
