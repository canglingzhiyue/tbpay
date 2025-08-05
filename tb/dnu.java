package tb;

import android.view.View;
import com.alibaba.android.ultron.event.base.e;
import com.alibaba.android.ultron.event.base.f;
import com.alibaba.android.ultron.vfw.viewholder.d;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.eventchain.l;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.icart.recommend.CartRecommendRefreshScene;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import com.taobao.android.ultron.datamodel.imp.DMEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.o;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 &2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0002%&B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0007H\u0002J,\u0010\u001e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010\u00022\b\u0010#\u001a\u0004\u0018\u00010$H\u0016R\u0014\u0010\u0006\u001a\u00020\u0007X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u0007X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u0007X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tR\u0014\u0010\u000e\u001a\u00020\u0007X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\tR\u0014\u0010\u0010\u001a\u00020\u0007X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\tR\u0014\u0010\u0012\u001a\u00020\u0007X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\tR\u0014\u0010\u0014\u001a\u00020\u0007X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\tR\u0014\u0010\u0016\u001a\u00020\u0017X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/taobao/android/adam/ultronExt/ability/UltronBridgeAbility;", "Lcom/taobao/android/abilitykit/AKBaseAbility;", "Lcom/taobao/android/dinamicx/eventchain/DXUIAbilityRuntimeContext;", "handler", "Lcom/alibaba/android/ultron/vfw/event/OnDynamicEventListener;", "(Lcom/alibaba/android/ultron/vfw/event/OnDynamicEventListener;)V", "ERROR_AKRUNTIME_IS_NULL", "", "getERROR_AKRUNTIME_IS_NULL", "()I", "ERROR_DMCOMPONENT_IS_NULL", "getERROR_DMCOMPONENT_IS_NULL", "ERROR_DXRUNTIME_IS_NULL", "getERROR_DXRUNTIME_IS_NULL", "ERROR_EVENTHANDLER_IS_NULL", "getERROR_EVENTHANDLER_IS_NULL", "ERROR_EVENTHANDLER_UNSUPPORT", "getERROR_EVENTHANDLER_UNSUPPORT", "ERROR_EVENTTYPE_IS_NULL", "getERROR_EVENTTYPE_IS_NULL", "ERROR_USERCTX_IS_NULL", "getERROR_USERCTX_IS_NULL", "EXTRA_KEY_ABILITY_CALLBACK", "", "getEXTRA_KEY_ABILITY_CALLBACK", "()Ljava/lang/String;", "eventHandler", "generateErrResult", "Lcom/taobao/android/abilitykit/AKAbilityErrorResult;", "errorId", "onExecuteWithData", "Lcom/taobao/android/abilitykit/AKAbilityExecuteResult;", "akBaseAbilityData", "Lcom/taobao/android/abilitykit/AKBaseAbilityData;", "akUiRuntimeCtx", "akiAbilityCallback", "Lcom/taobao/android/abilitykit/AKIAbilityCallback;", "Builder", "Companion", "adam_android_release"}, k = 1, mv = {1, 1, 16})
/* loaded from: classes4.dex */
public final class dnu extends dlg<l> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final b Companion;
    public static final String ULTRONBRIDGE = "2110160960920969469";

    /* renamed from: a  reason: collision with root package name */
    private bol f26875a;
    private final int b = -101;
    private final int c = -102;
    private final int d = -103;
    private final int e = -104;
    private final int f = -105;
    private final int g = -106;
    private final int h = -107;
    private final String i = "ext_key_ability_callback";

    static {
        kge.a(1911538777);
        Companion = new b(null);
    }

    public static /* synthetic */ Object ipc$super(dnu dnuVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public dnu(bol bolVar) {
        this.f26875a = bolVar;
    }

    @Override // tb.dlg
    public dkx<?> a(dlh dlhVar, l lVar, dll dllVar) {
        String c;
        DXRuntimeContext h;
        e eVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("a81bf6d9", new Object[]{this, dlhVar, lVar, dllVar});
        }
        if (this.f26875a == null) {
            return a(this.b);
        }
        if (lVar == null) {
            return a(this.c);
        }
        if (dlhVar == null || (c = dlhVar.c("eventType")) == null) {
            return a(this.d);
        }
        JSONObject a2 = dlhVar.a("eventFields");
        View g = lVar.g();
        if ((g != null ? g.getTag(DXWidgetNode.TAG_WIDGET_NODE) : null) instanceof DXWidgetNode) {
            Object tag = g.getTag(DXWidgetNode.TAG_WIDGET_NODE);
            if (tag == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.taobao.android.dinamicx.widget.DXWidgetNode");
            }
            h = ((DXWidgetNode) tag).getDXRuntimeContext();
        } else {
            h = lVar.h();
        }
        if (h == null) {
            return a(this.e);
        }
        Object a3 = h.a();
        if (!(a3 instanceof Map)) {
            a3 = null;
        }
        Map map = (Map) a3;
        if (map == null) {
            return a(this.f);
        }
        bol bolVar = this.f26875a;
        if (!(bolVar instanceof f)) {
            eVar = null;
        } else if (bolVar == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.alibaba.android.ultron.event.base.UltronEventHandler");
        } else {
            eVar = ((f) bolVar).a();
        }
        if (eVar == null) {
            return a(this.h);
        }
        if (map.get(d.TAG_DINAMICX_VIEW_COMPONENT) instanceof DMComponent) {
            Object obj = map.get(d.TAG_DINAMICX_VIEW_COMPONENT);
            if (obj == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.taobao.android.ultron.datamodel.imp.DMComponent");
            }
            eVar.a((IDMComponent) ((DMComponent) obj));
            eVar.a("bizParams", map.get("bizParams"));
            eVar.a("triggerView", h.v());
            eVar.a(new DMEvent(c, a2, null));
            eVar.a(c);
            eVar.a(this.i, dllVar);
            bol bolVar2 = this.f26875a;
            if (bolVar2 instanceof f) {
                if (bolVar2 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.alibaba.android.ultron.event.base.UltronEventHandler");
                }
                ((f) bolVar2).a(eVar);
            }
            return new dla();
        }
        return a(this.g);
    }

    private final dkw a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dkw) ipChange.ipc$dispatch("e660a3bb", new Object[]{this, new Integer(i)}) : new dkw(new dkv(i, "internal error"));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/taobao/android/adam/ultronExt/ability/UltronBridgeAbility$Builder;", "Lcom/taobao/android/abilitykit/AKIBuilderAbility;", "", "handler", "Lcom/alibaba/android/ultron/vfw/event/OnDynamicEventListener;", "(Lcom/alibaba/android/ultron/vfw/event/OnDynamicEventListener;)V", "eventHandler", CartRecommendRefreshScene.build, "Lcom/taobao/android/adam/ultronExt/ability/UltronBridgeAbility;", "data", "adam_android_release"}, k = 1, mv = {1, 1, 16})
    /* loaded from: classes4.dex */
    public static final class a implements dln<Object> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private bol f26876a;

        static {
            kge.a(274543152);
            kge.a(-1749066050);
        }

        public a(bol bolVar) {
            this.f26876a = bolVar;
        }

        @Override // tb.dln
        public /* synthetic */ dlg b(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (dlg) ipChange.ipc$dispatch("1766b262", new Object[]{this, obj}) : a(obj);
        }

        public dnu a(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (dnu) ipChange.ipc$dispatch("16ba0ff7", new Object[]{this, obj}) : new dnu(this.f26876a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/taobao/android/adam/ultronExt/ability/UltronBridgeAbility$Companion;", "", "()V", "ULTRONBRIDGE", "", "adam_android_release"}, k = 1, mv = {1, 1, 16})
    /* loaded from: classes4.dex */
    public static final class b {
        static {
            kge.a(1830605921);
        }

        private b() {
        }

        public /* synthetic */ b(o oVar) {
            this();
        }
    }
}
