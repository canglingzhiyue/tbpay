package com.taobao.mytaobao.ultron.event;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.event.DXPageChangeEvent;
import com.taobao.android.dinamicx.h;
import com.taobao.android.task.Coordinator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes7.dex */
public class r extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_MTBSLIDEREXPOSEUT = 8542676456097187284L;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, Boolean> f18516a;
    private final boolean b;

    public static /* synthetic */ boolean a(r rVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("26eed0b7", new Object[]{rVar})).booleanValue() : rVar.b;
    }

    static {
        kge.a(-1343991027);
        f18516a = new HashMap(4);
    }

    public r(boolean z) {
        this.b = z;
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (objArr == null || objArr.length < 2) {
        } else {
            String str = (String) objArr[0];
            List list = (List) objArr[1];
            int i = ((DXPageChangeEvent) dXEvent).pageIndex;
            if (list == null || list.size() <= i) {
                return;
            }
            String str2 = str + i;
            if (f18516a.containsKey(str2)) {
                return;
            }
            final Object obj = list.get(i);
            if (!(obj instanceof JSONObject)) {
                return;
            }
            f18516a.put(str2, true);
            Coordinator.execute(new Runnable() { // from class: com.taobao.mytaobao.ultron.event.r.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    JSONObject jSONObject = (JSONObject) obj;
                    if (r.a(r.this)) {
                        com.taobao.mytaobao.ut.c.a("Page_MyTaobao", 2201, jSONObject.getString("arg1"), (String) null, (String) null, jSONObject.getJSONObject("args"));
                        return;
                    }
                    JSONObject jSONObject2 = jSONObject.getJSONObject("fields");
                    if (jSONObject2 == null) {
                        return;
                    }
                    com.taobao.mytaobao.ut.c.a(jSONObject2.getString("page"), jSONObject2.getIntValue("eventId"), jSONObject2.getString("arg1"), (String) null, (String) null, jSONObject2.getJSONObject("args"));
                }
            });
        }
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else {
            f18516a.clear();
        }
    }
}
