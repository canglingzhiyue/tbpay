package tb;

import android.app.Activity;
import android.content.Context;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.bd;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.live.plugin.atype.flexalocal.input.InputFrame3;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0003J \u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0003J\u001c\u0010\r\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007J\u001c\u0010\r\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007J\b\u0010\u0011\u001a\u00020\u0012H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/alibaba/android/icart/core/performance/dx/CartDXPreDownloader;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "doDownloadTemplates", "", "context", "Landroid/content/Context;", "dxEngineRouter", "Lcom/taobao/android/dinamicx/DinamicXEngineRouter;", InputFrame3.TYPE_RESPONSE, "Lcom/alibaba/fastjson/JSONObject;", "downloadTemplates", "dxEngine", "cartPresenter", "Lcom/alibaba/android/icart/core/ICartPresenter;", "skipDownload", "", "icart-core-android_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes2.dex */
public final class aae {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final aae INSTANCE;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes2.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f25172a;
        public final /* synthetic */ bd b;
        public final /* synthetic */ JSONObject c;

        public a(Context context, bd bdVar, JSONObject jSONObject) {
            this.f25172a = context;
            this.b = bdVar;
            this.c = jSONObject;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            aad.b();
            aae.a(aae.INSTANCE, this.f25172a, this.b, this.c);
        }
    }

    static {
        kge.a(-2008573231);
        INSTANCE = new aae();
    }

    private aae() {
    }

    public static final /* synthetic */ void a(aae aaeVar, Context context, bd bdVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c47c92e1", new Object[]{aaeVar, context, bdVar, jSONObject});
        } else {
            aaeVar.b(context, bdVar, jSONObject);
        }
    }

    @JvmStatic
    public static final void a(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cb6e290", new Object[]{context, jSONObject});
        } else if (context == null || jSONObject == null || INSTANCE.a()) {
        } else {
            bd bdVar = new bd(new DXEngineConfig.a("iCart").a());
            jqg.b("CartDXPreDownloader", "downloadTemplates without presenter");
            a(context, bdVar, jSONObject);
        }
    }

    @JvmStatic
    public static final void a(bbz bbzVar, JSONObject jSONObject) {
        bez x;
        bny p;
        bob e;
        bd a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dd4ee52", new Object[]{bbzVar, jSONObject});
        } else if (jSONObject == null || INSTANCE.a() || bbzVar == null || (x = bbzVar.x()) == null || (p = x.p()) == null || (e = p.e()) == null || (a2 = e.a()) == null) {
        } else {
            q.b(a2, "cartPresenter?.viewManag…nager?.dxEngine ?: return");
            jqg.b("CartDXPreDownloader", "downloadTemplates with presenter");
            Activity m = bbzVar.m();
            q.b(m, "cartPresenter.context");
            a(m, a2, jSONObject);
        }
    }

    private final boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : !jqi.a("iCart", "preDownloadDX", true, true);
    }

    @JvmStatic
    private static final void a(Context context, bd bdVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7e64a96", new Object[]{context, bdVar, jSONObject});
        } else {
            jqh.a(new a(context, bdVar, jSONObject));
        }
    }

    private final void b(Context context, bd bdVar, JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONArray jSONArray;
        DXTemplateItem a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c8ad7", new Object[]{this, context, bdVar, jSONObject});
            return;
        }
        try {
            JSONObject jSONObject3 = jSONObject.getJSONObject("data");
            if (jSONObject3 == null || (jSONObject2 = jSONObject3.getJSONObject("container")) == null || (jSONArray = jSONObject2.getJSONArray("data")) == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<Object> it = jSONArray.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if ((next instanceof JSONObject) && (a2 = ipm.a((JSONObject) next)) != null) {
                    arrayList.add(a2);
                }
            }
            bdVar.a(arrayList);
        } catch (Throwable th) {
            jpu c = jpu.a("Ultron").c("CartDXPreDownloader");
            String message = th.getMessage();
            if (message == null) {
                message = "出错了";
            }
            jpr.a(c.b(message));
        }
    }
}
