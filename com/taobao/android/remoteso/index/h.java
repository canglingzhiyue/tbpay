package com.taobao.android.remoteso.index;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import tb.ikq;

/* loaded from: classes6.dex */
public class h implements g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final List<g> f14813a = new ArrayList();

    public h(g... gVarArr) {
        this.f14813a.addAll(Arrays.asList(gVarArr));
    }

    @Override // com.taobao.android.remoteso.index.g
    public void a(SoIndexData soIndexData, SoIndexAdvanced soIndexAdvanced) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48cc4ef0", new Object[]{this, soIndexData, soIndexAdvanced});
            return;
        }
        for (g gVar : this.f14813a) {
            try {
                gVar.a(soIndexData, soIndexAdvanced);
            } catch (Throwable th) {
                ikq.a("IndexDataHookWrapper.hook error", gVar.getClass().getSimpleName(), th);
            }
        }
    }
}
