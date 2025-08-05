package com.taobao.tao.tbmainfragment;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentationMagician;
import android.view.KeyEvent;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kge;

/* loaded from: classes8.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String JUMP_TO_FRAGMENT = "jumpToFragment";
    public static final String KEY_FRAGMENT_ARGS = "fragmentArgs";
    public static final String KEY_FRAGMENT_BUNDLE = "fragmentBundle";
    public static final String KEY_FRAGMENT_JUMP = "jumpByFragment";
    public static final String KEY_FRAGMENT_NAME = "fragmentName";
    public static final String KEY_NEW_DETAIL_IMMERSIVE = "newDetail_immersive";
    public static final String OPEN_FRAGMENT_JUMP = "true";
    public static final String SAVE_INSTANCE_ANDROID_FRAGMENT_NAME = "androidFragmentCount";
    public static final String SAVE_INSTANCE_ANDROID_SUPPORT_FRAGMENT_NAME = "androidSupportFragmentCount";
    public static final String SAVE_INSTANCE_MODULE_NAME = "tbMainFragment";
    public static final String SAVE_INSTANCE_MONITOR_POINT_NAME = "saveInstanceStateNotNullCount";
    public static final String SUB_KEY_FRAGMENT_JUMP = "subBizType";
    public static final String THREE_FLOORS = "threeFloorsCount";

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicBoolean f21136a;

    static {
        kge.a(909388325);
        f21136a = new AtomicBoolean(false);
    }

    public static ISupportFragment a(FragmentManager fragmentManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ISupportFragment) ipChange.ipc$dispatch("83af19fe", new Object[]{fragmentManager}) : a(fragmentManager, 0);
    }

    public static ISupportFragment a(FragmentManager fragmentManager, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ISupportFragment) ipChange.ipc$dispatch("15db6e6d", new Object[]{fragmentManager, new Integer(i)});
        }
        List<Fragment> activeFragments = FragmentationMagician.getActiveFragments(fragmentManager);
        if (activeFragments == null) {
            return null;
        }
        for (int size = activeFragments.size() - 1; size >= 0; size--) {
            Fragment fragment = activeFragments.get(size);
            if (fragment instanceof ISupportFragment) {
                ISupportFragment iSupportFragment = (ISupportFragment) fragment;
                if (i == 0 || i == iSupportFragment.getSupportDelegate().c) {
                    return iSupportFragment;
                }
            }
        }
        return null;
    }

    public static <T extends ISupportFragment> T a(FragmentManager fragmentManager, Class<T> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("cdeee4f3", new Object[]{fragmentManager, cls}) : (T) a(cls, (String) null, fragmentManager);
    }

    public static <T extends ISupportFragment> T a(Class<T> cls, String str, FragmentManager fragmentManager) {
        Fragment findFragmentByTag;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("ee4b7227", new Object[]{cls, str, fragmentManager});
        }
        if (str == null) {
            List<Fragment> activeFragments = FragmentationMagician.getActiveFragments(fragmentManager);
            if (activeFragments != null) {
                int size = activeFragments.size() - 1;
                while (true) {
                    if (size < 0) {
                        findFragmentByTag = null;
                        break;
                    }
                    Fragment fragment = activeFragments.get(size);
                    if ((fragment instanceof ISupportFragment) && fragment.getClass().getName().equals(cls.getName())) {
                        findFragmentByTag = fragment;
                        break;
                    }
                    size--;
                }
            } else {
                return null;
            }
        } else {
            findFragmentByTag = fragmentManager.findFragmentByTag(str);
            if (findFragmentByTag == null) {
                return null;
            }
        }
        return (T) findFragmentByTag;
    }

    public static <T extends ISupportFragment> T b(Class<T> cls, String str, FragmentManager fragmentManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("61586e68", new Object[]{cls, str, fragmentManager});
        }
        int backStackEntryCount = fragmentManager.getBackStackEntryCount();
        if (str == null) {
            str = cls.getName();
        }
        for (int i = backStackEntryCount - 1; i >= 0; i--) {
            FragmentManager.BackStackEntry backStackEntryAt = fragmentManager.getBackStackEntryAt(i);
            if (str.equals(backStackEntryAt.getName())) {
                Fragment findFragmentByTag = fragmentManager.findFragmentByTag(backStackEntryAt.getName());
                if (findFragmentByTag instanceof ISupportFragment) {
                    return (T) findFragmentByTag;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
        if (r3 < r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
        r3 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List<android.support.v4.app.Fragment> a(android.support.v4.app.FragmentManager r6, java.lang.String r7, boolean r8) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.tao.tbmainfragment.i.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L20
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r6
            r6 = 1
            r1[r6] = r7
            r6 = 2
            java.lang.Boolean r7 = new java.lang.Boolean
            r7.<init>(r8)
            r1[r6] = r7
            java.lang.String r6 = "1a056bd6"
            java.lang.Object r6 = r0.ipc$dispatch(r6, r1)
            java.util.List r6 = (java.util.List) r6
            return r6
        L20:
            android.support.v4.app.Fragment r7 = r6.findFragmentByTag(r7)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r6 = android.support.v4.app.FragmentationMagician.getActiveFragments(r6)
            if (r6 != 0) goto L30
            return r0
        L30:
            int r1 = r6.size()
            int r2 = r1 + (-1)
            r3 = r2
        L37:
            r4 = -1
            if (r3 < 0) goto L4b
            java.lang.Object r5 = r6.get(r3)
            if (r7 != r5) goto L48
            if (r8 == 0) goto L43
            goto L4c
        L43:
            int r3 = r3 + 1
            if (r3 >= r1) goto L4b
            goto L4c
        L48:
            int r3 = r3 + (-1)
            goto L37
        L4b:
            r3 = -1
        L4c:
            if (r3 != r4) goto L4f
            return r0
        L4f:
            if (r2 < r3) goto L65
            java.lang.Object r7 = r6.get(r2)
            android.support.v4.app.Fragment r7 = (android.support.v4.app.Fragment) r7
            if (r7 == 0) goto L62
            android.view.View r8 = r7.getView()
            if (r8 == 0) goto L62
            r0.add(r7)
        L62:
            int r2 = r2 + (-1)
            goto L4f
        L65:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.tbmainfragment.i.a(android.support.v4.app.FragmentManager, java.lang.String, boolean):java.util.List");
    }

    public static ViewGroup a(Activity activity, Fragment fragment, int i) {
        KeyEvent.Callback findViewById;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("721555ea", new Object[]{activity, fragment, new Integer(i)});
        }
        if (fragment.getView() == null) {
            return null;
        }
        Fragment parentFragment = fragment.getParentFragment();
        if (parentFragment != null) {
            if (parentFragment.getView() != null) {
                findViewById = parentFragment.getView().findViewById(i);
            } else {
                findViewById = a(activity, parentFragment, i);
            }
        } else {
            findViewById = activity.findViewById(i);
        }
        if (!(findViewById instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) findViewById;
    }

    public static boolean b(FragmentManager fragmentManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c9fc51de", new Object[]{fragmentManager})).booleanValue();
        }
        ISupportFragment a2 = a(fragmentManager);
        if (a2 == null) {
            return false;
        }
        return "com.taobao.tao.tbmainfragment.TBMainFragment".equals(a2.asFragment().getClass().getName());
    }

    public static boolean a(Fragment fragment, FragmentManager fragmentManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f9916a3f", new Object[]{fragment, fragmentManager})).booleanValue();
        }
        if (fragment != null) {
            return fragment.equals(a(fragmentManager));
        }
        return false;
    }

    public static void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{new Boolean(z)});
        } else {
            f21136a.set(z);
        }
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : f21136a.get();
    }

    public static int c(FragmentManager fragmentManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("649d144e", new Object[]{fragmentManager})).intValue() : fragmentManager.getFragments().size();
    }
}
