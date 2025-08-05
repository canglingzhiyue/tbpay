package tb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.TBMainHost;
import java.util.List;
import tb.hyw;

/* loaded from: classes2.dex */
public class fke {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f28008a;

    static {
        kge.a(164982891);
        f28008a = false;
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else if (f28008a && (context instanceof Activity)) {
            ((Activity) context).finish();
        } else {
            try {
            } catch (Throwable th) {
                a("ERROR_FROM_(finish)_BY_" + context.getClass().getSimpleName(), th.getMessage());
            }
            if (context instanceof gws) {
                ((gws) context).dismiss();
                return;
            }
            if ((context instanceof FragmentActivity) && TBMainHost.a().getContext() == context) {
                a(context, ((FragmentActivity) context).getSupportFragmentManager());
                return;
            }
            if (!(context instanceof Activity)) {
                return;
            }
            a("WARNING_FROM_(finish)_BY_" + context.getClass().getSimpleName(), "finish exception");
            ((Activity) context).finish();
        }
    }

    public static Intent b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("ce9f1e34", new Object[]{context});
        }
        if (f28008a && (context instanceof Activity)) {
            return ((Activity) context).getIntent();
        }
        try {
        } catch (Throwable th) {
            a("ERROR_FROM_(getIntent)_BY_" + context.getClass().getSimpleName(), th.getMessage());
        }
        if (context instanceof gws) {
            return ((gws) context).getContainerIntent();
        }
        if ((context instanceof FragmentActivity) && TBMainHost.a().getContext() == context) {
            return b(context, ((FragmentActivity) context).getSupportFragmentManager());
        }
        if (context instanceof Activity) {
            a("WARNING_FROM_(getIntent)_BY_" + context.getClass().getSimpleName(), "getIntent exception");
            return ((Activity) context).getIntent();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("ERROR_INTENT_EMPTY_FROM_(getIntent)_BY_");
        sb.append(context != null ? context.getClass().getSimpleName() : "null");
        a(sb.toString(), "getIntent empty");
        return null;
    }

    public static Object c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("b3f74b54", new Object[]{context});
        }
        if ((f28008a && (context instanceof Activity)) || (context instanceof gws)) {
            return context;
        }
        try {
            if ((context instanceof FragmentActivity) && TBMainHost.a().getContext() == context) {
                return a(((FragmentActivity) context).getSupportFragmentManager());
            }
        } catch (Throwable th) {
            a("ERROR_FROM_(getIntent)_BY_" + context.getClass().getSimpleName(), th.getMessage());
        }
        a("WARNING_FROM_(getContainer)_BY_" + context.getClass().getSimpleName(), "getContainer exception");
        return context;
    }

    private static void a(Context context, FragmentManager fragmentManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cb32f51", new Object[]{context, fragmentManager});
            return;
        }
        List<Fragment> fragments = fragmentManager.getFragments();
        if (fragments == null) {
            a("ERROR_FROM_(dismissFragments)_BY_" + context.getClass().getSimpleName(), "getIntent empty");
            return;
        }
        for (Fragment fragment : fragments) {
            if (fragment instanceof gws) {
                ((gws) fragment).dismiss();
            }
        }
    }

    private static Intent b(Context context, FragmentManager fragmentManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("890e3f23", new Object[]{context, fragmentManager});
        }
        List<Fragment> fragments = fragmentManager.getFragments();
        if (fragments == null) {
            a("ERROR_INTENT_EMPTY_FROM_(getIntentFromFragments)_BY_" + context.getClass().getSimpleName(), "dismissFragments exception");
            return null;
        }
        for (Fragment fragment : fragments) {
            if (fragment instanceof gws) {
                return ((gws) fragment).getContainerIntent();
            }
        }
        return null;
    }

    private static Fragment a(FragmentManager fragmentManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("e0a674bb", new Object[]{fragmentManager});
        }
        List<Fragment> fragments = fragmentManager.getFragments();
        if (fragments == null) {
            a("ERROR_FRAGMENT_EMPTY_FROM_(findFragmentContainer)", "findFragmentContainer exception");
            return null;
        }
        for (Fragment fragment : fragments) {
            if (fragment instanceof gws) {
                return fragment;
            }
        }
        return null;
    }

    private static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else {
            hyw.a(hyw.a.b("AURAContainerWrapperTracker").a(str2).c(str).a(0.01f));
        }
    }
}
