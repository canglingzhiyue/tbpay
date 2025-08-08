package com.alibaba.android.icart.core.widget;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes2.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f2375a;
    private Dialog b;
    private View c;
    private View d;
    private View e;
    private ImageView f;
    private TextView g;
    private View h;
    private TextView i;
    private View j;
    private TextView k;
    private TextView l;
    private TextView m;
    private InterfaceC0081a n;

    /* renamed from: com.alibaba.android.icart.core.widget.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0081a {
        void a(DialogInterface dialogInterface);

        void b(DialogInterface dialogInterface);
    }

    static {
        kge.a(1019082594);
    }

    public static /* synthetic */ Dialog a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Dialog) ipChange.ipc$dispatch("6b661b35", new Object[]{aVar}) : aVar.b;
    }

    public static /* synthetic */ InterfaceC0081a b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (InterfaceC0081a) ipChange.ipc$dispatch("20aa30ce", new Object[]{aVar}) : aVar.n;
    }

    public a(Context context) {
        this.f2375a = context;
        this.b = new Dialog(context, R.style.CartAlertDialog) { // from class: com.alibaba.android.icart.core.widget.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                if (str.hashCode() == -641568046) {
                    super.onCreate((Bundle) objArr[0]);
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // android.app.Dialog
            public void onCreate(Bundle bundle) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
                    return;
                }
                super.onCreate(bundle);
                try {
                    a.a(a.this);
                } catch (Throwable unused) {
                }
            }
        };
        this.c = LayoutInflater.from(context.getApplicationContext()).inflate(R.layout.icart_dialog_comfirm, (ViewGroup) null);
        this.d = this.c.findViewById(R.id.ack_dialog_confirm_container);
        this.e = this.c.findViewById(R.id.ack_dialog_confirm_title_container);
        this.f = (ImageView) this.c.findViewById(R.id.ack_dialog_confirm_title_icon);
        this.g = (TextView) this.c.findViewById(R.id.ack_dialog_confirm_title);
        this.h = this.c.findViewById(R.id.ack_dialog_simple_title_layout);
        this.i = (TextView) this.c.findViewById(R.id.ack_dialog_simple_title);
        this.j = this.c.findViewById(R.id.ack_dialog_confirm_title_split_line);
        this.k = (TextView) this.c.findViewById(R.id.ack_dialog_confirm_message);
        this.l = (TextView) this.c.findViewById(R.id.ack_dialog_confirm_bnt_cancel);
        this.m = (TextView) this.c.findViewById(R.id.ack_dialog_confirm_bnt_sure);
        this.b.setContentView(this.c);
    }

    public Dialog a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Dialog) ipChange.ipc$dispatch("28547927", new Object[]{this}) : this.b;
    }

    public a a(String str) {
        TextView textView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("bb4d0264", new Object[]{this, str});
        }
        if (this.b != null && (textView = this.g) != null) {
            textView.setText(str);
        }
        return this;
    }

    public a b(String str) {
        TextView textView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("aedc86a5", new Object[]{this, str});
        }
        if (this.b != null && (textView = this.i) != null) {
            textView.setText(str);
        }
        View view = this.e;
        if (view != null) {
            view.setVisibility(0);
        }
        View view2 = this.h;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        View view3 = this.j;
        if (view3 != null) {
            view3.setVisibility(0);
        }
        return this;
    }

    public a a(CharSequence charSequence) {
        TextView textView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("9b5eed3e", new Object[]{this, charSequence});
        }
        if (this.b != null && (textView = this.k) != null) {
            textView.setText(charSequence);
        }
        return this;
    }

    public a b(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("8cb07cbf", new Object[]{this, charSequence});
        }
        if (!StringUtils.isEmpty(charSequence)) {
            this.l.setText(charSequence);
            this.l.setVisibility(0);
        } else {
            this.l.setVisibility(8);
        }
        return this;
    }

    public a c(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("7e020c40", new Object[]{this, charSequence});
        }
        if (!StringUtils.isEmpty(charSequence)) {
            this.m.setText(charSequence);
            this.m.setVisibility(0);
        } else {
            this.m.setVisibility(8);
        }
        return this;
    }

    public a a(InterfaceC0081a interfaceC0081a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("ba0581ef", new Object[]{this, interfaceC0081a});
        }
        if (this.b != null) {
            this.n = interfaceC0081a;
            this.l.setOnClickListener(new View.OnClickListener() { // from class: com.alibaba.android.icart.core.widget.a.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else if (a.b(a.this) == null) {
                    } else {
                        a.b(a.this).b(a.a(a.this));
                    }
                }
            });
            this.m.setOnClickListener(new View.OnClickListener() { // from class: com.alibaba.android.icart.core.widget.a.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else if (a.b(a.this) == null) {
                    } else {
                        a.b(a.this).a(a.a(a.this));
                    }
                }
            });
        }
        return this;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        Dialog dialog = this.b;
        if (dialog == null) {
            return;
        }
        try {
            dialog.show();
        } catch (Exception unused) {
        }
    }
}
