package com.taobao.tao.homepage;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.lap;
import tb.llf;

/* loaded from: classes8.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Integer f20585a;
    private static int b;
    private static int c;
    private static boolean d;

    static {
        kge.a(1180043220);
        Integer num = -2;
        f20585a = num;
        b = num.intValue();
    }

    public static void a(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f0514a", new Object[]{fragment});
            return;
        }
        lap.a("【Homepage_PageLifeCycle】", "onFragmentResumed_fold", "onFragmentResumed");
        if (j.a(fragment)) {
            return;
        }
        if (!d) {
            lap.a("【Homepage_PageLifeCycle】", "onFragmentResumed_fold", "不需要恢复");
            return;
        }
        j.a(b, c);
        d = false;
    }

    public static void a(Fragment fragment, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80cf6b4a", new Object[]{fragment, bundle});
        } else if (j.a(fragment)) {
        } else {
            if (bundle == null) {
                lap.a("【Homepage_PageLifeCycle】", "onViewStateRestored_fold", "savedInstanceState == null");
            } else {
                d = true;
            }
        }
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else {
            b();
        }
    }

    private static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
            return;
        }
        llf a2 = j.a();
        if (a2 == null) {
            lap.a("【Homepage_PageLifeCycle】", "saveFoldDeviceCurrentCardInfo_fold", "出现异常，mainFeedsParams == null");
            return;
        }
        lap.a("【Homepage_PageLifeCycle】", "saveFoldDeviceCurrentCardInfoOnPause_fold", "foldDevice local save local ");
        b = a2.a();
        c = a2.b();
        lap.a("【Homepage_PageLifeCycle】", "onFragmentSaveInstanceState_fold", "销毁时当前第一张卡片偏移量为：" + c + "销毁时当前第一张卡片位置为：" + b);
    }
}
