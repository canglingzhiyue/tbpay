package com.taobao.android.detail.core.performance.preload;

import android.app.Activity;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.performance.l;
import tb.ecg;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static g f9799a;
    private String b = "";
    private String c = "";
    private String d = "";
    private String e = "";
    private boolean f = false;

    static {
        kge.a(-86382796);
        f9799a = new g();
    }

    private g() {
        emu.a("com.taobao.android.detail.core.performance.preload.PreloadDetailDataMarker");
    }

    public static g a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("351f1de0", new Object[0]) : f9799a;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        if (StringUtils.isEmpty(str)) {
            str = "";
        }
        this.c = str;
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        if (StringUtils.isEmpty(str)) {
            str = "";
        }
        this.b = str;
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        if (StringUtils.isEmpty(str)) {
            str = "";
        }
        this.d = str;
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
            return;
        }
        if (StringUtils.isEmpty(str)) {
            str = "";
        }
        this.e = str;
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.b = "";
        this.c = "";
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        this.d = "";
        this.e = "";
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        this.f = c.b(this.b, this.c);
        String a2 = l.a("PreloadDetailDataMarker");
        com.taobao.android.detail.core.utils.i.c(a2, "isFinalDownGradeToUltron:" + this.f);
        return this.f;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.f = false;
        }
    }

    public void a(String str, String str2, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50b67fce", new Object[]{this, str, str2, activity});
            return;
        }
        String a2 = l.a("PreloadDetailDataMarker");
        com.taobao.android.detail.core.utils.i.c(a2, " 预加载协议：" + this.b + "主接口协议:" + this.c);
        if (StringUtils.isEmpty(this.b) || StringUtils.isEmpty(this.c)) {
            com.taobao.android.detail.core.utils.i.c(l.a("PreloadDetailDataMarker"), "不上报协议不一致");
        } else if (this.b.equals(this.c)) {
            com.taobao.android.detail.core.utils.i.c(l.a("PreloadDetailDataMarker"), "不上报协议不一致");
            d();
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("itemId=");
            sb.append(str);
            sb.append(",preloadType=");
            sb.append(this.b);
            sb.append(",detailType=");
            sb.append(this.c);
            sb.append(",sellerType=");
            sb.append(str2);
            if (c.a(this.b, this.c)) {
                ecg.c(activity, str, sb.toString());
                com.taobao.android.detail.core.utils.i.c(l.a("PreloadDetailDataMarker"), "协议升级");
            } else {
                ecg.b(activity, str, sb.toString());
                com.taobao.android.detail.core.utils.i.c(l.a("PreloadDetailDataMarker"), "协议降级");
            }
            com.taobao.android.detail.core.utils.i.c(l.a("PreloadDetailDataMarker"), "上报协议不一致");
            d();
        }
    }

    public void b(String str, String str2, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4446040f", new Object[]{this, str, str2, activity});
            return;
        }
        String a2 = l.a("PreloadDetailDataMarker");
        com.taobao.android.detail.core.utils.i.c(a2, " 预加载头图url：" + this.d + "主接口头图url:" + this.e);
        if (StringUtils.isEmpty(this.d) || StringUtils.isEmpty(this.e) || this.d.equals(this.e)) {
            com.taobao.android.detail.core.utils.i.c(l.a("PreloadDetailDataMarker"), "不上报预加载和主接口头图不一致");
            return;
        }
        ecg.d(activity, str, "itemId=" + str + ",preloadMainPicUrl=" + this.d + ",detailMainPicUrl=" + this.e + ",sellerType=" + str2);
        com.taobao.android.detail.core.utils.i.c(l.a("PreloadDetailDataMarker"), "上报预加载和主接口头图不一致");
        e();
    }
}
