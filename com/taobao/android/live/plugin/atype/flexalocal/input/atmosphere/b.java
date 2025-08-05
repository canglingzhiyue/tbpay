package com.taobao.android.live.plugin.atype.flexalocal.input.atmosphere;

import android.os.AsyncTask;
import android.util.SparseArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.context.atmo.bean.AtmosphereResListResponseData;
import com.taobao.alilive.aliliveframework.context.atmo.bean.EffectResConfig;
import com.taobao.alilive.aliliveframework.frame.a;
import java.util.HashMap;
import java.util.List;
import tb.ffg;
import tb.gwy;
import tb.kge;

/* loaded from: classes6.dex */
public class b extends AsyncTask<Void, Void, List<EffectResConfig>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private AtmosphereResListResponseData.AtmosphereResItem f13915a;
    private SparseArray<HashMap<String, List<EffectResConfig>>> b;
    private HashMap<String, List<EffectResConfig>> c;
    private gwy d;
    private a e;

    static {
        kge.a(1601305085);
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.List<com.taobao.alilive.aliliveframework.context.atmo.bean.EffectResConfig>, java.lang.Object] */
    @Override // android.os.AsyncTask
    public /* synthetic */ List<EffectResConfig> doInBackground(Void[] voidArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("e83e4786", new Object[]{this, voidArr}) : a(voidArr);
    }

    @Override // android.os.AsyncTask
    public /* synthetic */ void onPostExecute(List<EffectResConfig> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b105c779", new Object[]{this, list});
        } else {
            a(list);
        }
    }

    public b(a aVar, AtmosphereResListResponseData.AtmosphereResItem atmosphereResItem, SparseArray<HashMap<String, List<EffectResConfig>>> sparseArray, HashMap<String, List<EffectResConfig>> hashMap) {
        this.e = aVar;
        this.f13915a = atmosphereResItem;
        this.b = sparseArray;
        this.c = hashMap;
    }

    public b(a aVar, AtmosphereResListResponseData.AtmosphereResItem atmosphereResItem, SparseArray<HashMap<String, List<EffectResConfig>>> sparseArray, HashMap<String, List<EffectResConfig>> hashMap, gwy gwyVar) {
        this.e = aVar;
        this.f13915a = atmosphereResItem;
        this.b = sparseArray;
        this.c = hashMap;
        this.d = gwyVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List<com.taobao.alilive.aliliveframework.context.atmo.bean.EffectResConfig> a(java.lang.Void... r9) {
        /*
            r8 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.live.plugin.atype.flexalocal.input.atmosphere.b.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L18
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r8
            r2 = 1
            r1[r2] = r9
            java.lang.String r9 = "ed23ac73"
            java.lang.Object r9 = r0.ipc$dispatch(r9, r1)
            java.util.List r9 = (java.util.List) r9
            return r9
        L18:
            r9 = 0
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> La8 java.lang.Exception -> Lbd
            com.taobao.alilive.aliliveframework.context.atmo.bean.AtmosphereResListResponseData$AtmosphereResItem r1 = r8.f13915a     // Catch: java.lang.Throwable -> La8 java.lang.Exception -> Lbd
            java.lang.String r1 = r1.file     // Catch: java.lang.Throwable -> La8 java.lang.Exception -> Lbd
            java.lang.String r2 = "config.json"
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> La8 java.lang.Exception -> Lbd
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> La8 java.lang.Exception -> Lbd
            r1.<init>(r0)     // Catch: java.lang.Throwable -> La8 java.lang.Exception -> Lbd
            java.nio.channels.FileChannel r0 = r1.getChannel()     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> La6
            long r2 = r0.size()     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> L9f
            int r3 = (int) r2     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> L9f
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r3)     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> L9f
            r0.read(r2)     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> L9f
            byte[] r2 = r2.array()     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> L9f
            java.lang.String r3 = new java.lang.String     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> L9f
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> L9f
            java.lang.Class<com.taobao.alilive.aliliveframework.context.atmo.bean.EffectResConfig> r2 = com.taobao.alilive.aliliveframework.context.atmo.bean.EffectResConfig.class
            java.util.List r9 = tb.pqj.b(r3, r2)     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> L9f
            if (r9 == 0) goto L8d
            java.util.Iterator r2 = r9.iterator()     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> L9f
        L4e:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> L9f
            if (r3 == 0) goto L8d
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> L9f
            com.taobao.alilive.aliliveframework.context.atmo.bean.EffectResConfig r3 = (com.taobao.alilive.aliliveframework.context.atmo.bean.EffectResConfig) r3     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> L9f
            java.lang.String r4 = r3.effectRes     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> L9f
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> L9f
            if (r4 != 0) goto L73
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> L9f
            com.taobao.alilive.aliliveframework.context.atmo.bean.AtmosphereResListResponseData$AtmosphereResItem r5 = r8.f13915a     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> L9f
            java.lang.String r5 = r5.file     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> L9f
            java.lang.String r6 = r3.effectRes     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> L9f
            r4.<init>(r5, r6)     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> L9f
            java.lang.String r4 = r4.getAbsolutePath()     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> L9f
            r3.effectRes = r4     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> L9f
        L73:
            java.lang.String r4 = r3.thumbnail     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> L9f
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> L9f
            if (r4 != 0) goto L4e
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> L9f
            com.taobao.alilive.aliliveframework.context.atmo.bean.AtmosphereResListResponseData$AtmosphereResItem r5 = r8.f13915a     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> L9f
            java.lang.String r5 = r5.file     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> L9f
            java.lang.String r6 = r3.thumbnail     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> L9f
            r4.<init>(r5, r6)     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> L9f
            java.lang.String r4 = r4.getAbsolutePath()     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> L9f
            r3.thumbnail = r4     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> L9f
            goto L4e
        L8d:
            if (r0 == 0) goto L92
            r0.close()     // Catch: java.lang.Exception -> L95
        L92:
            r1.close()     // Catch: java.lang.Exception -> L95
        L95:
            if (r9 != 0) goto Ld2
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            goto Ld2
        L9d:
            r2 = move-exception
            goto Lab
        L9f:
            r7 = r0
            r0 = r9
            r9 = r7
            goto Lbf
        La3:
            r2 = move-exception
            r0 = r9
            goto Lab
        La6:
            r0 = r9
            goto Lbf
        La8:
            r2 = move-exception
            r0 = r9
            r1 = r0
        Lab:
            if (r0 == 0) goto Lb0
            r0.close()     // Catch: java.lang.Exception -> Lb5
        Lb0:
            if (r1 == 0) goto Lb5
            r1.close()     // Catch: java.lang.Exception -> Lb5
        Lb5:
            if (r9 != 0) goto Lbc
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
        Lbc:
            throw r2
        Lbd:
            r0 = r9
            r1 = r0
        Lbf:
            if (r9 == 0) goto Lc4
            r9.close()     // Catch: java.lang.Exception -> Lc9
        Lc4:
            if (r1 == 0) goto Lc9
            r1.close()     // Catch: java.lang.Exception -> Lc9
        Lc9:
            if (r0 != 0) goto Ld1
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            goto Ld2
        Ld1:
            r9 = r0
        Ld2:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.live.plugin.atype.flexalocal.input.atmosphere.b.a(java.lang.Void[]):java.util.List");
    }

    public void a(List<EffectResConfig> list) {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else if (list == null) {
        } else {
            HashMap<String, List<EffectResConfig>> hashMap = new HashMap<>();
            hashMap.put(this.f13915a.matchKey, list);
            this.c.putAll(hashMap);
            this.b.put(this.f13915a.resUrl.hashCode(), hashMap);
            if (this.d == null || (aVar = this.e) == null || !(aVar.I() instanceof ffg)) {
                return;
            }
            this.d.onEffectResLoaded(((ffg) this.e.I()).a(list));
        }
    }
}
