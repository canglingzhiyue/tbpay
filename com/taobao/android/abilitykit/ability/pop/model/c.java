package com.taobao.android.abilitykit.ability.pop.model;

import android.app.Activity;
import android.app.ActivityGroup;
import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.h;
import com.taobao.tao.log.TLog;
import tb.dmo;
import tb.dms;
import tb.hsu;
import tb.kge;

/* loaded from: classes4.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_LANDSCAPE_DRAWER = "defaultLandscapeDrawer";
    public static final String KEY_BIZ_ID = "bizId";
    public static final String KEY_CONTENT = "content";
    public static final String KEY_EXT_CONFIG = "extConfig";
    public static final String KEY_NAME_SPACE = "namespace";
    public static final String KEY_POP_CONFIG = "popConfig";
    public static final String KEY_POP_ID = "popId";
    public static final String KEY_POP_URL = "url";
    public static final String PAD_FULL_SCREEN_DRAWER = "padFullScreen";

    /* renamed from: a  reason: collision with root package name */
    public b f8913a;
    public String b;
    public String c;
    public String d;
    public JSONObject e;
    public JSONObject f;
    public String g;
    public boolean h;
    private JSONObject i;
    public b k;
    public b l;

    static {
        kge.a(-93948076);
    }

    public JSONObject c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("97ef1e8a", new Object[]{this}) : this.i;
    }

    public c(JSONObject jSONObject) {
        this.i = jSONObject;
        this.f8913a = b.a(dmo.a(jSONObject, KEY_POP_CONFIG, (JSONObject) null));
        this.b = dmo.a(jSONObject, "popId", (String) null);
        if (TextUtils.isEmpty(this.b)) {
            this.b = String.valueOf(System.currentTimeMillis());
        }
        this.c = dmo.a(jSONObject, "url", "");
        this.c = hsu.a(this.c, dmo.a(jSONObject, "queryParams", (JSONObject) null));
        this.d = dmo.a(jSONObject, "bizId", "");
        this.g = dmo.a(jSONObject, "namespace", (String) null);
        this.e = dmo.a(jSONObject, "content", (JSONObject) null);
        this.f = dmo.a(jSONObject, KEY_EXT_CONFIG, (JSONObject) null);
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.h || "activity".equals(this.f8913a.n());
    }

    public void a(boolean z, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78df29dc", new Object[]{this, new Boolean(z), context});
            return;
        }
        TLog.loge("stdPopTag", "stdPopTag", "switchPopConfig isPortrait = " + z);
        if (z) {
            b bVar = this.l;
            if (bVar == null) {
                return;
            }
            this.f8913a = bVar;
        } else if (dms.a(context, false)) {
            b bVar2 = this.k;
            if (bVar2 == null) {
                return;
            }
            this.f8913a = bVar2;
        } else {
            b bVar3 = this.l;
            if (bVar3 == null) {
                return;
            }
            this.f8913a = bVar3;
        }
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else if (!this.f8913a.C()) {
        } else {
            b bVar = this.f8913a;
            this.l = bVar;
            this.k = (b) bVar.clone();
            this.k.b("right|bottom");
            this.k.b(10000);
            this.k.a(10000);
            String str = "noAnimation";
            if (!str.equals(this.k.c())) {
                b bVar2 = this.k;
                if (!d() || !this.f8913a.B()) {
                    str = d.KEY_RIGHT_IN_OUT;
                }
                bVar2.a(str);
            }
            if (!TextUtils.isEmpty(this.k.I())) {
                b bVar3 = this.k;
                bVar3.a(bVar3.I());
            }
            this.k.f(0);
            this.k.c(DEFAULT_LANDSCAPE_DRAWER);
            if ((!d() || !TextUtils.isEmpty(this.c)) && this.f8913a.e() != 10000) {
                this.k.b(Math.max(10000 - ((dms.c(context) * 10000) / Math.min(h.a().e(context), h.a().a(context))), this.f8913a.e()));
            }
            if (this.k.B() && this.h) {
                this.k.d(10000);
                this.k.c(10000);
                return;
            }
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                if ((activity.getParent() instanceof ActivityGroup) && "com.taobao.android.tbabilitykit.pop.StdPopActivityGroup".equals(activity.getParent().getClass().getName()) && !d()) {
                    this.k.d(10000);
                    this.k.c(10000);
                    return;
                }
            }
            if (this.f8913a.e() == 10000 && this.f8913a.g() == 10000 && !this.k.D()) {
                this.k.b(this.f8913a.e());
                this.k.a(this.f8913a.d());
                this.k.c("");
                this.k.a(this.f8913a.c());
                this.k.b(this.f8913a.s());
            } else if (this.k.j() && !this.k.D()) {
                this.k.b(this.f8913a.e());
                this.k.a(this.f8913a.d());
                this.k.c("");
                this.k.a(this.f8913a.c());
                this.k.b(this.f8913a.s());
            } else {
                this.k.d(5000);
                this.k.c(5000);
            }
        }
    }
}
