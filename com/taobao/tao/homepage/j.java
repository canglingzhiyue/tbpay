package com.taobao.tao.homepage;

import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.topmultitab.protocol.IHomeSubTabController;
import tb.kge;
import tb.lap;
import tb.llf;
import tb.llg;

/* loaded from: classes8.dex */
public class j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1955078977);
    }

    public static boolean a(Fragment fragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2f0514e", new Object[]{fragment})).booleanValue() : !(fragment instanceof HomepageFragment);
    }

    public static void a(final int i, final int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{new Integer(i), new Integer(i2)});
        } else if (i < 0) {
            lap.a("【Homepage_PageLifeCycle】", "onResume", "出现异常，mCurrentFirstVisibleItemPosition < 0");
        } else {
            final IHomeSubTabController z = com.taobao.tao.topmultitab.c.a().z();
            if (z == null) {
                lap.a("【Homepage_PageLifeCycle】", "onResume", "出现异常，subTabController == null");
            } else {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.taobao.tao.homepage.j.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        IHomeSubTabController.this.scrollToPositionWithOffset(i, i2);
                        lap.a("【Homepage_PageLifeCycle】", "onResume", "偏移量为 ：" + i2 + "当前位置为：" + i);
                    }
                });
            }
        }
    }

    public static llf a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (llf) ipChange.ipc$dispatch("f075ef8", new Object[0]);
        }
        IHomeSubTabController z = com.taobao.tao.topmultitab.c.a().z();
        if (z == null) {
            lap.a("【Homepage_PageLifeCycle】", "onFragmentSaveInstanceState", "出现异常，subTabController == null");
            return null;
        }
        llg subTabParams = z.getSubTabParams();
        if (subTabParams == null) {
            lap.a("【Homepage_PageLifeCycle】", "onFragmentSaveInstanceState", "出现异常，subTabController == null");
            return null;
        }
        return subTabParams.a();
    }
}
