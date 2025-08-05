package tb;

import android.graphics.drawable.Drawable;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public interface snz {

    /* loaded from: classes5.dex */
    public static class a implements snz {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1849108673);
            kge.a(854340662);
        }

        @Override // tb.snz
        public void onDataUpdate(psw pswVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f0585f5", new Object[]{this, pswVar});
            }
        }

        @Override // tb.snz
        public void onPauseMedia(psw pswVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bd5c1bf0", new Object[]{this, pswVar});
            }
        }

        @Override // tb.snz
        public void onRecyclePlayer(psw pswVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2b576cfc", new Object[]{this, pswVar, new Boolean(z)});
            }
        }

        @Override // tb.snz
        public void onRequestMediaPlayer(psw pswVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ea476f38", new Object[]{this, pswVar});
            }
        }

        @Override // tb.snz
        public void onShowCover(psw pswVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f8496fbe", new Object[]{this, pswVar});
            }
        }

        @Override // tb.snz
        public void onShowFirstCover(psw pswVar, int i, int i2, Drawable drawable, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9e2677f4", new Object[]{this, pswVar, new Integer(i), new Integer(i2), drawable, str});
            }
        }

        @Override // tb.snz
        public void onStartMedia(psw pswVar, boolean z, boolean z2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4ffe4c84", new Object[]{this, pswVar, new Boolean(z), new Boolean(z2)});
            }
        }

        @Override // tb.snz
        public void onStopMedia(psw pswVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2a288e06", new Object[]{this, pswVar});
            }
        }

        @Override // tb.snz
        public void onUTPairsUpdate(psw pswVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("db420e07", new Object[]{this, pswVar});
            }
        }
    }

    void onDataUpdate(psw pswVar);

    void onPauseMedia(psw pswVar);

    void onRecyclePlayer(psw pswVar, boolean z);

    void onRequestMediaPlayer(psw pswVar);

    void onShowCover(psw pswVar);

    void onShowFirstCover(psw pswVar, int i, int i2, Drawable drawable, String str);

    void onStartMedia(psw pswVar, boolean z, boolean z2);

    void onStopMedia(psw pswVar);

    void onUTPairsUpdate(psw pswVar);
}
