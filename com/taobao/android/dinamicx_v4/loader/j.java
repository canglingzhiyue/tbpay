package com.taobao.android.dinamicx_v4.loader;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import tb.fwr;
import tb.gfr;
import tb.gfs;
import tb.gft;
import tb.gfu;
import tb.gfv;
import tb.gfw;
import tb.gfz;
import tb.gga;
import tb.ggb;
import tb.ggc;
import tb.ggd;
import tb.gge;
import tb.ggf;
import tb.ggg;
import tb.ggh;
import tb.ggi;
import tb.ggk;
import tb.ggm;
import tb.ggn;
import tb.kge;

/* loaded from: classes5.dex */
public class j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private h f12231a;
    private e b;
    private com.taobao.android.dinamicx.model.d<ggk> c = new com.taobao.android.dinamicx.model.d<>();
    private Map<String, ggk> d = new LinkedHashMap();

    static {
        kge.a(-930947558);
    }

    public Map<String, ggk> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this}) : this.d;
    }

    public j(h hVar, e eVar) {
        this.f12231a = hVar;
        this.b = eVar;
    }

    public boolean a(fwr fwrVar, DXRuntimeContext dXRuntimeContext) {
        ggk ggiVar;
        IpChange ipChange = $ipChange;
        byte b = 2;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c47e4ac", new Object[]{this, fwrVar, dXRuntimeContext})).booleanValue();
        }
        fwrVar.c(this.f12231a.f());
        int f = fwrVar.f();
        int i = 0;
        while (i < f) {
            int f2 = fwrVar.f();
            byte d = fwrVar.d();
            short e = fwrVar.e();
            ggk ggkVar = null;
            if (d == b) {
                ggkVar = new gfw(fwrVar.f(), e);
            } else if (d == 1) {
                switch (e) {
                    case 1:
                        ggkVar = new ggb(fwrVar.f());
                        break;
                    case 2:
                        ggkVar = new gge(fwrVar.g());
                        break;
                    case 3:
                        ggkVar = new gfu(fwrVar.h());
                        break;
                    case 4:
                        byte d2 = fwrVar.d();
                        if (d2 == 1) {
                            ggiVar = new ggi(null);
                            ggkVar = ggiVar;
                            break;
                        } else if (d2 == 0) {
                            ggkVar = new ggi(this.b.a(fwrVar.f()));
                            break;
                        } else {
                            throw new DXLoaderException("DXVariableSectionLoader TYPE_STRING load null flag error： " + i);
                        }
                    case 5:
                        byte d3 = fwrVar.d();
                        if (d3 == 1) {
                            ggiVar = new gft(null);
                            ggkVar = ggiVar;
                            break;
                        } else if (d3 == 0) {
                            ggkVar = new gft(this.b.a(fwrVar.f()));
                            break;
                        } else {
                            throw new DXLoaderException("DXVariableSectionLoader TYPE_COLOR load null flag error： " + i);
                        }
                    case 6:
                    case 7:
                    case 10:
                    default:
                        if (DinamicXEngine.j()) {
                            throw new DXLoaderException("不认识的变量类型 ：fieldType： " + ((int) e));
                        }
                        break;
                    case 8:
                        byte d4 = fwrVar.d();
                        if (d4 != 1) {
                            if (d4 == 0) {
                                throw new DXLoaderException("DXVariableSectionLoader TYPE_LIST is not null " + i);
                            }
                            throw new DXLoaderException("DXVariableSectionLoader TYPE_LIST load null flag error： " + i);
                        }
                        ggiVar = new ggd(null);
                        ggkVar = ggiVar;
                        break;
                    case 9:
                        byte d5 = fwrVar.d();
                        if (d5 != 1) {
                            if (d5 == 0) {
                                throw new DXLoaderException("DXVariableSectionLoader TYPE_MAP is not null " + i);
                            }
                            throw new DXLoaderException("DXVariableSectionLoader TYPE_MAP load null flag error： " + i);
                        }
                        ggiVar = new ggg(null);
                        ggkVar = ggiVar;
                        break;
                    case 11:
                        byte d6 = fwrVar.d();
                        if (d6 == 1) {
                            ggiVar = new ggc(null);
                            ggkVar = ggiVar;
                            break;
                        } else if (d6 == 0) {
                            ggkVar = new ggc(Integer.valueOf(fwrVar.f()));
                            break;
                        } else {
                            throw new DXLoaderException("DXVariableSectionLoader TYPE_INT_WRAP load null flag error： " + i);
                        }
                    case 12:
                        byte d7 = fwrVar.d();
                        if (d7 == 1) {
                            ggiVar = new ggf(null);
                            ggkVar = ggiVar;
                            break;
                        } else if (d7 == 0) {
                            ggkVar = new ggf(Long.valueOf(fwrVar.g()));
                            break;
                        } else {
                            throw new DXLoaderException("DXVariableSectionLoader TYPE_LONG_WRAP load null flag error： " + i);
                        }
                    case 13:
                        byte d8 = fwrVar.d();
                        if (d8 == 1) {
                            ggiVar = new gfv(null);
                            ggkVar = ggiVar;
                            break;
                        } else if (d8 == 0) {
                            ggkVar = new gfv(Double.valueOf(fwrVar.h()));
                            break;
                        } else {
                            throw new DXLoaderException("DXVariableSectionLoader TYPE_DOUBLE_WRAP load null flag error： " + i);
                        }
                    case 14:
                        ggh gghVar = new ggh(dXRuntimeContext);
                        this.c.put(f2, gghVar);
                        this.d.put(this.b.a(f2), gghVar);
                        continue;
                        i++;
                        b = 2;
                    case 15:
                        ggkVar = new gfr(fwrVar.d() == 1);
                        break;
                    case 16:
                        byte d9 = fwrVar.d();
                        if (d9 == 1) {
                            ggiVar = new gfs(null);
                            ggkVar = ggiVar;
                            break;
                        } else if (d9 == 0) {
                            ggkVar = new gfs(Boolean.valueOf(fwrVar.d() == 1));
                            break;
                        } else {
                            throw new DXLoaderException("DXVariableSectionLoader TYPE_INT_WRAP load null flag error： " + i);
                        }
                    case 17:
                        ggkVar = new gfz(fwrVar.i());
                        break;
                    case 18:
                        byte d10 = fwrVar.d();
                        if (d10 == 1) {
                            ggiVar = new gga(null);
                            ggkVar = ggiVar;
                            break;
                        } else if (d10 == 0) {
                            ggkVar = new gga(Float.valueOf(fwrVar.i()));
                            break;
                        } else {
                            throw new DXLoaderException("DXVariableSectionLoader TYPE_FLOAT_WRAP load null flag error： " + i);
                        }
                }
            }
            ggkVar.a(f2);
            byte d11 = fwrVar.d();
            if (d11 > 0) {
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < d11; i2++) {
                    short e2 = fwrVar.e();
                    int f3 = fwrVar.f();
                    int f4 = fwrVar.f();
                    if (e2 == 1) {
                        arrayList.add(new ggm(this.b.a(f3), f4));
                    } else if (e2 == 3) {
                        arrayList.add(new ggn(this.b.a(f3), f4));
                    } else {
                        throw new DXLoaderException("不认识的注解类型： " + ((int) e2));
                    }
                }
                ggkVar.a(arrayList);
            }
            a(fwrVar, ggkVar);
            b(fwrVar, ggkVar);
            if (ggkVar != null) {
                this.c.put(f2, ggkVar);
                this.d.put(this.b.a(f2), ggkVar);
            }
            i++;
            b = 2;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
        if (r11 != 3) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(tb.fwr r11, tb.ggk r12) {
        /*
            r10 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.dinamicx_v4.loader.j.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 3
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L18
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r3] = r10
            r1[r4] = r11
            r11 = 2
            r1[r11] = r12
            java.lang.String r11 = "c90f417c"
            r0.ipc$dispatch(r11, r1)
            return
        L18:
            byte r0 = r11.d()
            byte r1 = r11.d()
            short r11 = r11.e()
            r5 = 0
            if (r0 != r4) goto L2a
            r12.a(r5)
        L2a:
            java.util.List r6 = r12.e()
            r7 = -1
            if (r11 == r7) goto L89
            if (r6 == 0) goto L89
            if (r11 == r4) goto L38
            if (r11 == r2) goto L5c
            goto L80
        L38:
            java.util.Iterator r7 = r6.iterator()
        L3c:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L5c
            java.lang.Object r8 = r7.next()
            tb.ggl r8 = (tb.ggl) r8
            short r9 = r8.a()
            if (r9 != r4) goto L3c
            tb.ggk$b r7 = new tb.ggk$b
            if (r1 != r4) goto L54
            r9 = 1
            goto L55
        L54:
            r9 = 0
        L55:
            java.lang.String r8 = r8.b()
            r7.<init>(r0, r9, r11, r8)
        L5c:
            java.util.Iterator r6 = r6.iterator()
        L60:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L80
            java.lang.Object r7 = r6.next()
            tb.ggl r7 = (tb.ggl) r7
            short r8 = r7.a()
            if (r8 != r2) goto L60
            tb.ggk$b r2 = new tb.ggk$b
            if (r1 != r4) goto L78
            r6 = 1
            goto L79
        L78:
            r6 = 0
        L79:
            java.lang.String r7 = r7.b()
            r2.<init>(r0, r6, r11, r7)
        L80:
            tb.ggk$b r2 = new tb.ggk$b
            if (r1 != r4) goto L85
            r3 = 1
        L85:
            r2.<init>(r0, r3, r11, r5)
            goto L91
        L89:
            tb.ggk$b r2 = new tb.ggk$b
            if (r1 != r4) goto L8e
            r3 = 1
        L8e:
            r2.<init>(r0, r3, r11, r5)
        L91:
            r12.a(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx_v4.loader.j.a(tb.fwr, tb.ggk):void");
    }

    public void b(fwr fwrVar, ggk ggkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5a836fd", new Object[]{this, fwrVar, ggkVar});
            return;
        }
        byte d = fwrVar.d();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < d; i++) {
            arrayList.add(new ggk.a(fwrVar.f(), fwrVar.d()));
        }
        ggkVar.b(arrayList);
    }
}
