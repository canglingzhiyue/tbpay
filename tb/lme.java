package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.aa;
import com.taobao.login4android.api.Login;
import com.taobao.mediaplay.d;
import com.taobao.search.musie.livevideo.video.MusLiveVideo;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class lme {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile lme f30702a;
    private static final ConcurrentHashMap<a, lmg> d;
    private final ConcurrentHashMap<lmg, JSONObject> b = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<lmg, JSONObject> c = new ConcurrentHashMap<>();

    public static /* synthetic */ ConcurrentHashMap b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConcurrentHashMap) ipChange.ipc$dispatch("ba6647dd", new Object[0]) : d;
    }

    private lme() {
    }

    static {
        kge.a(397101834);
        d = new ConcurrentHashMap<>();
    }

    public static lme a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lme) ipChange.ipc$dispatch("f07629a", new Object[0]);
        }
        if (f30702a == null) {
            synchronized (lme.class) {
                if (f30702a == null) {
                    f30702a = new lme();
                }
            }
        }
        return f30702a;
    }

    public void a(Context context, String str, lmg lmgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5d0dd4", new Object[]{this, context, str, lmgVar});
        } else if (lmgVar == null || this.b.containsKey(lmgVar) || context == null) {
        } else {
            WeakReference weakReference = new WeakReference(context);
            HashMap hashMap = new HashMap();
            hashMap.put(MusLiveVideo.ATTR_PLAY_SCENES, "");
            hashMap.put("userId", Login.getUserId());
            hashMap.put("from", "recmd");
            JSONObject jSONObject = null;
            a aVar = new a();
            d.put(aVar, lmgVar);
            if (weakReference.get() == null) {
                return;
            }
            if (str != null) {
                try {
                    if (!str.isEmpty()) {
                        jSONObject = new JSONObject(str);
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
            if (jSONObject == null) {
                return;
            }
            aa.a((Context) weakReference.get(), jSONObject, hashMap, -1, aVar);
            this.b.put(lmgVar, jSONObject);
        }
    }

    public void a(Context context, lmg lmgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8525a60a", new Object[]{this, context, lmgVar});
        } else if (lmgVar == null || !this.b.containsKey(lmgVar) || context == null) {
        } else {
            new WeakReference(context);
            oyx.a(context, lmgVar.a());
            this.b.remove(lmgVar);
            if (!this.c.containsKey(lmgVar)) {
                return;
            }
            this.c.remove(lmgVar);
        }
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else if (!this.b.isEmpty() && context != null) {
            this.c.clear();
            for (Map.Entry<lmg, JSONObject> entry : this.b.entrySet()) {
                if (entry.getKey().a() != null) {
                    a(context, entry.getKey());
                    this.c.put(entry.getKey(), entry.getValue());
                }
            }
        }
    }

    public void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{this, context});
        } else if (context == null) {
        } else {
            a(context);
            this.c.clear();
            d.clear();
        }
    }

    public void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f76bb9e", new Object[]{this, context});
        } else if (!this.c.isEmpty() && context != null) {
            for (Map.Entry<lmg, JSONObject> entry : this.c.entrySet()) {
                if (entry.getKey().a() != null) {
                    a(context, String.valueOf(entry.getValue()), entry.getKey());
                    this.c.put(entry.getKey(), entry.getValue());
                }
            }
        }
    }

    /* loaded from: classes7.dex */
    public static class a implements d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private long f30703a;

        static {
            kge.a(741221458);
            kge.a(-878894432);
        }

        @Override // com.taobao.mediaplay.d
        public void b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            }
        }

        private a() {
            this.f30703a = 0L;
        }

        @Override // com.taobao.mediaplay.d
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            } else {
                this.f30703a = System.currentTimeMillis();
            }
        }

        @Override // com.taobao.mediaplay.d
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                return;
            }
            lme.b().remove(this);
            HashMap hashMap = new HashMap(2);
            if (this.f30703a != 0) {
                hashMap.put("cost", String.valueOf(System.currentTimeMillis() - this.f30703a));
                if (lme.b().containsKey(this) && lme.b().get(this) != null) {
                    hashMap.put("videoId", ((lmg) Objects.requireNonNull(lme.b().get(this))).b());
                }
            }
            hashMap.put("player_type", "dwplayer");
            ldk.a("video", "video_downloadCost", "", "Page_Home_VideoPlayer_Count", "", hashMap);
        }
    }
}
