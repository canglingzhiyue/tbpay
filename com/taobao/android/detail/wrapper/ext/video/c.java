package com.taobao.android.detail.wrapper.ext.video;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.detail.fragment.desc.video.view.PopDialogSource;
import com.taobao.avplayer.DWInstance;
import com.taobao.taobao.R;
import java.util.HashMap;
import tb.emu;
import tb.epj;
import tb.fpz;
import tb.kge;

/* loaded from: classes5.dex */
public class c extends Dialog implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String K_SOURCE_TYPE = "sourcetype";
    public static final String V_SOURCE_TYPE = "Product";

    /* renamed from: a  reason: collision with root package name */
    private Context f11390a;
    private DWInstance b;
    private RelativeLayout c;
    private ImageView d;
    private HashMap<String, String> e;
    private boolean f;

    static {
        kge.a(40082121);
        kge.a(-1201612728);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ Context a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("e56b9597", new Object[]{cVar}) : cVar.f11390a;
    }

    public static /* synthetic */ boolean b(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b370fe02", new Object[]{cVar})).booleanValue() : cVar.f;
    }

    public c(Context context) {
        super(context);
        this.f11390a = context;
        emu.a("com.taobao.android.detail.wrapper.ext.video.DetailVideoDialog");
    }

    public c(Context context, int i, DWInstance dWInstance) {
        super(context, i);
        this.f11390a = context;
        this.b = dWInstance;
        emu.a("com.taobao.android.detail.wrapper.ext.video.DetailVideoDialog");
    }

    public void a(final DWInstance dWInstance, final PopDialogSource popDialogSource, View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("802f7e90", new Object[]{this, dWInstance, popDialogSource, view, new Integer(i), new Integer(i2)});
        } else if (dWInstance == null || view == null) {
        } else {
            this.f = dWInstance.isMute();
            if (this.c == null) {
                this.c = (RelativeLayout) LayoutInflater.from(this.f11390a).inflate(R.layout.x_detail_video_dialog, (ViewGroup) null);
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
            setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.taobao.android.detail.wrapper.ext.video.c.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnDismissListener
                public void onDismiss(DialogInterface dialogInterface) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7c9109f4", new Object[]{this, dialogInterface});
                        return;
                    }
                    if (c.a(c.this) != null && popDialogSource == PopDialogSource.MIN_VIDEO) {
                        com.taobao.android.detail.core.event.video.c.b(fpz.b(c.a(c.this)), null);
                    }
                    DWInstance dWInstance2 = dWInstance;
                    if (dWInstance2 != null) {
                        dWInstance2.mute(c.b(c.this));
                        dWInstance.unbindWindow();
                    }
                    if (c.a(dWInstance)) {
                        dWInstance.orientationDisable();
                    }
                    com.taobao.android.detail.core.event.video.c.g(fpz.b(c.a(c.this)), null);
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
            com.taobao.android.detail.core.event.video.c.f(fpz.b(this.f11390a), null);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (view != this.d || this.f11390a == null) {
        } else {
            dismiss();
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        Context b = fpz.b(this.f11390a);
        if (this.e == null) {
            this.e = new HashMap<>();
            if (b instanceof DetailCoreActivity) {
                DetailCoreActivity detailCoreActivity = (DetailCoreActivity) b;
                if (detailCoreActivity.y() != null && detailCoreActivity.y().t != null) {
                    com.taobao.android.detail.datasdk.model.datamodel.node.c cVar = detailCoreActivity.y().t;
                    this.e.put("item_id", cVar.i());
                    this.e.put("shop_id", cVar.o());
                    this.e.put("seller_id", cVar.h());
                }
            }
            this.e.put("spm", "a2141.7631564.5634305");
            this.e.put("sourcetype", "Product");
        }
        com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.core.c.a(b, "Page_Detail_Show_PlayPage", this.e);
    }

    public static boolean a(DWInstance dWInstance) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a1f0cecd", new Object[]{dWInstance})).booleanValue() : (dWInstance == null || dWInstance.getVideoState() == 0 || dWInstance.getVideoState() == 3 || TextUtils.equals("false", epj.h().a("android_detail", "enable_orientation", "true"))) ? false : true;
    }
}
