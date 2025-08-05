package com.taobao.mytaobao.newsetting.dx;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.lab.comfrm.core.Action;
import com.taobao.message.lab.comfrm.core.ActionDispatcher;
import com.taobao.message.lab.comfrm.inner2.CommandHandler;
import com.taobao.message.lab.comfrm.inner2.EventHandler;
import com.taobao.message.lab.comfrm.inner2.ServiceProvider;
import com.taobao.statistic.TBS;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.text.n;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005¢\u0006\u0002\u0010\u0002J0\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016¨\u0006\u000e"}, d2 = {"Lcom/taobao/mytaobao/newsetting/dx/DXUtEventHandler;", "Lcom/taobao/message/lab/comfrm/inner2/EventHandler;", "()V", "handle", "", "action", "Lcom/taobao/message/lab/comfrm/core/Action;", "actionDispatcher", "Lcom/taobao/message/lab/comfrm/core/ActionDispatcher;", "commandHandler", "Lcom/taobao/message/lab/comfrm/inner2/CommandHandler;", "serviceProvider", "Lcom/taobao/message/lab/comfrm/inner2/ServiceProvider;", "Companion", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class c implements EventHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    static {
        kge.a(-1239375167);
        kge.a(778700337);
        Companion = new a(null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rJ*\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0001J*\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0001¨\u0006\u000e"}, d2 = {"Lcom/taobao/mytaobao/newsetting/dx/DXUtEventHandler$Companion;", "", "()V", "buildParam", "Lcom/alibaba/fastjson/JSONObject;", "pageName", "", "arg1", "args", "commitEvent", "", "userTrack", "eventId", "", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(87609545);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        public final JSONObject a(String pageName, String arg1, JSONObject args) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("2c6d2814", new Object[]{this, pageName, arg1, args});
            }
            q.c(pageName, "pageName");
            q.c(arg1, "arg1");
            q.c(args, "args");
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = jSONObject;
            jSONObject2.put((JSONObject) "page", pageName);
            jSONObject2.put((JSONObject) "point", arg1);
            jSONObject2.put((JSONObject) "args", (String) args);
            return jSONObject;
        }

        public final void a(JSONObject userTrack, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4a78e87b", new Object[]{this, userTrack, new Integer(i)});
                return;
            }
            q.c(userTrack, "userTrack");
            String string = userTrack.getString("page");
            if (string == null) {
                return;
            }
            String string2 = userTrack.getString("point");
            if (string2 == null) {
                string2 = "";
            }
            a(string, i, string2, userTrack.getJSONObject("args"));
        }

        public final void a(String pageName, String eventId, String arg1, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c1617aa2", new Object[]{this, pageName, eventId, arg1, obj});
                return;
            }
            q.c(pageName, "pageName");
            q.c(eventId, "eventId");
            q.c(arg1, "arg1");
            a aVar = this;
            Integer d = n.d(eventId);
            aVar.a(pageName, d != null ? d.intValue() : 2101, arg1, obj);
        }

        public final void a(String pageName, int i, String arg1, Object obj) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a69833b7", new Object[]{this, pageName, new Integer(i), arg1, obj});
                return;
            }
            q.c(pageName, "pageName");
            q.c(arg1, "arg1");
            if (obj instanceof JSONObject) {
                TBS.Ext.commitEvent(pageName, i, arg1, null, null, com.taobao.mytaobao.ut.c.a((JSONObject) obj));
                return;
            }
            String[] strArr = new String[1];
            if (obj == null || (str = obj.toString()) == null) {
                str = "";
            }
            strArr[0] = str;
            TBS.Ext.commitEvent(pageName, i, arg1, null, null, strArr);
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.EventHandler
    public void handle(Action action, ActionDispatcher actionDispatcher, CommandHandler commandHandler, ServiceProvider serviceProvider) {
        JSONObject jSONObject;
        Object obj;
        int intValue;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b707af03", new Object[]{this, action, actionDispatcher, commandHandler, serviceProvider});
            return;
        }
        Object data = action != null ? action.getData() : null;
        if (!(data instanceof JSONObject)) {
            data = null;
        }
        JSONObject jSONObject2 = (JSONObject) data;
        if (jSONObject2 == null || (jSONObject = jSONObject2.getJSONObject("params")) == null || (obj = jSONObject2.get("eventId")) == null) {
            return;
        }
        q.a(obj, "data[\"eventId\"] ?: return");
        if (obj instanceof Integer) {
            intValue = ((Number) obj).intValue();
        } else {
            Integer d = n.d(obj.toString());
            intValue = d != null ? d.intValue() : 2101;
        }
        Companion.a(jSONObject, intValue);
    }
}
