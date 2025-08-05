package com.taobao.search.mmd.datasource.bean;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes7.dex */
public final class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private String f19162a;
    private int b;
    private int c;
    private long d;
    private long e;

    static {
        kge.a(164365976);
        Companion = new a(null);
    }

    @JvmStatic
    public static final b a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("9f756979", new Object[]{jSONObject}) : Companion.a(jSONObject);
    }

    public b(String url, int i, int i2, long j, long j2) {
        q.c(url, "url");
        this.f19162a = url;
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = j2;
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f19162a;
    }

    public final int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.b;
    }

    public final int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.c;
    }

    public final long d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2df", new Object[]{this})).longValue() : this.d;
    }

    public final long e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca60", new Object[]{this})).longValue() : this.e;
    }

    /* loaded from: classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(2086048736);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        @JvmStatic
        public final b a(JSONObject jsonObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("9f756979", new Object[]{this, jsonObject});
            }
            q.c(jsonObject, "jsonObject");
            String url = jsonObject.optString("url");
            if (TextUtils.isEmpty(url)) {
                return null;
            }
            int optInt = jsonObject.optInt("totalCount", 0);
            int optInt2 = jsonObject.optInt("sepCount", 0);
            String optString = jsonObject.optString("startTime");
            String optString2 = jsonObject.optString("endTime");
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA);
            q.a((Object) url, "url");
            Date parse = simpleDateFormat.parse(optString);
            q.a((Object) parse, "dateFormat.parse(startTime)");
            long time = parse.getTime();
            Date parse2 = simpleDateFormat.parse(optString2);
            q.a((Object) parse2, "dateFormat.parse(endTime)");
            return new b(url, optInt, optInt2, time, parse2.getTime());
        }
    }
}
