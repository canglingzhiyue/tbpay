package com.taobao.alimama;

import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.click.applink.ApplinkClickBuilder;
import com.taobao.alimama.click.cpc.CpcClickBuilder;
import com.taobao.alimama.click.cpm.CpmClickBuilder;
import com.taobao.alimama.click.cps.CpsClickBuilder;
import com.taobao.alimama.click.extend.ExtendClickLink;
import com.taobao.alimama.click.extend.cpm.ExtendCpmClickBuilder;
import com.taobao.alimama.utils.UserTrackLogs;
import com.taobao.alimama.utils.e;
import com.taobao.munion.taosdk.CpcEventCommitter;
import com.taobao.munion.taosdk.CpmEventCommitter;
import com.taobao.orange.OrangeConfig;
import com.taobao.taolive.room.utils.ag;
import com.taobao.utils.Global;
import tb.ado;
import tb.kge;
import tb.kuh;

/* loaded from: classes4.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static volatile b f8410a;

        static {
            kge.a(-668227975);
            f8410a = new b();
        }
    }

    static {
        kge.a(1905860411);
    }

    public static b a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("449c6d7", new Object[0]) : a.f8410a;
    }

    public String a(String str) {
        Uri uri;
        String queryParameter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        Uri parse = Uri.parse(str);
        boolean isHierarchical = parse.isHierarchical();
        if (str.startsWith(ado.URL_SEPARATOR)) {
            parse = Uri.parse("http:" + str);
        }
        Uri uri2 = parse;
        try {
            if ("on".equals(OrangeConfig.getInstance().getConfig("alimama_ad", "tk_cps_param_switch", "on")) && uri2.isHierarchical() && (queryParameter = uri2.getQueryParameter("tk_cps_param")) != null) {
                AlimamaAdvertising.instance().parseTkCpsAdParameters(queryParameter);
            }
        } catch (Exception unused) {
        }
        String queryParameter2 = uri2.getQueryParameter(c.E_URL);
        String queryParameter3 = uri2.getQueryParameter("etype");
        if (!TextUtils.isEmpty(queryParameter2) && !TextUtils.isEmpty(queryParameter3)) {
            Uri parse2 = Uri.parse(queryParameter2);
            String queryParameter4 = (!com.taobao.alimama.utils.c.e() || !parse2.isHierarchical()) ? "" : parse2.getQueryParameter("eadt");
            try {
                String queryParameter5 = uri2.getQueryParameter("acttype");
                if (!TextUtils.isEmpty(queryParameter5) && parse2.isHierarchical()) {
                    queryParameter2 = parse2.buildUpon().appendQueryParameter("atype", queryParameter5).toString();
                    e.a("append_eurl_acttype", "eurl = " + queryParameter2 + ", url = " + str);
                }
            } catch (Exception e) {
                UserTrackLogs.trackAdLog("append_eurl_acttype", ag.ARG_TAOKE_ERROR + e.getMessage());
            }
            if ("1".equals(queryParameter3)) {
                if (com.taobao.alimama.utils.c.a()) {
                    uri2 = Uri.parse(new CpcClickBuilder(queryParameter2).withArgAUrl(uri2.toString()).withArgEadt(queryParameter4).withArgIsOpenPage(true).commitAndAppendClickid(uri2.toString()));
                } else if (com.taobao.alimama.utils.c.b()) {
                    String uri3 = uri2.toString();
                    uri2 = new CpcEventCommitter(Global.getApplication(), true).setEadt(queryParameter4).commitEvent(queryParameter2, uri2);
                    try {
                        new CpcClickBuilder(queryParameter2).withArgAUrl(uri3).withArgEadt(queryParameter4).withArgIsOpenPage(true).withArg("presetClickId", uri2.getQueryParameter("clickid")).commit();
                    } catch (Exception e2) {
                        UserTrackLogs.trackExceptionLog(e2);
                    }
                } else {
                    uri2 = new CpcEventCommitter(Global.getApplication(), true).setEadt(queryParameter4).commitEvent(queryParameter2, uri2);
                }
            } else if ("2".equals(queryParameter3)) {
                if (!TextUtils.equals("on", OrangeConfig.getInstance().getConfig("alimama_ad", "tk_cps_url_track_switch", "on"))) {
                    return str;
                }
                uri2 = new CpsClickBuilder().commitAndAppendClickid(queryParameter2, uri2);
            } else if ("3".equals(queryParameter3)) {
                if (com.taobao.alimama.utils.c.c()) {
                    uri2 = Uri.parse(new CpmClickBuilder(queryParameter2).withArgAUrl(uri2.toString()).withArgEadt(queryParameter4).withArgIsOpenPage(true).commitAndAppendClickid(uri2.toString()));
                } else if (com.taobao.alimama.utils.c.d()) {
                    String uri4 = uri2.toString();
                    uri2 = new CpmEventCommitter(Global.getApplication(), true).setEadt(queryParameter4).commitEvent(queryParameter2, uri2);
                    try {
                        new CpmClickBuilder(queryParameter2).withArgAUrl(uri4).withArgEadt(queryParameter4).withArgIsOpenPage(true).withArg("presetClickId", uri2.getQueryParameter("clickid")).commit();
                    } catch (Exception e3) {
                        UserTrackLogs.trackExceptionLog(e3);
                    }
                } else {
                    uri2 = new CpmEventCommitter(Global.getApplication(), true).setEadt(queryParameter4).commitEvent(queryParameter2, uri2);
                }
            } else {
                ExtendClickLink a2 = com.taobao.alimama.click.extend.a.a().a(queryParameter3);
                if (a2 != null && a2.c() == ExtendClickLink.CustomClickType.CPM) {
                    a2.a(queryParameter2);
                    uri2 = Uri.parse(new ExtendCpmClickBuilder(queryParameter2).withArgAUrl(uri2.toString()).withArgEadt(queryParameter4).withArgIsOpenPage(true).withExtendLink(a2).commitAndAppendClickid(uri2.toString()));
                }
            }
            uri = a(uri2);
        } else {
            if (com.taobao.alimama.utils.c.a("externalFlowIntercept")) {
                String queryParameter6 = uri2.getQueryParameter(kuh.ALI_TRACK_ID);
                String queryParameter7 = uri2.getQueryParameter("clickid");
                if (!TextUtils.isEmpty(queryParameter6) && TextUtils.isEmpty(queryParameter7)) {
                    uri = Uri.parse(new ApplinkClickBuilder(uri2.toString()).withArgIsOpenPage(true).commitAndAppendClickid(uri2.toString()));
                }
            }
            uri = null;
        }
        if (uri == null) {
            return str;
        }
        if (!isHierarchical) {
            Uri.Builder buildUpon = uri.buildUpon();
            buildUpon.scheme(null);
            uri = buildUpon.build();
        }
        return uri.toString();
    }

    private Uri a(Uri uri) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("6832b116", new Object[]{this, uri});
        }
        if (uri == null) {
            return null;
        }
        String encodedQuery = uri.getEncodedQuery();
        if (encodedQuery == null || encodedQuery.trim().length() == 0) {
            return uri;
        }
        StringBuilder sb = new StringBuilder();
        for (String str : encodedQuery.split("&")) {
            if (str != null && !str.startsWith(c.E_URL) && !str.startsWith("etype")) {
                sb.append(str);
                sb.append("&");
            }
        }
        String sb2 = sb.toString();
        if (sb2.length() > 0 && sb2.endsWith("&")) {
            sb2 = sb2.substring(0, sb2.length() - 1);
        }
        Uri.Builder buildUpon = uri.buildUpon();
        if (sb2.length() > 0) {
            buildUpon.encodedQuery(sb2 + "&ad_type=1.0");
        }
        return buildUpon.build();
    }
}
