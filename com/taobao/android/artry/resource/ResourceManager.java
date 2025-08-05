package com.taobao.android.artry.resource;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Log;
import android.util.LruCache;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.artry.constants.ResultCode;
import com.taobao.android.artry.resource.a;
import com.taobao.android.artry.resource.d;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes4.dex */
public class ResourceManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private File f9055a;
    private Object b;
    private boolean c;
    private Context d;
    private LruCache<String, Bitmap> e;

    /* loaded from: classes4.dex */
    public enum ResourceType {
        IMAGE,
        SO,
        MODEL,
        EFFECT,
        AR_PLAYER,
        ZIP_FILE,
        GRAPH_FILE
    }

    /* loaded from: classes4.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final ResourceManager f9059a;

        static {
            kge.a(-1142962551);
            f9059a = new ResourceManager();
        }

        public static /* synthetic */ ResourceManager a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ResourceManager) ipChange.ipc$dispatch("f2a14623", new Object[0]) : f9059a;
        }
    }

    static {
        kge.a(1681279414);
    }

    private ResourceManager() {
        this.b = new Object();
        this.c = false;
    }

    public static ResourceManager a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ResourceManager) ipChange.ipc$dispatch("f2a14623", new Object[0]) : b.a();
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else {
            a(context, 3145728);
        }
    }

    public void a(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("258f9aa3", new Object[]{this, context, new Integer(i)});
        } else if (context == null) {
        } else {
            synchronized (this.b) {
                if (this.c) {
                    return;
                }
                this.c = true;
                this.d = context.getApplicationContext();
                this.f9055a = new File(this.d.getCacheDir(), "ARTry_cache");
                if (i <= 0) {
                    i = 3145728;
                }
                this.e = new LruCache<String, Bitmap>(i) { // from class: com.taobao.android.artry.resource.ResourceManager.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.util.LruCache
                    public /* synthetic */ int sizeOf(String str, Bitmap bitmap) {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("33c6036a", new Object[]{this, str, bitmap})).intValue() : a(str, bitmap);
                    }

                    public int a(String str, Bitmap bitmap) {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("c58b8a2f", new Object[]{this, str, bitmap})).intValue() : bitmap.getByteCount();
                    }
                };
            }
        }
    }

    private boolean b() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        synchronized (this.b) {
            z = this.c;
        }
        return z;
    }

    public File a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("c26a5a1b", new Object[]{this, str});
        }
        if (!b() || TextUtils.isEmpty(str)) {
            return null;
        }
        File file = new File(this.f9055a, str);
        if (file.exists()) {
            return file;
        }
        file.mkdirs();
        return file;
    }

    private String a(ResourceType resourceType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("db80d01f", new Object[]{this, resourceType});
        }
        if (resourceType == null) {
            return null;
        }
        switch (resourceType) {
            case IMAGE:
                return "images";
            case SO:
                return "so_files";
            case MODEL:
                return "model_files";
            case EFFECT:
                return "effect_files";
            case AR_PLAYER:
                return "ar_player_files";
            case ZIP_FILE:
                return "zip_files";
            case GRAPH_FILE:
                return "graph_files";
            default:
                return null;
        }
    }

    public com.taobao.android.artry.resource.a a(List<ResourceType> list, String str, List<String> list2, a.b bVar) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.artry.resource.a) ipChange.ipc$dispatch("fa44b170", new Object[]{this, list, str, list2, bVar});
        }
        if (b() && !TextUtils.isEmpty(str) && !com.taobao.android.artry.utils.d.a(list2)) {
            try {
                a.C0350a c0350a = new a.C0350a(str, this.f9055a.getAbsolutePath());
                for (String str2 : list2) {
                    if (com.taobao.android.artry.utils.d.a(str2)) {
                        String b2 = b(str2);
                        String a2 = a(list.get(i));
                        c0350a.a(str2, a2 + File.separator + b2);
                    }
                    i++;
                }
                c0350a.a(bVar);
                com.taobao.android.artry.resource.a a3 = c0350a.a();
                a3.a();
                return a3;
            } catch (Throwable th) {
                Log.e("ResourceManager", "downloadResource failed..." + th);
            }
        }
        return null;
    }

    public void a(String str, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1aa3523", new Object[]{this, str, list});
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(ResourceType.IMAGE);
            }
        }
        a(arrayList, str, list, new com.taobao.android.artry.resource.b());
    }

    public void a(List<e> list, com.taobao.android.artry.common.a<List<e>> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("217c4a13", new Object[]{this, list, aVar});
        } else if (com.taobao.android.artry.utils.d.a(list)) {
            com.taobao.android.artry.common.c.a(false, (com.taobao.android.artry.common.a) aVar);
        } else {
            d.a().a(this.d);
            d.a().a(list, new a(aVar));
        }
    }

    public String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str});
        }
        if (!com.taobao.android.artry.utils.d.a(str)) {
            return null;
        }
        String a2 = com.taobao.android.artry.utils.c.a(str);
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        return "artry_" + a2;
    }

    /* loaded from: classes4.dex */
    public class a implements d.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private com.taobao.android.artry.common.a<List<e>> b;

        static {
            kge.a(731079110);
            kge.a(2093500195);
        }

        private a(com.taobao.android.artry.common.a<List<e>> aVar) {
            this.b = aVar;
        }

        @Override // com.taobao.android.artry.resource.d.a
        public void a(List<e> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            } else {
                com.taobao.android.artry.common.c.a(true, ResultCode.SUCCESS, list, this.b);
            }
        }
    }
}
