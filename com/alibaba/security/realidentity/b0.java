package com.alibaba.security.realidentity;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import com.alibaba.security.realidentity.algo.wrapper.entity.detector.ABDetectType;
import com.alibaba.security.realidentity.biz.config.RPBizConfig;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public abstract class b0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public l0 f3364a;

    public abstract ABDetectType a();

    public abstract void a(ABDetectType aBDetectType, boolean z);

    public void a(l0 l0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2e9d20e", new Object[]{this, l0Var});
        } else {
            this.f3364a = l0Var;
        }
    }

    public abstract void a(boolean z);

    public abstract boolean a(Context context, RPBizConfig rPBizConfig);

    public abstract boolean a(byte[] bArr, int i, int i2, int i3);

    public abstract Bundle b(byte[] bArr, int i, int i2, int i3);

    public abstract byte[] b();

    public abstract Rect c();

    public abstract byte[] d();

    public abstract byte[] e();

    public abstract float[] f();

    public abstract byte[] g();

    public abstract float[] h();

    public abstract ArrayList<c0> i();

    public abstract boolean j();

    public abstract void k();
}
