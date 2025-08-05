package com.taobao.taolive.room.controller2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.core.interfaces.ISmallWindowStrategy;
import java.util.Map;
import tb.kge;
import tb.pla;

/* loaded from: classes8.dex */
public class h implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private d f21594a;

    static {
        kge.a(1840305121);
        kge.a(61413594);
    }

    public h(Activity activity, String str, pla plaVar) {
        this.f21594a = p.a(activity, str, plaVar);
    }

    public h(Activity activity, Intent intent) {
        this.f21594a = p.a(activity, intent);
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        } else {
            this.f21594a.k();
        }
    }

    @Override // com.taobao.taolive.room.controller2.d
    public ViewGroup a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("8c7138ad", new Object[]{this}) : this.f21594a.a();
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void a(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7931bad1", new Object[]{this, onClickListener});
        } else {
            this.f21594a.a(onClickListener);
        }
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void b(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d04fabb0", new Object[]{this, onClickListener});
        } else {
            this.f21594a.b(onClickListener);
        }
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void a(ISmallWindowStrategy iSmallWindowStrategy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa4d14aa", new Object[]{this, iSmallWindowStrategy});
        } else {
            this.f21594a.a(iSmallWindowStrategy);
        }
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void onConfigurationChanged(Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb2f300c", new Object[]{this, configuration});
        } else {
            this.f21594a.onConfigurationChanged(configuration);
        }
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.f21594a.b();
        }
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        } else {
            this.f21594a.onResume();
        }
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        } else {
            this.f21594a.onPause();
        }
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b25ee726", new Object[]{this, new Boolean(z)});
        } else {
            this.f21594a.g(z);
        }
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        } else {
            this.f21594a.onStop();
        }
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            this.f21594a.onDestroy();
        }
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.f21594a.c();
        }
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            this.f21594a.d();
        }
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.f21594a.a(i);
        }
    }

    @Override // com.taobao.taolive.room.controller2.d
    public Map<String, String> a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("bf3e1ee7", new Object[]{this, str}) : this.f21594a.a(str);
    }

    @Override // com.taobao.taolive.room.controller2.d
    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : this.f21594a.e();
    }

    @Override // com.taobao.taolive.room.controller2.d
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue() : this.f21594a.onKeyDown(i, keyEvent);
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.f21594a.a(z);
        }
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else {
            this.f21594a.f();
        }
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else {
            this.f21594a.g();
        }
    }

    @Override // com.taobao.taolive.room.controller2.d
    public View b(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("18d4778d", new Object[]{this, new Boolean(z)}) : this.f21594a.b(z);
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void a(Intent intent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2864fb4f", new Object[]{this, intent, new Boolean(z)});
        } else {
            this.f21594a.a(intent, z);
        }
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void a(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6de1296c", new Object[]{this, fVar});
        } else {
            this.f21594a.a(fVar);
        }
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6de0b50d", new Object[]{this, eVar});
        } else {
            this.f21594a.a(eVar);
        }
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void a(k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6de36f47", new Object[]{this, kVar});
        } else {
            this.f21594a.a(kVar);
        }
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void l(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bae72241", new Object[]{this, new Boolean(z)});
        } else {
            this.f21594a.l(z);
        }
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else {
            this.f21594a.h();
        }
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else {
            this.f21594a.i();
        }
    }

    @Override // com.taobao.taolive.room.controller2.d
    public com.taobao.taolive.sdk.controller.e j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.taolive.sdk.controller.e) ipChange.ipc$dispatch("c83a9807", new Object[]{this}) : this.f21594a.j();
    }

    @Override // com.taobao.taolive.room.controller2.d
    public boolean P() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("47cdcdb", new Object[]{this})).booleanValue() : this.f21594a.P();
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void a(Uri uri, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d32ee49f", new Object[]{this, uri, new Boolean(z), new Boolean(z2)});
        } else {
            this.f21594a.a(uri, z, z2);
        }
    }

    @Override // com.taobao.taolive.room.controller2.d
    public String M() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2d8450cc", new Object[]{this}) : this.f21594a.M();
    }

    @Override // com.taobao.taolive.room.controller2.d
    public boolean O() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("46ec55a", new Object[]{this})).booleanValue() : this.f21594a.O();
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void m(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc9bfae0", new Object[]{this, new Boolean(z)});
        } else {
            this.f21594a.m(z);
        }
    }

    @Override // com.taobao.taolive.room.controller2.d
    public RecyclerView N() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView) ipChange.ipc$dispatch("7e9dd54f", new Object[]{this}) : this.f21594a.N();
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            return;
        }
        com.taobao.android.live.plugin.proxy.e.a().a(com.taobao.android.live.plugin.proxy.e.ATYPE, false, context);
        com.taobao.android.live.plugin.proxy.e.a().a(com.taobao.android.live.plugin.proxy.e.BTYPE, false, context);
        com.taobao.android.live.plugin.proxy.f.m().setActionAdapter(new com.taobao.taolive.room.ui.goods.adapter.d());
        com.taobao.android.live.plugin.proxy.f.m().setNavAdapter(new com.taobao.taolive.room.ui.goods.adapter.e());
        com.taobao.android.live.plugin.proxy.f.m().setTrackAdapter(new com.taobao.taolive.room.ui.goods.adapter.f());
        com.taobao.android.live.plugin.proxy.f.m().setH5TabFrameAdapter(new com.taobao.taolive.room.ui.goods.adapter.c());
        com.taobao.android.live.plugin.proxy.f.m().setGoodFrameAdapter(new com.taobao.taolive.room.ui.goods.adapter.b());
    }
}
