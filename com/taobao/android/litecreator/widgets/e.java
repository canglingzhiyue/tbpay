package com.taobao.android.litecreator.widgets;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.b;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.kge;

/* loaded from: classes5.dex */
public class e extends android.support.v7.app.b {
    static {
        kge.a(745698442);
    }

    public e(Context context) {
        super(context);
    }

    /* loaded from: classes5.dex */
    public static class a extends b.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private View f13532a;
        private TextView b;
        private TextView c;
        private TextView d;
        private TUrlImageView e;
        private TextView f;
        private TextView g;
        private DialogInterface.OnClickListener h;
        private DialogInterface.OnClickListener i;
        private DialogInterface.OnClickListener j;
        private String k;
        private FrameLayout l;

        static {
            kge.a(-1773592223);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == -643129034) {
                return super.b();
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public static /* synthetic */ DialogInterface.OnClickListener a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DialogInterface.OnClickListener) ipChange.ipc$dispatch("dc4f1196", new Object[]{aVar}) : aVar.j;
        }

        public static /* synthetic */ DialogInterface.OnClickListener b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DialogInterface.OnClickListener) ipChange.ipc$dispatch("c064597", new Object[]{aVar}) : aVar.i;
        }

        public static /* synthetic */ DialogInterface.OnClickListener c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DialogInterface.OnClickListener) ipChange.ipc$dispatch("3bbd7998", new Object[]{aVar}) : aVar.h;
        }

        public a(Context context) {
            super(context, R.style.LCCustomDialog);
            this.f13532a = LayoutInflater.from(context).inflate(R.layout.lay_lc_custom_dialog, (ViewGroup) null);
            b(this.f13532a);
            this.b = (TextView) this.f13532a.findViewById(R.id.umi_custom_dialog_content);
            this.c = (TextView) this.f13532a.findViewById(R.id.umi_custom_dialog_sub_content);
            this.d = (TextView) this.f13532a.findViewById(R.id.umi_custom_dialog_sub_url_content);
            this.e = (TUrlImageView) this.f13532a.findViewById(R.id.umi_custom_dialog_cover);
            this.f = (TextView) this.f13532a.findViewById(R.id.umi_custom_dialog_negative_btn);
            this.g = (TextView) this.f13532a.findViewById(R.id.umi_custom_dialog_positive_btn);
            this.l = (FrameLayout) this.f13532a.findViewById(R.id.umi_custom_dialog_close_btn);
        }

        @Override // android.support.v7.app.b.a
        public b.a b(CharSequence charSequence) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b.a) ipChange.ipc$dispatch("a9b70135", new Object[]{this, charSequence});
            }
            if (!TextUtils.isEmpty(charSequence)) {
                this.b.setText(charSequence);
                this.b.setVisibility(0);
            }
            return this;
        }

        public a c(CharSequence charSequence) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("d5b19bf9", new Object[]{this, charSequence});
            }
            if (!TextUtils.isEmpty(charSequence)) {
                this.c.setText(charSequence);
                this.c.setVisibility(0);
            }
            return this;
        }

        public a d(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("7b7da24f", new Object[]{this, new Integer(i)});
            }
            this.c.setGravity(i);
            return this;
        }

        public a d(CharSequence charSequence) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("57fc50d8", new Object[]{this, charSequence});
            }
            if (!TextUtils.isEmpty(charSequence)) {
                this.d.setText(charSequence);
                this.d.setVisibility(0);
                this.d.setMovementMethod(LinkMovementMethod.getInstance());
            }
            return this;
        }

        @Override // android.support.v7.app.b.a
        public b.a b(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (b.a) ipChange.ipc$dispatch("351d4e68", new Object[]{this, new Integer(i)}) : b(a().getText(i));
        }

        @Override // android.support.v7.app.b.a
        public b.a a(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            IpChange ipChange = $ipChange;
            int i = 0;
            if (ipChange instanceof IpChange) {
                return (b.a) ipChange.ipc$dispatch("d8be2801", new Object[]{this, charSequence, onClickListener});
            }
            TextView textView = this.g;
            if (TextUtils.isEmpty(charSequence)) {
                i = 8;
            }
            textView.setVisibility(i);
            this.g.setText(charSequence);
            this.h = onClickListener;
            return this;
        }

        @Override // android.support.v7.app.b.a
        public b.a a(int i, DialogInterface.OnClickListener onClickListener) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (b.a) ipChange.ipc$dispatch("deb1cc10", new Object[]{this, new Integer(i), onClickListener}) : a(a().getText(i), onClickListener);
        }

        @Override // android.support.v7.app.b.a
        public b.a b(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            IpChange ipChange = $ipChange;
            int i = 0;
            if (ipChange instanceof IpChange) {
                return (b.a) ipChange.ipc$dispatch("dc45cb02", new Object[]{this, charSequence, onClickListener});
            }
            TextView textView = this.f;
            if (TextUtils.isEmpty(charSequence)) {
                i = 8;
            }
            textView.setVisibility(i);
            this.f.setText(charSequence);
            this.i = onClickListener;
            return this;
        }

        @Override // android.support.v7.app.b.a
        public b.a b(int i, DialogInterface.OnClickListener onClickListener) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (b.a) ipChange.ipc$dispatch("d63362f", new Object[]{this, new Integer(i), onClickListener}) : b(a().getText(i), onClickListener);
        }

        public b.a a(DialogInterface.OnClickListener onClickListener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b.a) ipChange.ipc$dispatch("2d13f15d", new Object[]{this, onClickListener});
            }
            this.j = onClickListener;
            return this;
        }

        public a c(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("7bf4084e", new Object[]{this, new Integer(i)});
            }
            LinearLayout linearLayout = (LinearLayout) this.f13532a.findViewById(R.id.dialogContentView);
            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            layoutParams.width = i;
            linearLayout.setLayoutParams(layoutParams);
            return this;
        }

        @Override // android.support.v7.app.b.a
        public android.support.v7.app.b b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (android.support.v7.app.b) ipChange.ipc$dispatch("d9aaa136", new Object[]{this});
            }
            final android.support.v7.app.b b = super.b();
            if (TextUtils.isEmpty(this.k)) {
                this.e.setVisibility(8);
            } else {
                this.e.setVisibility(0);
                this.e.setImageUrl(this.k);
            }
            if (this.j == null) {
                this.l.setVisibility(8);
            } else {
                this.l.setVisibility(0);
                this.l.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.litecreator.widgets.e.a.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                            return;
                        }
                        b.dismiss();
                        if (a.a(a.this) == null) {
                            return;
                        }
                        a.a(a.this).onClick(b, -2);
                    }
                });
            }
            this.f.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.litecreator.widgets.e.a.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    b.dismiss();
                    if (a.b(a.this) == null) {
                        return;
                    }
                    a.b(a.this).onClick(b, -2);
                }
            });
            this.g.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.litecreator.widgets.e.a.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    b.dismiss();
                    if (a.c(a.this) == null) {
                        return;
                    }
                    a.c(a.this).onClick(b, -1);
                }
            });
            return b;
        }
    }
}
