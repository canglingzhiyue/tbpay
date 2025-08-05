package com.taobao.monitor.procedure;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class o implements f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static o f18229a = new o();
    private static f b;

    public void a(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f094df5", new Object[]{this, fVar});
        } else {
            b = fVar;
        }
    }

    @Override // com.taobao.monitor.procedure.f
    public IPage a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPage) ipChange.ipc$dispatch("251a917", new Object[]{this, activity});
        }
        f fVar = b;
        if (fVar == null) {
            return IPage.DEFAULT_PAGE;
        }
        return fVar.a(activity);
    }

    @Override // com.taobao.monitor.procedure.f
    public IPage a(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPage) ipChange.ipc$dispatch("fe335387", new Object[]{this, fragment});
        }
        f fVar = b;
        if (fVar == null) {
            return IPage.DEFAULT_PAGE;
        }
        return fVar.a(fragment);
    }

    @Override // com.taobao.monitor.procedure.f
    public IPage a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPage) ipChange.ipc$dispatch("808f8d67", new Object[]{this, view});
        }
        f fVar = b;
        if (fVar == null) {
            return IPage.DEFAULT_PAGE;
        }
        return fVar.a(view);
    }
}
