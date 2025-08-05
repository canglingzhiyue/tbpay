package com.taobao.android.tbabilitykit.pop;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tbabilitykit.pop.StdPopActivityGroup;
import java.lang.ref.WeakReference;
import java.util.Stack;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.q;
import tb.dlr;
import tb.dms;
import tb.gmm;
import tb.hsu;
import tb.kge;

/* loaded from: classes6.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static final Stack<d> f15349a;

    static {
        kge.a(2050126083);
        INSTANCE = new a();
        f15349a = new Stack<>();
    }

    private a() {
    }

    @JvmStatic
    public static final void a(dlr akCtx, d runnable, boolean z) {
        Object a2;
        Integer integer;
        Uri data;
        ComponentName component;
        ComponentName component2;
        Bundle extras;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52f813e5", new Object[]{akCtx, runnable, new Boolean(z)});
            return;
        }
        q.d(akCtx, "akCtx");
        q.d(runnable, "runnable");
        f15349a.push(runnable);
        com.taobao.android.abilitykit.ability.pop.model.c b = runnable.b();
        boolean z2 = akCtx instanceof gmm;
        Integer num = null;
        gmm gmmVar = (gmm) (!z2 ? null : akCtx);
        Intent h = gmmVar != null ? gmmVar.h() : null;
        if (z2) {
            WeakReference<Object> f = ((gmm) akCtx).f();
            a2 = f != null ? f.get() : null;
        } else {
            a2 = akCtx.a();
        }
        Fragment fragment = !(a2 instanceof Fragment) ? null : a2;
        boolean z3 = a2 instanceof Context;
        Context context = !z3 ? null : a2;
        if (context == null) {
            context = akCtx.a();
        }
        Intent intent = new Intent(context, z ? StdPopActivityGroup.class : StdPopContainerActivity.class);
        try {
            intent.putExtra("NAV_TO_URL_START_UPTIME", SystemClock.uptimeMillis());
            intent.putExtra("NAV_TO_URL_START_TIME", System.currentTimeMillis());
        } catch (ClassNotFoundException | NoClassDefFoundError | NoSuchMethodError | NoSuchMethodException unused) {
        }
        String str = b.c;
        if (str != null) {
            intent.setData(Uri.parse(str));
        }
        JSONObject jSONObject = b.e;
        if (jSONObject != null) {
            Bundle a3 = hsu.a(intent.getExtras(), jSONObject);
            if (h != null && (extras = h.getExtras()) != null) {
                a3.putAll(extras);
            }
            intent.replaceExtras(a3);
        }
        intent.putExtra("std_pop_origin_component_cls_name", (h == null || (component2 = h.getComponent()) == null) ? null : component2.getClassName());
        intent.putExtra("std_pop_origin_component_pkg_name", (h == null || (component = h.getComponent()) == null) ? null : component.getPackageName());
        intent.putExtra("std_pop_to_page", (h == null || (data = h.getData()) == null) ? null : data.toString());
        boolean b2 = dms.b(akCtx.a());
        INSTANCE.a(intent, h);
        JSONObject jSONObject2 = b.f;
        int intValue = (jSONObject2 == null || (integer = jSONObject2.getInteger("showNativeWithCode")) == null) ? -1 : integer.intValue();
        if (fragment != null && fragment.getActivity() != null) {
            if (b2 && z) {
                StdPopActivityGroup.a aVar = StdPopActivityGroup.Companion;
                com.taobao.android.abilitykit.ability.pop.model.c b3 = runnable.b();
                if (b3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.abilitykit.ability.pop.model.AKNativeParams");
                }
                aVar.a(((com.taobao.android.abilitykit.ability.pop.model.a) b3).f(), intent, h, fragment.getActivity());
                FragmentActivity activity = fragment.getActivity();
                if (activity != null) {
                    num = Integer.valueOf(activity.getRequestedOrientation());
                }
                intent.putExtra(StdPopActivityGroup.KEY_ORIENTATION, num);
            }
            if (intValue != -1) {
                fragment.startActivityForResult(intent, intValue);
            } else {
                fragment.startActivity(intent);
            }
        } else if (a2 instanceof Activity) {
            if (b2 && z) {
                StdPopActivityGroup.a aVar2 = StdPopActivityGroup.Companion;
                com.taobao.android.abilitykit.ability.pop.model.c b4 = runnable.b();
                if (b4 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.abilitykit.ability.pop.model.AKNativeParams");
                }
                aVar2.a(((com.taobao.android.abilitykit.ability.pop.model.a) b4).f(), intent, h, a2);
                intent.putExtra(StdPopActivityGroup.KEY_ORIENTATION, a2.getRequestedOrientation());
            }
            if (intValue != -1) {
                ((Activity) a2).startActivityForResult(intent, intValue);
            } else {
                ((Activity) a2).startActivity(intent);
            }
        } else {
            if (b2 && z) {
                StdPopActivityGroup.a aVar3 = StdPopActivityGroup.Companion;
                com.taobao.android.abilitykit.ability.pop.model.c b5 = runnable.b();
                if (b5 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.abilitykit.ability.pop.model.AKNativeParams");
                }
                aVar3.a(((com.taobao.android.abilitykit.ability.pop.model.a) b5).f(), intent, h, !z3 ? null : a2);
            }
            intent.addFlags(268435456);
            if (!z3) {
                a2 = null;
            }
            Context context2 = (Context) a2;
            if (context2 == null) {
                return;
            }
            context2.startActivity(intent);
        }
    }

    private final void a(Intent intent, Intent intent2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e85e4e2", new Object[]{this, intent, intent2});
        } else if (intent2 == null) {
        } else {
            intent.setFlags(intent2.getFlags() & (-32769) & (-67108865) & (-536870913) & (-4194305) & (-131073));
        }
    }

    @JvmStatic
    public static final d a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("f73fe655", new Object[0]);
        }
        if (!f15349a.empty()) {
            return f15349a.pop();
        }
        return null;
    }
}
