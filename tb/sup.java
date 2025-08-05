package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import kotlin.collections.p;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.sur;

/* loaded from: classes8.dex */
public final class sup extends sur {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final String PAGE_STATE_CHANGE_ARGS_CHANGE_TYPE = "changeType";
    public static final String PAGE_STATE_CHANGE_ARGS_CHANGE_TYPE_NAVIGATION = "navigation";
    public static final String PAGE_STATE_CHANGE_ARGS_CHANGE_TYPE_OTHER = "other";
    public static final String PAGE_STATE_CHANGE_ARGS_STATE = "state";
    public static final String PAGE_STATE_CHANGE_ARGS_STATE_CREATE = "create";
    public static final String PAGE_STATE_CHANGE_ARGS_STATE_DESTROY = "destroy";
    public static final String PAGE_STATE_CHANGE_ARGS_STATE_START = "start";
    public static final String PAGE_STATE_CHANGE_ARGS_STATE_STOP = "stop";
    public static final String PAGE_STATE_CHANGE_NAME = "GIMSG_pageStateChange";
    public static final String PAGE_URL_QUERY_CHANGE_ARGS_URL_QUERY = "urlQuery";
    public static final String PAGE_URL_QUERY_CHANGE_NAME = "GIMSG_pageURLQueryChange";
    public static final String TAB_STATE_CHANGE_ARGS_CHANGE_TYPE = "changeType";
    public static final String TAB_STATE_CHANGE_ARGS_CHANGE_TYPE_NAVIGATION = "navigation";
    public static final String TAB_STATE_CHANGE_ARGS_CHANGE_TYPE_OTHER = "other";
    public static final String TAB_STATE_CHANGE_ARGS_CHANGE_TYPE_TAB = "tab";
    public static final String TAB_STATE_CHANGE_ARGS_ID = "id";
    public static final String TAB_STATE_CHANGE_ARGS_STATE = "state";
    public static final String TAB_STATE_CHANGE_ARGS_STATE_CREATE = "create";
    public static final String TAB_STATE_CHANGE_ARGS_STATE_DESTROY = "destroy";
    public static final String TAB_STATE_CHANGE_ARGS_STATE_START = "start";
    public static final String TAB_STATE_CHANGE_ARGS_STATE_STOP = "stop";
    public static final String TAB_STATE_CHANGE_ARGS_TYPE = "type";
    public static final String TAB_STATE_CHANGE_NAME = "GIMSG_tabStateChange";
    public static final String TAB_URL_QUERY_CHANGE_ARGS_ID = "id";
    public static final String TAB_URL_QUERY_CHANGE_ARGS_URL_QUERY = "urlQuery";
    public static final String TAB_URL_QUERY_CHANGE_NAME = "GIMSG_tabURLQueryChange";

    /* renamed from: a  reason: collision with root package name */
    private static final List<String> f33910a;

    public /* synthetic */ sup(String str, JSONObject jSONObject, long j, sur.a aVar, o oVar) {
        this(str, jSONObject, j, aVar);
    }

    public static final /* synthetic */ List a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("627608df", new Object[0]) : f33910a;
    }

    /* loaded from: classes8.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(682586543);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        public final sup a(String name, JSONObject jSONObject, long j, sur.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (sup) ipChange.ipc$dispatch("54e9c98f", new Object[]{this, name, jSONObject, new Long(j), aVar});
            }
            q.d(name, "name");
            com.taobao.tab2interact.core.utils.a.b(this, "BaseMessage", "解析基础消息实体，name=" + name + "，args=" + jSONObject + "，timestamp=" + j);
            if (!a(name)) {
                com.taobao.tab2interact.core.utils.a.b(this, "BaseMessage", "解析基础消息实体，非基础消息名");
                return null;
            }
            return new sup(name, jSONObject, j, aVar, null);
        }

        public final boolean a(String name) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, name})).booleanValue();
            }
            q.d(name, "name");
            return sup.a().contains(name);
        }
    }

    private sup(String str, JSONObject jSONObject, long j, sur.a aVar) {
        super(str, jSONObject, j, "Interact", "Interact", aVar);
    }

    static {
        kge.a(1092225831);
        Companion = new a(null);
        f33910a = p.b(PAGE_STATE_CHANGE_NAME, TAB_STATE_CHANGE_NAME, PAGE_URL_QUERY_CHANGE_NAME, TAB_URL_QUERY_CHANGE_NAME);
    }
}
