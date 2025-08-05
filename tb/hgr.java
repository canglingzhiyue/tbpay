package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.f;
import com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.j;
import com.taobao.android.live.plugin.atype.flexalocal.comments.notify.ImportantEventFrame;
import com.taobao.android.live.plugin.atype.flexalocal.comments.notify.b;
import com.taobao.android.live.plugin.atype.flexalocal.comments.notify.c;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.model.message.TopAtmosphereMessage;
import com.taobao.taolive.sdk.utils.q;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public class hgr extends hgn implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private b d;
    private ArrayList<VideoInfo.AccountTag> e;
    private f f;
    private phq g;
    private boolean h;

    static {
        kge.a(115167427);
        kge.a(-69219860);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.notify.c
    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        return 10;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.notify.c
    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public hgr(b bVar, phq phqVar, boolean z) {
        this.d = bVar;
        this.g = phqVar;
        this.h = z;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.notify.c
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.e = new ArrayList<>();
        this.f = new f(this.d.e().getContext(), this.d.e(), this.f28623a, this.b, this.g);
        this.c = new j.a(this.f);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.notify.c
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.e.size() > 0) {
            VideoInfo.AccountTag accountTag = this.e.get(0);
            a(TopAtmosphereMessage.buildFromAccountTag(accountTag.title, accountTag.tagName, accountTag.tagIcon, accountTag.backgroundUrl));
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
        ArrayList<VideoInfo.AccountTag> arrayList = this.e;
        return arrayList != null && arrayList.size() > 0;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.notify.c
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        ArrayList<VideoInfo.AccountTag> arrayList = this.e;
        if (arrayList == null) {
            return;
        }
        arrayList.clear();
    }

    public void a(VideoInfo.AccountTag accountTag) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf5944fa", new Object[]{this, accountTag});
            return;
        }
        this.e.add(accountTag);
        if (this.h) {
            return;
        }
        this.d.a();
        q.b(ImportantEventFrame.TAG, "SubPersonalPeopleEventController updateAccountTag startConsumeMessage");
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
