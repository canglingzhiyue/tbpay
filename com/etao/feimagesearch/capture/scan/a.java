package com.etao.feimagesearch.capture.scan;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.nn.NetConfig;
import com.etao.feimagesearch.nn.f;
import java.util.ArrayList;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.cot;
import tb.kge;

/* loaded from: classes3.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final C0219a Companion;
    public static final String TAG = "AI_decode_AlbumAICodeDetectController";

    /* renamed from: a  reason: collision with root package name */
    private com.etao.feimagesearch.nn.g f6578a;
    private boolean b;

    /* loaded from: classes3.dex */
    public interface b {
        void a(ArrayList<Rect> arrayList);
    }

    /* loaded from: classes3.dex */
    public static final class e implements f.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;

        public e(String str) {
            this.b = str;
        }

        @Override // com.etao.feimagesearch.nn.f.b
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                a.a(a.this, this.b);
            }
        }
    }

    static {
        kge.a(604357577);
        Companion = new C0219a(null);
    }

    /* renamed from: com.etao.feimagesearch.capture.scan.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0219a {
        static {
            kge.a(990791633);
        }

        private C0219a() {
        }

        public /* synthetic */ C0219a(o oVar) {
            this();
        }
    }

    public static final /* synthetic */ void a(a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6847ebdc", new Object[]{aVar, str});
        } else {
            aVar.c(str);
        }
    }

    public final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }

    public final boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.b;
    }

    public final void a(String activityHashCode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, activityHashCode});
            return;
        }
        q.c(activityHashCode, "activityHashCode");
        cot.c(TAG, "prepare-----");
        com.etao.feimagesearch.nn.f.Companion.a().a("plt_code_detect", new e(activityHashCode));
    }

    private final void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        NetConfig netConfig = new NetConfig("plt_code_detect", "plt_code_detect", "", "");
        if (this.f6578a == null) {
            this.f6578a = new com.etao.feimagesearch.nn.g(netConfig.type, str);
        }
        com.etao.feimagesearch.nn.g gVar = this.f6578a;
        if (gVar == null) {
            return;
        }
        gVar.a(netConfig, new d());
    }

    /* loaded from: classes3.dex */
    public static final class d implements com.etao.feimagesearch.nn.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.etao.feimagesearch.nn.e
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            }
        }

        @Override // com.etao.feimagesearch.nn.e
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            }
        }

        public d() {
        }

        @Override // com.etao.feimagesearch.nn.e
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            cot.c(a.TAG, "onBuildSucceed");
            a.this.a(true);
        }

        @Override // com.etao.feimagesearch.nn.e
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("596b2eb", new Object[]{this});
                return;
            }
            cot.c(a.TAG, "onMainBuildFailed");
            a.this.a(false);
        }
    }

    public final void a(Bitmap bitmap, String strategy, b callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("667fe4ec", new Object[]{this, bitmap, strategy, callback});
            return;
        }
        q.c(bitmap, "bitmap");
        q.c(strategy, "strategy");
        q.c(callback, "callback");
        if (!this.b) {
            callback.a(null);
        }
        c cVar = new c(bitmap, strategy, callback);
        com.etao.feimagesearch.nn.g gVar = this.f6578a;
        if (gVar != null) {
            gVar.a("plt_code_detect", "plt_code_detect", (Object) null, cVar);
        } else {
            callback.a(null);
        }
    }

    public final void b(String activityHashCode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, activityHashCode});
            return;
        }
        q.c(activityHashCode, "activityHashCode");
        this.b = false;
        com.etao.feimagesearch.nn.g gVar = this.f6578a;
        if (gVar != null) {
            gVar.b();
        }
        this.f6578a = null;
    }

    /* loaded from: classes3.dex */
    public static final class c implements com.etao.feimagesearch.nn.j<com.etao.feimagesearch.mnn.decode.b, com.etao.feimagesearch.mnn.decode.c> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final Bitmap f6579a;
        private final String b;
        private final b c;

        static {
            kge.a(-447743325);
            kge.a(12920176);
        }

        @Override // com.etao.feimagesearch.nn.j
        public /* bridge */ /* synthetic */ void b(com.etao.feimagesearch.mnn.decode.c cVar) {
        }

        @Override // com.etao.feimagesearch.nn.j
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            }
        }

        public com.etao.feimagesearch.mnn.decode.c e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (com.etao.feimagesearch.mnn.decode.c) ipChange.ipc$dispatch("20718b6a", new Object[]{this});
            }
            return null;
        }

        public c(Bitmap bitmap, String strategy, b callback) {
            q.c(bitmap, "bitmap");
            q.c(strategy, "strategy");
            q.c(callback, "callback");
            this.f6579a = bitmap;
            this.b = strategy;
            this.c = callback;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.etao.feimagesearch.mnn.decode.b, java.lang.Object] */
        @Override // com.etao.feimagesearch.nn.j
        public /* synthetic */ com.etao.feimagesearch.mnn.decode.b b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("43b9c269", new Object[]{this}) : a();
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.etao.feimagesearch.mnn.decode.c, java.lang.Object] */
        @Override // com.etao.feimagesearch.nn.j
        public /* synthetic */ com.etao.feimagesearch.mnn.decode.c f() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("5dd0ace5", new Object[]{this}) : e();
        }

        public com.etao.feimagesearch.mnn.decode.b a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (com.etao.feimagesearch.mnn.decode.b) ipChange.ipc$dispatch("edf0df47", new Object[]{this}) : new com.etao.feimagesearch.mnn.decode.b(this.f6579a, this.b);
        }

        @Override // com.etao.feimagesearch.nn.j
        public void a(com.etao.feimagesearch.mnn.decode.c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c5385266", new Object[]{this, cVar});
            } else if (cVar != null) {
                this.c.a(cVar.a());
            } else {
                this.c.a(null);
            }
        }

        @Override // com.etao.feimagesearch.nn.j
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            } else {
                this.c.a(null);
            }
        }
    }
}
