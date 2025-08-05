package com.taobao.taolive.room.dx;

import android.text.TextUtils;
import com.ali.user.mobile.login.model.LoginConstant;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewFrame;
import com.taobao.taolive.room.utils.ai;
import com.taobao.taolive.room.utils.n;
import com.taobao.taolive.sdk.model.common.SideGudieInfo;
import com.taobao.taolive.sdk.ui.component.VideoFrameErrorController;
import java.util.HashMap;
import java.util.Map;
import tb.ddw;
import tb.kge;
import tb.pqj;
import tb.xkw;

/* loaded from: classes8.dex */
public class f extends com.taobao.android.dinamicx.h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_TAOLIVERECOMMENDACTION = -9161917088790983998L;

    static {
        kge.a(-1130986333);
    }

    public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
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
        } else if (objArr == null || objArr.length <= 0 || !(objArr[0] instanceof String)) {
        } else {
            String str = (String) objArr[0];
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != 1860981261) {
                if (hashCode == 2103642549 && str.equals("bottomRecommendGuideLayout")) {
                    c = 0;
                }
            } else if (str.equals("bottomRecommendGuideClose")) {
                c = 1;
            }
            if (c != 0) {
                if (c != 1) {
                    return;
                }
                ddw.a().a(xkw.EVENT_UP_AND_DOWN_GUIDE_BOTTOM_CLOSE_EVENT);
                if (objArr.length <= 1 || objArr[1] == null) {
                    return;
                }
                a((JSONObject) objArr[1], "close");
            } else if (objArr.length <= 1 || objArr[1] == null) {
            } else {
                JSONObject jSONObject = (JSONObject) objArr[1];
                String string = jSONObject.getString(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID);
                if (!TextUtils.isEmpty(string)) {
                    ddw.a().a(VideoFrameErrorController.EVENT_AUTO_DOWN, string);
                }
                a(jSONObject, "click");
            }
        }
    }

    private void a(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48075352", new Object[]{this, jSONObject, str});
        } else if (jSONObject == null) {
        } else {
            SideGudieInfo sideGudieInfo = (SideGudieInfo) pqj.a(jSONObject.toJSONString(), SideGudieInfo.class);
            HashMap hashMap = new HashMap();
            hashMap.put("recommendType", sideGudieInfo.recommendType);
            hashMap.put("text", pqj.a(sideGudieInfo.recommendTextList));
            if (!TextUtils.isEmpty(jSONObject.getString(LoginConstant.ACCOUNT))) {
                hashMap.put(LoginConstant.ACCOUNT, jSONObject.getString(LoginConstant.ACCOUNT));
            }
            if (!TextUtils.isEmpty(jSONObject.getString("residenceTime"))) {
                hashMap.put("showtime", jSONObject.getString("residenceTime"));
            }
            if (!TextUtils.isEmpty(jSONObject.getString("delaytime"))) {
                hashMap.put("delaytime", jSONObject.getString("delaytime"));
            }
            hashMap.put("action", str);
            ai.a(n.a(), "Button_swipe_btnbar", (Map<String, String>) hashMap);
        }
    }
}
