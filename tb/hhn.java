package tb;

import android.app.Activity;
import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.live.plugin.atype.flexalocal.good.a;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c;
import com.taobao.taolive.sdk.model.common.LiveItem;
import java.util.HashMap;

/* loaded from: classes5.dex */
public class hhn extends iot {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_TBLIVEGOODCASEGOTODETAIL = 6265984300845690767L;

    static {
        kge.a(1643175764);
    }

    public static /* synthetic */ Object ipc$super(hhn hhnVar, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void prepareBindEventWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a67c4e2", new Object[]{this, objArr, dXRuntimeContext});
        } else {
            super.prepareBindEventWithArgs(objArr, dXRuntimeContext);
        }
    }

    @Override // tb.iot
    public void a(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cc53e1f", new Object[]{this, dXEvent, objArr, dXRuntimeContext, cVar});
            return;
        }
        try {
            JSONObject jSONObject = (JSONObject) objArr[0];
            Context m = dXRuntimeContext.m();
            LiveItem liveItem = (LiveItem) pqj.a(jSONObject.toJSONString(), LiveItem.class);
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            hashMap2.putAll(hashMap);
            if (!hashMap.containsKey("channel")) {
                hashMap2.put("channel", "goods");
            }
            hashMap2.put("itemlistType", "dx");
            hashMap.put("laiyuan", "2");
            hashMap.put("item_position", jSONObject.getString("item_position"));
            String str = "1";
            if (liveItem.extendVal != null && "secKill".equals(liveItem.extendVal.itemBizType)) {
                str = "2";
            }
            hashMap.put("bubbleType", str);
            if (a.a().i() == null) {
                return;
            }
            a.a().i().a(cVar == null ? null : cVar.C(), (Activity) m, liveItem, "detail", hashMap);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
