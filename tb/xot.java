package tb;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import com.alibaba.analytics.core.sync.q;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.OnScreenChangedListener;
import com.taobao.android.autosize.h;
import com.taobao.android.autosize.i;
import com.taobao.android.autosize.l;
import com.taobao.android.weex_framework.util.a;
import com.taobao.mytaobao.pagev2.b;
import com.taobao.tao.flexbox.layoutmanager.player.videodecide.c;
import com.taobao.tao.log.TLog;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0006\u0010\u000b\u001a\u00020\fJ\"\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0018\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0006\u0010\u0015\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/taobao/mytaobao/pagev2/ui/MtbScreenChangeProcessor;", "Lcom/taobao/android/autosize/OnScreenChangedListener;", "aty", "Landroid/app/Activity;", "themeHelper", "Lcom/taobao/mytaobao/pagev2/ui/ThemeHelperV2;", "mtbWeexManager", "Lcom/taobao/mytaobao/pagev2/MtbWeexManager;", "mtbBizProxy", "Lcom/taobao/mytaobao/pagev2/MtbBizProxyV2;", "(Landroid/app/Activity;Lcom/taobao/mytaobao/pagev2/ui/ThemeHelperV2;Lcom/taobao/mytaobao/pagev2/MtbWeexManager;Lcom/taobao/mytaobao/pagev2/MtbBizProxyV2;)V", a.ATOM_EXT_bind, "", "onActivityChanged", "activity", "changeType", "", c.ARRAY_KEY_CONFIGURATION, "Landroid/content/res/Configuration;", "onScreenChanged", q.MSGTYPE_INTERVAL, "unBind", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class xot implements OnScreenChangedListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Activity f34443a;
    private final xov b;
    private final b c;
    private final com.taobao.mytaobao.pagev2.a d;

    static {
        kge.a(-436414316);
        kge.a(825059505);
    }

    @Override // com.taobao.android.autosize.OnScreenChangedListener
    public void onActivityChanged(Activity activity, int i, Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("994f466c", new Object[]{this, activity, new Integer(i), configuration});
        } else {
            kotlin.jvm.internal.q.c(configuration, "configuration");
        }
    }

    public xot(Activity aty, xov themeHelper, b mtbWeexManager, com.taobao.mytaobao.pagev2.a mtbBizProxy) {
        kotlin.jvm.internal.q.c(aty, "aty");
        kotlin.jvm.internal.q.c(themeHelper, "themeHelper");
        kotlin.jvm.internal.q.c(mtbWeexManager, "mtbWeexManager");
        kotlin.jvm.internal.q.c(mtbBizProxy, "mtbBizProxy");
        this.f34443a = aty;
        this.b = themeHelper;
        this.c = mtbWeexManager;
        this.d = mtbBizProxy;
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!l.d((Context) this.f34443a) && !l.b((Context) this.f34443a)) {
        } else {
            h.a().c(this);
        }
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            h.a().d(this);
        }
    }

    @Override // com.taobao.android.autosize.OnScreenChangedListener
    public void onScreenChanged(int i, Configuration configuration) {
        JSONObject a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfdcd1d", new Object[]{this, new Integer(i), configuration});
            return;
        }
        kotlin.jvm.internal.q.c(configuration, "configuration");
        Rect a3 = i.a(this.f34443a);
        TLog.loge("mtbMainLink", "onScreenChanged windowRect.width()=" + a3.width() + " windowRect.height()=" + a3.height());
        xov xovVar = this.b;
        xon h = com.taobao.mytaobao.pagev2.dataservice.a.h();
        xovVar.b(false, (h == null || (a2 = h.a()) == null) ? null : a2.getJSONObject("skinConfig"));
        this.c.d();
        this.d.q();
    }
}
