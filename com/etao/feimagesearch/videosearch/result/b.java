package com.etao.feimagesearch.videosearch.result;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.ui.CornerImageView;
import com.etao.feimagesearch.util.e;
import com.taobao.taobao.R;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.cud;
import tb.kge;

/* loaded from: classes4.dex */
public final class b extends com.etao.feimagesearch.videosearch.b<cud> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final String TAG = "VideoSearch_NewResultThumbViewHolder";

    /* renamed from: a  reason: collision with root package name */
    private final Context f7094a;
    private final CornerImageView b;
    private final CornerImageView c;
    private final View d;
    private final ExecutorService e;
    private final Handler f;

    /* renamed from: com.etao.feimagesearch.videosearch.result.b$b  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class RunnableC0253b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Bitmap b;

        public RunnableC0253b(Bitmap bitmap) {
            this.b = bitmap;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                Context a2 = b.a(b.this);
                Bitmap originBitmap = this.b;
                q.a((Object) originBitmap, "originBitmap");
                Bitmap originBitmap2 = this.b;
                q.a((Object) originBitmap2, "originBitmap");
                int width = originBitmap2.getWidth();
                Bitmap originBitmap3 = this.b;
                q.a((Object) originBitmap3, "originBitmap");
                final Bitmap a3 = e.a(a2, originBitmap, null, width, originBitmap3.getHeight());
                b.b(b.this).post(new Runnable() { // from class: com.etao.feimagesearch.videosearch.result.b.b.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public final void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            b.c(b.this).setImageBitmap(a3);
                        }
                    }
                });
            } catch (Exception unused) {
            }
        }
    }

    static {
        kge.a(1730494497);
        Companion = new a(null);
    }

    /* loaded from: classes4.dex */
    public static final class a {
        static {
            kge.a(1486894633);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, View itemView, ExecutorService executor) {
        super(itemView);
        q.c(context, "context");
        q.c(itemView, "itemView");
        q.c(executor, "executor");
        this.f7094a = context;
        View findViewById = itemView.findViewById(R.id.iv_image);
        q.a((Object) findViewById, "itemView.findViewById(co…earch_core.R.id.iv_image)");
        this.b = (CornerImageView) findViewById;
        View findViewById2 = itemView.findViewById(R.id.iv_image_blur);
        q.a((Object) findViewById2, "itemView.findViewById(co…_core.R.id.iv_image_blur)");
        this.c = (CornerImageView) findViewById2;
        View findViewById3 = itemView.findViewById(R.id.view_selected);
        q.a((Object) findViewById3, "itemView.findViewById(co…_core.R.id.view_selected)");
        this.d = findViewById3;
        this.e = executor;
        this.f = new Handler(Looper.getMainLooper());
    }

    public static final /* synthetic */ Context a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("ea3c4a26", new Object[]{bVar}) : bVar.f7094a;
    }

    public static final /* synthetic */ Handler b(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("8dfe8e59", new Object[]{bVar}) : bVar.f;
    }

    public static final /* synthetic */ CornerImageView c(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CornerImageView) ipChange.ipc$dispatch("e83a60de", new Object[]{bVar}) : bVar.c;
    }

    public void a(cud data) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e423e766", new Object[]{this, data});
            return;
        }
        q.c(data, "data");
        if (com.etao.feimagesearch.config.b.p() || StringUtils.isEmpty(data.k)) {
            this.b.setImageUrl(data.e);
        } else {
            this.b.setImageUrl(data.k);
        }
        if (data.p != null) {
            Bitmap originBitmap = data.p;
            q.a((Object) originBitmap, "originBitmap");
            if (originBitmap.getHeight() == originBitmap.getWidth()) {
                this.c.setImageBitmap(originBitmap);
            } else {
                this.e.execute(new RunnableC0253b(originBitmap));
            }
        }
        if (data.h) {
            this.d.setVisibility(0);
        } else {
            this.d.setVisibility(8);
        }
    }
}
