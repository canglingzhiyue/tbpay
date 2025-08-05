package com.taobao.taobao.scancode.barcode.util;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.scancode.gateway.util.m;
import com.taobao.taobao.scancode.huoyan.ui.KaDialogFragment;
import java.lang.ref.WeakReference;
import tb.kge;

/* loaded from: classes8.dex */
public class d implements m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final m f21229a;
    private WeakReference<Fragment> b;

    static {
        kge.a(1705254414);
        kge.a(1571819161);
    }

    public static /* synthetic */ WeakReference a(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeakReference) ipChange.ipc$dispatch("b5c6ea", new Object[]{dVar}) : dVar.b;
    }

    public static /* synthetic */ WeakReference a(d dVar, WeakReference weakReference) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeakReference) ipChange.ipc$dispatch("6a321d0", new Object[]{dVar, weakReference});
        }
        dVar.b = weakReference;
        return weakReference;
    }

    public d(m mVar) {
        this.f21229a = mVar;
    }

    public void a(FragmentActivity fragmentActivity, final KaDialogFragment kaDialogFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85509c7b", new Object[]{this, fragmentActivity, kaDialogFragment, str});
        } else {
            a(fragmentActivity, kaDialogFragment, str, new com.taobao.taobao.scancode.huoyan.ui.a() { // from class: com.taobao.taobao.scancode.barcode.util.d.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.taobao.scancode.huoyan.ui.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    try {
                        if (d.a(d.this) != null) {
                            if (d.a(d.this).get() != kaDialogFragment) {
                                return;
                            }
                        }
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                    d.this.startPreview();
                }

                @Override // com.taobao.taobao.scancode.huoyan.ui.a
                public void b() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                    } else {
                        d.this.startPreview();
                    }
                }
            });
        }
    }

    public void a(final FragmentActivity fragmentActivity, final KaDialogFragment kaDialogFragment, final String str, final com.taobao.taobao.scancode.huoyan.ui.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bff73ab0", new Object[]{this, fragmentActivity, kaDialogFragment, str, aVar});
        } else if (fragmentActivity == null || kaDialogFragment == null) {
        } else {
            fragmentActivity.runOnUiThread(new Runnable() { // from class: com.taobao.taobao.scancode.barcode.util.d.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    FragmentActivity fragmentActivity2 = fragmentActivity;
                    if (fragmentActivity2 == null) {
                        return;
                    }
                    d.this.a(fragmentActivity2, str);
                    d.this.stopPreview();
                    d.a(d.this, new WeakReference(kaDialogFragment));
                    kaDialogFragment.setKaCallback(aVar);
                    kaDialogFragment.show(fragmentActivity.getSupportFragmentManager(), str);
                }
            });
        }
    }

    public void a(FragmentActivity fragmentActivity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("884da6c5", new Object[]{this, fragmentActivity, str});
        } else if (fragmentActivity == null || str == null) {
        } else {
            FragmentTransaction beginTransaction = fragmentActivity.getSupportFragmentManager().beginTransaction();
            Fragment findFragmentByTag = fragmentActivity.getSupportFragmentManager().findFragmentByTag(str);
            if (findFragmentByTag == null) {
                return;
            }
            String str2 = "#####find dialog" + str;
            beginTransaction.remove(findFragmentByTag);
            beginTransaction.commitAllowingStateLoss();
        }
    }

    @Override // com.taobao.taobao.scancode.gateway.util.m
    public void startPreview() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a34f68d", new Object[]{this});
            return;
        }
        m mVar = this.f21229a;
        if (mVar == null) {
            return;
        }
        mVar.startPreview();
    }

    @Override // com.taobao.taobao.scancode.gateway.util.m
    public void stopPreview() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f92eed", new Object[]{this});
            return;
        }
        m mVar = this.f21229a;
        if (mVar == null) {
            return;
        }
        mVar.stopPreview();
    }
}
