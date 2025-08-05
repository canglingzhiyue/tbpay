package tb;

import android.net.Uri;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.themis.kernel.container.Window;
import com.taobao.themis.kernel.entity.a;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.launcher.step.b;
import com.taobao.themis.kernel.metaInfo.manifest.TabBar;
import com.taobao.themis.kernel.metaInfo.manifest.TabBarItem;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.page.ITMSPageFactory;
import com.taobao.themis.kernel.utils.i;
import com.taobao.themis.kernel.utils.n;
import com.taobao.themis.utils.o;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.suj;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\n\u0010\t\u001a\u0004\u0018\u00010\nH\u0014¨\u0006\u000b"}, d2 = {"Lcom/taobao/themis/uniapp/launch/TMSUniPageStep;", "Lcom/taobao/themis/kernel/launcher/step/TMSBasePageStep;", "instance", "Lcom/taobao/themis/kernel/TMSInstance;", "launcher", "Lcom/taobao/themis/kernel/launcher/TMSBaseLauncher;", DataReceiveMonitor.CB_LISTENER, "Lcom/taobao/themis/kernel/launcher/ITMSLaunchListener;", "(Lcom/taobao/themis/kernel/TMSInstance;Lcom/taobao/themis/kernel/launcher/TMSBaseLauncher;Lcom/taobao/themis/kernel/launcher/ITMSLaunchListener;)V", "generateHomePage", "Lcom/taobao/themis/kernel/page/ITMSPage;", "themis_uniapp_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class tmb extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(326674757);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tmb(f instance, qpr launcher, qpp listener) {
        super(instance, launcher, listener);
        q.d(instance, "instance");
        q.d(launcher, "launcher");
        q.d(listener, "listener");
    }

    @Override // com.taobao.themis.kernel.launcher.step.b
    public ITMSPage f() {
        String c;
        ITMSPage a2;
        com.taobao.themis.kernel.extension.page.f fVar;
        TabBar d;
        List<TabBarItem> items;
        TabBar d2;
        com.taobao.themis.kernel.extension.page.f fVar2;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (ITMSPage) ipChange.ipc$dispatch("4e6ddf4", new Object[]{this});
        }
        i iVar = i.INSTANCE;
        f mInstance = this.f22538a;
        q.b(mInstance, "mInstance");
        String g = mInstance.g();
        q.b(g, "mInstance.url");
        i.a a3 = iVar.a(g);
        if (a3 == null || (c = a3.c()) == null) {
            return null;
        }
        f mInstance2 = this.f22538a;
        q.b(mInstance2, "mInstance");
        Uri b = o.b(mInstance2.g());
        q.b(b, "TMSUrlUtils.parseUrl(mInstance.url)");
        String encodedQuery = b.getEncodedQuery();
        f mInstance3 = this.f22538a;
        q.b(mInstance3, "mInstance");
        com.taobao.themis.kernel.container.b b2 = com.taobao.themis.kernel.utils.o.b(mInstance3, c);
        if (b2 == null) {
            return null;
        }
        String a4 = i.a(i.INSTANCE, b2.b(), encodedQuery, null, null, 12, null);
        f mInstance4 = this.f22538a;
        q.b(mInstance4, "mInstance");
        TabBarItem a5 = com.taobao.themis.kernel.utils.o.a(mInstance4, c);
        iwm iwmVar = (iwm) i().a(iwm.class);
        if (a5 != null) {
            f mInstance5 = this.f22538a;
            q.b(mInstance5, "mInstance");
            ITMSPageFactory m = mInstance5.m();
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = jSONObject;
            jSONObject2.put((JSONObject) a.KEY_IS_HOME_PAGE, (String) true);
            jSONObject2.put((JSONObject) a.KEY_IS_VIRTUAL_TAB_PAGE, (String) true);
            t tVar = t.INSTANCE;
            a2 = ITMSPageFactory.a.a(m, "", null, jSONObject, null, 8, null);
            suj sujVar = (suj) a2.a(suj.class);
            if (sujVar == null) {
                return null;
            }
            if (iwmVar != null) {
                if (!n.cf() && (fVar2 = (com.taobao.themis.kernel.extension.page.f) a2.a(com.taobao.themis.kernel.extension.page.f.class)) != null) {
                    a2.b(fVar2);
                }
                a2.a(iwmVar);
            }
            com.taobao.themis.kernel.container.a x = a2.b().x();
            if (x != null && (d2 = x.d()) != null) {
                sujVar.a(d2);
            }
            com.taobao.themis.kernel.container.a x2 = a2.b().x();
            if (x2 != null && (d = x2.d()) != null && (items = d.getItems()) != null) {
                Iterator<TabBarItem> it = items.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    } else if (q.a((Object) it.next().getPageId(), (Object) c)) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            suj.a.a(sujVar, i, null, 2, null);
        } else {
            f mInstance6 = this.f22538a;
            q.b(mInstance6, "mInstance");
            ITMSPageFactory m2 = mInstance6.m();
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put((JSONObject) a.KEY_IS_HOME_PAGE, (String) true);
            t tVar2 = t.INSTANCE;
            a2 = m2.a(c, (Window) null, a4, jSONObject3);
            if (a2 == null) {
                return null;
            }
        }
        if (iwmVar != null) {
            if (!n.cf() && (fVar = (com.taobao.themis.kernel.extension.page.f) a2.a(com.taobao.themis.kernel.extension.page.f.class)) != null) {
                a2.b(fVar);
            }
            a2.a(iwmVar);
        }
        f mInstance7 = this.f22538a;
        q.b(mInstance7, "mInstance");
        mInstance7.b().a(a2);
        return a2;
    }
}
