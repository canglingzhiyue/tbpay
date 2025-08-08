package com.taobao.relationship.mtop.addfollow;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.r;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.relationship.mtop.addfollow.AddFollowResponse;
import com.taobao.relationship.mtop.b;
import com.taobao.tao.flexbox.layoutmanager.actionservice.a;
import com.taobao.tao.log.TLog;
import com.taobao.tao.util.TBSoundPlayer;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders;
import java.util.HashMap;
import tb.kge;
import tb.nlv;
import tb.nlw;
import tb.nmf;
import tb.nmj;

/* loaded from: classes7.dex */
public class a implements a.InterfaceC0830a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String RETCODE_LOGIN_CANCEL = "ANDROID_SYS_LOGIN_CANCEL";

    /* renamed from: a  reason: collision with root package name */
    private com.taobao.relationship.mtop.a f18973a;
    private WVCallBackContext b;
    private nlv c;

    static {
        kge.a(-779434961);
        kge.a(-1545242362);
    }

    public a() {
    }

    public a(com.taobao.relationship.mtop.a aVar) {
        this.f18973a = aVar;
    }

    public a(WVCallBackContext wVCallBackContext) {
        this.b = wVCallBackContext;
    }

    public a(nlv nlvVar) {
        this.c = nlvVar;
    }

    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a6bf238", new Object[]{this, bVar});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("followedId", (Object) Long.valueOf(bVar.b));
        jSONObject.put("accountType", (Object) Integer.valueOf(bVar.c));
        jSONObject.put("originBiz", (Object) bVar.f);
        jSONObject.put("originPage", (Object) bVar.g);
        jSONObject.put("originFlag", (Object) bVar.h);
        jSONObject.put("type", (Object) Integer.valueOf(bVar.d));
        jSONObject.put("option", (Object) Integer.valueOf(bVar.e));
        if (!StringUtils.isEmpty(bVar.i)) {
            jSONObject.put("extra", (Object) bVar.i);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("followData", (Object) jSONObject);
        TLog.loge("WEITAO_FOLLOW_SDK", "ADD_FOLLOW", "execute add follow, params : " + jSONObject.toJSONString());
        UTHitBuilders.UTCustomHitBuilder uTCustomHitBuilder = new UTHitBuilders.UTCustomHitBuilder("WEITAO_FOLLOW_SDK_ADD_FOLLOW_START");
        uTCustomHitBuilder.setEventPage("Page_WEITAO_FOLLOW_SDK");
        UTAnalytics.getInstance().getDefaultTracker().send(uTCustomHitBuilder.build());
        a.b bVar2 = new a.b(null, "native");
        bVar2.a(bVar);
        com.taobao.tao.flexbox.layoutmanager.actionservice.a.c().a(nmf.ACTION_SERVICE_ADDFOLLOW, bVar2, jSONObject2, this);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.actionservice.a.InterfaceC0830a
    public void a(a.b bVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("349f918d", new Object[]{this, bVar, obj});
            return;
        }
        try {
            TLog.loge("WEITAO_FOLLOW_SDK", "ADD_FOLLOW", "add follow onSuccess, message : " + obj.toString());
            UTHitBuilders.UTCustomHitBuilder uTCustomHitBuilder = new UTHitBuilders.UTCustomHitBuilder("WEITAO_FOLLOW_SDK_ADD_FOLLOW_ONSUCESS");
            uTCustomHitBuilder.setEventPage("Page_WEITAO_FOLLOW_SDK");
            UTAnalytics.getInstance().getDefaultTracker().send(uTCustomHitBuilder.build());
            b bVar2 = (b) bVar.c;
            AddFollowResponse.AddFollowData addFollowData = (AddFollowResponse.AddFollowData) JSON.parseObject(obj.toString(), AddFollowResponse.AddFollowData.class);
            if (this.f18973a != null) {
                HashMap<String, Object> hashMap = new HashMap<>();
                if (!StringUtils.isEmpty(addFollowData.toastMsg)) {
                    hashMap.put("toast", addFollowData.toastMsg);
                }
                if (!StringUtils.isEmpty(addFollowData.followExtra)) {
                    hashMap.put(nmf.PARAMS_MTOP_RESULT_EXTRA, addFollowData.followExtra);
                }
                this.f18973a.onBusSuccess(nmf.MTOP_ADDFOLLOW, bVar2.b, bVar2.c, hashMap);
            }
            if (this.b != null) {
                r rVar = new r();
                if (!StringUtils.isEmpty(addFollowData.followExtra)) {
                    rVar.a(nmf.PARAMS_MTOP_RESULT_EXTRA, addFollowData.followExtra);
                }
                if (bVar2.m) {
                    if (StringUtils.isEmpty(addFollowData.toastMsg)) {
                        nmj.a("关注成功，可以在微淘查看TA的动态啦~");
                    } else {
                        nmj.a(addFollowData.toastMsg);
                    }
                }
                this.b.success(rVar);
            }
            if (this.c != null) {
                JSONObject jSONObject = new JSONObject();
                if (!StringUtils.isEmpty(addFollowData.followExtra)) {
                    jSONObject.put(nmf.PARAMS_MTOP_RESULT_EXTRA, (Object) addFollowData.followExtra);
                }
                if (bVar2.m) {
                    if (StringUtils.isEmpty(addFollowData.toastMsg)) {
                        nmj.a("关注成功，可以在微淘查看TA的动态啦~");
                    } else {
                        nmj.a(addFollowData.toastMsg);
                    }
                }
                this.c.onResult(nlw.a(jSONObject));
            }
            if (bVar2 != null && bVar2.d == 3 && bVar2.f18974a == null && bVar2.m && !StringUtils.isEmpty(addFollowData.toastMsg)) {
                nmj.a(addFollowData.toastMsg);
            }
            TBSoundPlayer.getInstance().playScene(3);
        } catch (Exception e) {
            TLog.loge("WEITAO_FOLLOW_SDK", "ADD_FOLLOW", e.toString());
            e.printStackTrace();
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.actionservice.a.InterfaceC0830a
    public void a(a.b bVar, a.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81a090d9", new Object[]{this, bVar, cVar});
            return;
        }
        try {
            TLog.loge("WEITAO_FOLLOW_SDK", "ADD_FOLLOW", "add follow onFail, message : " + cVar.b + " errorcode: " + cVar.f19948a);
            UTHitBuilders.UTCustomHitBuilder uTCustomHitBuilder = new UTHitBuilders.UTCustomHitBuilder("WEITAO_FOLLOW_SDK_ADD_FOLLOW_ONERROR");
            uTCustomHitBuilder.setEventPage("Page_WEITAO_FOLLOW_SDK");
            uTCustomHitBuilder.setProperty("error_massage", cVar.b + " , " + cVar.f19948a);
            UTAnalytics.getInstance().getDefaultTracker().send(uTCustomHitBuilder.build());
            b bVar2 = (b) bVar.c;
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put("errorCode", cVar.f19948a);
            hashMap.put("errorMsg", cVar.b);
            if (this.f18973a != null) {
                this.f18973a.onBusFail(nmf.MTOP_ADDFOLLOW, bVar2.b, bVar2.c, hashMap);
            }
            if (this.b != null) {
                if (bVar2.m) {
                    if (StringUtils.isEmpty(cVar.b)) {
                        nmj.a("关注失败");
                    } else {
                        nmj.a(cVar.b);
                    }
                }
                r rVar = new r();
                rVar.a("errorMessage", cVar.b);
                this.b.error(rVar);
            }
            if (this.c == null) {
                return;
            }
            if (bVar2.m) {
                if (StringUtils.isEmpty(cVar.b)) {
                    nmj.a("关注失败");
                } else {
                    nmj.a(cVar.b);
                }
            }
            this.c.onResult(nlw.b("errorMessage", cVar.b));
        } catch (Exception e) {
            TLog.loge("WEITAO_FOLLOW_SDK", "ADD_FOLLOW", e.toString());
            e.printStackTrace();
        }
    }
}
