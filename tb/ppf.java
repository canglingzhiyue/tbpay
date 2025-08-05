package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.taolive.room.utils.v;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.utils.u;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes8.dex */
public class ppf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f32796a;
    private boolean b = true;
    private boolean c;
    private boolean d;
    private boolean e;
    private String f;
    private VideoInfo g;
    private Set<String> h;
    private a i;
    private ppb j;
    private TBLiveDataModel k;

    static {
        kge.a(51208979);
    }

    public ppf(ppb ppbVar) {
        this.j = ppbVar;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.f32796a = str;
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.d;
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.d = z;
        }
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.e;
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else {
            this.e = z;
        }
    }

    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.f;
    }

    public void a(TBLiveDataModel tBLiveDataModel, VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e336bcc", new Object[]{this, tBLiveDataModel, videoInfo});
            return;
        }
        this.k = tBLiveDataModel;
        this.g = videoInfo;
    }

    public boolean b(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("18b293c8", new Object[]{this, videoInfo})).booleanValue();
        }
        if (videoInfo == null) {
            videoInfo = f();
        }
        return videoInfo != null && (videoInfo.newRoomType & 256) == 256;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this});
        }
        TBLiveDataModel tBLiveDataModel = this.k;
        if (tBLiveDataModel != null && !TextUtils.isEmpty(tBLiveDataModel.mRawData)) {
            return this.k.mRawData;
        }
        if (f() != null && pmd.a().F() != null && (pmd.a().F().c() instanceof TBLiveDataModel)) {
            return ((TBLiveDataModel) pmd.a().F().c()).mRawData;
        }
        return null;
    }

    public VideoInfo f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VideoInfo) ipChange.ipc$dispatch("29aae2aa", new Object[]{this});
        }
        VideoInfo videoInfo = this.g;
        if (videoInfo != null) {
            return videoInfo;
        }
        if (pmd.a().F() != null && (pmd.a().F().c() instanceof TBLiveDataModel)) {
            return ((TBLiveDataModel) pmd.a().F().c()).mVideoInfo;
        }
        return null;
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
        }
        VideoInfo f = f();
        return (f != null && ("1".equals(f.roomStatus) || "2".equals(f.roomStatus))) && u.W();
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue();
        }
        a aVar = this.i;
        if (aVar == null || aVar.z() == null || this.i.z().aJ_() == null) {
            return false;
        }
        ibw aJ_ = this.i.z().aJ_();
        return (aJ_.b().b() == null && aJ_.b().c() == null && aJ_.b().d() == null && !i().contains(aJ_.a().N()) && !(u.ba() && ("1".equals(aJ_.b().F()) || v.e(aJ_.b().F())))) ? false : true;
    }

    public Set<String> i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("d6a805f", new Object[]{this});
        }
        if (this.h == null) {
            this.h = new HashSet();
            for (String str : pmd.a().d().a("tblive", "adLivesourceList", "ad_hudong11;ad_brandzone;ad_tanx;ad_tblive_task;ad_timemove;livesource=p4p-kgb").split(";")) {
                this.h.add(str);
            }
        }
        return this.h;
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1819755d", new Object[]{this, aVar});
        } else {
            this.i = aVar;
        }
    }
}
