package tb;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.detail.rate.RateFeedsFragment;
import com.taobao.tao.Globals;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0004J\u001a\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u001e\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016J\u001a\u0010\u0018\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u0010\u0010\u001b\u001a\u00020\u00142\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dJ\u001e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\r0#H\u0002J\u000e\u0010$\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/taobao/detail/rate/vivid/utils/UiUtils;", "", "()V", "DEFAULT_AP_FULL_SIZE", "", "DEFAULT_AP_FULL_SIZE_NATIVE", "STANDARD_AP_FULL_SIZE", "ap2px", "ap", "", "convertNativePx", "px", "findCurrentFragment", "Lcom/taobao/detail/rate/RateFeedsFragment;", "parentManage", "Landroid/support/v4/app/FragmentManager;", "abilityEngine", "Lcom/taobao/android/abilitykit/AKAbilityEngine;", "getColor", "isSelected", "", "checkedColorStr", "", "uncheckedColorStr", "getRateFeedsFragment", "activity", "Landroid/support/v4/app/FragmentActivity;", "isDarkModel", "context", "Landroid/content/Context;", "onGetChildFragment", "", bgp.FRAGMENT, "Landroid/support/v4/app/Fragment;", "targetList", "", "reconvertPxByAP", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes7.dex */
public final class kqa {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_AP_FULL_SIZE = 375;
    public static final int DEFAULT_AP_FULL_SIZE_NATIVE = 360;
    public static final kqa INSTANCE = new kqa();
    public static final int STANDARD_AP_FULL_SIZE = 750;

    private kqa() {
    }

    public final boolean a(Context context) {
        Resources resources;
        Configuration configuration;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{this, context})).booleanValue();
        }
        Integer valueOf = (context == null || (resources = context.getResources()) == null || (configuration = resources.getConfiguration()) == null) ? null : Integer.valueOf(configuration.uiMode & 48);
        return valueOf != null && valueOf.intValue() == 32;
    }

    public final int a(boolean z, String checkedColorStr, String uncheckedColorStr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("da24c273", new Object[]{this, new Boolean(z), checkedColorStr, uncheckedColorStr})).intValue();
        }
        q.d(checkedColorStr, "checkedColorStr");
        q.d(uncheckedColorStr, "uncheckedColorStr");
        if (!z) {
            checkedColorStr = uncheckedColorStr;
        }
        try {
            return Color.parseColor(checkedColorStr);
        } catch (IllegalArgumentException unused) {
            return Color.parseColor("#FFFFFF");
        }
    }

    public final float a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821938b", new Object[]{this, new Integer(i)})).floatValue();
        }
        Application application = Globals.getApplication();
        q.b(application, "Globals.getApplication()");
        Resources resources = application.getResources();
        q.b(resources, "Globals.getApplication().resources");
        return (((i * 360) / 750) * resources.getDisplayMetrics().density) + 0.5f;
    }

    public final int b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9d66c2d", new Object[]{this, new Integer(i)})).intValue();
        }
        Application application = Globals.getApplication();
        q.b(application, "Globals.getApplication()");
        Resources resources = application.getResources();
        q.b(resources, "Globals.getApplication().resources");
        return (i * 375) / resources.getDisplayMetrics().widthPixels;
    }

    public final RateFeedsFragment a(FragmentActivity activity, dkt dktVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RateFeedsFragment) ipChange.ipc$dispatch("3526a806", new Object[]{this, activity, dktVar});
        }
        q.d(activity, "activity");
        if (dktVar == null) {
            return null;
        }
        FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
        q.b(supportFragmentManager, "activity.supportFragmentManager");
        if (supportFragmentManager.getFragments().size() > 0) {
            FragmentManager supportFragmentManager2 = activity.getSupportFragmentManager();
            q.b(supportFragmentManager2, "activity.supportFragmentManager");
            Fragment fragment = supportFragmentManager2.getFragments().get(0);
            if (fragment instanceof RateFeedsFragment) {
                return (RateFeedsFragment) fragment;
            }
            q.b(fragment, "fragment");
            if (TextUtils.equals("DetailCommentFragment", fragment.getTag())) {
                FragmentManager childFragmentManager = fragment.getChildFragmentManager();
                q.b(childFragmentManager, "fragment.childFragmentManager");
                if (childFragmentManager.getFragments().size() > 0) {
                    FragmentManager childFragmentManager2 = fragment.getChildFragmentManager();
                    q.b(childFragmentManager2, "fragment.childFragmentManager");
                    Fragment fragment2 = childFragmentManager2.getFragments().get(0);
                    if (fragment2 instanceof RateFeedsFragment) {
                        return (RateFeedsFragment) fragment2;
                    }
                }
            }
            FragmentManager supportFragmentManager3 = activity.getSupportFragmentManager();
            q.b(supportFragmentManager3, "activity.supportFragmentManager");
            return a(supportFragmentManager3, dktVar);
        }
        return null;
    }

    private final RateFeedsFragment a(FragmentManager fragmentManager, dkt dktVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RateFeedsFragment) ipChange.ipc$dispatch("8b3b1628", new Object[]{this, fragmentManager, dktVar});
        }
        ArrayList arrayList = new ArrayList();
        List<Fragment> fragments = fragmentManager.getFragments();
        q.b(fragments, "parentManage.fragments");
        for (Fragment fragment : fragments) {
            if (fragment != null) {
                if (fragment instanceof RateFeedsFragment) {
                    arrayList.add(fragment);
                }
                a(fragment, arrayList);
            }
        }
        for (RateFeedsFragment rateFeedsFragment : arrayList) {
            if (q.a(rateFeedsFragment.getAbilityEngine(), dktVar)) {
                return rateFeedsFragment;
            }
        }
        return null;
    }

    private final void a(Fragment fragment, List<RateFeedsFragment> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de370a3b", new Object[]{this, fragment, list});
            return;
        }
        FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        q.b(childFragmentManager, "fragment.childFragmentManager");
        List<Fragment> fragments = childFragmentManager.getFragments();
        q.b(fragments, "fragment.childFragmentManager.fragments");
        for (Fragment fragment2 : fragments) {
            if (fragment2 != null) {
                if (fragment2 instanceof RateFeedsFragment) {
                    list.add(fragment2);
                }
                a(fragment2, list);
            }
        }
    }
}
