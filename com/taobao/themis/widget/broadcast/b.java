package com.taobao.themis.widget.broadcast;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.android.virtual_thread.face.h;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001a2\u00020\u0001:\u0002\u0019\u001aB\u0005¢\u0006\u0002\u0010\u0002J \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u001e\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0012\u0010\u0012\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0002J&\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/taobao/themis/widget/broadcast/BroadcastManager;", "", "()V", "mBroadcastExecutorService", "Ljava/util/concurrent/ExecutorService;", "mChannelMap", "", "", "Lcom/taobao/themis/widget/broadcast/BroadcastChannel;", "exitChannel", "", "channelToken", "member", "Lcom/taobao/themis/widget/broadcast/BroadcastMember;", "callback", "Lcom/taobao/themis/widget/broadcast/BroadcastManager$Callback;", "memberInstanceId", "joinChannel", "runWithTread", "runnable", "Ljava/lang/Runnable;", "sendMessage", "instanceId", "msg", "Lcom/taobao/themis/widget/broadcast/BroadcastMsg;", "Callback", "Companion", "themis_widget_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final C0983b Companion;
    private static final b c;

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, com.taobao.themis.widget.broadcast.a> f22916a = new HashMap();
    private ExecutorService b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, d2 = {"Lcom/taobao/themis/widget/broadcast/BroadcastManager$Callback;", "", "onError", "", "errorMsg", "", "onSuccess", "themis_widget_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public interface a {
        void a();

        void a(String str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;
        public final /* synthetic */ a c;
        public final /* synthetic */ String d;

        public c(String str, a aVar, String str2) {
            this.b = str;
            this.c = aVar;
            this.d = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            com.taobao.themis.widget.broadcast.a aVar = (com.taobao.themis.widget.broadcast.a) b.a(b.this).get(this.b);
            if (aVar == null) {
                a aVar2 = this.c;
                if (aVar2 == null) {
                    return;
                }
                aVar2.a("has not joined channel");
                return;
            }
            if (!aVar.a(this.d)) {
                a aVar3 = this.c;
                if (aVar3 != null) {
                    aVar3.a("has not joined channel");
                }
            } else {
                a aVar4 = this.c;
                if (aVar4 != null) {
                    aVar4.a();
                }
            }
            if (!aVar.a()) {
                return;
            }
            b.a(b.this).remove(this.b);
            aVar.b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;
        public final /* synthetic */ com.taobao.themis.widget.broadcast.c c;
        public final /* synthetic */ a d;

        public d(String str, com.taobao.themis.widget.broadcast.c cVar, a aVar) {
            this.b = str;
            this.c = cVar;
            this.d = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            com.taobao.themis.widget.broadcast.a aVar = (com.taobao.themis.widget.broadcast.a) b.a(b.this).get(this.b);
            if (aVar == null) {
                aVar = new com.taobao.themis.widget.broadcast.a(this.b);
                b.a(b.this).put(this.b, aVar);
            }
            if (aVar.a(this.c)) {
                this.d.a();
            } else {
                this.d.a("has joined same channel");
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "newThreadName"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class e implements h {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final e INSTANCE = new e();

        @Override // com.taobao.android.virtual_thread.face.h
        public final String newThreadName() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("57dab4a4", new Object[]{this}) : "ThemisBroadcastThread";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;
        public final /* synthetic */ a c;
        public final /* synthetic */ String d;
        public final /* synthetic */ BroadcastMsg e;

        public f(String str, a aVar, String str2, BroadcastMsg broadcastMsg) {
            this.b = str;
            this.c = aVar;
            this.d = str2;
            this.e = broadcastMsg;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            com.taobao.themis.widget.broadcast.a aVar = (com.taobao.themis.widget.broadcast.a) b.a(b.this).get(this.b);
            if (aVar == null) {
                this.c.a("has not joined channel");
            } else if (!aVar.a(this.d, this.e)) {
                this.c.a("has not joined channel");
            } else {
                this.c.a();
            }
        }
    }

    public b() {
        ExecutorService newSingleThreadExecutor = VExecutors.newSingleThreadExecutor(e.INSTANCE);
        q.b(newSingleThreadExecutor, "VExecutors.newSingleThre…ThemisBroadcastThread\" })");
        this.b = newSingleThreadExecutor;
    }

    public static final /* synthetic */ b a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("60c2359e", new Object[0]) : c;
    }

    public static final /* synthetic */ Map a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("4aed2acd", new Object[]{bVar}) : bVar.f22916a;
    }

    private final void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
        } else {
            this.b.execute(runnable);
        }
    }

    public final void a(String channelToken, com.taobao.themis.widget.broadcast.c member, a callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6189ea94", new Object[]{this, channelToken, member, callback});
            return;
        }
        q.d(channelToken, "channelToken");
        q.d(member, "member");
        q.d(callback, "callback");
        a(new d(channelToken, member, callback));
    }

    public final void a(String channelToken, String memberInstanceId, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e517b1cf", new Object[]{this, channelToken, memberInstanceId, aVar});
            return;
        }
        q.d(channelToken, "channelToken");
        q.d(memberInstanceId, "memberInstanceId");
        a(new c(channelToken, aVar, memberInstanceId));
    }

    public final void a(String instanceId, String channelToken, BroadcastMsg msg, a callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f13528b5", new Object[]{this, instanceId, channelToken, msg, callback});
            return;
        }
        q.d(instanceId, "instanceId");
        q.d(channelToken, "channelToken");
        q.d(msg, "msg");
        q.d(callback, "callback");
        a(new f(channelToken, callback, instanceId, msg));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/taobao/themis/widget/broadcast/BroadcastManager$Companion;", "", "()V", "instance", "Lcom/taobao/themis/widget/broadcast/BroadcastManager;", "getInstance", "()Lcom/taobao/themis/widget/broadcast/BroadcastManager;", "themis_widget_release"}, k = 1, mv = {1, 4, 1})
    /* renamed from: com.taobao.themis.widget.broadcast.b$b  reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    public static final class C0983b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1112968759);
        }

        private C0983b() {
        }

        public /* synthetic */ C0983b(o oVar) {
            this();
        }

        public final b a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("60c2359e", new Object[]{this}) : b.a();
        }
    }

    static {
        kge.a(1746514351);
        Companion = new C0983b(null);
        c = new b();
    }
}
