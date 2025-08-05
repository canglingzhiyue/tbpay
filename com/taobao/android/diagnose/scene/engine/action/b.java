package com.taobao.android.diagnose.scene.engine.action;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Random;
import tb.fmu;
import tb.kge;

/* loaded from: classes.dex */
public abstract class b implements fmu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Context f11719a = com.taobao.android.diagnose.c.a().b();
    public int b;
    public String c;
    public int d;

    static {
        kge.a(-836037676);
        kge.a(36656279);
    }

    public b(int i, String str, int i2) {
        this.b = i;
        this.c = str;
        this.d = i2;
    }

    @Override // tb.fmu
    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.b;
    }

    @Override // tb.fmu
    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : new Random().nextInt(10000) < this.d;
    }
}
