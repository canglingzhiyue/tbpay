package com.etao.feimagesearch.mnn.realtime;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.mnn.BaseMnnRunUnit;
import com.etao.feimagesearch.util.f;
import com.taobao.android.mnncv.MNNCVExecutor;
import com.taobao.mrt.task.MRTRuntimeException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Vector;
import kotlin.LazyThreadSafetyMode;
import kotlin.TypeCastException;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.t;
import tb.cof;
import tb.cot;
import tb.cox;
import tb.kge;
import tb.rwf;

/* loaded from: classes3.dex */
public final class i extends BaseMnnRunUnit<j, m> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final String TAG = "realtime_MnnRealtimeDetectUnit";
    public static final String TASK_NAME = "plt_search";
    private static final kotlin.d c;

    /* renamed from: a  reason: collision with root package name */
    private final int f6791a;
    private final int b;

    /* loaded from: classes3.dex */
    public static final class c implements MNNCVExecutor.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ com.etao.feimagesearch.mnn.d b;

        public c(com.etao.feimagesearch.mnn.d dVar) {
            this.b = dVar;
        }

        @Override // com.taobao.android.mnncv.MNNCVExecutor.b
        public void onResult(MRTRuntimeException mRTRuntimeException, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dce89cd6", new Object[]{this, mRTRuntimeException, map});
            } else {
                i.a(i.this, this.b, mRTRuntimeException, map);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class d implements MNNCVExecutor.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ HashMap b;
        public final /* synthetic */ com.etao.feimagesearch.mnn.d c;

        public d(HashMap hashMap, com.etao.feimagesearch.mnn.d dVar) {
            this.b = hashMap;
            this.c = dVar;
        }

        @Override // com.taobao.android.mnncv.MNNCVExecutor.b
        public void onResult(MRTRuntimeException mRTRuntimeException, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dce89cd6", new Object[]{this, mRTRuntimeException, map});
                return;
            }
            String str = "";
            if (mRTRuntimeException != null) {
                this.c.a((com.etao.feimagesearch.mnn.d) new m(null, null, new f(str, "errorCode: " + mRTRuntimeException.errorCode + ", errorMsg: " + mRTRuntimeException.getMessage())));
            } else if (map == null) {
            } else {
                cot.c(i.TAG, "result = " + JSON.toJSONString(map));
                if (map.get("feats") instanceof String) {
                    Object obj = map.get("feats");
                    if (obj == null) {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
                    }
                    str = (String) obj;
                }
                String extraInfo = com.etao.feimagesearch.mnn.utils.a.a(map);
                q.a((Object) extraInfo, "extraInfo");
                this.c.a((com.etao.feimagesearch.mnn.d) new m(null, null, new f(str, extraInfo)));
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class e implements MNNCVExecutor.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ HashMap b;
        public final /* synthetic */ float c;
        public final /* synthetic */ Bitmap d;
        public final /* synthetic */ com.etao.feimagesearch.mnn.d e;

        public e(HashMap hashMap, float f, Bitmap bitmap, com.etao.feimagesearch.mnn.d dVar) {
            this.b = hashMap;
            this.c = f;
            this.d = bitmap;
            this.e = dVar;
        }

        @Override // com.taobao.android.mnncv.MNNCVExecutor.b
        public void onResult(MRTRuntimeException mRTRuntimeException, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dce89cd6", new Object[]{this, mRTRuntimeException, map});
            } else {
                i.a(i.this, this.c, this.d, this.e, mRTRuntimeException, map);
            }
        }
    }

    public static /* synthetic */ Object ipc$super(i iVar, String str, Object... objArr) {
        if (str.hashCode() == 841311143) {
            super.a((com.etao.feimagesearch.mnn.k) objArr[0], (String) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* loaded from: classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ kotlin.reflect.k[] f6792a;

        static {
            kge.a(120188980);
            f6792a = new kotlin.reflect.k[]{t.a(new PropertyReference1Impl(t.b(a.class), "instance", "getInstance()Lcom/etao/feimagesearch/mnn/realtime/MnnRealtimeDetectUnit;"))};
        }

        public final i a() {
            Object value;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                value = ipChange.ipc$dispatch("522d9043", new Object[]{this});
            } else {
                kotlin.d a2 = i.a();
                a aVar = i.Companion;
                value = a2.getValue();
            }
            return (i) value;
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    private i() {
        super("plt_search");
        this.f6791a = com.etao.feimagesearch.config.b.aH();
        this.b = com.etao.feimagesearch.config.b.aI();
    }

    public /* synthetic */ i(o oVar) {
        this();
    }

    public static final /* synthetic */ kotlin.d a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (kotlin.d) ipChange.ipc$dispatch("bc9a1587", new Object[0]) : c;
    }

    public static final /* synthetic */ void a(i iVar, float f, Bitmap bitmap, com.etao.feimagesearch.mnn.d dVar, MRTRuntimeException mRTRuntimeException, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f29783c0", new Object[]{iVar, new Float(f), bitmap, dVar, mRTRuntimeException, map});
        } else {
            iVar.a(f, bitmap, dVar, mRTRuntimeException, map);
        }
    }

    public static final /* synthetic */ void a(i iVar, com.etao.feimagesearch.mnn.d dVar, MRTRuntimeException mRTRuntimeException, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79823d92", new Object[]{iVar, dVar, mRTRuntimeException, map});
        } else {
            iVar.a(dVar, mRTRuntimeException, map);
        }
    }

    @Override // com.etao.feimagesearch.mnn.BaseMnnRunUnit, com.etao.feimagesearch.mnn.e
    public /* bridge */ /* synthetic */ void a(Object obj, Object obj2, com.etao.feimagesearch.mnn.d dVar) {
        a((j) obj, obj2, (com.etao.feimagesearch.mnn.d<m>) dVar);
    }

    static {
        kge.a(637729772);
        Companion = new a(null);
        c = kotlin.e.a(LazyThreadSafetyMode.SYNCHRONIZED, MnnRealtimeDetectUnit$Companion$instance$2.INSTANCE);
    }

    /* loaded from: classes3.dex */
    public static final class b implements com.etao.feimagesearch.mnn.k {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ com.etao.feimagesearch.mnn.k f6793a;

        public b(com.etao.feimagesearch.mnn.k kVar) {
            this.f6793a = kVar;
        }

        @Override // com.etao.feimagesearch.mnn.k
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            cot.c(i.TAG, "onPrepareSuccess");
            cox.a(com.etao.feimagesearch.structure.capture.a.f6987a, "realtimeMnnBuildSuccess", 19999, new String[0]);
            this.f6793a.a();
        }

        @Override // com.etao.feimagesearch.mnn.k
        public void a(int i, String errorMsg) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), errorMsg});
                return;
            }
            q.c(errorMsg, "errorMsg");
            cot.b(i.TAG, "plt_search errorCode: " + i + ", errorMsg: " + errorMsg);
            this.f6793a.a(i, errorMsg);
            String str = com.etao.feimagesearch.structure.capture.a.f6987a;
            cox.a(str, "realtimeMnnBuildFailed", 19999, "errorCode", "" + i, "errorMsg", errorMsg);
        }
    }

    @Override // com.etao.feimagesearch.mnn.BaseMnnRunUnit, com.etao.feimagesearch.mnn.e
    public void a(com.etao.feimagesearch.mnn.k callback, String activityHashCode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("322563a7", new Object[]{this, callback, activityHashCode});
            return;
        }
        q.c(callback, "callback");
        q.c(activityHashCode, "activityHashCode");
        String b2 = cof.b(com.etao.feimagesearch.config.b.ADVANCE_AUTODETECT_EXPERIMENT);
        if (b2 == null) {
            b2 = "rsDefaultBucketId";
        }
        b(b2);
        super.a(new b(callback), activityHashCode);
    }

    public void a(j input, Object obj, com.etao.feimagesearch.mnn.d<m> callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6705e09a", new Object[]{this, input, obj, callback});
            return;
        }
        q.c(input, "input");
        q.c(callback, "callback");
        g a2 = input.a();
        if (a2 != null) {
            a(a2, callback);
            return;
        }
        com.etao.feimagesearch.mnn.realtime.a b2 = input.b();
        if (b2 != null) {
            a(b2, callback);
            return;
        }
        com.etao.feimagesearch.mnn.realtime.d c2 = input.c();
        if (c2 != null) {
            a(c2, callback);
        } else {
            callback.a(new RuntimeException("algoInput and imageInput is null"));
        }
    }

    private final void a(g gVar, com.etao.feimagesearch.mnn.d<m> dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2774d1e1", new Object[]{this, gVar, dVar});
            return;
        }
        f.c a2 = com.etao.feimagesearch.util.f.a(gVar.a(), gVar.c(), gVar.d(), gVar.g(), gVar.b());
        if (a2 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.etao.feimagesearch.util.DataProjector.CamDataInput");
        }
        Bitmap a3 = ((f.b) a2).b(gVar.e(), gVar.f()).a();
        if (a3 == null) {
            cot.b(TAG, "create bitmap failed");
            dVar.a((com.etao.feimagesearch.mnn.d<m>) new m(new h(null, null, null, null), null, null));
            return;
        }
        float b2 = rwf.b(gVar.e() / a3.getWidth(), gVar.f() / a3.getHeight());
        HashMap<String, Object> a4 = com.etao.feimagesearch.mnn.utils.a.a(a3);
        if (a4 != null) {
            cot.c(TAG, "prepare process...");
            a(a4, false, (MNNCVExecutor.b) new e(a4, b2, a3, dVar));
            return;
        }
        cot.b(TAG, "format is null");
        dVar.a((com.etao.feimagesearch.mnn.d<m>) new m(new h(null, null, null, null), null, null));
    }

    private final void a(float f, Bitmap bitmap, com.etao.feimagesearch.mnn.d<m> dVar, MRTRuntimeException mRTRuntimeException, Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b504ae5", new Object[]{this, new Float(f), bitmap, dVar, mRTRuntimeException, map});
        } else if (mRTRuntimeException != null) {
            cot.b(TAG, "runtimeException " + mRTRuntimeException.errorCode + ' ' + mRTRuntimeException.getMessage());
            cox.a(com.etao.feimagesearch.structure.capture.a.f6987a, "realtimeProcessImageException", 19999, "errorCode", String.valueOf(mRTRuntimeException.errorCode), "errorMsg", mRTRuntimeException.getMessage());
            dVar.a((com.etao.feimagesearch.mnn.d<m>) new m(new h(null, null, null, null), null, null));
        } else if (map == null) {
        } else {
            cox.a(com.etao.feimagesearch.structure.capture.a.f6987a, "realtimeProcessImageSuccess", 19999, new String[0]);
            String jSONString = JSON.toJSONString(map);
            q.a((Object) jSONString, "JSON.toJSONString(result)");
            cot.c(TAG, "result = " + jSONString);
            try {
                Object obj = map.get("action");
                if (!(obj instanceof ArrayList)) {
                    obj = null;
                }
                ArrayList arrayList = (ArrayList) obj;
                String a2 = com.etao.feimagesearch.mnn.utils.a.a(map);
                ArrayList arrayList2 = (ArrayList) map.get("objects");
                if (arrayList != null && arrayList2 != null && arrayList2.size() != 0) {
                    ArrayList arrayList3 = new ArrayList(arrayList2.size());
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        Map<String, ? extends Object> rtObject = (Map) it.next();
                        q.a((Object) rtObject, "rtObject");
                        l a3 = a(rtObject, bitmap, f);
                        if (a3 != null) {
                            arrayList3.add(a3);
                            Integer e2 = a3.e();
                            if (e2 != null && e2.intValue() == 1) {
                                z = true;
                            }
                        }
                    }
                    if (arrayList3.size() > 0) {
                        if (!z) {
                            bitmap = null;
                        }
                        dVar.a((com.etao.feimagesearch.mnn.d<m>) new m(new h(arrayList, arrayList3, bitmap, a2), null, null));
                        return;
                    }
                    cot.c(TAG, "add no element");
                    dVar.a((com.etao.feimagesearch.mnn.d<m>) new m(new h(null, null, null, null), null, null));
                    return;
                }
                dVar.a((com.etao.feimagesearch.mnn.d<m>) new m(new h(null, null, null, null), null, null));
            } catch (Exception e3) {
                cot.b(TAG, "--" + e3.getMessage());
                e3.printStackTrace();
                dVar.a((com.etao.feimagesearch.mnn.d<m>) new m(new h(null, null, null, null), null, null));
            }
        }
    }

    private final void a(com.etao.feimagesearch.mnn.realtime.a aVar, com.etao.feimagesearch.mnn.d<m> dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8b63927", new Object[]{this, aVar, dVar});
            return;
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        String jSONString = JSON.toJSONString(aVar.a());
        q.a((Object) jSONString, "JSON.toJSONString(input.algoMsgArray)");
        hashMap.put("_tppReturn", jSONString);
        cot.c(TAG, "runInputAlgoMsg " + hashMap.get("_tppReturn"));
        a(hashMap, false, (MNNCVExecutor.b) new c(dVar));
    }

    private final void a(com.etao.feimagesearch.mnn.d<m> dVar, MRTRuntimeException mRTRuntimeException, Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5df28f7", new Object[]{this, dVar, mRTRuntimeException, map});
        } else if (mRTRuntimeException != null) {
            cot.b(TAG, "runInputAlgoMsg: " + mRTRuntimeException.getMessage());
            cox.a(com.etao.feimagesearch.structure.capture.a.f6987a, "realtimeProcessAlgoException", 19999, "errorCode", String.valueOf(mRTRuntimeException.errorCode), "errorMsg", mRTRuntimeException.getMessage());
            dVar.a((com.etao.feimagesearch.mnn.d<m>) new m(null, new com.etao.feimagesearch.mnn.realtime.b(new ArrayList(1)), null));
        } else if (map == null) {
        } else {
            cox.a(com.etao.feimagesearch.structure.capture.a.f6987a, "realtimeProcessAlgoSuccess", 19999, new String[0]);
            cot.c(TAG, "runInputAlgoMsg " + JSON.toJSONString(map));
            ArrayList arrayList = new ArrayList();
            Object obj = map.get("objects");
            if (obj == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.ArrayList<*> /* = java.util.ArrayList<*> */");
            }
            Iterator it = ((ArrayList) obj).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof HashMap) {
                    Map map2 = (Map) next;
                    Object obj2 = map2.get("number");
                    if (obj2 == null) {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
                    }
                    int intValue = ((Integer) obj2).intValue();
                    Object obj3 = map2.get("updateMuiseCard");
                    if (obj3 == null) {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
                    }
                    arrayList.add(new com.etao.feimagesearch.mnn.realtime.c(intValue, ((Integer) obj3).intValue()));
                }
            }
            dVar.a((com.etao.feimagesearch.mnn.d<m>) new m(null, new com.etao.feimagesearch.mnn.realtime.b(arrayList), null));
        }
    }

    private final void a(com.etao.feimagesearch.mnn.realtime.d dVar, com.etao.feimagesearch.mnn.d<m> dVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70158584", new Object[]{this, dVar, dVar2});
            return;
        }
        HashMap<String, Object> a2 = com.etao.feimagesearch.mnn.utils.a.a(dVar.a());
        if (a2 != null) {
            Vector vector = new Vector(2);
            vector.add("wnk");
            a2.put(com.etao.feimagesearch.mnn.utils.a.f, vector);
            cot.c(TAG, "params = " + JSON.toJSONString(a2));
            a(a2, false, (MNNCVExecutor.b) new d(a2, dVar2));
            return;
        }
        dVar2.a((com.etao.feimagesearch.mnn.d<m>) new m(null, null, new f("", "")));
    }

    private final l a(Map<String, ? extends Object> map, Bitmap bitmap, float f) {
        int i;
        String str;
        String str2;
        Bitmap bitmap2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l) ipChange.ipc$dispatch("88eae227", new Object[]{this, map, bitmap, new Float(f)});
        }
        Object obj = map.get("bbox");
        if (obj == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.ArrayList<kotlin.Float> /* = java.util.ArrayList<kotlin.Float> */");
        }
        ArrayList arrayList = (ArrayList) obj;
        if (arrayList.size() != 4) {
            return null;
        }
        float floatValue = ((Number) arrayList.get(2)).floatValue();
        Object obj2 = arrayList.get(0);
        q.a(obj2, "bbox[0]");
        if (floatValue <= ((Number) obj2).floatValue()) {
            return null;
        }
        float floatValue2 = ((Number) arrayList.get(3)).floatValue();
        Object obj3 = arrayList.get(1);
        q.a(obj3, "bbox[1]");
        if (floatValue2 <= ((Number) obj3).floatValue()) {
            return null;
        }
        Object obj4 = map.get("canRequest");
        if (obj4 == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }
        int intValue = ((Integer) obj4).intValue();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (intValue == 1) {
            float f2 = width;
            str = "null cannot be cast to non-null type kotlin.Int";
            Object obj5 = arrayList.get(0);
            q.a(obj5, "bbox[0]");
            float f3 = height;
            i = intValue;
            Object obj6 = arrayList.get(1);
            q.a(obj6, "bbox[1]");
            str2 = "bbox[1]";
            Object obj7 = arrayList.get(2);
            q.a(obj7, "bbox[2]");
            Object obj8 = arrayList.get(3);
            q.a(obj8, "bbox[3]");
            bitmap2 = a(bitmap, new Rect((int) (((Number) obj5).floatValue() * f2), (int) (((Number) obj6).floatValue() * f3), (int) (f2 * ((Number) obj7).floatValue()), (int) (f3 * ((Number) obj8).floatValue())));
        } else {
            i = intValue;
            str = "null cannot be cast to non-null type kotlin.Int";
            str2 = "bbox[1]";
            bitmap2 = null;
        }
        float f4 = width;
        Object obj9 = arrayList.get(0);
        q.a(obj9, "bbox[0]");
        float f5 = height;
        Object obj10 = arrayList.get(1);
        String str3 = str2;
        q.a(obj10, str3);
        Object obj11 = arrayList.get(2);
        q.a(obj11, "bbox[2]");
        Object obj12 = arrayList.get(3);
        q.a(obj12, "bbox[3]");
        Rect rect = new Rect((int) (((Number) obj9).floatValue() * f4 * f), (int) (((Number) obj10).floatValue() * f5 * f), (int) (f4 * ((Number) obj11).floatValue() * f), (int) (f5 * ((Number) obj12).floatValue() * f));
        Object obj13 = map.get("number");
        if (obj13 == null) {
            throw new TypeCastException(str);
        }
        int intValue2 = ((Integer) obj13).intValue();
        Object obj14 = map.get("objectCategory");
        if (obj14 == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
        }
        String str4 = (String) obj14;
        Object obj15 = map.get("showCard");
        if (obj15 == null) {
            throw new TypeCastException(str);
        }
        int intValue3 = ((Integer) obj15).intValue();
        float floatValue3 = ((Number) arrayList.get(2)).floatValue();
        Object obj16 = arrayList.get(0);
        q.a(obj16, "bbox[0]");
        float floatValue4 = floatValue3 - ((Number) obj16).floatValue();
        float floatValue5 = ((Number) arrayList.get(3)).floatValue();
        Object obj17 = arrayList.get(1);
        q.a(obj17, str3);
        float floatValue6 = floatValue4 * (floatValue5 - ((Number) obj17).floatValue());
        Object obj18 = arrayList.get(0);
        q.a(obj18, "bbox[0]");
        float floatValue7 = ((Number) obj18).floatValue();
        Object obj19 = arrayList.get(1);
        q.a(obj19, str3);
        float floatValue8 = ((Number) obj19).floatValue();
        Object obj20 = arrayList.get(2);
        q.a(obj20, "bbox[2]");
        float floatValue9 = ((Number) obj20).floatValue();
        Object obj21 = arrayList.get(3);
        q.a(obj21, "bbox[3]");
        return new l(rect, Integer.valueOf(i), intValue2, str4, intValue3, bitmap2, System.currentTimeMillis(), floatValue6, new RectF(floatValue7, floatValue8, floatValue9, ((Number) obj21).floatValue()));
    }

    private final Bitmap a(Bitmap bitmap, Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("ae5986f1", new Object[]{this, bitmap, rect});
        }
        Bitmap cropImage = Bitmap.createBitmap(bitmap, rect.left, rect.top, rect.width(), rect.height(), new Matrix(), false);
        int i = this.f6791a;
        int i2 = this.b;
        if (i * i2 == 0) {
            q.a((Object) cropImage, "cropImage");
            return cropImage;
        }
        Bitmap a2 = com.etao.feimagesearch.util.d.a(cropImage, rwf.c(this.f6791a, this.b), rwf.d(i, i2));
        return a2 == null ? bitmap : a2;
    }
}
