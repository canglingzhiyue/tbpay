package com.taobao.search.musie.component.audio;

import android.media.MediaPlayer;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.util.ac;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.ui.MUSMethod;
import com.taobao.android.weex_framework.ui.MUSNodeProp;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.ui.UINodeType;
import tb.kge;

/* loaded from: classes7.dex */
public class Audio extends UINode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ATTR_AUTOPLAY = "autoplay";
    private static final String ATTR_LOOP = "loop";
    private static final String ATTR_SRC = "src";
    private Runnable delayRunnable;
    private MediaPlayer mediaPlayer;

    static {
        kge.a(69008847);
    }

    public static /* synthetic */ Object ipc$super(Audio audio, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ MediaPlayer access$000(Audio audio) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MediaPlayer) ipChange.ipc$dispatch("a26e8132", new Object[]{audio}) : audio.mediaPlayer;
    }

    public Audio(int i) {
        super(i);
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    public UINodeType getNodeType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UINodeType) ipChange.ipc$dispatch("a8f3a2f7", new Object[]{this}) : UINodeType.LAYOUT;
    }

    @MUSNodeProp(name = "src")
    public void setSrc(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dbfab33", new Object[]{this, str});
        } else {
            setAttribute("src", str);
        }
    }

    @MUSNodeProp(name = "autoplay")
    public void setAutoPlay(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c396e48", new Object[]{this, new Boolean(z)});
        } else {
            setAttribute("autoplay", Boolean.valueOf(z));
        }
    }

    @MUSNodeProp(defaultBoolean = false, name = "loop")
    public void setLoop(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4d0b0c7", new Object[]{this, new Boolean(z)});
        } else {
            setAttribute("loop", Boolean.valueOf(z));
        }
    }

    @MUSNodeProp(name = "loop", refresh = true)
    public void refreshLoop(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("567126e", new Object[]{this, new Boolean(z)});
            return;
        }
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer == null) {
            return;
        }
        mediaPlayer.setLooping(isLoop());
    }

    @MUSMethod
    public void play() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe955bb", new Object[]{this});
            return;
        }
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer == null) {
            this.delayRunnable = new ac() { // from class: com.taobao.search.musie.component.audio.Audio.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.etao.feimagesearch.util.ac
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        Audio.this.play();
                    }
                }
            };
            return;
        }
        try {
            if (mediaPlayer.isPlaying()) {
                return;
            }
            this.mediaPlayer.start();
        } catch (Exception unused) {
        }
    }

    @MUSMethod
    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer == null) {
            this.delayRunnable = new ac() { // from class: com.taobao.search.musie.component.audio.Audio.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.etao.feimagesearch.util.ac
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        Audio.this.pause();
                    }
                }
            };
            return;
        }
        try {
            if (!mediaPlayer.isPlaying()) {
                return;
            }
            this.mediaPlayer.pause();
        } catch (Exception unused) {
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    public void onMount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eefeffb1", new Object[]{this, mUSDKInstance, obj});
            return;
        }
        String str = (String) getAttribute("src");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.mediaPlayer = new MediaPlayer();
        this.mediaPlayer.setLooping(isLoop());
        try {
            this.mediaPlayer.setDataSource(str);
            this.mediaPlayer.prepareAsync();
            Boolean bool = (Boolean) getAttribute("autoplay");
            if (bool != null && bool.booleanValue()) {
                this.mediaPlayer.setOnBufferingUpdateListener(new MediaPlayer.OnBufferingUpdateListener() { // from class: com.taobao.search.musie.component.audio.Audio.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
                    public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7ae0494f", new Object[]{this, mediaPlayer, new Integer(i)});
                        } else if (i < 100 || Audio.access$000(Audio.this).isPlaying()) {
                        } else {
                            Audio.access$000(Audio.this).start();
                        }
                    }
                });
            }
            if (this.delayRunnable == null) {
                return;
            }
            this.delayRunnable.run();
            this.delayRunnable = null;
        } catch (Exception unused) {
        }
    }

    private boolean isLoop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57340079", new Object[]{this})).booleanValue();
        }
        Object attribute = getAttribute("loop");
        return (attribute instanceof Boolean) && ((Boolean) attribute).booleanValue();
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    public void onUnmount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7dcc50a", new Object[]{this, mUSDKInstance, obj});
            return;
        }
        try {
            this.mediaPlayer.stop();
            this.mediaPlayer.release();
            this.delayRunnable = null;
        } catch (Exception unused) {
        }
        this.mediaPlayer = null;
    }
}
