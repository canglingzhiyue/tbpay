package tb;

import com.alibaba.ability.localization.b;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorCode;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.lab.comfrm.StdActions;
import com.taobao.message.lab.comfrm.core.Action;
import com.taobao.message.lab.comfrm.core.ActionDispatcher;
import com.taobao.message.lab.comfrm.inner2.Command;
import com.taobao.message.lab.comfrm.inner2.Source;
import com.taobao.taobao.R;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u001e\u0010\t\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0016J2\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00112\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\u0014"}, d2 = {"Lcom/taobao/mytaobao/newsetting/dx/setting/MTBSettingResourceSource;", "Lcom/taobao/message/lab/comfrm/inner2/Source;", "Lcom/alibaba/fastjson/JSONObject;", "()V", ErrorCode.DEFAULT_WINDOW_FRAME_DISPOSE_EX, "", "subscribe", "actionDispatcher", "Lcom/taobao/message/lab/comfrm/core/ActionDispatcher;", "updateOriginalData", "updateAction", "Lcom/taobao/message/lab/comfrm/core/Action;", "originalData", "use", "command", "Lcom/taobao/message/lab/comfrm/inner2/Command;", "props", "", "", "", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class tfn implements Source<JSONObject> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-909352997);
        kge.a(-915263556);
    }

    public JSONObject a(Action action, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("138d2d0b", new Object[]{this, action, jSONObject});
        }
        return null;
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Source
    public void dispose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Source
    public void subscribe(ActionDispatcher actionDispatcher) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c519475", new Object[]{this, actionDispatcher});
        } else {
            q.c(actionDispatcher, "actionDispatcher");
        }
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, com.alibaba.fastjson.JSONObject] */
    @Override // com.taobao.message.lab.comfrm.inner2.Source
    public /* synthetic */ JSONObject updateOriginalData(Action action, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("bd3c4474", new Object[]{this, action, jSONObject}) : a(action, jSONObject);
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Source
    public void use(Command command, Map<String, Object> map, ActionDispatcher actionDispatcher) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1c59d34", new Object[]{this, command, map, actionDispatcher});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = jSONObject2;
        jSONObject3.put((JSONObject) "switchAccountBtTitle", b.a(R.string.mt_switchAccountBtTitle));
        jSONObject3.put((JSONObject) "logoutBtTitle", b.a(R.string.mt_logoutBtTitle));
        jSONObject.put((JSONObject) "resource", (String) jSONObject2);
        if (actionDispatcher == null) {
            return;
        }
        actionDispatcher.dispatch(new Action.Build(StdActions.UPDATE_ORIGINAL_DATA).data(jSONObject).build());
    }
}
