package com.taobao.taolive.sdk.playcontrol.observe;

import android.net.Uri;
import com.alibaba.android.aura.taobao.adapter.extension.userMotion.model.UserMotionEventType;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.framework.data.remote.c;
import com.taobao.android.litecreator.comprehension.f;
import com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewFrame;
import com.taobao.taolive.room.utils.aw;
import com.taobao.taolive.sdk.utils.o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kge;
import tb.pmd;
import tb.pnj;
import tb.pqq;

/* loaded from: classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "RoomPlayerObserver";

    /* renamed from: a  reason: collision with root package name */
    private String f21893a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private String l;
    private String m;
    private String n;
    private HashMap<String, String> o;
    private boolean p;
    private boolean q;
    private List<RoomPlayerEvent> r = new ArrayList();
    private List<RoomPlayerEvent> s = new ArrayList();

    static {
        kge.a(-1957080908);
        kge.a(-782514855);
    }

    public a(String str) {
        this.f21893a = str;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
        } else {
            this.e = str;
        }
    }

    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
        } else {
            this.h = str;
        }
    }

    public void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("669e4a77", new Object[]{this, str});
        } else {
            this.g = str;
        }
    }

    public void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0cfe3b8", new Object[]{this, str});
        } else if (!o()) {
        } else {
            this.i = str;
            this.f = o(str);
        }
    }

    public void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb017cf9", new Object[]{this, str});
        } else {
            this.j = str;
        }
    }

    public void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4533163a", new Object[]{this, str});
        } else {
            this.k = str;
        }
    }

    public void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f64af7b", new Object[]{this, str});
        } else {
            this.l = str;
        }
    }

    public void k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d99648bc", new Object[]{this, str});
        } else {
            this.m = str;
        }
    }

    public void l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23c7e1fd", new Object[]{this, str});
        } else {
            this.n = str;
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!o() || this.p) {
        } else {
            this.p = true;
            m(UserMotionEventType.COMPONENT_APPEAR);
            a(new RoomPlayerEvent(UserMotionEventType.COMPONENT_APPEAR, System.currentTimeMillis()));
            l();
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!o()) {
        } else {
            m("getLiveDetailSuccess");
            a(new RoomPlayerEvent("getLiveDetailSuccess", System.currentTimeMillis()));
        }
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (!o()) {
        } else {
            m("getRecommendSuccess");
            RoomPlayerEvent roomPlayerEvent = new RoomPlayerEvent("getRecommendSuccess", System.currentTimeMillis());
            roomPlayerEvent.userAction = jSONObject;
            a(roomPlayerEvent);
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (!o()) {
        } else {
            m("getLiveDetailFailed");
            a(new RoomPlayerEvent("getLiveDetailFailed", System.currentTimeMillis()));
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (!o() || !this.p) {
        } else {
            this.p = false;
            m(UserMotionEventType.COMPONENT_DISAPPEAR);
            a(new RoomPlayerEvent(UserMotionEventType.COMPONENT_DISAPPEAR, System.currentTimeMillis()));
            n();
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (!o() || !this.p) {
        } else {
            m("enterForeground");
            a(new RoomPlayerEvent("enterForeground", System.currentTimeMillis()));
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (!o() || !this.p) {
        } else {
            m("enterBackground");
            a(new RoomPlayerEvent("enterBackground", System.currentTimeMillis()));
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (!o()) {
        } else {
            m("playerFirstFrame");
            b(new RoomPlayerEvent("playerFirstFrame", System.currentTimeMillis()));
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else if (!o()) {
        } else {
            m("playerPause");
            b(new RoomPlayerEvent("playerPause", System.currentTimeMillis()));
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (!o()) {
        } else {
            m("playerError");
            RoomPlayerEvent roomPlayerEvent = new RoomPlayerEvent("playerError", System.currentTimeMillis());
            roomPlayerEvent.errCode = i;
            b(roomPlayerEvent);
        }
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else if (!o() || this.q) {
        } else {
            this.q = true;
            m("playerPlay");
            b(new RoomPlayerEvent("playerPlay", System.currentTimeMillis()));
            k();
        }
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
        } else if (!o() || !this.q) {
        } else {
            this.q = false;
            m("playerDestroy");
            b(new RoomPlayerEvent("playerDestroy", System.currentTimeMillis()));
            m();
        }
    }

    private void a(RoomPlayerEvent roomPlayerEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c316279b", new Object[]{this, roomPlayerEvent});
        } else {
            this.s.add(roomPlayerEvent);
        }
    }

    private void b(RoomPlayerEvent roomPlayerEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10d59f9c", new Object[]{this, roomPlayerEvent});
        } else {
            this.r.add(roomPlayerEvent);
        }
    }

    private void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        Map<String, String> n = n("playerPlay");
        String str = "playerPlay = " + n.toString();
        if (pmd.a().e() != null) {
            pmd.a().e().a(aw.STAIN_TRACK_PAGE, "lpm_player_monitor", n);
        }
        this.r.clear();
    }

    private void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        Map<String, String> n = n(UserMotionEventType.COMPONENT_APPEAR);
        String str = "componentAppear = " + n.toString();
        if (pmd.a().e() != null) {
            pmd.a().e().a(aw.STAIN_TRACK_PAGE, "lpm_player_monitor", n);
        }
        this.r.clear();
    }

    private void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        Map<String, String> n = n("playerDestroy");
        n.put("playEvents", Uri.encode(JSONArray.parseArray(JSON.toJSONString(this.r)).toJSONString()));
        String str = "sendPlayerDestroy = " + n.toString();
        if (pmd.a().e() != null) {
            pmd.a().e().a(aw.STAIN_TRACK_PAGE, "lpm_player_monitor", n);
        }
        this.r.clear();
    }

    private void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        Map<String, String> n = n(UserMotionEventType.COMPONENT_DISAPPEAR);
        n.put("roomEvents", Uri.encode(JSONArray.parseArray(JSON.toJSONString(this.s)).toJSONString()));
        String str = "sendComponentDisappear = " + n.toString();
        if (pmd.a().e() != null) {
            pmd.a().e().a(aw.STAIN_TRACK_PAGE, "lpm_player_monitor", n);
        }
        this.s.clear();
    }

    private void m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6df97b3e", new Object[]{this, str});
        } else if (pmd.a().m() == null) {
        } else {
            pnj m = pmd.a().m();
            m.b(TAG, this.f21893a + " - " + str);
        }
    }

    private Map<String, String> n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bec3dc74", new Object[]{this, str});
        }
        HashMap hashMap = new HashMap();
        hashMap.put(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID, this.b);
        hashMap.put("liveComponentSession", this.f21893a);
        hashMap.put(pqq.KEY_LIVE_SOURCE, this.c);
        hashMap.put("liveScene", this.d);
        hashMap.put("entryLiveSource", this.e);
        hashMap.put("mediaFormat", this.f);
        hashMap.put("playerSession", this.g);
        hashMap.put("entrySpm", this.h);
        hashMap.put("mediaUrl", this.i);
        hashMap.put("playerViewToken", this.j);
        hashMap.put(aw.PARAM_PLAY_MODE, this.k);
        hashMap.put("roomStatus", this.l);
        hashMap.put("streamStatus", this.m);
        hashMap.put(c.KEY_DATA_SOURCE, this.n);
        hashMap.put("action", str);
        hashMap.put("time", String.valueOf(System.currentTimeMillis()));
        HashMap<String, String> hashMap2 = this.o;
        if (hashMap2 != null) {
            hashMap.put("playConfig", Uri.encode(hashMap2.toString()));
        }
        return hashMap;
    }

    private static String o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cd967ee0", new Object[]{str});
        }
        if (str != null) {
            if (str.contains("flv")) {
                return "flv";
            }
            if (str.contains("artc")) {
                return "artc";
            }
            if (str.contains(f.FILE_TYPE_VIDEO_MP4)) {
                return f.FILE_TYPE_VIDEO_MP4;
            }
            if (str.contains("m3u8")) {
                return "m3u8";
            }
        }
        return "";
    }

    private boolean o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[]{this})).booleanValue() : o.v();
    }
}
