package com.taobao.tao.homepage;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.lap;
import tb.llf;

/* loaded from: classes8.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Integer DEFAULT_POSITION;

    /* renamed from: a  reason: collision with root package name */
    private static int f20593a;
    private static int b;
    private static boolean c;

    static {
        kge.a(-2124734723);
        Integer num = -2;
        DEFAULT_POSITION = num;
        f20593a = num.intValue();
    }

    public static void a(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f0514a", new Object[]{fragment});
        } else if (j.a(fragment) || !c) {
        } else {
            j.a(f20593a, b);
        }
    }

    public static void a(Fragment fragment, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80cf6b4a", new Object[]{fragment, bundle});
        } else if (j.a(fragment)) {
        } else {
            if (bundle == null) {
                lap.a("【Homepage_PageLifeCycle】", "onViewStateRestored", "savedInstanceState == null");
                return;
            }
            c = true;
            b(bundle);
        }
    }

    public static void b(Fragment fragment, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a663744b", new Object[]{fragment, bundle});
        } else if (j.a(fragment)) {
        } else {
            c = false;
            a(bundle);
        }
    }

    private static void a(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b668f6c", new Object[]{bundle});
            return;
        }
        llf a2 = j.a();
        if (a2 == null) {
            lap.a("【Homepage_PageLifeCycle】", "onFragmentSaveInstanceState", "出现异常，mainFeedsParams == null");
            return;
        }
        int a3 = a2.a();
        bundle.putInt("currentFirstVisibleItemPosition", a3);
        int b2 = a2.b();
        bundle.putInt("currentFirstVisibleItemOffset", b2);
        lap.a("【Homepage_PageLifeCycle】", "onFragmentSaveInstanceState", "销毁时当前第一张卡片偏移量为：" + b2 + "销毁时当前第一张卡片位置为：" + a3);
    }

    private static void b(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47681e4b", new Object[]{bundle});
            return;
        }
        f20593a = bundle.getInt("currentFirstVisibleItemPosition");
        b = bundle.getInt("currentFirstVisibleItemOffset");
        lap.a("【Homepage_PageLifeCycle】", "onViewStateRestored", "mCurrentFirstVisibleItemPosition: " + f20593a + "mCurrentFirstVisibleItemOffset: " + b);
    }
}
