package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.multiclasstab.IMulticlassTabService;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class loh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private lom f30771a;
    private WeakReference<Context> b;
    private final IMulticlassTabService.a c;

    static {
        kge.a(-976628464);
    }

    public loh(IMulticlassTabService.a aVar) {
        this.c = aVar;
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else {
            this.b = new WeakReference<>(context);
        }
    }

    public llm a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (llm) ipChange.ipc$dispatch("f075fd1", new Object[]{this});
        }
        lom lomVar = this.f30771a;
        if (lomVar == null) {
            ldf.c("ClassifiedTabWaiter", "getCurrentTabInfo, currentTab == null");
            return new lol("");
        }
        return lomVar.b();
    }

    public ViewGroup a(String str, llj lljVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("3435119d", new Object[]{this, str, lljVar});
        }
        ldf.d("ClassifiedTabWaiter", "loadTabContent, contentType : " + str);
        WeakReference<Context> weakReference = this.b;
        Context context = weakReference != null ? weakReference.get() : null;
        if (context == null) {
            ldf.d("ClassifiedTabWaiter", "loadTabContent, context == null");
            return null;
        }
        lom a2 = a(context, str);
        if (a2 == null) {
            ldf.d("ClassifiedTabWaiter", "loadTabContent, classifiedTab == null");
            return null;
        }
        return a2.a(lljVar);
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        lom lomVar = this.f30771a;
        if (lomVar == null) {
            ldf.d("ClassifiedTabWaiter", "isShowTabContent, currentTab == null");
            return false;
        }
        return lomVar.c();
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        lom lomVar = this.f30771a;
        if (lomVar == null) {
            ldf.d("ClassifiedTabWaiter", "hideTabContent, currentTab == null");
        } else {
            lomVar.d();
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        lom lomVar = this.f30771a;
        if (lomVar == null) {
            ldf.d("ClassifiedTabWaiter", "destroyTabContent, currentTab == null");
            return;
        }
        lomVar.e();
        this.f30771a = null;
    }

    private lom a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lom) ipChange.ipc$dispatch("837d8312", new Object[]{this, context, str});
        }
        lom lomVar = this.f30771a;
        if (lomVar == null) {
            this.f30771a = b(context, str);
            return this.f30771a;
        }
        if (!StringUtils.equals(str, lomVar.a())) {
            this.f30771a.e();
            this.f30771a = b(context, str);
        }
        return this.f30771a;
    }

    private lom b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lom) ipChange.ipc$dispatch("acd1d853", new Object[]{this, context, str});
        }
        lom lomVar = null;
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != 3277) {
            if (hashCode == 3645441 && str.equals("weex")) {
                c = 1;
            }
        } else if (str.equals("h5")) {
            c = 0;
        }
        if (c == 0) {
            lomVar = new lon(context, str);
        } else if (c == 1) {
            lomVar = new lot(context, str);
        }
        if (lomVar != null) {
            lomVar.a(this.c);
        }
        return lomVar;
    }
}
