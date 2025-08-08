package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.h;
import com.taobao.android.nav.Nav;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public class pbk extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_TBLFOLLOWCONTENTHANDLER = 7112904513270593381L;

    static {
        kge.a(2100222547);
    }

    public static /* synthetic */ Object ipc$super(pbk pbkVar, String str, Object... objArr) {
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
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (objArr == null) {
        } else {
            String valueOf = String.valueOf(objArr[0]);
            if (!(objArr[1] instanceof JSONObject) || (jSONObject2 = (jSONObject = (JSONObject) objArr[1]).getJSONObject("fields")) == null) {
                return;
            }
            String string = jSONObject2.getString("jumpUrl");
            if (!StringUtils.isEmpty(string) && dXRuntimeContext != null) {
                Nav.from(dXRuntimeContext.m()).toUri(string);
            }
            Map<String, String> a2 = a(jSONObject);
            if ("clickEntryButton".equals(valueOf)) {
                a2.put("click_class", "clickbutton");
            } else if ("clickLiveInfo".equals(valueOf)) {
                a2.put("click_class", "clickavatar");
            }
            pru.a("Page_TaobaoLiveWatch", "focus_livecard_click", a2);
        }
    }

    public static Map<String, String> a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2b563fbd", new Object[]{jSONObject});
        }
        HashMap hashMap = new HashMap();
        if (jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("fields")) != null && (jSONObject3 = jSONObject2.getJSONObject("utParams")) != null && (jSONObject4 = jSONObject3.getJSONObject("args")) != null) {
            hashMap.put("livesource", jSONObject4.getString("livesource"));
            hashMap.put("entryLiveSource", jSONObject4.getString("entryLiveSource"));
            hashMap.put("entrySpm", jSONObject4.getString("spm-cnt"));
            hashMap.put("spm-cnt", jSONObject4.getString("spm-cnt"));
            hashMap.put("spm-url", jSONObject4.getString("spm-url"));
            hashMap.put("account_id", jSONObject4.getString("account_id"));
            hashMap.put("feed_id", jSONObject4.getString("feed_id"));
        }
        return hashMap;
    }
}
