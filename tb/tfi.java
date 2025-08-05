package tb;

import android.content.SharedPreferences;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorCode;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.global.setting.util.d;
import com.taobao.message.lab.comfrm.StdActions;
import com.taobao.message.lab.comfrm.core.Action;
import com.taobao.message.lab.comfrm.core.ActionDispatcher;
import com.taobao.message.lab.comfrm.inner2.Command;
import com.taobao.message.lab.comfrm.inner2.Source;
import com.taobao.utils.Global;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0016J\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0016J2\u0010\u000f\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00132\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010\u0016\u001a\u00020\u0002H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/taobao/mytaobao/newsetting/dx/general/MTBGeneralSettingStatusSource;", "Lcom/taobao/message/lab/comfrm/inner2/Source;", "Lcom/alibaba/fastjson/JSONObject;", "()V", "isFirst", "", ErrorCode.DEFAULT_WINDOW_FRAME_DISPOSE_EX, "", "subscribe", "actionDispatcher", "Lcom/taobao/message/lab/comfrm/core/ActionDispatcher;", "updateOriginalData", "updateAction", "Lcom/taobao/message/lab/comfrm/core/Action;", "originalData", "use", "command", "Lcom/taobao/message/lab/comfrm/inner2/Command;", "props", "", "", "", "userSettingItemShowConfig", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class tfi implements Source<JSONObject> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f34077a = true;

    static {
        kge.a(-176934581);
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
        Map<String, Object> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1c59d34", new Object[]{this, command, map, actionDispatcher});
            return;
        }
        if (q.a((Object) (command != null ? command.getName() : null), (Object) "updateStatus") && this.f34077a) {
            this.f34077a = false;
            return;
        }
        JSONObject jSONObject = new JSONObject();
        SharedPreferences a3 = d.a();
        q.a((Object) a3, "SettingStateUtils.getUserSettingStateTable()");
        jSONObject.putAll(a3.getAll());
        com.taobao.global.setting.d a4 = com.taobao.global.setting.d.a();
        q.a((Object) a4, "GlobalEnv.getInstance()");
        if (a4.b() && (a2 = ssk.a()) != null) {
            jSONObject.putAll(a2);
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = jSONObject2;
        jSONObject3.put((JSONObject) "settingItemStatus", (String) jSONObject);
        jSONObject3.put((JSONObject) "settingItemShowConfig", (String) a());
        if (actionDispatcher == null) {
            return;
        }
        actionDispatcher.dispatch(new Action.Build(StdActions.UPDATE_ORIGINAL_DATA).data(jSONObject2).build());
    }

    private final JSONObject a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("709f7788", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((JSONObject) mxr.KEY_FONT_SIZE, (String) Boolean.valueOf(mxr.a()));
        jSONObject2.put((JSONObject) mxr.KEY_NETWORK_DIAGNOSE, (String) Boolean.valueOf(mxr.c()));
        jSONObject2.put((JSONObject) mxr.KEY_NETWORK_SPEEDUP, (String) Boolean.valueOf(mxr.d()));
        jSONObject2.put((JSONObject) mxr.KEY_LIVE_BACKGROUND_PLAY, (String) Boolean.valueOf(mxr.b()));
        jSONObject2.put((JSONObject) mxr.KEY_VISIT_OFTEN_SHOP, (String) Boolean.valueOf(mxr.k()));
        jSONObject2.put((JSONObject) mxr.KEY_VISIT_OFTEN_LIVE, (String) Boolean.valueOf(mxr.l()));
        jSONObject2.put((JSONObject) "ocr", (String) Boolean.valueOf(mxr.e()));
        jSONObject2.put((JSONObject) mxr.KEY_ASSISTANT, (String) Boolean.valueOf(mxr.f()));
        jSONObject2.put((JSONObject) mxr.KEY_TAOBAO_HELPER, (String) Boolean.valueOf(mxr.h()));
        jSONObject2.put((JSONObject) mxr.KEY_TMALL_NOTIFY, (String) Boolean.valueOf(mxr.i()));
        jSONObject2.put((JSONObject) mxr.KEY_VOICE_ASSISTANT, (String) Boolean.valueOf(mxr.j()));
        jSONObject2.put((JSONObject) mxr.KEY_WIFI_AUTO_DOWNLOAD, (String) Boolean.valueOf(mxr.m()));
        jSONObject2.put((JSONObject) "mute", (String) Boolean.valueOf(mxr.g()));
        jSONObject2.put((JSONObject) "ocr", (String) Boolean.valueOf(mxq.a(Global.getApplication())));
        return jSONObject;
    }
}
