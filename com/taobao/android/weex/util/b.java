package com.taobao.android.weex.util;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import anet.channel.util.HttpConstant;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(169283454);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        }
    }

    public static Pair<String, String> a(String str) {
        String uri;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("c2e055fc", new Object[]{str});
        }
        try {
            Uri parse = Uri.parse(str);
            String queryParameter = parse.getQueryParameter(com.taobao.vessel.utils.b.WX_TPL);
            if (queryParameter == null) {
                queryParameter = parse.getQueryParameter("_mus_tpl");
            }
            if (queryParameter == null) {
                uri = parse.buildUpon().clearQuery().build().toString();
            } else {
                uri = Uri.parse(queryParameter).buildUpon().clearQuery().build().toString();
            }
            return new Pair<>(str, uri);
        } catch (Exception unused) {
            return new Pair<>(str, str);
        }
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        Uri parse = Uri.parse(str);
        if (!parse.isHierarchical()) {
            return str;
        }
        return parse.getHost() + parse.getPath();
    }

    public static String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82f346c", new Object[]{str});
        }
        try {
            return Uri.parse(str).buildUpon().clearQuery().build().toString();
        } catch (Exception unused) {
            return "<invalidUrl>";
        }
    }

    public static String d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4d254b", new Object[]{str});
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            Uri parse = Uri.parse(str);
            StringBuilder sb = new StringBuilder();
            if (parse.isHierarchical()) {
                sb.append(parse.getScheme());
                sb.append(HttpConstant.SCHEME_SPLIT);
                sb.append(parse.getHost());
                sb.append(parse.getPath());
            }
            return sb.toString();
        } catch (Exception unused) {
            return "";
        }
    }
}
