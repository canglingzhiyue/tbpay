package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tab2interact.core.data.baseinfo.a;
import java.util.List;
import kotlin.jvm.internal.q;
import tb.sur;

/* loaded from: classes8.dex */
public final class odq {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final odq INSTANCE;

    static {
        kge.a(-70736185);
        INSTANCE = new odq();
    }

    private odq() {
    }

    public final void a(sus messageCenter, a baseInfoManager, JSONObject messageJSONObject, sur.a aVar, est multiTabBaseInfoManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2273f5f6", new Object[]{this, messageCenter, baseInfoManager, messageJSONObject, aVar, multiTabBaseInfoManager});
            return;
        }
        q.d(messageCenter, "messageCenter");
        q.d(baseInfoManager, "baseInfoManager");
        q.d(messageJSONObject, "messageJSONObject");
        q.d(multiTabBaseInfoManager, "multiTabBaseInfoManager");
        com.taobao.tab2interact.core.utils.a.b(this, "MessageHelper", "发送消息");
        Object obj = messageJSONObject.get(sur.KEY_RECEIVER);
        if (!(obj instanceof String)) {
            com.taobao.tab2interact.core.utils.a.b(this, "MessageHelper", "发送消息，receiver无效");
        } else if (q.a(obj, (Object) "Interact")) {
            suq a2 = suq.Companion.a(messageJSONObject);
            if (a2 == null) {
                return;
            }
            a2.a(aVar);
            sut.INSTANCE.a(messageCenter, a2);
        } else {
            String str = (String) obj;
            if (q.a((Object) baseInfoManager.a(str), (Object) "video")) {
                suz a3 = suz.Companion.a(messageJSONObject);
                if (a3 == null) {
                    return;
                }
                a3.a(aVar);
                sva.INSTANCE.a(baseInfoManager, a3, multiTabBaseInfoManager);
                return;
            }
            q.a((Object) baseInfoManager.a(str), (Object) "live");
        }
    }

    public final void a(sus messageCenter, a baseInfoManager, String sender, List<String> names, suu messageObserver, est multiTabBaseInfoManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60c1b669", new Object[]{this, messageCenter, baseInfoManager, sender, names, messageObserver, multiTabBaseInfoManager});
            return;
        }
        q.d(messageCenter, "messageCenter");
        q.d(baseInfoManager, "baseInfoManager");
        q.d(sender, "sender");
        q.d(names, "names");
        q.d(messageObserver, "messageObserver");
        q.d(multiTabBaseInfoManager, "multiTabBaseInfoManager");
        com.taobao.tab2interact.core.utils.a.b(this, "MessageHelper", "注册消息，sender=" + sender + "，names=" + names);
        if (q.a((Object) sender, (Object) "Interact")) {
            sut.INSTANCE.a(messageCenter, names, messageObserver);
        } else if (q.a((Object) baseInfoManager.a(sender), (Object) "video")) {
            sva.INSTANCE.a(messageCenter, baseInfoManager, sender, names, messageObserver, multiTabBaseInfoManager);
        } else if (!q.a((Object) baseInfoManager.a(sender), (Object) "live")) {
        } else {
            esw.a(messageCenter, baseInfoManager, sender, names, messageObserver, multiTabBaseInfoManager);
        }
    }

    public final void b(sus messageCenter, a baseInfoManager, String sender, List<String> names, suu messageObserver, est multiTabBaseInfoManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41cdf0ea", new Object[]{this, messageCenter, baseInfoManager, sender, names, messageObserver, multiTabBaseInfoManager});
            return;
        }
        q.d(messageCenter, "messageCenter");
        q.d(baseInfoManager, "baseInfoManager");
        q.d(sender, "sender");
        q.d(names, "names");
        q.d(messageObserver, "messageObserver");
        q.d(multiTabBaseInfoManager, "multiTabBaseInfoManager");
        com.taobao.tab2interact.core.utils.a.b(this, "MessageHelper", "解注册消息，sender=" + sender + "，names=" + names);
        if (q.a((Object) sender, (Object) "Interact")) {
            sut.INSTANCE.b(messageCenter, names, messageObserver);
        } else if (q.a((Object) baseInfoManager.a(sender), (Object) "video")) {
            sva.INSTANCE.b(messageCenter, baseInfoManager, sender, names, messageObserver, multiTabBaseInfoManager);
        } else if (!q.a((Object) baseInfoManager.a(sender), (Object) "live")) {
        } else {
            esw.b(messageCenter, baseInfoManager, sender, names, messageObserver, multiTabBaseInfoManager);
        }
    }
}
