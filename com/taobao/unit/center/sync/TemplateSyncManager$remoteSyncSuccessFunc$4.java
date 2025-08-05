package com.taobao.unit.center.sync;

import com.alibaba.security.realidentity.p1;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.q;
import kotlin.reflect.e;
import kotlin.t;
import org.json.JSONObject;
import tb.rul;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", p1.d, "Lorg/json/JSONObject;", "Lkotlin/ParameterName;", "name", "jsonObject", "invoke"}, k = 3, mv = {1, 1, 15})
/* loaded from: classes9.dex */
public final /* synthetic */ class TemplateSyncManager$remoteSyncSuccessFunc$4 extends FunctionReference implements rul<JSONObject, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public TemplateSyncManager$remoteSyncSuccessFunc$4(TemplateSyncManager templateSyncManager) {
        super(1, templateSyncManager);
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.b
    public final String getName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this}) : "remoteSyncSuccessFunc";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final e getOwner() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("81e00b1c", new Object[]{this}) : kotlin.jvm.internal.t.b(TemplateSyncManager.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final String getSignature() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1f15da37", new Object[]{this}) : "remoteSyncSuccessFunc(Lorg/json/JSONObject;)V";
    }

    @Override // tb.rul
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2421invoke(JSONObject jSONObject) {
        invoke2(jSONObject);
        return t.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(JSONObject p1) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81eeca1f", new Object[]{this, p1});
            return;
        }
        q.c(p1, "p1");
        TemplateSyncManager.access$remoteSyncSuccessFunc((TemplateSyncManager) this.receiver, p1);
    }
}
