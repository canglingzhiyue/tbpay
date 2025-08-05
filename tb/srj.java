package tb;

import android.animation.Animator;
import android.graphics.Color;
import android.view.View;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.arch.flow.view.SkipStyle;
import com.taobao.bootimage.arch.flow.view.c;
import com.taobao.bootimage.data.BootImageInfo;
import com.taobao.bootimage.linked.b;
import com.taobao.bootimage.linked.ext.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public class srj implements sre {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private srq f33859a;
    private View b;
    private BootImageInfo c;
    private final srg d = new srg("TopView");
    private final Animator.AnimatorListener e = new Animator.AnimatorListener() { // from class: tb.srj.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4388ea84", new Object[]{this, animator});
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
                return;
            }
            kej.a("2ARCH_TopViewBootImage", "AnimatorListener:onAnimationStart");
            srj.a(srj.this).a();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            kej.a("2ARCH_TopViewBootImage", "AnimatorListener:onAnimationEnd");
            srj.a(srj.this).b();
            srj.a(srj.this).c(2001);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
            } else {
                kej.a("2ARCH_TopViewBootImage", "AnimatorListener:onAnimationCancel");
            }
        }
    };

    static {
        kge.a(1621812242);
        kge.a(1532998567);
    }

    @Override // tb.sre
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "TopView";
    }

    public static /* synthetic */ srq a(srj srjVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (srq) ipChange.ipc$dispatch("33b81927", new Object[]{srjVar}) : srjVar.f33859a;
    }

    @Override // tb.sre
    public void a(srq srqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff4d13a6", new Object[]{this, srqVar});
            return;
        }
        kej.a("2ARCH_TopViewBootImage", "instantiate: ");
        this.d.a();
        this.f33859a = srqVar;
    }

    @Override // tb.srv
    public void a(List<JSONObject> list, int i) {
        BootImageInfo bootImageInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19a074ca", new Object[]{this, list, new Integer(i)});
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (JSONObject jSONObject : list) {
            JSONObject b = ssf.b(jSONObject);
            if (b != null && (bootImageInfo = (BootImageInfo) JSON.parseObject(b.toJSONString(), BootImageInfo.class)) != null) {
                arrayList2.add(bootImageInfo);
                arrayList.add(new sru(bootImageInfo.imgUrl, 1, bootImageInfo.enable4G));
                arrayList.add(new sru(bootImageInfo.videoUrl, 0, bootImageInfo.enable4G));
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        this.d.a(arrayList2);
        this.f33859a.a(arrayList, "TopView");
    }

    @Override // tb.srv
    public void b(List<JSONObject> list, int i) {
        BootImageInfo bootImageInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0262f69", new Object[]{this, list, new Integer(i)});
            return;
        }
        kej.a("2ARCH_TopViewBootImage", "onStart ---->  " + i);
        int i2 = 2002;
        Iterator<JSONObject> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            JSONObject next = it.next();
            JSONObject b = ssf.b(next);
            if (b == null) {
                kej.a("2ARCH_TopViewBootImage", "onStart content null: ");
            } else {
                try {
                    bootImageInfo = (BootImageInfo) JSON.parseObject(b.toJSONString(), BootImageInfo.class);
                } catch (Exception e) {
                    kej.a("2ARCH_TopViewBootImage", "onStart parse bootImageInfo error  ", e);
                    bootImageInfo = null;
                }
                if (bootImageInfo == null) {
                    continue;
                } else if (!a(i, bootImageInfo)) {
                    kej.a("2ARCH_TopViewBootImage", "onStart startTypeAvailable false: ");
                } else if (!this.d.a(bootImageInfo)) {
                    kej.a("2ARCH_TopViewBootImage", "onStart itemAvailable false: ");
                } else if (a(bootImageInfo)) {
                    kej.a("2ARCH_TopViewBootImage", "onStart itemAvailable true: ");
                    boolean a2 = this.f33859a.a(next, i);
                    kej.a("2ARCH_TopViewBootImage", "onStart:shouldShow " + a2);
                    if (a2) {
                        this.c = bootImageInfo;
                        BootImageInfo bootImageInfo2 = this.c;
                        bootImageInfo2.sceneType = "TopView";
                        i2 = 2001;
                        b(bootImageInfo2);
                        break;
                    }
                } else {
                    continue;
                }
            }
        }
        this.f33859a.a(this.c, i, i2);
    }

    @Override // tb.srv
    public void a(BootImageInfo bootImageInfo, c cVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac3bf80a", new Object[]{this, bootImageInfo, cVar, new Integer(i)});
            return;
        }
        kej.a("2ARCH_TopViewBootImage", "onCreateView: ");
        this.b = cVar.b();
        this.f33859a.a(2001);
    }

    @Override // tb.srv
    public void a(c cVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("603694e4", new Object[]{this, cVar, new Integer(i)});
            return;
        }
        kej.a("2ARCH_TopViewBootImage", "onViewShown: ");
        BootImageInfo bootImageInfo = this.c;
        if (bootImageInfo == null) {
            this.f33859a.b(2002);
            return;
        }
        this.d.b(bootImageInfo);
        ket.a(this.c.exposureParam);
        b.a(this.c.exposureParam, false);
        this.f33859a.b(2001);
    }

    @Override // tb.srv
    public void onTerminate(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24cfaf3a", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        kej.a("2ARCH_TopViewBootImage", "onTerminate: " + i2);
        if (i2 != 200 && i2 != 201) {
            this.f33859a.c(2001);
        } else {
            a(this.b);
        }
    }

    private boolean a(int i, BootImageInfo bootImageInfo) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("86acbbbf", new Object[]{this, new Integer(i), bootImageInfo})).booleanValue() : i == 1000 ? bootImageInfo.coldStart : bootImageInfo.hotStart;
    }

    private boolean a(BootImageInfo bootImageInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("75806d92", new Object[]{this, bootImageInfo})).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        return currentTimeMillis >= bootImageInfo.gmtStartMs && currentTimeMillis <= bootImageInfo.gmtEndMs;
    }

    private void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            return;
        }
        b.a aVar = new b.a();
        boolean a2 = this.f33859a.a(aVar);
        kej.a("2ARCH_TopViewBootImage", "startAnimation shouldAnimate " + a2);
        if (!a2 || this.c == null) {
            this.f33859a.c(2001);
        }
        new sri().a(view, aVar, this.c, this.e);
    }

    private void b(BootImageInfo bootImageInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ef7fb2d", new Object[]{this, bootImageInfo});
            return;
        }
        SkipStyle skipStyle = new SkipStyle();
        skipStyle.skipTextColor = Color.parseColor("#ffffff");
        skipStyle.countTimeTextColor = Color.parseColor("#ff4400");
        skipStyle.isHide = false;
        skipStyle.skipTextSize = 15;
        skipStyle.countTimeTextSize = 15;
        skipStyle.skipTextIsBold = false;
        skipStyle.countTimeTextIsBold = false;
        bootImageInfo.skipStyle = skipStyle;
    }
}
