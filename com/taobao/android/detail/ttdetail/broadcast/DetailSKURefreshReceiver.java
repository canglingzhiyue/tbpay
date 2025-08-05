package com.taobao.android.detail.ttdetail.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.taobao.android.detail.ttdetail.component.module.d;
import com.taobao.taobao.R;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.text.n;
import tb.eyx;
import tb.eyy;
import tb.iao;
import tb.kge;
import tb.odg;
import tb.pir;
import tb.pkw;
import tb.ptl;
import tb.qms;
import tb.qpk;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0007\"\b\b\u0000\u0010\b*\u00020\tH\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u001c\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u001c\u0010\u0014\u001a\u00020\u000f2\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\u0016\u001a\u00020\u000bH\u0002R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/taobao/android/detail/ttdetail/broadcast/DetailSKURefreshReceiver;", "Landroid/content/BroadcastReceiver;", "detailContext", "Lcom/taobao/android/detail/ttdetail/context/DetailContext;", "(Lcom/taobao/android/detail/ttdetail/context/DetailContext;)V", "mDetailContext", "findSkuComponentInRenderList", "Lcom/taobao/android/detail/ttdetail/component/module/Component;", "T", "Lcom/taobao/android/detail/ttdetail/data/ComponentData;", "generateSKUSelectedText", "", "selectedTextJson", "Lcom/alibaba/fastjson/JSONObject;", iao.NEXT_TAG_RECEIVER, "", "context", "Landroid/content/Context;", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "Landroid/content/Intent;", "updateMainScreenSkuComponent", "component", "text", "Companion", "tt-detail_release"}, k = 1, mv = {1, 1, 16})
/* loaded from: classes4.dex */
public final class DetailSKURefreshReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private final eyx f10511a;

    static {
        kge.a(377577023);
        Companion = new a(null);
    }

    public static /* synthetic */ Object ipc$super(DetailSKURefreshReceiver detailSKURefreshReceiver, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/taobao/android/detail/ttdetail/broadcast/DetailSKURefreshReceiver$Companion;", "", "()V", "KEY_EXTRA_TEXT", "", "KEY_ID_SELECTED_TEXT", "KEY_PROP_TEXT_LIST", "KEY_SELECTED_SKU_ID", "KEY_SELECTED_TEXT_MAP", "KEY_SERVICE_TEXT_LIST", "KEY_VALUE_DISMISS", "tt-detail_release"}, k = 1, mv = {1, 1, 16})
    /* loaded from: classes4.dex */
    public static final class a {
        static {
            kge.a(-994326841);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    public DetailSKURefreshReceiver(eyx detailContext) {
        q.c(detailContext, "detailContext");
        this.f10511a = detailContext;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        JSONObject parseObject;
        d<?> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        String str = null;
        if (Boolean.parseBoolean(intent != null ? intent.getStringExtra("onDismiss") : null)) {
            return;
        }
        if (intent != null) {
            str = intent.getStringExtra("selectedTextMap");
        }
        if (TextUtils.isEmpty(str) || (parseObject = JSON.parseObject(str)) == null) {
            return;
        }
        String a3 = a(parseObject);
        if (TextUtils.isEmpty(a3) || (a2 = a()) == null) {
            return;
        }
        a(a2, a3);
    }

    private final String a(JSONObject jSONObject) {
        String a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("15c87a18", new Object[]{this, jSONObject});
        }
        if (jSONObject.getBooleanValue("selectedSkuId")) {
            a2 = odg.o().a(R.string.tt_detail_sku_selected);
            q.a((Object) a2, "PlatformEvn.getLocalizat…g.tt_detail_sku_selected)");
        } else {
            a2 = odg.o().a(R.string.tt_detail_sku_select);
            q.a((Object) a2, "PlatformEvn.getLocalizat…ing.tt_detail_sku_select)");
        }
        String str = a2 + " ";
        JSONArray jSONArray = jSONObject.getJSONArray("propTextList");
        if (jSONArray != null) {
            String str2 = str;
            for (int i = 0; i < jSONArray.size(); i++) {
                str2 = str2 + jSONArray.getString(i) + " / ";
            }
            str = str2;
        }
        JSONArray jSONArray2 = jSONObject.getJSONArray("serviceTextList");
        if (jSONArray2 != null) {
            String str3 = str;
            for (int i2 = 0; i2 < jSONArray2.size(); i2++) {
                str3 = str3 + jSONArray2.getString(i2) + " / ";
            }
            str = str3;
        }
        if (str.length() <= 3) {
            return str;
        }
        int length = str.length() - 3;
        if (str == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        String substring = str.substring(0, length);
        q.a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [tb.eyy, java.lang.Object] */
    private final <T extends eyy> d<?> a() {
        qpk h;
        ptl f;
        d<?> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("63731b33", new Object[]{this});
        }
        pir pirVar = (pir) this.f10511a.a().a(pkw.PARSER_ID);
        if (pirVar == null || (h = pirVar.h()) == null || (f = h.f()) == null) {
            return null;
        }
        int b = f.b();
        for (int i = 0; i < b; i++) {
            qms a3 = f.a(i);
            if (a3 != null && (a2 = a3.a(this.f10511a.d())) != null) {
                ?? componentData = a2.getComponentData();
                q.a((Object) componentData, "component.componentData");
                String c = componentData.c();
                if (c != null) {
                    String str = c;
                    if (n.b((CharSequence) str, (CharSequence) "detail_v3_sku", false, 2, (Object) null) || n.b((CharSequence) str, (CharSequence) "tbovs_pdp_sku_i18n", false, 2, (Object) null)) {
                        return a2;
                    }
                } else {
                    continue;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [tb.eyy, java.lang.Object] */
    private final void a(d<?> dVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ac32b3d", new Object[]{this, dVar, str});
            return;
        }
        ?? componentData = dVar.getComponentData();
        q.a((Object) componentData, "component.componentData");
        JSONObject d = componentData.d();
        if (d == null) {
            return;
        }
        JSONObject jSONObject = d;
        jSONObject.put((JSONObject) "extraText", str);
        jSONObject.put((JSONObject) "idSelectedText", "true");
        dVar.updateComponent();
    }
}
