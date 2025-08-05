package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* loaded from: classes5.dex */
public interface hjl {

    /* loaded from: classes5.dex */
    public static class a implements hjl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1831355970);
            kge.a(387453491);
        }

        @Override // tb.hjl
        public void onCompletion(psw pswVar, IMediaPlayer iMediaPlayer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2f520420", new Object[]{this, pswVar, iMediaPlayer});
            }
        }

        @Override // tb.hjl
        public boolean onError(psw pswVar, IMediaPlayer iMediaPlayer, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("193dfed2", new Object[]{this, pswVar, iMediaPlayer, new Integer(i), new Integer(i2)})).booleanValue();
            }
            return false;
        }

        @Override // tb.hjl
        public boolean onInfo(psw pswVar, IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("2e7af9b2", new Object[]{this, pswVar, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj})).booleanValue();
            }
            return false;
        }

        @Override // tb.hjl
        public void onPrepared(psw pswVar, IMediaPlayer iMediaPlayer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ec4c7581", new Object[]{this, pswVar, iMediaPlayer});
            }
        }
    }

    void onCompletion(psw pswVar, IMediaPlayer iMediaPlayer);

    boolean onError(psw pswVar, IMediaPlayer iMediaPlayer, int i, int i2);

    boolean onInfo(psw pswVar, IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj);

    void onPrepared(psw pswVar, IMediaPlayer iMediaPlayer);
}
