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
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.core.interfaces.ISmallWindowStrategy;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;
import tb.ddv;
import tb.ddw;
import tb.kge;

/* loaded from: classes8.dex */
public class m implements d, ddv {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private FrameLayout b;
    private final Deque<JSONObject> c = new ArrayDeque();
    private long d = 0;

    /* renamed from: a  reason: collision with root package name */
    private Deque<d> f21603a = new ArrayDeque();

    static {
        kge.a(-1383469702);
        kge.a(61413594);
        kge.a(191318335);
    }

    @Override // tb.ddv
    public String bizCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("36951559", new Object[]{this}) : "TaoliveStackManager";
    }

    public m(Activity activity, Intent intent) {
        h hVar = new h(activity, intent);
        a(activity);
        a(hVar);
        ddw.a().a(this);
    }

    private d l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("397b2b9", new Object[]{this});
        }
        Deque<d> deque = this.f21603a;
        if (deque == null) {
            return null;
        }
        return deque.getFirst();
    }

    private void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6de040ae", new Object[]{this, dVar});
            return;
        }
        Deque<d> deque = this.f21603a;
        if (deque == null || dVar == null) {
            return;
        }
        deque.push(dVar);
        FrameLayout frameLayout = this.b;
        if (frameLayout == null) {
            return;
        }
        frameLayout.removeAllViews();
        this.b.addView(dVar.a());
    }

    private View a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("876fa4a2", new Object[]{this, context});
        }
        this.b = new FrameLayout(context);
        this.b.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return this.b;
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        } else if (!(l() instanceof h)) {
        } else {
            ((h) l()).k();
        }
    }

    @Override // com.taobao.taolive.room.controller2.d
    public ViewGroup a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("8c7138ad", new Object[]{this}) : this.b;
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void a(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7931bad1", new Object[]{this, onClickListener});
        } else if (l() == null) {
        } else {
            l().a(onClickListener);
        }
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void b(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d04fabb0", new Object[]{this, onClickListener});
        } else if (l() == null) {
        } else {
            l().b(onClickListener);
        }
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void a(ISmallWindowStrategy iSmallWindowStrategy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa4d14aa", new Object[]{this, iSmallWindowStrategy});
        } else if (l() == null) {
        } else {
            l().a(iSmallWindowStrategy);
        }
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void onConfigurationChanged(Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb2f300c", new Object[]{this, configuration});
        } else if (l() == null) {
        } else {
            l().onConfigurationChanged(configuration);
        }
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (l() == null) {
        } else {
            l().b();
        }
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        } else if (l() == null) {
        } else {
            l().onResume();
        }
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        } else if (l() == null) {
        } else {
            l().onPause();
        }
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b25ee726", new Object[]{this, new Boolean(z)});
        } else if (l() == null) {
        } else {
            l().g(z);
        }
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        } else {
            g(true);
        }
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        if (l() != null) {
            l().onDestroy();
        }
        Deque<JSONObject> deque = this.c;
        if (deque != null) {
            deque.clear();
        }
        ddw.a().b(this);
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (l() == null) {
        } else {
            l().c();
        }
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (l() == null) {
        } else {
            l().d();
        }
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (l() == null) {
        } else {
            l().a(i);
        }
    }

    @Override // com.taobao.taolive.room.controller2.d
    public Map<String, String> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bf3e1ee7", new Object[]{this, str});
        }
        if (l() == null) {
            return null;
        }
        return l().a(str);
    }

    @Override // com.taobao.taolive.room.controller2.d
    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        if (l() == null) {
            return false;
        }
        return l().e();
    }

    @Override // com.taobao.taolive.room.controller2.d
    public boolean P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("47cdcdb", new Object[]{this})).booleanValue();
        }
        if (l() == null) {
            return false;
        }
        return l().P();
    }

    @Override // com.taobao.taolive.room.controller2.d
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        if (l() == null) {
            return false;
        }
        return l().onKeyDown(i, keyEvent);
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (l() == null) {
        } else {
            l().a(z);
        }
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (l() == null) {
        } else {
            l().f();
        }
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (l() == null) {
        } else {
            l().g();
        }
    }

    @Override // com.taobao.taolive.room.controller2.d
    public View b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("18d4778d", new Object[]{this, new Boolean(z)});
        }
        if (l() == null) {
            return null;
        }
        return l().b(z);
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void a(Intent intent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2864fb4f", new Object[]{this, intent, new Boolean(z)});
        } else if (l() == null) {
        } else {
            l().a(intent, z);
        }
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void a(Uri uri, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d32ee49f", new Object[]{this, uri, new Boolean(z), new Boolean(z2)});
        } else if (l() == null) {
        } else {
            l().a(uri, z, z2);
        }
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void a(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6de1296c", new Object[]{this, fVar});
        } else if (l() == null) {
        } else {
            l().a(fVar);
        }
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6de0b50d", new Object[]{this, eVar});
        } else if (l() == null) {
        } else {
            l().a(eVar);
        }
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void a(k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6de36f47", new Object[]{this, kVar});
        } else if (l() == null) {
        } else {
            l().a(kVar);
        }
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else if (l() == null) {
        } else {
            l().h();
        }
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else if (l() == null) {
        } else {
            l().i();
        }
    }

    @Override // com.taobao.taolive.room.controller2.d
    public com.taobao.taolive.sdk.controller.e j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.taolive.sdk.controller.e) ipChange.ipc$dispatch("c83a9807", new Object[]{this});
        }
        if (l() == null) {
            return null;
        }
        return l().j();
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void l(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bae72241", new Object[]{this, new Boolean(z)});
        } else if (l() == null) {
        } else {
            l().l(z);
        }
    }

    @Override // tb.ddv
    public void onEvent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
            return;
        }
        try {
            com.taobao.taolive.sdk.controller.e j = j();
            if ("com.taobao.taolive.room.backward.data.stack.push".equals(str)) {
                if (obj instanceof JSONObject) {
                    this.c.push((JSONObject) obj);
                }
                j.a(this.c);
            } else if ("com.taobao.taolive.room.backward.data.stack.pop".equals(str)) {
                if (this.c.size() > 0) {
                    this.c.pop();
                }
                j.a(this.c);
            } else if ("com.taobao.taolive.room.backward.data.stack.clear".equals(str)) {
                this.c.clear();
                j.a((Deque<JSONObject>) null);
                this.d = 0L;
                j.a(this.d);
            } else if ("com.taobao.taolive.room.backward.data.stack.get.top".equals(str)) {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                Deque<JSONObject> l = j.l();
                jSONObject2.putAll(j.k());
                jSONObject.put("lastRoomInfo", (Object) jSONObject2);
                jSONObject.put("backwardStack", (Object) l);
                ddw.a().a("com.taobao.taolive.room.backward.data.stack.get.top.result", jSONObject);
            } else if ("com.taobao.taolive.room.backward.data.stack.sync.to.top".equals(str)) {
                if (!(obj instanceof JSONObject) || !(((JSONObject) obj).get("lastRoomInfo") instanceof JSONObject) || !(((JSONObject) obj).get("backwardStack") instanceof Deque)) {
                    return;
                }
                j.a((JSONObject) ((JSONObject) obj).get("lastRoomInfo"));
                j.a((Deque) ((JSONObject) obj).get("backwardStack"));
            } else if (!"com.taobao.taolive.room.backward.data.stack.count.time".equals(str) || !(obj instanceof String)) {
            } else {
                try {
                    this.d = Long.parseLong((String) obj);
                    j.a(this.d);
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // tb.ddv
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this}) : new String[]{"com.taobao.taolive.room.backward.data.stack.push", "com.taobao.taolive.room.backward.data.stack.pop", "com.taobao.taolive.room.backward.data.stack.clear", "com.taobao.taolive.room.backward.data.stack.get.top", "com.taobao.taolive.room.backward.data.stack.get.top.result", "com.taobao.taolive.room.backward.data.stack.sync.to.top", "com.taobao.taolive.room.backward.data.stack.count.time"};
    }

    @Override // tb.ddv
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this});
        }
        if (com.taobao.taolive.room.utils.n.a() != null) {
            return com.taobao.taolive.room.utils.n.a().G();
        }
        return null;
    }

    @Override // com.taobao.taolive.room.controller2.d
    public String M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2d8450cc", new Object[]{this});
        }
        if (l() == null) {
            return null;
        }
        return l().M();
    }

    @Override // com.taobao.taolive.room.controller2.d
    public boolean O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("46ec55a", new Object[]{this})).booleanValue();
        }
        if (l() == null) {
            return false;
        }
        return l().O();
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void m(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc9bfae0", new Object[]{this, new Boolean(z)});
        } else if (l() == null) {
        } else {
            l().m(z);
        }
    }

    @Override // com.taobao.taolive.room.controller2.d
    public RecyclerView N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("7e9dd54f", new Object[]{this});
        }
        if (l() == null) {
            return null;
        }
        return l().N();
    }
}
