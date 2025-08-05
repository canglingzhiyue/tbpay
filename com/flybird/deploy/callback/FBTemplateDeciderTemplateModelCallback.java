package com.flybird.deploy.callback;

import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.deploy.callback.a;
import com.flybird.deploy.model.FBTemplateContent;

/* loaded from: classes4.dex */
public abstract class FBTemplateDeciderTemplateModelCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public a.C0256a f7211a;

    public FBTemplateDeciderTemplateModelCallback(a.C0256a c0256a) {
        this.f7211a = c0256a;
    }

    public abstract void call(FBTemplateContent fBTemplateContent, String str, int i, long j, int i2, int i3);
}
