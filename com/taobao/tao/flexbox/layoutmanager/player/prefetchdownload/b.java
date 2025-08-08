package com.taobao.tao.flexbox.layoutmanager.player.prefetchdownload;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.util.LruCache;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.component.TBVideoComponent;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import com.taobao.tao.flexbox.layoutmanager.player.c;
import com.taobao.tao.flexbox.layoutmanager.player.prefetchdownload.PrefetchDownloadConfigBean;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import tb.akt;
import tb.kge;
import tb.oeb;
import tb.oec;
import tb.ogg;
import tb.ogv;

/* loaded from: classes8.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private PrefetchDownloadConfigBean f20475a;
    private boolean b = false;
    private boolean c = false;
    private LruCache<String, MediaInfoBean> d = new LruCache<>(8);
    private List<TBVideoComponent> e = new ArrayList();
    private long f = 0;
    private long g = 0;
    private com.taobao.tao.flexbox.layoutmanager.player.prefetchdownload.a h;
    private float i;

    /* loaded from: classes8.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static b f20476a;

        static {
            kge.a(-1778877307);
            f20476a = new b();
        }

        public static /* synthetic */ b a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("9d3d4c66", new Object[0]) : f20476a;
        }
    }

    static {
        kge.a(-1686069974);
        kge.a(-908604969);
    }

    public static b a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("9d3d4c66", new Object[0]) : a.a();
    }

    public void a(Component component, List<aa> list, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9107cc40", new Object[]{this, component, list, new Boolean(z)});
            return;
        }
        try {
            if (!ogv.b(list) || !ogv.b(a(list)) || component.getNode() == null || z) {
                return;
            }
            a(component.getNode().N());
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void a(c.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f46169d", new Object[]{this, bVar});
        } else if ((bVar != null && bVar.b != null && bVar.b.getViewParams() != null && bVar.b.getViewParams().I) || bVar == null || bVar.b == null || bVar.b.getNode() == null || bVar.b.getNode().N() == null) {
        } else {
            ogg.d("TNodePlayerPrefetchManager", "onFirstFrame回调完成，调用startPrefetch方法");
            b(bVar.b.getNode().N());
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.b = true;
        ogg.d("TNodePlayerPrefetchManager", "onScrolling，停止预下载");
        j();
    }

    public void a(TBVideoComponent tBVideoComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("797cd4ce", new Object[]{this, tBVideoComponent});
        } else {
            this.b = false;
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.c = true;
        ogg.d("TNodePlayerPrefetchManager", "onVideoCardClick回调，停止预下载");
        j();
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        ogg.d("TNodePlayerPrefetchManager", "onFindTargetVideo,触发预下载");
        b(context);
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.c = false;
        ogg.d("TNodePlayerPrefetchManager", "onViewAppear，重置click标记位");
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        ogg.d("TNodePlayerPrefetchManager", "onDisappear回调完成，停止预下载");
        j();
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
        }
        if (!oeb.au()) {
            return false;
        }
        h();
        PrefetchDownloadConfigBean prefetchDownloadConfigBean = this.f20475a;
        if (prefetchDownloadConfigBean == null || !oec.a((Object) prefetchDownloadConfigBean.enable, false)) {
            return false;
        }
        ogg.d("TNodePlayerPrefetchManager", "命中预下载AB实验");
        float f = this.f20475a.limitDeviceScore;
        if (f <= 0.0f) {
            return oec.a((Object) this.f20475a.enable, false);
        }
        return l() >= f;
    }

    public boolean g() {
        PrefetchDownloadConfigBean prefetchDownloadConfigBean;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : !f() || (prefetchDownloadConfigBean = this.f20475a) == null || !oec.a((Object) prefetchDownloadConfigBean.enable, false) || !i();
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else if (this.f20475a != null) {
        } else {
            String av = oeb.av();
            if (!StringUtils.isEmpty(av)) {
                try {
                    this.f20475a = (PrefetchDownloadConfigBean) JSONObject.parseObject(av, PrefetchDownloadConfigBean.class);
                    return;
                } catch (Throwable th) {
                    ogg.a("romJson error", th.getMessage());
                    return;
                }
            }
            ogg.d("TNodePlayerPrefetchManager", "prefetch AB Test config is null");
        }
    }

    private boolean i() {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue();
        }
        PrefetchDownloadConfigBean prefetchDownloadConfigBean = this.f20475a;
        if (prefetchDownloadConfigBean != null && ogv.b(prefetchDownloadConfigBean.timeRanges)) {
            Calendar calendar = Calendar.getInstance();
            int i = (calendar.get(11) * 60) + calendar.get(12);
            for (PrefetchDownloadConfigBean.TimeRange timeRange : this.f20475a.timeRanges) {
                long j = i;
                if (j >= timeRange.start.longValue() && j < timeRange.end.longValue()) {
                    break;
                }
            }
        }
        z = false;
        ogg.d("TNodePlayerPrefetchManager", "prefetch AB Test config validConfigTime：" + z);
        return z;
    }

    private void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{this, context});
        } else if (this.b) {
            ogg.d("TNodePlayerPrefetchManager", "startPrefetch，正在滑动，return");
        } else if (this.c) {
            ogg.d("TNodePlayerPrefetchManager", "startPrefetch，双列流点击过了，return");
        } else if (g()) {
            ogg.d("TNodePlayerPrefetchManager", "startPrefetch，时间不满足，return");
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f < 50) {
                ogg.d("TNodePlayerPrefetchManager", "startPrefetch，开始预下载调用间隔小于50ms，return掉");
                return;
            }
            this.f = currentTimeMillis;
            List<MediaInfoBean> k = k();
            if (!ogv.b(k)) {
                return;
            }
            if (this.h == null) {
                this.h = new com.taobao.tao.flexbox.layoutmanager.player.prefetchdownload.a(context);
            }
            this.h.a(k, this.f20475a);
        }
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
        } else if (!f()) {
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.g < 50) {
                ogg.d("TNodePlayerPrefetchManager", "stopPrefetch，停止预下载调用间隔小于50ms，return掉");
                return;
            }
            this.g = currentTimeMillis;
            com.taobao.tao.flexbox.layoutmanager.player.prefetchdownload.a aVar = this.h;
            if (aVar == null) {
                return;
            }
            aVar.a();
        }
    }

    private List<MediaInfoBean> k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6ec86895", new Object[]{this});
        }
        ArrayList<MediaInfoBean> arrayList = new ArrayList();
        if (ogv.a(this.e)) {
            return arrayList;
        }
        for (TBVideoComponent tBVideoComponent : this.e) {
            TBVideoComponent.c viewParams = tBVideoComponent.getViewParams();
            if (viewParams != null) {
                if (StringUtils.isEmpty(viewParams.f) || (StringUtils.isEmpty(viewParams.E) && StringUtils.isEmpty(viewParams.F))) {
                    ogg.d("TNodePlayerPrefetchManager", "videoId或者播控为空");
                } else if (c.a().d(tBVideoComponent.f())) {
                    ogg.d("TNodePlayerPrefetchManager", "正在播放的视频，不使用预下载,预下载list去除");
                } else if (this.d.get(viewParams.f) != null) {
                    ogg.d("TNodePlayerPrefetchManager", "videoId4 移除:" + viewParams.f + "——videoResourceStr:" + viewParams.E);
                } else {
                    MediaInfoBean mediaInfoBean = new MediaInfoBean();
                    mediaInfoBean.enableBitOpti = com.taobao.tao.flexbox.layoutmanager.player.videodecide.c.a(viewParams);
                    if (mediaInfoBean.enableBitOpti) {
                        mediaInfoBean.videoResourceStr = viewParams.F;
                    } else {
                        mediaInfoBean.videoResourceStr = viewParams.E;
                    }
                    mediaInfoBean.videoId = viewParams.f;
                    ogg.d("TNodePlayerPrefetchManager", "videoId4 增加:" + mediaInfoBean.videoId + "——videoResourceStr:" + mediaInfoBean.videoResourceStr);
                    arrayList.add(mediaInfoBean);
                    this.d.put(mediaInfoBean.videoId, mediaInfoBean);
                }
            }
        }
        ogg.d("TNodePlayerPrefetchManager", "videoId4 移除后:" + arrayList.size());
        for (MediaInfoBean mediaInfoBean2 : arrayList) {
            ogg.d("TNodePlayerPrefetchManager", "videoId4:" + mediaInfoBean2.videoId + "——videoResourceStr:" + mediaInfoBean2.videoResourceStr);
        }
        return arrayList;
    }

    private List<TBVideoComponent> a(List<aa> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b71fabce", new Object[]{this, list});
        }
        this.e = new ArrayList();
        if (g()) {
            return this.e;
        }
        if (ogv.a(list)) {
            return this.e;
        }
        ogg.d("TNodePlayerPrefetchManager", "视频的数目：" + list.size());
        for (aa aaVar : list) {
            TBVideoComponent.c viewParams = ((TBVideoComponent) aaVar.I()).getViewParams();
            if (viewParams == null) {
                ogg.d("TNodePlayerPrefetchManager", "参数未null");
            } else if (!viewParams.J) {
                ogg.d("TNodePlayerPrefetchManager", "TNode开关设置禁用预加载，不使用预下载");
            } else if (c.a().d(((TBVideoComponent) aaVar.I()).f())) {
                ogg.d("TNodePlayerPrefetchManager", "正在播放的视频，不使用预下载");
            } else if (viewParams.aO_()) {
                ogg.d("TNodePlayerPrefetchManager", "直播数据不使用预下载");
            } else if (viewParams.I) {
                ogg.d("TNodePlayerPrefetchManager", "缓存不使用预下载");
            } else if (viewParams.H) {
                ogg.d("TNodePlayerPrefetchManager", "话题不使用预下载");
            } else {
                String str = viewParams.E;
                if (com.taobao.tao.flexbox.layoutmanager.player.videodecide.c.a(viewParams)) {
                    str = viewParams.F;
                }
                if (StringUtils.isEmpty(str)) {
                    ogg.d("TNodePlayerPrefetchManager", "没有播控数据");
                } else if (!StringUtils.isEmpty(viewParams.f)) {
                    this.e.add((TBVideoComponent) aaVar.I());
                }
            }
        }
        return this.e;
    }

    private float l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6076ee3", new Object[]{this})).floatValue();
        }
        if (this.i <= 0.0f) {
            this.i = akt.b();
        }
        return this.i;
    }
}
