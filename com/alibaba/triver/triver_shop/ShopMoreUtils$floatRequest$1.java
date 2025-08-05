package com.alibaba.triver.triver_shop;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.ext.b;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import java.nio.charset.Charset;
import kotlin.jvm.internal.q;
import kotlin.t;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.ceg;
import tb.ruw;

/* loaded from: classes3.dex */
public final class ShopMoreUtils$floatRequest$1 implements IRemoteBaseListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ ruw<Integer, JSONObject, t> $callback;

    /* JADX WARN: Multi-variable type inference failed */
    public ShopMoreUtils$floatRequest$1(ruw<? super Integer, ? super JSONObject, t> ruwVar) {
        this.$callback = ruwVar;
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            return;
        }
        byte[] bArr = null;
        ceg.Companion.a(q.a("hover.fetch success : ", (Object) b.a(mtopResponse == null ? null : mtopResponse.getBytedata())));
        if (mtopResponse != null) {
            bArr = mtopResponse.getBytedata();
        }
        JSONObject a2 = com.alibaba.triver.triver_shop.newShop.ext.d.a(bArr);
        if (a2 == null) {
            return;
        }
        JSONObject data = a2.getJSONObject("data");
        q.b(data, "data");
        Number number = 0;
        Object obj2 = data.get("maxCount");
        if (obj2 instanceof Integer) {
            number = obj2;
        }
        int intValue = number.intValue();
        JSONObject moduleConfigs = data.getJSONObject("moduleConfigs");
        ruw<Integer, JSONObject, t> ruwVar = this.$callback;
        if (ruwVar == null) {
            return;
        }
        Integer valueOf = Integer.valueOf(intValue);
        q.b(moduleConfigs, "moduleConfigs");
        ruwVar.mo2423invoke(valueOf, moduleConfigs);
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
        byte[] bytedata;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        ceg.a aVar = ceg.Companion;
        String str = null;
        if (mtopResponse != null && (bytedata = mtopResponse.getBytedata()) != null) {
            Charset defaultCharset = Charset.defaultCharset();
            q.b(defaultCharset, "defaultCharset()");
            str = new String(bytedata, defaultCharset);
        }
        aVar.a(q.a("hover.fetch systemError : ", (Object) str));
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onError(int i, MtopResponse mtopResponse, Object obj) {
        byte[] bytedata;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        ceg.a aVar = ceg.Companion;
        String str = null;
        if (mtopResponse != null && (bytedata = mtopResponse.getBytedata()) != null) {
            Charset defaultCharset = Charset.defaultCharset();
            q.b(defaultCharset, "defaultCharset()");
            str = new String(bytedata, defaultCharset);
        }
        aVar.a(q.a("hover.fetch onError : ", (Object) str));
    }
}
