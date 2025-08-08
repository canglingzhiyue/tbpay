package com.taobao.taolive.room.adapter.alphavideo;

import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.LifecycleOwner;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.taobao.windvane.util.m;
import mtopsdk.common.util.StringUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.proxy.c;
import com.taobao.android.live.plugin.proxy.f;
import com.taobao.android.tblive.gift.model.TBLiveGiftEntity;
import com.taobao.taobao.R;
import com.taobao.taolive.room.adapter.alphavideo.b;
import com.taobao.taolive.room.utils.al;
import java.io.File;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.kge;

/* loaded from: classes8.dex */
public class VideoGiftView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "VideoGiftView";
    private boolean isPlaying;
    private final Handler mMainHandler;
    private final List<com.taobao.android.tblive.gift.biggift.a> mObservers;
    private final d mPlayerAction;
    private e mPlayerController;
    private RelativeLayout mVideoContainer;
    private TBLiveGiftEntity playGiftEntity;

    static {
        kge.a(-1064897250);
    }

    public static /* synthetic */ Object ipc$super(VideoGiftView videoGiftView, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ boolean access$002(VideoGiftView videoGiftView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad1528ce", new Object[]{videoGiftView, new Boolean(z)})).booleanValue();
        }
        videoGiftView.isPlaying = z;
        return z;
    }

    public static /* synthetic */ void access$100(VideoGiftView videoGiftView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("beca62c9", new Object[]{videoGiftView});
        } else {
            videoGiftView.notifyPlayStart();
        }
    }

    public static /* synthetic */ void access$200(VideoGiftView videoGiftView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c89daca", new Object[]{videoGiftView});
        } else {
            videoGiftView.notifyPlayEnd();
        }
    }

    public static /* synthetic */ void access$300(VideoGiftView videoGiftView, Context context, LifecycleOwner lifecycleOwner) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98066edd", new Object[]{videoGiftView, context, lifecycleOwner});
        } else {
            videoGiftView.initPlayerControllerInner(context, lifecycleOwner);
        }
    }

    public static /* synthetic */ void access$400(VideoGiftView videoGiftView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8db55996", new Object[]{videoGiftView, str});
        } else {
            videoGiftView.notifyPlayError(str);
        }
    }

    public static /* synthetic */ TBLiveGiftEntity access$500(VideoGiftView videoGiftView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBLiveGiftEntity) ipChange.ipc$dispatch("660fae", new Object[]{videoGiftView}) : videoGiftView.playGiftEntity;
    }

    public static /* synthetic */ e access$600(VideoGiftView videoGiftView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("c6060944", new Object[]{videoGiftView}) : videoGiftView.mPlayerController;
    }

    public static /* synthetic */ RelativeLayout access$700(VideoGiftView videoGiftView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RelativeLayout) ipChange.ipc$dispatch("d5c13b9f", new Object[]{videoGiftView}) : videoGiftView.mVideoContainer;
    }

    public static /* synthetic */ List access$800(VideoGiftView videoGiftView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("d89a2d77", new Object[]{videoGiftView}) : videoGiftView.mObservers;
    }

    public VideoGiftView(Context context) {
        super(context);
        this.mObservers = new CopyOnWriteArrayList();
        this.mMainHandler = new Handler(Looper.getMainLooper());
        this.mPlayerAction = new d() { // from class: com.taobao.taolive.room.adapter.alphavideo.VideoGiftView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.room.adapter.alphavideo.d
            public void a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                VideoGiftView.access$002(VideoGiftView.this, true);
                VideoGiftView.access$100(VideoGiftView.this);
            }

            @Override // com.taobao.taolive.room.adapter.alphavideo.d
            public void b() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                    return;
                }
                VideoGiftView.access$002(VideoGiftView.this, false);
                VideoGiftView.access$200(VideoGiftView.this);
            }
        };
        initView();
    }

    public VideoGiftView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mObservers = new CopyOnWriteArrayList();
        this.mMainHandler = new Handler(Looper.getMainLooper());
        this.mPlayerAction = new d() { // from class: com.taobao.taolive.room.adapter.alphavideo.VideoGiftView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.room.adapter.alphavideo.d
            public void a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                VideoGiftView.access$002(VideoGiftView.this, true);
                VideoGiftView.access$100(VideoGiftView.this);
            }

            @Override // com.taobao.taolive.room.adapter.alphavideo.d
            public void b() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                    return;
                }
                VideoGiftView.access$002(VideoGiftView.this, false);
                VideoGiftView.access$200(VideoGiftView.this);
            }
        };
        initView();
    }

    public VideoGiftView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mObservers = new CopyOnWriteArrayList();
        this.mMainHandler = new Handler(Looper.getMainLooper());
        this.mPlayerAction = new d() { // from class: com.taobao.taolive.room.adapter.alphavideo.VideoGiftView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.room.adapter.alphavideo.d
            public void a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                VideoGiftView.access$002(VideoGiftView.this, true);
                VideoGiftView.access$100(VideoGiftView.this);
            }

            @Override // com.taobao.taolive.room.adapter.alphavideo.d
            public void b() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                    return;
                }
                VideoGiftView.access$002(VideoGiftView.this, false);
                VideoGiftView.access$200(VideoGiftView.this);
            }
        };
        initView();
    }

    public VideoGiftView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mObservers = new CopyOnWriteArrayList();
        this.mMainHandler = new Handler(Looper.getMainLooper());
        this.mPlayerAction = new d() { // from class: com.taobao.taolive.room.adapter.alphavideo.VideoGiftView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.room.adapter.alphavideo.d
            public void a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                VideoGiftView.access$002(VideoGiftView.this, true);
                VideoGiftView.access$100(VideoGiftView.this);
            }

            @Override // com.taobao.taolive.room.adapter.alphavideo.d
            public void b() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                    return;
                }
                VideoGiftView.access$002(VideoGiftView.this, false);
                VideoGiftView.access$200(VideoGiftView.this);
            }
        };
        initView();
    }

    private void initView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        LayoutInflater.from(getContext()).inflate(R.layout.view_video_gift, this);
        this.mVideoContainer = (RelativeLayout) findViewById(R.id.video_view);
    }

    public void initPlayerController(final Context context, final LifecycleOwner lifecycleOwner) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8af4c8a6", new Object[]{this, context, lifecycleOwner});
            return;
        }
        m.c(TAG, "initPlayerController");
        if (com.taobao.android.live.plugin.proxy.c.a().d()) {
            initPlayerControllerInner(context, lifecycleOwner);
        } else {
            com.taobao.android.live.plugin.proxy.c.a().a(new c.b() { // from class: com.taobao.taolive.room.adapter.alphavideo.VideoGiftView.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.live.plugin.proxy.c.b
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        VideoGiftView.access$300(VideoGiftView.this, context, lifecycleOwner);
                    }
                }
            });
        }
    }

    private void initPlayerControllerInner(Context context, LifecycleOwner lifecycleOwner) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95aa5be2", new Object[]{this, context, lifecycleOwner});
        } else if (f.n() == null) {
        } else {
            this.mPlayerController = f.n().createGLTextureViewPlayerController(context, lifecycleOwner, new b.InterfaceC0898b() { // from class: com.taobao.taolive.room.adapter.alphavideo.VideoGiftView.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.taolive.room.adapter.alphavideo.b.InterfaceC0898b
                public void a(int i, int i2, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9d025a92", new Object[]{this, new Integer(i), new Integer(i2), str});
                        return;
                    }
                    VideoGiftView.access$400(VideoGiftView.this, str);
                    if (VideoGiftView.access$500(VideoGiftView.this) == null) {
                        return;
                    }
                    m.c(VideoGiftView.TAG, "startVideoGiftError | url=" + VideoGiftView.access$500(VideoGiftView.this).mAnimationMp4 + "| giftId=" + VideoGiftView.access$500(VideoGiftView.this).mGiftId);
                }
            });
            e eVar = this.mPlayerController;
            if (eVar == null) {
                return;
            }
            eVar.a(this.mPlayerAction);
            this.mPlayerController.a(new c() { // from class: com.taobao.taolive.room.adapter.alphavideo.VideoGiftView.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.taolive.room.adapter.alphavideo.c
                public void a(boolean z, String str, int i, int i2, String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ddbc7560", new Object[]{this, new Boolean(z), str, new Integer(i), new Integer(i2), str2});
                        return;
                    }
                    m.c(VideoGiftView.TAG, "mPlayerController monitor: b=" + z + "    s=" + str + " i=" + i + " i1=" + i2 + "  s1=" + str2);
                }
            });
        }
    }

    public void addObserver(com.taobao.android.tblive.gift.biggift.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63da5e68", new Object[]{this, aVar});
        } else if (aVar == null) {
        } else {
            this.mObservers.add(aVar);
        }
    }

    public void removeObserver(com.taobao.android.tblive.gift.biggift.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f776360b", new Object[]{this, aVar});
        } else if (aVar == null) {
        } else {
            this.mObservers.remove(aVar);
        }
    }

    public void startVideoGift(TBLiveGiftEntity tBLiveGiftEntity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b08d7e1", new Object[]{this, tBLiveGiftEntity});
        } else if (!com.taobao.android.live.plugin.proxy.c.a().d()) {
        } else {
            this.isPlaying = true;
            this.playGiftEntity = tBLiveGiftEntity;
            if (tBLiveGiftEntity == null) {
                return;
            }
            String a2 = al.a(tBLiveGiftEntity.mAnimationMp4);
            if (StringUtils.isEmpty(a2)) {
                return;
            }
            final a aVar = null;
            if (f.n() != null) {
                aVar = f.n().createDataSource();
            }
            if (aVar == null) {
                return;
            }
            aVar.a(a2, ScaleType.BottomFit.ordinal()).b(a2, ScaleType.ScaleAspectFitCenter.ordinal());
            aVar.a(getGiftDir(getContext()));
            if (!aVar.a()) {
                Log.e(TAG, "startVideoGift: dataSource is invalid.");
                return;
            }
            m.c(TAG, "startVideoGift | url=" + this.playGiftEntity.mAnimationMp4 + "| giftId=" + this.playGiftEntity.mGiftId);
            this.mMainHandler.post(new Runnable() { // from class: com.taobao.taolive.room.adapter.alphavideo.VideoGiftView.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (VideoGiftView.access$600(VideoGiftView.this) == null) {
                    } else {
                        VideoGiftView.access$600(VideoGiftView.this).a(aVar);
                    }
                }
            });
        }
    }

    public static String getGiftDir(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("208dba66", new Object[]{context});
        }
        String a2 = al.a(context);
        if (StringUtils.isEmpty(a2)) {
            return "";
        }
        if (a2.endsWith(File.separator)) {
            return a2;
        }
        return a2 + File.separator;
    }

    public void attachView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ed22211", new Object[]{this});
        } else {
            this.mMainHandler.post(new Runnable() { // from class: com.taobao.taolive.room.adapter.alphavideo.VideoGiftView.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (VideoGiftView.access$600(VideoGiftView.this) == null) {
                    } else {
                        VideoGiftView.access$600(VideoGiftView.this).a(VideoGiftView.access$700(VideoGiftView.this));
                    }
                }
            });
        }
    }

    public boolean isVideoPlaying() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7a32d388", new Object[]{this})).booleanValue() : this.isPlaying;
    }

    public void detachView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3abe1d5f", new Object[]{this});
        } else {
            this.mMainHandler.post(new Runnable() { // from class: com.taobao.taolive.room.adapter.alphavideo.VideoGiftView.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (VideoGiftView.access$600(VideoGiftView.this) == null) {
                    } else {
                        VideoGiftView.access$600(VideoGiftView.this).b(VideoGiftView.access$700(VideoGiftView.this));
                    }
                }
            });
        }
    }

    public void releasePlayerController() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f05a160b", new Object[]{this});
        } else {
            this.mMainHandler.post(new Runnable() { // from class: com.taobao.taolive.room.adapter.alphavideo.VideoGiftView.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    VideoGiftView.access$002(VideoGiftView.this, false);
                    if (VideoGiftView.access$600(VideoGiftView.this) != null) {
                        VideoGiftView.access$600(VideoGiftView.this).b(VideoGiftView.access$700(VideoGiftView.this));
                        VideoGiftView.access$600(VideoGiftView.this).e();
                        if ((VideoGiftView.access$600(VideoGiftView.this) instanceof e) && (VideoGiftView.this.getContext() instanceof LifecycleOwner)) {
                            ((LifecycleOwner) VideoGiftView.this.getContext()).getLifecycle().removeObserver((LifecycleObserver) VideoGiftView.access$600(VideoGiftView.this));
                        }
                    }
                    VideoGiftView.access$800(VideoGiftView.this).clear();
                }
            });
        }
    }

    private void notifyPlayStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd3bae4c", new Object[]{this});
            return;
        }
        List<com.taobao.android.tblive.gift.biggift.a> list = this.mObservers;
        if (list == null || list.size() <= 0) {
            return;
        }
        for (com.taobao.android.tblive.gift.biggift.a aVar : this.mObservers) {
            aVar.a(this.playGiftEntity);
        }
    }

    private void notifyPlayEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ef5cb05", new Object[]{this});
            return;
        }
        List<com.taobao.android.tblive.gift.biggift.a> list = this.mObservers;
        if (list == null || list.size() <= 0) {
            return;
        }
        for (com.taobao.android.tblive.gift.biggift.a aVar : this.mObservers) {
            aVar.b(this.playGiftEntity);
        }
    }

    private void notifyPlayError(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cf20a3c", new Object[]{this, str});
            return;
        }
        List<com.taobao.android.tblive.gift.biggift.a> list = this.mObservers;
        if (list == null || list.size() <= 0) {
            return;
        }
        for (com.taobao.android.tblive.gift.biggift.a aVar : this.mObservers) {
            aVar.a(str, this.playGiftEntity);
        }
    }
}
