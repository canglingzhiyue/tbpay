package com.alibaba.android.patronus.simplecookie;

import android.net.ParseException;
import anet.channel.util.HttpConstant;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static Pattern f = Pattern.compile("(?:(http|https|file)\\:\\/\\/)?(?:([-A-Za-z0-9$_.+!*'(),;?&=]+(?:\\:[-A-Za-z0-9$_.+!*'(),;?&=]+)?)@)?([-a-zA-Z0-9 -\ud7ff豈-\ufdcfﷰ-\uffef%_]+(?:\\.[-a-zA-Z0-9 -\ud7ff豈-\ufdcfﷰ-\uffef%_]+)*|\\[[0-9a-fA-F:\\.]+\\])?(?:\\:([0-9]*))?(\\/?[^#]*)?.*", 2);

    /* renamed from: a  reason: collision with root package name */
    public String f2418a;
    public String b;
    public int c;
    public String d;
    public String e;

    public d(String str) throws ParseException {
        if (str == null) {
            throw new NullPointerException();
        }
        this.f2418a = "";
        this.b = "";
        this.c = -1;
        this.d = "/";
        this.e = "";
        Matcher matcher = f.matcher(str);
        if (matcher.matches()) {
            String group = matcher.group(1);
            if (group != null) {
                this.f2418a = group.toLowerCase();
            }
            String group2 = matcher.group(2);
            if (group2 != null) {
                this.e = group2;
            }
            String group3 = matcher.group(3);
            if (group3 != null) {
                this.b = group3;
            }
            String group4 = matcher.group(4);
            if (group4 != null && group4.length() > 0) {
                try {
                    this.c = Integer.parseInt(group4);
                } catch (NumberFormatException e) {
                    throw e;
                }
            }
            String group5 = matcher.group(5);
            if (group5 != null && group5.length() > 0) {
                if (group5.charAt(0) == '/') {
                    this.d = group5;
                } else {
                    this.d = "/" + group5;
                }
            }
            if (this.c == 443 && this.f2418a.equals("")) {
                this.f2418a = "https";
            } else if (this.c == -1) {
                if (this.f2418a.equals("https")) {
                    this.c = 443;
                } else {
                    this.c = 80;
                }
            }
            if (!this.f2418a.equals("")) {
                return;
            }
            this.f2418a = "http";
            return;
        }
        throw new RuntimeException("Bad address");
    }

    public String toString() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        String str2 = "";
        if ((this.c == 443 || !this.f2418a.equals("https")) && (this.c == 80 || !this.f2418a.equals("http"))) {
            str = str2;
        } else {
            str = ":" + Integer.toString(this.c);
        }
        if (this.e.length() > 0) {
            str2 = this.e + "@";
        }
        return this.f2418a + HttpConstant.SCHEME_SPLIT + str2 + this.b + str + this.d;
    }
}
