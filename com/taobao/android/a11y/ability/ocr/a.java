package com.taobao.android.a11y.ability.ocr;

import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.a11y.ability.common.mtop.A11yMtopClient;
import com.taobao.android.a11y.ability.ocr.OCRBatchManager;
import com.taobao.android.a11y.ability.ocr.OCRResponseData;
import com.taobao.android.a11y.ability.ocr.OCRResultData;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import tb.djt;
import tb.dju;
import tb.djv;
import tb.eta;
import tb.jkg;
import tb.jkh;
import tb.kge;

/* loaded from: classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, WeakReference<View>> f8609a;
    private boolean b;
    private String f;
    private boolean e = true;
    private String c = "图片识别中";
    private String d = "图片识别失败";

    /* renamed from: com.taobao.android.a11y.ability.ocr.a$4  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass4 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f8612a = new int[OCRResultData.ResultType.values().length];

        static {
            try {
                f8612a[OCRResultData.ResultType.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8612a[OCRResultData.ResultType.HOLD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8612a[OCRResultData.ResultType.FAIL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static /* synthetic */ String a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d478e7ce", new Object[]{aVar}) : aVar.d;
    }

    public static /* synthetic */ String a(a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a88e1bc4", new Object[]{aVar, str});
        }
        aVar.c = str;
        return str;
    }

    public static /* synthetic */ Map a(a aVar, View view, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("7768eaff", new Object[]{aVar, view, str}) : aVar.b(view, str);
    }

    public static /* synthetic */ void a(a aVar, View view, OCRResultData oCRResultData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bb5d856", new Object[]{aVar, view, oCRResultData});
        } else {
            aVar.a(view, oCRResultData);
        }
    }

    public static /* synthetic */ void a(a aVar, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("338d7c03", new Object[]{aVar, list});
        } else {
            aVar.a(list);
        }
    }

    public static /* synthetic */ void a(a aVar, List list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd6acb0d", new Object[]{aVar, list, str});
        } else {
            aVar.a(list, str);
        }
    }

    public static /* synthetic */ boolean a(a aVar, OCRResponseData oCRResponseData) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("506d5724", new Object[]{aVar, oCRResponseData})).booleanValue() : aVar.a(oCRResponseData);
    }

    public static /* synthetic */ String b(a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("afb6fe05", new Object[]{aVar, str});
        }
        aVar.d = str;
        return str;
    }

    public static /* synthetic */ boolean b(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1588487", new Object[]{aVar, new Boolean(z)})).booleanValue();
        }
        aVar.e = z;
        return z;
    }

    public static /* synthetic */ String c(a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b6dfe046", new Object[]{aVar, str});
        }
        aVar.f = str;
        return str;
    }

    public static /* synthetic */ View d(a aVar, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("cd89873b", new Object[]{aVar, str}) : aVar.b(str);
    }

    static {
        kge.a(93287489);
        f8609a = new HashMap();
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.b = z;
        if (!this.b) {
            return;
        }
        OCRBatchManager.a().a(new b(this));
    }

    /* loaded from: classes4.dex */
    public static class b implements OCRBatchManager.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<a> f8614a;

        static {
            kge.a(-1489838157);
            kge.a(-1127986998);
        }

        public b(a aVar) {
            this.f8614a = new WeakReference<>(aVar);
        }

        @Override // com.taobao.android.a11y.ability.ocr.OCRBatchManager.b
        public void a(HashMap<String, View> hashMap) {
            a aVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("656bbc4b", new Object[]{this, hashMap});
                return;
            }
            WeakReference<a> weakReference = this.f8614a;
            if (weakReference == null || (aVar = weakReference.get()) == null) {
                return;
            }
            a.a(aVar, new ArrayList(hashMap.keySet()));
        }
    }

    /* renamed from: com.taobao.android.a11y.ability.ocr.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0340a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private boolean f8613a;
        private String b;
        private String c;
        private boolean d = true;

        static {
            kge.a(-1159562728);
        }

        public C0340a a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0340a) ipChange.ipc$dispatch("a6e367f9", new Object[]{this, new Boolean(z)});
            }
            this.f8613a = z;
            return this;
        }

        public C0340a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0340a) ipChange.ipc$dispatch("f67122bf", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }

        public C0340a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0340a) ipChange.ipc$dispatch("ea00a700", new Object[]{this, str});
            }
            this.c = str;
            return this;
        }

        public C0340a b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0340a) ipChange.ipc$dispatch("605af598", new Object[]{this, new Boolean(z)});
            }
            this.d = z;
            return this;
        }

        public a a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("39444bd2", new Object[]{this});
            }
            a aVar = new a();
            aVar.a(this.f8613a);
            a.a(aVar, this.b);
            a.b(aVar, this.c);
            a.b(aVar, this.d);
            return aVar;
        }
    }

    @Deprecated
    public void a(String str, View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1815374", new Object[]{this, str, view, new Boolean(z)});
        } else if (!djt.a(view.getContext())) {
        } else {
            a(z);
            a(str, view);
        }
    }

    public void a(String str, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6198cb60", new Object[]{this, str, view});
        } else if (TextUtils.isEmpty(str) || view == null || !djt.a(view.getContext())) {
        } else {
            b(str, view);
            if (this.b && eta.b()) {
                if (!a(str)) {
                    return;
                }
                OCRBatchManager.a().a(str, view);
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            a(arrayList);
        }
    }

    private boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        View b2 = b(str);
        a(b2, str);
        OCRResultData a2 = com.taobao.android.a11y.ability.ocr.b.a().a(str);
        if (a2 != null) {
            a(b2, a2);
            return false;
        }
        a(b2, new OCRResultData(this.c, OCRResultData.ResultType.HOLD));
        return true;
    }

    private void a(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else if (list != null && !list.isEmpty()) {
            for (String str : new ArrayList(list)) {
                if (!TextUtils.isEmpty(str)) {
                    if (!a(str)) {
                        list.remove(str);
                    } else {
                        String d = djv.d(str);
                        if (!str.equals(d)) {
                            list.add(d);
                            list.remove(str);
                        }
                        if (djv.a(str)) {
                            list.remove(str);
                        }
                    }
                }
            }
            if (list.isEmpty()) {
                return;
            }
            b(list);
        }
    }

    private void b(final List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39e1eda", new Object[]{this, list});
            return;
        }
        OCRRequestParams oCRRequestParams = new OCRRequestParams();
        oCRRequestParams.setImgList(JSON.toJSONString(list));
        new A11yMtopClient(new TableOCRRequest(oCRRequestParams), new com.taobao.android.a11y.ability.common.mtop.a<OCRResponseData>() { // from class: com.taobao.android.a11y.ability.ocr.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.a11y.ability.common.mtop.a
            public void a(OCRResponseData oCRResponseData) {
                OCRResultData oCRResultData;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f0ee678a", new Object[]{this, oCRResponseData});
                } else if (a.a(a.this, oCRResponseData)) {
                    a aVar = a.this;
                    a.a(aVar, list, a.a(aVar));
                } else {
                    if (oCRResponseData.grayInfo != null) {
                        a.c(a.this, oCRResponseData.grayInfo.tableRecoGray);
                    }
                    for (Map.Entry<String, OCRResponseData.OCRResponseItemData> entry : oCRResponseData.data.entrySet()) {
                        String key = entry.getKey();
                        OCRResponseData.OCRResponseItemData value = entry.getValue();
                        View d = a.d(a.this, key);
                        if (d != null) {
                            if (value == null) {
                                a aVar2 = a.this;
                                a.a(aVar2, d, new OCRResultData(a.a(aVar2), OCRResultData.ResultType.FAIL));
                            } else {
                                if (!TextUtils.isEmpty(value.content)) {
                                    oCRResultData = new OCRResultData(value.content, OCRResultData.ResultType.SUCCESS);
                                    oCRResultData.a(value.tableReco);
                                } else {
                                    oCRResultData = new OCRResultData(a.a(a.this), OCRResultData.ResultType.FAIL);
                                }
                                a.a(a.this, d, oCRResultData);
                                com.taobao.android.a11y.ability.ocr.b.a().a(key, oCRResultData);
                            }
                        }
                    }
                }
            }

            @Override // com.taobao.android.a11y.ability.common.mtop.a
            public void a(MtopResponse mtopResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ab3bce2d", new Object[]{this, mtopResponse});
                    return;
                }
                a aVar = a.this;
                a.a(aVar, list, a.a(aVar));
            }
        }, OCRResponseData.class).execute();
    }

    private void b(String str, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68fe007f", new Object[]{this, str, view});
            return;
        }
        for (String str2 : new ArrayList(f8609a.keySet())) {
            View b2 = b(str2);
            if (b2 != null && b2 == view) {
                f8609a.remove(str2);
            }
        }
        f8609a.put(djv.d(str), new WeakReference<>(view));
        view.setAccessibilityDelegate(new View.AccessibilityDelegate() { // from class: com.taobao.android.a11y.ability.ocr.a.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 anonymousClass2, String str3, Object... objArr) {
                if (str3.hashCode() == -1548734636) {
                    super.onPopulateAccessibilityEvent((View) objArr[0], (AccessibilityEvent) objArr[1]);
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str3));
            }

            @Override // android.view.View.AccessibilityDelegate
            public void onPopulateAccessibilityEvent(View view2, AccessibilityEvent accessibilityEvent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a3b02f54", new Object[]{this, view2, accessibilityEvent});
                } else {
                    super.onPopulateAccessibilityEvent(view2, accessibilityEvent);
                }
            }
        });
    }

    private View b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("8b9126f5", new Object[]{this, str});
        }
        WeakReference<View> weakReference = f8609a.get(djv.d(str));
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    private boolean a(OCRResponseData oCRResponseData) {
        Map<String, OCRResponseData.OCRResponseItemData> map;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f0ee678e", new Object[]{this, oCRResponseData})).booleanValue() : oCRResponseData == null || !Boolean.TRUE.toString().equalsIgnoreCase(oCRResponseData.successful) || (map = oCRResponseData.data) == null || map.isEmpty();
    }

    private void a(List<String> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c6e0ee3", new Object[]{this, list, str});
        } else if (list != null && !list.isEmpty()) {
            for (String str2 : list) {
                View b2 = b(str2);
                if (b2 != null) {
                    a(b2, new OCRResultData(str, OCRResultData.ResultType.FAIL));
                }
            }
        }
    }

    private void a(View view, OCRResultData oCRResultData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fde692c", new Object[]{this, view, oCRResultData});
        } else if (view == null || oCRResultData == null) {
        } else {
            int i = AnonymousClass4.f8612a[oCRResultData.c().ordinal()];
            if (i == 1) {
                dju.c(view, a(oCRResultData));
            } else if (i == 2) {
                dju.a(view, oCRResultData.b());
            } else if (i != 3) {
            } else {
                dju.b(view, oCRResultData.b());
            }
        }
    }

    private String a(OCRResultData oCRResultData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5e8072f2", new Object[]{this, oCRResultData});
        }
        if (oCRResultData == null) {
            return "";
        }
        if (Boolean.TRUE.toString().equals(oCRResultData.a())) {
            return "表格识别结果：" + oCRResultData.b();
        }
        return "图片识别结果: " + oCRResultData.b();
    }

    private void a(final View view, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76c0c6b4", new Object[]{this, view, str});
        } else if (view == null) {
        } else {
            final View.AccessibilityDelegate accessibilityDelegate = view.getAccessibilityDelegate();
            view.setAccessibilityDelegate(new View.AccessibilityDelegate() { // from class: com.taobao.android.a11y.ability.ocr.a.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass3 anonymousClass3, String str2, Object... objArr) {
                    int hashCode = str2.hashCode();
                    if (hashCode == -1877873384) {
                        super.onInitializeAccessibilityNodeInfo((View) objArr[0], (AccessibilityNodeInfo) objArr[1]);
                        return null;
                    } else if (hashCode != -1548734636) {
                        throw new InstantReloadException(String.format("String switch could not find '%s'", str2));
                    } else {
                        super.onPopulateAccessibilityEvent((View) objArr[0], (AccessibilityEvent) objArr[1]);
                        return null;
                    }
                }

                @Override // android.view.View.AccessibilityDelegate
                public void onPopulateAccessibilityEvent(View view2, AccessibilityEvent accessibilityEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a3b02f54", new Object[]{this, view2, accessibilityEvent});
                        return;
                    }
                    super.onPopulateAccessibilityEvent(view2, accessibilityEvent);
                    jkh.a(new jkg(view, accessibilityEvent, a.a(a.this, view2, str)));
                }

                @Override // android.view.View.AccessibilityDelegate
                public void onInitializeAccessibilityNodeInfo(View view2, AccessibilityNodeInfo accessibilityNodeInfo) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9011ed18", new Object[]{this, view2, accessibilityNodeInfo});
                        return;
                    }
                    super.onInitializeAccessibilityNodeInfo(view2, accessibilityNodeInfo);
                    View.AccessibilityDelegate accessibilityDelegate2 = accessibilityDelegate;
                    if (accessibilityDelegate2 == null) {
                        return;
                    }
                    accessibilityDelegate2.onInitializeAccessibilityNodeInfo(view2, accessibilityNodeInfo);
                }
            });
        }
    }

    private Map<String, String> b(View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("1d60c8", new Object[]{this, view, str});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("image_url", str);
        CharSequence contentDescription = view.getContentDescription();
        hashMap.put("is_table", contentDescription == null ? Boolean.FALSE.toString() : String.valueOf(contentDescription.toString().startsWith("表格识别结果：")));
        hashMap.put("a11y_content", contentDescription == null ? "" : contentDescription.toString());
        hashMap.put("hitTableRecoGray", this.f);
        return hashMap;
    }
}
