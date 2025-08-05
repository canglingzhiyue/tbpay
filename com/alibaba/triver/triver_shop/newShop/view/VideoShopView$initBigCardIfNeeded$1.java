package com.alibaba.triver.triver_shop.newShop.view;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.t;
import tb.ruw;

/* loaded from: classes3.dex */
public /* synthetic */ class VideoShopView$initBigCardIfNeeded$1 extends FunctionReferenceImpl implements ruw<String, JSONObject, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public VideoShopView$initBigCardIfNeeded$1(VideoShopView videoShopView) {
        super(2, videoShopView, VideoShopView.class, "processEvent", "processEvent(Ljava/lang/String;Lcom/alibaba/fastjson/JSONObject;)V", 0);
    }

    @Override // tb.ruw
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2423invoke(String str, JSONObject jSONObject) {
        invoke2(str, jSONObject);
        return t.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe686b07", new Object[]{this, str, jSONObject});
        } else {
            VideoShopView.access$processEvent((VideoShopView) this.receiver, str, jSONObject);
        }
    }
}
