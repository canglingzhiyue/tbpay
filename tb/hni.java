package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWVideoScreenType;

/* loaded from: classes5.dex */
public interface hni {

    /* loaded from: classes5.dex */
    public static class a implements hni {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1447449751);
            kge.a(1120919262);
        }

        @Override // tb.hni
        public void onLoopCompletion(psw pswVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c0caff82", new Object[]{this, pswVar});
            }
        }

        @Override // tb.hni
        public void onPreCompletion(psw pswVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9060abe3", new Object[]{this, pswVar});
            }
        }

        @Override // tb.hni
        public void onVideoClose(psw pswVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c366581f", new Object[]{this, pswVar});
            }
        }

        @Override // tb.hni
        public void onVideoComplete(psw pswVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6169a058", new Object[]{this, pswVar});
            }
        }

        @Override // tb.hni
        public void onVideoError(psw pswVar, Object obj, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a8308feb", new Object[]{this, pswVar, obj, new Integer(i), new Integer(i2)});
            }
        }

        @Override // tb.hni
        public void onVideoInfo(psw pswVar, Object obj, long j, long j2, long j3, Object obj2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("93966fd7", new Object[]{this, pswVar, obj, new Long(j), new Long(j2), new Long(j3), obj2});
            }
        }

        @Override // tb.hni
        public void onVideoPause(psw pswVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("76ec8357", new Object[]{this, pswVar, new Boolean(z)});
            }
        }

        @Override // tb.hni
        public void onVideoPlay(psw pswVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("653637d3", new Object[]{this, pswVar});
            }
        }

        @Override // tb.hni
        public void onVideoPrepared(psw pswVar, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc216e38", new Object[]{this, pswVar, obj});
            }
        }

        @Override // tb.hni
        public void onVideoProgressChanged(psw pswVar, int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e6edd75", new Object[]{this, pswVar, new Integer(i), new Integer(i2), new Integer(i3)});
            }
        }

        @Override // tb.hni
        public void onVideoScreenChanged(psw pswVar, DWVideoScreenType dWVideoScreenType) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("29ff74ca", new Object[]{this, pswVar, dWVideoScreenType});
            }
        }

        @Override // tb.hni
        public void onVideoSeekTo(psw pswVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1f305711", new Object[]{this, pswVar, new Integer(i)});
            }
        }

        @Override // tb.hni
        public void onVideoStart(psw pswVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("862ef89", new Object[]{this, pswVar});
            }
        }

        @Override // tb.hni
        public void onVideoStateChanged(psw pswVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("400dd041", new Object[]{this, pswVar, new Integer(i)});
            }
        }
    }

    void onLoopCompletion(psw pswVar);

    void onPreCompletion(psw pswVar);

    void onVideoClose(psw pswVar);

    void onVideoComplete(psw pswVar);

    void onVideoError(psw pswVar, Object obj, int i, int i2);

    void onVideoInfo(psw pswVar, Object obj, long j, long j2, long j3, Object obj2);

    void onVideoPause(psw pswVar, boolean z);

    void onVideoPlay(psw pswVar);

    void onVideoPrepared(psw pswVar, Object obj);

    void onVideoProgressChanged(psw pswVar, int i, int i2, int i3);

    void onVideoScreenChanged(psw pswVar, DWVideoScreenType dWVideoScreenType);

    void onVideoSeekTo(psw pswVar, int i);

    void onVideoStart(psw pswVar);

    void onVideoStateChanged(psw pswVar, int i);
}
