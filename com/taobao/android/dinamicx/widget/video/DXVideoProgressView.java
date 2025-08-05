package com.taobao.android.dinamicx.widget.video;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.widget.video.DXVideoProgressSeekBar;
import com.taobao.taobao.R;
import tb.fuw;
import tb.kco;

/* loaded from: classes5.dex */
public class DXVideoProgressView extends FrameLayout implements SeekBar.OnSeekBarChangeListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final TextView currentTimeTv;
    private float mDownY;
    private final Handler mHandler;
    private SeekBar.OnSeekBarChangeListener mOnSeekBarChangeListener;
    private boolean mStartTracking;
    private int mTotalTime;
    private final float mTouchSlop;
    private a mVideoSeekToCallback;
    private int newPosition;
    private double progressRate;
    private final LinearLayout timeLayout;
    private final TextView totalTimeTv;
    private final DXVideoProgressSeekBar tsVideoProgressSeekBar;

    /* loaded from: classes5.dex */
    public interface a {
        void a(int i, double d);
    }

    public static /* synthetic */ Object ipc$super(DXVideoProgressView dXVideoProgressView, String str, Object... objArr) {
        if (str.hashCode() == 2075560917) {
            return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ DXVideoProgressSeekBar access$000(DXVideoProgressView dXVideoProgressView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXVideoProgressSeekBar) ipChange.ipc$dispatch("84cf3cf7", new Object[]{dXVideoProgressView}) : dXVideoProgressView.tsVideoProgressSeekBar;
    }

    public DXVideoProgressView(Context context) {
        this(context, null);
    }

    public DXVideoProgressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DXVideoProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mHandler = new Handler(Looper.getMainLooper()) { // from class: com.taobao.android.dinamicx.widget.video.DXVideoProgressView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                } else if (DXVideoProgressView.access$000(DXVideoProgressView.this) == null) {
                } else {
                    DXVideoProgressView.access$000(DXVideoProgressView.this).setThumbState(DXVideoProgressSeekBar.ThumbState.NORMAL);
                }
            }
        };
        inflate(context, R.layout.dx_video_view_progress, this);
        this.mTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.timeLayout = (LinearLayout) findViewById(R.id.video_time_layout);
        this.currentTimeTv = (TextView) findViewById(R.id.video_cTime);
        this.totalTimeTv = (TextView) findViewById(R.id.video_tTime);
        this.tsVideoProgressSeekBar = (DXVideoProgressSeekBar) findViewById(R.id.video_progress_seekBar);
        DXVideoProgressSeekBar dXVideoProgressSeekBar = this.tsVideoProgressSeekBar;
        if (dXVideoProgressSeekBar != null) {
            dXVideoProgressSeekBar.setEnabled(false);
            this.tsVideoProgressSeekBar.setOnSeekBarChangeListener(this);
        }
    }

    public void setTouchMaxY(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ba3094b", new Object[]{this, new Long(j)});
            return;
        }
        DXVideoProgressSeekBar dXVideoProgressSeekBar = this.tsVideoProgressSeekBar;
        if (dXVideoProgressSeekBar == null) {
            return;
        }
        dXVideoProgressSeekBar.setTouchMaxY(j);
    }

    public void setHintTextVisible(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fea3f1", new Object[]{this, new Boolean(z)});
        } else {
            this.timeLayout.setAlpha(z ? 1.0f : 0.0f);
        }
    }

    public void setVideoSeekToCallback(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3118a67d", new Object[]{this, aVar});
        } else {
            this.mVideoSeekToCallback = aVar;
        }
    }

    public void setOnSeekBarChangeListener(SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29144588", new Object[]{this, onSeekBarChangeListener});
        } else {
            this.mOnSeekBarChangeListener = onSeekBarChangeListener;
        }
    }

    public int getProgressByRate(double d) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ac19c570", new Object[]{this, new Double(d)})).intValue() : (int) Math.ceil(d * 1.0d * 1000.0d);
    }

    public void setProgress(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bf0340d", new Object[]{this, new Integer(i)});
            return;
        }
        DXVideoProgressSeekBar dXVideoProgressSeekBar = this.tsVideoProgressSeekBar;
        if (dXVideoProgressSeekBar == null) {
            return;
        }
        dXVideoProgressSeekBar.setProgress(i);
    }

    public void setProgressSeekEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b233543", new Object[]{this, new Boolean(z)});
            return;
        }
        DXVideoProgressSeekBar dXVideoProgressSeekBar = this.tsVideoProgressSeekBar;
        if (dXVideoProgressSeekBar == null) {
            return;
        }
        dXVideoProgressSeekBar.setEnabled(z);
    }

    public void setNewPosition(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16825e95", new Object[]{this, new Integer(i)});
        } else if (this.tsVideoProgressSeekBar == null) {
        } else {
            this.newPosition = i;
        }
    }

    public void onVideoProgressChanged(int i, int i2, int i3, DXProgressBarWidgetNode dXProgressBarWidgetNode) {
        IpChange ipChange = $ipChange;
        int i4 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec28ad94", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), dXProgressBarWidgetNode});
            return;
        }
        this.totalTimeTv.setText(kco.a(i3));
        if (this.mStartTracking) {
            return;
        }
        this.mTotalTime = i3;
        if (i3 > 0) {
            this.progressRate = i / i3;
            i4 = getProgressByRate(this.progressRate);
            if (dXProgressBarWidgetNode != null) {
                dXProgressBarWidgetNode.setValue(this.progressRate);
            }
        }
        setProgress(i4);
        setNewPosition(i);
        setProgressSeekEnable(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.mDownY = motionEvent.getRawY();
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (action == 2) {
            DXVideoProgressSeekBar dXVideoProgressSeekBar = this.tsVideoProgressSeekBar;
            boolean z2 = dXVideoProgressSeekBar != null && dXVideoProgressSeekBar.isTouching();
            boolean z3 = Math.abs(this.mDownY - motionEvent.getRawY()) > this.mTouchSlop;
            ViewParent parent = getParent();
            if (z2 || !z3) {
                z = true;
            }
            parent.requestDisallowInterceptTouchEvent(z);
        }
        DXVideoProgressSeekBar dXVideoProgressSeekBar2 = this.tsVideoProgressSeekBar;
        return dXVideoProgressSeekBar2 != null ? dXVideoProgressSeekBar2.dispatchTouchEvent(motionEvent) : super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c49e629f", new Object[]{this, seekBar, new Integer(i), new Boolean(z)});
            return;
        }
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.mOnSeekBarChangeListener;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onProgressChanged(seekBar, i, z);
        }
        int i2 = this.mTotalTime;
        if (i2 < 0 || !z) {
            return;
        }
        this.progressRate = i / 1000.0d;
        this.newPosition = (int) (i2 * this.progressRate);
        if (DinamicXEngine.j()) {
            String simpleName = getClass().getSimpleName();
            fuw.d(simpleName, "onProgressChanged >>> progress:" + i + ", newPosition:" + this.newPosition);
        }
        this.currentTimeTv.setText(kco.a(this.newPosition));
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cb0524b", new Object[]{this, seekBar});
            return;
        }
        this.mHandler.removeMessages(0);
        this.mStartTracking = true;
        LinearLayout linearLayout = this.timeLayout;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.mOnSeekBarChangeListener;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onStartTrackingTouch(seekBar);
        }
        DXVideoProgressSeekBar dXVideoProgressSeekBar = this.tsVideoProgressSeekBar;
        if (dXVideoProgressSeekBar == null) {
            return;
        }
        dXVideoProgressSeekBar.setThumbState(DXVideoProgressSeekBar.ThumbState.TOUCH);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e63d74d", new Object[]{this, seekBar});
            return;
        }
        this.mStartTracking = false;
        LinearLayout linearLayout = this.timeLayout;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.mOnSeekBarChangeListener;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onStopTrackingTouch(seekBar);
        }
        a aVar = this.mVideoSeekToCallback;
        if (aVar != null) {
            aVar.a(this.newPosition, this.progressRate);
        }
        DXVideoProgressSeekBar dXVideoProgressSeekBar = this.tsVideoProgressSeekBar;
        if (dXVideoProgressSeekBar == null) {
            return;
        }
        dXVideoProgressSeekBar.setThumbState(DXVideoProgressSeekBar.ThumbState.MIDDLE);
        Handler handler = this.mHandler;
        handler.sendMessageDelayed(handler.obtainMessage(0), 3000L);
    }
}
