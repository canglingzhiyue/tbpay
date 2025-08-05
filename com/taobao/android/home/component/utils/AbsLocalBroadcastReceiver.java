package com.taobao.android.home.component.utils;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import tb.kge;

/* loaded from: classes5.dex */
public abstract class AbsLocalBroadcastReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(122205194);
    }

    public abstract IntentFilter c();

    public AbsLocalBroadcastReceiver(View view) {
        view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.taobao.android.home.component.utils.AbsLocalBroadcastReceiver.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3d337638", new Object[]{this, view2});
                } else {
                    AbsLocalBroadcastReceiver.this.a();
                }
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("7f64d55b", new Object[]{this, view2});
                } else {
                    AbsLocalBroadcastReceiver.this.b();
                }
            }
        });
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            LocalBroadcastManager.getInstance(Globals.getApplication()).registerReceiver(this, c());
        }
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            LocalBroadcastManager.getInstance(Globals.getApplication()).unregisterReceiver(this);
        }
    }
}
