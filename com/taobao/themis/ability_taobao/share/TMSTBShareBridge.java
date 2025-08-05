package com.taobao.themis.ability_taobao.share;

import android.app.Activity;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.container.dx.DxContainerActivity;
import com.taobao.themis.kernel.ability.base.ApiContext;
import com.taobao.themis.kernel.ability.base.annotation.APIMethod;
import com.taobao.themis.kernel.ability.base.annotation.BindingApiContext;
import com.taobao.themis.kernel.ability.base.annotation.BindingCallback;
import com.taobao.themis.kernel.ability.base.annotation.BindingParam;
import com.taobao.themis.kernel.ability.base.annotation.ThreadType;
import com.taobao.themis.kernel.adapter.IShareAdapter;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.utils.m;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.collections.p;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import mtopsdk.mtop.upload.domain.UploadConstants;
import tb.kge;
import tb.qpt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016JÒ\u0001\u0010\u0006\u001a\u00020\u00042\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0001\u0010\t\u001a\u00020\n2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\f2\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\f2\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\f2\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\f2\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\f2\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\f2\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\f2\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\f2\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\f2\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\u0016H\u0007¨\u0006\u001e"}, d2 = {"Lcom/taobao/themis/ability_taobao/share/TMSTBShareBridge;", "Lcom/taobao/themis/kernel/ability/base/TMSAbility;", "()V", "onFinalized", "", "onInitialized", "shareTinyAppMsg", "apiContext", "Lcom/taobao/themis/kernel/ability/base/ApiContext;", "bridgeCallback", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;", "title", "", "desc", "imageUrl", "path", "content", "bgImgUrl", "url", "targets", "Lcom/alibaba/fastjson/JSONArray;", "extraParams", "Lcom/alibaba/fastjson/JSONObject;", "type", "from", "pageParam", UploadConstants.BIZ_CODE, "shareMode", DxContainerActivity.PARAMS_URL_BUSINESS_PARAMS, "Companion", "themis_ability_taobao_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class TMSTBShareBridge implements com.taobao.themis.kernel.ability.base.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\b"}, d2 = {"com/taobao/themis/ability_taobao/share/TMSTBShareBridge$shareTinyAppMsg$1", "Lcom/taobao/themis/kernel/adapter/IShareAdapter$IShareListener;", "onCancel", "", "msg", "", "onFail", "onSuccess", "themis_ability_taobao_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class b implements IShareAdapter.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.themis.kernel.adapter.IShareAdapter.b
        public void a(String msg) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, msg});
            } else {
                q.d(msg, "msg");
            }
        }

        @Override // com.taobao.themis.kernel.adapter.IShareAdapter.b
        public void b(String msg) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3dd7e573", new Object[]{this, msg});
            } else {
                q.d(msg, "msg");
            }
        }

        @Override // com.taobao.themis.kernel.adapter.IShareAdapter.b
        public void c(String msg) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("88097eb4", new Object[]{this, msg});
            } else {
                q.d(msg, "msg");
            }
        }
    }

    static {
        kge.a(1566799558);
        kge.a(-86622547);
        Companion = new a(null);
    }

    @Override // com.taobao.themis.kernel.ability.base.a
    public void onFinalized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd1b9dee", new Object[]{this});
        }
    }

    @Override // com.taobao.themis.kernel.ability.base.a
    public void onInitialized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f2f17c", new Object[]{this});
        }
    }

    @ThreadType(ExecutorType.IDLE)
    @APIMethod
    public final void shareTinyAppMsg(@BindingApiContext ApiContext apiContext, @BindingCallback BridgeCallback bridgeCallback, @BindingParam({"title"}) String str, @BindingParam({"desc"}) String str2, @BindingParam({"imageUrl"}) String str3, @BindingParam({"path"}) String str4, @BindingParam({"content"}) String str5, @BindingParam({"bgImgUrl"}) String str6, @BindingParam({"url"}) String str7, @BindingParam({"targets"}) JSONArray jSONArray, @BindingParam({"extraParams"}) JSONObject jSONObject, @BindingParam({"type"}) String str8, @BindingParam({"from"}) String str9, @BindingParam({"page"}) String str10, @BindingParam({"bizcode"}) String str11, @BindingParam({"shareMode"}) String str12, @BindingParam({"urlParams"}) JSONObject jSONObject2) {
        ArrayList arrayList;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f35f115", new Object[]{this, apiContext, bridgeCallback, str, str2, str3, str4, str5, str6, str7, jSONArray, jSONObject, str8, str9, str10, str11, str12, jSONObject2});
            return;
        }
        q.d(bridgeCallback, "bridgeCallback");
        if (apiContext == null || apiContext.a() == null || !(apiContext.d() instanceof ITMSPage) || !(apiContext.c() instanceof f)) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            return;
        }
        ITMSPage d = apiContext.d();
        f c = apiContext.c();
        if (d == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            return;
        }
        String str13 = str11;
        String str14 = str13 == null || str13.length() == 0 ? "1115_snipcode" : str11;
        String uri = m.a(d, c, str4, jSONObject).toString();
        q.b(uri, "TMSAppUtils.getSharedUrl…, extraParams).toString()");
        String str15 = str2;
        if (str15 != null && str15.length() != 0) {
            z = false;
        }
        String str16 = z ? "我分享给你了一个淘宝页面，快来看看吧" : str2;
        HashMap hashMap = new HashMap();
        hashMap.put("path", str4);
        t tVar = t.INSTANCE;
        if (jSONArray != null) {
            JSONArray<Object> jSONArray2 = jSONArray;
            ArrayList arrayList2 = new ArrayList(p.a((Iterable) jSONArray2, 10));
            for (Object obj : jSONArray2) {
                arrayList2.add(obj.toString());
            }
            arrayList = new ArrayList(arrayList2);
        } else {
            arrayList = null;
        }
        IShareAdapter.a aVar = new IShareAdapter.a(str14, uri, str, str16, str3, hashMap, null, arrayList, 64, null);
        Activity a2 = apiContext.a();
        q.b(a2, "apiContext.activity");
        ((IShareAdapter) qpt.a(IShareAdapter.class)).share(a2, d, aVar, new b());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/taobao/themis/ability_taobao/share/TMSTBShareBridge$Companion;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "themis_ability_taobao_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a {
        static {
            kge.a(1316627086);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }
}
