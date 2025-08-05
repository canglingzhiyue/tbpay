package com.taobao.infoflow.taobao.subservice.framework.themeservice.impl.listener;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tbtheme.kit.b;
import com.taobao.android.tbtheme.kit.j;
import com.taobao.tao.Globals;
import tb.kge;
import tb.ldb;
import tb.ldf;

/* loaded from: classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private final InterfaceC0672a f17581a;
    private boolean b = false;
    private final BroadcastReceiver c = new BroadcastReceiver() { // from class: com.taobao.infoflow.taobao.subservice.framework.themeservice.impl.listener.TbGlobalThemeSubscriber$1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            String action = intent.getAction();
            ldf.b("TbGlobalThemeSubscriber", "onReceive " + action);
            if (!j.ACTION_THEME_CHANGE.equals(action) || !a.a(a.this)) {
                return;
            }
            a.b(a.this).a();
        }
    };

    /* renamed from: com.taobao.infoflow.taobao.subservice.framework.themeservice.impl.listener.a$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0672a {
        void a();
    }

    static {
        kge.a(1666699483);
    }

    public static /* synthetic */ boolean a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("88ae36df", new Object[]{aVar})).booleanValue() : aVar.b();
    }

    public static /* synthetic */ InterfaceC0672a b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (InterfaceC0672a) ipChange.ipc$dispatch("96bae50", new Object[]{aVar}) : aVar.f17581a;
    }

    public a(InterfaceC0672a interfaceC0672a) {
        this.f17581a = interfaceC0672a;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        b();
        b.a(true, this.c, j.ACTION_THEME_CHANGE);
        ldf.d("TbGlobalThemeSubscriber", "registerReceiver us time : " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            b.a(true, this.c);
        }
    }

    private boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        boolean a2 = ldb.a(Globals.getApplication());
        boolean z = a2 != this.b;
        if (z) {
            this.b = a2;
            ldf.b("TbGlobalThemeSubscriber", "isDarkMode change, value:  " + a2);
        }
        return z;
    }
}
