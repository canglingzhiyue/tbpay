package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tab2interact.core.utils.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.q;
import tb.sur;

/* loaded from: classes8.dex */
public final class sut {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final sut INSTANCE;

    static {
        kge.a(1525122317);
        INSTANCE = new sut();
    }

    private sut() {
    }

    public final void a(sus messageCenter, String name, JSONObject jSONObject, sur.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d169ba2", new Object[]{this, messageCenter, name, jSONObject, aVar});
            return;
        }
        q.d(messageCenter, "messageCenter");
        q.d(name, "name");
        a.b(this, "InteractMessageHelper", "向互动发消息，name=" + name + "，args=" + jSONObject);
        suq a2 = suq.Companion.a(name, jSONObject, System.currentTimeMillis(), aVar);
        if (a2 == null) {
            return;
        }
        a(messageCenter, a2);
    }

    public final void a(sus messageCenter, suq message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("814041a8", new Object[]{this, messageCenter, message});
            return;
        }
        q.d(messageCenter, "messageCenter");
        q.d(message, "message");
        a.b(this, "InteractMessageHelper", "向互动发消息，message=" + message);
        messageCenter.a(message);
    }

    public final void a(sus messageCenter, List<String> names, suu messageObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc627115", new Object[]{this, messageCenter, names, messageObserver});
            return;
        }
        q.d(messageCenter, "messageCenter");
        q.d(names, "names");
        q.d(messageObserver, "messageObserver");
        ArrayList arrayList = new ArrayList();
        for (String str : names) {
            if (suq.Companion.a(str)) {
                arrayList.add(str);
            }
        }
        a.b(this, "InteractMessageHelper", "注册来自互动的消息，names=" + names + "，finalNames=" + arrayList);
        messageCenter.a("Interact", arrayList, messageObserver);
    }

    public final void b(sus messageCenter, List<String> names, suu messageObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d00a4496", new Object[]{this, messageCenter, names, messageObserver});
            return;
        }
        q.d(messageCenter, "messageCenter");
        q.d(names, "names");
        q.d(messageObserver, "messageObserver");
        a.b(this, "InteractMessageHelper", "解注册来自互动的消息，names=" + names);
        messageCenter.b("Interact", names, messageObserver);
    }

    public final void a(sus messageCenter, suu messageObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81421324", new Object[]{this, messageCenter, messageObserver});
            return;
        }
        q.d(messageCenter, "messageCenter");
        q.d(messageObserver, "messageObserver");
        a.b(this, "InteractMessageHelper", "解注册来自互动的消息");
        messageCenter.a("Interact", messageObserver);
    }
}
