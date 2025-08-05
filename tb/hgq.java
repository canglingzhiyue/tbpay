package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.h;
import com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.j;
import com.taobao.android.live.plugin.atype.flexalocal.comments.notify.b;
import com.taobao.android.live.plugin.atype.flexalocal.comments.notify.c;
import com.taobao.taolive.sdk.model.d;
import com.taobao.taolive.sdk.model.message.CommentCountMessage;
import com.taobao.taolive.sdk.model.message.MessageTypeFilter;
import com.taobao.taolive.sdk.model.message.TopAtmosphereMessage;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public class hgq extends hgn implements c, d.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private b d;
    private ArrayList<TopAtmosphereMessage> e;
    private h f;
    private com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.b g;
    private phq h;

    static {
        kge.a(1538987221);
        kge.a(-69219860);
        kge.a(-2101054629);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.notify.c
    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        return 0;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.notify.c
    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public static /* synthetic */ b a(hgq hgqVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("9de15f2c", new Object[]{hgqVar}) : hgqVar.d;
    }

    public static /* synthetic */ ArrayList b(hgq hgqVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("858d8321", new Object[]{hgqVar}) : hgqVar.e;
    }

    public hgq(b bVar, phq phqVar, boolean z) {
        this.d = bVar;
        this.h = phqVar;
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
        this.g = new com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.b(this.h, this.d.e().getContext());
        this.g.a();
        this.f = new h(this.d.e().getContext(), this.d.e(), this.f28623a, this.b, this.g, this.h);
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
        this.d.c().f().registerMessageListener(this, new MessageTypeFilter() { // from class: tb.hgq.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.model.message.MessageTypeFilter
            public boolean filter(int i) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("c81f1ee8", new Object[]{this, new Integer(i)})).booleanValue() : i == 1043;
            }
        });
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.notify.c
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        plx.a("SubEveryBodySaysEventController", "resumeMessage:" + this.e.size());
        if (this.e.size() > 0) {
            a(this.e.get(0));
            if (this.e.size() <= 0) {
                return;
            }
            this.e.remove(0);
            return;
        }
        this.d.b();
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
        this.d.c().f().unRegisterMessageListener(this);
        this.g.b();
        ArrayList<TopAtmosphereMessage> arrayList = this.e;
        if (arrayList == null) {
            return;
        }
        arrayList.clear();
    }

    @Override // com.taobao.taolive.sdk.core.c
    public void onMessageReceived(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b152aef", new Object[]{this, new Integer(i), obj});
        } else if (i != 1043 || com.taobao.android.live.plugin.atype.flexalocal.comments.chat.b.i() || !(obj instanceof CommentCountMessage)) {
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("receive comment msg ");
            CommentCountMessage commentCountMessage = (CommentCountMessage) obj;
            sb.append(commentCountMessage.data.content);
            sb.append(" ");
            sb.append(commentCountMessage.data.countShow);
            plx.a("SubEveryBodySaysEventController", sb.toString());
            if (!"commentCount".equals(commentCountMessage.type)) {
                return;
            }
            final TopAtmosphereMessage buildFromCommentCountMessage = TopAtmosphereMessage.buildFromCommentCountMessage(commentCountMessage);
            plx.a("SubEveryBodySaysEventController", "receive comment msg" + commentCountMessage.data.content);
            this.d.d().post(new Runnable() { // from class: tb.hgq.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (hgq.a(hgq.this).a((c) hgq.this)) {
                        hgq.b(hgq.this).clear();
                        hgq.b(hgq.this).add(buildFromCommentCountMessage);
                    } else if (!hgq.this.g()) {
                        hgq.b(hgq.this).clear();
                        hgq.b(hgq.this).add(buildFromCommentCountMessage);
                        hgq.a(hgq.this).a();
                        plx.a("SubEveryBodySaysEventController", "start comment msg");
                    } else {
                        hgq.this.a(buildFromCommentCountMessage);
                        plx.a("SubEveryBodySaysEventController", "reset comment msg：" + buildFromCommentCountMessage.data.getCountShow());
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
        plx.a("SubEveryBodySaysEventController", "playOnAnimationEnd");
    }
}
