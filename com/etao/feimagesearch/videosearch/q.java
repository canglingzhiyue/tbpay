package com.etao.feimagesearch.videosearch;

import android.app.Activity;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.kge;

/* loaded from: classes4.dex */
public final class q {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final String VOLUME_OFF_URL = "https://img.alicdn.com/tfs/TB18swCnSR26e4jSZFEXXbwuXXa-128-128.png";
    public static final String VOLUME_ON_URL = "https://img.alicdn.com/tfs/TB10VdaoRFR4u4jSZFPXXanzFXa-128-128.png";

    /* renamed from: a  reason: collision with root package name */
    private b f7089a;
    private boolean b;
    private TUrlImageView c;

    /* loaded from: classes4.dex */
    public interface b {
        void a(boolean z);
    }

    static {
        kge.a(-1177991599);
        Companion = new a(null);
    }

    /* loaded from: classes4.dex */
    public static final class a {
        static {
            kge.a(-178896807);
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }
    }

    public q(Activity activity) {
        kotlin.jvm.internal.q.c(activity, "activity");
        View findViewById = activity.findViewById(R.id.btn_volume);
        kotlin.jvm.internal.q.a((Object) findViewById, "activity.findViewById(R.id.btn_volume)");
        this.c = (TUrlImageView) findViewById;
        this.c.setImageUrl(VOLUME_OFF_URL);
        this.c.setOnClickListener(new View.OnClickListener() { // from class: com.etao.feimagesearch.videosearch.q.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                q qVar = q.this;
                q.a(qVar, !q.a(qVar));
                q.b(q.this).setImageUrl(q.a(q.this) ? q.VOLUME_ON_URL : q.VOLUME_OFF_URL);
                b a2 = q.this.a();
                if (a2 == null) {
                    return;
                }
                a2.a(q.a(q.this));
            }
        });
    }

    public static final /* synthetic */ void a(q qVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f64d4d3", new Object[]{qVar, new Boolean(z)});
        } else {
            qVar.b = z;
        }
    }

    public static final /* synthetic */ boolean a(q qVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("74a02225", new Object[]{qVar})).booleanValue() : qVar.b;
    }

    public static final /* synthetic */ TUrlImageView b(q qVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TUrlImageView) ipChange.ipc$dispatch("4a2d7bda", new Object[]{qVar}) : qVar.c;
    }

    public final b a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("46b9b69", new Object[]{this}) : this.f7089a;
    }

    public final void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbf58a63", new Object[]{this, bVar});
        } else {
            this.f7089a = bVar;
        }
    }
}
