package com.taobao.android.detail.core.detail.kit.view.widget.base.chronometer;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.utils.i;
import com.taobao.calendar.sdk.db.schedule.Repeat;
import java.lang.ref.WeakReference;
import java.util.Calendar;
import java.util.Locale;
import mtopsdk.mtop.global.SDKUtils;
import tb.ecu;
import tb.emu;
import tb.epo;
import tb.kge;
import tb.riy;

/* loaded from: classes4.dex */
public class ChronometerView extends SurfaceView implements SurfaceHolder.Callback {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int MAX_SUB_SECOND_DIGITS = 2;
    private static final int MILLIS_IN_HOUR = 3600000;
    private static final int MILLIS_IN_MINUTE = 60000;
    private static final int MILLIS_IN_SECOND = 1000;
    private static final int MIN_SUB_SECOND_DIGITS = 1;
    private static final int MSG_CHRONOMETER_DRAW = 101;
    private long futureTime;
    private com.taobao.android.detail.core.detail.kit.view.widget.base.chronometer.c hourItem;
    private boolean isDowngrade;
    private com.taobao.android.detail.core.detail.kit.view.widget.base.chronometer.b lDotItem;
    private int mBgColor;
    private Context mContext;
    private com.taobao.android.detail.core.detail.kit.view.widget.base.chronometer.b mDotItem;
    private Handler mHandler;
    private int mRefreshCount;
    private int mRefreshFilter;
    private int mSubSecondDigits;
    private boolean mSubSecondEnabled;
    private int mSubSecondInterval;
    private com.taobao.android.detail.core.detail.kit.view.widget.base.chronometer.c minuteItem;
    private long nextDayMills;
    private b onCompleteListener;
    private c onTimeChangeListener;
    private com.taobao.android.detail.core.detail.kit.view.widget.base.chronometer.b rDotItem;
    private volatile boolean running;
    private com.taobao.android.detail.core.detail.kit.view.widget.base.chronometer.c secondItem;
    private com.taobao.android.detail.core.detail.kit.view.widget.base.chronometer.c subSecondItem;
    private SurfaceHolder surfaceHolder;
    private Thread thread;

    /* loaded from: classes4.dex */
    public interface b {
        void a();
    }

    /* loaded from: classes4.dex */
    public interface c {
        void a();
    }

    static {
        kge.a(-1703768233);
        kge.a(632307482);
    }

    public static /* synthetic */ Object ipc$super(ChronometerView chronometerView, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7f2c515", new Object[]{this, surfaceHolder, new Integer(i), new Integer(i2), new Integer(i3)});
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84fd8b02", new Object[]{this, surfaceHolder});
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7b74573", new Object[]{this, surfaceHolder});
        }
    }

    public static /* synthetic */ void access$000(ChronometerView chronometerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a9ee16f", new Object[]{chronometerView});
        } else {
            chronometerView.initChildThread();
        }
    }

    public static /* synthetic */ boolean access$100(ChronometerView chronometerView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b2e521b4", new Object[]{chronometerView})).booleanValue() : chronometerView.running;
    }

    public static /* synthetic */ Handler access$200(ChronometerView chronometerView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("ad5d7d35", new Object[]{chronometerView}) : chronometerView.mHandler;
    }

    public static /* synthetic */ int access$300(ChronometerView chronometerView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("371a225", new Object[]{chronometerView})).intValue() : chronometerView.mRefreshFilter;
    }

    public static /* synthetic */ int access$408(ChronometerView chronometerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5912c66e", new Object[]{chronometerView})).intValue();
        }
        int i = chronometerView.mRefreshCount;
        chronometerView.mRefreshCount = i + 1;
        return i;
    }

    public static /* synthetic */ boolean access$500(ChronometerView chronometerView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("53fe22b8", new Object[]{chronometerView})).booleanValue() : chronometerView.isDowngrade;
    }

    public static /* synthetic */ void access$600(ChronometerView chronometerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c4462f5", new Object[]{chronometerView});
        } else {
            surfaceViewOnDraw(chronometerView);
        }
    }

    public static /* synthetic */ boolean access$700(ChronometerView chronometerView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a48aa33a", new Object[]{chronometerView})).booleanValue() : chronometerView.mSubSecondEnabled;
    }

    public static /* synthetic */ int access$800(ChronometerView chronometerView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ccd0e36a", new Object[]{chronometerView})).intValue() : chronometerView.mSubSecondInterval;
    }

    public ChronometerView(Context context) {
        super(context);
        this.mSubSecondEnabled = false;
        this.mSubSecondDigits = 1;
        this.mRefreshCount = 0;
        this.mRefreshFilter = 1;
        this.isDowngrade = false;
        this.running = true;
        this.nextDayMills = getNextDayMills();
        init(context);
    }

    public ChronometerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mSubSecondEnabled = false;
        this.mSubSecondDigits = 1;
        this.mRefreshCount = 0;
        this.mRefreshFilter = 1;
        this.isDowngrade = false;
        this.running = true;
        this.nextDayMills = getNextDayMills();
        init(context);
    }

    public ChronometerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mSubSecondEnabled = false;
        this.mSubSecondDigits = 1;
        this.mRefreshCount = 0;
        this.mRefreshFilter = 1;
        this.isDowngrade = false;
        this.running = true;
        this.nextDayMills = getNextDayMills();
        init(context);
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        emu.a("com.taobao.android.detail.core.detail.kit.view.widget.base.chronometer.ChronometerView");
        if (context == null) {
            return;
        }
        this.mContext = (Context) new WeakReference(context).get();
        if (this.mContext == null) {
            return;
        }
        this.surfaceHolder = getHolder();
        SurfaceHolder surfaceHolder = this.surfaceHolder;
        if (surfaceHolder != null) {
            surfaceHolder.addCallback(this);
        }
        this.mHandler = new a(this);
        this.hourItem = new com.taobao.android.detail.core.detail.kit.view.widget.base.chronometer.c(this.mContext);
        this.minuteItem = new com.taobao.android.detail.core.detail.kit.view.widget.base.chronometer.c(this.mContext);
        this.secondItem = new com.taobao.android.detail.core.detail.kit.view.widget.base.chronometer.c(this.mContext);
        this.subSecondItem = new com.taobao.android.detail.core.detail.kit.view.widget.base.chronometer.c(this.mContext);
        this.lDotItem = new com.taobao.android.detail.core.detail.kit.view.widget.base.chronometer.b(this.mContext);
        this.mDotItem = new com.taobao.android.detail.core.detail.kit.view.widget.base.chronometer.b(this.mContext);
        this.rDotItem = new com.taobao.android.detail.core.detail.kit.view.widget.base.chronometer.b(this.mContext);
        setBgColor(com.taobao.android.detail.core.utils.c.a("#ffffff"));
        setTextColor(com.taobao.android.detail.core.utils.c.a("#ffffff"), com.taobao.android.detail.core.utils.c.a("#333333"));
        setTextSize(epo.j);
        if (this.mSubSecondEnabled) {
            this.mSubSecondInterval = 1000;
            for (int i = 0; i < this.mSubSecondDigits; i++) {
                this.mSubSecondInterval /= 10;
            }
        }
        this.isDowngrade = isDowngrade();
    }

    private boolean isDowngrade() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d5a6c976", new Object[]{this})).booleanValue() : !ecu.n || Build.VERSION.SDK_INT == 18;
    }

    public void setBgColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("321c1980", new Object[]{this, new Integer(i)});
            return;
        }
        this.mBgColor = i;
        SurfaceHolder surfaceHolder = this.surfaceHolder;
        if (surfaceHolder == null) {
            return;
        }
        surfaceHolder.setFormat(this.mBgColor == 0 ? -2 : -1);
    }

    public void setTextColor(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("939e781b", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.hourItem.a(i, i2);
        this.minuteItem.a(i, i2);
        this.secondItem.a(i, i2);
        this.subSecondItem.a(i, i2);
        this.lDotItem.a(i, i2);
        this.mDotItem.a(i, i2);
        this.rDotItem.a(i, i2);
    }

    public void setDotColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e7b2c0", new Object[]{this, new Integer(i)});
            return;
        }
        this.lDotItem.a(i, i);
        this.mDotItem.a(i, i);
        this.rDotItem.a(i, i);
    }

    public void setTextSize(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b5ef80c", new Object[]{this, new Integer(i)});
            return;
        }
        this.hourItem.a(i);
        this.minuteItem.a(i);
        this.secondItem.a(i);
        this.subSecondItem.a(i);
        this.lDotItem.a(i);
        this.mDotItem.a(i);
        this.rDotItem.a(i);
    }

    public void setTextPadding(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("473a1a09", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.hourItem.b(i, i2);
        this.minuteItem.b(i, i2);
        this.secondItem.b(i, i2);
        this.subSecondItem.b(i, i2);
    }

    public void setDotPadding(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd035031", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.lDotItem.b(i, i2);
        this.mDotItem.b(i, i2);
        this.rDotItem.b(i, i2);
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.hourItem.a(getPaddingLeft());
        this.hourItem.b(getPaddingTop());
        this.lDotItem.a(this.hourItem.l.right);
        this.lDotItem.b((this.hourItem.l.top + (this.hourItem.l.height() / 2.0f)) - (this.lDotItem.c / 2.0f));
        this.minuteItem.a(this.lDotItem.l.right);
        this.minuteItem.b(this.hourItem.l.top);
        this.mDotItem.a(this.minuteItem.l.right);
        this.mDotItem.b(this.lDotItem.l.top);
        this.secondItem.a(this.mDotItem.l.right);
        this.secondItem.b(this.hourItem.l.top);
        if (this.mSubSecondEnabled) {
            this.rDotItem.a(this.secondItem.l.right);
            this.rDotItem.b(this.lDotItem.l.top);
            this.subSecondItem.a(this.rDotItem.l.right);
            this.subSecondItem.b(this.hourItem.l.top);
        }
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec((int) (((this.mSubSecondEnabled ? this.subSecondItem : this.secondItem).l.right - this.hourItem.l.left) + getPaddingLeft() + getPaddingRight()), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (this.hourItem.c + getPaddingTop() + getPaddingBottom()), 1073741824));
    }

    public void enableSubSecond(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5aaa353c", new Object[]{this, new Boolean(z)});
        } else {
            enableSubSecond(z, 1);
        }
    }

    public void enableSubSecond(boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa9ce547", new Object[]{this, new Boolean(z), new Integer(i)});
            return;
        }
        this.mSubSecondEnabled = z;
        this.mSubSecondDigits = i;
        int i2 = this.mSubSecondDigits;
        if (i2 <= 0) {
            this.mSubSecondDigits = 1;
        } else if (i2 > 2) {
            this.mSubSecondDigits = 2;
        }
        if (!this.mSubSecondEnabled) {
            return;
        }
        this.mSubSecondInterval = 1000;
        for (int i3 = 0; i3 < this.mSubSecondDigits; i3++) {
            this.mSubSecondInterval /= 10;
        }
    }

    public void enableRefreshFilter(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("304913ec", new Object[]{this, new Integer(i)});
            return;
        }
        this.mRefreshCount = 0;
        if (i <= 0) {
            i = 1;
        }
        this.mRefreshFilter = i;
    }

    public ChronometerView setFutureTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ChronometerView) ipChange.ipc$dispatch("987f7d83", new Object[]{this, new Long(j)});
        }
        this.futureTime = j;
        return this;
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        if (this.running) {
            stopTiming();
        }
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.mHandler = null;
        }
        SurfaceHolder surfaceHolder = this.surfaceHolder;
        if (surfaceHolder == null) {
            return;
        }
        Surface surface = surfaceHolder.getSurface();
        if (surface != null) {
            surface.release();
        }
        this.surfaceHolder = null;
    }

    public void startTiming() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1614dd3", new Object[]{this});
        } else if (this.isDowngrade) {
            post(new Runnable() { // from class: com.taobao.android.detail.core.detail.kit.view.widget.base.chronometer.ChronometerView.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        ChronometerView.access$000(ChronometerView.this);
                    }
                }
            });
        } else {
            initChildThread();
        }
    }

    private void initChildThread() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0002c9d", new Object[]{this});
            return;
        }
        stopTiming();
        this.running = true;
        this.thread = new Thread(new d(this));
        this.thread.setPriority(10);
        this.thread.start();
    }

    public void stopTiming() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab048973", new Object[]{this});
            return;
        }
        this.running = false;
        Thread thread = this.thread;
        if (thread == null) {
            return;
        }
        thread.interrupt();
    }

    private long getRemainingTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6fc8ec28", new Object[]{this})).longValue();
        }
        if (this.futureTime > 0) {
            return this.futureTime - ((SDKUtils.getTimeOffset() * 1000) + System.currentTimeMillis());
        }
        return -1L;
    }

    private void doDraw(Canvas canvas) {
        String str;
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f3984af", new Object[]{this, canvas});
            return;
        }
        long remainingTime = getRemainingTime();
        String str4 = "";
        if (remainingTime > 0) {
            long j = remainingTime / 3600000;
            long j2 = remainingTime - (3600000 * j);
            long j3 = j2 / 60000;
            long j4 = j2 - (60000 * j3);
            long j5 = j4 / 1000;
            str2 = String.format(Locale.getDefault(), "%02d", Long.valueOf(j));
            String format = String.format(Locale.getDefault(), "%02d", Long.valueOf(j3));
            str3 = String.format(Locale.getDefault(), "%02d", Long.valueOf(j5));
            if (this.mSubSecondEnabled) {
                long j6 = (j4 - (j5 * 1000)) / this.mSubSecondInterval;
                Locale locale = Locale.getDefault();
                str4 = String.format(locale, riy.MOD + this.mSubSecondDigits + Repeat.D, Long.valueOf(j6));
            }
            if (getNow() > this.nextDayMills) {
                i.b("ChronometerView", "getNow:" + getNow() + " , nextDayMills:" + this.nextDayMills);
                this.nextDayMills = getNextDayMills();
                i.b("ChronometerView", "after setNextDayMills, getNow:" + getNow() + " , nextDayMills:" + this.nextDayMills);
                c cVar = this.onTimeChangeListener;
                if (cVar != null) {
                    cVar.a();
                }
            }
            str = str4;
            str4 = format;
        } else {
            b bVar = this.onCompleteListener;
            if (bVar != null) {
                bVar.a();
            }
            this.running = false;
            str = str4;
            str2 = str;
            str3 = str2;
        }
        canvas.drawColor(this.mBgColor);
        this.hourItem.a(str2).a(canvas);
        this.lDotItem.a(canvas);
        this.minuteItem.a(str4).a(canvas);
        this.mDotItem.a(canvas);
        this.secondItem.a(str3).a(canvas);
        if (!this.mSubSecondEnabled) {
            return;
        }
        this.rDotItem.a(canvas);
        this.subSecondItem.a(str).a(canvas);
    }

    public long getNow() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bcc7101b", new Object[]{this})).longValue() : (SDKUtils.getTimeOffset() * 1000) + System.currentTimeMillis();
    }

    public long getNextDayMills() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2bc17e9f", new Object[]{this})).longValue();
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(SDKUtils.getCorrectionTimeMillis());
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis() + 86400000;
    }

    public void setOnCompleteListener(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7053e3cf", new Object[]{this, bVar});
        } else {
            this.onCompleteListener = bVar;
        }
    }

    public void setOnTimeChangeListener(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9256492", new Object[]{this, cVar});
        } else {
            this.onTimeChangeListener = cVar;
        }
    }

    /* loaded from: classes4.dex */
    public static class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public WeakReference<ChronometerView> f9607a;

        static {
            kge.a(338829839);
            kge.a(-1390502639);
        }

        public d(ChronometerView chronometerView) {
            this.f9607a = null;
            this.f9607a = new WeakReference<>(chronometerView);
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            while (true) {
                ChronometerView chronometerView = this.f9607a.get();
                if (chronometerView == null || !ChronometerView.access$100(chronometerView)) {
                    return;
                }
                if (ChronometerView.access$200(chronometerView) != null) {
                    if (ChronometerView.access$300(chronometerView) <= 1 || ChronometerView.access$408(chronometerView) % ChronometerView.access$300(chronometerView) == 0) {
                        if (ChronometerView.access$500(chronometerView)) {
                            ChronometerView.access$200(chronometerView).sendEmptyMessage(101);
                        } else {
                            ChronometerView.access$600(chronometerView);
                        }
                    }
                }
                Thread.sleep(ChronometerView.access$700(chronometerView) ? ChronometerView.access$800(chronometerView) : 1000L);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public WeakReference<ChronometerView> f9606a;

        static {
            kge.a(-1503658287);
        }

        public a(ChronometerView chronometerView) {
            this.f9606a = new WeakReference<>(chronometerView);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            ChronometerView chronometerView;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            WeakReference<ChronometerView> weakReference = this.f9606a;
            if (weakReference == null || (chronometerView = weakReference.get()) == null || message == null || message.what != 101) {
                return;
            }
            ChronometerView.access$600(chronometerView);
        }
    }

    private static void surfaceViewOnDraw(ChronometerView chronometerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec05f854", new Object[]{chronometerView});
            return;
        }
        SurfaceHolder surfaceHolder = chronometerView.surfaceHolder;
        if (surfaceHolder == null) {
            return;
        }
        synchronized (surfaceHolder) {
            Canvas lockCanvas = chronometerView.surfaceHolder.lockCanvas(null);
            if (lockCanvas != null) {
                chronometerView.doDraw(lockCanvas);
                chronometerView.surfaceHolder.unlockCanvasAndPost(lockCanvas);
            }
        }
    }
}
