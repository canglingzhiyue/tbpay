package com.taobao.themis.mix.pha_render;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pha.core.i;
import com.taobao.tao.remotebusiness.login.e;
import com.taobao.tao.remotebusiness.login.h;
import com.taobao.themis.kernel.metaInfo.TMSMetaInfoWrapper;
import com.taobao.themis.kernel.page.ITMSPage;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import mtopsdk.mtop.intf.Mtop;
import tb.kge;
import tb.neh;
import tb.ngf;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J(\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\rH\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/taobao/themis/mix/pha_render/TinyExternalMethodChannel;", "Lcom/taobao/pha/core/IExternalMethodChannel;", "mContext", "Landroid/content/Context;", "mPage", "Lcom/taobao/themis/kernel/page/ITMSPage;", "(Landroid/content/Context;Lcom/taobao/themis/kernel/page/ITMSPage;)V", "callExternalAbility", "", "s", "", "s1", "jsonObject", "Lcom/alibaba/fastjson/JSONObject;", "iExternalAbilityCallback", "Lcom/taobao/pha/core/IExternalMethodChannel$IExternalAbilityCallback;", "configExternalEnvForRender", "iWebView", "Lcom/taobao/pha/core/ui/view/IWebView;", "configExternalEnvForWorker", "appWorker", "Lcom/taobao/pha/core/appworker/AppWorker;", "getAppInfo", "isNavigateInnerDomainValid", "", "themis_mix_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class b implements i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Context f22587a;
    private final ITMSPage b;

    static {
        kge.a(715343197);
        kge.a(917243461);
    }

    @Override // com.taobao.pha.core.i
    public void a(String s, String s1, JSONObject jsonObject, i.a iExternalAbilityCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51fd77de", new Object[]{this, s, s1, jsonObject, iExternalAbilityCallback});
            return;
        }
        q.d(s, "s");
        q.d(s1, "s1");
        q.d(jsonObject, "jsonObject");
        q.d(iExternalAbilityCallback, "iExternalAbilityCallback");
    }

    @Override // com.taobao.pha.core.i
    public void a(neh appWorker) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6098fa7", new Object[]{this, appWorker});
        } else {
            q.d(appWorker, "appWorker");
        }
    }

    @Override // com.taobao.pha.core.i
    public void a(ngf iWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f624d5eb", new Object[]{this, iWebView});
        } else {
            q.d(iWebView, "iWebView");
        }
    }

    public b(Context mContext, ITMSPage mPage) {
        q.d(mContext, "mContext");
        q.d(mPage, "mPage");
        this.f22587a = mContext;
        this.b = mPage;
    }

    @Override // com.taobao.pha.core.i
    public JSONObject a() {
        Mtop instance;
        e b;
        e b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("709f7788", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        Mtop instance2 = Mtop.instance(Mtop.Id.INNER, this.f22587a);
        if (instance2 != null && (b2 = h.b(instance2, null)) != null) {
            jSONObject.put((JSONObject) "client_uid", b2.b);
        }
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((JSONObject) "miniapp_id", this.b.b().h());
        TMSMetaInfoWrapper v = this.b.b().v();
        String i = v != null ? v.i() : null;
        if (!TextUtils.isEmpty(i) && (instance = Mtop.instance(i, this.f22587a)) != null && (b = h.b(instance, null)) != null) {
            jSONObject2.put((JSONObject) "miniapp_uid", b.b);
        }
        return jSONObject;
    }
}
