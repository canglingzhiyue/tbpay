package com.taobao.android.layoutmanager.adapter.impl;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.revisionswitch.TBRevisionSwitchManager;
import com.taobao.android.revisionswitch.utils.LocationHelper;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.d;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.p;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import tb.ilw;
import tb.kge;
import tb.oeb;

/* loaded from: classes5.dex */
public class v extends com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private a f13149a;
    private Handler b = new Handler(Looper.getMainLooper()) { // from class: com.taobao.android.layoutmanager.adapter.impl.v.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            } else if (v.b(v.this) == null) {
            } else {
                a.a(v.b(v.this)).a();
                v.a();
            }
        }
    };

    static {
        kge.a(628730050);
    }

    public static /* synthetic */ Handler a(v vVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("993b4f3", new Object[]{vVar}) : vVar.b;
    }

    public static /* synthetic */ void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else {
            b();
        }
    }

    public static /* synthetic */ a b(v vVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("dd9d5740", new Object[]{vVar}) : vVar.f13149a;
    }

    /* loaded from: classes5.dex */
    public class a implements d.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private p.a b;

        static {
            kge.a(36270458);
            kge.a(-463399932);
        }

        public static /* synthetic */ p.a a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (p.a) ipChange.ipc$dispatch("df5e0966", new Object[]{aVar}) : aVar.b;
        }

        public a(p.a aVar) {
            this.b = aVar;
        }

        @Override // tb.omk
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            v.a(v.this).removeMessages(1);
            v.a(v.this).sendEmptyMessageDelayed(1, 500L);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.p
    public void a(final p.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2a2cdf8", new Object[]{this, aVar});
        } else if (aVar != null) {
            if (oeb.bE()) {
                this.f13149a = new a(aVar);
                com.taobao.tao.flexbox.layoutmanager.adapter.a.a().b().a(this.f13149a);
                return;
            }
            com.taobao.tao.flexbox.layoutmanager.adapter.a.a().b().a(new d.b() { // from class: com.taobao.android.layoutmanager.adapter.impl.v.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.omk
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    aVar.a();
                    v.a();
                }
            });
        } else {
            com.taobao.tao.flexbox.layoutmanager.adapter.a.a().b().a((d.b) null);
        }
    }

    private static void b() {
        com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.d b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
            return;
        }
        boolean c = LocationHelper.c(ab.a());
        boolean a2 = TBRevisionSwitchManager.i().a(ilw.KEY_NEW_DISCOVERY_ENABLE);
        if (!c || !a2 || !oeb.bD() || (b = com.taobao.tao.flexbox.layoutmanager.adapter.a.a().b()) == null) {
            return;
        }
        b.b(1);
    }
}
