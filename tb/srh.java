package tb;

import mtopsdk.common.util.StringUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.arch.flow.view.c;
import com.taobao.bootimage.data.BootImageInfo;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public class srh implements sre {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private srq f33857a;
    private BootImageInfo b;
    private final srg c = new srg("Market");

    static {
        kge.a(1774958376);
        kge.a(1532998567);
    }

    @Override // tb.sre
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "Market";
    }

    @Override // tb.sre
    public void a(srq srqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff4d13a6", new Object[]{this, srqVar});
            return;
        }
        kej.a("2ARCH_MarketBootImage", "instantiate: ");
        this.c.a();
        this.f33857a = srqVar;
    }

    @Override // tb.srv
    public void a(List<JSONObject> list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19a074ca", new Object[]{this, list, new Integer(i)});
            return;
        }
        kej.a("2ARCH_MarketBootImage", "Market:onDownload: ");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (JSONObject jSONObject : list) {
            JSONObject a2 = ssf.a(jSONObject);
            if (a2 != null) {
                try {
                    BootImageInfo bootImageInfo = (BootImageInfo) JSON.parseObject(a2.toJSONString(), BootImageInfo.class);
                    if (bootImageInfo != null) {
                        if (!StringUtils.isEmpty(bootImageInfo.imgUrl)) {
                            arrayList.add(new sru(bootImageInfo.imgUrl, 1, bootImageInfo.enable4G));
                        }
                        if (!StringUtils.isEmpty(bootImageInfo.videoUrl)) {
                            arrayList.add(new sru(bootImageInfo.videoUrl, 0, bootImageInfo.enable4G));
                        }
                        arrayList2.add(bootImageInfo);
                    }
                } catch (Exception e) {
                    kej.a("2ARCH_MarketBootImage", "Market:onDownload parse Error: ", e);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        this.c.a(arrayList2);
        this.f33857a.a(arrayList, "Market");
    }

    @Override // tb.srv
    public void b(List<JSONObject> list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0262f69", new Object[]{this, list, new Integer(i)});
            return;
        }
        kej.a("2ARCH_MarketBootImage", "onStart ---->  " + i);
        int i2 = 2002;
        Iterator<JSONObject> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            JSONObject next = it.next();
            JSONObject a2 = ssf.a(next);
            if (a2 != null) {
                try {
                    BootImageInfo bootImageInfo = (BootImageInfo) JSON.parseObject(a2.toJSONString(), BootImageInfo.class);
                    if (bootImageInfo != null && a(bootImageInfo, i)) {
                        this.b = bootImageInfo;
                        this.b.exposureParam = ssf.c(next);
                        BootImageInfo bootImageInfo2 = this.b;
                        bootImageInfo2.sceneType = "Market";
                        i2 = 2001;
                        b(bootImageInfo2);
                        break;
                    }
                } catch (Exception e) {
                    kej.a("2ARCH_MarketBootImage", "Market:onStart parse Error: ", e);
                }
            }
        }
        this.f33857a.a(this.b, i, i2);
    }

    @Override // tb.srv
    public void a(BootImageInfo bootImageInfo, c cVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac3bf80a", new Object[]{this, bootImageInfo, cVar, new Integer(i)});
            return;
        }
        kej.a("2ARCH_MarketBootImage", "onCreateView: ");
        if (BootImageInfo.BIZ_TYPE_COLD_START_AD.equals(bootImageInfo.bizType)) {
            cVar.b().setBackgroundResource(R.drawable.splash);
            ImageView a2 = cVar.a();
            a2.setScaleType(ImageView.ScaleType.FIT_START);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) a2.getLayoutParams();
            marginLayoutParams.topMargin = 120;
            a2.setLayoutParams(marginLayoutParams);
        }
        this.f33857a.a(2001);
    }

    @Override // tb.srv
    public void a(c cVar, int i) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("603694e4", new Object[]{this, cVar, new Integer(i)});
            return;
        }
        kej.a("2ARCH_MarketBootImage", "onViewShown: ");
        BootImageInfo bootImageInfo = this.b;
        if (bootImageInfo == null) {
            kej.a("2ARCH_MarketBootImage", "onViewShown mBootImageInfo null: ");
            this.f33857a.b(2002);
            return;
        }
        this.c.b(bootImageInfo);
        JSONObject jSONObject = this.b.exposureParam;
        if (i != 1000) {
            z = false;
        }
        ket.a(jSONObject, z);
        ket.a(this.b.exposureParam);
        this.f33857a.b(2001);
    }

    @Override // tb.srv
    public void onTerminate(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24cfaf3a", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        kej.a("2ARCH_MarketBootImage", "onTerminate: ");
        this.f33857a.c(2001);
    }

    private boolean a(BootImageInfo bootImageInfo, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3a8db739", new Object[]{this, bootImageInfo, new Integer(i)})).booleanValue() : b(bootImageInfo, i) && c(bootImageInfo, i) && a(bootImageInfo) && this.c.a(bootImageInfo);
    }

    private boolean a(BootImageInfo bootImageInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("75806d92", new Object[]{this, bootImageInfo})).booleanValue();
        }
        long b = keo.b();
        return b >= bootImageInfo.gmtStartMs && b <= bootImageInfo.gmtEndMs && !StringUtils.isEmpty(bootImageInfo.itemId);
    }

    private boolean b(BootImageInfo bootImageInfo, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b007dd7a", new Object[]{this, bootImageInfo, new Integer(i)})).booleanValue() : (bootImageInfo.coldStart && i == 1000) || (bootImageInfo.hotStart && i == 1001);
    }

    private boolean c(BootImageInfo bootImageInfo, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("258203bb", new Object[]{this, bootImageInfo, new Integer(i)})).booleanValue();
        }
        if (StringUtils.equals("image", bootImageInfo.bizType)) {
            return true;
        }
        if (i == 1000) {
            return BootImageInfo.BIZ_TYPE_COLD_START_AD.equals(bootImageInfo.bizType);
        }
        return BootImageInfo.BIZ_TYPE_VIDEO.equals(bootImageInfo.bizType) || BootImageInfo.BIZ_TYPE_VIDEO_ICON.equals(bootImageInfo.bizType);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006a, code lost:
        if (r1.equals(com.taobao.bootimage.data.BootImageInfo.BIZ_TYPE_COLD_START_AD) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void b(com.taobao.bootimage.data.BootImageInfo r9) {
        /*
            r8 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.srh.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L15
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r4] = r8
            r1[r3] = r9
            java.lang.String r9 = "2ef7fb2d"
            r0.ipc$dispatch(r9, r1)
            return
        L15:
            com.taobao.bootimage.arch.flow.view.SkipStyle r0 = new com.taobao.bootimage.arch.flow.view.SkipStyle
            r0.<init>()
            int r1 = com.taobao.taobao.R.string.taobao_app_1000_1_17005
            java.lang.String r1 = com.alibaba.ability.localization.b.a(r1)
            r0.skipText = r1
            java.lang.String r1 = "#ffffff"
            int r1 = android.graphics.Color.parseColor(r1)
            r0.skipTextColor = r1
            java.lang.String r1 = "#ff4400"
            int r1 = android.graphics.Color.parseColor(r1)
            r0.countTimeTextColor = r1
            r0.skipTextIsBold = r4
            r0.countTimeTextIsBold = r4
            r0.isHide = r4
            java.lang.String r1 = r9.bizType
            r5 = -1
            int r6 = r1.hashCode()
            r7 = 3
            switch(r6) {
                case -1824432991: goto L64;
                case -35894372: goto L59;
                case 100313435: goto L4f;
                case 893939253: goto L44;
                default: goto L43;
            }
        L43:
            goto L6d
        L44:
            java.lang.String r4 = "videoNoIcon"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L6d
            r4 = 2
            goto L6e
        L4f:
            java.lang.String r4 = "image"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L6d
            r4 = 1
            goto L6e
        L59:
            java.lang.String r4 = "videoHaveIcon"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L6d
            r4 = 3
            goto L6e
        L64:
            java.lang.String r6 = "coldStartAd"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L6d
            goto L6e
        L6d:
            r4 = -1
        L6e:
            if (r4 == 0) goto L89
            if (r4 == r3) goto L82
            if (r4 == r2) goto L77
            if (r4 == r7) goto L77
            goto L8b
        L77:
            int r1 = com.taobao.taobao.R.drawable.bootimage_close_bg
            r0.background = r1
            r1 = 13
            r0.skipTextSize = r1
            r0.countTimeTextSize = r1
            goto L8b
        L82:
            r1 = 15
            r0.skipTextSize = r1
            r0.countTimeTextSize = r1
            goto L8b
        L89:
            r0.isHide = r3
        L8b:
            r9.skipStyle = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.srh.b(com.taobao.bootimage.data.BootImageInfo):void");
    }
}
