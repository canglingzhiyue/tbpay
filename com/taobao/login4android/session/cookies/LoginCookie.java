package com.taobao.login4android.session.cookies;

import com.android.alibaba.ip.runtime.IpChange;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import tb.kge;

/* loaded from: classes7.dex */
public class LoginCookie {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String domain;
    public long expires;
    public boolean httpOnly;
    public String name;
    public String path;
    public boolean secure;
    public String value;

    static {
        kge.a(1417665622);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.name);
        sb.append("=");
        sb.append(this.value);
        sb.append("; ");
        sb.append("Domain=");
        sb.append(this.domain);
        if (this.expires > 0) {
            try {
                sb.append("; ");
                sb.append("Expires=");
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd-MMM-yyyy HH:mm:ss 'GMT'", Locale.ENGLISH);
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT+8"));
                sb.append(simpleDateFormat.format(Long.valueOf(this.expires)));
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        sb.append("; ");
        sb.append("Path=");
        sb.append(this.path);
        if (this.secure) {
            sb.append("; ");
            sb.append("Secure");
        }
        if (this.httpOnly) {
            sb.append("; ");
            sb.append("HttpOnly");
        }
        return sb.toString();
    }
}
