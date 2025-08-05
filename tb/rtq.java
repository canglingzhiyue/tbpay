package tb;

import android.content.Context;
import android.util.LongSparseArray;
import com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer;
import com.taobao.search.musie.livevideo.video.MusLiveVideo;
import com.uc.webview.export.media.CommandID;
import io.unicorn.plugin.common.b;
import io.unicorn.plugin.common.d;
import io.unicorn.plugin.common.g;
import io.unicorn.plugin.common.h;
import io.unicorn.view.a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import tb.rtm;

/* loaded from: classes9.dex */
public class rtq {

    /* renamed from: a  reason: collision with root package name */
    public final h f33373a;
    private rtr d;
    private io.unicorn.view.a e;
    private Context f;
    private b g;
    private final LongSparseArray<h> c = new LongSparseArray<>();
    private final LongSparseArray<a.b> h = new LongSparseArray<>();
    final h.c b = new a(this);

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes9.dex */
    public static class a implements h.c {

        /* renamed from: a  reason: collision with root package name */
        private final rtq f33375a;

        static {
            kge.a(-546942934);
            kge.a(-1128999743);
        }

        public a(rtq rtqVar) {
            this.f33375a = rtqVar;
        }

        public static void a() {
        }

        @Override // io.unicorn.plugin.common.h.c
        public void a(g gVar, h.d dVar) {
            char c;
            String str = gVar.f24846a;
            Object obj = gVar.b;
            int hashCode = str.hashCode();
            if (hashCode != -1352294148) {
                if (hashCode == 1557372922 && str.equals("destroy")) {
                    c = 1;
                }
                c = 65535;
            } else {
                if (str.equals("create")) {
                    c = 0;
                }
                c = 65535;
            }
            if (c == 0) {
                this.f33375a.a(obj, dVar);
            } else if (c != 1) {
            } else {
                this.f33375a.b(obj, dVar);
            }
        }
    }

    static {
        kge.a(1805544963);
    }

    public rtq(b bVar, io.unicorn.view.a aVar, Context context) {
        this.g = bVar;
        this.f33373a = new h(bVar, "unicorn/platform_video", d.INSTANCE);
        this.f33373a.a(this.b);
        this.e = aVar;
        this.f = context;
        this.d = new rtr();
    }

    public static void b() {
        a.a();
    }

    public void a() {
        for (int i = 0; i < this.h.size(); i++) {
            a.b valueAt = this.h.valueAt(i);
            if (valueAt != null) {
                valueAt.d();
            }
        }
        for (int i2 = 0; i2 < this.c.size(); i2++) {
            h valueAt2 = this.c.valueAt(i2);
            if (valueAt2 != null) {
                valueAt2.a((h.c) null);
            }
        }
        this.d.a();
        this.h.clear();
        this.c.clear();
        this.f33373a.a((h.c) null);
    }

    public void a(Object obj, h.d dVar) {
        a.b b = this.e.b();
        JSONObject jSONObject = (JSONObject) obj;
        jSONObject.optString("video-id");
        String optString = jSONObject.optString("src");
        final long optLong = jSONObject.optLong("id");
        Iterator<String> keys = jSONObject.keys();
        HashMap hashMap = new HashMap();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, jSONObject.opt(next));
        }
        h hVar = new h(this.g, "unicorn/platform_video/player_" + optLong, d.INSTANCE);
        hVar.a(new h.c() { // from class: tb.rtq.1
            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            @Override // io.unicorn.plugin.common.h.c
            public void a(g gVar, h.d dVar2) {
                char c;
                String str = gVar.f24846a;
                Object obj2 = gVar.b;
                switch (str.hashCode()) {
                    case -1259780487:
                        if (str.equals(com.taobao.desktop.channel.calendar.a.CALENDAR_EVENT_ADD)) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case -39033168:
                        if (str.equals("getCurrentTime")) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3443508:
                        if (str.equals("play")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3540994:
                        if (str.equals("stop")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 106440182:
                        if (str.equals("pause")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1398977065:
                        if (str.equals(CommandID.setMuted)) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1984755238:
                        if (str.equals("setLoop")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                        rtq.this.d.a(optLong);
                        return;
                    case 1:
                        rtq.this.d.b(optLong);
                        return;
                    case 2:
                        rtq.this.d.c(optLong);
                        return;
                    case 3:
                        rtq.this.d.a(optLong, ((JSONObject) obj2).optBoolean("loop"));
                        return;
                    case 4:
                        rtq.this.d.b(optLong, ((JSONObject) obj2).optBoolean(MusLiveVideo.ATTR_MUTE));
                        return;
                    case 5:
                        rtq.this.d.a(optLong, ((JSONObject) obj2).optString("type"));
                        return;
                    case 6:
                        float e = rtq.this.d.e(optLong);
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("time", Float.valueOf(e));
                        if (rtq.this.c.get(optLong) == null) {
                            return;
                        }
                        ((h) rtq.this.c.get(optLong)).a("time", hashMap2);
                        return;
                    default:
                        return;
                }
            }
        });
        this.c.put(optLong, hVar);
        this.h.put(optLong, b);
        this.d.a(optLong, b.c(), optString, this.f, hashMap, b.b(), new rtm.a() { // from class: tb.rtq.2
            @Override // tb.rtm.a
            public void a(long j) {
                if (rtq.this.c.get(j) != null) {
                    ((h) rtq.this.c.get(j)).a(AbsPicGalleryVideoPlayer.PlayStatus.PLAY_STATUS_PLAYING, null);
                }
            }

            @Override // tb.rtm.a
            public void a(long j, int i, int i2) {
                if (rtq.this.c.get(j) != null) {
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("code", Integer.valueOf(i));
                    hashMap2.put("message", String.valueOf(i2));
                    ((h) rtq.this.c.get(j)).a("error", hashMap2);
                }
            }

            @Override // tb.rtm.a
            public void a(long j, long j2, long j3, int i, int i2, int i3) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("textureId", Long.valueOf(j2));
                hashMap2.put("duration", Long.valueOf(j3));
                hashMap2.put("width", Integer.valueOf(i));
                hashMap2.put("height", Integer.valueOf(i2));
                hashMap2.put("rotationCorrection", Integer.valueOf(i3));
                if (rtq.this.c.get(j) != null) {
                    ((h) rtq.this.c.get(j)).a("initialized", hashMap2);
                }
            }

            @Override // tb.rtm.a
            public void a(long j, Map<String, Object> map) {
                if (rtq.this.c.get(j) != null) {
                    ((h) rtq.this.c.get(j)).a("firstvideoframe", map);
                }
            }

            @Override // tb.rtm.a
            public void b(long j) {
                if (rtq.this.c.get(j) != null) {
                    ((h) rtq.this.c.get(j)).a("paused", null);
                }
            }

            @Override // tb.rtm.a
            public void b(long j, Map<String, Object> map) {
                if (rtq.this.c.get(j) != null) {
                    ((h) rtq.this.c.get(j)).a("timeupdate", map);
                }
            }

            @Override // tb.rtm.a
            public void c(long j) {
                if (rtq.this.c.get(j) != null) {
                    ((h) rtq.this.c.get(j)).a("ended", null);
                }
            }
        });
    }

    public void b(Object obj, h.d dVar) {
        long j;
        try {
            j = ((JSONObject) obj).getLong("id");
        } catch (JSONException e) {
            rtd.e("VideoChannel", e.toString());
            j = -1;
        }
        if (j == -1) {
            return;
        }
        a.b bVar = this.h.get(j);
        if (bVar != null) {
            bVar.d();
        }
        if (this.c.get(j) != null) {
            this.c.get(j).a((h.c) null);
        }
        this.d.d(j);
        this.h.remove(j);
        this.c.remove(j);
    }
}
