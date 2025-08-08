package com.taobao.browser.commonUrlFilter;

import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import tb.kge;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f16768a;

    static {
        kge.a(120235713);
    }

    public int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{this, str})).intValue();
        }
        String[] strArr = {"TPL_redirect_url=", "tpl_redirect_url=", "redirectURL=", "redirect_url="};
        int length = strArr.length;
        if (str != null && str.length() > 0) {
            for (int i = 0; i < length; i++) {
                int indexOf = str.indexOf(strArr[i]);
                if (indexOf != -1) {
                    return indexOf + strArr[i].length();
                }
            }
        }
        return -1;
    }

    public String a() {
        Uri parse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        String str = this.f16768a;
        if (str == null || (parse = Uri.parse(str)) == null) {
            return null;
        }
        String queryParameter = parse.getQueryParameter("wvLoginCallback");
        return StringUtils.isEmpty(queryParameter) ? parse.getQueryParameter("wvlogoutcallback") : queryParameter;
    }

    public String b(String str) {
        int a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str});
        }
        String str2 = this.f16768a;
        if (str2 == null || (a2 = a(str2)) == -1 || a2 + 1 >= this.f16768a.length()) {
            return "";
        }
        String substring = this.f16768a.substring(a2);
        int indexOf = substring.indexOf("&");
        if (indexOf != -1) {
            substring = substring.substring(0, indexOf);
        }
        String str3 = substring;
        try {
            return URLDecoder.decode(str3, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return str3;
        }
    }
}
