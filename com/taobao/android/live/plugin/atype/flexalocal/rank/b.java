package com.taobao.android.live.plugin.atype.flexalocal.rank;

import android.content.Context;
import android.taobao.windvane.util.m;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.h;
import com.taobao.android.dinamicx.widget.DXSliderLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.nav.Nav;
import com.taobao.taolive.room.utils.d;
import com.taobao.taolive.room.utils.n;
import com.taobao.taolive.room.utils.v;
import com.taobao.taolive.sdk.utils.q;
import java.util.HashMap;
import java.util.Map;
import tb.ddw;
import tb.kge;
import tb.phg;
import tb.pmd;
import tb.poz;
import tb.pqj;
import tb.tbt;

/* loaded from: classes6.dex */
public class b extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_RANKENTRANCETAP = -1569183620047155440L;
    public static final String EVENT_BANNER_PRERENDER = "bannerPreRender";
    public static final String EVENT_GIFT_VOTE_REFRESH_DX = "giftVoteBannerRefreshDx";
    public static final String EVENT_REFRESH_DX = "bannerRefreshDx";
    public static final String KEY_BANNER_CARD_LIST = "bannerCardList";
    public static final String KEY_BANNER_DATA = "bannerData";

    static {
        kge.a(-1598217978);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
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
        JSONObject e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
            return;
        }
        if (objArr.length == 0) {
            b(dXRuntimeContext);
        }
        if (objArr.length > 1 && (objArr[0] instanceof String) && (objArr[1] instanceof JSONObject)) {
            c(dXRuntimeContext);
            String str = (String) objArr[0];
            JSONObject jSONObject = (JSONObject) objArr[1];
            if ("click".equals(str)) {
                a(dXRuntimeContext.m(), jSONObject);
            } else if (!"voteCountDownFinish".equals(str) || (e = dXRuntimeContext.e()) == null) {
            } else {
                ddw.a().a(EVENT_GIFT_VOTE_REFRESH_DX, e);
            }
        } else if (objArr.length != 1 || !(objArr[0] instanceof String) || !((String) objArr[0]).equals(tbt.PRE_RENDER)) {
        } else {
            a(dXRuntimeContext);
        }
    }

    private void a(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("487cd5d9", new Object[]{this, dXRuntimeContext});
            return;
        }
        JSONArray jSONArray = dXRuntimeContext.e().getJSONArray(KEY_BANNER_DATA);
        if (jSONArray.size() != 1) {
            return;
        }
        JSONObject jSONObject = jSONArray.getJSONObject(0);
        if (!"tblive-base-openWebview".equals(jSONObject.getString("componentName")) || !"alive".equals(jSONObject.getString("type")) || TextUtils.isEmpty(jSONObject.getString("jumpUrl"))) {
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("url", (Object) jSONObject.getString("jumpUrl"));
        ddw.a().a(EVENT_BANNER_PRERENDER, jSONObject2);
    }

    private void b(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c07f39a", new Object[]{this, dXRuntimeContext});
            return;
        }
        DXWidgetNode d = dXRuntimeContext.d();
        if (!(d instanceof DXSliderLayout)) {
            return;
        }
        int pageIndex = ((DXSliderLayout) d).getPageIndex();
        JSONObject e = dXRuntimeContext.e();
        if (e == null) {
            return;
        }
        JSONArray a2 = a(e, KEY_BANNER_DATA);
        if (a2 == null || a2.isEmpty()) {
            a2 = a(e, KEY_BANNER_CARD_LIST);
        }
        if (a2 == null || a2.isEmpty() || pageIndex < 0 || pageIndex >= a2.size()) {
            return;
        }
        a(a2.getJSONObject(pageIndex));
    }

    private JSONArray a(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("9bc1dcac", new Object[]{this, jSONObject, str});
        }
        if (jSONObject != null && jSONObject.containsKey(str) && (jSONObject.get(str) instanceof JSONArray)) {
            return jSONObject.getJSONArray(str);
        }
        return null;
    }

    private void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else {
            c.a(jSONObject);
        }
    }

    private void a(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cb6e290", new Object[]{this, context, jSONObject});
            return;
        }
        String string = jSONObject.getString("type");
        String string2 = jSONObject.getString("jumpUrl");
        String string3 = jSONObject.getString("componentName");
        c.b(jSONObject);
        if ("H5".equals(string)) {
            a(context, string2, jSONObject);
        } else if ("native".equals(string)) {
            Nav.from(context).toUri(string2);
            q.b("RankEntranceFrame", "handleEvent: native, h5Url=" + string2);
        } else if (!"alive".equals(string)) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("data", jSONObject);
            if (!TextUtils.isEmpty(string3) && phg.b() != null) {
                phg.b().a(string3, hashMap);
            }
            q.b("RankEntranceFrame", "handleEvent: alive, componentName=" + string3);
        }
    }

    private void a(Context context, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("564cf206", new Object[]{this, context, str, jSONObject});
        } else if (TextUtils.isEmpty(str)) {
            q.b("RankEntranceFrame", "handleEvent: showRankEntranceH5: h5Url is empty!");
        } else {
            HashMap hashMap = new HashMap();
            float g = d.g() * a();
            hashMap.put("x", "0");
            hashMap.put("y", String.valueOf(d.a((d.g() - d.g(context)) - g)));
            hashMap.put("width", String.valueOf(-1));
            hashMap.put("height", String.valueOf(d.a(g)));
            hashMap.put("modal", "true");
            hashMap.put("exitAnimation", "1");
            hashMap.put("enterAnimation", "1");
            hashMap.put("bizData", "showRankEntranceH5");
            if (jSONObject != null && jSONObject.getString("options") != null) {
                try {
                    for (Map.Entry<String, Object> entry : pqj.b(jSONObject.getString("options")).entrySet()) {
                        hashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
                    }
                } catch (Throwable th) {
                    m.e(getClass().getSimpleName(), th.toString());
                }
            }
            if (phg.b() == null) {
                return;
            }
            q.b("RankEntranceFrame", "handleEvent: openWebViewLayer: h5Url=" + str);
            if (n.a() == null || n.b(n.a()) == null) {
                return;
            }
            phg.b().a(poz.a(context, n.b(n.a())), str, hashMap);
        }
    }

    public static float a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c58", new Object[0])).floatValue() : v.d(pmd.a().d().a("tblive", "openRankEntranceWebViewLayerHeight", "0.6666"));
    }

    private void c(DXRuntimeContext dXRuntimeContext) {
        final JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf93115b", new Object[]{this, dXRuntimeContext});
            return;
        }
        Object f = dXRuntimeContext.f();
        if (!(f instanceof JSONObject)) {
            return;
        }
        final JSONObject jSONObject = (JSONObject) f;
        if (jSONObject.containsKey("data") && (jSONObject.get("data") instanceof JSONObject)) {
            jSONObject = jSONObject.getJSONObject("data");
        }
        View v = dXRuntimeContext.v();
        if (!jSONObject.containsKey("bannerMedalIcon") || (jSONArray = dXRuntimeContext.e().getJSONArray(KEY_BANNER_DATA)) == null) {
            return;
        }
        v.post(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.rank.b.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                jSONObject.remove("bannerMedalIcon");
                com.taobao.alilive.aliliveframework.frame.a a2 = n.a();
                ddw.a().a(b.EVENT_REFRESH_DX, jSONArray, a2 == null ? null : a2.G());
            }
        });
    }
}
