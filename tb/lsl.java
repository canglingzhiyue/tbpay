package tb;

import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.h;
import com.taobao.bootimage.InteractLocationData;
import com.taobao.bootimage.data.SplashInteractData;
import com.taobao.bootimage.interact.pop.d;
import com.taobao.bootimage.linked.LinkedSplashData;
import com.taobao.bootimage.linked.b;
import com.taobao.bootimage.linked.g;
import java.util.HashMap;

/* loaded from: classes7.dex */
public class lsl implements b, kqn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private LinkedSplashData f30895a;
    private SplashInteractData b;
    private JSONObject c;
    private boolean e;
    private long g;
    private final lsn j;
    private boolean d = false;
    private boolean h = false;
    private boolean i = false;
    private final int f = ldj.a("keepSearchTextKey", 10000);

    static {
        kge.a(2020614816);
        kge.a(924978914);
        kge.a(296896139);
    }

    @Override // com.taobao.bootimage.linked.b
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "searchText";
    }

    @Override // com.taobao.bootimage.linked.b
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        }
    }

    public lsl(lsr lsrVar) {
        this.j = new lsn(lsrVar);
    }

    @Override // com.taobao.bootimage.linked.b
    public void a(LinkedSplashData linkedSplashData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee262b0", new Object[]{this, linkedSplashData});
        } else {
            ldf.d(lsk.SPLASH_BUSINESS_TAG, "onReceiveData-> 收到闪屏解析完成数据的回调");
        }
    }

    @Override // com.taobao.bootimage.linked.b
    public boolean b(LinkedSplashData linkedSplashData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("526d8075", new Object[]{this, linkedSplashData})).booleanValue();
        }
        this.h = false;
        ldf.d(lsk.SPLASH_BUSINESS_TAG, "NaviBarCallbackImp#shouldHotStartShow->：");
        return a(linkedSplashData, m());
    }

    @Override // com.taobao.bootimage.linked.b
    public boolean a(b.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7b396a9b", new Object[]{this, aVar})).booleanValue();
        }
        boolean n = n();
        boolean j = j();
        if (b.a.FROM_CLOSE.equals(aVar.f16704a) || n || j) {
            ldf.d(lsk.SPLASH_BUSINESS_TAG, "NaviBarCallbackImp#shouldAnimate-> mSearchTextObject 用户点了闪屏跳过，或者当前有pop：" + n + " 或者有淘口令" + j + "不再执行缩放动画");
            return false;
        }
        JSONObject jSONObject = this.c;
        if (jSONObject != null && jSONObject.containsKey("ext")) {
            JSONObject jSONObject2 = this.c.getJSONObject("ext");
            if (jSONObject2 != null && jSONObject2.containsKey("sectionBizCode") && jSONObject2.containsKey("viewTag")) {
                InteractLocationData a2 = this.j.a(jSONObject2.getString("sectionBizCode"), jSONObject2.getString("viewTag"));
                if (a2 != null) {
                    aVar.b = a2.width;
                    aVar.c = a2.height;
                    aVar.d = a2.positionX;
                    aVar.e = a2.positionY;
                    aVar.f = this.j.a();
                    ldf.d(lsk.SPLASH_BUSINESS_TAG, "shouldAnimate-> 拿到目标view坐标信息，可以展示动画。");
                    return true;
                }
                ldf.d(lsk.SPLASH_BUSINESS_TAG, "NaviBarCallbackImp#shouldAnimate-> locationData为空，禁用动画。");
            }
            ldf.d(lsk.SPLASH_BUSINESS_TAG, "NaviBarCallbackImp#shouldAnimate-> mSearchTextObject.ext 缺少 bizCode 或者 viewTag 关键字段，禁用动画。");
        }
        ldf.d(lsk.SPLASH_BUSINESS_TAG, "NaviBarCallbackImp#shouldAnimate-> mSearchTextObject 对象为null 或者没有 ext 关键字段，禁用动画。");
        return false;
    }

    @Override // com.taobao.bootimage.linked.b
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            ldf.d(lsk.SPLASH_BUSINESS_TAG, "NaviBarCallbackImp#onAnimationStart-> 闪屏缩放动画开始----");
        }
    }

    @Override // com.taobao.bootimage.linked.b
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        boolean j = j();
        HashMap hashMap = new HashMap();
        hashMap.put("name", "AnimationEnd");
        hashMap.put("code", 1);
        hashMap.put("hasTaoPwd", Boolean.valueOf(j));
        lsj.a("NaviBarAnimation", this.b.traceId, hashMap);
        ldf.d(lsk.SPLASH_BUSINESS_TAG, "NaviBarCallbackImp#onAnimationEnd-> 闪屏缩放动画结束----, args：" + hashMap);
    }

    @Override // com.taobao.bootimage.linked.b
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        if (this.f30895a != null) {
            this.d = true;
            this.e = true;
            ldf.d(lsk.SPLASH_BUSINESS_TAG, "NaviBarCallbackImp#onTerminate-> 闪屏结束 mLinkedSplashData有效，需要更新底纹词");
        }
        ldf.d(lsk.SPLASH_BUSINESS_TAG, "NaviBarCallbackImp#onTerminate->-> 插入底纹");
        k();
    }

    @Override // com.taobao.bootimage.linked.b
    public boolean c(LinkedSplashData linkedSplashData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("95f89e36", new Object[]{this, linkedSplashData})).booleanValue();
        }
        this.h = true;
        ldf.d(lsk.SPLASH_BUSINESS_TAG, "NaviBarCallbackImp#shouldColdStartShow->：");
        return a(linkedSplashData, true);
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
        }
        boolean b = this.j.b();
        ldf.d(lsk.SPLASH_BUSINESS_TAG, "NaviBarCallbackImp#isAtHomeTab->：" + b);
        return b;
    }

    public boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6158678", new Object[]{this})).booleanValue();
        }
        boolean d = this.j.d();
        ldf.d(lsk.SPLASH_BUSINESS_TAG, "isAtRecommendFeeds " + d);
        return d;
    }

    private boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue();
        }
        boolean c = this.j.c();
        String[] strArr = new String[1];
        StringBuilder sb = new StringBuilder();
        sb.append("NaviBarCallbackImp#hasTaoPwd-> ");
        sb.append(c ? "有" : "没有");
        sb.append("淘口令");
        strArr[0] = sb.toString();
        ldf.d(lsk.SPLASH_BUSINESS_TAG, strArr);
        return c;
    }

    private boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[]{this})).booleanValue();
        }
        boolean e = this.j.e();
        String[] strArr = new String[1];
        StringBuilder sb = new StringBuilder();
        sb.append("NaviBarCallbackImp#hasPop-> ");
        sb.append(e ? "有" : "没有");
        sb.append("浮层");
        strArr[0] = sb.toString();
        ldf.d(lsk.SPLASH_BUSINESS_TAG, strArr);
        return e;
    }

    private boolean a(LinkedSplashData linkedSplashData, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cd6aa628", new Object[]{this, linkedSplashData, new Boolean(z)})).booleanValue();
        }
        this.f30895a = linkedSplashData;
        this.b = g.a(linkedSplashData);
        this.c = this.f30895a.getLinkedData("searchText");
        l();
        boolean j = j();
        boolean isEmpty = StringUtils.isEmpty(d.d());
        boolean z2 = z && !j && !isEmpty;
        HashMap hashMap = new HashMap();
        hashMap.put("name", "ShouldShow");
        hashMap.put("code", 1);
        hashMap.put("atHomeTab", Boolean.valueOf(z));
        hashMap.put("noPop", Boolean.valueOf(!isEmpty));
        hashMap.put("splashShouldShow", Boolean.valueOf(z2));
        hashMap.put("hasTaoPwd", Boolean.valueOf(j));
        lsj.a("NaviBarAnimation", "", hashMap);
        ldf.d(lsk.SPLASH_BUSINESS_TAG, "NaviBarCallbackImp#shouldShow-> 是否展示缩放动画：" + hashMap);
        return z2;
    }

    private void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        boolean isEmpty = StringUtils.isEmpty(d.d());
        boolean j = j();
        if (this.f30895a != null && !j && this.e && !isEmpty) {
            if (this.h) {
                this.g = SystemClock.elapsedRealtime();
                ldf.d(lsk.SPLASH_BUSINESS_TAG, "NaviBarCallbackImp-> 冷起插入底纹计时————————————" + this.g);
            }
            ldf.d(lsk.SPLASH_BUSINESS_TAG, "NaviBarCallbackImp-> 开始更新底纹词————————————");
            boolean a2 = this.j.a(this.c);
            HashMap hashMap = new HashMap();
            hashMap.put("name", "AnimationBegin");
            if (a2) {
                hashMap.put("code", 0);
                hashMap.put("error", "updateSliderData==false");
            } else {
                hashMap.put("code", 1);
            }
            lsj.a("NaviBarAnimation", this.b.traceId, hashMap);
            ldf.d(lsk.SPLASH_BUSINESS_TAG, "NaviBarCallbackImp-> 结束更新底纹词———————————— args:" + hashMap);
        } else {
            String[] strArr = new String[1];
            StringBuilder sb = new StringBuilder();
            sb.append("NaviBarCallbackImp-> mLinkedSplashData对象为空：");
            sb.append(this.f30895a == null);
            sb.append(" isNeedUpdateSearchText 是：");
            sb.append(this.e);
            sb.append(" 有淘口令：");
            sb.append(j);
            sb.append(" 有pop：");
            sb.append(isEmpty);
            sb.append("闪屏结束，不再塞底纹词");
            strArr[0] = sb.toString();
            ldf.d(lsk.SPLASH_BUSINESS_TAG, strArr);
        }
        this.e = false;
        this.i = true;
    }

    public JSONObject i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("dde1390", new Object[]{this});
        }
        ldf.d(lsk.SPLASH_BUSINESS_TAG, "NaviBarCallbackImp -> keepAdSearchInPeriodTime 获取topView底纹 coldStartInsert ,isColdStart " + this.h);
        if (!this.i) {
            return null;
        }
        boolean z = this.h && SystemClock.elapsedRealtime() - this.g <= ((long) this.f);
        ldf.d(lsk.SPLASH_BUSINESS_TAG, "NaviBarCallbackImp -> keepAdSearchInPeriodTime 是否需要保持底纹词 " + z);
        if (!z) {
            return null;
        }
        return this.j.b(this.c);
    }

    private void l() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        JSONObject jSONObject2 = this.c;
        if (jSONObject2 == null || (jSONObject = jSONObject2.getJSONObject("ext")) == null) {
            return;
        }
        a(jSONObject);
        b(jSONObject);
    }

    private void a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        JSONObject jSONObject3 = this.c.getJSONObject(h.TRACK_EXPOSURE_PARAM);
        if (jSONObject3 == null || (jSONObject2 = jSONObject3.getJSONObject("args")) == null) {
            return;
        }
        jSONObject2.put("ext", (Object) jSONObject);
    }

    private void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
            return;
        }
        JSONObject jSONObject2 = this.c.getJSONObject("item");
        if (jSONObject2 == null) {
            return;
        }
        a(jSONObject2.getJSONObject("0"), jSONObject);
        a(jSONObject2.getJSONObject("1"), jSONObject);
    }

    private void a(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f32d068", new Object[]{this, jSONObject, jSONObject2});
        } else if (jSONObject == null || (jSONObject3 = jSONObject.getJSONObject("clickParam")) == null) {
        } else {
            jSONObject3.put("ext", (Object) jSONObject2);
        }
    }

    @Override // tb.kqn
    public boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : this.d;
    }

    @Override // tb.kqn
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else {
            this.d = false;
        }
    }
}
