package com.alibaba.triver.triver_shop.shop2023;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.WeexValueImpl;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.ruk;

/* loaded from: classes3.dex */
public final class XSDStoreWeexModeComponent$initComponent$1$1$onGetData$1 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Object $data;
    public final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XSDStoreWeexModeComponent$initComponent$1$1$onGetData$1(c cVar, Object obj) {
        super(0);
        this.this$0 = cVar;
        this.$data = obj;
    }

    @Override // tb.ruk
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2427invoke() {
        mo2427invoke();
        return t.INSTANCE;
    }

    @Override // tb.ruk
    /* renamed from: invoke  reason: collision with other method in class */
    public final void mo2427invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        c cVar = this.this$0;
        WeexInstance weexInstance = c.$ipChange;
        if (weexInstance == null) {
            return;
        }
        weexInstance.updateInstanceData("shop", "xsdCategory", WeexValueImpl.ofJSON((JSONObject) this.$data));
    }
}
