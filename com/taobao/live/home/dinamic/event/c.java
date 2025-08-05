package com.taobao.live.home.dinamic.event;

import android.app.Activity;
import android.net.Uri;
import android.os.Build;
import android.os.Trace;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.ADaemon;
import com.taobao.alimama.AlimamaAdvertising;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.h;
import com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewFrame;
import com.taobao.android.livehome.plugin.atype.flexalocal.utils.d;
import com.taobao.android.task.Coordinator;
import com.taobao.taobao.R;
import com.taobao.taolive.room.utils.aw;
import com.taobao.taolive.sdk.utils.u;
import com.taobao.taolive.uikit.api.TBLiveOpenCardView;
import com.ut.mini.UTAnalytics;
import java.util.ArrayList;
import java.util.HashMap;
import tb.ado;
import tb.mfg;
import tb.mfj;
import tb.mfl;
import tb.mfm;
import tb.nog;
import tb.pqt;
import tb.prb;
import tb.pro;
import tb.psb;
import tb.sdt;

/* loaded from: classes7.dex */
public class c extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_LTAP = 35850307557L;
    public static final String EVENT_TAP_EVENT_HANDLER = "com.taobao.taolive.tap.event.handler";
    public static final String EVENT_TAP_EVENT_UT_COMMIT = "com.taobao.taolive.livehome.commit.ltap";

    /* renamed from: a  reason: collision with root package name */
    private static final String f17741a = "c";

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void a(c cVar, String str, JSONObject jSONObject, JSONObject jSONObject2, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5281b70f", new Object[]{cVar, str, jSONObject, jSONObject2, objArr, dXRuntimeContext});
        } else {
            cVar.b(str, jSONObject, jSONObject2, objArr, dXRuntimeContext);
        }
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
        String str;
        String str2;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (objArr == null || objArr.length <= 1) {
        } else {
            if (dXRuntimeContext.m() == null) {
                mfj.c(f17741a, "context is null.");
                return;
            }
            Trace.beginSection("TLiveFFTrace -- parse params");
            JSONObject jSONObject3 = (JSONObject) objArr[0];
            JSONObject jSONObject4 = (JSONObject) objArr[1];
            if (jSONObject3 == null) {
                mfj.c(f17741a, "args[0] dataInfo is null.");
                return;
            }
            if (mfm.w()) {
                ADaemon.boostCpu(ADaemon.BOOST_LENGTH_LONG);
                mfj.c(f17741a, "enableCPUAdeMonBootsCpu true");
            }
            if (jSONObject4 != null) {
                String string = jSONObject4.getString("trackInfo");
                JSONObject jSONObject5 = jSONObject4.getJSONObject("liveInfo");
                JSONObject jSONObject6 = jSONObject4.getJSONObject(d.CLICK_MAIDIAN);
                if (jSONObject6 == null || jSONObject6.get("params") == null || pro.e(jSONObject6.getString("pageName"))) {
                    str2 = string;
                    jSONObject = jSONObject5;
                    jSONObject2 = jSONObject6;
                    str = "Page_TaobaoLive";
                } else {
                    str2 = string;
                    jSONObject = jSONObject5;
                    jSONObject2 = jSONObject6;
                    str = jSONObject6.getString("pageName");
                }
            } else {
                str = "Page_TaobaoLive";
                str2 = null;
                jSONObject = null;
                jSONObject2 = null;
            }
            Trace.endSection();
            a(str, jSONObject3, jSONObject4, objArr, dXRuntimeContext);
            String string2 = jSONObject3.getString("jumpUrl");
            if (!pro.e(string2)) {
                Trace.beginSection("TLiveFFTrace build jump url");
                if (u.w() && string2.startsWith(ado.URL_SEPARATOR)) {
                    string2 = com.taobao.vessel.utils.b.HTTPS_SCHEMA + string2;
                }
                mfg.a().a(EVENT_TAP_EVENT_UT_COMMIT, jSONObject3);
                if (!pro.e(str2)) {
                    String encode = Uri.encode(str2);
                    if (!string2.contains("trackInfo")) {
                        if (string2.contains("?")) {
                            string2 = string2 + "&trackInfo=" + encode;
                        } else {
                            string2 = string2 + "?trackInfo=" + encode;
                        }
                    }
                }
                if (mfm.v()) {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (!string2.contains("enterClickTs")) {
                        if (string2.contains("?")) {
                            string2 = string2 + "&enterClickTs=" + currentTimeMillis;
                        } else {
                            string2 = string2 + "?enterClickTs=" + currentTimeMillis;
                        }
                    }
                }
                Trace.endSection();
                if (jSONObject != null) {
                    Trace.beginSection("TLiveFFTrace - liveInfo not null");
                    if (u.w() && (dXRuntimeContext.m() instanceof Activity) && sdt.f()) {
                        a((Activity) dXRuntimeContext.m());
                    }
                    if (jSONObject2 != null) {
                        String string3 = jSONObject2.getString(nog.PRD_P4P_URL);
                        if (!pro.e(string3)) {
                            String handleAdUrlForClickid = AlimamaAdvertising.instance().handleAdUrlForClickid(string3);
                            if (!pro.e(handleAdUrlForClickid)) {
                                if (string2.contains("?")) {
                                    string2 = string2 + "&clickid=" + handleAdUrlForClickid;
                                } else {
                                    string2 = string2 + "?clickid=" + handleAdUrlForClickid;
                                }
                            }
                        }
                    }
                    String str3 = string2;
                    Trace.endSection();
                    String string4 = jSONObject.getString(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID);
                    Trace.beginSection("TLiveFFTrace - token reuse");
                    if (!pro.e(string4)) {
                        mfg.a().a("com.taobao.live.home.card.onclick.ltap", string4);
                    }
                    Trace.endSection();
                    String string5 = jSONObject.getString(aw.PARAM_COVER_IMG);
                    boolean d = pro.d(jSONObject.getString("landScape"));
                    JSONObject jSONObject7 = (1 != jSONObject.getIntValue("roomStatus") || !jSONObject.containsKey("queryParams")) ? null : jSONObject.getJSONObject("queryParams");
                    JSONObject jSONObject8 = jSONObject.containsKey("adTransParams") ? jSONObject.getJSONObject("adTransParams") : null;
                    Trace.beginSection("TLiveFFTrace - destroy allplayer");
                    psb.a().a((Object) com.taobao.live.home.c.PLAY_PAGEID, true);
                    Trace.endSection();
                    Trace.endSection();
                    Trace.beginSection("TLiveFFTrace - navi to live watch");
                    prb.a(dXRuntimeContext.m(), str3, null, string5, jSONObject7, d, null, jSONObject8, true, 240);
                    Trace.endSection();
                } else {
                    Trace.beginSection("TLiveFFTrace - liveInfo null. navi to url");
                    if ("Page_TaobaoLive".equals(str)) {
                        mfl.a(dXRuntimeContext.m(), string2, 240);
                    } else {
                        mfl.a(dXRuntimeContext.m(), string2);
                    }
                    Trace.endSection();
                }
                Trace.beginSection("TLiveFFTrace - update next page UT");
                String string6 = jSONObject3.getString(aw.PARAM_TRACK_LIVEOPRT_ID);
                HashMap hashMap = new HashMap();
                if (!pro.e(str2)) {
                    hashMap.put("trackInfo", str2);
                }
                if (!pro.e(string6)) {
                    hashMap.put(aw.PARAM_TRACK_LIVEOPRT_ID, string6);
                }
                UTAnalytics.getInstance().getDefaultTracker().updateNextPageUtparam(JSONObject.toJSONString(hashMap));
                Trace.endSection();
                return;
            }
            mfj.c(f17741a, "jump url is empty.");
        }
    }

    private void a(final String str, final JSONObject jSONObject, final JSONObject jSONObject2, final Object[] objArr, final DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4be4ad70", new Object[]{this, str, jSONObject, jSONObject2, objArr, dXRuntimeContext});
        } else {
            Coordinator.execute(new Runnable() { // from class: com.taobao.live.home.dinamic.event.c.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        c.a(c.this, str, jSONObject, jSONObject2, objArr, dXRuntimeContext);
                    }
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void b(java.lang.String r5, com.alibaba.fastjson.JSONObject r6, com.alibaba.fastjson.JSONObject r7, java.lang.Object[] r8, com.taobao.android.dinamicx.DXRuntimeContext r9) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.live.home.dinamic.event.c.b(java.lang.String, com.alibaba.fastjson.JSONObject, com.alibaba.fastjson.JSONObject, java.lang.Object[], com.taobao.android.dinamicx.DXRuntimeContext):void");
    }

    private String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2}) : !pro.e(str) ? str : str2;
    }

    private static ArrayList<pqt> a(View view) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("d172ee44", new Object[]{view});
        }
        ArrayList<pqt> arrayList = new ArrayList<>();
        if (view != null) {
            if (view instanceof TBLiveOpenCardView) {
                arrayList.add((pqt) view);
            }
            if (view instanceof ViewGroup) {
                while (true) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    if (i >= viewGroup.getChildCount()) {
                        break;
                    }
                    ArrayList<pqt> a2 = a(viewGroup.getChildAt(i));
                    if (!a2.isEmpty()) {
                        arrayList.addAll(a2);
                    }
                    i++;
                }
            }
        }
        return arrayList;
    }

    private void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{this, activity});
            return;
        }
        View findViewById = activity.findViewById(R.id.live_fragment_vp);
        if (Build.VERSION.SDK_INT < 29 || !(findViewById instanceof ViewGroup)) {
            return;
        }
        ((ViewGroup) findViewById).suppressLayout(true);
    }
}
