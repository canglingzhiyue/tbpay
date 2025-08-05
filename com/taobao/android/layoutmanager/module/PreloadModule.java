package com.taobao.android.layoutmanager.module;

import android.graphics.drawable.Drawable;
import android.taobao.windvane.packageapp.zipapp.utils.c;
import android.text.TextUtils;
import com.airbnb.lottie.h;
import com.airbnb.lottie.j;
import com.airbnb.lottie.o;
import com.alibaba.fastjson.JSONObject;
import com.alipay.zoloz.toyger.blob.BlobManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.adapter.internal.CommonCode;
import com.taobao.tao.flexbox.layoutmanager.ac.a;
import com.taobao.tao.flexbox.layoutmanager.ac.g;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IStorage;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import com.taobao.weex.common.Constants;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.kge;
import tb.oec;
import tb.ogj;
import tb.ogl;
import tb.ogw;
import tb.ogz;

/* loaded from: classes5.dex */
public class PreloadModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-619688271);
        kge.a(-818961104);
    }

    public static /* synthetic */ void a(String str, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35a7c79", new Object[]{str, bArr});
        } else {
            b(str, bArr);
        }
    }

    public static /* synthetic */ void a(List list, String str, boolean z, Map map, int i, g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d743a70", new Object[]{list, str, new Boolean(z), map, new Integer(i), cVar});
        } else {
            b(list, str, z, map, i, cVar);
        }
    }

    public static void preload(g.c cVar) {
        List<Map> a2;
        HashMap hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34e2ac6f", new Object[]{cVar});
        } else if ((cVar.b instanceof Map) && (a2 = oec.a(((Map) cVar.b).get("args"), (List) null)) != null) {
            oec.a(a2, new aa.c<Object>() { // from class: com.taobao.android.layoutmanager.module.PreloadModule.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.flexbox.layoutmanager.core.aa.c
                public boolean b(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("f056ab89", new Object[]{this, obj})).booleanValue();
                    }
                    return false;
                }

                @Override // com.taobao.tao.flexbox.layoutmanager.core.aa.c
                public boolean a(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("a6251248", new Object[]{this, obj})).booleanValue() : !(obj instanceof Map) || ((Map) obj).isEmpty();
                }
            });
            ArrayList arrayList = cVar.f ? new ArrayList(a2.size()) : null;
            for (Map map : a2) {
                String a3 = oec.a(map.get("type"), (String) null);
                if (a3 != null) {
                    if (arrayList != null) {
                        hashMap = new HashMap();
                        HashMap hashMap2 = new HashMap();
                        hashMap.put("type", a3);
                        hashMap.put("result", hashMap2);
                        arrayList.add(hashMap);
                    } else {
                        hashMap = null;
                    }
                    char c = 65535;
                    switch (a3.hashCode()) {
                        case -1096937569:
                            if (a3.equals("lottie")) {
                                c = 0;
                                break;
                            }
                            break;
                        case -707794104:
                            if (a3.equals("zcache")) {
                                c = 4;
                                break;
                            }
                            break;
                        case 99773:
                            if (a3.equals(IStorage.TYPE_DSL)) {
                                c = 1;
                                break;
                            }
                            break;
                        case 104387:
                            if (a3.equals("img")) {
                                c = 2;
                                break;
                            }
                            break;
                        case 3143036:
                            if (a3.equals("file")) {
                                c = 3;
                                break;
                            }
                            break;
                    }
                    if (c == 0) {
                        c(arrayList, hashMap, cVar, oec.a(map.get("list"), (List) null));
                    } else if (c != 1) {
                        if (c == 2) {
                            d(arrayList, hashMap, cVar, oec.a(map.get("list"), (List) null));
                        } else if (c == 3) {
                            b(arrayList, hashMap, cVar, oec.a(map.get("list"), (List) null));
                        } else if (c == 4) {
                            a(arrayList, hashMap, cVar, oec.a(map.get("list"), (List) null));
                        }
                    }
                }
            }
        }
    }

    private static void a(List list, Map map, g.c cVar, List list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15432de4", new Object[]{list, map, cVar, list2});
        } else if (list2 != null) {
            oec.a(list2, new aa.c<Object>() { // from class: com.taobao.android.layoutmanager.module.PreloadModule.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.flexbox.layoutmanager.core.aa.c
                public boolean b(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("f056ab89", new Object[]{this, obj})).booleanValue();
                    }
                    return false;
                }

                @Override // com.taobao.tao.flexbox.layoutmanager.core.aa.c
                public boolean a(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("a6251248", new Object[]{this, obj})).booleanValue() : !(obj instanceof String) || TextUtils.isEmpty((String) obj);
                }
            });
            int size = list2.size();
            for (Object obj : list2) {
                if (obj instanceof String) {
                    String str = (String) obj;
                    b(list, str, c.getInputStreamByUrl(str) != null, map, size, cVar);
                }
            }
        }
    }

    private static void b(final List list, final Map map, final g.c cVar, List list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44fa61e5", new Object[]{list, map, cVar, list2});
        } else if (list2 != null) {
            oec.a(list2, new aa.c<Object>() { // from class: com.taobao.android.layoutmanager.module.PreloadModule.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.flexbox.layoutmanager.core.aa.c
                public boolean b(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("f056ab89", new Object[]{this, obj})).booleanValue();
                    }
                    return false;
                }

                @Override // com.taobao.tao.flexbox.layoutmanager.core.aa.c
                public boolean a(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("a6251248", new Object[]{this, obj})).booleanValue() : !(obj instanceof String) || TextUtils.isEmpty((String) obj);
                }
            });
            final int size = list2.size();
            for (final Object obj : list2) {
                if (obj instanceof String) {
                    IStorage q = com.taobao.tao.flexbox.layoutmanager.adapter.a.a().q();
                    String str = (String) obj;
                    final String a2 = ogz.a(str);
                    File a3 = q.a(a2);
                    if (a3 != null && a3.exists()) {
                        b(list, str, true, map, size, cVar);
                    } else {
                        a.b bVar = null;
                        if (list != null && map != null) {
                            bVar = new a.b() { // from class: com.taobao.android.layoutmanager.module.PreloadModule.4
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // com.taobao.tao.flexbox.layoutmanager.ac.a.b
                                public void a(byte[] bArr) {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("5c19672f", new Object[]{this, bArr});
                                        return;
                                    }
                                    PreloadModule.a(a2, bArr);
                                    PreloadModule.a(list, (String) obj, true, map, size, cVar);
                                }

                                @Override // com.taobao.tao.flexbox.layoutmanager.ac.a.b
                                public void a() {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                                    } else {
                                        PreloadModule.a(list, (String) obj, false, map, size, cVar);
                                    }
                                }
                            };
                        }
                        com.taobao.tao.flexbox.layoutmanager.ac.a.a().a(str, false, bVar);
                    }
                }
            }
        }
    }

    private static void b(String str, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("278ac97a", new Object[]{str, bArr});
        } else {
            com.taobao.tao.flexbox.layoutmanager.adapter.a.a().q().a(str, bArr);
        }
    }

    private static void c(final List list, final Map map, final g.c cVar, List list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74b195e6", new Object[]{list, map, cVar, list2});
        } else if (list2 != null) {
            oec.a(list2, new aa.c<Object>() { // from class: com.taobao.android.layoutmanager.module.PreloadModule.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.flexbox.layoutmanager.core.aa.c
                public boolean b(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("f056ab89", new Object[]{this, obj})).booleanValue();
                    }
                    return false;
                }

                @Override // com.taobao.tao.flexbox.layoutmanager.core.aa.c
                public boolean a(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("a6251248", new Object[]{this, obj})).booleanValue() : !(obj instanceof String) || TextUtils.isEmpty((String) obj);
                }
            });
            final int size = list2.size();
            for (final Object obj : list2) {
                o<com.airbnb.lottie.g> a2 = h.a(cVar.a(), (String) obj);
                if (list != null && map != null) {
                    a2.c(new j<Throwable>() { // from class: com.taobao.android.layoutmanager.module.PreloadModule.6
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.airbnb.lottie.j
                        public /* synthetic */ void onResult(Throwable th) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("8251d27f", new Object[]{this, th});
                            } else {
                                a(th);
                            }
                        }

                        public void a(Throwable th) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("fb9ad88d", new Object[]{this, th});
                            } else {
                                PreloadModule.a(list, (String) obj, false, map, size, cVar);
                            }
                        }
                    });
                    a2.a(new j<com.airbnb.lottie.g>() { // from class: com.taobao.android.layoutmanager.module.PreloadModule.7
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.airbnb.lottie.j
                        public /* synthetic */ void onResult(com.airbnb.lottie.g gVar) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("8251d27f", new Object[]{this, gVar});
                            } else {
                                a(gVar);
                            }
                        }

                        public void a(com.airbnb.lottie.g gVar) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("471c924d", new Object[]{this, gVar});
                            } else {
                                PreloadModule.a(list, (String) obj, true, map, size, cVar);
                            }
                        }
                    });
                }
            }
        }
    }

    private static void b(List<Map> list, String str, boolean z, Map map, int i, g.c cVar) {
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("967f85f1", new Object[]{list, str, new Boolean(z), map, new Integer(i), cVar});
        } else if (list == null || map == null) {
        } else {
            Map map2 = (Map) map.get("result");
            HashMap hashMap = new HashMap();
            hashMap.put("succeed", Boolean.valueOf(z));
            map2.put(str, hashMap);
            if (map2.size() != i) {
                return;
            }
            map.put(com.taobao.android.weex_framework.util.a.ATOM_done, true);
            if (cVar.c == null) {
                return;
            }
            Iterator<Map> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!oec.a(it.next().get(com.taobao.android.weex_framework.util.a.ATOM_done), false)) {
                        z2 = false;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (!z2) {
                return;
            }
            cVar.c.a(cVar, list);
        }
    }

    private static void d(final List list, final Map map, final g.c cVar, List list2) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a468c9e7", new Object[]{list, map, cVar, list2});
        } else if (list2 == null) {
        } else {
            oec.a(list2, new aa.c<Object>() { // from class: com.taobao.android.layoutmanager.module.PreloadModule.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.flexbox.layoutmanager.core.aa.c
                public boolean b(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("f056ab89", new Object[]{this, obj})).booleanValue();
                    }
                    return false;
                }

                @Override // com.taobao.tao.flexbox.layoutmanager.core.aa.c
                public boolean a(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("a6251248", new Object[]{this, obj})).booleanValue() : !(obj instanceof JSONObject) || !((Map) obj).containsKey("url");
                }
            });
            final int size = list2.size();
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                JSONObject jSONObject = (JSONObject) it.next();
                final String string = jSONObject.getString("url");
                int intValue = jSONObject.getIntValue("width");
                int intValue2 = jSONObject.getIntValue("height");
                int a2 = intValue > 0 ? ogl.a(cVar.f19938a.A(), cVar.a(), Integer.valueOf(intValue)) : -1;
                int a3 = intValue2 > 0 ? ogl.a(cVar.f19938a.A(), cVar.a(), Integer.valueOf(intValue2)) : -1;
                String string2 = jSONObject.getString("type");
                String string3 = jSONObject.getString("mode");
                boolean booleanValue = jSONObject.getBooleanValue(BlobManager.UPLOAD_IMAGE_TYPE_WEBP);
                Boolean bool = jSONObject.getBoolean("enable-quality");
                Boolean bool2 = jSONObject.getBoolean("enable-sharpen");
                Boolean bool3 = jSONObject.getBoolean("enable-level-model");
                String string4 = jSONObject.getString("image-quality");
                String string5 = jSONObject.getString("image-sharpen");
                int a4 = ogj.a(jSONObject.getString("priority"));
                if (Constants.Value.ORIGINAL.equals(string3)) {
                    i = 1;
                } else if (CommonCode.MapKey.HAS_RESOLUTION.equals(string3)) {
                    i = 512;
                } else {
                    i = "shortside".equals(string3) ? 2 : 0;
                }
                if (booleanValue) {
                    i |= 4;
                }
                if (bool != null) {
                    i = bool.booleanValue() ? i | 8 : i | 16;
                }
                if (bool2 != null) {
                    i = bool2.booleanValue() ? i | 32 : i | 64;
                }
                if (bool3 != null) {
                    i = bool3.booleanValue() ? i | 128 : i | 256;
                }
                ImageLoader.a a5 = new ImageLoader.a.C0835a().a(i).a(string4).b(string5).c(string2).b(true).a(false).f("preload").e(cVar.f19938a.A().c().a().a()).c(a4).a();
                String a6 = ogw.a(cVar.f19938a, cVar.a(), string, a2, a3, a5, false);
                ImageLoader i2 = com.taobao.tao.flexbox.layoutmanager.adapter.a.a().i();
                ogw.a aVar = null;
                if (list != null && map != null) {
                    aVar = new ogw.a() { // from class: com.taobao.android.layoutmanager.module.PreloadModule.9
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // tb.ogw.a
                        public void a(Object obj, Drawable drawable) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("91476368", new Object[]{this, obj, drawable});
                            } else {
                                PreloadModule.a(list, string, true, map, size, cVar);
                            }
                        }

                        @Override // tb.ogw.a
                        public void a(Object obj, int i3) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("1e7da93f", new Object[]{this, obj, new Integer(i3)});
                            } else {
                                PreloadModule.a(list, string, false, map, size, cVar);
                            }
                        }
                    };
                }
                ogw.a(i2, cVar.f19938a, string, a6, a2, a3, a5, null, false, true, aVar);
            }
        }
    }
}
