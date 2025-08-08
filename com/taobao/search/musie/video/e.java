package com.taobao.search.musie.video;

import android.app.Activity;
import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.bk;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.noa;

/* loaded from: classes7.dex */
public final class e implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private bk f19295a;
    private final a b;

    static {
        kge.a(-2025748278);
        kge.a(-1252339625);
    }

    @Override // com.taobao.search.musie.video.d
    public void a(Map<String, String> fovMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, fovMap});
        } else {
            q.c(fovMap, "fovMap");
        }
    }

    public e(a dwVideoAdapter) {
        q.c(dwVideoAdapter, "dwVideoAdapter");
        this.b = dwVideoAdapter;
    }

    @Override // com.taobao.search.musie.video.d
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        bk bkVar = this.f19295a;
        if (bkVar == null) {
            q.b("videoInstance");
        }
        bkVar.mute(z);
    }

    @Override // com.taobao.search.musie.video.d
    public void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
            return;
        }
        bk bkVar = this.f19295a;
        if (bkVar == null) {
            q.b("videoInstance");
        }
        bkVar.setPlayRate(f);
    }

    @Override // com.taobao.search.musie.video.d
    public View a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this});
        }
        bk bkVar = this.f19295a;
        if (bkVar == null) {
            q.b("videoInstance");
        }
        ViewGroup view = bkVar.getView();
        q.a((Object) view, "videoInstance.view");
        return view;
    }

    @Override // com.taobao.search.musie.video.d
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        bk bkVar = this.f19295a;
        if (bkVar == null) {
            q.b("videoInstance");
        }
        bkVar.closeVideo();
    }

    @Override // com.taobao.search.musie.video.d
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        bk bkVar = this.f19295a;
        if (bkVar == null) {
            q.b("videoInstance");
        }
        bkVar.destroy();
    }

    @Override // com.taobao.search.musie.video.d
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        bk bkVar = this.f19295a;
        if (bkVar == null) {
            q.b("videoInstance");
        }
        bkVar.start();
    }

    @Override // com.taobao.search.musie.video.d
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        bk bkVar = this.f19295a;
        if (bkVar == null) {
            q.b("videoInstance");
        }
        bkVar.playVideo();
    }

    @Override // com.taobao.search.musie.video.d
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        bk bkVar = this.f19295a;
        if (bkVar == null) {
            q.b("videoInstance");
        }
        bkVar.pauseVideo();
    }

    @Override // com.taobao.search.musie.video.d
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        bk bkVar = this.f19295a;
        if (bkVar == null) {
            q.b("videoInstance");
        }
        bkVar.seekTo(i);
    }

    @Override // com.taobao.search.musie.video.d
    public Map<String, String> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7212f323", new Object[]{this});
        }
        Map<String, String> emptyMap = Collections.emptyMap();
        q.a((Object) emptyMap, "Collections.emptyMap()");
        return emptyMap;
    }

    @Override // com.taobao.search.musie.video.d
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        bk bkVar = this.f19295a;
        if (bkVar == null) {
            q.b("videoInstance");
        }
        bkVar.toggleScreen();
    }

    @Override // com.taobao.search.musie.video.d
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        bk bkVar = this.f19295a;
        if (bkVar == null) {
            q.b("videoInstance");
        }
        bkVar.hideController();
    }

    @Override // com.taobao.search.musie.video.d
    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        bk bkVar = this.f19295a;
        if (bkVar == null) {
            q.b("videoInstance");
        }
        bkVar.showController();
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
        bk.a aVar = new bk.a((Activity) context);
        aVar.a(str);
        aVar.f(z);
        aVar.s(true);
        aVar.r(true);
        aVar.N(false);
        aVar.M(false);
        aVar.c(z2);
        aVar.c(i);
        aVar.d(i2);
        aVar.b(str2);
        aVar.e(StringUtils.isEmpty(str3) ? noa.DEFAULT_VIDEO_BIZ_CODE : str3);
        aVar.g(StringUtils.isEmpty(property.m()) ? noa.DEFAULE_VIDEO_PLAY_SCENES : property.m());
        if (!StringUtils.isEmpty(str4)) {
            aVar.h(str4);
        }
        if (!StringUtils.isEmpty(property.n())) {
            aVar.c(property.n());
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
        aVar.a(a.a(str5));
        bk dwInstance = aVar.c();
        dwInstance.setRootViewClickListener(null);
        dwInstance.setVideoLifecycleListener(this.b);
        dwInstance.setIVideoLoopCompleteListener(this.b);
        dwInstance.hideMiniProgressBar();
        dwInstance.hideController();
        q.a((Object) dwInstance, "dwInstance");
        this.f19295a = dwInstance;
    }
}
