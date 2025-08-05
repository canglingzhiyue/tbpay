package com.taobao.taolive.adapterimpl.nav;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.taobao.windvane.util.m;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewFrame;
import com.taobao.android.nav.Nav;
import com.taobao.login4android.api.Login;
import com.taobao.tao.content.business.ContentBusinessModel;
import com.taobao.taolive.room.utils.ag;
import com.taobao.taolive.room.utils.n;
import com.taobao.taolive.room.utils.v;
import com.taobao.taolive.sdk.core.e;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.utils.q;
import com.taobao.taolive.sdk.utils.y;
import java.net.URI;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.common.util.SymbolExpUtil;
import org.json.JSONException;
import org.json.JSONObject;
import tb.ado;
import tb.cgu;
import tb.ddw;
import tb.dlx;
import tb.fmg;
import tb.kge;
import tb.paq;
import tb.pkg;
import tb.pmd;
import tb.poy;
import tb.ppv;
import tb.pqj;
import tb.psm;
import tb.tby;
import tb.tfu;

/* loaded from: classes8.dex */
public class b implements cgu {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean e = false;

    /* renamed from: a */
    private final String f21395a = psm.D();
    private final boolean b = psm.E();
    private final boolean c = psm.F();
    private final boolean d = psm.C();

    static {
        kge.a(1573355725);
        kge.a(915407345);
    }

    public static /* synthetic */ void a(b bVar, ContentBusinessModel contentBusinessModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ba7689b", new Object[]{bVar, contentBusinessModel});
        } else {
            bVar.a(contentBusinessModel);
        }
    }

    private void a(VideoInfo videoInfo, ContentBusinessModel contentBusinessModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1b34cab", new Object[]{this, videoInfo, contentBusinessModel});
        } else if (contentBusinessModel == null || videoInfo == null || !videoInfo.isOfficialType() || !psm.x()) {
        } else {
            contentBusinessModel.trackSource = "tblivegft";
            contentBusinessModel.trackSubSource = "tblivegft";
            if (contentBusinessModel.context == null) {
                contentBusinessModel.context = new JSONObject();
            }
            try {
                contentBusinessModel.context.put("officialLiveId", videoInfo.officialLiveInfo.officialLiveId);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    @Override // tb.cgu
    public void a(com.taobao.alilive.aliliveframework.frame.a aVar, Activity activity, LiveItem liveItem, String str, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3476c51f", new Object[]{this, aVar, activity, liveItem, str, hashMap});
        } else {
            b(aVar, activity, liveItem, str, hashMap);
        }
    }

    private void a(com.taobao.alilive.aliliveframework.frame.a aVar, com.alibaba.fastjson.JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d90eda6b", new Object[]{this, aVar, jSONObject, jSONObject2});
            return;
        }
        try {
            if (!v.e(pmd.a().d().a("tblive", "enableAddLiveTokenTcp", "true")) || aVar == null || jSONObject == null || jSONObject2 == null || TextUtils.isEmpty(jSONObject.getString(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID)) || !jSONObject.getString(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID).equals(aVar.d)) {
                return;
            }
            jSONObject2.put("liveToken", aVar.j());
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(48:44|(5:46|(1:48)(1:238)|49|(1:51)(1:237)|52)(1:239)|53|(2:55|(43:69|70|(1:72)|73|74|75|(1:77)|78|(3:80|(2:83|81)|84)|85|(5:87|88|89|(3:91|(3:94|95|92)|96)|98)|202|(1:204)|205|(1:207)(1:233)|208|(1:210)|211|(10:213|(1:215)(1:231)|216|217|218|219|220|221|222|(1:224))(1:232)|103|(1:107)|108|(1:110)|111|(1:201)|116|(1:118)(1:200)|(4:120|(1:122)|123|(1:125)(1:126))|127|128|(1:130)|131|(1:133)|134|(1:136)|137|(2:139|(1:141))|142|(1:144)(1:197)|145|(4:147|(1:157)|158|(1:168))|169|170))(1:236)|235|70|(0)|73|74|75|(0)|78|(0)|85|(0)|202|(0)|205|(0)(0)|208|(0)|211|(0)(0)|103|(2:105|107)|108|(0)|111|(0)|201|116|(0)(0)|(0)|127|128|(0)|131|(0)|134|(0)|137|(0)|142|(0)(0)|145|(0)|169|170) */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x0414, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:473:0x065b, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:474:0x065c, code lost:
        r0.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:304:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x026b A[Catch: JSONException -> 0x0414, TryCatch #0 {JSONException -> 0x0414, blocks: (B:348:0x025b, B:350:0x026b, B:351:0x0276, B:353:0x0280, B:354:0x0288, B:356:0x028e, B:357:0x02a6, B:359:0x02b2, B:370:0x02ee, B:372:0x0325, B:373:0x0347, B:375:0x037f, B:377:0x0386, B:379:0x0390, B:380:0x039a, B:382:0x03a0, B:386:0x03b3), top: B:508:0x025b }] */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0280 A[Catch: JSONException -> 0x0414, TryCatch #0 {JSONException -> 0x0414, blocks: (B:348:0x025b, B:350:0x026b, B:351:0x0276, B:353:0x0280, B:354:0x0288, B:356:0x028e, B:357:0x02a6, B:359:0x02b2, B:370:0x02ee, B:372:0x0325, B:373:0x0347, B:375:0x037f, B:377:0x0386, B:379:0x0390, B:380:0x039a, B:382:0x03a0, B:386:0x03b3), top: B:508:0x025b }] */
    /* JADX WARN: Removed duplicated region for block: B:359:0x02b2 A[Catch: JSONException -> 0x0414, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0414, blocks: (B:348:0x025b, B:350:0x026b, B:351:0x0276, B:353:0x0280, B:354:0x0288, B:356:0x028e, B:357:0x02a6, B:359:0x02b2, B:370:0x02ee, B:372:0x0325, B:373:0x0347, B:375:0x037f, B:377:0x0386, B:379:0x0390, B:380:0x039a, B:382:0x03a0, B:386:0x03b3), top: B:508:0x025b }] */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0325 A[Catch: JSONException -> 0x0414, TryCatch #0 {JSONException -> 0x0414, blocks: (B:348:0x025b, B:350:0x026b, B:351:0x0276, B:353:0x0280, B:354:0x0288, B:356:0x028e, B:357:0x02a6, B:359:0x02b2, B:370:0x02ee, B:372:0x0325, B:373:0x0347, B:375:0x037f, B:377:0x0386, B:379:0x0390, B:380:0x039a, B:382:0x03a0, B:386:0x03b3), top: B:508:0x025b }] */
    /* JADX WARN: Removed duplicated region for block: B:375:0x037f A[Catch: JSONException -> 0x0414, TryCatch #0 {JSONException -> 0x0414, blocks: (B:348:0x025b, B:350:0x026b, B:351:0x0276, B:353:0x0280, B:354:0x0288, B:356:0x028e, B:357:0x02a6, B:359:0x02b2, B:370:0x02ee, B:372:0x0325, B:373:0x0347, B:375:0x037f, B:377:0x0386, B:379:0x0390, B:380:0x039a, B:382:0x03a0, B:386:0x03b3), top: B:508:0x025b }] */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0390 A[Catch: JSONException -> 0x0414, TryCatch #0 {JSONException -> 0x0414, blocks: (B:348:0x025b, B:350:0x026b, B:351:0x0276, B:353:0x0280, B:354:0x0288, B:356:0x028e, B:357:0x02a6, B:359:0x02b2, B:370:0x02ee, B:372:0x0325, B:373:0x0347, B:375:0x037f, B:377:0x0386, B:379:0x0390, B:380:0x039a, B:382:0x03a0, B:386:0x03b3), top: B:508:0x025b }] */
    /* JADX WARN: Removed duplicated region for block: B:382:0x03a0 A[Catch: JSONException -> 0x0414, TryCatch #0 {JSONException -> 0x0414, blocks: (B:348:0x025b, B:350:0x026b, B:351:0x0276, B:353:0x0280, B:354:0x0288, B:356:0x028e, B:357:0x02a6, B:359:0x02b2, B:370:0x02ee, B:372:0x0325, B:373:0x0347, B:375:0x037f, B:377:0x0386, B:379:0x0390, B:380:0x039a, B:382:0x03a0, B:386:0x03b3), top: B:508:0x025b }] */
    /* JADX WARN: Removed duplicated region for block: B:398:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x045f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:419:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x054d A[Catch: Exception -> 0x065b, TryCatch #2 {Exception -> 0x065b, blocks: (B:429:0x0548, B:431:0x054d, B:432:0x0559, B:434:0x0567, B:435:0x0575, B:437:0x057b, B:438:0x058a, B:440:0x059a, B:442:0x05bc, B:443:0x05c9, B:447:0x05d8, B:449:0x05dd, B:451:0x05e5, B:453:0x05eb, B:455:0x05f7, B:457:0x05ff, B:459:0x0605, B:460:0x0608, B:462:0x0610, B:464:0x0616, B:466:0x0622, B:468:0x062a, B:470:0x0630, B:471:0x0633), top: B:512:0x0548 }] */
    /* JADX WARN: Removed duplicated region for block: B:434:0x0567 A[Catch: Exception -> 0x065b, TryCatch #2 {Exception -> 0x065b, blocks: (B:429:0x0548, B:431:0x054d, B:432:0x0559, B:434:0x0567, B:435:0x0575, B:437:0x057b, B:438:0x058a, B:440:0x059a, B:442:0x05bc, B:443:0x05c9, B:447:0x05d8, B:449:0x05dd, B:451:0x05e5, B:453:0x05eb, B:455:0x05f7, B:457:0x05ff, B:459:0x0605, B:460:0x0608, B:462:0x0610, B:464:0x0616, B:466:0x0622, B:468:0x062a, B:470:0x0630, B:471:0x0633), top: B:512:0x0548 }] */
    /* JADX WARN: Removed duplicated region for block: B:437:0x057b A[Catch: Exception -> 0x065b, TryCatch #2 {Exception -> 0x065b, blocks: (B:429:0x0548, B:431:0x054d, B:432:0x0559, B:434:0x0567, B:435:0x0575, B:437:0x057b, B:438:0x058a, B:440:0x059a, B:442:0x05bc, B:443:0x05c9, B:447:0x05d8, B:449:0x05dd, B:451:0x05e5, B:453:0x05eb, B:455:0x05f7, B:457:0x05ff, B:459:0x0605, B:460:0x0608, B:462:0x0610, B:464:0x0616, B:466:0x0622, B:468:0x062a, B:470:0x0630, B:471:0x0633), top: B:512:0x0548 }] */
    /* JADX WARN: Removed duplicated region for block: B:440:0x059a A[Catch: Exception -> 0x065b, TryCatch #2 {Exception -> 0x065b, blocks: (B:429:0x0548, B:431:0x054d, B:432:0x0559, B:434:0x0567, B:435:0x0575, B:437:0x057b, B:438:0x058a, B:440:0x059a, B:442:0x05bc, B:443:0x05c9, B:447:0x05d8, B:449:0x05dd, B:451:0x05e5, B:453:0x05eb, B:455:0x05f7, B:457:0x05ff, B:459:0x0605, B:460:0x0608, B:462:0x0610, B:464:0x0616, B:466:0x0622, B:468:0x062a, B:470:0x0630, B:471:0x0633), top: B:512:0x0548 }] */
    /* JADX WARN: Removed duplicated region for block: B:445:0x05d2  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x05d5  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x05dd A[Catch: Exception -> 0x065b, TryCatch #2 {Exception -> 0x065b, blocks: (B:429:0x0548, B:431:0x054d, B:432:0x0559, B:434:0x0567, B:435:0x0575, B:437:0x057b, B:438:0x058a, B:440:0x059a, B:442:0x05bc, B:443:0x05c9, B:447:0x05d8, B:449:0x05dd, B:451:0x05e5, B:453:0x05eb, B:455:0x05f7, B:457:0x05ff, B:459:0x0605, B:460:0x0608, B:462:0x0610, B:464:0x0616, B:466:0x0622, B:468:0x062a, B:470:0x0630, B:471:0x0633), top: B:512:0x0548 }] */
    /* JADX WARN: Removed duplicated region for block: B:478:0x0682  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x06a2  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x06bf  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x06cf  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x0723  */
    /* JADX WARN: Removed duplicated region for block: B:500:0x0731  */
    /* JADX WARN: Removed duplicated region for block: B:501:0x0748  */
    /* JADX WARN: Removed duplicated region for block: B:504:0x0779  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x077f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void b(com.taobao.alilive.aliliveframework.frame.a r27, android.app.Activity r28, com.taobao.taolive.sdk.model.common.LiveItem r29, java.lang.String r30, java.util.HashMap<java.lang.String, java.lang.String> r31) {
        /*
            Method dump skipped, instructions count: 1925
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.taolive.adapterimpl.nav.b.b(com.taobao.alilive.aliliveframework.frame.a, android.app.Activity, com.taobao.taolive.sdk.model.common.LiveItem, java.lang.String, java.util.HashMap):void");
    }

    private void a(com.taobao.alilive.aliliveframework.frame.a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc30e1e7", new Object[]{this, aVar, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            if (str.startsWith(ado.URL_SEPARATOR)) {
                str = com.taobao.vessel.utils.b.HTTPS_SCHEMA + str;
            }
            Uri parse = Uri.parse(str);
            if (parse == null) {
                return;
            }
            String queryParameter = parse.getQueryParameter("insideDetail");
            if (TextUtils.isEmpty(queryParameter)) {
                queryParameter = String.valueOf(false);
            }
            if (aVar != null) {
                aVar.d(queryParameter);
            }
            m.e("TaoLiveActionUtils", "跳转商详 insideDetailStr:" + queryParameter);
        }
    }

    private static void a(Activity activity, com.taobao.alilive.aliliveframework.frame.a aVar, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a815f74e", new Object[]{activity, aVar, str, new Integer(i)});
            return;
        }
        Fragment fragment = null;
        if (aVar != null) {
            fragment = a(aVar);
        }
        if (fragment != null) {
            Nav.from(activity).withFragment(fragment).forResult(i).toUri(str);
        } else {
            Nav.from(activity).forResult(i).toUri(str);
        }
    }

    private static Fragment a(com.taobao.alilive.aliliveframework.frame.a aVar) {
        pkg pkgVar;
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("5fab4abf", new Object[]{aVar});
        }
        if (!(aVar instanceof e)) {
            return null;
        }
        e eVar = (e) aVar;
        if (eVar.o() != null && (pkgVar = eVar.o().taoliveOpenContext) != null && pkgVar.f != null && (obj = pkgVar.f.get("goDetailFragment")) != null) {
            return (Fragment) obj;
        }
        return null;
    }

    public void a(ContentBusinessModel contentBusinessModel, com.alibaba.fastjson.JSONObject jSONObject, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("327d0e03", new Object[]{this, contentBusinessModel, jSONObject, map});
            return;
        }
        if (n.a() != null && !TextUtils.isEmpty(jSONObject.getString(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID)) && n.b(jSONObject.getString(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID))) {
            map.put("liveToken", n.a().j());
        }
        if (contentBusinessModel.sourceType == null) {
            return;
        }
        map.put("sourceType", contentBusinessModel.sourceType);
    }

    private void a(com.alibaba.fastjson.JSONObject jSONObject, ContentBusinessModel contentBusinessModel, VideoInfo videoInfo) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f53ab67f", new Object[]{this, jSONObject, contentBusinessModel, videoInfo});
        } else if (videoInfo != null && videoInfo.tcpContext != null && videoInfo.tcpContext.size() > 0 && !TextUtils.isEmpty(jSONObject.getString(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID)) && jSONObject.getString(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID).equals(videoInfo.liveId)) {
            for (String str : videoInfo.tcpContext.keySet()) {
                String valueOf = String.valueOf(str);
                contentBusinessModel.context.put(valueOf, videoInfo.tcpContext.get(valueOf));
            }
        }
    }

    private void a(com.taobao.alilive.aliliveframework.frame.a aVar, LiveItem liveItem, ContentBusinessModel contentBusinessModel, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf1c7a08", new Object[]{this, aVar, liveItem, contentBusinessModel, str});
            return;
        }
        a(aVar, contentBusinessModel, liveItem);
        contentBusinessModel.dataAttributes = com.alilive.adapter.business.a.a(aVar, contentBusinessModel.dataAttributes, str);
        a(aVar, liveItem, contentBusinessModel);
    }

    private void a(com.taobao.alilive.aliliveframework.frame.a aVar, LiveItem liveItem, ContentBusinessModel contentBusinessModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("951d83be", new Object[]{this, aVar, liveItem, contentBusinessModel});
        } else if (contentBusinessModel == null || contentBusinessModel.dataAttributes == null || aVar == null || aVar.z() == null || aVar.z().a("showHotAtmosphere", (Class<Object>) Boolean.class) == null) {
        } else {
            try {
                if (!((Boolean) aVar.z().a("showHotAtmosphere", (Class<Object>) Boolean.class)).booleanValue() || liveItem == null) {
                    return;
                }
                if (!"card_itm".equals(liveItem.cpsClickPos) && !"card_buy".equals(liveItem.cpsClickPos)) {
                    return;
                }
                contentBusinessModel.dataAttributes.put("item_atmospheretype", "1");
            } catch (Throwable unused) {
            }
        }
    }

    private void a(com.taobao.alilive.aliliveframework.frame.a aVar, ContentBusinessModel contentBusinessModel, LiveItem liveItem) {
        com.alibaba.fastjson.JSONObject jSONObject;
        com.alibaba.fastjson.JSONObject b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5512b7e", new Object[]{this, aVar, contentBusinessModel, liveItem});
        } else if (contentBusinessModel != null && liveItem != null) {
            if (contentBusinessModel.dataAttributes == null) {
                contentBusinessModel.dataAttributes = new JSONObject();
            }
            try {
                String str = "1";
                if (liveItem.itemExtData != null) {
                    List asList = Arrays.asList(psm.m().split(","));
                    com.alibaba.fastjson.JSONObject jSONObject2 = liveItem.itemExtData.getJSONObject("itemListTrackData");
                    if (jSONObject2 != null) {
                        for (String str2 : jSONObject2.keySet()) {
                            if (asList.contains(str2)) {
                                if (TextUtils.equals(str2, "isStressShow") && aVar != null) {
                                    jSONObject2.put(str2, (Object) (aVar.F ? "N" : "Y"));
                                }
                                contentBusinessModel.dataAttributes.put(str2, jSONObject2.get(str2));
                            }
                        }
                        JSONArray jSONArray = jSONObject2.getJSONArray("liveItemTags");
                        if (jSONArray != null && !jSONArray.isEmpty()) {
                            for (int i = 0; i < jSONArray.size(); i++) {
                                if (asList.contains(jSONArray.getString(i))) {
                                    contentBusinessModel.dataAttributes.put(jSONArray.getString(i), str);
                                }
                            }
                        }
                    }
                    if (liveItem.itemExtData.getJSONObject("giftActivityInfo") != null) {
                        contentBusinessModel.dataAttributes.put("is_bogo", str);
                    }
                }
                if (liveItem.extendVal != null && !TextUtils.isEmpty(liveItem.extendVal.secKillInfo) && (b = pqj.b(liveItem.extendVal.secKillInfo)) != null) {
                    contentBusinessModel.dataAttributes.put("activityType", b.getString("activityType"));
                }
                if (liveItem.liveItemStatusData != null) {
                    JSONObject jSONObject3 = contentBusinessModel.dataAttributes;
                    if (!liveItem.liveItemStatusData.getBooleanValue("isSpeaking")) {
                        str = "0";
                    }
                    jSONObject3.put("if_explaining", str);
                }
                if (liveItem.nativeConfigInfos != null) {
                    contentBusinessModel.dataAttributes.put("entry_clkPos", liveItem.nativeConfigInfos.getString("entry_clkPos"));
                }
                if (liveItem.picTopLabels == null || liveItem.picTopLabels.size() <= 0 || (jSONObject = liveItem.picTopLabels.getJSONObject(0)) == null) {
                    return;
                }
                contentBusinessModel.dataAttributes.put("picTopLabel", jSONObject.getString("labelType"));
            } catch (JSONException e) {
                pmd.a().m().a("addSabAtmosphereParamsToDataAttributes", e.getMessage());
            }
        }
    }

    private String a(String str) {
        URI create;
        String query;
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        try {
            create = URI.create(str);
        } catch (Exception unused) {
        }
        if (create == null || (query = create.getQuery()) == null) {
            return null;
        }
        String[] split2 = query.split("&");
        for (int i = 0; i < split2.length; i++) {
            if (split2[i].startsWith(ag.ARG_PG1_STEKC)) {
                String str2 = split2[i];
                if (!TextUtils.isEmpty(str2) && (split = str2.split("=")) != null && split.length == 2) {
                    return split[1];
                }
                return null;
            }
        }
        return null;
    }

    public static String a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("457cf91a", new Object[]{str, str2, str3});
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return str;
        }
        int indexOf = str.indexOf(str2 + "=");
        if (indexOf == -1) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str.substring(0, indexOf));
        sb.append(str2 + "=");
        sb.append(str3);
        int indexOf2 = str.indexOf("&", indexOf);
        if (indexOf2 != -1) {
            sb.append(str.substring(indexOf2));
        }
        return sb.toString();
    }

    @Override // tb.cgu
    public void a(com.taobao.alilive.aliliveframework.frame.a aVar, Activity activity, LiveItem liveItem, int i, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f129399a", new Object[]{this, aVar, activity, liveItem, new Integer(i), hashMap});
        } else {
            b(aVar, activity, liveItem, i, hashMap);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(53:38|(5:40|(1:42)(1:234)|43|(1:45)(1:233)|46)(1:235)|47|(2:49|(49:63|64|(1:66)|67|68|69|(1:71)|72|(3:74|(2:77|75)|78)|79|(5:81|82|83|(3:85|(3:88|89|86)|90)|92)|184|185|186|187|188|189|190|(1:192)|193|(1:195)(1:221)|196|(1:198)|199|(10:201|(1:203)(1:219)|204|205|206|207|208|209|210|(1:212))(1:220)|96|(2:101|(2:105|(1:107)(1:108)))|109|(1:111)(1:183)|(4:113|(1:115)|116|(1:118)(1:119))|120|121|(5:172|173|174|175|176)(1:123)|(1:125)|126|(1:128)|129|(1:131)|132|(2:134|(1:136))|137|(1:139)(1:171)|140|141|(4:143|144|145|(1:155))|163|(1:165)|166|158))(1:232)|231|64|(0)|67|68|69|(0)|72|(0)|79|(0)|184|185|186|187|188|189|190|(0)|193|(0)(0)|196|(0)|199|(0)(0)|96|(3:99|101|(3:103|105|(0)(0)))|109|(0)(0)|(0)|120|121|(0)(0)|(0)|126|(0)|129|(0)|132|(0)|137|(0)(0)|140|141|(0)|163|(0)|166|158) */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x0406, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x0407, code lost:
        r16 = "sourceType";
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x040a, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x040c, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x040d, code lost:
        r4 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x040f, code lost:
        r23 = "false";
        r16 = "sourceType";
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x0413, code lost:
        r12 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:485:0x0644, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:486:0x0645, code lost:
        r2 = r31;
        r5 = r16;
     */
    /* JADX WARN: Removed duplicated region for block: B:345:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0251 A[Catch: JSONException -> 0x040c, TryCatch #7 {JSONException -> 0x040c, blocks: (B:347:0x0244, B:349:0x0251, B:350:0x0259, B:352:0x0263, B:353:0x026b, B:355:0x0271, B:356:0x028b, B:358:0x0297, B:369:0x02db), top: B:525:0x0244 }] */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0263 A[Catch: JSONException -> 0x040c, TryCatch #7 {JSONException -> 0x040c, blocks: (B:347:0x0244, B:349:0x0251, B:350:0x0259, B:352:0x0263, B:353:0x026b, B:355:0x0271, B:356:0x028b, B:358:0x0297, B:369:0x02db), top: B:525:0x0244 }] */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0297 A[Catch: JSONException -> 0x040c, TRY_LEAVE, TryCatch #7 {JSONException -> 0x040c, blocks: (B:347:0x0244, B:349:0x0251, B:350:0x0259, B:352:0x0263, B:353:0x026b, B:355:0x0271, B:356:0x028b, B:358:0x0297, B:369:0x02db), top: B:525:0x0244 }] */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0317 A[Catch: JSONException -> 0x0406, TryCatch #2 {JSONException -> 0x0406, blocks: (B:373:0x02f2, B:375:0x0317, B:376:0x0339, B:378:0x0371, B:380:0x0378, B:382:0x0382, B:383:0x038c, B:385:0x0392, B:389:0x03a5), top: B:515:0x02f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0371 A[Catch: JSONException -> 0x0406, TryCatch #2 {JSONException -> 0x0406, blocks: (B:373:0x02f2, B:375:0x0317, B:376:0x0339, B:378:0x0371, B:380:0x0378, B:382:0x0382, B:383:0x038c, B:385:0x0392, B:389:0x03a5), top: B:515:0x02f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0382 A[Catch: JSONException -> 0x0406, TryCatch #2 {JSONException -> 0x0406, blocks: (B:373:0x02f2, B:375:0x0317, B:376:0x0339, B:378:0x0371, B:380:0x0378, B:382:0x0382, B:383:0x038c, B:385:0x0392, B:389:0x03a5), top: B:515:0x02f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0392 A[Catch: JSONException -> 0x0406, TryCatch #2 {JSONException -> 0x0406, blocks: (B:373:0x02f2, B:375:0x0317, B:376:0x0339, B:378:0x0371, B:380:0x0378, B:382:0x0382, B:383:0x038c, B:385:0x0392, B:389:0x03a5), top: B:515:0x02f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:401:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0439 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:422:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x055a  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x055e A[Catch: Exception -> 0x0640, TryCatch #0 {Exception -> 0x0640, blocks: (B:440:0x0551, B:445:0x055e, B:446:0x056a, B:448:0x0578, B:449:0x0586, B:451:0x058c, B:452:0x059a, B:454:0x05a9, B:456:0x05cb, B:457:0x05d8, B:461:0x05e7), top: B:511:0x0551 }] */
    /* JADX WARN: Removed duplicated region for block: B:448:0x0578 A[Catch: Exception -> 0x0640, TryCatch #0 {Exception -> 0x0640, blocks: (B:440:0x0551, B:445:0x055e, B:446:0x056a, B:448:0x0578, B:449:0x0586, B:451:0x058c, B:452:0x059a, B:454:0x05a9, B:456:0x05cb, B:457:0x05d8, B:461:0x05e7), top: B:511:0x0551 }] */
    /* JADX WARN: Removed duplicated region for block: B:451:0x058c A[Catch: Exception -> 0x0640, TryCatch #0 {Exception -> 0x0640, blocks: (B:440:0x0551, B:445:0x055e, B:446:0x056a, B:448:0x0578, B:449:0x0586, B:451:0x058c, B:452:0x059a, B:454:0x05a9, B:456:0x05cb, B:457:0x05d8, B:461:0x05e7), top: B:511:0x0551 }] */
    /* JADX WARN: Removed duplicated region for block: B:454:0x05a9 A[Catch: Exception -> 0x0640, TryCatch #0 {Exception -> 0x0640, blocks: (B:440:0x0551, B:445:0x055e, B:446:0x056a, B:448:0x0578, B:449:0x0586, B:451:0x058c, B:452:0x059a, B:454:0x05a9, B:456:0x05cb, B:457:0x05d8, B:461:0x05e7), top: B:511:0x0551 }] */
    /* JADX WARN: Removed duplicated region for block: B:459:0x05e1  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x05e4  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x05ee  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x0621 A[Catch: Exception -> 0x063e, TryCatch #1 {Exception -> 0x063e, blocks: (B:465:0x05f0, B:467:0x05f6, B:469:0x05fc, B:471:0x0608, B:473:0x0610, B:475:0x0616, B:476:0x0619, B:478:0x0621, B:479:0x0624), top: B:513:0x05f0 }] */
    /* JADX WARN: Removed duplicated region for block: B:508:0x06b6  */
    /* JADX WARN: Removed duplicated region for block: B:523:0x054d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(com.taobao.alilive.aliliveframework.frame.a r27, android.app.Activity r28, final com.taobao.taolive.sdk.model.common.LiveItem r29, int r30, java.util.HashMap<java.lang.String, java.lang.String> r31) {
        /*
            Method dump skipped, instructions count: 1741
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.taolive.adapterimpl.nav.b.b(com.taobao.alilive.aliliveframework.frame.a, android.app.Activity, com.taobao.taolive.sdk.model.common.LiveItem, int, java.util.HashMap):void");
    }

    public com.alibaba.fastjson.JSONObject a(com.taobao.alilive.aliliveframework.frame.a aVar, LiveItem liveItem, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.fastjson.JSONObject) ipChange.ipc$dispatch("ccf33eed", new Object[]{this, aVar, liveItem, map});
        }
        com.alibaba.fastjson.JSONObject tradeParamsJSON = liveItem.extendVal.getTradeParamsJSON();
        try {
            tradeParamsJSON = JSON.parseObject(liveItem.extendVal.tradeParams);
            if (map != null) {
                map.put("tradeParams", JSON.toJSONString(tradeParamsJSON));
            }
            a(poy.u(aVar), tradeParamsJSON, liveItem);
            if (map != null) {
                map.put("useSignTradeParams", JSON.toJSONString(tradeParamsJSON));
            }
        } catch (Exception e) {
            String str = "tradeParams parseObject error:" + e.getMessage();
        }
        return tradeParamsJSON;
    }

    private void a(ContentBusinessModel contentBusinessModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("590e7f6e", new Object[]{this, contentBusinessModel});
        } else if (contentBusinessModel == null) {
        } else {
            ddw.a().a("com.taobao.taolive.room.good_click", new String[]{contentBusinessModel.contentId, contentBusinessModel.itemId});
        }
    }

    @Override // tb.cgu
    public void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{this, context, str});
        } else {
            Nav.from(context).toUri(str);
        }
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "enableTCPParams", "false"));
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "enablePVIDParams", "false"));
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "enableSpmLiveSourceParams", "true"));
    }

    public String a(Context context, String str, LiveItem liveItem) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f498887b", new Object[]{this, context, str, liveItem});
        }
        com.alibaba.fastjson.JSONObject jSONObject = liveItem.itemExtData;
        if (jSONObject != null && (jSONObject.get("enableDrawer") instanceof String)) {
            try {
                if (!Boolean.parseBoolean(jSONObject.getString("enableDrawer"))) {
                    return str;
                }
            } catch (Throwable th) {
                m.e("GoodListEnableInside", th.toString());
            }
        }
        if (TextUtils.isEmpty(str) || liveItem == null || liveItem.itemConfigInfo == null) {
            return str;
        }
        String b = b(liveItem);
        if (!psm.t()) {
            return str;
        }
        ppv v = pmd.a().v();
        if (v != null && v.d() == 2 && psm.v()) {
            paq.a("Button-Inside_Fail", b, "1001", str);
            return str;
        } else if (y.b(context) || y.c(context)) {
            q.a("TaoLiveActionUtils", "replaceInsideDetailUrl | pad or fold device.");
            return str;
        } else if (!"hold".equalsIgnoreCase(liveItem.itemConfigInfo.getString("itemSourceType")) && !psm.u()) {
            return str;
        } else {
            if (!b(context, liveItem.itemConfigInfo.getString("insideDetail"))) {
                paq.a("Button-Inside_Fail", b, "1003", str);
                return str + "&insideDetail=false";
            }
            for (String str2 : psm.s().split(SymbolExpUtil.SYMBOL_VERTICALBAR)) {
                if (str.contains(str2)) {
                    String valueOf = String.valueOf(liveItem.itemId);
                    if (com.taobao.taolive.sdk.goodlist.n.b(valueOf)) {
                        paq.a(valueOf, b);
                    }
                    paq.a("Button-Inside_Suc", b, "", str);
                    return str.replace(str2, "h5.m.taobao.com/awp/core/detail/inside.htm") + "&insideDetail=true&from=" + b + "&insideDetailType=" + b + "&stdPopId=" + String.valueOf(context.hashCode());
                }
            }
            paq.a("Button-Inside_Fail", b, "1004", str);
            return str;
        }
    }

    private boolean b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9b80d80d", new Object[]{this, context, str})).booleanValue();
        }
        if ("true".equals(str)) {
            return true;
        }
        if ((context instanceof dlx) && (context instanceof fmg)) {
            return Boolean.parseBoolean(pmd.a().d().a("tblive", "enableInsideDetailAnyway", "true"));
        }
        return false;
    }

    private String b(LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("60e07edc", new Object[]{this, liveItem}) : (liveItem.itemConfigInfo == null || !liveItem.itemConfigInfo.containsKey("itemSourceType")) ? "live" : liveItem.itemConfigInfo.getString("itemSourceType");
    }

    private void a(LiveItem liveItem, ContentBusinessModel contentBusinessModel, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97ebc71c", new Object[]{this, liveItem, contentBusinessModel, map});
        } else if (liveItem == null || contentBusinessModel == null) {
        } else {
            if (!TextUtils.isEmpty(liveItem.cpsClickPos)) {
                try {
                    if (contentBusinessModel.context == null) {
                        contentBusinessModel.context = new JSONObject();
                    }
                    contentBusinessModel.context.putOpt("clickPos", liveItem.cpsClickPos);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            } else if (!TextUtils.isEmpty(map.get("highlight_card_clickPos")) && psm.n()) {
                try {
                    if (contentBusinessModel.context == null) {
                        contentBusinessModel.context = new JSONObject();
                    }
                    contentBusinessModel.context.putOpt("clickPos", map.get("highlight_card_clickPos"));
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
            VideoInfo u = poy.u(n.a());
            if (u == null) {
                return;
            }
            if (com.taobao.taolive.sdk.goodlist.d.a(u.itemTransferInfo)) {
                contentBusinessModel.actionSource = com.taobao.taolive.sdk.goodlist.c.b(liveItem) ? "pcg_recommand" : "pcg_self";
            }
            if (map == null) {
                return;
            }
            map.put("actionSource", contentBusinessModel.actionSource);
        }
    }

    private void a(VideoInfo videoInfo, com.alibaba.fastjson.JSONObject jSONObject, LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8374e106", new Object[]{this, videoInfo, jSONObject, liveItem});
        } else if (jSONObject == null || !this.d) {
            m.e("TaoLiveActionUtils", "mEnableModifyNewtonsParams  is false.");
        } else {
            String string = jSONObject.getString("newtonParams");
            if (TextUtils.isEmpty(string)) {
                tby.a("", tfu.ADD_CART, liveItem);
                m.e("TaoLiveActionUtils", "appendSignNewtonParams tradeParams newtonParams is null.");
                return;
            }
            StringBuilder sb = new StringBuilder(a(string, liveItem));
            a(videoInfo, sb);
            jSONObject.remove("newtonParams");
            jSONObject.put("newtonParams", (Object) sb.toString());
        }
    }

    public String a(VideoInfo videoInfo, String str, LiveItem liveItem) {
        String sb;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4397a616", new Object[]{this, videoInfo, str, liveItem});
        }
        if (!this.d) {
            m.e("TaoLiveActionUtils", "mEnableModifyNewtonsParams  is false.");
            return str;
        } else if (TextUtils.isEmpty(str) || liveItem == null) {
            return str;
        } else {
            String b = tby.b(str);
            if (TextUtils.isEmpty(b)) {
                tby.a(str, "detail", liveItem);
                m.e("TaoLiveActionUtils", "appendSignNewtonParams url newtonParams is null.");
                return str;
            }
            String str2 = "?newtonParams=" + b;
            String decode = Uri.decode(b);
            StringBuilder sb2 = new StringBuilder(a(decode, liveItem));
            a(videoInfo, sb2);
            if (TextUtils.equals(decode, sb2.toString())) {
                m.e("TaoLiveActionUtils", "uSignNewtonParamsStr  is unchanging.");
                return str;
            }
            return tby.a(str, "newtonParams", (str.contains(str2) ? "?" : "&") + "newtonParams=" + Uri.encode(sb));
        }
    }

    private String a(String str, LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2e05d173", new Object[]{this, str, liveItem});
        }
        if (!this.b || str.contains("@@uSig@") || str.startsWith("uSig@")) {
            return str;
        }
        this.e = true;
        String a2 = tby.a(Login.getUserId() + "_" + liveItem.liveId + "_" + liveItem.itemId + "_" + this.f21395a);
        return str + "@@uSig@" + a2;
    }

    private void a(VideoInfo videoInfo, StringBuilder sb) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ee90a66", new Object[]{this, videoInfo, sb});
        } else if (videoInfo != null && videoInfo.newtonParamsMap != null && videoInfo.newtonParamsMap.keySet().size() > 0 && this.c && sb != null) {
            for (String str : videoInfo.newtonParamsMap.keySet()) {
                String str2 = "@@" + str + "@";
                String str3 = str + "@";
                String sb2 = sb.toString();
                if (!sb2.contains(str2) && !sb2.startsWith(str3)) {
                    String str4 = videoInfo.newtonParamsMap.get(str);
                    if (!TextUtils.isEmpty(str4)) {
                        sb.append(str2);
                        sb.append(str4);
                    }
                }
            }
        }
    }
}
