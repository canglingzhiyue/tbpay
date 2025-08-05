package tb;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.model.d;
import com.taobao.desktop.channel.desktoplinktask.floatwindow.FloatWindow;
import com.taobao.desktop.channel.desktoplinktask.trigger.f;
import com.taobao.tbpoplayer.nativerender.dsl.ActionModel;
import com.taobao.tbpoplayer.nativerender.dsl.ActionsItemModel;
import com.taobao.tbpoplayer.nativerender.dsl.ComponentBaseModel;
import com.taobao.tbpoplayer.nativerender.dsl.StateModel;
import com.taobao.tbpoplayer.nativerender.dsl.StateVersionModel;
import com.taobao.tbpoplayer.nativerender.e;
import com.taobao.tbpoplayer.nativerender.j;
import com.taobao.tbpoplayer.nativerender.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import tb.kgv;

/* loaded from: classes7.dex */
public class kgv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_TYPE_CLICK = "click";

    /* loaded from: classes7.dex */
    public static class a {

        /* renamed from: a */
        public e f30062a;
        public com.taobao.desktop.channel.desktoplinktask.floatwindow.b b;
        public ComponentBaseModel c;
        public String d;
        public ActionModel e;
        public b f;

        static {
            kge.a(-1551767430);
        }

        public a(e eVar, com.taobao.desktop.channel.desktoplinktask.floatwindow.b bVar, ComponentBaseModel componentBaseModel, String str, ActionModel actionModel, b bVar2) {
            this.f30062a = eVar;
            this.b = bVar;
            this.c = componentBaseModel;
            this.d = str;
            this.e = actionModel;
            this.f = bVar2;
        }
    }

    /* loaded from: classes7.dex */
    public interface b {
        void a(a aVar);

        void a(a aVar, String str, String str2);
    }

    /* loaded from: classes7.dex */
    public interface c {
        void onActionsFinished();
    }

    static {
        kge.a(-86479771);
    }

    public static /* synthetic */ void lambda$44u5vH4X9jlOIhG1bNHdrV2f7SM(ActionModel actionModel, e eVar, com.taobao.desktop.channel.desktoplinktask.floatwindow.b bVar, ComponentBaseModel componentBaseModel, String str, List list) {
        a(actionModel, eVar, bVar, componentBaseModel, str, list);
    }

    public static /* synthetic */ void lambda$AUyt9jEzDlNBvvfcFwKaOnR48UM(e eVar, Pair pair, a aVar, Context context, float f, float f2, float f3, float f4, int i, int i2) {
        a(eVar, pair, aVar, context, f, f2, f3, f4, i, i2);
    }

    public static /* synthetic */ void lambda$cCQsGrRQZYkcHtjJynXG_yiBLu8(a aVar, String str, boolean z, boolean z2, long j, boolean z3, long j2, long j3) {
        a(aVar, str, z, z2, j, z3, j2, j3);
    }

    public static /* synthetic */ void lambda$cniE1a4RS45ZCDqCl7XaLziBZC8(a aVar, boolean z) {
        a(aVar, z);
    }

    public static /* synthetic */ void a(e eVar, com.taobao.desktop.channel.desktoplinktask.floatwindow.b bVar, ComponentBaseModel componentBaseModel, String str, Collection collection, Map map, JSONArray jSONArray, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d702bce5", new Object[]{eVar, bVar, componentBaseModel, str, collection, map, jSONArray, cVar});
        } else {
            b(eVar, bVar, componentBaseModel, str, collection, map, jSONArray, cVar);
        }
    }

    public static /* synthetic */ void a(AtomicInteger atomicInteger, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8025589", new Object[]{atomicInteger, cVar});
        } else {
            b(atomicInteger, cVar);
        }
    }

    public static void a(final e eVar, final com.taobao.desktop.channel.desktoplinktask.floatwindow.b bVar, final ComponentBaseModel componentBaseModel, final String str, final ActionModel actionModel, final List<ActionsItemModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32b1c3e1", new Object[]{eVar, bVar, componentBaseModel, str, actionModel, list});
        } else if (eVar == null || componentBaseModel == null || TextUtils.isEmpty(str)) {
        } else {
            eVar.b(new Runnable() { // from class: tb.-$$Lambda$kgv$44u5vH4X9jlOIhG1bNHdrV2f7SM
                @Override // java.lang.Runnable
                public final void run() {
                    kgv.lambda$44u5vH4X9jlOIhG1bNHdrV2f7SM(ActionModel.this, eVar, bVar, componentBaseModel, str, list);
                }
            });
        }
    }

    public static /* synthetic */ void a(ActionModel actionModel, e eVar, com.taobao.desktop.channel.desktoplinktask.floatwindow.b bVar, ComponentBaseModel componentBaseModel, String str, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6258969d", new Object[]{actionModel, eVar, bVar, componentBaseModel, str, list});
            return;
        }
        if (actionModel != null) {
            try {
                if (actionModel.isValid()) {
                    a(eVar, bVar, componentBaseModel, str, actionModel);
                }
            } catch (Throwable th) {
                kgz.a("PopAction.handleAction.error", th);
                return;
            }
        }
        if (list != null && !list.isEmpty()) {
            a(eVar, bVar, componentBaseModel, str, list);
        }
    }

    private static void a(e eVar, com.taobao.desktop.channel.desktoplinktask.floatwindow.b bVar, ComponentBaseModel componentBaseModel, String str, ActionModel actionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6f16f0", new Object[]{eVar, bVar, componentBaseModel, str, actionModel});
            return;
        }
        try {
            if (!str.equals(actionModel.type)) {
                return;
            }
            kgz.a("PopAction.doSingleAction.actionType=%s.componentModel=%s.actionBehavior=%s", str, componentBaseModel.id, actionModel.behavior);
            if (!a(new a(eVar, bVar, componentBaseModel, str, actionModel, new b() { // from class: tb.kgv.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.kgv.b
                public void a(a aVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e2c602a1", new Object[]{this, aVar});
                    }
                }

                @Override // tb.kgv.b
                public void a(a aVar, String str2, String str3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("745c3b35", new Object[]{this, aVar, str2, str3});
                    }
                }
            })) || !actionModel.autoClose) {
                return;
            }
            eVar.a("AutoCloseAfterAction", "", false, new j(eVar, componentBaseModel.id, str, actionModel.behavior, ""));
        } catch (Throwable th) {
            kgz.a("PopAction.doSingleAction.error.", th);
        }
    }

    private static void a(e eVar, com.taobao.desktop.channel.desktoplinktask.floatwindow.b bVar, ComponentBaseModel componentBaseModel, String str, List<ActionsItemModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f4d1f1f", new Object[]{eVar, bVar, componentBaseModel, str, list});
            return;
        }
        ActionsItemModel actionsItemModel = null;
        try {
            Iterator<ActionsItemModel> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ActionsItemModel next = it.next();
                if (next != null && next.isValid() && next.type.equals(str)) {
                    actionsItemModel = next;
                    break;
                }
            }
            if (actionsItemModel == null) {
                return;
            }
            HashMap hashMap = new HashMap();
            List<String> list2 = actionsItemModel.startActions;
            for (ActionModel actionModel : actionsItemModel.content) {
                if (actionModel != null && actionModel.isValid() && !TextUtils.isEmpty(actionModel.id)) {
                    hashMap.put(actionModel.id, actionModel);
                }
            }
            kgz.a("PopAction.doMultiActions.componentModel=%s.actionModelMap=%s.", componentBaseModel.id, hashMap);
            b(eVar, bVar, componentBaseModel, actionsItemModel.type, list2, hashMap, new JSONArray(), null);
        } catch (Throwable th) {
            kgz.a("PopAction.doMultiActions.error.", th);
        }
    }

    private static void b(e eVar, com.taobao.desktop.channel.desktoplinktask.floatwindow.b bVar, ComponentBaseModel componentBaseModel, String str, Collection<String> collection, Map<String, ActionModel> map, JSONArray jSONArray, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf809ce6", new Object[]{eVar, bVar, componentBaseModel, str, collection, map, jSONArray, cVar});
        } else if (collection == null || collection.isEmpty()) {
            if (cVar == null) {
                return;
            }
            cVar.onActionsFinished();
        } else {
            AtomicInteger atomicInteger = new AtomicInteger(collection.size());
            for (String str2 : collection) {
                ActionModel actionModel = map.get(str2);
                AtomicInteger atomicInteger2 = atomicInteger;
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(actionModel, jSONArray, atomicInteger, cVar, eVar, bVar, componentBaseModel, str, map);
                if (actionModel == null) {
                    b(atomicInteger2, cVar);
                } else {
                    boolean a2 = com.taobao.tbpoplayer.nativerender.b.a(actionModel.preCondition, eVar, false);
                    kgz.a("PopAction.doMultiActions.iterateActionTree.action=%s.shouldDoAction=%s.", actionModel.id, Boolean.valueOf(a2));
                    if (!a2) {
                        b(atomicInteger2, cVar);
                    } else if (!a(new a(eVar, bVar, componentBaseModel, str, actionModel, anonymousClass2))) {
                        b(atomicInteger2, cVar);
                    }
                }
                atomicInteger = atomicInteger2;
            }
        }
    }

    /* renamed from: tb.kgv$2 */
    /* loaded from: classes7.dex */
    public static class AnonymousClass2 implements b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public final /* synthetic */ ActionModel f30061a;
        public final /* synthetic */ JSONArray b;
        public final /* synthetic */ AtomicInteger c;
        public final /* synthetic */ c d;
        public final /* synthetic */ e e;
        public final /* synthetic */ com.taobao.desktop.channel.desktoplinktask.floatwindow.b f;
        public final /* synthetic */ ComponentBaseModel g;
        public final /* synthetic */ String h;
        public final /* synthetic */ Map i;

        public static /* synthetic */ void lambda$2z3glezpsgVkNjfJqd61nsIIjQY(AtomicInteger atomicInteger, c cVar) {
            a(atomicInteger, cVar);
        }

        /* renamed from: lambda$S4wmKIV2U-oHLBhDlGwoKTfmPZw */
        public static /* synthetic */ void m2463lambda$S4wmKIV2UoHLBhDlGwoKTfmPZw(AtomicInteger atomicInteger, c cVar) {
            b(atomicInteger, cVar);
        }

        public AnonymousClass2(ActionModel actionModel, JSONArray jSONArray, AtomicInteger atomicInteger, c cVar, e eVar, com.taobao.desktop.channel.desktoplinktask.floatwindow.b bVar, ComponentBaseModel componentBaseModel, String str, Map map) {
            this.f30061a = actionModel;
            this.b = jSONArray;
            this.c = atomicInteger;
            this.d = cVar;
            this.e = eVar;
            this.f = bVar;
            this.g = componentBaseModel;
            this.h = str;
            this.i = map;
        }

        @Override // tb.kgv.b
        public void a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e2c602a1", new Object[]{this, aVar});
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("actionBehavior", (Object) this.f30061a.behavior);
                jSONObject.put("actionExceptionMessage", (Object) "");
                this.b.add(jSONObject);
                if (this.f30061a.nextActions != null && !this.f30061a.nextActions.isEmpty()) {
                    e eVar = this.e;
                    com.taobao.desktop.channel.desktoplinktask.floatwindow.b bVar = this.f;
                    ComponentBaseModel componentBaseModel = this.g;
                    String str = this.h;
                    List<String> list = this.f30061a.nextActions;
                    Map map = this.i;
                    JSONArray jSONArray = this.b;
                    final AtomicInteger atomicInteger = this.c;
                    final c cVar = this.d;
                    kgv.a(eVar, bVar, componentBaseModel, str, list, map, jSONArray, new c() { // from class: tb.-$$Lambda$kgv$2$S4wmKIV2U-oHLBhDlGwoKTfmPZw
                        @Override // tb.kgv.c
                        public final void onActionsFinished() {
                            kgv.AnonymousClass2.m2463lambda$S4wmKIV2UoHLBhDlGwoKTfmPZw(atomicInteger, cVar);
                        }
                    });
                    return;
                }
                kgv.a(this.c, this.d);
            } catch (Throwable th) {
                kgz.a("PopAction.iterateActionTree.onSuccess.error.", th);
            }
        }

        public static /* synthetic */ void b(AtomicInteger atomicInteger, c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("94ef6ca8", new Object[]{atomicInteger, cVar});
            } else {
                kgv.a(atomicInteger, cVar);
            }
        }

        @Override // tb.kgv.b
        public void a(a aVar, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("745c3b35", new Object[]{this, aVar, str, str2});
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("actionBehavior", (Object) this.f30061a.behavior);
                jSONObject.put("actionExceptionMessage", (Object) str);
                this.b.add(jSONObject);
                if (this.f30061a.fallbackNextActions != null && !this.f30061a.fallbackNextActions.isEmpty()) {
                    e eVar = this.e;
                    com.taobao.desktop.channel.desktoplinktask.floatwindow.b bVar = this.f;
                    ComponentBaseModel componentBaseModel = this.g;
                    String str3 = this.h;
                    List<String> list = this.f30061a.fallbackNextActions;
                    Map map = this.i;
                    JSONArray jSONArray = this.b;
                    final AtomicInteger atomicInteger = this.c;
                    final c cVar = this.d;
                    kgv.a(eVar, bVar, componentBaseModel, str3, list, map, jSONArray, new c() { // from class: tb.-$$Lambda$kgv$2$2z3glezpsgVkNjfJqd61nsIIjQY
                        @Override // tb.kgv.c
                        public final void onActionsFinished() {
                            kgv.AnonymousClass2.lambda$2z3glezpsgVkNjfJqd61nsIIjQY(atomicInteger, cVar);
                        }
                    });
                    return;
                }
                kgv.a(this.c, this.d);
            } catch (Throwable th) {
                kgz.a("PopAction.iterateActionTree.onFail.error.", th);
            }
        }

        public static /* synthetic */ void a(AtomicInteger atomicInteger, c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8025589", new Object[]{atomicInteger, cVar});
            } else {
                kgv.a(atomicInteger, cVar);
            }
        }
    }

    private static void b(AtomicInteger atomicInteger, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94ef6ca8", new Object[]{atomicInteger, cVar});
        } else if (atomicInteger.decrementAndGet() != 0 || cVar == null) {
        } else {
            cVar.onActionsFinished();
        }
    }

    private static boolean a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e2c602a5", new Object[]{aVar})).booleanValue();
        }
        if (aVar == null || aVar.e == null) {
            return false;
        }
        kgz.a("PopAction.doAction.id=%s.behavior=%s", aVar.e.id, aVar.e.behavior);
        String str = aVar.e.behavior;
        char c2 = 65535;
        switch (str.hashCode()) {
            case -889473228:
                if (str.equals("switch")) {
                    c2 = 2;
                    break;
                }
                break;
            case -182923669:
                if (str.equals("addAttendWindow")) {
                    c2 = 4;
                    break;
                }
                break;
            case 3045982:
                if (str.equals("call")) {
                    c2 = 1;
                    break;
                }
                break;
            case 94756344:
                if (str.equals("close")) {
                    c2 = 0;
                    break;
                }
                break;
            case 962366379:
                if (str.equals("callPaiLiTao")) {
                    c2 = 5;
                    break;
                }
                break;
            case 1052832078:
                if (str.equals("translate")) {
                    c2 = 3;
                    break;
                }
                break;
        }
        if (c2 == 0) {
            return c(aVar);
        }
        if (c2 == 1) {
            return b(aVar);
        }
        if (c2 == 2) {
            return d(aVar);
        }
        if (c2 == 3) {
            return e(aVar);
        }
        if (c2 == 4) {
            return f(aVar);
        }
        if (c2 == 5) {
            return g(aVar);
        }
        return false;
    }

    private static boolean b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3ca16ce6", new Object[]{aVar})).booleanValue();
        }
        ActionModel actionModel = aVar.e;
        e eVar = aVar.f30062a;
        String a2 = p.a(eVar, actionModel.content);
        if (TextUtils.isEmpty(a2)) {
            return false;
        }
        Intent intent = new Intent();
        intent.setData(Uri.parse(a2));
        intent.setFlags(805339136);
        eVar.a().a().startActivity(intent);
        f fVar = aVar.b.f16946a;
        com.taobao.desktop.channel.desktoplinktask.trigger.e.a(fVar.f16953a, fVar.c, fVar.d, "call", a2);
        if (aVar.f != null) {
            aVar.f.a(aVar);
        }
        return true;
    }

    private static boolean g(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fdea802b", new Object[]{aVar})).booleanValue();
        }
        e eVar = aVar.f30062a;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.taobao.taobao", "com.etao.feimagesearch.quicksearch.ScreenRecordActivity"));
        intent.putExtra("pssource", "floatbar");
        intent.putExtra(d.KEY_PHOTO_FROM, "floatbar");
        intent.addFlags(268435456);
        eVar.a().a().startActivity(intent);
        f fVar = aVar.b.f16946a;
        com.taobao.desktop.channel.desktoplinktask.trigger.e.a(fVar.f16953a, fVar.c, fVar.d, "callPaiLiTao", "");
        return true;
    }

    private static boolean c(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("967cd727", new Object[]{aVar})).booleanValue();
        }
        JSONObject parseObject = JSONObject.parseObject(aVar.e.content);
        boolean equals = "cancel".equals(aVar.e.userResult);
        aVar.f30062a.a(String.format("handleClose.%s", aVar.e.type), "", parseObject != null ? parseObject.getBooleanValue("interruptable") : false, (j) null);
        if (equals) {
            f fVar = aVar.b.f16946a;
            com.taobao.desktop.channel.desktoplinktask.trigger.e.a(fVar.f16953a, fVar.c, fVar.d, "close", "");
        }
        if (aVar.f != null) {
            aVar.f.a(aVar);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.util.List] */
    private static boolean d(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f0584168", new Object[]{aVar})).booleanValue();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ActionModel actionModel = aVar.e;
        try {
            arrayList2 = (List) JSON.parseObject(actionModel.target, new TypeReference<List<String>>() { // from class: tb.kgv.3
            }, new Feature[0]);
        } catch (Throwable unused) {
            arrayList2.add(actionModel.target);
        }
        JSONObject parseObject = JSONObject.parseObject(actionModel.content);
        if (parseObject != null) {
            String string = parseObject.getString("targetGroupStates");
            if (!TextUtils.isEmpty(string)) {
                try {
                    arrayList = (List) JSON.parseObject(string, new TypeReference<List<String>>() { // from class: tb.kgv.4
                    }, new Feature[0]);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
            if (arrayList2 == null || arrayList2.isEmpty()) {
                String string2 = parseObject.getString("targetStates");
                if (!TextUtils.isEmpty(string2)) {
                    try {
                        arrayList2 = (List) JSON.parseObject(string2, new TypeReference<List<String>>() { // from class: tb.kgv.5
                        }, new Feature[0]);
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                    }
                }
            }
        }
        if (aVar.f30062a.a(arrayList, arrayList2, com.taobao.android.weex_framework.util.a.ATOM_EXT_random.equals((parseObject == null || !parseObject.containsKey(com.taobao.android.fluid.framework.data.remote.c.KEY_SWITCH_MODE)) ? "" : parseObject.getString(com.taobao.android.fluid.framework.data.remote.c.KEY_SWITCH_MODE)), Boolean.TRUE.equals((parseObject == null || !parseObject.containsKey("excludeSelf")) ? Boolean.FALSE : parseObject.getBoolean("excludeSelf")))) {
            if (aVar.f != null) {
                aVar.f.a(aVar);
            }
        } else if (aVar.f != null) {
            aVar.f.a(aVar, "SwitchStateFailed", "");
        }
        return true;
    }

    private static boolean e(final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a33aba9", new Object[]{aVar})).booleanValue();
        }
        JSONObject parseObject = JSONObject.parseObject(aVar.e.content);
        final String string = parseObject.getString("translateMode");
        final boolean booleanValue = parseObject.getBooleanValue("translateX");
        final boolean booleanValue2 = parseObject.getBooleanValue("translateY");
        final long longValue = parseObject.getLongValue("x");
        final long longValue2 = parseObject.getLongValue("y");
        final long longValue3 = parseObject.getLongValue("duration");
        Boolean bool = parseObject.getBoolean("canBreak");
        final boolean booleanValue3 = bool != null ? bool.booleanValue() : true;
        aVar.f30062a.a(new Runnable() { // from class: tb.-$$Lambda$kgv$cCQsGrRQZYkcHtjJynXG_yiBLu8
            @Override // java.lang.Runnable
            public final void run() {
                kgv.lambda$cCQsGrRQZYkcHtjJynXG_yiBLu8(kgv.a.this, string, booleanValue3, booleanValue, longValue, booleanValue2, longValue2, longValue3);
            }
        });
        return true;
    }

    public static /* synthetic */ void a(final a aVar, String str, boolean z, boolean z2, long j, boolean z3, long j2, long j3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64fdbd7b", new Object[]{aVar, str, new Boolean(z), new Boolean(z2), new Long(j), new Boolean(z3), new Long(j2), new Long(j3)});
            return;
        }
        FloatWindow floatWindow = aVar.b.b;
        boolean equals = "target".equals(str);
        floatWindow.a(equals ? 1 : 0, true, z, z2, (float) j, z3, (float) j2, j3, new FloatWindow.b() { // from class: tb.-$$Lambda$kgv$cniE1a4RS45ZCDqCl7XaLziBZC8
            @Override // com.taobao.desktop.channel.desktoplinktask.floatwindow.FloatWindow.b
            public final void onMoveFinish(boolean z4) {
                kgv.lambda$cniE1a4RS45ZCDqCl7XaLziBZC8(kgv.a.this, z4);
            }
        });
    }

    public static /* synthetic */ void a(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75fb0453", new Object[]{aVar, new Boolean(z)});
        } else if (aVar.f == null) {
        } else {
            aVar.f.a(aVar);
        }
    }

    private static boolean f(final a aVar) {
        List<String> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a40f15ea", new Object[]{aVar})).booleanValue();
        }
        final e eVar = aVar.f30062a;
        final Context a2 = eVar.a().a();
        JSONObject parseObject = JSONObject.parseObject(aVar.e.content);
        if (parseObject == null || a2 == null) {
            return false;
        }
        final float a3 = kgy.a(a2, parseObject.getFloatValue("width"));
        final float a4 = kgy.a(a2, parseObject.getFloatValue("height"));
        final float a5 = kgy.a(a2, parseObject.getFloatValue("startX"));
        final float a6 = kgy.a(a2, parseObject.getFloatValue("startY"));
        final int intValue = parseObject.getIntValue("directionX");
        final int intValue2 = parseObject.getIntValue("directionY");
        List<String> arrayList = new ArrayList<>();
        ArrayList arrayList2 = new ArrayList();
        String string = parseObject.getString("targetGroupStates");
        if (!TextUtils.isEmpty(string)) {
            try {
                arrayList = (List) JSON.parseObject(string, new TypeReference<List<String>>() { // from class: tb.kgv.6
                }, new Feature[0]);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        String string2 = parseObject.getString("targetStates");
        if (!TextUtils.isEmpty(string2)) {
            try {
                list = (List) JSON.parseObject(string2, new TypeReference<List<String>>() { // from class: tb.kgv.7
                }, new Feature[0]);
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
            if (a3 <= 0.0f && a4 > 0.0f) {
                final Pair<StateModel, StateVersionModel> b2 = eVar.b(arrayList, list, com.taobao.android.weex_framework.util.a.ATOM_EXT_random.equals(parseObject.containsKey(com.taobao.android.fluid.framework.data.remote.c.KEY_SWITCH_MODE) ? parseObject.getString(com.taobao.android.fluid.framework.data.remote.c.KEY_SWITCH_MODE) : ""), Boolean.TRUE.equals(parseObject.containsKey("excludeSelf") ? parseObject.getBoolean("excludeSelf") : Boolean.FALSE));
                eVar.a(new Runnable() { // from class: tb.-$$Lambda$kgv$AUyt9jEzDlNBvvfcFwKaOnR48UM
                    @Override // java.lang.Runnable
                    public final void run() {
                        kgv.lambda$AUyt9jEzDlNBvvfcFwKaOnR48UM(e.this, b2, aVar, a2, a3, a4, a5, a6, intValue, intValue2);
                    }
                });
                return true;
            }
        }
        list = arrayList2;
        return a3 <= 0.0f ? true : true;
    }

    public static /* synthetic */ void a(e eVar, Pair pair, a aVar, Context context, float f, float f2, float f3, float f4, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("207759db", new Object[]{eVar, pair, aVar, context, new Float(f), new Float(f2), new Float(f3), new Float(f4), new Integer(i), new Integer(i2)});
            return;
        }
        View a2 = eVar.a((StateModel) pair.first, (StateVersionModel) pair.second);
        if (a2 == null) {
            if (aVar.f == null) {
                return;
            }
            aVar.f.a(aVar, "renderStateFailed", "");
            return;
        }
        aVar.b.b.a(context, a2, (int) f, (int) f2, (int) f3, (int) f4, i, i2);
        if (aVar.f == null) {
            return;
        }
        aVar.f.a(aVar);
    }
}
