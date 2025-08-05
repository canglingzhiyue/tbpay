package com.taobao.trtc.call;

import android.content.Context;
import android.content.Intent;
import com.taobao.trtc.api.TrtcAudioDevice;
import com.taobao.trtc.api.TrtcDefines;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.kge;

/* loaded from: classes9.dex */
public interface ITrtcCallEngine {
    public static final int ERROR_CODE_INITIALIZE_ERROR = -101;
    public static final int ERROR_CODE_JOIN_CHANNEL_ERROR = -102;
    public static final int ERROR_CODE_MAKECALL_ERROR_TIMEOUT = -103;
    public static final int ERROR_CODE_MAKECALL_ERROR_UNKOWN = -104;
    public static final int ERROR_CODE_UNKOWN = -100;

    /* renamed from: com.taobao.trtc.call.ITrtcCallEngine$-CC  reason: invalid class name */
    /* loaded from: classes9.dex */
    public final /* synthetic */ class CC {
        public static ITrtcCallEngine a(Context context, d dVar) {
            return new TrtcCallImpl(context, dVar);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes9.dex */
    public @interface CallErrorCode {
    }

    /* loaded from: classes9.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f23066a;
        public String b;
        public int c;
        public boolean d;
        public String e;

        static {
            kge.a(1909779092);
        }
    }

    /* loaded from: classes9.dex */
    public interface b {
        void a();

        void a(int i);

        void a(TrtcAudioDevice.b bVar);

        void a(TrtcDefines.TrtcAudioFocusState trtcAudioFocusState);

        void a(TrtcDefines.TrtcAudioRouteDevice trtcAudioRouteDevice);

        void a(TrtcDefines.TrtcMediaConnectionState trtcMediaConnectionState);

        void a(TrtcDefines.TrtcNetWorkQuality trtcNetWorkQuality);

        void a(a aVar);

        void a(String str, TrtcDefines.f fVar);

        void a(String str, String str2);

        void a(boolean z, String str);

        void b(int i);

        void b(String str, String str2);

        void c(int i);
    }

    /* loaded from: classes9.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public String f23067a;
        public String b;
        public int c;
        public boolean d = false;
        public boolean e = false;
        public int f = 2;
        public int g = 20000;
        public String h;

        static {
            kge.a(1828313396);
        }
    }

    /* loaded from: classes9.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public String f23068a;
        public String b;
        public b c;
        public String d;
        public int e = 0;

        static {
            kge.a(-482722860);
        }
    }

    /* loaded from: classes9.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public int f23069a;
        public int b;
        public int c;
        public Intent d;

        static {
            kge.a(1247514032);
        }
    }

    void a();

    boolean a(c cVar);

    boolean a(e eVar);

    boolean a(boolean z);

    boolean a(boolean z, String str);

    void b(String str, int i);

    boolean b();

    boolean c(String str, int i);

    boolean c(boolean z);

    boolean d(boolean z);
}
