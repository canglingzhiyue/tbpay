package com.taobao.android.dinamicx.view;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.view.HandlerTimer;
import com.taobao.taobao.R;
import tb.fpa;
import tb.fqi;
import tb.kge;

/* loaded from: classes5.dex */
public class DXNativeCountDownTimerView extends RelativeLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DX_DIGIT_COUNT_DOUBLE = 2;
    public static final int DX_DIGIT_COUNT_SINGLE = 1;
    private static final String TAG = "DCountDownTimerView";
    private TextView colonFirst;
    private TextView colonSecond;
    private TextView colonThird;
    private View countDownTimerContainer;
    private long futureTime;
    private boolean hasRegisterReceiver;
    private TextView hour;
    private int interval;
    private boolean isAttached;
    private boolean isNativeTime;
    private final BroadcastReceiver mReceiver;
    private HandlerTimer mTimer;
    private TextView milli;
    private int milliSecondDigitCount;
    private TextView minute;
    private long offset;
    private a onFinishListener;
    private TextView second;
    private TextView seeMoreView;
    private boolean showMilliSecond;
    private boolean showSeeMoreText;

    /* loaded from: classes5.dex */
    public interface a {
        void a();
    }

    static {
        kge.a(-741864229);
    }

    public static /* synthetic */ Object ipc$super(DXNativeCountDownTimerView dXNativeCountDownTimerView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -461309207) {
            super.onWindowVisibilityChanged(((Number) objArr[0]).intValue());
            return null;
        } else if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else if (hashCode != 1626033557) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onAttachedToWindow();
            return null;
        }
    }

    public static /* synthetic */ boolean access$000(DXNativeCountDownTimerView dXNativeCountDownTimerView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6db3b573", new Object[]{dXNativeCountDownTimerView})).booleanValue() : dXNativeCountDownTimerView.isAttached;
    }

    public static /* synthetic */ HandlerTimer access$100(DXNativeCountDownTimerView dXNativeCountDownTimerView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HandlerTimer) ipChange.ipc$dispatch("f7cc2505", new Object[]{dXNativeCountDownTimerView}) : dXNativeCountDownTimerView.mTimer;
    }

    public static /* synthetic */ long access$200(DXNativeCountDownTimerView dXNativeCountDownTimerView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a68fae21", new Object[]{dXNativeCountDownTimerView})).longValue() : dXNativeCountDownTimerView.futureTime;
    }

    public a getOnFinishListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("393456bc", new Object[]{this}) : this.onFinishListener;
    }

    public void setOnFinishListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2380f71a", new Object[]{this, aVar});
        } else {
            this.onFinishListener = aVar;
        }
    }

    public DXNativeCountDownTimerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.interval = 500;
        this.milliSecondDigitCount = 1;
        this.isNativeTime = true;
        this.offset = 0L;
        this.mReceiver = new BroadcastReceiver() { // from class: com.taobao.android.dinamicx.view.DXNativeCountDownTimerView.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                } else if (DXNativeCountDownTimerView.access$100(DXNativeCountDownTimerView.this) == null) {
                } else {
                    String action = intent.getAction();
                    if ("android.intent.action.SCREEN_OFF".equals(action)) {
                        DXNativeCountDownTimerView.access$100(DXNativeCountDownTimerView.this).b();
                    } else if (!"android.intent.action.USER_PRESENT".equals(action)) {
                    } else {
                        if (!DXNativeCountDownTimerView.this.isShown() || DXNativeCountDownTimerView.access$200(DXNativeCountDownTimerView.this) <= 0) {
                            DXNativeCountDownTimerView.access$100(DXNativeCountDownTimerView.this).b();
                        } else {
                            DXNativeCountDownTimerView.access$100(DXNativeCountDownTimerView.this).a();
                        }
                    }
                }
            }
        };
        init();
    }

    public DXNativeCountDownTimerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.interval = 500;
        this.milliSecondDigitCount = 1;
        this.isNativeTime = true;
        this.offset = 0L;
        this.mReceiver = new BroadcastReceiver() { // from class: com.taobao.android.dinamicx.view.DXNativeCountDownTimerView.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                } else if (DXNativeCountDownTimerView.access$100(DXNativeCountDownTimerView.this) == null) {
                } else {
                    String action = intent.getAction();
                    if ("android.intent.action.SCREEN_OFF".equals(action)) {
                        DXNativeCountDownTimerView.access$100(DXNativeCountDownTimerView.this).b();
                    } else if (!"android.intent.action.USER_PRESENT".equals(action)) {
                    } else {
                        if (!DXNativeCountDownTimerView.this.isShown() || DXNativeCountDownTimerView.access$200(DXNativeCountDownTimerView.this) <= 0) {
                            DXNativeCountDownTimerView.access$100(DXNativeCountDownTimerView.this).b();
                        } else {
                            DXNativeCountDownTimerView.access$100(DXNativeCountDownTimerView.this).a();
                        }
                    }
                }
            }
        };
        init();
    }

    public DXNativeCountDownTimerView(Context context) {
        super(context);
        this.interval = 500;
        this.milliSecondDigitCount = 1;
        this.isNativeTime = true;
        this.offset = 0L;
        this.mReceiver = new BroadcastReceiver() { // from class: com.taobao.android.dinamicx.view.DXNativeCountDownTimerView.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                } else if (DXNativeCountDownTimerView.access$100(DXNativeCountDownTimerView.this) == null) {
                } else {
                    String action = intent.getAction();
                    if ("android.intent.action.SCREEN_OFF".equals(action)) {
                        DXNativeCountDownTimerView.access$100(DXNativeCountDownTimerView.this).b();
                    } else if (!"android.intent.action.USER_PRESENT".equals(action)) {
                    } else {
                        if (!DXNativeCountDownTimerView.this.isShown() || DXNativeCountDownTimerView.access$200(DXNativeCountDownTimerView.this) <= 0) {
                            DXNativeCountDownTimerView.access$100(DXNativeCountDownTimerView.this).b();
                        } else {
                            DXNativeCountDownTimerView.access$100(DXNativeCountDownTimerView.this).a();
                        }
                    }
                }
            }
        };
        init();
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        LayoutInflater.from(getContext()).inflate(R.layout.homepage_component_count_down_timer_view, this);
        this.hour = (TextView) findViewById(R.id.tv_hours);
        this.minute = (TextView) findViewById(R.id.tv_minutes);
        this.second = (TextView) findViewById(R.id.tv_seconds);
        this.milli = (TextView) findViewById(R.id.tv_milli);
        this.colonFirst = (TextView) findViewById(R.id.tv_colon1);
        this.colonSecond = (TextView) findViewById(R.id.tv_colon2);
        this.colonThird = (TextView) findViewById(R.id.tv_colon3);
        this.countDownTimerContainer = findViewById(R.id.count_down_timer_view_container);
        this.seeMoreView = (TextView) findViewById(R.id.see_more_default);
    }

    public HandlerTimer getTimer() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (HandlerTimer) ipChange.ipc$dispatch("4440a93d", new Object[]{this});
        }
        int i = this.showMilliSecond ? 50 : 500;
        if (this.interval != i) {
            this.interval = i;
            z = true;
        }
        if (this.mTimer == null || z) {
            this.mTimer = new HandlerTimer(this.interval, new Runnable() { // from class: com.taobao.android.dinamicx.view.DXNativeCountDownTimerView.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (!DXNativeCountDownTimerView.access$000(DXNativeCountDownTimerView.this)) {
                    } else {
                        DXNativeCountDownTimerView.this.updateCountView();
                    }
                }
            });
        }
        return this.mTimer;
    }

    public void updateCountView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db56092", new Object[]{this});
        } else if (this.showMilliSecond) {
            updateCountDownViewTimeWithMilli();
        } else {
            updateCountDownViewTime();
        }
    }

    public void setFutureTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e02eb12b", new Object[]{this, new Long(j)});
        } else {
            this.futureTime = j;
        }
    }

    public void setCurrentTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f105f79", new Object[]{this, new Long(j)});
        } else if (fqi.aN() && j <= 0) {
        } else {
            this.isNativeTime = false;
            this.offset = j - SystemClock.elapsedRealtime();
        }
    }

    public long getLastTime() {
        long elapsedRealtime;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7e823bf4", new Object[]{this})).longValue();
        }
        if (this.futureTime <= 0) {
            return -1L;
        }
        if (this.isNativeTime) {
            elapsedRealtime = System.currentTimeMillis();
        } else {
            elapsedRealtime = SystemClock.elapsedRealtime() + this.offset;
        }
        return this.futureTime - elapsedRealtime;
    }

    public void updateCountDownViewTimeWithMilli() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39a48b14", new Object[]{this});
        } else if (this.countDownTimerContainer == null) {
        } else {
            long lastTime = getLastTime();
            if (lastTime > 0) {
                long j = 3600000;
                long j2 = lastTime / j;
                long j3 = lastTime - (j * j2);
                long j4 = 60000;
                long j5 = j3 / j4;
                long j6 = j3 - (j4 * j5);
                long j7 = 1000;
                long j8 = j6 / j7;
                long j9 = (j6 - (j7 * j8)) / 1;
                if (j2 <= 99 && j5 <= 60 && j8 <= 60 && (j2 != 0 || j5 != 0 || j8 != 0 || j9 != 0)) {
                    int i = (int) (j9 / 100);
                    int i2 = (int) ((j9 % 100) / 10);
                    this.hour.setText(((int) (j2 / 10)) + "" + ((int) (j2 % 10)));
                    this.minute.setText(((int) (j5 / 10)) + "" + ((int) (j5 % 10)));
                    this.second.setText(((int) (j8 / 10)) + "" + ((int) (j8 % 10)));
                    int i3 = this.milliSecondDigitCount;
                    if (i3 == 1) {
                        this.milli.setText(String.valueOf(i));
                    } else if (i3 == 2) {
                        this.milli.setText(i + "" + i2);
                    }
                } else {
                    this.hour.setText("99");
                    this.minute.setText("59");
                    this.second.setText("59");
                    int i4 = this.milliSecondDigitCount;
                    if (i4 == 1) {
                        this.milli.setText("9");
                    } else if (i4 == 2) {
                        this.milli.setText("99");
                    }
                }
                showCountDown();
                return;
            }
            hideCountDown();
            this.hour.setText("00");
            this.minute.setText("00");
            this.second.setText("00");
            int i5 = this.milliSecondDigitCount;
            if (i5 == 1) {
                this.milli.setText("0");
            } else if (i5 == 2) {
                this.milli.setText("00");
            }
            HandlerTimer handlerTimer = this.mTimer;
            if (handlerTimer != null) {
                handlerTimer.b();
                this.mTimer = null;
            }
            a aVar = this.onFinishListener;
            if (aVar == null) {
                return;
            }
            aVar.a();
        }
    }

    public void updateCountDownViewTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("670e9e41", new Object[]{this});
        } else if (this.countDownTimerContainer == null) {
        } else {
            long lastTime = getLastTime();
            if (lastTime > 0) {
                long j = 3600000;
                long j2 = lastTime / j;
                long j3 = lastTime - (j * j2);
                long j4 = 60000;
                long j5 = j3 / j4;
                long j6 = (j3 - (j4 * j5)) / 1000;
                if (j2 <= 99 && j5 <= 60 && j6 <= 60) {
                    int i = (int) (j6 % 10);
                    this.hour.setText(((int) (j2 / 10)) + "" + ((int) (j2 % 10)));
                    this.minute.setText(((int) (j5 / 10)) + "" + ((int) (j5 % 10)));
                    this.second.setText(((int) (j6 / 10)) + "" + i);
                } else {
                    this.hour.setText("99");
                    this.minute.setText("59");
                    this.second.setText("59");
                }
                showCountDown();
                return;
            }
            hideCountDown();
            this.hour.setText("00");
            this.minute.setText("00");
            this.second.setText("00");
            HandlerTimer handlerTimer = this.mTimer;
            if (handlerTimer != null) {
                handlerTimer.b();
                this.mTimer = null;
            }
            a aVar = this.onFinishListener;
            if (aVar == null) {
                return;
            }
            aVar.a();
        }
    }

    public void hideCountDown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce4c2c36", new Object[]{this});
        } else if (this.showSeeMoreText) {
            this.seeMoreView.setVisibility(0);
            this.countDownTimerContainer.setVisibility(8);
        } else {
            showCountDown();
        }
    }

    public void showCountDown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("220c965b", new Object[]{this});
            return;
        }
        this.seeMoreView.setVisibility(8);
        this.countDownTimerContainer.setVisibility(0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        this.isAttached = true;
        HandlerTimer handlerTimer = this.mTimer;
        if (handlerTimer != null && this.futureTime > 0) {
            handlerTimer.a();
        }
        if (this.hasRegisterReceiver) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        getContext().registerReceiver(this.mReceiver, intentFilter);
        this.hasRegisterReceiver = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        this.isAttached = false;
        HandlerTimer handlerTimer = this.mTimer;
        if (handlerTimer != null) {
            handlerTimer.b();
        }
        try {
            getContext().unregisterReceiver(this.mReceiver);
            this.hasRegisterReceiver = false;
        } catch (Exception e) {
            fpa.b("DCountDownTimerView", e, new String[0]);
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e480fae9", new Object[]{this, new Integer(i)});
            return;
        }
        super.onWindowVisibilityChanged(i);
        HandlerTimer handlerTimer = this.mTimer;
        if (handlerTimer == null) {
            return;
        }
        if (i == 0 && this.futureTime > 0) {
            handlerTimer.a();
        } else {
            this.mTimer.b();
        }
    }

    public TextView getSeeMoreView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("a117cb52", new Object[]{this}) : this.seeMoreView;
    }

    public TextView getHour() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("bec87b55", new Object[]{this}) : this.hour;
    }

    public TextView getMinute() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("34e4fe05", new Object[]{this}) : this.minute;
    }

    public TextView getSecond() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("27614c65", new Object[]{this}) : this.second;
    }

    public TextView getColonFirst() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("ade27602", new Object[]{this}) : this.colonFirst;
    }

    public TextView getColonSecond() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("67993df8", new Object[]{this}) : this.colonSecond;
    }

    public TextView getMilli() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("f5225592", new Object[]{this}) : this.milli;
    }

    public TextView getColonThird() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("b5a48039", new Object[]{this}) : this.colonThird;
    }

    public void setShowSeeMoreText(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28a34557", new Object[]{this, new Boolean(z)});
        } else {
            this.showSeeMoreText = z;
        }
    }

    public void setShowMilliSecond(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b23ae9cb", new Object[]{this, new Boolean(z)});
        } else {
            this.showMilliSecond = z;
        }
    }

    public void setMilliSecondDigitCount(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c0001db", new Object[]{this, new Integer(i)});
        } else {
            this.milliSecondDigitCount = i;
        }
    }

    public long getFutureTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4786f4a1", new Object[]{this})).longValue() : this.futureTime;
    }

    public long getOffset() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c7531f84", new Object[]{this})).longValue() : this.offset;
    }

    public View getCountDownTimerContainer() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("4ad33500", new Object[]{this}) : this.countDownTimerContainer;
    }
}
