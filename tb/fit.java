package tb;

import mtopsdk.common.util.StringUtils;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.b;
import com.taobao.android.detail2.core.framework.data.model.MainMediaInfo;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class fit {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public b f27982a;
    private fhi b;
    private fmd c;
    private final ViewGroup d;
    private fiy e;
    private boolean f = false;
    private a g;
    private com.taobao.android.detail2.core.framework.view.feeds.a h;
    private fiu i;
    private MainMediaInfo j;

    /* loaded from: classes5.dex */
    public interface a {
        void a();

        void a(SuccPhenixEvent succPhenixEvent, boolean z);

        void a(String str, JSONObject jSONObject);

        HashMap<String, String> b();
    }

    static {
        kge.a(452398007);
        kge.a(1109604449);
    }

    public fit(b bVar, ViewGroup viewGroup, fmd fmdVar, com.taobao.android.detail2.core.framework.view.feeds.a aVar) {
        this.f27982a = bVar;
        this.d = viewGroup;
        this.c = fmdVar;
        this.h = aVar;
        this.i = new fiu(this.c, this.f27982a);
    }

    public boolean a(fhi fhiVar, MainMediaInfo mainMediaInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fc3864d6", new Object[]{this, fhiVar, mainMediaInfo})).booleanValue();
        }
        if (!b(fhiVar, mainMediaInfo)) {
            j();
            return false;
        }
        a(mainMediaInfo);
        boolean c = c(fhiVar, mainMediaInfo);
        f();
        g();
        this.i.a(fhiVar);
        if (c) {
            this.e.a("videoIdInconsistent");
        }
        return true;
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        e();
        this.f = false;
    }

    public void b(fhi fhiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7108c12", new Object[]{this, fhiVar});
        } else if (this.e == null || fhiVar == null) {
        } else {
            try {
                HashMap<String, String> hashMap = new HashMap<>();
                this.c.y().a(fhiVar.g, hashMap, fhiVar);
                fjg.a(this.f27982a.f(), this.f27982a.h(), hashMap, fhiVar);
                this.e.a(hashMap);
            } catch (Exception e) {
                fjt.a("new_detail异常", "更新播放器参数失败", e);
            }
        }
    }

    private boolean b(fhi fhiVar, MainMediaInfo mainMediaInfo) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("dcb1bad7", new Object[]{this, fhiVar, mainMediaInfo})).booleanValue() : (fhiVar == null || mainMediaInfo == null || mainMediaInfo.data == null) ? false : true;
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        fiy fiyVar = this.e;
        if (fiyVar == null) {
            return;
        }
        fiyVar.c(false);
        this.e = null;
    }

    private void a(MainMediaInfo mainMediaInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c83d029", new Object[]{this, mainMediaInfo});
            return;
        }
        this.e = fiz.a(this.f27982a, this.c, this.d, this.e, mainMediaInfo.type, this.h);
        this.i.a(this.e);
    }

    private boolean c(fhi fhiVar, MainMediaInfo mainMediaInfo) {
        boolean dF_;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bd2b10d8", new Object[]{this, fhiVar, mainMediaInfo})).booleanValue();
        }
        fiy fiyVar = this.e;
        if (fiyVar == null) {
            return false;
        }
        fhi fhiVar2 = this.b;
        if (fhiVar2 != null && fhiVar != fhiVar2) {
            fiyVar.c(false);
            this.f = false;
        } else if (b(mainMediaInfo)) {
            fjt.a(fjt.TAG_RENDER, "videoid不一致，此时是否正在播放(包括已请求播放但还未准备好的情况)：" + this.e.dF_());
            dF_ = this.e.dF_();
            this.e.c(true);
            this.f = false;
            this.b = fhiVar;
            this.j = mainMediaInfo;
            this.e.a(fhiVar, mainMediaInfo);
            this.e.a(this.g);
            return dF_;
        }
        dF_ = false;
        this.b = fhiVar;
        this.j = mainMediaInfo;
        this.e.a(fhiVar, mainMediaInfo);
        this.e.a(this.g);
        return dF_;
    }

    private boolean b(MainMediaInfo mainMediaInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("438fb72e", new Object[]{this, mainMediaInfo})).booleanValue();
        }
        MainMediaInfo mainMediaInfo2 = this.j;
        if (mainMediaInfo2 == null || mainMediaInfo == null || mainMediaInfo2.data == null || mainMediaInfo.data == null || StringUtils.equals(this.j.data.videoId, mainMediaInfo.data.videoId) || !this.f27982a.h().b().d()) {
            return false;
        }
        fjp.a(fjp.SCENE_MEDIA_PLAYER, fjp.ERROR_CODE_PLAYER_MEDIA_INCONSISTENT, "videoid不一致，old ：" + this.j.data.videoId + ", new: " + mainMediaInfo.data.videoId, (Map<String, String>) null);
        return true;
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        fiy fiyVar = this.e;
        if (fiyVar == null) {
            return;
        }
        fiyVar.b();
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        fiy fiyVar = this.e;
        if (fiyVar == null || this.f) {
            return;
        }
        this.f = true;
        fiyVar.c();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            c("supplementAppear");
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            c(str);
        }
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        fjt.a(fjt.TAG_RENDER, "tryRequestAndStartVideo: " + str);
        if (this.e == null) {
            return;
        }
        g();
        this.e.a(str);
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        fiy fiyVar = this.e;
        if (fiyVar == null) {
            return;
        }
        fiyVar.e();
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        fiy fiyVar = this.e;
        if (fiyVar == null) {
            return;
        }
        fiyVar.b(str);
        if (!"scroll".equals(str) && !"MainPicScroll".equals(str)) {
            return;
        }
        this.e.c(true);
        this.f = false;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            c("willAppear");
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        fiy fiyVar = this.e;
        if (fiyVar == null) {
            return;
        }
        fiyVar.c("scroll");
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        fiy fiyVar = this.e;
        if (fiyVar == null) {
            return;
        }
        fiyVar.b("destroy");
        this.e.c(false);
        this.f = false;
        fjc.a(this.c, this.b);
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        fiy fiyVar = this.e;
        if (fiyVar == null) {
            return;
        }
        fiyVar.d();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
        if (r0.equals("pause") != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(com.alibaba.fastjson.JSONObject r7) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.fit.a(com.alibaba.fastjson.JSONObject):void");
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41c2e78a", new Object[]{this, aVar});
        } else {
            this.g = aVar;
        }
    }
}
