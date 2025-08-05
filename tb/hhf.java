package tb;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.live.plugin.atype.flexalocal.good.track.a;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c;
import com.taobao.taolive.sdk.model.common.LiveItem;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class hhf extends iot {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_TBLIVEGOTODETAIL = -8940556935659657630L;

    static {
        kge.a(1822056583);
    }

    public static /* synthetic */ Object ipc$super(hhf hhfVar, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void a(hhf hhfVar, c cVar, LiveItem liveItem, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16360851", new Object[]{hhfVar, cVar, liveItem, map});
        } else {
            hhfVar.a(cVar, liveItem, map);
        }
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
    public void a(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext, final c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cc53e1f", new Object[]{this, dXEvent, objArr, dXRuntimeContext, cVar});
            return;
        }
        try {
            JSONObject jSONObject = (JSONObject) objArr[0];
            Context m = dXRuntimeContext.m();
            final LiveItem liveItem = (LiveItem) pqj.a(jSONObject.toJSONString(), LiveItem.class);
            if (objArr.length >= 3 && "taolive_goods_list_item".equals(objArr[2]) && hiq.a(m, liveItem)) {
                return;
            }
            hiq.a(cVar, liveItem);
            String g = hiq.g(liveItem);
            final HashMap hashMap = new HashMap();
            hashMap.put("scene", g);
            hashMap.put("laiyuan", "2");
            String string = jSONObject.getString("item_position");
            hashMap.put("item_position", string);
            String str = "1";
            if (liveItem.extendVal != null && "secKill".equals(liveItem.extendVal.itemBizType)) {
                str = "2";
            }
            hashMap.put("bubbleType", str);
            liveItem.cpsClickPos = hiq.a(liveItem, false, "");
            a.a(cVar, liveItem, string);
            if (liveItem.itemActionData != null && liveItem.itemActionData.containsKey("userBehaviorEvents")) {
                String string2 = liveItem.itemActionData.getString("userBehaviorEvents");
                if (!TextUtils.isEmpty(string2) && a(string2, '@', "userbuy")) {
                    new sql().a(cVar, liveItem, new pox<Boolean>() { // from class: tb.hhf.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // tb.pox
                        public /* synthetic */ void onResult(Boolean bool) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("8251d27f", new Object[]{this, bool});
                            } else {
                                a(bool);
                            }
                        }

                        public void a(Boolean bool) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("ba62f9e5", new Object[]{this, bool});
                            } else if (bool.booleanValue()) {
                                hhf.a(hhf.this, cVar, liveItem, hashMap);
                            } else {
                                his.b("Handler_GoToDetail", "handleEvent | result is false.");
                            }
                        }

                        @Override // tb.pox
                        public void onError(String str2, String str3) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("97d08c84", new Object[]{this, str2, str3});
                                return;
                            }
                            his.a("Handler_GoToDetail", "handleEvent.onError | liveId=" + liveItem.liveId + "   itemId=" + liveItem.itemId);
                        }
                    });
                    return;
                } else {
                    a(cVar, liveItem, hashMap);
                    return;
                }
            }
            a(cVar, liveItem, hashMap);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void a(c cVar, LiveItem liveItem, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85f4a6db", new Object[]{this, cVar, liveItem, map});
        } else if (com.taobao.android.live.plugin.atype.flexalocal.good.a.a().i() == null) {
        } else {
            his.a("Handler_GoToDetail", "handleEvent.onResult | liveId=" + liveItem.liveId + "   itemId=" + liveItem.itemId);
            com.taobao.android.live.plugin.atype.flexalocal.good.a.a().i().a(cVar == null ? null : cVar.C(), (Activity) cVar.f(), liveItem, "detail", map);
        }
    }

    public static boolean a(String str, char c, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a1f25399", new Object[]{str, new Character(c), str2})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (c == 0) {
            return TextUtils.equals(str, str2);
        }
        String[] split = str.split(Character.toString(c));
        for (String str3 : split) {
            if (TextUtils.equals(str2, str3)) {
                return true;
            }
        }
        return false;
    }
}
