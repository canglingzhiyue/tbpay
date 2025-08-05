package com.taobao.browser.jsbridge;

import android.media.MediaPlayer;
import android.net.Uri;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.webview.IWVWebView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class H5AudioPlayer extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String TAG;
    public String playId;
    public String url;
    public a session = new a();
    private MediaPlayer mediaPlayer = new MediaPlayer();

    public static /* synthetic */ Object ipc$super(H5AudioPlayer h5AudioPlayer, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void access$100(H5AudioPlayer h5AudioPlayer, String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f594f849", new Object[]{h5AudioPlayer, str, wVCallBackContext});
        } else {
            h5AudioPlayer.notifyCurrentStopImpl(str, wVCallBackContext);
        }
    }

    public static /* synthetic */ IWVWebView access$300(H5AudioPlayer h5AudioPlayer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IWVWebView) ipChange.ipc$dispatch("1d01053a", new Object[]{h5AudioPlayer}) : h5AudioPlayer.mWebView;
    }

    public static /* synthetic */ MediaPlayer access$400(H5AudioPlayer h5AudioPlayer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MediaPlayer) ipChange.ipc$dispatch("4fcd0cd6", new Object[]{h5AudioPlayer}) : h5AudioPlayer.mediaPlayer;
    }

    static {
        kge.a(1013520295);
        TAG = H5AudioPlayer.class.getSimpleName();
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("play".equals(str)) {
            play(wVCallBackContext, str2);
            return true;
        } else if (!"stop".equals(str)) {
            return false;
        } else {
            stop(wVCallBackContext, str2);
            return true;
        }
    }

    public void play(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c7ba142", new Object[]{this, wVCallBackContext, str});
            return;
        }
        notifyCurrentStopImpl(this.session.a(), this.session.b());
        this.session.a(wVCallBackContext);
        this.playId = getPlayId(str);
        this.session.a(this.playId);
        this.url = getUrl(str);
        try {
            if (this.mediaPlayer != null) {
                this.mediaPlayer.reset();
                this.mediaPlayer.setDataSource(this.mContext, Uri.parse(this.url));
                this.mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.taobao.browser.jsbridge.H5AudioPlayer.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.media.MediaPlayer.OnCompletionListener
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("b0807e65", new Object[]{this, mediaPlayer});
                            return;
                        }
                        H5AudioPlayer h5AudioPlayer = H5AudioPlayer.this;
                        H5AudioPlayer.access$100(h5AudioPlayer, h5AudioPlayer.session.a(), H5AudioPlayer.this.session.b());
                        a.a(H5AudioPlayer.this.session);
                    }
                });
                this.mediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.taobao.browser.jsbridge.H5AudioPlayer.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.media.MediaPlayer.OnErrorListener
                    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ((Boolean) ipChange2.ipc$dispatch("a3e3b6fb", new Object[]{this, mediaPlayer, new Integer(i), new Integer(i2)})).booleanValue();
                        }
                        H5AudioPlayer h5AudioPlayer = H5AudioPlayer.this;
                        H5AudioPlayer.access$100(h5AudioPlayer, h5AudioPlayer.session.a(), H5AudioPlayer.this.session.b());
                        a.a(H5AudioPlayer.this.session);
                        return true;
                    }
                });
                this.mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.taobao.browser.jsbridge.H5AudioPlayer.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.media.MediaPlayer.OnPreparedListener
                    public void onPrepared(MediaPlayer mediaPlayer) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("aa6fc624", new Object[]{this, mediaPlayer});
                            return;
                        }
                        int duration = mediaPlayer.getDuration();
                        IWVWebView access$300 = H5AudioPlayer.access$300(H5AudioPlayer.this);
                        access$300.loadUrl("javascript:window.WindVane.fireEvent('AUDIO.START',{'duration':" + duration + ",'url':'" + H5AudioPlayer.this.url + "','playIdentifier':'" + H5AudioPlayer.this.playId + "'});");
                        H5AudioPlayer.access$400(H5AudioPlayer.this).start();
                    }
                });
                this.mediaPlayer.prepareAsync();
            }
        } catch (Exception e) {
            wVCallBackContext.error();
            e.printStackTrace();
        }
        wVCallBackContext.success();
    }

    private String getUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dbc479d6", new Object[]{this, str});
        }
        Object parse = JSON.parse(str);
        return parse instanceof JSONObject ? ((JSONObject) parse).getString("voiceUrl") : "";
    }

    private String getPlayId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b7781c2a", new Object[]{this, str});
        }
        Object parse = JSON.parse(str);
        return parse instanceof JSONObject ? ((JSONObject) parse).getString("playIdentifier") : "";
    }

    public void stop(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba188490", new Object[]{this, wVCallBackContext, str});
            return;
        }
        this.session.a(wVCallBackContext);
        onPause();
        wVCallBackContext.success();
    }

    @Override // android.taobao.windvane.jsbridge.e
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        try {
            if (this.mediaPlayer != null && this.mediaPlayer.isPlaying()) {
                this.mediaPlayer.stop();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        notifyCurrentStopImpl(this.session.a(), this.session.b());
        a.a(this.session);
    }

    @Override // android.taobao.windvane.jsbridge.e, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer == null) {
            return;
        }
        try {
            mediaPlayer.reset();
            this.mediaPlayer.release();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.mediaPlayer = null;
    }

    public void notifyCurrentStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c97d999", new Object[]{this});
        } else {
            notifyCurrentStopImpl(a.b(this.session), a.c(this.session));
        }
    }

    private void notifyCurrentStopImpl(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b31d4820", new Object[]{this, str, wVCallBackContext});
        } else if (str == null || wVCallBackContext == null) {
        } else {
            wVCallBackContext.fireEvent("AUDIO.IDLE", getNotifyJsonStr(str));
        }
    }

    private String getNotifyJsonStr(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("16324205", new Object[]{this, str});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("playIdentifier", (Object) str);
        return jSONObject.toJSONString();
    }

    /* loaded from: classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f16787a;
        private WVCallBackContext b;

        static {
            kge.a(389671545);
        }

        private a() {
        }

        public static /* synthetic */ void a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dfbd25b5", new Object[]{aVar});
            } else {
                aVar.c();
            }
        }

        public static /* synthetic */ String b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("27b1cb4c", new Object[]{aVar}) : aVar.f16787a;
        }

        public static /* synthetic */ WVCallBackContext c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (WVCallBackContext) ipChange.ipc$dispatch("d8967140", new Object[]{aVar}) : aVar.b;
        }

        public String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f16787a;
        }

        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            } else {
                this.f16787a = str;
            }
        }

        public WVCallBackContext b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (WVCallBackContext) ipChange.ipc$dispatch("b251178a", new Object[]{this}) : this.b;
        }

        public void a(WVCallBackContext wVCallBackContext) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ca15efa5", new Object[]{this, wVCallBackContext});
            } else {
                this.b = wVCallBackContext;
            }
        }

        private void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
                return;
            }
            this.f16787a = null;
            this.b = null;
        }
    }
}
