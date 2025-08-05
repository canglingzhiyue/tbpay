package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.live.home.dinamic.sdk.DinamicSdkManager;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes7.dex */
public class mfd$c implements fve {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ConcurrentHashMap<String, ArrayList<mfd$a>> f31055a = new ConcurrentHashMap<>();
    public final /* synthetic */ DinamicSdkManager b;

    public mfd$c(DinamicSdkManager dinamicSdkManager) {
        this.b = dinamicSdkManager;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        ConcurrentHashMap<String, ArrayList<mfd$a>> concurrentHashMap = this.f31055a;
        if (concurrentHashMap != null) {
            concurrentHashMap.clear();
        }
        this.f31055a = null;
    }

    public void a(String str, mfd$a mfd_a) {
        ConcurrentHashMap<String, ArrayList<mfd$a>> concurrentHashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e0f113a", new Object[]{this, str, mfd_a});
        } else if (pro.e(str) || mfd_a == null || (concurrentHashMap = this.f31055a) == null) {
        } else {
            ArrayList<mfd$a> arrayList = concurrentHashMap.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.f31055a.put(str, arrayList);
            }
            arrayList.add(mfd_a);
        }
    }

    @Override // tb.fve
    public void onNotificationListener(fvb fvbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73876f63", new Object[]{this, fvbVar});
        } else if (fvbVar != null) {
            if (!fvbVar.f28139a.isEmpty()) {
                mfg.a().a("com.taobao.live.home.template_download_complete");
            }
            try {
                for (DXTemplateItem dXTemplateItem : fvbVar.f28139a) {
                    if (dXTemplateItem != null) {
                        mfk.a(mfk.DYNAMIC_X_DOWNLOAD, "templateName=" + dXTemplateItem.f11925a);
                        a(dXTemplateItem.f11925a);
                    }
                }
            } catch (Exception e) {
                mfj.a(DinamicSdkManager.$ipChange, "TBLiveTemplateDownloadCallback.onNotificationListener", e);
            }
            if (fvbVar.b == null) {
                return;
            }
            try {
                for (DXTemplateItem dXTemplateItem2 : fvbVar.b) {
                    if (dXTemplateItem2 != null) {
                        mfk.a(mfk.DYNAMIC_X_DOWNLOAD, "templateName=" + dXTemplateItem2.f11925a, "", "");
                    }
                }
            } catch (Exception e2) {
                mfj.a(DinamicSdkManager.$ipChange, "TBLiveTemplateDownloadCallback.onNotificationListener", e2);
            }
        }
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (this.f31055a != null) {
            ArrayList<mfd$a> arrayList = new ArrayList();
            ArrayList<mfd$a> arrayList2 = this.f31055a.get(str);
            if (arrayList2 != null) {
                arrayList.addAll(arrayList2);
            }
            if (arrayList.size() <= 0) {
                return;
            }
            try {
                for (mfd$a mfd_a : arrayList) {
                    if (mfd_a != null) {
                        this.b.a(mfd_a.b, mfd_a.f31054a, mfd_a.c);
                    }
                }
            } catch (Exception e) {
                mfj.a(DinamicSdkManager.$ipChange, "Dinamic download callback.", e);
            }
            this.f31055a.remove(str);
        }
    }
}
