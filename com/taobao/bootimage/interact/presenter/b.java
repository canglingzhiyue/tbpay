package com.taobao.bootimage.interact.presenter;

import android.app.Activity;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.data.BootImageInfo;
import tb.kej;
import tb.kge;

/* loaded from: classes6.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Context f16703a;
    public BootImageInfo b;
    public boolean c = false;

    static {
        kge.a(-20584097);
    }

    public b(Context context, BootImageInfo bootImageInfo) {
        this.f16703a = context;
        this.b = bootImageInfo;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        if (this.c) {
            kej.a("BootImageInteractBasePresenter", "isDestroyed");
            return true;
        }
        Context context = this.f16703a;
        if (!(context instanceof Activity) || !((Activity) context).isFinishing()) {
            return false;
        }
        kej.a("BootImageInteractBasePresenter", "activity_finished");
        return true;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            this.c = true;
        }
    }
}
