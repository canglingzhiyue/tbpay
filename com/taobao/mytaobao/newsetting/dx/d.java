package com.taobao.mytaobao.newsetting.dx;

import com.alibaba.ability.localization.constants.Language;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorCode;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.message.lab.comfrm.StdActions;
import com.taobao.message.lab.comfrm.core.Action;
import com.taobao.message.lab.comfrm.core.ActionDispatcher;
import com.taobao.message.lab.comfrm.inner2.Command;
import com.taobao.message.lab.comfrm.inner2.Source;
import com.taobao.tao.Globals;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import com.taobao.tao.util.TaoHelper;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.ai;
import kotlin.jvm.internal.q;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;
import tb.mxk;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0016J\n\u0010\f\u001a\u0004\u0018\u00010\tH\u0002J\u0012\u0010\r\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0002J\u0012\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\tH\u0002J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0007H\u0002J\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001a\u0010\u0014\u001a\u00020\u000b2\u0010\u0010\u0015\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0016H\u0002J\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002H\u0016J,\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001f0\u00162\u0006\u0010\u0004\u001a\u00020\u0005H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/taobao/mytaobao/newsetting/dx/DxSettingCommonSource;", "Lcom/taobao/message/lab/comfrm/inner2/Source;", "Lcom/alibaba/fastjson/JSONObject;", "()V", "actionDispatcher", "Lcom/taobao/message/lab/comfrm/core/ActionDispatcher;", "isNeedHideLoading", "", "snapshotKey", "", ErrorCode.DEFAULT_WINDOW_FRAME_DISPOSE_EX, "", "getSnapshotKey", "loadDefaultSettingItems", "bundleName", "sendData", "apiResult", "sendEmptyData", "showLoading", "subscribe", "updateData", "mtopParams", "", "updateOriginalData", "updateAction", "Lcom/taobao/message/lab/comfrm/core/Action;", "originalData", "use", "command", "Lcom/taobao/message/lab/comfrm/inner2/Command;", "props", "", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class d implements Source<JSONObject> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private ActionDispatcher f18431a;
    private String b;
    private boolean c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    /* loaded from: classes7.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Map b;

        public a(Map map) {
            d.this = r1;
            this.b = map;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                d dVar = d.this;
                Map map = this.b;
                Object obj = map != null ? map.get("mtopParams") : null;
                if (!(obj instanceof Map)) {
                    obj = null;
                }
                d.a(dVar, (Map) obj);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    static {
        kge.a(684231748);
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

    public static final /* synthetic */ String a(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c126258d", new Object[]{dVar}) : dVar.a();
    }

    public static final /* synthetic */ void a(d dVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85f167d", new Object[]{dVar, str});
        } else {
            dVar.b(str);
        }
    }

    public static final /* synthetic */ void a(d dVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("457f63b2", new Object[]{dVar, map});
        } else {
            dVar.a(map);
        }
    }

    public static final /* synthetic */ void a(d dVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("173e5dc1", new Object[]{dVar, new Boolean(z)});
        } else {
            dVar.a(z);
        }
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
        this.f18431a = actionDispatcher;
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Source
    public void dispose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
        } else {
            this.f18431a = null;
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Source
    public void use(Command command, Map<String, ? extends Object> props, ActionDispatcher actionDispatcher) {
        Object obj;
        Object obj2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1c59d34", new Object[]{this, command, props, actionDispatcher});
            return;
        }
        q.c(command, "command");
        q.c(props, "props");
        q.c(actionDispatcher, "actionDispatcher");
        String name = command.getName();
        if (name == null || name.hashCode() != 254455115 || !name.equals(StdActions.COMMAND_INIT_SOURCE)) {
            return;
        }
        Object obj3 = props.get("settingItemsSource");
        String str = null;
        if (!(obj3 instanceof Map)) {
            obj3 = null;
        }
        Map map = (Map) obj3;
        Object obj4 = map != null ? map.get("snapshot") : null;
        if (!(obj4 instanceof Map)) {
            obj4 = null;
        }
        Map map2 = (Map) obj4;
        this.b = (map2 == null || (obj2 = map2.get("filePath")) == null) ? null : obj2.toString();
        if (map2 != null && (obj = map2.get("bundleName")) != null) {
            str = obj.toString();
        }
        a(str);
        VExecutors.defaultSharedThreadPool().submit(new a(map));
    }

    private final void a(Map<?, ?> map) {
        Object obj;
        String obj2;
        Object obj3;
        String obj4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else if (map == null || (obj = map.get("api")) == null || (obj2 = obj.toString()) == null || (obj3 = map.get("version")) == null || (obj4 = obj3.toString()) == null) {
        } else {
            Object obj5 = map.get("params");
            if (!(obj5 instanceof Map)) {
                obj5 = null;
            }
            Map map2 = (Map) obj5;
            if (map2 == null) {
                map2 = ai.a();
            }
            MtopRequest mtopRequest = new MtopRequest();
            mtopRequest.setApiName(obj2);
            mtopRequest.setVersion(obj4);
            mtopRequest.setData(JSONObject.toJSONString(map2));
            RemoteBusiness mo1337addListener = RemoteBusiness.build(mtopRequest, TaoHelper.getTTID()).mo1337addListener((MtopListener) new IRemoteBaseListener() { // from class: com.taobao.mytaobao.newsetting.dx.DxSettingCommonSource$updateData$remoteBusiness$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
                /* loaded from: classes7.dex */
                public static final class a implements Runnable {
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* renamed from: a  reason: collision with root package name */
                    public final /* synthetic */ String f18428a;
                    public final /* synthetic */ String b;

                    public a(String str, String str2) {
                        this.f18428a = str;
                        this.b = str2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            com.taobao.mytaobao.newSettingV2.a.INSTANCE.a(this.f18428a, this.b);
                        }
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj6) {
                    IpChange ipChange2 = $ipChange;
                    boolean z = true;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj6});
                        return;
                    }
                    byte[] bytedata = mtopResponse != null ? mtopResponse.getBytedata() : null;
                    if (bytedata == null) {
                        return;
                    }
                    String str = new String(bytedata, kotlin.text.d.UTF_8);
                    String a2 = d.a(d.this);
                    String str2 = a2;
                    if (str2 != null && str2.length() != 0) {
                        z = false;
                    }
                    if (!z) {
                        Coordinator.execute(new a(a2, str));
                    }
                    d.a(d.this, str);
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj6) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj6});
                    } else {
                        d.a(d.this, false);
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj6) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj6});
                    } else {
                        d.a(d.this, false);
                    }
                }
            });
            mo1337addListener.mo1328setUnitStrategy("UNIT_TRADE");
            mo1337addListener.startRequest();
        }
    }

    private final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        String str2 = null;
        String a2 = a();
        String str3 = a2;
        if (!(str3 == null || str3.length() == 0)) {
            str2 = com.taobao.mytaobao.newSettingV2.a.INSTANCE.a(a2);
        }
        String str4 = str2;
        if (str4 == null || str4.length() == 0) {
            String str5 = str;
            if (!(str5 == null || str5.length() == 0) && com.alibaba.ability.localization.b.a() == Language.SIMPLIFIED_CHINESE && q.a((Object) com.alibaba.ability.localization.b.d(), (Object) "CN")) {
                str2 = mxk.a(Globals.getApplication(), "mtbsettings/" + str);
            }
        }
        String str6 = str2;
        if (str6 == null || str6.length() == 0) {
            this.c = true;
            a(true);
            return;
        }
        this.c = false;
        b(str2);
    }

    private final String a() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        String str = this.b;
        String str2 = str;
        if (str2 == null || str2.length() == 0) {
            z = true;
        }
        if (z) {
            return null;
        }
        return str + "_" + com.alibaba.ability.localization.b.d() + "_" + com.alibaba.ability.localization.b.a();
    }

    private final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (!z && !this.c) {
        } else {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) "isRequestingWhenInvalidSetting", (String) Boolean.valueOf(z));
            ActionDispatcher actionDispatcher = this.f18431a;
            if (actionDispatcher == null) {
                return;
            }
            actionDispatcher.dispatch(new Action.Build(StdActions.UPDATE_ORIGINAL_DATA).data(jSONObject).build());
        }
    }

    private final void b(String str) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        JSONObject parseObject = JSON.parseObject(str);
        if (parseObject == null || (jSONObject = parseObject.getJSONObject("data")) == null) {
            jSONObject = new JSONObject();
        }
        jSONObject.put((JSONObject) "isRequestingWhenInvalidSetting", (String) false);
        ActionDispatcher actionDispatcher = this.f18431a;
        if (actionDispatcher == null) {
            return;
        }
        actionDispatcher.dispatch(new Action.Build(StdActions.UPDATE_ORIGINAL_DATA).data(jSONObject).build());
    }
}
