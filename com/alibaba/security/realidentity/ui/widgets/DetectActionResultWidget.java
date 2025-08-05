package com.alibaba.security.realidentity.ui.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.alibaba.security.realidentity.biz.config.RPBizConfig;
import com.alibaba.security.realidentity.e;
import com.alibaba.security.realidentity.e2;
import com.alibaba.security.realidentity.k0;
import com.alibaba.security.realidentity.q4;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* loaded from: classes3.dex */
public class DetectActionResultWidget extends BaseWidget {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String j = "DetectActionResultWidget";
    public int b;
    public ImageView c;
    public TextView d;
    public TextView e;
    public Button f;
    public Button g;
    public Button h;
    public q4 i;

    /* loaded from: classes3.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f3575a;
        public final /* synthetic */ int b;

        public a(int i, int i2) {
            this.f3575a = i;
            this.b = i2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (DetectActionResultWidget.a(DetectActionResultWidget.this) == null) {
            } else {
                if (this.f3575a == -10416) {
                    DetectActionResultWidget.a(DetectActionResultWidget.this).a();
                    return;
                }
                DetectActionResultWidget.a(DetectActionResultWidget.this).a(this.b, 0, this.f3575a);
                DetectActionResultWidget.this.setVisibility(8);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f3576a;

        public b(int i) {
            this.f3576a = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            if (DetectActionResultWidget.a(DetectActionResultWidget.this) != null) {
                DetectActionResultWidget.a(DetectActionResultWidget.this).a(20002, 1, this.f3576a);
            }
            DetectActionResultWidget.this.setVisibility(8);
        }
    }

    /* loaded from: classes3.dex */
    public class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f3577a;

        public c(int i) {
            this.f3577a = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (DetectActionResultWidget.a(DetectActionResultWidget.this) == null) {
            } else {
                DetectActionResultWidget.a(DetectActionResultWidget.this).a(20002, 1, this.f3577a);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class d implements k0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f3578a;
        public final /* synthetic */ Runnable b;
        public final /* synthetic */ RPBizConfig c;
        public final /* synthetic */ String d;

        public d(int i, Runnable runnable, RPBizConfig rPBizConfig, String str) {
            this.f3578a = i;
            this.b = runnable;
            this.c = rPBizConfig;
            this.d = str;
        }

        @Override // com.alibaba.security.realidentity.k0
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                return;
            }
            int i2 = this.f3578a;
            if (i != 0) {
                i2 = e2.u;
            }
            DetectActionResultWidget.a(DetectActionResultWidget.this, i2, this.b, this.c, this.d);
        }
    }

    public DetectActionResultWidget(Context context) {
        super(context);
        this.b = 0;
    }

    public static /* synthetic */ q4 a(DetectActionResultWidget detectActionResultWidget) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (q4) ipChange.ipc$dispatch("93a477b4", new Object[]{detectActionResultWidget}) : detectActionResultWidget.i;
    }

    public static /* synthetic */ Object ipc$super(DetectActionResultWidget detectActionResultWidget, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.alibaba.security.realidentity.ui.widgets.BaseWidget
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        }
    }

    @Override // com.alibaba.security.realidentity.ui.widgets.BaseWidget
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            f();
        }
    }

    @Override // com.alibaba.security.realidentity.ui.widgets.BaseWidget
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.b = -1;
        this.c = (ImageView) findViewById(R.id.abfl_widget_dar_icon);
        this.d = (TextView) findViewById(R.id.abfl_widget_dar_title);
        this.e = (TextView) findViewById(R.id.abfl_widget_dar_content);
        this.f = (Button) findViewById(R.id.abfl_widget_dar_btn);
        this.g = (Button) findViewById(R.id.abfl_widget_dar_other_btn);
        this.h = (Button) findViewById(R.id.abfl_widget_dar_ctid_btn);
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else {
            this.b = 0;
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        a();
        this.c.setBackgroundResource(R.drawable.rp_face_result_icon_ok);
        this.d.setText(R.string.face_liveness_success);
        this.e.setVisibility(4);
        this.f.setVisibility(4);
        this.g.setVisibility(4);
        setVisibility(0);
        setAlpha(1.0f);
    }

    public int getDetectResultErrorCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("30855e99", new Object[]{this})).intValue() : this.b;
    }

    public void setOnDetectActionResultListener(q4 q4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e59f61f9", new Object[]{this, q4Var});
        } else {
            this.i = q4Var;
        }
    }

    public static /* synthetic */ void a(DetectActionResultWidget detectActionResultWidget, int i, Runnable runnable, RPBizConfig rPBizConfig, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e387b26", new Object[]{detectActionResultWidget, new Integer(i), runnable, rPBizConfig, str});
        } else {
            detectActionResultWidget.a(i, runnable, rPBizConfig, str);
        }
    }

    public DetectActionResultWidget(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
    }

    public void a(int i, String str, CharSequence charSequence, String str2, boolean z, int i2, boolean z2) {
        IpChange ipChange = $ipChange;
        int i3 = 8;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e16bd52", new Object[]{this, new Integer(i), str, charSequence, str2, new Boolean(z), new Integer(i2), new Boolean(z2)});
            return;
        }
        a();
        if (i2 == 0) {
            this.c.setBackgroundResource(R.drawable.rp_face_result_icon_ok);
        } else {
            this.c.setBackgroundResource(R.drawable.rp_face_result_icon_fail);
        }
        this.d.setText(str);
        this.f.setText(str2);
        this.f.setVisibility(0);
        e.a(this, 500, null);
        if (charSequence != null) {
            this.e.setText(charSequence);
        } else {
            this.e.setText("");
        }
        this.e.setVisibility(charSequence == null ? 4 : 0);
        this.f.setOnClickListener(new a(i2, i));
        if (z) {
            this.g.setVisibility(0);
            this.g.setOnClickListener(new b(i2));
        } else {
            this.g.setVisibility(4);
        }
        if (!z2) {
            return;
        }
        Button button = this.h;
        if (i2 == -10416) {
            i3 = 0;
        }
        button.setVisibility(i3);
        this.h.setOnClickListener(new c(i2));
    }

    public DetectActionResultWidget(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = 0;
    }

    public void a(int i, Runnable runnable, RPBizConfig rPBizConfig, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd1397d1", new Object[]{this, new Integer(i), runnable, rPBizConfig, str, str2});
            return;
        }
        a();
        q4 q4Var = this.i;
        if (q4Var == null) {
            return;
        }
        q4Var.a(new d(i, runnable, rPBizConfig, str2), str);
    }

    private void a(int i, Runnable runnable, RPBizConfig rPBizConfig, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72c6b1c7", new Object[]{this, new Integer(i), runnable, rPBizConfig, str});
            return;
        }
        runnable.run();
        a(i, rPBizConfig, str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x020f A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(int r17, com.alibaba.security.realidentity.biz.config.RPBizConfig r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 1262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.security.realidentity.ui.widgets.DetectActionResultWidget.a(int, com.alibaba.security.realidentity.biz.config.RPBizConfig, java.lang.String):void");
    }
}
