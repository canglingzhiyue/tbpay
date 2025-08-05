package com.taobao.avplayer;

import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONObject;
import tb.kch;
import tb.kge;

/* loaded from: classes6.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f16495a;
    private com.taobao.avplayer.core.protocol.b b;

    static {
        kge.a(-1853744115);
    }

    public d(JSONObject jSONObject) {
        this.f16495a = jSONObject;
        this.b = new com.taobao.avplayer.core.protocol.b(a(com.taobao.tao.flexbox.layoutmanager.player.videodecide.c.ARRAY_KEY_CONFIGURATION, this.f16495a));
    }

    public com.taobao.avplayer.core.protocol.b a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.avplayer.core.protocol.b) ipChange.ipc$dispatch("3b75ca4", new Object[]{this}) : this.b;
    }

    private JSONObject a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("64faebba", new Object[]{this, str, jSONObject});
        }
        if (str == null || jSONObject == null) {
            return null;
        }
        try {
            Object opt = jSONObject.opt(str);
            if (opt == null) {
                return null;
            }
            return (JSONObject) opt;
        } catch (Exception e) {
            kch.b("getconfig getJson error" + e.getMessage());
            return null;
        }
    }
}
