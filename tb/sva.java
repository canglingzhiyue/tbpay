package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.e;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.q;
import tb.spy;
import tb.sur;

/* loaded from: classes8.dex */
public final class sva {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final sva INSTANCE;

    /* loaded from: classes8.dex */
    public static final class b extends spy.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ suz f33922a;

        public b(suz suzVar) {
            this.f33922a = suzVar;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            if (str.hashCode() == -162361891) {
                return new Boolean(super.a((spx) objArr[0], objArr[1]));
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // tb.spy.a
        public boolean a(spx spxVar, Object obj) {
            JSONObject jSONObject;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f6528ddd", new Object[]{this, spxVar, obj})).booleanValue();
            }
            com.taobao.tab2interact.core.utils.a.b(this, "ShortVideoTabMessageRegisterHelper", "收到视频Tab的消息结果回调，message=" + this.f33922a);
            boolean a2 = super.a(spxVar, obj);
            if (a2) {
                if (obj instanceof Map) {
                    jSONObject = new JSONObject((Map) obj);
                } else {
                    com.taobao.tab2interact.core.utils.a.b(this, "ShortVideoTabMessageRegisterHelper", "收到视频Tab的消息结果回调，result无效");
                    jSONObject = null;
                }
                sur.a g = this.f33922a.g();
                if (g != null) {
                    g.a(jSONObject);
                }
            }
            return a2;
        }
    }

    static {
        kge.a(1422908404);
        INSTANCE = new sva();
    }

    private sva() {
    }

    public final void a(sus messageCenter, com.taobao.tab2interact.core.data.baseinfo.a baseInfoManager, JSONObject args, String sender, sur.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b709bd6", new Object[]{this, messageCenter, baseInfoManager, args, sender, aVar});
            return;
        }
        q.d(messageCenter, "messageCenter");
        q.d(baseInfoManager, "baseInfoManager");
        q.d(args, "args");
        q.d(sender, "sender");
        com.taobao.tab2interact.core.utils.a.b(this, "ShortVideoTabMessageRegisterHelper", "向互动发消息，sender=" + sender);
        if (!q.a((Object) baseInfoManager.a(sender), (Object) "video")) {
            com.taobao.tab2interact.core.utils.a.b(this, "ShortVideoTabMessageRegisterHelper", "向互动发消息，sender无效");
            return;
        }
        suz a2 = suz.Companion.a(args, System.currentTimeMillis(), sender, "Interact", aVar);
        if (a2 == null) {
            return;
        }
        messageCenter.a(a2);
    }

    public final void a(com.taobao.tab2interact.core.data.baseinfo.a baseInfoManager, JSONObject args, String receiver, sur.a aVar, est tabBaseInfoManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("997a19df", new Object[]{this, baseInfoManager, args, receiver, aVar, tabBaseInfoManager});
            return;
        }
        q.d(baseInfoManager, "baseInfoManager");
        q.d(args, "args");
        q.d(receiver, "receiver");
        q.d(tabBaseInfoManager, "tabBaseInfoManager");
        com.taobao.tab2interact.core.utils.a.b(this, "ShortVideoTabMessageRegisterHelper", "向视频Tab发消息，receiver=" + receiver);
        suz a2 = suz.Companion.a(args, System.currentTimeMillis(), "Interact", receiver, aVar);
        if (a2 == null) {
            return;
        }
        a(baseInfoManager, a2, tabBaseInfoManager);
    }

    public final void a(com.taobao.tab2interact.core.data.baseinfo.a baseInfoManager, suz message, est tabBaseInfoManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dce340a", new Object[]{this, baseInfoManager, message, tabBaseInfoManager});
            return;
        }
        q.d(baseInfoManager, "baseInfoManager");
        q.d(message, "message");
        q.d(tabBaseInfoManager, "tabBaseInfoManager");
        com.taobao.tab2interact.core.utils.a.b(this, "ShortVideoTabMessageRegisterHelper", "向视频Tab发消息，message=" + message);
        if (!q.a((Object) baseInfoManager.a(message.f()), (Object) "video")) {
            com.taobao.tab2interact.core.utils.a.b(this, "ShortVideoTabMessageRegisterHelper", "向视频Tab发消息，receiver无效");
        } else {
            e.a(tabBaseInfoManager.b(message.f()), new spy(message.d(), new b(message)));
        }
    }

    public final void a(sus messageCenter, com.taobao.tab2interact.core.data.baseinfo.a baseInfoManager, String sender, List<String> names, suu messageObserver, est tabBaseInfoManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60c1b669", new Object[]{this, messageCenter, baseInfoManager, sender, names, messageObserver, tabBaseInfoManager});
            return;
        }
        q.d(messageCenter, "messageCenter");
        q.d(baseInfoManager, "baseInfoManager");
        q.d(sender, "sender");
        q.d(names, "names");
        q.d(messageObserver, "messageObserver");
        q.d(tabBaseInfoManager, "tabBaseInfoManager");
        com.taobao.tab2interact.core.utils.a.b(this, "ShortVideoTabMessageRegisterHelper", "注册来自视频Tab的消息，sender=" + sender + "，names=" + names);
        if (!q.a((Object) baseInfoManager.a(sender), (Object) "video")) {
            com.taobao.tab2interact.core.utils.a.b(this, "ShortVideoTabMessageRegisterHelper", "注册来自视频Tab的消息，sender无效");
            return;
        }
        messageCenter.a(sender, names, messageObserver);
        a(messageCenter, baseInfoManager, sender, tabBaseInfoManager);
    }

    public final void b(sus messageCenter, com.taobao.tab2interact.core.data.baseinfo.a baseInfoManager, String sender, List<String> names, suu messageObserver, est tabBaseInfoManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41cdf0ea", new Object[]{this, messageCenter, baseInfoManager, sender, names, messageObserver, tabBaseInfoManager});
            return;
        }
        q.d(messageCenter, "messageCenter");
        q.d(baseInfoManager, "baseInfoManager");
        q.d(sender, "sender");
        q.d(names, "names");
        q.d(messageObserver, "messageObserver");
        q.d(tabBaseInfoManager, "tabBaseInfoManager");
        com.taobao.tab2interact.core.utils.a.b(this, "ShortVideoTabMessageRegisterHelper", "解注册来自视频Tab的消息，sender=" + sender + "，names=" + names);
        if (!q.a((Object) baseInfoManager.a(sender), (Object) "video")) {
            com.taobao.tab2interact.core.utils.a.b(this, "ShortVideoTabMessageRegisterHelper", "解注册来自视频Tab的消息，sender无效");
            return;
        }
        messageCenter.b(sender, names, messageObserver);
        if (messageCenter.a(sender)) {
            return;
        }
        a(sender, tabBaseInfoManager);
    }

    public final void a(sus messageCenter, com.taobao.tab2interact.core.data.baseinfo.a baseInfoManager, String sender, suu messageObserver, est tabBaseInfoManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec896d78", new Object[]{this, messageCenter, baseInfoManager, sender, messageObserver, tabBaseInfoManager});
            return;
        }
        q.d(messageCenter, "messageCenter");
        q.d(baseInfoManager, "baseInfoManager");
        q.d(sender, "sender");
        q.d(messageObserver, "messageObserver");
        q.d(tabBaseInfoManager, "tabBaseInfoManager");
        com.taobao.tab2interact.core.utils.a.b(this, "ShortVideoTabMessageRegisterHelper", "解注册来自视频Tab的消息，sender=" + sender);
        if (!q.a((Object) baseInfoManager.a(sender), (Object) "video")) {
            com.taobao.tab2interact.core.utils.a.b(this, "ShortVideoTabMessageRegisterHelper", "解注册来自视频Tab的消息，sender无效");
            return;
        }
        messageCenter.a(sender, messageObserver);
        if (messageCenter.a(sender)) {
            return;
        }
        a(sender, tabBaseInfoManager);
    }

    private final void a(sus susVar, com.taobao.tab2interact.core.data.baseinfo.a aVar, String str, est estVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7b3f43b", new Object[]{this, susVar, aVar, str, estVar});
            return;
        }
        com.taobao.tab2interact.core.utils.a.b(this, "ShortVideoTabMessageRegisterHelper", "向Fluid实例注册事件处理器，sender=" + str);
        if (estVar.c(str) != null) {
            com.taobao.tab2interact.core.utils.a.b(this, "ShortVideoTabMessageRegisterHelper", "向Fluid实例注册事件处理器，已注册");
            return;
        }
        a aVar2 = new a(susVar, str, aVar);
        String b2 = estVar.b(str);
        a aVar3 = aVar2;
        e.a(b2, aVar3);
        estVar.a(str, aVar3);
        com.taobao.tab2interact.core.utils.a.b(this, "ShortVideoTabMessageRegisterHelper", "向Fluid实例注册事件处理器，注册完成，fluidInstanceId=" + b2 + "，fluidMessageHandler=" + aVar2);
    }

    /* loaded from: classes8.dex */
    public static final class a implements spx {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ sus f33921a;
        public final /* synthetic */ String b;
        public final /* synthetic */ com.taobao.tab2interact.core.data.baseinfo.a c;
        private String d = "";

        @Override // tb.spx
        public boolean F() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3eff1d1", new Object[]{this})).booleanValue();
            }
            return true;
        }

        @Override // tb.spx, tb.snd
        public void cI_() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f6eaece0", new Object[]{this});
            }
        }

        @Override // tb.spx
        public boolean k() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue();
            }
            return false;
        }

        public a(sus susVar, String str, com.taobao.tab2interact.core.data.baseinfo.a aVar) {
            this.f33921a = susVar;
            this.b = str;
            this.c = aVar;
        }

        @Override // tb.spx
        public boolean d(spy spyVar) {
            IpChange ipChange = $ipChange;
            boolean z = true;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("cabd9b23", new Object[]{this, spyVar})).booleanValue();
            }
            String str = spyVar != null ? spyVar.c : null;
            if (str == null || !this.f33921a.a(this.b, str)) {
                z = false;
            }
            com.taobao.tab2interact.core.utils.a.a(this, "ShortVideoTabMessageRegisterHelper", "过滤视频Tab的消息，name=" + str + "，result=" + z);
            return z;
        }

        @Override // tb.spx
        public void a(spy spyVar) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ff34879c", new Object[]{this, spyVar});
                return;
            }
            com.taobao.tab2interact.core.utils.a.b(this, "ShortVideoTabMessageRegisterHelper", "收到并处理视频Tab的消息，shortVideoMessage=" + spyVar);
            if (spyVar == null) {
                com.taobao.tab2interact.core.utils.a.b(this, "ShortVideoTabMessageRegisterHelper", "收到并处理视频Tab的消息，shortVideoMessage为空");
                return;
            }
            Map a2 = spyVar.a();
            if (a2 == null) {
                com.taobao.tab2interact.core.utils.a.b(this, "ShortVideoTabMessageRegisterHelper", "收到并处理视频Tab的消息，shortVideoMessageMap为空");
                return;
            }
            if ("VSMSG_pageStateChanged".equals(spyVar.c) && spyVar.i != null) {
                Object obj = spyVar.i.get("state");
                if (obj == null || (str = obj.toString()) == null) {
                    str = "";
                }
                if ((str != null ? Boolean.valueOf(str.equals(this.d)) : null).booleanValue()) {
                    com.taobao.tab2interact.core.utils.a.b(this, "ShortVideoTabMessageRegisterHelper", "收到并处理视频Tab的消息，过滤掉多余的pageState消息 " + str);
                    return;
                }
                this.d = str;
            }
            sva.INSTANCE.a(this.f33921a, this.c, new JSONObject(a2), this.b, (sur.a) null);
        }
    }

    private final void a(String str, est estVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2763255c", new Object[]{this, str, estVar});
            return;
        }
        com.taobao.tab2interact.core.utils.a.b(this, "ShortVideoTabMessageRegisterHelper", "向Fluid实例解注册事件处理器，sender=" + str);
        spx c = estVar.c(str);
        if (c == null) {
            com.taobao.tab2interact.core.utils.a.b(this, "ShortVideoTabMessageRegisterHelper", "向Fluid实例解注册事件处理器，未注册或已解注册");
            return;
        }
        String b2 = estVar.b(str);
        e.b(b2, c);
        estVar.a(str, (spx) null);
        com.taobao.tab2interact.core.utils.a.b(this, "ShortVideoTabMessageRegisterHelper", "向Fluid实例解注册事件处理器，解注册完成，fluidInstanceId=" + b2 + "，fluidMessageHandler=" + c);
    }
}
