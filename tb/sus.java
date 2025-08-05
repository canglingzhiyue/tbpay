package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tab2interact.core.utils.g;
import java.util.List;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;

/* loaded from: classes8.dex */
public final class sus {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private final g<suu> f33913a = new g<>();

    static {
        kge.a(1275520557);
        Companion = new a(null);
    }

    /* loaded from: classes8.dex */
    public static final class a {
        static {
            kge.a(-1629307595);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    public final void a(sur message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff77ce88", new Object[]{this, message});
            return;
        }
        q.d(message, "message");
        com.taobao.tab2interact.core.utils.a.b(this, "MessageCenter", "发送消息，message=" + message);
        this.f33913a.a(new d(message));
    }

    /* loaded from: classes8.dex */
    public static final class d<T> implements g.a<suu> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ sur f33916a;

        public d(sur surVar) {
            this.f33916a = surVar;
        }

        @Override // com.taobao.tab2interact.core.utils.g.a
        public final boolean a(suu suuVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ff792ba9", new Object[]{this, suuVar})).booleanValue();
            }
            if (sup.Companion.a(this.f33916a.c())) {
                suuVar.a(this.f33916a);
            } else if (suuVar.d(this.f33916a.e(), this.f33916a.c())) {
                suuVar.a(this.f33916a);
            }
            return true;
        }
    }

    public final void a(String messageSender, List<String> messageNames, suu messageObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f36c0960", new Object[]{this, messageSender, messageNames, messageObserver});
            return;
        }
        q.d(messageSender, "messageSender");
        q.d(messageNames, "messageNames");
        q.d(messageObserver, "messageObserver");
        com.taobao.tab2interact.core.utils.a.b(this, "MessageCenter", "注册消息，messageSender=" + messageSender + "，messageNames=" + messageNames + "，messageObserver=" + messageObserver);
        a(messageObserver);
        messageObserver.a(messageSender, messageNames);
    }

    public final void b(String messageSender, List<String> messageNames, suu messageObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68e62fa1", new Object[]{this, messageSender, messageNames, messageObserver});
            return;
        }
        q.d(messageSender, "messageSender");
        q.d(messageNames, "messageNames");
        q.d(messageObserver, "messageObserver");
        com.taobao.tab2interact.core.utils.a.b(this, "MessageCenter", "解注册消息，messageSender=" + messageSender + "，messageNames=" + messageNames + "，messageObserver=" + messageObserver);
        messageObserver.b(messageSender, messageNames);
        if (messageObserver.B()) {
            return;
        }
        b(messageObserver);
    }

    public final void a(String messageSender, suu messageObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f63a16f", new Object[]{this, messageSender, messageObserver});
            return;
        }
        q.d(messageSender, "messageSender");
        q.d(messageObserver, "messageObserver");
        com.taobao.tab2interact.core.utils.a.b(this, "MessageCenter", "解注册消息，messageSender=" + messageSender + "，messageObserver=" + messageObserver);
        messageObserver.d(messageSender);
        if (messageObserver.B()) {
            return;
        }
        b(messageObserver);
    }

    public final boolean a(String messageSender, String messageName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, messageSender, messageName})).booleanValue();
        }
        q.d(messageSender, "messageSender");
        q.d(messageName, "messageName");
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = false;
        this.f33913a.a(new b(messageSender, messageName, booleanRef));
        return booleanRef.element;
    }

    /* loaded from: classes8.dex */
    public static final class b<T> implements g.a<suu> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f33914a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Ref.BooleanRef c;

        public b(String str, String str2, Ref.BooleanRef booleanRef) {
            this.f33914a = str;
            this.b = str2;
            this.c = booleanRef;
        }

        @Override // com.taobao.tab2interact.core.utils.g.a
        public final boolean a(suu suuVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ff792ba9", new Object[]{this, suuVar})).booleanValue();
            }
            if (!suuVar.d(this.f33914a, this.b)) {
                return true;
            }
            this.c.element = true;
            return false;
        }
    }

    public final boolean a(String messageSender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, messageSender})).booleanValue();
        }
        q.d(messageSender, "messageSender");
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = false;
        this.f33913a.a(new c(messageSender, booleanRef));
        return booleanRef.element;
    }

    /* loaded from: classes8.dex */
    public static final class c<T> implements g.a<suu> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f33915a;
        public final /* synthetic */ Ref.BooleanRef b;

        public c(String str, Ref.BooleanRef booleanRef) {
            this.f33915a = str;
            this.b = booleanRef;
        }

        @Override // com.taobao.tab2interact.core.utils.g.a
        public final boolean a(suu suuVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ff792ba9", new Object[]{this, suuVar})).booleanValue();
            }
            if (!suuVar.e(this.f33915a)) {
                return true;
            }
            this.b.element = true;
            return false;
        }
    }

    public final void a(suu messageObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff792ba5", new Object[]{this, messageObserver});
            return;
        }
        q.d(messageObserver, "messageObserver");
        com.taobao.tab2interact.core.utils.a.b(this, "MessageCenter", "注册消息观察者，messageObserver=" + messageObserver);
        this.f33913a.a((g<suu>) messageObserver);
    }

    public final void b(suu messageObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edfc3226", new Object[]{this, messageObserver});
            return;
        }
        q.d(messageObserver, "messageObserver");
        com.taobao.tab2interact.core.utils.a.b(this, "MessageCenter", "解注册消息观察者，messageObserver=" + messageObserver);
        this.f33913a.b(messageObserver);
    }
}
