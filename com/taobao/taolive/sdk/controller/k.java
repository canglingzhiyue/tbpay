package com.taobao.taolive.sdk.controller;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.utils.aw;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.utils.u;
import tb.kge;
import tb.pmd;
import tb.pmf;
import tb.pqj;

/* loaded from: classes8.dex */
public class k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static int f21821a;
    public static int b;

    static {
        kge.a(103906041);
    }

    public static int a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{str})).intValue() : "shop".equals(str) ? 1 : 2;
    }

    public static String a(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bdff51db", new Object[]{videoInfo});
        }
        if (videoInfo == null || pmd.a().q() == null) {
            return "";
        }
        return com.taobao.orange.util.c.a(System.currentTimeMillis() + pmd.a().q().a() + videoInfo.liveId);
    }

    public static String a(String str, Uri uri) {
        String[] split;
        JSONObject b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eb6f75eb", new Object[]{str, uri});
        }
        if (TextUtils.isEmpty(str)) {
            if (uri != null && "tpp_88".equals(uri.getQueryParameter("livesource")) && !TextUtils.isEmpty(uri.getQueryParameter(aw.PARAM_UT_PARAMS)) && (b2 = pqj.b(Uri.decode(uri.getQueryParameter(aw.PARAM_UT_PARAMS)))) != null && b2.getString(aw.PARAMS_LIVE_TRACKINFO) != null) {
                str = b2.getString(aw.PARAMS_LIVE_TRACKINFO);
            }
            if (TextUtils.isEmpty(str)) {
                return "";
            }
        }
        String decode = Uri.decode(str);
        return (TextUtils.isEmpty(decode) || (split = decode.split("_")) == null || split.length <= 0 || split[0] == null || split[0].length() >= 128) ? "" : split[0];
    }

    public static View a(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("9a97f025", new Object[]{context, new Integer(i)});
        }
        if (!(context instanceof Activity)) {
            return null;
        }
        return ((Activity) context).findViewById(i);
    }

    public static boolean a(int i) {
        JSONArray c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{new Integer(i)})).booleanValue();
        }
        String V = u.V();
        if (TextUtils.isEmpty(V) || (c = pqj.c(V)) == null) {
            return false;
        }
        return c.contains(Integer.valueOf(i));
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        boolean Y = u.Y();
        pmf t = pmd.a().t();
        return (!Y || t == null) ? Y : "true".equals(t.a("taolive", "displayMessageCard", "enable", "true"));
    }

    public static VideoInfo a(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VideoInfo) ipChange.ipc$dispatch("25fe729e", new Object[]{tBLiveDataModel});
        }
        if (tBLiveDataModel == null) {
            tBLiveDataModel = com.taobao.taolive.sdk.core.j.c(null);
        }
        if (tBLiveDataModel == null) {
            return null;
        }
        return tBLiveDataModel.mVideoInfo;
    }
}
