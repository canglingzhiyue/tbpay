package com.alibaba.android.ultron.ext.event.widget;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes2.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f2624a;
    private Dialog b;
    private View c;
    private View d;
    private View e;
    private ImageView f;
    private TextView g;
    private View h;
    private TextView i;
    private TextView j;
    private TextView k;
    private InterfaceC0090a l;

    /* renamed from: com.alibaba.android.ultron.ext.event.widget.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0090a {
        void a(DialogInterface dialogInterface);

        void b(DialogInterface dialogInterface);
    }

    static {
        kge.a(-170282869);
    }

    public static /* synthetic */ InterfaceC0090a a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (InterfaceC0090a) ipChange.ipc$dispatch("12fc1b87", new Object[]{aVar}) : aVar.l;
    }

    public static /* synthetic */ Dialog b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Dialog) ipChange.ipc$dispatch("87f2ac8a", new Object[]{aVar}) : aVar.b;
    }

    public a(Context context) {
        this.f2624a = context;
        this.b = new Dialog(context, R.style.CommonAlertDialog);
        this.c = LayoutInflater.from(context.getApplicationContext()).inflate(R.layout.common_dialog_comfirm, (ViewGroup) null);
        this.d = this.c.findViewById(R.id.ack_dialog_confirm_container);
        this.e = this.c.findViewById(R.id.ack_dialog_confirm_title_container);
        this.f = (ImageView) this.c.findViewById(R.id.ack_dialog_confirm_title_icon);
        this.g = (TextView) this.c.findViewById(R.id.ack_dialog_confirm_title);
        this.h = this.c.findViewById(R.id.ack_dialog_confirm_title_split_line);
        this.i = (TextView) this.c.findViewById(R.id.ack_dialog_confirm_message);
        this.j = (TextView) this.c.findViewById(R.id.ack_dialog_confirm_bnt_cancel);
        this.k = (TextView) this.c.findViewById(R.id.ack_dialog_confirm_bnt_sure);
        this.b.setContentView(this.c);
    }

    public a a(String str) {
        TextView textView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("3a51e290", new Object[]{this, str});
        }
        if (!StringUtils.isEmpty(str) && this.b != null && (textView = this.g) != null) {
            textView.setText(str);
            this.g.setVisibility(0);
        } else {
            this.g.setVisibility(8);
        }
        return this;
    }

    public a a(CharSequence charSequence) {
        TextView textView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("87dac1ea", new Object[]{this, charSequence});
        }
        if (this.b != null && (textView = this.i) != null) {
            textView.setText(charSequence);
        }
        return this;
    }

    public a b(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("bb88ecab", new Object[]{this, charSequence});
        }
        if (!StringUtils.isEmpty(charSequence)) {
            this.j.setText(charSequence);
            this.j.setVisibility(0);
        } else {
            this.j.setVisibility(8);
        }
        return this;
    }

    public a c(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("ef37176c", new Object[]{this, charSequence});
        }
        if (!StringUtils.isEmpty(charSequence)) {
            this.k.setText(charSequence);
            this.k.setVisibility(0);
        } else {
            this.k.setVisibility(8);
        }
        return this;
    }

    public a a(InterfaceC0090a interfaceC0090a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("cc629847", new Object[]{this, interfaceC0090a});
        }
        if (this.b != null) {
            this.l = interfaceC0090a;
            this.j.setOnClickListener(new View.OnClickListener() { // from class: com.alibaba.android.ultron.ext.event.widget.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else if (a.a(a.this) == null) {
                    } else {
                        a.a(a.this).b(a.b(a.this));
                    }
                }
            });
            this.k.setOnClickListener(new View.OnClickListener() { // from class: com.alibaba.android.ultron.ext.event.widget.a.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else if (a.a(a.this) == null) {
                    } else {
                        a.a(a.this).a(a.b(a.this));
                    }
                }
            });
        }
        return this;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
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
