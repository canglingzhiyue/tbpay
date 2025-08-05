package com.taobao.android.stdpop.api.viewpager;

import android.support.v4.app.Fragment;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes6.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f15277a;
    private final Fragment b;
    private final String c;
    private final JSONObject d;

    static {
        kge.a(-382278306);
    }

    private a(String str, Fragment fragment, String str2, JSONObject jSONObject) {
        this.f15277a = str;
        this.b = fragment;
        this.c = str2;
        this.d = jSONObject;
    }

    public /* synthetic */ a(String str, Fragment fragment, String str2, JSONObject jSONObject, o oVar) {
        this(str, fragment, str2, jSONObject);
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f15277a;
    }

    public final Fragment b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Fragment) ipChange.ipc$dispatch("274f294b", new Object[]{this}) : this.b;
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.c;
    }

    public final JSONObject d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("ab96f20b", new Object[]{this}) : this.d;
    }

    /* renamed from: com.taobao.android.stdpop.api.viewpager.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static final class C0585a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private Fragment f15278a;
        private String b;
        private JSONObject c;
        private final String d;

        static {
            kge.a(139034165);
        }

        public C0585a(String title) {
            q.d(title, "title");
            this.d = title;
        }

        public final C0585a a(Fragment fragment) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0585a) ipChange.ipc$dispatch("5d84e311", new Object[]{this, fragment});
            }
            q.d(fragment, "fragment");
            C0585a c0585a = this;
            c0585a.f15278a = fragment;
            return c0585a;
        }

        public final C0585a a(String url) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0585a) ipChange.ipc$dispatch("f25c21f9", new Object[]{this, url});
            }
            q.d(url, "url");
            C0585a c0585a = this;
            c0585a.b = url;
            return c0585a;
        }

        public final C0585a a(JSONObject content) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0585a) ipChange.ipc$dispatch("b813a84f", new Object[]{this, content});
            }
            q.d(content, "content");
            C0585a c0585a = this;
            c0585a.c = content;
            return c0585a;
        }

        public final a a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("1e03068c", new Object[]{this}) : new a(this.d, this.f15278a, this.b, this.c, null);
        }
    }
}
