package com.taobao.avplayer.player;

import android.media.AudioManager;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWContext;
import com.taobao.avplayer.DWVideoScreenType;
import com.taobao.taobao.R;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import tb.kcl;
import tb.kge;

/* loaded from: classes6.dex */
public class b extends GestureDetector.SimpleOnGestureListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private DWContext f16553a;
    private boolean c;
    private int d;
    private int e;
    private String f;
    private AudioManager g;
    private float h;
    private float i;
    private float j;
    private FrameLayout k;
    private FrameLayout l;
    private ProgressBar m;
    private ImageView n;
    private TextView o;
    private LinearLayout p;
    private ProgressBar q;
    private LinearLayout r;
    private ProgressBar s;
    private long t;
    private int b = -1;
    private StringBuilder u = new StringBuilder();

    /* renamed from: com.taobao.avplayer.player.b$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f16554a = new int[DWVideoScreenType.values().length];

        static {
            try {
                f16554a[DWVideoScreenType.PORTRAIT_FULL_SCREEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16554a[DWVideoScreenType.LANDSCAPE_FULL_SCREEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        kge.a(-1951724406);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != 307521857) {
            if (hashCode != 587072321) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            return new Boolean(super.onDown((MotionEvent) objArr[0]));
        }
        return new Boolean(super.onScroll((MotionEvent) objArr[0], (MotionEvent) objArr[1], ((Number) objArr[2]).floatValue(), ((Number) objArr[3]).floatValue()));
    }

    public b(DWContext dWContext, FrameLayout frameLayout) {
        this.f16553a = dWContext;
        this.k = frameLayout;
        this.e = this.f16553a.getVideo().n();
        this.f = new SimpleDateFormat("mm:ss").format(Integer.valueOf(this.e));
        try {
            this.g = (AudioManager) this.f16553a.getActivity().getApplicationContext().getSystemService("audio");
            this.h = this.g.getStreamMaxVolume(3);
        } catch (Exception unused) {
            this.h = 15.0f;
        }
        this.i = this.f16553a.getVideo().r();
        this.j = 1.0f;
        f();
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        this.l = (FrameLayout) LayoutInflater.from(this.f16553a.getActivity()).inflate(R.layout.dw_gesture_progress_layout, (ViewGroup) null);
        this.m = (ProgressBar) this.l.findViewById(R.id.dw_gesture_background_progress);
        this.n = (ImageView) this.l.findViewById(R.id.dw_gesture_progress_img);
        this.o = (TextView) this.l.findViewById(R.id.dw_gesture_progress_tv);
        this.l.setVisibility(8);
        ViewParent parent = this.l.getParent();
        if (parent != null) {
            ((ViewGroup) parent).removeAllViews();
        }
        this.k.addView(this.l);
        this.p = (LinearLayout) LayoutInflater.from(this.f16553a.getActivity()).inflate(R.layout.dw_gesture_volume_layout, (ViewGroup) null).findViewById(R.id.dw_gesture_volume);
        this.q = (ProgressBar) this.p.findViewById(R.id.dw_gesture_volume_progress);
        this.p.setVisibility(8);
        ViewParent parent2 = this.p.getParent();
        if (parent2 != null) {
            ((ViewGroup) parent2).removeAllViews();
        }
        this.k.addView(this.p);
        this.r = (LinearLayout) LayoutInflater.from(this.f16553a.getActivity()).inflate(R.layout.dw_gesture_bright_layout, (ViewGroup) null).findViewById(R.id.dw_gesture_bright);
        this.s = (ProgressBar) this.r.findViewById(R.id.dw_gesture_bright_progress);
        this.r.setVisibility(8);
        ViewParent parent3 = this.r.getParent();
        if (parent3 != null) {
            ((ViewGroup) parent3).removeAllViews();
        }
        this.k.addView(this.r);
        this.q.setProgress((int) ((this.i / this.h) * 100.0f));
        this.s.setProgress(((int) this.j) * 100);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.b = -1;
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        DWContext dWContext = this.f16553a;
        if (dWContext == null || dWContext.mUTAdapter == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        String str = "0";
        hashMap.put("type", str);
        int i = this.d;
        if (i < 0) {
            str = "1";
        } else if (i <= 0) {
            str = "2";
        }
        hashMap.put("progress", str);
        hashMap.put("mute", this.f16553a.isMute() ? "true" : "false");
        this.f16553a.mUTAdapter.a("DWVideo", "Button", "videoProgress", this.f16553a.getUTParams(), hashMap);
    }

    private void a(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else if (this.b != 0) {
        } else {
            long j = this.t + (this.d * 1000);
            if (j < 0) {
                j = 0;
            } else {
                int i = this.e;
                if (j > i) {
                    j = i;
                }
            }
            ProgressBar progressBar = this.m;
            if (progressBar != null) {
                progressBar.setProgress((int) (((float) (100 * j)) / this.e));
            }
            if (z2) {
                return;
            }
            if (z) {
                this.f16553a.getVideo().b((int) j);
            } else {
                this.f16553a.getVideo().a((int) j);
            }
        }
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        if (this.b == 0) {
            if (this.f16553a.isInstantSeekingEnable()) {
                b();
            }
            a(false, false);
        }
        this.l.setVisibility(8);
        this.p.setVisibility(8);
        this.r.setVisibility(8);
        return this.b != -1;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        if (this.b == 0) {
            a(false, false);
            if (this.f16553a.isInstantSeekingEnable()) {
                b();
            }
        }
        this.l.setVisibility(8);
        this.p.setVisibility(8);
        this.r.setVisibility(8);
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = this.l;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        LinearLayout linearLayout = this.p;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        LinearLayout linearLayout2 = this.r;
        if (linearLayout2 == null) {
            return;
        }
        linearLayout2.setVisibility(8);
    }

    private int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c0f961", new Object[]{this})).intValue();
        }
        int i = AnonymousClass1.f16554a[this.f16553a.screenType().ordinal()];
        if (i == 1) {
            return kcl.c();
        }
        if (i == 2) {
            return kcl.b(this.f16553a.getActivity());
        }
        return this.f16553a.isFloating() ? this.f16553a.mNormalWidth : this.f16553a.mWidth;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        int i;
        String format;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("12546941", new Object[]{this, motionEvent, motionEvent2, new Float(f), new Float(f2)})).booleanValue();
        }
        if (motionEvent == null || motionEvent2 == null) {
            return super.onScroll(motionEvent, motionEvent2, f, f2);
        }
        float x = motionEvent.getX();
        motionEvent.getY();
        motionEvent2.getRawY();
        if (this.c) {
            if (Math.abs(f) >= Math.abs(f2)) {
                this.d = 0;
                this.t = this.f16553a.getVideo().o();
                this.b = 0;
                if (!this.f16553a.isHiddenGestureView()) {
                    this.l.setVisibility(0);
                }
            } else {
                double d = x;
                if (d > (g() * 3.0d) / 5.0d) {
                    this.b = 1;
                } else if (d < (g() * 2.0d) / 5.0d) {
                    this.b = 2;
                }
            }
        }
        int i2 = this.b;
        if (i2 == 0) {
            if (Math.abs(f) > Math.abs(f2)) {
                if (f >= kcl.a(this.f16553a.getActivity(), 1.0f)) {
                    this.d--;
                    this.n.setBackgroundDrawable(this.f16553a.getActivity().getResources().getDrawable(R.drawable.dw_gesture_progress_decrease));
                    this.u.setLength(0);
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("mm:ss");
                    if (this.d < 0) {
                        long abs = this.t - (Math.abs(i) * 1000);
                        if (abs < 0) {
                            abs = 0;
                        }
                        format = simpleDateFormat.format(Long.valueOf(abs));
                    } else {
                        long abs2 = this.t + (Math.abs(i) * 1000);
                        int i3 = this.e;
                        if (abs2 > i3) {
                            abs2 = i3;
                        }
                        format = simpleDateFormat.format(Long.valueOf(abs2));
                    }
                    this.u.append(format);
                    StringBuilder sb = this.u;
                    sb.append(" / ");
                    sb.append(this.f);
                    SpannableString spannableString = new SpannableString(this.u.toString());
                    spannableString.setSpan(new ForegroundColorSpan(this.f16553a.getActivity().getResources().getColor(R.color.dw_interactive_sdk_red_a)), 0, format.length(), 33);
                    this.o.setText(spannableString);
                    a(this.f16553a.isInstantSeekingEnable(), !this.f16553a.isInstantSeekingEnable());
                } else if (f <= (-kcl.a(this.f16553a.getActivity(), 1.0f))) {
                    this.d++;
                    this.n.setBackgroundDrawable(this.f16553a.getActivity().getResources().getDrawable(R.drawable.dw_gesture_progress_increase));
                    this.u.setLength(0);
                    SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("mm:ss");
                    long j = this.t + (this.d * 1000);
                    int i4 = this.e;
                    if (j > i4) {
                        j = i4;
                    }
                    if (j < 0) {
                        j = 0;
                    }
                    String format2 = simpleDateFormat2.format(Long.valueOf(j));
                    this.u.append(format2);
                    StringBuilder sb2 = this.u;
                    sb2.append(" / ");
                    sb2.append(this.f);
                    SpannableString spannableString2 = new SpannableString(this.u.toString());
                    spannableString2.setSpan(new ForegroundColorSpan(this.f16553a.getActivity().getResources().getColor(R.color.dw_interactive_sdk_red_a)), 0, format2.length(), 33);
                    this.o.setText(spannableString2);
                    a(this.f16553a.isInstantSeekingEnable(), !this.f16553a.isInstantSeekingEnable());
                }
            }
        } else if (i2 == 1) {
            this.i = this.f16553a.getVideo().r();
            if (Math.abs(f2) > Math.abs(f)) {
                if (f2 >= kcl.a(this.f16553a.getActivity(), 5.0f)) {
                    float f3 = this.i;
                    if (f3 < this.h) {
                        this.i = f3 + 1.0f;
                    }
                } else if (f2 < (-kcl.a(this.f16553a.getActivity(), 5.0f))) {
                    float f4 = this.i;
                    if (f4 > 0.0f) {
                        this.i = f4 - 1.0f;
                    }
                }
                if (!this.f16553a.isHiddenGestureView()) {
                    this.p.setVisibility(0);
                }
                this.f16553a.getVideo().a(this.i);
                this.q.setProgress((int) ((this.i / this.h) * 100.0f));
            }
        } else if (i2 == 2 && Math.abs(f2) > Math.abs(f)) {
            WindowManager.LayoutParams attributes = this.f16553a.getActivity().getWindow().getAttributes();
            if (f2 >= kcl.a(this.f16553a.getActivity(), 5.0f)) {
                attributes.screenBrightness = this.j + 0.1f;
                if (attributes.screenBrightness > 1.0f) {
                    attributes.screenBrightness = 1.0f;
                } else if (attributes.screenBrightness < 0.01f) {
                    attributes.screenBrightness = 0.01f;
                }
            } else if (f2 < (-kcl.a(this.f16553a.getActivity(), 5.0f))) {
                attributes.screenBrightness = this.j - 0.1f;
                if (attributes.screenBrightness > 1.0f) {
                    attributes.screenBrightness = 1.0f;
                } else if (attributes.screenBrightness < 0.01f) {
                    attributes.screenBrightness = 0.01f;
                }
            }
            this.j = attributes.screenBrightness;
            if (!this.f16553a.isHiddenGestureView()) {
                this.r.setVisibility(0);
            }
            this.f16553a.getActivity().getWindow().setAttributes(attributes);
            this.s.setProgress((int) (this.j * 100.0f));
        }
        this.c = false;
        return super.onScroll(motionEvent, motionEvent2, f, f2);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("22fe0341", new Object[]{this, motionEvent})).booleanValue();
        }
        this.c = true;
        return super.onDown(motionEvent);
    }
}
