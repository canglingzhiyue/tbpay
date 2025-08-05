package com.taobao.runtimepermission.group.strategy;

import android.content.Context;
import android.os.Build;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.util.al;
import com.taobao.runtimepermission.group.a;
import com.taobao.runtimepermission.group.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.nml;

/* loaded from: classes7.dex */
public class f extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, String> f18996a = a();
    private final Map<String, String> b = b();

    public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ Map a(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("cec4a879", new Object[]{fVar}) : fVar.b;
    }

    public static /* synthetic */ com.taobao.runtimepermission.group.d b(com.taobao.runtimepermission.d dVar, Map map, String[] strArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.runtimepermission.group.d) ipChange.ipc$dispatch("31a7263", new Object[]{dVar, map, strArr}) : d(dVar, map, strArr);
    }

    public static /* synthetic */ com.taobao.runtimepermission.group.d c(com.taobao.runtimepermission.d dVar, Map map, String[] strArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.runtimepermission.group.d) ipChange.ipc$dispatch("c84c63c2", new Object[]{dVar, map, strArr}) : e(dVar, map, strArr);
    }

    @Override // com.taobao.runtimepermission.group.a
    public com.taobao.runtimepermission.group.d a(Context context, String str, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.runtimepermission.group.d) ipChange.ipc$dispatch("979a33f7", new Object[]{this, context, str, strArr});
        }
        if (Build.VERSION.SDK_INT >= 34) {
            return b(context, str, strArr);
        }
        if (Build.VERSION.SDK_INT == 33) {
            return c(context, str, strArr);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return d(context, str, strArr);
        }
        return e(context, str, strArr);
    }

    @Override // com.taobao.runtimepermission.group.a
    public void a(com.taobao.runtimepermission.group.c cVar, e.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596070b7", new Object[]{this, cVar, aVar});
        } else if (Build.VERSION.SDK_INT >= 34) {
            b(cVar, aVar);
        } else if (Build.VERSION.SDK_INT == 33) {
            c(cVar, aVar);
        } else if (Build.VERSION.SDK_INT >= 29) {
            d(cVar, aVar);
        } else {
            e(cVar, aVar);
        }
    }

    private static Map<String, String> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a014a89d", new Object[0]) : Collections.unmodifiableMap(new HashMap<String, String>() { // from class: com.taobao.runtimepermission.group.strategy.MediaPermissionStrategy$1
            {
                put("READ_IMAGES", "android.permission.READ_EXTERNAL_STORAGE");
                put("WRITE_IMAGES", "android.permission.WRITE_EXTERNAL_STORAGE");
                put("READ_VIDEO", "android.permission.READ_EXTERNAL_STORAGE");
                put("WRITE_VIDEO", "android.permission.WRITE_EXTERNAL_STORAGE");
                put("READ_AUDIO", "android.permission.READ_EXTERNAL_STORAGE");
                put("WRITE_AUDIO", "android.permission.WRITE_EXTERNAL_STORAGE");
            }
        });
    }

    private static Map<String, String> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[0]) : Collections.unmodifiableMap(new HashMap<String, String>() { // from class: com.taobao.runtimepermission.group.strategy.MediaPermissionStrategy$2
            {
                put("READ_IMAGES", al.READ_MEDIA_IMAGES);
                put("WRITE_IMAGES", "android.permission.WRITE_EXTERNAL_STORAGE");
                put("READ_VIDEO", al.READ_MEDIA_VIDEO);
                put("WRITE_VIDEO", "android.permission.WRITE_EXTERNAL_STORAGE");
                put("READ_AUDIO", "android.permission.READ_MEDIA_AUDIO");
                put("WRITE_AUDIO", "android.permission.WRITE_EXTERNAL_STORAGE");
            }
        });
    }

    private com.taobao.runtimepermission.group.d b(Context context, String str, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.runtimepermission.group.d) ipChange.ipc$dispatch("c101acd6", new Object[]{this, context, str, strArr});
        }
        List<String> b = b(this.b, strArr);
        if (b.isEmpty()) {
            return a(strArr);
        }
        com.taobao.runtimepermission.d a2 = com.taobao.runtimepermission.f.a(context, str, (String[]) b.toArray(new String[0]));
        com.taobao.runtimepermission.d a3 = com.taobao.runtimepermission.f.a(context, str, new String[]{al.READ_MEDIA_VISUAL_USER_SELECTED});
        if (a2 == null || a3 == null) {
            return new com.taobao.runtimepermission.group.d(false, null, "UNKNOWN_BIZ_ERROR", "permission result is null");
        }
        return a(a2, a3, this.b, strArr);
    }

    private com.taobao.runtimepermission.group.d c(Context context, String str, String[] strArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.runtimepermission.group.d) ipChange.ipc$dispatch("ea6925b5", new Object[]{this, context, str, strArr}) : a(this.b, context, str, strArr);
    }

    private com.taobao.runtimepermission.group.d d(Context context, String str, String[] strArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.runtimepermission.group.d) ipChange.ipc$dispatch("13d09e94", new Object[]{this, context, str, strArr}) : a(this.f18996a, context, str, strArr);
    }

    private com.taobao.runtimepermission.group.d e(Context context, String str, String[] strArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.runtimepermission.group.d) ipChange.ipc$dispatch("3d381773", new Object[]{this, context, str, strArr}) : a(context, str, strArr, this.f18996a);
    }

    private void b(final com.taobao.runtimepermission.group.c cVar, final e.a aVar) {
        String[] strArr;
        nml nmlVar;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc4a78", new Object[]{this, cVar, aVar});
            return;
        }
        List<String> b = b(this.b, cVar.b);
        if (b.isEmpty()) {
            aVar.a(a(cVar.b));
            return;
        }
        Iterator<String> it = b.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            String next = it.next();
            if (!al.READ_MEDIA_IMAGES.equals(next)) {
                if (al.READ_MEDIA_VIDEO.equals(next)) {
                    break;
                }
            } else {
                break;
            }
        }
        if (!z) {
            strArr = (String[]) b.toArray(new String[0]);
            nmlVar = new nml() { // from class: com.taobao.runtimepermission.group.strategy.f.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.nml
                public void a(com.taobao.runtimepermission.d dVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c1d4ff8e", new Object[]{this, dVar});
                    } else {
                        aVar.a(f.b(dVar, f.a(f.this), cVar.b));
                    }
                }
            };
        } else {
            b.add(al.READ_MEDIA_VISUAL_USER_SELECTED);
            strArr = (String[]) b.toArray(new String[0]);
            nmlVar = new nml() { // from class: com.taobao.runtimepermission.group.strategy.f.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.nml
                public void a(com.taobao.runtimepermission.d dVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c1d4ff8e", new Object[]{this, dVar});
                    } else {
                        aVar.a(f.c(dVar, f.a(f.this), cVar.b));
                    }
                }
            };
        }
        a(strArr, cVar, nmlVar);
    }

    private void c(com.taobao.runtimepermission.group.c cVar, e.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8582439", new Object[]{this, cVar, aVar});
        } else {
            a(this.b, cVar, aVar);
        }
    }

    private void d(com.taobao.runtimepermission.group.c cVar, e.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fd3fdfa", new Object[]{this, cVar, aVar});
        } else {
            a(this.f18996a, cVar, aVar);
        }
    }

    private void e(com.taobao.runtimepermission.group.c cVar, e.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f74fd7bb", new Object[]{this, cVar, aVar});
        } else {
            a(cVar, aVar, this.f18996a);
        }
    }

    private void a(final Map<String, String> map, final com.taobao.runtimepermission.group.c cVar, final e.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57314dac", new Object[]{this, map, cVar, aVar});
            return;
        }
        List<String> b = b(map, cVar.b);
        if (b.isEmpty()) {
            aVar.a(a(cVar.b));
        } else {
            a((String[]) b.toArray(new String[0]), cVar, new nml() { // from class: com.taobao.runtimepermission.group.strategy.f.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.nml
                public void a(com.taobao.runtimepermission.d dVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c1d4ff8e", new Object[]{this, dVar});
                    } else {
                        aVar.a(f.b(dVar, map, cVar.b));
                    }
                }
            });
        }
    }

    private void a(String[] strArr, com.taobao.runtimepermission.group.c cVar, nml nmlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10a0b011", new Object[]{this, strArr, cVar, nmlVar});
        } else {
            com.taobao.runtimepermission.f.a(cVar.f18992a, strArr).a(cVar.e).b(cVar.f).a(cVar.d).b(cVar.c).a(cVar.g).a(nmlVar).a();
        }
    }

    private static com.taobao.runtimepermission.group.d a(Map<String, String> map, Context context, String str, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.runtimepermission.group.d) ipChange.ipc$dispatch("6267222", new Object[]{map, context, str, strArr});
        }
        List<String> b = b(map, strArr);
        if (b.isEmpty()) {
            return a(strArr);
        }
        com.taobao.runtimepermission.d a2 = com.taobao.runtimepermission.f.a(context, str, (String[]) b.toArray(new String[0]));
        if (a2 == null) {
            return new com.taobao.runtimepermission.group.d(false, null, "UNKNOWN_BIZ_ERROR", "permission result is null");
        }
        return d(a2, map, strArr);
    }

    private static com.taobao.runtimepermission.group.d a(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.runtimepermission.group.d) ipChange.ipc$dispatch("f5109835", new Object[]{strArr});
        }
        HashMap hashMap = new HashMap();
        for (String str : strArr) {
            hashMap.put(str, "AUTHORIZED");
        }
        return new com.taobao.runtimepermission.group.d(true, hashMap, null, null);
    }

    private static com.taobao.runtimepermission.group.d d(com.taobao.runtimepermission.d dVar, Map<String, String> map, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.runtimepermission.group.d) ipChange.ipc$dispatch("8d7e5521", new Object[]{dVar, map, strArr});
        }
        HashMap hashMap = new HashMap();
        for (String str : strArr) {
            String str2 = map.get(str);
            if ("android.permission.WRITE_EXTERNAL_STORAGE".equals(str2)) {
                hashMap.put(str, "AUTHORIZED");
            } else {
                int i = 0;
                while (true) {
                    if (i >= dVar.f18987a.length) {
                        break;
                    } else if (dVar.f18987a[i].equals(str2)) {
                        hashMap.put(str, a(dVar.b[i]));
                        break;
                    } else {
                        i++;
                    }
                }
                if (!hashMap.containsKey(str)) {
                    hashMap.put(str, "UNSUPPORTED");
                }
            }
        }
        return new com.taobao.runtimepermission.group.d(true, hashMap, null, null);
    }

    private static List<String> b(Map<String, String> map, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("59494c4", new Object[]{map, strArr});
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            String str2 = map.get(str);
            if (!"android.permission.WRITE_EXTERNAL_STORAGE".equals(str2) && !arrayList.contains(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    private static com.taobao.runtimepermission.group.d a(com.taobao.runtimepermission.d dVar, com.taobao.runtimepermission.d dVar2, Map<String, String> map, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.runtimepermission.group.d) ipChange.ipc$dispatch("ac447f1e", new Object[]{dVar, dVar2, map, strArr});
        }
        HashMap hashMap = new HashMap();
        for (String str : strArr) {
            String str2 = map.get(str);
            if ("android.permission.WRITE_EXTERNAL_STORAGE".equals(str2)) {
                hashMap.put(str, "AUTHORIZED");
            } else {
                int i = 0;
                while (true) {
                    if (i >= dVar.f18987a.length) {
                        break;
                    } else if (dVar.f18987a[i].equals(str2)) {
                        hashMap.put(str, a(dVar.b[i]));
                        break;
                    } else {
                        i++;
                    }
                }
                if (!hashMap.containsKey(str)) {
                    hashMap.put(str, "UNSUPPORTED");
                } else if ((al.READ_MEDIA_IMAGES.equals(str2) || al.READ_MEDIA_VIDEO.equals(str2)) && "DENIED".equals(hashMap.get(str)) && dVar2.b[0] == 0) {
                    hashMap.put(str, "PARTIAL_AUTHORIZED");
                }
            }
        }
        return new com.taobao.runtimepermission.group.d(true, hashMap, null, null);
    }

    private static com.taobao.runtimepermission.group.d e(com.taobao.runtimepermission.d dVar, Map<String, String> map, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.runtimepermission.group.d) ipChange.ipc$dispatch("52b04680", new Object[]{dVar, map, strArr});
        }
        int i = -1;
        for (int i2 = 0; i2 < dVar.f18987a.length; i2++) {
            if (al.READ_MEDIA_VISUAL_USER_SELECTED.equals(dVar.f18987a[i2])) {
                i = dVar.b[i2];
            }
        }
        return a(dVar, com.taobao.runtimepermission.d.a(new String[]{al.READ_MEDIA_VISUAL_USER_SELECTED}, new int[]{i}), map, strArr);
    }
}
