package tb;

import android.os.Bundle;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.b;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pha.core.controller.AppController;
import com.taobao.pha.core.model.PageModel;
import com.taobao.taobao.R;
import java.util.HashMap;
import org.android.agoo.common.AgooConstants;

/* loaded from: classes7.dex */
public class ngl extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String TAG;

    /* renamed from: a  reason: collision with root package name */
    private final a f31441a;
    private final AppController b;
    private nfz c;

    /* loaded from: classes7.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f31445a;
        public final int b;
        public final String c;
        public final boolean d;
        public final PageModel e;
        public final float f;

        static {
            kge.a(-4402744);
        }

        public a(boolean z, int i, String str, boolean z2, float f, PageModel pageModel) {
            this.f31445a = z;
            this.b = i;
            this.c = str;
            this.d = z2;
            this.e = pageModel;
            this.f = f;
        }
    }

    public static /* synthetic */ Object ipc$super(ngl nglVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1373052399) {
            super.dismiss();
            return null;
        } else if (hashCode != -641568046) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onCreate((Bundle) objArr[0]);
            return null;
        }
    }

    public static /* synthetic */ a a(ngl nglVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("8425ed71", new Object[]{nglVar}) : nglVar.f31441a;
    }

    static {
        kge.a(-1619709458);
        TAG = ngl.class.getSimpleName();
    }

    public ngl(AppController appController, a aVar) {
        super(appController.C());
        this.b = appController;
        this.f31441a = aVar;
    }

    public nfz a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nfz) ipChange.ipc$dispatch("f08339c", new Object[]{this}) : this.c;
    }

    @Override // android.support.design.widget.b, android.support.v7.app.h, android.app.Dialog
    public void onCreate(Bundle bundle) {
        int i;
        View j;
        super.onCreate(bundle);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundColor(0);
        Window window = getWindow();
        if (window == null) {
            return;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            window.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        } catch (Exception e) {
            ngr.b(TAG, e.toString());
        }
        int i2 = displayMetrics.widthPixels;
        if (i2 > 0) {
            linearLayout.setMinimumWidth(i2);
        }
        if (this.f31441a.d) {
            int a2 = ngn.a(58);
            int a3 = ngn.a(54);
            int a4 = ngn.a(16);
            ImageButton imageButton = new ImageButton(getContext());
            imageButton.setPadding(0, 0, 0, 0);
            imageButton.setBackgroundColor(0);
            imageButton.setImageResource(R.drawable.ic_close);
            imageButton.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageButton.setOnClickListener(new View.OnClickListener() { // from class: tb.ngl.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else {
                        ngl.this.dismiss();
                    }
                }
            });
            i = a4 + a2 + 0;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(a2, a2);
            layoutParams.bottomMargin = a4;
            layoutParams.leftMargin = (i2 - a3) - a2;
            layoutParams.width = a2;
            layoutParams.height = a2;
            LinearLayout linearLayout2 = new LinearLayout(getContext());
            linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: tb.ngl.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else {
                        ngl.this.dismiss();
                    }
                }
            });
            linearLayout2.addView(imageButton, layoutParams);
            linearLayout.addView(linearLayout2, new LinearLayout.LayoutParams(-1, -2));
        } else {
            i = 0;
        }
        int a5 = ngn.a(this.f31441a.b);
        int i3 = i + a5;
        this.f31441a.e._type = AgooConstants.MESSAGE_POPUP;
        HashMap hashMap = new HashMap();
        hashMap.put("radius", Float.valueOf(ngn.a(this.f31441a.f)));
        nfz a6 = ngn.a(this.b, this.f31441a.e, hashMap);
        if (a6 == null || (j = a6.j()) == null) {
            return;
        }
        if (!TextUtils.isEmpty(this.f31441a.e.backgroundColor)) {
            try {
                ((View) j.getClass().getMethod("getView", new Class[0]).invoke(j, new Object[0])).setBackgroundColor(ngn.f(this.f31441a.e.backgroundColor));
            } catch (Exception unused) {
                ngr.b(TAG, "Failed to set popup innerView background.");
            }
        }
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, a5);
        layoutParams2.weight = 1.0f;
        linearLayout.addView(j, layoutParams2);
        this.c = a6;
        setContentView(linearLayout);
        if (linearLayout.getParent() instanceof View) {
            ((View) linearLayout.getParent()).setBackgroundColor(0);
        }
        if ("none".equals(this.f31441a.c)) {
            window.setWindowAnimations(-1);
        }
        final BottomSheetBehavior a7 = a(linearLayout);
        if (a7 == null) {
            return;
        }
        window.setLayout(-1, i3);
        window.setGravity(80);
        a7.a(i3);
        a7.a(new BottomSheetBehavior.a() { // from class: tb.ngl.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.support.design.widget.BottomSheetBehavior.a
            public void a(View view, float f) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("b3af196", new Object[]{this, view, new Float(f)});
                }
            }

            @Override // android.support.design.widget.BottomSheetBehavior.a
            public void a(View view, int i4) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("b3afcd9", new Object[]{this, view, new Integer(i4)});
                } else if (i4 == 1) {
                    if (ngl.a(ngl.this).f31445a) {
                        return;
                    }
                    a7.b(3);
                } else if (i4 != 5) {
                } else {
                    ngl.this.dismiss();
                }
            }
        });
        this.b.E().a("pageappear", a(this.f31441a.e), "native", "*");
    }

    private static JSONObject a(PageModel pageModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ff3ab7dc", new Object[]{pageModel});
        }
        JSONObject jSONObject = new JSONObject();
        if (pageModel != null) {
            jSONObject.put("url", (Object) pageModel.getUrl());
            jSONObject.put("key", (Object) pageModel.key);
            jSONObject.put("type", (Object) (pageModel._type == null ? "web" : pageModel._type));
            jSONObject.put("navigationType", (Object) AgooConstants.MESSAGE_POPUP);
        }
        return jSONObject;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae28e211", new Object[]{this});
            return;
        }
        super.dismiss();
        nfz nfzVar = this.c;
        if (nfzVar != null) {
            nfzVar.g();
            this.c = null;
        }
        this.b.E().a("pagedisappear", a(this.f31441a.e), "native", "*");
    }

    public BottomSheetBehavior a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BottomSheetBehavior) ipChange.ipc$dispatch("a64aec0f", new Object[]{this, view});
        }
        ViewGroup.LayoutParams layoutParams = ((ViewGroup) view.getParent()).getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.b)) {
            return null;
        }
        CoordinatorLayout.Behavior b = ((CoordinatorLayout.b) layoutParams).b();
        if (!(b instanceof BottomSheetBehavior)) {
            return null;
        }
        return (BottomSheetBehavior) b;
    }
}
