package com.taobao.update.dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes9.dex */
public class a extends Dialog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private DialogInterface.OnClickListener f23380a;
    private DialogInterface.OnClickListener b;

    static {
        kge.a(-1791838259);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        if (str.hashCode() == -340027132) {
            super.show();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ DialogInterface.OnClickListener a(a aVar, DialogInterface.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DialogInterface.OnClickListener) ipChange.ipc$dispatch("727f1a20", new Object[]{aVar, onClickListener});
        }
        aVar.b = onClickListener;
        return onClickListener;
    }

    public static /* synthetic */ DialogInterface.OnClickListener b(a aVar, DialogInterface.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DialogInterface.OnClickListener) ipChange.ipc$dispatch("69e2a3f", new Object[]{aVar, onClickListener});
        }
        aVar.f23380a = onClickListener;
        return onClickListener;
    }

    @Override // android.app.Dialog
    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            return;
        }
        super.show();
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.dimAmount = 0.0f;
        attributes.width = px2dip(getContext(), 560.0f);
        attributes.height = px2dip(getContext(), 840.0f);
        getWindow().setAttributes(attributes);
        getWindow().setBackgroundDrawableResource(17170445);
    }

    public static int dip2px(Context context, float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8536afc1", new Object[]{context, new Float(f)})).intValue() : (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int px2dip(Context context, float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("64b9c813", new Object[]{context, new Float(f)})).intValue() : (int) (f * (context.getResources().getDisplayMetrics().density / 2.0f));
    }

    private a(Context context) {
        super(context);
    }

    /* renamed from: com.taobao.update.dialog.a$a  reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    public static class C1007a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private Context f23381a;
        private String b;
        private String c;
        private String d;
        private View e;
        private DialogInterface.OnClickListener f;
        private DialogInterface.OnClickListener g;

        static {
            kge.a(-167808604);
        }

        public static /* synthetic */ DialogInterface.OnClickListener a(C1007a c1007a) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DialogInterface.OnClickListener) ipChange.ipc$dispatch("976ed10a", new Object[]{c1007a}) : c1007a.g;
        }

        public static /* synthetic */ DialogInterface.OnClickListener b(C1007a c1007a) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DialogInterface.OnClickListener) ipChange.ipc$dispatch("3eeaaacb", new Object[]{c1007a}) : c1007a.f;
        }

        public C1007a(Context context) {
            this.f23381a = context;
        }

        public C1007a setMessage(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C1007a) ipChange.ipc$dispatch("56588025", new Object[]{this, str});
            }
            this.c = str;
            return this;
        }

        public C1007a setMessage(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C1007a) ipChange.ipc$dispatch("2ad858a4", new Object[]{this, new Integer(i)});
            }
            this.c = (String) this.f23381a.getText(i);
            return this;
        }

        public C1007a setTitle(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C1007a) ipChange.ipc$dispatch("8cfe35", new Object[]{this, new Integer(i)});
            }
            this.b = (String) this.f23381a.getText(i);
            return this;
        }

        public C1007a setTitle(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C1007a) ipChange.ipc$dispatch("7c838eb4", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }

        public C1007a setContentView(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C1007a) ipChange.ipc$dispatch("59e3106c", new Object[]{this, view});
            }
            this.e = view;
            return this;
        }

        public C1007a setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C1007a) ipChange.ipc$dispatch("53d1117d", new Object[]{this, new Integer(i), onClickListener});
            }
            this.d = (String) this.f23381a.getText(i);
            this.f = onClickListener;
            return this;
        }

        public C1007a setPositiveButton(String str, DialogInterface.OnClickListener onClickListener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C1007a) ipChange.ipc$dispatch("943ee5ac", new Object[]{this, str, onClickListener});
            }
            this.d = str;
            this.f = onClickListener;
            return this;
        }

        public C1007a setNegativeButton(DialogInterface.OnClickListener onClickListener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C1007a) ipChange.ipc$dispatch("8c00909e", new Object[]{this, onClickListener});
            }
            this.g = onClickListener;
            return this;
        }

        public a create() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("6ff89175", new Object[]{this});
            }
            final a aVar = new a(this.f23381a);
            View inflate = ((LayoutInflater) this.f23381a.getSystemService("layout_inflater")).inflate(R.layout.custom_update_dialog, (ViewGroup) null);
            aVar.addContentView(inflate, new ViewGroup.LayoutParams(-1, -2));
            View findViewById = inflate.findViewById(R.id.card_view);
            DialogInterface.OnClickListener onClickListener = this.g;
            if (onClickListener != null) {
                a.a(aVar, onClickListener);
            }
            DialogInterface.OnClickListener onClickListener2 = this.f;
            if (onClickListener2 != null) {
                a.b(aVar, onClickListener2);
            }
            aVar.setCanceledOnTouchOutside(true);
            aVar.setCancelable(true);
            aVar.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.taobao.update.dialog.a.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnCancelListener
                public void onCancel(DialogInterface dialogInterface) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f4ed3926", new Object[]{this, dialogInterface});
                        return;
                    }
                    dialogInterface.dismiss();
                    if (C1007a.a(C1007a.this) == null) {
                        return;
                    }
                    C1007a.a(C1007a.this).onClick(dialogInterface, -2);
                }
            });
            inflate.findViewById(R.id.close_btn).setOnClickListener(new View.OnClickListener() { // from class: com.taobao.update.dialog.a.a.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    aVar.dismiss();
                    if (C1007a.a(C1007a.this) == null) {
                        return;
                    }
                    C1007a.a(C1007a.this).onClick(aVar, -2);
                }
            });
            if (this.f != null) {
                findViewById.findViewById(R.id.image_button).setOnClickListener(new View.OnClickListener() { // from class: com.taobao.update.dialog.a.a.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                            return;
                        }
                        aVar.dismiss();
                        C1007a.b(C1007a.this).onClick(aVar, -1);
                    }
                });
            }
            if (!TextUtils.isEmpty(this.c)) {
                ((TextView) inflate.findViewById(R.id.text_content)).setText(this.c);
            }
            aVar.setContentView(inflate);
            return aVar;
        }
    }
}
