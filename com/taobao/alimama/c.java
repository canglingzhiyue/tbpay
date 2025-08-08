package com.taobao.alimama;

import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.click.cpc.CpcClickBuilder;
import com.taobao.alimama.click.cpm.CpmClickBuilder;
import com.taobao.alimama.click.cps.CpsClickBuilder;
import com.taobao.alimama.utils.UserTrackLogs;
import com.taobao.alimama.utils.e;
import com.taobao.munion.taosdk.CpcEventCommitter;
import com.taobao.munion.taosdk.CpmEventCommitter;
import com.taobao.taolive.room.utils.ag;
import com.taobao.utils.Global;
import java.util.ArrayList;
import tb.kge;

/* loaded from: classes4.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CLICK_ID = "clickid";
    public static final String E_TYPE = "etype";
    public static final String E_URL = "eurl";

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static volatile c f8411a;

        static {
            kge.a(-408146490);
            f8411a = new c();
        }
    }

    static {
        kge.a(-1947328952);
    }

    public static c a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("449c6f6", new Object[0]) : a.f8411a;
    }

    public String a(String str, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c22dfcae", new Object[]{this, str, new Boolean(z), new Boolean(z2)});
        }
        if (StringUtils.isEmpty(str)) {
            return str;
        }
        try {
            Uri parse = Uri.parse(str);
            String queryParameter = parse.getQueryParameter(E_URL);
            if (StringUtils.isEmpty(queryParameter)) {
                return str;
            }
            String queryParameter2 = parse.getQueryParameter("etype");
            Uri parse2 = Uri.parse(queryParameter);
            String str2 = "";
            if (com.taobao.alimama.utils.c.e() && parse2.isHierarchical()) {
                str2 = parse2.getQueryParameter("eadt");
            }
            try {
                String queryParameter3 = parse.getQueryParameter("acttype");
                if (!StringUtils.isEmpty(queryParameter3) && parse2.isHierarchical()) {
                    queryParameter = parse2.buildUpon().appendQueryParameter("atype", queryParameter3).toString();
                    e.a("append_eurl_acttype", "eurl = " + queryParameter + ", url = " + str);
                }
            } catch (Exception e) {
                UserTrackLogs.trackAdLog("append_eurl_acttype", ag.ARG_TAOKE_ERROR + e.getMessage());
            }
            Uri uri = null;
            if ("1".equals(queryParameter2)) {
                if (com.taobao.alimama.utils.c.a()) {
                    uri = Uri.parse(new CpcClickBuilder(queryParameter).withArgAUrl(str).withArgEadt(str2).withArgIsOpenPage(z).commitAndAppendClickid(str));
                } else {
                    uri = new CpcEventCommitter(Global.getApplication(), z).setEadt(str2).commitEvent(queryParameter, parse);
                }
            } else if ("2".equals(queryParameter2)) {
                uri = new CpsClickBuilder().commitAndAppendClickid(queryParameter, parse);
            } else if ("3".equals(queryParameter2)) {
                if (com.taobao.alimama.utils.c.c()) {
                    uri = Uri.parse(new CpmClickBuilder(queryParameter).withArgAUrl(str).withArgEadt(str2).withArgIsOpenPage(z).commitAndAppendClickid(str));
                } else {
                    uri = new CpmEventCommitter(Global.getApplication(), z).setEadt(str2).commitEvent(queryParameter, parse);
                }
            }
            if (uri != null && z2) {
                uri = a(uri);
            }
            return uri != null ? uri.toString() : str;
        } catch (Exception unused) {
            return str;
        }
    }

    public String a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d7b527fe", new Object[]{this, str, new Boolean(z)}) : StringUtils.isEmpty(str) ? str : Uri.parse(a(str, z, false)).getQueryParameter("clickid");
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
        if (StringUtils.isEmpty(encodedQuery)) {
            return uri;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : encodedQuery.split("&")) {
            String lowerCase = str.toLowerCase();
            if (!lowerCase.startsWith("eurl=") && !lowerCase.startsWith("etype=")) {
                arrayList.add(str);
            }
        }
        Uri.Builder buildUpon = uri.buildUpon();
        if (!arrayList.isEmpty()) {
            buildUpon.encodedQuery(StringUtils.join("&", arrayList));
        }
        return buildUpon.build();
    }
}
