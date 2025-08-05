package tb;

import com.alibaba.ability.localization.b;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorCode;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.config.BHRTaskConfigBase;
import com.taobao.global.setting.c;
import com.taobao.global.setting.util.e;
import com.taobao.message.lab.comfrm.StdActions;
import com.taobao.message.lab.comfrm.core.Action;
import com.taobao.message.lab.comfrm.core.ActionDispatcher;
import com.taobao.message.lab.comfrm.inner2.Command;
import com.taobao.message.lab.comfrm.inner2.Source;
import com.taobao.mytaobao.newsetting.dx.c;
import com.taobao.tao.Globals;
import com.taobao.taobao.R;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.p;
import kotlin.jvm.internal.q;
import kotlin.text.n;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J \u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\fH\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0002J\u0010\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u000eH\u0002J\u0010\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u000eH\u0002J\u0010\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002H\u0016J,\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001d2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/taobao/mytaobao/newsetting/dx/video/WidgetVideoSettingSource;", "Lcom/taobao/message/lab/comfrm/inner2/Source;", "Lcom/alibaba/fastjson/JSONObject;", "()V", "actionDispatcher", "Lcom/taobao/message/lab/comfrm/core/ActionDispatcher;", "groupList", "Lcom/alibaba/fastjson/JSONArray;", "taobaoGlobalSettings", "Lcom/taobao/global/setting/TaobaoGlobalSettings;", "buildItem", "playType", "", "title", "", "autoPlayType", ErrorCode.DEFAULT_WINDOW_FRAME_DISPOSE_EX, "", "initData", "saveAutoPlayType", "selectedKey", "selectedItem", "subscribe", "updateOriginalData", "updateAction", "Lcom/taobao/message/lab/comfrm/core/Action;", "originalData", "use", "command", "Lcom/taobao/message/lab/comfrm/inner2/Command;", "props", "", "", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class tfq implements Source<JSONObject> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ActionDispatcher f34080a;
    private final JSONArray b = new JSONArray();
    private c c;

    static {
        kge.a(1335056230);
        kge.a(-915263556);
    }

    public JSONObject a(Action updateAction, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("138d2d0b", new Object[]{this, updateAction, jSONObject});
        }
        q.c(updateAction, "updateAction");
        return null;
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, com.alibaba.fastjson.JSONObject] */
    @Override // com.taobao.message.lab.comfrm.inner2.Source
    public /* synthetic */ JSONObject updateOriginalData(Action action, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("bd3c4474", new Object[]{this, action, jSONObject}) : a(action, jSONObject);
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Source
    public void subscribe(ActionDispatcher actionDispatcher) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c519475", new Object[]{this, actionDispatcher});
            return;
        }
        q.c(actionDispatcher, "actionDispatcher");
        this.f34080a = actionDispatcher;
        this.c = c.a(Globals.getApplication(), "mytaobao");
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Source
    public void dispose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
            return;
        }
        this.f34080a = null;
        this.c = null;
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Source
    public void use(Command command, Map<String, Object> props, ActionDispatcher actionDispatcher) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1c59d34", new Object[]{this, command, props, actionDispatcher});
            return;
        }
        q.c(command, "command");
        q.c(props, "props");
        q.c(actionDispatcher, "actionDispatcher");
        String name = command.getName();
        if (name == null) {
            return;
        }
        int hashCode = name.hashCode();
        if (hashCode != -106319668) {
            if (hashCode != 254455115 || !name.equals(StdActions.COMMAND_INIT_SOURCE)) {
                return;
            }
            a();
        } else if (!name.equals("changeSelect")) {
        } else {
            Object data = command.getData();
            if (!(data instanceof String)) {
                data = null;
            }
            String str = (String) data;
            if (str == null) {
                return;
            }
            a(str);
            b(str);
        }
    }

    private final void a() {
        int a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        c cVar = this.c;
        if (cVar == null) {
            return;
        }
        if (e.a(Globals.getApplication()).a("Global_App_Video_Play_Network_Type")) {
            a2 = cVar.b().a(0);
        } else {
            a2 = cVar.b().a(1);
        }
        cVar.c().a(a2);
        mxr.a("video", Integer.valueOf(a2));
        this.b.clear();
        JSONObject jSONObject = new JSONObject();
        this.b.add(jSONObject);
        JSONArray jSONArray = new JSONArray();
        jSONObject.put((JSONObject) "items", (String) jSONArray);
        jSONArray.add(a(1, b.a(R.string.mt_videoPlay4GAndWiFi), a2));
        jSONArray.add(a(0, b.a(R.string.mt_videoPlayWiFiOnly), a2));
        jSONArray.add(a(2, b.a(R.string.mt_videoPlayClose), a2));
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put((JSONObject) "settingItems", (String) this.b);
        ActionDispatcher actionDispatcher = this.f34080a;
        if (actionDispatcher == null) {
            return;
        }
        actionDispatcher.dispatch(new Action.Build(StdActions.UPDATE_ORIGINAL_DATA).data(jSONObject2).build());
    }

    private final JSONObject a(int i, String str, int i2) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b7980e1e", new Object[]{this, new Integer(i), str, new Integer(i2)});
        }
        if (i2 == i) {
            z = true;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) com.taobao.tao.infoflow.multitab.viewprovider.tablayout.panel.b.IS_CLICK, "true");
        String str2 = i != 1 ? i != 2 ? "VideoPlay-WIFI" : "VideoPlay-alloff" : "VideoPlay-allon";
        JSONObject jSONObject2 = new JSONObject();
        c.a aVar = com.taobao.mytaobao.newsetting.dx.c.Companion;
        JSONObject a2 = aVar.a("Page_TBGeneralSettingVC", "Page_TBGeneralSettingVC_Button-" + str2, jSONObject);
        jSONObject2.put((JSONObject) "click", (String) a2);
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = jSONObject3;
        jSONObject4.put((JSONObject) "key", "video_" + i);
        jSONObject4.put((JSONObject) "title", str);
        jSONObject4.put((JSONObject) "style", "selectStyle");
        JSONObject jSONObject5 = new JSONObject();
        JSONObject jSONObject6 = jSONObject5;
        jSONObject6.put((JSONObject) "selectStatus", (String) Boolean.valueOf(z));
        jSONObject6.put((JSONObject) "eventName", tfp.EVENT_HANDLER_SETTING_VIDEO);
        jSONObject4.put((JSONObject) "selectStyle", (String) jSONObject5);
        jSONObject4.put((JSONObject) BHRTaskConfigBase.TYPE_CONFIG_UT, (String) jSONObject2);
        if (z) {
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put((JSONObject) com.taobao.tao.infoflow.multitab.viewprovider.tablayout.panel.b.IS_CLICK, "false");
            JSONObject jSONObject8 = a2;
            jSONObject8.put((JSONObject) "args", (String) jSONObject7);
            com.taobao.mytaobao.newsetting.dx.c.Companion.a(a2, 2101);
            jSONObject8.put((JSONObject) "args", (String) jSONObject);
        }
        return jSONObject3;
    }

    private final void a(String str) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        Object i = p.i((List<? extends Object>) this.b);
        if (!(i instanceof JSONObject)) {
            i = null;
        }
        JSONObject jSONObject = (JSONObject) i;
        if (jSONObject == null || (jSONArray = jSONObject.getJSONArray("items")) == null) {
            return;
        }
        int size = jSONArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
            JSONObject jSONObject3 = jSONObject2.getJSONObject("selectStyle");
            if (jSONObject3 != null) {
                jSONObject3.put("selectStatus", (Object) Boolean.valueOf(q.a((Object) str, (Object) jSONObject2.getString("key"))));
            }
        }
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put((JSONObject) "settingItems", (String) this.b);
        ActionDispatcher actionDispatcher = this.f34080a;
        if (actionDispatcher == null) {
            return;
        }
        actionDispatcher.dispatch(new Action.Build(StdActions.UPDATE_ORIGINAL_DATA).data(jSONObject4).build());
    }

    private final void b(String str) {
        kta c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        Integer d = n.d(String.valueOf(str.charAt(str.length() - 1)));
        if (d == null) {
            return;
        }
        int intValue = d.intValue();
        if (intValue != 1 && intValue != 0 && intValue != 2) {
            return;
        }
        com.taobao.global.setting.c cVar = this.c;
        if (cVar != null && (c = cVar.c()) != null) {
            c.a(intValue);
        }
        mxr.a("video", Integer.valueOf(intValue));
    }
}
