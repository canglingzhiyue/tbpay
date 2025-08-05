package com.taobao.android.remoteso.tbadapter.ext;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.log.RSoLog;
import tb.ijc;
import tb.ikl;
import tb.ikw;
import tb.riy;

/* loaded from: classes6.dex */
public class f implements ijc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Application f14859a;

    public f(Application application) {
        this.f14859a = application;
    }

    @Override // tb.ijc
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else if (ikw.a((CharSequence) str)) {
            RSoLog.b("save(), use empty key =" + str + ", value = " + str2);
        } else {
            ikl.c(this.f14859a, "swallows_local_kv", str, str2);
            RSoLog.c("localkv, save(" + str + ", " + str2 + riy.BRACKET_END_STR);
        }
    }

    @Override // tb.ijc
    public boolean a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8123ece6", new Object[]{this, str, new Boolean(z)})).booleanValue();
        }
        if (ikw.a((CharSequence) str)) {
            RSoLog.b("readBool(), use empty key =" + str);
            return z;
        }
        boolean a2 = ikl.a(this.f14859a, "swallows_local_kv", str, z);
        RSoLog.c("localkv, read(" + str + ") = " + a2 + ", defaultValue=" + z);
        return a2;
    }
}
