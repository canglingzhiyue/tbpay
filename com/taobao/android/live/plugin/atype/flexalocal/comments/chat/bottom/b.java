package com.taobao.android.live.plugin.atype.flexalocal.comments.chat.bottom;

import android.os.Message;
import android.support.v4.util.Pools;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.utils.aw;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.f;
import com.taobao.taolive.sdk.model.message.ChatMessage;
import java.util.ArrayList;
import java.util.List;
import tb.ddv;
import tb.hfu;
import tb.hfv;
import tb.hfw;
import tb.hfy;
import tb.hgl;
import tb.kge;
import tb.ply;

/* loaded from: classes5.dex */
public class b implements d, com.taobao.taolive.sdk.model.a, ddv {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private BottomShowChatView c;
    private hfw d;
    private TBLiveDataModel f;
    private com.taobao.alilive.aliliveframework.frame.a i;
    private final com.taobao.android.live.plugin.atype.flexalocal.comments.chat.c j;
    private final hgl k;

    /* renamed from: a  reason: collision with root package name */
    private final int f13615a = 2000;
    private final int b = 1;
    private List<ChatMessage> e = new ArrayList();
    private final a g = new a();
    private f h = new f(this);

    static {
        kge.a(1021558689);
        kge.a(-168744462);
        kge.a(-1905361424);
        kge.a(191318335);
    }

    @Override // tb.ddv
    public String bizCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("36951559", new Object[]{this}) : "BottomShowChatViewImpl";
    }

    public static /* synthetic */ hfw a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (hfw) ipChange.ipc$dispatch("6c5b481c", new Object[]{bVar}) : bVar.d;
    }

    public static /* synthetic */ BottomShowChatView b(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BottomShowChatView) ipChange.ipc$dispatch("874d9a22", new Object[]{bVar}) : bVar.c;
    }

    public static /* synthetic */ com.taobao.alilive.aliliveframework.frame.a c(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.alilive.aliliveframework.frame.a) ipChange.ipc$dispatch("a9289c68", new Object[]{bVar}) : bVar.i;
    }

    public b(BottomShowChatView bottomShowChatView, hfw hfwVar, TBLiveDataModel tBLiveDataModel, com.taobao.alilive.aliliveframework.frame.a aVar, com.taobao.android.live.plugin.atype.flexalocal.comments.chat.c cVar, hgl hglVar) {
        this.c = bottomShowChatView;
        this.d = hfwVar;
        this.f = tBLiveDataModel;
        this.i = aVar;
        this.j = cVar;
        this.k = hglVar;
        d();
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.bottom.d
    public void a(ArrayList<ChatMessage> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfaf7e42", new Object[]{this, arrayList});
        } else if (arrayList != null && arrayList.size() > 0) {
            this.e.addAll(arrayList);
            for (int size = this.e.size() - ply.r(); size > 0; size--) {
                this.e.remove(0);
            }
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        com.taobao.alilive.aliliveframework.frame.a aVar = this.i;
        if (aVar == null || aVar.e() == null) {
            return;
        }
        this.i.e().a(this);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.bottom.d
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!this.j.a(com.taobao.android.live.plugin.atype.flexalocal.comments.chat.a.KEY_BOTTOM_ADAPTER_VIEW)) {
        } else {
            if (this.e.isEmpty()) {
                if (this.c.getVisibility() != 0 || this.h.hasMessages(1)) {
                    return;
                }
                this.h.sendEmptyMessageDelayed(1, 2000L);
            } else if (this.c.isAnimating()) {
            } else {
                ChatMessage remove = this.e.remove(0);
                if (remove == null) {
                    if (this.c.getVisibility() != 0 || this.h.hasMessages(1)) {
                        return;
                    }
                    this.h.sendEmptyMessageDelayed(1, 2000L);
                    return;
                }
                this.h.removeMessages(1);
                this.c.setVisibility(0);
                this.j.a(com.taobao.android.live.plugin.atype.flexalocal.comments.chat.a.KEY_BOTTOM_ADAPTER_VIEW, Boolean.TRUE);
                hfy a2 = this.g.a(remove);
                a2.a(remove, this.f);
                this.c.animate(a2, this.g);
                a(remove);
            }
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.bottom.d
    public View b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("639153eb", new Object[]{this}) : this.c;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.bottom.d
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        a.a(this.g).clear();
        com.taobao.alilive.aliliveframework.frame.a aVar = this.i;
        if (aVar == null || aVar.e() == null) {
            return;
        }
        this.i.e().b(this);
    }

    @Override // com.taobao.taolive.sdk.model.a
    public void handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            return;
        }
        int i = message.what;
        if (i == 1) {
            this.c.setVisibility(8);
            this.j.a(com.taobao.android.live.plugin.atype.flexalocal.comments.chat.a.KEY_BOTTOM_ADAPTER_VIEW, Boolean.FALSE);
        } else if (i != 2 || !(message.obj instanceof ChatMessage)) {
        } else {
            b((ChatMessage) message.obj);
        }
    }

    private void a(ChatMessage chatMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d487357f", new Object[]{this, chatMessage});
        } else if (!com.taobao.android.live.plugin.atype.flexalocal.comments.chat.b.j() || chatMessage == null || chatMessage.renders == null) {
        } else {
            String str = chatMessage.renders.get(aw.PARAM_CHAT_RENDERS_ENHANCE);
            if (!TextUtils.equals(str, "follow") && !TextUtils.equals(str, "share")) {
                return;
            }
            this.h.removeMessages(2);
            Message obtain = Message.obtain();
            obtain.what = 2;
            obtain.obj = chatMessage;
            this.h.sendMessageDelayed(obtain, 3000L);
        }
    }

    private void b(ChatMessage chatMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fddb8ac0", new Object[]{this, chatMessage});
            return;
        }
        if (chatMessage.renders != null) {
            chatMessage.renders.remove("showMod");
        }
        hgl hglVar = this.k;
        if (hglVar == null) {
            return;
        }
        hglVar.b(chatMessage);
    }

    @Override // tb.ddv
    public void onEvent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
        } else if ((!com.taobao.android.live.plugin.atype.flexalocal.comments.chat.a.KEY_ANCHOR_RESPONSE_VIEW.equals(str) && !com.taobao.android.live.plugin.atype.flexalocal.comments.chat.a.KEY_HOT_SALE_VIEW.equals(str) && !com.taobao.android.live.plugin.atype.flexalocal.comments.chat.a.KEY_SAYS_CLUSTER_VIEW.equals(str)) || !(obj instanceof String) || !TextUtils.equals((String) obj, "true")) {
        } else {
            e();
        }
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        this.c.setVisibility(8);
        this.j.a(com.taobao.android.live.plugin.atype.flexalocal.comments.chat.a.KEY_BOTTOM_ADAPTER_VIEW, Boolean.FALSE);
    }

    @Override // tb.ddv
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this}) : new String[]{com.taobao.android.live.plugin.atype.flexalocal.comments.chat.a.KEY_ANCHOR_RESPONSE_VIEW, com.taobao.android.live.plugin.atype.flexalocal.comments.chat.a.KEY_HOT_SALE_VIEW, com.taobao.android.live.plugin.atype.flexalocal.comments.chat.a.KEY_SAYS_CLUSTER_VIEW};
    }

    @Override // tb.ddv
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this});
        }
        com.taobao.alilive.aliliveframework.frame.a aVar = this.i;
        if (aVar != null) {
            return aVar.G();
        }
        return null;
    }

    /* loaded from: classes5.dex */
    public class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final SparseArray<Pools.SimplePool<hfy>> b = new SparseArray<>();

        static {
            kge.a(-1368381950);
        }

        public a() {
        }

        public static /* synthetic */ SparseArray a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (SparseArray) ipChange.ipc$dispatch("db3c72e5", new Object[]{aVar}) : aVar.b;
        }

        public hfy a(ChatMessage chatMessage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (hfy) ipChange.ipc$dispatch("1021984c", new Object[]{this, chatMessage});
            }
            int a2 = hfv.a(chatMessage);
            Pools.SimplePool<hfy> simplePool = this.b.get(a2);
            if (simplePool == null) {
                simplePool = new Pools.SimplePool<>(5);
                this.b.put(a2, simplePool);
            }
            hfy acquire = simplePool.acquire();
            return acquire == null ? hfu.a(b.a(b.this), b.b(b.this), hfv.a(chatMessage), b.c(b.this)) : acquire;
        }

        public void a(hfy hfyVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ebe24dbd", new Object[]{this, hfyVar});
            } else if (hfyVar == null) {
            } else {
                Pools.SimplePool<hfy> simplePool = this.b.get(hfyVar.getItemViewType());
                if (simplePool == null) {
                    simplePool = new Pools.SimplePool<>(5);
                    this.b.put(hfyVar.getItemViewType(), simplePool);
                }
                simplePool.release(hfyVar);
            }
        }
    }
}
