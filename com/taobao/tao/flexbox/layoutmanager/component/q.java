package com.taobao.tao.flexbox.layoutmanager.component;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.widget.ProgressBar;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import tb.kge;
import tb.ogl;

/* loaded from: classes8.dex */
public class q extends Component<ProgressBar, a> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f20186a;
    private int b;
    private int c;
    private Handler d = new Handler(Looper.getMainLooper()) { // from class: com.taobao.tao.flexbox.layoutmanager.component.q.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int progress;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            } else if (q.a(q.this) == null || q.c(q.this) <= (progress = ((ProgressBar) q.b(q.this)).getProgress())) {
            } else {
                int i = progress + 1;
                ((ProgressBar) q.d(q.this)).setProgress(Math.min(q.c(q.this), i));
                if (q.c(q.this) > i) {
                    sendEmptyMessageDelayed(0, q.e(q.this));
                }
                q qVar = q.this;
                q.a(qVar, ((ProgressBar) q.f(qVar)).getProgress());
            }
        }
    };

    static {
        kge.a(1979760053);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.taobao.tao.flexbox.layoutmanager.component.q$a, tb.ogl] */
    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    /* renamed from: generateViewParams */
    public /* synthetic */ a mo1260generateViewParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("36baa12b", new Object[]{this}) : a();
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [android.widget.ProgressBar, android.view.View] */
    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public /* synthetic */ ProgressBar onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context}) : a(context);
    }

    public static /* synthetic */ int a(q qVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c5473c75", new Object[]{qVar, new Integer(i)})).intValue();
        }
        qVar.c = i;
        return i;
    }

    public static /* synthetic */ View a(q qVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("66e21ca3", new Object[]{qVar}) : qVar.view;
    }

    public static /* synthetic */ View b(q qVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("2dee03a4", new Object[]{qVar}) : qVar.view;
    }

    public static /* synthetic */ int c(q qVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("eb33516", new Object[]{qVar})).intValue() : qVar.f20186a;
    }

    public static /* synthetic */ View d(q qVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("bc05d1a6", new Object[]{qVar}) : qVar.view;
    }

    public static /* synthetic */ int e(q qVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("615bdf98", new Object[]{qVar})).intValue() : qVar.b;
    }

    public static /* synthetic */ View f(q qVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("4a1d9fa8", new Object[]{qVar}) : qVar.view;
    }

    public static /* synthetic */ int g(q qVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b4048a1a", new Object[]{qVar})).intValue() : qVar.c;
    }

    public ProgressBar a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ProgressBar) ipChange.ipc$dispatch("7711f2aa", new Object[]{this, context});
        }
        ProgressBar progressBar = new ProgressBar(context, null, 16842872);
        progressBar.setProgressDrawable(new LayerDrawable(new Drawable[]{new ColorDrawable(((a) this.viewParams).c), new ScaleDrawable(com.taobao.tao.flexbox.layoutmanager.drawable.b.a(((a) this.viewParams).b, ((a) this.viewParams).g), 3, 1.0f, -1.0f)}));
        int i = this.c;
        if (i <= 0) {
            i = ((a) this.viewParams).e;
        }
        progressBar.setProgress(i);
        this.c = progressBar.getProgress();
        progressBar.setMax(((a) this.viewParams).f);
        if (((a) this.viewParams).d) {
            this.d.post(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.component.q.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    q qVar = q.this;
                    qVar.a(Math.max(q.g(qVar), 2));
                }
            });
        }
        return progressBar;
    }

    public a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("e6685f4a", new Object[]{this}) : new a();
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (this.view == 0) {
        } else {
            int max = Math.max(this.f20186a, i);
            this.f20186a = max;
            int progress = ((ProgressBar) this.view).getProgress();
            this.d.removeMessages(0);
            if (((a) this.viewParams).d) {
                if (max == ((a) this.viewParams).f) {
                    this.b = 0;
                    ((ProgressBar) this.view).setProgress(max);
                } else if (this.f20186a - progress > 2) {
                    ((ProgressBar) this.view).setProgress(progress + 1);
                    this.b = 1000 / ((this.f20186a - progress) - 1);
                    this.d.sendEmptyMessageDelayed(0, this.b);
                } else {
                    this.b = 0;
                    ((ProgressBar) this.view).setProgress(max);
                }
            } else {
                ((ProgressBar) this.view).setProgress(max);
            }
            this.c = ((ProgressBar) this.view).getProgress();
        }
    }

    /* loaded from: classes8.dex */
    public static class a extends ogl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f20189a;
        public int b;
        public int c;
        public int e;
        public boolean d = true;
        public int f = 100;
        public int g = 0;

        static {
            kge.a(1292995079);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
            if (r9.equals("progress-back-color") != false) goto L10;
         */
        @Override // tb.ogl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a(android.content.Context r8, java.lang.String r9, java.lang.Object r10) {
            /*
                r7 = this;
                com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.tao.flexbox.layoutmanager.component.q.a.$ipChange
                boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
                r2 = 3
                r3 = 2
                r4 = 4
                r5 = 1
                r6 = 0
                if (r1 == 0) goto L1b
                java.lang.Object[] r1 = new java.lang.Object[r4]
                r1[r6] = r7
                r1[r5] = r8
                r1[r3] = r9
                r1[r2] = r10
                java.lang.String r8 = "840caf86"
                r0.ipc$dispatch(r8, r1)
                return
            L1b:
                r0 = -1
                int r1 = r9.hashCode()
                switch(r1) {
                    case -1182559670: goto L65;
                    case -898533970: goto L5a;
                    case 107876: goto L4f;
                    case 3575610: goto L44;
                    case 1294266307: goto L39;
                    case 1883813938: goto L2e;
                    case 1907833501: goto L24;
                    default: goto L23;
                }
            L23:
                goto L70
            L24:
                java.lang.String r1 = "progress-back-color"
                boolean r9 = r9.equals(r1)
                if (r9 == 0) goto L70
                goto L71
            L2e:
                java.lang.String r1 = "progress-radius"
                boolean r9 = r9.equals(r1)
                if (r9 == 0) goto L70
                r2 = 6
                goto L71
            L39:
                java.lang.String r1 = "progress-color"
                boolean r9 = r9.equals(r1)
                if (r9 == 0) goto L70
                r2 = 2
                goto L71
            L44:
                java.lang.String r1 = "type"
                boolean r9 = r9.equals(r1)
                if (r9 == 0) goto L70
                r2 = 0
                goto L71
            L4f:
                java.lang.String r1 = "max"
                boolean r9 = r9.equals(r1)
                if (r9 == 0) goto L70
                r2 = 5
                goto L71
            L5a:
                java.lang.String r1 = "smooth"
                boolean r9 = r9.equals(r1)
                if (r9 == 0) goto L70
                r2 = 1
                goto L71
            L65:
                java.lang.String r1 = "init-progress"
                boolean r9 = r9.equals(r1)
                if (r9 == 0) goto L70
                r2 = 4
                goto L71
            L70:
                r2 = -1
            L71:
                switch(r2) {
                    case 0: goto La5;
                    case 1: goto L9e;
                    case 2: goto L97;
                    case 3: goto L90;
                    case 4: goto L89;
                    case 5: goto L80;
                    case 6: goto L75;
                    default: goto L74;
                }
            L74:
                goto Lae
            L75:
                com.taobao.tao.flexbox.layoutmanager.core.aa r9 = r7.h()
                int r8 = a(r9, r8, r10)
                r7.g = r8
                goto Lae
            L80:
                r8 = 100
                int r8 = tb.oec.a(r10, r8)
                r7.f = r8
                return
            L89:
                int r8 = tb.oec.a(r10, r6)
                r7.e = r8
                return
            L90:
                int r8 = tb.odx.a(r10)
                r7.c = r8
                return
            L97:
                int r8 = tb.odx.a(r10)
                r7.b = r8
                return
            L9e:
                boolean r8 = tb.oec.a(r10, r5)
                r7.d = r8
                return
            La5:
                java.lang.String r8 = "line"
                java.lang.String r8 = tb.oec.a(r10, r8)
                r7.f20189a = r8
            Lae:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.component.q.a.a(android.content.Context, java.lang.String, java.lang.Object):void");
        }
    }
}
