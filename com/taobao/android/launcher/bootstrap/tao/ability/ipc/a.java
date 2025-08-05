package com.taobao.android.launcher.bootstrap.tao.ability.ipc;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static b f13074a;

    /* renamed from: com.taobao.android.launcher.bootstrap.tao.ability.ipc.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC0506a {
        Context a();

        Intent a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter);

        Intent a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i);

        Intent a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler);

        Intent a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public interface b {
        Intent a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter);

        Intent a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i);

        void a();
    }

    /* loaded from: classes5.dex */
    public interface c {
        InterfaceC0506a getContext();
    }

    public static void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32e246fb", new Object[]{cVar});
        } else {
            f13074a = IPCKnifeImpl.a(cVar.getContext());
        }
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        b bVar = f13074a;
        if (bVar == null) {
            throw new IllegalStateException("IPCKnife is not initialized");
        }
        bVar.a();
    }

    public static Intent a(c cVar, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("39838081", new Object[]{cVar, broadcastReceiver, intentFilter, new Integer(i)});
        }
        b bVar = f13074a;
        if (bVar == null) {
            return cVar.getContext().a(broadcastReceiver, intentFilter, i);
        }
        return bVar.a(broadcastReceiver, intentFilter, i);
    }

    public static Intent a(c cVar, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("7f0bd522", new Object[]{cVar, broadcastReceiver, intentFilter});
        }
        b bVar = f13074a;
        if (bVar == null) {
            return cVar.getContext().a(broadcastReceiver, intentFilter);
        }
        return bVar.a(broadcastReceiver, intentFilter);
    }
}
