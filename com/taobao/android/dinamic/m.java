package com.taobao.android.dinamic;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.tempate.DTemplateManager;
import tb.kge;

/* loaded from: classes.dex */
public class m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public d f11752a;
    public DTemplateManager b;

    static {
        kge.a(1418495842);
    }

    public static m a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m) ipChange.ipc$dispatch("c5827119", new Object[]{str});
        }
        m mVar = new m();
        mVar.f11752a = new d(str);
        mVar.b = new DTemplateManager(str);
        return mVar;
    }
}
