package com.etao.feimagesearch.capture.dynamic.msg;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.dynamic.bean.MusOuterAlbumBean;
import java.util.List;
import tb.kge;

/* loaded from: classes3.dex */
public class d extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final List<MusOuterAlbumBean> f6568a;

    static {
        kge.a(-2135822130);
    }

    @Override // com.etao.feimagesearch.capture.dynamic.msg.b
    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : "cameraUpdateOuterAlbum";
    }

    public d(List<MusOuterAlbumBean> list) {
        this.f6568a = list;
    }

    @Override // com.etao.feimagesearch.capture.dynamic.msg.b
    public JSONObject f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d2e6990d", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        List<MusOuterAlbumBean> list = this.f6568a;
        if (list != null) {
            jSONObject.put("pics", (Object) list);
        }
        return jSONObject;
    }
}
