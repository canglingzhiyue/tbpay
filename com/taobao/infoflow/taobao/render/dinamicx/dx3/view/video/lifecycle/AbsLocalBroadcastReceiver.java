package com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.lifecycle;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import tb.kge;

/* loaded from: classes7.dex */
public abstract class AbsLocalBroadcastReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1179130098);
    }

    public abstract IntentFilter a();

    public AbsLocalBroadcastReceiver(View view) {
        view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.lifecycle.AbsLocalBroadcastReceiver.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3d337638", new Object[]{this, view2});
                } else {
                    AbsLocalBroadcastReceiver.this.b();
                }
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("7f64d55b", new Object[]{this, view2});
                } else {
                    AbsLocalBroadcastReceiver.this.c();
                }
            }
        });
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            LocalBroadcastManager.getInstance(Globals.getApplication()).registerReceiver(this, a());
        }
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            LocalBroadcastManager.getInstance(Globals.getApplication()).unregisterReceiver(this);
        }
    }
}
