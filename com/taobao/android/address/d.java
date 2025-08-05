package com.taobao.android.address;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.alibaba.aliweex.bundle.m;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes4.dex */
public class d implements m.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ProgressBar f8975a;

    @Override // com.alibaba.aliweex.bundle.m.c
    public View a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("876fa4a2", new Object[]{this, context});
        }
        ProgressBar progressBar = new ProgressBar(context);
        this.f8975a = progressBar;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        progressBar.setLayoutParams(layoutParams);
        return progressBar;
    }

    @Override // com.alibaba.aliweex.bundle.m.c
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.f8975a.setVisibility(8);
        }
    }
}
