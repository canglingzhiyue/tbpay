package com.etao.feimagesearch.pipline.node;

import android.graphics.Bitmap;
import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.config.bean.ImageRule;
import com.etao.feimagesearch.model.PhotoFrom;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.com;
import tb.cor;
import tb.cos;
import tb.cov;
import tb.crj;
import tb.crl;
import tb.crq;
import tb.kge;

/* loaded from: classes3.dex */
public final class d extends crj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f6943a;

    static {
        kge.a(-1952782199);
    }

    public d() {
        this(false, 1, null);
    }

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.crj
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "ImageLoad";
    }

    public d(boolean z) {
        this.f6943a = z;
    }

    public /* synthetic */ d(boolean z, int i, o oVar) {
        this((i & 1) != 0 ? false : z);
    }

    @Override // tb.crj
    public crl b(crq pipLineDS) {
        Bitmap bitmap;
        cos cosVar;
        String str;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (crl) ipChange.ipc$dispatch("45632432", new Object[]{this, pipLineDS});
        }
        q.c(pipLineDS, "pipLineDS");
        if ((!(pipLineDS.r() == PhotoFrom.Values.OUTER_ALBUM_LOCAL || pipLineDS.r() == PhotoFrom.Values.ALBUM || pipLineDS.r() == PhotoFrom.Values.ALBUM_SYS) || !com.etao.feimagesearch.config.b.dV()) && pipLineDS.c() != null) {
            Bitmap c = pipLineDS.c();
            if (c == null) {
                q.a();
            }
            if (pipLineDS.d() == null) {
                pipLineDS.b(c);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(c.getWidth());
            sb.append('_');
            sb.append(c.getHeight());
            String sb2 = sb.toString();
            a("isRemote", "false");
            a("imgSize", sb2);
            com.etao.feimagesearch.newresult.perf.a.b(sb2);
            d();
            com.etao.feimagesearch.newresult.perf.a.a(Long.valueOf(SystemClock.elapsedRealtime() - b()));
            return a(c);
        } else if (pipLineDS.a() == null || StringUtils.isEmpty(String.valueOf(pipLineDS.a()))) {
            a(-2, "无图片资源");
            return a(-2, "无图片资源", this.f6943a);
        } else {
            String valueOf = String.valueOf(pipLineDS.a());
            if (pipLineDS.j()) {
                cosVar = cor.a(valueOf, 0, 640, 640, 1280, 1280);
                q.a((Object) cosVar, "ImageAdapter.getRemoteIm… 0, 640, 640, 1280, 1280)");
            } else {
                cos cosVar2 = new cos();
                ImageRule f = f();
                Bitmap bitmap2 = null;
                try {
                    if (pipLineDS.l()) {
                        bitmap = com.etao.feimagesearch.util.d.a(pipLineDS.m(), true);
                    } else {
                        bitmap = com.etao.feimagesearch.util.d.c(pipLineDS.a(), f.maxSize, 1, 10);
                    }
                } catch (Exception e) {
                    cosVar2.a(String.valueOf(-3));
                    cosVar2.b(e.getMessage());
                    bitmap = bitmap2;
                }
                if (bitmap == null) {
                    cosVar2.a(bitmap2);
                } else {
                    cosVar2.a(com.etao.feimagesearch.util.d.a(bitmap, pipLineDS.b()));
                }
                cosVar = cosVar2;
            }
            a("imgPath", valueOf);
            if (cosVar.a() == null) {
                int a2 = cov.a(cosVar.b(), -1);
                String str2 = "imgUrl:" + String.valueOf(pipLineDS.a()) + ",errMsg:" + cosVar.c();
                a(a2, str2);
                Integer valueOf2 = Integer.valueOf(a2);
                if (!pipLineDS.t()) {
                    z = this.f6943a;
                }
                return a(valueOf2, str2, z);
            }
            Bitmap a3 = cosVar.a();
            if (a3 != null) {
                pipLineDS.a(a3.copy(Bitmap.Config.ARGB_8888, a3.isMutable()));
                pipLineDS.b(a3.copy(Bitmap.Config.ARGB_8888, a3.isMutable()));
                StringBuilder sb3 = new StringBuilder();
                sb3.append(a3.getWidth());
                sb3.append('_');
                sb3.append(a3.getHeight());
                str = sb3.toString();
            } else {
                str = "";
            }
            a("imgSize", str);
            com.etao.feimagesearch.newresult.perf.a.b(str);
            d();
            com.etao.feimagesearch.newresult.perf.a.a(Long.valueOf(SystemClock.elapsedRealtime() - b()));
            return a(cosVar.a());
        }
    }

    private final ImageRule f() {
        ImageRule b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageRule) ipChange.ipc$dispatch("79d3daa2", new Object[]{this});
        }
        if (com.e()) {
            ImageRule b2 = com.etao.feimagesearch.config.b.b(ImageRule.NET_TYPE_WIFI);
            q.a((Object) b2, "ConfigModel.getImageRule(ImageRule.NET_TYPE_WIFI)");
            return b2;
        }
        int b3 = com.taobao.android.searchbaseframe.util.o.b();
        if (b3 == 1) {
            b = com.etao.feimagesearch.config.b.b(ImageRule.NET_TYPE_WIFI);
        } else if (b3 == 2) {
            b = com.etao.feimagesearch.config.b.b(ImageRule.NET_TYPE_2G);
        } else if (b3 == 3) {
            b = com.etao.feimagesearch.config.b.b(ImageRule.NET_TYPE_3G);
        } else if (b3 == 4) {
            b = com.etao.feimagesearch.config.b.b(ImageRule.NET_TYPE_4G);
        } else {
            b = com.etao.feimagesearch.config.b.b(ImageRule.NET_TYPE_OTHER);
        }
        q.a((Object) b, "when (SearchNetworkUtil.…e.NET_TYPE_OTHER)\n      }");
        return b;
    }
}
