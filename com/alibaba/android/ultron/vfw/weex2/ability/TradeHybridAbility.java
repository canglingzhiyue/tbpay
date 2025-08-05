package com.alibaba.android.ultron.vfw.weex2.ability;

import android.content.Context;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridStage;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsTradeHybridAbility;
import com.taobao.android.abilityidl.ability.ej;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import kotlin.text.n;
import tb.als;
import tb.alt;
import tb.gml;
import tb.jqh;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\f\u0010\u000b\u001a\u00020\f*\u00020\fH\u0002¨\u0006\r"}, d2 = {"Lcom/alibaba/android/ultron/vfw/weex2/ability/TradeHybridAbility;", "Lcom/taobao/android/abilityidl/ability/AbsTradeHybridAbility;", "()V", "notifyStage", "", "context", "Lcom/alibaba/ability/env/IAbilityContext;", "params", "Lcom/taobao/android/abilityidl/ability/TradeHybridStageParams;", "callback", "Lcom/taobao/android/abilityidl/callback/IAbilityCallback;", "toUltronTradeHybridStage", "", "ultron-view-kit_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes2.dex */
public class TradeHybridAbility extends AbsTradeHybridAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0004"}, d2 = {"<anonymous>", "", "run", "com/alibaba/android/ultron/vfw/weex2/ability/TradeHybridAbility$notifyStage$2$1$1", "com/alibaba/android/ultron/vfw/weex2/ability/TradeHybridAbility$$special$$inlined$let$lambda$1"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes2.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f2759a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        public a(JSONObject jSONObject, String str, String str2) {
            this.f2759a = jSONObject;
            this.b = str;
            this.c = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                com.alibaba.android.ultron.vfw.weex2.highPerformance.management.a.a().a(this.b, this.c, this.f2759a);
            }
        }
    }

    static {
        kge.a(1708003919);
    }

    public static /* synthetic */ Object ipc$super(TradeHybridAbility tradeHybridAbility, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.abilityidl.ability.AbsTradeHybridAbility
    public void notifyStage(als context, ej params, gml callback) {
        Long e;
        Context f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("996db7e", new Object[]{this, context, params, callback});
            return;
        }
        q.d(context, "context");
        q.d(params, "params");
        q.d(callback, "callback");
        String str = params.f8842a;
        q.b(str, "params.stage");
        String a2 = a(str);
        String str2 = params.b;
        q.b(str2, "params.sceneName");
        if (n.a((CharSequence) a2) || n.a((CharSequence) str2)) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        alt b = context.b();
        if (b != null && (f = b.f()) != null) {
            jSONObject.put("context", (Object) f);
        }
        Map<String, ? extends Object> map = params.c;
        if (map != null) {
            jSONObject.putAll(map);
            Object obj = map.get("delayTime");
            if (!(obj instanceof String)) {
                obj = null;
            }
            String str3 = (String) obj;
            if (str3 != null && (e = n.e(str3)) != null) {
                jqh.a(new a(jSONObject, a2, str2), e.longValue());
                return;
            }
        }
        com.alibaba.android.ultron.vfw.weex2.highPerformance.management.a.a().a(a2, str2, jSONObject);
    }

    private final String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        switch (str.hashCode()) {
            case -1958322525:
                return str.equals("ON_NAV") ? UltronTradeHybridStage.ON_NAV : "";
            case -1946079196:
                return str.equals("ON_MTOP_END") ? UltronTradeHybridStage.ON_MTOP_END : "";
            case -1858225813:
                return str.equals("ON_MTOP_START") ? UltronTradeHybridStage.ON_MTOP_START : "";
            case -1751682830:
                return str.equals("ON_RENDER_END") ? UltronTradeHybridStage.ON_RENDER_END : "";
            case -1746197992:
                return str.equals("ON_CONTAINER_PAUSE") ? UltronTradeHybridStage.ON_CONTAINER_PAUSE : "";
            case -1461108406:
                return str.equals("ON_VIEW_SCROLL_START") ? UltronTradeHybridStage.ON_VIEW_SCROLL_START : "";
            case -765779005:
                return str.equals("ON_VIEW_SCROLL_END") ? UltronTradeHybridStage.ON_VIEW_SCROLL_END : "";
            case -711452772:
                return str.equals("ON_CONTAINER_DESTROY") ? UltronTradeHybridStage.ON_CONTAINER_DESTROY : "";
            case -412890185:
                return str.equals("ON_DATA_PRE_LOAD") ? UltronTradeHybridStage.ON_DATA_PRE_LOAD : "";
            case -301818085:
                return str.equals("ON_VIEW_SCROLLING") ? UltronTradeHybridStage.ON_VIEW_SCROLLING : "";
            case 42599738:
                return str.equals("ON_CONFIRM_SUCCESS_FLOAT_CLOSE") ? UltronTradeHybridStage.ON_CONFIRM_SUCCESS_FLOAT_CLOSE : "";
            case 273088185:
                return str.equals("ON_RENDER_START") ? UltronTradeHybridStage.ON_RENDER_START : "";
            case 956533918:
                return str.equals("ON_MEMORY_WARNING") ? UltronTradeHybridStage.ON_MEMORY_WARNING : "";
            case 1345464570:
                return str.equals("ON_CONTAINER_CREATE") ? UltronTradeHybridStage.ON_CONTAINER_CREATE : "";
            case 1763332139:
                return str.equals("ON_CONTAINER_RESUME") ? UltronTradeHybridStage.ON_CONTAINER_RESUME : "";
            case 2021187065:
                return str.equals("ON_EVENT_CHAIN_AFTER") ? UltronTradeHybridStage.ON_EVENT_CHAIN_AFTER : "";
            default:
                return "";
        }
    }
}
