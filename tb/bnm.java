package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.common.util.SymbolExpUtil;

/* loaded from: classes2.dex */
public class bnm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f26001a;
    private bnl b;
    private Map<String, List<String>> c = new HashMap();

    static {
        kge.a(1724693679);
    }

    public bnm(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("param context can not be null");
        }
        this.f26001a = context;
        this.b = new a();
        a();
    }

    public void a(bnl bnlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2100d38", new Object[]{this, bnlVar});
            return;
        }
        this.b = bnlVar;
        a();
    }

    public void b(bnl bnlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d09313b9", new Object[]{this, bnlVar});
            return;
        }
        this.c.clear();
        a(bnlVar);
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        bnl bnlVar = this.b;
        if (bnlVar == null) {
            return;
        }
        JSONObject a2 = a(bnlVar.a(), this.f26001a);
        if (a2 != null) {
            for (String str : a2.keySet()) {
                String string = a2.getString(str);
                if (!TextUtils.isEmpty(string)) {
                    a(str, string.split(SymbolExpUtil.SYMBOL_VERTICALBAR));
                }
            }
        }
        a(this.b.b());
    }

    public void a(Map<String, List<String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else if (map == null || map.size() <= 0) {
        } else {
            this.c.putAll(map);
        }
    }

    public void a(String str, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d04957ad", new Object[]{this, str, strArr});
        } else if (TextUtils.isEmpty(str) || strArr == null || strArr.length <= 0) {
        } else {
            this.c.put(str, a(strArr));
        }
    }

    private List<String> a(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a10d1db0", new Object[]{this, strArr});
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(str);
        }
        return arrayList;
    }

    public List<String> a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("287b5bd5", new Object[]{this, str}) : this.c.get(str);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    private com.alibaba.fastjson.JSONObject a(java.lang.String r8, android.content.Context r9) {
        /*
            r7 = this;
            java.lang.String r0 = "closeThemeConfigStream"
            java.lang.String r1 = "Ultron"
            com.android.alibaba.ip.runtime.IpChange r2 = tb.bnm.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            r4 = 1
            if (r3 == 0) goto L1f
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r7
            r0[r4] = r8
            r8 = 2
            r0[r8] = r9
            java.lang.String r8 = "ad1cef6"
            java.lang.Object r8 = r2.ipc$dispatch(r8, r0)
            com.alibaba.fastjson.JSONObject r8 = (com.alibaba.fastjson.JSONObject) r8
            return r8
        L1f:
            boolean r2 = android.text.TextUtils.isEmpty(r8)
            r3 = 0
            if (r2 == 0) goto L27
            return r3
        L27:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L69
            r2.<init>()     // Catch: java.lang.Throwable -> L69
            android.content.res.AssetManager r9 = r9.getAssets()     // Catch: java.lang.Throwable -> L69
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L69
            java.io.InputStream r8 = com.taobao.codetrack.sdk.assets.AssetsDelegate.proxy_open(r9, r8)     // Catch: java.lang.Throwable -> L69
            r5.<init>(r8)     // Catch: java.lang.Throwable -> L69
            java.io.BufferedReader r8 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L62
            r8.<init>(r5)     // Catch: java.lang.Throwable -> L62
        L3e:
            java.lang.String r9 = r8.readLine()     // Catch: java.lang.Throwable -> L5d
            if (r9 == 0) goto L48
            r2.append(r9)     // Catch: java.lang.Throwable -> L5d
            goto L3e
        L48:
            java.lang.String r9 = r2.toString()     // Catch: java.lang.Throwable -> L5d
            com.alibaba.fastjson.JSONObject r3 = com.alibaba.fastjson.JSONObject.parseObject(r9)     // Catch: java.lang.Throwable -> L5d
            boolean r9 = tb.jqi.a(r1, r0, r4)
            if (r9 == 0) goto L8f
            r5.close()     // Catch: java.lang.Throwable -> L8f
        L59:
            r8.close()     // Catch: java.lang.Throwable -> L8f
            goto L8f
        L5d:
            r9 = move-exception
            goto L6c
        L5f:
            r9 = move-exception
            r8 = r3
            goto L91
        L62:
            r9 = move-exception
            r8 = r3
            goto L6c
        L65:
            r9 = move-exception
            r8 = r3
            r5 = r8
            goto L91
        L69:
            r9 = move-exception
            r8 = r3
            r5 = r8
        L6c:
            tb.jpu r2 = tb.jpu.a(r1)     // Catch: java.lang.Throwable -> L90
            java.lang.String r6 = "ThemeManager"
            tb.jpu r2 = r2.c(r6)     // Catch: java.lang.Throwable -> L90
            java.lang.String r9 = r9.getMessage()     // Catch: java.lang.Throwable -> L90
            tb.jpu r9 = r2.b(r9)     // Catch: java.lang.Throwable -> L90
            tb.jpr.a(r9)     // Catch: java.lang.Throwable -> L90
            boolean r9 = tb.jqi.a(r1, r0, r4)
            if (r9 == 0) goto L8f
            if (r5 == 0) goto L8c
            r5.close()     // Catch: java.lang.Throwable -> L8f
        L8c:
            if (r8 == 0) goto L8f
            goto L59
        L8f:
            return r3
        L90:
            r9 = move-exception
        L91:
            boolean r0 = tb.jqi.a(r1, r0, r4)
            if (r0 == 0) goto La1
            if (r5 == 0) goto L9c
            r5.close()     // Catch: java.lang.Throwable -> La1
        L9c:
            if (r8 == 0) goto La1
            r8.close()     // Catch: java.lang.Throwable -> La1
        La1:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.bnm.a(java.lang.String, android.content.Context):com.alibaba.fastjson.JSONObject");
    }

    /* loaded from: classes2.dex */
    public static class a implements bnl {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String PATH = "theme/configuration.json";

        static {
            kge.a(-1980903126);
            kge.a(-990204072);
        }

        @Override // tb.bnl
        public String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : PATH;
        }

        @Override // tb.bnl
        public Map<String, List<String>> b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[]{this});
            }
            return null;
        }

        private a() {
        }
    }
}
