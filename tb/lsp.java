package tb;

import android.content.Context;
import android.os.Build;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.InteractLocationData;
import com.taobao.bootimage.data.SplashInteractData;
import com.taobao.bootimage.g;
import com.taobao.homepage.page.weexv2.a;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.tao.Globals;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes7.dex */
public class lsp implements g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private nvm f30899a;
    private lso b;
    private final Context c = Globals.getApplication();

    static {
        kge.a(1799797573);
        kge.a(-2126785162);
    }

    public lsp(ljs ljsVar, lso lsoVar) {
        this.f30899a = new nvm(ljsVar);
        this.b = lsoVar;
    }

    private static InteractLocationData a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InteractLocationData) ipChange.ipc$dispatch("d338a74d", new Object[]{view});
        }
        InteractLocationData interactLocationData = new InteractLocationData();
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        interactLocationData.width = view.getWidth();
        interactLocationData.height = view.getHeight();
        interactLocationData.positionX = iArr[0];
        interactLocationData.positionY = iArr[1];
        return interactLocationData;
    }

    @Override // com.taobao.bootimage.g
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        ldf.d(lsk.SPLASH_BUSINESS_TAG, "start - ShouldShow()");
        boolean z = Build.VERSION.SDK_INT >= 19;
        boolean e = e();
        boolean f = f();
        boolean g = g();
        boolean a2 = a(this.b.a());
        boolean c = this.b.c();
        boolean z2 = !a.d();
        ldf.a(lsk.SPLASH_BUSINESS_TAG, ", apiGreaterThan19=" + z + ", atHomeTab=" + e + ", canSliderBottomVisiblePartially=" + f + ", canSliderVisibleCompletely=" + g + ", dataNotExpired=" + c + ", isNotOnSecondFloor=" + z2);
        boolean z3 = z && e && (f || g || a2) && c && z2;
        ldf.d(lsk.SPLASH_BUSINESS_TAG, "end - ShouldShow() ---  = " + z3);
        HashMap hashMap = new HashMap();
        hashMap.put("name", "ShouldShow");
        hashMap.put("code", 1);
        hashMap.put("apiGreaterThan19", Boolean.valueOf(z));
        hashMap.put("atHomeTab", Boolean.valueOf(e));
        hashMap.put("canSliderBottomVisiblePartially", Boolean.valueOf(f));
        hashMap.put("canSliderVisibleCompletely", Boolean.valueOf(g));
        hashMap.put("dataNotExpired", Boolean.valueOf(c));
        hashMap.put("splashShouldShow", Boolean.valueOf(z3));
        lsj.a("TopViewAnimation", "", hashMap);
        return z3;
    }

    @Override // com.taobao.bootimage.g
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        ldf.d(lsk.SPLASH_BUSINESS_TAG, "start - Show()");
        if (f()) {
            List<SectionModel> b = this.b.b();
            int h = h();
            int a2 = a(b);
            if (a2 == -1) {
                ldf.d(lsk.SPLASH_BUSINESS_TAG, "splashStartShow->   sliderDataPosition == RecyclerView.NO_POSITION");
                return;
            }
            this.f30899a.a(a2, h);
        }
        ldf.d(lsk.SPLASH_BUSINESS_TAG, "end - Show() --- ");
    }

    @Override // com.taobao.bootimage.g
    public void a(SplashInteractData splashInteractData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a50bc84", new Object[]{this, splashInteractData});
            return;
        }
        ldf.d(lsk.SPLASH_BUSINESS_TAG, "start - splashAnimationBegin()");
        int a2 = a(this.b.b());
        if (!this.b.a(splashInteractData, a2)) {
            ldf.d(lsk.SPLASH_BUSINESS_TAG, "splashAnimationBegin()->    updateSuccess==false,  updateSliderData() failed");
            HashMap hashMap = new HashMap();
            hashMap.put("name", "AnimationBegin");
            hashMap.put("code", 0);
            hashMap.put("error", "updateSliderData==false");
            lsj.a("TopViewAnimation", splashInteractData.traceId, hashMap);
            return;
        }
        this.f30899a.a(this.b.b().get(a2));
        this.f30899a.d();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("name", "AnimationBegin");
        hashMap2.put("code", 1);
        lsj.a("TopViewAnimation", splashInteractData.traceId, hashMap2);
    }

    @Override // com.taobao.bootimage.g
    public void b(SplashInteractData splashInteractData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bddbda45", new Object[]{this, splashInteractData});
            return;
        }
        ldf.d(lsk.SPLASH_BUSINESS_TAG, "start - splashAnimationEnd()");
        this.f30899a.c();
        HashMap hashMap = new HashMap();
        hashMap.put("name", "AnimationEnd");
        hashMap.put("code", 1);
        lsj.a("TopViewAnimation", splashInteractData.traceId, hashMap);
    }

    @Override // com.taobao.bootimage.g
    public InteractLocationData c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InteractLocationData) ipChange.ipc$dispatch("43d95f4d", new Object[]{this});
        }
        ldf.d(lsk.SPLASH_BUSINESS_TAG, "start - getInteractionPosition()");
        View a2 = this.f30899a.a();
        if (a2 == null || a2.getContext() == null) {
            ldf.d(lsk.SPLASH_BUSINESS_TAG, "sliderView == null || sliderView.getContext() == null");
            return null;
        }
        InteractLocationData a3 = a(a2);
        ldf.d(lsk.SPLASH_BUSINESS_TAG, "end - getInteractionPosition() --- , locationData.width = " + a3.width + ", locationData.height = " + a3.height + ", locationData.x = " + a3.positionX + ", locationData.y = " + a3.positionY);
        if (a3.positionX > 0) {
            a3.positionX -= gbg.b(this.c, 4.0f);
        }
        return a3;
    }

    @Override // com.taobao.bootimage.g
    public float d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2db", new Object[]{this})).floatValue() : gbg.b(this.c, 6.0f);
    }

    private boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : this.f30899a.f();
    }

    private boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
        }
        View b = this.f30899a.b();
        if (b == null) {
            ldf.d(lsk.SPLASH_BUSINESS_TAG, "itemView == null");
            return false;
        }
        int h = h();
        int top = b.getTop();
        int bottom = b.getBottom();
        ldf.d(lsk.SPLASH_BUSINESS_TAG, "canSliderBottomVisiblePartially->  itemViewTop=" + top + ", itemViewBottom=" + bottom + ", topStickyViewHeight=" + h);
        return top <= h && bottom > h;
    }

    private boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
        }
        double a2 = this.f30899a.a(a(this.b.b()));
        View b = this.f30899a.b();
        if (b != null) {
            return (b.getTop() >= h()) && ((a2 > 1.0d ? 1 : (a2 == 1.0d ? 0 : -1)) >= 0);
        }
        ldf.d(lsk.SPLASH_BUSINESS_TAG, "itemView == null");
        return false;
    }

    private boolean a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821885c", new Object[]{this, new Float(f)})).booleanValue();
        }
        View b = this.f30899a.b();
        if (b == null) {
            ldf.d(lsk.SPLASH_BUSINESS_TAG, "itemView == null");
            return false;
        } else if (b.getHeight() > 0) {
            return (b.getTop() > h()) && ((this.f30899a.a(a(this.b.b())) > ((double) f) ? 1 : (this.f30899a.a(a(this.b.b())) == ((double) f) ? 0 : -1)) >= 0);
        } else {
            ldf.d(lsk.SPLASH_BUSINESS_TAG, "itemView height <= 0");
            return false;
        }
    }

    private int a(List<SectionModel> list) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c705294c", new Object[]{this, list})).intValue() : bxs.a(list);
    }

    private int h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5cf10e2", new Object[]{this})).intValue() : this.f30899a.e();
    }
}
