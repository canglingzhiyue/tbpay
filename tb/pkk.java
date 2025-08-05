package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewFrame;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenBizCodeEnum;
import com.taobao.taolive.room.openarchitecture.translateUtils.OpenBizcodeTranslateBean;
import com.taobao.taolive.room.utils.aw;
import com.taobao.taolive.sdk.utils.q;
import com.taobao.taolive.sdk.utils.s;

/* loaded from: classes8.dex */
public class pkk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1058006281);
    }

    public static OpenBizcodeTranslateBean a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OpenBizcodeTranslateBean) ipChange.ipc$dispatch("13b8b4b5", new Object[]{str, obj});
        }
        OpenBizcodeTranslateBean openBizcodeTranslateBean = new OpenBizcodeTranslateBean();
        if (s.a("enbaleMapToBean", true)) {
            if (!(obj instanceof JSONObject)) {
                return openBizcodeTranslateBean;
            }
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject.get("queryParam") instanceof JSONObject) {
                jSONObject.putAll((JSONObject) jSONObject.get("queryParam"));
            }
            try {
                return (OpenBizcodeTranslateBean) JSONObject.parseObject(jSONObject.toJSONString(), OpenBizcodeTranslateBean.class);
            } catch (Exception e) {
                q.a("BizcodeTranslateUtils", "mapToBean error", e);
                e.printStackTrace();
                return openBizcodeTranslateBean;
            }
        } else if (TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_ShopTab3.toString().equals(str)) {
            return a(obj);
        } else {
            return (TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_Shop2F.toString().equals(str) || TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_NewShop.toString().equals(str)) ? b(obj) : openBizcodeTranslateBean;
        }
    }

    public static OpenBizcodeTranslateBean a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OpenBizcodeTranslateBean) ipChange.ipc$dispatch("b1ef28bf", new Object[]{obj});
        }
        OpenBizcodeTranslateBean openBizcodeTranslateBean = new OpenBizcodeTranslateBean();
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            openBizcodeTranslateBean.f21669a = jSONObject.getString(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID);
            openBizcodeTranslateBean.b = jSONObject.getString("coverPicUrl");
            openBizcodeTranslateBean.c = jSONObject.getString("roomStatus");
            openBizcodeTranslateBean.d = jSONObject.getString("livesource");
            openBizcodeTranslateBean.j = jSONObject.getString(aw.PARAM_SJSD_ITEM_ID);
            openBizcodeTranslateBean.m = jSONObject.getString("spm");
            openBizcodeTranslateBean.n = jSONObject.getString("entrySpm");
            openBizcodeTranslateBean.o = jSONObject.getString(aw.PARAM_HIGH_PRIORITY_BIZ_CODE);
            openBizcodeTranslateBean.p = jSONObject.getString(aw.PARAM_IS_LIVE_MUTE);
            openBizcodeTranslateBean.l = jSONObject.getString(aw.PARAM_ITEM_HOLD_TYPE);
            openBizcodeTranslateBean.k = jSONObject.getString(aw.PARAM_ITEM_IDS);
            openBizcodeTranslateBean.q = jSONObject.getString(aw.PARAM_CATEGORY_ID);
            JSONObject jSONObject2 = jSONObject.getJSONObject("queryParam");
            if (jSONObject2 != null) {
                openBizcodeTranslateBean.e = jSONObject2.toJSONString();
                openBizcodeTranslateBean.f = jSONObject2.getString(aw.PARAM_COVER_IMG);
                openBizcodeTranslateBean.g = jSONObject2.getString("feedId");
                openBizcodeTranslateBean.h = jSONObject2.getString("accountId");
            }
        }
        return openBizcodeTranslateBean;
    }

    public static OpenBizcodeTranslateBean b(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OpenBizcodeTranslateBean) ipChange.ipc$dispatch("db56a19e", new Object[]{obj});
        }
        OpenBizcodeTranslateBean openBizcodeTranslateBean = new OpenBizcodeTranslateBean();
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            openBizcodeTranslateBean.f21669a = jSONObject.getString(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID);
            openBizcodeTranslateBean.b = jSONObject.getString("coverPicUrl");
            openBizcodeTranslateBean.c = jSONObject.getString("roomStatus");
            openBizcodeTranslateBean.d = jSONObject.getString("livesource");
            openBizcodeTranslateBean.j = jSONObject.getString(aw.PARAM_SJSD_ITEM_ID);
            openBizcodeTranslateBean.m = jSONObject.getString("spm");
            openBizcodeTranslateBean.n = jSONObject.getString("entrySpm");
            openBizcodeTranslateBean.o = jSONObject.getString(aw.PARAM_HIGH_PRIORITY_BIZ_CODE);
            openBizcodeTranslateBean.p = jSONObject.getString(aw.PARAM_IS_LIVE_MUTE);
            openBizcodeTranslateBean.l = jSONObject.getString(aw.PARAM_ITEM_HOLD_TYPE);
            openBizcodeTranslateBean.k = jSONObject.getString(aw.PARAM_ITEM_IDS);
            openBizcodeTranslateBean.q = jSONObject.getString(aw.PARAM_CATEGORY_ID);
            openBizcodeTranslateBean.i = jSONObject.getString("playerViewToken");
            openBizcodeTranslateBean.r = jSONObject.getString("timeMoveId");
            openBizcodeTranslateBean.h = jSONObject.getString("accountId");
            openBizcodeTranslateBean.s = jSONObject.getString(aw.PARAM_IGNORE_PV);
            openBizcodeTranslateBean.t = jSONObject.getString("spmCnt");
            openBizcodeTranslateBean.u = jSONObject.getString("livePointTab3");
            openBizcodeTranslateBean.v = jSONObject.getString("shop2fSkipTab3Url");
            openBizcodeTranslateBean.w = jSONObject.getString("entryByShop2F");
            JSONObject jSONObject2 = jSONObject.getJSONObject("queryParam");
            if (jSONObject2 != null) {
                openBizcodeTranslateBean.e = jSONObject2.toJSONString();
                openBizcodeTranslateBean.f = jSONObject2.getString(aw.PARAM_COVER_IMG);
                openBizcodeTranslateBean.g = jSONObject2.getString("feedId");
                openBizcodeTranslateBean.h = jSONObject2.getString("accountId");
            }
        }
        return openBizcodeTranslateBean;
    }
}
