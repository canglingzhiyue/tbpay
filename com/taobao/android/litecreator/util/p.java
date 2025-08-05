package com.taobao.android.litecreator.util;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.framework.container.loading.LoadingDialog;
import com.taobao.android.litecreator.sdk.framework.container.loading.b;
import tb.kge;

/* loaded from: classes5.dex */
public class p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1725145186);
    }

    public static /* synthetic */ void b(FragmentActivity fragmentActivity, com.taobao.android.litecreator.sdk.framework.container.loading.b bVar, String str, b.InterfaceC0519b interfaceC0519b) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a11ba696", new Object[]{fragmentActivity, bVar, str, interfaceC0519b});
        } else {
            c(fragmentActivity, bVar, str, interfaceC0519b);
        }
    }

    public static /* synthetic */ void c(FragmentActivity fragmentActivity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("850fae83", new Object[]{fragmentActivity, str});
        } else {
            d(fragmentActivity, str);
        }
    }

    public static void a(FragmentActivity fragmentActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("831e55bb", new Object[]{fragmentActivity});
        } else {
            a(fragmentActivity, com.taobao.android.litecreator.sdk.framework.container.loading.b.f13450a, "lc_common_loading_fragment", null);
        }
    }

    public static void a(FragmentActivity fragmentActivity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("884da6c5", new Object[]{fragmentActivity, str});
        } else {
            a(fragmentActivity, com.taobao.android.litecreator.sdk.framework.container.loading.b.f13450a, str, null);
        }
    }

    public static void a(FragmentActivity fragmentActivity, com.taobao.android.litecreator.sdk.framework.container.loading.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9535cef3", new Object[]{fragmentActivity, bVar});
        } else {
            a(fragmentActivity, bVar, "lc_common_loading_fragment", null);
        }
    }

    public static void a(final FragmentActivity fragmentActivity, final com.taobao.android.litecreator.sdk.framework.container.loading.b bVar, final String str, final b.InterfaceC0519b interfaceC0519b) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5aa435f7", new Object[]{fragmentActivity, bVar, str, interfaceC0519b});
        } else {
            au.a(new Runnable() { // from class: com.taobao.android.litecreator.util.p.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        av.a(new Runnable() { // from class: com.taobao.android.litecreator.util.p.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                } else {
                                    p.b(FragmentActivity.this, bVar, str, interfaceC0519b);
                                }
                            }
                        });
                    }
                }
            });
        }
    }

    public static void b(FragmentActivity fragmentActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c95e35a", new Object[]{fragmentActivity});
        } else {
            b(fragmentActivity, "lc_common_loading_fragment");
        }
    }

    public static void b(final FragmentActivity fragmentActivity, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6aeaaa4", new Object[]{fragmentActivity, str});
        } else {
            au.c(new Runnable() { // from class: com.taobao.android.litecreator.util.p.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        av.a(new Runnable() { // from class: com.taobao.android.litecreator.util.p.2.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                } else {
                                    p.c(FragmentActivity.this, str);
                                }
                            }
                        });
                    }
                }
            });
        }
    }

    public static boolean e(FragmentActivity fragmentActivity, String str) {
        Fragment findFragmentByTag;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("81d1b645", new Object[]{fragmentActivity, str})).booleanValue() : (fragmentActivity == null || (findFragmentByTag = fragmentActivity.getSupportFragmentManager().findFragmentByTag(str)) == null || !findFragmentByTag.isVisible()) ? false : true;
    }

    private static void c(FragmentActivity fragmentActivity, com.taobao.android.litecreator.sdk.framework.container.loading.b bVar, String str, b.InterfaceC0519b interfaceC0519b) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7931735", new Object[]{fragmentActivity, bVar, str, interfaceC0519b});
            return;
        }
        LoadingDialog loadingDialog = (LoadingDialog) fragmentActivity.getSupportFragmentManager().findFragmentByTag(str);
        if (loadingDialog == null) {
            loadingDialog = new LoadingDialog();
        }
        loadingDialog.setConfig(bVar);
        loadingDialog.setCallback(interfaceC0519b);
        if (loadingDialog.isAdded() || fragmentActivity.isFinishing()) {
            return;
        }
        loadingDialog.show(fragmentActivity.getSupportFragmentManager(), str);
    }

    private static void d(FragmentActivity fragmentActivity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("370b262", new Object[]{fragmentActivity, str});
            return;
        }
        LoadingDialog loadingDialog = (LoadingDialog) fragmentActivity.getSupportFragmentManager().findFragmentByTag(str);
        if (loadingDialog == null) {
            return;
        }
        loadingDialog.dismissAllowingStateLoss();
    }
}
