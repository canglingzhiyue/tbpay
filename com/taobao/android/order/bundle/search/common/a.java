package com.taobao.android.order.bundle.search.common;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public abstract class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Activity f14568a;

    static {
        kge.a(-782733822);
    }

    public abstract void a(View view);

    public abstract int b();

    public a(Activity activity) {
        this.f14568a = activity;
    }

    public View a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this});
        }
        Activity activity = this.f14568a;
        if (activity == null) {
            return null;
        }
        View inflate = LayoutInflater.from(activity).inflate(b(), (ViewGroup) null);
        a(inflate);
        return inflate;
    }
}
