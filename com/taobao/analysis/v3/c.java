package com.taobao.analysis.v3;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import tb.mzp;

/* loaded from: classes.dex */
public class c extends o implements h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static String f8588a = "preProcess";
    public static String b = "netRequest";
    public static String c = "dataParse";
    public static String q_ = "viewRender";

    public c(v vVar, String str, String str2, long j, Map<String, Object> map, List<mzp> list) {
        super(vVar, str, str2, j, map, list, FalcoSpanLayer.FRAMEWORK_CONTAINER);
    }

    @Override // com.taobao.analysis.v3.h
    public void a(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ed6d4a7", new Object[]{this, l});
        } else {
            e(f8588a).a(l);
        }
    }

    @Override // com.taobao.analysis.v3.h
    public void b(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b6fca28", new Object[]{this, l});
            return;
        }
        b_(l);
        e(b).a(l);
    }

    @Override // com.taobao.analysis.v3.h
    public void c(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7808bfa9", new Object[]{this, l});
            return;
        }
        b_(l);
        e(c).a(l);
    }

    @Override // com.taobao.analysis.v3.h
    public void d(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84a1b52a", new Object[]{this, l});
            return;
        }
        b_(l);
        e(q_).a(l);
    }

    @Override // com.taobao.analysis.v3.h
    public void e(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("913aaaab", new Object[]{this, l});
        } else {
            e(q_).b(l);
        }
    }
}
