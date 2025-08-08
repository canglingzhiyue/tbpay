package com.taobao.search.musie.video;

import android.app.Activity;
import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.av;
import com.taobao.avplayer.ax;
import com.taobao.avplayer.bl;
import com.taobao.avplayer.common.z;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.q;
import tb.kbv;
import tb.kge;
import tb.noa;

/* loaded from: classes7.dex */
public final class c implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private bl f19293a;
    private final com.taobao.search.musie.video.a b;

    static {
        kge.a(-496558147);
        kge.a(-1252339625);
    }

    @Override // com.taobao.search.musie.video.d
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        }
    }

    @Override // com.taobao.search.musie.video.d
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        }
    }

    @Override // com.taobao.search.musie.video.d
    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
        }
    }

    public c(com.taobao.search.musie.video.a dwVideoAdapter) {
        q.c(dwVideoAdapter, "dwVideoAdapter");
        this.b = dwVideoAdapter;
    }

    public static final /* synthetic */ com.taobao.search.musie.video.a a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.search.musie.video.a) ipChange.ipc$dispatch("507628e6", new Object[]{cVar}) : cVar.b;
    }

    @Override // com.taobao.search.musie.video.d
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        bl blVar = this.f19293a;
        if (blVar == null) {
            q.b("videoInstance");
        }
        blVar.e(z);
    }

    @Override // com.taobao.search.musie.video.d
    public void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
            return;
        }
        bl blVar = this.f19293a;
        if (blVar == null) {
            q.b("videoInstance");
        }
        blVar.a(f);
    }

    @Override // com.taobao.search.musie.video.d
    public View a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this});
        }
        bl blVar = this.f19293a;
        if (blVar == null) {
            q.b("videoInstance");
        }
        ViewGroup l = blVar.l();
        q.a((Object) l, "videoInstance.view");
        return l;
    }

    @Override // com.taobao.search.musie.video.d
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        bl blVar = this.f19293a;
        if (blVar == null) {
            q.b("videoInstance");
        }
        blVar.g();
    }

    @Override // com.taobao.search.musie.video.d
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        bl blVar = this.f19293a;
        if (blVar == null) {
            q.b("videoInstance");
        }
        blVar.m();
    }

    @Override // com.taobao.search.musie.video.d
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        bl blVar = this.f19293a;
        if (blVar == null) {
            q.b("videoInstance");
        }
        blVar.c();
    }

    @Override // com.taobao.search.musie.video.d
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        bl blVar = this.f19293a;
        if (blVar == null) {
            q.b("videoInstance");
        }
        blVar.e();
    }

    @Override // com.taobao.search.musie.video.d
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        bl blVar = this.f19293a;
        if (blVar == null) {
            q.b("videoInstance");
        }
        blVar.f();
    }

    @Override // com.taobao.search.musie.video.d
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        bl blVar = this.f19293a;
        if (blVar == null) {
            q.b("videoInstance");
        }
        blVar.e(i);
    }

    @Override // com.taobao.search.musie.video.d
    public void a(Map<String, String> fovMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, fovMap});
            return;
        }
        q.c(fovMap, "fovMap");
        bl blVar = this.f19293a;
        if (blVar == null) {
            q.b("videoInstance");
        }
        blVar.b(fovMap);
    }

    @Override // com.taobao.search.musie.video.d
    public Map<String, String> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7212f323", new Object[]{this});
        }
        bl blVar = this.f19293a;
        if (blVar == null) {
            q.b("videoInstance");
        }
        Map<String, String> t = blVar.t();
        q.a((Object) t, "videoInstance.fov");
        return t;
    }

    @Override // com.taobao.search.musie.video.d
    public void a(Context context, String str, boolean z, boolean z2, String str2, String str3, String str4, JSONObject jSONObject, String str5, int i, int i2, com.taobao.android.weex_uikit.widget.video.e property) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("184eb243", new Object[]{this, context, str, new Boolean(z), new Boolean(z2), str2, str3, str4, jSONObject, str5, new Integer(i), new Integer(i2), property});
            return;
        }
        q.c(context, "context");
        q.c(property, "property");
        bl.a aVar = new bl.a((Activity) context);
        aVar.a(str);
        try {
            aVar.a(z ? 0.0f : 1.0f);
        } catch (Throwable unused) {
            aVar.d(z);
        }
        aVar.j(false);
        aVar.i(false);
        aVar.c(z2);
        aVar.c(i);
        aVar.d(i2);
        aVar.b(str2);
        aVar.f(StringUtils.isEmpty(str3) ? noa.DEFAULT_VIDEO_BIZ_CODE : str3);
        aVar.k(StringUtils.isEmpty(property.m()) ? noa.DEFAULE_VIDEO_PLAY_SCENES : property.m());
        if (!StringUtils.isEmpty(str4)) {
            aVar.h(str4);
        }
        if (!StringUtils.isEmpty(property.n())) {
            aVar.d(property.n());
        }
        if (jSONObject != null) {
            Set<String> keySet = jSONObject.keySet();
            q.a((Object) keySet, "utParam.keys");
            HashMap<String, String> hashMap = new HashMap<>();
            for (String str6 : keySet) {
                String encode = URLEncoder.encode(jSONObject.getString(str6));
                q.a((Object) encode, "URLEncoder.encode(utParam.getString(key))");
                hashMap.put(str6, encode);
            }
            aVar.a(hashMap);
        }
        String l = property.l();
        if (!StringUtils.isEmpty(l)) {
            aVar.c(l);
            aVar.b(true);
            aVar.a(new a());
        }
        aVar.a(com.taobao.search.musie.video.a.a(str5));
        bl dwInstance = aVar.c();
        dwInstance.b((z) null);
        dwInstance.a((av) this.b);
        dwInstance.a((ax) this.b);
        q.a((Object) dwInstance, "dwInstance");
        this.f19293a = dwInstance;
    }

    /* loaded from: classes7.dex */
    public static final class a implements kbv {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.kbv
        public void onFovChange(Object o) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("25e7b9e1", new Object[]{this, o});
                return;
            }
            q.c(o, "o");
            com.taobao.android.weex_uikit.widget.video.d h = c.a(c.this).h();
            if (h == null) {
                return;
            }
            q.a((Object) h, "dwVideoAdapter.videoCallback ?: return");
            if (!(o instanceof HashMap)) {
                return;
            }
            HashMap hashMap = (HashMap) o;
            if (hashMap.isEmpty()) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : hashMap.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (!StringUtils.isEmpty(str) && value != null) {
                    jSONObject.put((JSONObject) str, value.toString());
                }
            }
            h.a(jSONObject);
        }

        @Override // tb.kbv
        public void onAnchorListUpdate(Object o) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("731725fe", new Object[]{this, o});
                return;
            }
            q.c(o, "o");
            com.taobao.android.weex_uikit.widget.video.d h = c.a(c.this).h();
            if (h == null) {
                return;
            }
            q.a((Object) h, "dwVideoAdapter.videoCallback ?: return");
            if (!(o instanceof JSONArray)) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) "anchorUpdateList", (String) o);
            h.b(jSONObject);
        }
    }
}
