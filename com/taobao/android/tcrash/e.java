package com.taobao.android.tcrash;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.util.Map;
import tb.jdt;
import tb.jdy;
import tb.jek;
import tb.jfv;
import tb.jgd;
import tb.jgl;
import tb.jgt;

/* loaded from: classes6.dex */
public class e implements jek {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final jdy f15510a;

    public e(jdy jdyVar) {
        this.f15510a = jdyVar;
    }

    @Override // tb.jek
    public File a(Thread thread, Throwable th, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (File) ipChange.ipc$dispatch("549e25a4", new Object[]{this, thread, th, map}) : b(thread, th, map);
    }

    private File b(Thread thread, Throwable th, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("d6e8da83", new Object[]{this, thread, th, map});
        }
        String a2 = jfv.a.a(this.f15510a, "java", "true".equals(map.get("REPORT_IGNORE")) ? com.taobao.android.fluid.framework.data.remote.newmodel.a.MATCH_IGNORE : com.taobao.android.weex_framework.util.a.ATOM_catch);
        File file = new File(new jgd(this.f15510a.a(), this.f15510a.c()).a(), a2);
        jgl.a(file, a(a2, thread, th, map));
        return file;
    }

    private String a(String str, Thread thread, Throwable th, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f8fc2aad", new Object[]{this, str, thread, th, map});
        }
        jdt jdtVar = new jdt();
        Throwable a2 = jgt.a(th);
        jdtVar.a(this.f15510a, str, "java").a(this.f15510a.c(), th, thread);
        jdtVar.a(map).a().a(this.f15510a.a());
        jdtVar.b().a(this.f15510a.a(), a2 instanceof OutOfMemoryError).c().e();
        return jdtVar.toString();
    }
}
