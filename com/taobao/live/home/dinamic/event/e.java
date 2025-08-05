package com.taobao.live.home.dinamic.event;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.h;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders;
import java.util.Map;
import tb.mfg;
import tb.mfl;
import tb.pro;
import tb.tip;

/* loaded from: classes7.dex */
public class e extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_TBLGTAP = 5360605235400031797L;

    public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
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
        } else if (objArr == null || objArr.length <= 0) {
        } else {
            String str = (String) objArr[0];
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -1255161247) {
                if (hashCode != -925132983) {
                    if (hashCode == 96891546 && str.equals("event")) {
                        c = 1;
                    }
                } else if (str.equals("router")) {
                    c = 2;
                }
            } else if (str.equals("jumpUrl")) {
                c = 0;
            }
            JSONObject jSONObject = null;
            String str2 = "Page_TaobaoLive";
            String str3 = "";
            if (c != 0) {
                if (c != 1) {
                    return;
                }
                String str4 = objArr.length >= 2 ? (String) objArr[1] : str3;
                Object obj = objArr.length >= 3 ? objArr[2] : null;
                if (objArr.length >= 4) {
                    String str5 = (String) objArr[3];
                    if (!TextUtils.isEmpty(str5)) {
                        str2 = str5;
                    }
                }
                if (objArr.length >= 5 && (objArr[4] instanceof JSONObject)) {
                    jSONObject = (JSONObject) objArr[4];
                }
                if (objArr.length >= 6) {
                    str3 = (String) objArr[5];
                }
                if (jSONObject != null) {
                    if (TextUtils.isEmpty(str3)) {
                        a(str2, jSONObject.getString("name"), jSONObject.getString("params"));
                    } else {
                        a(str2, jSONObject.getString("name"), jSONObject.getString("params") + ",trackInfo=" + str3);
                    }
                }
                mfg.a().a(str4, obj);
                return;
            }
            String str6 = objArr.length >= 2 ? (String) objArr[1] : str3;
            if (objArr.length >= 3) {
                String str7 = (String) objArr[2];
                if (!TextUtils.isEmpty(str7)) {
                    str2 = str7;
                }
            }
            if (objArr.length >= 4 && (objArr[3] instanceof JSONObject)) {
                jSONObject = (JSONObject) objArr[3];
            }
            String str8 = objArr.length >= 5 ? (String) objArr[4] : str3;
            if (objArr.length >= 6 && objArr[5] != null && (objArr[5] instanceof String)) {
                str3 = (String) objArr[5];
            }
            if (jSONObject != null) {
                String string = jSONObject.getString("params");
                if (!pro.e(str3)) {
                    if (!pro.e(string)) {
                        string = string + ",singleLiveTabSessionId=" + str3;
                    } else {
                        string = "singleLiveTabSessionId=" + str3;
                    }
                }
                if (TextUtils.isEmpty(str8)) {
                    a(str2, jSONObject.getString("name"), string);
                } else {
                    a(str2, jSONObject.getString("name"), string + ",trackInfo=" + str8);
                }
            }
            if (pro.e(str6)) {
                return;
            }
            if (!pro.e(str8)) {
                if (str8.equals("liveFromTopic")) {
                    mfg.a().a("com.taobao.taolive.bottom.half.frame.card.click");
                } else {
                    String encode = Uri.encode(str8);
                    if (!str6.contains("trackInfo")) {
                        if (str6.contains("?")) {
                            str6 = str6 + "&trackInfo=" + encode;
                        } else {
                            str6 = str6 + "?trackInfo=" + encode;
                        }
                    }
                }
            }
            if (!pro.e(str3) && !str6.contains("singleLiveTabSessionId")) {
                str6 = str6 + "&singleLiveTabSessionId=" + str3;
            }
            mfl.a(dXRuntimeContext.m(), str6);
        }
    }

    private static void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{str, str2, str3});
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
        } else {
            a(str, str2, tip.a(str3));
        }
    }

    private static void a(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84162689", new Object[]{str, str2, map});
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
        } else {
            UTHitBuilders.UTControlHitBuilder uTControlHitBuilder = new UTHitBuilders.UTControlHitBuilder(str, "Button-" + str2);
            if (map != null && !map.isEmpty()) {
                uTControlHitBuilder.setProperties(map);
            }
            UTAnalytics.getInstance().getDefaultTracker().send(uTControlHitBuilder.build());
        }
    }
}
