package com.taobao.uikit.component;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Movie;
import android.os.AsyncTask;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.animation.AnimationUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.feature.view.TView;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import tb.kge;

/* loaded from: classes9.dex */
public class GifView extends TView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int SUBTLE_PARAM = 1;
    private boolean mAutoPlay;
    private int mCanvasHeight;
    private int mCanvasWidth;
    private DecodeTask mDecodeTask;
    private OnDecodedListener mDecodedListener;
    private OnPlayEndListener mEndListener;
    private String mGifFilePath;
    private int mGifResId;
    private boolean mIsPlayed;
    private boolean mIsPlaying;
    private Movie mMovie;
    private int mMovieHeight;
    private long mMovieStart;
    private int mMovieWidth;

    /* loaded from: classes9.dex */
    public interface OnDecodedListener {
        void OnDecoded();
    }

    /* loaded from: classes9.dex */
    public interface OnPlayEndListener {
        void OnPlayEnd();
    }

    static {
        kge.a(1814475959);
    }

    public static /* synthetic */ Object ipc$super(GifView gifView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1117127205) {
            super.onDraw((Canvas) objArr[0]);
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

    public static /* synthetic */ int access$100(GifView gifView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("890e81c3", new Object[]{gifView})).intValue() : gifView.mGifResId;
    }

    public static /* synthetic */ String access$200(GifView gifView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7d69182f", new Object[]{gifView}) : gifView.mGifFilePath;
    }

    public static /* synthetic */ Movie access$300(GifView gifView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Movie) ipChange.ipc$dispatch("cbbc0b47", new Object[]{gifView}) : gifView.mMovie;
    }

    public static /* synthetic */ Movie access$302(GifView gifView, Movie movie) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Movie) ipChange.ipc$dispatch("131903a2", new Object[]{gifView, movie});
        }
        gifView.mMovie = movie;
        return movie;
    }

    public static /* synthetic */ int access$402(GifView gifView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f051d181", new Object[]{gifView, new Integer(i)})).intValue();
        }
        gifView.mMovieWidth = i;
        return i;
    }

    public static /* synthetic */ int access$502(GifView gifView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b33e3ae0", new Object[]{gifView, new Integer(i)})).intValue();
        }
        gifView.mMovieHeight = i;
        return i;
    }

    public static /* synthetic */ OnDecodedListener access$600(GifView gifView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (OnDecodedListener) ipChange.ipc$dispatch("72cbd0f2", new Object[]{gifView}) : gifView.mDecodedListener;
    }

    public GifView(Context context) {
        this(context, null);
    }

    public GifView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GifView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (Build.VERSION.SDK_INT >= 11) {
            setLayerType(1, null);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.GifView);
        if (obtainStyledAttributes != null) {
            this.mAutoPlay = obtainStyledAttributes.getBoolean(R.styleable.GifView_uik_auto_play, false);
            this.mGifResId = obtainStyledAttributes.getResourceId(R.styleable.GifView_uik_gif_src, 0);
            obtainStyledAttributes.recycle();
        }
    }

    @Override // com.taobao.uikit.feature.view.TView, android.view.View
    public void onDraw(Canvas canvas) {
        OnPlayEndListener onPlayEndListener;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        if (this.mMovie == null) {
            return;
        }
        canvas.save();
        fixCanvas(canvas);
        if (this.mAutoPlay) {
            playMovie(canvas);
            invalidate();
        } else if (this.mIsPlaying) {
            if (playMovie(canvas)) {
                this.mIsPlaying = false;
                this.mIsPlayed = true;
            }
            invalidate();
        } else {
            if (this.mIsPlayed) {
                Movie movie = this.mMovie;
                movie.setTime(movie.duration() - 1);
            } else {
                this.mMovie.setTime(0);
            }
            this.mMovie.draw(canvas, 0.0f, 0.0f);
            if (this.mIsPlayed && (onPlayEndListener = this.mEndListener) != null) {
                onPlayEndListener.OnPlayEnd();
            }
        }
        canvas.restore();
    }

    private void fixCanvas(Canvas canvas) {
        float f;
        float f2;
        float f3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d61d011", new Object[]{this, canvas});
            return;
        }
        int i = this.mMovieWidth;
        int i2 = this.mMovieHeight;
        int i3 = this.mCanvasWidth;
        int i4 = this.mCanvasHeight;
        if (i * i4 > i3 * i2) {
            f2 = i4 / i2;
            f3 = (i3 - (i * f2)) * 0.5f;
            f = 0.0f;
        } else {
            float f4 = i3 / i;
            f = (i4 - (i2 * f4)) * 0.5f;
            f2 = f4;
            f3 = 0.0f;
        }
        canvas.translate((int) (f3 + 0.5f), (int) (f + 0.5f));
        canvas.scale(f2, f2);
    }

    @Override // com.taobao.uikit.feature.view.TView, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        IpChange ipChange = $ipChange;
        int i4 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        if (this.mMovie == null) {
            this.mMovieWidth = -1;
            this.mMovieHeight = -1;
            i3 = 0;
        } else {
            i3 = this.mMovieWidth;
            i4 = this.mMovieHeight;
            if (i3 <= 0) {
                i3 = 1;
            }
            if (i4 <= 0) {
                i4 = 1;
            }
        }
        this.mCanvasWidth = resolveSize(i3, i);
        this.mCanvasHeight = resolveSize(i4, i2);
        setMeasuredDimension(this.mCanvasWidth, this.mCanvasHeight);
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        decode();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        DecodeTask decodeTask = this.mDecodeTask;
        if (decodeTask != null) {
            decodeTask.cancel(true);
        }
        this.mMovie = null;
        super.onDetachedFromWindow();
    }

    private boolean playMovie(Canvas canvas) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aacf13e6", new Object[]{this, canvas})).booleanValue();
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (this.mMovieStart == 0) {
            this.mMovieStart = currentAnimationTimeMillis;
        }
        int duration = this.mMovie.duration() - 1;
        if (duration == 0) {
            duration = 1000;
        }
        int i = (int) (currentAnimationTimeMillis - this.mMovieStart);
        if (i >= duration) {
            this.mMovieStart = 0L;
            i = duration;
            z = true;
        }
        this.mMovie.setTime(i);
        this.mMovie.draw(canvas, 0.0f, 0.0f);
        return z;
    }

    public void setGifResource(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e0f6f2c", new Object[]{this, new Integer(i)});
        } else if (i == 0 || i == this.mGifResId) {
        } else {
            this.mGifResId = i;
            this.mGifFilePath = null;
            decode();
        }
    }

    public void setGifFilePath(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1c1b834", new Object[]{this, str});
        } else if (str == null || TextUtils.equals(str, this.mGifFilePath)) {
        } else {
            this.mGifFilePath = str;
            this.mGifResId = 0;
            decode();
        }
    }

    private void decode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7e16f75", new Object[]{this});
        } else if (this.mMovie != null) {
        } else {
            DecodeTask decodeTask = this.mDecodeTask;
            if (decodeTask != null) {
                decodeTask.cancel(true);
            }
            this.mDecodeTask = new DecodeTask();
            this.mDecodeTask.execute(new Void[0]);
        }
    }

    public void play() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe955bb", new Object[]{this});
            return;
        }
        this.mMovieStart = 0L;
        this.mIsPlaying = true;
        this.mIsPlayed = false;
        this.mAutoPlay = false;
        invalidate();
    }

    public void autoPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("658c788a", new Object[]{this});
            return;
        }
        this.mAutoPlay = true;
        invalidate();
    }

    public void stop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            return;
        }
        this.mIsPlaying = false;
        this.mAutoPlay = false;
        this.mIsPlayed = false;
        invalidate();
    }

    public void setPlayEndListener(OnPlayEndListener onPlayEndListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df9be300", new Object[]{this, onPlayEndListener});
        } else {
            this.mEndListener = onPlayEndListener;
        }
    }

    public void setDecodedListener(OnDecodedListener onDecodedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dee57e0", new Object[]{this, onDecodedListener});
        } else {
            this.mDecodedListener = onDecodedListener;
        }
    }

    /* loaded from: classes9.dex */
    public class DecodeTask extends AsyncTask<Void, Void, Boolean> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(659330752);
        }

        private DecodeTask() {
        }

        @Override // android.os.AsyncTask
        public Boolean doInBackground(Void... voidArr) {
            IpChange ipChange = $ipChange;
            boolean z = false;
            if (ipChange instanceof IpChange) {
                return (Boolean) ipChange.ipc$dispatch("9ea9e934", new Object[]{this, voidArr});
            }
            BufferedInputStream bufferedInputStream = null;
            try {
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                try {
                    if (GifView.access$100(GifView.this) != 0) {
                        bufferedInputStream = GifView.this.getResources().openRawResource(GifView.access$100(GifView.this));
                    } else if (!TextUtils.isEmpty(GifView.access$200(GifView.this))) {
                        BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(GifView.access$200(GifView.this)));
                        try {
                            if (bufferedInputStream2.markSupported()) {
                                bufferedInputStream2.mark(bufferedInputStream2.available());
                            }
                            bufferedInputStream = bufferedInputStream2;
                        } catch (Exception e2) {
                            e = e2;
                            bufferedInputStream = bufferedInputStream2;
                            e.printStackTrace();
                            if (bufferedInputStream != null) {
                                bufferedInputStream.close();
                            }
                            return Boolean.valueOf(z);
                        } catch (Throwable th) {
                            th = th;
                            bufferedInputStream = bufferedInputStream2;
                            if (bufferedInputStream != null) {
                                try {
                                    bufferedInputStream.close();
                                } catch (IOException e3) {
                                    e3.printStackTrace();
                                }
                            }
                            throw th;
                        }
                    }
                    if (bufferedInputStream != null) {
                        GifView.access$302(GifView.this, Movie.decodeStream(bufferedInputStream));
                        if (GifView.access$300(GifView.this) != null) {
                            GifView.access$402(GifView.this, GifView.access$300(GifView.this).width());
                            GifView.access$502(GifView.this, GifView.access$300(GifView.this).height());
                        }
                        z = true;
                    }
                } catch (Exception e4) {
                    e = e4;
                }
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
                return Boolean.valueOf(z);
            } catch (Throwable th2) {
                th = th2;
            }
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(Boolean bool) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b98eb50", new Object[]{this, bool});
            } else if (!bool.booleanValue()) {
            } else {
                GifView.this.requestLayout();
                GifView.this.invalidate();
                if (GifView.access$600(GifView.this) == null) {
                    return;
                }
                GifView.access$600(GifView.this).OnDecoded();
            }
        }
    }
}
