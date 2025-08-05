package com.taobao.homepage.utils;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.address.WeexPopContainer;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.android.speed.TBSpeed;
import com.taobao.homepage.utils.j;
import com.taobao.taobao.R;
import java.util.HashMap;
import tb.kge;
import tb.lbq;
import tb.oiy;
import tb.oob;

/* loaded from: classes7.dex */
public class j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: com.taobao.homepage.utils.j$1  reason: invalid class name */
    /* loaded from: classes7.dex */
    public static class AnonymousClass1 implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f17290a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ a c;
        public final /* synthetic */ long d;
        public final /* synthetic */ com.taobao.homepage.view.widgets.a e;

        /* renamed from: com.taobao.homepage.utils.j$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes7.dex */
        public class RunnableC06631 implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public RunnableC06631() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                oob.a("Page_Home", 19999, "tb_start_opt", new HashMap<String, String>() { // from class: com.taobao.homepage.utils.HomeOptimizeUtils$1$1$1
                    {
                        j.AnonymousClass1.RunnableC06631.this = this;
                        put("forec_excute_duration", String.valueOf(System.currentTimeMillis() - j.AnonymousClass1.this.f17290a));
                        put(WeexPopContainer.PARAMS_SHOW_LOADING, String.valueOf(j.AnonymousClass1.this.b));
                    }
                });
                if (AnonymousClass1.this.c != null) {
                    com.taobao.android.home.component.utils.e.e("Home_OptLoading", "executeLauncherTask finish = " + (SystemClock.uptimeMillis() - AnonymousClass1.this.d));
                    AnonymousClass1.this.c.a();
                }
                try {
                    if (AnonymousClass1.this.e == null) {
                        return;
                    }
                    AnonymousClass1.this.e.dismiss();
                } catch (Throwable th) {
                    com.taobao.android.home.component.utils.e.e("Home_OptLoading", "loadingDialog error " + th.getMessage());
                }
            }
        }

        public AnonymousClass1(long j, boolean z, a aVar, long j2, com.taobao.homepage.view.widgets.a aVar2) {
            this.f17290a = j;
            this.b = z;
            this.c = aVar;
            this.d = j2;
            this.e = aVar2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            LauncherRuntime.c();
            new Handler(Looper.getMainLooper()).post(new RunnableC06631());
        }
    }

    /* loaded from: classes7.dex */
    public interface a {
        void a();
    }

    static {
        kge.a(-561594807);
    }

    private static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{context})).booleanValue();
        }
        boolean isSpeedEdition = TBSpeed.isSpeedEdition(context, "tb_start_direct_pass");
        com.taobao.android.home.component.utils.e.e("Home_OptLoading", "needDirectPass = " + isSpeedEdition);
        return isSpeedEdition;
    }

    public static void a(Context context, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c047f0e6", new Object[]{context, aVar});
        } else {
            a(context, aVar, true);
        }
    }

    public static void a(Context context, a aVar, boolean z) {
        com.taobao.homepage.view.widgets.a aVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48b6deae", new Object[]{context, aVar, new Boolean(z)});
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (!com.taobao.android.home.component.utils.j.a("enableHomePageJumpToNextPageCostOpt", true) && b(context)) {
            if (aVar == null) {
                return;
            }
            com.taobao.android.home.component.utils.e.e("Home_OptLoading", "executeLauncherTask needDirectPass = " + (SystemClock.uptimeMillis() - uptimeMillis));
            aVar.a();
        } else if (LauncherRuntime.b()) {
            if (aVar == null) {
                return;
            }
            com.taobao.android.home.component.utils.e.e("Home_OptLoading", "executeLauncherTask isEnforceStageExecuted = " + (SystemClock.uptimeMillis() - uptimeMillis));
            aVar.a();
        } else {
            com.taobao.android.home.component.utils.e.e("Home_OptLoading", "executeLauncherTask showLoading = " + z);
            if (z) {
                lbq b = oiy.a().b();
                if (b == null) {
                    com.taobao.android.home.component.utils.e.e("Home_OptLoading", "IPageProvider is null");
                    return;
                }
                Activity curActivity = b.getCurActivity();
                if (curActivity == null) {
                    com.taobao.android.home.component.utils.e.e("Home_OptLoading", "Activity is null ");
                    return;
                }
                com.taobao.homepage.view.widgets.a aVar3 = new com.taobao.homepage.view.widgets.a(curActivity, R.style.Dialog_Status_Container);
                aVar3.setContentView(View.inflate(curActivity, R.layout.homepage_dialog_loading, null));
                aVar3.setCancelable(false);
                aVar3.setCanceledOnTouchOutside(false);
                aVar3.a();
                aVar3.show();
                aVar2 = aVar3;
            } else {
                aVar2 = null;
            }
            new Thread(new AnonymousClass1(System.currentTimeMillis(), z, aVar, uptimeMillis, aVar2), "AddTimingLogThread").start();
        }
    }
}
