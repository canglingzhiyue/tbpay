package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.i;
import com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.j;
import com.taobao.taolive.sdk.model.message.TopAtmosphereMessage;

/* loaded from: classes5.dex */
public abstract class hgn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public i.b f28623a = new i.b() { // from class: tb.hgn.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.i.b
        public TopAtmosphereMessage a(TopAtmosphereMessage.TopAtmosphereMessageType topAtmosphereMessageType) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TopAtmosphereMessage) ipChange.ipc$dispatch("dcb5089a", new Object[]{this, topAtmosphereMessageType});
            }
            TopAtmosphereMessage topAtmosphereMessage = null;
            if (hgn.this.c != null) {
                topAtmosphereMessage = hgn.this.c.b;
            }
            plx.a("BaseSubEventController", "getMessage" + topAtmosphereMessage);
            return topAtmosphereMessage;
        }

        @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.i.b
        public TopAtmosphereMessage b(TopAtmosphereMessage.TopAtmosphereMessageType topAtmosphereMessageType) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TopAtmosphereMessage) ipChange.ipc$dispatch("16425a5b", new Object[]{this, topAtmosphereMessageType});
            }
            if (hgn.this.c == null) {
                return null;
            }
            TopAtmosphereMessage topAtmosphereMessage = hgn.this.c.b;
            hgn.this.c.b = null;
            plx.a("BaseSubEventController", "popMessage 置空" + topAtmosphereMessage);
            return topAtmosphereMessage;
        }
    };
    public i.c b = new i.c() { // from class: tb.hgn.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.i.c
        public void a(TopAtmosphereMessage.TopAtmosphereMessageType topAtmosphereMessageType) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("caa1c590", new Object[]{this, topAtmosphereMessageType});
            } else if (hgn.this.g()) {
            } else {
                if (hgn.this.c != null) {
                    hgn.this.c.b = null;
                    plx.a("BaseSubEventController", "onAnimationEnd 置空");
                }
                hgn.this.a(topAtmosphereMessageType);
            }
        }
    };
    public j.a c;

    static {
        kge.a(-1367913117);
    }

    public abstract void a(TopAtmosphereMessage.TopAtmosphereMessageType topAtmosphereMessageType);

    public boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : this.c.f13673a.a();
    }

    public void a(TopAtmosphereMessage topAtmosphereMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5985932", new Object[]{this, topAtmosphereMessage});
        } else if (topAtmosphereMessage == null || topAtmosphereMessage.data == null) {
        } else {
            if (topAtmosphereMessage.data.pushTime <= 0) {
                topAtmosphereMessage.data.pushTime = System.currentTimeMillis();
            }
            if (this.c == null) {
                return;
            }
            if (!g()) {
                plx.a("BaseSubEventController", "showTopAtmosphere + show" + topAtmosphereMessage.msgSubType);
                this.c.f13673a.a(topAtmosphereMessage);
                return;
            }
            this.c.b = topAtmosphereMessage;
            plx.a("BaseSubEventController", "showTopAtmosphere + 赋值" + topAtmosphereMessage);
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else if (!this.c.f13673a.a()) {
        } else {
            this.c.f13673a.b();
        }
    }
}
