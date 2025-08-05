package com.taobao.android.tschedule.parser;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tschedule.parser.expr.edition.EditionInfo;
import com.taobao.android.tschedule.parser.expr.location.LocationInfo;
import com.taobao.android.tschedule.parser.expr.login.LoginInfo;
import com.taobao.android.tschedule.taskcontext.baseparams.TimeContent;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.jkq;
import tb.jku;
import tb.jls;
import tb.kge;

/* loaded from: classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ENCODE_PREFIX = "@encode.";
    public static final String STR_PREFIX = "@str.";

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, b> f15665a;
    private static final Map<String, InterfaceC0607a> b;
    private com.taobao.android.tschedule.parser.b c;
    private ExprParserParams d;

    /* renamed from: com.taobao.android.tschedule.parser.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public interface InterfaceC0607a {
        JSONObject a(Context context, Intent intent);
    }

    /* loaded from: classes.dex */
    public interface b {
        String b(Context context, Intent intent);
    }

    static {
        kge.a(-2106953267);
        f15665a = new HashMap();
        b = new HashMap();
    }

    public static Object a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("17307540", new Object[]{str});
        }
        Object a2 = jls.a(str);
        if (a2 == null) {
            a2 = jku.a(str, new Object[0]);
        }
        return a2 == null ? str : a2;
    }

    public a(ExprParserParams exprParserParams, com.taobao.android.tschedule.parser.b bVar) {
        this.d = exprParserParams;
        this.c = bVar;
    }

    public Object b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("6e4e661f", new Object[]{this, str}) : a(a(str));
    }

    public Object a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("9798556e", new Object[]{this, obj});
        }
        if (obj instanceof jls) {
            return ((jls) obj).a(this);
        }
        return obj instanceof jku ? ((jku) obj).a(this) : obj;
    }

    public InterfaceC0607a c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (InterfaceC0607a) ipChange.ipc$dispatch("f49795c0", new Object[]{this, str}) : b.get(str);
    }

    public b d(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("e8271a20", new Object[]{this, str}) : f15665a.get(str);
    }

    public List<String> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("627608df", new Object[]{this}) : this.d.blacklist;
    }

    public Uri b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("def15b20", new Object[]{this});
        }
        if (this.d.uri == null) {
            try {
                this.d.uri = Uri.parse(this.d.targetUrl);
            } catch (Throwable th) {
                jkq.a("TS.ExprParser", "parse url error, url=" + this.d.targetUrl, th);
            }
        }
        return this.d.uri;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.d.targetUrl;
    }

    public Intent d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Intent) ipChange.ipc$dispatch("d02bf1c8", new Object[]{this}) : this.d.intent;
    }

    public LoginInfo e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LoginInfo) ipChange.ipc$dispatch("f5aa51c9", new Object[]{this}) : this.c.a();
    }

    public LocationInfo f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LocationInfo) ipChange.ipc$dispatch("5c3cca9c", new Object[]{this}) : this.c.b();
    }

    public EditionInfo g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (EditionInfo) ipChange.ipc$dispatch("afe5239d", new Object[]{this}) : this.c.c();
    }

    public List<TimeContent> h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("b7e2e578", new Object[]{this}) : this.d.timeContent;
    }

    public static boolean a(String str, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("86dff54d", new Object[]{str, bVar})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || bVar == null) {
            return false;
        }
        f15665a.put(str, bVar);
        return true;
    }
}
