package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;

/* loaded from: classes8.dex */
public class suv extends suu {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    static {
        kge.a(-954728222);
        Companion = new a(null);
    }

    public static /* synthetic */ Object ipc$super(suv suvVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* loaded from: classes8.dex */
    public static final class a {
        static {
            kge.a(-1198671446);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    @Override // tb.suu
    public void a(sur message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff77ce88", new Object[]{this, message});
            return;
        }
        q.d(message, "message");
        com.taobao.tab2interact.core.utils.a.b(this, "BaseMessageObserver", "收到消息，message=" + message);
        String c = message.c();
        switch (c.hashCode()) {
            case -1752420584:
                if (c.equals(sup.PAGE_URL_QUERY_CHANGE_NAME)) {
                    d(message);
                    return;
                }
                break;
            case -1431924590:
                if (c.equals(sup.PAGE_STATE_CHANGE_NAME)) {
                    b(message);
                    return;
                }
                break;
            case -459761762:
                if (c.equals(sup.TAB_URL_QUERY_CHANGE_NAME)) {
                    e(message);
                    return;
                }
                break;
            case 1256744396:
                if (c.equals(sup.TAB_STATE_CHANGE_NAME)) {
                    c(message);
                    return;
                }
                break;
        }
        com.taobao.tab2interact.core.utils.a.b(this, "BaseMessageObserver", "收到其他消息，message=" + message);
    }

    private final void b(sur surVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edfad509", new Object[]{this, surVar});
            return;
        }
        JSONObject d = surVar.d();
        if (d == null) {
            return;
        }
        Object obj = d.get("changeType");
        Object obj2 = d.get("state");
        if (q.a(obj2, (Object) "create")) {
            bV_();
        } else if (q.a(obj2, (Object) "start")) {
            if (!(obj instanceof String)) {
                com.taobao.tab2interact.core.utils.a.b(this, "BaseMessageObserver", "处理页面状态发生改变的消息，changeType无效");
            } else {
                c_((String) obj);
            }
        } else if (q.a(obj2, (Object) "stop")) {
            if (!(obj instanceof String)) {
                com.taobao.tab2interact.core.utils.a.b(this, "BaseMessageObserver", "处理页面状态发生改变的消息，changeType无效");
            } else {
                b((String) obj);
            }
        } else if (q.a(obj2, (Object) "destroy")) {
            p();
        } else {
            com.taobao.tab2interact.core.utils.a.b(this, "BaseMessageObserver", "处理页面状态发生改变的消息，state无效");
        }
    }

    private final void c(sur surVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc7ddb8a", new Object[]{this, surVar});
            return;
        }
        JSONObject d = surVar.d();
        if (d == null) {
            return;
        }
        Object obj = d.get("id");
        if (obj instanceof String) {
            if (!(((CharSequence) obj).length() == 0)) {
                Object obj2 = d.get("state");
                if (q.a(obj2, (Object) "create")) {
                    Object obj3 = d.get("type");
                    if (obj3 instanceof String) {
                        if (((CharSequence) obj3).length() != 0) {
                            z = false;
                        }
                        if (!z) {
                            c((String) obj, (String) obj3);
                            return;
                        }
                    }
                    com.taobao.tab2interact.core.utils.a.b(this, "BaseMessageObserver", "处理Tab状态发生改变的消息，type无效");
                    return;
                } else if (q.a(obj2, (Object) "start")) {
                    Object obj4 = d.get("changeType");
                    if (!(obj4 instanceof String)) {
                        com.taobao.tab2interact.core.utils.a.b(this, "BaseMessageObserver", "处理Tab状态发生改变的消息，changeType无效");
                        return;
                    } else {
                        a((String) obj, (String) obj4);
                        return;
                    }
                } else if (q.a(obj2, (Object) "stop")) {
                    Object obj5 = d.get("changeType");
                    if (!(obj5 instanceof String)) {
                        com.taobao.tab2interact.core.utils.a.b(this, "BaseMessageObserver", "处理Tab状态发生改变的消息，changeType无效");
                        return;
                    } else {
                        b((String) obj, (String) obj5);
                        return;
                    }
                } else if (q.a(obj2, (Object) "destroy")) {
                    c((String) obj);
                    return;
                } else {
                    com.taobao.tab2interact.core.utils.a.b(this, "BaseMessageObserver", "处理Tab状态发生改变的消息，state无效");
                    return;
                }
            }
        }
        com.taobao.tab2interact.core.utils.a.b(this, "BaseMessageObserver", "处理Tab状态发生改变的消息，id无效");
    }

    private final void d(sur surVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb00e20b", new Object[]{this, surVar});
            return;
        }
        JSONObject d = surVar.d();
        if (d == null) {
            return;
        }
        Object obj = d.get("urlQuery");
        if (!(obj instanceof Map)) {
            com.taobao.tab2interact.core.utils.a.b(this, "BaseMessageObserver", "处理页面URL参数发生改变的消息，urlQuery无效");
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (key instanceof String) {
                if ((((CharSequence) key).length() > 0) && (value instanceof String)) {
                    linkedHashMap.put(key, value);
                }
            }
        }
        if (linkedHashMap.isEmpty()) {
            com.taobao.tab2interact.core.utils.a.b(this, "BaseMessageObserver", "处理页面URL参数发生改变的消息，copyURLQuery为空");
        } else {
            a(linkedHashMap);
        }
    }

    private final void e(sur surVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b983e88c", new Object[]{this, surVar});
            return;
        }
        JSONObject d = surVar.d();
        if (d == null) {
            return;
        }
        Object obj = d.get("id");
        if (obj instanceof String) {
            if (!(((CharSequence) obj).length() == 0)) {
                Object obj2 = d.get("urlQuery");
                if (!(obj2 instanceof Map)) {
                    com.taobao.tab2interact.core.utils.a.b(this, "BaseMessageObserver", "处理Tab URL参数发生改变的消息，urlQuery无效");
                    return;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : ((Map) obj2).entrySet()) {
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    if (key instanceof String) {
                        if ((((CharSequence) key).length() > 0) && (value instanceof String)) {
                            linkedHashMap.put(key, value.toString());
                        }
                    }
                }
                if (linkedHashMap.isEmpty()) {
                    com.taobao.tab2interact.core.utils.a.b(this, "BaseMessageObserver", "处理Tab URL参数发生改变的消息，copyURLQuery为空");
                    return;
                } else {
                    a((String) obj, linkedHashMap);
                    return;
                }
            }
        }
        com.taobao.tab2interact.core.utils.a.b(this, "BaseMessageObserver", "处理Tab URL参数发生改变的消息，id无效");
    }

    public void bV_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d833b1b2", new Object[]{this});
        } else {
            com.taobao.tab2interact.core.utils.a.b(this, "BaseMessageObserver", "页面创建的时机");
        }
    }

    public void c_(String changeType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3dd59ed", new Object[]{this, changeType});
            return;
        }
        q.d(changeType, "changeType");
        com.taobao.tab2interact.core.utils.a.b(this, "BaseMessageObserver", "页面开启的时机，changeType=" + changeType);
    }

    public void b(String changeType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, changeType});
            return;
        }
        q.d(changeType, "changeType");
        com.taobao.tab2interact.core.utils.a.b(this, "BaseMessageObserver", "页面暂停的时机，changeType=" + changeType);
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
        } else {
            com.taobao.tab2interact.core.utils.a.b(this, "BaseMessageObserver", "页面销毁的时机");
        }
    }

    public void c(String tabId, String tabType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f277e37e", new Object[]{this, tabId, tabType});
            return;
        }
        q.d(tabId, "tabId");
        q.d(tabType, "tabType");
        com.taobao.tab2interact.core.utils.a.b(this, "BaseMessageObserver", "Tab创建的时机，tabId=" + tabId + "，tabType=" + tabType);
    }

    public void a(String tabId, String changeType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, tabId, changeType});
            return;
        }
        q.d(tabId, "tabId");
        q.d(changeType, "changeType");
        com.taobao.tab2interact.core.utils.a.b(this, "BaseMessageObserver", "Tab开启的时机，tabId=" + tabId + "，changeType=" + changeType);
    }

    public void b(String tabId, String changeType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, tabId, changeType});
            return;
        }
        q.d(tabId, "tabId");
        q.d(changeType, "changeType");
        com.taobao.tab2interact.core.utils.a.b(this, "BaseMessageObserver", "Tab暂停的时机，tabId=" + tabId + "，changeType=" + changeType);
    }

    public void c(String tabId) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, tabId});
            return;
        }
        q.d(tabId, "tabId");
        com.taobao.tab2interact.core.utils.a.b(this, "BaseMessageObserver", "Tab销毁的时机，tabId=" + tabId);
    }

    public void a(Map<String, String> pageURLQuery) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, pageURLQuery});
            return;
        }
        q.d(pageURLQuery, "pageURLQuery");
        com.taobao.tab2interact.core.utils.a.b(this, "BaseMessageObserver", "页面URL参数发生改变的时机，pageURLQuery=" + pageURLQuery);
    }

    public void a(String tabId, Map<String, String> tabURLQuery) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, tabId, tabURLQuery});
            return;
        }
        q.d(tabId, "tabId");
        q.d(tabURLQuery, "tabURLQuery");
        com.taobao.tab2interact.core.utils.a.b(this, "BaseMessageObserver", "Tab URL参数发生改变的时机，tabId=" + tabId + "，tabURLQuery=" + tabURLQuery);
    }
}
