package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.sur;

/* loaded from: classes8.dex */
public final class esx extends sur {
    public static final a Companion;

    static {
        kge.a(-52739);
        Companion = new a(null);
    }

    public /* synthetic */ esx(String str, JSONObject jSONObject, long j, String str2, String str3, sur.a aVar, o oVar) {
        this(str, jSONObject, j, str2, str3, aVar);
    }

    /* loaded from: classes8.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1224047355);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        public final esx a(Map<Object, ? extends Object> map, Map<Object, ? extends Object> map2, long j, String sender, String receiver, sur.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (esx) ipChange.ipc$dispatch("764d9989", new Object[]{this, map, map2, new Long(j), sender, receiver, aVar});
            }
            q.d(sender, "sender");
            q.d(receiver, "receiver");
            com.taobao.tab2interact.core.utils.a.b(this, "LiveTabMessage", "解析直播Tab消息实体，timestamp=" + j + "，sender=" + sender + "，receiver=" + receiver);
            if ((q.a((Object) sender, (Object) "Interact") && q.a((Object) receiver, (Object) "Interact")) || ((!q.a((Object) sender, (Object) "Interact")) && (!q.a((Object) receiver, (Object) "Interact")))) {
                return null;
            }
            Object obj = map != null ? map.get("type") : null;
            if (TextUtils.isEmpty(String.valueOf(obj))) {
                com.taobao.tab2interact.core.utils.a.b(this, "LiveTabMessage", "解析直播Tab消息实体，type为空，返回空");
                return null;
            }
            String str = "LIVEMSG_" + obj;
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = jSONObject;
            jSONObject2.put((JSONObject) "msg", (String) map);
            if (map2 != null) {
                jSONObject2.put((JSONObject) "params", (String) map2);
            }
            return new esx(str, jSONObject, j, sender, receiver, aVar, null);
        }
    }

    private esx(String str, JSONObject jSONObject, long j, String str2, String str3, sur.a aVar) {
        super(str, jSONObject, j, str2, str3, aVar);
    }
}
