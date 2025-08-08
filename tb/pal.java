package tb;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.android.live.plugin.atype.flexalocal.bottom.control.share.b;
import com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewFrame;
import com.taobao.android.live.plugin.proxy.f;
import com.taobao.android.live.plugin.proxy.universal.IUniversalProxy;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import com.taobao.taolive.room.utils.aa;
import com.taobao.taolive.room.utils.ag;
import com.taobao.taolive.room.utils.ai;
import com.taobao.taolive.room.utils.aw;
import com.taobao.taolive.room.utils.c;
import com.taobao.taolive.room.utils.n;
import com.taobao.taolive.room.utils.t;
import com.taobao.taolive.room.utils.v;
import com.taobao.taolive.sdk.model.common.FandomInfo;
import com.taobao.taolive.sdk.model.common.QualitySelectItem;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.utils.u;
import com.ut.share.business.ShareBusiness;
import com.ut.share.business.ShareBusinessListener;
import com.ut.share.business.ShareContent;
import com.ut.share.business.ShareTargetType;
import com.ut.share.business.WWMessageType;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public class pal implements pny {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static ShareBusinessListener f32533a;

    private boolean a(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a8219760", new Object[]{this, new Long(j)})).booleanValue() : (j & 256) == 256;
    }

    public static /* synthetic */ void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
        } else {
            e();
        }
    }

    @Override // tb.pny
    public /* synthetic */ Object b(Activity activity, String str, String str2, String str3, String str4, boolean z, String str5, String str6, String str7, String str8) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("90b5f599", new Object[]{this, activity, str, str2, str3, str4, new Boolean(z), str5, str6, str7, str8}) : a(activity, str, str2, str3, str4, z, str5, str6, str7, str8);
    }

    private boolean a(Context context, VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1aa4f271", new Object[]{this, context, videoInfo})).booleanValue();
        }
        if (videoInfo.shareUrlDO == null || !"openUrl".equals(videoInfo.shareUrlDO.shareType)) {
            return false;
        }
        pmd.a().r().a(context, videoInfo.shareUrlDO.shareUrl, null);
        return true;
    }

    public ShareContent a(Activity activity, String str, String str2, String str3, String str4, boolean z, String str5, String str6, String str7, String str8) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShareContent) ipChange.ipc$dispatch("fa566d74", new Object[]{this, activity, str, str2, str3, str4, new Boolean(z), str5, str6, str7, str8});
        }
        ShareContent shareContent = new ShareContent();
        shareContent.title = "直播";
        shareContent.description = str;
        shareContent.imageUrl = str2;
        shareContent.shareScene = "talent";
        if (!StringUtils.isEmpty(str5)) {
            shareContent.url = str5;
        } else {
            if (z) {
                shareContent.url = c.a(str3, str4);
            } else {
                shareContent.url = c.b(str3, str4);
            }
            shareContent.url = c.d(shareContent.url, "share");
        }
        shareContent.url = a(shareContent.url);
        shareContent.url = b(shareContent.url);
        shareContent.wwMsgType = WWMessageType.WWMessageTypeDefault;
        shareContent.disableBackToClient = true;
        if (!StringUtils.isEmpty(str7)) {
            shareContent.businessId = str7;
            shareContent.templateId = "live";
        } else if (!StringUtils.isEmpty(str6)) {
            shareContent.businessId = "tblive_guard";
            shareContent.templateId = "weex";
            shareContent.templateParams = a(activity, z, str8);
        } else {
            shareContent.businessId = "zhibo";
            shareContent.templateId = "live";
        }
        shareContent.businessInfo = a(activity, str2);
        return shareContent;
    }

    private Map<String, String> a(Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("42521039", new Object[]{this, activity, str});
        }
        HashMap hashMap = new HashMap();
        VideoInfo u = poy.u(n.a());
        if (u != null && u.broadCaster != null) {
            String str2 = u.broadCaster.headImg;
            if (u.shareUrlDO != null && !StringUtils.isEmpty(u.shareUrlDO.iconUrl)) {
                str2 = u.shareUrlDO.iconUrl;
            }
            String str3 = u.broadCaster.accountName;
            if (u.shareUrlDO != null && !StringUtils.isEmpty(u.shareUrlDO.accountName)) {
                str3 = u.shareUrlDO.accountName;
            }
            String str4 = u.title;
            if (u.shareUrlDO != null && !StringUtils.isEmpty(u.shareUrlDO.title)) {
                str4 = u.shareUrlDO.title;
            }
            hashMap.put("topLogo", str2);
            hashMap.put("topTitle", str3);
            hashMap.put("title", str4);
            if (u.status == 4) {
                hashMap.put("bottomLogo", "http://gw.alicdn.com/mt/TB1XCwanWmWBuNjy1XaXXXCbXXa-99-54.png");
            } else if (u.status == 1) {
                hashMap.put("bottomLogo", "http://gw.alicdn.com/mt/TB15pJ4fLiSBuNkSnhJXXbDcpXa-99-54.png");
            } else {
                hashMap.put("bottomLogo", "http://gw.alicdn.com/mt/TB1pFYLn1uSBuNjSsziXXbq8pXa-153-54.png");
            }
            if (!u.enableHideWatchNums) {
                hashMap.put("bottomText", activity.getString(R.string.tb_impl_online_number, new Object[]{String.valueOf(t.a(t.a(u)))}));
            } else {
                hashMap.put("bottomText", a());
            }
            hashMap.put("descriptionImage", psm.y());
        }
        return hashMap;
    }

    private void a(Activity activity, Map<String, String> map, Map<String, String> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c93c99a", new Object[]{this, activity, map, map2});
            return;
        }
        FandomInfo H = poy.H(n.a());
        if (H == null || H.broadCaster == null) {
            return;
        }
        String str = H.broadCaster.headImg;
        String str2 = H.broadCaster.accountName;
        map.put("topLogo", str);
        map.put("topTitle", str2);
        map.put("title", map2.get(aw.PARAM_SHARE_TITLE));
        map.put("bottomLogo", "http://gw.alicdn.com/mt/TB1XCwanWmWBuNjy1XaXXXCbXXa-99-54.png");
        if (!H.enableHideWatchNums) {
            map.put("bottomText", activity.getString(R.string.tb_impl_online_number, new Object[]{String.valueOf(H.hot)}));
        } else {
            map.put("bottomText", a());
        }
        map.put("descriptionImage", psm.y());
    }

    private void a(ShareContent shareContent, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a2385a5", new Object[]{this, shareContent, map});
            return;
        }
        String str = map.get(aw.PARAM_SHARE_WEEX);
        if (shareContent == null || StringUtils.isEmpty(str)) {
            return;
        }
        shareContent.businessId = "taobaolive_fandom";
        shareContent.templateId = "weex";
        HashMap hashMap = new HashMap();
        hashMap.put("weexURL", str);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("width", "750");
        if (!StringUtils.isEmpty(map.get(aw.PARAM_FANDOM_HOT_ITEMS))) {
            hashMap2.put("height", "" + ((Math.min(v.b(map.get(aw.PARAM_FANDOM_HOT_ITEM_COUNT)) / 2, 8) * 492) + 854));
        } else {
            hashMap2.put("height", "855");
        }
        hashMap.put("weexCardSize", hashMap2);
        hashMap.put("useBroadcast", true);
        hashMap.put("shareInfo", a(map));
        shareContent.templateParams = hashMap;
    }

    private static String a(String str) {
        VideoInfo u;
        String encode;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        if (!aa.aw() || (u = poy.u(n.a())) == null || !StringUtils.isEmpty(u.paidLiveType) || !"1".equals(u.roomStatus) || u.liveUrlList == null || u.liveUrlList.size() <= 1) {
            return str;
        }
        QualitySelectItem qualitySelectItem = u.liveUrlList.get(1);
        if (!StringUtils.isEmpty(qualitySelectItem.rtcLiveUrl) && u.F()) {
            encode = Uri.encode(qualitySelectItem.rtcLiveUrl);
            str2 = "rtcLive";
        } else if (!StringUtils.isEmpty(qualitySelectItem.bfrtcUrl) && u.E()) {
            encode = Uri.encode(qualitySelectItem.bfrtcUrl);
            str2 = "bfrtc";
        } else if (!StringUtils.isEmpty(qualitySelectItem.artpUrl) && u.D()) {
            encode = Uri.encode(qualitySelectItem.artpUrl);
            str2 = "artp";
        } else {
            encode = Uri.encode(qualitySelectItem.flvUrl);
            str2 = "flv";
        }
        if (StringUtils.isEmpty(encode) || StringUtils.isEmpty(str2)) {
            return str;
        }
        if (str.contains("?")) {
            return str + "&livePlayUrl=" + encode + "&" + aw.PARAM_LIVE_URL_TYPE + "=" + str2;
        }
        return str + "?livePlayUrl=" + encode + "&" + aw.PARAM_LIVE_URL_TYPE + "=" + str2;
    }

    @Override // tb.pny
    public void a(Activity activity, String str, String str2, String str3, String str4, String str5, boolean z, Map<String, String> map) {
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        boolean z2;
        boolean z3;
        boolean z4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f3cef5d", new Object[]{this, activity, str, str2, str3, str4, str5, new Boolean(z), map});
        } else if (poy.J(n.a()) && map != null) {
            String str15 = map.get(aw.PARAM_SHARE_URL);
            String str16 = map.get("business_id");
            String str17 = map.get("liveShareUrlParams");
            String str18 = map.get(b.LIVE_SHARE_ACTION_INFO_PARAMS);
            if (StringUtils.isEmpty(str16)) {
                str16 = map.get("businessId");
            }
            ShareContent a2 = a(activity, str2, str3, str4, str5, false, str15, null, str16, null);
            if (!StringUtils.isEmpty(a2.url)) {
                if (!StringUtils.isEmpty(str17)) {
                    z4 = true;
                    a2.url = a(a2.url, "liveShareUrlParams", str17, true);
                } else {
                    z4 = true;
                }
                if (!StringUtils.isEmpty(str18)) {
                    a2.url = a(a2.url, b.LIVE_SHARE_ACTION_INFO_PARAMS, str18, z4);
                }
            }
            try {
                TLog.loge(pnj.LOG_TAG, "TLiveShareAdapter", "[share] content.businessId: " + a2.businessId + ", content.templateId: " + a2.templateId + ", content.url: " + a2.url + ", content.businessInfo: " + JSON.toJSONString(a2.businessInfo));
            } catch (Exception unused) {
            }
            a(a2, map);
            a(activity, a2.businessInfo, map);
            ShareBusiness.share(activity, a2, f32533a);
        } else {
            VideoInfo u = poy.u(n.a());
            if (activity == null || u == null || u.broadCaster == null || a(activity, u)) {
                return;
            }
            String str19 = null;
            if (u.shareUrlDO != null) {
                String str20 = !StringUtils.isEmpty(u.shareUrlDO.shareCardUrl) ? u.shareUrlDO.shareCardUrl : null;
                if (!StringUtils.isEmpty(u.shareUrlDO.bgImgUrl)) {
                    str7 = str20;
                    str6 = u.shareUrlDO.bgImgUrl;
                } else {
                    str7 = str20;
                    str6 = str3;
                }
            } else {
                str6 = str3;
                str7 = null;
            }
            String d = d();
            if (map != null) {
                str8 = ", content.url: ";
                String str21 = map.get(aw.PARAM_SJSD_ITEM_ID);
                String str22 = map.get("livesource");
                str9 = pnj.LOG_TAG;
                String str23 = str22;
                String str24 = map.get("business_id");
                str10 = ", content.templateId: ";
                String str25 = map.get("singleTarget");
                if (StringUtils.isEmpty(str24)) {
                    str24 = map.get("businessId");
                }
                if (!StringUtils.isEmpty(d)) {
                    if (!StringUtils.isEmpty(str21)) {
                        z3 = false;
                        d = a(d, aw.PARAM_SJSD_ITEM_ID, str21, false);
                    } else {
                        z3 = false;
                    }
                    if (!StringUtils.isEmpty(str23)) {
                        d = a(d, "livesource", str23, z3);
                    }
                }
                String str26 = map.get("liveShareUrlParams");
                str11 = d;
                str12 = map.get(b.LIVE_SHARE_ACTION_INFO_PARAMS);
                str14 = str25;
                str13 = str26;
                str19 = str24;
            } else {
                str8 = ", content.url: ";
                str9 = pnj.LOG_TAG;
                str10 = ", content.templateId: ";
                str11 = d;
                str12 = null;
                str13 = null;
                str14 = null;
            }
            String str27 = str8;
            String str28 = str12;
            String str29 = str9;
            String str30 = str13;
            String str31 = str10;
            ShareContent a3 = a(activity, str2, str6, str4, str5, false, str11, str7, str19, str14);
            if (!StringUtils.isEmpty(a3.url)) {
                if (!StringUtils.isEmpty(str30)) {
                    z2 = true;
                    a3.url = a(a3.url, "liveShareUrlParams", str30, true);
                } else {
                    z2 = true;
                }
                if (!StringUtils.isEmpty(str28)) {
                    a3.url = a(a3.url, b.LIVE_SHARE_ACTION_INFO_PARAMS, str28, z2);
                }
            }
            try {
                TLog.loge(str29, "TLiveShareAdapter", "[share] content.businessId: " + a3.businessId + str31 + a3.templateId + str27 + a3.url + ", content.businessInfo: " + JSON.toJSONString(a3.businessInfo));
            } catch (Exception unused2) {
            }
            ShareBusiness.share(activity, a3, f32533a);
        }
    }

    private String a(String str, String str2, String str3, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d604f12", new Object[]{this, str, str2, str3, new Boolean(z)});
        }
        if (str == null || StringUtils.isEmpty(str) || StringUtils.isEmpty(str2) || StringUtils.isEmpty(str3)) {
            TLog.loge(pnj.LOG_TAG, "TLiveShareAdapter", "[appendValueToUrl] params error,  url: " + str + ", key: " + str2 + ", value: " + str3);
            return str;
        } else if (str.contains("?")) {
            if (z) {
                return str + "&" + str2 + "=" + Uri.encode(str3);
            }
            return str + "&" + str2 + "=" + str3;
        } else if (z) {
            return str + "?" + str2 + "=" + Uri.encode(str3);
        } else {
            return str + "?" + str2 + "=" + str3;
        }
    }

    private String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str});
        }
        if (StringUtils.isEmpty(str) || str.contains("cp_origin=")) {
            return str;
        }
        if (str.contains("?")) {
            return str + "&cp_origin=" + c();
        }
        return str + "?cp_origin=" + c();
    }

    private String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        VideoInfo u = poy.u(n.a());
        if (u != null) {
            jSONObject.put("feed_id", (Object) u.liveId);
            if (u.broadCaster != null) {
                jSONObject.put("account_id", (Object) u.broadCaster.accountId);
            }
            if (aa.c() && poy.ag(n.a())) {
                jSONObject.put("spm-cnt", (Object) "a2141.23201685");
            } else if (ai.a()) {
                jSONObject.put("spm-cnt", (Object) ai.b());
            } else {
                jSONObject.put("spm-cnt", (Object) "a2141.8001249");
            }
            if (pmd.a().u() != null) {
                jSONObject.put(MspGlobalDefine.APP_KEY, (Object) pmd.a().u().b());
            }
            jSONObject.put("os", (Object) "android");
        }
        return Uri.encode("taobaozhibo|a2141.8001249|" + jSONObject.toJSONString());
    }

    private String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[]{this});
        }
        VideoInfo u = poy.u(n.a());
        if (u != null && u.shareUrlDO != null) {
            return u.shareUrlDO.shareUrl;
        }
        return null;
    }

    private Map<String, Object> a(Activity activity, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f160aed9", new Object[]{this, activity, new Boolean(z), str});
        }
        VideoInfo u = poy.u(n.a());
        HashMap hashMap = new HashMap();
        if (u != null && u.shareUrlDO != null) {
            hashMap.put("weexURL", u.shareUrlDO.shareCardUrl);
            HashMap hashMap2 = new HashMap();
            hashMap2.put("width", psm.b());
            hashMap2.put("height", psm.c());
            hashMap.put("weexCardSize", hashMap2);
            hashMap.put("shareInfo", a(z, activity.getString(R.string.tb_impl_online_number, new Object[]{String.valueOf(t.a(u))}), u.status == 0 ? "living" : ag.CLICK_REPLAY));
            if (!StringUtils.isEmpty(str)) {
                hashMap.put("singleTarget", str);
            }
        }
        return hashMap;
    }

    private Map<String, String> a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4fc7ad92", new Object[]{this, map});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("coverImageSource", map.get(aw.PARAM_FANDOM_ACCOUNT_IMG));
        hashMap.put("preShareHeadPic", map.get(aw.PARAM_FANDOM_HEAD_IMG));
        hashMap.put("liveTitle", map.get(aw.PARAM_SHARE_TITLE));
        hashMap.put("accountName", map.get(aw.PARAM_FANDOM_ACCOUNT_NAME));
        hashMap.put("startTime", map.get(aw.PARAM_FANDOM_START_TIME));
        hashMap.put("hotItems", map.get(aw.PARAM_FANDOM_HOT_ITEMS));
        return hashMap;
    }

    private Map<String, String> a(boolean z, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f51074b5", new Object[]{this, new Boolean(z), str, str2});
        }
        HashMap hashMap = new HashMap();
        VideoInfo u = poy.u(n.a());
        pnk q = pmd.a().q();
        String e = q != null ? q.e() : "https://img.alicdn.com/tfs/TB1_AKpfSf2gK0jSZFPXXXsopXa-400-400.png";
        if (u != null && u.broadCaster != null && u.shareUrlDO != null) {
            String str3 = e;
            if (a(u.newRoomType)) {
                hashMap.put("accountAvatar", u.broadCaster.headImg);
                hashMap.put("accountName", u.broadCaster.accountName);
                hashMap.put("accountId", u.broadCaster.accountId);
                hashMap.put("coverImageSource", u.coverImg);
                hashMap.put("landscape", z ? "1" : "0");
                hashMap.put(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID, u.liveId);
                hashMap.put("liveTitle", u.title);
                hashMap.put("livetype", str2);
                hashMap.put("userCount", str);
                hashMap.put("vrType", "" + u.vrType);
                hashMap.put(aw.PARAM_ELEVEN_LIVE_ID, u.topic);
                hashMap.put("userAvatar", str3);
            } else {
                hashMap.put("accountAvatar", !StringUtils.isEmpty(u.shareUrlDO.iconUrl) ? u.shareUrlDO.iconUrl : u.broadCaster.headImg);
                hashMap.put("accountName", !StringUtils.isEmpty(u.shareUrlDO.accountName) ? u.shareUrlDO.accountName : u.broadCaster.accountName);
                hashMap.put("accountId", u.broadCaster.accountId);
                hashMap.put("coverImageSource", !StringUtils.isEmpty(u.shareUrlDO.bgImgUrl) ? u.shareUrlDO.bgImgUrl : u.coverImg);
                hashMap.put("landscape", z ? "1" : "0");
                hashMap.put(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID, u.liveId);
                hashMap.put("liveTitle", !StringUtils.isEmpty(u.shareUrlDO.title) ? u.shareUrlDO.title : u.title);
                hashMap.put("livetype", str2);
                hashMap.put("userCount", str);
                hashMap.put("vrType", "" + u.vrType);
                hashMap.put(aw.PARAM_ELEVEN_LIVE_ID, u.topic);
                hashMap.put("userAvatar", str3);
            }
        }
        return hashMap;
    }

    private static void e() {
        long j;
        long j2;
        IUniversalProxy.c liveEventReportInstance;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[0]);
            return;
        }
        VideoInfo u = poy.u(n.a());
        if (u != null) {
            try {
                j = Long.parseLong(u.liveId);
                try {
                    if (u.broadCaster != null) {
                        j2 = Long.parseLong(u.broadCaster.accountId);
                    }
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                j = 0;
            }
            j2 = 0;
        } else {
            j = 0;
            j2 = 0;
        }
        if (phg.a() == null || phg.a().a() == null) {
            return;
        }
        if (f.o() != null && (liveEventReportInstance = f.o().getLiveEventReportInstance()) != null) {
            liveEventReportInstance.a(j, j2);
            if (a(u)) {
                liveEventReportInstance.b(v.a(u.officialLiveInfo.officialLiveId, 0L), v.a(u.officialLiveInfo.accountId, 0L));
            }
        }
        phg.a().a("share_test", (Map<String, String>) new HashMap());
    }

    private static boolean a(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ead9f969", new Object[]{videoInfo})).booleanValue() : videoInfo != null && videoInfo.isOfficialType();
    }

    static {
        kge.a(431310220);
        kge.a(1058720768);
        f32533a = new ShareBusinessListener() { // from class: tb.pal.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ut.share.business.ShareBusinessListener
            public void onFinished(Map<String, String> map) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ff43b50d", new Object[]{this, map});
                }
            }

            @Override // com.ut.share.business.ShareBusinessListener
            public void onShare(ShareContent shareContent, ShareTargetType shareTargetType) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8a481375", new Object[]{this, shareContent, shareTargetType});
                    return;
                }
                TLog.loge(pnj.LOG_TAG, "TLiveShareAdapter", "[ShareBusinessListener#onShare] shareTargetType: " + shareTargetType);
                a a2 = n.a();
                String str = null;
                if (a2 != null) {
                    str = a2.G();
                }
                ddw.a().a("com.taobao.taolive.room.share", shareContent, str);
                pal.b();
            }
        };
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : OrangeConfig.getInstance().getConfig("tblive_share", "hideWatchNumsText", "大家都在看");
    }
}
