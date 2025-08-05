package tv.danmaku.ijk.media.player;

import anet.channel.strategy.HttpDnsAdapter;
import com.taobao.taobaoavsdk.widget.media.c;
import java.lang.ref.WeakReference;
import java.util.Map;
import tb.dde;
import tb.kge;

/* loaded from: classes.dex */
public abstract class CommonMonitor extends AbstractMediaPlayer {
    protected volatile boolean bIsHitCache;
    protected String mBackupCdnIp;
    protected String mCdnIp;
    protected c mConfig;
    protected c mConfigClone;
    protected String mEncodeType;
    protected Map<String, String> mExtInfo;
    protected long mFirstEndtime;
    protected WeakReference<dde> mFirstRenderAdapterRef;
    protected InnerStartFuncListener mInnerStartFuncListener;
    protected String mNetType;
    protected String mPlayUrl;
    protected String mRemoteHost;
    protected long mRenderTimeFromInnerStart;
    protected String mServerIP;
    protected HttpDnsAdapter.HttpDnsOrigin mHttpDnsOrigin = null;
    public long mUserFirstRenderTime = 0;
    protected long mUserPreparedTime = 0;
    protected long mPreparedTime = 0;
    protected long mBufferingCount = 0;
    protected long mBufferingTotalTime = 0;
    protected long mUserStartTime = 0;

    static {
        kge.a(1859535454);
    }
}
