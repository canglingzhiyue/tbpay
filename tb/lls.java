package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.engine.env.protocol.c;
import com.taobao.tao.Globals;

/* loaded from: classes.dex */
public class lls implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f30699a;

    static {
        kge.a(756897117);
        kge.a(936672633);
    }

    @Override // com.taobao.infoflow.core.engine.env.protocol.c
    public Application a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Application) ipChange.ipc$dispatch("f921f837", new Object[]{this}) : Globals.getApplication();
    }

    @Override // com.taobao.infoflow.core.engine.env.protocol.c
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        Boolean bool = f30699a;
        if (bool != null) {
            return bool.booleanValue();
        }
        Boolean valueOf = Boolean.valueOf(a(Globals.getApplication()));
        f30699a = valueOf;
        return valueOf.booleanValue();
    }

    public static boolean a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("75c56f7b", new Object[]{application})).booleanValue();
        }
        try {
            return (application.getApplicationInfo().flags & 2) != 0;
        } catch (Throwable unused) {
            return false;
        }
    }
}
