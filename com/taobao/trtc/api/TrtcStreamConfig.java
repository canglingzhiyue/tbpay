package com.taobao.trtc.api;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes9.dex */
public class TrtcStreamConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean audioEnable;
    private boolean cropEnable;
    private boolean dataEnable;
    private boolean isSub;
    private boolean videoEnable;
    private int videoFps;
    private int videoHeight;
    private int videoWidth;

    static {
        kge.a(1371152627);
    }

    public static /* synthetic */ boolean access$002(TrtcStreamConfig trtcStreamConfig, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9fc17223", new Object[]{trtcStreamConfig, new Boolean(z)})).booleanValue();
        }
        trtcStreamConfig.audioEnable = z;
        return z;
    }

    public static /* synthetic */ boolean access$102(TrtcStreamConfig trtcStreamConfig, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5938ffc2", new Object[]{trtcStreamConfig, new Boolean(z)})).booleanValue();
        }
        trtcStreamConfig.videoEnable = z;
        return z;
    }

    public static /* synthetic */ boolean access$202(TrtcStreamConfig trtcStreamConfig, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("12b08d61", new Object[]{trtcStreamConfig, new Boolean(z)})).booleanValue();
        }
        trtcStreamConfig.dataEnable = z;
        return z;
    }

    public static /* synthetic */ int access$302(TrtcStreamConfig trtcStreamConfig, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cc27db1e", new Object[]{trtcStreamConfig, new Integer(i)})).intValue();
        }
        trtcStreamConfig.videoHeight = i;
        return i;
    }

    public static /* synthetic */ int access$402(TrtcStreamConfig trtcStreamConfig, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("859f68bd", new Object[]{trtcStreamConfig, new Integer(i)})).intValue();
        }
        trtcStreamConfig.videoWidth = i;
        return i;
    }

    public static /* synthetic */ int access$502(TrtcStreamConfig trtcStreamConfig, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3f16f65c", new Object[]{trtcStreamConfig, new Integer(i)})).intValue();
        }
        trtcStreamConfig.videoFps = i;
        return i;
    }

    public static /* synthetic */ boolean access$602(TrtcStreamConfig trtcStreamConfig, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f88ec3dd", new Object[]{trtcStreamConfig, new Boolean(z)})).booleanValue();
        }
        trtcStreamConfig.isSub = z;
        return z;
    }

    public static /* synthetic */ boolean access$702(TrtcStreamConfig trtcStreamConfig, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b206517c", new Object[]{trtcStreamConfig, new Boolean(z)})).booleanValue();
        }
        trtcStreamConfig.cropEnable = z;
        return z;
    }

    public int getVideoWidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fe5511fb", new Object[]{this})).intValue() : this.videoWidth;
    }

    public int getVideoHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("867fcec6", new Object[]{this})).intValue() : this.videoHeight;
    }

    public int getVideoFps() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("31719a5e", new Object[]{this})).intValue() : this.videoFps;
    }

    public boolean isAudioEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3f12c67a", new Object[]{this})).booleanValue() : this.audioEnable;
    }

    public boolean isVideoEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e8e674df", new Object[]{this})).booleanValue() : this.videoEnable;
    }

    public boolean isDataEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fb277a2", new Object[]{this})).booleanValue() : this.dataEnable;
    }

    public boolean getIsSub() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6d6cdb8b", new Object[]{this})).booleanValue() : this.isSub;
    }

    public boolean isCropEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("97765b08", new Object[]{this})).booleanValue() : this.cropEnable;
    }

    public String ToString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("572a47ed", new Object[]{this});
        }
        return "Stream Config: { audio: " + this.audioEnable + ", video: " + this.videoEnable + ", data: " + this.dataEnable + ", video_size: " + this.videoWidth + "x" + this.videoHeight + "@" + this.videoFps + "fps, cropEnable: " + this.cropEnable + ", isSub: " + this.isSub + " }";
    }

    public void update(boolean z, boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5c0584", new Object[]{this, new Boolean(z), new Boolean(z2), new Boolean(z3)});
            return;
        }
        this.audioEnable = z;
        this.videoEnable = z2;
        this.dataEnable = z3;
    }

    public void updateVideoSize(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c206813a", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.videoWidth = i;
        this.videoHeight = i2;
    }

    public void setVideoEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5d51891", new Object[]{this, new Boolean(z)});
        } else {
            this.videoEnable = z;
        }
    }

    /* loaded from: classes9.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private boolean f23050a = true;
        private boolean b = true;
        private boolean c = false;
        private int d = 720;
        private int e = 1280;
        private int f = 20;
        private boolean g = false;
        private boolean h = false;

        static {
            kge.a(1328960714);
        }

        public a a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("16bdeba9", new Object[]{this, new Boolean(z)});
            }
            this.f23050a = z;
            return this;
        }

        public a b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("b15eae2a", new Object[]{this, new Boolean(z)});
            }
            this.b = z;
            return this;
        }

        public a c(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("4bff70ab", new Object[]{this, new Boolean(z)});
            }
            this.c = z;
            return this;
        }

        public a a(int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("1e5c6afa", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            }
            this.d = i;
            this.e = i2;
            this.f = i3;
            return this;
        }

        public a d(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("e6a0332c", new Object[]{this, new Boolean(z)});
            }
            this.g = z;
            return this;
        }

        public TrtcStreamConfig a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TrtcStreamConfig) ipChange.ipc$dispatch("aa06940a", new Object[]{this});
            }
            TrtcStreamConfig trtcStreamConfig = new TrtcStreamConfig();
            TrtcStreamConfig.access$002(trtcStreamConfig, this.f23050a);
            TrtcStreamConfig.access$102(trtcStreamConfig, this.b);
            TrtcStreamConfig.access$202(trtcStreamConfig, this.c);
            TrtcStreamConfig.access$302(trtcStreamConfig, this.e);
            TrtcStreamConfig.access$402(trtcStreamConfig, this.d);
            TrtcStreamConfig.access$502(trtcStreamConfig, this.f);
            TrtcStreamConfig.access$602(trtcStreamConfig, this.g);
            TrtcStreamConfig.access$702(trtcStreamConfig, this.h);
            return trtcStreamConfig;
        }
    }
}
