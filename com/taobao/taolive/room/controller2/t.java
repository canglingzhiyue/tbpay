package com.taobao.taolive.room.controller2;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.security.realidentity.g4;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewFrame;
import com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy;
import com.taobao.login4android.api.Login;
import com.taobao.taolive.room.openarchitecture.entity.ATaoLiveOpenEntity;
import com.taobao.taolive.room.utils.aa;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.utils.y;
import java.util.HashMap;
import tb.ddu;
import tb.kge;
import tb.pdt;
import tb.phq;
import tb.pkg;
import tb.poy;
import tb.poz;

/* loaded from: classes8.dex */
public class t {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_APP_NAME = "SmartLandingAppName";
    public static final String KEY_FOLLOW_STATUS = "followStatus";
    public static final String KEY_TAOLIVEOPENBIZCODE = "TaoLiveOpenBizCode";

    /* renamed from: a  reason: collision with root package name */
    private com.taobao.taolive.sdk.controller.e f21616a;
    private Context b;
    private ISmartLandingProxy.b c;

    static {
        kge.a(-302090618);
    }

    public t(com.taobao.taolive.sdk.controller.e eVar, Context context) {
        this.f21616a = eVar;
        this.b = context;
    }

    public void a(String str, String str2, String str3, String str4) {
        pkg pkgVar;
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee2b490", new Object[]{this, str, str2, str3, str4});
        } else if (this.f21616a == null || !aa.da()) {
        } else {
            String str5 = null;
            if ((this.f21616a.f() instanceof ATaoLiveOpenEntity) && (pkgVar = ((ATaoLiveOpenEntity) this.f21616a.f()).taoliveOpenContext) != null && pkgVar.f != null && (obj = pkgVar.f.get("aliveChanel")) != null) {
                str5 = String.valueOf(obj);
            }
            this.c = com.taobao.android.live.plugin.proxy.f.B().createSmartLanding(this.b, "liveRoomPage", str5, str2, str2, str3, str4, str, c(), new ISmartLandingProxy.c() { // from class: com.taobao.taolive.room.controller2.t.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy.c
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    }
                }

                @Override // com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy.c
                public boolean a(Context context, String str6, String str7, JSONObject jSONObject) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("5ea65000", new Object[]{this, context, str6, str7, jSONObject})).booleanValue();
                    }
                    if (TextUtils.equals("alive", str7)) {
                        com.taobao.alilive.aliliveframework.frame.a a2 = com.taobao.taolive.room.utils.n.a();
                        if (a2 instanceof phq) {
                            phq phqVar = (phq) a2;
                            if (phqVar.p() != null) {
                                HashMap hashMap = new HashMap();
                                hashMap.put("actionData", jSONObject);
                                phqVar.p().a("TBLiveWVPlugin.Event.smartLanding", hashMap);
                            }
                        }
                        return true;
                    } else if (!TextUtils.equals("event", str7)) {
                        return false;
                    } else {
                        com.taobao.alilive.aliliveframework.frame.a a3 = com.taobao.taolive.room.utils.n.a();
                        if (jSONObject != null && a3 != null) {
                            String string = jSONObject.getString("actionEvent");
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("popId", (Object) str6);
                            jSONObject2.put("actionData", (Object) jSONObject);
                            ddu e = a3.e();
                            e.a("smartlanding_event_" + string, jSONObject2);
                        }
                        return true;
                    }
                }
            });
            this.f21616a.F = this.c;
        }
    }

    private JSONObject c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("97ef1e8a", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("entrySpm", (Object) poz.g(this.f21616a));
        jSONObject.put("isPad", (Object) Boolean.valueOf(y.b(this.b)));
        jSONObject.put("isFoldDevice", (Object) Boolean.valueOf(y.c(this.b)));
        if (aa.dg()) {
            jSONObject.put("switchIndex", (Object) Long.valueOf(poz.E(this.f21616a)));
        } else {
            jSONObject.put("switchIndex", (Object) Long.valueOf(poy.ai(com.taobao.taolive.room.utils.n.a())));
        }
        return jSONObject;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        ISmartLandingProxy.b bVar = this.c;
        if (bVar == null) {
            return;
        }
        bVar.a();
        this.c = null;
    }

    public void a(boolean z, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eab8b794", new Object[]{this, new Boolean(z), str, str2, str3, str4});
            return;
        }
        ISmartLandingProxy.b bVar = this.c;
        if (bVar == null) {
            return;
        }
        bVar.a(z, str, str2, str3, str4, c());
        this.c.a(g4.b.i, (ISmartLandingProxy.a) null);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        ISmartLandingProxy.b bVar = this.c;
        if (bVar == null) {
            return;
        }
        bVar.c();
    }

    public void a(Object obj) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
        } else if (!(obj instanceof TBLiveDataModel)) {
        } else {
            com.taobao.alilive.aliliveframework.frame.a a2 = com.taobao.taolive.room.utils.n.a();
            TBLiveDataModel tBLiveDataModel = (TBLiveDataModel) obj;
            a("userId", Login.getUserId());
            a("showLiveShopEntry", String.valueOf(false));
            a("enableDoubleClickFav", String.valueOf(poy.v(a2)));
            com.taobao.taolive.sdk.controller.e eVar = this.f21616a;
            if (eVar != null) {
                a("enableZoomLiveRoom", String.valueOf(eVar.aJ_().ae()));
            }
            a("switchIndex", String.valueOf(poy.ai(a2)));
            a("isUp", String.valueOf(poy.W(a2)));
            String T = poy.T(a2);
            a("entrySpm", String.valueOf(T));
            if (!TextUtils.isEmpty(T) && (split = T.split("\\.")) != null && split.length >= 2) {
                a("entrySpmAB", split[0] + "." + split[1]);
            }
            a("entrySource", String.valueOf(poy.R(a2)));
            a(pdt.entryQuery, String.valueOf(poy.S(a2)));
            VideoInfo videoInfo = tBLiveDataModel.mVideoInfo;
            if (videoInfo == null) {
                return;
            }
            a(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID, videoInfo.liveId);
            a("roomStatus", videoInfo.roomStatus);
            a("isMember", String.valueOf(videoInfo.shopVip));
            if (videoInfo.broadCaster == null) {
                return;
            }
            a("anchorId", videoInfo.broadCaster.accountId);
            if ("shop".equalsIgnoreCase(videoInfo.broadCaster.type)) {
                a("accountType", "1");
            } else {
                a("accountType", "2");
            }
            a("headImg", videoInfo.broadCaster.headImg);
            a("accountName", videoInfo.broadCaster.accountName);
            a("followStatus", String.valueOf(videoInfo.broadCaster.follow));
        }
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        ISmartLandingProxy.b bVar = this.c;
        if (bVar == null) {
            return;
        }
        bVar.a(str, str2);
    }
}
