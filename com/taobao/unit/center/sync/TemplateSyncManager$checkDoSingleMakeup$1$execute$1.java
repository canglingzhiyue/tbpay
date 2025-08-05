package com.taobao.unit.center.sync;

import com.alibaba.security.realidentity.p1;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.q;
import kotlin.reflect.e;
import kotlin.t;
import org.json.JSONObject;
import tb.ruw;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u00062\u0015\u0010\u0007\u001a\u00110\b¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\t¢\u0006\u0002\b\n"}, d2 = {"<anonymous>", "", p1.d, "", "Lkotlin/ParameterName;", "name", "templateId", "p2", "Lorg/json/JSONObject;", "jsonObject", "invoke"}, k = 3, mv = {1, 1, 15})
/* loaded from: classes9.dex */
public final /* synthetic */ class TemplateSyncManager$checkDoSingleMakeup$1$execute$1 extends FunctionReference implements ruw<Integer, JSONObject, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public TemplateSyncManager$checkDoSingleMakeup$1$execute$1(TemplateSyncManager templateSyncManager) {
        super(2, templateSyncManager);
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.b
    public final String getName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this}) : "remoteSingleSyncFunc";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final e getOwner() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("81e00b1c", new Object[]{this}) : kotlin.jvm.internal.t.b(TemplateSyncManager.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final String getSignature() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1f15da37", new Object[]{this}) : "remoteSingleSyncFunc(ILorg/json/JSONObject;)V";
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [kotlin.t, java.lang.Object] */
    @Override // tb.ruw
    /* renamed from: invoke */
    public /* synthetic */ t mo2423invoke(Integer num, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("77c951db", new Object[]{this, num, jSONObject});
        }
        invoke(num.intValue(), jSONObject);
        return t.INSTANCE;
    }

    public final void invoke(int i, JSONObject p2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cb1425a", new Object[]{this, new Integer(i), p2});
            return;
        }
        q.c(p2, "p2");
        TemplateSyncManager.access$remoteSingleSyncFunc((TemplateSyncManager) this.receiver, i, p2);
    }
}
