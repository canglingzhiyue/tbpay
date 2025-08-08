package com.sina.weibo.sdk.net;

import mtopsdk.common.util.StringUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes4.dex */
public final class h {
    private HashMap<String, String> q = new HashMap<>();

    static {
        kge.a(-1043497406);
    }

    public final String g() {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (String str : this.q.keySet()) {
            if (z) {
                z = false;
            } else {
                sb.append("&");
            }
            String str2 = this.q.get(str);
            if (!StringUtils.isEmpty(str2)) {
                try {
                    sb.append(URLEncoder.encode(str, "UTF-8"));
                    sb.append("=");
                    sb.append(URLEncoder.encode(str2, "UTF-8"));
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
            }
        }
        return sb.toString();
    }

    public final void put(String str, String str2) {
        this.q.put(str, str2);
    }
}
