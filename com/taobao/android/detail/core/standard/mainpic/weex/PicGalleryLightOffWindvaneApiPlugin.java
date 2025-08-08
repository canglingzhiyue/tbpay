package com.taobao.android.detail.core.standard.mainpic.weex;

import android.support.v7.widget.RecyclerView;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer;
import com.taobao.android.detail.core.standard.video.d;
import tb.arc;
import tb.ard;
import tb.elq;
import tb.elr;
import tb.emn;
import tb.emu;
import tb.iyx;
import tb.kge;

/* loaded from: classes4.dex */
public class PicGalleryLightOffWindvaneApiPlugin extends AbsPicGalleryWindvaneApiPlugin {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTION_NAME_CLOSE_LIGHT_OFF = "closeLightOff";
    private static final String ACTION_NAME_GET_LIGHT_OFF_DATA = "getLightOffData";
    private static final String ACTION_NAME_LOCATOR_TO = "locatorTo";
    private static final String ACTION_NAME_VIDEO_SEEK_TO = "videoSeekTo";
    public static final String CLAZZ_NAME = "StandardDetailPicGallery";
    private static final String KEY_CODE = "code";
    private static final String KEY_LIGHT_OFF_TOKEN = "light_off_token";
    private static final String KEY_VIDEO_INFO = "videoInfo";

    static {
        kge.a(1058403199);
    }

    public static /* synthetic */ Object ipc$super(PicGalleryLightOffWindvaneApiPlugin picGalleryLightOffWindvaneApiPlugin, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public PicGalleryLightOffWindvaneApiPlugin() {
        emu.a("com.taobao.android.detail.core.standard.mainpic.weex.PicGalleryLightOffWindvaneApiPlugin");
    }

    @Override // com.taobao.android.detail.core.standard.mainpic.weex.AbsPicGalleryWindvaneApiPlugin
    public boolean handleAction(String str, JSONObject jSONObject, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f571bf02", new Object[]{this, str, jSONObject, wVCallBackContext})).booleanValue();
        }
        String string = jSONObject.getString(KEY_LIGHT_OFF_TOKEN);
        char c = 65535;
        switch (str.hashCode()) {
            case -2051102063:
                if (str.equals(ACTION_NAME_CLOSE_LIGHT_OFF)) {
                    c = 1;
                    break;
                }
                break;
            case -1197008463:
                if (str.equals("locatorTo")) {
                    c = 2;
                    break;
                }
                break;
            case 1028690798:
                if (str.equals(ACTION_NAME_VIDEO_SEEK_TO)) {
                    c = 3;
                    break;
                }
                break;
            case 1340863033:
                if (str.equals(ACTION_NAME_GET_LIGHT_OFF_DATA)) {
                    c = 0;
                    break;
                }
                break;
        }
        if (c == 0) {
            if (StringUtils.isEmpty(string)) {
                wVCallBackContext.error("getLightOffData,token is invalid");
                return true;
            }
            JSONObject lightOffData = getLightOffData(string);
            if (lightOffData == null) {
                wVCallBackContext.error("lightOffData is invalid");
            } else {
                wVCallBackContext.success(lightOffData.toJSONString());
            }
            return true;
        } else if (c == 1) {
            if (StringUtils.isEmpty(string)) {
                wVCallBackContext.error("closeLightOff,token is invalid");
                return true;
            }
            closeLightOff(string, jSONObject);
            wVCallBackContext.success(makeSuccessResponse());
            return true;
        } else if (c == 2) {
            if (StringUtils.isEmpty(string)) {
                wVCallBackContext.error("locatorTo,token is invalid");
                return true;
            }
            locatorTo(string, jSONObject);
            wVCallBackContext.success(makeSuccessResponse());
            return true;
        } else if (c != 3) {
            return false;
        } else {
            if (StringUtils.isEmpty(string)) {
                wVCallBackContext.error("videoSeekTo,token is invalid");
                return true;
            }
            videoSeekTo(string, jSONObject);
            wVCallBackContext.success(makeSuccessResponse());
            return true;
        }
    }

    private String makeSuccessResponse() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a0cd4b23", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(com.taobao.mtop.wvplugin.a.RESULT_KEY, (Object) "success");
        return jSONObject.toString();
    }

    private JSONObject getLightOffData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("8eccf2a", new Object[]{this, str});
        }
        elq a2 = elr.a(str);
        if (a2 == null) {
            ard a3 = arc.a();
            a3.c("PicGalleryLightOffWindvaneApiPlugin", ACTION_NAME_GET_LIGHT_OFF_DATA, "can't find picGalleryAuraPresenter,token:" + str);
            return null;
        }
        return a2.j();
    }

    private void closeLightOff(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fef5cce", new Object[]{this, str, jSONObject});
            return;
        }
        elq a2 = elr.a(str);
        if (a2 == null) {
            ard a3 = arc.a();
            a3.c("PicGalleryLightOffWindvaneApiPlugin", ACTION_NAME_CLOSE_LIGHT_OFF, "can't find picGalleryAuraPresenter,token:" + str);
            return;
        }
        locatorTo(str, jSONObject);
        videoSeekTo(str, jSONObject);
        com.taobao.android.detail.core.standard.lightoff.a i = a2.i();
        if (i == null) {
            arc.a().c("PicGalleryLightOffWindvaneApiPlugin", ACTION_NAME_CLOSE_LIGHT_OFF, "picGalleryLightOffManager is null");
        } else {
            i.b();
        }
    }

    private void locatorTo(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cc069ae", new Object[]{this, str, jSONObject});
            return;
        }
        elq a2 = elr.a(str);
        if (a2 == null) {
            ard a3 = arc.a();
            a3.c("PicGalleryLightOffWindvaneApiPlugin", "locatorTo", "can't find picGalleryAuraPresenter,token:" + str);
            return;
        }
        String string = jSONObject.getString("code");
        if (StringUtils.isEmpty(string)) {
            arc.a().c("PicGalleryLightOffWindvaneApiPlugin", "locatorTo", "code is empty");
        } else if (!(a2.b() instanceof RecyclerView)) {
            arc.a().c("PicGalleryLightOffWindvaneApiPlugin", "locatorTo", "presenter's view is not RecyclerView");
        } else {
            emn.a((RecyclerView) a2.b(), string);
        }
    }

    private void videoSeekTo(String str, JSONObject jSONObject) {
        AbsPicGalleryVideoPlayer a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b03dff51", new Object[]{this, str, jSONObject});
            return;
        }
        elq a3 = elr.a(str);
        if (a3 == null) {
            ard a4 = arc.a();
            a4.c("PicGalleryLightOffWindvaneApiPlugin", ACTION_NAME_VIDEO_SEEK_TO, "can't find picGalleryAuraPresenter,token:" + str);
            return;
        }
        d h = a3.h();
        if (h == null) {
            arc.a().c("PicGalleryLightOffWindvaneApiPlugin", ACTION_NAME_VIDEO_SEEK_TO, "picGalleryVideoManager is null");
            return;
        }
        JSONArray jSONArray = jSONObject.getJSONArray(KEY_VIDEO_INFO);
        if (jSONArray == null || jSONArray.isEmpty()) {
            arc.a().a("PicGalleryLightOffWindvaneApiPlugin", ACTION_NAME_VIDEO_SEEK_TO, "videoInfo is invalid,nothing to deal with");
            return;
        }
        for (int i = 0; i < jSONArray.size(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            if (jSONObject2 != null && (a2 = h.a(jSONObject2.getString("videoId"))) != null) {
                float floatValue = jSONObject2.getFloat("videoProgress") == null ? 0.0f : jSONObject2.getFloat("videoProgress").floatValue();
                if (floatValue >= 1.0f) {
                    videoComplete(a2);
                } else {
                    a2.a(floatValue);
                    if (jSONObject2.getBoolean(iyx.PARAM_VIDEO_AUTO_PLAY) == null ? false : jSONObject2.getBoolean(iyx.PARAM_VIDEO_AUTO_PLAY).booleanValue()) {
                        a2.a();
                    } else {
                        a2.b();
                    }
                }
            }
        }
    }

    private void videoComplete(AbsPicGalleryVideoPlayer absPicGalleryVideoPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ebc6b27", new Object[]{this, absPicGalleryVideoPlayer});
            return;
        }
        absPicGalleryVideoPlayer.a(0.0f);
        absPicGalleryVideoPlayer.a();
        absPicGalleryVideoPlayer.c();
        absPicGalleryVideoPlayer.b();
        AbsPicGalleryVideoPlayer.a t = absPicGalleryVideoPlayer.t();
        if (t == null) {
            return;
        }
        t.a(absPicGalleryVideoPlayer, absPicGalleryVideoPlayer.n(), 1.0f);
    }
}
