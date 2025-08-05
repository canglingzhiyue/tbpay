package com.taobao.android.detail.core.utils;

import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.async.TBAsyncTask;
import com.taobao.orange.OrangeConfig;
import java.util.ArrayList;
import java.util.List;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class q {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : b();
    }

    public static /* synthetic */ List b(ViewGroup viewGroup, Class cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("699b1e92", new Object[]{viewGroup, cls}) : c(viewGroup, cls);
    }

    static {
        kge.a(-220109773);
        emu.a("com.taobao.android.detail.core.utils.VerificationUtils");
    }

    private static <C extends View> List<C> c(ViewGroup viewGroup, Class<C> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("2410bf13", new Object[]{viewGroup, cls});
        }
        ArrayList arrayList = new ArrayList();
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof ViewGroup) {
                arrayList.addAll(c((ViewGroup) childAt, cls));
            } else if (childAt != null && cls.isAssignableFrom(childAt.getClass())) {
                arrayList.add(childAt);
            }
        }
        return arrayList;
    }

    private static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        try {
            return Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("android_detail", "skip_bottom_bar_verification", "false"));
        } catch (Throwable unused) {
            return false;
        }
    }

    public static <C extends View> void a(final ViewGroup viewGroup, final Class<C> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("831b7976", new Object[]{viewGroup, cls});
        } else if (viewGroup == null) {
        } else {
            new TBAsyncTask<ViewGroup, Void, List<C>>() { // from class: com.taobao.android.detail.core.utils.q.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                    if (str.hashCode() == -1507519932) {
                        super.a((AnonymousClass1) objArr[0]);
                        return null;
                    }
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                }

                @Override // com.taobao.android.detail.core.async.TBAsyncTask
                public List<C> a(ViewGroup... viewGroupArr) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (List) ipChange2.ipc$dispatch("e83ae05b", new Object[]{this, viewGroupArr});
                    }
                    try {
                        if (q.a()) {
                            return null;
                        }
                        return q.b(viewGroup, cls);
                    } catch (Throwable unused) {
                        return null;
                    }
                }

                @Override // com.taobao.android.detail.core.async.TBAsyncTask
                public void a(List<C> list) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c7052959", new Object[]{this, list});
                        return;
                    }
                    super.a((AnonymousClass1) list);
                    if (list == 0) {
                        return;
                    }
                    try {
                        if (list.size() <= 0) {
                            return;
                        }
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            View view = (View) list.get(i);
                            if (view != null) {
                                view.setVisibility(8);
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
            }.a(TBAsyncTask.THREAD_POOL_EXECUTOR, new ViewGroup[0]);
        }
    }
}
