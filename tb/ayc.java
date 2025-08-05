package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.s;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes2.dex */
public class ayc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Context f25684a;
    private final DinamicXEngine b;
    private fve c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public interface a {
        void a(DXRootView dXRootView);

        void a(String str, s sVar);
    }

    static {
        kge.a(-85198394);
    }

    public static /* synthetic */ fve a(ayc aycVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fve) ipChange.ipc$dispatch("92166b24", new Object[]{aycVar}) : aycVar.c;
    }

    public static /* synthetic */ fve a(ayc aycVar, fve fveVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fve) ipChange.ipc$dispatch("53e47709", new Object[]{aycVar, fveVar});
        }
        aycVar.c = fveVar;
        return fveVar;
    }

    public static /* synthetic */ void a(ayc aycVar, a aVar, DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f9b1abe", new Object[]{aycVar, aVar, dXTemplateItem});
        } else {
            aycVar.b(aVar, dXTemplateItem);
        }
    }

    public static /* synthetic */ DinamicXEngine b(ayc aycVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DinamicXEngine) ipChange.ipc$dispatch("86c3b4f9", new Object[]{aycVar}) : aycVar.b;
    }

    public ayc(Context context, DinamicXEngine dinamicXEngine) {
        this.f25684a = context;
        this.b = dinamicXEngine;
    }

    public void a(final a aVar, final DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6de4459", new Object[]{this, aVar, dXTemplateItem});
        } else if (dXTemplateItem == null) {
        } else {
            DXTemplateItem a2 = this.b.a(dXTemplateItem);
            if (a2 != null && a2.b == dXTemplateItem.b) {
                b(aVar, a2);
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(dXTemplateItem);
            this.b.a(arrayList);
            this.c = new fve() { // from class: tb.ayc.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.fve
                public void onNotificationListener(fvb fvbVar) {
                    IpChange ipChange2 = $ipChange;
                    boolean z = false;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("73876f63", new Object[]{this, fvbVar});
                    } else if (fvbVar.f28139a == null) {
                    } else {
                        Iterator<DXTemplateItem> it = fvbVar.f28139a.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            DXTemplateItem next = it.next();
                            if (Objects.equals(next.f11925a, dXTemplateItem.f11925a) && next.b == dXTemplateItem.b) {
                                ayc.a(ayc.this, aVar, next);
                                z = true;
                                break;
                            }
                        }
                        if (!z && fvbVar.b != null) {
                            Iterator<DXTemplateItem> it2 = fvbVar.f28139a.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                DXTemplateItem next2 = it2.next();
                                if (Objects.equals(next2.f11925a, dXTemplateItem.f11925a) && next2.b == dXTemplateItem.b) {
                                    aVar.a("TplDownloadFail", null);
                                    z = true;
                                    break;
                                }
                            }
                        }
                        if (!z) {
                            return;
                        }
                        ayc.b(ayc.this).c(ayc.a(ayc.this));
                        ayc.a(ayc.this, (fve) null);
                    }
                }
            };
            this.b.b(this.c);
        }
    }

    private void b(a aVar, DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7acc2da", new Object[]{this, aVar, dXTemplateItem});
            return;
        }
        DXResult<DXRootView> b = this.b.b(this.f25684a, dXTemplateItem);
        DXRootView dXRootView = b.f11780a;
        if (dXRootView != null) {
            aVar.a(dXRootView);
        } else {
            aVar.a("NullDxRooView", b.a());
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        fve fveVar = this.c;
        if (fveVar == null) {
            return;
        }
        this.b.c(fveVar);
    }
}
