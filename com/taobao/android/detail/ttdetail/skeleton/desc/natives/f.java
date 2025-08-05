package com.taobao.android.detail.ttdetail.skeleton.desc.natives;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWInstance;
import com.taobao.taobao.R;
import tb.fpz;
import tb.kge;
import tb.szr;
import tb.szs;

/* loaded from: classes5.dex */
public class f extends Dialog implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String K_SOURCE_TYPE = "sourcetype";
    public static final String V_SOURCE_TYPE = "Product";

    /* renamed from: a  reason: collision with root package name */
    private Context f10816a;
    private DWInstance b;
    private RelativeLayout c;
    private ImageView d;
    private boolean e;

    static {
        kge.a(-1927767824);
        kge.a(-1201612728);
    }

    public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ boolean a(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3e034337", new Object[]{fVar})).booleanValue() : fVar.e;
    }

    public static /* synthetic */ Context b(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("e7ddbe2c", new Object[]{fVar}) : fVar.f10816a;
    }

    public f(Context context) {
        super(context);
        this.f10816a = context;
    }

    public f(Context context, int i, DWInstance dWInstance) {
        super(context, i);
        this.f10816a = context;
        this.b = dWInstance;
    }

    public void a(final DWInstance dWInstance, PopDialogSource popDialogSource, View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef0d688c", new Object[]{this, dWInstance, popDialogSource, view, new Integer(i), new Integer(i2)});
        } else if (dWInstance == null || view == null) {
        } else {
            this.e = dWInstance.isMute();
            if (this.c == null) {
                this.c = (RelativeLayout) LayoutInflater.from(this.f10816a).inflate(R.layout.tt_detail_video_dialog, (ViewGroup) null);
                this.d = (ImageView) this.c.findViewById(R.id.iv_close);
                this.d.setOnClickListener(this);
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.c.addView(view);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, i2);
            layoutParams.addRule(13);
            layoutParams.addRule(15);
            layoutParams.addRule(14);
            view.setLayoutParams(layoutParams);
            setContentView(this.c);
            dWInstance.setFrame(i, i2);
            dWInstance.mute(false);
            dWInstance.showController();
            setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.taobao.android.detail.ttdetail.skeleton.desc.natives.f.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnDismissListener
                public void onDismiss(DialogInterface dialogInterface) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7c9109f4", new Object[]{this, dialogInterface});
                        return;
                    }
                    DWInstance dWInstance2 = dWInstance;
                    if (dWInstance2 != null) {
                        dWInstance2.mute(f.a(f.this));
                        dWInstance.unbindWindow();
                    }
                    if (f.a(dWInstance)) {
                        dWInstance.orientationDisable();
                    }
                    com.taobao.android.detail.ttdetail.communication.c.a(f.b(f.this), new szr());
                }
            });
            if (isShowing()) {
                return;
            }
            show();
            if (a(dWInstance)) {
                dWInstance.orientationEnable();
            }
            a();
            if (dWInstance != null) {
                dWInstance.bindWindow(getWindow());
            }
            com.taobao.android.detail.ttdetail.communication.c.a(this.f10816a, new szs());
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (view != this.d || this.f10816a == null) {
        } else {
            dismiss();
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            fpz.b(this.f10816a);
        }
    }

    public static boolean a(DWInstance dWInstance) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a1f0cecd", new Object[]{dWInstance})).booleanValue() : (dWInstance == null || dWInstance.getVideoState() == 0 || dWInstance.getVideoState() == 3) ? false : true;
    }
}
