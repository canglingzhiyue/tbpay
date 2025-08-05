package com.alibaba.android.icart.core.ability.event;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.model.b;
import com.taobao.taobao.R;
import kotlin.Metadata;
import kotlin.collections.ai;
import kotlin.j;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.bbz;
import tb.bca;
import tb.bcb;
import tb.bei;
import tb.bez;
import tb.bmz;
import tb.bsq;
import tb.ipo;
import tb.jdc;
import tb.jet;
import tb.jny;
import tb.jpr;
import tb.jpu;
import tb.jqg;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0002J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/alibaba/android/icart/core/ability/event/CartOpenPopEventAbility;", "Lcom/alibaba/android/icart/core/ICartSubscriber;", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "keyHeightRatio", "keyHideCheckAll", "keyIsAboveSubmit", "keyNextRenderRoot", "keyUrl", "generateSubProtocol", "Lcom/alibaba/fastjson/JSONObject;", "nextRenderRoot", "onHandleEvent", "", "event", "Lcom/alibaba/android/ultron/trade/event/base/TradeEvent;", "refreshFooter", "presenter", "Lcom/alibaba/android/icart/core/ICartPresenter;", "icart-core-android_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes2.dex */
public final class a extends bca {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String c = "CartOpenPopEventAbility";
    private final String k = "url";
    private final String l = "nextRenderRoot";
    private final String m = bsq.KEY_HEIGHT_RATIO;
    private final String n = "isAboveSubmit";
    private final String o = "hideCheckAll";

    static {
        kge.a(1594801812);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static final /* synthetic */ void a(a aVar, bbz bbzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af7687af", new Object[]{aVar, bbzVar});
        } else {
            aVar.a(bbzVar);
        }
    }

    @Override // com.alibaba.android.ultron.trade.event.d
    public void b(bmz bmzVar) {
        JSONObject fields;
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d08b596a", new Object[]{this, bmzVar});
            return;
        }
        String str = this.c;
        try {
            bbz bbzVar = this.f25791a;
            if (bbzVar == null) {
                return;
            }
            q.b(bbzVar, "mPresenter ?: return");
            b b = b();
            if (b == null || (fields = b.getFields()) == null || (string = fields.getString(this.k)) == null) {
                return;
            }
            Float f = fields.getFloat(this.m);
            float floatValue = f != null ? f.floatValue() : 1.0f;
            Boolean bool = fields.getBoolean(this.n);
            boolean booleanValue = bool != null ? bool.booleanValue() : false;
            Boolean bool2 = fields.getBoolean(this.o);
            boolean booleanValue2 = bool2 != null ? bool2.booleanValue() : false;
            JSONObject b2 = b(fields.getString(this.l));
            jqg.b(this.c, "showPop");
            jet jetVar = new jet();
            jetVar.a("weex2");
            jetVar.b(string);
            jetVar.a(floatValue);
            if (b2 != null) {
                jetVar.a(ai.b(j.a("protocol", b2)));
            }
            jetVar.a(booleanValue2);
            jetVar.a(Integer.valueOf(R.id.cart_pop_placeholder));
            jetVar.b(booleanValue);
            jetVar.a(Float.valueOf(1000.0f));
            t tVar = t.INSTANCE;
            jdc.a(bbzVar, jetVar, new CartOpenPopEventAbility$onHandleEvent$$inlined$tryCatch$lambda$1(bbzVar, booleanValue2, this), new CartOpenPopEventAbility$onHandleEvent$$inlined$tryCatch$lambda$2(bbzVar, booleanValue2, this));
        } catch (Throwable th) {
            jpu c = jpu.a("Ultron").c(str);
            String message = th.getMessage();
            if (message == null) {
                message = "出错了";
            }
            jpr.a(c.b(message));
        }
    }

    private final void a(bbz bbzVar) {
        IDMComponent b;
        bez x;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e16d505e", new Object[]{this, bbzVar});
        } else if (this.g == null || (b = bei.b(this.g)) == null || (x = bbzVar.x()) == null) {
        } else {
            x.a(b);
        }
    }

    private final JSONObject b(String str) {
        bcb bcbVar;
        jny w;
        JSONObject M;
        JSONObject jSONObject;
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9d2c0493", new Object[]{this, str});
        }
        if (str == null || (bcbVar = this.b) == null || (w = bcbVar.w()) == null || !(w instanceof com.taobao.android.ultron.datamodel.imp.b) || (M = ((com.taobao.android.ultron.datamodel.imp.b) w).M()) == null) {
            return null;
        }
        q.b(M, "dmContext.fullProtocolData ?: return null");
        JSONObject parseObject = JSON.parseObject(M.toJSONString());
        JSONObject jSONObject2 = parseObject.getJSONObject("hierarchy");
        if (jSONObject2 == null || (jSONObject = jSONObject2.getJSONObject("structure")) == null || (jSONArray = jSONObject.getJSONArray(str)) == null) {
            return null;
        }
        jSONArray.remove("generalExtendBody_1");
        return ipo.INSTANCE.a(parseObject, str);
    }
}
