package com.alibaba.security.realidentity.ui.widgets;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.AnimationDrawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.content.ContextCompat;
import android.text.SpannableString;
import mtopsdk.common.util.StringUtils;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.alibaba.security.realidentity.algo.wrapper.entity.detector.ABDetectType;
import com.alibaba.security.realidentity.biz.config.RPBizConfig;
import com.alibaba.security.realidentity.e;
import com.alibaba.security.realidentity.ui.entity.DazzleCollectDataUIConfigItem;
import com.alibaba.security.realidentity.ui.view.ALBiometricsActivityParentView;
import com.alibaba.security.realidentity.ui.widgets.RPDetectCoreView;
import com.alibaba.security.realidentity.w4;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.Locale;

/* loaded from: classes3.dex */
public class DetectActionWidget extends BaseWidget {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String l = "DetectActionWidget";
    public static final long m = 500;
    public static final long n = 1000;
    public static final int o = 1;
    public static final int p = 2;
    public static final int q = 3;
    public TextView b;
    public TextView c;
    public LinearLayout d;
    public ImageView e;
    public View f;
    public RPDetectCoreView g;
    public TextView h;
    public Handler i;
    public Activity j;
    public long k;

    /* loaded from: classes3.dex */
    public class a implements RPDetectCoreView.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RPDetectCoreView.c f3579a;

        public a(RPDetectCoreView.c cVar) {
            this.f3579a = cVar;
        }

        @Override // com.alibaba.security.realidentity.ui.widgets.RPDetectCoreView.c
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            RPDetectCoreView.c cVar = this.f3579a;
            if (cVar == null) {
                return;
            }
            cVar.a();
        }

        @Override // com.alibaba.security.realidentity.ui.widgets.RPDetectCoreView.c
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            RPDetectCoreView.c cVar = this.f3579a;
            if (cVar != null) {
                cVar.b();
            }
            DetectActionWidget.a(DetectActionWidget.this).setVisibility(8);
        }
    }

    /* loaded from: classes3.dex */
    public interface b {
        DazzleCollectDataUIConfigItem a(int i);
    }

    /* loaded from: classes3.dex */
    public static class c extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final DetectActionWidget f3580a;

        public c(DetectActionWidget detectActionWidget) {
            super(Looper.getMainLooper());
            this.f3580a = detectActionWidget;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            if (str.hashCode() == 673877017) {
                super.handleMessage((Message) objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            super.handleMessage(message);
            int i = message.what;
            if (i == 1) {
                DetectActionWidget.b(this.f3580a);
            } else if (i == 2) {
                DetectActionWidget.a(this.f3580a, message);
            } else if (i != 3) {
            } else {
                DetectActionWidget.c(this.f3580a);
            }
        }
    }

    public DetectActionWidget(Context context) {
        super(context);
        c();
    }

    public static /* synthetic */ View a(DetectActionWidget detectActionWidget) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("cb27ab08", new Object[]{detectActionWidget}) : detectActionWidget.f;
    }

    public static /* synthetic */ void b(DetectActionWidget detectActionWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b58b8e5", new Object[]{detectActionWidget});
        } else {
            detectActionWidget.i();
        }
    }

    public static /* synthetic */ void c(DetectActionWidget detectActionWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74391984", new Object[]{detectActionWidget});
        } else {
            detectActionWidget.l();
        }
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.e.getLayoutParams();
        layoutParams.setMargins(0, this.g.getCircleBottom() + e.a(getContext(), 78.0f), 0, 0);
        this.e.setLayoutParams(layoutParams);
        this.e.requestLayout();
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.b.getLayoutParams();
        layoutParams.setMargins(0, this.g.getCircleBottom() + e.a(getContext(), 20.0f), 0, 0);
        this.b.setLayoutParams(layoutParams);
        this.b.requestLayout();
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.h.getLayoutParams();
        int radius = this.g.getRadius();
        layoutParams.height = radius << 1;
        layoutParams.topMargin = this.g.getCircleCenterY() - radius;
        this.h.setLayoutParams(layoutParams);
        this.h.requestLayout();
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        ALBiometricsActivityParentView.d dVar = this.f3574a;
        if (dVar == null) {
            return;
        }
        dVar.a();
    }

    public static /* synthetic */ Object ipc$super(DetectActionWidget detectActionWidget, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    private void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
        } else {
            this.k = 0L;
        }
    }

    private void setVerifiedUserName(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43b8e6f1", new Object[]{this, str});
            return;
        }
        if (Locale.getDefault().getLanguage().startsWith("zh")) {
            str2 = this.j.getString(R.string.face_guide_please) + " " + str + " " + this.j.getString(R.string.face_detect_self_action);
        } else {
            str2 = this.j.getString(R.string.face_guide_please) + str + this.j.getString(R.string.face_detect_self_action);
        }
        SpannableString spannableString = new SpannableString(str2);
        int indexOf = str2.indexOf(str);
        int length = str.length() + indexOf;
        int length2 = str2.length();
        int color = ContextCompat.getColor(this.j, R.color.rpsdk_common_text);
        int color2 = ContextCompat.getColor(this.j, R.color.rpsdk_text_blue);
        if (indexOf > 0) {
            spannableString.setSpan(new ForegroundColorSpan(color), 0, indexOf, 33);
        }
        spannableString.setSpan(new ForegroundColorSpan(color2), indexOf, length, 33);
        spannableString.setSpan(new ForegroundColorSpan(color), length, length2, 33);
        this.c.setText(spannableString);
    }

    @Override // com.alibaba.security.realidentity.ui.widgets.BaseWidget
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.e = (ImageView) findViewById(R.id.abfl_widget_da_actionGuidance_anim_image);
        this.b = (TextView) findViewById(R.id.abfl_widget_da_mainPrompt);
        this.c = (TextView) findViewById(R.id.widget_da_self_name);
        this.d = (LinearLayout) findViewById(R.id.widget_da_self_name_parent);
        this.f = findViewById(R.id.abfl_widget_da_maskview_blurview);
        this.g = (RPDetectCoreView) findViewById(R.id.abfl_widget_da_maskview);
        this.h = (TextView) findViewById(R.id.abfl_waiting_tip);
    }

    public int getMaskCircleDisplayY() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("226f0c3", new Object[]{this})).intValue() : this.g.getCircleCenterY();
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
        } else {
            this.e.setVisibility(8);
        }
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        this.b.setText("");
        this.b.setVisibility(4);
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        a();
        this.d.setVisibility(4);
        this.b.setVisibility(4);
        this.h.setVisibility(0);
        this.g.d();
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        this.i.removeMessages(2);
        this.g.setBackgroundColor(-1);
        this.g.invalidate();
    }

    public void setActivity(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a989aea", new Object[]{this, activity});
        } else {
            this.j = activity;
        }
    }

    public static /* synthetic */ void a(DetectActionWidget detectActionWidget, Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca272a99", new Object[]{detectActionWidget, message});
        } else {
            detectActionWidget.a(message);
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.i = new c(this);
        }
    }

    @Override // com.alibaba.security.realidentity.ui.widgets.BaseWidget
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        j();
        this.h.setVisibility(8);
        this.g.a();
        this.i.removeCallbacksAndMessages(null);
    }

    public DetectActionWidget(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c();
    }

    private void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        this.i.removeMessages(1);
        this.i.sendEmptyMessageDelayed(1, 1000L);
        if (System.currentTimeMillis() - this.k < 500) {
            return;
        }
        this.b.setText(str);
        this.k = System.currentTimeMillis();
    }

    @Override // com.alibaba.security.realidentity.ui.widgets.BaseWidget
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.g.setWaitingColor(-16776961);
        this.g.setBreatheColor(-65536);
    }

    public DetectActionWidget(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        c();
    }

    private void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        this.e.setVisibility(0);
        this.e.setImageDrawable(getResources().getDrawable(i));
        ((AnimationDrawable) this.e.getDrawable()).start();
    }

    private void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        this.k = 0L;
        this.i.removeMessages(1);
        this.b.setText(str);
        this.b.setVisibility(0);
    }

    public void a(String str, RPBizConfig rPBizConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8c04596", new Object[]{this, str, rPBizConfig});
            return;
        }
        a();
        b(str);
        String str2 = rPBizConfig.getBiometricsConfig().userName;
        if (!StringUtils.isEmpty(str2)) {
            this.d.setVisibility(0);
            setVerifiedUserName(str2);
            return;
        }
        this.d.setVisibility(8);
    }

    public void a(DazzleCollectDataUIConfigItem dazzleCollectDataUIConfigItem, b bVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6b0b7bb", new Object[]{this, dazzleCollectDataUIConfigItem, bVar, new Integer(i)});
            return;
        }
        b(dazzleCollectDataUIConfigItem.getTitle());
        this.d.setVisibility(4);
        try {
            this.b.setTextColor(Color.parseColor(dazzleCollectDataUIConfigItem.textColor));
        } catch (Exception unused) {
            this.b.setTextColor(getContext().getResources().getColor(R.color.rpsdk_color_333333));
        }
        try {
            this.g.setBackgroundColor(Color.parseColor(dazzleCollectDataUIConfigItem.color));
        } catch (Exception unused2) {
            this.g.setBackgroundColor(-1);
        }
        dazzleCollectDataUIConfigItem.timeInterval = System.currentTimeMillis();
        e.a(this.j, (int) (dazzleCollectDataUIConfigItem.screenLight * 255.0f));
        float f = dazzleCollectDataUIConfigItem.duration;
        if (f <= 0.0f) {
            a(bVar, i);
            return;
        }
        long j = f * 1000.0f;
        Message obtain = Message.obtain();
        obtain.what = 2;
        obtain.arg1 = i;
        obtain.obj = bVar;
        this.i.sendMessageDelayed(obtain, j);
    }

    private void a(b bVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e8110bb", new Object[]{this, bVar, new Integer(i)});
            return;
        }
        int i2 = i + 1;
        DazzleCollectDataUIConfigItem a2 = bVar.a(i2);
        if (a2 == null) {
            return;
        }
        a(a2, bVar, i2);
    }

    public void a(float f, float f2, long j, RPDetectCoreView.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57134eeb", new Object[]{this, new Float(f), new Float(f2), new Long(j), cVar});
            return;
        }
        a();
        g();
        f();
        h();
        setVisibility(0);
        this.f.setVisibility(0);
        this.g.a(f, f2, j, new a(cVar));
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            a();
            c(str);
        }
    }

    public void a(ABDetectType aBDetectType, RPBizConfig rPBizConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef39538f", new Object[]{this, aBDetectType, rPBizConfig});
            return;
        }
        a();
        a(w4.a(this, aBDetectType), rPBizConfig);
        int a2 = w4.a(aBDetectType);
        if (a2 <= 0) {
            return;
        }
        a(a2);
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        RPDetectCoreView rPDetectCoreView = this.g;
        if (rPDetectCoreView == null) {
            return;
        }
        if (z) {
            rPDetectCoreView.e();
        } else {
            rPDetectCoreView.c();
        }
    }

    private void a(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a99d9bb", new Object[]{this, message});
        } else {
            a((b) message.obj, message.arg1);
        }
    }
}
