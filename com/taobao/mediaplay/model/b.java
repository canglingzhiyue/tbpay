package com.taobao.mediaplay.model;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONObject;
import tb.kge;
import tb.mto;

/* loaded from: classes7.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f18045a;
    private String b;
    private int c;
    private String d;
    private int e;
    private String f;
    private int g;

    static {
        kge.a(1503388139);
    }

    public b(JSONObject jSONObject) {
        this.f18045a = jSONObject;
    }

    public String a() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.d) && (jSONObject = this.f18045a) != null) {
            Object opt = jSONObject.opt("video_url");
            this.d = opt == null ? null : opt.toString();
        }
        return this.d;
    }

    public String b() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.b) && (jSONObject = this.f18045a) != null) {
            Object opt = jSONObject.opt("definition");
            this.b = opt == null ? null : opt.toString();
        }
        return this.b;
    }

    public String c() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.f) && (jSONObject = this.f18045a) != null) {
            Object opt = jSONObject.opt("cacheKey");
            this.f = opt == null ? null : opt.toString();
        }
        return this.f;
    }

    public int d() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue();
        }
        try {
            if (this.e == 0 && this.f18045a != null) {
                Object opt = this.f18045a.opt(com.taobao.android.weex_framework.util.a.ATOM_length);
                double parseInt = (opt == null || !TextUtils.isDigitsOnly(opt.toString())) ? mto.a.GEO_NOT_SUPPORT : Integer.parseInt(opt.toString());
                if (parseInt >= 102400.0d && parseInt <= 2.097152E8d) {
                    i = (int) parseInt;
                    this.e = i;
                }
                i = -1;
                this.e = i;
            }
        } catch (Exception unused) {
            this.e = -1;
        }
        return this.e;
    }

    public int e() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue();
        }
        if (this.c == 0 && (jSONObject = this.f18045a) != null) {
            Object opt = jSONObject.opt("bitrate");
            if (opt != null && TextUtils.isDigitsOnly(opt.toString())) {
                i = Integer.parseInt(opt.toString());
            }
            this.c = i;
        }
        return this.c;
    }

    public int f() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[]{this})).intValue();
        }
        if (this.g == 0 && (jSONObject = this.f18045a) != null) {
            Object opt = jSONObject.opt("playableBytes");
            if (opt != null && TextUtils.isDigitsOnly(opt.toString())) {
                i = Integer.parseInt(opt.toString());
            }
            this.g = i;
        }
        return this.g;
    }

    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this});
        }
        JSONObject jSONObject = this.f18045a;
        return jSONObject != null ? jSONObject.toString() : "";
    }
}
