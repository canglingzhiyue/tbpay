package com.taobao.mytaobao.ultron.event;

import android.text.TextUtils;
import android.util.Log;
import com.alibaba.android.ultron.event.base.e;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import kotlin.Metadata;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014¨\u0006\b"}, d2 = {"Lcom/taobao/mytaobao/ultron/event/MtbAsyncRefreshSubscriber;", "Lcom/alibaba/android/ultron/event/AsyncRefreshSubscriber;", "()V", "considerProcessQueryParams", "", "onHandleEvent", "event", "Lcom/alibaba/android/ultron/event/base/UltronEvent;", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class v extends com.alibaba.android.ultron.event.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1282839084);
    }

    public static /* synthetic */ Object ipc$super(v vVar, String str, Object... objArr) {
        if (str.hashCode() == -1814481661) {
            super.a((e) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.alibaba.android.ultron.event.b, com.alibaba.android.ultron.event.q
    public void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93d93503", new Object[]{this, eVar});
            return;
        }
        e();
        super.a(eVar);
    }

    private final void e() {
        JSONObject fields;
        JSONObject jSONObject;
        JSONObject parseObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        try {
            e eVar = this.c;
            Object i = eVar != null ? eVar.i() : null;
            if (!(i instanceof com.taobao.android.ultron.common.model.b)) {
                i = null;
            }
            com.taobao.android.ultron.common.model.b bVar = (com.taobao.android.ultron.common.model.b) i;
            if (bVar != null && (fields = bVar.getFields()) != null && (jSONObject = fields.getJSONObject("mtopConfig")) != null) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                if (jSONObject2 == null) {
                    jSONObject2 = new JSONObject();
                }
                jSONObject.put("data", (Object) jSONObject2);
                String string = jSONObject2.getString(PushConstants.PARAMS);
                if (TextUtils.isEmpty(string)) {
                    parseObject = new JSONObject();
                } else {
                    parseObject = JSON.parseObject(string);
                    kotlin.jvm.internal.q.a((Object) parseObject, "JSON.parseObject(paramsStr)");
                }
                JSONObject jSONObject3 = parseObject;
                String str = com.taobao.mytaobao.base.c.x;
                if (str == null) {
                    str = "";
                }
                jSONObject3.put((JSONObject) "pageLeaveUrl", str);
                Float w = com.taobao.mytaobao.base.c.w();
                if (w != null) {
                    parseObject.put((JSONObject) com.taobao.infoflow.taobao.subservice.biz.videocardanimationservice.impl.d.ASPECT_RATIO, (String) w);
                }
                jSONObject2.put(PushConstants.PARAMS, (Object) JSON.toJSONString(parseObject));
                com.taobao.mytaobao.base.c.x = null;
            }
        } catch (Throwable th) {
            Log.e("MtbAsyncRefreshSsb", "considerProcessQueryParams error" + th.toString());
        }
    }
}
