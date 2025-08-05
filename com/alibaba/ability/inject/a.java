package com.alibaba.ability.inject;

import com.taobao.tao.log.TLog;
import java.util.Map;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.internal.q;

/* loaded from: classes2.dex */
public interface a {

    /* renamed from: com.alibaba.ability.inject.a$-CC  reason: invalid class name */
    /* loaded from: classes2.dex */
    public final /* synthetic */ class CC {
        @JvmDefault
        public static void $default$a(a aVar, String tag, String msg) {
            q.d(tag, "tag");
            q.d(msg, "msg");
            try {
                TLog.loge("Megability/Log", tag, msg);
            } catch (ClassNotFoundException | NoClassDefFoundError | NoSuchMethodError | NoSuchMethodException unused) {
            }
        }
    }

    void a(int i, String str, String str2, String str3, String str4, Map<String, ? extends Object> map);

    @JvmDefault
    void a(String str, String str2);
}
