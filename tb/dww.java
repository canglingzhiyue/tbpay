package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.s;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.alibaba.android.aura.service.event.d;
import com.alibaba.android.umf.datamodel.service.rule.UMFRuleIO;
import com.alibaba.android.umf.node.service.data.rule.RuleType;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.datasdk.model.datamodel.node.c;
import java.util.Arrays;
import java.util.HashMap;
import tb.dwy;

@AURAExtensionImpl(code = "alidetail.impl.event.checkCollect")
/* loaded from: classes4.dex */
public final class dww extends arv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "checkCollect";

    static {
        kge.a(-1529078918);
    }

    @Override // tb.arw
    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : "checkCollect";
    }

    public dww() {
        emu.a("com.taobao.android.detail.core.aura.extension.event.collect.AliDetailCheckCollectEvent");
    }

    @Override // tb.arv
    public void b(AURAEventIO aURAEventIO) {
        c C;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("186833d5", new Object[]{this, aURAEventIO});
            return;
        }
        s b = b().b();
        if (b == null) {
            arc.a().c("AliDetailCheckCollectEvent", "innerHandleEvent", "auraInstance is null");
            return;
        }
        d eventModel = aURAEventIO.getEventModel();
        AURARenderComponent d = eventModel.d();
        if (d == null) {
            arc.a().c("AliDetailCheckCollectEvent", "innerHandleEvent", "component is null");
            return;
        }
        JSONObject c = eventModel.c();
        if (c == null) {
            arc.a().c("AliDetailCheckCollectEvent", "innerHandleEvent", "eventFields is null");
            return;
        }
        String string = c.getString("itemId");
        Context e = b().e();
        if ((e instanceof DetailCoreActivity) && (C = ((DetailCoreActivity) e).C()) != null && C.b()) {
            string = C.j();
        }
        if (TextUtils.isEmpty(string)) {
            arc.a().c("AliDetailCheckCollectEvent", "innerHandleEvent", "itemId is empty");
        } else {
            dwy.a(string, new a(b, d, c));
        }
    }

    /* loaded from: classes4.dex */
    public static class a implements dwy.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public s b;
        public AURARenderComponent c;
        private JSONObject d;

        static {
            kge.a(-977963949);
            kge.a(-852374799);
        }

        public a(s sVar, AURARenderComponent aURARenderComponent, JSONObject jSONObject) {
            this.b = sVar;
            this.c = aURARenderComponent;
            this.d = jSONObject;
        }

        @Override // tb.dwy.c
        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            } else if (this.b == null) {
            } else {
                if (this.c.data != null && this.c.data.fields != null && this.c.data.fields.get(dwy.KEY_DETAIL) != null && Boolean.parseBoolean(String.valueOf(this.c.data.fields.get(dwy.KEY_DETAIL)))) {
                    this.c.data.fields.put(dwy.KEY_DETAIL_COLLECTED, Boolean.valueOf(z));
                    this.b.a("aura.workflow.adjustRules", new UMFRuleIO(Arrays.asList(bbg.a(RuleType.PROPS_WRITE_BACK, this.c, new HashMap()))), null);
                    return;
                }
                this.b.a("aura.workflow.adjustRules", new UMFRuleIO(Arrays.asList(dwy.a(z, this.c, this.d))), null);
            }
        }

        @Override // tb.dwy.c
        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                return;
            }
            ecg.b(this.d.getString("itemId"), str, str2);
            arc.a().c("AliDetailCheckCollectEvent", "InnerQueryCollectCallback.onQueryFailed", "query collect request failed");
        }
    }
}
