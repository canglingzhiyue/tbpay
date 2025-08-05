package com.taobao.taolive.sdk.permisson;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.support.v4.app.ActivityCompat;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.utils.u;
import java.util.ArrayList;
import java.util.HashMap;
import tb.kge;
import tb.pmd;

/* loaded from: classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f21875a;
    private static InterfaceC0910a b;
    private static boolean c;
    private static InterfaceC0910a d;

    /* renamed from: com.taobao.taolive.sdk.permisson.a$a  reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    public interface InterfaceC0910a {
        void a();

        void b();
    }

    static {
        kge.a(813050873);
        c = false;
        f21875a = false;
    }

    private static void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{new Long(j)});
        } else if (pmd.a().u() == null || pmd.a().u().c() == null) {
        } else {
            SharedPreferences.Editor edit = pmd.a().u().c().getSharedPreferences("taolive", 0).edit();
            edit.putLong("LastTimeCloseFloatWindowPermisson", j);
            edit.apply();
        }
    }

    private static long d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("596b2df", new Object[0])).longValue();
        }
        if (pmd.a().u() != null && pmd.a().u().c() != null) {
            return pmd.a().u().c().getSharedPreferences("taolive", 0).getLong("LastTimeCloseFloatWindowPermisson", -1L);
        }
        return -1L;
    }

    public static void a(Context context, final InterfaceC0910a interfaceC0910a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a0a5fb1", new Object[]{context, interfaceC0910a});
            return;
        }
        long a2 = pmd.a().w().a();
        long d2 = d();
        if (d2 < 0 || a2 - d2 > u.J() * 60 * 1000) {
            a(pmd.a().w().a());
            b(context, new InterfaceC0910a() { // from class: com.taobao.taolive.sdk.permisson.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.taolive.sdk.permisson.a.InterfaceC0910a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    InterfaceC0910a interfaceC0910a2 = InterfaceC0910a.this;
                    if (interfaceC0910a2 == null) {
                        return;
                    }
                    interfaceC0910a2.a();
                }

                @Override // com.taobao.taolive.sdk.permisson.a.InterfaceC0910a
                public void b() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                        return;
                    }
                    InterfaceC0910a interfaceC0910a2 = InterfaceC0910a.this;
                    if (interfaceC0910a2 == null) {
                        return;
                    }
                    interfaceC0910a2.b();
                }
            });
        } else if (interfaceC0910a == null) {
        } else {
            interfaceC0910a.b();
        }
    }

    public static void b(Context context, InterfaceC0910a interfaceC0910a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6785c10", new Object[]{context, interfaceC0910a});
        } else if (context == null || interfaceC0910a == null) {
        } else {
            Intent intent = new Intent(context, PermissionActivity.class);
            intent.addFlags(268435456);
            context.startActivity(intent);
            b = interfaceC0910a;
            c = true;
            if (pmd.a().e() == null) {
                return;
            }
            pmd.a().e().b("Page_TaobaoLiveWatch", "Show-checkFloatWindowPermission", new HashMap());
        }
    }

    public static void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{new Boolean(z)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("hasOverlayPermission", String.valueOf(z));
        if (pmd.a().e() != null) {
            pmd.a().e().a("Page_TaobaoLiveWatch", "checkFloatWindowPermission", hashMap);
        }
        InterfaceC0910a interfaceC0910a = b;
        if (interfaceC0910a == null) {
            return;
        }
        if (z) {
            interfaceC0910a.a();
        } else {
            interfaceC0910a.b();
        }
        b = null;
        c = false;
        f21875a = false;
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : c;
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
            return;
        }
        b = null;
        c = false;
        f21875a = false;
    }

    public static void a(Context context, String[] strArr, InterfaceC0910a interfaceC0910a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b62080d0", new Object[]{context, strArr, interfaceC0910a});
        } else if (Build.VERSION.SDK_INT >= 23) {
            ArrayList<String> arrayList = new ArrayList<>();
            for (String str : strArr) {
                if (ActivityCompat.checkSelfPermission(context, str) != 0) {
                    arrayList.add(str);
                }
            }
            if (arrayList.size() == 0) {
                if (interfaceC0910a == null) {
                    return;
                }
                interfaceC0910a.a();
                return;
            }
            try {
                Intent intent = new Intent(context, PermissionActivity.class);
                intent.putStringArrayListExtra("permissions", arrayList);
                context.startActivity(intent);
                d = interfaceC0910a;
            } catch (Throwable unused) {
                if (interfaceC0910a == null) {
                    return;
                }
                interfaceC0910a.b();
            }
        } else {
            if (interfaceC0910a == null) {
                return;
            }
            interfaceC0910a.a();
        }
    }

    private static boolean a(int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c19817a", new Object[]{iArr})).booleanValue();
        }
        if (iArr.length <= 0) {
            return false;
        }
        for (int i : iArr) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

    public static void a(int i, String[] strArr, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d6953b2", new Object[]{new Integer(i), strArr, iArr});
        } else if (d == null) {
        } else {
            if (a(iArr)) {
                d.a();
            } else {
                d.b();
            }
            d = null;
        }
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
        } else {
            d = null;
        }
    }
}
