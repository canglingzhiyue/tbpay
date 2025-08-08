package com.taobao.taolive.room.dx;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewFrame;
import com.taobao.android.nav.Nav;
import com.taobao.taolive.room.utils.ai;
import com.taobao.taolive.room.utils.n;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.plg;

/* loaded from: classes8.dex */
public class h extends com.taobao.android.dinamicx.h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_TAOLIVEHOTRESERVATIONSWITCHCARDACTION = -7829444384169238528L;

    static {
        kge.a(-803635000);
    }

    public static /* synthetic */ Object ipc$super(h hVar, String str, Object... objArr) {
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

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (objArr.length <= 0 || !(objArr[0] instanceof String)) {
        } else {
            String str = (String) objArr[0];
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -611013127) {
                if (hashCode == 2030382725 && str.equals("itemCardClick")) {
                    c = 0;
                }
            } else if (str.equals("itemCardBottonClick")) {
                c = 1;
            }
            if (c == 0) {
                if (objArr.length <= 1 || !(objArr[1] instanceof JSONObject)) {
                    return;
                }
                JSONObject jSONObject = (JSONObject) objArr[1];
                if (!StringUtils.isEmpty(jSONObject.getString("jumpUrl"))) {
                    Nav.from(dXRuntimeContext.m()).toUri(jSONObject.getString("jumpUrl"));
                }
                a(dXRuntimeContext, jSONObject, "detail");
            } else if (c != 1 || objArr.length <= 1 || !(objArr[1] instanceof JSONObject)) {
            } else {
                JSONObject jSONObject2 = (JSONObject) objArr[1];
                a(jSONObject2);
                a(dXRuntimeContext, jSONObject2, com.taobao.android.weex_framework.util.a.ATOM_EXT_button);
            }
        }
    }

    private void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else {
            plg.a().a("com.taobao.taolive.room.good.card.subscribe", jSONObject);
        }
    }

    private void a(DXRuntimeContext dXRuntimeContext, JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dee46e41", new Object[]{this, dXRuntimeContext, jSONObject, str});
            return;
        }
        String string = dXRuntimeContext.e().getString("bizType");
        String string2 = jSONObject.getString("subscribeStatus");
        String string3 = jSONObject.getString("itemId");
        String string4 = jSONObject.getString(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID);
        String string5 = jSONObject.getString("anchorId");
        HashMap hashMap = new HashMap();
        hashMap.put("item_type", string);
        hashMap.put("item_status", string2);
        hashMap.put("item_id", string3);
        hashMap.put("button_type", str);
        hashMap.put("feed_id", string4);
        hashMap.put("account_id", string5);
        ai.a(n.a(), "guideItem", (Map<String, String>) hashMap);
    }
}
