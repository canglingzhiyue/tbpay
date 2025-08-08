package com.taobao.taobaoavsdk.cache.library;

import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobaoavsdk.AVSDKLog;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import tb.kge;
import tb.oyw;
import tb.riy;

/* loaded from: classes8.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Pattern s;
    private static final Pattern t;
    private static final Pattern u;

    /* renamed from: a  reason: collision with root package name */
    public final String f21319a;
    public final long b;
    public final boolean c;
    public final String d;
    public final boolean e;
    public final String f;
    public final String g;
    public final int h;
    public final long i;
    public final boolean j;
    public final int k;
    public final int l;
    public final int m;
    public final String n;
    public final String o;
    public final String p;
    public final String q;
    public final int r;
    private final String[] v = {oyw.PLAY_TOKEN_ID, oyw.USE_TBNET_PROXY, oyw.CDN_IP, oyw.VIDEO_LENGTH, oyw.PRE_LOAD, oyw.CONNECT_TIMEOUT, oyw.READ_TIMEOUT, oyw.RETRY_TIME, "bizCode", "videoId", oyw.VIDEO_DEFINE, oyw.PRELOAD_NET_CUT_SIZE};

    static {
        kge.a(1310526533);
        s = Pattern.compile("[R,r]ange:[ ]?bytes=(\\d*)-(\\d*)");
        t = Pattern.compile("(GET|HEAD) /(.*) HTTP");
        u = Pattern.compile("User-Agent:(.*;systemName/Android)");
    }

    public f(String str) {
        n.a(str);
        long b = b(str);
        this.b = Math.max(0L, b);
        this.i = Math.max(0L, c(str));
        this.c = b >= 0;
        String d = p.d(d(str));
        this.d = e(str);
        this.f = a(d);
        this.g = a(d, oyw.CDN_IP, "");
        this.h = a(d, oyw.VIDEO_LENGTH, Integer.MIN_VALUE);
        this.j = a(d, oyw.PRE_LOAD, false).booleanValue();
        this.k = a(d, oyw.CONNECT_TIMEOUT, 0);
        this.l = a(d, oyw.READ_TIMEOUT, 0);
        this.m = a(d, oyw.RETRY_TIME, 0);
        this.n = a(d, "bizCode", "");
        this.o = a(d, oyw.VIDEO_PLAY_SCENES, "");
        this.p = a(d, "videoId", "");
        this.q = a(d, oyw.VIDEO_DEFINE, "");
        this.r = a(d, oyw.PRELOAD_NET_CUT_SIZE, -1);
        if (this.j) {
            this.e = a(d, oyw.USE_TBNET_PROXY, true).booleanValue();
        } else {
            this.e = a(d, oyw.USE_TBNET_PROXY, false).booleanValue();
        }
        this.f21319a = a(d, this.v);
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "uri = " + this.f21319a + ", start=" + this.b + ", end=" + this.i + ", partial=" + this.c);
    }

    private String a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("457cf91a", new Object[]{this, str, str2, str3});
        }
        try {
            return Uri.parse(str).getQueryParameter(str2);
        } catch (Throwable unused) {
            return str3;
        }
    }

    private Boolean a(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("9e896055", new Object[]{this, str, str2, new Boolean(z)});
        }
        try {
            String queryParameter = Uri.parse(str).getQueryParameter(str2);
            if (StringUtils.isEmpty(queryParameter)) {
                return Boolean.valueOf(z);
            }
            if ("1".equals(queryParameter)) {
                return true;
            }
            return Boolean.valueOf(com.taobao.taobaoavsdk.util.b.a(queryParameter));
        } catch (Throwable unused) {
            return Boolean.valueOf(z);
        }
    }

    private int a(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4dba94fa", new Object[]{this, str, str2, new Integer(i)})).intValue();
        }
        try {
            return Integer.valueOf(Uri.parse(str).getQueryParameter(str2)).intValue();
        } catch (Throwable unused) {
            return i;
        }
    }

    private String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        try {
            return Uri.parse(str.replace(riy.PLUS, "%2B")).getQueryParameter(oyw.PLAY_TOKEN_ID);
        } catch (Throwable unused) {
            return "";
        }
    }

    public String a(String str, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5e7f4c93", new Object[]{this, str, strArr});
        }
        if (strArr == null) {
            return str;
        }
        try {
            if (strArr.length == 0) {
                return str;
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(riy.BRACKET_START_STR);
            for (String str2 : strArr) {
                stringBuffer.append(str2);
                stringBuffer.append("|");
            }
            stringBuffer.deleteCharAt(stringBuffer.length() - 1);
            stringBuffer.append(riy.BRACKET_END_STR);
            return str.replaceAll("(?<=[\\?&])" + stringBuffer.toString() + "=[^&]*&?", "").replaceAll("(\\?|\\?&|&+)$", "");
        } catch (Exception unused) {
            return str;
        }
    }

    public static f a(InputStream inputStream) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("83e01820", new Object[]{inputStream});
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (!StringUtils.isEmpty(readLine)) {
                sb.append(readLine);
                sb.append('\n');
            } else {
                return new f(sb.toString());
            }
        }
    }

    private long b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3dd7e567", new Object[]{this, str})).longValue();
        }
        Matcher matcher = s.matcher(str);
        if (!matcher.find()) {
            return -1L;
        }
        return Long.parseLong(matcher.group(1));
    }

    private long c(String str) {
        String group;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("88097ea8", new Object[]{this, str})).longValue();
        }
        Matcher matcher = s.matcher(str);
        if (matcher.find() && (group = matcher.group(2)) != null && !StringUtils.isEmpty(group)) {
            return Long.parseLong(group);
        }
        return -1L;
    }

    private String d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4d254b", new Object[]{this, str});
        }
        Matcher matcher = t.matcher(str);
        if (matcher.find()) {
            return matcher.group(2);
        }
        throw new IllegalArgumentException("Invalid request `" + str + "`: url not found!");
    }

    private String e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("666b162a", new Object[]{this, str});
        }
        Matcher matcher = u.matcher(str);
        if (!matcher.find()) {
            return null;
        }
        return matcher.group(1);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "GetRequest{rangeOffset=" + this.b + ", partial=" + this.c + ", uri='" + this.f21319a + "'}";
    }
}
