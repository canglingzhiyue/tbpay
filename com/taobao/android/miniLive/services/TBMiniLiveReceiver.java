package com.taobao.android.miniLive.services;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewFrame;
import com.taobao.android.upp.f;
import java.util.HashMap;
import tb.huc;
import tb.hud;
import tb.hue;
import tb.kge;

/* loaded from: classes6.dex */
public class TBMiniLiveReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1142809592);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        com.taobao.android.upp.e a2;
        JSONObject jSONObject3;
        com.taobao.android.upp.e a3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
        } else if (intent != null) {
            String action = intent.getAction();
            hue.a("TBMiniLiveReceiver", "onReceive action = " + action);
            if (TextUtils.equals(action, com.taobao.android.miniLive.sdk.d.TAOLIVE_SHOW_MINILIVE_ACTION)) {
                if (!hud.h()) {
                    hue.a("TBMiniLiveReceiver", "hideMiniLive openShopMiniLiveReceiver = false");
                    return;
                }
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    return;
                }
                String string = extras.getString("actionType");
                String string2 = extras.getString("actionDatas");
                if (TextUtils.equals(string, "startMiniLive")) {
                    if (TextUtils.isEmpty(string2)) {
                        return;
                    }
                    HashMap hashMap = (HashMap) JSON.parseObject(string2, HashMap.class);
                    com.taobao.android.miniLive.a.a().a(context, huc.a(hashMap, LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID), hashMap);
                    hue.a("TBMiniLiveReceiver", action + " startMiniLive ");
                } else if (TextUtils.equals(string, "hideMiniLive")) {
                    com.taobao.android.miniLive.a.a().i();
                    hue.a("TBMiniLiveReceiver", action + " hideMiniLive ");
                } else if (TextUtils.equals(string, "updateLivePosition")) {
                    if (TextUtils.isEmpty(string2)) {
                        return;
                    }
                    HashMap hashMap2 = (HashMap) JSON.parseObject(string2, HashMap.class);
                    if (hashMap2 != null) {
                        String str = (String) hashMap2.get("x");
                        String str2 = (String) hashMap2.get("y");
                        if ((!TextUtils.isEmpty(str) && TextUtils.isDigitsOnly(str)) || (!TextUtils.isEmpty(str2) && TextUtils.isDigitsOnly(str2))) {
                            com.taobao.android.miniLive.a.a().a(str, str2);
                        }
                    }
                    hue.a("TBMiniLiveReceiver", action + " updateMiniLivePosition ");
                } else if (TextUtils.equals(string, "hideAllMiniLive")) {
                    com.taobao.android.miniLive.a.a().n();
                    hue.a("TBMiniLiveReceiver", action + " hideAllMiniLive ");
                }
            } else if (!TextUtils.equals(action, com.taobao.android.miniLive.sdk.d.PAGE_RESUME_ACTION) && !TextUtils.equals(intent.getAction(), com.taobao.android.miniLive.sdk.d.PAGE_SHOP_RESUME_ACTION)) {
                if (TextUtils.equals(action, com.taobao.android.miniLive.sdk.d.PAGE_PAUSE_ACTION) || TextUtils.equals(intent.getAction(), com.taobao.android.miniLive.sdk.d.PAGE_SHOP_PAUSE_ACTION)) {
                    com.taobao.android.miniLive.a.a().h();
                    hue.a("TBMiniLiveReceiver", action + " destroyMiniLive ");
                } else if (TextUtils.equals(action, com.taobao.android.miniLive.sdk.d.ACTION_NOTIFY_DETAIL_SLIDE_INTO_INFO)) {
                    Bundle extras2 = intent.getExtras();
                    if (extras2 != null) {
                        if (extras2.get("transparentBroadcast") instanceof JSONObject) {
                            JSONObject jSONObject4 = (JSONObject) extras2.get("transparentBroadcast");
                            if (jSONObject4 != null && !hud.a(jSONObject4.getString("source"))) {
                                hue.a("TBMiniLiveReceiver", action + " scrollHideMiniLive 1");
                                com.taobao.android.miniLive.a.a().g();
                            }
                        } else {
                            com.taobao.android.miniLive.a.a().g();
                            hue.a("TBMiniLiveReceiver", action + " scrollHideMiniLive 2");
                        }
                    } else {
                        com.taobao.android.miniLive.a.a().g();
                        hue.a("TBMiniLiveReceiver", action + " scrollHideMiniLive 3");
                    }
                    hue.a("TBMiniLiveReceiver", action);
                } else if (TextUtils.equals(action, com.taobao.android.miniLive.sdk.d.ACTION_NOTIFY_DETAIL_SHOW)) {
                    if (!hud.g()) {
                        hue.a("TBMiniLiveReceiver", action + " openDetailMiniLive = false");
                        return;
                    }
                    com.taobao.android.miniLive.a.a().f();
                    hue.a("TBMiniLiveReceiver", action);
                    Bundle extras3 = intent.getExtras();
                    if (extras3 == null || !(extras3.get("transparentBroadcast") instanceof JSONObject) || (jSONObject3 = (JSONObject) extras3.get("transparentBroadcast")) == null) {
                        return;
                    }
                    Boolean bool = jSONObject3.getBoolean("isUseUpp");
                    if (bool != null && bool.booleanValue() && (a3 = f.a()) != null && a3.isUppEnabled()) {
                        return;
                    }
                    String string3 = jSONObject3.getString(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID);
                    String string4 = jSONObject3.getString("source");
                    if (!hud.a(string4)) {
                        return;
                    }
                    HashMap hashMap3 = new HashMap();
                    if (TextUtils.isEmpty(string4)) {
                        string4 = "detail";
                    }
                    hashMap3.put("bizCode", string4);
                    for (String str3 : jSONObject3.keySet()) {
                        hashMap3.put(str3, jSONObject3.getString(str3));
                    }
                    com.taobao.android.miniLive.a.a().a(context, string3, hashMap3);
                    hue.a("TBMiniLiveReceiver", action + " startMiniLive");
                } else if (TextUtils.equals(action, com.taobao.android.miniLive.sdk.d.ACTION_NOTIFY_DETAIL_SLIDE_OUT_INFO)) {
                    if (!hud.g()) {
                        hue.a("TBMiniLiveReceiver", action + " openDetailMiniLive = false");
                        return;
                    }
                    Bundle extras4 = intent.getExtras();
                    hue.a("TBMiniLiveReceiver", action);
                    if (extras4 == null || !(extras4.get("transparentBroadcast") instanceof JSONObject) || (jSONObject2 = (JSONObject) extras4.get("transparentBroadcast")) == null) {
                        return;
                    }
                    Boolean bool2 = jSONObject2.getBoolean("isUseUpp");
                    if (bool2 != null && bool2.booleanValue() && (a2 = f.a()) != null && a2.isUppEnabled()) {
                        return;
                    }
                    String string5 = jSONObject2.getString(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID);
                    String string6 = jSONObject2.getString("source");
                    if (TextUtils.isEmpty(string5)) {
                        return;
                    }
                    HashMap hashMap4 = new HashMap();
                    if (TextUtils.isEmpty(string6)) {
                        string6 = "detail";
                    }
                    hashMap4.put("bizCode", string6);
                    for (String str4 : jSONObject2.keySet()) {
                        hashMap4.put(str4, jSONObject2.getString(str4));
                    }
                    com.taobao.android.miniLive.a.a().a(context, string5, hashMap4);
                    hue.a("TBMiniLiveReceiver", action + " startMiniLive ");
                } else if (TextUtils.equals(action, "action.com.taobao.taolive.room.start")) {
                    com.taobao.android.miniLive.a.a().j();
                    com.taobao.android.miniLive.a.a().h();
                    hue.a("TBMiniLiveReceiver", action + " destroyMiniLive ");
                } else if (TextUtils.equals(action, com.taobao.android.miniLive.sdk.d.PAGE_DETAIL_UPP_SHOWFLOATVIEWNOTIFICATION)) {
                    if (!hud.g()) {
                        hue.a("TBMiniLiveReceiver", action + " openDetailMiniLive = false");
                        return;
                    }
                    hue.a("TBMiniLiveReceiver", action);
                    com.taobao.android.miniLive.a.a().f();
                    Bundle extras5 = intent.getExtras();
                    if (extras5 == null || !(extras5.get("UPP_DATA") instanceof JSONObject) || (jSONObject = (JSONObject) extras5.get("UPP_DATA")) == null) {
                        return;
                    }
                    try {
                        JSONObject jSONObject5 = jSONObject.getJSONObject("actualResult");
                        String string7 = jSONObject.getString("algParams");
                        String string8 = jSONObject5.getString(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID);
                        String string9 = jSONObject5.getString("source");
                        if (TextUtils.isEmpty(string8)) {
                            return;
                        }
                        HashMap hashMap5 = new HashMap();
                        if (TextUtils.isEmpty(string9)) {
                            string9 = "detail";
                        }
                        hashMap5.put("bizCode", string9);
                        for (String str5 : jSONObject5.keySet()) {
                            hashMap5.put(str5, jSONObject5.getString(str5));
                        }
                        hashMap5.put("algParams", string7);
                        com.taobao.android.miniLive.a.a().a(context, string8, hashMap5);
                        hue.a("TBMiniLiveReceiver", action + " startMiniLive");
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }
}
