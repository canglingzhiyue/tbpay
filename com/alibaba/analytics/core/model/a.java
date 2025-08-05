package com.alibaba.analytics.core.model;

import android.text.TextUtils;
import com.alibaba.analytics.core.db.annotation.Column;
import com.alibaba.analytics.core.db.annotation.Ingore;
import com.alibaba.analytics.core.db.annotation.TableName;
import com.alibaba.analytics.core.logbuilder.b;
import com.alibaba.analytics.core.logbuilder.d;
import com.alibaba.analytics.core.logbuilder.f;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.xsearchplugin.weex.weex.i;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.aof;
import tb.aph;
import tb.apy;
import tb.kge;
import tb.riy;

@TableName("log")
/* loaded from: classes.dex */
public class a extends aof {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    @Ingore
    public static final String DEFAULT_PRIORITY = "3";
    @Ingore
    public static final String FIELD_NAME_PRIORITY = "priority";
    @Ingore
    public static final String FIELD_NAME_TIME = "time";
    @Column("eventId")

    /* renamed from: a  reason: collision with root package name */
    public String f2089a;
    @Column("priority")
    public String b;
    @Column("streamId")
    public String d;
    @Column("time")
    public String e;
    @Column(i.INDEX_KEY)
    public String f;
    @Column("content")
    private String g;
    @Ingore
    private String h;
    @Ingore
    private String i;
    @Ingore
    private String j;
    @Ingore
    private String k;
    @Ingore
    private Map<String, String> l;
    @Ingore
    private int m;

    static {
        kge.a(-1551399784);
    }

    public a() {
        this.b = "3";
        this.e = null;
        this.f = "";
        this.m = 0;
    }

    public a(String str, List<String> list, String str2, Map<String, String> map) {
        this.b = "3";
        this.e = null;
        this.f = "";
        this.m = 0;
        this.b = str;
        this.d = a(list);
        this.f2089a = str2;
        this.e = String.valueOf(System.currentTimeMillis());
        f.a().a(str2, map);
        this.f = map.get(LogField.RESERVE3.toString());
        a(b.a(map));
    }

    public a(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        this.b = "3";
        this.e = null;
        this.f = "";
        this.m = 0;
        this.f2089a = str2;
        this.h = str;
        this.i = str3;
        this.j = str4;
        this.k = str5;
        this.l = map;
        this.e = String.valueOf(System.currentTimeMillis());
        this.b = d.a().a(str2);
        HashMap hashMap = new HashMap();
        if (map != null) {
            hashMap.putAll(map);
        }
        if (!TextUtils.isEmpty(str)) {
            hashMap.put(LogField.PAGE.toString(), str);
        }
        hashMap.put(LogField.EVENTID.toString(), str2);
        if (!TextUtils.isEmpty(str3)) {
            hashMap.put(LogField.ARG1.toString(), str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            hashMap.put(LogField.ARG2.toString(), str4);
        }
        if (!TextUtils.isEmpty(str5)) {
            hashMap.put(LogField.ARG3.toString(), str5);
        }
        if (!TextUtils.isEmpty(this.e)) {
            hashMap.put(LogField.RECORD_TIMESTAMP.toString(), this.e);
        }
        f.a().a(str2, hashMap);
        this.f = (String) hashMap.get(LogField.RESERVE3.toString());
        a(b.a(hashMap));
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        try {
            byte[] a2 = aph.a(this.g.getBytes("UTF-8"), 2);
            if (a2 == null) {
                return null;
            }
            return new String(apy.a(a2));
        } catch (Exception unused) {
            return null;
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (str == null) {
        } else {
            try {
                this.g = new String(aph.c(apy.a(str.getBytes()), 2), "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "Log [eventId=" + this.f2089a + ", index=" + this.f + riy.ARRAY_END_STR;
    }

    private String a(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("80c38867", new Object[]{this, list});
        }
        if (list == null) {
            return "";
        }
        if (list.size() == 1) {
            return list.get(0);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            if (i > 0) {
                sb.append(",");
            }
            sb.append(list.get(i));
        }
        return sb.toString();
    }

    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.m;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.m = i;
        }
    }
}
