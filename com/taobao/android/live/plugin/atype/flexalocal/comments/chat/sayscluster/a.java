package com.taobao.android.live.plugin.atype.flexalocal.comments.chat.sayscluster;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.utils.v;
import com.taobao.taolive.sdk.model.d;
import com.taobao.taolive.sdk.model.message.ChatMessage;
import com.taobao.taolive.sdk.model.message.CommentCountMessage;
import com.taobao.taolive.sdk.model.message.DisableAddOneCommentMessage;
import com.taobao.taolive.sdk.model.message.MessageTypeFilter;
import com.taobao.taolive.sdk.utils.p;
import com.taobao.taolive.sdk.utils.q;
import java.util.HashMap;
import tb.ddv;
import tb.kge;
import tb.phg;

/* loaded from: classes5.dex */
public class a implements b, d.a, ddv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private static int f13623a;
    private final Context e;
    private final com.taobao.alilive.aliliveframework.frame.a f;
    private final com.taobao.android.live.plugin.atype.flexalocal.comments.chat.c h;
    private int b = -1;
    private boolean c = false;
    private ChatMessage d = null;
    private final Runnable i = new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.comments.chat.sayscluster.-$$Lambda$a$4zJ0o7DmOF0LC7WCyBkVJfUh87E
        {
            a.this = this;
        }

        @Override // java.lang.Runnable
        public final void run() {
            a.lambda$4zJ0o7DmOF0LC7WCyBkVJfUh87E(a.this);
        }
    };
    private final Handler j = new Handler(Looper.getMainLooper());
    private final c g = new d();

    public static /* synthetic */ void lambda$4zJ0o7DmOF0LC7WCyBkVJfUh87E(a aVar) {
        aVar.c();
    }

    @Override // tb.ddv
    public String bizCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("36951559", new Object[]{this}) : "BottomSaysClusterController";
    }

    static {
        kge.a(-1021506434);
        kge.a(86511167);
        kge.a(-2101054629);
        kge.a(191318335);
        f13623a = 3;
    }

    public a(Context context, com.taobao.alilive.aliliveframework.frame.a aVar, com.taobao.android.live.plugin.atype.flexalocal.comments.chat.c cVar) {
        this.e = context;
        this.f = aVar;
        this.h = cVar;
        if (!p.B()) {
            f();
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.sayscluster.b
    public View a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this});
        }
        c cVar = this.g;
        if (cVar == null) {
            return null;
        }
        return cVar.a();
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.sayscluster.b
    public void a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a1860a7", new Object[]{this, viewGroup});
            return;
        }
        c cVar = this.g;
        if (cVar == null) {
            return;
        }
        cVar.a(this.e, this.f, viewGroup);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.sayscluster.b
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (!p.B()) {
        } else {
            f();
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.sayscluster.b
    public boolean a(ChatMessage chatMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4873583", new Object[]{this, chatMessage})).booleanValue();
        }
        if (chatMessage == null || !this.c || this.d == null || !TextUtils.equals(chatMessage.mContent, this.d.mContent)) {
            return false;
        }
        a(this.d, chatMessage);
        return true;
    }

    private void a(CommentCountMessage commentCountMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb65d417", new Object[]{this, commentCountMessage});
        } else if (commentCountMessage.data == null || TextUtils.isEmpty(commentCountMessage.data.content)) {
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("[pm received]:");
            sb.append(commentCountMessage.data.content);
            sb.append(" ");
            sb.append(commentCountMessage.data.count);
            sb.append(" cur:");
            ChatMessage chatMessage = this.d;
            sb.append(chatMessage == null ? "" : chatMessage.mContent);
            com.taobao.android.live.plugin.atype.flexalocal.comments.chat.b.a("BottomSaysClusterController", sb.toString());
            ChatMessage chatMessage2 = this.d;
            if (chatMessage2 != null && TextUtils.equals(chatMessage2.mContent, commentCountMessage.data.content)) {
                return;
            }
            this.b = -1;
            this.c = true;
            this.d = b(commentCountMessage);
            a(commentCountMessage.data.content);
            d();
        }
    }

    private void a(ChatMessage chatMessage, ChatMessage chatMessage2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34fd6ad6", new Object[]{this, chatMessage, chatMessage2});
        } else if (this.g == null) {
        } else {
            d();
            this.g.a(b(chatMessage), chatMessage2);
            this.h.a(com.taobao.android.live.plugin.atype.flexalocal.comments.chat.a.KEY_SAYS_CLUSTER_VIEW, Boolean.TRUE);
        }
    }

    private int b(ChatMessage chatMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fddb8ab3", new Object[]{this, chatMessage})).intValue();
        }
        int i = this.b;
        if (i == -1) {
            if (chatMessage.renders == null) {
                this.b = 1;
            } else {
                this.b = v.a(chatMessage.renders.get("saysClusterCount"), 1);
            }
        } else {
            this.b = i + 1;
        }
        return this.b;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        e();
        c cVar = this.g;
        if (cVar == null) {
            return;
        }
        cVar.b();
        this.h.a(com.taobao.android.live.plugin.atype.flexalocal.comments.chat.a.KEY_SAYS_CLUSTER_VIEW, Boolean.FALSE);
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.j.removeCallbacks(this.i);
        this.j.postDelayed(this.i, f13623a * 1000);
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("content", str);
        phg.a().a("Comment_HotWordShowup", hashMap);
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        this.d = null;
        this.b = -1;
        this.c = false;
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        f13623a = com.taobao.android.live.plugin.atype.flexalocal.comments.chat.b.h();
        com.taobao.alilive.aliliveframework.frame.a aVar = this.f;
        if (aVar != null && aVar.f() != null) {
            this.f.f().registerMessageListener(this, new MessageTypeFilter() { // from class: com.taobao.android.live.plugin.atype.flexalocal.comments.chat.sayscluster.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    a.this = this;
                }

                @Override // com.taobao.taolive.sdk.model.message.MessageTypeFilter
                public boolean filter(int i) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("c81f1ee8", new Object[]{this, new Integer(i)})).booleanValue() : i == 1043 || i == 880000269;
                }
            });
        }
        com.taobao.alilive.aliliveframework.frame.a aVar2 = this.f;
        if (aVar2 != null && aVar2.e() != null) {
            this.f.e().a(this);
        }
        b("BottomSaysClusterController initMessageListener");
    }

    private ChatMessage b(CommentCountMessage commentCountMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ChatMessage) ipChange.ipc$dispatch("58cce3d5", new Object[]{this, commentCountMessage});
        }
        if (commentCountMessage == null || commentCountMessage.data == null) {
            return null;
        }
        ChatMessage chatMessage = new ChatMessage();
        chatMessage.mContent = commentCountMessage.data.content;
        chatMessage.renders.put("saysClusterCount", commentCountMessage.data.count);
        return chatMessage;
    }

    @Override // com.taobao.taolive.sdk.core.c
    public void onMessageReceived(int i, Object obj) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b152aef", new Object[]{this, new Integer(i), obj});
        } else if (i == 1043) {
            if (!com.taobao.android.live.plugin.atype.flexalocal.comments.chat.b.i() || !this.h.a(com.taobao.android.live.plugin.atype.flexalocal.comments.chat.a.KEY_SAYS_CLUSTER_VIEW) || !(obj instanceof CommentCountMessage)) {
                return;
            }
            CommentCountMessage commentCountMessage = (CommentCountMessage) obj;
            if (!TextUtils.equals(commentCountMessage.type, "commentCount")) {
                return;
            }
            a(commentCountMessage);
        } else if (i != 880000269 || !(obj instanceof DisableAddOneCommentMessage) || !com.taobao.android.live.plugin.atype.flexalocal.comments.chat.b.e()) {
        } else {
            if (((DisableAddOneCommentMessage) obj).switchStatus == 1) {
                z = true;
            }
            a(z);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.sayscluster.b
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        c cVar = this.g;
        if (cVar == null) {
            return;
        }
        cVar.a(z);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.sayscluster.b
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        c();
        com.taobao.alilive.aliliveframework.frame.a aVar = this.f;
        if (aVar != null && aVar.f() != null) {
            this.f.f().unRegisterMessageListener(this);
        }
        com.taobao.alilive.aliliveframework.frame.a aVar2 = this.f;
        if (aVar2 == null || aVar2.e() == null) {
            return;
        }
        this.f.e().b(this);
    }

    @Override // tb.ddv
    public void onEvent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
        } else if (!com.taobao.android.live.plugin.atype.flexalocal.comments.chat.a.KEY_ANCHOR_RESPONSE_VIEW.equals(str) || !(obj instanceof String) || !TextUtils.equals((String) obj, "true")) {
        } else {
            c();
        }
    }

    @Override // tb.ddv
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this}) : new String[]{com.taobao.android.live.plugin.atype.flexalocal.comments.chat.a.KEY_ANCHOR_RESPONSE_VIEW};
    }

    @Override // tb.ddv
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this});
        }
        com.taobao.alilive.aliliveframework.frame.a aVar = this.f;
        if (aVar != null) {
            return aVar.G();
        }
        return null;
    }

    private void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (this.f == null) {
        } else {
            q.b("ChatWarmOpt", this.f.j() + " " + str);
        }
    }
}
