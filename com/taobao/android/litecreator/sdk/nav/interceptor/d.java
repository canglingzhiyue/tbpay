package com.taobao.android.litecreator.sdk.nav.interceptor;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.ui.coordinatorcard.FactoryType;
import com.taobao.android.litecreator.sdk.nav.LCNavInterceptor;
import com.taobao.taopai.material.bean.MaterialDetail;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import org.json.JSONObject;
import tb.hnl;
import tb.kge;
import tb.ruk;
import tb.sqj;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/taobao/android/litecreator/sdk/nav/interceptor/PageTabsInterceptor;", "Lcom/taobao/android/litecreator/sdk/nav/LCNavInterceptor;", "()V", "doNav", "", "publishConfig", "Lorg/json/JSONObject;", "context", "Landroid/content/Context;", "interceptKeyword", "", "litecreator_sdk_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class d extends LCNavInterceptor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-698995991);
    }

    @Override // com.taobao.android.litecreator.sdk.nav.LCNavInterceptor
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "litecreator/tabs";
    }

    @Override // com.taobao.android.litecreator.sdk.nav.LCNavInterceptor
    public void a(JSONObject publishConfig, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f0f2232", new Object[]{this, publishConfig, context});
            return;
        }
        q.d(publishConfig, "publishConfig");
        q.d(context, "context");
        PageTabsInterceptor$doNav$doNavAction$1 pageTabsInterceptor$doNav$doNavAction$1 = new PageTabsInterceptor$doNav$doNavAction$1(this, publishConfig, context);
        if (publishConfig.has("fun_id")) {
            ((sqj) com.taobao.android.litecreator.service.b.a(sqj.class, new Object[0])).check(context, publishConfig.optInt("fun_id"), new a(pageTabsInterceptor$doNav$doNavAction$1));
        } else {
            pageTabsInterceptor$doNav$doNavAction$1.mo2427invoke();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\t\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\n"}, d2 = {"com/taobao/android/litecreator/sdk/nav/interceptor/PageTabsInterceptor$doNav$1", "Lcom/taobao/android/litecreator/sdk/interfaces/IMVersionChecker$OnCheckResult;", FactoryType.TYPE_INVALID, "", "detail", "Lcom/taobao/taopai/material/bean/MaterialDetail;", "errorCode", "", "errorMsg", "valid", "litecreator_sdk_release"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes5.dex */
    public static final class a implements sqj.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ruk f13473a;

        public a(ruk rukVar) {
            this.f13473a = rukVar;
        }

        @Override // tb.sqj.a
        public void a(MaterialDetail materialDetail) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("23a98282", new Object[]{this, materialDetail});
            } else {
                this.f13473a.mo2427invoke();
            }
        }

        @Override // tb.sqj.a
        public void a(MaterialDetail materialDetail, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c82d1e96", new Object[]{this, materialDetail, str, str2});
                return;
            }
            hnl b = d.this.b();
            if (b == null) {
                return;
            }
            hnl.a.a(b, "short_chain_failed", "material_error", d.this.c(), null, d.this.c(), null, 40, null);
        }
    }
}
