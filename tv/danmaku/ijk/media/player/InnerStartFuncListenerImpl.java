package tv.danmaku.ijk.media.player;

import tb.kge;

/* loaded from: classes.dex */
public class InnerStartFuncListenerImpl implements InnerStartFuncListener {
    private long mCurrentTime = System.currentTimeMillis();

    static {
        kge.a(-146829163);
        kge.a(332999893);
    }

    @Override // tv.danmaku.ijk.media.player.InnerStartFuncListener
    public long getInnerStartTime() {
        return this.mCurrentTime;
    }
}
