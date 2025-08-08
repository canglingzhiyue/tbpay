package tb;

import android.app.Activity;
import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.util.Pair;
import android.view.View;
import android.widget.Toast;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.s;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.alibaba.android.umf.datamodel.service.rule.UMFRuleIO;
import com.alibaba.android.umf.node.service.data.rule.RuleType;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.datasdk.model.datamodel.node.ItemNode;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.taobao.R;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.util.ErrorConstant;
import tb.dwy;

@AURAExtensionImpl(code = "alidetail.impl.event.collectClick")
/* loaded from: classes4.dex */
public final class dwx extends arv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "collectClick";

    static {
        kge.a(-307944066);
    }

    @Override // tb.arw
    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : "collectClick";
    }

    public dwx() {
        emu.a("com.taobao.android.detail.core.aura.extension.event.collect.AliDetailCollectClickEvent");
    }

    @Override // tb.arv
    public void b(AURAEventIO aURAEventIO) {
        com.taobao.android.detail.datasdk.model.datamodel.node.c C;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("186833d5", new Object[]{this, aURAEventIO});
            return;
        }
        s b2 = b().b();
        if (b2 == null) {
            arc.a().c("AliDetailCollectClickEvent", "innerHandleEvent", "auraInstance is null");
            return;
        }
        com.alibaba.android.aura.service.event.d eventModel = aURAEventIO.getEventModel();
        AURARenderComponent d2 = eventModel.d();
        if (d2 == null) {
            arc.a().c("AliDetailCollectClickEvent", "innerHandleEvent", "component is null");
            return;
        }
        JSONObject c2 = eventModel.c();
        if (c2 == null) {
            arc.a().c("AliDetailCollectClickEvent", "innerHandleEvent", "eventFields is null");
            return;
        }
        String string = c2.getString("itemId");
        Context e2 = b().e();
        if ((e2 instanceof DetailCoreActivity) && (C = ((DetailCoreActivity) e2).C()) != null && C.b()) {
            string = C.j();
        }
        String str = string;
        if (StringUtils.isEmpty(str)) {
            arc.a().c("AliDetailCollectClickEvent", "innerHandleEvent", "itemId is empty");
            return;
        }
        HashMap hashMap = new HashMap();
        Object c3 = eventModel.c(com.alibaba.android.aura.service.event.d.EXT_KEY_DX_RUNTIME_CONTEXT);
        if (c3 instanceof DXRuntimeContext) {
            hashMap.put(com.taobao.android.adam.common.b.PARSER_KEY_DX_RUNTIMECONTEXT, c3);
        }
        dwy.a(str, new d(e2, b2, d2, c2, str, hashMap));
    }

    /* loaded from: classes4.dex */
    public static abstract class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public Context f27050a;
        public s b;
        public AURARenderComponent c;
        public JSONObject d;
        public String e;
        public Map<String, Object> f;

        static {
            kge.a(-1523775002);
        }

        public b(Context context, s sVar, AURARenderComponent aURARenderComponent, JSONObject jSONObject, String str, Map<String, Object> map) {
            this.f27050a = context;
            this.b = sVar;
            this.c = aURARenderComponent;
            this.d = jSONObject;
            this.e = str;
            this.f = map;
        }

        public void b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            } else if (this.c.data != null && this.c.data.fields != null && this.c.data.fields.get(dwy.KEY_DETAIL) != null && Boolean.parseBoolean(String.valueOf(this.c.data.fields.get(dwy.KEY_DETAIL)))) {
                this.c.data.fields.put(dwy.KEY_DETAIL_COLLECTED, Boolean.valueOf(z));
                this.b.a("aura.workflow.adjustRules", new UMFRuleIO(Arrays.asList(bbg.a(RuleType.PROPS_WRITE_BACK, this.c, new HashMap()))), null);
            } else {
                this.b.a("aura.workflow.adjustRules", new UMFRuleIO(Arrays.asList(dwy.a(z, this.c, this.d))), null);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class d extends b implements dwy.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1160397143);
            kge.a(-852374799);
        }

        public d(Context context, s sVar, AURARenderComponent aURARenderComponent, JSONObject jSONObject, String str, Map<String, Object> map) {
            super(context, sVar, aURARenderComponent, jSONObject, str, map);
        }

        @Override // tb.dwy.c
        public void a(boolean z) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                return;
            }
            Map map = null;
            String str2 = "";
            if (this.f27050a instanceof DetailCoreActivity) {
                DetailCoreActivity detailCoreActivity = (DetailCoreActivity) this.f27050a;
                ItemNode c = eqb.c(detailCoreActivity.C().f10055a);
                str2 = c.categoryId;
                str = String.valueOf(c.rootCategoryId);
                map = (Map) eqb.l(detailCoreActivity.C().f10055a).getData().getObject("globalNativeParams", Map.class);
            } else {
                str = str2;
            }
            if (z) {
                dwy.a(this.e, new c(this.f27050a, this.b, this.c, this.d, this.e, this.f));
                eps.a(this.f27050a, "CancelFavorite", new Pair("spm", "a2141.7631564.cancelfavorite"), new Pair("categoryId", str2), new Pair("rootCategoryId", str));
                return;
            }
            dwy.b(this.e, map, new a(this.f27050a, this.b, this.c, this.d, this.e, this.f));
            eps.a(this.f27050a, "AddToFavorite", new Pair("spm", "a2141.7631564.addtofavorite"), new Pair("categoryId", str2), new Pair("rootCategoryId", str));
        }

        @Override // tb.dwy.c
        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                return;
            }
            Toast.makeText(this.f27050a, str2, 0).show();
            ecg.b(this.e, str, str2);
            arc.a().c("AliDetailCollectClickEvent", "InnerQueryCollectCallback.onQueryFailed", str2);
        }
    }

    /* loaded from: classes4.dex */
    public static class a extends b implements dwy.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1690615714);
            kge.a(1257007224);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public a(Context context, s sVar, AURARenderComponent aURARenderComponent, JSONObject jSONObject, String str, Map<String, Object> map) {
            super(context, sVar, aURARenderComponent, jSONObject, str, map);
        }

        @Override // tb.dwy.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            epo.a(com.alibaba.ability.localization.b.a(R.string.x_detail_app_congratulations_collection_success));
            b(true);
            if (a(this.d) || com.alibaba.ability.localization.b.c()) {
                return;
            }
            b();
        }

        @Override // tb.dwy.a
        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                return;
            }
            if (ErrorConstant.isSessionInvalid(str) || StringUtils.equals(str, "ANDROID_SYS_LOGIN_CANCEL")) {
                epo.a(com.alibaba.ability.localization.b.a(R.string.x_detail_app_not_login));
            } else if (com.alibaba.ability.localization.b.c()) {
                epo.a(com.alibaba.ability.localization.b.a(R.string.x_detail_app_collect_fail));
            } else {
                epo.a(str2);
            }
            ecg.j(this.f27050a, this.e, str, str2);
            arc.a().c("AliDetailCollectClickEvent", "InnerAddCollectCallback.onAddFailed", str2);
            b(false);
        }

        private boolean a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("266fb8c", new Object[]{this, jSONObject})).booleanValue();
            }
            Object obj = jSONObject.get("ignoreCollectCategory");
            return (obj instanceof String) && "true".equals(obj);
        }

        private void b() {
            View v;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            } else if (this.f == null || !(this.f.get(com.taobao.android.adam.common.b.PARSER_KEY_DX_RUNTIMECONTEXT) instanceof DXRuntimeContext) || (v = ((DXRuntimeContext) this.f.get(com.taobao.android.adam.common.b.PARSER_KEY_DX_RUNTIMECONTEXT)).v()) == null) {
            } else {
                int[] iArr = new int[2];
                v.getLocationOnScreen(iArr);
                dwy.a(this.e, iArr[0] + (v.getWidth() / 2), iArr[1], new e(this.f27050a, this.b, this.c, this.d, this.e, this.f));
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class c extends b implements dwy.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1789552645);
            kge.a(-476835413);
        }

        public c(Context context, s sVar, AURARenderComponent aURARenderComponent, JSONObject jSONObject, String str, Map<String, Object> map) {
            super(context, sVar, aURARenderComponent, jSONObject, str, map);
        }

        @Override // tb.dwy.b
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            epo.a(com.alibaba.ability.localization.b.a(R.string.x_detail_app_cancel_collection_success));
            b(false);
        }

        @Override // tb.dwy.b
        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                return;
            }
            if (ErrorConstant.isSessionInvalid(str) || StringUtils.equals(str, "ANDROID_SYS_LOGIN_CANCEL")) {
                epo.a(com.alibaba.ability.localization.b.a(R.string.x_detail_app_not_login));
            } else if (com.alibaba.ability.localization.b.c()) {
                epo.a(com.alibaba.ability.localization.b.a(R.string.x_detail_app_cancel_collect_fail));
            } else {
                epo.a(str2);
            }
            ecg.k(this.f27050a, this.e, str, str2);
            arc.a().c("AliDetailCollectClickEvent", "InnerCancelCollectCallback.onCancelFailed", str2);
            b(true);
        }
    }

    /* loaded from: classes4.dex */
    public static class e extends b implements dwy.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-2083733138);
            kge.a(1130491400);
        }

        public e(Context context, s sVar, AURARenderComponent aURARenderComponent, JSONObject jSONObject, String str, Map<String, Object> map) {
            super(context, sVar, aURARenderComponent, jSONObject, str, map);
        }

        @Override // tb.dwy.d
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            } else if (StringUtils.isEmpty(str)) {
            } else {
                if ((this.f27050a instanceof Activity) && !((Activity) this.f27050a).hasWindowFocus()) {
                    return;
                }
                epj.f().navigateTo(this.f27050a, str, null);
            }
        }

        @Override // tb.dwy.d
        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                return;
            }
            ecg.i(this.f27050a, this.e, str, str2);
            arc.a().c("AliDetailCollectClickEvent", "InnerShowCategoryListCallback.onShowCategoryListFailed", str2);
        }
    }
}
