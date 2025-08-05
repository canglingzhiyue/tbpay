package tb;

import android.content.Context;
import android.graphics.SurfaceTexture;
import java.util.HashMap;
import java.util.Map;
import tb.rtm;

/* loaded from: classes9.dex */
public class rtr {

    /* renamed from: a  reason: collision with root package name */
    private Map<Long, rtm> f33376a = new HashMap();

    static {
        kge.a(-678610851);
    }

    public static void b() {
    }

    public void a() {
        for (Long l : this.f33376a.keySet()) {
            if (this.f33376a.get(l) != null) {
                this.f33376a.get(l).d();
            }
        }
    }

    public void a(long j) {
        if (this.f33376a.get(Long.valueOf(j)) == null) {
            return;
        }
        this.f33376a.get(Long.valueOf(j)).a();
    }

    public void a(long j, long j2, String str, Context context, Map<String, Object> map, SurfaceTexture surfaceTexture, final rtm.a aVar) {
        rtm a2 = rts.a().b().a();
        this.f33376a.put(Long.valueOf(j), a2);
        a2.a(j, j2, str, context, map, surfaceTexture, new rtm.a() { // from class: tb.rtr.1
            @Override // tb.rtm.a
            public void a(long j3) {
                aVar.a(j3);
            }

            @Override // tb.rtm.a
            public void a(long j3, int i, int i2) {
                aVar.a(j3, i, i2);
            }

            @Override // tb.rtm.a
            public void a(long j3, long j4, long j5, int i, int i2, int i3) {
                aVar.a(j3, j4, j5, i, i2, i3);
            }

            @Override // tb.rtm.a
            public void a(long j3, Map<String, Object> map2) {
                aVar.a(j3, map2);
            }

            @Override // tb.rtm.a
            public void b(long j3) {
                aVar.b(j3);
            }

            @Override // tb.rtm.a
            public void b(long j3, Map<String, Object> map2) {
                aVar.b(j3, map2);
            }

            @Override // tb.rtm.a
            public void c(long j3) {
                aVar.c(j3);
            }
        });
    }

    public void a(long j, String str) {
        if (this.f33376a.get(Long.valueOf(j)) == null) {
            return;
        }
        this.f33376a.get(Long.valueOf(j)).a(str);
    }

    public void a(long j, boolean z) {
        if (this.f33376a.get(Long.valueOf(j)) == null) {
            return;
        }
        this.f33376a.get(Long.valueOf(j)).a(z);
    }

    public void b(long j) {
        if (this.f33376a.get(Long.valueOf(j)) == null) {
            return;
        }
        this.f33376a.get(Long.valueOf(j)).b();
    }

    public void b(long j, boolean z) {
        if (this.f33376a.get(Long.valueOf(j)) == null) {
            return;
        }
        this.f33376a.get(Long.valueOf(j)).b(z);
    }

    public void c(long j) {
        if (this.f33376a.get(Long.valueOf(j)) == null) {
            return;
        }
        this.f33376a.get(Long.valueOf(j)).c();
    }

    public void d(long j) {
        if (this.f33376a.get(Long.valueOf(j)) == null) {
            return;
        }
        this.f33376a.get(Long.valueOf(j)).d();
    }

    public float e(long j) {
        if (this.f33376a.get(Long.valueOf(j)) == null) {
            return 0.0f;
        }
        return this.f33376a.get(Long.valueOf(j)).e();
    }
}
