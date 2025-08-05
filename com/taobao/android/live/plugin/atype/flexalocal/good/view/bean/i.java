package com.taobao.android.live.plugin.atype.flexalocal.good.view.bean;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.List;
import tb.ddw;
import tb.hiq;
import tb.his;
import tb.kge;
import tb.pmd;
import tb.pmv;
import tb.pmw;
import tb.pmx;
import tb.pmz;
import tb.pna;

/* loaded from: classes6.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static String d;

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f13849a;
    public VideoInfo b;
    public String c;
    private pmx e;

    public static /* synthetic */ String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[0]) : d;
    }

    static {
        kge.a(-1599957966);
        d = "GoodLiveInfo";
    }

    public i(VideoInfo videoInfo) {
        a(videoInfo);
    }

    private void a(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ead9f965", new Object[]{this, videoInfo});
            return;
        }
        this.b = videoInfo;
        if (videoInfo == null) {
            his.b(d, "init | videoInfo is null.");
        } else {
            g();
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e424ba30", new Object[]{this});
        }
        VideoInfo videoInfo = this.b;
        return videoInfo == null ? "" : videoInfo.liveId;
    }

    public List<VideoInfo.ExtraGoodsTabItem> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("627608df", new Object[]{this});
        }
        VideoInfo videoInfo = this.b;
        if (videoInfo != null) {
            return videoInfo.extraGoodsTabList;
        }
        return null;
    }

    public JSONArray h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("9d9ab6f", new Object[]{this});
        }
        VideoInfo videoInfo = this.b;
        if (videoInfo == null || videoInfo.clientInteracts == null) {
            return new JSONArray();
        }
        return this.b.clientInteracts.getJSONArray("simpleRight");
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        VideoInfo videoInfo = this.b;
        return (videoInfo == null || videoInfo.broadCaster == null) ? "" : this.b.broadCaster.accountId;
    }

    public JSONObject c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("97ef1e8a", new Object[]{this});
        }
        VideoInfo videoInfo = this.b;
        if (videoInfo == null) {
            return new JSONObject();
        }
        return videoInfo.itemConfigInfo;
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        pmd.a().B().d(hiq.a(this.b, (c) null), new pmv() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.i.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.pmv
            public void a(String str, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                }
            }

            @Override // tb.pmv
            public void a(pmz pmzVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f9ec2b9b", new Object[]{this, pmzVar});
                } else if (!(pmzVar instanceof pna)) {
                } else {
                    i.this.f13849a = ((pna) pmzVar).f32767a;
                    String f = i.f();
                    his.a(f, "first get state isFollowed" + i.this.f13849a);
                }
            }
        });
        if (this.e != null) {
            pmd.a().B().b(this.e);
        }
        this.e = new pmx() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.i.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.pmx
            public void onFollowChange(pmw pmwVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a82c75dd", new Object[]{this, pmwVar});
                } else if (pmwVar == null || TextUtils.isEmpty(pmwVar.f32765a) || !TextUtils.equals(pmwVar.f32765a, i.this.b())) {
                } else {
                    i.this.f13849a = pmwVar.b;
                    String f = i.f();
                    his.a(f, "getFollowStateAndRegisterChanged isFollowed" + i.this.f13849a);
                    ddw.a().a("com.taobao.taolive.live.state.refresh.current.tab.inner", null, i.this.c);
                    ddw.a().a("com.taobao.taolive.live.search.refresh.list.inner", null, i.this.c);
                }
            }
        };
        pmd.a().B().a(this.e);
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.f13849a;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (this.e == null) {
        } else {
            pmd.a().B().b(this.e);
        }
    }
}
