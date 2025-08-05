package tb;

import android.content.Context;
import android.graphics.SurfaceTexture;
import java.util.Map;

/* loaded from: classes9.dex */
public interface rtm {

    /* loaded from: classes9.dex */
    public interface a {
        void a(long j);

        void a(long j, int i, int i2);

        void a(long j, long j2, long j3, int i, int i2, int i3);

        void a(long j, Map<String, Object> map);

        void b(long j);

        void b(long j, Map<String, Object> map);

        void c(long j);
    }

    void a();

    void a(long j, long j2, String str, Context context, Map<String, Object> map, SurfaceTexture surfaceTexture, a aVar);

    void a(String str);

    void a(boolean z);

    void b();

    void b(boolean z);

    void c();

    void d();

    float e();
}
