package com.taobao.android.behavir.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import com.alibaba.poplayer.PopLayer;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.bhxbridge.BHXCXXBaseBridge;
import com.taobao.android.ucp.bridge.NativeBroadcast;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile boolean f9157a;
    private static final h b;
    private List<Runnable> c = new ArrayList(8);

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        }
    }

    static {
        kge.a(1619251468);
        f9157a = false;
        b = new h();
    }

    private h() {
        LocalBroadcastManager.getInstance(com.taobao.android.behavix.d.b()).registerReceiver(new BroadcastReceiver() { // from class: com.taobao.android.behavir.util.PopStateMonitor$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                } else {
                    h.this.d();
                }
            }
        }, new IntentFilter(PopLayer.ACTION_BROADCAST_ACTION_FIRST_PAGE_READY));
    }

    public static h b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (h) ipChange.ipc$dispatch("35391700", new Object[0]) : b;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : f9157a;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        if (!BHXCXXBaseBridge.checkCXXLib()) {
            UtUtils.a("UCP", UtUtils.a(), TLogTracker.SCENE_EXCEPTION, "PopStateMonitor", "soNotLoad", "");
        }
        f9157a = true;
        NativeBroadcast.sendMessageFromJava(PopLayer.ACTION_BROADCAST_ACTION_FIRST_PAGE_READY, null, null);
        if (this.c == null) {
            return;
        }
        synchronized (h.class) {
            List<Runnable> list = this.c;
            this.c = null;
            for (Runnable runnable : list) {
                if (runnable != null) {
                    try {
                        runnable.run();
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }
}
