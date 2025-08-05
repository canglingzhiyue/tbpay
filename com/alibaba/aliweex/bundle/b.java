package com.alibaba.aliweex.bundle;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.alibaba.aliweex.bundle.k;
import com.alibaba.aliweex.bundle.m;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class b {
    static {
        kge.a(1782649258);
    }

    /* renamed from: com.alibaba.aliweex.bundle.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0062b implements m.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private ProgressBar f2009a;

        static {
            kge.a(-923481263);
            kge.a(-1275428669);
        }

        @Override // com.alibaba.aliweex.bundle.m.c
        public View a(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("876fa4a2", new Object[]{this, context});
            }
            ProgressBar progressBar = new ProgressBar(context);
            this.f2009a = progressBar;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            progressBar.setLayoutParams(layoutParams);
            return progressBar;
        }

        @Override // com.alibaba.aliweex.bundle.m.c
        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            int i = 0;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                return;
            }
            ProgressBar progressBar = this.f2009a;
            if (progressBar == null) {
                return;
            }
            if (!z) {
                i = 8;
            }
            progressBar.setVisibility(i);
        }
    }

    /* loaded from: classes2.dex */
    public static class a implements k.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private i f2007a;
        private k.e b;

        static {
            kge.a(1110034995);
            kge.a(1325338289);
        }

        public static /* synthetic */ k.e a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (k.e) ipChange.ipc$dispatch("da01a301", new Object[]{aVar}) : aVar.b;
        }

        public a(k.e eVar) {
            this.b = eVar;
        }

        @Override // com.alibaba.aliweex.bundle.k.d
        public void a(Context context, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e8ef3872", new Object[]{this, context, view});
            } else if (this.f2007a != null || view == null) {
            } else {
                this.f2007a = new i(context, view);
                this.f2007a.a();
                this.f2007a.a(new View.OnClickListener() { // from class: com.alibaba.aliweex.bundle.b.a.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                            return;
                        }
                        if (a.a(a.this) != null) {
                            a.a(a.this).a();
                        }
                        a.this.a(false, (String) null);
                    }
                });
            }
        }

        @Override // com.alibaba.aliweex.bundle.k.d
        public void a(boolean z, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f7197a36", new Object[]{this, new Boolean(z), str});
                return;
            }
            i iVar = this.f2007a;
            if (iVar == null) {
                return;
            }
            if (z) {
                iVar.a(str);
            } else {
                iVar.a();
            }
        }

        @Override // com.alibaba.aliweex.bundle.k.d
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            i iVar = this.f2007a;
            if (iVar == null) {
                return;
            }
            iVar.b();
        }
    }
}
