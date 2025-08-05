package com.taobao.android.buy.internal.status;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.buy.internal.status.e;
import com.taobao.android.buy.module.progressBar.widget.AliBuyProgressBar;
import com.taobao.android.buy.toggle.AliBuyPerfSwitcher;
import com.taobao.taobao.R;
import tb.arc;
import tb.dul;
import tb.fke;
import tb.ijt;
import tb.kge;

/* loaded from: classes4.dex */
public class c implements e.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private dul f9236a;
    private final Handler b = new Handler();
    private Runnable c;
    private TextView d;

    static {
        kge.a(1667063912);
        kge.a(-762856716);
    }

    public static /* synthetic */ dul a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dul) ipChange.ipc$dispatch("899fc510", new Object[]{cVar}) : cVar.f9236a;
    }

    public static /* synthetic */ TextView b(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("b6027530", new Object[]{cVar}) : cVar.d;
    }

    public static /* synthetic */ void c(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ebb66fd", new Object[]{cVar});
        } else {
            cVar.b();
        }
    }

    @Override // com.taobao.android.buy.internal.status.e.c
    public void a(Context context, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e504eed", new Object[]{this, context, bool});
        } else {
            a(context, bool.booleanValue() ? 1 : 0);
        }
    }

    @Override // com.taobao.android.buy.internal.status.e.c
    public void a(final Context context, int i) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("258f9aa3", new Object[]{this, context, new Integer(i)});
            return;
        }
        try {
            if (this.f9236a != null) {
                return;
            }
            this.f9236a = new dul(context, R.style.Dialog_Status_Container);
            if (this.c != null) {
                this.b.removeCallbacks(this.c);
            }
            if (AliBuyPerfSwitcher.enablePreloadView()) {
                this.f9236a.setContentView(ijt.b(context, R.layout.alibuy_progressbar_layout));
            } else {
                this.f9236a.setContentView(R.layout.alibuy_progressbar_layout);
            }
            this.d = (TextView) this.f9236a.findViewById(R.id.loading_text_view);
            a();
            if (i != 2) {
                if (i == 1) {
                    z = true;
                }
                b(context, Boolean.valueOf(z));
                this.b.postDelayed(this.c, 3000L);
            }
            this.f9236a.a();
            this.f9236a.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.taobao.android.buy.internal.status.c.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnCancelListener
                public void onCancel(DialogInterface dialogInterface) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f4ed3926", new Object[]{this, dialogInterface});
                        return;
                    }
                    if (dialogInterface != null && c.a(c.this) != null && c.a(c.this).isShowing()) {
                        dialogInterface.dismiss();
                    }
                    fke.a(context);
                }
            });
            this.f9236a.show();
        } catch (Throwable th) {
            arc.a().b(th.toString());
        }
    }

    private void b(Context context, final Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd9e8ee", new Object[]{this, context, bool});
        } else {
            this.c = new Runnable() { // from class: com.taobao.android.buy.internal.status.c.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (c.a(c.this) == null || !c.a(c.this).isShowing()) {
                    } else {
                        c.a(c.this).setContentView(R.layout.alibuy_build_loading_layout);
                        AliBuyProgressBar aliBuyProgressBar = (AliBuyProgressBar) c.a(c.this).findViewById(R.id.alibuy_progress_bar);
                        aliBuyProgressBar.isAdjust(bool.booleanValue());
                        aliBuyProgressBar.setmProgressUpdateListener(new AliBuyProgressBar.b() { // from class: com.taobao.android.buy.internal.status.c.2.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.taobao.android.buy.module.progressBar.widget.AliBuyProgressBar.b
                            public void a(String str) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("f3a64c32", new Object[]{this, str});
                                } else if (c.b(c.this) == null) {
                                } else {
                                    c.b(c.this).setText(str);
                                }
                            }
                        });
                    }
                }
            };
        }
    }

    private void a() {
        ImageView imageView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        dul dulVar = this.f9236a;
        if (dulVar == null || (imageView = (ImageView) dulVar.findViewById(R.id.loading_progressbar)) == null) {
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, "rotation", 0.0f, 360.0f);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(1000L);
        ofFloat.setRepeatCount(-1);
        ofFloat.start();
    }

    @Override // com.taobao.android.buy.internal.status.e.c
    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        dul dulVar = this.f9236a;
        if (dulVar == null) {
            return;
        }
        AliBuyProgressBar aliBuyProgressBar = (AliBuyProgressBar) dulVar.findViewById(R.id.alibuy_progress_bar);
        if (aliBuyProgressBar != null) {
            aliBuyProgressBar.finishLoading(new AliBuyProgressBar.a() { // from class: com.taobao.android.buy.internal.status.c.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.buy.module.progressBar.widget.AliBuyProgressBar.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        c.c(c.this);
                    }
                }
            });
            aliBuyProgressBar.setmProgressUpdateListener(new AliBuyProgressBar.b() { // from class: com.taobao.android.buy.internal.status.c.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.buy.module.progressBar.widget.AliBuyProgressBar.b
                public void a(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                    } else if (c.b(c.this) == null) {
                    } else {
                        c.b(c.this).setText(str);
                    }
                }
            });
            return;
        }
        b();
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        dul dulVar = this.f9236a;
        if (dulVar == null) {
            return;
        }
        try {
            dulVar.dismiss();
            this.f9236a.setOnCancelListener(null);
            this.f9236a = null;
        } catch (Throwable unused) {
        }
    }
}
