package tb;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.live.plugin.atype.flexalocal.comments.chat.b;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c;
import com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarInfoCardResponseData;
import com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewFrame;
import com.taobao.android.live.plugin.proxy.f;
import com.taobao.android.nav.Nav;
import com.taobao.taolive.room.utils.n;
import com.taobao.taolive.sdk.model.common.AccountInfo;
import com.taobao.taolive.sdk.model.common.FandomInfo;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.utils.q;
import java.util.HashMap;

/* loaded from: classes5.dex */
public class hhc extends iot {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_TAOLIVEANCHORCARDACTION = 2913601765067462942L;

    static {
        kge.a(718000432);
    }

    public static /* synthetic */ Object ipc$super(hhc hhcVar, String str, Object... objArr) {
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // tb.iot
    public void a(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext, c cVar) {
        JSONObject jSONObject;
        char c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cc53e1f", new Object[]{this, dXEvent, objArr, dXRuntimeContext, cVar});
            return;
        }
        if (objArr != null && objArr.length > 0) {
            Context m = dXRuntimeContext.m();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            if (objArr.length > 4 && (objArr[4] instanceof String)) {
                hashMap2.putAll(b.a((String) objArr[4]));
            }
            Object obj = objArr[0];
            if (obj instanceof String) {
                String str = (String) obj;
                a a2 = n.a();
                String G = a2 == null ? null : a2.G();
                switch (str.hashCode()) {
                    case -1925818336:
                        if (str.equals("chatGroupClicked")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1633213306:
                        if (str.equals("reputationTagClicked")) {
                            c = 7;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1590527677:
                        if (str.equals("widgetClicked")) {
                            c = '\b';
                            break;
                        }
                        c = 65535;
                        break;
                    case -1571649069:
                        if (str.equals("openComponent")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1255161247:
                        if (str.equals("jumpUrl")) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case -888742219:
                        if (str.equals("openGoodsContainer")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case -365652245:
                        if (str.equals("favoriteClicked")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1523202360:
                        if (str.equals("openH5Url")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1737331510:
                        if (str.equals("followClicked")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                        if (objArr.length > 1) {
                            boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
                            if (hkk.j()) {
                                ddw.a().a("com.taobao.taolive.anchor_avatar_follow_changed", String.valueOf(booleanValue), G);
                                return;
                            }
                        }
                        break;
                    case 1:
                        if (objArr.length > 1) {
                            ddw.a().a("com.taobao.taolive.anchor_avatar_favorite_changed", String.valueOf(((Boolean) objArr[1]).booleanValue()), G);
                            break;
                        }
                        break;
                    case 2:
                        q.a("DXTaoLiveAnchorCardActionEventHandler", "chatGroupClicked");
                        if (hkk.j()) {
                            ddw.a().a("com.taobao.taolive.anchor_avatar_join_group", cVar, G);
                            return;
                        }
                        break;
                    case 3:
                        if (objArr.length > 3 && (objArr[4] instanceof String)) {
                            String str2 = (String) objArr[4];
                            if (!TextUtils.isEmpty(str2)) {
                                HashMap hashMap3 = new HashMap();
                                hashMap3.put("x", "0");
                                hashMap3.put("y", String.valueOf(0));
                                hashMap3.put("width", String.valueOf(-1));
                                hashMap3.put("height", "0.66");
                                hashMap3.put("modal", "true");
                                com.taobao.android.live.plugin.atype.flexalocal.good.a.a().i().a(cVar == null ? null : cVar.C(), m, hashMap3, str2, "anchorCard");
                                ddw.a().a(xkw.EVENT_AVATAR_CARD__HIDE, null, G);
                                break;
                            }
                        }
                        break;
                    case 4:
                        if (objArr.length > 1 && (objArr[1] instanceof String)) {
                            String str3 = (String) objArr[1];
                            hashMap2.remove("componentName");
                            if (!hashMap2.containsKey("dxAction")) {
                                hashMap2.put("dxAction", "unknown");
                            }
                            hashMap.putAll(hashMap2);
                            if (com.taobao.android.live.plugin.atype.flexalocal.good.a.a().i() != null) {
                                com.taobao.android.live.plugin.atype.flexalocal.good.a.a().i().a(cVar == null ? null : cVar.C(), m, str3, hashMap);
                                break;
                            }
                        }
                        break;
                    case 5:
                        if (hashMap2.containsKey("clickSource")) {
                            hashMap2.put("from", hashMap2.get("clickSource"));
                        }
                        hashMap.putAll(hashMap2);
                        f.m().getActionAdapter().a(cVar == null ? null : cVar.C(), xkw.EVENT_SHOW_GOODSPACKAGE, hashMap);
                        break;
                    case 6:
                        if (objArr.length > 4 && (objArr[4] instanceof String)) {
                            String str4 = (String) objArr[4];
                            q.a("DXTaoLiveAnchorCardActionEventHandler", "jumpUrl:" + objArr[4] + " " + str4);
                            if (!TextUtils.isEmpty(str4)) {
                                Bundle bundle = new Bundle();
                                if (n.a() != null && n.a().M() != null) {
                                    bundle.putString("initMuteStatus", String.valueOf(n.a().M().b()));
                                }
                                Nav.from(m).withExtras(bundle).toUri(str4);
                                ddw.a().a(xkw.EVENT_AVATAR_CARD__HIDE, null, G);
                            }
                            if (objArr[3] instanceof String) {
                                String str5 = (String) objArr[3];
                                HashMap<String, String> hashMap4 = new HashMap<>();
                                if (TextUtils.equals("shopClick", str5)) {
                                    if (com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j() != null) {
                                        hashMap4.put("name", "shop");
                                        hashMap4.put("spm-cnt", "a2141.8001249");
                                        hashMap4.put("followDegree", a() ? "NORMAL" : "UNFOLLOW");
                                        hashMap4.put("sourceType", pqe.b);
                                        com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j().a("LayerThickness_MiniProfile_GuideIcon", hashMap4);
                                        break;
                                    }
                                } else if (TextUtils.equals("playbackInfoClick", str5)) {
                                    a(objArr, hashMap4, "playback", cVar);
                                    break;
                                } else if (TextUtils.equals("videoClick", str5)) {
                                    if (objArr[2] instanceof JSONObject) {
                                        hashMap4.put("type", ((JSONObject) objArr[2]).getString("type"));
                                    }
                                    hashMap4.put("spm-cnt", "a2141.8001249");
                                    hashMap4.put("sourceType", pqe.b);
                                    if (com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j() != null) {
                                        com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j().a("LayerThickness_MiniProfile_FeedCard", hashMap4);
                                        break;
                                    }
                                } else if (TextUtils.equals("preLiveInfoClick", str5)) {
                                    a(objArr, hashMap4, "preview", cVar);
                                    break;
                                } else if (TextUtils.equals("anchorSubscribeInfoClick", str5)) {
                                    a(objArr, hashMap4, "subscribe", cVar);
                                    break;
                                }
                            }
                        }
                        break;
                    case 7:
                        if (hkk.I()) {
                            ddw.a().a(xkw.EVENT_AVATAR_CARD__HIDE, "openReputationDetail", G);
                            break;
                        }
                        break;
                    case '\b':
                        if (objArr.length > 1 && (objArr[1] instanceof JSONObject)) {
                            JSONObject jSONObject2 = (JSONObject) objArr[1];
                            String string = jSONObject2.getString("widgetJumpUrl");
                            boolean booleanValue2 = jSONObject2.getBooleanValue("installedWidget");
                            kpj.a(string, a2, jSONObject2.getString("jumpType"), (AccountInfo.ComponentData) jSONObject2.getObject("componentData", AccountInfo.ComponentData.class));
                            HashMap<String, String> hashMap5 = new HashMap<>();
                            hashMap5.put("addType", booleanValue2 ? "1" : "0");
                            if (com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j() != null) {
                                com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j().a("personal_anchorDesktop", hashMap5);
                                break;
                            }
                        }
                        break;
                    default:
                        q.a("DXTaoLiveAnchorCardActionEventHandler", "no click type");
                        break;
                }
            }
        }
        if (objArr == null || objArr.length <= 5 || !(objArr[5] instanceof JSONObject) || (jSONObject = (JSONObject) objArr[5]) == null || !jSONObject.containsKey("controlName")) {
            return;
        }
        try {
            LiveAvatarInfoCardResponseData.GenerateParams generateParams = (LiveAvatarInfoCardResponseData.GenerateParams) jSONObject.toJavaObject(LiveAvatarInfoCardResponseData.GenerateParams.class);
            if (com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j() == null || TextUtils.isEmpty(generateParams.controlName)) {
                return;
            }
            HashMap<String, String> hashMap6 = new HashMap<>();
            if (generateParams.params != null) {
                hashMap6.putAll(generateParams.params);
            }
            hashMap6.put("spm-cnt", "a2141.8001249");
            hashMap6.put("followDegree", a() ? "NORMAL" : "UNFOLLOW");
            hashMap6.put("sourceType", pqe.b);
            if (cVar != null) {
                hashMap6.put("spm-url", poy.K(cVar.C()));
            }
            com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j().a(generateParams.controlName, hashMap6);
        } catch (Exception e) {
            plx.b("DXTaoLiveAnchorCardActionEventHandler", "parse error: " + e.getMessage());
        }
    }

    private boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        if (hkk.I() && n.a() == null) {
            return false;
        }
        VideoInfo u = poy.u(n.a());
        FandomInfo H = poy.H(n.a());
        if (u != null && u.broadCaster != null) {
            return u.broadCaster.follow;
        }
        if (H != null && H.broadCaster != null) {
            return H.broadCaster.follow;
        }
        return false;
    }

    private void a(Object[] objArr, HashMap<String, String> hashMap, String str, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4564f4bb", new Object[]{this, objArr, hashMap, str, cVar});
        } else if (com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j() == null) {
        } else {
            if (objArr[2] instanceof JSONObject) {
                hashMap.put("link_feed_id", ((JSONObject) objArr[2]).getString(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID));
            }
            hashMap.put("spm-cnt", "a2141.8001249");
            hashMap.put("sourceType", pqe.b);
            hashMap.put("dynamic_type", str);
            if (cVar != null) {
                hashMap.put("spm-url", poy.K(cVar.C()));
            }
            com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j().a("LayerThickness_MiniProfile_GuideCast", hashMap);
        }
    }
}
