package com.taobao.mytaobao.newsetting.dx;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.lab.comfrm.core.Action;
import com.taobao.message.lab.comfrm.core.ActionDispatcher;
import com.taobao.message.lab.comfrm.core.Event;
import com.taobao.message.lab.comfrm.inner2.CommandHandler;
import com.taobao.message.lab.comfrm.inner2.EventHandler;
import com.taobao.message.lab.comfrm.inner2.ServiceProvider;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.mxr;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J.\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J0\u0010\u000f\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u0018\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/taobao/mytaobao/newsetting/dx/MTBSettingSwitchEventHandler;", "Lcom/taobao/message/lab/comfrm/inner2/EventHandler;", "()V", "mGeneralSettingOldLogicAdapter", "Lcom/taobao/mytaobao/newSettingV2/data/GeneralSettingOldLogicAdapter;", "afterSaved", "", "action", "Lcom/taobao/message/lab/comfrm/core/Action;", "actionDispatcher", "Lcom/taobao/message/lab/comfrm/core/ActionDispatcher;", "commandHandler", "Lcom/taobao/message/lab/comfrm/inner2/CommandHandler;", "serviceProvider", "Lcom/taobao/message/lab/comfrm/inner2/ServiceProvider;", "handle", "saveSwitch", "key", "", "isCheck", "", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public class e implements EventHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private com.taobao.mytaobao.newSettingV2.data.a f18433a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    /* loaded from: classes7.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ Action d;
        public final /* synthetic */ ActionDispatcher e;
        public final /* synthetic */ CommandHandler f;
        public final /* synthetic */ ServiceProvider g;

        public a(String str, boolean z, Action action, ActionDispatcher actionDispatcher, CommandHandler commandHandler, ServiceProvider serviceProvider) {
            this.b = str;
            this.c = z;
            this.d = action;
            this.e = actionDispatcher;
            this.f = commandHandler;
            this.g = serviceProvider;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            e.this.a(this.b, this.c);
            e.this.a(this.d, this.e, this.f, this.g);
        }
    }

    static {
        kge.a(1330700375);
        kge.a(778700337);
    }

    public void a(Action action, ActionDispatcher actionDispatcher, CommandHandler commandHandler, ServiceProvider serviceProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f841baa", new Object[]{this, action, actionDispatcher, commandHandler, serviceProvider});
        } else {
            q.c(action, "action");
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.EventHandler
    public void handle(Action action, ActionDispatcher actionDispatcher, CommandHandler commandHandler, ServiceProvider serviceProvider) {
        JSONObject jSONObject;
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b707af03", new Object[]{this, action, actionDispatcher, commandHandler, serviceProvider});
            return;
        }
        Boolean bool = null;
        Object data = action != null ? action.getData() : null;
        if (!(data instanceof JSONObject)) {
            data = null;
        }
        JSONObject jSONObject2 = (JSONObject) data;
        if (jSONObject2 == null || (jSONObject = jSONObject2.getJSONObject("settingItem")) == null || (string = jSONObject.getString("key")) == null) {
            return;
        }
        Map<String, Object> context = action.getContext();
        Object obj = context != null ? context.get("event") : null;
        if (!(obj instanceof Event)) {
            obj = null;
        }
        Event event = (Event) obj;
        Object data2 = event != null ? event.getData() : null;
        if (!(data2 instanceof Map)) {
            data2 = null;
        }
        Map map = (Map) data2;
        Object obj2 = map != null ? map.get("isOn") : null;
        if (obj2 instanceof Boolean) {
            bool = obj2;
        }
        Boolean bool2 = bool;
        if (bool2 == null) {
            return;
        }
        com.taobao.android.behavix.utils.e.a().post(new a(string, bool2.booleanValue(), action, actionDispatcher, commandHandler, serviceProvider));
    }

    public void a(String key, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ece2", new Object[]{this, key, new Boolean(z)});
            return;
        }
        q.c(key, "key");
        mxr.a(key, Boolean.valueOf(z));
        if (this.f18433a == null) {
            this.f18433a = new com.taobao.mytaobao.newSettingV2.data.a();
        }
        com.taobao.mytaobao.newSettingV2.data.a aVar = this.f18433a;
        if (aVar == null) {
            return;
        }
        aVar.a(key, z, true);
    }
}
