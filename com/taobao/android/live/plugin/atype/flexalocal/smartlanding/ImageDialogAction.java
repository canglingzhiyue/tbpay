package com.taobao.android.live.plugin.atype.flexalocal.smartlanding;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.security.realidentity.x2;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.taobao.uikit.feature.features.RatioFeature;
import java.io.Serializable;
import tb.kge;
import tb.pqj;

/* loaded from: classes6.dex */
public class ImageDialogAction implements DialogInterface.OnDismissListener, Handler.Callback {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private Context f14009a;
    private JSONObject b;
    private ImageDialogParams c;
    private Dialog d;
    private View e;
    private Handler f = new Handler(this);

    /* loaded from: classes6.dex */
    public static class ImageDialogParams implements Serializable {
        public String actionUrl;
        public String icon;
        public float ratio = 1.056f;
        public int width = x2.o;
        public boolean apng = false;
        public long duration = 0;

        static {
            kge.a(-712997975);
            kge.a(1028243835);
        }
    }

    static {
        kge.a(521336452);
        kge.a(908767350);
        kge.a(-1043440182);
    }

    /* renamed from: lambda$OSk-C9oH3Hw_hmviSrRJK1VRLVM */
    public static /* synthetic */ void m974lambda$OSkC9oH3Hw_hmviSrRJK1VRLVM(ImageDialogAction imageDialogAction, String str, View view) {
        imageDialogAction.a(str, view);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c9109f4", new Object[]{this, dialogInterface});
        }
    }

    public static /* synthetic */ void a(ImageDialogAction imageDialogAction) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c83c2813", new Object[]{imageDialogAction});
        } else {
            imageDialogAction.d();
        }
    }

    public ImageDialogAction(Context context, JSONObject jSONObject) {
        this.f14009a = context;
        this.b = jSONObject;
        this.e = LayoutInflater.from(context).inflate(R.layout.ubee_image_dialog, (ViewGroup) null);
        this.d = new Dialog(context, R.style.Ubee_Alert_Dialog);
        this.d.setContentView(this.e);
        this.d.setCanceledOnTouchOutside(false);
        this.d.setOnDismissListener(this);
        View findViewById = this.d.findViewById(R.id.ubee_dialog_close);
        if (findViewById != null) {
            findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.smartlanding.ImageDialogAction.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    ImageDialogAction.this = this;
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else {
                        ImageDialogAction.a(ImageDialogAction.this);
                    }
                }
            });
        }
        this.c = (ImageDialogParams) pqj.a(this.b.getString("params"), ImageDialogParams.class);
        View findViewById2 = this.d.findViewById(R.id.content);
        TUrlImageView tUrlImageView = (TUrlImageView) this.d.findViewById(R.id.image);
        tUrlImageView.setSkipAutoSize(this.c.apng);
        tUrlImageView.setImageUrl(this.c.icon);
        int a2 = a(this.f14009a, this.c.width);
        RatioFeature ratioFeature = new RatioFeature();
        ratioFeature.setRatio(this.c.ratio);
        tUrlImageView.addFeature(ratioFeature);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) findViewById2.getLayoutParams();
        layoutParams.gravity = 17;
        layoutParams.width = a2;
        layoutParams.height = (int) (a2 * this.c.ratio);
        findViewById2.setLayoutParams(layoutParams);
        final String str = this.c.actionUrl;
        findViewById2.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.smartlanding.-$$Lambda$ImageDialogAction$OSk-C9oH3Hw_hmviSrRJK1VRLVM
            {
                ImageDialogAction.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ImageDialogAction.m974lambda$OSkC9oH3Hw_hmviSrRJK1VRLVM(ImageDialogAction.this, str, view);
            }
        });
    }

    public /* synthetic */ void a(String str, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6198cb60", new Object[]{this, str, view});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            Nav.from(this.f14009a).toUri(str);
            d();
        }
    }

    private void c() {
        Handler handler;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        ImageDialogParams imageDialogParams = this.c;
        if (imageDialogParams == null) {
            return;
        }
        long j = imageDialogParams.duration;
        if (j <= 0 || (handler = this.f) == null) {
            return;
        }
        handler.sendEmptyMessageDelayed(101, j * 1000);
    }

    private void d() {
        Dialog dialog;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        Handler handler = this.f;
        if (handler != null) {
            handler.removeMessages(101);
        }
        Context context = this.f14009a;
        if (((context instanceof Activity) && ((Activity) context).isFinishing()) || (dialog = this.d) == null) {
            return;
        }
        dialog.dismiss();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        Context context = this.f14009a;
        if ((context instanceof Activity) && ((Activity) context).isFinishing()) {
            return;
        }
        Dialog dialog = this.d;
        if (dialog != null) {
            dialog.show();
        }
        c();
    }

    private int a(Context context, float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("258f8f53", new Object[]{this, context, new Float(f)})).intValue() : (int) ((f * context.getResources().getDisplayMetrics().widthPixels) / 750.0f);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        if (message.what == 101) {
            d();
        }
        return false;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        Handler handler = this.f;
        if (handler == null) {
            return;
        }
        handler.removeMessages(101);
        this.f = null;
    }
}
