package com.etao.feimagesearch.pipline;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.intelli.ClientModelType;
import com.etao.feimagesearch.model.IrpParamModel;
import com.etao.feimagesearch.model.PhotoFrom;
import com.etao.feimagesearch.newresult.base.IrpDatasource;
import com.etao.feimagesearch.pipline.node.e;
import com.etao.feimagesearch.pipline.node.g;
import com.etao.feimagesearch.pipline.node.h;
import com.etao.feimagesearch.pipline.node.i;
import com.etao.feimagesearch.pipline.node.j;
import com.etao.feimagesearch.pipline.node.k;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.q;
import tb.cql;
import tb.crj;
import tb.crq;
import tb.ctf;
import tb.kge;

/* loaded from: classes3.dex */
public final class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final d INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static Map<Long, a> f6935a;
    private static Map<Long, IrpDatasource> b;

    static {
        kge.a(656721191);
        INSTANCE = new d();
        f6935a = new LinkedHashMap();
        b = new LinkedHashMap();
    }

    private d() {
    }

    @JvmStatic
    public static final long a(long j, Map<String, String> intentParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("445b209d", new Object[]{new Long(j), intentParams})).longValue();
        }
        q.c(intentParams, "intentParams");
        IrpDatasource a2 = IrpDatasource.Companion.a(intentParams);
        a2.a(j);
        a aVar = new a(crq.Companion.a(a2));
        if (a2.E()) {
            aVar.a((crj) new i(), true);
        } else if (a2.m()) {
            aVar.a(INSTANCE.a(), true);
        } else if (a2.F()) {
            aVar.a(INSTANCE.a(a2.r()), true);
        } else {
            aVar.a(a(INSTANCE, a2, false, a2.x(), null, null, 24, null), true);
        }
        a(aVar, a2, Long.valueOf(j));
        return j;
    }

    @JvmStatic
    public static final void a(Bitmap sourceBitmap, String str, IrpParamModel irpParamModel, long j, Map<String, String> extraParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cffcdaf2", new Object[]{sourceBitmap, str, irpParamModel, new Long(j), extraParams});
            return;
        }
        q.c(sourceBitmap, "sourceBitmap");
        q.c(irpParamModel, "irpParamModel");
        q.c(extraParams, "extraParams");
        IrpDatasource a2 = IrpDatasource.Companion.a(sourceBitmap, str, irpParamModel, extraParams);
        a2.a(j);
        a aVar = new a(crq.Companion.a(a2));
        aVar.a(a(INSTANCE, a2, false, null, null, null, 28, null), true);
        a(aVar, a2, Long.valueOf(j));
    }

    @JvmStatic
    public static final void a(Bitmap sourceBitmap, String str, String str2, com.etao.feimagesearch.model.b cameraPageModel, long j, Map<String, String> extraParams, Map<String, String> map, boolean z, Integer num, int i, PhotoFrom photoFrom) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3482a400", new Object[]{sourceBitmap, str, str2, cameraPageModel, new Long(j), extraParams, map, new Boolean(z), num, new Integer(i), photoFrom});
            return;
        }
        q.c(sourceBitmap, "sourceBitmap");
        q.c(cameraPageModel, "cameraPageModel");
        q.c(extraParams, "extraParams");
        IrpDatasource a2 = IrpDatasource.Companion.a(sourceBitmap, str, str2, cameraPageModel, extraParams, map, photoFrom);
        a2.a(j);
        a aVar = new a(crq.Companion.a(a2));
        if (z) {
            aVar.a(INSTANCE.b(), true);
        } else {
            aVar.a(INSTANCE.a(a2, false, (RectF) null, num, Integer.valueOf(i)), true);
        }
        a(aVar, a2, Long.valueOf(j));
    }

    @JvmStatic
    public static final void a(Bitmap sourceBitmap, com.etao.feimagesearch.model.b cameraPageModel, PhotoFrom photoFrom) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbbe0650", new Object[]{sourceBitmap, cameraPageModel, photoFrom});
            return;
        }
        q.c(sourceBitmap, "sourceBitmap");
        q.c(cameraPageModel, "cameraPageModel");
        q.c(photoFrom, "photoFrom");
        IrpDatasource a2 = IrpDatasource.Companion.a(sourceBitmap, photoFrom, cameraPageModel);
        a2.a(cameraPageModel.getSessionId());
        a aVar = new a(crq.Companion.a(a2));
        aVar.a(a(INSTANCE, a2, false, null, null, null, 28, null), true);
        a(aVar, a2, Long.valueOf(cameraPageModel.getSessionId()));
    }

    @JvmStatic
    public static final void a(Bitmap sourceBitmap, PhotoFrom photoFrom, List<RectF> list, ctf algoInfo, com.etao.feimagesearch.model.b cameraPageModel, long j, Map<String, String> map, Map<String, String> map2, Integer num, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99584a94", new Object[]{sourceBitmap, photoFrom, list, algoInfo, cameraPageModel, new Long(j), map, map2, num, new Integer(i)});
            return;
        }
        q.c(sourceBitmap, "sourceBitmap");
        q.c(photoFrom, "photoFrom");
        q.c(algoInfo, "algoInfo");
        q.c(cameraPageModel, "cameraPageModel");
        IrpDatasource a2 = IrpDatasource.Companion.a(sourceBitmap, list, photoFrom, cameraPageModel, map, map2);
        RectF rectF = (list == null || list.size() <= 0) ? null : list.get(0);
        if (cql.c(algoInfo)) {
            a2.d().put("hasCropedImage", "true");
        }
        a2.a(j);
        a aVar = new a(crq.Companion.a(a2));
        aVar.a(INSTANCE.a(a2, rectF, algoInfo, num, Integer.valueOf(i), photoFrom), true);
        a(aVar, a2, Long.valueOf(j));
    }

    @JvmStatic
    public static final void a(Uri imgUri, Bitmap bitmap, int i, PhotoFrom photoFrom, com.etao.feimagesearch.model.b cameraPageModel, long j, int i2, int i3, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdd0b670", new Object[]{imgUri, bitmap, new Integer(i), photoFrom, cameraPageModel, new Long(j), new Integer(i2), new Integer(i3), str});
            return;
        }
        q.c(imgUri, "imgUri");
        q.c(photoFrom, "photoFrom");
        q.c(cameraPageModel, "cameraPageModel");
        IrpDatasource a2 = IrpDatasource.Companion.a(imgUri, bitmap, i, photoFrom, cameraPageModel);
        a2.a(j);
        if (!StringUtils.isEmpty(str)) {
            a2.d().put(ClientModelType.KEY_CLIENT_MODEL_TYPE, str);
        }
        a aVar = new a(crq.Companion.a(a2));
        aVar.a(INSTANCE.a(a2, true, (RectF) null, Integer.valueOf(i2), Integer.valueOf(i3)), true);
        a(aVar, a2, Long.valueOf(j));
    }

    private final crj a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (crj) ipChange.ipc$dispatch("f035ea3", new Object[]{this});
        }
        com.etao.feimagesearch.pipline.node.d dVar = new com.etao.feimagesearch.pipline.node.d(false);
        dVar.a((crj) new h("29111", com.etao.feimagesearch.config.b.ay(), com.etao.feimagesearch.config.b.bA(), null, null, false, true, 48, null));
        return dVar;
    }

    private final crj a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (crj) ipChange.ipc$dispatch("7c6e0799", new Object[]{this, str});
        }
        h hVar = new h(com.etao.feimagesearch.config.b.i(str), com.etao.feimagesearch.config.b.I(), com.etao.feimagesearch.config.b.J(), null, null, false, true, 48, null);
        hVar.a((crj) new com.etao.feimagesearch.pipline.node.d(false, 1, null));
        return hVar;
    }

    private final crj b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (crj) ipChange.ipc$dispatch("16b50402", new Object[]{this});
        }
        com.etao.feimagesearch.pipline.node.d dVar = new com.etao.feimagesearch.pipline.node.d(true);
        dVar.a((crj) new e());
        return dVar;
    }

    public static /* synthetic */ crj a(d dVar, IrpDatasource irpDatasource, boolean z, RectF rectF, Integer num, Integer num2, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (crj) ipChange.ipc$dispatch("de778385", new Object[]{dVar, irpDatasource, new Boolean(z), rectF, num, num2, new Integer(i), obj});
        }
        if ((i & 4) != 0) {
            rectF = null;
        }
        RectF rectF2 = rectF;
        if ((i & 8) != 0) {
            num = null;
        }
        Integer num3 = num;
        if ((i & 16) != 0) {
            num2 = null;
        }
        return dVar.a(irpDatasource, z, rectF2, num3, num2);
    }

    private final crj a(IrpDatasource irpDatasource, boolean z, RectF rectF, Integer num, Integer num2) {
        j jVar;
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            return (crj) ipChange.ipc$dispatch("5969f3b0", new Object[]{this, irpDatasource, new Boolean(z), rectF, num, num2});
        }
        com.etao.feimagesearch.pipline.node.d dVar = new com.etao.feimagesearch.pipline.node.d(true);
        if (com.etao.feimagesearch.capture.scan.irp.b.a(num2)) {
            jVar = new j(num);
            dVar.a((crj) jVar);
        } else {
            jVar = dVar;
        }
        if (num2 == null) {
            if (com.etao.feimagesearch.config.b.ba()) {
                jVar.a((crj) new com.etao.feimagesearch.pipline.node.c(num));
                jVar = jVar.c();
                if (jVar == null) {
                    q.a();
                }
            }
        } else if (com.etao.feimagesearch.mnn.featureextract.c.a(num2)) {
            jVar.a((crj) new com.etao.feimagesearch.pipline.node.c(num));
            jVar = jVar.c();
            if (jVar == null) {
                q.a();
            }
        }
        crj crjVar = jVar;
        boolean n = com.etao.feimagesearch.config.b.n(irpDatasource.r());
        boolean z3 = z || n;
        if (z || n) {
            z2 = true;
        }
        crjVar.a((crj) new com.etao.feimagesearch.pipline.node.b(z3, z2, true, num, num2));
        crj c = crjVar.c();
        if (c == null) {
            q.a();
        }
        if (z && com.etao.feimagesearch.capture.scan.irp.c.Companion.a(num2)) {
            c.a((crj) new k(num));
            c = c.c();
            if (c == null) {
                q.a();
            }
        }
        c.a((crj) new g(false, false, rectF, 0, 0, 27, null));
        crj c2 = c.c();
        if (c2 == null) {
            q.a();
        }
        c2.a((crj) new h(com.etao.feimagesearch.config.b.i(irpDatasource.r()), com.etao.feimagesearch.config.b.I(), com.etao.feimagesearch.config.b.J(), null, null, false, true, 48, null));
        return dVar;
    }

    private final crj a(IrpDatasource irpDatasource, RectF rectF, ctf ctfVar, Integer num, Integer num2, PhotoFrom photoFrom) {
        crj crjVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (crj) ipChange.ipc$dispatch("7513fded", new Object[]{this, irpDatasource, rectF, ctfVar, num, num2, photoFrom});
        }
        if (cql.a(ctfVar)) {
            com.etao.feimagesearch.pipline.node.d dVar = new com.etao.feimagesearch.pipline.node.d(true);
            if (cql.c(ctfVar)) {
                dVar.a((crj) new com.etao.feimagesearch.pipline.node.a(rectF));
                crjVar = dVar.c();
                if (crjVar == null) {
                    q.a();
                }
            } else {
                crjVar = dVar;
            }
            if (com.etao.feimagesearch.capture.scan.irp.b.a(num2)) {
                crjVar.a((crj) new j(num));
                crjVar = crjVar.c();
                if (crjVar == null) {
                    q.a();
                }
            }
            if (com.etao.feimagesearch.mnn.featureextract.c.a(num2)) {
                crjVar.a((crj) new com.etao.feimagesearch.pipline.node.c(num));
                crjVar = crjVar.c();
                if (crjVar == null) {
                    q.a();
                }
            }
            crjVar.a((crj) new com.etao.feimagesearch.pipline.node.b(false, false, true, num, num2, 3, null));
            crj c = crjVar.c();
            if (c == null) {
                q.a();
            }
            c.a((crj) new g(false, false, cql.b(ctfVar) ? rectF : null, 0, 0, 27, null));
            crj c2 = c.c();
            if (c2 == null) {
                q.a();
            }
            if (com.etao.feimagesearch.mnn.featureextract.c.a(num2)) {
                c2.a((crj) new com.etao.feimagesearch.pipline.node.c(num));
                c2 = c2.c();
                if (c2 == null) {
                    q.a();
                }
            }
            c2.a((crj) new h(com.etao.feimagesearch.config.b.i(irpDatasource.r()), com.etao.feimagesearch.config.b.I(), com.etao.feimagesearch.config.b.J(), null, null, false, true, 48, null));
            return dVar;
        } else if (PhotoFrom.Values.META_SIGHT == photoFrom) {
            return a(this, irpDatasource, false, rectF, null, null, 24, null);
        } else {
            return a(this, irpDatasource, false, null, num, num2, 4, null);
        }
    }

    @JvmStatic
    public static final void a(a aVar, IrpDatasource irpDatasource, Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33f820c8", new Object[]{aVar, irpDatasource, l});
        } else if (aVar == null || irpDatasource == null || l == null || l.longValue() <= 0) {
        } else {
            f6935a.put(l, aVar);
            b.put(l, irpDatasource);
        }
    }

    @JvmStatic
    public static final a a(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("17757070", new Object[]{l});
        }
        if (l != null && l.longValue() > 0) {
            return f6935a.remove(l);
        }
        return null;
    }

    @JvmStatic
    public static final IrpDatasource b(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IrpDatasource) ipChange.ipc$dispatch("b0d36d4a", new Object[]{l});
        }
        if (l != null && l.longValue() > 0) {
            return b.remove(l);
        }
        return null;
    }
}
