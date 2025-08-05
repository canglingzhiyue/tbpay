package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.live.plugin.atype.flexalocal.comments.chat.b;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c;
import com.taobao.android.live.plugin.proxy.f;
import com.taobao.taolive.sdk.goodlist.e;
import java.util.HashMap;

/* loaded from: classes5.dex */
public class hhd extends iot {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_TAOLIVEROOMCOMMONHANDLER = -1187530548089360752L;

    static {
        kge.a(-110982257);
    }

    public static /* synthetic */ Object ipc$super(hhd hhdVar, String str, Object... objArr) {
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
        if (objArr != null && objArr.length > 0) {
            Context m = dXRuntimeContext.m();
            if (objArr[0] instanceof String) {
                his.a("DXTaoLiveRoomCommonHandlerEventHandler", "click url:" + objArr[0]);
                HashMap hashMap = new HashMap(b.a((String) objArr[0]));
                if (!hashMap.containsKey("action")) {
                    return;
                }
                String str = (String) hashMap.get("action");
                hashMap.remove("action");
                HashMap hashMap2 = new HashMap();
                char c = 65535;
                int hashCode = str.hashCode();
                if (hashCode != -1571649069) {
                    if (hashCode != -1263203643) {
                        if (hashCode == -888742219 && str.equals("openGoodsContainer")) {
                            c = 1;
                        }
                    } else if (str.equals("openUrl")) {
                        c = 2;
                    }
                } else if (str.equals("openComponent")) {
                    c = 0;
                }
                a aVar = null;
                if (c == 0) {
                    String str2 = (String) hashMap.get("componentName");
                    hashMap.remove("componentName");
                    if (!hashMap.containsKey("dxAction")) {
                        hashMap.put("dxAction", "unknown");
                    }
                    hashMap2.putAll(hashMap);
                    if (com.taobao.android.live.plugin.atype.flexalocal.good.a.a().i() != null) {
                        e i = com.taobao.android.live.plugin.atype.flexalocal.good.a.a().i();
                        if (cVar != null) {
                            aVar = cVar.C();
                        }
                        i.a(aVar, m, str2, hashMap2);
                    }
                } else if (c == 1) {
                    if (hashMap.containsKey("clickSource")) {
                        hashMap.put("from", hashMap.get("clickSource"));
                    }
                    hashMap2.putAll(hashMap);
                    a(objArr);
                    e actionAdapter = f.m().getActionAdapter();
                    if (cVar != null) {
                        aVar = cVar.C();
                    }
                    actionAdapter.a(aVar, xkw.EVENT_SHOW_GOODSPACKAGE, hashMap2);
                } else if (c == 2 && objArr.length > 0 && (objArr[0] instanceof String)) {
                    com.taobao.android.live.plugin.atype.flexalocal.good.a.a().k().a(dXRuntimeContext.m(), (String) objArr[0]);
                }
            }
        }
        String str3 = (objArr.length <= 2 || !(objArr[2] instanceof String)) ? "ImportantEventNotice" : (String) objArr[2];
        if (objArr == null || objArr.length <= 1 || !(objArr[1] instanceof JSONObject)) {
            return;
        }
        JSONObject jSONObject = (JSONObject) objArr[1];
        if (!jSONObject.containsKey("utParams")) {
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("utParams");
        if (!jSONObject2.containsKey("clickParams")) {
            return;
        }
        String string = jSONObject2.getString("clickParams");
        his.a("DXTaoLiveRoomCommonHandlerEventHandler", "click args:" + string);
        HashMap<String, String> a2 = a(string);
        if (com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j() == null) {
            return;
        }
        com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j().a(str3, a2);
    }

    private void a(Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b63135c9", new Object[]{this, objArr});
        } else if (objArr == null || objArr.length <= 1 || !(objArr[1] instanceof JSONObject) || !"productRecommend".equals(((JSONObject) objArr[1]).getString("bizType"))) {
        } else {
            ddw.a().a("com.taobao.taolive.room.important_event_goods_recommend_click");
        }
    }

    private HashMap<String, String> a(String str) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("a40d9915", new Object[]{this, str});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        try {
            for (String str2 : str.split(",")) {
                if (str2.contains("=")) {
                    String[] split2 = str2.split("=");
                    hashMap.put(split2[0], split2[1]);
                }
            }
        } catch (Exception unused) {
        }
        return hashMap;
    }
}
