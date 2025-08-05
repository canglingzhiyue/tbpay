package com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewFrame;
import tb.fuf;
import tb.hjs;
import tb.kge;

/* loaded from: classes6.dex */
public class e extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_TBLGETEXPOSE = -5525453168114082334L;

    static {
        kge.a(-2128082414);
    }

    public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length == 0) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        if (objArr[0] instanceof JSONObject) {
            jSONArray = a((JSONObject) objArr[0], jSONArray);
        }
        if (objArr[0] instanceof JSONArray) {
            try {
                JSONArray jSONArray2 = (JSONArray) objArr[0];
                if (jSONArray2.size() == 0) {
                    return jSONArray;
                }
                for (int i = 0; i < jSONArray2.size(); i++) {
                    jSONArray = a(jSONArray2.getJSONObject(i), jSONArray);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return jSONArray;
    }

    private JSONArray a(JSONObject jSONObject, JSONArray jSONArray) {
        JSONArray jSONArray2;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("fc7fcf8e", new Object[]{this, jSONObject, jSONArray});
        }
        if (jSONObject != null && (jSONArray2 = jSONObject.getJSONArray("cardData")) != null && jSONArray2.size() > 0 && (jSONObject2 = jSONArray2.getJSONObject(0)) != null) {
            JSONObject jSONObject3 = jSONObject2.getJSONObject("accountInfo");
            String str = "";
            String string = jSONObject3 != null ? jSONObject3.getString("accountId") : str;
            JSONObject jSONObject4 = jSONObject2.getJSONObject("liveInfo");
            if (jSONObject4 != null) {
                str = jSONObject4.getString(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID);
            }
            JSONArray jSONArray3 = jSONObject2.getJSONArray(hjs.UNDER_TAKE_GOODS_LIST);
            if (jSONArray3 != null && jSONArray3.size() > 0) {
                for (int i = 0; i < jSONArray3.size(); i++) {
                    JSONObject jSONObject5 = jSONArray3.getJSONObject(i);
                    if (jSONObject5 != null) {
                        JSONObject jSONObject6 = new JSONObject();
                        String string2 = jSONObject5.getString("itemId");
                        jSONObject6.put("accountId", (Object) string);
                        jSONObject6.put(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID, (Object) str);
                        jSONObject6.put("itemId", (Object) string2);
                        jSONArray.add(jSONObject6);
                    }
                }
            } else {
                JSONObject jSONObject7 = new JSONObject();
                jSONObject7.put("accountId", (Object) string);
                jSONObject7.put(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID, (Object) str);
                jSONArray.add(jSONObject7);
            }
        }
        return jSONArray;
    }
}
