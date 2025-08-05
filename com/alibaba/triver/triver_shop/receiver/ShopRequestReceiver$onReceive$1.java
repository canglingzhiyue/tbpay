package com.alibaba.triver.triver_shop.receiver;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.ext.b;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.rul;

/* loaded from: classes3.dex */
public final class ShopRequestReceiver$onReceive$1 extends Lambda implements rul<JSONObject, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ boolean $changeToFollow;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ boolean $star;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopRequestReceiver$onReceive$1(boolean z, Context context, boolean z2) {
        super(1);
        this.$star = z;
        this.$context = context;
        this.$changeToFollow = z2;
    }

    @Override // tb.rul
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2421invoke(JSONObject jSONObject) {
        invoke2(jSONObject);
        return t.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("583b49d1", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
        } else {
            JSONObject jSONObject2 = new JSONObject();
            Object obj = jSONObject.get("data");
            if (!(obj instanceof JSONObject)) {
                obj = jSONObject2;
            }
            if (!q.a((Object) "true", (Object) ((JSONObject) obj).getString("result"))) {
                return;
            }
            String str = "设置成功";
            if (this.$star) {
                Context context = this.$context;
                if (!this.$changeToFollow) {
                    str = "星标订阅成功";
                }
                b.b(context, str);
                return;
            }
            Context context2 = this.$context;
            if (!this.$changeToFollow) {
                str = "取消星标成功";
            }
            b.b(context2, str);
        }
    }
}
