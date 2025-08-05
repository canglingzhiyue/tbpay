package tb;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Message;
import android.support.constraint.ConstraintLayout;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.config.b;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class ctk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f26512a;
    private Context b;
    private ViewGroup c;
    private View d;
    private TUrlImageView e;
    private TextView f;
    private ImageView h;
    private ctj i;
    private final a j;
    private ObjectAnimator k;
    private List<TUrlImageView> g = new ArrayList();
    private boolean l = false;
    private boolean m = false;

    public static /* synthetic */ ctj a(ctk ctkVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ctj) ipChange.ipc$dispatch("efc86f4f", new Object[]{ctkVar}) : ctkVar.i;
    }

    static {
        kge.a(891667498);
        f26512a = b.dc();
    }

    /* loaded from: classes3.dex */
    public static class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<ctk> f26515a;

        static {
            kge.a(189771468);
        }

        public a(ctk ctkVar) {
            this.f26515a = new WeakReference<>(ctkVar);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            ctk ctkVar;
            ctj a2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            } else if (message.what != 1000001 || this.f26515a.get() == null || (a2 = ctk.a((ctkVar = this.f26515a.get()))) == null || a2.a() == null || a2.a().length != 1) {
            } else {
                a2.b().a(0);
                ctkVar.b();
            }
        }
    }

    public ctk(Activity activity) {
        this.b = activity;
        ViewStub viewStub = (ViewStub) activity.findViewById(R.id.multi_scan_code_view);
        if (viewStub != null) {
            this.c = (ViewGroup) viewStub.inflate();
        } else {
            this.c = (ViewGroup) activity.findViewById(R.id.multi_scan_code_view_inflated_id);
        }
        this.c.setVisibility(8);
        this.d = this.c.findViewById(R.id.multi_scan_background);
        this.e = (TUrlImageView) this.c.findViewById(R.id.multi_scan_btn_back);
        this.e.setImageUrl("https://img.alicdn.com/imgextra/i3/O1CN01HlximS1rwMMgUdjpo_!!6000000005695-2-tps-144-144.png");
        this.f = (TextView) this.c.findViewById(R.id.multi_scan_tips);
        this.h = (ImageView) activity.findViewById(R.id.scan_multi_scancodes_screenshot);
        this.h.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.j = new a(this);
    }

    public void a(String str, ctj ctjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2402ffe9", new Object[]{this, str, ctjVar});
            return;
        }
        this.l = true;
        this.i = ctjVar;
        this.h.setImageBitmap(ctjVar.c());
        this.h.setVisibility(0);
        this.m = ctjVar.a().length > 1;
        cox.c(str, this.m ? "MultiCodeCloseExpose" : "SingleCodeCloseExpose", new String[0]);
        this.e.setOnClickListener(new View.OnClickListener() { // from class: tb.ctk.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    ctk.this.a();
                }
            }
        });
        Rect[] a2 = ctjVar.a();
        for (int i = 0; i < a2.length; i++) {
            a(this.b, ctjVar, a2[i], i, this.m);
        }
        this.k = ObjectAnimator.ofFloat(this.d, "alpha", 0.0f, 1.0f);
        this.k.setDuration(400L).start();
        this.c.setVisibility(0);
        this.j.removeMessages(1000001);
        if (this.g.size() == 1) {
            this.j.sendEmptyMessageDelayed(1000001, 400L);
            this.f.setText("");
            return;
        }
        this.f.setText(com.alibaba.ability.localization.b.a(R.string.feis_multi_scancode_found));
    }

    private TUrlImageView a(Context context, final ctj ctjVar, Rect rect, final int i, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("9072d2c9", new Object[]{this, context, ctjVar, rect, new Integer(i), new Boolean(z)});
        }
        TUrlImageView tUrlImageView = new TUrlImageView(context);
        tUrlImageView.setMaxWidth(110);
        tUrlImageView.setMaxHeight(110);
        tUrlImageView.setSkipAutoSize(true);
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(110, 110);
        layoutParams.h = 0;
        layoutParams.d = 0;
        layoutParams.leftMargin = ((rect.left + rect.right) / 2) - 47;
        layoutParams.topMargin = ((rect.top + rect.bottom) / 2) - 47;
        tUrlImageView.setOnClickListener(new View.OnClickListener() { // from class: tb.ctk.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                cox.a(com.etao.feimagesearch.structure.capture.a.f6987a, z ? "MultiCodeClick" : "SingleCodeClick", new String[0]);
                ctjVar.b().a(i);
                ctk.this.b();
            }
        });
        this.c.addView(tUrlImageView, layoutParams);
        tUrlImageView.setImageUrl(f26512a);
        this.g.add(tUrlImageView);
        return tUrlImageView;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        cox.a(com.etao.feimagesearch.structure.capture.a.f6987a, this.m ? "MultiCodeCloseClick" : "SingleCodeCloseClick", new String[0]);
        ctj ctjVar = this.i;
        if (ctjVar != null) {
            ctjVar.b().a();
        }
        b();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.l = false;
        this.j.removeMessages(1000001);
        this.k.end();
        this.h.setImageBitmap(null);
        this.h.setVisibility(8);
        for (TUrlImageView tUrlImageView : this.g) {
            this.c.removeView(tUrlImageView);
        }
        this.g.clear();
        this.c.setVisibility(8);
        this.i = null;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.l;
    }
}
