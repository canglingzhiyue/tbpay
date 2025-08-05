package com.taobao.search.musie.video;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.shop.common.ShopConstants;
import com.taobao.taobao.R;
import java.util.Formatter;
import java.util.Locale;
import tb.kge;

/* loaded from: classes7.dex */
public class VideoControlView extends FrameLayout implements View.OnClickListener, SeekBar.OnSeekBarChangeListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final float[] PLAT_RATE_ARRAY;
    private final String[] PLAY_RATE_TEXT_ARRAY;
    private boolean isTracking;
    private a mCallback;
    private View mCenterPlay;
    private TextView mCurrentTime;
    private StringBuilder mFormatBuilder;
    private Formatter mFormatter;
    private View mFullScreenBtn;
    private final Runnable mHideRunnable;
    private View mInfoPanel;
    private View mMute;
    private boolean mMuteState;
    private View mPlayBtn;
    private TextView mPlayRate;
    private int mPlayRateIndex;
    private boolean mPlayed;
    private View mRoot;
    private SeekBar mSeekBar;
    private boolean mShowCenterPlay;
    private boolean mShown;
    private boolean mStatePlay;
    private float mTotalTime;
    private TextView mTotalTimeTextView;
    private int newPosition;

    /* loaded from: classes7.dex */
    public interface a {
        void a();

        void a(float f);

        void a(int i);

        void a(boolean z);

        void b(boolean z);
    }

    static {
        kge.a(2099670583);
        kge.a(-1967544404);
        kge.a(-1201612728);
    }

    public static /* synthetic */ Object ipc$super(VideoControlView videoControlView, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ boolean access$000(VideoControlView videoControlView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("122f4c93", new Object[]{videoControlView})).booleanValue() : videoControlView.mPlayed;
    }

    public static /* synthetic */ void access$100(VideoControlView videoControlView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b83a1d0", new Object[]{videoControlView});
        } else {
            videoControlView.hideControls();
        }
    }

    public void setCallback(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bbdf989", new Object[]{this, aVar});
        } else {
            this.mCallback = aVar;
        }
    }

    private void showControls() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dc41bda", new Object[]{this});
            return;
        }
        this.mShown = true;
        this.mRoot.setVisibility(0);
        removeCallbacks(this.mHideRunnable);
        postDelayed(this.mHideRunnable, 3000L);
    }

    private void hideControls() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c9cde9f", new Object[]{this});
            return;
        }
        this.mShown = false;
        this.mRoot.setVisibility(8);
    }

    public VideoControlView(Context context) {
        super(context);
        this.mShown = true;
        this.mPlayed = false;
        this.mStatePlay = false;
        this.mShowCenterPlay = true;
        this.mTotalTime = 0.0f;
        this.newPosition = 0;
        this.isTracking = false;
        this.PLAT_RATE_ARRAY = new float[]{1.0f, 1.5f, 0.8f};
        this.PLAY_RATE_TEXT_ARRAY = new String[]{"1.0X", "1.5X", "0.8X"};
        this.mPlayRateIndex = 0;
        this.mHideRunnable = new Runnable() { // from class: com.taobao.search.musie.video.VideoControlView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (!VideoControlView.access$000(VideoControlView.this)) {
                } else {
                    VideoControlView.access$100(VideoControlView.this);
                }
            }
        };
        LayoutInflater.from(context).inflate(R.layout.tbsearch_muise_video_bottom_controller_layout, (ViewGroup) this, true);
        findAllViews();
        stop();
        setOnClickListener(this);
        this.mCenterPlay.setOnClickListener(this);
        this.mMute.setOnClickListener(this);
        this.mPlayRate.setOnClickListener(this);
        this.mPlayBtn.setOnClickListener(this);
        this.mFullScreenBtn.setOnClickListener(this);
        this.mFormatBuilder = new StringBuilder();
        this.mFormatter = new Formatter(this.mFormatBuilder, Locale.getDefault());
    }

    private void toggleToStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc1f0198", new Object[]{this});
            return;
        }
        this.mPlayed = false;
        showControls();
        this.mInfoPanel.setVisibility(8);
        this.mCenterPlay.setVisibility(0);
        removeCallbacks(this.mHideRunnable);
    }

    private void toggleToStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca70c3ba", new Object[]{this});
            return;
        }
        this.mPlayed = true;
        showControls();
        this.mInfoPanel.setVisibility(0);
        if (this.mShowCenterPlay) {
            this.mCenterPlay.setVisibility(0);
        } else {
            this.mCenterPlay.setVisibility(8);
        }
        removeCallbacks(this.mHideRunnable);
        postDelayed(this.mHideRunnable, 3000L);
    }

    private void findAllViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1d31fad", new Object[]{this});
            return;
        }
        this.mRoot = findViewById(R.id.root_layout);
        this.mCenterPlay = findViewById(R.id.center_play);
        this.mMute = findViewById(R.id.mute_btn);
        this.mPlayBtn = findViewById(R.id.play_btn);
        this.mFullScreenBtn = findViewById(R.id.fullscreen_btn);
        this.mCurrentTime = (TextView) findViewById(R.id.video_controller_current_time);
        this.mTotalTimeTextView = (TextView) findViewById(R.id.video_controller_total_time);
        this.mPlayRate = (TextView) findViewById(R.id.video_controller_playrate);
        this.mPlayRate.setVisibility(0);
        this.mSeekBar = (SeekBar) findViewById(R.id.video_controller_seekBar);
        this.mSeekBar.setMax(100);
        this.mSeekBar.setOnSeekBarChangeListener(this);
        this.mInfoPanel = findViewById(R.id.info_panel);
    }

    public void setProgress(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40c1c52d", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        } else if (this.isTracking) {
        } else {
            this.mTotalTime = i2;
            if (i > i2) {
                i = i2;
            }
            this.mCurrentTime.setText(formatTime2String(i));
            this.mTotalTimeTextView.setText(formatTime2String(i2));
            this.mSeekBar.setProgress((i * 100) / i2);
            this.mSeekBar.setSecondaryProgress(i3);
            this.newPosition = i;
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c49e629f", new Object[]{this, seekBar, new Integer(i), new Boolean(z)});
            return;
        }
        float f = this.mTotalTime;
        if (f < 0.0f || !z) {
            return;
        }
        this.newPosition = (int) (f * (i / 100.0f));
        this.mCurrentTime.setText(formatTime2String(this.newPosition));
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cb0524b", new Object[]{this, seekBar});
        } else {
            this.isTracking = true;
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e63d74d", new Object[]{this, seekBar});
            return;
        }
        this.isTracking = false;
        a aVar = this.mCallback;
        if (aVar == null) {
            return;
        }
        aVar.a(this.newPosition);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (view.getId() == R.id.center_play || view.getId() == R.id.play_btn) {
            if (this.mStatePlay) {
                pause();
            } else {
                play();
            }
            a aVar = this.mCallback;
            if (aVar == null) {
                return;
            }
            aVar.b(this.mStatePlay);
        } else if (view.getId() == R.id.mute_btn) {
            a aVar2 = this.mCallback;
            if (aVar2 == null) {
                return;
            }
            aVar2.a(!this.mMuteState);
        } else if (view.getId() == R.id.video_controller_playrate) {
            handlePlayRate();
        } else if (view.getId() == R.id.fullscreen_btn) {
            toggleFullScreen();
        } else {
            removeCallbacks(this.mHideRunnable);
            if (!this.mPlayed) {
                return;
            }
            if (this.mShown) {
                hideControls();
            } else {
                showControls();
            }
        }
    }

    private void toggleFullScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c2dab56", new Object[]{this});
            return;
        }
        a aVar = this.mCallback;
        if (aVar == null) {
            return;
        }
        aVar.a();
    }

    public void play() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe955bb", new Object[]{this});
            return;
        }
        toggleToStart();
        this.mStatePlay = true;
        this.mCenterPlay.setBackgroundDrawable(getContext().getResources().getDrawable(R.drawable.alimuise_pause));
        this.mPlayBtn.setBackgroundDrawable(getContext().getResources().getDrawable(R.drawable.alimuise_small_pause));
    }

    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        toggleToStart();
        this.mStatePlay = false;
        this.mCenterPlay.setBackgroundDrawable(getContext().getResources().getDrawable(R.drawable.alimuise_play));
        this.mPlayBtn.setBackgroundDrawable(getContext().getResources().getDrawable(R.drawable.alimuise_small_play));
    }

    public void stop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            return;
        }
        toggleToStop();
        this.mStatePlay = false;
        this.mCenterPlay.setBackgroundDrawable(getContext().getResources().getDrawable(R.drawable.alimuise_play));
        this.mPlayBtn.setBackgroundDrawable(getContext().getResources().getDrawable(R.drawable.alimuise_small_play));
    }

    public void setMuteState(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85048537", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mMuteState = z;
        this.mMute.setBackgroundDrawable(getContext().getResources().getDrawable(z ? R.drawable.alimuise_muted : R.drawable.alimuise_not_muted));
    }

    public void setShowMute(boolean z) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c5148f5", new Object[]{this, new Boolean(z)});
            return;
        }
        View view = this.mMute;
        if (!z) {
            i = 8;
        }
        view.setVisibility(i);
    }

    public void setShowFullScreen(boolean z) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c24f87b3", new Object[]{this, new Boolean(z)});
            return;
        }
        View view = this.mFullScreenBtn;
        if (!z) {
            i = 8;
        }
        view.setVisibility(i);
    }

    public void setShowCenterPlay(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df13f725", new Object[]{this, new Boolean(z)});
        } else {
            this.mShowCenterPlay = z;
        }
    }

    public void setPlayRateVisible(boolean z) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("963f69d1", new Object[]{this, new Boolean(z)});
            return;
        }
        TextView textView = this.mPlayRate;
        if (!z) {
            i = 8;
        }
        textView.setVisibility(i);
    }

    public void setShowPlay(boolean z) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b73e88ba", new Object[]{this, new Boolean(z)});
            return;
        }
        View view = this.mPlayBtn;
        if (!z) {
            i = 8;
        }
        view.setVisibility(i);
    }

    public void setSeekBarEnabled(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66be26e5", new Object[]{this, new Boolean(z)});
        } else {
            this.mSeekBar.setEnabled(z);
        }
    }

    private void handlePlayRate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce65a303", new Object[]{this});
            return;
        }
        a aVar = this.mCallback;
        if (aVar == null) {
            return;
        }
        float[] fArr = this.PLAT_RATE_ARRAY;
        this.mPlayRateIndex = (this.mPlayRateIndex + 1) % fArr.length;
        aVar.a(fArr[this.mPlayRateIndex]);
        this.mPlayRate.setText(this.PLAY_RATE_TEXT_ARRAY[this.mPlayRateIndex]);
    }

    private String formatTime2String(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("441dda83", new Object[]{this, new Integer(i)});
        }
        int i2 = i / 1000;
        int i3 = i2 % 60;
        int i4 = (i2 / 60) % 60;
        int i5 = i2 / ShopConstants.K_ALL_WEEX_ENABLED_CACHE_TIME_DEFAULT;
        this.mFormatBuilder.setLength(0);
        return i5 > 0 ? this.mFormatter.format("%02d:%02d:%02d", Integer.valueOf(i5), Integer.valueOf(i4), Integer.valueOf(i3)).toString() : this.mFormatter.format("%02d:%02d", Integer.valueOf(i4), Integer.valueOf(i3)).toString();
    }
}
