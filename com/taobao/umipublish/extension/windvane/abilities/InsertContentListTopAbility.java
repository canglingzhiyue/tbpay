package com.taobao.umipublish.extension.windvane.abilities;

import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import mtopsdk.common.util.StringUtils;
import com.alibaba.ability.impl.photo.b;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.util.m;
import com.taobao.tao.powermsg.model.a;
import tb.hdx;
import tb.icp;
import tb.ios;
import tb.kge;
import tb.sjn;

/* loaded from: classes9.dex */
public class InsertContentListTopAbility extends BaseAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String GUANGGUANG = "guangguang";
    private static final String STATUS_PENDING = "pending";
    private static final String STATUS_START = "start";
    private static final String STATUS_SUCCESS = "success";
    private static final String TAG = "InsertContentListTopAbility";

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f23337a;

    static {
        kge.a(1416949877);
    }

    public static /* synthetic */ Object ipc$super(InsertContentListTopAbility insertContentListTopAbility, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.umipublish.extension.windvane.abilities.BaseAbility
    public void onExecute(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95fd7073", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
            errorCallback("1", "EMPTY_DATA");
        } else {
            JSONObject jSONObject2 = jSONObject.getJSONObject("params");
            boolean booleanValue = (jSONObject2 == null || !jSONObject2.containsKey("async_publish")) ? false : jSONObject2.getBoolean("async_publish").booleanValue();
            JSONObject jSONObject3 = jSONObject.getJSONObject("publishResponseData");
            if (!booleanValue) {
                successCallback(jSONObject3);
                return;
            }
            if (jSONObject2.containsKey(ios.KEY_BACK_PARAMS)) {
                this.f23337a = JSONObject.parseObject(jSONObject2.getString(ios.KEY_BACK_PARAMS));
            }
            String a2 = icp.a().b().a();
            a(jSONObject, String.format("%d_%s", Long.valueOf(System.currentTimeMillis()), a2), a2);
            successCallback(jSONObject3);
        }
    }

    private void notifyPublishStart(JSONObject jSONObject, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d3bc4e1", new Object[]{this, jSONObject, str, str2});
        } else {
            a(jSONObject, str, str2, "0.0", "start");
        }
    }

    private void notifyPublishProgress(JSONObject jSONObject, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7ba536a", new Object[]{this, jSONObject, str, str2});
        } else {
            a(jSONObject, str, str2, "0.5", STATUS_PENDING);
        }
    }

    private void a(JSONObject jSONObject, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95510c9c", new Object[]{this, jSONObject, str, str2});
        } else {
            a(jSONObject, str, str2, sjn.DEFAULT_PLAY_RATE, "success");
        }
    }

    private void a(JSONObject jSONObject, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("296323b0", new Object[]{this, jSONObject, str, str2, str3, str4});
            return;
        }
        Intent intent = new Intent("UmiAsyncPublishNotification");
        intent.putExtra("tasks", a(jSONObject, str, str3, str4));
        intent.putExtra("userId", str2);
        LocalBroadcastManager.getInstance(icp.a().b().d()).sendBroadcast(intent);
    }

    private JSONArray a(JSONObject jSONObject, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("4760e618", new Object[]{this, jSONObject, str, str2, str3});
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.add(b(jSONObject, str, str2, str3));
        return jSONArray;
    }

    private JSONObject b(JSONObject jSONObject, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("89cfade5", new Object[]{this, jSONObject, str, str2, str3});
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("biz", (Object) "guangguang");
        jSONObject2.put("progress", (Object) str2);
        jSONObject2.put("status", (Object) str3);
        jSONObject2.put("step", (Object) hdx.PAGE_PUBLISH);
        jSONObject2.put(a.COL_TASK, (Object) str);
        jSONObject2.put("backParams", (Object) this.f23337a);
        jSONObject2.put("data", (Object) a(jSONObject, str3));
        return jSONObject2;
    }

    private JSONObject a(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a5543672", new Object[]{this, jSONObject, str});
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("contentId", (Object) (StringUtils.equals("success", str) ? b(jSONObject) : null));
        jSONObject2.put("failedDraftInfo", (Object) new JSONObject());
        jSONObject2.put("type", (Object) "video");
        jSONObject2.put("publishInfo", (Object) a(jSONObject));
        return jSONObject2;
    }

    private JSONObject a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = jSONObject.getJSONObject("publishRequestData");
        if (jSONObject3 != null) {
            jSONObject2.put("api", (Object) "mtop.taobao.media.guang.publish");
            jSONObject2.put("apiVersion", (Object) "1.0");
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("enable_asr", (Object) false);
            jSONObject4.put("enable_hash_tag_guide", (Object) false);
            jSONObject4.put(ios.KEY_ONIOLN_FITTING_ROOM_SCENE, (Object) "GG");
            jSONObject2.put("extraParams", (Object) jSONObject4);
            jSONObject2.put("formName", (Object) jSONObject3.getString("formName"));
            jSONObject2.put("inputInfo", (Object) jSONObject3.getJSONObject("data"));
            jSONObject2.put(b.API_SAVE_TO_ALBUM, (Object) false);
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("__native_uuid__", (Object) "d49e7a6e-a24f-4367-ae2c-1bd18b041888");
            jSONObject2.put(MspGlobalDefine.SESSION, (Object) jSONObject5);
            jSONObject2.put("triggerName", (Object) jSONObject3.getString("triggerName"));
        }
        return jSONObject2;
    }

    private String b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3f1ccf59", new Object[]{this, jSONObject});
        }
        if (!m.a(m.b(jSONObject, "publishResponseData", "result"), "success", false)) {
            return null;
        }
        return m.a((String) null, jSONObject, "publishResponseData", "contentId");
    }
}
