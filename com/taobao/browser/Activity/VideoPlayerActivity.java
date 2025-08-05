package com.taobao.browser.Activity;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.VideoView;
import com.alibaba.android.split.core.splitcompat.j;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.browser.utils.BrowserUtil;
import com.taobao.tao.BaseActivity;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes6.dex */
public class VideoPlayerActivity extends BaseActivity implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener, View.OnTouchListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private VideoView f16731a;
    private Dialog b;
    private ImageView c;
    private int d = 0;
    private Handler e;
    private Runnable f;

    static {
        kge.a(700705189);
        kge.a(-631130887);
        kge.a(2016666867);
        kge.a(-29101414);
        kge.a(-468432129);
    }

    public static /* synthetic */ Object ipc$super(VideoPlayerActivity videoPlayerActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == 188604040) {
            super.onStop();
            return null;
        } else if (hashCode != 514894248) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        j.b(context);
    }

    public static /* synthetic */ int a(VideoPlayerActivity videoPlayerActivity, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("743716e2", new Object[]{videoPlayerActivity, new Integer(i)})).intValue();
        }
        videoPlayerActivity.d = i;
        return i;
    }

    public static /* synthetic */ VideoView a(VideoPlayerActivity videoPlayerActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VideoView) ipChange.ipc$dispatch("63ffa85c", new Object[]{videoPlayerActivity}) : videoPlayerActivity.f16731a;
    }

    public static /* synthetic */ int b(VideoPlayerActivity videoPlayerActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("dbcaad26", new Object[]{videoPlayerActivity})).intValue() : videoPlayerActivity.d;
    }

    public static /* synthetic */ Dialog c(VideoPlayerActivity videoPlayerActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Dialog) ipChange.ipc$dispatch("332f1d7d", new Object[]{videoPlayerActivity}) : videoPlayerActivity.b;
    }

    public static /* synthetic */ Handler d(VideoPlayerActivity videoPlayerActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("81fd64b5", new Object[]{videoPlayerActivity}) : videoPlayerActivity.e;
    }

    public static /* synthetic */ Runnable e(VideoPlayerActivity videoPlayerActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("2e984284", new Object[]{videoPlayerActivity}) : videoPlayerActivity.f;
    }

    @Override // com.taobao.tao.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        getSupportActionBar().e();
        setContentView(R.layout.video_player);
        this.c = (ImageView) findViewById(R.id.video_play);
        this.b = ProgressDialog.show(this, "视频加载中....", "亲，请您稍候");
        this.b.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.taobao.browser.Activity.VideoPlayerActivity.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.DialogInterface.OnKeyListener
            public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("196ae81c", new Object[]{this, dialogInterface, new Integer(i), keyEvent})).booleanValue();
                }
                if (i != 4) {
                    return false;
                }
                dialogInterface.dismiss();
                VideoPlayerActivity.this.finish();
                return true;
            }
        });
        b();
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.e = new Handler();
        this.f = new Runnable() { // from class: com.taobao.browser.Activity.VideoPlayerActivity.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                int currentPosition = VideoPlayerActivity.a(VideoPlayerActivity.this).getCurrentPosition();
                if (VideoPlayerActivity.b(VideoPlayerActivity.this) != currentPosition) {
                    VideoPlayerActivity.a(VideoPlayerActivity.this, currentPosition);
                    if (VideoPlayerActivity.c(VideoPlayerActivity.this) != null && VideoPlayerActivity.c(VideoPlayerActivity.this).isShowing()) {
                        VideoPlayerActivity.c(VideoPlayerActivity.this).dismiss();
                    }
                } else if (VideoPlayerActivity.c(VideoPlayerActivity.this) != null && !VideoPlayerActivity.c(VideoPlayerActivity.this).isShowing()) {
                    VideoPlayerActivity.c(VideoPlayerActivity.this).show();
                }
                if (VideoPlayerActivity.d(VideoPlayerActivity.this) == null) {
                    return;
                }
                VideoPlayerActivity.d(VideoPlayerActivity.this).postDelayed(VideoPlayerActivity.e(VideoPlayerActivity.this), 500L);
            }
        };
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.f16731a = (VideoView) findViewById(R.id.videoView);
        this.f16731a.setVideoPath(getIntent().getExtras().getString("video_url"));
        this.f16731a.requestFocus();
        this.f16731a.setOnTouchListener(this);
        this.f16731a.setOnPreparedListener(this);
        this.f16731a.setOnErrorListener(this);
        this.f16731a.setOnCompletionListener(this);
        this.f16731a.start();
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        Dialog dialog = this.b;
        if (dialog != null) {
            dialog.dismiss();
            this.b = null;
        }
        super.onStop();
        Handler handler = this.e;
        if (handler != null) {
            handler.removeCallbacks(this.f);
            this.e = null;
            this.f = null;
        }
        finish();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
        }
        if (motionEvent.getAction() == 0) {
            if (this.f16731a.isPlaying()) {
                this.f16731a.pause();
                Handler handler = this.e;
                if (handler != null) {
                    handler.removeCallbacks(this.f);
                }
                this.c.setVisibility(0);
            } else {
                this.f16731a.start();
                this.c.setVisibility(8);
                Handler handler2 = this.e;
                if (handler2 != null) {
                    handler2.postDelayed(this.f, 500L);
                }
            }
        }
        return true;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(MediaPlayer mediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa6fc624", new Object[]{this, mediaPlayer});
            return;
        }
        a();
        Handler handler = this.e;
        if (handler == null) {
            return;
        }
        handler.post(this.f);
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3e3b6fb", new Object[]{this, mediaPlayer, new Integer(i), new Integer(i2)})).booleanValue();
        }
        BrowserUtil.a(this, "亲，非常抱歉，视频无法播放!");
        finish();
        return true;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0807e65", new Object[]{this, mediaPlayer});
        } else {
            finish();
        }
    }
}
