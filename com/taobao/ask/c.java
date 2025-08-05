package com.taobao.ask;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.ask.utils.d;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes6.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes6.dex */
    public interface a {
        void a();
    }

    static {
        kge.a(-1458511615);
    }

    public static C0633c a(Context context, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C0633c) ipChange.ipc$dispatch("6d261274", new Object[]{context, aVar});
        }
        C0633c c0633c = new C0633c(new b(context, aVar));
        c0633c.a();
        return c0633c;
    }

    /* renamed from: com.taobao.ask.c$c  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static class C0633c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private b f16391a;

        static {
            kge.a(-1163955199);
        }

        public C0633c(b bVar) {
            this.f16391a = bVar;
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            b bVar = this.f16391a;
            if (bVar == null || bVar.isShowing()) {
                return;
            }
            this.f16391a.show();
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            b bVar = this.f16391a;
            if (bVar == null || !bVar.isShowing()) {
                return;
            }
            this.f16391a.dismiss();
        }
    }

    /* loaded from: classes6.dex */
    public static class b extends Dialog {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private a f16389a;

        static {
            kge.a(-1271463135);
        }

        public static /* synthetic */ a a(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("6d9f2a6f", new Object[]{bVar}) : bVar.f16389a;
        }

        public b(Context context, a aVar) {
            super(context, R.style.Theme_CommentDialog);
            this.f16389a = aVar;
            a(context);
        }

        @Override // android.app.Dialog
        public boolean onTouchEvent(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
            }
            if (isShowing()) {
                cancel();
            }
            return true;
        }

        private void a(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
                return;
            }
            View inflate = LayoutInflater.from(context).inflate(R.layout.comment_dialog_loading, (ViewGroup) null);
            Window window = getWindow();
            if (window != null) {
                window.setContentView(inflate);
                window.setBackgroundDrawable(new ColorDrawable(0));
                window.setLayout(-1, -1);
                d.a(window, true);
            }
            setCancelable(true);
            setCanceledOnTouchOutside(true);
            setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.taobao.ask.c.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnCancelListener
                public void onCancel(DialogInterface dialogInterface) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f4ed3926", new Object[]{this, dialogInterface});
                    } else if (b.a(b.this) == null) {
                    } else {
                        b.a(b.this).a();
                    }
                }
            });
        }
    }
}
