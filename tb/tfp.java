package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.lab.comfrm.core.Action;
import com.taobao.message.lab.comfrm.core.ActionDispatcher;
import com.taobao.message.lab.comfrm.inner2.Command;
import com.taobao.message.lab.comfrm.inner2.CommandHandler;
import com.taobao.message.lab.comfrm.inner2.EventHandler;
import com.taobao.message.lab.comfrm.inner2.ServiceProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.o;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005¢\u0006\u0002\u0010\u0002J0\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016¨\u0006\u000e"}, d2 = {"Lcom/taobao/mytaobao/newsetting/dx/video/DXVideoSettingEventHandler;", "Lcom/taobao/message/lab/comfrm/inner2/EventHandler;", "()V", "handle", "", "action", "Lcom/taobao/message/lab/comfrm/core/Action;", "actionDispatcher", "Lcom/taobao/message/lab/comfrm/core/ActionDispatcher;", "commandHandler", "Lcom/taobao/message/lab/comfrm/inner2/CommandHandler;", "serviceProvider", "Lcom/taobao/message/lab/comfrm/inner2/ServiceProvider;", "Companion", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class tfp implements EventHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final String EVENT_HANDLER_SETTING_VIDEO = "eventhandler.mtb.widget.setting.video";

    static {
        kge.a(-1945923189);
        kge.a(778700337);
        Companion = new a(null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/taobao/mytaobao/newsetting/dx/video/DXVideoSettingEventHandler$Companion;", "", "()V", "EVENT_HANDLER_SETTING_VIDEO", "", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes7.dex */
    public static final class a {
        static {
            kge.a(-2093004013);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.EventHandler
    public void handle(Action action, ActionDispatcher actionDispatcher, CommandHandler commandHandler, ServiceProvider serviceProvider) {
        JSONObject jSONObject;
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b707af03", new Object[]{this, action, actionDispatcher, commandHandler, serviceProvider});
        } else if (mxx.a()) {
        } else {
            Object data = action != null ? action.getData() : null;
            if (!(data instanceof JSONObject)) {
                data = null;
            }
            JSONObject jSONObject2 = (JSONObject) data;
            if (jSONObject2 == null || (jSONObject = jSONObject2.getJSONObject("settingItem")) == null || (string = jSONObject.getString("key")) == null) {
                return;
            }
            Command build = new Command.Build("getVideoItems", "changeSelect").data(string).build();
            if (commandHandler == null) {
                return;
            }
            commandHandler.handle(build);
        }
    }
}
