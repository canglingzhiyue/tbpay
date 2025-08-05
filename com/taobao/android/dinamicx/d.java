package com.taobao.android.dinamicx;

import android.content.Context;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.v;

/* loaded from: classes.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f11841a = false;

    public static void a(Context context, v.a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b3b0693", new Object[]{context, aVar, new Boolean(z)});
        } else if (f11841a) {
        } else {
            if (aVar != null) {
                aVar.a(new b());
                aVar.a(new c());
                aVar.a(new a());
                aVar.a(new k());
                aVar.a(new aj());
                aVar.a(new w());
                aVar.a(new az());
            }
            a(context, aVar, true, z);
            f11841a = true;
        }
    }

    private static void a(Context context, v.a aVar, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        boolean z3 = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c267ea1", new Object[]{context, aVar, new Boolean(z), new Boolean(z2)});
            return;
        }
        if (z) {
            try {
                b(context, z2);
            } catch (Exception e) {
                Log.e("DinamicException", "AliDinamicX v2 init failed", e);
            }
        }
        try {
            if (aVar != null) {
                aVar.a(z2);
                v a2 = aVar.a();
                if (a2.h == null) {
                    aVar.a(new b());
                    z3 = true;
                }
                if (a2.j == null) {
                    aVar.a(new c());
                    z3 = true;
                }
                if (a2.f == null) {
                    aVar.a(new k());
                    z3 = true;
                }
                if (a2.g == null) {
                    aVar.a(new aj());
                    z3 = true;
                }
                if (a2.e == null) {
                    aVar.a(new w());
                    z3 = true;
                }
                if (a2.A == null) {
                    aVar.a(new az());
                    z3 = true;
                }
                if (a2.s == null) {
                    aVar.a(new a());
                    z3 = true;
                }
                if (z3) {
                    a2 = aVar.a();
                }
                DinamicXEngine.a(context, a2);
                return;
            }
            DinamicXEngine.a(context, (v) null);
        } catch (Exception e2) {
            Log.e("DinamicException", "AliDinamicX registerView failed", e2);
        }
    }

    private static void b(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a78a2b5", new Object[]{context, new Boolean(z)});
            return;
        }
        com.taobao.android.dinamic.e.a(context.getApplicationContext(), z);
        com.taobao.android.dinamic.c.a().a(new be());
        com.taobao.android.dinamic.c.a().a(new e());
        com.taobao.android.dinamic.c.a().a(new f());
        com.taobao.android.dinamic.c.a().a(new bt());
    }

    public static void b(Context context, v.a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b99c0a72", new Object[]{context, aVar, new Boolean(z)});
        } else if (f11841a) {
        } else {
            if (aVar != null) {
                aVar.a(new b());
                aVar.a(new c());
                aVar.a(new k());
                aVar.a(new aj());
                aVar.a(new w());
                aVar.a(new az());
            }
            a(context, aVar, false, z);
            f11841a = true;
        }
    }

    public static void a(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("258fda74", new Object[]{context, new Boolean(z)});
            return;
        }
        try {
            b(context, z);
        } catch (Exception e) {
            Log.e("DinamicException", "AliDinamicX v2 init failed", e);
        }
    }
}
