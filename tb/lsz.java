package tb;

import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.subservice.biz.IVideoPlayControllerService;
import com.taobao.infoflow.taobao.subservice.biz.videoplaycontrollerservice.impl.model.PlayControllerConfig;
import com.taobao.infoflow.taobao.subservice.biz.videoplaycontrollerservice.impl.model.a;
import com.taobao.infoflow.taobao.subservice.biz.videoplaycontrollerservice.impl.model.b;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class lsz extends lsx {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final List<Class<? extends DXWidgetNode>> g;

    /* renamed from: a  reason: collision with root package name */
    private final ltc f30908a;
    private final lte b;
    private final ltd c;
    private final lsy d;
    private final lta e;
    private PlayControllerConfig f;
    private String h;
    private int i;

    public static /* synthetic */ Object ipc$super(lsz lszVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        kge.a(1812325324);
        ArrayList arrayList = new ArrayList();
        g = arrayList;
        arrayList.add(lmh.class);
        g.add(lml.class);
    }

    public lsz(ljs ljsVar, IVideoPlayControllerService.c cVar) {
        super(ljsVar, cVar);
        this.i = 0;
        this.f30908a = new ltc(g);
        this.c = new ltd();
        this.b = new lte();
        this.d = new lsy();
        this.e = new lta(ljsVar);
        this.f = this.e.a();
    }

    @Override // tb.lsx
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.d.a(this);
        }
    }

    @Override // tb.lsx
    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        PlayControllerConfig playControllerConfig = this.f;
        return playControllerConfig != null && playControllerConfig.isPlayControlEnable();
    }

    @Override // tb.lsx
    public void a(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2453afd3", new Object[]{this, iContainerDataModel});
        } else {
            this.f = this.e.a(iContainerDataModel);
        }
    }

    @Override // tb.lsx
    public void a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ad11", new Object[]{this, str, new Integer(i)});
            return;
        }
        this.h = str;
        this.i = i;
        ldf.d("VideoPlayerController", "forceInsertToQueueHeader:" + str + ",mSeekTime:" + this.i);
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IVideoPlayControllerService.a
    public int g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f961", new Object[]{this})).intValue() : this.i;
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IVideoPlayControllerService.a
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        ldf.d("VideoPlayerController", "resetSeekState:");
        this.h = null;
        this.i = -1;
    }

    @Override // tb.lsx
    public void a(List<View> list, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68766eec", new Object[]{this, list, aVar});
            return;
        }
        List<b> a2 = this.b.a(this.c.a(this.f30908a.a(list, aVar), this.f), this.f, aVar);
        a(a2);
        if (a2 == null || a2.isEmpty()) {
            ldf.d("VideoPlayerController", "无可播视频， videoPlayControllerItems isEmpty");
            e();
            return;
        }
        ldf.d("VideoPlayerController", "屏上符合要求的视频个数：" + a2.size() + ", 最小曝光比例： " + this.f.getPlayControlFocusAreaMinPercent());
        this.d.a(a2);
        this.d.b(this);
    }

    private void a(List<b> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        ldf.d("VideoPlayerController", "forcePlayItem:" + this.h);
        if (this.h == null || list == null) {
            ldf.d("VideoPlayerController", "forcePlayItem id null return:");
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            b bVar = list.get(i);
            IVideoPlayControllerService.b a2 = bVar.a();
            if ((a2 instanceof DXWidgetNode) && TextUtils.equals(((DXWidgetNode) a2).getUserId(), this.h)) {
                try {
                    list.remove(i);
                    list.add(0, bVar);
                } catch (Exception e) {
                    ldf.a("VideoPlayerController", "VideoPlayController#强制播放error：", e);
                }
                ldf.d("VideoPlayerController", "VideoPlayController#强制播放index：" + i + ", userId： " + this.h);
            }
        }
    }

    @Override // tb.lsx
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            this.d.c(this);
        }
    }

    @Override // tb.lsx
    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else if (this.d.a()) {
        } else {
            this.d.a(this, this.f30908a.a(view, (a) null));
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IVideoPlayControllerService.a
    public void a(IVideoPlayControllerService.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1feeac7", new Object[]{this, bVar});
            return;
        }
        ldf.d("VideoPlayerController", "playStart :" + bVar);
        this.d.a(bVar);
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IVideoPlayControllerService.a
    public void b(IVideoPlayControllerService.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ff250a6", new Object[]{this, bVar});
            return;
        }
        ldf.d("VideoPlayerController", "playPause:" + bVar);
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IVideoPlayControllerService.a
    public void c(IVideoPlayControllerService.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5de5b685", new Object[]{this, bVar});
            return;
        }
        ldf.d("VideoPlayerController", "playStop :" + bVar);
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IVideoPlayControllerService.a
    public void d(IVideoPlayControllerService.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bd91c64", new Object[]{this, bVar});
            return;
        }
        ldf.d("VideoPlayerController", "playError :" + bVar);
        this.d.b(this);
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IVideoPlayControllerService.a
    public void e(IVideoPlayControllerService.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19cc8243", new Object[]{this, bVar});
            return;
        }
        ldf.d("VideoPlayerController", "playComplete :" + bVar);
    }
}
