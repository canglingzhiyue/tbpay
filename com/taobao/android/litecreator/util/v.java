package com.taobao.android.litecreator.util;

import android.os.SystemClock;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.w;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes5.dex */
public class v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private long f13514a;
    private long b;
    private long c;
    private long d;
    private long e;
    private long f;
    private long g;
    private long h;
    private long i;
    private long j;
    private boolean k;
    private long l;
    private long m;

    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final v f13515a;

        static {
            kge.a(1657638367);
            f13515a = new v();
        }
    }

    static {
        kge.a(1439752177);
    }

    public static v a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (v) ipChange.ipc$dispatch("be4468c", new Object[0]) : a.f13515a;
    }

    private v() {
        this.f13514a = 0L;
        this.b = 0L;
        this.c = 0L;
        this.d = 0L;
        this.e = 0L;
        this.f = 0L;
        this.m = 0L;
        this.g = 0L;
        this.h = 0L;
        this.i = 0L;
        this.j = 0L;
        this.l = 0L;
        this.k = false;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.f13514a = SystemClock.uptimeMillis();
        this.k = true;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        q();
        this.b = SystemClock.uptimeMillis();
        if (!this.k || this.b - this.f13514a > 1000) {
            this.f13514a = this.b;
        }
        this.k = false;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            this.c = SystemClock.uptimeMillis() - this.f13514a;
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            this.d = SystemClock.uptimeMillis() - this.f13514a;
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else {
            this.f = SystemClock.uptimeMillis() - this.f13514a;
        }
    }

    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686427c", new Object[]{this});
        } else {
            this.m = SystemClock.uptimeMillis() - this.f13514a;
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else {
            this.g = SystemClock.uptimeMillis() - this.f13514a;
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else {
            this.h = SystemClock.uptimeMillis() - this.f13514a;
        }
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else {
            this.i = SystemClock.uptimeMillis() - this.f13514a;
        }
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
        } else {
            this.j = SystemClock.uptimeMillis() - this.f13514a;
        }
    }

    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
        } else {
            this.l = SystemClock.uptimeMillis() - this.f13514a;
        }
    }

    public long k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5f95766", new Object[]{this})).longValue() : this.j;
    }

    public long t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6782aef", new Object[]{this})).longValue() : this.l;
    }

    public long l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6076ee7", new Object[]{this})).longValue() : this.d;
    }

    public long m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6158668", new Object[]{this})).longValue() : this.f;
    }

    public long v() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("69459f1", new Object[]{this})).longValue() : this.m;
    }

    private void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
            return;
        }
        this.c = 0L;
        this.g = 0L;
        this.h = 0L;
        this.i = 0L;
        this.j = 0L;
        this.d = 0L;
        this.f = 0L;
        this.e = 0L;
    }

    public JSONObject n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("70253515", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("taopai_first_frame", (Object) Long.valueOf(this.j));
        jSONObject.put("taopai_ready", (Object) Long.valueOf(this.h));
        jSONObject.put("taopai_setup", (Object) Long.valueOf(this.g));
        jSONObject.put("taopai_open", (Object) Long.valueOf(this.i));
        jSONObject.put("view_loaded", (Object) Long.valueOf(this.c));
        jSONObject.put("middle_page_cost", (Object) Long.valueOf(this.b - this.f13514a));
        return jSONObject;
    }

    public Map<String, String> o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("df66012b", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("taopai_first_frame", String.valueOf(this.j));
        hashMap.put("taopai_ready", String.valueOf(this.h));
        hashMap.put("taopai_setup", String.valueOf(this.g));
        hashMap.put("taopai_open", String.valueOf(this.i));
        hashMap.put("view_loaded", String.valueOf(this.c));
        hashMap.put("middle_page_cost", String.valueOf(this.b - this.f13514a));
        return hashMap;
    }

    private String r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9ed849c7", new Object[]{this});
        }
        return "PerformanceTracker{sMiddlePageOnCreate=" + this.f13514a + ", sRecordPageOnCreate=" + this.b + ", sViewLoadCost=" + this.c + ", sAlbumLoadedCost=" + this.d + ", sTPInitCost=" + this.g + ", sTPReadyCost=" + this.h + ", sTPOpenCost=" + this.i + ", sTPFirstFrameCost=" + this.j + ", sRaceFirstFrameCost=" + this.l + ", sInspirationFirstFrameCost=" + this.f + '}';
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
        } else {
            u.d(w.TAG, r());
        }
    }
}
