package com.taobao.android.layoutmanager.adapter.impl;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import mtopsdk.common.util.StringUtils;
import android.util.Pair;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.framework.adapter.image.ImageAdapter;
import com.taobao.phenix.intf.PhenixCreator;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.phenix.loader.network.HttpCodeResponseException;
import com.taobao.phenix.request.ImageStatistics;
import com.taobao.tao.Globals;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.tao.util.ImageStrategyDecider;
import com.taobao.tao.util.TaobaoImageUrlStrategy;
import com.taobao.weex.common.WXPerformance;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;
import tb.esr;
import tb.ieu;
import tb.jyx;
import tb.kge;
import tb.nia;
import tb.oeb;
import tb.ogg;
import tb.ogh;

/* loaded from: classes5.dex */
public class k extends ImageLoader {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static boolean d;
    private com.taobao.phenix.intf.c e;
    private ImageLoader.b f;
    private ImageLoader.c g;

    public static /* synthetic */ Object ipc$super(k kVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ int a(k kVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("71b597d8", new Object[]{kVar, new Integer(i)})).intValue();
        }
        kVar.f19968a = i;
        return i;
    }

    public static /* synthetic */ com.taobao.phenix.intf.c a(k kVar, ImageLoader.b bVar, boolean z, ImageLoader.c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.phenix.intf.c) ipChange.ipc$dispatch("832faf9f", new Object[]{kVar, bVar, new Boolean(z), cVar}) : kVar.b(bVar, z, cVar);
    }

    public static /* synthetic */ void a(k kVar, ImageLoader.b bVar, float f, boolean z, long j, int i, int i2, int i3, SuccPhenixEvent succPhenixEvent, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("175c72f6", new Object[]{kVar, bVar, new Float(f), new Boolean(z), new Long(j), new Integer(i), new Integer(i2), new Integer(i3), succPhenixEvent, new Boolean(z2)});
        } else {
            kVar.a(bVar, f, z, j, i, i2, i3, succPhenixEvent, z2);
        }
    }

    public static /* synthetic */ void a(k kVar, ImageLoader.b bVar, boolean z, long j, int i, int i2, int i3, FailPhenixEvent failPhenixEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb2fc14", new Object[]{kVar, bVar, new Boolean(z), new Long(j), new Integer(i), new Integer(i2), new Integer(i3), failPhenixEvent});
        } else {
            kVar.a(bVar, z, j, i, i2, i3, failPhenixEvent);
        }
    }

    public static /* synthetic */ int b(k kVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9b09ed19", new Object[]{kVar, new Integer(i)})).intValue();
        }
        kVar.f19968a = i;
        return i;
    }

    public static /* synthetic */ int c(k kVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c45e425a", new Object[]{kVar, new Integer(i)})).intValue();
        }
        kVar.f19968a = i;
        return i;
    }

    public static /* synthetic */ int d(k kVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("edb2979b", new Object[]{kVar, new Integer(i)})).intValue();
        }
        kVar.f19968a = i;
        return i;
    }

    /* loaded from: classes5.dex */
    public class b extends ImageLoader.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private Runnable e;
        private com.taobao.phenix.intf.c f;

        static {
            kge.a(-883918069);
        }

        public static /* synthetic */ com.taobao.phenix.intf.c a(b bVar, com.taobao.phenix.intf.c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (com.taobao.phenix.intf.c) ipChange.ipc$dispatch("c61fb676", new Object[]{bVar, cVar});
            }
            bVar.f = cVar;
            return cVar;
        }

        public static /* synthetic */ Runnable a(b bVar, Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Runnable) ipChange.ipc$dispatch("ff537e76", new Object[]{bVar, runnable});
            }
            bVar.e = runnable;
            return runnable;
        }

        public b(ImageLoader imageLoader) {
            super(imageLoader);
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader.e
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else if (this.b == 2) {
            } else {
                com.taobao.phenix.intf.c cVar = this.f;
                if (cVar != null) {
                    cVar.b();
                } else if (this.e != null && (AsyncTask.THREAD_POOL_EXECUTOR instanceof ThreadPoolExecutor)) {
                    ((ThreadPoolExecutor) AsyncTask.THREAD_POOL_EXECUTOR).remove(this.e);
                }
                this.b = 2;
            }
        }
    }

    static {
        kge.a(738194094);
        d = false;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader
    public String a(String str, int i, int i2, ImageLoader.a aVar) {
        ImageStrategyConfig.a a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("84810dd0", new Object[]{this, str, new Integer(i), new Integer(i2), aVar});
        }
        if (aVar != null) {
            a2 = ImageStrategyConfig.a(aVar.e, aVar.f);
            if ((aVar.f19969a & 512) != 0) {
                return ImageStrategyDecider.decideUrl(str, -1, -1, a2.a());
            }
            a(aVar.f19969a, a2);
            a(aVar.b, a2);
        } else {
            a2 = ImageStrategyConfig.a("guangguang", 87);
        }
        return ImageStrategyDecider.decideUrl(str, Integer.valueOf(i), Integer.valueOf(i2), a2.a());
    }

    private void a(String str, ImageStrategyConfig.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56bb4e88", new Object[]{this, str, aVar});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            char c2 = 65535;
            switch (str.hashCode()) {
                case 110222:
                    if (str.equals("q30")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case 110284:
                    if (str.equals("q50")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 110315:
                    if (str.equals("q60")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 110351:
                    if (str.equals("q75")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 110408:
                    if (str.equals(ImageAdapter.IMAGE_QUALITY_Q90)) {
                        c2 = 0;
                        break;
                    }
                    break;
            }
            if (c2 == 0) {
                aVar.a(TaobaoImageUrlStrategy.ImageQuality.q90);
            } else if (c2 == 1) {
                aVar.a(TaobaoImageUrlStrategy.ImageQuality.q75);
            } else if (c2 == 2) {
                aVar.a(TaobaoImageUrlStrategy.ImageQuality.q60);
            } else if (c2 == 3) {
                aVar.a(TaobaoImageUrlStrategy.ImageQuality.q50);
            } else if (c2 != 4) {
            } else {
                aVar.a(TaobaoImageUrlStrategy.ImageQuality.q30);
            }
        }
    }

    private void a(int i, ImageStrategyConfig.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8097dc71", new Object[]{this, new Integer(i), aVar});
        } else if (i <= 0) {
        } else {
            if ((i & 2) != 0) {
                aVar.b(true);
            }
            if ((i & 4) != 0) {
                aVar.d(true);
                aVar.c(true);
            }
            if ((i & 8) != 0) {
                aVar.e(true);
            }
            if ((i & 16) != 0) {
                aVar.e(false);
            }
            if ((i & 32) != 0) {
                aVar.f(true);
            }
            if ((i & 64) != 0) {
                aVar.f(false);
            }
            if ((i & 128) != 0) {
                aVar.g(true);
            }
            if ((i & 256) == 0) {
                return;
            }
            aVar.g(false);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader
    public ImageLoader a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageLoader) ipChange.ipc$dispatch("99bb0297", new Object[]{this}) : new k();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader
    public void a(Context context, String str, int i, int i2, ImageLoader.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e151696", new Object[]{this, context, str, new Integer(i), new Integer(i2), cVar});
        } else {
            a(new ImageLoader.b(null, context, str, str, i, i2, ImageLoader.a.a(), false), false, cVar);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader
    public ImageLoader.e a(ImageLoader.b bVar, ImageLoader.c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageLoader.e) ipChange.ipc$dispatch("39c4eef5", new Object[]{this, bVar, cVar}) : a(bVar, false, cVar);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader
    public ImageLoader.e a(final ImageLoader.b bVar, final boolean z, final ImageLoader.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageLoader.e) ipChange.ipc$dispatch("98f26c73", new Object[]{this, bVar, new Boolean(z), cVar});
        }
        if (bVar.g != null && bVar.g.g) {
            final b bVar2 = new b(this);
            Runnable runnable = new Runnable() { // from class: com.taobao.android.layoutmanager.adapter.impl.k.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    b.a(bVar2, (Runnable) null);
                    b bVar3 = bVar2;
                    bVar3.b = 1;
                    b.a(bVar3, k.a(k.this, bVar, z, cVar));
                }
            };
            AsyncTask.THREAD_POOL_EXECUTOR.execute(runnable);
            b.a(bVar2, runnable);
            return bVar2;
        }
        b bVar3 = new b(this);
        bVar3.b = 1;
        b.a(bVar3, b(bVar, z, cVar));
        return bVar3;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        ImageLoader.b bVar = this.f;
        if (bVar == null) {
            return;
        }
        a(bVar, false, this.g);
    }

    private com.taobao.phenix.intf.c b(final ImageLoader.b bVar, final boolean z, final ImageLoader.c cVar) {
        String str;
        int i;
        int i2;
        PhenixCreator phenixCreator;
        String str2;
        com.taobao.phenix.intf.c cVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.phenix.intf.c) ipChange.ipc$dispatch("284da5aa", new Object[]{this, bVar, new Boolean(z), cVar});
        }
        if (this.f19968a == 0 && bVar.d != null && (cVar2 = this.e) != null && cVar2.b(bVar.d)) {
            return null;
        }
        this.f = bVar;
        this.g = cVar;
        String str3 = bVar.c;
        String str4 = bVar.d;
        Context context = bVar.b;
        final int i3 = bVar.e;
        final int i4 = bVar.f;
        if (bVar.g != null) {
            str = bVar.g.f + "";
            i = bVar.g.f19969a;
        } else {
            str = "87";
            i = 0;
        }
        long j = 0;
        final boolean z2 = bVar.h;
        if (z2) {
            d();
            j = System.currentTimeMillis();
        }
        this.f19968a = -1;
        if (StringUtils.isEmpty(str4)) {
            com.taobao.phenix.intf.b.h().a(this.e);
            return null;
        }
        ogh.a(ieu.sStageLoadImage);
        com.taobao.phenix.intf.c cVar3 = this.e;
        if (cVar3 != null && !cVar3.b(str4)) {
            this.e.b();
        }
        boolean z3 = this.c;
        final PhenixCreator a2 = com.taobao.phenix.intf.b.h().a(context).a((String) null, str4);
        if (bVar.g != null && bVar.g.h) {
            a2.bitmapProcessors(new c());
        }
        if (bVar.g != null) {
            int i5 = bVar.g.k;
            if (i5 != 1) {
                i2 = 2;
                if (i5 != 2 && i5 == 3) {
                    i2 = 4;
                }
            } else {
                i2 = 1;
            }
        } else {
            i2 = 2;
        }
        PhenixCreator schedulePriority = a2.addLoaderExtra(esr.BUNDLE_BIZ_CODE, str).memOnly(z3).schedulePriority(i2);
        final long j2 = j;
        final int i6 = i;
        final long j3 = j;
        final int i7 = i;
        schedulePriority.failListener(new com.taobao.phenix.intf.event.a<FailPhenixEvent>() { // from class: com.taobao.android.layoutmanager.adapter.impl.k.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.phenix.intf.event.a
            public /* synthetic */ boolean onHappen(FailPhenixEvent failPhenixEvent) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, failPhenixEvent})).booleanValue() : a(failPhenixEvent);
            }

            public boolean a(FailPhenixEvent failPhenixEvent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("64c1ef50", new Object[]{this, failPhenixEvent})).booleanValue();
                }
                k.a(k.this, bVar, z2, j2, i3, i4, i6, failPhenixEvent);
                ImageLoader.c cVar4 = cVar;
                if (cVar4 != null) {
                    if (cVar4 instanceof ImageLoader.d) {
                        ((ImageLoader.d) cVar4).onImageLoadFailed(failPhenixEvent.getResultCode());
                    } else {
                        cVar4.onImageLoadFailed();
                    }
                }
                failPhenixEvent.getTicket().a(true);
                k.c(k.this, 1);
                return false;
            }
        }).succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: com.taobao.android.layoutmanager.adapter.impl.k.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.phenix.intf.event.a
            public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
            }

            public boolean a(SuccPhenixEvent succPhenixEvent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
                }
                if (succPhenixEvent.getDrawable() != null && !succPhenixEvent.isIntermediate()) {
                    BitmapDrawable drawable = succPhenixEvent.getDrawable();
                    ImageStatistics statistics = a2.getStatistics();
                    k.a(k.this, bVar, statistics != null ? statistics.c() / 1024.0f : 0.0f, z2, j3, i3, i4, i7, succPhenixEvent, z);
                    ImageLoader.c cVar4 = cVar;
                    if (cVar4 != null) {
                        if (cVar4 instanceof ImageLoader.d) {
                            if (drawable instanceof com.taobao.phenix.animate.b) {
                                ((ImageLoader.d) cVar4).onImageLoaded(succPhenixEvent.getUrl(), new com.taobao.android.layoutmanager.adapter.impl.b((com.taobao.phenix.animate.b) drawable));
                            } else {
                                ((ImageLoader.d) cVar4).onImageLoaded(succPhenixEvent.getUrl(), drawable);
                            }
                        } else if (drawable instanceof com.taobao.phenix.animate.b) {
                            cVar4.onImageLoaded(new com.taobao.android.layoutmanager.adapter.impl.b((com.taobao.phenix.animate.b) drawable));
                        } else {
                            cVar4.onImageLoaded(drawable);
                        }
                    }
                    succPhenixEvent.getTicket().a(true);
                    k.b(k.this, 0);
                }
                return true;
            }
        }).cancelListener(new com.taobao.phenix.intf.event.a<com.taobao.phenix.intf.event.d>() { // from class: com.taobao.android.layoutmanager.adapter.impl.k.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.phenix.intf.event.a
            public boolean onHappen(com.taobao.phenix.intf.event.d dVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, dVar})).booleanValue();
                }
                ogg.c("image", "cancel download " + dVar.getUrl());
                k.a(k.this, 1);
                return true;
            }
        });
        if (z3) {
            phenixCreator = a2;
            phenixCreator.memCacheMissListener(new com.taobao.phenix.intf.event.a<com.taobao.phenix.intf.event.c>() { // from class: com.taobao.android.layoutmanager.adapter.impl.k.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.phenix.intf.event.a
                public /* synthetic */ boolean onHappen(com.taobao.phenix.intf.event.c cVar4) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, cVar4})).booleanValue() : a(cVar4);
                }

                public boolean a(com.taobao.phenix.intf.event.c cVar4) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("fa9f0059", new Object[]{this, cVar4})).booleanValue();
                    }
                    ImageLoader.c cVar5 = cVar;
                    if (cVar5 != null) {
                        if (cVar5 instanceof ImageLoader.d) {
                            ((ImageLoader.d) cVar5).onImageLoadFailed(-100);
                        } else {
                            cVar5.onImageLoadFailed();
                        }
                    }
                    k.d(k.this, 1);
                    return true;
                }
            });
        } else {
            phenixCreator = a2;
        }
        if (i3 != -1 && i4 != -1) {
            phenixCreator.limitSize(null, i3, i4);
        }
        phenixCreator.handler(new d());
        if (oeb.y()) {
            str2 = str4;
            if (!StringUtils.equals(str3, str2) && !StringUtils.isEmpty(str3)) {
                phenixCreator.retryHandler(new a().a(str3));
            }
        } else {
            str2 = str4;
        }
        this.e = phenixCreator.fetch();
        this.e.a(str2);
        this.b = str2;
        ogh.b();
        return this.e;
    }

    private static int a(SuccPhenixEvent succPhenixEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3b4dd363", new Object[]{succPhenixEvent})).intValue();
        }
        if (succPhenixEvent.isImmediate()) {
            return 2;
        }
        return succPhenixEvent.isFromDisk() ? 1 : 0;
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (d || com.taobao.tao.flexbox.layoutmanager.adapter.a.a().y() == null) {
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add("totalTime");
            arrayList.add("time");
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add("imageWidth");
            arrayList2.add("imageHeight");
            arrayList2.add("mode");
            arrayList2.add(WXPerformance.CACHE_TYPE);
            arrayList2.add("phase");
            arrayList2.add("finished");
            arrayList2.add("errorCode");
            arrayList2.add("errorInfo");
            com.taobao.tao.flexbox.layoutmanager.adapter.a.a().y().a("tnode", "imageTime", arrayList, arrayList2, true);
            d = true;
        }
    }

    private void a(ImageLoader.b bVar, float f, boolean z, long j, int i, int i2, int i3, SuccPhenixEvent succPhenixEvent, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f90dd80", new Object[]{this, bVar, new Float(f), new Boolean(z), new Long(j), new Integer(i), new Integer(i2), new Integer(i3), succPhenixEvent, new Boolean(z2)});
            return;
        }
        if (z) {
            if (com.taobao.tao.flexbox.layoutmanager.adapter.a.a().y() != null) {
                HashMap hashMap = new HashMap();
                double currentTimeMillis = System.currentTimeMillis() - j;
                hashMap.put("totalTime", Double.valueOf(currentTimeMillis));
                hashMap.put("time", Double.valueOf(currentTimeMillis));
                HashMap hashMap2 = new HashMap();
                hashMap2.put("imageWidth", String.valueOf(i));
                hashMap2.put("imageHeight", String.valueOf(i2));
                hashMap2.put("mode", String.valueOf(i3));
                hashMap2.put(WXPerformance.CACHE_TYPE, String.valueOf(a(succPhenixEvent)));
                hashMap2.put("finished", "1");
                hashMap2.put("phase", jyx.c.POINT_NAME);
                com.taobao.tao.flexbox.layoutmanager.adapter.a.a().y().a("tnode", "imageTime", hashMap, hashMap2);
            }
            if (f > 0.0f) {
                HashMap hashMap3 = new HashMap();
                hashMap3.put("imageWidth", String.valueOf(i));
                hashMap3.put("imageHeight", String.valueOf(i2));
                hashMap3.put("mode", String.valueOf(i3));
                hashMap3.put(WXPerformance.CACHE_TYPE, String.valueOf(a(succPhenixEvent)));
                hashMap3.put("finished", "1");
                hashMap3.put("phase", jyx.c.POINT_NAME);
                hashMap3.put("bizName", "guangguang");
                hashMap3.put("downloadUrl", succPhenixEvent.getUrl());
                hashMap3.put("fileSize", Float.valueOf(f));
                a(bVar, hashMap3);
                long currentTimeMillis2 = System.currentTimeMillis() - j;
                hashMap3.put("totalTime", Long.valueOf(currentTimeMillis2));
                hashMap3.put("time", Long.valueOf(currentTimeMillis2));
                com.taobao.tao.flexbox.layoutmanager.core.w.a(bVar.f19971a, hashMap3);
            }
        }
        ogg.c("image", "download image succeed, url:" + succPhenixEvent.getUrl() + " type:" + a(succPhenixEvent) + " time:" + (System.currentTimeMillis() - j) + " size：" + f + " cache: " + succPhenixEvent.isImmediate() + "preload:" + z2);
    }

    private void a(ImageLoader.b bVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99d6b24c", new Object[]{this, bVar, map});
        } else if (bVar == null) {
        } else {
            if (bVar.g != null && !StringUtils.isEmpty(bVar.g.j)) {
                map.put("scene", bVar.g.j);
            }
            if (bVar.g != null && !StringUtils.isEmpty(bVar.g.i)) {
                map.put("pageName", bVar.g.i);
                return;
            }
            ab abVar = bVar.f19971a;
            if (abVar == null || abVar.A() == null || abVar.A().c() == null || abVar.A().c().a() == null) {
                return;
            }
            map.put("pageName", abVar.A().c().a().a());
        }
    }

    private void a(ImageLoader.b bVar, boolean z, long j, int i, int i2, int i3, FailPhenixEvent failPhenixEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e134811e", new Object[]{this, bVar, new Boolean(z), new Long(j), new Integer(i), new Integer(i2), new Integer(i3), failPhenixEvent});
            return;
        }
        if (z) {
            if (com.taobao.tao.flexbox.layoutmanager.adapter.a.a().y() != null) {
                HashMap hashMap = new HashMap();
                double currentTimeMillis = System.currentTimeMillis() - j;
                hashMap.put("totalTime", Double.valueOf(currentTimeMillis));
                hashMap.put("time", Double.valueOf(currentTimeMillis));
                HashMap hashMap2 = new HashMap();
                hashMap2.put("imageWidth", String.valueOf(i));
                hashMap2.put("imageHeight", String.valueOf(i2));
                hashMap2.put("mode", String.valueOf(i3));
                hashMap2.put("errorCode", String.valueOf(failPhenixEvent.getResultCode()));
                hashMap2.put("errorInfo", String.valueOf(failPhenixEvent.getResultCode()));
                hashMap2.put("phase", jyx.c.POINT_NAME);
                com.taobao.tao.flexbox.layoutmanager.adapter.a.a().y().a("tnode", "imageTime", hashMap, hashMap2);
            }
            HashMap hashMap3 = new HashMap();
            hashMap3.put("imageWidth", String.valueOf(i));
            hashMap3.put("imageHeight", String.valueOf(i2));
            hashMap3.put("mode", String.valueOf(i3));
            hashMap3.put("errorCode", String.valueOf(failPhenixEvent.getResultCode()));
            hashMap3.put("errorInfo", String.valueOf(failPhenixEvent.getResultCode()));
            hashMap3.put("phase", jyx.c.POINT_NAME);
            hashMap3.put("bizName", "guangguang");
            hashMap3.put("downloadUrl", failPhenixEvent.getUrl());
            a(bVar, hashMap3);
            long currentTimeMillis2 = System.currentTimeMillis() - j;
            hashMap3.put("totalTime", Long.valueOf(currentTimeMillis2));
            hashMap3.put("time", Long.valueOf(currentTimeMillis2));
            com.taobao.tao.flexbox.layoutmanager.core.w.a(bVar.f19971a, hashMap3);
        }
        ogg.c("image", "download image failed, url:" + failPhenixEvent.getUrl() + " resultCode:" + failPhenixEvent.getResultCode() + " time:" + (System.currentTimeMillis() - j));
    }

    /* loaded from: classes5.dex */
    public static class a implements com.taobao.phenix.intf.event.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f13127a;

        static {
            kge.a(-311772185);
            kge.a(-96725311);
        }

        @Override // com.taobao.phenix.intf.event.b
        public Pair<String, String> getDefaultRetryUrlPair() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Pair) ipChange.ipc$dispatch("101e44dd", new Object[]{this});
            }
            return null;
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("3b1d85cb", new Object[]{this, str});
            }
            if (str != null && str.endsWith("END_IMAGE_URL")) {
                this.f13127a = str.substring(0, str.length() - 13);
            } else {
                this.f13127a = str;
            }
            return this;
        }

        @Override // com.taobao.phenix.intf.event.b
        public String getRetryUrl(PhenixCreator phenixCreator, Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("3bd53dee", new Object[]{this, phenixCreator, th});
            }
            if ((th instanceof HttpCodeResponseException) && ((HttpCodeResponseException) th).getHttpCode() == 404) {
                return this.f13127a;
            }
            return null;
        }
    }

    /* loaded from: classes5.dex */
    public static class c implements nia {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(668181426);
            kge.a(1386160431);
        }

        @Override // tb.nia
        public String getId() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("81e05888", new Object[]{this}) : "rotate";
        }

        @Override // tb.nia
        public Bitmap process(String str, nia.a aVar, Bitmap bitmap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Bitmap) ipChange.ipc$dispatch("6877629f", new Object[]{this, str, aVar, bitmap});
            }
            try {
                int a2 = a(str);
                if (a2 != 0) {
                    Matrix matrix = new Matrix();
                    matrix.reset();
                    matrix.setRotate(a2);
                    return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                }
            } catch (OutOfMemoryError e) {
                e.printStackTrace();
            }
            return bitmap;
        }

        public InputStream a(Context context, Uri uri) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (InputStream) ipChange.ipc$dispatch("667e3e6a", new Object[]{this, context, uri});
            }
            try {
                return context.getContentResolver().openInputStream(uri);
            } catch (IOException unused) {
                return null;
            }
        }

        public int a(String str) {
            InputStream a2;
            IpChange ipChange = $ipChange;
            int i = 0;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{this, str})).intValue();
            }
            if (Build.VERSION.SDK_INT < 24) {
                return 0;
            }
            try {
                a2 = a(Globals.getApplication(), Uri.parse(str));
                if (a2 == null) {
                    a2 = a(Globals.getApplication(), Uri.fromFile(new File(str)));
                }
            } catch (Throwable unused) {
            }
            if (a2 == null) {
                return 0;
            }
            int attributeInt = new ExifInterface(a2).getAttributeInt(android.support.media.ExifInterface.TAG_ORIENTATION, 1);
            if (attributeInt == 3) {
                i = 180;
            } else if (attributeInt == 6) {
                i = 90;
            } else if (attributeInt == 8) {
                i = 270;
            }
            a2.close();
            return i;
        }
    }

    /* loaded from: classes5.dex */
    public static class d extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-97810288);
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            if (str.hashCode() == 40891567) {
                return new Boolean(super.sendMessageAtTime((Message) objArr[0], ((Number) objArr[1]).longValue()));
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public d() {
            super(Looper.getMainLooper());
        }

        @Override // android.os.Handler
        public boolean sendMessageAtTime(Message message, long j) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("26ff4af", new Object[]{this, message, new Long(j)})).booleanValue() : super.sendMessageAtTime(message, 0L);
        }
    }
}
