package com.alibaba.security.realidentity;

import android.app.Dialog;
import android.content.Context;
import android.support.v4.content.ContextCompat;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* loaded from: classes3.dex */
public class y4 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String b = "ABAlertDialog";

    /* renamed from: a  reason: collision with root package name */
    public Dialog f3607a;

    /* loaded from: classes3.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f3608a;

        public a(c cVar) {
            this.f3608a = cVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                c.i(this.f3608a).a(y4.a(y4.this));
            }
        }
    }

    /* loaded from: classes3.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f3609a;

        public b(c cVar) {
            this.f3609a = cVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                c.k(this.f3609a).a(y4.a(y4.this));
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Context f3610a;
        public String b;
        public int c;
        public int g;
        public int j;
        public boolean d = true;
        public boolean e = false;
        public String f = "";
        public e h = new a();
        public String i = "";
        public d k = new b();

        /* loaded from: classes3.dex */
        public class a implements e {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // com.alibaba.security.realidentity.y4.e
            public void a(Dialog dialog) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("a5396921", new Object[]{this, dialog});
                }
            }
        }

        /* loaded from: classes3.dex */
        public class b implements d {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public b() {
            }

            @Override // com.alibaba.security.realidentity.y4.d
            public void a(Dialog dialog) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("a5396921", new Object[]{this, dialog});
                }
            }
        }

        public c(Context context) {
            this.f3610a = context;
            this.c = ContextCompat.getColor(context, R.color.rpsdk_color_333333);
            this.g = ContextCompat.getColor(context, R.color.rpsdk_ab_face_dialog_positive);
            this.j = ContextCompat.getColor(context, R.color.rpsdk_ab_face_dialog_negative);
        }

        public static /* synthetic */ Context a(c cVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("78110330", new Object[]{cVar}) : cVar.f3610a;
        }

        public static /* synthetic */ int b(c cVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("dfb88eac", new Object[]{cVar})).intValue() : cVar.c;
        }

        public static /* synthetic */ boolean c(c cVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7a59513e", new Object[]{cVar})).booleanValue() : cVar.d;
        }

        public static /* synthetic */ boolean d(c cVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("14fa13bf", new Object[]{cVar})).booleanValue() : cVar.e;
        }

        public static /* synthetic */ int e(c cVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("af9ad62f", new Object[]{cVar})).intValue() : cVar.g;
        }

        public static /* synthetic */ int f(c cVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4a3b98b0", new Object[]{cVar})).intValue() : cVar.j;
        }

        public static /* synthetic */ String g(c cVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ae93bd22", new Object[]{cVar}) : cVar.b;
        }

        public static /* synthetic */ String h(c cVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("42d22cc1", new Object[]{cVar}) : cVar.f;
        }

        public static /* synthetic */ e i(c cVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("1e14b7e4", new Object[]{cVar}) : cVar.h;
        }

        public static /* synthetic */ String j(c cVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6b4f0bff", new Object[]{cVar}) : cVar.i;
        }

        public static /* synthetic */ d k(c cVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("ae137483", new Object[]{cVar}) : cVar.k;
        }

        public y4 a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (y4) ipChange.ipc$dispatch("3c861bdd", new Object[]{this}) : new y4(this);
        }

        public c a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("f9879f74", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }

        public c a(boolean z, boolean z2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("b4fdddfe", new Object[]{this, new Boolean(z), new Boolean(z2)});
            }
            this.d = z;
            this.e = z2;
            return this;
        }

        public c a(String str, e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("d10f4526", new Object[]{this, str, eVar});
            }
            this.f = str;
            this.h = eVar;
            return this;
        }

        public c a(String str, d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("ebcdd665", new Object[]{this, str, dVar});
            }
            this.i = str;
            this.k = dVar;
            return this;
        }

        public c a(int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("f194a4b", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            }
            this.c = i;
            this.g = i2;
            this.j = i3;
            return this;
        }
    }

    /* loaded from: classes3.dex */
    public interface d {
        void a(Dialog dialog);
    }

    /* loaded from: classes3.dex */
    public interface e {
        void a(Dialog dialog);
    }

    public y4(c cVar) {
        Dialog dialog = new Dialog(c.a(cVar), R.style.RP_Dialog);
        this.f3607a = dialog;
        dialog.requestWindowFeature(1);
        View inflate = LayoutInflater.from(c.a(cVar)).inflate(R.layout.rp_face_dialog, (ViewGroup) null);
        this.f3607a.setContentView(inflate);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(this.f3607a.getWindow().getAttributes());
        layoutParams.width = -1;
        layoutParams.height = -2;
        layoutParams.gravity = 17;
        this.f3607a.getWindow().setAttributes(layoutParams);
        TextView textView = (TextView) inflate.findViewById(R.id.abfl_dialog_content_text);
        TextView textView2 = (TextView) inflate.findViewById(R.id.abfl_dialog_positive_btn);
        TextView textView3 = (TextView) inflate.findViewById(R.id.abfl_dialog_negative_btn);
        textView.setTextColor(c.b(cVar));
        textView2.setTextColor(c.e(cVar));
        textView3.setTextColor(c.f(cVar));
        if (StringUtils.isEmpty(c.g(cVar))) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(c.g(cVar));
        }
        if (StringUtils.isEmpty(c.h(cVar))) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            textView2.setText(c.h(cVar));
            textView2.setOnClickListener(new a(cVar));
        }
        if (StringUtils.isEmpty(c.j(cVar))) {
            textView3.setVisibility(8);
        } else {
            textView3.setVisibility(0);
            textView3.setText(c.j(cVar));
            textView3.setOnClickListener(new b(cVar));
        }
        this.f3607a.setCancelable(c.c(cVar));
        this.f3607a.setCanceledOnTouchOutside(c.d(cVar));
    }

    public static /* synthetic */ Dialog a(y4 y4Var) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Dialog) ipChange.ipc$dispatch("19169c18", new Object[]{y4Var}) : y4Var.f3607a;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        Dialog dialog = this.f3607a;
        return dialog != null && dialog.isShowing();
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        Dialog dialog = this.f3607a;
        if (dialog == null || dialog.isShowing()) {
            return;
        }
        this.f3607a.show();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        Dialog dialog = this.f3607a;
        if (dialog == null) {
            return;
        }
        dialog.dismiss();
    }
}
