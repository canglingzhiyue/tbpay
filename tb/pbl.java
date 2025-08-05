package tb;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public class pbl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static pbl f32545a;
    private DinamicXEngine b = new DinamicXEngine(new DXEngineConfig("live"));
    private a c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes8.dex */
    public interface a {
        void a(String str);
    }

    static {
        kge.a(709980352);
    }

    public static /* synthetic */ DinamicXEngine a(pbl pblVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DinamicXEngine) ipChange.ipc$dispatch("6eb43569", new Object[]{pblVar}) : pblVar.b;
    }

    public static /* synthetic */ void a(pbl pblVar, DXTemplateItem dXTemplateItem, JSONObject jSONObject, Context context, FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9586222", new Object[]{pblVar, dXTemplateItem, jSONObject, context, frameLayout});
        } else {
            pblVar.b(dXTemplateItem, jSONObject, context, frameLayout);
        }
    }

    public static /* synthetic */ a b(pbl pblVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("5830c830", new Object[]{pblVar}) : pblVar.c;
    }

    public static pbl a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pbl) ipChange.ipc$dispatch("f090ba4", new Object[0]);
        }
        if (f32545a == null) {
            synchronized (pbl.class) {
                if (f32545a == null) {
                    f32545a = new pbl();
                }
            }
        }
        return f32545a;
    }

    private pbl() {
        this.b.a(pbk.DX_EVENT_TBLFOLLOWCONTENTHANDLER, new pbk());
        this.b.a(new b());
    }

    public void a(final DXTemplateItem dXTemplateItem, final JSONObject jSONObject, final Context context, final FrameLayout frameLayout) {
        DinamicXEngine dinamicXEngine;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d5bb9ac", new Object[]{this, dXTemplateItem, jSONObject, context, frameLayout});
        } else if (dXTemplateItem == null || TextUtils.isEmpty(dXTemplateItem.f11925a) || (dinamicXEngine = this.b) == null) {
        } else {
            if (dinamicXEngine.a(dXTemplateItem) != null) {
                b(dXTemplateItem, jSONObject, context, frameLayout);
            } else {
                a(dXTemplateItem, new a() { // from class: tb.pbl.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.pbl.a
                    public void a(String str) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                        } else if (!dXTemplateItem.f11925a.equals(str) || pbl.a(pbl.this).a(dXTemplateItem) == null) {
                        } else {
                            pbl.a(pbl.this, dXTemplateItem, jSONObject, context, frameLayout);
                        }
                    }
                });
            }
        }
    }

    private void b(DXTemplateItem dXTemplateItem, JSONObject jSONObject, Context context, FrameLayout frameLayout) {
        DXResult<DXRootView> b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("537af6ad", new Object[]{this, dXTemplateItem, jSONObject, context, frameLayout});
            return;
        }
        DinamicXEngine dinamicXEngine = this.b;
        if (dinamicXEngine == null || (b2 = dinamicXEngine.b(context, dXTemplateItem)) == null || b2.f11780a == null) {
            return;
        }
        DXRootView dXRootView = b2.f11780a;
        frameLayout.addView(dXRootView);
        this.b.a(dXRootView, (JSONObject) jSONObject.clone());
    }

    private void a(DXTemplateItem dXTemplateItem, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49abeea", new Object[]{this, dXTemplateItem, aVar});
        } else if (dXTemplateItem == null) {
        } else {
            this.c = aVar;
            ArrayList arrayList = new ArrayList();
            arrayList.add(dXTemplateItem);
            this.b.a(arrayList);
        }
    }

    /* loaded from: classes8.dex */
    public class b implements fve {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-979115899);
            kge.a(-1579893205);
        }

        public b() {
        }

        @Override // tb.fve
        public void onNotificationListener(fvb fvbVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("73876f63", new Object[]{this, fvbVar});
            } else if (fvbVar != null) {
                for (DXTemplateItem dXTemplateItem : fvbVar.f28139a) {
                    if (dXTemplateItem != null) {
                        pbl.b(pbl.this).a(dXTemplateItem.f11925a);
                    }
                }
            }
        }
    }
}
