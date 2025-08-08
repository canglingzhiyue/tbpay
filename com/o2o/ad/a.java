package com.o2o.ad;

import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String E_TYPE = "etype";
    public static final String O2O_URL = "o2o";

    /* renamed from: com.o2o.ad.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0300a {

        /* renamed from: a  reason: collision with root package name */
        public static volatile a f8096a;

        static {
            kge.a(1105710797);
            f8096a = new a();
        }
    }

    static {
        kge.a(1757429391);
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("5554aa17", new Object[0]) : C0300a.f8096a;
    }

    public String a(String str) {
        Uri parse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        if (StringUtils.isEmpty(str)) {
            return str;
        }
        try {
            parse = Uri.parse(str);
        } catch (Exception unused) {
        }
        if (!parse.isHierarchical()) {
            return str;
        }
        String queryParameter = parse.getQueryParameter(O2O_URL);
        if (!StringUtils.isEmpty(parse.getQueryParameter("o2oclickid"))) {
            return str;
        }
        String queryParameter2 = parse.getQueryParameter("etype");
        if (!"1".equals(queryParameter2) && !"3".equals(queryParameter2)) {
            return str;
        }
        String a2 = new com.o2o.ad.click.common.a().a(str, queryParameter, queryParameter2);
        return a2 != null ? a2 : str;
    }

    public String b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str}) : StringUtils.isEmpty(str) ? str : Uri.parse(a(str)).getQueryParameter("o2oclickid");
    }

    public String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2});
        }
        if (!StringUtils.isEmpty(str) && !StringUtils.isEmpty(str2)) {
            return new com.o2o.ad.click.common.a().a(str, str2);
        }
        return null;
    }
}
