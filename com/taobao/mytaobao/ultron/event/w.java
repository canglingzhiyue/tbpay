package com.taobao.mytaobao.ultron.event;

import com.alibaba.android.ultron.event.base.e;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/taobao/mytaobao/ultron/event/MtbOpenUrlSubscriber;", "Lcom/alibaba/android/ultron/event/OpenUrlSubscriber;", "()V", "onHandleEvent", "", "event", "Lcom/alibaba/android/ultron/event/base/UltronEvent;", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class w extends com.alibaba.android.ultron.event.p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-97885792);
    }

    public static /* synthetic */ Object ipc$super(w wVar, String str, Object... objArr) {
        if (str.hashCode() == -1814481661) {
            super.a((e) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.alibaba.android.ultron.event.p, com.alibaba.android.ultron.event.q
    public void a(e eVar) {
        JSONObject fields;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93d93503", new Object[]{this, eVar});
            return;
        }
        super.a(eVar);
        com.taobao.android.ultron.common.model.b b = b();
        com.taobao.mytaobao.base.c.x = (b == null || (fields = b.getFields()) == null) ? null : fields.getString("url");
    }
}
