package com.taobao.android.mnncv.mtop;

import com.taobao.mrt.task.desc.MRTPythonLibDescription;
import com.taobao.mrt.task.desc.MRTTaskDescription;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public List<MRTTaskDescription> f14407a;
    public List<MRTPythonLibDescription> b;
    public String c;

    public c(String str) {
        this.c = str;
        Map<String, Object> a2 = com.taobao.mrt.utils.f.a(str);
        this.f14407a = d.b(a2);
        this.b = d.c(a2);
    }
}
