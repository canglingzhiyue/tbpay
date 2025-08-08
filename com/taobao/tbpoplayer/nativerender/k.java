package com.taobao.tbpoplayer.nativerender;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.widget.Toast;
import anetwork.channel.NetworkEvent;
import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.entity.RequestImpl;
import anetwork.channel.entity.StringParam;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.poplayer.PopLayer;
import com.alibaba.poplayer.layermanager.PopRequest;
import com.alibaba.poplayer.track.UserResultTrack;
import com.alibaba.poplayer.track.module.ActionLineModule;
import com.alibaba.poplayer.trigger.BaseConfigItem;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.ei;
import com.taobao.tao.TaoPackageInfo;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.tbpoplayer.nativerender.dsl.ActionModel;
import com.taobao.tbpoplayer.nativerender.dsl.ActionsItemModel;
import com.taobao.tbpoplayer.nativerender.dsl.ComponentBaseModel;
import com.taobao.tbpoplayer.nativerender.dsl.ConditionModel;
import com.taobao.tbpoplayer.nativerender.k;
import com.taobao.tbpoplayer.view.jsbridge.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.intf.Mtop;
import tb.cab;
import tb.jao;
import tb.jzb;
import tb.kge;
import tb.qnu;
import tb.qnw;

/* loaded from: classes8.dex */
public class k {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_USER_RESULT_CANCEL = "cancel";
    public static final String ACTION_USER_RESULT_CLICK = "click";

    /* loaded from: classes8.dex */
    public static class a {

        /* renamed from: a */
        public e f22234a;
        public PopRequest b;
        public ComponentBaseModel c;
        public String d;
        public ActionModel e;
        public b f;
        public boolean g;
        public com.taobao.tbpoplayer.view.jsbridge.a h;
        public String i;
        public String j;
        public int k;

        static {
            kge.a(2134831496);
        }

        public a(h hVar, ComponentBaseModel componentBaseModel, String str, ActionModel actionModel, boolean z, b bVar) {
            this.f22234a = hVar.m();
            this.b = hVar.k();
            this.c = componentBaseModel;
            this.d = str;
            this.e = actionModel;
            this.g = z;
            this.f = bVar;
            this.h = new com.taobao.tbpoplayer.view.jsbridge.a(hVar.l());
        }
    }

    /* loaded from: classes8.dex */
    public interface b {
        void a(a aVar);

        void a(a aVar, String str, String str2);
    }

    /* loaded from: classes8.dex */
    public interface c {
        void onActionsFinished();
    }

    static {
        kge.a(1846560243);
    }

    public static /* synthetic */ void a(NetworkEvent.FinishEvent finishEvent, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("260f11f8", new Object[]{finishEvent, obj});
        }
    }

    /* renamed from: lambda$MDVO3TO1zpk3FtZJFOi-_KU-QQg */
    public static /* synthetic */ void m1455lambda$MDVO3TO1zpk3FtZJFOi_KUQQg(String str, boolean z, String str2, a aVar) {
        a(str, z, str2, aVar);
    }

    public static /* synthetic */ void a(h hVar, ComponentBaseModel componentBaseModel, String str, Collection collection, Map map, JSONArray jSONArray, ActionLineModule actionLineModule, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab98b556", new Object[]{hVar, componentBaseModel, str, collection, map, jSONArray, actionLineModule, cVar});
        } else {
            b(hVar, componentBaseModel, str, collection, map, jSONArray, actionLineModule, cVar);
        }
    }

    public static /* synthetic */ void a(h hVar, boolean z, ActionModel actionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("335237b3", new Object[]{hVar, new Boolean(z), actionModel});
        } else {
            b(hVar, z, actionModel);
        }
    }

    public static /* synthetic */ void a(a aVar, JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd67c9d7", new Object[]{aVar, jSONObject, str});
        } else {
            b(aVar, jSONObject, str);
        }
    }

    public static /* synthetic */ void a(a aVar, JSONObject jSONObject, boolean z, String str, boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2768371", new Object[]{aVar, jSONObject, new Boolean(z), str, new Boolean(z2), new Boolean(z3)});
        } else {
            b(aVar, jSONObject, z, str, z2, z3);
        }
    }

    public static /* synthetic */ void a(AtomicInteger atomicInteger, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14e77b6b", new Object[]{atomicInteger, cVar});
        } else {
            b(atomicInteger, cVar);
        }
    }

    public static /* synthetic */ boolean a(a aVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("73ef7951", new Object[]{aVar, jSONObject})).booleanValue() : c(aVar, jSONObject);
    }

    public static void a(final h hVar, final ComponentBaseModel componentBaseModel, final String str, final ActionModel actionModel, final List<ActionsItemModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e09b09a", new Object[]{hVar, componentBaseModel, str, actionModel, list});
        } else if (hVar == null || componentBaseModel == null || StringUtils.isEmpty(str)) {
        } else {
            hVar.m().b(new Runnable() { // from class: com.taobao.tbpoplayer.nativerender.-$$Lambda$k$GlzyGbF3tKqE2K10dyIJ2EnRusQ
                @Override // java.lang.Runnable
                public final void run() {
                    k.a(ActionModel.this, hVar, componentBaseModel, str, list);
                }
            });
        }
    }

    public static /* synthetic */ void a(ActionModel actionModel, h hVar, ComponentBaseModel componentBaseModel, String str, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e175756", new Object[]{actionModel, hVar, componentBaseModel, str, list});
            return;
        }
        if (actionModel != null) {
            try {
                if (actionModel.isValid()) {
                    a(hVar, componentBaseModel, str, actionModel);
                }
            } catch (Throwable th) {
                com.alibaba.poplayer.utils.c.a("PopAction.handleAction.error", th);
                return;
            }
        }
        if (list != null && !list.isEmpty()) {
            a(hVar, componentBaseModel, str, list);
        }
    }

    private static void a(final h hVar, ComponentBaseModel componentBaseModel, String str, final ActionModel actionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6c195a9", new Object[]{hVar, componentBaseModel, str, actionModel});
            return;
        }
        try {
            if (!str.equals(actionModel.type)) {
                return;
            }
            com.alibaba.poplayer.utils.c.a("PopAction.doSingleAction.actionType=%s.componentModel=%s.actionBehavior=%s", str, componentBaseModel.id, actionModel.behavior);
            com.alibaba.poplayer.trigger.d k = hVar.k();
            if (actionModel.neverShow) {
                k.w();
            } else if (actionModel.countTire == null || Boolean.TRUE.equals(actionModel.countTire)) {
                k.v();
            }
            final JSONObject s = hVar.s();
            a aVar = new a(hVar, componentBaseModel, str, actionModel, false, new b() { // from class: com.taobao.tbpoplayer.nativerender.k.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tbpoplayer.nativerender.k.b
                public void a(a aVar2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b7cfce03", new Object[]{this, aVar2});
                        return;
                    }
                    k.a(aVar2, s, "");
                    k.a(hVar, true, actionModel);
                }

                @Override // com.taobao.tbpoplayer.nativerender.k.b
                public void a(a aVar2, String str2, String str3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3db7d97", new Object[]{this, aVar2, str2, str3});
                        return;
                    }
                    k.a(aVar2, s, str2);
                    k.a(hVar, false, actionModel);
                }
            });
            d a2 = hVar.m().a();
            aVar.i = a2.m();
            aVar.j = a2.n();
            aVar.k = a2.o();
            if (!c(aVar) || !actionModel.autoClose) {
                return;
            }
            hVar.m().a("AutoCloseAfterAction", "", false, new j(hVar.m(), componentBaseModel.id, str, actionModel.behavior, ""));
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("PopAction.doSingleAction.error.", th);
        }
    }

    private static void b(a aVar, JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bde991b6", new Object[]{aVar, jSONObject, str});
        } else if (aVar == null || aVar.e == null) {
        } else {
            ActionModel actionModel = aVar.e;
            if (actionModel.countTire != null) {
                z = actionModel.countTire.booleanValue();
            }
            jSONObject.put("countTire", (Object) Boolean.valueOf(z));
            String str2 = aVar.c != null ? aVar.c.id : "";
            jSONObject.put("componentId", (Object) str2);
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("actionBehavior", (Object) actionModel.behavior);
            jSONObject2.put("actionExceptionMessage", (Object) str);
            arrayList.add(jSONObject2);
            jSONObject.put(com.taobao.tao.flexbox.layoutmanager.container.b.KEY_ACTIONS, (Object) arrayList);
            String str3 = aVar.e.userResult;
            if (!StringUtils.isEmpty(str3)) {
                if ("click".equals(str3)) {
                    UserResultTrack.a(aVar.b, UserResultTrack.USER_RESULT_CLICK_ACTION, z, jSONObject);
                    return;
                } else if ("cancel".equals(str3)) {
                    UserResultTrack.a(aVar.b, UserResultTrack.USER_RESULT_CANCEL_ACTION, z, jSONObject);
                    return;
                }
            }
            if (b(aVar)) {
                UserResultTrack.a(aVar.b, UserResultTrack.USER_RESULT_CANCEL_ACTION, z, jSONObject);
            } else if ("click".equals(aVar.d)) {
                UserResultTrack.a(aVar.b, UserResultTrack.USER_RESULT_CLICK_ACTION, z, jSONObject);
            } else if ("scene".equals(aVar.d)) {
                UserResultTrack.a(aVar.b, UserResultTrack.USER_RESULT_SCENE_ACTION, z, jSONObject);
            }
            d a2 = aVar.f22234a.a();
            ActionLineModule actionLineModule = new ActionLineModule(aVar.i, aVar.j, aVar.k);
            actionLineModule.d = z;
            actionLineModule.e = aVar.d;
            ActionLineModule.ActionItem actionItem = new ActionLineModule.ActionItem();
            actionItem.f3202a = actionModel.id;
            actionItem.c = str;
            actionItem.d = str2;
            ActionLineModule.ActionExecuteItem actionExecuteItem = new ActionLineModule.ActionExecuteItem();
            actionExecuteItem.f3201a = actionModel.behavior;
            actionExecuteItem.b = str;
            actionItem.b = new ArrayList();
            actionItem.b.add(actionExecuteItem);
            actionLineModule.f = new ArrayList();
            actionLineModule.f.add(actionItem);
            cab.b(a2.C(), a2.D(), a2.E(), a2.G(), actionLineModule);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:97:0x0084 A[Catch: Throwable -> 0x0110, TryCatch #0 {Throwable -> 0x0110, blocks: (B:71:0x0020, B:72:0x0024, B:74:0x002a, B:76:0x0032, B:78:0x0038, B:84:0x0045, B:86:0x0050, B:94:0x0071, B:95:0x007e, B:97:0x0084, B:99:0x008c, B:101:0x0092, B:103:0x009a, B:104:0x00a0, B:87:0x0058, B:89:0x005c, B:93:0x0069), top: B:109:0x0020 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(final com.taobao.tbpoplayer.nativerender.h r15, final com.taobao.tbpoplayer.nativerender.dsl.ComponentBaseModel r16, final java.lang.String r17, java.util.List<com.taobao.tbpoplayer.nativerender.dsl.ActionsItemModel> r18) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tbpoplayer.nativerender.k.a(com.taobao.tbpoplayer.nativerender.h, com.taobao.tbpoplayer.nativerender.dsl.ComponentBaseModel, java.lang.String, java.util.List):void");
    }

    public static /* synthetic */ void a(h hVar, ComponentBaseModel componentBaseModel, JSONObject jSONObject, String str, ActionsItemModel actionsItemModel, ActionLineModule actionLineModule, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdd489b5", new Object[]{hVar, componentBaseModel, jSONObject, str, actionsItemModel, actionLineModule, jSONArray});
        } else {
            a(hVar.m(), hVar.k(), componentBaseModel, jSONObject, str, actionsItemModel, actionLineModule, jSONArray);
        }
    }

    private static void b(h hVar, ComponentBaseModel componentBaseModel, String str, Collection<String> collection, Map<String, ActionModel> map, JSONArray jSONArray, ActionLineModule actionLineModule, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4a6e257", new Object[]{hVar, componentBaseModel, str, collection, map, jSONArray, actionLineModule, cVar});
        } else if (collection == null || collection.isEmpty()) {
            cVar.onActionsFinished();
        } else {
            AtomicInteger atomicInteger = new AtomicInteger(collection.size());
            for (String str2 : collection) {
                ActionModel actionModel = map.get(str2);
                AtomicInteger atomicInteger2 = atomicInteger;
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(actionModel, jSONArray, actionLineModule, atomicInteger, cVar, hVar, componentBaseModel, str, map);
                if (actionModel == null) {
                    b(atomicInteger2, cVar);
                } else {
                    boolean a2 = com.taobao.tbpoplayer.nativerender.b.a(actionModel.preCondition, hVar.m(), false);
                    com.alibaba.poplayer.utils.c.a("PopAction.doMultiActions.iterateActionTree.action=%s.shouldDoAction=%s.", actionModel.id, Boolean.valueOf(a2));
                    if (!a2) {
                        ActionLineModule.ActionExecuteItem actionExecuteItem = new ActionLineModule.ActionExecuteItem();
                        actionExecuteItem.f3201a = actionModel.behavior;
                        actionExecuteItem.b = "preConditionRestrict";
                        actionLineModule.f.get(0).b.add(actionExecuteItem);
                        b(atomicInteger2, cVar);
                    } else if (!c(new a(hVar, componentBaseModel, str, actionModel, true, anonymousClass4))) {
                        b(atomicInteger2, cVar);
                    }
                }
                atomicInteger = atomicInteger2;
            }
        }
    }

    /* renamed from: com.taobao.tbpoplayer.nativerender.k$4 */
    /* loaded from: classes8.dex */
    public static class AnonymousClass4 implements b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public final /* synthetic */ ActionModel f22232a;
        public final /* synthetic */ JSONArray b;
        public final /* synthetic */ AtomicInteger c;
        public final /* synthetic */ c d;
        public final /* synthetic */ h e;
        public final /* synthetic */ ComponentBaseModel f;
        public final /* synthetic */ String g;
        public final /* synthetic */ Map h;
        public final /* synthetic */ ActionLineModule i;

        public static /* synthetic */ void lambda$ctK3drKhAGnK81E0A_0RQxwvVmo(AtomicInteger atomicInteger, c cVar) {
            b(atomicInteger, cVar);
        }

        public static /* synthetic */ void lambda$q9eIZhnwX7s52Hv8oU7L90vFtzo(AtomicInteger atomicInteger, c cVar) {
            a(atomicInteger, cVar);
        }

        public AnonymousClass4(ActionModel actionModel, JSONArray jSONArray, ActionLineModule actionLineModule, AtomicInteger atomicInteger, c cVar, h hVar, ComponentBaseModel componentBaseModel, String str, Map map) {
            this.f22232a = actionModel;
            this.b = jSONArray;
            this.i = actionLineModule;
            this.c = atomicInteger;
            this.d = cVar;
            this.e = hVar;
            this.f = componentBaseModel;
            this.g = str;
            this.h = map;
        }

        @Override // com.taobao.tbpoplayer.nativerender.k.b
        public void a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b7cfce03", new Object[]{this, aVar});
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("actionBehavior", (Object) this.f22232a.behavior);
                jSONObject.put("actionExceptionMessage", (Object) "");
                this.b.add(jSONObject);
                ActionLineModule.ActionExecuteItem actionExecuteItem = new ActionLineModule.ActionExecuteItem();
                actionExecuteItem.f3201a = this.f22232a.behavior;
                actionExecuteItem.b = "";
                this.i.f.get(0).b.add(actionExecuteItem);
                if (this.f22232a.nextActions != null && !this.f22232a.nextActions.isEmpty()) {
                    h hVar = this.e;
                    ComponentBaseModel componentBaseModel = this.f;
                    String str = this.g;
                    List<String> list = this.f22232a.nextActions;
                    Map map = this.h;
                    JSONArray jSONArray = this.b;
                    ActionLineModule actionLineModule = this.i;
                    final AtomicInteger atomicInteger = this.c;
                    final c cVar = this.d;
                    k.a(hVar, componentBaseModel, str, list, map, jSONArray, actionLineModule, new c() { // from class: com.taobao.tbpoplayer.nativerender.-$$Lambda$k$4$ctK3drKhAGnK81E0A_0RQxwvVmo
                        @Override // com.taobao.tbpoplayer.nativerender.k.c
                        public final void onActionsFinished() {
                            k.AnonymousClass4.lambda$ctK3drKhAGnK81E0A_0RQxwvVmo(atomicInteger, cVar);
                        }
                    });
                    return;
                }
                k.a(this.c, this.d);
            } catch (Throwable th) {
                com.alibaba.poplayer.utils.c.a("PopAction.iterateActionTree.onSuccess.error.", th);
            }
        }

        public static /* synthetic */ void b(AtomicInteger atomicInteger, c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7742924a", new Object[]{atomicInteger, cVar});
            } else {
                k.a(atomicInteger, cVar);
            }
        }

        @Override // com.taobao.tbpoplayer.nativerender.k.b
        public void a(a aVar, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3db7d97", new Object[]{this, aVar, str, str2});
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("actionBehavior", (Object) this.f22232a.behavior);
                jSONObject.put("actionExceptionMessage", (Object) str);
                this.b.add(jSONObject);
                ActionLineModule.ActionExecuteItem actionExecuteItem = new ActionLineModule.ActionExecuteItem();
                actionExecuteItem.f3201a = this.f22232a.behavior;
                actionExecuteItem.b = str;
                this.i.f.get(0).b.add(actionExecuteItem);
                List<String> list = (this.f22232a.fallbackActions == null || this.f22232a.fallbackActions.isEmpty()) ? this.f22232a.fallbackNextActions : this.f22232a.fallbackActions;
                if (list != null && !list.isEmpty()) {
                    h hVar = this.e;
                    ComponentBaseModel componentBaseModel = this.f;
                    String str3 = this.g;
                    Map map = this.h;
                    JSONArray jSONArray = this.b;
                    ActionLineModule actionLineModule = this.i;
                    final AtomicInteger atomicInteger = this.c;
                    final c cVar = this.d;
                    k.a(hVar, componentBaseModel, str3, list, map, jSONArray, actionLineModule, new c() { // from class: com.taobao.tbpoplayer.nativerender.-$$Lambda$k$4$q9eIZhnwX7s52Hv8oU7L90vFtzo
                        @Override // com.taobao.tbpoplayer.nativerender.k.c
                        public final void onActionsFinished() {
                            k.AnonymousClass4.lambda$q9eIZhnwX7s52Hv8oU7L90vFtzo(atomicInteger, cVar);
                        }
                    });
                    return;
                }
                k.a(this.c, this.d);
            } catch (Throwable th) {
                com.alibaba.poplayer.utils.c.a("PopAction.iterateActionTree.onFail.error.", th);
            }
        }

        public static /* synthetic */ void a(AtomicInteger atomicInteger, c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("14e77b6b", new Object[]{atomicInteger, cVar});
            } else {
                k.a(atomicInteger, cVar);
            }
        }
    }

    private static void b(AtomicInteger atomicInteger, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7742924a", new Object[]{atomicInteger, cVar});
        } else if (atomicInteger.decrementAndGet() != 0) {
        } else {
            cVar.onActionsFinished();
        }
    }

    private static void a(e eVar, PopRequest popRequest, ComponentBaseModel componentBaseModel, JSONObject jSONObject, String str, ActionsItemModel actionsItemModel, ActionLineModule actionLineModule, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("490a57e6", new Object[]{eVar, popRequest, componentBaseModel, jSONObject, str, actionsItemModel, actionLineModule, jSONArray});
            return;
        }
        if (actionsItemModel.countTire != null) {
            z = actionsItemModel.countTire.booleanValue();
        }
        jSONObject.put("countTire", (Object) Boolean.valueOf(z));
        jSONObject.put("componentId", (Object) (componentBaseModel != null ? componentBaseModel.id : ""));
        jSONObject.put(com.taobao.tao.flexbox.layoutmanager.container.b.KEY_ACTIONS, (Object) jSONArray);
        String str2 = actionsItemModel.userResult;
        if (!StringUtils.isEmpty(str2)) {
            if ("click".equals(str2)) {
                UserResultTrack.a(popRequest, UserResultTrack.USER_RESULT_CLICK_ACTION, z, jSONObject);
                return;
            } else if ("cancel".equals(str2)) {
                UserResultTrack.a(popRequest, UserResultTrack.USER_RESULT_CANCEL_ACTION, z, jSONObject);
                return;
            }
        }
        if ("click".equals(str)) {
            UserResultTrack.a(popRequest, UserResultTrack.USER_RESULT_CLICK_ACTION, z, jSONObject);
        } else if ("scene".equals(str)) {
            UserResultTrack.a(popRequest, UserResultTrack.USER_RESULT_SCENE_ACTION, z, jSONObject);
        }
        d a2 = eVar.a();
        cab.b(a2.C(), a2.D(), a2.E(), a2.G(), actionLineModule);
    }

    private static boolean b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("52709088", new Object[]{aVar})).booleanValue() : aVar != null && aVar.e != null && "close".equals(aVar.e.behavior) && "click".equals(aVar.d);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0089, code lost:
        if (r1.equals("goto") != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean c(com.taobao.tbpoplayer.nativerender.k.a r7) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tbpoplayer.nativerender.k.c(com.taobao.tbpoplayer.nativerender.k$a):boolean");
    }

    private static void b(h hVar, boolean z, ActionModel actionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13d3ff92", new Object[]{hVar, new Boolean(z), actionModel});
            return;
        }
        String str = null;
        try {
            if (z) {
                if (!StringUtils.isEmpty(actionModel.withToast)) {
                    str = p.a(hVar.m(), actionModel.withToast);
                }
            } else if (!StringUtils.isEmpty(actionModel.fallbackToast)) {
                str = p.a(hVar.m(), actionModel.fallbackToast);
            }
            qnu.a(hVar.m(), str);
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("PopAction.doWithToast.error.", th);
        }
    }

    private static boolean d(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("87b2158a", new Object[]{aVar})).booleanValue();
        }
        ActionModel actionModel = aVar.e;
        String str = actionModel.target;
        e eVar = aVar.f22234a;
        String a2 = p.a(eVar, actionModel.content);
        if ("app".equals(str)) {
            if (StringUtils.isEmpty(a2)) {
                return false;
            }
            String b2 = eVar.b(a2);
            eVar.a(m(aVar));
            aVar.h.a(b2, (a.InterfaceC0922a) null);
        } else if ("url".equals(str)) {
            if (StringUtils.isEmpty(a2)) {
                return false;
            }
            eVar.a(m(aVar));
            aVar.h.a(a2, "allowJumpOut", (a.InterfaceC0922a) null);
        } else if ("market".equals(str)) {
            eVar.a(m(aVar));
            aVar.h.a(a2, "market", (a.InterfaceC0922a) null);
        } else {
            if (aVar.f != null) {
                aVar.f.a(aVar, "gotoTargetTypeInvalid", "");
            }
            return false;
        }
        if (aVar.f != null) {
            aVar.f.a(aVar);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.List] */
    private static boolean e(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2252d80b", new Object[]{aVar})).booleanValue();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ActionModel actionModel = aVar.e;
        try {
            arrayList2 = (List) JSON.parseObject(actionModel.target, new TypeReference<List<String>>() { // from class: com.taobao.tbpoplayer.nativerender.k.5
            }, new Feature[0]);
        } catch (Throwable unused) {
            arrayList2.add(actionModel.target);
        }
        JSONObject parseObject = JSONObject.parseObject(actionModel.content);
        if (parseObject != null) {
            String string = parseObject.getString("targetGroupStates");
            if (!StringUtils.isEmpty(string)) {
                try {
                    arrayList = (List) JSON.parseObject(string, new TypeReference<List<String>>() { // from class: com.taobao.tbpoplayer.nativerender.k.6
                    }, new Feature[0]);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
            if (arrayList2 == null || arrayList2.isEmpty()) {
                String string2 = parseObject.getString("targetStates");
                if (!StringUtils.isEmpty(string2)) {
                    try {
                        arrayList2 = (List) JSON.parseObject(string2, new TypeReference<List<String>>() { // from class: com.taobao.tbpoplayer.nativerender.k.7
                        }, new Feature[0]);
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                    }
                }
            }
        }
        String string3 = parseObject != null ? parseObject.getString(com.taobao.android.fluid.framework.data.remote.c.KEY_SWITCH_MODE) : "";
        Boolean bool = parseObject != null ? parseObject.getBoolean("excludeSelf") : Boolean.FALSE;
        aVar.f22234a.a(m(aVar));
        if (aVar.f22234a.a(arrayList, arrayList2, com.taobao.android.weex_framework.util.a.ATOM_EXT_random.equals(string3), Boolean.TRUE.equals(bool))) {
            if (aVar.f != null) {
                aVar.f.a(aVar);
            }
            return true;
        }
        aVar.f22234a.a("SwitchStateError", "", !aVar.g ? aVar.e.fallbackToast : "");
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean f(final com.taobao.tbpoplayer.nativerender.k.a r6) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.tbpoplayer.nativerender.k.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L19
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r3] = r6
            java.lang.String r6 = "bcf39a8c"
            java.lang.Object r6 = r0.ipc$dispatch(r6, r1)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            return r6
        L19:
            com.taobao.tbpoplayer.nativerender.dsl.ActionModel r0 = r6.e     // Catch: java.lang.Throwable -> L42
            java.lang.String r0 = r0.content     // Catch: java.lang.Throwable -> L42
            com.alibaba.fastjson.JSONObject r0 = com.alibaba.fastjson.JSON.parseObject(r0)     // Catch: java.lang.Throwable -> L42
            com.taobao.tbpoplayer.nativerender.e r1 = r6.f22234a     // Catch: java.lang.Throwable -> L42
            java.lang.String r4 = "text"
            java.lang.String r4 = r0.getString(r4)     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = com.taobao.tbpoplayer.nativerender.p.a(r1, r4)     // Catch: java.lang.Throwable -> L42
            java.lang.String r4 = "long"
            java.lang.String r5 = "duration"
            java.lang.String r5 = r0.getString(r5)     // Catch: java.lang.Throwable -> L42
            boolean r4 = r4.equals(r5)     // Catch: java.lang.Throwable -> L42
            java.lang.String r5 = "iconUrl"
            java.lang.String r0 = r0.getString(r5)     // Catch: java.lang.Throwable -> L43
            goto L4f
        L42:
            r4 = 0
        L43:
            com.taobao.tbpoplayer.nativerender.e r0 = r6.f22234a
            com.taobao.tbpoplayer.nativerender.dsl.ActionModel r1 = r6.e
            java.lang.String r1 = r1.content
            java.lang.String r1 = com.taobao.tbpoplayer.nativerender.p.a(r0, r1)
            java.lang.String r0 = ""
        L4f:
            boolean r3 = tb.qnu.a(r1, r3)
            if (r3 == 0) goto L63
            com.taobao.tbpoplayer.nativerender.e r3 = r6.f22234a
            if (r3 == 0) goto L63
            com.taobao.tbpoplayer.nativerender.e r3 = r6.f22234a
            com.taobao.tbpoplayer.nativerender.-$$Lambda$k$MDVO3TO1zpk3FtZJFOi-_KU-QQg r5 = new com.taobao.tbpoplayer.nativerender.-$$Lambda$k$MDVO3TO1zpk3FtZJFOi-_KU-QQg
            r5.<init>()
            r3.a(r5)
        L63:
            com.taobao.tbpoplayer.nativerender.k$b r0 = r6.f
            if (r0 == 0) goto L6c
            com.taobao.tbpoplayer.nativerender.k$b r0 = r6.f
            r0.a(r6)
        L6c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tbpoplayer.nativerender.k.f(com.taobao.tbpoplayer.nativerender.k$a):boolean");
    }

    public static /* synthetic */ void a(String str, boolean z, String str2, a aVar) {
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aadbafc7", new Object[]{str, new Boolean(z), str2, aVar});
            return;
        }
        try {
            jao a2 = jao.a();
            if (a2 != null) {
                ei eiVar = new ei();
                eiVar.f8841a = str;
                eiVar.b = z ? 3500.0d : 2000.0d;
                eiVar.e = str2;
                a2.a(eiVar, new jzb() { // from class: com.taobao.tbpoplayer.nativerender.PopAction$6
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.jzb, tb.gml
                    public void a(ErrorResult errorResult) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("57a5ed5e", new Object[]{this, errorResult});
                        }
                    }
                });
                return;
            }
            Context a3 = aVar.f22234a.a().a();
            if (!z) {
                i = 0;
            }
            Toast.makeText(a3, str, i).show();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private static boolean g(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57945d0d", new Object[]{aVar})).booleanValue();
        }
        aVar.f22234a.f();
        if (aVar.f != null) {
            aVar.f.a(aVar);
        }
        return true;
    }

    private static boolean h(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2351f8e", new Object[]{aVar})).booleanValue();
        }
        aVar.f22234a.g();
        if (aVar.f != null) {
            aVar.f.a(aVar);
        }
        return true;
    }

    private static boolean i(a aVar) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8cd5e20f", new Object[]{aVar})).booleanValue();
        }
        JSONObject parseObject = JSONObject.parseObject(aVar.e.content);
        if (parseObject != null) {
            z = parseObject.getBooleanValue("interruptable");
        }
        e eVar = aVar.f22234a;
        eVar.a("handleClose." + aVar.e.type, "", z, m(aVar));
        if (aVar.f != null) {
            aVar.f.a(aVar);
        }
        return true;
    }

    private static boolean j(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2776a490", new Object[]{aVar})).booleanValue();
        }
        boolean b2 = aVar.f22234a.b(aVar.e.target, aVar.e.content);
        if (aVar.f != null) {
            aVar.f.a(aVar);
        }
        return b2;
    }

    private static boolean k(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c2176711", new Object[]{aVar})).booleanValue();
        }
        if (aVar.g) {
            if (aVar.f != null) {
                aVar.f.a(aVar, "RequestTypeOnActions", "");
            }
            return false;
        }
        return a(aVar, true);
    }

    private static boolean l(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cb82992", new Object[]{aVar})).booleanValue();
        }
        if (!aVar.g) {
            if (aVar.f != null) {
                aVar.f.a(aVar, "Request2TypeOnAction", "");
            }
            return false;
        }
        return a(aVar, false);
    }

    private static boolean a(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("422aa535", new Object[]{aVar, new Boolean(z)})).booleanValue();
        }
        ActionModel actionModel = aVar.e;
        JSONObject parseObject = JSON.parseObject(actionModel.content);
        if ("mtop".equals(actionModel.target)) {
            return a(aVar, parseObject, z, true);
        }
        if ("windvane".equals(actionModel.target)) {
            return b(aVar, parseObject, z, true);
        }
        if (aVar.f != null) {
            aVar.f.a(aVar, "requestTargetTypeInvalid", "");
        }
        return false;
    }

    public static void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7cfce03", new Object[]{aVar});
        } else if (aVar != null && aVar.e != null && aVar.e.extraRequests != null && !aVar.e.extraRequests.isEmpty()) {
            try {
                JSONArray jSONArray = aVar.e.extraRequests;
                for (int i = 0; i < jSONArray.size(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    if (jSONObject != null) {
                        String string = jSONObject.getString("type");
                        JSONObject jSONObject2 = jSONObject.getJSONObject("content");
                        if ("mtop".equals(string)) {
                            a(aVar, jSONObject2, false, false);
                        } else if ("windvane".equals(string)) {
                            b(aVar, jSONObject2, false, false);
                        } else if ("https".equals(string)) {
                            b(aVar, jSONObject2);
                        }
                    }
                }
            } catch (Throwable th) {
                com.alibaba.poplayer.utils.c.a("PopAction.handleActionAppend.error.", th);
            }
        }
    }

    private static boolean a(a aVar, JSONObject jSONObject, boolean z, boolean z2) {
        boolean z3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("360cb491", new Object[]{aVar, jSONObject, new Boolean(z), new Boolean(z2)})).booleanValue();
        }
        String string = jSONObject.getString("dataId");
        String string2 = jSONObject.getString("requestMethod");
        String string3 = jSONObject.getString("requestAddress");
        String string4 = jSONObject.getString("requestVer");
        String string5 = jSONObject.getString("version");
        String string6 = jSONObject.getString("requestParams");
        boolean booleanValue = jSONObject.getBooleanValue("needWua");
        boolean booleanValue2 = jSONObject.getBooleanValue("needLogin");
        String string7 = jSONObject.getString("safeToken");
        e eVar = aVar.f22234a;
        String a2 = p.a(eVar, string6);
        if (StringUtils.isEmpty(string) || StringUtils.isEmpty(string3) || StringUtils.isEmpty(a2)) {
            if (z2 && aVar.f != null) {
                aVar.f.a(aVar, "paramInvalid", "");
            }
            return false;
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName(string3);
        if (StringUtils.isEmpty(string4)) {
            string4 = !StringUtils.isEmpty(string5) ? string5 : "1.0";
        }
        mtopRequest.setVersion(string4);
        mtopRequest.setNeedEcode(booleanValue2);
        mtopRequest.setData(a2);
        BaseConfigItem c2 = com.alibaba.poplayer.trigger.d.c(aVar.b);
        MtopBusiness mo1305reqMethod = MtopBusiness.build(Mtop.instance(Mtop.Id.INNER, PopLayer.getReference().getApp()), mtopRequest, TaoPackageInfo.getTTID()).registerListener((IRemoteListener) new PopAction$7(booleanValue2, c2, c2.embed, eVar, aVar, jSONObject, z, z2, string)).mo1342showLoginUI(booleanValue2).mo1305reqMethod("GET".equals(string2) ? MethodEnum.GET : MethodEnum.POST);
        if (booleanValue) {
            mo1305reqMethod.mo1335useWua();
        }
        if (!StringUtils.isEmpty(string7)) {
            mo1305reqMethod.mo1289addHttpQueryParameter("asac", string7);
        }
        if (booleanValue2) {
            z3 = true;
            c2.embed = true;
        } else {
            z3 = true;
        }
        mo1305reqMethod.startRequest();
        return z3;
    }

    private static boolean b(a aVar, JSONObject jSONObject, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("14001a70", new Object[]{aVar, jSONObject, new Boolean(z), new Boolean(z2)})).booleanValue();
        }
        String string = jSONObject.getString("dataId");
        String string2 = jSONObject.getString("requestWindvaneFuncName");
        String string3 = jSONObject.getString("requestParams");
        e eVar = aVar.f22234a;
        String a2 = p.a(eVar, string3);
        if (StringUtils.isEmpty(string) || StringUtils.isEmpty(string2) || StringUtils.isEmpty(a2)) {
            if (z2 && aVar.f != null) {
                aVar.f.a(aVar, "paramInvalid", "");
            }
            return false;
        }
        eVar.d().a(string2, a2, "", new AnonymousClass9(eVar, string, aVar, jSONObject, z, z2));
        return true;
    }

    /* renamed from: com.taobao.tbpoplayer.nativerender.k$9 */
    /* loaded from: classes8.dex */
    public static class AnonymousClass9 implements qnw.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public final /* synthetic */ e f22233a;
        public final /* synthetic */ String b;
        public final /* synthetic */ a c;
        public final /* synthetic */ JSONObject d;
        public final /* synthetic */ boolean e;
        public final /* synthetic */ boolean f;

        public static /* synthetic */ void lambda$otOKXD6T_w2v_74DQbQcFks6T30(String str, e eVar, String str2, a aVar, JSONObject jSONObject, boolean z, boolean z2) {
            a(str, eVar, str2, aVar, jSONObject, z, z2);
        }

        public static /* synthetic */ void lambda$qjlBFjgNMh9h9kym2KJaXoZsTXk(a aVar, JSONObject jSONObject, String str, boolean z, boolean z2) {
            a(aVar, jSONObject, str, z, z2);
        }

        public AnonymousClass9(e eVar, String str, a aVar, JSONObject jSONObject, boolean z, boolean z2) {
            this.f22233a = eVar;
            this.b = str;
            this.c = aVar;
            this.d = jSONObject;
            this.e = z;
            this.f = z2;
        }

        @Override // tb.qnw.a
        public void a(final String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
                return;
            }
            final e eVar = this.f22233a;
            final String str2 = this.b;
            final a aVar = this.c;
            final JSONObject jSONObject = this.d;
            final boolean z = this.e;
            final boolean z2 = this.f;
            eVar.b(new Runnable() { // from class: com.taobao.tbpoplayer.nativerender.-$$Lambda$k$9$otOKXD6T_w2v_74DQbQcFks6T30
                @Override // java.lang.Runnable
                public final void run() {
                    k.AnonymousClass9.lambda$otOKXD6T_w2v_74DQbQcFks6T30(str, eVar, str2, aVar, jSONObject, z, z2);
                }
            });
        }

        public static /* synthetic */ void a(String str, e eVar, String str2, a aVar, JSONObject jSONObject, boolean z, boolean z2) {
            JSONObject parseObject;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2cc1affb", new Object[]{str, eVar, str2, aVar, jSONObject, new Boolean(z), new Boolean(z2)});
                return;
            }
            try {
                if (!StringUtils.isEmpty(str) && (parseObject = JSON.parseObject(str)) != null && !parseObject.isEmpty()) {
                    eVar.a(str2, parseObject);
                }
                if (k.a(aVar, jSONObject)) {
                    k.a(aVar, jSONObject, true, "", z, z2);
                } else {
                    k.a(aVar, jSONObject, false, "WindvaneOnSuccessCheckFail", z, z2);
                }
            } catch (Throwable th) {
                com.alibaba.poplayer.utils.c.a("dealPreFetchMTOP.parseObject.responseContent.error.", th);
                k.a(aVar, jSONObject, false, "WindvaneOnSuccessCatchError", z, z2);
            }
        }

        @Override // tb.qnw.a
        public void b(final String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
                return;
            }
            e eVar = this.f22233a;
            final a aVar = this.c;
            final JSONObject jSONObject = this.d;
            final boolean z = this.e;
            final boolean z2 = this.f;
            eVar.b(new Runnable() { // from class: com.taobao.tbpoplayer.nativerender.-$$Lambda$k$9$qjlBFjgNMh9h9kym2KJaXoZsTXk
                @Override // java.lang.Runnable
                public final void run() {
                    k.AnonymousClass9.lambda$qjlBFjgNMh9h9kym2KJaXoZsTXk(k.a.this, jSONObject, str, z, z2);
                }
            });
        }

        public static /* synthetic */ void a(a aVar, JSONObject jSONObject, String str, boolean z, boolean z2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("22b30a97", new Object[]{aVar, jSONObject, str, new Boolean(z), new Boolean(z2)});
                return;
            }
            k.a(aVar, jSONObject, false, "WindvaneOnFailed.result=" + str, z, z2);
        }
    }

    private static void b(a aVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cf0caec", new Object[]{aVar, jSONObject});
            return;
        }
        try {
            String string = jSONObject.getString("address");
            String string2 = jSONObject.getString("method");
            String string3 = jSONObject.getString("params");
            String a2 = p.a(aVar.f22234a, string);
            String a3 = p.a(aVar.f22234a, string3);
            if (!StringUtils.isEmpty(a2) && a2.startsWith("https")) {
                DegradableNetwork degradableNetwork = new DegradableNetwork(PopLayer.getReference().internalGetCurrentActivity());
                RequestImpl requestImpl = new RequestImpl(a2);
                if (!StringUtils.isEmpty(a3)) {
                    JSONObject parseObject = JSONObject.parseObject(a3);
                    ArrayList arrayList = new ArrayList();
                    for (String str : parseObject.keySet()) {
                        arrayList.add(new StringParam(str, parseObject.getString(str)));
                    }
                    requestImpl.setParams(arrayList);
                }
                if ("GET".equals(string2)) {
                    requestImpl.setMethod("GET");
                } else if ("POST".equals(string2)) {
                    requestImpl.setMethod("POST");
                }
                degradableNetwork.asyncSend(requestImpl, null, null, $$Lambda$k$bcpZQmT_8hVvNu1G_wP2EmPwajw.INSTANCE);
            }
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("PopAction.sendHttps.error.", th);
        }
    }

    private static boolean c(a aVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a5f21c8f", new Object[]{aVar, jSONObject})).booleanValue();
        }
        try {
            if (!jSONObject.containsKey("requestSuccessJudge")) {
                return true;
            }
            return com.taobao.tbpoplayer.nativerender.b.a((ConditionModel) jSONObject.getObject("requestSuccessJudge", ConditionModel.class), aVar.f22234a, false);
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("PopAction.onRequestActionSuccess.parseConditionModel.error.", th);
            return false;
        }
    }

    private static void b(a aVar, JSONObject jSONObject, boolean z, String str, boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2130bb32", new Object[]{aVar, jSONObject, new Boolean(z), str, new Boolean(z2), new Boolean(z3)});
        } else if (z) {
            if (z2) {
                d(aVar, jSONObject);
            }
            if (!z3 || aVar.f == null) {
                return;
            }
            aVar.f.a(aVar);
        } else {
            if (z2) {
                e(aVar, jSONObject);
            }
            if (!z3 || aVar.f == null) {
                return;
            }
            aVar.f.a(aVar, str, "");
        }
    }

    private static void d(a aVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bef36e2a", new Object[]{aVar, jSONObject});
            return;
        }
        try {
            e eVar = aVar.f22234a;
            String string = jSONObject.getString("afterRequestSuccess");
            if ("toastText".equals(string)) {
                if (!StringUtils.isEmpty(aVar.e.withToast)) {
                    com.alibaba.poplayer.utils.c.a("PopAction.onRequestActionSuccess.shouldUseWithToast.return", new Object[0]);
                    return;
                }
                String a2 = p.a(eVar, jSONObject.getString("toastText"));
                if (StringUtils.isEmpty(a2)) {
                    return;
                }
                qnu.a(eVar, a2);
                eVar.a("ToastAndCloseAfterRequestSuccess", "", false, m(aVar));
            } else if ("close".equals(string)) {
                eVar.a("CloseAfterRequestSuccess", "", false, m(aVar));
            } else {
                List<String> list = null;
                if ("jumpUrl".equals(string)) {
                    String a3 = p.a(eVar, jSONObject.getString("jumpUrl"));
                    if (StringUtils.isEmpty(a3)) {
                        return;
                    }
                    eVar.a(m(aVar));
                    aVar.h.a(a3, (a.InterfaceC0922a) null);
                } else if (!"switchState".equals(string)) {
                } else {
                    String string2 = jSONObject.getString("switchStateGroup");
                    String string3 = jSONObject.getString("switchState");
                    List<String> list2 = !StringUtils.isEmpty(string2) ? (List) JSON.parseObject(string2, new TypeReference<ArrayList<String>>() { // from class: com.taobao.tbpoplayer.nativerender.k.10
                    }.getType(), new Feature[0]) : null;
                    if (!StringUtils.isEmpty(string3)) {
                        list = (List) JSON.parseObject(string3, new TypeReference<ArrayList<String>>() { // from class: com.taobao.tbpoplayer.nativerender.k.2
                        }.getType(), new Feature[0]);
                    }
                    if (eVar.a(list2, list, false, false)) {
                        aVar.f22234a.a(m(aVar));
                    } else {
                        eVar.a("CloseAfterRequestSuccessSwitchStateError", "", aVar.e.fallbackToast);
                    }
                }
            }
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("PopAction.onRequestActionSuccess.error.", th);
        }
    }

    private static void e(a aVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7f4bfc9", new Object[]{aVar, jSONObject});
            return;
        }
        try {
            e eVar = aVar.f22234a;
            String string = jSONObject.getString("afterRequestFail");
            if ("errToastText".equals(string)) {
                if (!StringUtils.isEmpty(aVar.e.fallbackToast)) {
                    com.alibaba.poplayer.utils.c.a("PopAction.onRequestActionFailed.shouldUseFallbackToast.return", new Object[0]);
                    return;
                }
                String a2 = p.a(eVar, jSONObject.getString("errToastText"));
                if (StringUtils.isEmpty(a2)) {
                    return;
                }
                qnu.a(eVar, a2);
                eVar.a("ToastAndCloseAfterRequestFailed", "", false, m(aVar));
            } else if ("close".equals(string)) {
                eVar.a("CloseAfterRequestFailed", "", false, m(aVar));
            } else {
                List<String> list = null;
                if ("errJumpUrl".equals(string)) {
                    String a3 = p.a(eVar, jSONObject.getString("errJumpUrl"));
                    if (StringUtils.isEmpty(a3)) {
                        return;
                    }
                    eVar.a(m(aVar));
                    aVar.h.a(a3, (a.InterfaceC0922a) null);
                } else if (!"errSwitchState".equals(string)) {
                } else {
                    String string2 = jSONObject.getString("errSwitchStateGroup");
                    String string3 = jSONObject.getString("errSwitchState");
                    List<String> list2 = !StringUtils.isEmpty(string2) ? (List) JSON.parseObject(string2, new TypeReference<ArrayList<String>>() { // from class: com.taobao.tbpoplayer.nativerender.k.3
                    }.getType(), new Feature[0]) : null;
                    if (!StringUtils.isEmpty(string3)) {
                        list = (List) JSON.parseObject(string3, new TypeReference<ArrayList<String>>() { // from class: com.taobao.tbpoplayer.nativerender.k.8
                        }.getType(), new Feature[0]);
                    }
                    aVar.f22234a.a(m(aVar));
                    if (eVar.a(list2, list, false, false)) {
                        return;
                    }
                    eVar.a("CloseAfterRequestFailSwitchStateError", "", aVar.e.fallbackToast);
                }
            }
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("PopAction.onRequestActionFailed.error.", th);
        }
    }

    private static j m(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j) ipChange.ipc$dispatch("9f8ebf80", new Object[]{aVar});
        }
        if (aVar == null || aVar.f22234a == null) {
            return null;
        }
        return new j(aVar.f22234a, aVar.c != null ? aVar.c.id : "", aVar.d, aVar.e != null ? aVar.e.behavior : "", "");
    }
}
