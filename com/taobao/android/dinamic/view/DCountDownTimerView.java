package com.taobao.android.dinamic.view;

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
import com.taobao.taobao.R;
import tb.fpa;
import tb.kge;

/* loaded from: classes5.dex */
public class DCountDownTimerView extends RelativeLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "DCountDownTimerView";
    private TextView colonFirst;
    private TextView colonSecond;
    private View countDownTimerContainer;
    private long futureTime;
    private boolean hasRegisterReceiver;
    private TextView hour;
    private boolean isAttached;
    private boolean isNativeTime;
    private final BroadcastReceiver mReceiver;
    private HandlerTimer mTimer;
    private TextView minute;
    private long offset;
    private TextView second;
    private TextView seeMoreView;

    static {
        kge.a(1436458950);
    }

    public static /* synthetic */ Object ipc$super(DCountDownTimerView dCountDownTimerView, String str, Object... objArr) {
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

    public static /* synthetic */ boolean access$000(DCountDownTimerView dCountDownTimerView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7b738a8", new Object[]{dCountDownTimerView})).booleanValue() : dCountDownTimerView.isAttached;
    }

    public static /* synthetic */ HandlerTimer access$100(DCountDownTimerView dCountDownTimerView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HandlerTimer) ipChange.ipc$dispatch("29f064f0", new Object[]{dCountDownTimerView}) : dCountDownTimerView.mTimer;
    }

    public static /* synthetic */ long access$200(DCountDownTimerView dCountDownTimerView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("13becf56", new Object[]{dCountDownTimerView})).longValue() : dCountDownTimerView.futureTime;
    }

    public DCountDownTimerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.isNativeTime = true;
        this.offset = 0L;
        this.mReceiver = new BroadcastReceiver() { // from class: com.taobao.android.dinamic.view.DCountDownTimerView.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                } else if (DCountDownTimerView.access$100(DCountDownTimerView.this) == null) {
                } else {
                    String action = intent.getAction();
                    if ("android.intent.action.SCREEN_OFF".equals(action)) {
                        DCountDownTimerView.access$100(DCountDownTimerView.this).b();
                    } else if (!"android.intent.action.USER_PRESENT".equals(action)) {
                    } else {
                        if (!DCountDownTimerView.this.isShown() || DCountDownTimerView.access$200(DCountDownTimerView.this) <= 0) {
                            DCountDownTimerView.access$100(DCountDownTimerView.this).b();
                        } else {
                            DCountDownTimerView.access$100(DCountDownTimerView.this).a();
                        }
                    }
                }
            }
        };
        init();
    }

    public DCountDownTimerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.isNativeTime = true;
        this.offset = 0L;
        this.mReceiver = new BroadcastReceiver() { // from class: com.taobao.android.dinamic.view.DCountDownTimerView.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                } else if (DCountDownTimerView.access$100(DCountDownTimerView.this) == null) {
                } else {
                    String action = intent.getAction();
                    if ("android.intent.action.SCREEN_OFF".equals(action)) {
                        DCountDownTimerView.access$100(DCountDownTimerView.this).b();
                    } else if (!"android.intent.action.USER_PRESENT".equals(action)) {
                    } else {
                        if (!DCountDownTimerView.this.isShown() || DCountDownTimerView.access$200(DCountDownTimerView.this) <= 0) {
                            DCountDownTimerView.access$100(DCountDownTimerView.this).b();
                        } else {
                            DCountDownTimerView.access$100(DCountDownTimerView.this).a();
                        }
                    }
                }
            }
        };
        init();
    }

    public DCountDownTimerView(Context context) {
        super(context);
        this.isNativeTime = true;
        this.offset = 0L;
        this.mReceiver = new BroadcastReceiver() { // from class: com.taobao.android.dinamic.view.DCountDownTimerView.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                } else if (DCountDownTimerView.access$100(DCountDownTimerView.this) == null) {
                } else {
                    String action = intent.getAction();
                    if ("android.intent.action.SCREEN_OFF".equals(action)) {
                        DCountDownTimerView.access$100(DCountDownTimerView.this).b();
                    } else if (!"android.intent.action.USER_PRESENT".equals(action)) {
                    } else {
                        if (!DCountDownTimerView.this.isShown() || DCountDownTimerView.access$200(DCountDownTimerView.this) <= 0) {
                            DCountDownTimerView.access$100(DCountDownTimerView.this).b();
                        } else {
                            DCountDownTimerView.access$100(DCountDownTimerView.this).a();
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
        this.colonFirst = (TextView) findViewById(R.id.tv_colon1);
        this.colonSecond = (TextView) findViewById(R.id.tv_colon2);
        this.countDownTimerContainer = findViewById(R.id.count_down_timer_view_container);
        this.seeMoreView = (TextView) findViewById(R.id.see_more_default);
    }

    public void hideCountDown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce4c2c36", new Object[]{this});
            return;
        }
        this.seeMoreView.setVisibility(0);
        this.countDownTimerContainer.setVisibility(8);
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

    public HandlerTimer getTimer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HandlerTimer) ipChange.ipc$dispatch("4440a93d", new Object[]{this});
        }
        if (this.mTimer == null) {
            this.mTimer = new HandlerTimer(1000L, new Runnable() { // from class: com.taobao.android.dinamic.view.DCountDownTimerView.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (!DCountDownTimerView.access$000(DCountDownTimerView.this)) {
                    } else {
                        DCountDownTimerView.this.updateCountDownViewTime();
                    }
                }
            });
        }
        return this.mTimer;
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
            return;
        }
        this.isNativeTime = false;
        this.offset = j - SystemClock.elapsedRealtime();
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

    public void updateCountDownViewTime() {
        long j;
        long j2;
        long j3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("670e9e41", new Object[]{this});
        } else if (this.countDownTimerContainer == null) {
        } else {
            long lastTime = getLastTime();
            if (lastTime > 0) {
                long j4 = 3600000;
                j2 = lastTime / j4;
                long j5 = lastTime - (j4 * j2);
                long j6 = 60000;
                j3 = j5 / j6;
                j = (j5 - (j6 * j3)) / 1000;
            } else {
                j = 0;
                j2 = 0;
                j3 = 0;
            }
            if (j2 <= 99 && j3 <= 60 && j <= 60 && (j2 != 0 || j3 != 0 || j != 0)) {
                int i = (int) (j % 10);
                this.hour.setText(((int) (j2 / 10)) + "" + ((int) (j2 % 10)));
                this.minute.setText(((int) (j3 / 10)) + "" + ((int) (j3 % 10)));
                this.second.setText(((int) (j / 10)) + "" + i);
                this.countDownTimerContainer.setVisibility(0);
                this.seeMoreView.setVisibility(8);
                return;
            }
            this.countDownTimerContainer.setVisibility(8);
            this.seeMoreView.setVisibility(0);
        }
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
}
