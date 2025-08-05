package com.alibaba.security.realidentity;

import android.app.Dialog;
import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* loaded from: classes3.dex */
public class z4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Dialog f3616a;

    /* loaded from: classes3.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f3617a;

        public a(c cVar) {
            this.f3617a = cVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                c.c(this.f3617a).a(z4.a(z4.this));
            }
        }
    }

    /* loaded from: classes3.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f3618a;

        public b(c cVar) {
            this.f3618a = cVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                c.e(this.f3618a).a(z4.a(z4.this));
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public Context f3619a;
        public String b;
        public String c;
        public String d;
        public int e;
        public int f;
        public int g;
        public int k;
        public int n;
        public boolean h = true;
        public boolean i = false;
        public String j = "";
        public e l = new a();
        public String m = "";
        public d o = new b();

        /* loaded from: classes3.dex */
        public class a implements e {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // com.alibaba.security.realidentity.z4.e
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

            @Override // com.alibaba.security.realidentity.z4.d
            public void a(Dialog dialog) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("a5396921", new Object[]{this, dialog});
                }
            }
        }

        public c(Context context) {
            this.f3619a = context;
            this.e = ContextCompat.getColor(context, R.color.rpsdk_common_text);
            this.f = ContextCompat.getColor(context, R.color.rpsdk_gray_light);
            this.g = ContextCompat.getColor(context, R.color.rpsdk_common_text);
            this.k = ContextCompat.getColor(context, R.color.rpsdk_identity_primary);
            this.n = ContextCompat.getColor(context, R.color.rpsdk_gray_light);
        }

        public static /* synthetic */ Context a(c cVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("8cf9cb71", new Object[]{cVar}) : cVar.f3619a;
        }

        public static /* synthetic */ int b(c cVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("149ec9ed", new Object[]{cVar})).intValue() : cVar.e;
        }

        public static /* synthetic */ e c(c cVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("279e26ca", new Object[]{cVar}) : cVar.l;
        }

        public static /* synthetic */ String d(c cVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("edd9fd24", new Object[]{cVar}) : cVar.m;
        }

        public static /* synthetic */ d e(c cVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("b79ce369", new Object[]{cVar}) : cVar.o;
        }

        public static /* synthetic */ boolean f(c cVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7f21d402", new Object[]{cVar})).booleanValue() : cVar.h;
        }

        public static /* synthetic */ boolean g(c cVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("19c29683", new Object[]{cVar})).booleanValue() : cVar.i;
        }

        public static /* synthetic */ int h(c cVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b46358f3", new Object[]{cVar})).intValue() : cVar.f;
        }

        public static /* synthetic */ int i(c cVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4f041b74", new Object[]{cVar})).intValue() : cVar.g;
        }

        public static /* synthetic */ int j(c cVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e9a4ddf5", new Object[]{cVar})).intValue() : cVar.k;
        }

        public static /* synthetic */ int k(c cVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8445a076", new Object[]{cVar})).intValue() : cVar.n;
        }

        public static /* synthetic */ String l(c cVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8fcd7a1c", new Object[]{cVar}) : cVar.b;
        }

        public static /* synthetic */ String m(c cVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("240be9bb", new Object[]{cVar}) : cVar.c;
        }

        public static /* synthetic */ String n(c cVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b84a595a", new Object[]{cVar}) : cVar.d;
        }

        public static /* synthetic */ String o(c cVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4c88c8f9", new Object[]{cVar}) : cVar.j;
        }

        public z4 a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (z4) ipChange.ipc$dispatch("3c861f9e", new Object[]{this}) : new z4(this);
        }

        public c b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("8dd42694", new Object[]{this, str});
            }
            this.c = str;
            return this;
        }

        public c c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("22129633", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }

        public c a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("f995b6f5", new Object[]{this, str});
            }
            this.d = str;
            return this;
        }

        public c a(boolean z, boolean z2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("b50bf57f", new Object[]{this, new Boolean(z), new Boolean(z2)});
            }
            this.h = z;
            this.i = z2;
            return this;
        }

        public c a(String str, e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("8a94ea46", new Object[]{this, str, eVar});
            }
            this.j = str;
            this.l = eVar;
            return this;
        }

        public c a(String str, d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("a5537b85", new Object[]{this, str, dVar});
            }
            this.m = str;
            this.o = dVar;
            return this;
        }

        public c a(int i, int i2, int i3, int i4, int i5) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("9ad6502c", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
            }
            this.e = i;
            this.f = i2;
            this.g = i3;
            this.k = i4;
            this.n = i5;
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

    public z4(c cVar) {
        Dialog dialog = new Dialog(c.a(cVar));
        this.f3616a = dialog;
        dialog.requestWindowFeature(1);
        View inflate = LayoutInflater.from(c.a(cVar)).inflate(R.layout.rp_alrealidentity_alert_dialog, (ViewGroup) null);
        this.f3616a.setContentView(inflate);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(this.f3616a.getWindow().getAttributes());
        layoutParams.width = -1;
        layoutParams.height = -2;
        layoutParams.gravity = 17;
        this.f3616a.getWindow().setAttributes(layoutParams);
        TextView textView = (TextView) inflate.findViewById(R.id.rp_dialog_title_text);
        TextView textView2 = (TextView) inflate.findViewById(R.id.rp_dialog_subtitle_text);
        TextView textView3 = (TextView) inflate.findViewById(R.id.rp_dialog_content_text);
        Button button = (Button) inflate.findViewById(R.id.rp_dialog_positive_btn);
        Button button2 = (Button) inflate.findViewById(R.id.rp_dialog_negative_btn);
        textView.setTextColor(c.b(cVar));
        textView2.setTextColor(c.h(cVar));
        textView3.setTextColor(c.i(cVar));
        button.setTextColor(c.j(cVar));
        button2.setTextColor(c.k(cVar));
        if (TextUtils.isEmpty(c.l(cVar))) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(c.l(cVar));
        }
        if (TextUtils.isEmpty(c.m(cVar))) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            textView2.setText(c.m(cVar));
        }
        if (TextUtils.isEmpty(c.n(cVar))) {
            textView3.setVisibility(8);
        } else {
            textView3.setVisibility(0);
            textView3.setText(c.n(cVar));
        }
        if (TextUtils.isEmpty(c.o(cVar))) {
            button.setVisibility(8);
        } else {
            button.setVisibility(0);
            button.setText(c.o(cVar));
            button.setOnClickListener(new a(cVar));
        }
        if (TextUtils.isEmpty(c.d(cVar))) {
            button2.setVisibility(8);
        } else {
            button2.setVisibility(0);
            button2.setText(c.d(cVar));
            button2.setOnClickListener(new b(cVar));
        }
        this.f3616a.setCancelable(c.f(cVar));
        this.f3616a.setCanceledOnTouchOutside(c.g(cVar));
        this.f3616a.show();
    }

    public static /* synthetic */ Dialog a(z4 z4Var) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Dialog) ipChange.ipc$dispatch("15182af7", new Object[]{z4Var}) : z4Var.f3616a;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        Dialog dialog = this.f3616a;
        if (dialog == null) {
            return;
        }
        dialog.dismiss();
    }
}
