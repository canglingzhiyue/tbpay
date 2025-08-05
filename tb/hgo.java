package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.g;
import com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.j;
import com.taobao.android.live.plugin.atype.flexalocal.comments.notify.b;
import com.taobao.android.live.plugin.atype.flexalocal.comments.notify.c;
import com.taobao.taolive.sdk.model.d;
import com.taobao.taolive.sdk.model.message.MessageTypeFilter;
import com.taobao.taolive.sdk.model.message.TopAtmosphereMessage;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public class hgo extends hgn implements c, d.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private b d;
    private ArrayList<TopAtmosphereMessage> e;
    private g f;
    private a g;

    static {
        kge.a(-2121018740);
        kge.a(-69219860);
        kge.a(-2101054629);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.notify.c
    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        return 4;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.notify.c
    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public static /* synthetic */ b a(hgo hgoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("2c209dee", new Object[]{hgoVar}) : hgoVar.d;
    }

    public static /* synthetic */ ArrayList b(hgo hgoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("8d8a6563", new Object[]{hgoVar}) : hgoVar.e;
    }

    public hgo(b bVar, phq phqVar, boolean z) {
        this.d = bVar;
        this.g = phqVar;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.notify.c
    public void a() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.e = new ArrayList<>();
        this.f = new g(this.d.e().getContext(), this.d.e(), this.f28623a, this.b, this.g);
        this.c = new j.a(this.f);
        b bVar = this.d;
        if (bVar == null) {
            return;
        }
        boolean z2 = bVar.c() != null;
        if (this.d.c().f() != null) {
            z = true;
        }
        if (!z2 || !z) {
            return;
        }
        this.d.c().f().registerMessageListener(this, new MessageTypeFilter() { // from class: tb.hgo.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.model.message.MessageTypeFilter
            public boolean filter(int i) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("c81f1ee8", new Object[]{this, new Integer(i)})).booleanValue() : i == 1044;
            }
        });
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.notify.c
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.e.size() > 0) {
            a(this.e.get(0));
            if (this.e.size() <= 0) {
                return;
            }
            this.e.remove(0);
        } else {
            this.d.b();
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.notify.c
    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        ArrayList<TopAtmosphereMessage> arrayList = this.e;
        return arrayList != null && arrayList.size() > 0;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.notify.c
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        ArrayList<TopAtmosphereMessage> arrayList = this.e;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.d.c().f().unRegisterMessageListener(this);
    }

    @Override // com.taobao.taolive.sdk.core.c
    public void onMessageReceived(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b152aef", new Object[]{this, new Integer(i), obj});
        } else if (i != 1044 || !(obj instanceof TopAtmosphereMessage)) {
        } else {
            final TopAtmosphereMessage topAtmosphereMessage = (TopAtmosphereMessage) obj;
            this.d.d().post(new Runnable() { // from class: tb.hgo.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (hgo.a(hgo.this).a((c) hgo.this)) {
                        hgo.b(hgo.this).clear();
                        hgo.b(hgo.this).add(topAtmosphereMessage);
                    } else if (hgo.this.g()) {
                        hgo.this.a(topAtmosphereMessage);
                        plx.a("SubBrandHotEventController", "reset comment msg");
                    } else {
                        hgo.b(hgo.this).add(topAtmosphereMessage);
                        hgo.a(hgo.this).a();
                        plx.a("SubBrandHotEventController", "start comment msg");
                    }
                }
            });
        }
    }

    @Override // tb.hgn
    public void a(TopAtmosphereMessage.TopAtmosphereMessageType topAtmosphereMessageType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("caa1c590", new Object[]{this, topAtmosphereMessageType});
            return;
        }
        h();
        this.d.b();
    }
}
